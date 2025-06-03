package fossils.fossils.client.blockentity.model.probactrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProbactrosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public ProbactrosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.6F, 1.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 82).addBox(0.0F, -2.6583F, -0.1462F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1973F, 1.2939F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 77).addBox(0.0F, -3.1492F, 0.028F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9973F, -0.9061F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 78).addBox(0.0F, -3.1211F, -0.031F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0846F, -2.8086F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 78).addBox(0.0F, -3.0F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1846F, -4.7086F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(70, 13).mirror().addBox(-0.5F, -1.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(62, 48).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.388F, 2.1819F, -7.3498F, 0.3915F, 0.2091F, -0.0111F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(-0.1689F, -1.0049F, -1.9851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.951F, 3.233F, -8.4623F, 0.217F, 0.2091F, -0.0111F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(57, 68).mirror().addBox(-0.5F, -0.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0118F, 1.0453F, -10.2287F, 0.4352F, 0.2091F, -0.0111F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 5).mirror().addBox(-0.3274F, 0.8153F, 1.3933F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 41).mirror().addBox(-0.3274F, -0.1847F, -0.1067F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1632F, -2.4739F, -2.3989F, 0.0652F, -0.1434F, 0.0643F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.7648F, -0.4821F, -3.8059F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, -2.1739F, -6.9989F, 0.1642F, 0.1736F, -0.0184F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 15).mirror().addBox(-0.5368F, -0.7732F, -2.1945F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.2261F, -5.3989F, 0.3882F, 0.2048F, -0.0442F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-0.5F, -0.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4917F, 1.2296F, -7.7883F, -0.0361F, 0.2091F, -0.0111F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 11).mirror().addBox(-0.5368F, 0.398F, -2.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.3261F, -5.3989F, -0.3316F, 0.2094F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(0.2332F, -0.694F, -0.2806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 3.9261F, -4.4989F, -0.7602F, 0.3109F, -0.1172F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(63, 15).mirror().addBox(-0.5875F, -0.6093F, -0.2628F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 2.3261F, -6.5989F, -0.6554F, 0.3109F, -0.1172F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-0.5368F, 0.1632F, -2.0915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9632F, 1.2261F, -5.3989F, 0.0042F, 0.2048F, -0.0442F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 73).mirror().addBox(-0.3391F, -0.7985F, -1.686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1511F, -1.4038F, -5.0283F, -0.3681F, 0.1736F, -0.0184F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.3679F, -0.0384F, -2.0401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1632F, -2.9739F, -5.0989F, 0.2058F, 0.1693F, -0.0426F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3115F, -0.849F, -0.8902F, 0.2572F, -0.1434F, 0.0643F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 43).mirror().addBox(-0.5656F, -0.0494F, 0.0103F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1632F, -2.7739F, -0.5989F, -0.3013F, -0.1434F, 0.0643F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-1.4203F, -1.4806F, 5.4233F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 3.2261F, -3.3989F, -1.0175F, 0.3435F, -0.1305F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(-1.4203F, -0.9128F, 5.4414F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 3.2261F, -3.3989F, -0.9128F, 0.3435F, -0.1305F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(41, 54).mirror().addBox(-0.4758F, 3.9613F, -0.8836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1632F, 7.2261F, 0.7011F, -2.133F, 0.366F, -0.0201F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 50).mirror().addBox(-0.3968F, -0.2686F, -4.2123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1632F, 7.2261F, 0.7011F, -0.7463F, 0.3595F, -0.0731F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-0.4758F, 1.0862F, -6.9097F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1632F, 7.2261F, 0.7011F, -1.0684F, 0.366F, -0.0201F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-1.4368F, -3.0379F, -3.5729F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0632F, 2.0261F, -2.3989F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 32).mirror().addBox(-0.4368F, -2.7106F, -3.1363F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 32).addBox(2.5632F, -2.7106F, -3.1363F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0632F, 1.0261F, -2.3989F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4368F, -4.1106F, -3.1363F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 0).addBox(4.5632F, -4.1106F, -3.1363F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0632F, 1.4261F, -2.3989F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 50).addBox(0.7648F, -0.4821F, -3.8059F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, -2.1739F, -6.9989F, 0.1642F, -0.1736F, 0.0184F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 15).addBox(-0.4632F, -0.7732F, -2.1945F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9632F, 1.2261F, -5.3989F, 0.3882F, -0.2048F, 0.0442F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(57, 68).addBox(-0.5F, -0.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0118F, 1.0453F, -10.2287F, 0.4352F, -0.2091F, 0.0111F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4917F, 1.2296F, -7.7883F, -0.0361F, -0.2091F, 0.0111F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(70, 46).addBox(-0.8311F, -1.0049F, -1.9851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.951F, 3.233F, -8.4623F, 0.217F, -0.2091F, 0.0111F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(70, 13).addBox(-0.5F, -1.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(62, 48).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.388F, 2.1819F, -7.3498F, 0.3915F, -0.2091F, 0.0111F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(81, 11).addBox(-0.4632F, 0.398F, -2.8284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9632F, 1.3261F, -5.3989F, -0.3316F, -0.2094F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(50, 2).addBox(-1.2332F, -0.694F, -0.2806F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9632F, 3.9261F, -4.4989F, -0.7602F, -0.3109F, 0.1172F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(63, 15).addBox(-0.4125F, -0.6093F, -0.2628F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.9632F, 2.3261F, -6.5989F, -0.6554F, -0.3109F, 0.1172F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(72, 36).addBox(-0.4632F, 0.1632F, -2.0915F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9632F, 1.2261F, -5.3989F, 0.0042F, -0.2048F, 0.0442F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(22, 73).addBox(-0.6609F, -0.7985F, -1.686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1511F, -1.4038F, -5.0283F, -0.3681F, -0.1736F, 0.0184F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(5, 73).addBox(-0.6321F, -0.0384F, -2.0401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.1632F, -2.9739F, -5.0989F, 0.2058F, -0.1693F, 0.0426F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(65, 25).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.3115F, -0.849F, -0.8902F, 0.2572F, 0.1434F, -0.0643F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 43).addBox(-0.4344F, -0.0494F, 0.0103F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1632F, -2.7739F, -0.5989F, -0.3013F, 0.1434F, -0.0643F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 5).addBox(-0.6726F, 0.8153F, 1.3933F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(69, 41).addBox(-0.6726F, -0.1847F, -0.1067F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1632F, -2.4739F, -2.3989F, 0.0652F, 0.1434F, -0.0643F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(53, 34).addBox(0.4203F, -1.4806F, 5.4233F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 3.2261F, -3.3989F, -1.0175F, -0.3435F, 0.1305F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(53, 40).addBox(0.4203F, -0.9128F, 5.4414F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0632F, 3.2261F, -3.3989F, -0.9128F, -0.3435F, 0.1305F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(41, 54).addBox(-0.5242F, 3.9613F, -0.8836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1632F, 7.2261F, 0.7011F, -2.133F, -0.366F, 0.0201F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(15, 50).addBox(-0.6032F, -0.2686F, -4.2123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1632F, 7.2261F, 0.7011F, -0.7463F, -0.3595F, 0.0731F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5242F, 1.0862F, -6.9097F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1632F, 7.2261F, 0.7011F, -1.0684F, -0.366F, 0.0201F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 39).addBox(0.4368F, -3.0379F, -3.5729F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0632F, 2.0261F, -2.3989F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.0074F, -1.2693F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 0.1F, -3.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 32).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0721F, -0.6261F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(47, 46).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(53, 52).addBox(-1.0F, 0.1F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, 1.1007F, -0.2786F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(35, 48).addBox(-1.9F, 0.1354F, -1.8811F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, 0.1F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 70).addBox(-0.5F, 0.0181F, -1.1346F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 6.1354F, -0.2811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 67).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 5.1354F, -0.7811F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(56, 46).addBox(-1.0F, 0.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(24, 68).addBox(-1.9F, 4.8957F, -0.0956F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.0189F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 63).addBox(-1.9F, -0.2762F, -1.8005F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.0189F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(9, 59).addBox(-1.9F, -4.9341F, -0.987F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0354F, -0.3811F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(47, 15).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.5354F, -1.6811F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(35, 0).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(28, 24).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 0.1F, -3.9F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(18, 4).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0721F, -0.6261F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -5.9811F, -0.287F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(53, 28).addBox(-1.0F, 0.1F, -1.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.8839F, -0.9984F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(44, 55).addBox(-1.0F, 1.1007F, -0.2786F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, -2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(8, 48).addBox(-0.1F, 0.1354F, -1.8811F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, 0.1F, 0.9431F, 0.0042F, -0.0059F));

		PartDefinition cube_r64 = rightLeg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(52, 67).addBox(-0.5F, 0.0181F, -1.1346F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2F, 6.1354F, -0.2811F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(14, 66).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 5.1354F, -0.7811F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(13, 32).addBox(-1.0F, 0.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(19, 40).addBox(-0.1F, 4.8957F, -0.0956F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.0189F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(7, 66).addBox(-0.1F, -0.2762F, -1.8005F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.1354F, 0.0189F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(53, 58).addBox(-0.1F, -4.9341F, -0.987F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0354F, -0.3811F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(24, 45).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.5354F, -1.6811F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -0.0319F, -3.2504F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.1658F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(15, 26).addBox(-2.0F, -0.3F, -3.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 40).addBox(-0.5F, -1.0766F, -0.2972F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.3F, -0.0709F, 0.1741F, -0.0123F));

		PartDefinition cube_r70 = tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(48, 76).addBox(0.0F, -2.7F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0766F, 3.7028F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 81).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3159F, 6.802F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(73, 81).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4688F, 8.8844F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 81).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5241F, 10.9452F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(13, 4).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0912F, 12.8978F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -2.3F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6702F, 14.8555F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(25, 78).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5738F, 0.9033F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 82).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3583F, 4.7628F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(22, 77).addBox(0.0F, -1.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0101F, 2.637F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(3, 82).addBox(0.0F, -2.9F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9766F, 1.7028F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(6, 82).addBox(0.0F, -2.411F, -0.0155F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2766F, 12.6028F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, -2.5377F, 0.0832F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2766F, 10.5028F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(9, 82).addBox(0.0F, -2.5679F, 0.082F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2766F, 8.5028F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 78).addBox(0.0F, -2.5016F, -0.0192F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2766F, 6.6028F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(64, 77).addBox(0.0F, -2.7317F, -0.0134F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0766F, 4.6028F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6766F, 4.7028F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8766F, 13.6028F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition cube_r86 = tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(63, 63).addBox(0.0F, -1.0298F, -0.0644F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7113F, 9.0357F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -2.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7206F, 2.3576F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(41, 24).addBox(0.0F, -2.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5064F, 4.408F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(44, 32).addBox(0.0F, -2.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1983F, 6.4242F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(57, 2).addBox(0.0F, -2.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8901F, 8.4404F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(67, 30).addBox(0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2061F, 10.3198F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(15, 82).addBox(0.0F, -1.3383F, -0.0859F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6113F, 7.0357F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(32, 82).addBox(0.0F, -1.4578F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6113F, 4.9357F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(82, 43).addBox(0.0F, -1.7307F, -0.0974F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5212F, 3.0385F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(45, 82).addBox(0.0F, -2.22F, 0.0438F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3512F, 0.8258F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1999F, -0.014F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 16).addBox(-0.5F, -0.0288F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.6999F, 9.886F, -0.0804F, 0.2175F, -0.0174F));

		PartDefinition cube_r97 = tail3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(22, 51).addBox(0.0F, -0.8744F, -0.0978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 5.0004F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(33, 59).addBox(0.0F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9494F, 2.82F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 58).addBox(0.0F, -1.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6694F, 6.8551F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(61, 28).addBox(0.0F, -1.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8094F, 4.8376F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(47, 62).addBox(0.0F, -0.9477F, 0.0009F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 2.9004F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(63, 15).addBox(0.0F, -1.0174F, -0.0003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0712F, 0.9004F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(33, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 7.8004F, -0.186F, -0.1716F, 0.0321F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(17, 32).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.9F, -0.2303F, -0.17F, 0.0396F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -5.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(39, 78).addBox(0.0F, -3.1586F, 0.0534F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9138F, -1.1575F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(42, 78).addBox(0.0F, -2.9677F, -0.0777F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8716F, -3.0182F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(12, 12).addBox(0.0F, -2.7215F, -0.0896F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7525F, -4.992F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(61, 73).addBox(0.0F, -2.8577F, 0.026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2262F, -7.0006F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(32, 75).addBox(0.0F, -2.8829F, -0.1344F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2738F, -8.8006F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(45, 76).addBox(0.0F, -2.5667F, -6.1256F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1738F, -4.8006F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(24, 15).addBox(-0.5F, -0.0486F, -0.0015F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8738F, -10.8006F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(26, 4).mirror().addBox(-2.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0308F, -0.4562F, -0.0623F, -0.4811F, -1.0495F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0308F, -0.4562F, -0.2488F, -0.3481F, -0.5943F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1308F, -2.3562F, -0.1843F, -0.3076F, -0.5435F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1308F, -2.3562F, -0.021F, -0.418F, -0.9959F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(76, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4308F, -10.2562F, 0.4106F, 0.1203F, -0.4204F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4308F, -10.2562F, 0.3365F, 0.2193F, -0.8519F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(42, 12).mirror().addBox(-10.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4308F, -10.2562F, 0.2139F, 0.3399F, -1.2888F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(76, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0308F, -8.3562F, 0.3148F, 0.0771F, -0.4299F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0308F, -8.3562F, 0.2669F, 0.1401F, -0.8643F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(33, 19).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0308F, -8.3562F, 0.184F, 0.2392F, -1.2973F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3308F, -6.3562F, 0.1203F, -0.0334F, -0.8722F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(77, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3308F, -6.3562F, 0.1088F, -0.0184F, -0.436F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(77, 23).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1308F, -4.2562F, -0.0635F, -0.2455F, -0.8464F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(77, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1308F, -4.2562F, -0.1461F, -0.1345F, -0.4164F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(26, 4).addBox(1.8126F, -0.836F, -0.3751F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0308F, -0.4562F, -0.0623F, 0.4811F, 1.0495F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(75, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0308F, -0.4562F, -0.2488F, 0.3481F, 0.5943F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1308F, -2.3562F, -0.1843F, 0.3076F, 0.5435F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(76, 42).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1308F, -2.3562F, -0.021F, 0.418F, 0.9959F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(76, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4308F, -10.2562F, 0.4106F, -0.1203F, 0.4204F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(76, 60).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4308F, -10.2562F, 0.3365F, -0.2193F, 0.8519F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(42, 12).addBox(3.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4308F, -10.2562F, 0.2139F, -0.3399F, 1.2888F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(76, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0308F, -8.3562F, 0.3148F, -0.0771F, 0.4299F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(77, 0).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0308F, -8.3562F, 0.2669F, -0.1401F, 0.8643F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(33, 19).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0308F, -8.3562F, 0.184F, -0.2392F, 1.2973F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(5, 77).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3308F, -6.3562F, 0.1203F, 0.0334F, 0.8722F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(77, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3308F, -6.3562F, 0.1088F, 0.0184F, 0.436F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(77, 23).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1308F, -4.2562F, -0.0635F, 0.2455F, 0.8464F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(77, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1308F, -4.2562F, -0.1461F, 0.1345F, 0.4164F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(11, 40).addBox(-0.5F, 0.0499F, 0.006F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8262F, -5.0006F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9738F, -10.4006F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-0.5263F, 0.0202F, -0.5447F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 10.46F, -3.269F, -0.4033F, -0.8974F, 0.6357F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(42, 6).mirror().addBox(-0.2238F, 0.1379F, -0.276F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 10.16F, -4.069F, -0.4211F, -1.0768F, 0.7611F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7534F, 1.2955F, -1.6528F, 0.6635F, 0.0061F, 0.0871F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.5379F, -0.0317F, -0.2268F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 10.16F, -4.069F, -0.1664F, -1.3253F, 0.6806F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-1.0F, 0.2313F, 2.4064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 53).addBox(0.0F, 0.2313F, 2.4064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, -7.7F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-2.0F, -0.2705F, -0.398F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 54).addBox(0.0F, -0.2705F, -0.398F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, -7.7F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-2.7462F, 0.491F, -0.0364F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.467F, 0.1451F, -0.413F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-4.6652F, -0.6955F, 0.141F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3782F, 0.2651F, -0.8419F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-9.9341F, -2.6019F, 0.141F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.2323F, 0.3985F, -1.2821F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-2.6195F, 0.5189F, 1.9876F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3946F, 0.1132F, -0.4223F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-4.4356F, -0.5895F, 2.1533F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3248F, 0.2062F, -0.8544F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(13, 0).mirror().addBox(-10.7709F, -2.4088F, 2.1533F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.2088F, 0.3231F, -1.2904F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-2.3698F, 0.2632F, 3.9005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3307F, 0.0844F, -0.4286F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(13, 2).mirror().addBox(-10.3176F, -2.3096F, 4.0432F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.1888F, 0.256F, -1.2961F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 45).mirror().addBox(-3.9829F, -0.6911F, 4.0432F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.2784F, 0.1533F, -0.8627F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(22, 52).mirror().addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7151F, 0.8799F, -1.3126F, 0.5064F, 0.0061F, 0.0871F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(67, 3).mirror().addBox(-1.0F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7133F, 7.5087F, -7.1236F, 1.4214F, -0.7026F, -1.2809F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-0.3413F, -1.2324F, -0.405F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 6.485F, -8.0282F, 1.1498F, -0.2273F, -0.2528F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-0.5195F, 0.0436F, -1.6749F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 1.085F, -3.6282F, 0.7071F, 0.0061F, 0.0871F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(26, 30).mirror().addBox(-0.84F, 0.0547F, -0.2264F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 32).mirror().addBox(-0.84F, 0.5547F, -0.2264F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7275F, 4.485F, -7.7282F, 0.6897F, 0.0061F, 0.0871F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(26, 38).addBox(-0.4737F, 0.0202F, -0.5447F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 10.46F, -3.269F, -0.4033F, 0.8974F, -0.6357F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(42, 6).addBox(-0.7762F, 0.1379F, -0.276F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 10.16F, -4.069F, -0.4211F, 1.0768F, -0.7611F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(7, 54).addBox(-0.4621F, -0.0317F, -0.2268F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 10.16F, -4.069F, -0.1664F, 1.3253F, -0.6806F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 80).addBox(0.0F, -4.5924F, 3.3998F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(81, 14).addBox(0.0F, -3.3579F, 1.6794F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(19, 81).addBox(0.0F, -2.5138F, 0.1406F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(71, 34).addBox(0.7462F, 0.491F, -0.0364F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.467F, -0.1451F, 0.413F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(74, 27).addBox(2.6652F, -0.6955F, 0.141F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3782F, -0.2651F, 0.8419F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(48, 0).addBox(3.9341F, -2.6019F, 0.141F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.2323F, -0.3985F, 1.2821F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(74, 40).addBox(0.6195F, 0.5189F, 1.9876F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3946F, -0.1132F, 0.4223F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 69).addBox(2.4356F, -0.5895F, 2.1533F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3248F, -0.2062F, 0.8544F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(13, 0).addBox(3.7709F, -2.4088F, 2.1533F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.2088F, -0.3231F, 1.2904F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(75, 13).addBox(0.3698F, 0.2632F, 3.9005F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.3307F, -0.0844F, 0.4286F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(13, 2).addBox(3.3176F, -2.3096F, 4.0432F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.1888F, -0.256F, 1.2961F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(75, 45).addBox(1.9829F, -0.6911F, 4.0432F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.2784F, -0.1533F, 0.8627F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(65, 20).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.7534F, 1.2955F, -1.6528F, 0.6635F, -0.0061F, -0.0871F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(22, 52).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7151F, 0.8799F, -1.3126F, 0.5064F, -0.0061F, -0.0871F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(67, 3).addBox(0.0F, -1.9F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7133F, 7.5087F, -7.1236F, 1.4214F, 0.7026F, 1.2809F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(45, 67).addBox(-0.6587F, -1.2324F, -0.405F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7275F, 6.485F, -8.0282F, 1.1498F, 0.2273F, 0.2528F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(39, 17).addBox(-0.4805F, 0.0436F, -1.6749F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7275F, 1.085F, -3.6282F, 0.7071F, -0.0061F, -0.0871F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(26, 30).addBox(-0.16F, 0.0547F, -0.2264F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(35, 32).addBox(-0.16F, 0.5547F, -0.2264F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7275F, 4.485F, -7.7282F, 0.6897F, -0.0061F, -0.0871F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.0541F, -0.1103F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.4276F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(26, 40).addBox(-0.4356F, 0.3322F, -0.971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 73).addBox(-1.1356F, -0.6678F, -0.971F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, 6.9883F, -6.5343F, 0.8995F, -0.0076F, -0.1744F));

		PartDefinition cube_r181 = leftArm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(24, 15).addBox(-1.2373F, 1.8543F, -1.4871F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, 0.1258F, -0.1467F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftArm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(42, 6).addBox(-1.0347F, -0.7346F, -0.6213F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8017F, 0.1258F, -0.1467F, -0.2269F, -0.48F, 0.0F));

		PartDefinition cube_r183 = leftArm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(76, 16).addBox(-1.0347F, 0.5515F, -2.5276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, 0.1258F, -0.1467F, 0.8465F, -0.48F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(28, 58).addBox(0.0F, 0.0F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(23, 58).addBox(0.0F, 0.0F, -1.7F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1326F, 6.2005F, 0.9431F, -1.1102F, 0.4228F, -0.0958F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(33, 64).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 7.9F, -1.6F, 0.1265F, 0.3067F, 0.2896F));

		PartDefinition cube_r184 = leftArm3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(75, 78).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftArm3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(29, 52).addBox(-0.4652F, 0.3346F, -0.9511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(35, 74).addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(34, 11).addBox(-0.5644F, 0.3322F, -0.971F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 23).addBox(-0.8644F, -0.6678F, -0.971F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 6.9883F, -6.5343F, -0.4531F, 0.0076F, 0.1744F));

		PartDefinition cube_r186 = rightArm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 24).addBox(0.2373F, 1.8543F, -1.4871F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8017F, 0.1258F, -0.1467F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightArm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(35, 30).addBox(0.0347F, -0.7346F, -0.6213F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8017F, 0.1258F, -0.1467F, -0.2269F, 0.48F, 0.0F));

		PartDefinition cube_r188 = rightArm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(74, 74).addBox(0.0347F, 0.5515F, -2.5276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8017F, 0.1258F, -0.1467F, 0.8465F, 0.48F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(58, 13).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(18, 57).addBox(-1.0F, 0.0F, -1.7F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1326F, 6.2005F, 0.9431F, -1.2F, -0.1543F, -0.14F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 7.9F, -1.6F, 0.1395F, 0.1684F, -0.2295F));

		PartDefinition cube_r189 = rightArm3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(39, 59).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightArm3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(7, 39).addBox(-0.5348F, 0.3346F, -0.9511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(56, 73).addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 0.4038F, 0.3639F, -0.6092F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.5F, 1.675F, -5.4299F));

		PartDefinition cube_r191 = neck4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(60, 79).addBox(-0.5F, -4.0198F, 2.529F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.682F, -4.0258F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -1.4507F, 0.0463F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.482F, -3.6258F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(50, 9).mirror().addBox(-4.8393F, -0.8109F, -0.3015F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.682F, -3.1258F, 0.4816F, 0.6318F, -1.1086F));

		PartDefinition cube_r194 = neck4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(58, 10).mirror().addBox(-2.0183F, 0.0349F, -0.4279F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.682F, -3.1258F, 0.7184F, 0.4375F, -0.652F));

		PartDefinition cube_r195 = neck4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(33, 17).mirror().addBox(-7.0109F, -2.3422F, -0.1508F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.982F, -1.2258F, 0.1716F, 0.5224F, -1.3512F));

		PartDefinition cube_r196 = neck4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-3.7186F, -0.8503F, -0.1508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.982F, -1.2258F, 0.3839F, 0.4003F, -0.882F));

		PartDefinition cube_r197 = neck4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-1.9349F, -0.0493F, -0.2705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.982F, -1.2258F, 0.5301F, 0.2654F, -0.4421F));

		PartDefinition cube_r198 = neck4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(50, 9).addBox(1.8393F, -0.8109F, -0.3015F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.682F, -3.1258F, 0.4816F, -0.6318F, 1.1086F));

		PartDefinition cube_r199 = neck4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(58, 10).addBox(0.0183F, 0.0349F, -0.4279F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.682F, -3.1258F, 0.7184F, -0.4375F, 0.652F));

		PartDefinition cube_r200 = neck4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(33, 17).addBox(3.0109F, -2.3422F, -0.1508F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.982F, -1.2258F, 0.1716F, -0.5224F, 1.3512F));

		PartDefinition cube_r201 = neck4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(60, 36).addBox(1.7186F, -0.8503F, -0.1508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.982F, -1.2258F, 0.3839F, -0.4003F, 0.882F));

		PartDefinition cube_r202 = neck4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(66, 0).addBox(-0.0651F, -0.0493F, -0.2705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.982F, -1.2258F, 0.5301F, -0.2654F, 0.4421F));

		PartDefinition cube_r203 = neck4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(40, 25).addBox(-1.0F, -0.9375F, -0.0515F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.682F, -4.0258F, 0.4712F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.025F, -3.8701F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r204 = neck3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(43, 48).addBox(0.0F, -0.899F, -0.1226F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5436F, -0.71F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r205 = neck3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.3276F, 0.9654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 51).addBox(-0.5F, -0.8052F, -0.0547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3436F, -3.51F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r206 = neck3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(16, 48).mirror().addBox(-2.7518F, -0.0197F, 0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0436F, -2.01F, 0.3747F, 0.4129F, -1.1044F));

		PartDefinition cube_r207 = neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(48, 28).mirror().addBox(-2.9079F, -0.0471F, 0.3973F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3436F, -3.51F, 0.206F, 0.1169F, -1.1346F));

		PartDefinition cube_r208 = neck3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(16, 48).addBox(0.7518F, -0.0197F, 0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, -2.01F, 0.3747F, -0.4129F, 1.1044F));

		PartDefinition cube_r209 = neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(48, 28).addBox(0.9079F, -0.0471F, 0.3973F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3436F, -3.51F, 0.206F, -0.1169F, 1.1346F));

		PartDefinition cube_r210 = neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(72, 23).addBox(-0.5F, -0.8368F, -0.0394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0436F, -2.01F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5436F, -3.21F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(6, 0).addBox(0.0F, 0.5F, 3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 15).addBox(0.0F, 0.5F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 42).addBox(0.0F, 0.5F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 0).addBox(-0.5F, 1.0F, -1.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.2195F, -3.0783F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(77, 35).mirror().addBox(-0.5078F, -0.7973F, -1.2021F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 35).mirror().addBox(-1.9485F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1885F, -2.6369F, 0.4561F, 0.6012F, -1.0218F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-2.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.268F, -0.7949F, 0.4215F, 0.5229F, -1.0652F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(77, 35).addBox(-1.4922F, -0.7973F, -1.2021F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 35).addBox(-0.0515F, -0.0279F, -0.5757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1885F, -2.6369F, 0.4561F, -0.6012F, 1.0218F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(77, 47).addBox(0.0294F, -0.0104F, -0.6319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.268F, -0.7949F, 0.4215F, -0.5229F, 1.0652F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5195F, -5.0783F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r216 = neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-0.9485F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5303F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition cube_r217 = neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(33, 8).addBox(-0.0515F, -0.0279F, -0.5757F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5303F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r218 = neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(27, 75).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7831F, -0.227F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r219 = neck.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(47, 62).addBox(-0.5F, -0.284F, 0.7966F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.111F, -3.5428F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.011F, -1.8428F, 0.8154F, 0.0109F, 0.1848F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(13, 4).mirror().addBox(0.0F, -1.1F, -2.2F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 4).addBox(0.8F, -1.1F, -2.2F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.6786F, -5.7123F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(69, 70).addBox(-0.5F, -1.0123F, -0.5385F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4052F, -5.0473F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(60, 58).addBox(-0.5F, -0.3027F, -1.533F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4948F, -6.4473F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(61, 31).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.0029F, -5.5604F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(26, 8).mirror().addBox(-0.399F, -0.6988F, -1.6573F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -1.6065F, -3.3064F, -0.0088F, -0.1396F, 0.0012F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(28, 80).mirror().addBox(-0.3F, -0.2785F, -1.6675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(80, 25).mirror().addBox(-0.61F, -0.2854F, -1.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 79).mirror().addBox(-0.72F, -0.2854F, -1.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 79).addBox(1.16F, -0.2854F, -1.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 25).addBox(1.05F, -0.2854F, -1.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(28, 80).addBox(0.74F, -0.2785F, -1.6675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.72F, -1.173F, -2.6711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(-0.5F, -0.477F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(81, 68).addBox(0.66F, -0.477F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.58F, -1.6178F, -0.749F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-0.5F, -1.5909F, 0.9645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(77, 52).addBox(1.34F, -1.5909F, 0.9645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, 0.5082F, -2.833F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(63, 20).mirror().addBox(-0.5F, -0.186F, -0.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(63, 20).addBox(1.34F, -0.186F, -0.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -1.4918F, -1.633F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(35, 40).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(35, 40).addBox(1.34F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.92F, -1.0053F, -0.9216F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(70, 78).addBox(1.34F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, -0.5892F, -1.406F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 74).mirror().addBox(-0.5F, -1.8213F, -0.819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(69, 74).addBox(1.34F, -1.8213F, -0.819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.92F, 0.5082F, -2.833F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(51, 74).mirror().addBox(-0.5F, -1.7362F, -0.7421F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(51, 74).addBox(1.34F, -1.7362F, -0.7421F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.92F, 0.5082F, -2.833F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(38, 69).mirror().addBox(-1.2F, -2.2989F, -0.356F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 69).addBox(0.2F, -2.2989F, -0.356F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4348F, -4.3672F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(59, 23).mirror().addBox(-0.5F, -0.067F, -1.212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 23).addBox(0.9F, -0.067F, -1.212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, 0.267F, -0.3646F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(17, 75).mirror().addBox(-0.5F, -1.9748F, -0.9434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(17, 75).addBox(0.9F, -1.9748F, -0.9434F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7F, 1.2152F, -2.8717F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-0.5F, -2.1F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(40, 62).addBox(0.9F, -2.1F, -1.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7F, -0.533F, -2.3646F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(9, 26).addBox(-1.0F, -0.8254F, -0.2126F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.7771F, -8.5991F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(73, 55).addBox(-1.0F, -0.7419F, -0.2185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.7771F, -9.1991F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(73, 63).addBox(-1.0F, -0.6024F, -0.2802F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.4397F, -9.6188F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-0.5F, -0.6694F, -1.0264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 73).addBox(-0.06F, -0.6694F, -1.0264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, -0.9499F, -7.9185F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.5F, -0.5481F, -0.0862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 79).addBox(-0.06F, -0.5481F, -0.0862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.22F, -0.9499F, -7.9185F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-0.5F, -0.5143F, -0.6115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(29, 71).mirror().addBox(-0.5F, -0.2839F, -1.1502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(79, 37).addBox(-0.06F, -0.5143F, -0.6115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(29, 71).addBox(-0.06F, -0.2839F, -1.1502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.22F, -0.9499F, -7.9185F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(79, 76).addBox(-0.5F, -0.1319F, -0.5598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.62F, -1.593F, -0.4815F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(26, 8).addBox(-1.601F, -0.6988F, -1.6573F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, -1.6065F, -3.3064F, -0.0088F, 0.1396F, -0.0012F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(34, 80).addBox(-0.5F, -1.2085F, 0.0228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7F, 0.3152F, -3.3717F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(79, 2).addBox(-0.5F, -0.0458F, -0.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4673F, -9.4415F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(80, 55).addBox(-0.5F, -0.7204F, -0.7853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0673F, -8.8415F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(62, 38).addBox(-1.0F, -0.0434F, -1.8851F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0652F, -3.1672F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -0.044F, -0.983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.4177F, -7.964F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(80, 62).addBox(-0.5F, -0.3952F, -2.9235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0177F, -5.064F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 30).addBox(-0.5F, -0.0334F, -1.9695F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0177F, -5.064F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(80, 65).addBox(-0.5F, -0.1517F, -1.9501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0652F, -3.1672F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(73, 66).addBox(-1.0F, -0.0675F, -0.9463F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0652F, -3.1672F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(12, 74).mirror().addBox(-1.2F, -0.3629F, -1.0265F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(12, 74).addBox(0.2F, -0.3629F, -1.0265F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.1629F, -0.5864F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-1.4F, -0.1584F, -0.4228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 0).addBox(0.0F, -0.1584F, -0.4228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.1371F, 0.5136F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-1.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(74, 4).addBox(-0.2F, 0.0044F, -0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, -1.0371F, 0.5136F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(69, 58).addBox(-1.0F, -0.0502F, 0.0219F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -0.2864F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(72, 9).addBox(-1.0F, -0.2679F, -0.1049F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7371F, -1.1864F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(63, 10).addBox(-1.0F, -0.0072F, 0.0138F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1371F, -3.1864F, -0.0698F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7192F, -1.5788F, 0.2183F, -0.0016F, 0.0113F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(79, 5).addBox(-0.4991F, -1.166F, -0.5961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0053F, -0.9361F, -6.3726F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(79, 8).addBox(-0.4995F, -0.5139F, -0.401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.0044F, -1.6766F, -7.5511F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-1.2F, -0.3309F, 1.1971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(60, 0).addBox(0.1977F, -0.3309F, 1.1971F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0011F, -1.0869F, -3.4556F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.8F, -0.0968F, -1.4674F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 75).addBox(0.7977F, -0.0968F, -1.4674F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0011F, -0.3869F, -0.5556F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-0.01F, -0.6F, -1.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 74).addBox(1.6077F, -0.6F, -1.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7989F, -0.4528F, -1.9386F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(-0.4221F, 0.1321F, -0.2593F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 33).addBox(0.38F, 0.1321F, -0.2593F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0211F, -2.3329F, -4.8565F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(35, 48).mirror().addBox(-0.3964F, -0.0307F, -0.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 48).addBox(0.3857F, -0.0307F, -0.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0053F, -2.2587F, -5.1939F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(10, 79).addBox(-0.4991F, -1.0004F, -1.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0053F, -0.9361F, -6.3726F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(33, 59).addBox(-0.5059F, -0.9764F, -2.5374F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0048F, -0.0875F, -2.5832F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.6F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0044F, -1.5068F, -5.9234F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(48, 22).addBox(-0.499F, 0.013F, -0.0484F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0053F, -2.1587F, -5.5939F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(71, 18).addBox(-0.499F, -0.7101F, -2.0479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, -0.9587F, -4.4939F, -0.1484F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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