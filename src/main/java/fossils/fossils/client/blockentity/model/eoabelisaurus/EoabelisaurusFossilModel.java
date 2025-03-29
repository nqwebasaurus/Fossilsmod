package fossils.fossils.client.blockentity.model.eoabelisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EoabelisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart bony;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public EoabelisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.bony = this.hips.getChild("bony");
		this.chest = this.bony.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -22.25F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 25).addBox(0.0F, -3.6069F, -0.0231F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.4F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 10).addBox(0.0F, -3.3429F, -0.0825F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 10).addBox(0.0F, -3.2121F, 0.0377F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 72).addBox(0.0F, -3.064F, 0.0594F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 25).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -4.5F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 21).mirror().addBox(-1.0F, -1.0096F, -1.9496F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 21).addBox(4.0F, -1.0096F, -1.9496F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.1F, 2.8F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 21).mirror().addBox(-1.0F, 0.1377F, -0.818F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(55, 69).mirror().addBox(-1.0F, -0.7623F, -0.418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.4F, 0.9F, -0.1745F, -0.1571F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 53).mirror().addBox(-2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 53).addBox(1.0F, 0.5F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(17, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -4.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 15).mirror().addBox(0.0F, 1.8953F, -3.023F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.1807F, -0.5F, 0.2182F, 0.0F, -0.2618F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 46).mirror().addBox(0.0F, -1.3682F, 8.6809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 38).mirror().addBox(0.0F, -0.8682F, 2.6809F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.1807F, -0.5F, -1.1345F, 0.0F, -0.2618F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 15).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1423F, 8.5407F, -6.9472F, -0.5651F, 0.1182F, -0.078F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(0.0019F, 1.9546F, -0.74F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6807F, -2.2F, -0.576F, 0.0F, -0.2618F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(41, 66).mirror().addBox(0.0019F, -0.1765F, -1.1469F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6807F, -2.2F, -0.4363F, 0.0F, -0.2618F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(0.0F, -0.4695F, -1.1926F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.1807F, -0.5F, -0.8029F, 0.0F, -0.2618F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(59, 18).mirror().addBox(0.0F, -0.8193F, -1.3366F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.1807F, -0.5F, -0.2356F, 0.0F, -0.2618F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-1.0F, -1.1929F, -3.9124F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9F, -1.0F, 0.4363F, 0.1134F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-1.0F, -0.0036F, -1.8081F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 0).addBox(4.0F, -0.0036F, -1.8081F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.8F, 0.8F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 53).mirror().addBox(-1.0F, -1.2302F, -0.6904F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.4F, 0.9F, -0.4363F, -0.1571F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(-1.0F, -1.0719F, -2.7713F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9F, -1.0F, 0.1396F, 0.1134F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(47, 16).mirror().addBox(-1.0F, -1.5811F, -3.511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9F, -1.0F, 0.3316F, 0.1134F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 56).mirror().addBox(-1.0F, 0.3002F, -3.86F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9F, -1.0F, -0.1745F, 0.1134F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(60, 10).addBox(0.0F, -1.0719F, -2.7713F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.9F, -1.0F, 0.1396F, -0.1134F, 0.0F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(59, 58).addBox(0.0F, -1.1929F, -3.9124F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, -1.9F, -1.0F, 0.4363F, -0.1134F, 0.0F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(47, 16).addBox(0.0F, -1.5811F, -3.511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.9F, -1.0F, 0.3316F, -0.1134F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.1423F, 8.5407F, -6.9472F, -0.5651F, -0.1182F, 0.078F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0019F, 1.9546F, -0.74F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, 1.6807F, -2.2F, -0.576F, 0.0F, 0.2618F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(16, 15).addBox(-1.0F, 1.8953F, -3.023F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9F, 0.1807F, -0.5F, 0.2182F, 0.0F, 0.2618F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(41, 66).addBox(-1.0019F, -0.1765F, -1.1469F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.6807F, -2.2F, -0.4363F, 0.0F, 0.2618F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 46).addBox(-1.0F, -1.3682F, 8.6809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 38).addBox(-1.0F, -0.8682F, 2.6809F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.1807F, -0.5F, -1.1345F, 0.0F, 0.2618F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.4695F, -1.1926F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9F, 0.1807F, -0.5F, -0.8029F, 0.0F, 0.2618F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 18).addBox(-1.0F, -0.8193F, -1.3366F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.1807F, -0.5F, -0.2356F, 0.0F, 0.2618F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(49, 53).addBox(0.0F, -1.2302F, -0.6904F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.4F, 0.9F, -0.4363F, 0.1571F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(55, 69).addBox(0.0F, -0.7623F, -0.418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(51, 21).addBox(0.0F, 0.1377F, -0.818F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, -1.4F, 0.9F, -0.1745F, 0.1571F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(28, 56).addBox(0.0F, 0.3002F, -3.86F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, -1.9F, -1.0F, -0.1745F, -0.1134F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(45, 44).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 1.1807F, -0.5F, -0.3476F, 0.0227F, 0.1289F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(53, 8).addBox(0.0F, 0.0F, -0.6F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 10.0F, -0.4F, 1.4392F, -0.0151F, 0.0859F));

		PartDefinition cube_r35 = leftLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 62).addBox(-0.5F, -5.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(20, 60).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 5.0F, 0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(42, 58).addBox(-1.0F, 0.0F, -1.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.0F, 1.2F, -1.132F, -0.1248F, -0.0396F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.3932F, -0.0114F, -0.0865F));

		PartDefinition cube_r36 = leftLeg4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(32, 13).addBox(-2.0F, -1.0F, -5.8F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(15, 40).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, 1.1807F, -0.5F, -0.7608F, 0.2063F, -0.1347F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(37, 46).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 10.0F, -0.4F, 1.3243F, -0.1183F, -0.289F));

		PartDefinition cube_r37 = rightLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(48, 66).addBox(-0.5F, -5.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(24, 40).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 5.0F, 0.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, 0.0F, -1.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 10.0F, 1.2F, -0.8592F, 0.1126F, 0.1335F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(26, 28).addBox(-2.0F, -1.0F, -5.8F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.2205F, -0.0145F, 0.086F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.7016F, -0.0686F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r38 = tail.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(6, 72).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 9.9314F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 72).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 7.9314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(17, 72).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 5.9314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(20, 72).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 3.9314F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7016F, 1.9314F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(62, 71).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4038F, 9.8266F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -0.6F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 72).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6813F, 5.407F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(71, 72).addBox(0.0F, 0.0F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 28).addBox(0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8313F, -0.2266F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(41, 37).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6016F, -0.0686F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2984F, 10.8314F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r47 = tail2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(9, 63).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 9.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(63, 64).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 7.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(73, 50).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(56, 73).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 24).addBox(0.0F, 0.9F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 59).addBox(0.0F, 0.5F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 60).addBox(0.0F, 0.0F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 72).addBox(0.0F, -0.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 72).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1396F, 1.1041F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(59, 73).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5F, -0.4039F, -0.0679F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(60, 10).addBox(0.0F, -0.9039F, 0.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 58).addBox(0.0F, -0.8039F, 2.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 28).addBox(0.0F, -0.7039F, 4.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(0.0F, -0.7039F, 6.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 53).addBox(0.0F, -0.6039F, 8.9321F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 10.0F, 0.1139F, -0.0867F, -0.0099F));

		PartDefinition cube_r53 = tail3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(7, 19).addBox(0.0F, 1.3407F, 0.8469F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4808F, 7.8357F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(7, 11).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.712F, 5.6116F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(16, 15).addBox(0.0F, -0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 15).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5961F, 1.4321F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.5005F, 0.0218F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0961F, 10.8321F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5005F, 8.0218F, -0.264F, 0.1264F, -0.0341F));

		PartDefinition bony = hips.addOrReplaceChild("bony", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.6F, -4.6F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r56 = bony.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(35, 72).addBox(0.0F, -2.2594F, -0.0783F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -7.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = bony.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(38, 72).addBox(0.0F, -2.0847F, -0.0771F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -9.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bony.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-4.4912F, -1.5298F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0002F, -1.1979F, 0.0384F, -0.0997F, -1.4197F));

		PartDefinition cube_r59 = bony.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0002F, -1.1979F, -0.0028F, -0.1068F, -1.0249F));

		PartDefinition cube_r60 = bony.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0002F, -1.1979F, -0.0419F, -0.0533F, -0.5463F));

		PartDefinition cube_r61 = bony.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-7.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0998F, -3.1979F, 0.049F, -0.0665F, -1.3333F));

		PartDefinition cube_r62 = bony.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(32, 46).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0998F, -3.1979F, 0.0198F, -0.0802F, -0.9398F));

		PartDefinition cube_r63 = bony.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(9, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0998F, -3.1979F, -0.0095F, -0.04F, -0.4606F));

		PartDefinition cube_r64 = bony.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-8.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1998F, -5.1979F, 0.0648F, -0.0166F, -1.2991F));

		PartDefinition cube_r65 = bony.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(47, 42).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1998F, -5.1979F, 0.0536F, -0.0401F, -0.9069F));

		PartDefinition cube_r66 = bony.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1998F, -5.1979F, 0.0389F, -0.02F, -0.4271F));

		PartDefinition cube_r67 = bony.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(72, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1998F, -7.1979F, 0.0873F, 0.0F, -0.3927F));

		PartDefinition cube_r68 = bony.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0998F, -9.1979F, 0.1195F, 0.0134F, -0.3925F));

		PartDefinition cube_r69 = bony.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0998F, -9.1979F, 0.1097F, 0.0267F, -0.8724F));

		PartDefinition cube_r70 = bony.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(62, 40).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1998F, -7.1979F, 0.0873F, 0.0F, -0.8727F));

		PartDefinition cube_r71 = bony.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(41, 31).mirror().addBox(-10.4912F, -1.5298F, -0.4598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1998F, -7.1979F, 0.0807F, 0.0334F, -1.264F));

		PartDefinition cube_r72 = bony.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(16, 13).mirror().addBox(-10.4912F, -1.5298F, -0.4598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.0998F, -9.1979F, 0.0912F, 0.0666F, -1.2635F));

		PartDefinition cube_r73 = bony.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(72, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0998F, -9.1979F, 0.1195F, -0.0134F, 0.3925F));

		PartDefinition cube_r74 = bony.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(60, 16).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0998F, -9.1979F, 0.1097F, -0.0267F, 0.8724F));

		PartDefinition cube_r75 = bony.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(16, 13).addBox(2.4912F, -1.5298F, -0.4598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0998F, -9.1979F, 0.0912F, -0.0666F, 1.2635F));

		PartDefinition cube_r76 = bony.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(16, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0002F, -1.1979F, -0.0419F, 0.0533F, 0.5463F));

		PartDefinition cube_r77 = bony.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 6).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0002F, -1.1979F, -0.0028F, 0.1068F, 1.0249F));

		PartDefinition cube_r78 = bony.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 33).addBox(2.4912F, -1.5298F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0002F, -1.1979F, 0.0384F, 0.0997F, 1.4197F));

		PartDefinition cube_r79 = bony.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(9, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0998F, -3.1979F, -0.0095F, 0.04F, 0.4606F));

		PartDefinition cube_r80 = bony.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(32, 46).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0998F, -3.1979F, 0.0198F, 0.0802F, 0.9398F));

		PartDefinition cube_r81 = bony.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(32, 22).addBox(2.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0998F, -3.1979F, 0.049F, 0.0665F, 1.3333F));

		PartDefinition cube_r82 = bony.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(54, 46).addBox(2.4912F, -1.5298F, -0.4598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1998F, -5.1979F, 0.0648F, 0.0166F, 1.2991F));

		PartDefinition cube_r83 = bony.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(47, 42).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1998F, -5.1979F, 0.0536F, 0.0401F, 0.9069F));

		PartDefinition cube_r84 = bony.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(63, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1998F, -5.1979F, 0.0389F, 0.02F, 0.4271F));

		PartDefinition cube_r85 = bony.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(41, 31).addBox(2.4912F, -1.5298F, -0.4598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1998F, -7.1979F, 0.0807F, -0.0334F, 1.264F));

		PartDefinition cube_r86 = bony.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 40).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1998F, -7.1979F, 0.0873F, 0.0F, 0.8727F));

		PartDefinition cube_r87 = bony.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(72, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1998F, -7.1979F, 0.0873F, 0.0F, 0.3927F));

		PartDefinition cube_r88 = bony.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -0.1254F, -4.9797F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -5.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bony.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(29, 72).addBox(0.0F, -2.608F, -0.0782F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -5.7F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bony.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(26, 72).addBox(0.0F, -2.7586F, -0.0804F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -1.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bony.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(32, 72).addBox(0.0F, -2.8424F, 0.029F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -3.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bony.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 8.892F, -4.0782F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(30, 37).addBox(-1.0F, -0.108F, -0.0782F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -5.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition chest = bony.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -10.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(73, 64).addBox(0.0F, -1.9327F, -0.0227F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -1.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(74, 3).addBox(0.0F, -1.606F, 0.0376F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1F, -3.1F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(52, 44).mirror().addBox(-9.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6002F, -0.6979F, 0.0939F, 0.075F, -1.3157F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6002F, -0.6979F, 0.1276F, 0.0167F, -0.4447F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6002F, -0.6979F, 0.1153F, 0.0334F, -0.9246F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-7.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.9002F, -2.5979F, 0.1098F, 0.1248F, -1.3315F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(16, 56).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.9002F, -2.5979F, 0.1491F, 0.0735F, -0.9402F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(33, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.9002F, -2.5979F, 0.176F, 0.0367F, -0.4609F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(27, 53).mirror().addBox(-2.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2002F, -4.5979F, 0.2058F, 0.1401F, -1.0738F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(12, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2002F, -4.5979F, 0.2569F, 0.0698F, -0.5962F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(27, 53).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2002F, -4.5979F, 0.2058F, -0.1401F, 1.0738F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(12, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2002F, -4.5979F, 0.2569F, -0.0698F, 0.5962F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(66, 0).addBox(2.4912F, -1.5298F, -0.4598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2002F, -4.5979F, 0.1369F, -0.2079F, 1.4667F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(10, 54).addBox(2.4912F, -1.5298F, -0.4598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9002F, -2.5979F, 0.1098F, -0.1248F, 1.3315F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(16, 56).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9002F, -2.5979F, 0.1491F, -0.0735F, 0.9402F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(33, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9002F, -2.5979F, 0.176F, -0.0367F, 0.4609F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(71, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6002F, -0.6979F, 0.1276F, -0.0167F, 0.4447F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(56, 35).addBox(0.887F, -0.46F, -0.4598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6002F, -0.6979F, 0.1153F, -0.0334F, 0.9246F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(52, 44).addBox(2.4912F, -1.5298F, -0.4598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6002F, -0.6979F, 0.0939F, -0.075F, 1.3157F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(12, 74).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -5.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(13, 28).mirror().addBox(0.2358F, -2.4026F, -3.4917F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(0, 46).mirror().addBox(0.2358F, -2.4026F, -0.4917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 4.475F, -3.4659F, 1.3186F, -0.4848F, -0.4607F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.9F, -0.5906F, -2.074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 3.275F, -1.8659F, 0.8216F, -0.2457F, -0.1968F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(54, 37).mirror().addBox(-1.1F, -0.7F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 3.4059F, -1.8477F, 0.7349F, 0.0648F, 0.0585F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(67, 40).mirror().addBox(0.1F, -0.5524F, -2.2573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 3.275F, -1.8659F, 0.5424F, -0.2457F, -0.1968F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(13, 28).addBox(-1.2358F, -2.4026F, -3.4917F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F))
				.texOffs(0, 46).addBox(-1.2358F, -2.4026F, -0.4917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)), PartPose.offsetAndRotation(3.5F, 4.475F, -3.4659F, 1.3186F, 0.4848F, 0.4607F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(67, 40).addBox(-1.1F, -0.5524F, -2.2573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(4.0F, 3.275F, -1.8659F, 0.5424F, 0.2457F, 0.1968F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(7, 68).addBox(-0.1F, -0.5906F, -2.074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.9F, 3.275F, -1.8659F, 0.8216F, 0.2457F, 0.1968F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(54, 37).addBox(0.1F, -0.7F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.9F, 3.4059F, -1.8477F, 0.7349F, -0.0648F, -0.0585F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(41, 23).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -5.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5F, -0.4343F, -0.4343F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 6.375F, -3.4659F, -0.9041F, 0.3068F, -0.375F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(25, 62).addBox(-1.0F, -0.8402F, 0.0232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 63).addBox(-1.0F, 0.2598F, 0.1232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.1343F, 4.6657F, -1.0538F, -0.0869F, 0.1515F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(67, 2).addBox(-1.0F, -1.1F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 3.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(24, 46).addBox(-0.5F, -0.4343F, -0.4343F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7F, 6.375F, -3.4659F, -0.8455F, -0.3315F, 0.4708F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(51, 61).addBox(0.0F, -0.8402F, 0.0232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(62, 35).addBox(0.0F, 0.2598F, 0.1232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.1343F, 4.6657F, -0.8356F, 0.0869F, -0.1515F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 67).addBox(0.0F, -1.1F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 3.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r122 = neck4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(25, 60).mirror().addBox(0.0F, -0.2734F, -0.547F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.5F, 0.3515F, -0.2159F, 0.5287F));

		PartDefinition cube_r123 = neck4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(25, 60).addBox(0.0F, -0.2734F, -0.547F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.5F, 0.3515F, 0.2159F, -0.5287F));

		PartDefinition cube_r124 = neck4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(74, 18).addBox(-0.5F, -1.7F, 1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 29).addBox(-1.0F, -0.2F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.9F, -2.7F, 0.1329F, -0.173F, -0.023F));

		PartDefinition cube_r125 = neck3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(74, 42).addBox(-0.5F, -1.3918F, -0.6851F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 58).addBox(-0.5F, -1.0918F, -2.6851F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 57).addBox(-1.0F, -0.0918F, -3.6851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, 0.0F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(66, 7).mirror().addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -0.4F, -1.2419F, -0.2004F, 0.4388F));

		PartDefinition cube_r127 = neck3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3F, -2.4F, -1.1391F, -0.1716F, 0.355F));

		PartDefinition cube_r128 = neck3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(66, 7).addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.4F, -1.2419F, 0.2004F, -0.4388F));

		PartDefinition cube_r129 = neck3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(15, 67).addBox(0.0F, -0.5934F, -0.0065F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, -2.4F, -1.1391F, 0.1716F, -0.355F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r130 = neck2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(68, 35).addBox(-0.5F, -1.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 25).addBox(-0.5F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 48).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4F, -3.2F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r131 = neck2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(22, 67).mirror().addBox(0.0393F, -0.6567F, 0.0652F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0079F, -1.1338F, -1.1054F, -0.1966F, 0.2353F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(0.0F, -0.4999F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9921F, -2.8338F, -0.9745F, -0.1966F, 0.2353F));

		PartDefinition cube_r133 = neck2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(22, 67).addBox(-0.0393F, -0.6567F, 0.0652F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0079F, -1.1338F, -1.1054F, 0.1966F, -0.2353F));

		PartDefinition cube_r134 = neck2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(47, 0).addBox(0.0F, -0.4999F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9921F, -2.8338F, -0.9745F, 0.1966F, -0.2353F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -3.4F, -0.0465F, -0.2577F, 0.1806F));

		PartDefinition cube_r135 = neck.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 9).addBox(0.0F, -0.9F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 52).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r136 = neck.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(0.0F, -0.1809F, -0.0036F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -0.9F, -0.5476F, -0.2249F, 0.1352F));

		PartDefinition cube_r137 = neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(9, 38).addBox(0.0F, -0.1809F, -0.0036F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.9F, -0.5476F, 0.2249F, -0.1352F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -1.8F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-1.43F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.0254F, -7.5723F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(41, 72).mirror().addBox(-2.0F, 0.0123F, 0.351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 72).mirror().addBox(-2.0F, 0.0123F, -0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.1814F, -6.4019F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(51, 72).mirror().addBox(-2.0F, -0.1F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(67, 30).mirror().addBox(-2.0F, -1.1F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6814F, -4.1019F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-1.92F, 0.0023F, -0.9852F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.4925F, -2.4182F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(15, 63).mirror().addBox(-2.15F, -1.9F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(31, 62).mirror().addBox(-2.26F, -1.9F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 38).mirror().addBox(-1.92F, -1.9F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.4075F, -2.1182F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-1.92F, -1.9723F, -0.9326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.6936F, 0.25F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(70, 7).mirror().addBox(-1.92F, -1.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.3936F, -0.25F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(26, 28).mirror().addBox(-1.92F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.0389F, -1.3474F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-1.92F, 0.0236F, -0.9733F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.5611F, -1.0474F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(26, 67).mirror().addBox(-1.92F, -0.0613F, 0.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.7936F, -0.45F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-2.0F, -0.9503F, 0.0349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4184F, -0.9359F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -0.1163F, -1.9178F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -0.1163F, -1.9178F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(55, 0).addBox(-2.0F, -5.1947F, -0.0927F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-1.0F, -4.1947F, 0.0073F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2F, -7.5F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0396F, -0.0122F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1F, -8.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 12).addBox(-1.0F, -0.0371F, -0.0423F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.4F, -7.2F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(75, 22).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2838F, -4.3609F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(75, 25).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5838F, -5.0609F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(41, 75).addBox(0.0F, -0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8789F, -5.6262F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(44, 75).addBox(0.0F, 0.0F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8416F, -6.1947F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(64, 48).addBox(-1.0F, 0.0231F, 0.0353F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -6.4F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(36, 68).mirror().addBox(-1.6F, -0.1008F, 0.0655F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.2F, -6.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(74, 72).mirror().addBox(-1.7F, 3.5295F, -2.8939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.2F, -2.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(12, 70).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.383F, -6.9256F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(12, 70).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.383F, -6.9256F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(65, 16).mirror().addBox(-1.3F, -2.0008F, -1.6345F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2F, -6.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(65, 16).addBox(-0.7F, -2.0008F, -1.6345F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, -6.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(36, 68).addBox(1.6F, -0.1008F, 0.0655F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.2F, -6.0F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(58, 5).addBox(-1.0F, -1.9995F, -1.996F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.7F, -4.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(69, 44).addBox(1.0F, -0.9503F, 0.0349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4184F, -0.9359F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(57, 54).addBox(-2.0F, -0.95F, -0.0546F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.2184F, -2.8359F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 72).addBox(1.7F, 3.5295F, -2.8939F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(-1.0F, 1.0295F, -2.9939F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -2.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4503F, -0.3625F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(71, 68).addBox(0.92F, 0.0023F, -0.9852F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.4925F, -2.4182F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(71, 60).addBox(0.92F, -1.9723F, -0.9326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1F, 1.6936F, 0.25F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(26, 67).addBox(0.92F, -0.0613F, 0.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 2.7936F, -0.45F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(70, 7).addBox(0.92F, -1.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 2.3936F, -0.25F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(71, 35).addBox(0.92F, 0.0236F, -0.9733F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, -0.5611F, -1.0474F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(26, 28).addBox(0.92F, -1.5F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.0389F, -1.3474F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(41, 72).addBox(1.0F, 0.0123F, 0.351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 72).addBox(1.0F, 0.0123F, -0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 2.1814F, -6.4019F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(72, 39).addBox(0.43F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 3.0254F, -7.5723F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(51, 72).addBox(1.0F, -0.1F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(67, 30).addBox(1.0F, -1.1F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.6814F, -4.1019F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(31, 62).addBox(1.26F, -1.9F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 63).addBox(1.15F, -1.9F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 38).addBox(0.92F, -1.9F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.4075F, -2.1182F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 34).addBox(-2.0F, -1.1F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7F, 1.9F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(-0.8F, -0.2F, -9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 55).mirror().addBox(-1.3F, 0.3F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 56).mirror().addBox(-1.5F, 0.3F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 67).mirror().addBox(-1.1F, -0.2F, -8.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 22).mirror().addBox(-2.0F, -0.7F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 64).mirror().addBox(-2.0F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(51, 22).addBox(1.0F, -0.7F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 64).addBox(1.0F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(74, 55).addBox(0.8F, -0.2F, -9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 67).addBox(1.1F, -0.2F, -8.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(68, 56).addBox(0.5F, 0.3F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 40).addBox(-1.0F, 0.3F, -9.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 55).addBox(0.3F, 0.3F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.2F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(0.2F, -0.4F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 32).addBox(2.8F, -0.4F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.1852F, -4.2772F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(-0.53F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 48).addBox(2.53F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 2.4803F, -2.0911F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-1.0F, 0.0145F, -0.4558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(32, 48).addBox(2.0F, 0.0145F, -0.4558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.1F, -3.3F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(64, 68).mirror().addBox(-1.0F, -0.0373F, 0.0234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 68).addBox(2.0F, -0.0373F, 0.0234F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.5F, -4.7F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(63, 25).mirror().addBox(-1.0F, -0.9706F, -3.044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(63, 25).addBox(2.0F, -0.9706F, -3.044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 3.3F, -1.5F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(34, 63).mirror().addBox(-1.0F, -0.9241F, -0.3129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 63).addBox(2.0F, -0.9241F, -0.3129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.1F, -1.4F, 0.9338F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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