package fossils.fossils.client.blockentity.model.euhelopus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuhelopusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart ForeHead;
	private final ModelPart ForeHead2;
	private final ModelPart Snout;
	private final ModelPart Snout2;
	private final ModelPart Snout3;
	private final ModelPart Nose;
	private final ModelPart Nose2;
	private final ModelPart jaw;
	private final ModelPart Jaw2;
	private final ModelPart Jaw3;

	public EuhelopusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightArm3 = this.leftArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.ForeHead = this.head.getChild("ForeHead");
		this.ForeHead2 = this.ForeHead.getChild("ForeHead2");
		this.Snout = this.head.getChild("Snout");
		this.Snout2 = this.Snout.getChild("Snout2");
		this.Snout3 = this.Snout2.getChild("Snout3");
		this.Nose = this.Snout2.getChild("Nose");
		this.Nose2 = this.Nose.getChild("Nose2");
		this.jaw = this.head.getChild("jaw");
		this.Jaw2 = this.jaw.getChild("Jaw2");
		this.Jaw3 = this.Jaw2.getChild("Jaw3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -40.0F, 10.2F, 1.0F, 40.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.9F, -21.0F, -0.5F, 1.0F, 58.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -37.0F, -22.3F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-5.5F, -12.0F, -0.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -37.0F, -22.3F, 0.0349F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-6.5F, -8.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -42.0F, 10.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.4408F, 13.9016F, -0.2182F, 0.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -0.5F, -7.5F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8755F, -0.5185F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -0.1879F, 0.4316F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.2608F, -2.167F, 0.1134F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 13.8954F, 0.674F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -0.1879F, 0.4316F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.2608F, -2.167F, 0.5934F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 13.8954F, 0.674F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, 6.8F, -0.3303F, 0.1514F, -0.0975F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 32).addBox(-1.0F, -0.3F, -6.5F, 2.0F, 3.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7298F, 6.1422F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9803F, 12.3651F, 0.0031F, 0.1312F, -0.0429F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(37, 86).addBox(-1.0F, 1.0F, 0.0F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.63F, -0.1866F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.93F, 12.6134F, 0.1967F, 0.1369F, -0.0169F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 85).addBox(-0.5F, 0.9F, -0.1F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9728F, 0.0373F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1228F, 13.6373F, 0.0358F, -0.218F, -0.0077F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 49).addBox(-0.5F, 0.8F, -0.2F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3962F, 0.2872F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6462F, 14.0872F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r9 = tail5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(69, 101).addBox(-0.5F, 0.6F, -0.4F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.65F, 12.9F, 0.2494F, -0.4244F, -0.1045F));

		PartDefinition cube_r10 = tail6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(107, 85).addBox(-0.5F, 0.6F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.206F, 0.0522F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.594F, 11.9522F, -0.2916F, -0.3777F, 0.1102F));

		PartDefinition cube_r11 = tail7.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3381F, -0.0261F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.6F, -8.0F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 31).addBox(-1.0F, 0.8455F, -0.0348F, 2.0F, 4.0F, 17.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.1873F, -15.3874F, -0.2182F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.284F, -15.063F, 0.394F, 0.0806F, 0.0335F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 67).addBox(-1.0F, 0.8639F, -0.3668F, 2.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.3784F, -13.5053F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.75F, 18.0716F, -6.6053F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, -1.4402F, -7.4691F, 1.8588F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -4.8751F, -17.584F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -3.5961F, -9.1411F, 0.6196F, 0.0F, 0.0F));

		PartDefinition rightArm3 = leftArm.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.75F, -1.4402F, -7.4691F, 1.4224F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -4.8751F, -17.584F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.5961F, -9.1411F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2956F, -13.6225F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1, 73).addBox(-1.0F, -1.7617F, -14.9954F, 2.0F, 3.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6499F, 0.3554F, 0.0349F, -0.0349F, -0.0012F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4117F, -13.9703F, -0.2931F, -0.1627F, -0.2235F));

		PartDefinition cube_r15 = neck2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(1, 0).addBox(-1.0F, 0.7F, 6.0F, 2.0F, 3.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6563F, -32.8293F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(75, 67).addBox(-1.0F, -0.7696F, -13.9233F, 2.0F, 3.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0817F, -26.8308F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2696F, -13.8233F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(83, 14).addBox(-1.0F, 1.0F, 0.8F, 2.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3612F, -14.6799F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6612F, -13.7799F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(42, 31).addBox(-0.5F, 1.0F, -1.3F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8971F, -16.2753F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9493F, -17.6787F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(47, 133).addBox(-0.5F, -0.4851F, -7.164F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4119F, 0.2562F, -0.1398F, -0.0518F, 0.0073F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.33F, -6.5485F, 0.2127F, -0.0932F, -0.1971F));

		PartDefinition cube_r19 = neck7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(122, 53).addBox(-1.7262F, 0.5933F, -10.1634F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2262F, 0.0078F, 2.1942F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0784F, -7.5944F, -0.235F, -0.0862F, -0.0137F));

		PartDefinition cube_r20 = neck8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(29, 157).addBox(-0.5F, 0.1F, -4.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2062F, -0.621F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.6502F, -4.8819F, 0.5236F, 0.0F, 0.0F));

		PartDefinition ForeHead = head.addOrReplaceChild("ForeHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5408F, -1.9619F, -0.3054F, 0.0F, 0.0F));

		PartDefinition ForeHead2 = ForeHead.addOrReplaceChild("ForeHead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Snout = head.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5408F, -1.9619F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Snout2 = Snout.addOrReplaceChild("Snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Snout3 = Snout2.addOrReplaceChild("Snout3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Nose = Snout2.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Nose2 = Nose.addOrReplaceChild("Nose2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.9861F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3917F, -0.4476F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Jaw2 = jaw.addOrReplaceChild("Jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.195F, -2.4516F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Jaw3 = Jaw2.addOrReplaceChild("Jaw3", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.95F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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