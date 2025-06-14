package fossils.fossils.client.blockentity.model.compsognathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CompsognathusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Compsognathus;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public CompsognathusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Compsognathus = this.fossil.getChild("Compsognathus");
		this.leftLeg1 = this.Compsognathus.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.Compsognathus.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.Tail1 = this.Compsognathus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.Compsognathus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.leftArm1 = this.Chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.Chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.Neck3 = this.Chest.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Compsognathus = fossil.addOrReplaceChild("Compsognathus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.0F, 0.3F, -0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Compsognathus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(40, 12).addBox(-0.6F, -0.8562F, 1.0288F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 64).addBox(-0.6F, -0.8562F, 0.0288F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 30).addBox(-1.1F, -0.2562F, 0.0288F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.6F, -0.7F, -2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r2 = Compsognathus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(44, 31).mirror().addBox(-0.6064F, -1.346F, 1.2508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, 0.488F, -0.0845F, 0.0229F));

		PartDefinition basin_r3 = Compsognathus.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(35, 31).mirror().addBox(-0.9432F, -3.0707F, -0.0063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, -0.2182F, 0.0F, 0.0873F));

		PartDefinition basin_r4 = Compsognathus.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-0.9432F, -2.7614F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, 0.2313F, 0.0F, 0.0873F));

		PartDefinition basin_r5 = Compsognathus.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(60, 3).mirror().addBox(-0.9432F, -2.47F, -1.3958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, -0.2923F, 0.0F, 0.0873F));

		PartDefinition basin_r6 = Compsognathus.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(30, 44).mirror().addBox(-0.9432F, -2.9434F, -0.982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, 0.0349F, 0.0F, 0.0873F));

		PartDefinition basin_r7 = Compsognathus.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-0.9432F, -2.9984F, -0.1877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, 0.5411F, 0.0F, 0.0873F));

		PartDefinition basin_r8 = Compsognathus.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(-0.5697F, -1.5539F, -1.1745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, -1.5577F, 0.0F, -0.1047F));

		PartDefinition basin_r9 = Compsognathus.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(47, 16).mirror().addBox(-0.5697F, -2.6756F, -0.5129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, -0.0393F, 0.0F, -0.1047F));

		PartDefinition basin_r10 = Compsognathus.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(38, 22).mirror().addBox(-0.5697F, -2.7098F, -0.6269F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.4391F, -0.7683F, -0.3011F, 0.0F, -0.1047F));

		PartDefinition basin_r11 = Compsognathus.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.4248F, 0.3777F, 0.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3568F, 1.4391F, -0.7683F, 0.9774F, 0.0F, -0.1047F));

		PartDefinition basin_r12 = Compsognathus.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-0.4248F, 2.3164F, 0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(50, 8).mirror().addBox(-0.4248F, 0.8164F, 0.2283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3568F, 1.4391F, -0.7683F, 0.8203F, 0.0F, -0.1047F));

		PartDefinition basin_r13 = Compsognathus.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-0.4248F, -1.1558F, 0.77F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.3568F, 1.4391F, -0.7683F, 0.2094F, 0.0F, -0.1047F));

		PartDefinition basin_r14 = Compsognathus.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(56, 40).mirror().addBox(-0.493F, 0.0452F, -0.0904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.0249F, 3.8293F, -2.19F, -1.7715F, 0.0F, 0.0F));

		PartDefinition basin_r15 = Compsognathus.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(-0.493F, -0.2776F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0249F, 3.8293F, -2.19F, -1.4748F, 0.0F, 0.0F));

		PartDefinition basin_r16 = Compsognathus.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-0.493F, -0.6817F, -0.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.0249F, 3.8293F, -2.19F, -1.3046F, 0.0F, 0.0F));

		PartDefinition basin_r17 = Compsognathus.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-0.493F, -1.177F, -0.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(42, 48).mirror().addBox(-0.493F, -0.677F, -0.3174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.0249F, 3.8293F, -2.19F, -1.5664F, 0.0F, 0.0F));

		PartDefinition basin_r18 = Compsognathus.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(37, 48).mirror().addBox(-0.493F, -0.9913F, -1.1598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0249F, 3.8293F, -2.19F, -0.3447F, 0.0F, 0.0F));

		PartDefinition basin_r19 = Compsognathus.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-0.4174F, 0.9842F, -0.8661F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4568F, 1.0391F, -0.7683F, -0.5847F, 0.0F, -0.1745F));

		PartDefinition basin_r20 = Compsognathus.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.4174F, -0.4672F, -0.7518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4568F, 1.0391F, -0.7683F, -0.6632F, 0.0F, -0.1745F));

		PartDefinition basin_r21 = Compsognathus.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(60, 3).addBox(-0.0568F, -2.47F, -1.3958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, -0.2923F, 0.0F, -0.0873F));

		PartDefinition basin_r22 = Compsognathus.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(30, 55).addBox(-0.0568F, -2.7614F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, 0.2313F, 0.0F, -0.0873F));

		PartDefinition basin_r23 = Compsognathus.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(56, 34).addBox(-0.0568F, -2.9984F, -0.1877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, 0.5411F, 0.0F, -0.0873F));

		PartDefinition basin_r24 = Compsognathus.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(30, 44).addBox(-0.0568F, -2.9434F, -0.982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, 0.0349F, 0.0F, -0.0873F));

		PartDefinition basin_r25 = Compsognathus.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(56, 40).addBox(-0.507F, 0.0452F, -0.0904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.0249F, 3.8293F, -2.19F, -1.7715F, 0.0F, 0.0F));

		PartDefinition basin_r26 = Compsognathus.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(35, 55).addBox(-0.507F, -0.2776F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0249F, 3.8293F, -2.19F, -1.4748F, 0.0F, 0.0F));

		PartDefinition basin_r27 = Compsognathus.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(56, 37).addBox(-0.507F, -0.6817F, -0.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.0249F, 3.8293F, -2.19F, -1.3046F, 0.0F, 0.0F));

		PartDefinition basin_r28 = Compsognathus.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(40, 55).addBox(-0.507F, -1.177F, -0.3174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(42, 48).addBox(-0.507F, -0.677F, -0.3174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.0249F, 3.8293F, -2.19F, -1.5664F, 0.0F, 0.0F));

		PartDefinition basin_r29 = Compsognathus.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(37, 48).addBox(-0.507F, -0.9913F, -1.1598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0249F, 3.8293F, -2.19F, -0.3447F, 0.0F, 0.0F));

		PartDefinition basin_r30 = Compsognathus.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(32, 48).addBox(-0.5826F, 0.9842F, -0.8661F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4568F, 1.0391F, -0.7683F, -0.5847F, 0.0F, 0.1745F));

		PartDefinition basin_r31 = Compsognathus.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5752F, 0.3777F, 0.051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3568F, 1.4391F, -0.7683F, 0.9774F, 0.0F, 0.1047F));

		PartDefinition basin_r32 = Compsognathus.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(56, 43).addBox(-0.5752F, 2.3164F, 0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(50, 8).addBox(-0.5752F, 0.8164F, 0.2283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3568F, 1.4391F, -0.7683F, 0.8203F, 0.0F, 0.1047F));

		PartDefinition basin_r33 = Compsognathus.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(47, 48).addBox(-0.5752F, -1.1558F, 0.77F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.3568F, 1.4391F, -0.7683F, 0.2094F, 0.0F, 0.1047F));

		PartDefinition basin_r34 = Compsognathus.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(27, 48).addBox(-0.5826F, -0.4672F, -0.7518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4568F, 1.0391F, -0.7683F, -0.6632F, 0.0F, 0.1745F));

		PartDefinition basin_r35 = Compsognathus.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(22, 48).addBox(-0.4303F, -1.5539F, -1.1745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, -1.5577F, 0.0F, 0.1047F));

		PartDefinition basin_r36 = Compsognathus.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(47, 16).addBox(-0.4303F, -2.6756F, -0.5129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, -0.0393F, 0.0F, 0.1047F));

		PartDefinition basin_r37 = Compsognathus.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(38, 22).addBox(-0.4303F, -2.7098F, -0.6269F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, -0.3011F, 0.0F, 0.1047F));

		PartDefinition basin_r38 = Compsognathus.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(44, 31).addBox(-0.3936F, -1.346F, 1.2508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, 0.488F, 0.0845F, -0.0229F));

		PartDefinition basin_r39 = Compsognathus.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(35, 31).addBox(-0.0568F, -3.0707F, -0.0063F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2568F, 1.4391F, -0.7683F, -0.2182F, 0.0F, -0.0873F));

		PartDefinition leftLeg1 = Compsognathus.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1043F, -0.0644F, 0.0973F, -0.851F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftLeg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 45).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5045F, -0.5429F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 60).addBox(-0.5F, -0.1568F, -0.1535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.0545F, -0.2179F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.275F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 2.5045F, -0.5429F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 6).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 4.5506F, 0.4592F, 1.1083F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(13, 23).addBox(-0.7F, -0.0054F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(0, 61).addBox(-0.7F, 5.3946F, -0.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 61).addBox(-0.7F, -0.0054F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.8941F, 0.4573F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 37).addBox(-0.6F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 58).addBox(-1.4F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7F, 0.8446F, -0.272F, 0.576F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(7, 41).addBox(-0.2F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 41).addBox(-0.6F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 6.4235F, 0.5195F, -1.6144F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(9, 37).addBox(-0.9F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 1.7439F, 0.0227F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(36, 0).addBox(-1.4F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.4F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = Compsognathus.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1043F, -0.086F, 0.0583F, -0.1558F, 0.0F, 0.0F));

		PartDefinition cube_r7 = rightLeg1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 45).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5045F, -0.5429F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rightLeg1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 60).mirror().addBox(-0.5F, -0.1568F, -0.1535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0545F, -0.2179F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rightLeg1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -0.275F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5045F, -0.5429F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r10 = rightLeg1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5506F, 0.4592F, 1.1083F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(13, 23).mirror().addBox(-0.3F, -0.0054F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(-0.3F, 5.3946F, -0.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 61).mirror().addBox(-0.3F, -0.0054F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8941F, 0.4573F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r11 = rightLeg2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(-0.4F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(0.4F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.8446F, -0.272F, 0.576F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(7, 41).mirror().addBox(-0.8F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(12, 41).mirror().addBox(-0.4F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4235F, 0.5195F, -0.6981F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(9, 37).mirror().addBox(-1.1F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.3894F, 0.0308F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.6F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.4F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Tail1 = Compsognathus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0502F, 2.575F, 0.3067F, -0.4426F, 0.0413F));

		PartDefinition cube_r13 = Tail1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 64).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 64).addBox(0.0F, -0.875F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 64).addBox(0.0F, -0.925F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 64).addBox(0.0F, -1.025F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0001F, -0.225F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Tail1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 64).addBox(0.0F, 2.8F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 27).addBox(0.0F, 0.6F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 23).addBox(0.0F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9764F, 1.1525F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.4128F, -0.0981F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 1.0147F, 7.4254F, 0.1179F, -0.4731F, -0.0787F));

		PartDefinition cube_r15 = Tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 64).addBox(0.0F, -0.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 51).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 64).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2128F, 0.4019F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(63, 64).addBox(0.0F, 7.4F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 64).addBox(0.0F, 6.3F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 12).addBox(0.0F, 5.2F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 64).addBox(0.0F, 4.0F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0384F, -6.2729F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.1872F, 8.8019F, 0.1776F, 0.1745F, 0.0005F));

		PartDefinition cube_r17 = Tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, -0.5F, 1.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 4.55F, -0.0931F, 0.3924F, 0.0145F));

		PartDefinition cube_r18 = Tail4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 22).addBox(-1.0F, 0.0228F, 1.9937F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2813F, 6.4913F, -0.2768F, 0.2101F, -0.0592F));

		PartDefinition cube_r19 = Tail5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0227F, 1.9937F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body = Compsognathus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, 0.0539F, 0.2594F, 0.0569F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 31).addBox(-1.0F, -0.1464F, -0.1064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.25F, -0.525F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(33, 64).addBox(-0.5F, -0.8502F, -0.6342F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.125F, -0.7F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(30, 64).addBox(-0.5F, -1.65F, -2.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 64).addBox(-0.5F, -1.55F, -4.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-1.0F, -1.0F, -4.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.7F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 49).mirror().addBox(-1.9408F, -0.417F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -1.1059F, 0.1033F, 0.1491F, -1.213F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 47).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -1.1059F, 0.1535F, 0.0628F, -0.7469F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -3.1059F, 0.1475F, 0.2238F, -1.0472F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 45).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -3.1059F, 0.2261F, 0.1101F, -0.5831F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-3.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -5.1059F, 0.0196F, 0.4067F, -1.6517F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(45, 29).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -5.1059F, 0.2343F, 0.3361F, -1.0748F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -5.1059F, 0.3521F, 0.1735F, -0.6169F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(62, 47).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -1.1059F, 0.1535F, -0.0628F, 0.7469F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(62, 49).addBox(0.9408F, -0.417F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -1.1059F, 0.1033F, -0.1491F, 1.213F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 45).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -3.1059F, 0.2261F, -0.1101F, 0.5831F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 49).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -3.1059F, 0.1475F, -0.2238F, 1.0472F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 26).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -5.1059F, 0.3521F, -0.1735F, 0.6169F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(45, 29).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -5.1059F, 0.2343F, -0.3361F, 1.0748F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 28).addBox(2.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -5.1059F, 0.0196F, -0.4067F, 1.6517F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(33, 36).addBox(-2.0F, -1.8384F, 0.3142F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 4.2F, -2.2F, -0.4756F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(23, 7).addBox(-2.0F, -1.8387F, -0.1394F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.8F, -3.9F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(24, 36).addBox(-1.5F, -0.9062F, -0.1144F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.5F, -5.6F, -0.2138F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -4.9F, -0.0228F, 0.3065F, 0.0347F));

		PartDefinition cube_r40 = Chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(21, 64).addBox(-0.5F, -0.9727F, -0.1833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 31).addBox(-1.0F, -0.7727F, -0.1833F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.875F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(24, 64).addBox(0.0F, -0.45F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0917F, -1.6335F, 0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(36, 4).mirror().addBox(-1.875F, 0.0F, -0.225F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9702F, 3.2671F, -0.7294F, 0.0553F, 1.1518F, 0.0971F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(-0.5F, -0.2438F, -0.7451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 58).mirror().addBox(-0.5F, 0.3062F, -0.7451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.151F, -2.1365F, 1.0028F, 0.0403F, -0.6622F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5F, 0.1459F, -1.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 49).mirror().addBox(-0.5F, -0.4541F, -1.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.151F, -2.1365F, 1.5831F, 0.0403F, -0.6622F));

		PartDefinition cube_r45 = Chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(57, 46).mirror().addBox(-0.5F, 0.0283F, -1.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.151F, -2.1365F, 0.5708F, 0.0403F, -0.6622F));

		PartDefinition cube_r46 = Chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-0.5F, -0.2853F, -0.8632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.151F, -2.1365F, 0.165F, 0.0403F, -0.6622F));

		PartDefinition cube_r47 = Chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-0.5F, -0.488F, -0.786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 2.151F, -2.1365F, 0.4705F, 0.0403F, -0.6622F));

		PartDefinition cube_r48 = Chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 24).mirror().addBox(-0.875F, 0.0F, -0.225F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9702F, 3.2671F, -0.7294F, -0.0843F, 0.7574F, -0.0361F));

		PartDefinition cube_r49 = Chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(0.3915F, -0.3961F, -0.2865F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6097F, 3.2261F, -2.0865F, 1.4116F, -0.0017F, 0.0376F));

		PartDefinition cube_r50 = Chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.3903F, -0.7122F, -0.4642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7097F, 2.2011F, -1.9615F, 1.117F, 0.0F, 0.1396F));

		PartDefinition cube_r51 = Chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 40).mirror().addBox(-0.3903F, -0.9503F, 0.9613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.7097F, 2.2011F, -1.9615F, 0.9163F, 0.0F, 0.1396F));

		PartDefinition cube_r52 = Chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5249F, -3.8059F, 0.5497F, 0.5471F, -0.7371F));

		PartDefinition cube_r53 = Chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(49, 37).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5249F, -3.8059F, 0.2176F, 0.752F, -1.275F));

		PartDefinition cube_r54 = Chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2249F, -1.8059F, 0.4402F, 0.2328F, -0.6688F));

		PartDefinition cube_r55 = Chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(10, 63).mirror().addBox(-3.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2249F, -1.8059F, 0.0107F, 0.5111F, -1.7255F));

		PartDefinition cube_r56 = Chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(49, 35).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2249F, -1.8059F, 0.2897F, 0.4274F, -1.1239F));

		PartDefinition cube_r57 = Chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(49, 37).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5249F, -3.8059F, 0.2176F, -0.752F, 1.275F));

		PartDefinition cube_r58 = Chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(5, 64).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.5249F, -3.8059F, 0.5497F, -0.5471F, 0.7371F));

		PartDefinition cube_r59 = Chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(49, 35).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2249F, -1.8059F, 0.2897F, -0.4274F, 1.1239F));

		PartDefinition cube_r60 = Chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 63).addBox(2.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2249F, -1.8059F, 0.0107F, -0.5111F, 1.7255F));

		PartDefinition cube_r61 = Chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 64).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2249F, -1.8059F, 0.4402F, -0.2328F, 0.6688F));

		PartDefinition cube_r62 = Chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(30, 40).addBox(-0.6097F, -0.9503F, 0.9613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.7097F, 2.2011F, -1.9615F, 0.9163F, 0.0F, -0.1396F));

		PartDefinition cube_r63 = Chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 24).addBox(-0.5F, -0.488F, -0.786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 2.151F, -2.1365F, 0.4705F, -0.0403F, 0.6622F));

		PartDefinition cube_r64 = Chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(15, 58).addBox(-0.5F, -0.2438F, -0.7451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 58).addBox(-0.5F, 0.3062F, -0.7451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 2.151F, -2.1365F, 1.0028F, -0.0403F, 0.6622F));

		PartDefinition cube_r65 = Chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, 0.1459F, -1.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 49).addBox(-0.5F, -0.4541F, -1.3555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 2.151F, -2.1365F, 1.5831F, -0.0403F, 0.6622F));

		PartDefinition cube_r66 = Chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 46).addBox(-0.5F, 0.0283F, -1.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 2.151F, -2.1365F, 0.5708F, -0.0403F, 0.6622F));

		PartDefinition cube_r67 = Chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 27).addBox(-0.5F, -0.2853F, -0.8632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 2.151F, -2.1365F, 0.165F, -0.0403F, 0.6622F));

		PartDefinition cube_r68 = Chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 41).addBox(-0.6097F, -0.7122F, -0.4642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7097F, 2.2011F, -1.9615F, 1.117F, 0.0F, -0.1396F));

		PartDefinition cube_r69 = Chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 4).addBox(-1.3915F, -0.3961F, -0.2865F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6097F, 3.2261F, -2.0865F, 1.4116F, 0.0017F, -0.0376F));

		PartDefinition cube_r70 = Chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(36, 4).addBox(-0.125F, 0.0F, -0.225F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9702F, 3.2671F, -0.7294F, 0.0553F, -1.1518F, -0.0971F));

		PartDefinition cube_r71 = Chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(62, 24).addBox(-0.125F, 0.0F, -0.225F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9702F, 3.2671F, -0.7294F, -0.0843F, -0.7574F, 0.0361F));

		PartDefinition leftArm1 = Chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9028F, 2.6817F, -1.8025F, 1.3349F, 0.3187F, -0.1359F));

		PartDefinition cube_r72 = leftArm1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(52, 22).addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0059F, 0.0029F, 0.1845F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftArm1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 18).addBox(-0.5F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0059F, 1.8659F, -0.5986F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftArm1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 15).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 50).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0059F, 0.4353F, -0.1475F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(51, 39).addBox(-0.45F, -0.2023F, -0.572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 18).addBox(-0.45F, 1.0977F, -0.572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0419F, 2.011F, -0.6298F, -1.5712F, 0.0387F, -0.0202F));

		PartDefinition cube_r75 = leftArm2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(57, 21).addBox(-1.75F, -0.7F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 57).addBox(-1.75F, -1.0F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftArm2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(51, 31).addBox(-1.75F, 0.5F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.2F, -0.85F, 0.6F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(5, 51).addBox(-0.9841F, 0.0496F, -0.1032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2277F, 1.6973F, -0.3243F, 0.0938F, -0.074F, 0.0559F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftFinger.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(20, 61).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = Chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9028F, 2.6817F, -1.8025F, 1.1167F, -0.3187F, 0.1359F));

		PartDefinition cube_r78 = rightArm1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 22).mirror().addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.0029F, 0.1845F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightArm1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(57, 18).mirror().addBox(-0.5F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 1.8659F, -0.5986F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightArm1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(57, 15).mirror().addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 50).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.4353F, -0.1475F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(51, 39).mirror().addBox(-0.55F, -0.2023F, -0.572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(62, 18).mirror().addBox(-0.55F, 1.0977F, -0.572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0419F, 2.011F, -0.6298F, -1.833F, -0.0387F, 0.0202F));

		PartDefinition cube_r81 = rightArm2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 21).mirror().addBox(0.75F, -0.7F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 57).mirror().addBox(0.75F, -1.0F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.95F, 0.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightArm2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(51, 31).mirror().addBox(0.75F, 0.5F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.85F, 0.6F, 0.0611F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(5, 51).mirror().addBox(-0.0159F, 0.0496F, -0.1032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2277F, 1.6973F, -0.3243F, 0.0938F, 0.074F, -0.0559F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightFinger.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(20, 61).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2385F, -3.1381F, -0.16F, 0.3404F, 0.1565F));

		PartDefinition cube_r84 = Neck3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(18, 64).addBox(0.0F, -1.1106F, 0.3841F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 36).addBox(-0.5F, -0.9106F, 0.3841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -0.7072F, -3.0332F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r85 = Neck3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(23, 44).mirror().addBox(-0.5F, -0.5294F, -0.292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7072F, -2.3332F, -0.534F, -0.1886F, 0.1104F));

		PartDefinition cube_r86 = Neck3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(23, 44).addBox(-0.5F, -0.5294F, -0.292F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7072F, -2.3332F, -0.534F, 0.1886F, -0.1104F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8721F, -2.1477F, 0.1202F, 0.5142F, 0.1353F));

		PartDefinition cube_r87 = Neck2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(14, 47).addBox(0.0F, 0.35F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 7).addBox(-0.5F, 0.6F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.8842F, -2.0138F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(37, 44).mirror().addBox(-0.2126F, -0.657F, -0.2336F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.9351F, -1.7856F, -0.8328F, -0.1535F, 0.071F));

		PartDefinition cube_r89 = Neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(37, 44).addBox(-0.7874F, -0.657F, -0.2336F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.9351F, -1.7856F, -0.8328F, 0.1535F, -0.071F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6781F, -2.1136F, -0.1493F, 0.8279F, 0.3211F));

		PartDefinition cube_r90 = Neck1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(10, 51).addBox(0.0F, -0.475F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3316F, -2.059F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Neck1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(38, 27).addBox(-0.5F, -0.301F, -1.6918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2985F, -0.8508F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Neck1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 3).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3718F, -0.374F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Neck1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 55).mirror().addBox(-0.21F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 9).mirror().addBox(-0.21F, -0.4352F, 0.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1181F, -1.8969F, -0.2524F, -0.1535F, 0.071F));

		PartDefinition cube_r94 = Neck1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-0.2112F, -0.4904F, 0.2759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(62, 0).mirror().addBox(-0.2112F, -0.4904F, -0.2241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1181F, -0.7969F, -0.5142F, -0.1535F, 0.071F));

		PartDefinition cube_r95 = Neck1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(20, 55).addBox(-0.79F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 9).addBox(-0.79F, -0.4352F, 0.2874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 0.1181F, -1.8969F, -0.2524F, 0.1535F, -0.071F));

		PartDefinition cube_r96 = Neck1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(62, 15).addBox(-0.7888F, -0.4904F, 0.2759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(62, 0).addBox(-0.7888F, -0.4904F, -0.2241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1181F, -0.7969F, -0.5142F, 0.1535F, -0.071F));

		PartDefinition cube_r97 = Neck1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 21).addBox(-0.5F, -0.45F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -0.2985F, -1.4508F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0991F, -2.4459F, 0.2304F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 52).mirror().addBox(-0.475F, -0.55F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(54, 52).mirror().addBox(-0.475F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.4772F, -0.2973F, -0.5247F, 0.0F, -0.4625F, 1.5708F));

		PartDefinition cube_r99 = Head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2266F, 2.2755F, -2.2174F, 0.6914F, -0.0865F, -0.0112F));

		PartDefinition cube_r100 = Head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1806F, 2.6367F, -2.7001F, 0.5169F, -0.0865F, -0.0112F));

		PartDefinition cube_r101 = Head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1345F, 3.0225F, -3.1813F, 0.4296F, -0.0865F, -0.0112F));

		PartDefinition cube_r102 = Head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(-0.4375F, -0.0854F, -0.3862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(61, 33).mirror().addBox(-0.4375F, -0.3104F, -0.3862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0875F, 2.7586F, -4.4806F, 0.098F, -0.0865F, -0.0112F));

		PartDefinition cube_r103 = Head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0998F, 3.1061F, -3.5709F, 0.2114F, -0.0865F, -0.0112F));

		PartDefinition cube_r104 = Head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(29, 52).mirror().addBox(-0.2926F, 0.579F, -0.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(52, 28).mirror().addBox(-0.1841F, 0.579F, -0.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(24, 52).mirror().addBox(-0.1341F, 0.979F, -0.9552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 1.8768F, -0.057F, 0.0141F));

		PartDefinition cube_r105 = Head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(43, 8).mirror().addBox(-0.517F, -0.5F, -1.316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.3323F, -2.6285F, 0.7631F, -0.2209F, -0.1098F));

		PartDefinition cube_r106 = Head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-0.6321F, -0.5F, -0.2125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 1.3323F, -2.6285F, 0.7485F, 0.1348F, 0.221F));

		PartDefinition cube_r107 = Head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(-0.1591F, 0.0885F, 1.2981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 55).mirror().addBox(-0.1591F, 0.0885F, 1.9981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.253F, -0.0351F, 0.031F));

		PartDefinition cube_r108 = Head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-0.5625F, -0.2502F, 0.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 9).mirror().addBox(-0.5625F, -0.2502F, -0.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 6).mirror().addBox(-0.5625F, -0.2502F, -0.2153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 55).mirror().addBox(-0.5625F, -0.2502F, -0.4153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0875F, 2.7586F, -4.4806F, 0.7656F, -0.0865F, -0.0112F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 3).mirror().addBox(-0.5625F, -0.2936F, 0.7765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0875F, 2.7586F, -4.4806F, 0.3816F, -0.0865F, -0.0112F));

		PartDefinition cube_r110 = Head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-0.5375F, -0.6581F, -0.1441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 54).mirror().addBox(-0.5375F, -0.6581F, -0.294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.1875F, 1.9578F, -2.5637F, 0.6909F, -0.123F, -0.0689F));

		PartDefinition cube_r111 = Head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(-0.5375F, -0.6641F, -0.7396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1875F, 1.9578F, -2.5637F, 0.8262F, -0.123F, -0.0689F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(49, 52).mirror().addBox(-0.5375F, -0.4782F, -0.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(52, 46).mirror().addBox(-0.5375F, -0.4782F, -0.6259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1875F, 1.9578F, -2.5637F, 0.4291F, -0.123F, -0.0689F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.5375F, -0.4695F, -0.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.1875F, 1.9578F, -2.5637F, 0.5295F, -0.123F, -0.0689F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.2841F, 0.4649F, 1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(39, 52).mirror().addBox(-0.2841F, 0.1649F, 1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.4799F, -0.0351F, 0.031F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(54, 52).mirror().addBox(-0.2841F, -0.9429F, 1.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.1658F, -0.0351F, 0.031F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(25, 61).mirror().addBox(-0.0563F, -0.2089F, -1.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 2.5448F, -0.1348F, 0.004F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(52, 25).mirror().addBox(-0.1341F, 0.5388F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 2.1429F, -0.057F, 0.0141F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-0.1341F, 0.3889F, -1.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 2.6534F, -0.057F, 0.0141F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(60, 55).mirror().addBox(-0.1341F, 0.4922F, -1.4935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 2.2171F, -0.057F, 0.0141F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(52, 19).mirror().addBox(-0.0563F, 0.5046F, -0.7227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 1.4802F, -0.1348F, 0.004F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(19, 52).mirror().addBox(-0.0563F, -0.0164F, 0.1257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.433F, -0.1348F, 0.004F));

		PartDefinition cube_r122 = Head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(23, 40).mirror().addBox(-0.0719F, 0.0007F, -0.1695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(37, 40).mirror().addBox(-0.0719F, 0.4007F, -0.1695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.4267F, -0.0848F, -0.0109F));

		PartDefinition cube_r123 = Head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(47, 12).mirror().addBox(-0.4375F, -0.3702F, -0.0875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(40, 61).mirror().addBox(-0.4375F, -0.1702F, 0.7625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 39).mirror().addBox(-0.4375F, -0.1702F, 0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(61, 36).mirror().addBox(-0.4375F, -0.1702F, 0.2875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0875F, 2.7586F, -4.4806F, 0.3772F, -0.0865F, -0.0112F));

		PartDefinition cube_r124 = Head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(35, 61).mirror().addBox(-0.4375F, -0.2842F, -0.0263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.0875F, 2.7586F, -4.4806F, 0.194F, -0.0865F, -0.0112F));

		PartDefinition cube_r125 = Head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.4375F, -0.3327F, -0.3791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.0875F, 2.7586F, -4.4806F, 0.6609F, -0.0865F, -0.0112F));

		PartDefinition cube_r126 = Head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(61, 30).mirror().addBox(-0.4625F, -0.3279F, -0.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1875F, 1.9578F, -2.5637F, 0.6866F, -0.123F, -0.0689F));

		PartDefinition cube_r127 = Head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-0.4625F, -0.301F, -0.8895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1875F, 1.9578F, -2.5637F, 0.499F, -0.123F, -0.0689F));

		PartDefinition cube_r128 = Head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(45, 25).mirror().addBox(-0.4625F, -0.8094F, -0.9397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1875F, 1.9578F, -2.5637F, 0.7346F, -0.123F, -0.0689F));

		PartDefinition cube_r129 = Head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.0719F, -0.0501F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.8412F, -0.0848F, -0.0109F));

		PartDefinition cube_r130 = Head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(-0.1591F, -0.3143F, 1.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 55).addBox(0.4841F, -0.3143F, 1.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.1591F, -0.5702F, 1.7643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(52, 0).addBox(0.4841F, -0.5702F, 1.7643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(-0.1591F, 0.4762F, 1.7361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(20, 58).addBox(0.4841F, 0.4762F, 1.7361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.8464F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(43, 4).mirror().addBox(-0.1591F, -0.6581F, 1.0082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.2007F, -0.0351F, 0.031F));

		PartDefinition cube_r134 = Head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(34, 52).mirror().addBox(-0.0719F, -0.1194F, 0.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.9893F, -2.5377F, 0.7452F, -0.0848F, -0.0109F));

		PartDefinition cube_r135 = Head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(61, 30).addBox(-0.5375F, -0.3279F, -0.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1875F, 1.9578F, -2.5637F, 0.6866F, 0.123F, 0.0689F));

		PartDefinition cube_r136 = Head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(30, 61).addBox(-0.5375F, -0.301F, -0.8895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1875F, 1.9578F, -2.5637F, 0.499F, 0.123F, 0.0689F));

		PartDefinition cube_r137 = Head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 12).addBox(-0.5625F, -0.3702F, -0.0875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F))
				.texOffs(40, 61).addBox(-0.5625F, -0.1702F, 0.7625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 39).addBox(-0.5625F, -0.1702F, 0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(61, 36).addBox(-0.5625F, -0.1702F, 0.2875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0875F, 2.7586F, -4.4806F, 0.3772F, 0.0865F, 0.0112F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(60, 61).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2266F, 2.2755F, -2.2174F, 0.6914F, 0.0865F, 0.0112F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(55, 61).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1806F, 2.6367F, -2.7001F, 0.5169F, 0.0865F, 0.0112F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(50, 61).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1345F, 3.0225F, -3.1813F, 0.4296F, 0.0865F, 0.0112F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(61, 42).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0998F, 3.1061F, -3.5709F, 0.2114F, 0.0865F, 0.0112F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 61).addBox(-0.5625F, -0.2842F, -0.0263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0875F, 2.7586F, -4.4806F, 0.194F, 0.0865F, 0.0112F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(45, 61).addBox(-0.5625F, -0.0854F, -0.3862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(61, 33).addBox(-0.5625F, -0.3104F, -0.3862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0875F, 2.7586F, -4.4806F, 0.098F, 0.0865F, 0.0112F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(7, 47).addBox(-0.5625F, -0.3327F, -0.3791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.0875F, 2.7586F, -4.4806F, 0.6609F, 0.0865F, 0.0112F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(55, 55).addBox(-0.3679F, -0.5F, -0.2125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4586F, 1.3323F, -2.6285F, 0.7485F, -0.1348F, -0.221F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(43, 8).addBox(-0.483F, -0.5F, -1.316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.4586F, 1.3323F, -2.6285F, 0.7631F, 0.2209F, 0.1098F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(45, 25).addBox(-0.5375F, -0.8094F, -0.9397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1875F, 1.9578F, -2.5637F, 0.7346F, 0.123F, 0.0689F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(15, 61).addBox(-0.9281F, -0.0501F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.8412F, 0.0848F, 0.0109F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(34, 52).addBox(-0.9281F, -0.1194F, 0.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.7452F, 0.0848F, 0.0109F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(25, 61).addBox(-0.9437F, -0.2089F, -1.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 2.5448F, 0.1348F, -0.004F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(52, 25).addBox(-0.8659F, 0.5388F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 2.1429F, 0.057F, -0.0141F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 16).addBox(-0.8659F, 0.3889F, -1.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 2.6534F, 0.057F, -0.0141F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(29, 52).addBox(-0.7074F, 0.579F, -0.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(52, 28).addBox(-0.8159F, 0.579F, -0.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 52).addBox(-0.8659F, 0.979F, -0.9552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 1.8768F, 0.057F, -0.0141F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 55).addBox(-0.8659F, 0.4922F, -1.4935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 2.2171F, 0.057F, -0.0141F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(52, 19).addBox(-0.9437F, 0.5046F, -0.7227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 1.4802F, 0.1348F, -0.004F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(54, 12).addBox(-0.4625F, -0.6581F, -0.1441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 54).addBox(-0.4625F, -0.6581F, -0.294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.1875F, 1.9578F, -2.5637F, 0.6909F, 0.123F, 0.0689F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(52, 49).addBox(-0.4625F, -0.6641F, -0.7396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1875F, 1.9578F, -2.5637F, 0.8262F, 0.123F, 0.0689F));

		PartDefinition cube_r158 = Head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(15, 55).addBox(-0.4375F, -0.2502F, 0.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 9).addBox(-0.4375F, -0.2502F, -0.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 6).addBox(-0.4375F, -0.2502F, -0.2153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 55).addBox(-0.4375F, -0.2502F, -0.4153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0875F, 2.7586F, -4.4806F, 0.7656F, 0.0865F, 0.0112F));

		PartDefinition cube_r159 = Head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(55, 3).addBox(-0.4375F, -0.2936F, 0.7765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0875F, 2.7586F, -4.4806F, 0.3816F, 0.0865F, 0.0112F));

		PartDefinition cube_r160 = Head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(49, 52).addBox(-0.4625F, -0.4782F, -0.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(52, 46).addBox(-0.4625F, -0.4782F, -0.6259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1875F, 1.9578F, -2.5637F, 0.4291F, 0.123F, 0.0689F));

		PartDefinition cube_r161 = Head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(44, 52).addBox(-0.4625F, -0.4695F, -0.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.1875F, 1.9578F, -2.5637F, 0.5295F, 0.123F, 0.0689F));

		PartDefinition cube_r162 = Head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 55).addBox(-0.7159F, 0.4649F, 1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(39, 52).addBox(-0.7159F, 0.1649F, 1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.4799F, 0.0351F, -0.031F));

		PartDefinition cube_r163 = Head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(54, 52).addBox(-0.525F, -0.55F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(54, 52).addBox(-0.525F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.4772F, -0.2973F, -0.5247F, 0.0F, 0.4625F, -1.5708F));

		PartDefinition cube_r164 = Head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(54, 52).addBox(-0.7159F, -0.9429F, 1.6922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.1658F, 0.0351F, -0.031F));

		PartDefinition cube_r165 = Head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(19, 52).addBox(-0.9437F, -0.0164F, 0.1257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.433F, 0.1348F, -0.004F));

		PartDefinition cube_r166 = Head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(23, 40).addBox(-0.9281F, 0.0007F, -0.1695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(37, 40).addBox(-0.9281F, 0.4007F, -0.1695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.4267F, 0.0848F, 0.0109F));

		PartDefinition cube_r167 = Head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(43, 4).addBox(-0.8409F, -0.6581F, 1.0082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.2007F, 0.0351F, -0.031F));

		PartDefinition cube_r168 = Head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 55).addBox(-0.8409F, 0.0885F, 1.2981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 55).addBox(-0.8409F, 0.0885F, 1.9981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6625F, 0.9893F, -2.5377F, 0.253F, 0.0351F, -0.031F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1481F, 0.4497F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-0.5573F, -0.3995F, -1.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.7159F, -0.0431F, -0.0249F));

		PartDefinition cube_r170 = Jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-0.5573F, -0.4722F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.8163F, -0.0431F, -0.0249F));

		PartDefinition cube_r171 = Jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 43).mirror().addBox(-0.5573F, -0.5802F, -0.7919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 1.0562F, -0.0431F, -0.0249F));

		PartDefinition cube_r172 = Jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(44, 44).mirror().addBox(-0.5573F, -0.3654F, -2.5325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.346F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.6635F, -0.0431F, -0.0249F));

		PartDefinition cube_r173 = Jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(59, 12).mirror().addBox(-0.7857F, -0.5738F, -3.6636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 58).mirror().addBox(-0.7857F, -0.5738F, -4.0636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 58).mirror().addBox(-0.7857F, -0.5988F, -4.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 58).mirror().addBox(-0.7857F, -0.5988F, -4.8636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 58).mirror().addBox(-0.7857F, -0.5988F, -5.2636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(59, 52).mirror().addBox(-0.7857F, -0.4238F, -5.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 58).mirror().addBox(-0.7857F, -0.4238F, -5.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false)
				.texOffs(45, 21).mirror().addBox(-0.7857F, -0.4238F, -5.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.6854F, -0.1519F, -0.0702F));

		PartDefinition cube_r174 = Jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-0.7857F, -0.3203F, -3.7547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.6549F, -0.1519F, -0.0702F));

		PartDefinition cube_r175 = Jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.7857F, -0.7947F, -3.7693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.7945F, -0.1519F, -0.0702F));

		PartDefinition cube_r176 = Jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(44, 40).mirror().addBox(-0.5573F, -0.5842F, -2.5387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.6854F, -0.0431F, -0.0249F));

		PartDefinition cube_r177 = Jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(40, 17).mirror().addBox(-0.5573F, -0.5224F, -1.2521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.0477F, 0.0433F, 0.6155F, -0.0431F, -0.0249F));

		PartDefinition cube_r178 = Jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(30, 58).addBox(-0.4427F, -0.3995F, -1.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.7159F, 0.0431F, 0.0249F));

		PartDefinition cube_r179 = Jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(25, 58).addBox(-0.4427F, -0.4722F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.8163F, 0.0431F, 0.0249F));

		PartDefinition cube_r180 = Jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(51, 43).addBox(-0.4427F, -0.5802F, -0.7919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 1.0562F, 0.0431F, 0.0249F));

		PartDefinition cube_r181 = Jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 44).addBox(-0.4427F, -0.3654F, -2.5325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.346F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.6635F, 0.0431F, 0.0249F));

		PartDefinition cube_r182 = Jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(59, 12).addBox(-0.2143F, -0.5738F, -3.6636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 58).addBox(-0.2143F, -0.5738F, -4.0636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 58).addBox(-0.2143F, -0.5988F, -4.4636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 58).addBox(-0.2143F, -0.5988F, -4.8636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 58).addBox(-0.2143F, -0.5988F, -5.2636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(59, 52).addBox(-0.2143F, -0.4238F, -5.3636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 58).addBox(-0.2143F, -0.4238F, -5.5636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F))
				.texOffs(45, 21).addBox(-0.2143F, -0.4238F, -5.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.6854F, 0.1519F, 0.0702F));

		PartDefinition cube_r183 = Jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(45, 0).addBox(-0.2143F, -0.3203F, -3.7547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.6549F, 0.1519F, 0.0702F));

		PartDefinition cube_r184 = Jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 45).addBox(-0.2143F, -0.7947F, -3.7693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.7945F, 0.1519F, 0.0702F));

		PartDefinition cube_r185 = Jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(44, 40).addBox(-0.4427F, -0.5842F, -2.5387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.6854F, 0.0431F, 0.0249F));

		PartDefinition cube_r186 = Jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(40, 17).addBox(-0.4427F, -0.5224F, -1.2521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.575F, 0.0477F, 0.0433F, 0.6155F, 0.0431F, 0.0249F));

		return LayerDefinition.create(meshdefinition, 68, 68);
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