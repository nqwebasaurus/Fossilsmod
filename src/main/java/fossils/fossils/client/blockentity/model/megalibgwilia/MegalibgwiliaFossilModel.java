package fossils.fossils.client.blockentity.model.megalibgwilia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalibgwiliaFossilModel extends SkullModelBase {
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
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
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

	public MegalibgwiliaFossilModel(ModelPart root) {
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
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.6906F, 13.5881F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 69).addBox(0.0F, -2.2937F, -0.4061F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(0.0F, -2.0937F, 1.5939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 39).addBox(0.0F, -2.2201F, -0.5189F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 23).mirror().addBox(0.163F, -0.3321F, -0.3004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3974F, -2.5198F, -2.6766F, 0.1319F, -2.0518F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 23).addBox(-0.163F, -0.3321F, -0.3004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3974F, -2.5198F, -2.6766F, -0.1319F, 2.0518F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 0.6642F, 1.301F, -0.3421F, -0.898F, -0.5904F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 58).addBox(-1.0294F, -5.504F, -0.2798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 11).addBox(-1.9142F, -2.6266F, -1.1928F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9241F, 5.5398F, -1.9246F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 49).addBox(-1.525F, -0.5026F, -1.0104F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.9959F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 2).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0849F, 6.2429F, -2.9395F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(36, 42).addBox(-1.8392F, -0.3618F, -1.4208F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9241F, 5.5398F, -1.9246F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 29).addBox(-1.8392F, -0.736F, -1.4517F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9241F, 5.5398F, -1.9246F, -0.7156F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9401F, -2.2675F, 1.3381F, -0.1352F, 0.0261F));

		PartDefinition cube_r12 = leftLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 2).addBox(-1.5F, 0.3531F, -0.2346F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 56).addBox(-1.9F, -0.6589F, 0.0196F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4F, 1.4737F, -0.6446F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5029F, -2.7621F, -0.1919F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7779F, 2.654F, 0.1462F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(7, 53).addBox(-0.5029F, -3.7621F, -0.1919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7779F, 2.654F, 0.1462F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 16).addBox(0.4014F, 1.3822F, -0.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 14).addBox(0.4014F, -0.3178F, -0.4255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1264F, 5.3626F, -0.4125F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(62, 9).addBox(0.275F, -3.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 6.0556F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.4399F, -0.8925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(39, 11).addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 9.0471F, -0.7495F, 2.1342F, -0.9006F, 2.5541F));

		PartDefinition thumbToe = leftLeg3.addOrReplaceChild("thumbToe", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.4557F, -0.1179F));

		PartDefinition cube_r20 = thumbToe.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(43, 62).addBox(-1.2F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition thumbToe2 = thumbToe.addOrReplaceChild("thumbToe2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9201F, 0.3151F, -0.2904F, -0.0811F, 0.1523F, 0.0829F));

		PartDefinition cube_r21 = thumbToe2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 46).addBox(0.0F, 0.0F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4276F, 0.0066F, 0.4F, 0.0F, 0.0F, 0.0436F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.3749F, 0.0205F, 1.4837F, -0.0046F, 0.0035F));

		PartDefinition cube_r22 = leftLeg4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -6.0F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -0.1629F, 0.0856F, 0.0076F, -0.0869F, -0.0876F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 0.6642F, 1.301F, 0.2576F, 0.6392F, 0.9851F));

		PartDefinition cube_r23 = rightLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(0.0294F, -5.504F, -0.2798F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3668F, -0.5756F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(48, 11).mirror().addBox(-0.0858F, -2.6266F, -1.1928F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9241F, 5.5398F, -1.9246F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 49).mirror().addBox(-0.475F, -0.5026F, -1.0104F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9959F, 0.58F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(43, 2).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0849F, 6.2429F, -2.9395F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 42).mirror().addBox(-0.1608F, -0.3618F, -1.4208F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9241F, 5.5398F, -1.9246F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.1608F, -0.736F, -1.4517F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9241F, 5.5398F, -1.9246F, -0.7156F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9401F, -2.2675F, 1.2116F, -0.4332F, 0.0084F));

		PartDefinition cube_r29 = rightLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(52, 2).mirror().addBox(-0.5F, 0.3531F, -0.2346F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2483F, 0.9022F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, -0.1523F, -0.4962F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5517F, -0.2978F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(0.9F, -0.6589F, 0.0196F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4737F, -0.6446F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.4971F, -2.7621F, -0.1919F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7779F, 2.654F, 0.1462F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(7, 53).mirror().addBox(-0.4971F, -3.7621F, -0.1919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.7779F, 2.654F, 0.1462F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(48, 16).mirror().addBox(-1.4014F, 1.3822F, -0.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 14).mirror().addBox(-1.4014F, -0.3178F, -0.4255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1264F, 5.3626F, -0.4125F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 9).mirror().addBox(-1.275F, -3.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0556F, -0.1229F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4399F, -0.8925F, -0.3316F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(39, 11).mirror().addBox(-1.5F, -0.5443F, -0.6179F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.0471F, -0.7495F, 2.2744F, 0.913F, 3.0106F));

		PartDefinition thumbToe3 = rightLeg3.addOrReplaceChild("thumbToe3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.4557F, -0.1179F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r37 = thumbToe3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(43, 62).mirror().addBox(0.2F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition thumbToe4 = thumbToe3.addOrReplaceChild("thumbToe4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9201F, 0.3151F, -0.2904F, -0.0811F, -0.1523F, -0.0829F));

		PartDefinition cube_r38 = thumbToe4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(45, 46).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4276F, 0.0066F, 0.4F, 0.0F, 0.0F, -0.0436F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.3749F, 0.0205F, 1.5273F, 0.0047F, -0.0033F));

		PartDefinition cube_r39 = rightLeg4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.0F, 0.0F, -6.0F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, -0.1629F, 0.0856F, 0.0076F, 0.0869F, 0.0876F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.63F, 0.3757F, 0.3192F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 14).addBox(-0.7115F, -0.3438F, -5.439F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1982F, -0.2286F, 0.8824F, 0.118F, 0.0604F, 0.3688F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5831F, -0.3581F, -5.4134F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1982F, -0.2286F, 0.8824F, 0.123F, -0.1252F, 0.4777F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(62, 6).addBox(-0.7F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4142F, -0.53F, -0.2626F, -0.1144F, 0.7638F, 1.6287F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 37).addBox(0.289F, -0.4237F, -0.9236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3629F, -0.7062F, 1.5683F, -0.2544F, 1.237F, 1.4672F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(18, 46).addBox(-2.2546F, -0.4238F, -0.6529F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3629F, -0.7062F, 1.5683F, -2.8111F, 1.314F, -1.1131F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 27).addBox(-1.1859F, 0.493F, -0.1646F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(27, 34).addBox(-0.1859F, 0.493F, 0.2354F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4425F, -0.4926F, 2.318F, 0.7267F, 0.1438F, -1.0937F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(69, 62).addBox(0.3516F, -0.567F, -0.893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 59).addBox(-0.4484F, -0.567F, -0.893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0098F, 0.2468F, 2.1301F, 2.9869F, -1.1479F, 2.1147F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(70, 32).addBox(-0.8618F, -0.567F, -1.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0098F, 0.2468F, 2.1301F, 0.2256F, -1.2842F, -1.3848F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(69, 47).addBox(-1.1056F, -0.567F, -1.1799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0098F, 0.2468F, 2.1301F, 0.0745F, -0.5568F, -1.2076F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 49).addBox(-1.6536F, -0.4939F, -0.2525F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5718F, 1.7857F, 1.4567F, 0.3788F, 1.1001F, -0.9451F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 14).addBox(-0.1F, 0.5127F, -3.9181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.13F, 2.3311F, 2.2259F, 0.3527F, -0.16F, -0.2613F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(36, 32).addBox(-0.1F, -0.2163F, -2.3222F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.13F, 2.3311F, 2.2259F, 0.7017F, -0.16F, -0.2613F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -1.0737F, -2.7988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.63F, 1.2451F, 4.8108F, 0.7675F, -0.2259F, -0.3766F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(10, 69).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.63F, -1.27F, 5.2752F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(19, 54).addBox(-0.5F, -0.2903F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.63F, 1.0343F, 4.283F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(55, 18).addBox(-0.5039F, -0.4253F, -1.7505F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5718F, 1.7857F, 1.4567F, -0.1587F, -0.1828F, 0.0244F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(69, 56).addBox(-0.5039F, -0.4605F, 0.2143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5718F, 1.7857F, 1.4567F, -0.2896F, -0.1828F, 0.0244F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(9, 44).addBox(-1.2399F, -1.0653F, -1.5491F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.37F, 1.2408F, 0.5884F, -0.1017F, -0.8595F, -1.4369F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.63F, 0.3757F, 0.3192F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(15, 14).mirror().addBox(-0.2885F, -0.3438F, -5.439F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1982F, -0.2286F, 0.8824F, 0.118F, -0.0604F, -0.3688F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.4169F, -0.3581F, -5.4134F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1982F, -0.2286F, 0.8824F, 0.123F, 0.1252F, -0.4777F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-1.3F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4142F, -0.53F, -0.2626F, -0.1144F, -0.7638F, -1.6287F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(54, 37).mirror().addBox(-1.289F, -0.4237F, -0.9236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3629F, -0.7062F, 1.5683F, -0.2544F, -1.237F, -1.4672F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(18, 46).mirror().addBox(-0.7454F, -0.4238F, -0.6529F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3629F, -0.7062F, 1.5683F, -2.8111F, -1.314F, 1.1131F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(33, 27).mirror().addBox(0.1859F, 0.493F, -0.1646F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(27, 34).mirror().addBox(-0.8141F, 0.493F, 0.2354F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4425F, -0.4926F, 2.318F, 0.7267F, -0.1438F, 1.0937F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(69, 62).mirror().addBox(-1.3516F, -0.567F, -0.893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 59).mirror().addBox(-0.5516F, -0.567F, -0.893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0098F, 0.2468F, 2.1301F, 2.9869F, 1.1479F, -2.1147F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-0.1382F, -0.567F, -1.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0098F, 0.2468F, 2.1301F, 0.2256F, 1.2842F, 1.3848F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(0.1056F, -0.567F, -1.1799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0098F, 0.2468F, 2.1301F, 0.0745F, 0.5568F, 1.2076F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-1.3463F, -0.4939F, -0.2525F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5718F, 1.7857F, 1.4567F, 0.3788F, -1.1001F, 0.9451F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(55, 14).mirror().addBox(-0.9F, 0.5127F, -3.9181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.13F, 2.3311F, 2.2259F, 0.3527F, 0.16F, 0.2613F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-0.9F, -0.2163F, -2.3222F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.13F, 2.3311F, 2.2259F, 0.7017F, 0.16F, 0.2613F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-0.5F, -1.0737F, -2.7988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.63F, 1.2451F, 4.8108F, 0.7675F, 0.2259F, 0.3766F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.63F, -1.27F, 5.2752F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(19, 54).mirror().addBox(-0.5F, -0.2903F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.63F, 1.0343F, 4.283F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-0.4961F, -0.4253F, -1.7505F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5718F, 1.7857F, 1.4567F, -0.1587F, 0.1828F, -0.0244F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-0.4961F, -0.4605F, 0.2143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5718F, 1.7857F, 1.4567F, -0.2896F, 0.1828F, -0.0244F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.7601F, -1.0653F, -1.5491F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.37F, 1.2408F, 0.5884F, -0.1017F, 0.8595F, 1.4369F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.2F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(37, 68).addBox(0.0F, -2.0751F, -0.317F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(70, 65).addBox(0.0F, -1.5577F, -0.218F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0026F, -0.3198F, -2.8511F, 0.1319F, -2.0518F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(9, 35).mirror().addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0026F, -2.8198F, -3.0275F, 0.0437F, -1.9348F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(27, 62).addBox(0.0F, -0.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0026F, -0.3198F, -2.8511F, -0.1319F, 2.0518F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(9, 35).addBox(0.0F, -0.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0026F, -2.8198F, -3.0275F, -0.0437F, 1.9348F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.1F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0504F, -4.0954F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4452F, 0.0646F, 0.1416F, -0.7078F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(27, 66).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4452F, 0.0255F, 0.1534F, -0.9723F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(46, 24).mirror().addBox(-4.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.0842F, -0.4452F, -0.0488F, 0.1477F, -1.4578F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4453F, 0.1952F, 0.2616F, -0.6303F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4453F, 0.1198F, 0.3029F, -0.8996F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(51, 28).mirror().addBox(-6.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.2842F, -2.4453F, -0.0386F, 0.3228F, -1.4041F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-8.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.4842F, -6.0453F, 0.0027F, 0.4754F, -1.336F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.4842F, -6.0453F, 0.2356F, 0.4168F, -0.8066F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(67, 13).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.4842F, -6.0453F, 0.3364F, 0.3425F, -0.5361F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2453F, 0.2426F, 0.2876F, -0.5652F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2453F, 0.1588F, 0.3402F, -0.835F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(18, 44).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.7842F, -4.2453F, -0.0235F, 0.3734F, -1.3467F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(63, 66).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4452F, 0.0646F, -0.1416F, 0.7078F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(27, 66).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4452F, 0.0255F, -0.1534F, 0.9723F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(46, 24).addBox(3.0551F, -2.1982F, -0.4625F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.0842F, -0.4452F, -0.0488F, -0.1477F, 1.4578F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(66, 42).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4453F, 0.1952F, -0.2616F, 0.6303F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(66, 4).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4453F, 0.1198F, -0.3029F, 0.8996F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 28).addBox(3.0551F, -2.1982F, -0.4625F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.2842F, -2.4453F, -0.0386F, -0.3228F, 1.4041F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 33).addBox(3.0551F, -2.1982F, -0.4625F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.4842F, -6.0453F, 0.0027F, -0.4754F, 1.336F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(66, 40).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.4842F, -6.0453F, 0.2356F, -0.4168F, 0.8066F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(67, 13).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.4842F, -6.0453F, 0.3364F, -0.3425F, 0.5361F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 24).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2453F, 0.2426F, -0.2876F, 0.5652F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(65, 22).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2453F, 0.1588F, -0.3402F, 0.835F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(18, 44).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.7842F, -4.2453F, -0.0235F, -0.3734F, 1.3467F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(39, 16).addBox(-0.5F, -0.0745F, -3.0935F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.8F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(70, 69).addBox(0.0F, -1.4219F, -0.0409F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1823F, -0.8733F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(3, 71).addBox(0.0F, -1.1187F, -0.0039F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0419F, -2.8703F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(21, 71).addBox(0.0F, -0.8638F, -0.0503F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4419F, -4.7703F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(18, 71).addBox(0.0F, -0.938F, 0.0788F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -6.8F, 0.1658F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -6.6F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(22, 32).mirror().addBox(-4.4F, 0.1F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4626F, 8.4985F, 1.8507F, -0.0774F, 0.4615F, 0.649F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-3.9F, 0.1F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4626F, 8.4985F, 1.8507F, -0.2565F, 0.1196F, 0.4862F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(45, 31).mirror().addBox(-3.9F, 0.1F, -0.3F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4152F, 8.1748F, 0.6961F, -0.2725F, 0.0451F, 0.3054F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-3.3F, 0.0F, -0.1F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.57F, 7.7174F, -0.9339F, -0.2383F, 0.1565F, 0.2294F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.3916F, -1.9822F, -0.2788F, 0.1321F, 0.6429F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-1.8699F, -0.0253F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.7166F, -5.0021F, 0.22F, 0.3445F, -0.7368F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-3.7996F, -0.5084F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.7166F, -5.0021F, 0.1203F, 0.3891F, -1.0133F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-4.8534F, -2.2049F, -0.4654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2453F, -0.0876F, 0.2848F, -1.5353F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-3.5703F, -0.6215F, -0.4654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2453F, 0.0577F, 0.2922F, -1.0343F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(66, 2).mirror().addBox(-1.6776F, -0.1939F, -0.4654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.1842F, -3.2453F, 0.133F, 0.2671F, -0.7631F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(-1.8218F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, 0.0504F, 0.1596F, -0.6781F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(-3.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, 0.007F, 0.1672F, -0.9434F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-7.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.4842F, -1.3453F, -0.0716F, 0.1514F, -1.4294F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(67, 26).addBox(1.7996F, -0.5084F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.7166F, -5.0021F, 0.1203F, -0.3891F, 1.0133F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 65).addBox(-0.1301F, -0.0253F, -0.3188F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.7166F, -5.0021F, 0.22F, -0.3445F, 0.7368F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(63, 34).addBox(2.8534F, -2.2049F, -0.4654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2453F, -0.0876F, -0.2848F, 1.5353F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(63, 0).addBox(1.5702F, -0.6215F, -0.4654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2453F, 0.0577F, -0.2922F, 1.0343F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(66, 2).addBox(-0.3224F, -0.1939F, -0.4654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 1.1842F, -3.2453F, 0.133F, -0.2671F, 0.7631F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(48, 67).addBox(-0.1782F, -0.0528F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, 0.0504F, -0.1596F, 0.6781F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(41, 67).addBox(1.7461F, -0.5225F, -0.4625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, 0.007F, -0.1672F, 0.9434F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(45, 35).addBox(3.0551F, -2.1982F, -0.4625F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4586F, 0.4842F, -1.3453F, -0.0716F, -0.1514F, 1.4294F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(24, 71).addBox(0.0F, -0.6951F, -1.0265F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.209F, -2.802F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(66, 71).addBox(0.0F, -1.2943F, -1.93F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6329F, -0.0474F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(6, 71).addBox(0.0F, -0.1639F, -2.9118F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.209F, -2.802F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -1.0115F, -2.669F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6329F, -0.0474F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(22, 32).addBox(-0.6F, 0.1F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4626F, 8.4985F, 1.8507F, -0.0774F, -0.4615F, -0.649F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(45, 33).addBox(-0.1F, 0.1F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4626F, 8.4985F, 1.8507F, -0.2565F, -0.1196F, -0.4862F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(45, 31).addBox(-0.1F, 0.1F, -0.3F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4152F, 8.1748F, 0.6961F, -0.2725F, -0.0451F, -0.3054F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(43, 0).addBox(-0.7F, 0.0F, -0.1F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.57F, 7.7174F, -0.9339F, -0.2383F, -0.1565F, -0.2294F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(54, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.3916F, -1.9822F, -0.2788F, -0.1321F, -0.6429F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7071F, -2.615F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(22, 27).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7169F, -3.9857F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(37, 21).addBox(-0.5F, -0.099F, -3.0169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.209F, -2.802F, 0.4625F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5582F, 1.7379F, -3.8506F, 0.8306F, 0.1059F, -0.4192F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(28, 6).addBox(-0.8339F, -0.6209F, -2.3F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9432F, -0.3903F, -0.079F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(36, 37).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2146F, 0.9602F, -1.8134F, 1.0988F, 0.0426F, -0.2184F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.1332F, 0.697F, -3.4659F, 3.1028F, 0.8686F, 0.7788F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(22, 62).addBox(-1.4F, -2.2F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4335F, 0.1558F, -2.7387F, 2.5355F, 0.8686F, 0.7788F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 67).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4786F, -0.4141F, -0.8755F, 2.3817F, 0.0426F, -0.2184F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(67, 9).addBox(-0.7585F, -1.1824F, 0.2758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.1933F, -0.662F, 0.8482F, 0.6058F, 0.2436F, 0.1377F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(48, 6).addBox(-0.8399F, -1.2714F, -0.6377F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6014F, 0.0426F, -0.2184F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(39, 6).addBox(-0.7585F, -0.0051F, -0.219F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1933F, -0.662F, 0.8482F, 0.1607F, 0.2436F, 0.1377F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(19, 58).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1631F, 1.148F, -1.5902F, 1.0727F, 0.0426F, -0.2184F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(58, 22).addBox(-0.8399F, -0.2439F, -0.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4618F, 0.0426F, -0.2184F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(5, 67).addBox(-0.7585F, -2.3296F, -2.5396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 62).addBox(-0.7585F, -2.3296F, -2.1396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1933F, -0.662F, 0.8482F, -0.232F, 0.2436F, 0.1377F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(9, 48).addBox(-0.7585F, -1.9968F, -1.6258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1933F, -0.662F, 0.8482F, -0.4501F, 0.2436F, 0.1377F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(49, 54).addBox(-0.7585F, -2.0235F, -0.1596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1933F, -0.662F, 0.8482F, -0.7119F, 0.2436F, 0.1377F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5582F, 1.7379F, -3.8506F, 0.8306F, -0.1059F, 0.4192F));

		PartDefinition cube_r159 = bone4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(28, 6).mirror().addBox(-0.1661F, -0.6209F, -2.3F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9432F, 0.3903F, 0.079F));

		PartDefinition cube_r160 = bone4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(36, 37).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2146F, 0.9602F, -1.8134F, 1.0988F, -0.0426F, 0.2184F));

		PartDefinition cube_r161 = bone4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(4.1332F, 0.697F, -3.4659F, 3.1028F, -0.8686F, -0.7788F));

		PartDefinition cube_r162 = bone4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(22, 62).mirror().addBox(0.4F, -2.2F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.4335F, 0.1558F, -2.7387F, 2.5355F, -0.8686F, -0.7788F));

		PartDefinition cube_r163 = bone4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(17, 67).mirror().addBox(-0.5F, -1.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4786F, -0.4141F, -0.8755F, 2.3817F, -0.0426F, 0.2184F));

		PartDefinition cube_r164 = bone4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(-0.2415F, -1.1824F, 0.2758F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.1933F, -0.662F, 0.8482F, 0.6058F, -0.2436F, -0.1377F));

		PartDefinition cube_r165 = bone4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(48, 6).mirror().addBox(-0.1601F, -1.2714F, -0.6377F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6014F, -0.0426F, 0.2184F));

		PartDefinition cube_r166 = bone4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(39, 6).mirror().addBox(-0.2415F, -0.0051F, -0.219F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1933F, -0.662F, 0.8482F, 0.1607F, -0.2436F, -0.1377F));

		PartDefinition cube_r167 = bone4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1631F, 1.148F, -1.5902F, 1.0727F, -0.0426F, 0.2184F));

		PartDefinition cube_r168 = bone4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-0.1601F, -0.2439F, -0.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4618F, -0.0426F, 0.2184F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-0.2415F, -2.3296F, -2.5396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 62).mirror().addBox(-0.2415F, -2.3296F, -2.1396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1933F, -0.662F, 0.8482F, -0.232F, -0.2436F, -0.1377F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-0.2415F, -1.9968F, -1.6258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1933F, -0.662F, 0.8482F, -0.4501F, -0.2436F, -0.1377F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(49, 54).mirror().addBox(-0.2415F, -2.0235F, -0.1596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1933F, -0.662F, 0.8482F, -0.7119F, -0.2436F, -0.1377F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0332F, 5.7206F, -4.0119F, -0.6382F, -0.3668F, -1.2983F));

		PartDefinition cube_r172 = leftarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(12, 65).addBox(-0.254F, -0.5929F, -1.0316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6508F, 0.6343F, 0.4798F, 0.1657F, -0.6196F, -0.3882F));

		PartDefinition cube_r173 = leftarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(29, 44).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1509F, 5.3355F, 0.8979F, -0.4941F, 0.6209F, 0.226F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, 0.4F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2872F, 4.1884F, 3.8609F, -0.4505F, 0.6209F, 0.226F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(27, 39).addBox(0.5097F, 3.9101F, -0.5033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(69, 6).addBox(0.5097F, 4.9101F, 0.8967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(67, 15).addBox(0.5097F, 0.9101F, 0.4967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(13, 33).addBox(0.5097F, -1.0899F, -0.5033F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6508F, 0.6343F, 0.4798F, 0.3786F, 0.6209F, 0.226F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(22, 67).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1496F, 2.1639F, 0.3138F, 1.0331F, 0.6209F, 0.226F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(27, 68).addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0647F, 2.2822F, 1.5978F, -0.1014F, 0.6209F, 0.226F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5332F, 6.1255F, 1.6438F, -0.2408F, -0.5209F, 1.4765F));

		PartDefinition cube_r178 = leftarm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(53, 62).addBox(-0.2196F, -3.2378F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5763F, 1.5072F, 0.0989F, -1.5848F, -1.0544F, 1.327F));

		PartDefinition cube_r179 = leftarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(63, 53).addBox(-0.4F, -2.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5763F, 2.8542F, 0.0779F, -1.5708F, -1.3701F, 1.5708F));

		PartDefinition cube_r180 = leftarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(59, 58).addBox(-0.4858F, 0.3471F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5763F, 1.5072F, 0.0989F, -1.5708F, -1.5446F, 1.5708F));

		PartDefinition cube_r181 = leftarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(48, 62).addBox(-1.52F, -0.1166F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.2763F, 5.5072F, 0.9989F, 1.5708F, -1.5621F, -1.5708F));

		PartDefinition cube_r182 = leftarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(63, 29).addBox(-0.2142F, -0.1646F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0763F, 5.4741F, -0.7091F, 1.5708F, -1.5621F, -1.5708F));

		PartDefinition cube_r183 = leftarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(22, 34).addBox(-0.9F, -2.6F, 1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 59).addBox(-0.9F, -1.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.0763F, 2.8741F, 0.1909F, -1.5708F, -1.501F, 1.5708F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(68, 28).addBox(-0.5858F, -1.2529F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7763F, 1.5072F, 0.0989F, -1.5602F, -1.1957F, 1.5608F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(46, 21).addBox(-0.1F, -1.1F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5935F, 0.8394F, 0.1975F, 1.5821F, -0.909F, -1.8356F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2289F, 8.5936F, -0.4644F, -0.932F, 0.1025F, -0.1075F));

		PartDefinition cube_r186 = leftArm3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(68, 52).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r187 = leftArm3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(45, 37).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0061F, 1.7111F, -0.0893F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftArm4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 68).addBox(-0.615F, -1.5755F, -0.4916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r189 = leftArm4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(42, 26).addBox(-0.8F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, -0.0873F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0332F, 5.7206F, -4.0119F, 0.1207F, 0.3003F, 1.5258F));

		PartDefinition cube_r190 = rightarm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(12, 65).mirror().addBox(-0.746F, -0.5929F, -1.0316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6508F, 0.6343F, 0.4798F, 0.1657F, 0.6196F, 0.3882F));

		PartDefinition cube_r191 = rightarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(29, 44).mirror().addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1509F, 5.3355F, 0.8979F, -0.4941F, -0.6209F, -0.226F));

		PartDefinition cube_r192 = rightarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(11, 27).mirror().addBox(-0.5F, 0.4F, -3.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2872F, 4.1884F, 3.8609F, -0.4505F, -0.6209F, -0.226F));

		PartDefinition cube_r193 = rightarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(27, 39).mirror().addBox(-1.5098F, 3.9101F, -0.5033F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 6).mirror().addBox(-1.5098F, 4.9101F, 0.8967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(67, 15).mirror().addBox(-1.5098F, 0.9101F, 0.4967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(13, 33).mirror().addBox(-1.5098F, -1.0899F, -0.5033F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6508F, 0.6343F, 0.4798F, 0.3786F, -0.6209F, -0.226F));

		PartDefinition cube_r194 = rightarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(22, 67).mirror().addBox(-0.5F, -0.7F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1496F, 2.1639F, 0.3138F, 1.0331F, -0.6209F, -0.226F));

		PartDefinition cube_r195 = rightarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0647F, 2.2822F, 1.5978F, -0.1014F, -0.6209F, -0.226F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5332F, 6.1255F, 1.6438F, 0.0302F, -0.005F, -1.565F));

		PartDefinition cube_r196 = rightarm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(53, 62).mirror().addBox(-0.7804F, -3.2378F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.5763F, 1.5072F, 0.0989F, -1.5848F, 1.0544F, -1.327F));

		PartDefinition cube_r197 = rightarm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(63, 53).mirror().addBox(-0.6F, -2.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.5763F, 2.8542F, 0.0779F, -1.5708F, 1.3701F, -1.5708F));

		PartDefinition cube_r198 = rightarm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.5142F, 0.3471F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5763F, 1.5072F, 0.0989F, -1.5708F, 1.5446F, -1.5708F));

		PartDefinition cube_r199 = rightarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(48, 62).mirror().addBox(0.52F, -0.1166F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.2763F, 5.5072F, 0.9989F, 1.5708F, 1.5621F, 1.5708F));

		PartDefinition cube_r200 = rightarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(63, 29).mirror().addBox(-0.7858F, -0.1646F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.0763F, 5.4741F, -0.7091F, 1.5708F, 1.5621F, 1.5708F));

		PartDefinition cube_r201 = rightarm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(-0.1F, -2.6F, 1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 59).mirror().addBox(-0.1F, -1.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.0763F, 2.8741F, 0.1909F, -1.5708F, 1.501F, -1.5708F));

		PartDefinition cube_r202 = rightarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-0.4142F, -1.2529F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.7763F, 1.5072F, 0.0989F, -1.5602F, 1.1957F, -1.5608F));

		PartDefinition cube_r203 = rightarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(46, 21).mirror().addBox(-2.9F, -1.1F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5935F, 0.8394F, 0.1975F, 1.5821F, 0.909F, 1.8356F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2289F, 8.5936F, -0.4644F, -1.4058F, -0.0181F, 0.0854F));

		PartDefinition cube_r204 = rightArm3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r205 = rightArm3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(45, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0061F, 1.7111F, -0.0893F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightArm4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-0.385F, -1.5755F, -0.4916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.4577F, 0.0906F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r207 = rightArm4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-2.2F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0423F, 0.0906F, 0.0F, 0.0F, 0.0873F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7837F, -5.4694F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(48, 69).addBox(-0.5F, -0.9F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2907F, -0.6886F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(63, 71).mirror().addBox(-0.608F, 0.8807F, -1.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 71).mirror().addBox(-0.608F, 0.8807F, -0.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 71).mirror().addBox(-0.608F, -0.1193F, -0.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 71).mirror().addBox(-0.608F, -1.1193F, -1.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 71).mirror().addBox(-0.608F, -1.1193F, -0.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5775F, 0.6258F, -0.5534F, 0.2946F, 0.4394F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(63, 71).addBox(0.608F, 0.8807F, -1.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 71).addBox(0.608F, 0.8807F, -0.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 71).addBox(0.608F, -0.1193F, -0.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 71).addBox(0.608F, -1.1193F, -0.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 71).addBox(0.608F, -1.1193F, -1.0533F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5775F, 0.6258F, -0.5534F, -0.2946F, -0.4394F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(26, 21).addBox(-0.5F, -0.1681F, -0.0721F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -1.9F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3913F, -2.1185F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(55, 10).addBox(-1.0F, -0.9163F, -0.0643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 7.0F, -8.2693F, 0.7199F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(55, 6).addBox(-1.0F, -0.0904F, -1.8526F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.5F, 5.1262F, -7.6618F, 0.8247F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(52, 58).addBox(-0.5F, -0.76F, -0.1912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 8.14F, -9.2556F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(45, 58).addBox(-0.5F, -0.1912F, -1.8025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 6.4861F, -8.8261F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(43, 69).addBox(-0.5F, -0.9896F, -1.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(69, 19).addBox(-0.5F, 0.0104F, -1.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.1819F, -3.5551F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(36, 49).addBox(-0.5F, -0.0072F, -1.9493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.8669F, -6.1934F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(23, 50).addBox(-0.5F, -0.0098F, -0.7303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.307F, -5.6489F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -0.043F, -1.9687F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.5896F, -5.4684F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(31, 57).addBox(-0.5F, -1.0005F, -2.0146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5534F, -3.2098F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, 0.0198F, -2.9685F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.8957F, -2.9736F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(28, 16).addBox(-1.0F, -0.0193F, -3.0244F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3131F, -0.8092F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(28, 11).addBox(-1.5F, 0.4F, 0.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2131F, -1.9092F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(36, 46).addBox(-1.5F, -0.6F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0056F)), PartPose.offsetAndRotation(0.0F, 1.5221F, 0.5684F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(9, 39).addBox(-1.5F, -0.0031F, -0.8968F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.3F, 0.9F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(58, 64).addBox(-1.0F, 0.0229F, -1.0083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4959F, -2.1152F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(45, 41).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.6984F, -0.0666F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(64, 62).addBox(-1.0F, -0.0129F, -0.9838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.6853F, -1.1933F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(68, 36).addBox(-0.5F, -0.05F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.5669F, -0.1506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(32, 68).addBox(-0.5F, -0.45F, 0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0437F, -1.3023F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8359F, 4.2418F, -10.1604F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(60, 68).addBox(-1.3632F, -0.5234F, -0.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(56, 34).addBox(-0.7632F, -0.5234F, -0.0776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1109F, -1.3641F, 6.8645F, 1.8799F, 0.8925F, 2.0641F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(59, 41).addBox(-1.0187F, -0.3155F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6842F, -2.2751F, 8.1251F, 1.0555F, 1.0633F, 1.0214F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(60, 26).addBox(-1.061F, -0.6752F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6842F, -2.2751F, 8.1251F, 1.2627F, 0.6603F, 1.2882F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(57, 45).addBox(0.3458F, -0.5068F, -1.5316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1109F, -1.3641F, 6.8645F, 1.6181F, 0.9306F, 1.5791F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(56, 54).addBox(0.3169F, -0.5068F, -2.1733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1109F, -1.3641F, 6.8645F, 0.853F, 0.6565F, 0.5594F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 52).addBox(-1.7015F, -1.9571F, 0.3619F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2381F, -3.9687F, 8.539F, -0.7521F, 0.2083F, 0.6459F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(62, 19).addBox(-1.3233F, -1.4767F, 0.4942F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2381F, -3.9687F, 8.539F, -0.1724F, 0.1195F, 0.6005F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(12, 54).addBox(-0.625F, -1.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0018F, -3.9814F, 9.9102F, 0.0115F, 0.1304F, 1.6588F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(52, 41).addBox(-0.5849F, -1.3588F, -0.2284F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2381F, -3.9687F, 8.539F, -0.0361F, -0.3911F, 1.6652F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(10, 62).addBox(-0.925F, -0.275F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0869F, -5.0573F, 9.2659F, 0.0357F, -0.025F, 0.6104F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(61, 37).addBox(-1.0F, -0.675F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0135F, -4.5047F, 8.4202F, 0.3649F, -0.2448F, 0.5655F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(57, 49).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0461F, -2.7989F, 7.3102F, 0.1923F, -0.33F, 1.7938F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(56, 30).addBox(-0.718F, -1.3151F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2381F, -3.9687F, 8.539F, 0.2886F, -0.8824F, 1.6315F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(50, 50).addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0685F, -3.0176F, 7.113F, 0.9742F, -0.3793F, 0.3255F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(50, 46).addBox(-0.1282F, -1.2625F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2381F, -3.9687F, 8.539F, 0.9006F, -0.1975F, 0.582F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(69, 44).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8359F, -0.7883F, 5.0513F, 0.8339F, 0.2399F, 0.2561F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(12, 58).addBox(-0.775F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.3229F, -1.8023F, 6.0305F, 0.8048F, -0.0606F, -0.0629F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(51, 24).addBox(-0.5225F, -1.2911F, -0.8407F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2381F, -3.9687F, 8.539F, 0.1543F, -0.649F, 1.6427F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(36, 61).addBox(-1.1282F, -1.2474F, -0.6453F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2381F, -3.9687F, 8.539F, 0.9267F, -0.268F, 0.5558F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8359F, 4.2418F, -10.1604F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(0.3632F, -0.5234F, -0.0776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(56, 34).mirror().addBox(-1.2368F, -0.5234F, -0.0776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1109F, -1.3641F, 6.8645F, 1.8799F, -0.8925F, -2.0641F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(59, 41).mirror().addBox(-0.9813F, -0.3155F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6842F, -2.2751F, 8.1251F, 1.0555F, -1.0633F, -1.0214F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(60, 26).mirror().addBox(-0.939F, -0.6752F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6842F, -2.2751F, 8.1251F, 1.2627F, -0.6603F, -1.2882F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(57, 45).mirror().addBox(-1.3458F, -0.5068F, -1.5316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1109F, -1.3641F, 6.8645F, 1.6181F, -0.9306F, -1.5791F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(56, 54).mirror().addBox(-1.3169F, -0.5068F, -2.1733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1109F, -1.3641F, 6.8645F, 0.853F, -0.6565F, -0.5594F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.2985F, -1.9571F, 0.3619F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2381F, -3.9687F, 8.539F, -0.7521F, -0.2083F, -0.6459F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(62, 19).mirror().addBox(-0.6767F, -1.4767F, 0.4942F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2381F, -3.9687F, 8.539F, -0.1724F, -0.1195F, -0.6005F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(12, 54).mirror().addBox(-1.375F, -1.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0018F, -3.9814F, 9.9102F, 0.0115F, -0.1304F, -1.6588F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-1.4151F, -1.3588F, -0.2284F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2381F, -3.9687F, 8.539F, -0.0361F, 0.3911F, -1.6652F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(-1.075F, -0.275F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0869F, -5.0573F, 9.2659F, 0.0357F, 0.025F, -0.6104F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(61, 37).mirror().addBox(-1.0F, -0.675F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0135F, -4.5047F, 8.4202F, 0.3649F, 0.2448F, -0.5655F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0461F, -2.7989F, 7.3102F, 0.1923F, 0.33F, -1.7938F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(56, 30).mirror().addBox(-0.282F, -1.3151F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2381F, -3.9687F, 8.539F, 0.2886F, 0.8824F, -1.6315F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(50, 50).mirror().addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0685F, -3.0176F, 7.113F, 0.9742F, 0.3793F, -0.3255F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(50, 46).mirror().addBox(-0.8718F, -1.2625F, -2.4991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2381F, -3.9687F, 8.539F, 0.9006F, 0.1975F, -0.582F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8359F, -0.7883F, 5.0513F, 0.8339F, -0.2399F, -0.2561F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(12, 58).mirror().addBox(-0.225F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.3229F, -1.8023F, 6.0305F, 0.8048F, 0.0606F, 0.0629F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(51, 24).mirror().addBox(-1.4775F, -1.2911F, -0.8407F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2381F, -3.9687F, 8.539F, 0.1543F, 0.649F, -1.6427F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(36, 61).mirror().addBox(-0.8718F, -1.2474F, -0.6453F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2381F, -3.9687F, 8.539F, 0.9267F, 0.268F, -0.5558F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0131F, -0.0759F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(65, 68).addBox(-0.5353F, 0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 44).addBox(-0.5353F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0353F, -1.1246F, -9.3835F, -1.3668F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(31, 61).mirror().addBox(-0.6626F, -0.1749F, -0.6433F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0104F, -1.1246F, -6.0532F, -1.5762F, -0.0526F, 0.0018F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5328F, -0.9391F, -3.8639F, -1.7071F, -0.2277F, -0.0125F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(36, 64).mirror().addBox(-0.2518F, -0.2491F, -0.7088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8505F, -4.643F, -1.7104F, -0.0698F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-0.75F, -0.1584F, -0.5295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.1703F, 0.2925F, -1.8462F, -0.2321F, 0.0263F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(31, 61).addBox(-0.3374F, -0.1749F, -0.6433F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0104F, -1.1246F, -6.0532F, -1.5762F, 0.0526F, -0.0018F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(64, 48).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5328F, -0.9391F, -3.8639F, -1.7071F, 0.2277F, 0.0125F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(36, 64).addBox(-0.7482F, -0.2491F, -0.7088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.8505F, -4.643F, -1.7104F, 0.0698F, 0.0F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(30, 50).addBox(-0.25F, -0.1584F, -0.5295F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 0.1703F, 0.2925F, -1.8462F, 0.2321F, -0.0263F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(59, 2).addBox(-0.5F, -0.1497F, -0.0853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2927F, 1.7764F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r278 = tail.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(60, 71).addBox(0.0F, -1.0787F, 0.0448F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.071F, 0.8699F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(35, 53).addBox(-0.5F, -0.5315F, -0.3345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4227F, 2.182F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r279 = tail2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(15, 71).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7315F, 1.1655F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(42, 53).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4195F, 1.7623F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(15, 21).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0197F, 1.9622F, -0.3316F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 76, 76);
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