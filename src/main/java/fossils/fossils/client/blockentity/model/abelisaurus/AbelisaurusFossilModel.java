package fossils.fossils.client.blockentity.model.abelisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AbelisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart tail1;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail10;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public AbelisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone5 = this.hips.getChild("bone5");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail = this.tail1.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail4 = this.tail9.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail10 = this.tail7.getChild("tail10");
		this.bone = this.tail1.getChild("bone");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.6899F, 3.5518F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.006F, -4.7F, 0.0F, 0.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9927F, -2.1753F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0322F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0778F, 3.7813F, 2.275F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 30).addBox(-0.5827F, 3.7931F, -8.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6795F, -9.3081F, 5.4213F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 102).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.7626F, -9.5045F, 2.8387F, -0.1347F, -0.0321F, -0.4016F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 69).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7065F, -9.5366F, 0.8398F, -0.0038F, -0.0321F, -0.4016F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(130, 36).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3646F, -6.2088F, 4.7002F, -2.4977F, -0.0327F, -0.4104F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(106, 5).addBox(-0.5F, -1.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2875F, -6.1543F, 3.1998F, -1.4505F, -0.0327F, -0.4104F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 106).addBox(-0.5F, -1.175F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5093F, -6.7253F, 2.4546F, 0.3385F, -0.0327F, -0.4104F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 114).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5705F, -6.5641F, 5.5065F, 0.02F, -0.0391F, -0.4053F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(109, 59).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4786F, -6.2358F, 6.6571F, -0.2854F, -0.0391F, -0.4053F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 114).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5566F, -6.3189F, 7.6506F, -1.4635F, -0.0391F, -0.4053F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(95, 133).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9318F, -7.1532F, 8.0547F, -1.9871F, -0.0391F, -0.4053F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(133, 93).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0716F, -7.5196F, 7.6471F, -3.1216F, -0.0391F, -0.4053F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6972F, -8.9695F, 7.7275F, 2.7689F, -0.0391F, -0.4053F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(116, 95).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7396F, -9.1655F, 6.7478F, 1.3726F, -0.0391F, -0.4053F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(47, 91).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4339F, -8.6697F, 4.7184F, -0.0585F, -0.0391F, -0.4053F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(134, 67).addBox(-0.9077F, -3.7528F, 2.9959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0343F, 2.1243F, 7.2626F, -1.6776F, 0.0061F, -0.0758F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(127, 41).addBox(-0.9077F, -0.6684F, 3.6643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0343F, 2.1243F, 7.2626F, -0.8049F, 0.0061F, -0.0758F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 120).addBox(-0.8925F, 2.589F, -4.8004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0343F, 2.1243F, 7.2626F, 1.7258F, 0.0041F, -0.073F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(120, 37).addBox(-0.8925F, 3.6825F, -1.1917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0343F, 2.1243F, 7.2626F, 1.0277F, 0.0041F, -0.073F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(118, 83).addBox(-0.8925F, 1.3309F, -0.5772F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0343F, 2.1243F, 7.2626F, 0.7222F, 0.0041F, -0.073F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 124).addBox(-0.6927F, -1.1842F, -0.5801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1343F, -0.1757F, 3.2626F, 0.7146F, -0.0304F, 0.0839F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(75, 127).addBox(-0.6927F, 0.6378F, -0.7715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1343F, -0.1757F, 3.2626F, 0.9764F, -0.0304F, 0.0839F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(104, 15).addBox(-0.6927F, -1.2741F, 0.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1343F, -0.1757F, 3.2626F, 2.8003F, -0.0304F, 0.0839F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(105, 134).addBox(-0.6927F, -0.2005F, -1.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1343F, -0.1757F, 3.2626F, 1.3604F, -0.0304F, 0.0839F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 127).addBox(-0.6927F, 0.646F, -1.0947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1343F, -0.1757F, 3.2626F, 1.0986F, -0.0304F, 0.0839F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(119, 123).addBox(-0.6927F, 2.6477F, -1.0023F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1343F, -0.1757F, 3.2626F, 1.0637F, -0.0304F, 0.0839F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(8, 118).addBox(-0.8925F, -0.0256F, -0.8516F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0343F, 2.1243F, 7.2626F, 0.9404F, 0.0041F, -0.073F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(80, 109).addBox(-0.5F, 0.25F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0422F, -0.0594F, 0.8585F, 1.7637F, -0.0313F, 0.1956F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 109).addBox(-0.5F, -0.55F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0422F, -0.0594F, 0.8585F, 2.2873F, -0.0313F, 0.1956F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(128, 106).addBox(-1.142F, -4.0627F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2216F, 1.2295F, 4.4583F, 0.9806F, -0.0911F, 0.1489F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, 0.0F, -2.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3025F, -3.2669F, 2.6954F, 0.3406F, -0.0767F, 0.0803F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(106, 90).addBox(-0.5F, -1.375F, -2.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3134F, -3.7673F, 2.7885F, 0.2439F, 0.0639F, 0.0248F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(70, 88).addBox(-0.5F, -0.575F, -3.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0277F, 1.2701F, -1.8047F, -1.9291F, 0.0639F, 0.0248F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(113, 39).addBox(-0.4319F, -0.5187F, -2.0705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5639F, 9.1801F, -8.788F, -2.3263F, -0.0252F, -0.1819F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(133, 106).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5091F, 8.7788F, -6.8277F, 2.517F, -0.0252F, -0.1819F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(130, 45).addBox(-0.4319F, -1.1857F, -2.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(25, 128).addBox(-0.4319F, -1.1857F, -1.8794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5639F, 9.1801F, -8.788F, -2.5881F, -0.0252F, -0.1819F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(102, 65).addBox(-0.5103F, -0.0563F, -1.9845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5639F, 9.1801F, -8.788F, -0.0587F, 0.0371F, -0.1688F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(112, 64).addBox(-0.5103F, -1.0188F, -1.2392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5639F, 9.1801F, -8.788F, 0.7267F, 0.0371F, -0.1688F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 128).addBox(-0.5103F, 0.0041F, -1.4856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5639F, 9.1801F, -8.788F, -0.1024F, 0.0371F, -0.1688F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 120).addBox(-0.5103F, -1.2349F, -0.1884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5639F, 9.1801F, -8.788F, -1.3677F, 0.0371F, -0.1688F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(36, 118).addBox(-0.8375F, 4.4092F, -0.6797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1447F, 3.0386F, -5.7368F, -0.4947F, 0.0248F, -0.1771F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(33, 103).addBox(-0.7087F, -0.1224F, -0.7591F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1156F, 3.1208F, -5.9981F, -0.4438F, 0.0416F, -0.174F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 112).addBox(-0.5F, -2.5F, -0.55F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2113F, 1.0704F, -4.753F, -0.6029F, 0.0668F, 0.0151F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(111, 72).addBox(-0.4901F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.171F, -0.8013F, -4.4248F, -0.3236F, 0.0668F, 0.0151F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(40, 134).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0427F, -4.8573F, -4.7007F, -0.7859F, 0.0639F, 0.0248F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(14, 94).addBox(-0.5F, -1.5F, -1.175F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0272F, -3.1747F, -3.8066F, -0.175F, 0.0639F, 0.0248F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(65, 18).addBox(-0.3844F, -0.3889F, -2.5767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0524F, -5.1544F, -1.5189F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(93, 39).addBox(-0.525F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2499F, -7.9105F, -4.7075F, 2.1703F, -0.2368F, -0.4044F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(93, 33).addBox(-0.5F, -0.8F, -2.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.3829F, -9.843F, -3.891F, 1.6742F, -0.3037F, -0.3808F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 109).addBox(-0.5F, 0.1F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0216F, -6.661F, -7.241F, 2.5294F, -0.3037F, -0.3808F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 111).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.174F, -7.0473F, -8.1507F, 2.8348F, -0.3037F, -0.3808F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 134).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.087F, -7.8076F, -8.7945F, -2.4012F, -0.3037F, -0.3808F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(106, 85).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2248F, -9.5426F, -8.2981F, -1.8339F, -0.3037F, -0.3808F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(22, 109).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.503F, -9.806F, -6.454F, -1.3103F, -0.3037F, -0.3808F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(111, 10).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.178F, -9.9071F, -4.574F, 0.1732F, -0.3037F, -0.3808F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(113, 83).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6809F, -9.7193F, -2.1154F, -0.0998F, -0.0321F, -0.4016F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(87, 81).addBox(-0.5F, -2.05F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9083F, -7.7865F, -0.7308F, -0.0736F, -0.0321F, -0.4016F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0778F, 5.0256F, 2.1552F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(67, 30).mirror().addBox(-0.4173F, 3.7931F, -8.2175F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6795F, -10.5524F, 5.5411F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r60 = bone5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(50, 102).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.7626F, -10.7488F, 2.9585F, -0.1347F, 0.0321F, 0.4016F));

		PartDefinition cube_r61 = bone5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(89, 69).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7065F, -10.7809F, 0.9596F, -0.0038F, 0.0321F, 0.4016F));

		PartDefinition cube_r62 = bone5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(130, 36).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3646F, -7.453F, 4.82F, -2.4977F, 0.0327F, 0.4104F));

		PartDefinition cube_r63 = bone5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(106, 5).mirror().addBox(-0.5F, -1.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2875F, -7.3985F, 3.3196F, -1.4505F, 0.0327F, 0.4104F));

		PartDefinition cube_r64 = bone5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(57, 106).mirror().addBox(-0.5F, -1.175F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5093F, -7.9696F, 2.5744F, 0.3385F, 0.0327F, 0.4104F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(78, 114).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5705F, -7.8083F, 5.6263F, 0.02F, 0.0391F, 0.4053F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(109, 59).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4786F, -7.4801F, 6.7769F, -0.2854F, 0.0391F, 0.4053F));

		PartDefinition cube_r67 = bone5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(62, 114).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5566F, -7.5632F, 7.7704F, -1.4635F, 0.0391F, 0.4053F));

		PartDefinition cube_r68 = bone5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(95, 133).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9318F, -8.3974F, 8.1745F, -1.9871F, 0.0391F, 0.4053F));

		PartDefinition cube_r69 = bone5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(133, 93).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.0716F, -8.7638F, 7.7669F, -3.1216F, 0.0391F, 0.4053F));

		PartDefinition cube_r70 = bone5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6972F, -10.2137F, 7.8473F, 2.7689F, 0.0391F, 0.4053F));

		PartDefinition cube_r71 = bone5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(116, 95).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7396F, -10.4098F, 6.8676F, 1.3726F, 0.0391F, 0.4053F));

		PartDefinition cube_r72 = bone5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(47, 91).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4339F, -9.914F, 4.8382F, -0.0585F, 0.0391F, 0.4053F));

		PartDefinition cube_r73 = bone5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(134, 67).mirror().addBox(-0.0923F, -3.7528F, 2.9959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 0.88F, 7.3824F, -1.6776F, -0.0061F, 0.0758F));

		PartDefinition cube_r74 = bone5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(127, 41).mirror().addBox(-0.0923F, -0.6684F, 3.6643F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 0.88F, 7.3824F, -0.8049F, -0.0061F, 0.0758F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(50, 120).mirror().addBox(-0.1075F, 2.589F, -4.8004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 0.88F, 7.3824F, 1.7258F, -0.0041F, 0.073F));

		PartDefinition cube_r76 = bone5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(120, 37).mirror().addBox(-0.1075F, 3.6825F, -1.1917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 0.88F, 7.3824F, 1.0277F, -0.0041F, 0.073F));

		PartDefinition cube_r77 = bone5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(118, 83).mirror().addBox(-0.1075F, 1.3309F, -0.5772F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 0.88F, 7.3824F, 0.7222F, -0.0041F, 0.073F));

		PartDefinition cube_r78 = bone5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.3073F, -1.1842F, -0.5801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1343F, -1.42F, 3.3824F, 0.7146F, 0.0304F, -0.0839F));

		PartDefinition cube_r79 = bone5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(75, 127).mirror().addBox(-0.3073F, 0.6378F, -0.7715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1343F, -1.42F, 3.3824F, 0.9764F, 0.0304F, -0.0839F));

		PartDefinition cube_r80 = bone5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(104, 15).mirror().addBox(-0.3073F, -1.2741F, 0.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1343F, -1.42F, 3.3824F, 2.8003F, 0.0304F, -0.0839F));

		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(105, 134).mirror().addBox(-0.3073F, -0.2005F, -1.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1343F, -1.42F, 3.3824F, 1.3604F, 0.0304F, -0.0839F));

		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 127).mirror().addBox(-0.3073F, 0.646F, -1.0947F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1343F, -1.42F, 3.3824F, 1.0986F, 0.0304F, -0.0839F));

		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(119, 123).mirror().addBox(-0.3073F, 2.6477F, -1.0023F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1343F, -1.42F, 3.3824F, 1.0637F, 0.0304F, -0.0839F));

		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(8, 118).mirror().addBox(-0.1075F, -0.0256F, -0.8516F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 0.88F, 7.3824F, 0.9404F, -0.0041F, 0.073F));

		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(80, 109).mirror().addBox(-0.5F, 0.25F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0422F, -1.3037F, 0.9783F, 1.7637F, 0.0313F, -0.1956F));

		PartDefinition cube_r86 = bone5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 109).mirror().addBox(-0.5F, -0.55F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0422F, -1.3037F, 0.9783F, 2.2873F, 0.0313F, -0.1956F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(128, 106).mirror().addBox(0.142F, -4.0627F, -0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2216F, -0.0148F, 4.5781F, 0.9806F, 0.0911F, -0.1489F));

		PartDefinition cube_r88 = bone5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, 0.0F, -2.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3025F, -4.5111F, 2.8152F, 0.3406F, 0.0767F, -0.0803F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(106, 90).mirror().addBox(-0.5F, -1.375F, -2.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3134F, -5.0115F, 2.9083F, 0.2439F, -0.0639F, -0.0248F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 88).mirror().addBox(-0.5F, -0.575F, -3.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0277F, 0.0259F, -1.6849F, -1.9291F, -0.0639F, -0.0248F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(113, 39).mirror().addBox(-0.5681F, -0.5187F, -2.0705F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 7.9359F, -8.6682F, -2.3263F, 0.0252F, 0.1819F));

		PartDefinition cube_r92 = bone5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(133, 106).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5091F, 7.5346F, -6.7079F, 2.517F, 0.0252F, 0.1819F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(130, 45).mirror().addBox(-0.5681F, -1.1857F, -2.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(25, 128).mirror().addBox(-0.5681F, -1.1857F, -1.8794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 7.9359F, -8.6682F, -2.5881F, 0.0252F, 0.1819F));

		PartDefinition cube_r94 = bone5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(102, 65).mirror().addBox(-0.4897F, -0.0563F, -1.9845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 7.9359F, -8.6682F, -0.0587F, -0.0371F, 0.1688F));

		PartDefinition cube_r95 = bone5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(112, 64).mirror().addBox(-0.4897F, -1.0188F, -1.2392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 7.9359F, -8.6682F, 0.7267F, -0.0371F, 0.1688F));

		PartDefinition cube_r96 = bone5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(10, 128).mirror().addBox(-0.4897F, 0.0041F, -1.4856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 7.9359F, -8.6682F, -0.1024F, -0.0371F, 0.1688F));

		PartDefinition cube_r97 = bone5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(65, 120).mirror().addBox(-0.4897F, -1.2349F, -0.1884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5639F, 7.9359F, -8.6682F, -1.3677F, -0.0371F, 0.1688F));

		PartDefinition cube_r98 = bone5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 118).mirror().addBox(-0.1625F, 4.4092F, -0.6797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1447F, 1.7944F, -5.617F, -0.4947F, -0.0248F, 0.1771F));

		PartDefinition cube_r99 = bone5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 103).mirror().addBox(-0.2913F, -0.1224F, -0.7591F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1156F, 1.8766F, -5.8783F, -0.4438F, -0.0416F, 0.174F));

		PartDefinition cube_r100 = bone5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.5F, -2.5F, -0.55F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2113F, -0.1739F, -4.6332F, -0.6029F, -0.0668F, -0.0151F));

		PartDefinition cube_r101 = bone5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(111, 72).mirror().addBox(-0.5099F, -0.6052F, -0.9866F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.171F, -2.0455F, -4.305F, -0.3236F, -0.0668F, -0.0151F));

		PartDefinition cube_r102 = bone5.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(40, 134).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0427F, -6.1015F, -4.5809F, -0.7859F, -0.0639F, -0.0248F));

		PartDefinition cube_r103 = bone5.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(14, 94).mirror().addBox(-0.5F, -1.5F, -1.175F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0272F, -4.419F, -3.6869F, -0.175F, -0.0639F, -0.0248F));

		PartDefinition cube_r104 = bone5.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 18).mirror().addBox(-0.6156F, -0.3889F, -2.5767F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0524F, -6.3986F, -1.3991F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r105 = bone5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(-0.475F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2499F, -9.1548F, -4.5877F, 2.1703F, 0.2368F, 0.4044F));

		PartDefinition cube_r106 = bone5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-0.5F, -0.8F, -2.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.3829F, -11.0872F, -3.7713F, 1.6742F, 0.3037F, 0.3808F));

		PartDefinition cube_r107 = bone5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(38, 109).mirror().addBox(-0.5F, 0.1F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0216F, -7.9053F, -7.1212F, 2.5294F, 0.3037F, 0.3808F));

		PartDefinition cube_r108 = bone5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(55, 111).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.174F, -8.2916F, -8.031F, 2.8348F, 0.3037F, 0.3808F));

		PartDefinition cube_r109 = bone5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(45, 134).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.087F, -9.0518F, -8.6747F, -2.4012F, 0.3037F, 0.3808F));

		PartDefinition cube_r110 = bone5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(106, 85).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2248F, -10.7869F, -8.1783F, -1.8339F, 0.3037F, 0.3808F));

		PartDefinition cube_r111 = bone5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(22, 109).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.503F, -11.0503F, -6.3342F, -1.3103F, 0.3037F, 0.3808F));

		PartDefinition cube_r112 = bone5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(111, 10).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.178F, -11.1513F, -4.4542F, 0.1732F, 0.3037F, 0.3808F));

		PartDefinition cube_r113 = bone5.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(113, 83).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.6809F, -10.9636F, -1.9956F, -0.0998F, 0.0321F, 0.4016F));

		PartDefinition cube_r114 = bone5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(87, 81).mirror().addBox(-0.5F, -2.05F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9083F, -9.0307F, -0.611F, -0.0736F, 0.0321F, 0.4016F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.1796F, 1.371F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightLeg1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(118, 9).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 15.3949F, -3.2849F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(118, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5F, 15.3687F, -2.2852F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(30, 99).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.5F, 14.2267F, -1.8907F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(21, 98).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(118, 103).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5F, 13.4026F, -1.0656F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r119 = rightLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(116, 99).addBox(-5.1F, -2.1557F, 0.207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 13.6054F, -0.9045F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r120 = rightLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(112, 25).addBox(-1.0F, -2.45F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 6.4071F, -0.9888F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r121 = rightLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(102, 101).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 8.8102F, -1.6779F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r122 = rightLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(61, 100).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 11.3909F, -2.9547F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(12, 101).addBox(-1.0F, -3.2F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.1655F, -1.746F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(113, 43).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 11.0532F, -3.4256F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(113, 5).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 9.0751F, -3.1299F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(52, 65).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 7.1304F, -2.663F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(112, 68).addBox(-1.0F, 2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 0.3242F, -1.8473F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(106, 44).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 0.7452F, -1.2026F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(97, 91).addBox(-1.0F, -0.5F, -1.225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, -0.128F, -0.2085F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(93, 63).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 1.2359F, 1.3432F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(93, 53).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.2113F, 1.0303F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(38, 104).addBox(-1.0F, -1.8F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.4911F, -0.7251F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(85, 103).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 7.1304F, -2.663F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(34, 94).addBox(-1.0F, -1.525F, -1.225F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 14.3618F, -2.6135F, -0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 16.1029F, -1.8205F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(69, 116).addBox(-1.0F, 0.55F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.1606F, -0.8554F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 51).addBox(-1.0F, -0.75F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, -0.4551F, -1.2224F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(102, 55).addBox(-1.0F, -0.65F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, -0.4141F, -2.4581F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(71, 112).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.3F, 2.2753F, 0.6252F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(70, 96).addBox(-1.0F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3F, 0.8F, -0.4169F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(102, 18).addBox(-1.0F, -2.625F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3F, 13.348F, -1.8443F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(38, 65).addBox(-1.0F, -12.2F, -0.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 12.0497F, -0.6659F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 107).addBox(-1.0F, -1.5F, -0.925F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 1.1565F, 1.3545F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(67, 69).addBox(-1.1F, -1.0318F, 0.0813F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2F, 1.8472F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5F, -5.6115F, -0.7135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 4.8612F, -0.2063F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightLeg2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(65, 91).addBox(-0.5F, 5.7013F, 0.7602F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, 1.1424F, -0.4934F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightLeg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(68, 101).addBox(-0.5F, -0.2712F, 0.8143F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8F, 1.1424F, -0.4934F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightLeg2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -0.1604F, 0.0505F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8F, 1.1424F, -0.4934F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(7, 82).addBox(-1.0F, 0.0553F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.9763F, -1.7706F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightLeg3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(120, 3).addBox(0.2966F, -0.5473F, 0.7221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 7.2425F, -0.4239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r149 = rightLeg3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(102, 114).addBox(0.2966F, -3.0522F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 5.7553F, 0.0761F, 0.1309F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(59, 57).addBox(-1.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 7.999F, 0.1898F, 1.8064F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(44, 32).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.258F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.1796F, 1.371F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftLeg1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(22, 118).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 15.3949F, -3.2849F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftLeg1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(118, 12).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.5F, 15.3687F, -2.2852F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftLeg1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(100, 24).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.5F, 14.2267F, -1.8907F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftLeg1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(98, 72).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 62).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.5F, 13.4026F, -1.0656F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftLeg1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(107, 116).addBox(3.1F, -2.1557F, 0.207F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-5.6F, 13.6054F, -0.9045F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftLeg1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(112, 30).addBox(-1.0F, -2.45F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 6.4071F, -0.9888F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftLeg1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(26, 103).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 8.8102F, -1.6779F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftLeg1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(5, 101).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5F, 11.3909F, -2.9547F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftLeg1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 101).addBox(-1.0F, -3.2F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 13.1655F, -1.746F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftLeg1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(113, 47).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 11.0532F, -3.4256F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftLeg1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(113, 35).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 9.0751F, -3.1299F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftLeg1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(16, 82).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 7.1304F, -2.663F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftLeg1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(112, 79).addBox(-1.0F, 2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, 0.3242F, -1.8473F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftLeg1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(116, 76).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 0.7452F, -1.2026F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftLeg1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(98, 68).addBox(-1.0F, -0.5F, -1.225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, -0.128F, -0.2085F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftLeg1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(93, 76).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 1.2359F, 1.3432F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftLeg1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(93, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.2113F, 1.0303F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftLeg1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(105, 80).addBox(-1.0F, -1.8F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.4911F, -0.7251F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftLeg1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(92, 103).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 7.1304F, -2.663F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftLeg1.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(95, 0).addBox(-1.0F, -1.525F, -1.225F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 14.3618F, -2.6135F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 16.1029F, -1.8205F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftLeg2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(92, 116).addBox(-1.0F, 0.55F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.1606F, -0.8554F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftLeg2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(36, 89).addBox(-1.0F, -0.75F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -0.4551F, -1.2224F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftLeg2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(102, 76).addBox(-1.0F, -0.65F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, -0.4141F, -2.4581F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftLeg2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(107, 112).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3F, 2.2753F, 0.6252F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftLeg2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(52, 97).addBox(-1.0F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3F, 0.8F, -0.4169F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftLeg2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(19, 102).addBox(-1.0F, -2.625F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3F, 13.348F, -1.8443F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftLeg2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(45, 65).addBox(-1.0F, -12.2F, -0.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 12.0497F, -0.6659F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftLeg2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(29, 110).addBox(-1.0F, -1.5F, -0.925F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 1.1565F, 1.3545F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftLeg2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 70).addBox(-0.9F, -1.0318F, 0.0813F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2F, 1.8472F, -0.5117F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftLeg2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(104, 10).addBox(-0.5F, -5.6115F, -0.7135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 4.8612F, -0.2063F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftLeg2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(9, 92).addBox(-0.5F, 5.7013F, 0.7602F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8F, 1.1424F, -0.4934F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftLeg2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 101).addBox(-0.5F, -0.2712F, 0.8143F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8F, 1.1424F, -0.4934F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftLeg2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(99, 10).addBox(-0.5F, -0.1604F, 0.0505F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.8F, 1.1424F, -0.4934F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(82, 27).addBox(-2.0F, 0.0553F, -0.5239F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.9763F, -1.7706F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftLeg3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(120, 33).addBox(-1.2966F, -0.5473F, 0.7221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 7.2425F, -0.4239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r184 = leftLeg3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(57, 116).addBox(-1.2966F, -3.0522F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 5.7553F, 0.0761F, 0.1309F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(59, 63).addBox(-4.5F, -0.0746F, -3.9368F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 7.999F, 0.1898F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(44, 39).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8302F, 9.0336F, -0.3158F, 0.1077F, 0.0602F));

		PartDefinition cube_r185 = tail1.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(5, 114).addBox(0.0F, -1.2F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9878F, 8.5295F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail1.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(62, 118).addBox(0.5F, 0.0871F, -0.1754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5299F, 3.2583F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail1.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(99, 112).addBox(0.5F, -0.1129F, -0.7754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.604F, 5.5805F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail1.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(100, 120).addBox(0.5F, -3.3573F, -0.1162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4588F, 6.7807F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail1.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(7, 107).addBox(0.5F, -3.7073F, -0.0162F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8208F, 3.7257F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail1.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(102, 28).addBox(0.497F, -3.8323F, -1.0162F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5471F, 1.7357F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail1.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-2.3F, -0.2F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4642F, -0.4873F, 4.2668F, 0.0464F, -0.0228F, 0.9605F));

		PartDefinition cube_r192 = tail1.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(48, 0).addBox(-0.7F, -0.2F, -3.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4642F, -0.4873F, 4.2668F, 0.0464F, 0.0228F, -0.9605F));

		PartDefinition cube_r193 = tail1.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -1.9F, 0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.6157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 128).addBox(-1.0F, -4.2335F, 5.7591F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7998F, 8.6946F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-2.0F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2344F, -0.9246F, 3.3549F, 0.082F, -0.098F, 0.8249F));

		PartDefinition cube_r195 = tail.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 62).addBox(0.0F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7656F, -0.9246F, 3.3549F, 0.082F, 0.098F, -0.8249F));

		PartDefinition cube_r196 = tail.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(21, 60).addBox(0.0F, -1.9F, 9.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(41, 118).addBox(0.0F, -0.2F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3858F, 7.2538F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 50).addBox(0.0F, 0.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7395F, 4.0982F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 103).addBox(0.0F, -0.6F, -0.6F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.903F, 1.7675F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(70, 120).addBox(0.5F, -2.4073F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6262F, 3.7754F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(18, 119).addBox(0.5F, -2.7823F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.2832F, 1.8025F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(88, 118).addBox(0.5F, -3.0073F, -0.0162F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0395F, -0.1826F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.2089F, 0.1538F, 0.1203F));

		PartDefinition cube_r203 = tail2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(114, 128).addBox(0.0F, -2.7561F, -0.1566F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8424F, 7.0228F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(86, 12).addBox(0.0F, -2.6561F, 0.0684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, 4.9307F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(111, 128).addBox(0.0F, -2.5061F, -0.1316F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1823F, 3.1376F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(128, 109).addBox(0.0F, -2.3811F, 0.0684F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(21, 50).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(47, 118).addBox(0.0F, -0.4F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6829F, 2.6141F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(73, 120).addBox(0.0F, 0.4F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3999F, 6.1401F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(44, 118).addBox(0.0F, -0.1F, -0.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4489F, 4.297F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(40, 57).mirror().addBox(-1.6F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4386F, -1.0348F, 4.5174F, 0.0313F, 0.0035F, 0.8729F));

		PartDefinition cube_r212 = tail2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(40, 57).addBox(-0.4F, 0.0F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4386F, -1.0348F, 4.5174F, 0.0313F, -0.0035F, -0.8729F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.1572F, 0.0431F, 0.0068F));

		PartDefinition cube_r213 = tail8.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(63, 46).mirror().addBox(-1.4F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3376F, 0.9727F, 0.0383F, 0.0074F, 0.9167F));

		PartDefinition cube_r214 = tail8.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(63, 46).addBox(-0.6F, 0.0F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3376F, 0.9727F, 0.0383F, -0.0074F, -0.9167F));

		PartDefinition cube_r215 = tail8.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(23, 39).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail8.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(15, 129).addBox(0.0F, 4.4F, 3.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 120).addBox(0.0F, 1.9F, 1.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 120).addBox(0.0F, 0.3F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7643F, 2.89F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail8.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(91, 120).addBox(0.0F, -0.3F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2632F, 1.244F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail8.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(110, 120).addBox(0.0F, -1.6811F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 6.8984F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail8.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(107, 72).addBox(0.0F, -1.7561F, -0.1316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 4.9984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail8.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(57, 102).addBox(0.0F, -1.8061F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 2.8984F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail8.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(21, 94).addBox(0.0F, -2.0561F, -0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5965F, 0.8984F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0307F, 0.0872F, 0.0027F));

		PartDefinition cube_r222 = tail3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(70, 85).addBox(0.0F, -1.3128F, 0.0016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 82).addBox(0.0F, -1.7128F, 2.0016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 5.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(134, 122).addBox(0.0F, -1.3628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 3.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r224 = tail3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(134, 118).addBox(0.0F, -1.2628F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, 1.8963F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(50, 134).addBox(0.0F, -1.2128F, 0.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(129, 23).addBox(0.0F, 2.2F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 129).addBox(0.0F, 1.1F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 129).addBox(0.0F, -0.1F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.332F, 2.3058F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(44, 22).mirror().addBox(-0.9F, 0.0F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4356F, -0.6815F, 4.4289F, 0.036F, -0.0097F, 0.7424F));

		PartDefinition cube_r228 = tail3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(44, 22).addBox(-0.1F, 0.0F, -4.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4356F, -0.6815F, 4.4289F, 0.036F, 0.0097F, -0.7424F));

		PartDefinition cube_r229 = tail3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail9.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(7, 70).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r231 = tail9.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(61, 97).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7103F, 5.0517F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r232 = tail9.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(97, 24).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5232F, 3.058F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail9.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(135, 34).addBox(0.0F, 7.0F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 18).addBox(0.0F, 5.7F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 126).addBox(0.0F, 4.4F, 5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0709F, -6.524F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r234 = tail9.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(43, 94).addBox(0.0F, -0.925F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.487F, 1.0827F, -0.1134F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition cube_r235 = tail4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(39, 99).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3581F, 3.0305F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r236 = tail4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(5, 98).addBox(0.0F, -0.35F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 1.2316F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r237 = tail4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(48, 8).addBox(0.0F, -0.25F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 45).addBox(0.0F, -1.45F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0108F, 3.2718F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r238 = tail4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(22, 70).addBox(-0.5F, -0.0011F, 0.0757F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2496F, 5.954F, -0.0093F, -0.0864F, 0.0122F));

		PartDefinition cube_r239 = tail5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(25, 125).addBox(0.0F, 4.05F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 106).addBox(0.0F, 1.85F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2323F, -2.6211F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r240 = tail5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(109, 25).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9963F, 3.2837F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(52, 78).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.063F, 5.9757F, -0.1302F, -0.1744F, -0.0077F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, -0.1213F, -0.1303F, -0.0126F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(71, 8).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 3.9976F, -0.2197F, -0.2559F, -0.0557F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -7.633F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(50, 108).addBox(-0.003F, -4.7555F, -7.8829F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 104).addBox(-0.003F, -4.7508F, -4.8856F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r241 = body.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(17, 108).addBox(-0.503F, -3.8522F, -0.0364F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1091F, -1.8541F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r242 = body.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(44, 46).addBox(-1.0F, 0.0F, 1.9F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(29, 12).addBox(-3.5F, -4.8F, 0.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4181F, -8.9856F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r244 = body.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(122, 92).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.1286F, 0.117F, -0.6359F));

		PartDefinition cube_r245 = body.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(120, 41).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, 0.067F, 0.1603F, -1.0744F));

		PartDefinition cube_r246 = body.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(134, 29).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.344F, -3.9704F, -0.0349F, 0.1701F, -1.6761F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(103, 122).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.1399F, 0.1163F, -0.4791F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(123, 15).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, 0.0777F, 0.1644F, -0.9172F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(120, 43).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -6.9704F, -0.0285F, 0.1795F, -1.5196F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(120, 43).addBox(2.6881F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, -0.0285F, -0.1795F, 1.5196F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(123, 15).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.0777F, -0.1644F, 0.9172F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(103, 122).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -6.9704F, 0.1399F, -0.1163F, 0.4791F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(134, 29).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, -0.0349F, -0.1701F, 1.6761F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(120, 41).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.067F, -0.1603F, 1.0744F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(122, 92).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.344F, -3.9704F, 0.1286F, -0.117F, 0.6359F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(23, 27).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3765F, -7.7702F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r256 = body2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(107, 65).addBox(0.0F, -3.1122F, -1.0627F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0895F, -1.9945F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r257 = body2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(107, 28).addBox(0.0F, -2.9117F, -0.8614F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -8.195F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r258 = body2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(12, 107).addBox(0.0F, -3.1367F, -0.9614F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0262F, -5.0951F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r259 = body2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(29, 24).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.048F, 0.2659F, -1.3916F));

		PartDefinition cube_r260 = body2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(125, 13).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.19F, 0.1932F, -0.7861F));

		PartDefinition cube_r261 = body2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(125, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.253F, 0.0958F, -0.356F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(120, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.3095F, 0.1198F, -0.3152F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(120, 88).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2322F, 0.2383F, -0.7424F));

		PartDefinition cube_r264 = body2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(63, 54).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0564F, 0.3265F, -1.3544F));

		PartDefinition cube_r265 = body2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(102, 36).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.007F, 0.168F, -1.4477F));

		PartDefinition cube_r266 = body2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(120, 90).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1003F, 0.1352F, -0.8481F));

		PartDefinition cube_r267 = body2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(103, 120).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1493F, 0.0777F, -0.3953F));

		PartDefinition cube_r268 = body2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(103, 120).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1493F, -0.0777F, 0.3953F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -3.8102F, -6.9685F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.8255F, -0.8868F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(120, 90).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1003F, -0.1352F, 0.8481F));

		PartDefinition cube_r271 = body2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(102, 36).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.007F, -0.168F, 1.4477F));

		PartDefinition cube_r272 = body2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(63, 54).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0564F, -0.3265F, 1.3544F));

		PartDefinition cube_r273 = body2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(120, 88).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2322F, -0.2383F, 0.7424F));

		PartDefinition cube_r274 = body2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(120, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.3095F, -0.1198F, 0.3152F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(125, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.253F, -0.0958F, 0.356F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(125, 13).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.19F, -0.1932F, 0.7861F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(29, 24).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.048F, -0.2659F, 1.3916F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8461F, -9.0012F, 0.1314F, -0.0865F, -0.0114F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(37, 82).addBox(-0.5F, -2.2141F, -2.0945F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(130, 31).addBox(0.0F, -2.492F, -2.135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 129).addBox(0.0F, -2.9525F, -0.1399F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0609F, -1.8368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(39, 129).addBox(0.0F, -2.2614F, -2.0236F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -0.3148F, -4.0031F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(7, 78).addBox(-4.9365F, 0.1974F, -1.2304F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(80, 25).mirror().addBox(-7.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4186F, 12.5188F, -6.2665F, 0.6476F, 1.0215F, 0.7703F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(93, 45).mirror().addBox(-5.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7123F, 12.3685F, -6.3011F, 0.4509F, 0.9828F, 0.8098F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(102, 38).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0316F, 11.8896F, -6.5414F, -0.0052F, 0.7184F, 1.2342F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-1.4539F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9365F, 11.3277F, -6.2079F, -0.5214F, -0.424F, 0.2321F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(21, 121).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.2246F, 0.0953F, -0.3235F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(76, 121).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.1641F, 0.1809F, -0.7557F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6891F, -1.4368F, 0.0336F, 0.2414F, -1.3599F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(74, 77).mirror().addBox(-10.7153F, -3.3347F, -0.536F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 0.7852F, -5.4031F, 0.0584F, 0.333F, -1.4074F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(121, 106).mirror().addBox(-4.1158F, -1.2462F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 0.7852F, -5.4031F, 0.2377F, 0.2425F, -0.7948F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(121, 108).mirror().addBox(-2.4442F, -0.2353F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 0.7852F, -5.4031F, 0.3162F, 0.1213F, -0.3682F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(29, 22).mirror().addBox(-8.7808F, -3.3242F, -0.4211F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -7.4031F, 0.0684F, 0.3905F, -1.4763F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(121, 110).mirror().addBox(-4.1642F, -1.2009F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -7.4031F, 0.28F, 0.284F, -0.8561F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(120, 7).mirror().addBox(-2.469F, -0.1738F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -7.4031F, 0.371F, 0.1423F, -0.4333F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(121, 112).mirror().addBox(-2.4875F, -0.1638F, -0.73F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -9.1031F, 0.4383F, 0.1624F, -0.4258F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(125, 4).mirror().addBox(-4.1853F, -1.1997F, -0.73F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -9.1031F, 0.3351F, 0.3295F, -0.8421F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-7.7989F, -3.3349F, -0.73F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.004F, 1.0852F, -9.1031F, 0.086F, 0.4581F, -1.4717F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(123, 76).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -3.4368F, 0.19F, 0.2048F, -0.7507F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(123, 98).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -3.4368F, 0.2579F, 0.1064F, -0.3202F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5891F, -3.4368F, 0.0412F, 0.2755F, -1.358F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(52, 18).addBox(2.7989F, -3.3349F, -0.73F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -9.1031F, 0.086F, -0.4581F, 1.4717F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(125, 4).addBox(2.1853F, -1.1997F, -0.73F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -9.1031F, 0.3351F, -0.3295F, 0.8421F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(121, 112).addBox(0.4875F, -0.1638F, -0.73F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -9.1031F, 0.4383F, -0.1624F, 0.4258F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(36, 129).addBox(0.0F, -2.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.3685F, -9.5376F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r305 = chest.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(120, 7).addBox(0.469F, -0.1738F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -7.4031F, 0.371F, -0.1423F, 0.4333F));

		PartDefinition cube_r306 = chest.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(121, 110).addBox(2.1643F, -1.2009F, -0.4211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -7.4031F, 0.28F, -0.284F, 0.8561F));

		PartDefinition cube_r307 = chest.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(29, 22).addBox(2.7808F, -3.3242F, -0.4211F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 1.0852F, -7.4031F, 0.0684F, -0.3905F, 1.4763F));

		PartDefinition cube_r308 = chest.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(121, 108).addBox(0.4442F, -0.2353F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.7852F, -5.4031F, 0.3162F, -0.1213F, 0.3682F));

		PartDefinition cube_r309 = chest.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(121, 106).addBox(2.1158F, -1.2462F, -0.536F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.7852F, -5.4031F, 0.2377F, -0.2425F, 0.7948F));

		PartDefinition cube_r310 = chest.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(74, 77).addBox(2.7153F, -3.3347F, -0.536F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, 0.7852F, -5.4031F, 0.0584F, -0.333F, 1.4074F));

		PartDefinition cube_r311 = chest.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(74, 79).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -3.4368F, 0.0412F, -0.2755F, 1.358F));

		PartDefinition cube_r312 = chest.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(123, 98).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -3.4368F, 0.2579F, -0.1064F, 0.3202F));

		PartDefinition cube_r313 = chest.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(123, 76).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5891F, -3.4368F, 0.19F, -0.2048F, 0.7507F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(71, 16).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.0336F, -0.2414F, 1.3599F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(76, 121).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.1641F, -0.1809F, 0.7557F));

		PartDefinition cube_r316 = chest.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 55).addBox(-3.4F, -2.0F, -4.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 14.2161F, -0.7055F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r317 = chest.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(21, 121).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6891F, -1.4368F, 0.2246F, -0.0953F, 0.3235F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(33, 129).addBox(0.0F, -1.9386F, -4.0292F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.004F, -0.3148F, -4.0031F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(67, 39).addBox(-0.5461F, 0.3925F, -5.4555F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.5214F, 0.424F, -0.2321F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(102, 38).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0316F, 11.8896F, -6.5414F, -0.0052F, -0.7184F, -1.2342F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(93, 45).addBox(0.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7123F, 12.3685F, -6.3011F, 0.4509F, -0.9828F, -0.8098F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(80, 25).addBox(0.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4186F, 12.5188F, -6.2665F, 0.6476F, -1.0215F, -0.7703F));

		PartDefinition cube_r323 = chest.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(80, 63).addBox(-2.9365F, 0.3925F, -5.0268F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9365F, 11.3277F, -6.2079F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r324 = chest.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(52, 69).addBox(-0.5F, -0.0257F, -5.9615F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.004F, -0.3148F, -4.0031F, 0.096F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.468F, 6.5991F, -5.7228F, -0.428F, 0.0981F, -0.1959F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(86, 6).addBox(-0.5F, -0.85F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5002F, -2.1639F, -0.5243F, 1.2262F, -0.0148F, -0.0092F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(91, 27).addBox(-0.5F, -1.05F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4014F, 2.0826F, -4.0784F, 0.5717F, -0.0148F, 0.5143F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(74, 81).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0603F, 5.0213F, -4.1787F, -1.9154F, -0.0148F, 0.5143F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(83, 118).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.7728F, 4.5374F, -5.0053F, -0.5977F, -0.0148F, 0.5143F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(97, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3917F, 3.8827F, -5.658F, 0.7113F, -0.0148F, 0.5143F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(73, 107).addBox(-0.5F, -1.275F, 0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2163F, 3.5355F, -4.4374F, 1.9767F, -0.0148F, 0.5143F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(130, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.3318F, 5.4455F, -2.3119F, 2.9453F, -0.0148F, 0.5143F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(130, 9).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0583F, 4.9371F, -1.4954F, 2.1861F, -0.0148F, 0.5143F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(119, 68).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5423F, 4.0521F, -2.4338F, 1.2698F, -0.0148F, 0.5143F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(119, 119).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.8375F, 2.8207F, -2.96F, 0.2226F, -0.0148F, 0.5143F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(119, 79).addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7965F, 2.7444F, -2.8375F, 0.6153F, -0.0148F, 0.5143F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(48, 128).addBox(-1.0027F, 0.6219F, -0.795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 0.2662F, -0.0148F, 0.5143F));

		PartDefinition cube_r337 = bone2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(56, 91).addBox(-1.0027F, -0.7781F, -3.195F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.949F, 0.6577F, -2.1781F, 0.7462F, -0.0148F, 0.5143F));

		PartDefinition cube_r338 = bone2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(59, 85).addBox(-0.5F, -1.125F, -3.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5002F, -2.1639F, -0.5243F, 1.0953F, -0.0148F, -0.0092F));

		PartDefinition cube_r339 = bone2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(96, 81).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5009F, -2.3322F, -0.6715F, 1.3134F, -0.0148F, -0.0092F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(79, 96).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.432F, -8.094F, 0.3804F, 1.3658F, -0.0148F, -0.0092F));

		PartDefinition cube_r341 = bone2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(113, 89).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4344F, -8.0382F, 0.2505F, 1.5403F, -0.0148F, -0.0092F));

		PartDefinition cube_r342 = bone2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(80, 18).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4657F, -3.708F, 0.8461F, 1.2785F, -0.0148F, -0.0092F));

		PartDefinition cube_r343 = bone2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(48, 85).addBox(-0.9453F, -1.2135F, 1.0157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9555F, -0.9822F, -0.4595F, 1.3222F, -0.0148F, -0.0092F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.468F, 6.5991F, -5.7228F, -0.428F, -0.0981F, 0.1959F));

		PartDefinition cube_r344 = bone4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.5F, -0.85F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, -2.1639F, -0.5243F, 1.2262F, 0.0148F, 0.0092F));

		PartDefinition cube_r345 = bone4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(91, 27).mirror().addBox(-0.5F, -1.05F, -1.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4014F, 2.0826F, -4.0784F, 0.5717F, 0.0148F, -0.5143F));

		PartDefinition cube_r346 = bone4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(74, 81).mirror().addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0603F, 5.0213F, -4.1787F, -1.9154F, 0.0148F, -0.5143F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(83, 118).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.7728F, 4.5374F, -5.0053F, -0.5977F, 0.0148F, -0.5143F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.3917F, 3.8827F, -5.658F, 0.7113F, 0.0148F, -0.5143F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(73, 107).mirror().addBox(-0.5F, -1.275F, 0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2163F, 3.5355F, -4.4374F, 1.9767F, 0.0148F, -0.5143F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(130, 20).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(2.3318F, 5.4455F, -2.3119F, 2.9453F, 0.0148F, -0.5143F));

		PartDefinition cube_r351 = bone4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(130, 9).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.0583F, 4.9371F, -1.4954F, 2.1861F, 0.0148F, -0.5143F));

		PartDefinition cube_r352 = bone4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(119, 68).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.5423F, 4.0521F, -2.4338F, 1.2698F, 0.0148F, -0.5143F));

		PartDefinition cube_r353 = bone4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(119, 119).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.8375F, 2.8207F, -2.96F, 0.2226F, 0.0148F, -0.5143F));

		PartDefinition cube_r354 = bone4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(119, 79).mirror().addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7965F, 2.7444F, -2.8375F, 0.6153F, 0.0148F, -0.5143F));

		PartDefinition cube_r355 = bone4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(48, 128).mirror().addBox(0.0027F, 0.6219F, -0.795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 0.2662F, 0.0148F, -0.5143F));

		PartDefinition cube_r356 = bone4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(0.0027F, -0.7781F, -3.195F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.949F, 0.6577F, -2.1781F, 0.7462F, 0.0148F, -0.5143F));

		PartDefinition cube_r357 = bone4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-0.5F, -1.125F, -3.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, -2.1639F, -0.5243F, 1.0953F, 0.0148F, 0.0092F));

		PartDefinition cube_r358 = bone4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(96, 81).mirror().addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5009F, -2.3322F, -0.6715F, 1.3134F, 0.0148F, 0.0092F));

		PartDefinition cube_r359 = bone4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(79, 96).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.432F, -8.094F, 0.3804F, 1.3658F, 0.0148F, 0.0092F));

		PartDefinition cube_r360 = bone4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(113, 89).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4344F, -8.0382F, 0.2505F, 1.5403F, 0.0148F, 0.0092F));

		PartDefinition cube_r361 = bone4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.5F, -1.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4657F, -3.708F, 0.8461F, 1.2785F, 0.0148F, 0.0092F));

		PartDefinition cube_r362 = bone4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(48, 85).mirror().addBox(-0.0547F, -1.2135F, 1.0157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9555F, -0.9822F, -0.4595F, 1.3222F, 0.0148F, 0.0092F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3355F, 8.7427F, -7.8494F, 1.5121F, 0.3675F, 0.1049F));

		PartDefinition cube_r363 = leftArm1.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(63, 134).addBox(0.0F, -0.625F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3037F, 0.0186F, 0.0504F, -0.8463F, -0.2207F, -0.0253F));

		PartDefinition cube_r364 = leftArm1.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(126, 114).addBox(-0.325F, -1.9F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5706F, 1.1418F, -1.0192F, -0.14F, -0.5589F, 0.0126F));

		PartDefinition cube_r365 = leftArm1.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(130, 48).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.54F, 4.2601F, -1.5947F, 0.0596F, -0.0786F, -0.067F));

		PartDefinition cube_r366 = leftArm1.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(102, 107).addBox(6.0F, -1.0842F, 0.4838F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2F, 1.1847F, -1.6107F, -0.4204F, -0.0786F, -0.067F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(121, 114).addBox(-0.8F, -0.4307F, -1.5734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 122).addBox(-0.8F, -0.4307F, -0.6734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2377F, 5.8111F, -1.5286F, -0.74F, -0.0785F, -0.1308F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1086F, 1.6668F, 0.207F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition cube_r367 = leftHand.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(107, 107).addBox(0.0F, -2.6F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3355F, 8.7427F, -7.8494F, 1.3396F, -0.1932F, -0.1114F));

		PartDefinition cube_r368 = rightArm1.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(134, 64).addBox(-1.0F, -0.625F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3037F, 0.0186F, 0.0504F, -0.8463F, 0.2207F, 0.0253F));

		PartDefinition cube_r369 = rightArm1.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(124, 126).addBox(-0.675F, -1.9F, 0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5706F, 1.1418F, -1.0192F, -0.14F, 0.5589F, -0.0126F));

		PartDefinition cube_r370 = rightArm1.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(133, 31).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.54F, 4.2601F, -1.5947F, 0.0596F, 0.0786F, 0.067F));

		PartDefinition cube_r371 = rightArm1.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(45, 111).addBox(-7.0F, -1.0842F, 0.4838F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2F, 1.1847F, -1.6107F, -0.4204F, 0.0786F, 0.067F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(70, 126).addBox(-0.2F, -0.4307F, -1.5734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 126).addBox(-0.2F, -0.4307F, -0.6734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2377F, 5.8111F, -1.5286F, -0.5654F, 0.0785F, 0.1308F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1086F, 1.6668F, 0.207F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition cube_r372 = rightHand.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(111, 0).addBox(-1.0F, -2.6F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0664F, -9.7234F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r373 = neck1.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(45, 129).addBox(0.0F, -2.3459F, -0.0161F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -1.8666F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r374 = neck1.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(123, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.747F, 0.3269F, -0.5554F));

		PartDefinition cube_r375 = neck1.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(120, 45).mirror().addBox(-4.6882F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.0806F, 0.7994F, -1.6802F));

		PartDefinition cube_r376 = neck1.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(123, 19).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -1.2696F, 0.5721F, 0.598F, -0.94F));

		PartDefinition cube_r377 = neck1.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(123, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.747F, -0.3269F, 0.5554F));

		PartDefinition cube_r378 = neck1.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(123, 19).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.5721F, -0.598F, 0.94F));

		PartDefinition cube_r379 = neck1.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(120, 45).addBox(2.6881F, -2.8327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -1.2696F, 0.0806F, -0.7994F, 1.6802F));

		PartDefinition cube_r380 = neck1.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.2552F, -0.1267F, -0.033F));

		PartDefinition cube_r381 = neck2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(130, 15).addBox(0.0F, -2.1816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -0.7163F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(21, 123).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, 0.1948F, 0.546F, -1.0268F));

		PartDefinition cube_r383 = neck2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(109, 105).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -0.5629F, -0.0828F, 0.571F, -1.5421F));

		PartDefinition cube_r384 = neck2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(109, 105).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, -0.0828F, -0.571F, 1.5421F));

		PartDefinition cube_r385 = neck2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(21, 123).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -0.5629F, 0.1948F, -0.546F, 1.0268F));

		PartDefinition cube_r386 = neck2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(93, 47).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r387 = neck5.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(90, 12).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r388 = neck5.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(39, 102).mirror().addBox(-5.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, -0.25F, 1.0165F, -1.6558F));

		PartDefinition cube_r389 = neck5.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(123, 21).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -0.9742F, 0.442F, 0.9714F, -0.8436F));

		PartDefinition cube_r390 = neck5.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(34, 123).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, 0.463F, 0.9843F, -0.8263F));

		PartDefinition cube_r391 = neck5.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-6.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9742F, -0.2529F, 1.0339F, -1.6583F));

		PartDefinition cube_r392 = neck5.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(52, 20).addBox(1.7911F, -0.3926F, -0.2462F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, -0.2529F, -1.0339F, 1.6583F));

		PartDefinition cube_r393 = neck5.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(34, 123).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9742F, 0.463F, -0.9843F, 0.8263F));

		PartDefinition cube_r394 = neck5.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(123, 21).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, 0.442F, -0.9714F, 0.8436F));

		PartDefinition cube_r395 = neck5.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(39, 102).addBox(1.7911F, -0.3926F, -0.2462F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -0.9742F, -0.25F, -1.0165F, 1.6558F));

		PartDefinition cube_r396 = neck5.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(135, 57).addBox(0.0F, -2.0566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r397 = neck5.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(135, 49).addBox(0.0F, -1.6566F, -0.1491F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.0817F, -0.178F, 0.0065F));

		PartDefinition cube_r398 = neck4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(123, 51).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.6221F, 0.9947F, -0.6856F));

		PartDefinition cube_r399 = neck4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-5.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1495F, 1.1066F, -1.5599F));

		PartDefinition cube_r400 = neck4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(123, 53).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5513F, 0.9603F, -0.7443F));

		PartDefinition cube_r401 = neck4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(102, 42).mirror().addBox(-5.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1507F, 1.0542F, -1.561F));

		PartDefinition cube_r402 = neck4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(102, 42).addBox(1.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1507F, -1.0542F, 1.561F));

		PartDefinition cube_r403 = neck4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(123, 53).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5513F, -0.9603F, 0.7443F));

		PartDefinition cube_r404 = neck4.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(102, 40).addBox(1.7663F, -0.3906F, -0.2552F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1495F, -1.1066F, 1.5599F));

		PartDefinition cube_r405 = neck4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(123, 51).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.6221F, -0.9947F, 0.6856F));

		PartDefinition cube_r406 = neck4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(135, 70).addBox(0.0F, -1.3677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r407 = neck4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(58, 135).addBox(0.0F, -1.2677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r408 = neck4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(82, 37).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r409 = neck3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(123, 58).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.3601F, 0.6008F, -1.0469F));

		PartDefinition cube_r410 = neck3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(-5.8842F, -0.3479F, -0.6322F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.0317F, 0.6883F, -1.5845F));

		PartDefinition cube_r411 = neck3.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(123, 60).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3879F, 0.6284F, -0.9783F));

		PartDefinition cube_r412 = neck3.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(102, 49).mirror().addBox(-5.8627F, -0.3478F, -0.617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.0386F, 0.7236F, -1.5276F));

		PartDefinition cube_r413 = neck3.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(102, 49).addBox(1.8627F, -0.3478F, -0.617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.0386F, -0.7236F, 1.5276F));

		PartDefinition cube_r414 = neck3.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(123, 60).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3879F, -0.6284F, 0.9783F));

		PartDefinition cube_r415 = neck3.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(102, 47).addBox(1.8842F, -0.3479F, -0.6322F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.0317F, -0.6883F, 1.5845F));

		PartDefinition cube_r416 = neck3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(123, 58).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.3601F, -0.6008F, 1.0469F));

		PartDefinition cube_r417 = neck3.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(135, 96).addBox(0.5F, -1.2458F, -0.0223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6988F, -3.1055F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r418 = neck3.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(135, 74).addBox(0.5F, -1.269F, 0.0228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.887F, -1.3144F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r419 = neck3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(82, 44).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.5609F, -0.0971F, 0.0094F));

		PartDefinition cube_r420 = neck.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(123, 72).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.8617F, 0.9945F, -0.726F));

		PartDefinition cube_r421 = neck.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(111, 56).mirror().addBox(-4.6944F, -0.3859F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.0575F, 1.2075F, -1.6117F));

		PartDefinition cube_r422 = neck.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(113, 93).mirror().addBox(-4.6944F, -0.3859F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6212F, -3.621F, 0.0344F, 1.3382F, -1.6338F));

		PartDefinition cube_r423 = neck.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(123, 100).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6212F, -3.621F, 1.0675F, 1.0728F, -0.5489F));

		PartDefinition cube_r424 = neck.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(123, 100).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6212F, -3.621F, 1.0675F, -1.0728F, 0.5489F));

		PartDefinition cube_r425 = neck.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(113, 93).addBox(1.6944F, -0.3859F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6212F, -3.621F, 0.0344F, -1.3382F, 1.6338F));

		PartDefinition cube_r426 = neck.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(111, 56).addBox(1.6944F, -0.3859F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.0575F, -1.2075F, 1.6117F));

		PartDefinition cube_r427 = neck.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(135, 133).addBox(0.5F, -1.0207F, -2.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 100).addBox(0.5F, -1.4207F, -0.1014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r428 = neck.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(24, 78).addBox(0.0F, 1.3815F, -5.2683F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r429 = neck.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(123, 72).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.8617F, -0.9945F, 0.726F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.423F, -4.5305F, 0.2102F, -0.0854F, -0.0182F));

		PartDefinition cube_r430 = neck6.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(123, 74).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.7519F, 0.9336F, -0.8163F));

		PartDefinition cube_r431 = neck6.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(134, 91).mirror().addBox(-2.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.0657F, 1.1202F, -1.6041F));

		PartDefinition cube_r432 = neck6.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(134, 91).addBox(1.6944F, -0.3859F, -0.6156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.0657F, -1.1202F, 1.6041F));

		PartDefinition cube_r433 = neck6.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(88, 96).addBox(0.5F, -1.8207F, -1.8013F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8375F, -1.0498F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r434 = neck6.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(25, 92).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r435 = neck6.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(123, 74).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.7519F, -0.9336F, 0.8163F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6807F, -3.1452F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, -1.4785F, -2.7694F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -0.9307F, -4.5483F, 0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, 0.7413F, -2.0938F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(25, 86).addBox(-0.5F, -0.2587F, -2.0938F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -0.9307F, -4.5483F, 1.3134F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -1.5685F, -7.2355F, 0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(130, 58).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -0.3457F, -9.9597F, -2.6049F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(5, 124).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, -0.857F, -9.1003F, -1.2086F, 0.0F, 0.0F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(53, 130).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 0.4119F, -10.6124F, 2.4304F, 0.0F, 0.0F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(130, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 1.1972F, -11.2315F, 0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(129, 127).addBox(-0.5F, -0.875F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 2.4243F, -10.7217F, -0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(129, 124).addBox(-0.4975F, 0.7508F, -1.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0025F, 1.7078F, -10.4004F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(129, 121).addBox(-0.4975F, -1.0128F, -0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 2.5328F, -12.0004F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(36, 114).addBox(-0.5F, -0.7928F, -2.1384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.9649F, -1.3891F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r447 = head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(22, 114).addBox(-0.5F, -0.7792F, -1.3971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -1.9649F, -1.3891F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r448 = head.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(129, 118).addBox(-0.5F, -0.7F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.7396F, -0.7905F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r449 = head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 119).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5033F, -10.9942F, 1.57F, 0.0F, 0.0F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(80, 56).addBox(-0.5F, -0.225F, 0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.77F, -8.5449F, 0.1214F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(87, 109).addBox(-1.0F, -3.0F, -1.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.2297F, -2.2758F, -1.3709F, 0.0F, 0.0F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(76, 118).addBox(-1.0F, -0.725F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.6242F, -2.9496F, -0.0444F, 0.0F, 0.0F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(93, 18).addBox(-2.0F, 0.4371F, -2.3968F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5775F, 1.2132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(102, 51).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -2.6204F, -1.6168F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(119, 65).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6204F, -1.6168F, 1.6144F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8939F, 2.3717F, -8.9295F, 0.0076F, -0.0433F, -0.0873F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(109, 20).addBox(-0.4392F, -0.9551F, -0.6009F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5385F, -3.5875F, 7.8866F, 2.0015F, 1.1021F, -0.3875F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(29, 119).addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3789F, -4.3824F, 3.1962F, -1.2951F, -0.2046F, 1.2659F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(120, 47).addBox(-0.7808F, 0.1803F, -0.5776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9565F, -3.8075F, 4.4893F, -1.2294F, 0.0157F, 0.599F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(125, 0).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2284F, -3.6096F, 0.9267F, -1.1865F, -0.2632F, 1.245F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(119, 28).addBox(-0.525F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0462F, -2.9384F, 1.1314F, -1.1098F, 0.0334F, 0.6062F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(114, 115).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9333F, -4.8783F, 7.2907F, 0.4181F, 0.1941F, 1.2428F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(85, 114).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.0992F, -4.2691F, 7.1846F, 0.1716F, 0.2951F, 0.4742F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(10, 131).addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 131).addBox(-0.2F, -1.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0744F, -5.3534F, 6.0265F, -2.0666F, 0.2865F, 1.1495F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(5, 131).addBox(-0.3F, -1.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0744F, -5.3534F, 6.0265F, -2.8957F, 0.2865F, 1.1495F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(127, 130).addBox(0.0F, -1.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0744F, -5.3534F, 6.0265F, -1.4907F, 0.2865F, 1.1495F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(117, 130).addBox(-0.5359F, -0.6536F, -0.8171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9962F, -4.3311F, 5.8729F, -2.1486F, -0.0048F, 0.6271F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(125, 9).addBox(-0.2F, -2.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9825F, -5.2185F, 5.04F, -2.8111F, 1.1185F, 1.4214F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(74, 69).addBox(-0.5F, -0.225F, 0.35F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.7077F, 0.3852F, 0.4546F, 0.1228F, 0.1739F, 0.0107F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(124, 122).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0284F, -5.2859F, 5.5332F, -2.9988F, -0.0809F, 1.1104F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(130, 103).addBox(-0.5359F, -0.1636F, -0.2967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.9962F, -4.3311F, 5.8729F, -2.9777F, -0.0048F, 0.6271F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(124, 27).addBox(0.0065F, -1.9991F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9565F, -5.2075F, 5.0893F, 2.2374F, 0.0012F, 0.6545F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(116, 72).addBox(-0.8932F, 0.1215F, 0.2973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.0711F, 0.1745F, -0.0308F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(88, 89).addBox(-0.525F, -1.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4189F, -2.5127F, 2.9939F, 1.7691F, 0.2464F, -0.0585F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(13, 119).addBox(-1.025F, -1.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1879F, -0.5228F, -0.3731F, 0.0984F, 0.2566F, -0.0688F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(79, 89).addBox(-0.4F, -1.7F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3215F, -0.8334F, 0.239F, 0.0972F, 0.257F, -0.0733F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(108, 124).addBox(-0.5F, -1.6F, -2.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 124).addBox(-0.5F, -1.3F, -2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 124).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 78).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1842F, 1.1478F, -0.0366F, 0.1638F, 0.2269F, 0.0341F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(124, 68).addBox(-0.5F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0015F, 1.2513F, 0.7822F, 0.2161F, 0.2269F, 0.0341F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(65, 124).addBox(-0.5F, -1.15F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 124).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3662F, 1.1228F, 2.342F, 0.1812F, 0.2269F, 0.0341F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(28, 124).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5496F, 1.0132F, 3.1194F, 0.2685F, 0.2269F, 0.0341F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(81, 123).addBox(-1.0493F, -1.6569F, -1.2036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, 0.3994F, 0.2269F, 0.0341F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(76, 123).addBox(-1.0493F, -1.7277F, -0.2792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, 0.5739F, 0.2269F, 0.0341F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(75, 134).addBox(-0.9303F, -0.9418F, -0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2438F, -2.4975F, -1.1194F, -0.9957F, 0.2593F, -0.0763F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(94, 109).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3141F, -3.4975F, 0.5821F, 1.7706F, 0.2593F, -0.0763F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(85, 134).addBox(-0.9303F, -0.2812F, 0.9068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2438F, -2.4975F, -1.1194F, 0.4006F, 0.2593F, -0.0763F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(80, 134).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7426F, -2.0474F, -1.4772F, -2.2161F, 0.2419F, -0.076F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(134, 78).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8286F, -1.2663F, -2.0956F, -2.2607F, 0.2384F, -0.0828F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(130, 100).addBox(-0.5F, -0.9196F, -0.5457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7171F, -1.0123F, -1.7247F, 2.6699F, 0.2384F, -0.0828F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(130, 97).addBox(-1.0317F, -3.6488F, 6.2032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, 2.539F, 0.2384F, -0.013F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(95, 130).addBox(-1.0317F, -7.9945F, 0.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, 1.5791F, 0.2384F, -0.013F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(90, 130).addBox(-1.0317F, -2.1402F, -6.9551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, 0.1392F, 0.2384F, -0.013F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(124, 23).addBox(-0.8896F, -1.7558F, -1.973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1146F, 1.2649F, -0.5115F, -0.3009F, 0.2711F, -0.0382F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(130, 75).addBox(-0.8896F, 0.0006F, -0.9284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1146F, 1.2649F, -0.5115F, -1.6972F, 0.2711F, -0.0382F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(130, 72).addBox(-0.9883F, -0.0041F, 4.3632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, -3.1357F, 0.2362F, -0.0379F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(70, 130).addBox(-0.9883F, -4.3528F, 0.3003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, 1.6465F, 0.2362F, -0.0379F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(10, 124).addBox(-0.9883F, -3.0189F, -3.2083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, 0.2938F, 0.2362F, -0.0379F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(95, 96).addBox(-0.9883F, -0.9507F, -2.4452F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4639F, 1.2493F, 4.6703F, -1.4689F, 0.2362F, -0.0379F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(35, 134).addBox(-0.8339F, -3.1128F, -1.6215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.6992F, 0.1705F, -0.0159F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(16, 86).addBox(-0.5F, -2.2F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1697F, -2.0741F, 6.467F, 0.1619F, 0.1745F, -0.0308F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(109, 15).addBox(-0.796F, -3.7645F, -2.0738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.031F, 0.1745F, -0.0308F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(96, 126).addBox(-0.796F, -3.4699F, -1.3198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -0.3181F, 0.1745F, -0.0308F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(102, 95).addBox(-0.8186F, -2.4834F, -1.1481F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, 0.0834F, 0.1745F, -0.0308F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(114, 119).addBox(-0.5F, -1.9F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6618F, -1.2336F, 9.2407F, 0.5197F, 0.1745F, -0.0308F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(102, 59).addBox(-0.5F, -1.475F, -0.825F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4724F, -1.0173F, 8.1292F, 0.1532F, 0.1745F, -0.0308F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(131, 61).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(48, 131).addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2555F, -2.99F, 6.9313F, -0.3399F, 0.1745F, -0.0308F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(106, 128).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2574F, -2.0033F, 6.7692F, -1.7362F, 0.1745F, -0.0308F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(24, 131).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3048F, -1.0089F, 6.8641F, -3.0452F, 0.1745F, -0.0308F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(130, 133).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4457F, -0.2818F, 7.536F, 2.3217F, 0.1745F, -0.0308F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(116, 15).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6202F, -0.2527F, 8.5203F, 1.5363F, 0.1745F, -0.0308F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(118, 51).addBox(-0.5F, -2.525F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6324F, -0.8652F, 8.6964F, 0.4455F, 0.1745F, -0.0308F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(5, 128).addBox(-0.4548F, -0.5673F, -0.4943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 128).addBox(-0.4548F, -0.5673F, -0.0943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.419F, -1.0522F, -1.5974F, 0.8749F, 0.2437F, -0.0917F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(127, 87).addBox(-0.4548F, -0.3349F, -0.2711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.419F, -1.0522F, -1.5974F, 1.3548F, 0.2437F, -0.0917F));

		PartDefinition cube_r512 = leftFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(127, 55).addBox(-0.5509F, -0.6954F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.419F, -1.0522F, -1.5974F, 2.7075F, 0.2437F, -0.0917F));

		PartDefinition cube_r513 = leftFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(118, 127).addBox(-0.5509F, -0.5051F, -0.2785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.419F, -1.0522F, -1.5974F, -2.4413F, 0.2437F, -0.0917F));

		PartDefinition cube_r514 = leftFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(127, 6).addBox(-0.5509F, -0.8054F, -0.2009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.419F, -1.0522F, -1.5974F, -2.9649F, 0.2437F, -0.0917F));

		PartDefinition cube_r515 = leftFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(128, 82).addBox(-0.4864F, -1.3433F, 1.4863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(65, 128).addBox(-0.4864F, -1.3433F, 0.9863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, 0.2223F, 0.2528F, -0.0613F));

		PartDefinition cube_r516 = leftFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(128, 94).addBox(-0.4864F, 0.4179F, -2.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -0.2315F, 0.2528F, -0.0613F));

		PartDefinition cube_r517 = leftFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(29, 115).addBox(-0.4864F, -0.0052F, -2.4565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -2.9804F, 0.2528F, -0.0613F));

		PartDefinition cube_r518 = leftFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(124, 118).addBox(-0.4864F, -2.3516F, -0.8014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -1.6714F, 0.2528F, -0.0613F));

		PartDefinition cube_r519 = leftFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(15, 115).addBox(-0.4864F, -0.3939F, 0.3346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -0.2751F, 0.2528F, -0.0613F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(119, 23).addBox(-0.4864F, -0.6609F, -0.4143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, 0.8593F, 0.2528F, -0.0613F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(43, 97).addBox(-0.4864F, -0.0527F, -2.1962F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, 1.9065F, 0.2528F, -0.0613F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(109, 95).addBox(-0.4864F, -1.9798F, -1.0288F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, 3.041F, 0.2528F, -0.0613F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(101, 128).addBox(-0.4864F, 0.3437F, 1.1238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -1.8896F, 0.2528F, -0.0613F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(113, 124).addBox(-0.4864F, 0.4323F, -0.4496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -1.0605F, 0.2528F, -0.0613F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(122, 130).addBox(-0.4864F, -1.2653F, -1.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, 0.6411F, 0.2528F, -0.0613F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(114, 111).addBox(-0.4864F, -1.1433F, -0.9007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, 2.0374F, 0.2528F, -0.0613F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(85, 128).addBox(-0.4864F, 0.0993F, -0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -2.675F, 0.2528F, -0.0613F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(114, 107).addBox(-0.4864F, -1.3857F, -1.1357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3669F, -2.0626F, 2.3453F, -1.174F, 0.2528F, -0.0613F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(129, 90).addBox(-0.273F, -0.2698F, 0.936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(129, 78).addBox(-0.448F, -0.2698F, 0.936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 1.7511F, 0.1788F, -0.0472F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(133, 81).addBox(-0.5232F, 0.0041F, -2.057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, -1.6784F, 0.1788F, -0.0472F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(129, 69).addBox(-0.5232F, -0.4698F, 0.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 1.8559F, 0.1788F, -0.0472F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(115, 133).addBox(-0.5232F, -0.5592F, -2.233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, -1.373F, 0.1788F, -0.0472F));

		PartDefinition cube_r533 = leftFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(110, 133).addBox(-0.5232F, -2.2819F, -0.1133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, -0.0204F, 0.1788F, -0.0472F));

		PartDefinition cube_r534 = leftFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(70, 133).addBox(-0.5232F, -1.3209F, 0.6334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 0.765F, 0.1788F, -0.0472F));

		PartDefinition cube_r535 = leftFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(120, 133).addBox(-0.5703F, -0.833F, -2.2893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 1.5181F, 0.157F, -0.0905F));

		PartDefinition cube_r536 = leftFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(53, 133).addBox(-0.5703F, -1.5955F, -0.4194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 2.9144F, 0.157F, -0.0905F));

		PartDefinition cube_r537 = leftFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(129, 66).addBox(-0.5703F, -1.1771F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 3.1326F, 0.157F, -0.0905F));

		PartDefinition cube_r538 = leftFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(60, 129).addBox(-0.5703F, -1.9905F, -1.1727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 2.609F, 0.157F, -0.0905F));

		PartDefinition cube_r539 = leftFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(129, 28).addBox(-0.5703F, -0.1443F, -1.4325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, 1.3F, 0.157F, -0.0905F));

		PartDefinition cube_r540 = leftFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(125, 133).addBox(-0.5232F, -1.3791F, -0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, -2.9962F, 0.1788F, -0.0472F));

		PartDefinition cube_r541 = leftFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(8, 114).addBox(-0.5232F, -0.2796F, -1.202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2388F, -2.3371F, 5.7829F, -1.7308F, 0.1788F, -0.0472F));

		PartDefinition cube_r542 = leftFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(97, 86).addBox(-0.8627F, 1.1138F, -1.8806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8428F, -0.7821F, 8.353F, -1.3136F, 0.1596F, -0.0364F));

		PartDefinition cube_r543 = leftFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(111, 51).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2586F, -0.1426F, 6.7538F, -0.0909F, 0.1738F, -0.0293F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8939F, 2.3717F, -8.9295F, 0.0076F, 0.0433F, 0.0873F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(109, 20).mirror().addBox(-0.5608F, -0.9551F, -0.6009F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5385F, -3.5875F, 7.8866F, 2.0015F, -1.1021F, 0.3875F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(29, 119).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3789F, -4.3824F, 3.1962F, -1.2951F, 0.2046F, -1.2659F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(120, 47).mirror().addBox(-0.2192F, 0.1803F, -0.5776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9565F, -3.8075F, 4.4893F, -1.2294F, -0.0157F, -0.599F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(125, 0).mirror().addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.2284F, -3.6096F, 0.9267F, -1.1865F, 0.2632F, -1.245F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(119, 28).mirror().addBox(-0.475F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0462F, -2.9384F, 1.1314F, -1.1098F, -0.0334F, -0.6062F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(114, 115).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9333F, -4.8783F, 7.2907F, 0.4181F, -0.1941F, -1.2428F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(85, 114).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0992F, -4.2691F, 7.1846F, 0.1716F, -0.2951F, -0.4742F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(10, 131).mirror().addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 131).mirror().addBox(-0.8F, -1.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0744F, -5.3534F, 6.0265F, -2.0666F, -0.2865F, -1.1495F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(5, 131).mirror().addBox(-0.7F, -1.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0744F, -5.3534F, 6.0265F, -2.8957F, -0.2865F, -1.1495F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(127, 130).mirror().addBox(-1.0F, -1.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0744F, -5.3534F, 6.0265F, -1.4907F, -0.2865F, -1.1495F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(117, 130).mirror().addBox(-0.4641F, -0.6536F, -0.8171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9962F, -4.3311F, 5.8729F, -2.1486F, 0.0048F, -0.6271F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(125, 9).mirror().addBox(-0.8F, -2.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9825F, -5.2185F, 5.04F, -2.8111F, -1.1185F, -1.4214F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-0.5F, -0.225F, 0.35F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.7077F, 0.3852F, 0.4546F, 0.1228F, -0.1739F, -0.0107F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(124, 122).mirror().addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0284F, -5.2859F, 5.5332F, -2.9988F, 0.0809F, -1.1104F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(130, 103).mirror().addBox(-0.4641F, -0.1636F, -0.2967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9962F, -4.3311F, 5.8729F, -2.9777F, 0.0048F, -0.6271F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(124, 27).mirror().addBox(-1.0065F, -1.9991F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9565F, -5.2075F, 5.0893F, 2.2374F, -0.0012F, -0.6545F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(116, 72).mirror().addBox(-0.1068F, 0.1215F, 0.2973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.0711F, -0.1745F, 0.0308F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.475F, -1.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4189F, -2.5127F, 2.9939F, 1.7691F, -0.2464F, 0.0585F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(13, 119).mirror().addBox(0.025F, -1.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1879F, -0.5228F, -0.3731F, 0.0984F, -0.2566F, 0.0688F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(79, 89).mirror().addBox(-0.6F, -1.7F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3215F, -0.8334F, 0.239F, 0.0972F, -0.257F, 0.0733F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(108, 124).mirror().addBox(-0.5F, -1.6F, -2.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 124).mirror().addBox(-0.5F, -1.3F, -2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 124).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 78).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1842F, 1.1478F, -0.0366F, 0.1638F, -0.2269F, -0.0341F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(124, 68).mirror().addBox(-0.5F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0015F, 1.2513F, 0.7822F, 0.2161F, -0.2269F, -0.0341F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(65, 124).mirror().addBox(-0.5F, -1.15F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 124).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3662F, 1.1228F, 2.342F, 0.1812F, -0.2269F, -0.0341F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(28, 124).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5496F, 1.0132F, 3.1194F, 0.2685F, -0.2269F, -0.0341F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(81, 123).mirror().addBox(0.0493F, -1.6569F, -1.2036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, 0.3994F, -0.2269F, -0.0341F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(76, 123).mirror().addBox(0.0493F, -1.7277F, -0.2792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, 0.5739F, -0.2269F, -0.0341F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(75, 134).mirror().addBox(-0.0697F, -0.9418F, -0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2438F, -2.4975F, -1.1194F, -0.9957F, -0.2593F, 0.0763F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(94, 109).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3141F, -3.4975F, 0.5821F, 1.7706F, -0.2593F, 0.0763F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(85, 134).mirror().addBox(-0.0697F, -0.2812F, 0.9068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2438F, -2.4975F, -1.1194F, 0.4006F, -0.2593F, 0.0763F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(80, 134).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7426F, -2.0474F, -1.4772F, -2.2161F, -0.2419F, 0.076F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(134, 78).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8286F, -1.2663F, -2.0956F, -2.2607F, -0.2384F, 0.0828F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(130, 100).mirror().addBox(-0.5F, -0.9196F, -0.5457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7171F, -1.0123F, -1.7247F, 2.6699F, -0.2384F, 0.0828F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(130, 97).mirror().addBox(0.0317F, -3.6488F, 6.2032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, 2.539F, -0.2384F, 0.013F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(95, 130).mirror().addBox(0.0317F, -7.9945F, 0.2226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, 1.5791F, -0.2384F, 0.013F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(90, 130).mirror().addBox(0.0317F, -2.1402F, -6.9551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, 0.1392F, -0.2384F, 0.013F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(124, 23).mirror().addBox(-0.1104F, -1.7558F, -1.973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1146F, 1.2649F, -0.5115F, -0.3009F, -0.2711F, 0.0382F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(130, 75).mirror().addBox(-0.1104F, 0.0006F, -0.9284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1146F, 1.2649F, -0.5115F, -1.6972F, -0.2711F, 0.0382F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(130, 72).mirror().addBox(-0.0117F, -0.0041F, 4.3632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, -3.1357F, -0.2362F, 0.0379F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(70, 130).mirror().addBox(-0.0117F, -4.3528F, 0.3003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, 1.6465F, -0.2362F, 0.0379F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(10, 124).mirror().addBox(-0.0117F, -3.0189F, -3.2083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, 0.2938F, -0.2362F, 0.0379F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(95, 96).mirror().addBox(-0.0117F, -0.9507F, -2.4452F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4639F, 1.2493F, 4.6703F, -1.4689F, -0.2362F, 0.0379F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(35, 134).mirror().addBox(-0.1661F, -3.1128F, -1.6215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.6992F, -0.1705F, 0.0159F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(16, 86).mirror().addBox(-0.5F, -2.2F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1697F, -2.0741F, 6.467F, 0.1619F, -0.1745F, 0.0308F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(109, 15).mirror().addBox(-0.204F, -3.7645F, -2.0738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.031F, -0.1745F, 0.0308F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(96, 126).mirror().addBox(-0.204F, -3.4699F, -1.3198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -0.3181F, -0.1745F, 0.0308F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(102, 95).mirror().addBox(-0.1814F, -2.4834F, -1.1481F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, 0.0834F, -0.1745F, 0.0308F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(114, 119).mirror().addBox(-0.5F, -1.9F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6618F, -1.2336F, 9.2407F, 0.5197F, -0.1745F, 0.0308F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(102, 59).mirror().addBox(-0.5F, -1.475F, -0.825F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4724F, -1.0173F, 8.1292F, 0.1532F, -0.1745F, 0.0308F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(131, 61).mirror().addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(48, 131).mirror().addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2555F, -2.99F, 6.9313F, -0.3399F, -0.1745F, 0.0308F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(106, 128).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2574F, -2.0033F, 6.7692F, -1.7362F, -0.1745F, 0.0308F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(24, 131).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3048F, -1.0089F, 6.8641F, -3.0452F, -0.1745F, 0.0308F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(130, 133).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4457F, -0.2818F, 7.536F, 2.3217F, -0.1745F, 0.0308F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(116, 15).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6202F, -0.2527F, 8.5203F, 1.5363F, -0.1745F, 0.0308F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(118, 51).mirror().addBox(-0.5F, -2.525F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6324F, -0.8652F, 8.6964F, 0.4455F, -0.1745F, 0.0308F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(5, 128).mirror().addBox(-0.5452F, -0.5673F, -0.4943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 128).mirror().addBox(-0.5452F, -0.5673F, -0.0943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.419F, -1.0522F, -1.5974F, 0.8749F, -0.2437F, 0.0917F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(127, 87).mirror().addBox(-0.5452F, -0.3349F, -0.2711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.419F, -1.0522F, -1.5974F, 1.3548F, -0.2437F, 0.0917F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(127, 55).mirror().addBox(-0.4491F, -0.6954F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.419F, -1.0522F, -1.5974F, 2.7075F, -0.2437F, 0.0917F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(118, 127).mirror().addBox(-0.4491F, -0.5051F, -0.2785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.419F, -1.0522F, -1.5974F, -2.4413F, -0.2437F, 0.0917F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(127, 6).mirror().addBox(-0.4491F, -0.8054F, -0.2009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.419F, -1.0522F, -1.5974F, -2.9649F, -0.2437F, 0.0917F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(128, 82).mirror().addBox(-0.5136F, -1.3433F, 1.4863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(65, 128).mirror().addBox(-0.5136F, -1.3433F, 0.9863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, 0.2223F, -0.2528F, 0.0613F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(128, 94).mirror().addBox(-0.5136F, 0.4179F, -2.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -0.2315F, -0.2528F, 0.0613F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(29, 115).mirror().addBox(-0.5136F, -0.0052F, -2.4565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -2.9804F, -0.2528F, 0.0613F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(124, 118).mirror().addBox(-0.5136F, -2.3516F, -0.8014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -1.6714F, -0.2528F, 0.0613F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(15, 115).mirror().addBox(-0.5136F, -0.3939F, 0.3346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -0.2751F, -0.2528F, 0.0613F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(119, 23).mirror().addBox(-0.5136F, -0.6609F, -0.4143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, 0.8593F, -0.2528F, 0.0613F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(43, 97).mirror().addBox(-0.5136F, -0.0527F, -2.1962F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, 1.9065F, -0.2528F, 0.0613F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(109, 95).mirror().addBox(-0.5136F, -1.9798F, -1.0288F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, 3.041F, -0.2528F, 0.0613F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(101, 128).mirror().addBox(-0.5136F, 0.3437F, 1.1238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -1.8896F, -0.2528F, 0.0613F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(113, 124).mirror().addBox(-0.5136F, 0.4323F, -0.4496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -1.0605F, -0.2528F, 0.0613F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(122, 130).mirror().addBox(-0.5136F, -1.2653F, -1.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, 0.6411F, -0.2528F, 0.0613F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(114, 111).mirror().addBox(-0.5136F, -1.1433F, -0.9007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, 2.0374F, -0.2528F, 0.0613F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(85, 128).mirror().addBox(-0.5136F, 0.0993F, -0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -2.675F, -0.2528F, 0.0613F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(114, 107).mirror().addBox(-0.5136F, -1.3857F, -1.1357F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3669F, -2.0626F, 2.3453F, -1.174F, -0.2528F, 0.0613F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(129, 90).mirror().addBox(-0.727F, -0.2698F, 0.936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(129, 78).mirror().addBox(-0.552F, -0.2698F, 0.936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 1.7511F, -0.1788F, 0.0472F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(133, 81).mirror().addBox(-0.4768F, 0.0041F, -2.057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, -1.6784F, -0.1788F, 0.0472F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(129, 69).mirror().addBox(-0.4768F, -0.4698F, 0.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 1.8559F, -0.1788F, 0.0472F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(115, 133).mirror().addBox(-0.4768F, -0.5592F, -2.233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, -1.373F, -0.1788F, 0.0472F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(110, 133).mirror().addBox(-0.4768F, -2.2819F, -0.1133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, -0.0204F, -0.1788F, 0.0472F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(70, 133).mirror().addBox(-0.4768F, -1.3209F, 0.6334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 0.765F, -0.1788F, 0.0472F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(120, 133).mirror().addBox(-0.4297F, -0.833F, -2.2893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 1.5181F, -0.157F, 0.0905F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(53, 133).mirror().addBox(-0.4297F, -1.5955F, -0.4194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 2.9144F, -0.157F, 0.0905F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(129, 66).mirror().addBox(-0.4297F, -1.1771F, -0.6592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 3.1326F, -0.157F, 0.0905F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(60, 129).mirror().addBox(-0.4297F, -1.9905F, -1.1727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 2.609F, -0.157F, 0.0905F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(129, 28).mirror().addBox(-0.4297F, -0.1443F, -1.4325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, 1.3F, -0.157F, 0.0905F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(125, 133).mirror().addBox(-0.4768F, -1.3791F, -0.0984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, -2.9962F, -0.1788F, 0.0472F));

		PartDefinition cube_r629 = rightFace.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(8, 114).mirror().addBox(-0.4768F, -0.2796F, -1.202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.2388F, -2.3371F, 5.7829F, -1.7308F, -0.1788F, 0.0472F));

		PartDefinition cube_r630 = rightFace.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(97, 86).mirror().addBox(-0.1373F, 1.1138F, -1.8806F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8428F, -0.7821F, 8.353F, -1.3136F, -0.1596F, 0.0364F));

		PartDefinition cube_r631 = rightFace.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(111, 51).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2586F, -0.1426F, 6.7538F, -0.0909F, -0.1738F, 0.0293F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7655F, 1.9027F, 0.4295F, 0.0548F, -0.072F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-0.5998F, -0.4951F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 2.3649F, -0.1047F, 0.0F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(123, 83).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3528F, -2.5043F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(123, 94).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6014F, 3.3528F, -0.5968F, 0.4696F, -0.0811F, 0.0342F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(65, 131).mirror().addBox(-0.5998F, -0.5435F, 0.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(75, 131).mirror().addBox(-0.5998F, -0.5435F, 1.067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -2.6093F, -0.1047F, 0.0F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(80, 131).mirror().addBox(-0.5998F, -1.5359F, 0.709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 2.8449F, -0.1047F, 0.0F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(85, 131).mirror().addBox(-0.5998F, -2.292F, 0.1462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 2.234F, -0.1047F, 0.0F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(100, 131).mirror().addBox(-0.5998F, -2.714F, -0.7872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 1.6319F, -0.1047F, 0.0F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(105, 131).mirror().addBox(-0.5998F, 1.9853F, -0.2087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -1.1606F, -0.1047F, 0.0F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(15, 125).mirror().addBox(-0.5998F, -0.4485F, -3.6851F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.1484F, -0.1047F, 0.0F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(131, 109).mirror().addBox(-0.5998F, 2.9037F, -0.7239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -0.9861F, -0.1047F, 0.0F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(20, 125).mirror().addBox(-0.5998F, -0.9257F, -4.5951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.2793F, -0.1047F, 0.0F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(131, 112).mirror().addBox(-0.5998F, 3.7258F, -1.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -0.8988F, -0.1047F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(125, 31).mirror().addBox(-0.5998F, -1.7096F, -5.3645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.4538F, -0.1047F, 0.0F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(131, 115).mirror().addBox(-0.5998F, 0.3625F, -5.5255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.3665F, -0.1047F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(116, 19).mirror().addBox(-0.5998F, -5.9846F, -2.7462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 1.6755F, -0.1047F, 0.0F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(109, 100).mirror().addBox(-0.5998F, -2.1706F, -7.1951F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.5411F, -0.1047F, 0.0F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(33, 125).mirror().addBox(-0.5998F, -7.7797F, -1.7695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 1.85F, -0.1047F, 0.0F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(50, 116).mirror().addBox(-1.0875F, -0.4679F, -3.1651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.2356F, -0.1745F, 0.0F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(132, 3).mirror().addBox(-1.0875F, -0.7071F, -1.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 1.7628F, -0.1745F, 0.0F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(132, 6).mirror().addBox(-1.0875F, -0.382F, -0.3005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.5847F, -0.1745F, 0.0F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(132, 12).mirror().addBox(-1.0875F, -0.6544F, -0.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.5978F, -0.1745F, 0.0F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(132, 23).mirror().addBox(-1.0875F, -1.6574F, -1.1516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 1.7191F, -0.1745F, 0.0F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(132, 39).mirror().addBox(-1.0875F, -0.6245F, -1.2246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.3665F, -0.1745F, 0.0F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(125, 35).mirror().addBox(-1.0875F, -3.6056F, -1.2228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 1.6755F, -0.1745F, 0.0F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(116, 58).mirror().addBox(-1.0875F, -0.0985F, -4.7711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.1047F, -0.1745F, 0.0F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(132, 42).mirror().addBox(-1.0875F, -4.5489F, -1.3789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 1.6319F, -0.1745F, 0.0F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(134, 88).mirror().addBox(-0.0571F, 0.347F, 0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1655F, 2.6236F, -11.2167F, -1.8151F, -0.2443F, 0.0F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(132, 54).mirror().addBox(-0.0571F, 0.3937F, -0.9219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1655F, 2.6236F, -11.2167F, -0.0262F, -0.2443F, 0.0F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(58, 132).mirror().addBox(-0.0571F, 0.9382F, 0.3532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1655F, 2.6236F, -11.2167F, -1.5533F, -0.2443F, 0.0F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(100, 134).mirror().addBox(-0.0571F, -1.6473F, -0.2793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1655F, 2.6236F, -11.2167F, 3.1154F, -0.2443F, 0.0F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(132, 85).mirror().addBox(-1.0875F, -1.4097F, -0.22F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(38, 125).mirror().addBox(-1.0875F, -1.5097F, -1.02F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.3229F, -0.1745F, 0.0F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(43, 125).mirror().addBox(-1.0875F, -1.3163F, -1.8523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.2531F, -0.1745F, 0.0F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(125, 47).mirror().addBox(-1.0875F, -1.2532F, -2.6685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.2007F, -0.1745F, 0.0F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(60, 125).mirror().addBox(-1.0875F, -1.0931F, -3.488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.1134F, -0.1745F, 0.0F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(125, 102).mirror().addBox(-1.0875F, -0.9278F, -4.2885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9655F, 2.6236F, -6.4167F, 0.0698F, -0.1745F, 0.0F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(55, 126).mirror().addBox(-0.0571F, -0.6255F, -0.4075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1655F, 2.6236F, -11.2167F, 0.0698F, -0.2443F, 0.0F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(126, 62).mirror().addBox(-0.0571F, -0.4906F, -1.1635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 130).mirror().addBox(-0.0571F, -0.3656F, -1.9635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1655F, 2.6236F, -11.2167F, -0.0175F, -0.2443F, 0.0F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-0.7026F, 0.7551F, -4.8612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.1477F, -0.1041F, 0.0092F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(5, 134).mirror().addBox(-0.7026F, 4.7334F, -0.2956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -1.2049F, -0.1041F, 0.0092F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(10, 134).mirror().addBox(-0.7026F, 0.5782F, -6.3695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.2088F, -0.1041F, 0.0092F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(15, 134).mirror().addBox(-0.7026F, 4.9806F, -3.9356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -0.6202F, -0.1041F, 0.0092F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(20, 134).mirror().addBox(-0.7026F, 5.7109F, 2.648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -1.6238F, -0.1041F, 0.0092F));

		PartDefinition cube_r674 = jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(133, 15).mirror().addBox(-0.7026F, -2.585F, 5.4388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, -3.0201F, -0.1041F, 0.0092F));

		PartDefinition cube_r675 = jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(25, 134).mirror().addBox(-0.7026F, -5.9861F, -1.5855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 1.8669F, -0.1041F, 0.0092F));

		PartDefinition cube_r676 = jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(134, 26).mirror().addBox(-0.7026F, -1.9309F, -5.2974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(30, 134).mirror().addBox(-0.7026F, -1.9309F, -5.0974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2655F, -0.1764F, 0.8833F, 0.776F, -0.1041F, 0.0092F));

		PartDefinition cube_r677 = jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(58, 132).mirror().addBox(0.0F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7557F, 3.5104F, -13.0964F, -1.5538F, -0.0524F, 0.0033F));

		PartDefinition cube_r678 = jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(123, 94).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6014F, 3.3528F, -0.5968F, 0.4696F, 0.0811F, -0.0342F));

		PartDefinition cube_r679 = jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(123, 83).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3528F, -2.5043F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r680 = jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(132, 6).addBox(0.0875F, -0.382F, -0.3005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.5847F, 0.1745F, 0.0F));

		PartDefinition cube_r681 = jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(132, 130).addBox(-0.9429F, -0.3656F, -1.9635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(126, 62).addBox(-0.9429F, -0.4906F, -1.1635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1655F, 2.6236F, -11.2167F, -0.0175F, 0.2443F, 0.0F));

		PartDefinition cube_r682 = jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(55, 126).addBox(-0.9429F, -0.6255F, -0.4075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1655F, 2.6236F, -11.2167F, 0.0698F, 0.2443F, 0.0F));

		PartDefinition cube_r683 = jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(125, 102).addBox(0.0875F, -0.9278F, -4.2885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.0698F, 0.1745F, 0.0F));

		PartDefinition cube_r684 = jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(60, 125).addBox(0.0875F, -1.0931F, -3.488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.1134F, 0.1745F, 0.0F));

		PartDefinition cube_r685 = jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(125, 47).addBox(0.0875F, -1.2532F, -2.6685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.2007F, 0.1745F, 0.0F));

		PartDefinition cube_r686 = jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(43, 125).addBox(0.0875F, -1.3163F, -1.8523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.2531F, 0.1745F, 0.0F));

		PartDefinition cube_r687 = jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(38, 125).addBox(0.0875F, -1.5097F, -1.02F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 85).addBox(0.0875F, -1.4097F, -0.22F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.3229F, 0.1745F, 0.0F));

		PartDefinition cube_r688 = jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(132, 12).addBox(0.0875F, -0.6544F, -0.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.5978F, 0.1745F, 0.0F));

		PartDefinition cube_r689 = jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(132, 39).addBox(0.0875F, -0.6245F, -1.2246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.3665F, 0.1745F, 0.0F));

		PartDefinition cube_r690 = jaw.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(58, 132).addBox(-1.0F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7557F, 3.5104F, -13.0964F, -1.5538F, 0.0524F, -0.0033F));

		PartDefinition cube_r691 = jaw.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(58, 132).addBox(-0.9429F, 0.9382F, 0.3532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1655F, 2.6236F, -11.2167F, -1.5533F, 0.2443F, 0.0F));

		PartDefinition cube_r692 = jaw.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(132, 54).addBox(-0.9429F, 0.3937F, -0.9219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1655F, 2.6236F, -11.2167F, -0.0262F, 0.2443F, 0.0F));

		PartDefinition cube_r693 = jaw.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(116, 58).addBox(0.0875F, -0.0985F, -4.7711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.1047F, 0.1745F, 0.0F));

		PartDefinition cube_r694 = jaw.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(50, 116).addBox(0.0875F, -0.4679F, -3.1651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 0.2356F, 0.1745F, 0.0F));

		PartDefinition cube_r695 = jaw.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(109, 100).addBox(-0.4002F, -2.1706F, -7.1951F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.5411F, 0.1047F, 0.0F));

		PartDefinition cube_r696 = jaw.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(30, 134).addBox(-0.2974F, -1.9309F, -5.0974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(134, 26).addBox(-0.2974F, -1.9309F, -5.2974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.776F, 0.1041F, -0.0092F));

		PartDefinition cube_r697 = jaw.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(25, 134).addBox(-0.2974F, -5.9861F, -1.5855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 1.8669F, 0.1041F, -0.0092F));

		PartDefinition cube_r698 = jaw.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(133, 15).addBox(-0.2974F, -2.585F, 5.4388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -3.0201F, 0.1041F, -0.0092F));

		PartDefinition cube_r699 = jaw.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(20, 134).addBox(-0.2974F, 5.7109F, 2.648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -1.6238F, 0.1041F, -0.0092F));

		PartDefinition cube_r700 = jaw.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(15, 134).addBox(-0.2974F, 4.9806F, -3.9356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -0.6202F, 0.1041F, -0.0092F));

		PartDefinition cube_r701 = jaw.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(10, 134).addBox(-0.2974F, 0.5782F, -6.3695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.2088F, 0.1041F, -0.0092F));

		PartDefinition cube_r702 = jaw.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(5, 134).addBox(-0.2974F, 4.7334F, -0.2956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -1.2049F, 0.1041F, -0.0092F));

		PartDefinition cube_r703 = jaw.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(0, 134).addBox(-0.2974F, 0.7551F, -4.8612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.1477F, 0.1041F, -0.0092F));

		PartDefinition cube_r704 = jaw.addOrReplaceChild("cube_r704", CubeListBuilder.create().texOffs(125, 31).addBox(-0.4002F, -1.7096F, -5.3645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.4538F, 0.1047F, 0.0F));

		PartDefinition cube_r705 = jaw.addOrReplaceChild("cube_r705", CubeListBuilder.create().texOffs(20, 125).addBox(-0.4002F, -0.9257F, -4.5951F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.2793F, 0.1047F, 0.0F));

		PartDefinition cube_r706 = jaw.addOrReplaceChild("cube_r706", CubeListBuilder.create().texOffs(15, 125).addBox(-0.4002F, -0.4485F, -3.6851F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.1484F, 0.1047F, 0.0F));

		PartDefinition cube_r707 = jaw.addOrReplaceChild("cube_r707", CubeListBuilder.create().texOffs(100, 131).addBox(-0.4002F, -2.714F, -0.7872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 1.6319F, 0.1047F, 0.0F));

		PartDefinition cube_r708 = jaw.addOrReplaceChild("cube_r708", CubeListBuilder.create().texOffs(85, 131).addBox(-0.4002F, -2.292F, 0.1462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 2.234F, 0.1047F, 0.0F));

		PartDefinition cube_r709 = jaw.addOrReplaceChild("cube_r709", CubeListBuilder.create().texOffs(80, 131).addBox(-0.4002F, -1.5359F, 0.709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 2.8449F, 0.1047F, 0.0F));

		PartDefinition cube_r710 = jaw.addOrReplaceChild("cube_r710", CubeListBuilder.create().texOffs(100, 134).addBox(-0.9429F, -1.6473F, -0.2793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1655F, 2.6236F, -11.2167F, 3.1154F, 0.2443F, 0.0F));

		PartDefinition cube_r711 = jaw.addOrReplaceChild("cube_r711", CubeListBuilder.create().texOffs(134, 88).addBox(-0.9429F, 0.347F, 0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1655F, 2.6236F, -11.2167F, -1.8151F, 0.2443F, 0.0F));

		PartDefinition cube_r712 = jaw.addOrReplaceChild("cube_r712", CubeListBuilder.create().texOffs(132, 42).addBox(0.0875F, -4.5489F, -1.3789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 1.6319F, 0.1745F, 0.0F));

		PartDefinition cube_r713 = jaw.addOrReplaceChild("cube_r713", CubeListBuilder.create().texOffs(125, 35).addBox(0.0875F, -3.6056F, -1.2228F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 1.6755F, 0.1745F, 0.0F));

		PartDefinition cube_r714 = jaw.addOrReplaceChild("cube_r714", CubeListBuilder.create().texOffs(132, 23).addBox(0.0875F, -1.6574F, -1.1516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 1.7191F, 0.1745F, 0.0F));

		PartDefinition cube_r715 = jaw.addOrReplaceChild("cube_r715", CubeListBuilder.create().texOffs(132, 3).addBox(0.0875F, -0.7071F, -1.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9655F, 2.6236F, -6.4167F, 1.7628F, 0.1745F, 0.0F));

		PartDefinition cube_r716 = jaw.addOrReplaceChild("cube_r716", CubeListBuilder.create().texOffs(33, 125).addBox(-0.4002F, -7.7797F, -1.7695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 1.85F, 0.1047F, 0.0F));

		PartDefinition cube_r717 = jaw.addOrReplaceChild("cube_r717", CubeListBuilder.create().texOffs(116, 19).addBox(-0.4002F, -5.9846F, -2.7462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 1.6755F, 0.1047F, 0.0F));

		PartDefinition cube_r718 = jaw.addOrReplaceChild("cube_r718", CubeListBuilder.create().texOffs(131, 115).addBox(-0.4002F, 0.3625F, -5.5255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 0.3665F, 0.1047F, 0.0F));

		PartDefinition cube_r719 = jaw.addOrReplaceChild("cube_r719", CubeListBuilder.create().texOffs(131, 112).addBox(-0.4002F, 3.7258F, -1.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -0.8988F, 0.1047F, 0.0F));

		PartDefinition cube_r720 = jaw.addOrReplaceChild("cube_r720", CubeListBuilder.create().texOffs(131, 109).addBox(-0.4002F, 2.9037F, -0.7239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -0.9861F, 0.1047F, 0.0F));

		PartDefinition cube_r721 = jaw.addOrReplaceChild("cube_r721", CubeListBuilder.create().texOffs(105, 131).addBox(-0.4002F, 1.9853F, -0.2087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -1.1606F, 0.1047F, 0.0F));

		PartDefinition cube_r722 = jaw.addOrReplaceChild("cube_r722", CubeListBuilder.create().texOffs(75, 131).addBox(-0.4002F, -0.5435F, 1.067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(65, 131).addBox(-0.4002F, -0.5435F, 0.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, -2.6093F, 0.1047F, 0.0F));

		PartDefinition cube_r723 = jaw.addOrReplaceChild("cube_r723", CubeListBuilder.create().texOffs(130, 0).addBox(-0.4002F, -0.4951F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2655F, -0.1764F, 0.8833F, 2.3649F, 0.1047F, 0.0F));

		return LayerDefinition.create(meshdefinition, 140, 140);
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