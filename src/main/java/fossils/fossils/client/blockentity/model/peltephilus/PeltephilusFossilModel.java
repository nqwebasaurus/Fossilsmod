package fossils.fossils.client.blockentity.model.peltephilus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PeltephilusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;
	private final ModelPart tail4;

	public PeltephilusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm2 = this.leftLeg3.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm2 = this.rightLeg3.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body = this.body3.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm5 = this.chest.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.rightArm5 = this.chest.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail9 = this.tail2.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail10 = this.tail3.getChild("tail10");
		this.tail4 = this.tail10.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.7258F, 11.2747F, -0.4168F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(106, 114).addBox(-0.004F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1488F, -6.3133F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -0.8827F, -9.8153F, 0.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2523F, 3.4156F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(109, 37).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0747F, -1.3825F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.8804F, -5.8015F, -0.5204F, 0.1555F, 0.264F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 44).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -5.8524F, -2.6179F, -0.3695F, -0.341F, -0.7123F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 47).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6398F, -4.0045F, -3.6212F, -0.1836F, -0.465F, -1.1781F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6658F, -1.5271F, -4.9664F, -0.0917F, -0.4896F, -1.3777F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-2.125F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.8504F, 2.0118F, -6.8879F, -0.084F, -0.2723F, -1.3983F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -3.7943F, 0.8075F, -0.4377F, -0.4009F, -0.6951F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 56).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6213F, -2.0253F, -0.3633F, -0.2226F, -0.5453F, -1.1592F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 47).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6474F, 0.3255F, -1.9193F, -0.1144F, -0.5747F, -1.3624F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.675F, -0.5F, -1.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7627F, 3.2721F, -3.8696F, -0.0985F, -0.2275F, -1.4025F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.6579F, 3.5633F, -0.5869F, -0.5132F, -0.6359F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(68, 31).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6027F, -0.1057F, 2.0904F, -0.3209F, -0.7007F, -1.0949F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 3).mirror().addBox(-2.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6533F, 1.9326F, 0.1561F, -0.1712F, -0.7434F, -1.3206F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.925F, -0.5F, -1.525F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.5547F, 4.3367F, -0.5231F, -0.1275F, 0.1642F, -1.4581F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(79, 77).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.2493F, 5.1362F, -0.9059F, -0.6668F, -0.4514F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(101, 30).mirror().addBox(-1.7F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4917F, 4.6989F, -1.1232F, 0.2448F, -0.4676F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(101, 114).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4722F, 0.4777F, 4.6911F, -1.0651F, -0.0211F, 0.0382F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(22, 80).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6213F, 0.9279F, 3.0869F, -0.399F, -0.692F, -1.1334F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(90, 27).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.2493F, 5.1362F, -0.7946F, -0.5223F, -0.6493F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(78, 86).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.3942F, 4.4146F, 2.5918F, -0.6891F, -1.1305F, -0.7894F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 103).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8804F, -5.8015F, -0.5204F, -0.1555F, -0.264F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(78, 86).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.3942F, 4.4146F, 2.5918F, -0.6891F, 1.1305F, 0.7894F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 80).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6213F, 0.9279F, 3.0869F, -0.399F, 0.692F, 1.1334F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 27).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5F, 0.2493F, 5.1362F, -0.7946F, 0.5223F, 0.6493F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(79, 77).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.2493F, 5.1362F, -0.9059F, 0.6668F, 0.4514F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 114).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4722F, 0.4777F, 4.6911F, -1.0651F, 0.0211F, -0.0382F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(101, 30).addBox(-0.3F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.4917F, 4.6989F, -1.1232F, -0.2448F, 0.4676F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(74, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6253F, 4.6514F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 69).addBox(-2.075F, -0.5F, -1.525F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.5547F, 4.3367F, -0.5231F, -0.1275F, -0.1642F, 1.4581F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(74, 3).addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6533F, 1.9326F, 0.1561F, -0.1712F, 0.7434F, 1.3206F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 31).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6027F, -0.1057F, 2.0904F, -0.3209F, 0.7007F, 1.0949F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 38).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.6579F, 3.5633F, -0.5869F, 0.5132F, 0.6359F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(45, 39).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6904F, 2.4753F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 48).addBox(-1.325F, -0.5F, -1.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.7627F, 3.2721F, -3.8696F, -0.0985F, 0.2275F, 1.4025F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 47).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6474F, 0.3255F, -1.9193F, -0.1144F, 0.5747F, 1.3624F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(45, 56).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6213F, -2.0253F, -0.3633F, -0.2226F, 0.5453F, 1.1592F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 54).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -3.7943F, 0.8075F, -0.4377F, 0.4009F, 0.6951F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(25, 6).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8981F, -0.8603F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(61, 0).addBox(0.125F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.8504F, 2.0118F, -6.8879F, -0.084F, 0.2723F, 1.3983F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6658F, -1.5271F, -4.9664F, -0.0917F, 0.4896F, 1.3777F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(15, 47).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6398F, -4.0045F, -3.6212F, -0.1836F, 0.465F, 1.1781F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(45, 44).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -5.8524F, -2.6179F, -0.3695F, 0.341F, 0.7123F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8068F, -4.3755F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2057F, 0.0747F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1121F, 2.2943F, -2.344F, 0.0666F, -0.2184F, -0.041F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(88, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.469F, 2.4332F, -1.6108F, -1.5637F, 0.2535F, 1.4418F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(37, 108).addBox(-1.075F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4026F, 3.73F, -1.9806F, -1.7033F, 0.2169F, 0.8593F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 108).addBox(0.025F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6707F, 2.8062F, -1.3012F, -1.5189F, 0.2484F, 1.622F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 83).addBox(0.5F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7792F, -1.4074F, -1.5279F, -0.03F, 0.6102F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(111, 4).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.7987F, -1.7546F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(99, 11).addBox(-1.5F, -0.5683F, -1.1249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 0.7009F, -1.5685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(103, 103).addBox(-1.5F, -1.5114F, -2.0769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.0F, 1.5008F, -0.6684F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(98, 99).addBox(-1.0F, -1.8F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2072F, -0.8869F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 88).addBox(-0.5F, -3.9486F, -0.4345F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 3.9327F, -1.944F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(93, 99).addBox(-0.5F, -0.5F, 0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.057F, -2.7331F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(103, 99).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8359F, -2.3011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(88, 99).addBox(-0.5F, -1.9F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.6496F, -3.3914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(42, 95).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 6.822F, -2.741F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(103, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 6.822F, -2.741F, 0.384F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2286F, 8.7678F, -2.3023F, 1.5524F, 0.6001F, 0.3525F));

		PartDefinition cube_r61 = leftLeg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(101, 92).addBox(-1.0F, -0.657F, -0.4353F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4535F, 0.7721F, 1.1141F, -0.5525F, -0.6868F, 2.2881F));

		PartDefinition cube_r62 = leftLeg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 44).addBox(-1.0958F, -3.19F, -0.6793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(35, 95).addBox(-1.4958F, -3.19F, -0.6793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -1.9153F, -0.4121F, 2.2646F));

		PartDefinition cube_r63 = leftLeg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(78, 111).addBox(-0.7319F, 1.3266F, 1.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -3.1013F, -0.8721F, 2.5223F));

		PartDefinition cube_r64 = leftLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(111, 74).addBox(-1.5756F, 4.3339F, -0.4604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6219F, 1.9552F, 0.8688F, -2.1495F, -0.6868F, 2.2881F));

		PartDefinition cube_r65 = leftLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(114, 92).addBox(-0.5F, -0.1348F, -0.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4535F, 0.7721F, 1.1141F, -1.975F, -0.6868F, 2.2881F));

		PartDefinition cube_r66 = leftLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(111, 66).addBox(-0.7319F, 1.9426F, -0.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.1152F, -0.8721F, 2.5223F));

		PartDefinition cube_r67 = leftLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(59, 111).addBox(-0.7319F, 2.4177F, -1.2389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -1.9407F, -0.8721F, 2.5223F));

		PartDefinition cube_r68 = leftLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(47, 111).addBox(-0.7319F, 1.7729F, 1.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(37, 111).addBox(-0.7319F, 1.7729F, 1.2254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -3.0315F, -0.8721F, 2.5223F));

		PartDefinition cube_r69 = leftLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(32, 111).addBox(-0.7319F, 2.2867F, 0.9428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.7261F, -0.8721F, 2.5223F));

		PartDefinition cube_r70 = leftLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(111, 26).addBox(-0.9019F, 1.201F, 1.9694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -0.1533F, -0.6962F, 2.3974F));

		PartDefinition cube_r71 = leftLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(111, 23).addBox(-0.9019F, -0.6608F, 2.1313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -0.8515F, -0.6962F, 2.3974F));

		PartDefinition cube_r72 = leftLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(100, 34).addBox(-0.5481F, -1.0862F, -0.0796F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.3739F, -0.8138F, 2.4247F));

		PartDefinition cube_r73 = leftLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(95, 34).addBox(-0.7189F, -1.1339F, -0.0796F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.4468F, -0.8721F, 2.5223F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(111, 86).addBox(-0.5969F, -1.4878F, 0.1396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.1263F, -0.673F, 2.3827F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(111, 7).addBox(-0.7671F, -1.492F, 0.1396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.191F, -0.782F, 2.4799F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(29, 104).addBox(-0.8079F, -2.8421F, 0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.0057F, -0.5013F, 2.2782F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(7, 104).addBox(-0.9019F, -2.8651F, 0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3353F, 2.2236F, -1.3671F, -2.0732F, -0.6962F, 2.3974F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(18, 89).addBox(-1.2755F, -0.3662F, -0.7291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0219F, 1.9552F, 0.8688F, -1.975F, -0.6868F, 2.2881F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5056F, 5.8111F, -3.8169F, -2.5096F, -0.3654F, 0.4207F));

		PartDefinition cube_r79 = leftLeg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 56).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftLeg3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.8397F, -0.008F, 0.0104F));

		PartDefinition cube_r80 = leftArm2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(87, 0).addBox(-0.95F, -0.4F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftArm3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(104, 21).addBox(-0.475F, -0.725F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9323F, -0.2069F, 0.3409F, -1.0946F, 0.0791F, 0.0372F));

		PartDefinition cube_r82 = leftArm3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(23, 89).addBox(-0.434F, -2.0859F, -0.4987F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4618F, -0.8404F, -1.0918F, 0.0002F, -0.0004F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1121F, 2.2943F, -2.344F, 0.0442F, 0.3284F, 0.0923F));

		PartDefinition cube_r83 = rightLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(88, 111).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.469F, 2.4332F, -1.6108F, -1.5637F, -0.2535F, -1.4418F));

		PartDefinition cube_r84 = rightLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(37, 108).mirror().addBox(0.075F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4026F, 3.73F, -1.9806F, -1.7033F, -0.2169F, -0.8593F));

		PartDefinition cube_r85 = rightLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(49, 108).mirror().addBox(-1.025F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6707F, 2.8062F, -1.3012F, -1.5189F, -0.2484F, -1.622F));

		PartDefinition cube_r86 = rightLeg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-1.5F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7792F, -1.4074F, -1.5279F, 0.03F, -0.6102F));

		PartDefinition cube_r87 = rightLeg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(111, 4).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7987F, -1.7546F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(99, 11).mirror().addBox(0.5F, -0.5683F, -1.1249F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7009F, -1.5685F, -2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(103, 103).mirror().addBox(0.5F, -1.5114F, -2.0769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5008F, -0.6684F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(98, 99).mirror().addBox(0.0F, -1.8F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2072F, -0.8869F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 88).mirror().addBox(-0.5F, -3.9486F, -0.4345F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9327F, -1.944F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(93, 99).mirror().addBox(-0.5F, -0.5F, 0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.057F, -2.7331F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(103, 99).mirror().addBox(-0.5F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8359F, -2.3011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(88, 99).mirror().addBox(-0.5F, -1.9F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6496F, -3.3914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(42, 95).mirror().addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.822F, -2.741F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(103, 68).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.822F, -2.741F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2286F, 8.7678F, -2.3023F, 1.5389F, -0.5772F, -0.2453F));

		PartDefinition cube_r97 = rightLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(101, 92).mirror().addBox(-1.0F, -0.657F, -0.4353F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4535F, 0.7721F, 1.1141F, -0.5525F, 0.6868F, -2.2881F));

		PartDefinition cube_r98 = rightLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(95, 44).mirror().addBox(0.0958F, -3.19F, -0.6793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(35, 95).mirror().addBox(0.4958F, -3.19F, -0.6793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -1.9153F, 0.4121F, -2.2646F));

		PartDefinition cube_r99 = rightLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(78, 111).mirror().addBox(-0.2681F, 1.3266F, 1.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -3.1013F, 0.8721F, -2.5223F));

		PartDefinition cube_r100 = rightLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(111, 74).mirror().addBox(0.5755F, 4.3339F, -0.4604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6219F, 1.9552F, 0.8688F, -2.1495F, 0.6868F, -2.2881F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(114, 92).mirror().addBox(-0.5F, -0.1348F, -0.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4535F, 0.7721F, 1.1141F, -1.975F, 0.6868F, -2.2881F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(111, 66).mirror().addBox(-0.2681F, 1.9426F, -0.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.1152F, 0.8721F, -2.5223F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(59, 111).mirror().addBox(-0.2681F, 2.4177F, -1.2389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -1.9407F, 0.8721F, -2.5223F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(47, 111).mirror().addBox(-0.2681F, 1.7729F, 1.0254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 111).mirror().addBox(-0.2681F, 1.7729F, 1.2254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -3.0315F, 0.8721F, -2.5223F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(32, 111).mirror().addBox(-0.2681F, 2.2867F, 0.9428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.7261F, 0.8721F, -2.5223F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(111, 26).mirror().addBox(-0.0981F, 1.201F, 1.9694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -0.1533F, 0.6962F, -2.3974F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(111, 23).mirror().addBox(-0.0981F, -0.6608F, 2.1313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -0.8515F, 0.6962F, -2.3974F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(100, 34).mirror().addBox(-0.4519F, -1.0862F, -0.0796F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.3739F, 0.8138F, -2.4247F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(95, 34).mirror().addBox(-0.2811F, -1.1339F, -0.0796F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.4468F, 0.8721F, -2.5223F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(111, 86).mirror().addBox(-0.4031F, -1.4878F, 0.1396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.1263F, 0.673F, -2.3827F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(111, 7).mirror().addBox(-0.2329F, -1.492F, 0.1396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.191F, 0.782F, -2.4799F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(29, 104).mirror().addBox(-0.1921F, -2.8421F, 0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.0057F, 0.5013F, -2.2782F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(7, 104).mirror().addBox(-0.0981F, -2.8651F, 0.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3353F, 2.2236F, -1.3671F, -2.0732F, 0.6962F, -2.3974F));

		PartDefinition cube_r114 = rightLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(18, 89).mirror().addBox(0.2755F, -0.3662F, -0.7291F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0219F, 1.9552F, 0.8688F, -1.975F, 0.6868F, -2.2881F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5056F, 5.8111F, -3.8169F, -2.4191F, 0.3071F, -0.4044F));

		PartDefinition cube_r115 = rightLeg3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(86, 56).mirror().addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightLeg3.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.7961F, 0.008F, -0.0104F));

		PartDefinition cube_r116 = rightArm2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-2.05F, -0.4F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightArm3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(104, 21).mirror().addBox(-0.525F, -0.725F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9323F, -0.2069F, 0.3409F, -1.0946F, -0.0791F, -0.0372F));

		PartDefinition cube_r118 = rightArm3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(23, 89).mirror().addBox(-1.566F, -2.0859F, -0.4987F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.4618F, -0.8404F, -1.0918F, -0.0002F, 0.0004F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.777F, 6.1211F, -2.5342F));

		PartDefinition cube_r119 = bone.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(46, 102).addBox(-0.7733F, -1.8468F, -1.219F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, -5.4278F, -0.2007F, 0.9177F, -0.0949F, 0.1223F));

		PartDefinition cube_r120 = bone.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 109).addBox(-0.7152F, -3.0039F, 1.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, 1.179F, 0.0272F, 0.2849F));

		PartDefinition cube_r121 = bone.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(108, 102).addBox(-0.7152F, 1.6002F, 2.9142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, 2.3571F, 0.0272F, 0.2849F));

		PartDefinition cube_r122 = bone.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(41, 99).addBox(-0.7152F, -1.5533F, 2.6278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, 2.008F, 0.0272F, 0.2849F));

		PartDefinition cube_r123 = bone.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(36, 99).addBox(-0.7152F, -2.0316F, 1.8391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, 1.8335F, 0.0272F, 0.2849F));

		PartDefinition cube_r124 = bone.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 94).addBox(-0.7152F, 1.6354F, -3.1879F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, -1.5262F, 0.0272F, 0.2849F));

		PartDefinition cube_r125 = bone.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(109, 20).addBox(-0.7152F, 2.3958F, -0.163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, -2.3553F, 0.0272F, 0.2849F));

		PartDefinition cube_r126 = bone.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(27, 108).addBox(-0.7152F, 0.8177F, 0.7711F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, -2.7916F, 0.0272F, 0.2849F));

		PartDefinition cube_r127 = bone.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(90, 73).addBox(-0.7152F, 0.0784F, -0.0098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.702F, -1.5528F, 5.6299F, 2.9243F, 0.0272F, 0.2849F));

		PartDefinition cube_r128 = bone.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(108, 91).addBox(-0.472F, -1.5127F, 0.7404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.702F, -3.0528F, 4.7299F, -2.1057F, -0.0147F, 0.154F));

		PartDefinition cube_r129 = bone.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(95, 108).addBox(-1.0199F, -1.9337F, -0.3993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, -2.0419F, 0.0521F, 0.294F));

		PartDefinition cube_r130 = bone.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(108, 99).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(61, 108).addBox(-0.5F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8662F, -1.7855F, 4.453F, -1.6694F, -0.0147F, 0.154F));

		PartDefinition cube_r131 = bone.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(31, 84).addBox(-0.9402F, 1.0657F, -1.232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, 0.5377F, 0.0118F, 0.2838F));

		PartDefinition cube_r132 = bone.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(90, 108).addBox(-0.9402F, -0.4875F, -1.9379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, 0.974F, 0.0118F, 0.2838F));

		PartDefinition cube_r133 = bone.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(85, 108).addBox(-0.9402F, -0.5075F, -2.0532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(108, 83).addBox(-0.9402F, -0.5075F, -2.3532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, 1.3667F, 0.0118F, 0.2838F));

		PartDefinition cube_r134 = bone.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(46, 99).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9102F, 0.1548F, 1.2824F, 2.3823F, -0.3315F, -0.0578F));

		PartDefinition cube_r135 = bone.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(80, 108).addBox(-0.9402F, -2.2167F, -0.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, 2.3266F, 0.0118F, 0.2838F));

		PartDefinition cube_r136 = bone.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(58, 102).addBox(-0.9402F, -1.4553F, 0.6701F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, -3.1275F, 0.0118F, 0.2838F));

		PartDefinition cube_r137 = bone.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(102, 44).addBox(-0.9402F, 0.8156F, 0.2003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, -2.473F, 0.0118F, 0.2838F));

		PartDefinition cube_r138 = bone.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(108, 60).addBox(-0.9402F, -0.4835F, -3.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4374F, -1.6244F, 2.5946F, -0.5793F, 0.0118F, 0.2838F));

		PartDefinition cube_r139 = bone.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(24, 102).addBox(-1.8922F, 1.0855F, -0.1752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.413F, -5.4869F, -1.4297F, 0.4919F, -0.0552F, 0.1446F));

		PartDefinition cube_r140 = bone.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(109, 79).addBox(-0.5714F, -3.6793F, 0.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.07F, -6.2301F, -1.8969F, 0.7814F, 0.3236F, 0.7867F));

		PartDefinition cube_r141 = bone.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(73, 109).addBox(-0.6624F, -3.6793F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.07F, -6.2301F, -1.8969F, 0.7351F, -0.0936F, 0.3969F));

		PartDefinition cube_r142 = bone.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(109, 71).addBox(-0.6624F, -2.9058F, -2.3277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.07F, -6.2301F, -1.8969F, -0.0939F, -0.0936F, 0.3969F));

		PartDefinition cube_r143 = bone.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(53, 99).addBox(-0.3237F, -3.5612F, -0.8136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.07F, -6.2301F, -1.8969F, 0.513F, -0.1151F, 0.435F));

		PartDefinition cube_r144 = bone.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(70, 102).addBox(-0.6624F, -2.8963F, -0.8136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.07F, -6.2301F, -1.8969F, 0.5169F, -0.0936F, 0.3969F));

		PartDefinition cube_r145 = bone.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(101, 87).addBox(-0.1856F, -0.6787F, -0.5136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.07F, -6.2301F, -1.8969F, 0.8418F, 0.0524F, 0.3703F));

		PartDefinition cube_r146 = bone.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(108, 0).addBox(-0.4965F, -1.1441F, -0.5136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.07F, -6.2301F, -1.8969F, 0.8369F, 0.1174F, 0.3118F));

		PartDefinition cube_r147 = bone.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(107, 107).addBox(-0.2306F, -1.6256F, -0.8094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, -5.4278F, -0.2007F, 1.0058F, 0.2461F, 0.1803F));

		PartDefinition cube_r148 = bone.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(109, 55).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6343F, -4.7822F, 0.0275F, -1.0052F, -0.5036F, -3.1352F));

		PartDefinition cube_r149 = bone.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(109, 40).addBox(-0.225F, -1.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1422F, -4.7772F, 1.3255F, 0.9684F, -0.5946F, 0.6713F));

		PartDefinition cube_r150 = bone.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(35, 89).addBox(-0.225F, -1.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1422F, -4.7772F, 1.3255F, 1.081F, -0.0674F, 0.3395F));

		PartDefinition cube_r151 = bone.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(10, 110).addBox(-0.6F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.471F, -4.1606F, 1.9191F, -0.3427F, -0.0822F, 0.9231F));

		PartDefinition cube_r152 = bone.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(109, 94).addBox(-1.0F, 0.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 99).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9351F, -4.9112F, 3.107F, -0.6179F, -0.9545F, 1.4194F));

		PartDefinition cube_r153 = bone.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(40, 24).addBox(-5.7821F, -0.5F, -1.5905F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.277F, -2.8325F, 5.204F, -1.447F, -0.9545F, 1.4194F));

		PartDefinition cube_r154 = bone.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(32, 108).addBox(-0.65F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.282F, -5.9074F, -0.9181F, -0.509F, -0.4379F, 1.0892F));

		PartDefinition cube_r155 = bone.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(78, 90).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0279F, -7.1612F, -0.3084F, -1.0395F, -1.0334F, 1.8276F));

		PartDefinition cube_r156 = bone.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(33, 80).addBox(-2.825F, -0.1F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1927F, -6.4935F, 0.6729F, -1.7812F, -1.0334F, 1.8276F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.777F, 6.1211F, -2.5342F));

		PartDefinition cube_r157 = bone4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(46, 102).mirror().addBox(-0.2267F, -1.8468F, -1.219F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.192F, -5.4278F, -0.2007F, 0.9177F, 0.0949F, -0.1223F));

		PartDefinition cube_r158 = bone4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.2848F, -3.0039F, 1.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, 1.179F, -0.0272F, -0.2849F));

		PartDefinition cube_r159 = bone4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(108, 102).mirror().addBox(-0.2848F, 1.6002F, 2.9142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, 2.3571F, -0.0272F, -0.2849F));

		PartDefinition cube_r160 = bone4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(41, 99).mirror().addBox(-0.2848F, -1.5533F, 2.6278F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, 2.008F, -0.0272F, -0.2849F));

		PartDefinition cube_r161 = bone4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(36, 99).mirror().addBox(-0.2848F, -2.0316F, 1.8391F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, 1.8335F, -0.0272F, -0.2849F));

		PartDefinition cube_r162 = bone4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(-0.2848F, 1.6354F, -3.1879F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, -1.5262F, -0.0272F, -0.2849F));

		PartDefinition cube_r163 = bone4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(109, 20).mirror().addBox(-0.2848F, 2.3958F, -0.163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, -2.3553F, -0.0272F, -0.2849F));

		PartDefinition cube_r164 = bone4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(27, 108).mirror().addBox(-0.2848F, 0.8177F, 0.7711F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, -2.7916F, -0.0272F, -0.2849F));

		PartDefinition cube_r165 = bone4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(90, 73).mirror().addBox(-0.2848F, 0.0784F, -0.0098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.702F, -1.5528F, 5.6299F, 2.9243F, -0.0272F, -0.2849F));

		PartDefinition cube_r166 = bone4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(-0.528F, -1.5127F, 0.7404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.702F, -3.0528F, 4.7299F, -2.1057F, 0.0147F, -0.154F));

		PartDefinition cube_r167 = bone4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(95, 108).mirror().addBox(0.0199F, -1.9337F, -0.3993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, -2.0419F, -0.0521F, -0.294F));

		PartDefinition cube_r168 = bone4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(108, 99).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(61, 108).mirror().addBox(-0.5F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8662F, -1.7855F, 4.453F, -1.6694F, 0.0147F, -0.154F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(31, 84).mirror().addBox(-0.0598F, 1.0657F, -1.232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, 0.5377F, -0.0118F, -0.2838F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(90, 108).mirror().addBox(-0.0598F, -0.4875F, -1.9379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, 0.974F, -0.0118F, -0.2838F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(-0.0598F, -0.5075F, -2.0532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(108, 83).mirror().addBox(-0.0598F, -0.5075F, -2.3532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, 1.3667F, -0.0118F, -0.2838F));

		PartDefinition cube_r172 = bone4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(46, 99).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9102F, 0.1548F, 1.2824F, 2.3823F, 0.3315F, 0.0578F));

		PartDefinition cube_r173 = bone4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-0.0598F, -2.2167F, -0.9397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, 2.3266F, -0.0118F, -0.2838F));

		PartDefinition cube_r174 = bone4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(58, 102).mirror().addBox(-0.0598F, -1.4553F, 0.6701F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, -3.1275F, -0.0118F, -0.2838F));

		PartDefinition cube_r175 = bone4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(102, 44).mirror().addBox(-0.0598F, 0.8156F, 0.2003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, -2.473F, -0.0118F, -0.2838F));

		PartDefinition cube_r176 = bone4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(108, 60).mirror().addBox(-0.0598F, -0.4835F, -3.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4374F, -1.6244F, 2.5946F, -0.5793F, -0.0118F, -0.2838F));

		PartDefinition cube_r177 = bone4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(24, 102).mirror().addBox(0.8922F, 1.0855F, -0.1752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.413F, -5.4869F, -1.4297F, 0.4919F, 0.0552F, -0.1446F));

		PartDefinition cube_r178 = bone4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(109, 79).mirror().addBox(-0.4286F, -3.6793F, 0.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -6.2301F, -1.8969F, 0.7814F, -0.3236F, -0.7867F));

		PartDefinition cube_r179 = bone4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(73, 109).mirror().addBox(-0.3376F, -3.6793F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -6.2301F, -1.8969F, 0.7351F, 0.0936F, -0.3969F));

		PartDefinition cube_r180 = bone4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(109, 71).mirror().addBox(-0.3376F, -2.9058F, -2.3277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -6.2301F, -1.8969F, -0.0939F, 0.0936F, -0.3969F));

		PartDefinition cube_r181 = bone4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(53, 99).mirror().addBox(-0.6763F, -3.5612F, -0.8136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -6.2301F, -1.8969F, 0.513F, 0.1151F, -0.435F));

		PartDefinition cube_r182 = bone4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(70, 102).mirror().addBox(-0.3376F, -2.8963F, -0.8136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -6.2301F, -1.8969F, 0.5169F, 0.0936F, -0.3969F));

		PartDefinition cube_r183 = bone4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(101, 87).mirror().addBox(-0.8144F, -0.6787F, -0.5136F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -6.2301F, -1.8969F, 0.8418F, -0.0524F, -0.3703F));

		PartDefinition cube_r184 = bone4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.5035F, -1.1441F, -0.5136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -6.2301F, -1.8969F, 0.8369F, -0.1174F, -0.3118F));

		PartDefinition cube_r185 = bone4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(107, 107).mirror().addBox(-0.7694F, -1.6256F, -0.8094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.192F, -5.4278F, -0.2007F, 1.0058F, -0.2461F, -0.1803F));

		PartDefinition cube_r186 = bone4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(109, 55).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6343F, -4.7822F, 0.0275F, -1.0052F, 0.5036F, 3.1352F));

		PartDefinition cube_r187 = bone4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(109, 40).mirror().addBox(-0.775F, -1.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1422F, -4.7772F, 1.3255F, 0.9684F, 0.5946F, -0.6713F));

		PartDefinition cube_r188 = bone4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.775F, -1.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1422F, -4.7772F, 1.3255F, 1.081F, 0.0674F, -0.3395F));

		PartDefinition cube_r189 = bone4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(10, 110).mirror().addBox(-0.4F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.471F, -4.1606F, 1.9191F, -0.3427F, 0.0822F, -0.9231F));

		PartDefinition cube_r190 = bone4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(109, 94).mirror().addBox(0.0F, 0.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 99).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9351F, -4.9112F, 3.107F, -0.6179F, 0.9545F, -1.4194F));

		PartDefinition cube_r191 = bone4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(40, 24).mirror().addBox(-0.2179F, -0.5F, -1.5905F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.277F, -2.8325F, 5.204F, -1.447F, 0.9545F, -1.4194F));

		PartDefinition cube_r192 = bone4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(32, 108).mirror().addBox(-0.35F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.282F, -5.9074F, -0.9181F, -0.509F, 0.4379F, -1.0892F));

		PartDefinition cube_r193 = bone4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(78, 90).mirror().addBox(0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0279F, -7.1612F, -0.3084F, -1.0395F, 1.0334F, -1.8276F));

		PartDefinition cube_r194 = bone4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(-0.175F, -0.1F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1927F, -6.4935F, 0.6729F, -1.7812F, 1.0334F, -1.8276F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5544F, -6.3999F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(18, 116).addBox(-0.5F, -1.17F, -0.2269F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7961F, -1.6252F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(37, 70).addBox(-0.5F, -1.07F, 0.0731F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4115F, -5.6215F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(41, 59).addBox(-0.5F, -1.17F, 0.073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6947F, -3.7543F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(102, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3009F, -5.0549F, -0.3012F, -0.1154F, 0.3559F));

		PartDefinition cube_r199 = body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(102, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6829F, -3.1528F, -0.326F, -0.1552F, 0.3715F));

		PartDefinition cube_r200 = body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(102, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0649F, -1.2506F, -0.3F, -0.1863F, 0.4227F));

		PartDefinition cube_r201 = body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(46, 79).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -6.5165F, -3.7903F, -0.2296F, -0.2163F, -0.7429F));

		PartDefinition cube_r202 = body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(57, 79).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.658F, -4.5345F, -4.4343F, -0.1133F, -0.2936F, -1.1962F));

		PartDefinition cube_r203 = body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(-7.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7086F, -2.171F, -6.2537F, -0.0569F, -0.1345F, -1.3887F));

		PartDefinition cube_r204 = body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.3519F, 4.3924F, -6.164F, -0.0584F, -0.2652F, -1.381F));

		PartDefinition cube_r205 = body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(68, 79).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -5.8033F, -1.9191F, -0.2258F, -0.2203F, -0.7603F));

		PartDefinition cube_r206 = body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6213F, -3.7858F, -2.5746F, -0.1107F, -0.2946F, -1.2053F));

		PartDefinition cube_r207 = body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(38, 28).mirror().addBox(-7.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6474F, -1.4138F, -4.3968F, -0.055F, -0.2221F, -1.3925F));

		PartDefinition cube_r208 = body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(65, 64).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -4.8725F, 0.4102F, -0.2585F, -0.2502F, -0.7527F));

		PartDefinition cube_r209 = body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(13, 66).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.6213F, -2.8855F, -0.3327F, -0.1272F, -0.3353F, -1.2002F));

		PartDefinition cube_r210 = body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(19, 28).mirror().addBox(-6.0F, 0.0F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6474F, -0.2449F, -1.32F, -0.0648F, -0.3521F, -1.3847F));

		PartDefinition cube_r211 = body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(9, 85).mirror().addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.2316F, 5.5555F, -3.4887F, -0.0624F, -0.2215F, -1.3934F));

		PartDefinition cube_r212 = body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(102, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3009F, -5.0549F, -0.3012F, 0.1154F, -0.3559F));

		PartDefinition cube_r213 = body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(102, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6829F, -3.1528F, -0.326F, 0.1552F, -0.3715F));

		PartDefinition cube_r214 = body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(102, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0649F, -1.2506F, -0.3F, 0.1863F, -0.4227F));

		PartDefinition cube_r215 = body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(9, 85).addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.2316F, 5.5555F, -3.4887F, -0.0624F, 0.2215F, 1.3934F));

		PartDefinition cube_r216 = body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(19, 28).addBox(0.0F, 0.0F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6474F, -0.2449F, -1.32F, -0.0648F, 0.3521F, 1.3847F));

		PartDefinition cube_r217 = body4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(13, 66).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.6213F, -2.8855F, -0.3327F, -0.1272F, 0.3353F, 1.2002F));

		PartDefinition cube_r218 = body4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 64).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, -4.8725F, 0.4102F, -0.2585F, 0.2502F, 0.7527F));

		PartDefinition cube_r219 = body4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(44, 5).addBox(-2.5F, -0.1F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.3041F, -1.0298F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(38, 28).addBox(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6474F, -1.4138F, -4.3968F, -0.055F, 0.2221F, 1.3925F));

		PartDefinition cube_r221 = body4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(79, 73).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.6213F, -3.7858F, -2.5746F, -0.1107F, 0.2946F, 1.2053F));

		PartDefinition cube_r222 = body4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(68, 79).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, -5.8033F, -1.9191F, -0.2258F, 0.2203F, 0.7603F));

		PartDefinition cube_r223 = body4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(60, 60).addBox(-2.5F, -0.4F, 1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(60, 56).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.0409F, -3.9448F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r224 = body4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 99).addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.3519F, 4.3924F, -6.164F, -0.0584F, 0.2652F, 1.381F));

		PartDefinition cube_r225 = body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(38, 16).addBox(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.7086F, -2.171F, -6.2537F, -0.0569F, 0.1345F, 1.3887F));

		PartDefinition cube_r226 = body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(57, 79).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.658F, -4.5345F, -4.4343F, -0.1133F, 0.2936F, 1.1962F));

		PartDefinition cube_r227 = body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(46, 79).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, -6.5165F, -3.7903F, -0.2296F, 0.2163F, 0.7429F));

		PartDefinition cube_r228 = body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.07F, 0.0731F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.4115F, -5.6215F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.1172F, -5.5588F, -0.1206F, 0.0887F, 0.011F));

		PartDefinition cube_r229 = body3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(18, 85).addBox(-0.5F, -1.1406F, -0.0547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.7591F, -3.9136F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(112, 114).addBox(-0.5F, -1.1061F, -0.0558F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -0.5869F, -1.9051F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r231 = body3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(109, 114).addBox(-0.5F, -1.3061F, -0.0558F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4233F, -1.0943F, -5.8627F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r232 = body3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(92, 32).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1233F, -0.083F, -5.6533F, 0.2319F, 0.0462F, -0.4675F));

		PartDefinition cube_r233 = body3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(-6.7432F, -2.9834F, -0.2852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1233F, -0.083F, -5.6533F, 0.1178F, 0.1736F, -1.4258F));

		PartDefinition cube_r234 = body3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1233F, -0.083F, -5.6533F, 0.1907F, 0.1237F, -0.943F));

		PartDefinition cube_r235 = body3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3233F, 0.142F, -3.6533F, 0.2699F, 0.0678F, -0.3955F));

		PartDefinition cube_r236 = body3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(94, 5).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3233F, 0.142F, -3.6533F, 0.2148F, 0.1603F, -0.8698F));

		PartDefinition cube_r237 = body3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(49, 93).mirror().addBox(-6.7432F, -2.9834F, -0.2852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3233F, 0.142F, -3.6533F, 0.1219F, 0.217F, -1.3552F));

		PartDefinition cube_r238 = body3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4483F, 0.442F, -1.6533F, 0.3461F, 0.1108F, -0.3363F));

		PartDefinition cube_r239 = body3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(94, 3).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4483F, 0.442F, -1.6533F, 0.2638F, 0.2331F, -0.8078F));

		PartDefinition cube_r240 = body3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(74, 8).mirror().addBox(-5.7432F, -2.9834F, -0.2853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4483F, 0.442F, -1.6533F, 0.1305F, 0.3039F, -1.3007F));

		PartDefinition cube_r241 = body3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(30, 96).mirror().addBox(-0.8F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, -0.7814F, -3.4556F, -0.118F, 0.0315F, 0.2599F));

		PartDefinition cube_r242 = body3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(17, 96).mirror().addBox(-1.1F, 0.1F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8233F, -0.5376F, -1.4705F, -0.118F, 0.0315F, 0.2599F));

		PartDefinition cube_r243 = body3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(68, 75).mirror().addBox(-3.025F, 0.075F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4233F, -5.2656F, -4.9658F, -0.0277F, -0.0212F, -0.6542F));

		PartDefinition cube_r244 = body3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-3.15F, 0.075F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8034F, -3.5102F, -7.0284F, -0.0134F, 0.0986F, -1.1796F));

		PartDefinition cube_r245 = body3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(15, 35).mirror().addBox(-7.15F, 0.05F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9416F, -0.7503F, -6.7329F, -0.0312F, 0.0945F, -1.3637F));

		PartDefinition cube_r246 = body3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(97, 95).mirror().addBox(-0.3F, 0.05F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-8.3745F, 6.0696F, -6.0721F, -0.0315F, -0.1671F, -1.3555F));

		PartDefinition cube_r247 = body3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(24, 76).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4233F, -5.1123F, -4.2208F, 0.0401F, 0.0336F, -0.6975F));

		PartDefinition cube_r248 = body3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7215F, -3.1866F, -4.1199F, 0.0188F, 0.0489F, -1.2038F));

		PartDefinition cube_r249 = body3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(34, 35).mirror().addBox(-7.0F, 0.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7966F, -0.3896F, -3.9733F, 0.01F, 0.0514F, -1.3786F));

		PartDefinition cube_r250 = body3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(99, 7).mirror().addBox(-0.1F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-8.1322F, 6.5247F, -4.6124F, 0.0102F, -0.2104F, -1.3812F));

		PartDefinition cube_r251 = body3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(11, 77).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4233F, -5.1029F, -2.5245F, 0.0386F, 0.0354F, -0.7411F));

		PartDefinition cube_r252 = body3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6352F, -3.0789F, -2.4184F, 0.0188F, 0.0489F, -1.2038F));

		PartDefinition cube_r253 = body3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(-7.0F, 0.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7103F, -0.282F, -2.2718F, 0.01F, 0.0514F, -1.3786F));

		PartDefinition cube_r254 = body3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(17, 98).mirror().addBox(-0.3F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-8.0459F, 6.6323F, -2.9109F, 0.0101F, -0.1668F, -1.3807F));

		PartDefinition cube_r255 = body3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4233F, -4.9231F, -0.5446F, -0.058F, -0.053F, -0.7402F));

		PartDefinition cube_r256 = body3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6352F, -2.9026F, -0.7036F, -0.0269F, -0.0738F, -1.2207F));

		PartDefinition cube_r257 = body3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(38, 12).mirror().addBox(-7.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6612F, -0.1707F, -1.9217F, -0.015F, 0.0102F, -1.3795F));

		PartDefinition cube_r258 = body3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(24, 98).mirror().addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.4844F, 6.7893F, -0.8582F, -0.0153F, -0.208F, -1.3762F));

		PartDefinition cube_r259 = body3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(74, 8).addBox(3.7432F, -2.9834F, -0.2853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6017F, 0.442F, -1.6533F, 0.1305F, -0.3039F, 1.3007F));

		PartDefinition cube_r260 = body3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(94, 3).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6017F, 0.442F, -1.6533F, 0.2638F, -0.2331F, 0.8078F));

		PartDefinition cube_r261 = body3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(92, 93).addBox(-1.0643F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6017F, 0.442F, -1.6533F, 0.3461F, -0.1108F, 0.3363F));

		PartDefinition cube_r262 = body3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(49, 93).addBox(3.7432F, -2.9834F, -0.2852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4767F, 0.142F, -3.6533F, 0.1219F, -0.217F, 1.3552F));

		PartDefinition cube_r263 = body3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(94, 5).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4767F, 0.142F, -3.6533F, 0.2148F, -0.1603F, 0.8698F));

		PartDefinition cube_r264 = body3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(40, 93).addBox(-1.0643F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4767F, 0.142F, -3.6533F, 0.2699F, -0.0678F, 0.3955F));

		PartDefinition cube_r265 = body3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(92, 32).addBox(-1.0643F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2767F, -0.083F, -5.6533F, 0.2319F, -0.0462F, 0.4675F));

		PartDefinition cube_r266 = body3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(92, 91).addBox(3.7432F, -2.9834F, -0.2852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2767F, -0.083F, -5.6533F, 0.1178F, -0.1736F, 1.4258F));

		PartDefinition cube_r267 = body3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(5, 93).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2767F, -0.083F, -5.6533F, 0.1907F, -0.1237F, 0.943F));

		PartDefinition cube_r268 = body3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(30, 96).addBox(-0.2F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -0.7814F, -3.4556F, -0.118F, -0.0315F, -0.2599F));

		PartDefinition cube_r269 = body3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(17, 96).addBox(0.1F, 0.1F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0233F, -0.5376F, -1.4705F, -0.118F, -0.0315F, -0.2599F));

		PartDefinition cube_r270 = body3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(24, 98).addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6377F, 6.7893F, -0.8582F, -0.0153F, 0.208F, 1.3762F));

		PartDefinition cube_r271 = body3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(38, 12).addBox(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8146F, -0.1707F, -1.9217F, -0.015F, -0.0102F, 1.3795F));

		PartDefinition cube_r272 = body3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7885F, -2.9026F, -0.7036F, -0.0269F, 0.0738F, 1.2207F));

		PartDefinition cube_r273 = body3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(78, 65).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5767F, -4.9231F, -0.5446F, -0.058F, 0.053F, 0.7402F));

		PartDefinition cube_r274 = body3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(60, 52).addBox(-2.5F, -0.7F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -4.3038F, -1.5964F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r275 = body3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(17, 98).addBox(-0.7F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.1993F, 6.6323F, -2.9109F, 0.0101F, 0.1668F, 1.3807F));

		PartDefinition cube_r276 = body3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(40, 20).addBox(0.0F, 0.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8636F, -0.282F, -2.2718F, 0.01F, -0.0514F, 1.3786F));

		PartDefinition cube_r277 = body3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(78, 61).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7885F, -3.0789F, -2.4184F, 0.0188F, -0.0489F, 1.2038F));

		PartDefinition cube_r278 = body3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(11, 77).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5767F, -5.1029F, -2.5245F, 0.0386F, -0.0354F, 0.7411F));

		PartDefinition cube_r279 = body3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(60, 48).addBox(-2.5F, -0.625F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -4.4787F, -2.4918F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r280 = body3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(99, 7).addBox(-0.9F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.2856F, 6.5247F, -4.6124F, 0.0102F, 0.2104F, 1.3812F));

		PartDefinition cube_r281 = body3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(34, 35).addBox(0.0F, 0.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9499F, -0.3896F, -3.9733F, 0.01F, -0.0514F, 1.3786F));

		PartDefinition cube_r282 = body3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(76, 69).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8748F, -3.1866F, -4.1199F, 0.0188F, -0.0489F, 1.2038F));

		PartDefinition cube_r283 = body3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(24, 76).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5767F, -5.1123F, -4.2208F, 0.0401F, -0.0336F, 0.6975F));

		PartDefinition cube_r284 = body3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(60, 44).addBox(-2.5F, -0.575F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -4.5381F, -4.1908F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r285 = body3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(97, 95).addBox(-0.7F, 0.05F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.5278F, 6.0696F, -6.0721F, -0.0315F, 0.1671F, 1.3555F));

		PartDefinition cube_r286 = body3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(15, 35).addBox(0.15F, 0.05F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.095F, -0.7503F, -6.7329F, -0.0312F, -0.0945F, 1.3637F));

		PartDefinition cube_r287 = body3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(75, 41).addBox(0.15F, 0.075F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9567F, -3.5102F, -7.0284F, -0.0134F, -0.0986F, 1.1796F));

		PartDefinition cube_r288 = body3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(68, 75).addBox(0.025F, 0.075F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5767F, -5.2656F, -4.9658F, -0.0277F, 0.0212F, 0.6542F));

		PartDefinition cube_r289 = body3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 60).addBox(-2.5F, -0.425F, -1.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -4.7833F, -5.483F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r290 = body3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, 0.0939F, -0.0558F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body = body3.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.8873F, -6.9564F, -0.2613F, 0.0467F, 0.0056F));

		PartDefinition cube_r291 = body.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(14, 90).addBox(-0.5F, -2.3015F, -0.2561F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7005F, -2.6669F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r292 = body.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(40, 84).addBox(-0.5F, -1.7765F, 0.0189F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0747F, -1.0334F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r293 = body.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(68, 36).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0044F, -2.2969F, 0.3845F, 0.132F, -0.6109F));

		PartDefinition cube_r294 = body.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(-5.7432F, -2.9834F, -0.2852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0044F, -2.2969F, 0.1349F, 0.3474F, -1.5785F));

		PartDefinition cube_r295 = body.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(92, 16).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0044F, -2.2969F, 0.2889F, 0.2693F, -1.0808F));

		PartDefinition cube_r296 = body.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.6044F, -0.4969F, 0.3146F, 0.3054F, -1.0038F));

		PartDefinition cube_r297 = body.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(72, 22).mirror().addBox(-6.7432F, -2.9834F, -0.2853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.6044F, -0.4969F, 0.1395F, 0.3908F, -1.507F));

		PartDefinition cube_r298 = body.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.6044F, -0.4969F, 0.4231F, 0.1531F, -0.5356F));

		PartDefinition cube_r299 = body.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(45, 50).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -3.8236F, -2.6596F, 0.2811F, 0.2097F, -0.6247F));

		PartDefinition cube_r300 = body.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8801F, -2.1075F, -2.035F, 0.1384F, 0.3215F, -1.1556F));

		PartDefinition cube_r301 = body.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(30, 53).mirror().addBox(-6.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(53, 32).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0281F, 0.497F, -1.087F, 0.0786F, 0.3405F, -1.3391F));

		PartDefinition cube_r302 = body.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(75, 36).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(101, 18).mirror().addBox(0.0F, 0.0F, 2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.3267F, 6.6856F, -0.9629F, 0.0742F, -0.0511F, -1.3692F));

		PartDefinition cube_r303 = body.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(92, 20).addBox(-1.0643F, -0.0311F, -0.4395F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.6044F, -0.4969F, 0.4231F, -0.1531F, 0.5356F));

		PartDefinition cube_r304 = body.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(72, 22).addBox(3.7432F, -2.9834F, -0.2853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.6044F, -0.4969F, 0.1395F, -0.3908F, 1.507F));

		PartDefinition cube_r305 = body.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(92, 18).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.6044F, -0.4969F, 0.3146F, -0.3054F, 1.0038F));

		PartDefinition cube_r306 = body.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(68, 36).addBox(-0.0643F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0044F, -2.2969F, 0.3845F, -0.132F, 0.6109F));

		PartDefinition cube_r307 = body.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(46, 73).addBox(3.7432F, -2.9834F, -0.2852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0044F, -2.2969F, 0.1349F, -0.3474F, 1.5785F));

		PartDefinition cube_r308 = body.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(92, 16).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0044F, -2.2969F, 0.2889F, -0.2693F, 1.0808F));

		PartDefinition cube_r309 = body.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(53, 32).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(30, 53).addBox(3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.0281F, 0.497F, -1.087F, 0.0786F, -0.3405F, 1.3391F));

		PartDefinition cube_r310 = body.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(101, 18).addBox(-2.0F, 0.0F, 2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 36).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.3267F, 6.6856F, -0.9629F, 0.0742F, 0.0511F, 1.3692F));

		PartDefinition cube_r311 = body.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(15, 53).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8801F, -2.1075F, -2.035F, 0.1384F, -0.3215F, 1.1556F));

		PartDefinition cube_r312 = body.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(45, 50).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -3.8236F, -2.6596F, 0.2811F, -0.2097F, 0.6247F));

		PartDefinition cube_r313 = body.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(21, 22).addBox(-2.5F, -4.2401F, -4.3382F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(83, 12).addBox(-0.5F, -0.0401F, -4.1382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6389F, 0.9878F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8127F, -2.8434F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(108, 66).addBox(-0.5F, -2.6654F, -0.087F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5016F, -1.704F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(44, 83).addBox(-0.5F, -3.74F, 0.6223F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.6696F, -2.3445F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r316 = chest.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-1.8F, 0.0F, -1.1F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4725F, 5.5308F, 2.84F, -0.0705F, 0.1947F, -0.0043F));

		PartDefinition cube_r317 = chest.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(90, 30).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3848F, 5.0554F, -0.0985F, -0.1752F, 0.0412F, 0.1345F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(44, 10).mirror().addBox(-2.4F, 0.0F, -0.7F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7076F, 5.3294F, 6.3429F, 0.1848F, 0.4667F, 0.1968F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(36, 33).mirror().addBox(-6.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5353F, 5.6872F, 6.5243F, 0.2133F, 0.4893F, 0.3109F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(15, 33).mirror().addBox(-7.9F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4741F, 5.6509F, 6.6089F, 0.3419F, 0.6319F, 0.551F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(86, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.251F, 5.7238F, 4.4158F, 0.0407F, 0.4078F, 0.0555F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(90, 78).mirror().addBox(-4.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8916F, -1.0535F, 0.2889F, 0.2693F, -1.2466F));

		PartDefinition cube_r323 = chest.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(52, 62).mirror().addBox(-1.9357F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8916F, -1.0535F, 0.3845F, 0.132F, -0.7767F));

		PartDefinition cube_r324 = chest.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -3.085F, -3.1241F, 0.468F, 0.3332F, -0.5744F));

		PartDefinition cube_r325 = chest.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(52, 64).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8801F, -1.5448F, -2.1429F, 0.2391F, 0.5194F, -1.1143F));

		PartDefinition cube_r326 = chest.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -2.2791F, -4.3892F, 0.504F, -0.4893F, -0.9918F));

		PartDefinition cube_r327 = chest.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(96, 114).mirror().addBox(0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0089F)).mirror(false)
				.texOffs(5, 90).mirror().addBox(-1.0F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.622F, -0.7932F, -5.1194F, 0.9855F, -1.034F, -1.6521F));

		PartDefinition cube_r328 = chest.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(81, 27).mirror().addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.8104F, 0.0181F, -4.6956F, 2.0327F, -1.034F, -1.6521F));

		PartDefinition cube_r329 = chest.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(28, 65).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0281F, 0.7928F, -0.6537F, 0.137F, 0.5522F, -1.3138F));

		PartDefinition cube_r330 = chest.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(90, 22).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.9556F, 2.4269F, -3.3223F, 1.8582F, -1.034F, -1.6521F));

		PartDefinition cube_r331 = chest.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(31, 99).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9141F, 2.9366F, -4.1816F, 1.7605F, -0.6942F, -1.5256F));

		PartDefinition cube_r332 = chest.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(75, 57).mirror().addBox(0.0F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.6024F, 4.9601F, -1.8511F, -2.1555F, -1.305F, 2.3066F));

		PartDefinition cube_r333 = chest.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-1.8F, 0.0F, -3.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.6774F, 2.4571F, 2.1851F, 0.1278F, 0.4224F, -1.3333F));

		PartDefinition cube_r334 = chest.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(86, 42).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.251F, 5.7238F, 4.4158F, 0.0407F, -0.4078F, -0.0555F));

		PartDefinition cube_r335 = chest.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(15, 33).addBox(-1.1F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4741F, 5.6509F, 6.6089F, 0.3419F, -0.6319F, -0.551F));

		PartDefinition cube_r336 = chest.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(36, 33).addBox(-1.0F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5353F, 5.6872F, 6.5243F, 0.2133F, -0.4893F, -0.3109F));

		PartDefinition cube_r337 = chest.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(44, 10).addBox(-2.6F, 0.0F, -0.7F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7076F, 5.3294F, 6.3429F, 0.1848F, -0.4667F, -0.1968F));

		PartDefinition cube_r338 = chest.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(90, 30).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3848F, 5.0554F, -0.0985F, -0.1752F, -0.0412F, -0.1345F));

		PartDefinition cube_r339 = chest.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(86, 40).addBox(-2.2F, 0.0F, -1.1F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4725F, 5.5308F, 2.84F, -0.0705F, -0.1947F, 0.0043F));

		PartDefinition cube_r340 = chest.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(57, 10).addBox(-0.5F, -0.9137F, -0.0083F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8637F, 1.8851F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r341 = chest.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(90, 78).addBox(1.7012F, -0.9198F, -0.3931F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8916F, -1.0535F, 0.2889F, -0.2693F, 1.2466F));

		PartDefinition cube_r342 = chest.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(52, 62).addBox(-0.0643F, -0.0311F, -0.4395F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8916F, -1.0535F, 0.3845F, -0.132F, 0.7767F));

		PartDefinition cube_r343 = chest.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(0, 74).addBox(-0.2F, 0.0F, -3.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.6774F, 2.4571F, 2.1851F, 0.1278F, -0.4224F, 1.3333F));

		PartDefinition cube_r344 = chest.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(28, 65).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0281F, 0.7928F, -0.6537F, 0.137F, -0.5522F, 1.3138F));

		PartDefinition cube_r345 = chest.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(52, 64).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8801F, -1.5448F, -2.1429F, 0.2391F, -0.5194F, 1.1143F));

		PartDefinition cube_r346 = chest.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(31, 99).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9141F, 2.9366F, -4.1816F, 1.7605F, 0.6942F, 1.5256F));

		PartDefinition cube_r347 = chest.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(75, 57).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.6024F, 4.9601F, -1.8511F, -2.1555F, 1.305F, -2.3066F));

		PartDefinition cube_r348 = chest.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 22).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.9556F, 2.4269F, -3.3223F, 1.8582F, 1.034F, 1.6521F));

		PartDefinition cube_r349 = chest.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(81, 27).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.8104F, 0.0181F, -4.6956F, 2.0327F, 1.034F, 1.6521F));

		PartDefinition cube_r350 = chest.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(5, 90).addBox(-2.0F, 0.0F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(96, 114).addBox(-1.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0089F)), PartPose.offsetAndRotation(3.622F, -0.7932F, -5.1194F, 0.9855F, 1.034F, 1.6521F));

		PartDefinition cube_r351 = chest.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(87, 70).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -2.2791F, -4.3892F, 0.504F, 0.4893F, 0.9918F));

		PartDefinition cube_r352 = chest.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, -3.085F, -3.1241F, 0.468F, -0.3332F, 0.5744F));

		PartDefinition cube_r353 = chest.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(44, 0).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.6634F, -2.8555F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r354 = chest.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(83, 17).addBox(-0.5F, -0.9F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2679F, 1.2698F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm5 = chest.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9487F, 3.3952F, 0.1863F, -1.0126F, 0.3692F, -0.3465F));

		PartDefinition cube_r355 = leftArm5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(101, 84).addBox(-1.0F, -0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.02F, 0.413F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r356 = leftArm5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -0.65F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.6F, 0.7F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r357 = leftArm5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(54, 110).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.6522F, 7.5255F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r358 = leftArm5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(42, 110).addBox(-0.5F, -0.05F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 32).addBox(-0.5F, -0.95F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.3633F, 6.8409F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r359 = leftArm5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.5211F, 6.4701F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r360 = leftArm5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(94, 86).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.3474F, 5.4852F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r361 = leftArm5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(20, 110).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9419F, 6.0645F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r362 = leftArm5.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(15, 110).addBox(-0.5F, -0.775F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6454F, -0.0873F, 3.5032F, 0.3054F, 0.0F, -0.5672F));

		PartDefinition cube_r363 = leftArm5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(79, 81).addBox(-0.5F, -0.7484F, -2.6016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0016F, 2.7516F, 0.1745F, 0.0F, -0.5672F));

		PartDefinition cube_r364 = leftArm5.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(85, 3).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create().texOffs(70, 99).addBox(-0.5F, -0.2965F, -0.3472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 64).addBox(0.0F, -1.4965F, 0.0528F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.007F, -0.6075F, 8.5177F, -0.3997F, 0.1861F, 0.3909F));

		PartDefinition cube_r365 = leftArm6.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(61, 88).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.33F, 3.1496F, -0.4132F, -0.1128F, -0.2618F, 0.0826F));

		PartDefinition cube_r366 = leftArm6.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(83, 111).addBox(-0.5F, -0.8F, -2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(66, 110).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r367 = leftArm6.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(65, 99).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r368 = leftArm6.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(103, 60).addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 1.5035F, 0.5528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r369 = leftArm6.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(19, 102).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5035F, 0.5528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create().texOffs(12, 95).addBox(-0.9856F, -0.1059F, 0.6624F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 81).addBox(-0.9856F, 0.0925F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2965F, 5.4193F, -0.08F, 0.8691F, 0.4012F, 0.9684F));

		PartDefinition cube_r370 = leftArm7.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(7, 95).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r371 = leftArm7.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(83, 99).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4856F, 2.5925F, -0.5522F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm5 = chest.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9487F, 3.3952F, 0.1863F, -0.969F, -0.3692F, 0.3465F));

		PartDefinition cube_r372 = rightArm5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(101, 84).mirror().addBox(-1.0F, -0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.02F, 0.413F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r373 = rightArm5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-1.0F, -0.65F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.7F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r374 = rightArm5.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(54, 110).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6522F, 7.5255F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r375 = rightArm5.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(42, 110).mirror().addBox(-0.5F, -0.05F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 32).mirror().addBox(-0.5F, -0.95F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3633F, 6.8409F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r376 = rightArm5.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5211F, 6.4701F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r377 = rightArm5.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(94, 86).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3474F, 5.4852F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r378 = rightArm5.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(20, 110).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9419F, 6.0645F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r379 = rightArm5.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(15, 110).mirror().addBox(-0.5F, -0.775F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6454F, -0.0873F, 3.5032F, 0.3054F, 0.0F, 0.5672F));

		PartDefinition cube_r380 = rightArm5.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(-0.5F, -0.7484F, -2.6016F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0016F, 2.7516F, 0.1745F, 0.0F, 0.5672F));

		PartDefinition cube_r381 = rightArm5.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 1.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create().texOffs(70, 99).mirror().addBox(-1.5F, -0.2965F, -0.3472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 64).mirror().addBox(-1.0F, -1.4965F, 0.0528F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.007F, -0.6075F, 8.5177F, -0.3199F, -0.2215F, -0.3587F));

		PartDefinition cube_r382 = rightArm6.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(61, 88).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.33F, 3.1496F, -0.4132F, -0.1128F, 0.2618F, -0.0826F));

		PartDefinition cube_r383 = rightArm6.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(83, 111).mirror().addBox(-0.5F, -0.8F, -2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(66, 110).mirror().addBox(-0.5F, 0.0F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0035F, 1.7528F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r384 = rightArm6.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-0.5F, -1.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.4731F, 0.2055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r385 = rightArm6.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(103, 60).mirror().addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5035F, 0.5528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r386 = rightArm6.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(19, 102).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5035F, 0.5528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create().texOffs(12, 95).mirror().addBox(-0.0144F, -0.1059F, 0.6624F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(88, 81).mirror().addBox(-0.0144F, 0.0925F, -1.0522F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2965F, 5.4193F, -0.08F, 0.8103F, -0.5313F, -0.838F));

		PartDefinition cube_r387 = rightArm7.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4856F, 2.4987F, 0.267F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r388 = rightArm7.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(83, 99).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4856F, 2.5925F, -0.5522F, 0.2182F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9136F, -2.278F, -0.2801F, -0.0478F, 0.0864F));

		PartDefinition cube_r389 = chest2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(15, 116).addBox(-0.5F, -0.4644F, -0.0794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 61).addBox(-0.5F, -0.4644F, 1.9206F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4576F, -3.0098F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r390 = chest2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(53, 83).addBox(-0.5F, -0.9F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.5F, 5.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9676F, -2.902F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r391 = neck3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(103, 4).addBox(0.0F, -0.8722F, 0.0299F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2214F, -1.9019F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r392 = neck3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(85, 91).addBox(-0.5F, -0.1F, 2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4214F, -4.4019F, 0.4014F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0142F, -2.0956F, -0.1565F, 0.0136F, 0.0862F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(98, 111).addBox(-1.0F, 0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(93, 111).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.6554F, -2.7081F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, -4.0F, -0.425F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 6.9078F, -1.9196F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(70, 24).addBox(-1.0F, -1.8F, -2.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.3069F, -3.9357F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(99, 76).addBox(-1.0F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.8986F, -4.0347F, 2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(101, 15).addBox(-1.0F, -1.25F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 48).addBox(-1.0F, -1.4F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 8.9278F, -3.2292F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(7, 101).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 9.4934F, -3.4295F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(96, 0).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.0F, 9.4986F, -4.0295F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(37, 73).addBox(-0.5F, -0.0323F, 0.4439F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(92, 8).addBox(-0.5F, 1.9677F, 0.3439F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.485F, 2.2245F, -3.192F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(41, 69).addBox(-3.5F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, -0.1451F, -1.6995F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(75, 49).addBox(-3.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.996F, -0.6168F, -0.816F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(81, 8).addBox(-3.5F, -0.425F, -0.85F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 0.045F, 0.2359F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(86, 44).addBox(-1.5F, -0.9F, 0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.7078F, -0.6758F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(86, 114).addBox(-0.5F, 0.1F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 114).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0091F, 1.767F, -2.7866F, -0.2318F, 0.0F, 0.0F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(107, 43).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0091F, 0.6775F, -2.2836F, -0.4326F, 0.0F, 0.0F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(49, 95).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 2.5356F, -2.995F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(57, 75).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.491F, 1.5959F, -2.653F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(11, 81).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.491F, 0.6896F, -2.2303F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(61, 6).addBox(-2.5F, 0.125F, 0.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.509F, -0.4741F, -1.9632F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(46, 75).addBox(-2.5F, 0.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.501F, 1.7186F, 1.2404F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(75, 45).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.501F, 2.7002F, 1.0495F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(3.4479F, 7.5262F, 1.6254F));

		PartDefinition cube_r413 = leftSygomaticarch.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(34, 104).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9469F, -6.3014F, -0.4632F, -1.4136F, 0.0431F, 0.0068F));

		PartDefinition cube_r414 = leftSygomaticarch.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(108, 29).addBox(-0.75F, -1.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(106, 76).addBox(-0.75F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-1.1465F, -4.6276F, -0.1252F, 1.9643F, -0.1281F, -0.1851F));

		PartDefinition cube_r415 = leftSygomaticarch.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(112, 105).addBox(-0.75F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2576F, -5.0475F, 0.1224F, 1.048F, -0.1281F, -0.1851F));

		PartDefinition cube_r416 = leftSygomaticarch.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(114, 19).addBox(0.0F, -0.45F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 111).addBox(0.0F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-3.4479F, 1.4016F, -4.8546F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r417 = leftSygomaticarch.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(87, 86).addBox(-0.5F, -1.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-1.5466F, -5.5195F, -0.3033F, 0.0881F, -0.1281F, -0.1851F));

		PartDefinition cube_r418 = leftSygomaticarch.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(81, 22).addBox(0.3665F, -0.6161F, 0.2681F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 0.9171F, -0.1281F, -0.1851F));

		PartDefinition cube_r419 = leftSygomaticarch.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(56, 95).addBox(0.3665F, -0.6869F, 1.3404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F))
				.texOffs(25, 112).addBox(0.3665F, -0.6869F, 0.8404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 1.048F, -0.1281F, -0.1851F));

		PartDefinition cube_r420 = leftSygomaticarch.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(95, 52).addBox(0.3665F, -0.8653F, 0.2918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 0.8735F, -0.1281F, -0.1851F));

		PartDefinition cube_r421 = leftSygomaticarch.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(5, 112).addBox(0.1597F, -0.6017F, 0.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 1.1956F, 0.0F, 0.0349F));

		PartDefinition cube_r422 = leftSygomaticarch.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 112).addBox(0.1597F, -0.7222F, -0.0256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 1.021F, 0.0F, 0.0349F));

		PartDefinition cube_r423 = leftSygomaticarch.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(108, 111).addBox(0.1597F, -0.6529F, -0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(112, 43).addBox(0.1597F, 0.1471F, -0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(103, 111).addBox(0.1597F, -0.3529F, -0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, -0.1134F, 0.0F, 0.0349F));

		PartDefinition cube_r424 = leftSygomaticarch.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(104, 95).addBox(-1.3994F, 0.2871F, -2.0628F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9621F, -4.8466F, -2.5858F, -0.0341F, 0.0538F, 0.4784F));

		PartDefinition cube_r425 = leftSygomaticarch.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(63, 104).addBox(-1.0F, 0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9329F, -3.2511F, -4.2016F, -0.1108F, 0.0419F, 0.2149F));

		PartDefinition cube_r426 = leftSygomaticarch.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(92, 104).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.0628F, -2.6691F, -4.268F, -0.1176F, -0.0139F, -0.2619F));

		PartDefinition cube_r427 = leftSygomaticarch.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(87, 104).addBox(-1.0F, 0.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9329F, -3.2511F, -4.2016F, 0.1073F, 0.0419F, 0.2149F));

		PartDefinition cube_r428 = leftSygomaticarch.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(114, 38).addBox(-0.8273F, -0.0813F, -0.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(114, 35).addBox(-0.8273F, -0.6813F, -0.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.8044F, -0.6482F, -5.2384F, -0.1577F, 0.0306F, 0.0367F));

		PartDefinition cube_r429 = leftSygomaticarch.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(114, 55).addBox(-0.4113F, -1.2758F, -1.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5183F, -4.05F, -3.9082F, -2.4254F, 0.3381F, 0.2078F));

		PartDefinition cube_r430 = leftSygomaticarch.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(106, 25).addBox(-0.4113F, -1.5402F, 0.2685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5183F, -4.05F, -3.9082F, -1.3782F, 0.3381F, 0.2078F));

		PartDefinition cube_r431 = leftSygomaticarch.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(108, 16).addBox(-0.2301F, -2.6221F, -0.7392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5183F, -4.05F, -3.9082F, -0.1938F, 0.3074F, 0.042F));

		PartDefinition cube_r432 = leftSygomaticarch.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(108, 12).addBox(-0.2301F, -2.6004F, -0.181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(114, 69).addBox(-0.2301F, -3.7004F, 0.419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(57, 114).addBox(-0.2301F, -3.2004F, 0.419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(5, 108).addBox(-0.2301F, -2.6004F, 0.419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5183F, -4.05F, -3.9082F, -0.0193F, 0.3074F, 0.042F));

		PartDefinition cube_r433 = leftSygomaticarch.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(81, 114).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(114, 77).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0521F, -6.6916F, -3.6821F, -0.4992F, 0.3074F, 0.042F));

		PartDefinition cube_r434 = leftSygomaticarch.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(102, 107).addBox(-0.725F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 87).addBox(-0.525F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.8051F, -2.7072F, -4.6167F, -0.0273F, -0.0928F, 0.0684F));

		PartDefinition cube_r435 = leftSygomaticarch.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(68, 106).addBox(0.0F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.8051F, -2.7072F, -4.6167F, -0.0392F, -0.0885F, 0.1998F));

		PartDefinition cube_r436 = leftSygomaticarch.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(107, 51).addBox(-0.4F, -1.725F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.1766F, -2.8841F, -4.6429F, -0.0748F, -0.103F, 0.025F));

		PartDefinition cube_r437 = leftSygomaticarch.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(107, 47).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(56, 106).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6344F, -3.5871F, -4.5347F, -0.0915F, -0.0885F, 0.1998F));

		PartDefinition cube_r438 = leftSygomaticarch.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(97, 72).addBox(-1.2F, -1.15F, -0.325F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1655F, -5.0603F, -4.5257F, -0.2144F, -0.0961F, 0.1125F));

		PartDefinition cube_r439 = leftSygomaticarch.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(97, 40).addBox(-2.2F, -0.9F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0521F, -6.6916F, -3.6821F, -0.4326F, -0.0961F, 0.1125F));

		PartDefinition cube_r440 = leftSygomaticarch.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(76, 114).addBox(-0.5F, -0.2F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8313F, -7.2061F, -3.0554F, -0.761F, 0.3074F, 0.042F));

		PartDefinition cube_r441 = leftSygomaticarch.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(89, 65).addBox(-0.4113F, -1.3367F, -0.803F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(44, 106).addBox(-0.4113F, -0.5367F, -0.803F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5183F, -4.05F, -3.9082F, -0.2001F, 0.3381F, 0.2078F));

		PartDefinition cube_r442 = leftSygomaticarch.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(22, 106).addBox(-0.4113F, -0.4488F, 0.0691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5183F, -4.05F, -3.9082F, -0.8546F, 0.3381F, 0.2078F));

		PartDefinition cube_r443 = leftSygomaticarch.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(17, 106).addBox(-0.3159F, -0.2259F, -0.9918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8419F, -2.9987F, -3.9029F, 0.0511F, 0.3353F, 0.4389F));

		PartDefinition cube_r444 = leftSygomaticarch.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(35, 114).addBox(-0.3434F, -0.0747F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 114).addBox(-0.3434F, -0.6747F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.8044F, -0.6482F, -5.2384F, -0.1639F, 0.2966F, 0.1688F));

		PartDefinition cube_r445 = leftSygomaticarch.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(47, 114).addBox(-0.3739F, -0.3575F, -0.2231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.8044F, -0.6482F, -5.2384F, 1.8747F, -0.2696F, 0.2504F));

		PartDefinition cube_r446 = leftSygomaticarch.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(12, 106).addBox(-0.3739F, -1.5891F, -0.3139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.8044F, -0.6482F, -5.2384F, 1.2202F, -0.2696F, 0.2504F));

		PartDefinition cube_r447 = leftSygomaticarch.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(106, 8).addBox(-0.3739F, -1.448F, -0.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.8044F, -0.6482F, -5.2384F, 0.8275F, -0.2696F, 0.2504F));

		PartDefinition cube_r448 = leftSygomaticarch.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(104, 72).addBox(-1.0F, -0.15F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(82, 104).addBox(-1.0F, -0.15F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.4176F, -1.1756F, -4.9413F, -0.2707F, 0.014F, 0.1139F));

		PartDefinition cube_r449 = leftSygomaticarch.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(30, 89).addBox(-1.025F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9479F, -3.5231F, -2.2002F, -0.4061F, 0.059F, 0.1362F));

		PartDefinition cube_r450 = leftSygomaticarch.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(95, 56).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.3028F, 1.1969F, -3.6363F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r451 = leftSygomaticarch.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(63, 95).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.0711F, 1.0365F, -3.5334F, -0.0147F, 0.0094F, 0.5672F));

		PartDefinition cube_r452 = leftSygomaticarch.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(70, 95).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.8864F, 0.3024F, -3.5956F, -0.0174F, 0.0015F, 0.0873F));

		PartDefinition cube_r453 = leftSygomaticarch.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(95, 80).addBox(-0.3F, 0.2F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.9088F, -1.0947F, -3.2212F, -0.0174F, 0.0015F, 0.0873F));

		PartDefinition cube_r454 = leftSygomaticarch.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(83, 95).addBox(-0.3F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(90, 95).addBox(-0.3F, -1.2F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.9088F, -1.0947F, -3.2212F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r455 = leftSygomaticarch.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(77, 100).addBox(-1.0F, -1.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1462F, -2.8233F, -3.0497F, -0.6482F, -0.8627F, 0.712F));

		PartDefinition cube_r456 = leftSygomaticarch.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(51, 104).addBox(1.119F, -2.8118F, -1.2416F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 2.4582F, 0.7154F, 0.81F));

		PartDefinition cube_r457 = leftSygomaticarch.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(104, 39).addBox(1.119F, -1.7996F, -1.702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 1.6728F, 0.7154F, 0.81F));

		PartDefinition cube_r458 = leftSygomaticarch.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(39, 104).addBox(1.119F, -2.1737F, -1.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 1.9346F, 0.7154F, 0.81F));

		PartDefinition cube_r459 = leftSygomaticarch.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(71, 112).addBox(0.8195F, 0.4025F, -1.5961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, 0.5966F, 0.4913F, 0.6135F));

		PartDefinition cube_r460 = leftSygomaticarch.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(112, 52).addBox(0.6728F, 0.443F, 0.242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, -0.8465F, 0.4125F, 0.5055F));

		PartDefinition cube_r461 = leftSygomaticarch.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(96, 64).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5276F, -4.7377F, -2.67F, -1.6694F, -0.0822F, -0.9378F));

		PartDefinition cube_r462 = leftSygomaticarch.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(96, 68).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.433F, -5.6041F, -1.5563F, -1.8286F, 1.0721F, -0.1635F));

		PartDefinition cube_r463 = leftSygomaticarch.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(89, 60).addBox(-1.0F, -2.0F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5777F, -4.5647F, -3.6984F, -1.6931F, 0.0386F, 0.0593F));

		PartDefinition cube_r464 = leftSygomaticarch.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(96, 60).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.9479F, -4.5047F, -2.0336F, -1.0359F, -0.8299F, 0.8942F));

		PartDefinition cube_r465 = leftSygomaticarch.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(97, 104).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4389F, -6.4139F, -2.9494F, -0.3841F, 0.0386F, 0.0593F));

		PartDefinition cube_r466 = leftSygomaticarch.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(112, 49).addBox(0.4791F, 0.3298F, 0.1511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, -0.7942F, 0.2545F, 0.3488F));

		PartDefinition cube_r467 = leftSygomaticarch.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(112, 46).addBox(0.2615F, 0.4638F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, -0.329F, 0.0425F, 0.1587F));

		PartDefinition cube_r468 = leftSygomaticarch.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(102, 48).addBox(0.1597F, -1.2711F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-1.752F, -3.0928F, -2.0524F, -0.4189F, 0.0F, 0.0349F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-3.4479F, 7.5262F, 1.6254F));

		PartDefinition cube_r469 = rightSygomaticarch.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(34, 104).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9469F, -6.3014F, -0.4632F, -1.4136F, -0.0431F, -0.0068F));

		PartDefinition cube_r470 = rightSygomaticarch.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(108, 29).mirror().addBox(-0.25F, -1.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(106, 76).mirror().addBox(-0.25F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(1.1465F, -4.6276F, -0.1252F, 1.9643F, 0.1281F, 0.1851F));

		PartDefinition cube_r471 = rightSygomaticarch.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(112, 105).mirror().addBox(-0.25F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.2576F, -5.0475F, 0.1224F, 1.048F, 0.1281F, 0.1851F));

		PartDefinition cube_r472 = rightSygomaticarch.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(114, 19).mirror().addBox(-1.0F, -0.45F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 111).mirror().addBox(-1.0F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(3.4479F, 1.4016F, -4.8546F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightSygomaticarch.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(87, 86).mirror().addBox(-0.5F, -1.2F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(1.5466F, -5.5195F, -0.3033F, 0.0881F, 0.1281F, 0.1851F));

		PartDefinition cube_r474 = rightSygomaticarch.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-1.3665F, -0.6161F, 0.2681F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 0.9171F, 0.1281F, 0.1851F));

		PartDefinition cube_r475 = rightSygomaticarch.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(56, 95).mirror().addBox(-1.3665F, -0.6869F, 1.3404F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(25, 112).mirror().addBox(-1.3665F, -0.6869F, 0.8404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 1.048F, 0.1281F, 0.1851F));

		PartDefinition cube_r476 = rightSygomaticarch.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(95, 52).mirror().addBox(-1.3665F, -0.8653F, 0.2918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 0.8735F, 0.1281F, 0.1851F));

		PartDefinition cube_r477 = rightSygomaticarch.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(-1.1597F, -0.6017F, 0.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 1.1956F, 0.0F, -0.0349F));

		PartDefinition cube_r478 = rightSygomaticarch.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-1.1597F, -0.7222F, -0.0256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 1.021F, 0.0F, -0.0349F));

		PartDefinition cube_r479 = rightSygomaticarch.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(108, 111).mirror().addBox(-1.1597F, -0.6529F, -0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(112, 43).mirror().addBox(-1.1597F, 0.1471F, -0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(103, 111).mirror().addBox(-1.1597F, -0.3529F, -0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, -0.1134F, 0.0F, -0.0349F));

		PartDefinition cube_r480 = rightSygomaticarch.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(104, 95).mirror().addBox(0.3994F, 0.2871F, -2.0628F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9621F, -4.8466F, -2.5858F, -0.0341F, -0.0538F, -0.4784F));

		PartDefinition cube_r481 = rightSygomaticarch.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(63, 104).mirror().addBox(0.0F, 0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9329F, -3.2511F, -4.2016F, -0.1108F, -0.0419F, -0.2149F));

		PartDefinition cube_r482 = rightSygomaticarch.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(92, 104).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.0628F, -2.6691F, -4.268F, -0.1176F, 0.0139F, 0.2619F));

		PartDefinition cube_r483 = rightSygomaticarch.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(87, 104).mirror().addBox(0.0F, 0.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9329F, -3.2511F, -4.2016F, 0.1073F, -0.0419F, -0.2149F));

		PartDefinition cube_r484 = rightSygomaticarch.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(114, 38).mirror().addBox(-0.1727F, -0.0813F, -0.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(114, 35).mirror().addBox(-0.1727F, -0.6813F, -0.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.8044F, -0.6482F, -5.2384F, -0.1577F, -0.0306F, -0.0367F));

		PartDefinition cube_r485 = rightSygomaticarch.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(114, 55).mirror().addBox(-0.5887F, -1.2758F, -1.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5183F, -4.05F, -3.9082F, -2.4254F, -0.3381F, -0.2078F));

		PartDefinition cube_r486 = rightSygomaticarch.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(106, 25).mirror().addBox(-0.5887F, -1.5402F, 0.2685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5183F, -4.05F, -3.9082F, -1.3782F, -0.3381F, -0.2078F));

		PartDefinition cube_r487 = rightSygomaticarch.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(108, 16).mirror().addBox(-0.7699F, -2.6221F, -0.7392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5183F, -4.05F, -3.9082F, -0.1938F, -0.3074F, -0.042F));

		PartDefinition cube_r488 = rightSygomaticarch.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(108, 12).mirror().addBox(-0.7699F, -2.6004F, -0.181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(114, 69).mirror().addBox(-0.7699F, -3.7004F, 0.419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(57, 114).mirror().addBox(-0.7699F, -3.2004F, 0.419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(5, 108).mirror().addBox(-0.7699F, -2.6004F, 0.419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5183F, -4.05F, -3.9082F, -0.0193F, -0.3074F, -0.042F));

		PartDefinition cube_r489 = rightSygomaticarch.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(81, 114).mirror().addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(114, 77).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0521F, -6.6916F, -3.6821F, -0.4992F, -0.3074F, -0.042F));

		PartDefinition cube_r490 = rightSygomaticarch.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(102, 107).mirror().addBox(-0.275F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 87).mirror().addBox(-0.475F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.8051F, -2.7072F, -4.6167F, -0.0273F, 0.0928F, -0.0684F));

		PartDefinition cube_r491 = rightSygomaticarch.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(68, 106).mirror().addBox(-1.0F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.8051F, -2.7072F, -4.6167F, -0.0392F, 0.0885F, -0.1998F));

		PartDefinition cube_r492 = rightSygomaticarch.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(107, 51).mirror().addBox(-0.6F, -1.725F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.1766F, -2.8841F, -4.6429F, -0.0748F, 0.103F, -0.025F));

		PartDefinition cube_r493 = rightSygomaticarch.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(107, 47).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(56, 106).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.6344F, -3.5871F, -4.5347F, -0.0915F, 0.0885F, -0.1998F));

		PartDefinition cube_r494 = rightSygomaticarch.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(97, 72).mirror().addBox(-0.8F, -1.15F, -0.325F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1655F, -5.0603F, -4.5257F, -0.2144F, 0.0961F, -0.1125F));

		PartDefinition cube_r495 = rightSygomaticarch.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(97, 40).mirror().addBox(0.2F, -0.9F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0521F, -6.6916F, -3.6821F, -0.4326F, 0.0961F, -0.1125F));

		PartDefinition cube_r496 = rightSygomaticarch.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(76, 114).mirror().addBox(-0.5F, -0.2F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8313F, -7.2061F, -3.0554F, -0.761F, -0.3074F, -0.042F));

		PartDefinition cube_r497 = rightSygomaticarch.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(89, 65).mirror().addBox(-0.5887F, -1.3367F, -0.803F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(44, 106).mirror().addBox(-0.5887F, -0.5367F, -0.803F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5183F, -4.05F, -3.9082F, -0.2001F, -0.3381F, -0.2078F));

		PartDefinition cube_r498 = rightSygomaticarch.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(22, 106).mirror().addBox(-0.5887F, -0.4488F, 0.0691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5183F, -4.05F, -3.9082F, -0.8546F, -0.3381F, -0.2078F));

		PartDefinition cube_r499 = rightSygomaticarch.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(17, 106).mirror().addBox(-0.6841F, -0.2259F, -0.9918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8419F, -2.9987F, -3.9029F, 0.0511F, -0.3353F, -0.4389F));

		PartDefinition cube_r500 = rightSygomaticarch.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(35, 114).mirror().addBox(-0.6566F, -0.0747F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 114).mirror().addBox(-0.6566F, -0.6747F, -0.1055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.8044F, -0.6482F, -5.2384F, -0.1639F, -0.2966F, -0.1688F));

		PartDefinition cube_r501 = rightSygomaticarch.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(47, 114).mirror().addBox(-0.6261F, -0.3575F, -0.2231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.8044F, -0.6482F, -5.2384F, 1.8747F, 0.2696F, -0.2504F));

		PartDefinition cube_r502 = rightSygomaticarch.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(12, 106).mirror().addBox(-0.6261F, -1.5891F, -0.3139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.8044F, -0.6482F, -5.2384F, 1.2202F, 0.2696F, -0.2504F));

		PartDefinition cube_r503 = rightSygomaticarch.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(106, 8).mirror().addBox(-0.6261F, -1.448F, -0.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.8044F, -0.6482F, -5.2384F, 0.8275F, 0.2696F, -0.2504F));

		PartDefinition cube_r504 = rightSygomaticarch.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(104, 72).mirror().addBox(0.0F, -0.15F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(82, 104).mirror().addBox(0.0F, -0.15F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.4176F, -1.1756F, -4.9413F, -0.2707F, -0.014F, -0.1139F));

		PartDefinition cube_r505 = rightSygomaticarch.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(0.025F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -3.5231F, -2.2002F, -0.4061F, -0.059F, -0.1362F));

		PartDefinition cube_r506 = rightSygomaticarch.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(95, 56).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(3.3028F, 1.1969F, -3.6363F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r507 = rightSygomaticarch.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(63, 95).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(3.0711F, 1.0365F, -3.5334F, -0.0147F, -0.0094F, -0.5672F));

		PartDefinition cube_r508 = rightSygomaticarch.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(70, 95).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.8864F, 0.3024F, -3.5956F, -0.0174F, -0.0015F, -0.0873F));

		PartDefinition cube_r509 = rightSygomaticarch.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-0.7F, 0.2F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.9088F, -1.0947F, -3.2212F, -0.0174F, -0.0015F, -0.0873F));

		PartDefinition cube_r510 = rightSygomaticarch.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(-0.7F, -0.5F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(90, 95).mirror().addBox(-0.7F, -1.2F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.9088F, -1.0947F, -3.2212F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r511 = rightSygomaticarch.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(77, 100).mirror().addBox(0.0F, -1.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1462F, -2.8233F, -3.0497F, -0.6482F, 0.8627F, -0.712F));

		PartDefinition cube_r512 = rightSygomaticarch.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(51, 104).mirror().addBox(-2.119F, -2.8118F, -1.2416F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 2.4582F, -0.7154F, -0.81F));

		PartDefinition cube_r513 = rightSygomaticarch.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(104, 39).mirror().addBox(-2.119F, -1.7996F, -1.702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 1.6728F, -0.7154F, -0.81F));

		PartDefinition cube_r514 = rightSygomaticarch.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(39, 104).mirror().addBox(-2.119F, -2.1737F, -1.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 1.9346F, -0.7154F, -0.81F));

		PartDefinition cube_r515 = rightSygomaticarch.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(71, 112).mirror().addBox(-1.8195F, 0.4025F, -1.5961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, 0.5966F, -0.4913F, -0.6135F));

		PartDefinition cube_r516 = rightSygomaticarch.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(112, 52).mirror().addBox(-1.6728F, 0.443F, 0.242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, -0.8465F, -0.4125F, -0.5055F));

		PartDefinition cube_r517 = rightSygomaticarch.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5276F, -4.7377F, -2.67F, -1.6694F, 0.0822F, 0.9378F));

		PartDefinition cube_r518 = rightSygomaticarch.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(96, 68).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.433F, -5.6041F, -1.5563F, -1.8286F, -1.0721F, 0.1635F));

		PartDefinition cube_r519 = rightSygomaticarch.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(89, 60).mirror().addBox(0.0F, -2.0F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5777F, -4.5647F, -3.6984F, -1.6931F, -0.0386F, -0.0593F));

		PartDefinition cube_r520 = rightSygomaticarch.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(96, 60).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.9479F, -4.5047F, -2.0336F, -1.0359F, 0.8299F, -0.8942F));

		PartDefinition cube_r521 = rightSygomaticarch.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(97, 104).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4389F, -6.4139F, -2.9494F, -0.3841F, -0.0386F, -0.0593F));

		PartDefinition cube_r522 = rightSygomaticarch.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(112, 49).mirror().addBox(-1.4791F, 0.3298F, 0.1511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, -0.7942F, -0.2545F, -0.3488F));

		PartDefinition cube_r523 = rightSygomaticarch.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(112, 46).mirror().addBox(-1.2615F, 0.4638F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, -0.329F, -0.0425F, -0.1587F));

		PartDefinition cube_r524 = rightSygomaticarch.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(102, 48).mirror().addBox(-1.1597F, -1.2711F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(1.752F, -3.0928F, -2.0524F, -0.4189F, 0.0F, -0.0349F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 3.2807F, 0.682F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(99, 26).mirror().addBox(-0.3F, -0.2696F, -0.8426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4892F, 0.4205F, -0.5367F, 0.0F, -0.0873F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(108, 63).mirror().addBox(-0.3F, -0.8935F, -0.7905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4892F, 0.4205F, 0.1178F, 0.0F, -0.0873F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.195F, -1.805F, -0.805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.7216F, 1.4469F, 0.9738F, 0.685F, 0.0F, -0.0873F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(112, 108).mirror().addBox(-0.195F, -0.205F, -0.205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7965F, 0.5908F, -0.5031F, -0.5803F, 0.0F, -0.0873F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(113, 0).mirror().addBox(-0.195F, -0.805F, -0.205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.7528F, 1.0906F, -0.8321F, -1.933F, 0.0F, -0.0873F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-0.195F, -0.805F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.7039F, 1.6496F, -1.0447F, -3.0975F, -0.0506F, -0.2621F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(113, 10).mirror().addBox(-0.195F, -0.205F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(113, 13).mirror().addBox(-0.195F, -0.605F, -0.68F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-1.729F, 1.3622F, 0.1296F, 1.0428F, 0.0F, -0.0873F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(105, 33).mirror().addBox(-0.195F, -1.5555F, -1.6928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(75, 105).mirror().addBox(-0.195F, -1.5555F, -1.0928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7039F, 1.6496F, -1.0447F, 2.8235F, -0.0506F, -0.2621F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(15, 113).mirror().addBox(-0.2185F, -0.8254F, -1.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(113, 16).mirror().addBox(-0.2185F, -1.4254F, -1.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(106, 4).mirror().addBox(-0.2185F, -1.7504F, -0.6394F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.3039F, 3.0496F, -1.0447F, 2.9688F, -0.0976F, -0.4558F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(20, 113).mirror().addBox(-0.2185F, -1.7686F, 0.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3039F, 3.0496F, -1.0447F, -2.3981F, -0.0976F, -0.4558F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(113, 29).mirror().addBox(-0.2185F, 0.3728F, 0.9246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-1.3039F, 3.0496F, -1.0447F, -1.0455F, -0.0976F, -0.4558F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(42, 113).mirror().addBox(-0.1476F, 1.3702F, -0.3478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(52, 113).mirror().addBox(-0.1476F, 1.6702F, -0.3478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3039F, 3.0496F, -1.0447F, -0.1948F, -0.0369F, -0.4281F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(113, 58).mirror().addBox(-0.195F, -1.2917F, -0.9001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.7039F, 1.6496F, -1.0447F, 3.0112F, -0.0506F, -0.2621F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(113, 61).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0933F, 4.727F, -1.6387F, 0.0974F, -0.0642F, -0.1674F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(97, 22).mirror().addBox(-0.1476F, 1.3003F, -1.5185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(64, 113).mirror().addBox(-0.1476F, 0.6003F, -1.1185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(113, 82).mirror().addBox(-0.1476F, -0.0997F, -0.8185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3039F, 3.0496F, -1.0447F, 0.1106F, -0.0369F, -0.4281F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(113, 89).mirror().addBox(-0.0859F, 0.6743F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.7039F, 1.6496F, -1.0447F, 0.0889F, 0.0108F, -0.2359F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(113, 97).mirror().addBox(-0.195F, -0.805F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)).mirror(false), PartPose.offsetAndRotation(-1.7039F, 1.6496F, -1.0447F, -1.3221F, 0.0F, -0.0873F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(113, 100).mirror().addBox(-0.195F, -0.805F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.7546F, 1.0703F, -1.1924F, -1.453F, 0.0F, -0.0873F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(108, 63).addBox(-0.7F, -0.8935F, -0.7905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, 0.4892F, 0.4205F, 0.1178F, 0.0F, 0.0873F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(113, 58).addBox(-0.805F, -1.2917F, -0.9001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.7039F, 1.6496F, -1.0447F, 3.0112F, 0.0506F, 0.2621F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(10, 113).addBox(-0.805F, -0.805F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.7039F, 1.6496F, -1.0447F, -3.0975F, 0.0506F, 0.2621F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(113, 100).addBox(-0.805F, -0.805F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.7546F, 1.0703F, -1.1924F, -1.453F, 0.0F, 0.0873F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(113, 97).addBox(-0.805F, -0.805F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(1.7039F, 1.6496F, -1.0447F, -1.3221F, 0.0F, 0.0873F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(113, 0).addBox(-0.805F, -0.805F, -0.205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.7528F, 1.0906F, -0.8321F, -1.933F, 0.0F, 0.0873F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(112, 108).addBox(-0.805F, -0.205F, -0.205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7965F, 0.5908F, -0.5031F, -0.5803F, 0.0F, 0.0873F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(75, 105).addBox(-0.805F, -1.5555F, -1.0928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(105, 33).addBox(-0.805F, -1.5555F, -1.6928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.7039F, 1.6496F, -1.0447F, 2.8235F, 0.0506F, 0.2621F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(113, 89).addBox(-0.9141F, 0.6743F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.7039F, 1.6496F, -1.0447F, 0.0889F, -0.0108F, 0.2359F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(113, 82).addBox(-0.8524F, -0.0997F, -0.8185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(64, 113).addBox(-0.8524F, 0.6003F, -1.1185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(97, 22).addBox(-0.8524F, 1.3003F, -1.5185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3039F, 3.0496F, -1.0447F, 0.1106F, 0.0369F, 0.4281F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(113, 61).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0933F, 4.727F, -1.6387F, 0.0974F, 0.0642F, 0.1674F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(52, 113).addBox(-0.8524F, 1.6702F, -0.3478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(42, 113).addBox(-0.8524F, 1.3702F, -0.3478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.3039F, 3.0496F, -1.0447F, -0.1948F, 0.0369F, 0.4281F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(113, 29).addBox(-0.7815F, 0.3728F, 0.9246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F)), PartPose.offsetAndRotation(1.3039F, 3.0496F, -1.0447F, -1.0455F, 0.0976F, 0.4558F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(20, 113).addBox(-0.7815F, -1.7686F, 0.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3039F, 3.0496F, -1.0447F, -2.3981F, 0.0976F, 0.4558F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(113, 16).addBox(-0.7815F, -1.4254F, -1.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(106, 4).addBox(-0.7815F, -1.7504F, -0.6394F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(15, 113).addBox(-0.7815F, -0.8254F, -1.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.3039F, 3.0496F, -1.0447F, 2.9688F, 0.0976F, 0.4558F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(113, 13).addBox(-0.805F, -0.605F, -0.68F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.192F))
				.texOffs(113, 10).addBox(-0.805F, -0.205F, -0.805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.729F, 1.3622F, 0.1296F, 1.0428F, 0.0F, 0.0873F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(0, 105).addBox(-0.805F, -1.805F, -0.805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.7216F, 1.4469F, 0.9738F, 0.685F, 0.0F, 0.0873F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(99, 26).addBox(-0.7F, -0.2696F, -0.8426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.7F, 0.4892F, 0.4205F, -0.5367F, 0.0F, 0.0873F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7552F, -1.3417F, 3.5115F, 0.3489F, -0.1085F, 0.0335F));

		PartDefinition cube_r561 = bone2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(23, 94).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1301F, 1.918F, 0.714F, -0.4492F, 0.2457F, -0.3953F));

		PartDefinition cube_r562 = bone2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(22, 84).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0551F, 2.0834F, -3.4967F, -2.3254F, 0.2457F, -0.3953F));

		PartDefinition cube_r563 = bone2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(102, 56).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1919F, 1.7076F, -6.3583F, -2.8424F, -0.3667F, -1.0085F));

		PartDefinition cube_r564 = bone2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(95, 84).addBox(-1.0F, 0.0069F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3518F, 1.1368F, -5.553F, -2.8123F, 0.5528F, -0.7208F));

		PartDefinition cube_r565 = bone2.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(28, 59).addBox(-0.3F, 0.3F, -2.4F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6626F, 1.3016F, -2.9381F, -2.8624F, 0.0521F, -0.8834F));

		PartDefinition cube_r566 = bone2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(54, 88).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0462F, 1.9855F, -3.719F, -2.4999F, 0.2457F, -0.3953F));

		PartDefinition cube_r567 = bone2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(41, 62).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.3231F, -0.8941F, -3.997F, -1.8018F, 0.2457F, -0.3953F));

		PartDefinition cube_r568 = bone2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(71, 90).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0778F, -1.5304F, -2.1168F, -1.3218F, 0.2457F, -0.3953F));

		PartDefinition cube_r569 = bone2.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(47, 88).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3615F, -0.9743F, -0.3342F, -0.4055F, 0.2457F, -0.3953F));

		PartDefinition cube_r570 = bone2.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4931F, 0.1536F, 1.0791F, -0.7546F, 0.2457F, -0.3953F));

		PartDefinition cube_r571 = bone2.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(92, 12).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.3748F, 1.7984F, 1.7984F, -1.1909F, 0.2457F, -0.3953F));

		PartDefinition cube_r572 = bone2.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(71, 83).addBox(0.0516F, -3.5444F, -0.169F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5357F, 2.1971F, 0.3656F, 1.5143F, 0.2457F, -0.3953F));

		PartDefinition cube_r573 = bone2.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(14, 102).addBox(-0.2637F, -2.036F, 0.0031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5357F, 2.2971F, -1.0844F, 1.8634F, 0.2457F, -0.3953F));

		PartDefinition cube_r574 = bone2.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(81, 32).addBox(-2.4F, 0.1F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0021F, 3.4396F, -5.7699F, -1.1129F, 0.2112F, -0.2155F));

		PartDefinition cube_r575 = bone2.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(102, 52).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3536F, 2.7233F, -3.3806F, -1.1386F, 0.2457F, -0.3953F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7552F, -1.3417F, 3.5115F, 0.3489F, 0.1085F, -0.0335F));

		PartDefinition cube_r576 = bone3.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(23, 94).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1301F, 1.918F, 0.714F, -0.4492F, -0.2457F, 0.3953F));

		PartDefinition cube_r577 = bone3.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(22, 84).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.0551F, 2.0834F, -3.4967F, -2.3254F, -0.2457F, 0.3953F));

		PartDefinition cube_r578 = bone3.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(102, 56).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1919F, 1.7076F, -6.3583F, -2.8424F, 0.3667F, 1.0085F));

		PartDefinition cube_r579 = bone3.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(95, 84).mirror().addBox(0.0F, 0.0069F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3518F, 1.1368F, -5.553F, -2.8123F, -0.5528F, 0.7208F));

		PartDefinition cube_r580 = bone3.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(28, 59).mirror().addBox(-0.7F, 0.3F, -2.4F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6626F, 1.3016F, -2.9381F, -2.8624F, -0.0521F, 0.8834F));

		PartDefinition cube_r581 = bone3.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(54, 88).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0462F, 1.9855F, -3.719F, -2.4999F, -0.2457F, 0.3953F));

		PartDefinition cube_r582 = bone3.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(41, 62).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.3231F, -0.8941F, -3.997F, -1.8018F, -0.2457F, 0.3953F));

		PartDefinition cube_r583 = bone3.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.0778F, -1.5304F, -2.1168F, -1.3218F, -0.2457F, 0.3953F));

		PartDefinition cube_r584 = bone3.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(47, 88).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.3615F, -0.9743F, -0.3342F, -0.4055F, -0.2457F, 0.3953F));

		PartDefinition cube_r585 = bone3.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4931F, 0.1536F, 1.0791F, -0.7546F, -0.2457F, 0.3953F));

		PartDefinition cube_r586 = bone3.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(92, 12).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.3748F, 1.7984F, 1.7984F, -1.1909F, -0.2457F, 0.3953F));

		PartDefinition cube_r587 = bone3.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(71, 83).mirror().addBox(-1.0516F, -3.5444F, -0.169F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 2.1971F, 0.3656F, 1.5143F, -0.2457F, 0.3953F));

		PartDefinition cube_r588 = bone3.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(14, 102).mirror().addBox(-0.7363F, -2.036F, 0.0031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5357F, 2.2971F, -1.0844F, 1.8634F, -0.2457F, 0.3953F));

		PartDefinition cube_r589 = bone3.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(-1.6F, 0.1F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0021F, 3.4396F, -5.7699F, -1.1129F, -0.2112F, 0.2155F));

		PartDefinition cube_r590 = bone3.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(102, 52).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3536F, 2.7233F, -3.3806F, -1.1386F, -0.2457F, 0.3953F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(70, 10).addBox(-0.5F, -0.9067F, -0.1029F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F))
				.texOffs(0, 41).addBox(-2.0F, -1.9067F, 0.8971F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.2666F, 2.5887F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r591 = tail.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(12, 116).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8195F, 2.8952F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r592 = tail.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(9, 116).addBox(0.0F, -0.9F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 6).addBox(0.0F, -0.5F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5187F, 2.2693F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r593 = tail.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(116, 3).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9067F, 0.8971F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r594 = tail.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(75, 53).mirror().addBox(-1.3F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4067F, 0.8971F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r595 = tail.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(75, 53).addBox(-0.7F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4067F, 0.8971F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(54, 69).addBox(-0.5F, -0.1055F, -0.1045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(15, 39).addBox(-1.5F, -1.1055F, -0.1045F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8067F, 3.8971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r596 = tail8.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(25, 115).addBox(0.0F, -0.65F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1685F, 2.8963F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r597 = tail8.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(6, 115).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 115).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1233F, 0.3958F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r598 = tail8.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(0, 115).addBox(0.0F, -0.65F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0556F, 0.9083F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r599 = tail8.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(86, 48).mirror().addBox(-1.1F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.3945F, 0.8955F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r600 = tail8.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(86, 48).addBox(0.1F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3945F, 0.8955F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 59).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F))
				.texOffs(30, 39).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.8726F, 3.8708F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r601 = tail2.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(115, 114).addBox(0.0F, 0.2F, 3.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 115).addBox(0.0F, -0.1F, 1.475F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 115).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0176F, 0.5132F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r602 = tail2.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(115, 32).addBox(0.0F, -0.275F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r603 = tail2.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(86, 52).mirror().addBox(-0.1F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.5F, 2.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r604 = tail2.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(86, 52).addBox(-0.9F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.5F, 2.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(65, 69).addBox(-0.5F, -0.9983F, -0.0261F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(26, 70).addBox(-0.5F, -0.9983F, -0.0261F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, -0.0078F, 4.9003F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 71).addBox(-0.5F, -1.0088F, -0.1531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F))
				.texOffs(72, 16).addBox(-0.5F, -1.0088F, -0.1531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.0017F, 3.8739F, 0.192F, 0.0F, 0.0F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(62, 83).addBox(-0.5F, -0.9641F, -0.2417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(86, 35).addBox(-0.5F, -0.9641F, -0.2417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -0.0573F, 4.0767F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail10.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(57, 24).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F))
				.texOffs(59, 17).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.5609F, 2.7313F, 0.0698F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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