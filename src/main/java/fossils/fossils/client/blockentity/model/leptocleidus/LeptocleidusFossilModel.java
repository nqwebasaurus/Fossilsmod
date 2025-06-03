package fossils.fossils.client.blockentity.model.leptocleidus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LeptocleidusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public LeptocleidusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.body = this.main.getChild("body");
		this.FrontFlipperR2 = this.body.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.body.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.main.getChild("tail");
		this.BackFlipperR2 = this.tail.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.tail.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.2F, -3.0F, 0.0472F, 0.0006F, 0.0106F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 39).addBox(-2.5F, -3.0F, 8.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 65).addBox(-2.5F, -3.1F, 6.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 66).addBox(-2.5F, -3.1F, 4.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 9).addBox(-2.5F, -2.9F, 2.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-2.5F, -2.8F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-8.0F, 4.3F, 1.9F, 11.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(-3.0F, -0.9F, 0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.2F, -5.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 37).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, 3.1105F, 0.0702F, 0.1408F, -0.2249F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 7).mirror().addBox(-7.286F, -2.1438F, -0.3647F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, 3.1105F, -0.0507F, 0.1489F, -1.0191F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, 3.1105F, 0.0175F, 0.1562F, -0.5776F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, 1.1105F, 0.0702F, 0.1408F, -0.19F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 9).mirror().addBox(-8.286F, -2.1438F, -0.3647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, 1.1105F, -0.0507F, 0.1489F, -0.9842F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, 1.1105F, 0.0175F, 0.1562F, -0.5427F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -4.8895F, 0.0702F, 0.1408F, -0.2249F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-6.286F, -2.1438F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -4.8895F, -0.0507F, 0.1489F, -1.0191F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(64, 9).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -4.8895F, 0.0175F, 0.1562F, -0.5776F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 54).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -2.8895F, 0.0702F, 0.1408F, -0.2075F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 52).mirror().addBox(-7.286F, -2.1438F, -0.3647F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -2.8895F, -0.0507F, 0.1489F, -1.0016F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 30).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -2.8895F, 0.0175F, 0.1562F, -0.5601F));

		PartDefinition cube_r14 = main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -0.8895F, 0.0175F, 0.1562F, -0.5427F));

		PartDefinition cube_r15 = main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(29, 26).mirror().addBox(-8.286F, -2.1438F, -0.3647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -0.8895F, -0.0507F, 0.1489F, -0.9842F));

		PartDefinition cube_r16 = main.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(19, 27).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4038F, -0.8895F, 0.0702F, 0.1408F, -0.19F));

		PartDefinition cube_r17 = main.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 64).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, 3.1105F, 0.0175F, -0.1562F, 0.5776F));

		PartDefinition cube_r18 = main.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 7).addBox(3.286F, -2.1438F, -0.3647F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, 3.1105F, -0.0507F, -0.1489F, 1.0191F));

		PartDefinition cube_r19 = main.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 37).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, 3.1105F, 0.0702F, -0.1408F, 0.2249F));

		PartDefinition cube_r20 = main.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 0).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, 1.1105F, 0.0175F, -0.1562F, 0.5427F));

		PartDefinition cube_r21 = main.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 9).addBox(3.286F, -2.1438F, -0.3647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, 1.1105F, -0.0507F, -0.1489F, 0.9842F));

		PartDefinition cube_r22 = main.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 26).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, 1.1105F, 0.0702F, -0.1408F, 0.19F));

		PartDefinition cube_r23 = main.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 9).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -4.8895F, 0.0175F, -0.1562F, 0.5776F));

		PartDefinition cube_r24 = main.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(57, 24).addBox(3.286F, -2.1438F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -4.8895F, -0.0507F, -0.1489F, 1.0191F));

		PartDefinition cube_r25 = main.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 28).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -4.8895F, 0.0702F, -0.1408F, 0.2249F));

		PartDefinition cube_r26 = main.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(64, 30).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -2.8895F, 0.0175F, -0.1562F, 0.5601F));

		PartDefinition cube_r27 = main.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(34, 52).addBox(3.286F, -2.1438F, -0.3647F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -2.8895F, -0.0507F, -0.1489F, 1.0016F));

		PartDefinition cube_r28 = main.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 54).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -2.8895F, 0.0702F, -0.1408F, 0.2075F));

		PartDefinition cube_r29 = main.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(19, 27).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -0.8895F, 0.0702F, -0.1408F, 0.19F));

		PartDefinition cube_r30 = main.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(29, 26).addBox(3.286F, -2.1438F, -0.3647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -0.8895F, -0.0507F, -0.1489F, 0.9842F));

		PartDefinition cube_r31 = main.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(64, 32).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4038F, -0.8895F, 0.0175F, -0.1562F, 0.5427F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.65F, -5.0F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 42).addBox(0.5F, -2.7F, 4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 66).addBox(0.5F, -2.6F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 66).addBox(0.5F, -2.6F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 22).addBox(0.0F, -0.9F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0F, -7.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 39).mirror().addBox(-0.0402F, 0.1421F, -0.5312F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.622F, 3.6342F, -8.1405F, 0.4577F, -0.1851F, -0.1324F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(4.9919F, -0.702F, 0.7364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.3278F, 0.6369F, -0.1995F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(24, 60).mirror().addBox(1.7713F, -0.3772F, -0.2148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.2824F, 0.4626F, -0.2347F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(43, 60).mirror().addBox(1.0792F, -0.3598F, -3.4025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.4548F, -0.276F, 0.1325F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(5.01F, -0.702F, -2.8551F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(1.1362F, -0.7204F, 2.3072F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.111F, 0.3652F, -0.0252F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(29, 19).mirror().addBox(2.9616F, -0.7204F, 1.5479F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.1037F, 0.0008F, 0.0145F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(45, 41).mirror().addBox(2.01F, -0.6712F, 0.1511F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 26).mirror().addBox(2.11F, -0.3598F, -3.6961F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(56, 39).mirror().addBox(3.11F, -0.3598F, -4.1961F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-1.6061F, -0.3598F, -5.2849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.21F, 5.8014F, -4.8164F, -0.6482F, -0.7955F, 0.4959F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(37, 63).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3538F, -5.7895F, -0.0619F, 0.2505F, -0.6984F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 22).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3538F, -5.7895F, 0.0294F, 0.2562F, -0.3377F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(63, 45).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0538F, -3.7895F, 0.0175F, 0.1562F, -0.5776F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(17, 58).mirror().addBox(-4.286F, -2.1538F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0538F, -3.7895F, -0.0507F, 0.1489F, -1.0191F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(7, 42).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0538F, -3.7895F, 0.0702F, 0.1408F, -0.2249F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 47).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0538F, -1.7895F, 0.0702F, 0.1408F, -0.2249F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(24, 64).mirror().addBox(-5.286F, -2.1438F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0538F, -1.7895F, -0.0507F, 0.1489F, -1.0191F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(63, 56).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0538F, -1.7895F, 0.0175F, 0.1562F, -0.5776F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(41, 22).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3538F, -5.7895F, 0.0294F, -0.2562F, 0.3377F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 63).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3538F, -5.7895F, -0.0619F, -0.2505F, 0.6984F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(7, 42).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0538F, -3.7895F, 0.0702F, -0.1408F, 0.2249F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(17, 58).addBox(3.286F, -2.1538F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0538F, -3.7895F, -0.0507F, -0.1489F, 1.0191F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 45).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0538F, -3.7895F, 0.0175F, -0.1562F, 0.5776F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(63, 56).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0538F, -1.7895F, 0.0175F, -0.1562F, 0.5776F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(24, 64).addBox(3.286F, -2.1438F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0538F, -1.7895F, -0.0507F, -0.1489F, 1.0191F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(42, 47).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0538F, -1.7895F, 0.0702F, -0.1408F, 0.2249F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 60).addBox(0.6061F, -0.3598F, -5.2849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.6482F, 0.7955F, -0.4959F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(56, 39).addBox(-6.11F, -0.3598F, -4.1961F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(51, 26).addBox(-6.11F, -0.3598F, -3.6961F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(24, 60).addBox(-2.7713F, -0.3772F, -0.2148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.2824F, -0.4626F, 0.2347F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 60).addBox(-2.0792F, -0.3598F, -3.4025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.4548F, 0.276F, -0.1325F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(30, 65).addBox(-5.9919F, -0.702F, 0.7364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.3278F, -0.6369F, 0.1995F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(42, 51).addBox(-6.01F, -0.702F, -2.8551F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(45, 41).addBox(-6.01F, -0.6712F, 0.1511F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(34, 47).addBox(-3.1362F, -0.7204F, 2.3072F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.111F, -0.3652F, 0.0252F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(29, 19).addBox(-5.9616F, -0.7204F, 1.5479F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.21F, 5.8014F, -4.8164F, -0.1037F, -0.0008F, -0.0145F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 39).addBox(-0.9598F, 0.1421F, -0.5312F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.622F, 3.6342F, -8.1405F, 0.4577F, 0.1851F, 0.1324F));

		PartDefinition FrontFlipperR2 = body.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 5.5551F, -4.9755F, -0.1328F, 0.4401F, 0.0767F));

		PartDefinition cube_r69 = FrontFlipperR2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(57, 61).addBox(-1.8716F, -1.0F, -0.0597F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.5734F, 0.429F, -1.5916F, 0.0F, 0.6196F, 0.0F));

		PartDefinition cube_r70 = FrontFlipperR2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(60, 4).addBox(-0.1273F, -1.0F, 0.0365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0734F, 0.429F, 1.1084F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r71 = FrontFlipperR2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(55, 21).addBox(-1.7F, -1.0F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5734F, 0.429F, -0.3916F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r72 = FrontFlipperR2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(58, 42).addBox(-1.5F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2066F, 0.429F, -0.0886F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r73 = FrontFlipperR2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(49, 36).addBox(-1.9F, -1.0F, -0.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1522F, 0.429F, 0.1284F, 0.0F, 0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(39, 26).addBox(1.8469F, 0.0F, -1.4308F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(66, 11).addBox(0.8469F, -0.5F, -1.2308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 2).addBox(0.8469F, -0.5F, -0.3308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 44).addBox(0.8469F, -0.5F, 0.6692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 37).addBox(0.0469F, -0.5F, 0.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(64, 60).addBox(-0.1531F, -0.5F, -1.1308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9522F, -0.071F, -0.3716F, -0.045F, -0.123F, 0.3518F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create().texOffs(16, 31).addBox(0.0F, 0.0166F, -0.6F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3469F, 0.0F, -0.8308F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR3 = body.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 5.5551F, -4.9755F, -0.2872F, -0.2378F, -0.383F));

		PartDefinition cube_r74 = FrontFlipperR3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(50, 61).addBox(-0.1284F, -1.0F, -0.0597F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.5734F, 0.429F, -1.5916F, 0.0F, -0.6196F, 0.0F));

		PartDefinition cube_r75 = FrontFlipperR3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(59, 51).addBox(-1.8727F, -1.0F, 0.0365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.0734F, 0.429F, 1.1084F, 0.0F, -2.4871F, 0.0F));

		PartDefinition cube_r76 = FrontFlipperR3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 15).addBox(-1.3F, -1.0F, 0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.5734F, 0.429F, -0.3916F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r77 = FrontFlipperR3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2066F, 0.429F, -0.0886F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r78 = FrontFlipperR3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(49, 4).addBox(-2.1F, -1.0F, -0.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1522F, 0.429F, 0.1284F, 0.0F, -0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(37, 37).addBox(-5.8469F, 0.0F, -1.4308F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(65, 49).addBox(-1.8469F, -0.5F, -1.2308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 65).addBox(-1.8469F, -0.5F, -0.3308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 37).addBox(-1.8469F, -0.5F, 0.6692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 34).addBox(-1.0469F, -0.5F, 0.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(7, 64).addBox(-0.8469F, -0.5F, -1.1308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9522F, -0.071F, -0.3716F, -0.0396F, 0.1248F, -0.3079F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create().texOffs(0, 30).addBox(-6.0F, 0.0166F, -0.6F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3469F, 0.0F, -0.8308F, 0.0F, 0.1309F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.45F, -7.0F, 0.0432F, -0.0084F, -0.1704F));

		PartDefinition cube_r79 = neck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(30, 68).addBox(0.5F, -2.8F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 66).addBox(0.5F, -2.7F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 66).addBox(0.5F, -2.5F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 67).addBox(0.5F, -2.4F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 12).addBox(0.0F, -1.1F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, -8.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-1.6495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3038F, -6.6895F, -0.0598F, 0.5784F, -0.5549F));

		PartDefinition cube_r81 = neck.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2038F, -4.6895F, -0.0384F, 0.4933F, -0.55F));

		PartDefinition cube_r82 = neck.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(64, 47).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1038F, -2.6895F, 0.005F, 0.322F, -0.3447F));

		PartDefinition cube_r83 = neck.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-2.8718F, -0.5575F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1038F, -2.6895F, -0.1089F, 0.3037F, -0.7112F));

		PartDefinition cube_r84 = neck.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0038F, -0.6895F, 0.0173F, 0.2891F, -0.341F));

		PartDefinition cube_r85 = neck.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0038F, -0.6895F, -0.0853F, 0.2771F, -0.7045F));

		PartDefinition cube_r86 = neck.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 41).addBox(-0.3505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3038F, -6.6895F, -0.0598F, -0.5784F, 0.5549F));

		PartDefinition cube_r87 = neck.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(43, 64).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2038F, -4.6895F, -0.0384F, -0.4933F, 0.55F));

		PartDefinition cube_r88 = neck.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(45, 35).addBox(1.8718F, -0.5575F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1038F, -2.6895F, -0.1089F, -0.3037F, 0.7112F));

		PartDefinition cube_r89 = neck.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(64, 47).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1038F, -2.6895F, 0.005F, -0.322F, 0.3447F));

		PartDefinition cube_r90 = neck.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(63, 18).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0038F, -0.6895F, -0.0853F, -0.2771F, 0.7045F));

		PartDefinition cube_r91 = neck.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 64).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0038F, -0.6895F, 0.0173F, -0.2891F, 0.341F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.65F, -8.1F, -0.263F, 0.089F, 0.1093F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(67, 67).addBox(-0.5F, -2.4F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 68).addBox(-0.5F, -2.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 68).addBox(-0.5F, -2.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -5.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.9495F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1462F, -4.5895F, 0.0257F, 0.1551F, -0.6293F));

		PartDefinition cube_r94 = neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-0.9495F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1462F, -2.5895F, 0.0481F, 0.4123F, -0.4932F));

		PartDefinition cube_r95 = neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 64).mirror().addBox(-1.4495F, 0.2163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3462F, -0.5895F, 0.0409F, 0.4142F, -0.5392F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 62).addBox(-0.0505F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1462F, -4.5895F, 0.0257F, -0.1551F, 0.6293F));

		PartDefinition cube_r97 = neck2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(65, 43).addBox(-0.0505F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1462F, -2.5895F, 0.0481F, -0.4123F, 0.4932F));

		PartDefinition cube_r98 = neck2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(57, 64).addBox(-0.5505F, 0.2163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3462F, -0.5895F, 0.0409F, -0.4142F, 0.5392F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(30, 29).addBox(-0.5F, -0.3F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F))
				.texOffs(37, 37).addBox(0.0F, -0.8F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(23, 35).addBox(0.0F, -1.3F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(35, 5).addBox(0.0F, -1.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.05F, -5.9F, -0.0871F, 0.1692F, 0.1791F));

		PartDefinition cube_r99 = neck3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-0.9495F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0962F, -4.6895F, -0.0018F, 0.1572F, -0.806F));

		PartDefinition cube_r100 = neck3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 22).mirror().addBox(-0.9495F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0962F, -2.6895F, -0.0018F, 0.1572F, -0.806F));

		PartDefinition cube_r101 = neck3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(31, 61).mirror().addBox(-0.9495F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0962F, -0.6895F, -0.0293F, 0.1544F, -0.9827F));

		PartDefinition cube_r102 = neck3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 4).addBox(-0.0505F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0962F, -4.6895F, -0.0018F, -0.1572F, 0.806F));

		PartDefinition cube_r103 = neck3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(29, 22).addBox(-0.0505F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0962F, -2.6895F, -0.0018F, -0.1572F, 0.806F));

		PartDefinition cube_r104 = neck3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(31, 61).addBox(-0.0505F, 0.1163F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0962F, -0.6895F, -0.0293F, -0.1544F, 0.9827F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1232F, -5.0162F, -0.283F, 0.2047F, -0.0942F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(48, 51).addBox(-0.5F, -0.0291F, 0.0471F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(48, 0).addBox(-0.5F, -0.0291F, 3.5471F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(28, 52).addBox(1.0F, -0.0291F, 1.0471F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.5F, -0.2334F, -5.4811F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-2.4F, -0.2F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(0, 20).addBox(2.4F, -0.2F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.4855F, -0.5442F, 0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(0.7F, -1.5423F, -0.8655F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.8855F, -0.3442F, 1.0123F, 0.1186F, -0.0738F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(36, 59).mirror().addBox(0.0F, -1.6423F, -0.8655F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.8855F, -0.3442F, 1.0133F, -0.1038F, 0.0645F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(56, 48).addBox(-3.7F, -1.5423F, -0.8655F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.4F, -0.8855F, -0.3442F, 1.0123F, -0.1186F, 0.0738F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(36, 59).addBox(-2.0F, -1.6423F, -0.8655F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.4F, -0.8855F, -0.3442F, 1.0133F, 0.1038F, -0.0645F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(30, 54).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6501F, -1.9272F, 0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(8, 46).addBox(-0.5F, -0.0326F, -0.5911F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.4154F, -7.674F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(55, 29).addBox(-0.5F, 0.0F, -0.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6154F, -8.874F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(49, 31).mirror().addBox(-0.5F, -0.6878F, -0.2611F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 31).addBox(0.1F, -0.6878F, -0.2611F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 1.7627F, -10.8436F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-0.5F, -0.6878F, -0.1611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(59, 9).mirror().addBox(-0.5F, -0.6878F, 0.3389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 15).addBox(0.1F, -0.6878F, -0.1611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(59, 9).addBox(0.1F, -0.6878F, 0.3389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 1.7627F, -10.8436F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.5F, -0.6878F, 0.3389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.7627F, -10.7436F, 0.3142F, -0.1745F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-0.5F, -0.6878F, -0.2611F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.7627F, -10.7436F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(29, 57).mirror().addBox(0.0609F, -0.9831F, -2.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 56).mirror().addBox(-0.0391F, -0.3831F, -2.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.7627F, -7.0436F, -0.0414F, -0.3435F, -0.0631F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(51, 57).mirror().addBox(-0.7228F, -0.9829F, -1.5967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 57).mirror().addBox(-0.7228F, -0.4829F, -1.5967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.4627F, -5.3436F, 0.1779F, -0.4635F, -0.0882F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(16, 48).mirror().addBox(-0.0748F, -1.6256F, 0.0786F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.7627F, -3.3436F, 0.1771F, -0.1717F, -0.0318F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(22, 56).mirror().addBox(0.0136F, -1.2783F, 0.0865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.7627F, -5.3436F, 0.1798F, -0.2406F, -0.0433F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -0.6878F, 0.3389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.3F, 1.7627F, -10.7436F, 0.3142F, 0.1745F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(12, 65).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.3461F, 2.0528F, -10.4824F, -0.2793F, -0.1745F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(17, 66).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.5369F, 1.8478F, -9.4F, -0.0524F, -0.1745F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(-0.0579F, -0.8304F, -0.2002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.7627F, -5.0436F, 0.2845F, -0.2406F, -0.0433F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(17, 66).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.5369F, 1.8478F, -9.4F, -0.0524F, 0.1745F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(12, 65).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.3461F, 2.0528F, -10.4824F, -0.2793F, 0.1745F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, -0.6878F, -0.2611F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 1.7627F, -10.7436F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(16, 48).addBox(-0.9252F, -1.6256F, 0.0786F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 1.7627F, -3.3436F, 0.1771F, 0.1717F, 0.0318F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 56).addBox(-0.9421F, -0.8304F, -0.2002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4F, 1.7627F, -5.0436F, 0.2845F, 0.2406F, 0.0433F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(22, 56).addBox(-1.0136F, -1.2783F, 0.0865F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 1.7627F, -5.3436F, 0.1798F, 0.2406F, 0.0433F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(44, 56).addBox(-0.9609F, -0.3831F, -2.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 57).addBox(-1.0609F, -0.9831F, -2.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 1.7627F, -7.0436F, -0.0414F, 0.3435F, 0.0631F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(58, 57).addBox(-0.2772F, -0.4829F, -1.5967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(51, 57).addBox(-0.2772F, -0.9829F, -1.5967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 1.4627F, -5.3436F, 0.1779F, 0.4635F, 0.0882F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(8, 51).mirror().addBox(-0.5F, -0.9708F, -0.361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5627F, -1.1436F, 0.0F, -0.8901F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(8, 51).addBox(-0.5F, -0.9708F, -0.361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.5627F, -1.1436F, 0.0F, 0.8901F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(22, 66).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 1.8627F, -1.8436F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(21, 35).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 1.8627F, -1.8436F, -0.1222F, 0.0F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7996F, 0.1833F, -5.9863F, 0.2213F, 0.271F, -0.4931F));

		PartDefinition cube_r138 = eye.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(17, 60).addBox(-0.5F, -0.6106F, -1.5598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2282F, 0.0441F, 0.2214F, 0.157F, -0.0353F));

		PartDefinition cube_r139 = eye.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(63, 65).addBox(-0.2835F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 66).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0039F, 0.3308F, 0.0434F, -0.1452F, 0.157F, -0.0353F));

		PartDefinition cube_r140 = eye.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.7029F, 0.0334F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2282F, 0.0441F, -0.3371F, 0.157F, -0.0353F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7996F, 0.1833F, -5.9863F, 0.2213F, -0.271F, 0.4931F));

		PartDefinition cube_r141 = eye2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-0.5F, -0.6106F, -1.5598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2282F, 0.0441F, 0.2214F, -0.157F, 0.0353F));

		PartDefinition cube_r142 = eye2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-0.7165F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0039F, 0.3308F, 0.0434F, -0.1452F, -0.157F, 0.0353F));

		PartDefinition cube_r143 = eye2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.7029F, 0.0334F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2282F, 0.0441F, -0.3371F, -0.157F, 0.0353F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 70).addBox(0.1F, -1.6339F, -11.6095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 70).addBox(0.19F, -1.6339F, -10.6095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 16).addBox(2.0F, -0.6339F, -5.6095F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F))
				.texOffs(41, 16).mirror().addBox(-2.0F, -0.6339F, -5.6095F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(20, 70).mirror().addBox(-0.19F, -1.6339F, -10.6095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-0.1F, -1.6339F, -11.6095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.9627F, 0.9064F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(23, 22).mirror().addBox(-2.5F, -0.3F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 22).addBox(1.5F, -0.3F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8339F, -4.1095F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(22, 50).mirror().addBox(-3.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 50).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.6339F, -5.6095F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-3.5F, -1.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 42).addBox(0.5F, -1.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, 1.0607F, -5.6702F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(59, 33).mirror().addBox(-3.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 33).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.6339F, -1.6095F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(12, 11).mirror().addBox(-3.5F, -1.0388F, 0.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(12, 11).addBox(0.5F, -1.0388F, 0.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.5F, 0.8607F, -1.6702F, -0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-0.18F, -0.3841F, -4.5779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 70).mirror().addBox(-0.18F, -0.3841F, -3.6779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 70).mirror().addBox(-0.1F, -0.2841F, -2.6779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6339F, -5.6095F, -0.1396F, -0.4189F, 0.0F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(19, 42).mirror().addBox(0.0F, 0.1391F, -4.6218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(19, 42).mirror().addBox(0.0F, 0.1391F, -3.9218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6339F, -5.6095F, -0.0873F, -0.4189F, 0.0F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(0.0F, 0.0F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6339F, -5.6095F, -0.0524F, -0.4189F, 0.0F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(19, 42).addBox(-1.0F, 0.1391F, -4.6218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F))
				.texOffs(19, 42).addBox(-1.0F, 0.1391F, -3.9218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.0F, -0.6339F, -5.6095F, -0.0873F, 0.4189F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 70).addBox(-0.9F, -0.2841F, -2.6779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 70).addBox(-0.82F, -0.3841F, -3.6779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 70).addBox(-0.82F, -0.3841F, -4.5779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, -0.6339F, -5.6095F, -0.1396F, 0.4189F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(46, 22).addBox(-1.0F, -0.4F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.6339F, -5.6095F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(26, 44).addBox(-1.0F, 0.0F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.6339F, -5.6095F, -0.0524F, 0.4189F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(16, 54).addBox(0.0F, -1.0082F, -1.9474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1661F, -9.6095F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9F, 3.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(33, 68).addBox(-2.0F, -2.1F, 2.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 68).addBox(-2.0F, -2.1F, 0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 37).addBox(-2.5F, -0.1F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.6893F, 0.156F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = tail.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.4389F, 3.226F, -1.2725F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 1.0845F, 4.7886F, 0.2229F, 0.2044F, 0.046F));

		PartDefinition Hips_r2 = tail.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-3.0526F, 4.0291F, -0.0542F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.2457F, 0.3515F, 0.2449F, 0.4677F, 0.1122F));

		PartDefinition Hips_r3 = tail.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-2.0F, 2.6291F, -0.3701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 53).addBox(1.0F, 2.6291F, -0.3701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(11, 22).addBox(-2.0F, 2.6291F, -2.3701F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.093F, 2.9976F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = tail.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-4.1796F, -0.7869F, 0.5829F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9F, 4.5219F, 6.9362F, 0.5179F, -0.3691F, -0.2028F));

		PartDefinition Hips_r5 = tail.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(-1.8384F, -0.7869F, 1.3888F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9F, 4.5219F, 6.9362F, 0.4899F, -0.1932F, -0.102F));

		PartDefinition Hips_r6 = tail.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-0.5997F, -1.8836F, -2.6004F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1638F, 1.6551F, 7.3625F, 1.2733F, 0.422F, 0.3198F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 50).mirror().addBox(-4.286F, -2.1438F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4962F, 3.1105F, 0.0458F, 0.2969F, -1.1388F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(63, 7).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4962F, 3.1105F, 0.244F, 0.1768F, -0.3385F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(11, 63).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4962F, 3.1105F, 0.1694F, 0.2492F, -0.6881F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(63, 63).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4962F, 1.2105F, 0.1694F, 0.2492F, -0.5659F));

		PartDefinition cube_r162 = tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(12, 16).mirror().addBox(-6.286F, -2.1438F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4962F, 1.2105F, 0.0458F, 0.2969F, -1.0166F));

		PartDefinition cube_r163 = tail.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4962F, 1.2105F, 0.244F, 0.1768F, -0.2164F));

		PartDefinition cube_r164 = tail.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(11, 63).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4962F, 3.1105F, 0.1694F, -0.2492F, 0.6881F));

		PartDefinition cube_r165 = tail.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(63, 7).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4962F, 3.1105F, 0.244F, -0.1768F, 0.3385F));

		PartDefinition cube_r166 = tail.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(28, 50).addBox(3.286F, -2.1438F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4962F, 3.1105F, 0.0458F, -0.2969F, 1.1388F));

		PartDefinition cube_r167 = tail.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(63, 63).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4962F, 1.2105F, 0.1694F, -0.2492F, 0.5659F));

		PartDefinition cube_r168 = tail.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(58, 16).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4962F, 1.2105F, 0.244F, -0.1768F, 0.2164F));

		PartDefinition cube_r169 = tail.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(12, 16).addBox(3.286F, -2.1438F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4962F, 1.2105F, 0.0458F, -0.2969F, 1.0166F));

		PartDefinition Hips_r7 = tail.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(0, 9).addBox(-0.4003F, -1.8836F, -2.6004F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1638F, 1.6551F, 7.3625F, 1.2733F, -0.422F, -0.3198F));

		PartDefinition Hips_r8 = tail.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(35, 55).addBox(-0.1616F, -0.7869F, 1.3888F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 4.5219F, 6.9362F, 0.4899F, 0.1932F, 0.102F));

		PartDefinition Hips_r9 = tail.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(39, 30).addBox(-1.6F, -0.7869F, -0.6344F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 4.5219F, 6.9362F, 0.48F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = tail.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(48, 9).addBox(1.1796F, -0.7869F, 0.5829F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 4.5219F, 6.9362F, 0.5179F, 0.3691F, 0.2028F));

		PartDefinition Hips_r11 = tail.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(29, 0).addBox(-2.9474F, 4.0291F, -0.0542F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9F, 1.2457F, 0.3515F, 0.2449F, -0.4677F, -0.1122F));

		PartDefinition Hips_r12 = tail.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(0, 48).addBox(-1.5611F, 3.226F, -1.2725F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 1.0845F, 4.7886F, 0.2229F, -0.2044F, -0.046F));

		PartDefinition BackFlipperR2 = tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create().texOffs(55, 13).addBox(-0.1971F, -0.4811F, -0.4574F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.9F, 4.0611F, 4.9647F, 0.2376F, -0.1233F, -0.0943F));

		PartDefinition cube_r170 = BackFlipperR2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(12, 58).addBox(2.7F, 0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(51, 54).addBox(-0.3F, 0.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1029F, -0.9811F, 0.5426F, 0.0F, -0.1745F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create().texOffs(24, 14).addBox(1.1407F, 0.0F, -1.5261F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 66).addBox(0.0407F, -0.5F, -1.1261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 66).addBox(0.0407F, -0.5F, 0.1739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9029F, 0.0189F, 0.7426F, 0.0411F, -0.3027F, -0.1372F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create().texOffs(9, 35).addBox(0.0F, 0.0149F, -0.6F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6407F, 0.0F, -0.9261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperR3 = tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create().texOffs(52, 45).addBox(-3.8029F, -0.4811F, -0.4574F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.9F, 4.0611F, 4.9647F, 0.2376F, 0.1233F, 0.0943F));

		PartDefinition cube_r171 = BackFlipperR3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 58).addBox(-3.7F, 0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(52, 18).addBox(-3.7F, 0.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1029F, -0.9811F, 0.5426F, 0.0F, 0.1745F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create().texOffs(24, 9).addBox(-7.1407F, 0.0F, -1.5261F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(66, 38).addBox(-1.0407F, -0.5F, -1.1261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 34).addBox(-1.0407F, -0.5F, 0.1739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9029F, 0.0189F, 0.7426F, 0.0945F, 0.2909F, 0.3193F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create().texOffs(35, 5).addBox(-5.0F, 0.0149F, -0.6F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6407F, 0.0F, -0.9261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6393F, 4.856F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(11, 21).addBox(0.0F, -2.8F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 34).addBox(0.0F, -2.9F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 10).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6824F, 0.0432F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1569F, 2.1546F, 0.2627F, 0.1095F, -0.2661F));

		PartDefinition cube_r174 = tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(63, 20).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1569F, 2.1546F, 0.2106F, 0.1921F, -0.6092F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(64, 22).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1431F, 0.2546F, 0.244F, 0.1768F, -0.2687F));

		PartDefinition cube_r176 = tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(30, 63).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1431F, 0.2546F, 0.1694F, 0.2492F, -0.6183F));

		PartDefinition cube_r177 = tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(63, 20).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1569F, 2.1546F, 0.2106F, -0.1921F, 0.6092F));

		PartDefinition cube_r178 = tail2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(17, 64).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1569F, 2.1546F, 0.2627F, -0.1095F, 0.2661F));

		PartDefinition cube_r179 = tail2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(30, 63).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1431F, 0.2546F, 0.1694F, -0.2492F, 0.6183F));

		PartDefinition cube_r180 = tail2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(64, 22).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1431F, 0.2546F, 0.244F, -0.1768F, 0.2687F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1176F, 3.4932F, 0.1834F, -0.0429F, -0.008F));

		PartDefinition cube_r181 = tail3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(24, 14).addBox(0.0F, -1.4F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 9).addBox(0.0F, -1.6F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 41).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3984F, 0.2742F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(45, 45).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(32, 31).addBox(0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(0.5F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6484F, 4.0242F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.375F, 3.95F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r182 = tail5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, -1.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(0.0F, -1.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 30).addBox(0.0F, -1.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 20).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, 0.0F, 0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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