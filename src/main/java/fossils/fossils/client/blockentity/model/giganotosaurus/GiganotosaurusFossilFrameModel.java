package fossils.fossils.client.blockentity.model.giganotosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GiganotosaurusFossilFrameModel extends SkullModelBase {
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

	public GiganotosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -34.0F, 2.9F, 1.0F, 34.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-4.5F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.0F, -30.8F, -26.7F, 0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -4.2F, -0.5F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(5.0F, -30.8F, -26.7F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(4.1F, -4.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -28.5F, 3.4F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.4345F, -0.3005F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9072F, 1.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1056F, 5.5703F, 4.3211F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1056F, 3.5707F, 4.2862F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 1.2098F, 4.0094F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 15.3105F, -2.4224F, 0.7505F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.9599F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.999F, 0.1898F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 1.2098F, 4.0094F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 15.3105F, -2.4224F, 0.6632F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.4036F, -1.2747F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.999F, 0.1898F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.7254F, -3.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, 8.8231F, -0.3052F, -0.0131F, -0.0416F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 35).addBox(0.0F, -0.8F, 8.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 27).addBox(0.0F, -0.8F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.9157F, -0.0618F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.4998F, 8.6946F, 0.0809F, 0.1776F, -0.0288F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 65).addBox(0.0F, -0.85F, 15.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 59).addBox(0.0F, -0.85F, 9.025F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, 2.4308F, -8.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4624F, 6.8232F, 0.1418F, 0.1728F, 0.0245F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(6, 56).addBox(-0.5F, -0.775F, 7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 49).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(6, 56).addBox(-0.5F, -1.475F, 7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 49).addBox(-0.5F, -1.475F, -0.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0346F, 0.5565F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition cube_r8 = tail8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(29, 12).addBox(-0.5F, -1.15F, 7.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0268F, -0.2181F, -0.0058F));

		PartDefinition cube_r9 = tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 46).addBox(-0.5F, 0.8F, 8.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(0, 38).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.0181F, -0.2618F, 0.0047F));

		PartDefinition cube_r10 = tail9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(67, 30).addBox(-0.5F, 0.9F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, 0.0743F, -0.3482F, -0.0254F));

		PartDefinition cube_r11 = tail4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 74).addBox(-0.85F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 1.0685F, 5.6329F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r12 = tail4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 69).addBox(-0.5F, 0.8F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(74, 56).addBox(-0.5F, 0.2302F, -0.2226F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.0193F, -0.4363F, 0.0081F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5056F, 5.6774F, -0.0271F, -0.2617F, 0.007F));

		PartDefinition cube_r13 = tail6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(19, 49).addBox(-0.5F, -0.4F, -0.15F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.125F, -0.1013F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1377F, 0.008F, -0.2652F));

		PartDefinition cube_r14 = tail7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 27).addBox(-0.55F, -0.5F, 2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(69, 22).addBox(-0.55F, -0.5F, -3.15F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0506F, 1.225F, 2.7991F, 0.0023F, 0.0173F, 0.1309F));

		PartDefinition tail10 = tail7.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(70, 67).addBox(-0.5F, 0.725F, -0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0223F, 5.9976F, -0.1577F, 0.3451F, -0.0537F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.333F, 7.5531F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1802F, -3.1023F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(49, 53).addBox(-1.0F, 1.125F, 9.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 46).addBox(-1.0F, 1.125F, 1.325F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.669F, -9.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -0.1F, -9.425F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3765F, -7.7702F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8461F, -9.0012F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(119, 110).addBox(-0.5F, -1.2891F, -0.2945F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9391F, -1.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, 0.7881F, -5.8929F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1609F, -2.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3535F, 5.0271F, -5.7978F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3535F, 5.0271F, -5.7978F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7927F, 9.4815F, -8.1801F, 0.3158F, 0.0432F, -0.2341F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.601F, 5.0694F, -0.7678F, -1.15F, -0.6327F, -0.0802F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, 0.1745F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7927F, 9.4815F, -8.1801F, 0.2971F, -0.2618F, 0.1543F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.601F, 5.0694F, -0.7678F, -1.6234F, 0.6351F, 0.185F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3159F, 3.9465F, 0.2145F, -0.0873F, 0.0F, -0.1745F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8698F, -7.7672F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(100, 107).addBox(-0.5F, 0.2F, 5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 105).addBox(-0.5F, 0.2F, 2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r19 = neck2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(43, 103).addBox(-0.5F, 2.325F, 5.025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3606F, -2.3471F, -0.3153F, -0.083F, 0.027F));

		PartDefinition cube_r20 = neck5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, 2.275F, 2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 108).addBox(-0.5F, 2.275F, 5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.2633F, -0.1289F, 0.0229F));

		PartDefinition cube_r21 = neck4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 88).addBox(-0.15F, -0.1078F, -0.1526F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, -0.4061F, -3.7737F, -0.1232F, -0.0665F, -0.1853F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.6922F, -0.3189F, -0.2333F));

		PartDefinition cube_r22 = neck3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(89, 56).addBox(0.0F, 1.9F, -4.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6682F, -3.2726F, -0.2634F, -0.1072F, -0.0612F));

		PartDefinition cube_r23 = neck.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(106, 0).addBox(0.0F, 2.3315F, -2.9933F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0315F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r24 = neck6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(120, 59).addBox(0.0F, 2.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0889F, -1.6354F, -0.384F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.4011F, 7.8848F, -15.7879F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.4011F, 7.8848F, -15.7879F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.2629F, 2.3099F, 0.8203F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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