package fossils.fossils.client.blockentity.model.carnotaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CarnotaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone4;
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
	private final ModelPart bone5;
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

	public CarnotaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone4 = this.hips.getChild("bone4");
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
		this.bone5 = this.chest.getChild("bone5");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -34.0F, 2.4F, 1.0F, 34.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(1.0F, -5.4F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.2F, -26.5F, -24.6F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -7.5F, -0.5F, 1.0F, 34.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.2F, -26.5F, -24.6F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(7.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -25.0F, 2.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.8369F, -0.4331F, 0.0523F, 0.0023F, -0.0436F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9322F, 0.9974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.02F, 4.2208F, 3.2566F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.02F, 6.218F, 3.1519F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.9292F, 3.0443F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.9751F, -1.0181F, 1.8413F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.6819F, -1.6544F, -2.0944F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 1.7191F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, -0.3889F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.9292F, 3.0443F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.9751F, -1.0181F, 0.726F, 0.1615F, -0.1167F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.6819F, -1.6544F, -0.728F, -0.0125F, 0.2459F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, -0.6507F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8302F, 9.0336F, -0.359F, -0.0817F, 0.0306F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 35).addBox(-0.5F, -0.8F, 8.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 27).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6157F, -0.0618F, 0.1702F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.7998F, 8.6946F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 64).addBox(0.0F, -0.9F, 15.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 58).addBox(0.0F, -0.9F, 9.025F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1577F, -0.0862F, -0.0137F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.925F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 55).addBox(-0.5F, -0.225F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.433F, 0.646F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0613F, -0.0871F, -0.0053F));

		PartDefinition cube_r8 = tail8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 47).addBox(-0.825F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.227F, 8.7337F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r9 = tail8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 39).addBox(-0.5F, -1.2F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.066F, -0.1306F, -0.0086F));

		PartDefinition cube_r10 = tail3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.85F, 0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0352F, -0.1308F, 0.0046F));

		PartDefinition cube_r11 = tail9.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(71, 8).addBox(-0.5F, 0.85F, 9.15F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 62).addBox(-0.5F, 0.775F, 5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(72, 57).addBox(-0.5F, 0.775F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(70, 68).addBox(-0.5F, 0.2302F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1063F, 0.1736F, -0.0184F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(21, 50).addBox(-0.5F, 0.725F, -0.0513F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5057F, 5.6774F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, 0.725F, -0.1513F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1664F, 0.0861F, -0.0144F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(70, 76).addBox(-0.475F, 0.725F, -0.4013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 5.9976F, -0.0983F, 0.2171F, -0.0212F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -7.633F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, -0.0525F, 0.0894F, 0.039F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 47).addBox(-1.0F, 1.15F, 1.75F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(29, 11).addBox(-0.5F, -0.025F, -9.05F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3765F, -7.7702F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8461F, -9.0012F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(114, 42).addBox(-0.5F, -1.1891F, 1.0055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(113, 41).addBox(-0.5F, -1.1891F, -0.6945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(55, 68).addBox(-0.45F, 0.8881F, -6.2429F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -2.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6226F, 5.6508F, -4.3492F, -0.428F, 0.0981F, -0.1959F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6226F, 5.6508F, -4.3492F, -0.428F, -0.0981F, 0.1959F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2843F, 6.9455F, -5.6331F, 1.3835F, 0.2368F, 0.1128F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0087F, 4.4016F, -0.9799F, -0.5654F, -0.0785F, -0.1308F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1086F, 1.6668F, 0.207F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1877F, 6.9346F, -5.6096F, 1.3835F, -0.2368F, -0.1128F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0087F, 4.4017F, -0.9799F, -0.5654F, 0.0785F, 0.1308F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1086F, 1.6668F, 0.207F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8698F, -7.7672F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(98, 95).addBox(-0.55F, -1.0F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4868F, -0.8814F, 0.3153F, 0.083F, 0.027F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3077F, 0.1538F, 0.0937F));

		PartDefinition cube_r17 = neck2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 7).addBox(-0.6F, 2.35F, 7.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(97, 5).addBox(-0.6F, 2.35F, 4.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.2036F, 0.0089F, 0.0423F));

		PartDefinition cube_r18 = neck5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(99, 35).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 0.9163F, -1.7718F, -0.1222F, 0.0346F, -0.0043F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, 0.0057F, 0.1786F, 0.0209F));

		PartDefinition cube_r19 = neck4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(86, 0).addBox(-0.575F, 2.3F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.3136F, 0.0636F, 0.0714F));

		PartDefinition cube_r20 = neck3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(86, 7).addBox(0.0F, 1.9F, -4.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.5387F, -0.1539F, 0.0826F));

		PartDefinition cube_r21 = neck.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(51, 99).addBox(0.0F, 2.3315F, -3.0433F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.2094F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6807F, -3.1452F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.701F, 2.3848F, -8.4379F, 0.0F, -0.0873F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.701F, 2.3848F, -8.4379F, 0.0F, 0.0873F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.067F, 1.9741F, 0.6894F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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