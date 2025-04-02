package fossils.fossils.client.blockentity.model.kubanochoerus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KubanochoerusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public KubanochoerusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.6804F, 9.0354F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 35).addBox(0.0F, -1.8986F, 0.6389F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0319F, -3.1852F, -1.949F, -1.1987F, -0.9325F, 0.1592F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 34).mirror().addBox(-0.1395F, 0.0049F, -0.6257F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9529F, -2.7862F, -2.607F, -0.8314F, -0.4973F, -0.397F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-0.0816F, -0.797F, -0.1733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5084F, 2.1072F, 1.0002F, 2.7613F, -0.9353F, 1.056F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(0.0162F, -0.5525F, -1.2749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2849F, 0.7553F, -1.9175F, 0.8433F, -1.2661F, -2.6596F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 31).mirror().addBox(0.1884F, 0.1396F, 0.5131F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5381F, 2.6338F, 0.0478F, -0.0999F, 0.0844F, 0.3073F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(0.0743F, 0.1834F, -0.989F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5381F, 2.6338F, 0.0478F, -0.5025F, -0.0261F, 0.3831F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0858F, 2.7916F, -1.3889F, -0.8406F, 0.7703F, 0.1787F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.602F, -2.0453F, -2.0371F, -2.6766F, -0.9903F, 1.617F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(49, 11).mirror().addBox(0.0941F, -0.5525F, -0.3027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2849F, 0.7553F, -1.9175F, 0.3744F, -0.9113F, -2.1409F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 75).mirror().addBox(-1.2003F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2204F, 3.6437F, 1.7985F, 2.3916F, -0.9047F, 1.7321F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-0.9234F, -0.5F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2204F, 3.6437F, 1.7985F, 1.909F, -1.1079F, 2.2962F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-1.9F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2395F, 2.7159F, 0.577F, -2.2565F, -1.1343F, 1.3976F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 12).mirror().addBox(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5529F, -1.7862F, -2.407F, -0.8835F, -0.0146F, -0.628F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(76, 34).mirror().addBox(-1.2F, -0.5F, 0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.4433F, -1.1415F, -1.9302F, -0.8851F, -0.0533F, -0.5808F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-0.6F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5084F, 2.5072F, 0.5002F, 2.1179F, -1.3099F, 1.7531F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(73, 31).addBox(-2.1884F, 0.1396F, 0.5131F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5381F, 2.6338F, 0.0478F, -0.0999F, -0.0844F, -0.3073F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(74, 48).addBox(-2.0743F, 0.1834F, -0.989F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5381F, 2.6338F, 0.0478F, -0.5025F, 0.0261F, -0.3831F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 22).addBox(-0.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0858F, 2.7916F, -1.3889F, -0.8406F, -0.7703F, -0.1787F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 48).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.602F, -2.0453F, -2.0371F, -2.6766F, 0.9903F, -1.617F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(49, 44).addBox(-1.0162F, -0.5525F, -1.2749F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2849F, 0.7553F, -1.9175F, 0.8433F, 1.2661F, 2.6596F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(49, 11).addBox(-1.0941F, -0.5525F, -0.3027F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2849F, 0.7553F, -1.9175F, 0.3744F, 0.9113F, 2.1409F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(22, 75).addBox(-0.7997F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2204F, 3.6437F, 1.7985F, 2.3916F, 0.9047F, -1.7321F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 19).addBox(-1.0766F, -0.5F, -0.2905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2204F, 3.6437F, 1.7985F, 1.909F, 1.1079F, -2.2962F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 0).addBox(-1.1F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2395F, 2.7159F, 0.577F, -2.2565F, 1.1343F, -1.3976F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(88, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0319F, -3.1852F, -1.949F, -1.1987F, 0.9325F, -0.1592F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 34).addBox(-1.8605F, 0.0049F, -0.6257F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9529F, -2.7862F, -2.607F, -0.8314F, 0.4973F, 0.397F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(38, 12).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5529F, -1.7862F, -2.407F, -0.8835F, 0.0146F, 0.628F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(76, 34).addBox(-0.8F, -0.5F, 0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.4433F, -1.1415F, -1.9302F, -0.8851F, 0.0533F, 0.5808F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 90).addBox(-0.9184F, -0.797F, -0.1733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5084F, 2.1072F, 1.0002F, 2.7613F, 0.9353F, -1.056F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(90, 14).addBox(-0.4F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5084F, 2.5072F, 0.5002F, 2.1179F, 1.3099F, -1.7531F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(23, 67).addBox(-2.0381F, 0.5847F, -0.6272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5381F, 2.6338F, 0.0478F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 3.0783F, 0.0971F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(9, 50).addBox(-1.0F, -4.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 58).addBox(-0.5F, 0.0961F, -0.3884F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.1292F, -0.1514F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(67, 49).addBox(4.4F, -4.9F, -3.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(49, 39).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4598F, 0.433F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(74, 42).addBox(-1.0F, -1.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5871F, 0.2323F, 0.384F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.3658F, 1.2742F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r39 = leftLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(56, 5).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(58, 45).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(16, 64).addBox(-1.0F, -0.1475F, -0.779F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.8738F, 1.141F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(9, 63).addBox(-1.0F, -1.6F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.5738F, 1.041F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 25).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4271F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 21).addBox(-1.5F, -2.9201F, -0.3278F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6131F, -0.3404F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(43, 59).addBox(-1.5F, -0.0335F, -0.0498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.7131F, -0.3404F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 8).addBox(-1.5F, -0.0452F, -0.8683F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7131F, 0.2596F, -0.4102F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 6.5394F, -0.4592F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(7, 68).addBox(-0.8F, -2.5857F, -1.1115F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 34).addBox(-0.8F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(58, 9).addBox(-1.3F, -3.4F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5557F, -0.2179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 87).addBox(9.227F, -1.3601F, 0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.7756F, 4.9152F, 0.4353F, -0.1621F, 0.0878F, 0.0851F));

		PartDefinition cube_r51 = leftLeg3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(88, 48).addBox(9.2702F, -0.8735F, -0.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-10.6616F, 3.5734F, 0.5946F, 0.2036F, 0.0515F, 0.1108F));

		PartDefinition cube_r52 = leftLeg3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(27, 81).addBox(9.4911F, -1.0067F, -0.4455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.6616F, 1.5734F, 0.5946F, 0.029F, 0.0515F, 0.1108F));

		PartDefinition cube_r53 = leftLeg3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3756F, 4.9152F, 0.4353F, -0.1621F, -0.0878F, -0.0851F));

		PartDefinition cube_r54 = leftLeg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5432F, 0.0865F, -0.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2616F, 3.5734F, 0.5946F, 0.2036F, -0.0515F, -0.1108F));

		PartDefinition cube_r55 = leftLeg3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(22, 81).addBox(-0.7641F, 0.0622F, -0.9784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2616F, 1.5734F, 0.5946F, 0.029F, -0.0515F, -0.1108F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.0137F, -0.5935F, -0.5149F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.0417F, 0.1521F, 0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4384F, 0.0421F, 0.0778F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(66, 78).addBox(8.2402F, -4.0248F, -0.7111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9233F, 2.562F, -0.4093F, -1.0389F, 0.2324F, 0.1614F));

		PartDefinition cube_r57 = leftLeg6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(36, 78).addBox(-0.596F, -1.5277F, -0.5023F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.562F, -0.4093F, -1.0389F, -0.2324F, -0.1614F));

		PartDefinition cube_r58 = leftLeg6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(76, 84).addBox(8.3134F, -2.2386F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.4233F, 0.9558F, 0.1508F, 0.0F, 0.0F, 0.1396F));

		PartDefinition cube_r59 = leftLeg6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(84, 11).addBox(-0.401F, -0.9861F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.9558F, 0.1508F, 0.0F, 0.0F, -0.1396F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 3.0783F, 0.0971F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightLeg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(51, 34).addBox(-1.0F, -4.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightLeg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(64, 63).addBox(-1.5F, 0.0961F, -0.3884F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.1292F, -0.1514F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(53, 67).addBox(-5.4F, -4.9F, -3.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(49, 49).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4598F, 0.433F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(74, 45).addBox(-1.0F, -1.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5871F, 0.2323F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.3658F, 1.2742F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 26).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(58, 49).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(39, 64).addBox(-1.0F, -0.1475F, -0.779F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.8738F, 1.141F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(63, 53).addBox(-1.0F, -1.6F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.5738F, 1.041F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(78, 28).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4271F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(25, 62).addBox(-0.5F, -2.9201F, -0.3278F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.6131F, -0.3404F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(60, 34).addBox(-0.5F, -0.0335F, -0.0498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 1.7131F, -0.3404F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(72, 38).addBox(-0.5F, -0.0452F, -0.8683F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.7131F, 0.2596F, -0.4102F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 6.5394F, -0.4592F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(35, 69).addBox(-0.2F, -2.5857F, -1.1115F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(89, 51).addBox(-0.2F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(58, 39).addBox(-0.7F, -3.4F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5557F, -0.2179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(45, 87).addBox(-10.227F, -1.3601F, 0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.7756F, 4.9152F, 0.4353F, -0.1621F, -0.0878F, -0.0851F));

		PartDefinition cube_r77 = rightLeg3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(88, 71).addBox(-10.2702F, -0.8735F, -0.2158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(10.6616F, 3.5734F, 0.5946F, 0.2036F, -0.0515F, -0.1108F));

		PartDefinition cube_r78 = rightLeg3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(81, 41).addBox(-10.4911F, -1.0067F, -0.4455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.6616F, 1.5734F, 0.5946F, 0.029F, -0.0515F, -0.1108F));

		PartDefinition cube_r79 = rightLeg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(31, 87).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3756F, 4.9152F, 0.4353F, -0.1621F, 0.0878F, 0.0851F));

		PartDefinition cube_r80 = rightLeg3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(55, 88).addBox(-0.4568F, 0.0865F, -0.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2616F, 3.5734F, 0.5946F, 0.2036F, 0.0515F, 0.1108F));

		PartDefinition cube_r81 = rightLeg3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(41, 81).addBox(-0.2359F, 0.0622F, -0.9784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2616F, 1.5734F, 0.5946F, 0.029F, 0.0515F, 0.1108F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.0137F, -0.5935F, -0.5149F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.0417F, 0.1521F, 0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4384F, 0.0421F, 0.0778F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(78, 72).addBox(-9.2402F, -4.0248F, -0.7111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.9233F, 2.562F, -0.4093F, -1.0389F, -0.2324F, -0.1614F));

		PartDefinition cube_r83 = rightLeg6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 78).addBox(-0.404F, -1.5277F, -0.5023F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.562F, -0.4093F, -1.0389F, 0.2324F, 0.1614F));

		PartDefinition cube_r84 = rightLeg6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 84).addBox(-9.3134F, -2.2386F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.4233F, 0.9558F, 0.1508F, 0.0F, 0.0F, -0.1396F));

		PartDefinition cube_r85 = rightLeg6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(84, 35).addBox(-0.599F, -0.9861F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.9558F, 0.1508F, 0.0F, 0.0F, 0.1396F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4979F, -3.8073F, -0.0961F, -0.0434F, 0.0042F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(50, 59).addBox(0.0F, 0.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 26).addBox(0.0F, 0.4F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 45).addBox(0.0F, 0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2966F, -5.8386F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-0.6235F, 0.1667F, 0.0598F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.481F, 5.678F, -5.0282F, -0.9146F, 0.3075F, -2.4767F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-3.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -1.9225F, -4.4268F, -0.4252F, 0.2112F, -0.9001F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -1.9225F, -4.4268F, -0.4623F, 0.0983F, -1.1393F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-6.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -1.9225F, -4.4268F, -0.465F, -0.0832F, -1.4978F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(80, 19).mirror().addBox(-0.1F, -0.1F, -1.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 19).mirror().addBox(0.444F, -0.1125F, 0.1204F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8397F, 0.1495F, -1.5049F, -0.1246F, -0.3983F, -0.4673F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 58).addBox(-0.3765F, 0.1667F, 0.0598F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.481F, 5.678F, -5.0282F, -0.9146F, -0.3075F, 2.4767F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 51).addBox(5.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.9225F, -4.4268F, -0.465F, 0.0832F, 1.4978F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(67, 34).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.9225F, -4.4268F, -0.4623F, -0.0983F, 1.1393F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(81, 49).addBox(1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.9225F, -4.4268F, -0.4252F, -0.2112F, 0.9001F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(80, 19).addBox(-2.444F, -0.1125F, 0.1204F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 19).addBox(-1.9F, -0.1F, -1.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8397F, 0.1495F, -1.5049F, -0.1246F, 0.3983F, 0.4673F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.1512F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4656F, -13.1997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.702F, -4.6624F, -0.1572F, -0.0431F, 0.0068F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(28, 18).mirror().addBox(-0.2734F, 0.3222F, -1.0757F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5394F, 6.3575F, 0.4214F, 0.732F, 1.2407F, 1.206F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-2.5138F, 0.5279F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4206F, -1.5644F, -0.334F, 0.3196F, -0.8761F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-5.5648F, -0.1407F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4206F, -1.5644F, -0.4026F, 0.2248F, -1.1296F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(79, 9).mirror().addBox(-7.0674F, -2.3039F, -0.1465F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4206F, -1.5644F, -0.4549F, 0.056F, -1.498F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-2.4651F, 0.4628F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -3.5644F, -0.3565F, 0.3391F, -0.7827F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-5.5009F, -0.1909F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -3.5644F, -0.4287F, 0.2384F, -1.035F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-7.989F, -2.3251F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -3.5644F, -0.4836F, 0.0595F, -1.3989F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 55).addBox(-0.4862F, 0.5279F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4206F, -1.5644F, -0.334F, -0.3196F, 0.8761F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(70, 70).addBox(2.5648F, -0.1407F, -0.1465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4206F, -1.5644F, -0.4026F, -0.2248F, 1.1296F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(79, 9).addBox(5.0674F, -2.3039F, -0.1465F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4206F, -1.5644F, -0.4549F, -0.056F, 1.498F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 67).addBox(-0.5349F, 0.4628F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -3.5644F, -0.3565F, -0.3391F, 0.7827F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(65, 43).addBox(2.5009F, -0.1909F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -3.5644F, -0.4287F, -0.2384F, 1.035F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 12).addBox(4.989F, -2.3251F, -0.1263F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -3.5644F, -0.4836F, -0.0595F, 1.3989F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(30, 90).addBox(0.0F, -1.5594F, 0.0188F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -2.157F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(28, 85).addBox(0.0F, -2.2938F, -0.0713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.596F, -4.057F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(28, 18).addBox(-5.7266F, 0.3222F, -1.0757F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5394F, 6.3575F, 0.4214F, 0.732F, -1.2407F, -1.206F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, -0.0873F, 0.0435F, -0.0038F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(11, 34).addBox(-0.5F, 0.0148F, -4.0846F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-5.471F, -0.2187F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.3644F, -0.4522F, 0.2321F, -0.9905F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(-2.4434F, 0.4283F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.3644F, -0.3815F, 0.3387F, -0.7411F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(68, 14).mirror().addBox(-7.9506F, -2.339F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.3644F, -0.5027F, 0.0456F, -1.3501F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-7.9247F, -2.3487F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -2.3644F, -0.5203F, 0.014F, -1.317F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(72, 2).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -2.3644F, -0.4804F, 0.2086F, -0.9631F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3794F, -2.3644F, -0.4158F, 0.3226F, -0.7187F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(70, 0).addBox(2.471F, -0.2187F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.3644F, -0.4522F, -0.2321F, 0.9905F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 68).addBox(-0.5566F, 0.4283F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.3644F, -0.3815F, -0.3387F, 0.7411F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(68, 14).addBox(4.9506F, -2.339F, -0.1169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.3644F, -0.5027F, -0.0456F, 1.3501F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(71, 63).addBox(4.9247F, -2.3487F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -2.3644F, -0.5203F, -0.014F, 1.317F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(72, 2).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -2.3644F, -0.4804F, -0.2086F, 0.9631F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(71, 65).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3794F, -2.3644F, -0.4158F, -0.3226F, 0.7187F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(36, 89).addBox(0.0F, -2.9952F, 0.0007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.496F, -1.057F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(61, 84).addBox(0.0F, -3.9863F, -0.0009F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.957F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(9, 45).addBox(-0.5F, -0.6567F, -2.8266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8534F, -3.7849F, 0.3668F, -0.0407F, -0.0156F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(19, 69).addBox(0.0F, -5.2278F, -0.0016F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6567F, -0.8266F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(60, 67).addBox(0.0F, -6.0035F, -0.0621F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6567F, -2.7266F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-8.4808F, -0.145F, -0.3347F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5874F, 8.1468F, -2.3025F, -0.5107F, 1.0918F, -0.047F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(21, 16).mirror().addBox(-6.3808F, -0.145F, -0.4347F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5874F, 8.1468F, -2.3025F, -0.4094F, 0.8726F, 0.0781F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-7.9247F, -2.3487F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -0.461F, -0.6208F, -0.3572F, -1.2995F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 59).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -0.461F, -0.7022F, 0.0601F, -0.774F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -0.461F, -0.6972F, -0.1091F, -0.9741F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(83, 75).mirror().addBox(-6.9247F, -2.3487F, -0.1126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -2.361F, -0.6159F, -0.3404F, -1.3012F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(49, 71).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -2.361F, -0.6874F, -0.0947F, -0.9751F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1989F, -2.361F, -0.6897F, 0.0722F, -0.7732F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(26, 27).mirror().addBox(-5.2808F, -0.145F, -0.5347F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5874F, 8.1468F, -2.3025F, -0.3607F, 0.578F, 0.1623F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(43, 6).mirror().addBox(-4.3009F, -0.2572F, -0.3686F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1538F, 7.7923F, -3.7246F, -0.2479F, 0.487F, 0.1497F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(71, 57).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -0.461F, -0.6972F, 0.1091F, 0.9741F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 59).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -0.461F, -0.7022F, -0.0601F, 0.774F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(71, 61).addBox(4.9247F, -2.3487F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -0.461F, -0.6208F, 0.3572F, 1.2995F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(83, 75).addBox(4.9247F, -2.3487F, -0.1126F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -2.361F, -0.6159F, 0.3404F, 1.3012F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 71).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -2.361F, -0.6874F, 0.0947F, 0.9751F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(40, 71).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1989F, -2.361F, -0.6897F, -0.0722F, 0.7732F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5192F, -0.145F, -0.3347F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5874F, 8.1468F, -2.3025F, -0.5107F, -1.0918F, 0.047F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(21, 16).addBox(-0.6192F, -0.145F, -0.4347F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5874F, 8.1468F, -2.3025F, -0.4094F, -0.8726F, -0.0781F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(26, 27).addBox(-0.7192F, -0.145F, -0.5347F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5874F, 8.1468F, -2.3025F, -0.3607F, -0.578F, -0.1623F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(43, 6).addBox(-0.6991F, -0.2572F, -0.3686F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1538F, 7.7923F, -3.7246F, -0.2479F, -0.487F, -0.1497F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.9192F, -0.0436F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.4968F, -5.3808F, -0.384F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2486F, -2.6294F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(63, 72).addBox(0.0F, -5.6226F, -0.0168F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3607F, -2.0986F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(37, 83).addBox(0.0F, -3.3222F, -0.1133F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7607F, -3.9986F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(22, 42).mirror().addBox(-0.505F, -0.029F, -0.6132F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, -2.9153F, -0.0725F, 0.317F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.505F, 0.8087F, -0.0572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, 2.9665F, -0.0725F, 0.317F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(43, 8).mirror().addBox(-4.1152F, -0.522F, -0.2189F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7243F, 3.257F, -3.6058F, -0.1765F, 0.1216F, -2.0703F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(34, 59).mirror().addBox(-3.2152F, -0.622F, 0.2811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7401F, -2.863F, 0.1038F, -0.3869F, -1.1638F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-5.9247F, -2.3487F, -0.1126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6401F, -1.463F, -0.5071F, 0.0646F, -1.3165F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-5.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6401F, -1.463F, -0.4495F, 0.2515F, -0.9561F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(-2.4289F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6401F, -1.463F, -0.3738F, 0.3568F, -0.7047F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(15, 19).mirror().addBox(-0.5872F, -0.9853F, -0.6707F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, 0.9244F, -0.0725F, 0.317F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5872F, -1.1627F, -3.8405F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, 1.3433F, -0.0725F, 0.317F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 39).mirror().addBox(-0.505F, -0.6573F, 1.1966F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, 1.4742F, -0.0725F, 0.317F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(22, 35).mirror().addBox(-0.505F, -0.496F, 0.4391F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, 2.2683F, -0.0725F, 0.317F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-1.1698F, -0.7211F, -2.9172F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, 1.4385F, 0.3787F, 0.2816F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(26, 29).mirror().addBox(-0.5431F, -2.4021F, -3.5072F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1107F, 2.1201F, -0.3599F, 1.6749F, -0.0725F, 0.317F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(41, 27).mirror().addBox(-4.4152F, 0.1443F, -0.407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 7.75F, -0.1393F, -0.2365F, 0.3826F, 0.4619F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(39, 25).mirror().addBox(-4.0637F, 0.0457F, -0.1352F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.113F, 6.6465F, -1.87F, -0.1426F, 0.5743F, 0.3012F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(43, 8).addBox(0.1152F, -0.522F, -0.2189F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7243F, 3.257F, -3.6058F, -0.1765F, -0.1216F, 2.0703F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(34, 59).addBox(0.2152F, -0.622F, 0.2811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7401F, -2.863F, 0.1038F, 0.3869F, 1.1638F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 69).addBox(4.9247F, -2.3487F, -0.1126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6401F, -1.463F, -0.5071F, -0.0646F, 1.3165F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(70, 53).addBox(2.4509F, -0.2377F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6401F, -1.463F, -0.4495F, -0.2515F, 0.9561F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(67, 36).addBox(-0.5711F, 0.4047F, -0.1126F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6401F, -1.463F, -0.3738F, -0.3568F, 0.7047F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(15, 19).addBox(-0.4128F, -0.9853F, -0.6707F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, 0.9244F, 0.0725F, -0.317F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4128F, -1.1627F, -3.8405F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, 1.3433F, 0.0725F, -0.317F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(40, 39).addBox(-0.495F, -0.6573F, 1.1966F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, 1.4742F, 0.0725F, -0.317F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(22, 42).addBox(-0.495F, -0.029F, -0.6132F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, -2.9153F, 0.0725F, -0.317F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 44).addBox(-0.495F, 0.8087F, -0.0572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, 2.9665F, 0.0725F, -0.317F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(22, 35).addBox(-0.495F, -0.496F, 0.4391F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, 2.2683F, 0.0725F, -0.317F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 10).addBox(-0.8302F, -0.7211F, -2.9172F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, 1.4385F, -0.3787F, -0.2816F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 29).addBox(-0.4569F, -2.4021F, -3.5072F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.1107F, 2.1201F, -0.3599F, 1.6749F, 0.0725F, -0.317F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(41, 27).addBox(-0.5848F, 0.1443F, -0.407F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 7.75F, -0.1393F, -0.2365F, -0.3826F, -0.4619F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(39, 25).addBox(-0.9363F, 0.0457F, -0.1352F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.113F, 6.6465F, -1.87F, -0.1426F, -0.5743F, -0.3012F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0757F, -1.8157F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(32, 6).addBox(-0.5F, -1.908F, 6.84F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0607F, -9.7986F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 5.8809F, -2.2869F, -0.5627F, -0.2172F, -0.0161F));

		PartDefinition cube_r187 = leftarm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(12, 73).addBox(-1.0F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(43, 17).addBox(-1.0F, -0.7F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4925F, 1.8553F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftarm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(52, 21).addBox(-0.9995F, -1.8499F, -2.4694F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0104F, 2.2628F, 1.1264F, -0.3055F, 0.001F, -0.0014F));

		PartDefinition cube_r189 = leftarm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 54).addBox(-0.9995F, -1.0794F, -2.142F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0104F, 2.2628F, 1.1264F, -0.6371F, 0.001F, -0.0014F));

		PartDefinition cube_r190 = leftarm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 59).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.5867F, 0.9555F, 0.7417F, 0.0014F, -0.001F));

		PartDefinition cube_r191 = leftarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(67, 45).addBox(-0.5F, -3.7F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 6.8184F, 2.3161F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.5475F, 1.6695F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftarm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(80, 63).addBox(-0.2F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7764F, -0.087F, 0.8556F, 1.5708F, 1.0297F, -1.5708F));

		PartDefinition cube_r193 = leftarm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(59, 15).addBox(-2.0F, -0.7F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1764F, -0.7125F, 0.9484F, 1.5708F, -0.2356F, -1.5708F));

		PartDefinition cube_r194 = leftarm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(10, 79).addBox(-0.009F, -0.02F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.136F, 2.4278F, 0.0419F, 1.5708F, -1.309F, -1.5708F));

		PartDefinition cube_r195 = leftarm2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(32, 12).addBox(-1.2256F, -3.0299F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.136F, 3.3278F, 1.3419F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition cube_r196 = leftarm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(86, 42).addBox(-0.7F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8764F, 4.3324F, 1.2938F, 1.5708F, -1.1519F, -1.5708F));

		PartDefinition cube_r197 = leftarm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(85, 25).addBox(0.3F, -2.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8236F, 2.8164F, -0.2151F, 1.5708F, -1.0996F, -1.5708F));

		PartDefinition cube_r198 = leftarm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(85, 61).addBox(-0.0103F, -1.2057F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.629F, -0.3382F, 1.5708F, -0.9948F, -1.5708F));

		PartDefinition cube_r199 = leftarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(73, 26).addBox(-0.0006F, 0.101F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 2.529F, -0.3382F, 1.5708F, -1.2566F, -1.5708F));

		PartDefinition cube_r200 = leftarm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(80, 15).addBox(-0.0006F, -1.899F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 2.529F, -0.3382F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 5.0911F, 1.2917F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftArm3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(86, 84).addBox(10.418F, -0.7998F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 87).addBox(10.418F, -1.4998F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-11.6233F, 3.4326F, 0.7163F, 0.1658F, 0.0F, 0.1222F));

		PartDefinition cube_r202 = leftArm3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(83, 80).addBox(10.418F, -3.2151F, 0.274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.6233F, 3.4326F, 0.7163F, 0.4625F, 0.0F, 0.1222F));

		PartDefinition cube_r203 = leftArm3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, 0.5224F, -0.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 31).addBox(-0.5F, -0.1776F, -0.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7F, 3.4326F, 0.7163F, 0.1658F, 0.0F, -0.1222F));

		PartDefinition cube_r204 = leftArm3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -2.0154F, -0.3242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 3.4326F, 0.7163F, 0.4625F, 0.0F, -0.1222F));

		PartDefinition cube_r205 = leftArm3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(66, 75).addBox(-1.0F, 2.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(50, 62).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4278F, -0.3069F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftArm4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(52, 73).addBox(8.2402F, -4.0248F, -0.7111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9233F, 2.562F, -0.4093F, -1.0389F, 0.2324F, 0.1614F));

		PartDefinition cube_r207 = leftArm4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 74).addBox(-0.596F, -1.5277F, -0.5023F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.562F, -0.4093F, -1.0389F, -0.2324F, -0.1614F));

		PartDefinition cube_r208 = leftArm4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(82, 21).addBox(8.3134F, -2.2386F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.4233F, 0.9558F, 0.1508F, 0.0F, 0.0F, 0.1396F));

		PartDefinition cube_r209 = leftArm4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(81, 45).addBox(-0.401F, -0.9861F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.9558F, 0.1508F, 0.0F, 0.0F, -0.1396F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 5.8809F, -2.2869F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(73, 16).addBox(-1.0F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(66, 72).addBox(-1.0F, -0.7F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4925F, 1.8553F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(18, 53).addBox(-1.0005F, -1.8499F, -2.4694F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0104F, 2.2628F, 1.1264F, -0.3055F, -0.001F, 0.0014F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(45, 54).addBox(-1.0005F, -1.0794F, -2.142F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0104F, 2.2628F, 1.1264F, -0.6371F, -0.001F, 0.0014F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(60, 80).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.5867F, 0.9555F, 0.7417F, -0.0014F, 0.001F));

		PartDefinition cube_r214 = rightarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(46, 67).addBox(-1.5F, -3.7F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 6.8184F, 2.3161F, 0.3229F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.5475F, 1.6695F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightarm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(78, 80).addBox(-0.8F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7764F, -0.087F, 0.8556F, 1.5708F, -1.0297F, 1.5708F));

		PartDefinition cube_r216 = rightarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(59, 18).addBox(-1.0F, -0.7F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1764F, -0.7125F, 0.9484F, 1.5708F, 0.2356F, 1.5708F));

		PartDefinition cube_r217 = rightarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(79, 37).addBox(-0.991F, -0.02F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.136F, 2.4278F, 0.0419F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition cube_r218 = rightarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(5, 79).addBox(0.2256F, -3.0299F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.136F, 3.3278F, 1.3419F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition cube_r219 = rightarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(86, 45).addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8764F, 4.3324F, 1.2938F, 1.5708F, 1.1519F, 1.5708F));

		PartDefinition cube_r220 = rightarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(85, 28).addBox(-1.3F, -2.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8236F, 2.8164F, -0.2151F, 1.5708F, 1.0996F, 1.5708F));

		PartDefinition cube_r221 = rightarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(85, 64).addBox(-0.9897F, -1.2057F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.629F, -0.3382F, 1.5708F, 0.9948F, 1.5708F));

		PartDefinition cube_r222 = rightarm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 73).addBox(-0.9994F, 0.101F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 2.529F, -0.3382F, 1.5708F, 1.2566F, 1.5708F));

		PartDefinition cube_r223 = rightarm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(55, 80).addBox(-0.9994F, -1.899F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 2.529F, -0.3382F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 5.0911F, 1.2917F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightArm3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(87, 22).addBox(-11.418F, -0.7998F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(-11.418F, -1.4998F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(11.6233F, 3.4326F, 0.7163F, 0.1658F, 0.0F, -0.1222F));

		PartDefinition cube_r225 = rightArm3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 84).addBox(-11.418F, -3.2151F, 0.274F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.6233F, 3.4326F, 0.7163F, 0.4625F, 0.0F, -0.1222F));

		PartDefinition cube_r226 = rightArm3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(87, 19).addBox(-0.5F, 0.5224F, -0.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 88).addBox(-0.5F, -0.1776F, -0.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7F, 3.4326F, 0.7163F, 0.1658F, 0.0F, 0.1222F));

		PartDefinition cube_r227 = rightArm3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -2.0154F, -0.3242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 3.4326F, 0.7163F, 0.4625F, 0.0F, 0.1222F));

		PartDefinition cube_r228 = rightArm3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(10, 76).addBox(-1.0F, 2.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(57, 62).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4278F, -0.3069F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r229 = rightArm4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(73, 72).addBox(-9.2402F, -4.0248F, -0.7111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.9233F, 2.562F, -0.4093F, -1.0389F, -0.2324F, -0.1614F));

		PartDefinition cube_r230 = rightArm4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(5, 74).addBox(-0.404F, -1.5277F, -0.5023F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.562F, -0.4093F, -1.0389F, 0.2324F, 0.1614F));

		PartDefinition cube_r231 = rightArm4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 82).addBox(-9.3134F, -2.2386F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.4233F, 0.9558F, 0.1508F, 0.0F, 0.0F, -0.1396F));

		PartDefinition cube_r232 = rightArm4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 82).addBox(-0.599F, -0.9861F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.9558F, 0.1508F, 0.0F, 0.0F, 0.1396F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4696F, -3.6084F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(25, 85).addBox(0.0F, -1.4F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8185F, -1.5478F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2408F, -2.0585F, -0.6369F, -0.2621F, 0.0864F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(45, 50).addBox(0.0F, -1.8977F, -1.0523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.58F, -0.859F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(40, 45).addBox(-0.5F, -0.6165F, -0.4594F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1701F, -2.3853F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(68, 22).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1217F, -2.5225F, 0.4268F, 0.0515F, -0.117F));

		PartDefinition cube_r237 = neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 16).addBox(0.0F, 0.0307F, -2.3264F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9244F, -0.0688F, 0.3752F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0921F, -3.6973F, -0.1342F, -0.2822F, -0.1384F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(77, 12).addBox(-2.0F, -1.9F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 1.1372F, 2.4918F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(57, 75).mirror().addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.6886F, 1.9597F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(57, 75).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 2.6886F, 1.9597F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(36, 50).addBox(-1.0F, -0.9F, -0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 5.0732F, -1.2294F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(17, 8).addBox(-0.5F, -2.0105F, -5.071F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 4.782F, -0.1087F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(29, 75).addBox(-1.0F, -0.6F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.6336F, -2.5131F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(37, 29).addBox(-1.0F, 0.0702F, -2.7154F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.6983F, -0.8698F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(29, 78).addBox(-1.0F, -1.035F, 0.0385F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 9.19F, -2.8987F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(10, 59).mirror().addBox(-1.24F, -1.1839F, -0.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 59).addBox(0.24F, -1.1839F, -0.0205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 10.79F, -3.9987F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.9839F, -0.0205F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 10.79F, -3.9987F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(75, 88).addBox(-1.4F, -0.0572F, -2.4774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(50, 16).addBox(-1.9F, -0.0572F, -2.0774F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 7.4036F, -4.8203F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(78, 77).addBox(-1.0F, 0.3695F, -3.5697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.99F, -3.2987F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -1.4F, -2.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9933F, 0.1081F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(30, 69).addBox(-0.5F, -0.1746F, -0.2756F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 4.2595F, -6.401F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(73, 77).addBox(-0.5F, -2.2737F, -0.9112F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.6595F, -4.901F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(80, 88).addBox(-0.5F, -0.0462F, 0.0064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.2595F, -3.901F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(17, 77).addBox(-0.5F, -1.9959F, -0.8407F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.7595F, -3.201F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -0.0959F, -1.9407F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.7595F, -3.201F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(9, 55).addBox(-1.5F, -0.0612F, -1.0593F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8595F, -2.701F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(45, 73).addBox(-1.0F, -0.024F, -0.0586F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0595F, -2.101F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, 0.976F, -1.0586F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(32, 62).addBox(-1.0F, -0.024F, -1.0586F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0595F, -2.101F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(31, 42).addBox(-1.0F, -2.1F, -0.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.0702F, 0.4655F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(45, 76).mirror().addBox(-0.5F, 0.1896F, -0.3294F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5407F, -0.0222F, 0.3216F, 0.0868F, -0.2287F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(45, 76).addBox(-0.5F, 0.1896F, -0.3294F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, -1.5407F, -0.0222F, 0.3216F, -0.0868F, 0.2287F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.0888F, 0.0303F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -1.6061F, -0.3766F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(57, 30).addBox(0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(57, 30).addBox(0.0F, 0.2F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -0.7061F, -1.2766F, 0.8552F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, 7.7298F, -5.0083F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(85, 55).addBox(-0.5F, 0.1491F, -6.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F))
				.texOffs(40, 85).addBox(-0.5F, -0.1509F, -6.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3F, 1.4318F, 6.6422F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(85, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 2.9776F, 1.1518F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(80, 55).addBox(-0.5422F, -0.8813F, -0.1853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6521F, 0.7667F, 1.9167F, 2.4584F, -1.4588F, 2.7548F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(51, 84).addBox(-0.5422F, -0.9103F, 0.022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.6521F, 0.7667F, 1.9167F, 2.2838F, -1.4588F, 2.7548F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(56, 84).addBox(-0.2146F, 0.263F, -0.0005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.6521F, 0.7667F, 1.9167F, -2.5033F, -1.256F, 0.782F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -2.0215F, -1.7631F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -6.2365F, 4.8165F, 0.6244F, 0.1769F, -0.2395F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(84, 51).addBox(-0.2146F, -0.1304F, 0.5392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.6521F, 0.7667F, 1.9167F, -2.8175F, -1.256F, 0.782F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(79, 51).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7F, 3.107F, 0.6688F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(25, 58).addBox(-2.061F, -0.481F, 0.0057F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.6521F, 0.7667F, 1.9167F, 1.1891F, -0.2483F, -0.296F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(18, 48).addBox(-2.0F, -0.076F, -1.5541F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, -4.0359F, 1.6318F, 1.2545F, 0.066F, 0.1989F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(28, 20).addBox(-2.0F, 0.0298F, -2.9641F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -2.9359F, 1.1318F, 1.1964F, 0.0256F, 0.065F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, 7.7298F, -5.0083F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-0.5F, 0.1491F, -6.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false)
				.texOffs(40, 85).mirror().addBox(-0.5F, -0.1509F, -6.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4318F, 6.6422F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.9776F, 1.1518F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(80, 55).mirror().addBox(-0.4578F, -0.8813F, -0.1853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6521F, 0.7667F, 1.9167F, 2.4584F, 1.4588F, -2.7548F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 84).mirror().addBox(-0.4578F, -0.9103F, 0.022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.6521F, 0.7667F, 1.9167F, 2.2838F, 1.4588F, -2.7548F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(-0.7854F, 0.263F, -0.0005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.6521F, 0.7667F, 1.9167F, -2.5033F, 1.256F, -0.782F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(0.0F, -2.0215F, -1.7631F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -6.2365F, 4.8165F, 0.6244F, -0.1769F, 0.2395F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-0.7854F, -0.1304F, 0.5392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.6521F, 0.7667F, 1.9167F, -2.8175F, 1.256F, -0.782F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(79, 51).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.107F, 0.6688F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(0.061F, -0.481F, 0.0057F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6521F, 0.7667F, 1.9167F, 1.1891F, 0.2483F, 0.296F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(0.0F, -0.076F, -1.5541F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -4.0359F, 1.6318F, 1.2545F, -0.066F, -0.1989F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(28, 20).mirror().addBox(0.0F, 0.0298F, -2.9641F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -2.9359F, 1.1318F, 1.1964F, -0.0256F, -0.065F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 3.2979F, 0.5427F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(54, 54).addBox(-1.5F, -0.3102F, -1.5028F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9906F, -2.6324F, 0.3228F, 1.6764F, -0.3065F, -1.1944F));

		PartDefinition cube_r287 = leftOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(65, 39).addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0704F, -2.7612F, 0.0758F, 2.7703F, -0.5406F, -1.2231F));

		PartDefinition cube_r288 = leftOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(86, 8).addBox(-0.7175F, -1.0645F, -0.9634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.093F, 0.1838F, 1.039F, 0.8833F, -0.28F, 0.2159F));

		PartDefinition cube_r289 = leftOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(86, 0).addBox(-0.6075F, -1.086F, -0.3602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.093F, -0.2162F, 0.939F, 1.8084F, -0.28F, 0.2159F));

		PartDefinition cube_r290 = leftOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 39).addBox(-0.7624F, 0.0295F, 0.4843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.793F, -1.1162F, 0.039F, 1.5371F, -0.4452F, -0.1941F));

		PartDefinition cube_r291 = leftOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(15, 86).addBox(-0.8834F, 0.0295F, -0.4936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.793F, -1.1162F, 0.039F, 1.3931F, -0.4117F, 0.1497F));

		PartDefinition cube_r292 = leftOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(65, 8).addBox(-0.4F, -0.8832F, -1.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.093F, -0.0162F, 0.039F, 0.447F, -0.28F, 0.2159F));

		PartDefinition cube_r293 = leftOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(72, 4).addBox(-0.8071F, -0.2725F, 0.1121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4881F, 1.407F, -1.7436F, 0.508F, -0.2022F, 0.3173F));

		PartDefinition cube_r294 = leftOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(22, 71).addBox(-0.8071F, -0.1725F, -0.3879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4881F, 1.407F, -1.7436F, 1.0982F, -0.1717F, 0.3346F));

		PartDefinition cube_r295 = leftOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(39, 20).addBox(-1.6979F, -0.1659F, -0.3227F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8317F, -0.707F, -3.5446F, 1.3191F, -0.3545F, -0.3221F));

		PartDefinition cube_r296 = leftOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(11, 40).addBox(-1.4222F, -0.7995F, -0.6146F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8471F, 0.7576F, -1.4892F, 2.5067F, -0.0034F, -1.1659F));

		PartDefinition cube_r297 = leftOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(36, 55).addBox(-1.498F, -0.8972F, -1.5635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3859F, -0.7032F, -2.918F, 2.1539F, -0.466F, -0.0641F));

		PartDefinition cube_r298 = leftOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(66, 30).addBox(-0.3742F, -0.2021F, -0.2587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.6743F, -1.8572F, -2.931F, 0.7317F, 0.7028F, 1.985F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(22, 78).addBox(-1.4F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3428F, -2.0454F, -3.0187F, 0.755F, 0.113F, 0.9186F));

		PartDefinition cube_r300 = leftOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(83, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.92F, -0.3192F, -2.2028F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(65, 83).addBox(-0.5F, -0.8F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7148F, -1.3924F, -3.3468F, 0.8383F, 0.0238F, 1.1547F));

		PartDefinition cube_r302 = leftOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(89, 11).addBox(-0.1756F, -0.2021F, -0.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 26).addBox(0.4244F, -0.2021F, -1.3945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.6743F, -1.8572F, -2.931F, 0.5593F, -0.2809F, 1.2873F));

		PartDefinition cube_r303 = leftOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 66).addBox(-0.59F, -0.6174F, -1.2582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6716F, 1.8964F, -1.5114F, 1.491F, -0.0291F, 0.852F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 3.2979F, 0.5427F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(54, 54).mirror().addBox(-0.5F, -0.3102F, -1.5028F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9906F, -2.6324F, 0.3228F, 1.6764F, 0.3065F, 1.1944F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0704F, -2.7612F, 0.0758F, 2.7703F, 0.5406F, 1.2231F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-0.2825F, -1.0645F, -0.9634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.093F, 0.1838F, 1.039F, 0.8833F, 0.28F, -0.2159F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.3925F, -1.086F, -0.3602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.093F, -0.2162F, 0.939F, 1.8084F, 0.28F, -0.2159F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-0.2376F, 0.0295F, 0.4843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.793F, -1.1162F, 0.039F, 1.5371F, 0.4452F, 0.1941F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-0.1166F, 0.0295F, -0.4936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.793F, -1.1162F, 0.039F, 1.3931F, 0.4117F, -0.1497F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-0.6F, -0.8832F, -1.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.093F, -0.0162F, 0.039F, 0.447F, 0.28F, -0.2159F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.1929F, -0.2725F, 0.1121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4881F, 1.407F, -1.7436F, 0.508F, 0.2022F, -0.3173F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(22, 71).mirror().addBox(-0.1929F, -0.1725F, -0.3879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4881F, 1.407F, -1.7436F, 1.0982F, 0.1717F, -0.3346F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(39, 20).mirror().addBox(-0.3021F, -0.1659F, -0.3227F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8317F, -0.707F, -3.5446F, 1.3191F, 0.3545F, 0.3221F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(11, 40).mirror().addBox(-0.5778F, -0.7995F, -0.6146F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8471F, 0.7576F, -1.4892F, 2.5067F, 0.0034F, 1.1659F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-0.502F, -0.8972F, -1.5635F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3859F, -0.7032F, -2.918F, 2.1539F, 0.466F, 0.0641F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-0.6258F, -0.2021F, -0.2587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.6743F, -1.8572F, -2.931F, 0.7317F, -0.7028F, -1.985F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-0.6F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3428F, -2.0454F, -3.0187F, 0.755F, -0.113F, -0.9186F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.92F, -0.3192F, -2.2028F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-0.5F, -0.8F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7148F, -1.3924F, -3.3468F, 0.8383F, -0.0238F, -1.1547F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(89, 11).mirror().addBox(-0.8244F, -0.2021F, -0.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 26).mirror().addBox(-1.4244F, -0.2021F, -1.3945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.6743F, -1.8572F, -2.931F, 0.5593F, 0.2809F, -1.2873F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.41F, -0.6174F, -1.2582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6716F, 1.8964F, -1.5114F, 1.491F, 0.0291F, -0.852F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.2341F, 0.8627F, 1.1682F, 0.0202F, -0.0005F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(46, 64).mirror().addBox(-0.0436F, 0.115F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4073F, 1.915F, -4.6055F, -1.3247F, 0.0485F, -0.0349F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(0.0F, -1.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4073F, 1.915F, -3.7055F, -1.3945F, 0.0485F, -0.0349F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9936F, 3.7115F, -7.5937F, -1.1833F, -0.1884F, -0.0371F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9936F, 3.7115F, -7.5937F, -1.3229F, -0.1884F, -0.0371F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9419F, 3.3705F, -7.8597F, -1.2537F, -0.1896F, -0.0304F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(69, 89).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0371F, 3.3197F, -7.3715F, -2.0825F, 0.1133F, -0.5928F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(89, 67).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9419F, 3.3705F, -7.8597F, -1.4632F, -0.1896F, -0.0304F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-1.0F, -0.0392F, 0.0011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(83, 71).addBox(0.2F, -0.0392F, 0.0011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7F, 2.0669F, -4.484F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(46, 83).mirror().addBox(-1.0F, -0.2283F, -0.0197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(46, 83).addBox(0.2F, -0.2283F, -0.0197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7F, 1.8669F, -2.684F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.7F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7198F, 2.7567F, -9.002F, -1.0347F, -0.0552F, -0.2885F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(64, 87).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7225F, 3.5566F, -8.9883F, -1.5533F, -0.192F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7651F, 3.5427F, -8.7692F, -1.9722F, -0.192F, 0.0F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.0086F, -6.5643F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-1.0F, -0.318F, -0.9964F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(79, 4).addBox(0.2F, -0.318F, -0.9964F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7F, 3.6669F, -4.284F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(32, 83).mirror().addBox(-1.0F, -0.1061F, -0.9327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(32, 83).addBox(0.2F, -0.1061F, -0.9327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7F, 3.4669F, -2.384F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-1.0F, -0.0344F, -2.0341F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(18, 58).addBox(1.8F, -0.0344F, -2.0341F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 2.4669F, 0.716F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(81, 0).addBox(2.3F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, 3.2114F, -2.4385F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(65, 3).mirror().addBox(-1.0F, 0.106F, -1.9578F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 3).addBox(1.8F, 0.106F, -1.9578F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.2669F, 0.316F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.5F, -0.047F, -2.9932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.5348F, 0.7416F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(-0.0901F, -0.2406F, -0.4726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 3.1775F, -7.5998F, -2.3487F, 0.2562F, -0.7556F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(84, 4).mirror().addBox(-0.0901F, -0.2121F, -0.2482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 3.1775F, -7.5998F, -2.436F, 0.2562F, -0.7556F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(84, 67).mirror().addBox(-0.5F, -0.8009F, -0.3358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-2.7132F, 2.164F, -8.7402F, -3.1002F, 0.3501F, -1.0874F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, -1.7401F, -0.5946F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.7132F, 2.164F, -8.7402F, -2.7983F, 0.3621F, -1.1224F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-1.0F, -2.0266F, -0.8994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.5669F, -1.184F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(90, 25).mirror().addBox(-1.0F, 0.2058F, 0.4072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(85, 15).mirror().addBox(-1.0F, -0.1942F, 0.0072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(90, 25).addBox(1.8F, 0.2058F, 0.4072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(85, 15).addBox(1.8F, -0.1942F, 0.0072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5F, 1.3669F, -2.084F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(46, 64).addBox(0.0436F, 0.115F, -0.0423F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2073F, 1.915F, -4.6055F, -1.3247F, -0.0485F, 0.0349F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(33, 90).addBox(0.0F, -1.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2073F, 1.915F, -3.7055F, -1.3945F, -0.0485F, 0.0349F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(20, 89).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2064F, 3.7115F, -7.5937F, -1.1833F, 0.1884F, 0.0371F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(10, 90).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2064F, 3.7115F, -7.5937F, -1.3229F, 0.1884F, 0.0371F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(15, 89).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2581F, 3.3705F, -7.8597F, -1.2537F, 0.1896F, 0.0304F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(69, 89).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1629F, 3.3197F, -7.3715F, -2.0825F, -0.1133F, 0.5928F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(89, 67).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2581F, 3.3705F, -7.8597F, -1.4632F, 0.1896F, 0.0304F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(85, 77).addBox(-0.6145F, -0.9994F, -0.8896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4775F, 4.0566F, -9.5883F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(5, 90).addBox(-0.3F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4802F, 2.7567F, -9.002F, -1.0347F, 0.0552F, 0.2885F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(64, 87).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4775F, 3.5566F, -8.9883F, -1.5533F, 0.192F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(89, 3).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4349F, 3.5427F, -8.7692F, -1.9722F, 0.192F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(90, 28).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0086F, -6.5643F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(27, 48).addBox(-0.5F, -0.047F, -2.9932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8F, 2.5348F, 0.7416F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(79, 67).addBox(-0.9099F, -0.2406F, -0.4726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.1775F, -7.5998F, -2.3487F, -0.2562F, 0.7556F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(84, 4).addBox(-0.9099F, -0.2121F, -0.2482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5F, 3.1775F, -7.5998F, -2.436F, -0.2562F, 0.7556F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 67).addBox(-0.5F, -0.8009F, -0.3358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.5132F, 2.164F, -8.7402F, -3.1002F, -0.3501F, 1.0874F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -1.7401F, -0.5946F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5132F, 2.164F, -8.7402F, -2.7983F, -0.3621F, 1.1224F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(20, 85).addBox(0.0F, -2.0266F, -0.8994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 1.5669F, -1.184F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(63, 68).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5464F, 1.6845F, -0.4276F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(12, 69).addBox(-0.5F, -0.4886F, 0.0422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.2906F, 1.9552F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(27, 53).addBox(-0.5F, -0.5059F, -0.3243F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0472F, 2.1691F, 0.2782F, -0.024F, 0.0839F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(48, 29).addBox(-0.5F, -0.8162F, -0.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3011F, 2.5565F, 0.3969F, 0.3239F, 0.1326F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.8162F, -0.0685F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0096F, 2.8844F, 0.4656F, 0.1144F, 0.3506F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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