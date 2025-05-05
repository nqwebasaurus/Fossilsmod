package fossils.fossils.client.blockentity.model.pyrotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PyrotheriumFossilModel extends SkullModelBase {
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
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PyrotheriumFossilModel(ModelPart root) {
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
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.389F, 12.9842F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 38).addBox(0.0F, -1.8986F, 0.6389F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 39).mirror().addBox(-1.1235F, -0.1269F, -4.0846F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.925F, 0.14F, 1.3375F, 0.2329F, -0.9279F, -1.7054F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-1.0482F, -1.1916F, -0.8545F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, 2.3661F, -0.955F, 1.3819F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 72).mirror().addBox(0.8485F, -1.0771F, -0.1147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, 1.4665F, -1.1268F, 2.4827F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(-2.1875F, -1.5574F, -0.1822F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, -1.9148F, -0.6539F, 0.9742F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-2.072F, -2.1368F, -0.3105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, -2.9857F, -1.3697F, 2.0935F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 74).mirror().addBox(-0.8258F, -1.4747F, 0.1258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, 2.7225F, -0.1314F, 1.1075F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(0.3842F, -1.0298F, 0.7285F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, 0.2316F, -0.9193F, -2.3722F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 91).mirror().addBox(0.3732F, -1.0298F, -0.4678F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, 0.6107F, -1.3257F, -2.7834F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 88).mirror().addBox(-1.0482F, -1.4519F, -0.8323F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6869F, 1.7458F, 1.3902F, -3.1317F, -0.955F, 1.3819F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 91).mirror().addBox(0.6444F, 0.0945F, -1.1009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6869F, 2.0458F, 1.3902F, -0.625F, 0.4071F, 0.1057F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(69, 19).mirror().addBox(0.2869F, 0.0945F, -1.3331F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6869F, 2.0458F, 1.3902F, -0.5672F, 0.0F, 0.384F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-0.0712F, -0.6062F, -0.1813F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3869F, 2.9507F, 1.8885F, -0.1668F, 0.1053F, 0.301F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(0.0F, -0.5F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0213F, -5.2815F, -3.8331F, -2.5005F, -0.3741F, 2.2816F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(72, 69).mirror().addBox(0.0F, -0.5F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.6989F, -4.6865F, -4.4978F, -2.1318F, -0.8533F, 1.6721F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 48).mirror().addBox(-5.0956F, -0.5096F, 0.0309F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.1825F, -2.9261F, -2.7415F, -0.6693F, 0.4571F, -0.9297F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 32).mirror().addBox(-0.0593F, -0.5096F, 0.1855F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0371F, -2.805F, -4.1399F, -0.6683F, -0.4545F, -0.2601F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.8449F, -0.5096F, -1.636F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.1825F, -2.9261F, -2.7415F, -1.315F, -0.9576F, 0.6675F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(15, 30).mirror().addBox(-1.1235F, -0.6027F, -3.7755F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0904F, -1.0067F, 0.5703F, 0.4424F, -0.9279F, -1.7054F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(70, 97).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.602F, -2.0453F, -2.0371F, -2.6766F, -0.9903F, 1.617F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(67, 32).addBox(-3.9288F, -0.6062F, -0.1813F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3869F, 2.9507F, 1.8885F, -0.1668F, -0.1053F, -0.301F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(69, 19).addBox(-4.2869F, 0.0945F, -1.3331F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.6869F, 2.0458F, 1.3902F, -0.5672F, 0.0F, -0.384F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(14, 91).addBox(-2.6444F, 0.0945F, -1.1009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.6869F, 2.0458F, 1.3902F, -0.625F, -0.4071F, -0.1057F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(70, 97).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.602F, -2.0453F, -2.0371F, -2.6766F, 0.9903F, -1.617F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(43, 39).addBox(0.1235F, -0.1269F, -4.0846F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.925F, 0.14F, 1.3375F, 0.2329F, 0.9279F, 1.7054F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(15, 30).addBox(0.1235F, -0.6027F, -3.7755F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0904F, -1.0067F, 0.5703F, 0.4424F, 0.9279F, 1.7054F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(51, 0).addBox(-4.0F, -0.5F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0213F, -5.2815F, -3.8331F, -2.5005F, 0.3741F, -2.2816F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 69).addBox(-2.0F, -0.5F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.6989F, -4.6865F, -4.4978F, -2.1318F, 0.8533F, -1.6721F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 50).addBox(-1.1551F, -0.5096F, -1.636F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.1825F, -2.9261F, -2.7415F, -1.315F, 0.9576F, -0.6675F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 88).addBox(-0.9518F, -1.4519F, -0.8323F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, -3.1317F, 0.955F, -1.3819F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(26, 91).addBox(-2.3732F, -1.0298F, -0.4678F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, 0.6107F, 1.3257F, 2.7834F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(87, 79).addBox(-2.3842F, -1.0298F, 0.7285F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, 0.2316F, 0.9193F, 2.3722F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 74).addBox(-0.1742F, -1.4747F, 0.1258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, 2.7225F, 0.1314F, -1.1075F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 88).addBox(0.072F, -2.1368F, -0.3105F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, -2.9857F, 1.3697F, -2.0935F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(52, 74).addBox(-0.8125F, -1.5574F, -0.1822F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, -1.9148F, 0.6539F, -0.9742F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(30, 32).addBox(-1.9407F, -0.5096F, 0.1855F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0371F, -2.805F, -4.1399F, -0.6683F, 0.4545F, 0.2601F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 48).addBox(0.0956F, -0.5096F, 0.0309F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.1825F, -2.9261F, -2.7415F, -0.6693F, -0.4571F, 0.9297F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(95, 72).addBox(-1.8485F, -1.0771F, -0.1147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, 1.4665F, 1.1268F, -2.4827F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 39).addBox(-0.9518F, -1.1916F, -0.8545F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6869F, 1.7458F, 1.3902F, 2.3661F, 0.955F, -1.3819F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(38, 58).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 3.7745F, 1.267F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.0986F, -0.9611F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 2.6024F, 1.407F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 69).addBox(-1.0F, -4.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(14, 80).addBox(-0.5F, 0.0347F, -0.7619F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.1045F, 0.0312F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(37, 77).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.7292F, -0.1514F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 87).addBox(4.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(69, 9).addBox(-1.0F, 2.1702F, -0.9565F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.5652F, -0.9822F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(75, 22).addBox(-0.5F, 0.1397F, -0.9249F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 6.6505F, -0.2874F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(74, 62).addBox(-0.5F, -0.0788F, -0.3058F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 6.5652F, -0.9822F, -0.3665F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7441F, -1.3073F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(73, 2).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(88, 61).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(90, 42).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4271F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 74).addBox(-1.5F, -1.7F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 3.4131F, -0.2404F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(87, 18).addBox(-1.5F, -0.1381F, -0.9332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.0131F, 0.0596F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(14, 87).addBox(-1.5F, -0.3381F, -0.9332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 6.3384F, -1.1938F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(37, 95).addBox(0.0F, -1.5857F, -0.1115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(82, 22).addBox(-0.8F, 0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 47).addBox(-1.3F, -3.4F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5557F, -0.2179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 1.9895F, 0.2386F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(77, 95).addBox(-0.5F, -0.8546F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0929F, 0.7449F, 0.0824F, 0.4269F, -0.4376F, -0.6421F));

		PartDefinition cube_r59 = leftLeg4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(95, 45).addBox(-0.5F, -0.142F, -0.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(1.0929F, 0.7449F, 0.0824F, 0.0604F, -0.4376F, -0.6421F));

		PartDefinition cube_r60 = leftLeg4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 91).addBox(-1.0F, -0.8F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.9705F, -0.078F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(33, 90).addBox(-1.0F, -4.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 4.8557F, -0.4179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, -0.3634F, -4.5119F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.6317F, 1.0072F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftLeg5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(57, 52).addBox(-0.5F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1366F, -0.5119F, 0.0F, -0.7854F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3329F, -3.5045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 2.6024F, 1.407F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(63, 69).addBox(-1.0F, -4.4F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.755F, 0.0425F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(80, 78).addBox(-1.5F, 0.0347F, -0.7619F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.1045F, 0.0312F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 77).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.7292F, -0.1514F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(87, 0).addBox(-5.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9F, 10.6517F, -2.8097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 14).addBox(-1.0F, 2.1702F, -0.9565F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.5652F, -0.9822F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(30, 77).addBox(-1.5F, 0.1397F, -0.9249F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 6.6505F, -0.2874F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(76, 27).addBox(-1.5F, -0.0788F, -0.3058F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 6.5652F, -0.9822F, -0.3665F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7441F, -1.3073F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(36, 73).addBox(-1.0F, -0.3F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(88, 64).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4271F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 45).addBox(-0.5F, -1.7F, -0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 3.4131F, -0.2404F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 87).addBox(-0.5F, -0.1381F, -0.9332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.0131F, 0.0596F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(87, 75).addBox(-0.5F, -0.3381F, -0.9332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.0131F, 0.0596F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 6.3384F, -1.1938F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(96, 20).addBox(0.0F, -1.5857F, -0.1115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1937F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(33, 82).addBox(-0.2F, 0.3F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(36, 68).addBox(-0.7F, -3.4F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 3.5557F, -0.2179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.9895F, 0.2386F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 95).addBox(-0.5F, -0.8546F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.0929F, 0.7449F, 0.0824F, 0.4269F, 0.4376F, 0.6421F));

		PartDefinition cube_r80 = rightLeg4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(95, 48).addBox(-0.5F, -0.142F, -0.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0929F, 0.7449F, 0.0824F, 0.0604F, 0.4376F, 0.6421F));

		PartDefinition cube_r81 = rightLeg4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(47, 91).addBox(-1.0F, -0.8F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.9705F, -0.078F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightLeg4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(90, 36).addBox(-1.0F, -4.0F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 4.8557F, -0.4179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(15, 38).addBox(-1.5F, -0.3634F, -4.5119F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.6317F, 1.0072F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 57).addBox(-1.5F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1366F, -0.5119F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3329F, -3.5045F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8596F, -4.2992F, 0.1496F, 0.1295F, 0.0195F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(64, 97).addBox(0.0F, 0.6F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 4).addBox(0.0F, 0.7F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2966F, -5.8386F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(-1.0F, 0.1F, -0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8397F, 0.1495F, -1.5049F, -0.1246F, -0.3983F, -0.4673F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(74, 67).mirror().addBox(-1.5607F, -0.2631F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, -0.218F, -3.4137F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(92, 29).addBox(-1.0F, 0.1F, -0.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8397F, 0.1495F, -1.5049F, -0.1246F, 0.3983F, 0.4673F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(74, 67).addBox(-0.4393F, -0.2631F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, -0.218F, -3.4137F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -0.1512F, 8.7474F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4656F, -13.1997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.702F, -4.6624F, -0.1051F, 0.0868F, -0.0091F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-4.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.5644F, -0.4102F, 0.209F, -1.1313F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1206F, -0.5644F, -0.3457F, 0.3062F, -0.8797F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(63, 84).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0794F, -2.5644F, -0.334F, 0.3196F, -0.8761F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(84, 55).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0794F, -2.5644F, -0.4026F, 0.2248F, -1.1296F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-6.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0794F, -2.5644F, -0.4549F, 0.056F, -1.498F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -4.3644F, -0.3565F, 0.3391F, -0.7827F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -4.3644F, -0.4287F, 0.2384F, -1.035F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(83, 30).mirror().addBox(-8.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2794F, -4.3644F, -0.4836F, 0.0595F, -1.3989F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(15, 94).addBox(2.8978F, -0.7765F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.5644F, -0.4102F, -0.209F, 1.1313F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 16).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1206F, -0.5644F, -0.3457F, -0.3062F, 0.8797F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(63, 84).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0794F, -2.5644F, -0.334F, -0.3196F, 0.8761F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 55).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0794F, -2.5644F, -0.4026F, -0.2248F, 1.1296F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(77, 0).addBox(5.1255F, -3.0192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0794F, -2.5644F, -0.4549F, -0.056F, 1.498F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 53).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -4.3644F, -0.3565F, -0.3391F, 0.7827F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(84, 6).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -4.3644F, -0.4287F, -0.2384F, 1.035F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 30).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2794F, -4.3644F, -0.4836F, -0.0595F, 1.3989F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(6, 98).addBox(0.0F, -1.0408F, 0.0224F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -1.157F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(3, 98).addBox(0.0F, -0.9594F, -0.0812F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -3.057F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 96).addBox(0.0F, -1.0938F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.596F, -4.957F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(17, 12).addBox(-1.0F, 0.0148F, -6.0846F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(85, 14).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -1.3644F, -0.4123F, 0.2903F, -0.9802F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(85, 12).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -1.3644F, -0.326F, 0.3853F, -0.7215F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4794F, -1.3644F, -0.4873F, 0.1137F, -1.3488F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(47, 62).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5794F, -5.2644F, -0.4849F, 0.1491F, -1.3141F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(85, 10).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5794F, -5.2644F, -0.3965F, 0.3224F, -0.9411F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(9, 85).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5794F, -5.2644F, -0.3012F, 0.4124F, -0.6775F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(60, 22).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0794F, -3.3644F, -0.4849F, 0.1491F, -1.3141F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(85, 8).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0794F, -3.3644F, -0.3965F, 0.3224F, -0.9411F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0794F, -3.3644F, -0.3012F, 0.4124F, -0.6775F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(85, 14).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -1.3644F, -0.4123F, -0.2903F, 0.9802F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(85, 12).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -1.3644F, -0.326F, -0.3853F, 0.7215F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(67, 35).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4794F, -1.3644F, -0.4873F, -0.1137F, 1.3488F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(47, 62).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5794F, -5.2644F, -0.4849F, -0.1491F, 1.3141F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(85, 10).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5794F, -5.2644F, -0.3965F, -0.3224F, 0.9411F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(9, 85).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5794F, -5.2644F, -0.3012F, -0.4124F, 0.6775F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(60, 22).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0794F, -3.3644F, -0.4849F, -0.1491F, 1.3141F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(85, 8).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0794F, -3.3644F, -0.3965F, -0.3224F, 0.9411F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0794F, -3.3644F, -0.3012F, -0.4124F, 0.6775F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(9, 98).addBox(0.0F, -1.7522F, 0.2128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.404F, -2.457F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -0.8522F, 0.4128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -4.257F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(67, 97).addBox(0.0F, -0.1163F, 0.3194F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.096F, -5.957F, -0.3316F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -0.8F, -6.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4732F, -5.3281F, 0.5098F, 0.1144F, 0.0637F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(92, 96).addBox(0.0F, -3.7256F, 3.2459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 96).addBox(0.0F, -3.1256F, 1.6459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 94).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.2F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-12.3F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 13.2235F, -4.6227F, 0.2521F, 1.0808F, 1.0158F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(27, 9).mirror().addBox(-10.3F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 13.2235F, -4.6227F, 0.0758F, 0.9914F, 0.8131F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-9.1F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 13.2235F, -4.6227F, -0.0043F, 0.8536F, 0.7185F));

		PartDefinition cube_r136 = body4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(34, 25).mirror().addBox(-7.8F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 13.2235F, -4.6227F, -0.0879F, 0.6752F, 0.6093F));

		PartDefinition cube_r137 = body4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(26, 46).mirror().addBox(-6.9F, 0.0F, -0.7F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8874F, 13.0035F, -5.876F, -0.1027F, 0.3679F, 0.6178F));

		PartDefinition cube_r138 = body4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(86, 73).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -1.7344F, -0.7022F, 0.0601F, -0.774F));

		PartDefinition cube_r139 = body4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(63, 86).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -1.7344F, -0.6972F, -0.1091F, -0.9741F));

		PartDefinition cube_r140 = body4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -1.7344F, -0.6208F, -0.3572F, -1.2995F));

		PartDefinition cube_r141 = body4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-10.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -3.7344F, -0.611F, -0.3235F, -1.3028F));

		PartDefinition cube_r142 = body4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -3.7344F, -0.6776F, -0.0802F, -0.976F));

		PartDefinition cube_r143 = body4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -3.7344F, -0.6771F, 0.0844F, -0.7722F));

		PartDefinition cube_r144 = body4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-9.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -5.5344F, -0.6061F, -0.3067F, -1.3043F));

		PartDefinition cube_r145 = body4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -5.5344F, -0.6646F, 0.0966F, -0.7711F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(86, 49).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2577F, -5.5344F, -0.6678F, -0.0658F, -0.9767F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(34, 27).mirror().addBox(-7.1F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, 13.2235F, -4.6227F, -0.0515F, 0.4338F, 0.6699F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-6.3F, 0.0F, -0.8F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1538F, 12.649F, -7.098F, -0.1145F, 0.3294F, 0.5849F));

		PartDefinition cube_r149 = body4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(64, 0).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -1.7344F, -0.6208F, 0.3572F, 1.2995F));

		PartDefinition cube_r150 = body4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(63, 86).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -1.7344F, -0.6972F, 0.1091F, 0.9741F));

		PartDefinition cube_r151 = body4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(86, 73).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -1.7344F, -0.7022F, -0.0601F, 0.774F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(86, 57).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -3.7344F, -0.6771F, -0.0844F, 0.7722F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(86, 59).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -3.7344F, -0.6776F, 0.0802F, 0.976F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 62).addBox(5.1255F, -3.0192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -3.7344F, -0.611F, 0.3235F, 1.3028F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(73, 6).addBox(5.1255F, -3.0192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -5.5344F, -0.6061F, 0.3067F, 1.3043F));

		PartDefinition cube_r156 = body4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(86, 51).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -5.5344F, -0.6646F, -0.0966F, 0.7711F));

		PartDefinition cube_r157 = body4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 10).addBox(0.3F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 13.2235F, -4.6227F, 0.2521F, -1.0808F, -1.0158F));

		PartDefinition cube_r158 = body4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(27, 9).addBox(0.3F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 13.2235F, -4.6227F, 0.0758F, -0.9914F, -0.8131F));

		PartDefinition cube_r159 = body4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(30, 30).addBox(0.1F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 13.2235F, -4.6227F, -0.0043F, -0.8536F, -0.7185F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(34, 25).addBox(-0.2F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 13.2235F, -4.6227F, -0.0879F, -0.6752F, -0.6093F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(34, 27).addBox(0.1F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0856F, 13.2235F, -4.6227F, -0.0515F, -0.4338F, -0.6699F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(26, 46).addBox(-0.1F, 0.0F, -0.7F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8874F, 13.0035F, -5.876F, -0.1027F, -0.3679F, -0.6178F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(36, 6).addBox(-0.7F, 0.0F, -0.8F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1538F, 12.649F, -7.098F, -0.1145F, -0.3294F, -0.5849F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(45, 32).addBox(-1.0F, -0.9364F, -0.0454F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.8535F, -8.1542F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(86, 49).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2577F, -5.5344F, -0.6678F, 0.0658F, 0.9767F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2929F, -5.7994F, -0.1056F, 0.1302F, -0.0138F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(74, 93).addBox(0.0F, -3.3226F, -0.0168F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3146F, -2.3706F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(95, 96).addBox(0.0F, -1.1222F, -0.1133F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0854F, -4.2706F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(97, 42).addBox(0.0F, -0.6352F, -0.0576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8854F, -5.9706F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-4.1152F, -0.522F, -0.2189F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7243F, 4.3818F, -6.0779F, -0.1629F, 0.1393F, -1.9662F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(93, 88).mirror().addBox(0.5272F, -1.8505F, 2.6345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, 2.6657F, -0.169F, 0.3803F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(58, 31).mirror().addBox(0.5272F, -1.8715F, 0.3727F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, 1.252F, -0.169F, 0.3803F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(78, 8).mirror().addBox(0.5272F, 0.4007F, -1.5228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(24, 52).mirror().addBox(0.5272F, 1.4007F, 0.4772F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, -0.0919F, -0.169F, 0.3803F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(0.5272F, 0.6827F, 0.8076F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, 0.2222F, -0.169F, 0.3803F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(13, 50).mirror().addBox(0.5272F, 0.2553F, -0.8633F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, 0.676F, -0.169F, 0.3803F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-3.2152F, -0.222F, 0.2811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8648F, -5.335F, 0.0315F, -0.3987F, -0.9753F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1648F, -3.735F, -0.4913F, 0.2468F, -0.7921F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(83, 26).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1648F, -3.735F, -0.5336F, 0.1178F, -1.024F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(33, 93).mirror().addBox(-7.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1648F, -3.735F, -0.5386F, -0.0893F, -1.3685F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(-8.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4648F, -1.735F, -0.5689F, -0.1718F, -1.3132F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(85, 34).mirror().addBox(-5.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4648F, -1.735F, -0.5897F, 0.05F, -0.9773F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(85, 32).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4648F, -1.735F, -0.5627F, 0.1933F, -0.7563F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(0.5272F, -1.3788F, -3.9175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, 0.7982F, -0.169F, 0.3803F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(0.5272F, -1.2507F, 0.4063F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, 2.2643F, -0.169F, 0.3803F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.4F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6082F, 1.1071F, -2.6957F, 0.9142F, 0.2656F, 0.2024F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(49, 11).mirror().addBox(0.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.178F, 1.522F, -0.9206F, 1.1298F, -0.169F, 0.3803F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9306F, 11.3748F, -2.0114F, -0.1972F, 0.3502F, 0.5652F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-5.6F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.113F, 10.3713F, -3.5421F, -0.6314F, 0.416F, 0.5105F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-4.7F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0243F, 9.3925F, -4.7131F, -0.6647F, 0.4202F, 0.3645F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(64, 24).addBox(0.1152F, -0.522F, -0.2189F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7243F, 4.3818F, -6.0779F, -0.1629F, -0.1393F, 1.9662F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(61, 74).addBox(0.2152F, -0.222F, 0.2811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8648F, -5.335F, 0.0315F, 0.3987F, 0.9753F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(83, 28).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1648F, -3.735F, -0.4913F, -0.2468F, 0.7921F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(83, 26).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1648F, -3.735F, -0.5336F, -0.1178F, 1.024F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(33, 93).addBox(5.1255F, -3.0192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1648F, -3.735F, -0.5386F, 0.0893F, 1.3685F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(47, 86).addBox(5.1255F, -3.0192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4648F, -1.735F, -0.5689F, 0.1718F, 1.3132F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(85, 34).addBox(2.8978F, -0.7765F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4648F, -1.735F, -0.5897F, -0.05F, 0.9773F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(85, 32).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4648F, -1.735F, -0.5627F, -0.1933F, 0.7563F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(78, 8).addBox(-1.5272F, 0.4007F, -1.5228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(24, 52).addBox(-1.5272F, 1.4007F, 0.4772F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, -0.0919F, 0.169F, -0.3803F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(9, 64).addBox(-1.5272F, 0.6827F, 0.8076F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, 0.2222F, 0.169F, -0.3803F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(13, 50).addBox(-1.5272F, 0.2553F, -0.8633F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, 0.676F, 0.169F, -0.3803F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5272F, -1.3788F, -3.9175F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, 0.7982F, 0.169F, -0.3803F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(58, 31).addBox(-1.5272F, -1.8715F, 0.3727F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, 1.252F, 0.169F, -0.3803F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(93, 88).addBox(-1.5272F, -1.8505F, 2.6345F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, 2.6657F, 0.169F, -0.3803F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(56, 45).addBox(-1.5272F, -1.2507F, 0.4063F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, 2.2643F, 0.169F, -0.3803F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(36, 0).addBox(-1.6F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6082F, 1.1071F, -2.6957F, 0.9142F, -0.2656F, -0.2024F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(49, 11).addBox(-1.5272F, -3.2929F, -3.6175F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.178F, 1.522F, -0.9206F, 1.1298F, 0.169F, -0.3803F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(74, 41).addBox(-1.0F, -0.9035F, -1.5298F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.3823F, -1.4798F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 11.3748F, -2.0114F, -0.1972F, -0.3502F, -0.5652F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(50, 8).addBox(-0.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.113F, 10.3713F, -3.5421F, -0.6314F, -0.416F, -0.5105F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(53, 6).addBox(-0.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0243F, 9.3925F, -4.7131F, -0.6647F, -0.4202F, -0.3645F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(34, 18).addBox(-1.0F, -0.6916F, -6.5107F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 12.3823F, -1.4798F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(17, 21).addBox(-1.0F, -1.908F, 4.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.3854F, -10.0706F, 0.3403F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 5.537F, -3.5797F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(88, 70).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.721F, 3.8131F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(47, 88).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3246F, 3.0679F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(88, 67).addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4149F, 3.1157F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(80, 83).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0103F, -0.1231F, 0.9712F, 0.3577F, 0.0014F, -0.001F));

		PartDefinition cube_r216 = leftarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(27, 69).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0128F, -0.1266F, -0.8008F, 0.0435F, 0.0014F, -0.001F));

		PartDefinition cube_r217 = leftarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(35, 52).addBox(-1.0F, -0.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0104F, 0.367F, 0.5131F, -0.2881F, 0.0014F, -0.001F));

		PartDefinition cube_r218 = leftarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(59, 91).addBox(-0.01F, -1.0076F, -0.0704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5673F, 0.0378F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r219 = leftarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(7, 74).addBox(-0.5F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.7226F, 1.5028F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(72, 84).addBox(-0.5F, -1.4F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 6.8641F, 2.3196F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(72, 73).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0F, 1.1332F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(79, 73).addBox(-0.5F, -1.5F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.4216F, 1.4774F, 0.1658F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.1849F, 3.5351F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftarm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(77, 53).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 0.6123F, -0.2441F, 1.5708F, 0.7679F, -1.5708F));

		PartDefinition cube_r224 = leftarm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(87, 82).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, 0.3539F, 0.6201F, 1.5708F, -0.2356F, -1.5708F));

		PartDefinition cube_r225 = leftarm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(82, 0).addBox(-0.9256F, -3.0299F, -0.9596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, 3.3941F, 0.7136F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition cube_r226 = leftarm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(66, 79).addBox(-0.2F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1236F, 4.7648F, -0.1566F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r227 = leftarm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(78, 32).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1236F, 4.3987F, 0.6656F, 1.5708F, -1.1519F, -1.5708F));

		PartDefinition cube_r228 = leftarm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(68, 88).addBox(-0.9F, -0.4F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1764F, 2.2926F, 0.315F, 1.5708F, -0.9599F, -1.5708F));

		PartDefinition cube_r229 = leftarm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 94).addBox(0.3F, -2.3F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1764F, 2.8828F, -0.8433F, 1.5708F, -1.0996F, -1.5708F));

		PartDefinition cube_r230 = leftarm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(58, 82).addBox(-0.1335F, -2.0622F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 2.2954F, -0.4664F, 1.5708F, -1.4486F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(-0.2F, 5.7969F, 0.0286F));

		PartDefinition cube_r231 = leftArm3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(93, 53).addBox(0.2F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftArm3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(47, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(65, 37).addBox(-1.0F, -0.2399F, -0.3907F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.973F, -0.2155F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftArm4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(78, 13).addBox(-1.2F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6691F, 2.007F, 0.3513F, -1.0086F, -0.5442F, -0.2928F));

		PartDefinition cube_r234 = leftArm4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(20, 58).addBox(-1.0F, -1.4F, 0.4F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0601F, 0.1093F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 5.537F, -3.5797F, 0.1831F, -0.0079F, 0.0429F));

		PartDefinition cube_r235 = rightarm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(89, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.721F, 3.8131F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightarm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(61, 88).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3246F, 3.0679F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightarm.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(54, 88).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(86, 88).addBox(-1.0F, -0.7F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.4149F, 3.1157F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightarm.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(40, 84).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0103F, -0.1231F, 0.9712F, 0.3577F, -0.0014F, 0.001F));

		PartDefinition cube_r239 = rightarm.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(45, 69).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0128F, -0.1266F, -0.8008F, 0.0435F, -0.0014F, 0.001F));

		PartDefinition cube_r240 = rightarm.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(46, 52).addBox(-1.0F, -0.6F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0104F, 0.367F, 0.5131F, -0.2881F, -0.0014F, 0.001F));

		PartDefinition cube_r241 = rightarm.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(78, 91).addBox(-0.99F, -1.0076F, -0.0704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.5673F, 0.0378F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r242 = rightarm.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(14, 74).addBox(-1.5F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.7226F, 1.5028F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightarm.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(33, 86).addBox(-1.5F, -1.4F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.8641F, 2.3196F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightarm.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 74).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0F, 1.1332F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightarm.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 80).addBox(-1.5F, -1.5F, -0.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.4216F, 1.4774F, 0.1658F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.1849F, 3.5351F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightarm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(59, 77).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 0.6123F, -0.2441F, 1.5708F, -0.7679F, 1.5708F));

		PartDefinition cube_r247 = rightarm2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(87, 85).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1764F, 0.3539F, 0.6201F, 1.5708F, 0.2356F, 1.5708F));

		PartDefinition cube_r248 = rightarm2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(28, 82).addBox(-0.0744F, -3.0299F, -0.9596F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, 3.3941F, 0.7136F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition cube_r249 = rightarm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(73, 79).addBox(-0.8F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1236F, 4.7648F, -0.1566F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r250 = rightarm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(44, 79).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1236F, 4.3987F, 0.6656F, 1.5708F, 1.1519F, 1.5708F));

		PartDefinition cube_r251 = rightarm2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(73, 88).addBox(-0.1F, -0.4F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1764F, 2.2926F, 0.315F, 1.5708F, 0.9599F, 1.5708F));

		PartDefinition cube_r252 = rightarm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(94, 0).addBox(-1.3F, -2.3F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1764F, 2.8828F, -0.8433F, 1.5708F, 1.0996F, 1.5708F));

		PartDefinition cube_r253 = rightarm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(21, 83).addBox(-0.8665F, -2.0622F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 2.2954F, -0.4664F, 1.5708F, 1.4486F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(0.2F, 5.7969F, 0.0286F));

		PartDefinition cube_r254 = rightArm3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(64, 93).addBox(-1.2F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightArm3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(56, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(65, 42).addBox(-1.0F, -0.2399F, -0.3907F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.973F, -0.2155F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightArm4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(21, 78).addBox(-0.8F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6691F, 2.007F, 0.3513F, -1.0086F, 0.5442F, 0.2928F));

		PartDefinition cube_r257 = rightArm4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(29, 58).addBox(-2.0F, -1.4F, 0.4F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0601F, 0.1093F, -1.0908F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4854F, -5.2706F, 0.4192F, -0.0399F, -0.0178F));

		PartDefinition cube_r258 = neck2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(97, 39).addBox(0.0F, 0.3F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8185F, -1.5478F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -0.2F, 2.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1555F, -2.8108F, -0.2024F, 0.1283F, -0.0262F));

		PartDefinition cube_r260 = neck.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(64, 27).addBox(0.0F, -1.4977F, -0.5523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7196F, -0.173F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r261 = neck.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(65, 64).addBox(-1.0F, -0.6165F, -0.4594F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -1.6993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -0.6F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0179F, -1.8365F, 0.2102F, 0.0854F, 0.0182F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(21, 89).addBox(0.0F, -0.7041F, -0.5284F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9244F, -1.7688F, 0.288F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(60, 10).addBox(-1.0F, -0.7061F, -1.2766F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.5334F, -3.7673F, -1.2705F, 0.4067F, -0.3262F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(32, 95).mirror().addBox(-1.0F, 0.0444F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 95).addBox(1.0F, 0.0444F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1943F, 0.8669F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(94, 83).mirror().addBox(-1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(94, 83).addBox(1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.3943F, 0.6669F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(77, 50).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1161F, 0.1361F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(43, 46).addBox(-2.5F, -2.0712F, 0.1919F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 5.5681F, -0.4495F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(95, 60).mirror().addBox(-1.52F, -1.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(95, 60).addBox(0.52F, -1.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(34, 11).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.582F, -3.3087F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(13, 44).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 7.6983F, -2.4698F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(7, 91).addBox(-1.0F, -0.9446F, -0.7506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 7.99F, -3.2987F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(92, 25).addBox(-0.5F, -0.011F, -1.477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(60, 16).addBox(-1.5F, -0.011F, -0.977F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9595F, -2.701F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(16, 70).addBox(-1.5F, -0.024F, -1.0586F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0595F, -2.101F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(7, 70).addBox(-1.0F, -0.0424F, 0.3344F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(77, 58).addBox(-1.0F, -0.0424F, 0.0344F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.1939F, -2.1766F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(38, 62).addBox(0.0F, -0.7F, -1.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, -0.1061F, 0.7234F, 0.6283F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, 7.7298F, -5.0083F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(-0.5F, -0.197F, -0.179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(94, 31).addBox(0.1F, -0.197F, -0.179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.3F, -0.2682F, 0.1422F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-0.5F, -0.5651F, 0.1441F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(93, 4).addBox(0.1F, -0.5651F, 0.1441F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.3F, 1.4318F, -0.3578F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-0.5F, -0.3575F, -0.2543F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(94, 75).addBox(0.1F, -0.3575F, -0.2543F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3F, 1.4318F, -0.3578F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(45, 94).mirror().addBox(-0.5F, -0.1568F, -0.5941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 94).addBox(0.1F, -0.1568F, -0.5941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, -0.2682F, 0.1422F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(69, 93).mirror().addBox(-0.5F, -0.197F, -0.179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(69, 93).addBox(1.1F, -0.197F, -0.179F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.8F, -0.2682F, 0.6422F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(27, 94).mirror().addBox(-0.5F, -0.1568F, -0.5941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(27, 94).addBox(1.1F, -0.1568F, -0.5941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8F, -0.2682F, 0.6422F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-0.5F, 1.2069F, 0.1321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(94, 8).addBox(1.1F, 1.2069F, 0.1321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.8F, -0.2682F, 0.6422F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.5F, 1.3034F, -0.8717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 94).addBox(1.1F, 1.3034F, -0.8717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.8F, -0.2682F, 0.6422F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-0.8F, -0.2089F, -0.7564F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5125F, 0.3188F, 0.7144F, -0.1324F, -0.114F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(-1.0F, 0.0437F, -2.9241F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 64).addBox(0.8F, 0.0437F, -2.9241F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -3.8262F, 1.788F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(93, 92).mirror().addBox(-0.5F, -0.021F, -0.5928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(93, 92).addBox(1.5F, -0.021F, -0.5928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0F, -5.3359F, 2.1318F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, 0.0156F, -1.9939F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 61).addBox(1.5F, 0.0156F, -1.9939F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.7359F, 2.1318F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(74, 37).addBox(-1.0F, -0.4F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(21, 74).addBox(-1.0F, -0.9935F, 0.0039F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(7, 87).addBox(-0.5F, -0.9935F, 0.0039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(7, 80).addBox(-0.2F, -0.2089F, -0.7564F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.5125F, 0.3188F, 0.7144F, 0.1324F, 0.114F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(0.9F, 3.1795F, -0.5001F));

		PartDefinition cube_r290 = leftOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(81, 45).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1037F, -1.62F, 0.2436F, 1.2634F, -0.3882F, -0.4342F));

		PartDefinition cube_r291 = leftOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 69).addBox(-0.8967F, -0.2365F, 0.1706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1706F, -2.7388F, 0.2431F, 1.7459F, -0.3922F, -1.2491F));

		PartDefinition cube_r292 = leftOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(81, 65).addBox(-0.8967F, -0.2365F, 0.1706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1706F, -2.7388F, 0.2431F, 1.2922F, -0.3922F, -1.2491F));

		PartDefinition cube_r293 = leftOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(81, 61).addBox(-0.8045F, -0.136F, -0.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1706F, -2.9388F, -0.4569F, 1.7285F, -0.3922F, -1.2491F));

		PartDefinition cube_r294 = leftOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(80, 18).addBox(-0.0669F, -0.4779F, -0.4985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1706F, -1.2388F, -0.6569F, 1.403F, -0.3882F, -0.4342F));

		PartDefinition cube_r295 = leftOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(95, 66).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(95, 63).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7201F, 1.3255F, 0.2239F, 1.2578F, 0.061F, 0.2124F));

		PartDefinition cube_r296 = leftOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(95, 69).addBox(-0.2335F, -1.0172F, -0.8082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7201F, 1.1255F, 0.6239F, 0.5247F, 0.061F, 0.2124F));

		PartDefinition cube_r297 = leftOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(68, 57).addBox(-0.7852F, 0.6201F, 0.0428F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(68, 52).addBox(-0.7852F, 0.0201F, 0.0428F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4881F, 1.407F, -1.8436F, 1.2503F, -0.2211F, 0.3048F));

		PartDefinition cube_r298 = leftOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(59, 95).addBox(-0.89F, -0.4174F, 0.0418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6716F, 1.8964F, -1.5114F, 0.7713F, -0.0133F, 1.0434F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(83, 41).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5317F, 0.493F, -2.2446F, 1.0127F, -0.1583F, -0.1412F));

		PartDefinition cube_r300 = leftOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(83, 37).addBox(-0.398F, -0.8972F, -1.6635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5859F, 0.8968F, -2.318F, 2.0586F, -0.0034F, 0.0256F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(49, 58).addBox(-0.89F, -0.4174F, -1.0582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6716F, 1.8964F, -1.5114F, 1.4869F, -0.0133F, 1.0434F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-0.9F, 3.1795F, -0.5001F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(81, 45).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1037F, -1.62F, 0.2436F, 1.2634F, 0.3882F, 0.4342F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(81, 69).mirror().addBox(-0.1033F, -0.2365F, 0.1706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1706F, -2.7388F, 0.2431F, 1.7459F, 0.3922F, 1.2491F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(81, 65).mirror().addBox(-0.1033F, -0.2365F, 0.1706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1706F, -2.7388F, 0.2431F, 1.2922F, 0.3922F, 1.2491F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(81, 61).mirror().addBox(-0.1955F, -0.136F, -0.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1706F, -2.9388F, -0.4569F, 1.7285F, 0.3922F, 1.2491F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.9331F, -0.4779F, -0.4985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1706F, -1.2388F, -0.6569F, 1.403F, 0.3882F, 0.4342F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(95, 66).mirror().addBox(-0.7F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(95, 63).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7201F, 1.3255F, 0.2239F, 1.2578F, -0.061F, -0.2124F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(95, 69).mirror().addBox(-0.7665F, -1.0172F, -0.8082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7201F, 1.1255F, 0.6239F, 0.5247F, -0.061F, -0.2124F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(68, 57).mirror().addBox(-0.2148F, 0.6201F, 0.0428F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(68, 52).mirror().addBox(-0.2148F, 0.0201F, 0.0428F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4881F, 1.407F, -1.8436F, 1.2503F, 0.2211F, -0.3048F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(59, 95).mirror().addBox(-0.11F, -0.4174F, 0.0418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6716F, 1.8964F, -1.5114F, 0.7713F, 0.0133F, -1.0434F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(83, 41).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5317F, 0.493F, -2.2446F, 1.0127F, 0.1583F, 0.1412F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-0.602F, -0.8972F, -1.6635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5859F, 0.8968F, -2.318F, 2.0586F, 0.0034F, -0.0256F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.11F, -0.4174F, -1.0582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6716F, 1.8964F, -1.5114F, 1.4869F, 0.0133F, -1.0434F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.1838F, 0.0235F, 1.3631F, 0.0113F, -0.0038F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(97, 35).mirror().addBox(-0.1037F, -2.0335F, 0.0112F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9426F, 1.7949F, -5.4669F, -1.761F, 0.0485F, -0.0349F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(97, 24).mirror().addBox(-0.0577F, -0.247F, 3.1035F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9426F, -1.3051F, -5.4669F, -1.6429F, -0.2085F, 0.0152F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-0.667F, 1.0597F, -1.0851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.3775F, -6.1998F, -1.5184F, -0.192F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(51, 82).mirror().addBox(-0.667F, 0.1654F, -0.9729F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.3775F, -6.1998F, -1.6232F, -0.192F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-1.0F, -1.1176F, -0.0728F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 67).addBox(1.2F, -1.1176F, -0.0728F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 2.8669F, -3.484F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(94, 79).mirror().addBox(-0.667F, 0.0058F, 0.5461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.3775F, -6.1998F, -2.1293F, -0.192F, 0.0F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(-1.0F, 0.015F, -1.0419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 5.0669F, -6.084F, -1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(87, 95).mirror().addBox(-1.0F, 0.0126F, -0.9722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(87, 95).addBox(1.2F, 0.0126F, -0.9722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2F, 5.0669F, -5.084F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-1.0F, -0.0061F, -1.0327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(10, 94).addBox(1.2F, -0.0061F, -1.0327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2F, 5.1669F, -3.184F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(11, 57).mirror().addBox(-1.0F, -1.9689F, -0.6572F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(11, 57).addBox(2.8F, -1.9689F, -0.6572F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0F, 0.8669F, -0.784F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(83, 91).mirror().addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(83, 91).addBox(3.3F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.5F, 2.8116F, -2.4524F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(66, 2).mirror().addBox(-1.0F, -1.6187F, -1.3433F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 2).addBox(2.8F, -1.6187F, -1.3433F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 4.1669F, -0.984F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-0.5F, -1.2F, -2.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(49, 18).addBox(3.3F, -1.2F, -2.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.5F, 3.4348F, -0.2584F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(88, 91).mirror().addBox(-0.2F, 1.8638F, -0.2128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.3775F, -6.1998F, -1.9286F, -0.0524F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-0.2F, 1.7978F, 0.4715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.3775F, -6.1998F, -2.1031F, -0.0524F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(40, 94).mirror().addBox(-0.2F, 2.2918F, 2.0815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.3775F, -6.1998F, -2.5918F, -0.0524F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(54, 91).mirror().addBox(-0.2F, 1.9482F, 0.7486F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 3.3775F, -6.1998F, -2.2777F, -0.0524F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(22, 94).mirror().addBox(-1.0F, -2.0266F, -0.8994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.5669F, -1.184F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(94, 16).mirror().addBox(-1.0F, -0.1942F, 0.0072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(94, 16).addBox(2.8F, -0.1942F, 0.0072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.0F, 1.3669F, -2.084F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(97, 35).addBox(0.1037F, -2.0335F, 0.0112F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7426F, 1.7949F, -5.4669F, -1.761F, -0.0485F, 0.0349F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(97, 24).addBox(0.0577F, -0.247F, 3.1035F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7426F, -1.3051F, -5.4669F, -1.6429F, 0.2085F, -0.0152F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(95, 57).addBox(-0.333F, 1.0597F, -1.0851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2F, 3.3775F, -6.1998F, -1.5184F, 0.192F, 0.0F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(51, 82).addBox(-0.333F, 0.1654F, -0.9729F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2F, 3.3775F, -6.1998F, -1.6232F, 0.192F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(94, 79).addBox(-0.333F, 0.0058F, 0.5461F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 3.3775F, -6.1998F, -2.1293F, 0.192F, 0.0F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(15, 96).addBox(0.0F, 0.015F, -1.0419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.0669F, -6.084F, -1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(88, 91).addBox(-0.8F, 1.8638F, -0.2128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 3.3775F, -6.1998F, -1.9286F, 0.0524F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(94, 12).addBox(-0.8F, 1.7978F, 0.4715F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.2F, 3.3775F, -6.1998F, -2.1031F, 0.0524F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(40, 94).addBox(-0.8F, 2.2918F, 2.0815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.2F, 3.3775F, -6.1998F, -2.5918F, 0.0524F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(54, 91).addBox(-0.8F, 1.9482F, 0.7486F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2F, 3.3775F, -6.1998F, -2.2777F, 0.0524F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(22, 94).addBox(0.0F, -2.0266F, -0.8994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8F, 1.5669F, -1.184F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(67, 27).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5464F, 1.6845F, -0.5958F, -0.1815F, 0.1218F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(27, 64).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.4969F, 0.3097F, -0.1638F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(53, 25).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0037F, 2.8952F, -0.2317F, 0.3405F, -0.0786F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(30, 39).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1631F, 3.8807F, -0.2225F, 0.5992F, -0.1269F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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