package fossils.fossils.client.blockentity.model.agapornis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AgapornisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart leftFoot4;
	private final ModelPart leftToes4;
	private final ModelPart leftFoot2;
	private final ModelPart leftToes2;
	private final ModelPart leftFoot3;
	private final ModelPart leftToes3;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart rightFoot4;
	private final ModelPart rightToes4;
	private final ModelPart rightFoot2;
	private final ModelPart rightToes2;
	private final ModelPart rightFoot3;
	private final ModelPart rightToes3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck10;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart beak;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart kineticMaxillae;
	private final ModelPart kineticMaxillae2;
	private final ModelPart kineticMaxillae3;
	private final ModelPart kineticMaxillae4;
	private final ModelPart kineticMaxillae5;
	private final ModelPart kineticMaxillae6;
	private final ModelPart jaw;

	public AgapornisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.leftFoot4 = this.leftLeg3.getChild("leftFoot4");
		this.leftToes4 = this.leftFoot4.getChild("leftToes4");
		this.leftFoot2 = this.leftLeg3.getChild("leftFoot2");
		this.leftToes2 = this.leftFoot2.getChild("leftToes2");
		this.leftFoot3 = this.leftLeg3.getChild("leftFoot3");
		this.leftToes3 = this.leftFoot3.getChild("leftToes3");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.rightFoot4 = this.rightLeg3.getChild("rightFoot4");
		this.rightToes4 = this.rightFoot4.getChild("rightToes4");
		this.rightFoot2 = this.rightLeg3.getChild("rightFoot2");
		this.rightToes2 = this.rightFoot2.getChild("rightToes2");
		this.rightFoot3 = this.rightLeg3.getChild("rightFoot3");
		this.rightToes3 = this.rightFoot3.getChild("rightToes3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail5 = this.tail2.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck10 = this.neck5.getChild("neck10");
		this.neck4 = this.neck10.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.beak = this.head.getChild("beak");
		this.leftBeak = this.beak.getChild("leftBeak");
		this.rightBeak = this.beak.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.kineticMaxillae = this.head.getChild("kineticMaxillae");
		this.kineticMaxillae2 = this.kineticMaxillae.getChild("kineticMaxillae2");
		this.kineticMaxillae3 = this.kineticMaxillae.getChild("kineticMaxillae3");
		this.kineticMaxillae4 = this.head.getChild("kineticMaxillae4");
		this.kineticMaxillae5 = this.kineticMaxillae4.getChild("kineticMaxillae5");
		this.kineticMaxillae6 = this.kineticMaxillae4.getChild("kineticMaxillae6");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -27.0F, 6.5F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.6F, -32.3F, -12.8F, 1.0F, 33.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(8.6F, -5.0F, -1.8F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(3.3F, -4.0F, 17.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -23.0F, -11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -30.7571F, 5.2609F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(89, 6).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.8228F, 3.5024F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 15).addBox(-1.0F, -1.0551F, 8.9415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 8).addBox(-1.0F, -1.0551F, 0.2415F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, 1.774F, -4.5424F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.774F, -4.5424F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9045F, 3.8744F, 0.8937F, -1.4645F, -0.2768F, -0.0071F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3016F, 9.4409F, 2.948F, 2.0589F, -0.0514F, 0.1358F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 15.8415F, -3.6594F, -0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 7.3911F, -2.3025F, -0.0626F, -0.2178F, 0.0135F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition leftFoot4 = leftLeg3.addOrReplaceChild("leftFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 7.3911F, -2.3025F, -3.0679F, -0.3484F, 3.1194F));

		PartDefinition leftToes4 = leftFoot4.addOrReplaceChild("leftToes4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition leftFoot2 = leftLeg3.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.383F, 7.399F, -2.1734F, -0.0642F, 0.3136F, -0.0198F));

		PartDefinition leftToes2 = leftFoot2.addOrReplaceChild("leftToes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition leftFoot3 = leftLeg3.addOrReplaceChild("leftFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.383F, 7.399F, -2.1734F, -3.0716F, 0.0784F, -3.1368F));

		PartDefinition leftToes3 = leftFoot3.addOrReplaceChild("leftToes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9045F, 3.8744F, 0.8937F, -1.3085F, 0.2854F, 0.0975F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3016F, 9.4409F, 2.948F, 2.1898F, 0.0514F, -0.1358F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 15.8415F, -3.6594F, -0.5672F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 7.3911F, -2.3025F, -0.0626F, 0.2178F, -0.0135F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.1705F, 0.0045F, -0.0003F));

		PartDefinition rightFoot4 = rightLeg3.addOrReplaceChild("rightFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 7.3911F, -2.3025F, -2.7188F, 0.3484F, -3.1194F));

		PartDefinition rightToes4 = rightFoot4.addOrReplaceChild("rightToes4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, 0.0045F, -0.0003F));

		PartDefinition rightFoot2 = rightLeg3.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.383F, 7.399F, -2.1734F, -0.0642F, -0.3136F, 0.0198F));

		PartDefinition rightToes2 = rightFoot2.addOrReplaceChild("rightToes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.2142F, 0.0045F, -0.0003F));

		PartDefinition rightFoot3 = rightLeg3.addOrReplaceChild("rightFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.383F, 7.399F, -2.1734F, -2.7225F, -0.0784F, 3.1368F));

		PartDefinition rightToes3 = rightFoot3.addOrReplaceChild("rightToes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3397F, -3.6272F, -0.0396F, 0.0045F, -0.0003F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(103, 24).addBox(-0.5F, 0.5944F, -0.3182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(104, 25).addBox(-0.5F, 0.5944F, 1.2818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 5.5912F, 5.6257F, -0.5411F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, 0.306F, -0.0402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3595F, 1.6942F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1354F, 2.1702F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1354F, 4.8702F));

		PartDefinition tail5 = tail2.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9231F, 3.2546F, -1.4399F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6585F, -3.2168F, 0.113F, 0.0073F, 0.0091F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 0).addBox(-1.0F, 0.7494F, -0.2832F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.1F, -4.5F, -0.3578F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.1021F, -4.5333F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 62).addBox(-1.0F, 0.7244F, -5.1332F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0021F, 0.0333F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.7417F, -4.7248F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 54).addBox(-1.0F, -0.575F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.1F, -1.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7902F, -0.4959F, -5.1416F, 2.0146F, 0.4768F, 0.8498F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2504F, 9.8584F, -2.3818F, 1.4038F, -0.0562F, -2.8289F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1959F, 11.6492F, -1.9199F, 2.301F, -0.549F, 0.7797F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7902F, -0.4959F, -5.1416F, 2.0754F, -0.4996F, -0.746F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2504F, 9.8584F, -2.3818F, 1.142F, 0.0562F, 2.8289F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1959F, 11.6492F, -1.9199F, 2.8947F, 0.3156F, -0.0856F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, -0.2474F, -5.0035F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.0142F, -0.2474F, -5.0035F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.314F, -4.8881F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 74).addBox(0.0F, -1.2943F, -4.3586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6061F, -3.2693F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(103, 40).addBox(0.0F, -0.425F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 40).addBox(0.0F, -0.425F, -2.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.495F, 0.2488F, 0.165F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck10 = neck5.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.8469F, -1.9102F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck10.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(103, 58).addBox(-1.0F, -1.4981F, 5.4213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(103, 58).addBox(-1.0F, -1.4981F, 3.8213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.004F, -4.5252F, -3.9896F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck4 = neck10.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.7098F, -0.9657F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 63).addBox(-1.005F, -0.455F, -0.63F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(103, 62).addBox(-1.005F, -0.455F, -2.23F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.505F, 0.0329F, -0.0422F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6887F, -1.085F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(94, 110).addBox(-1.009F, -2.7209F, -3.0005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(94, 110).addBox(-1.009F, -4.2209F, -3.0005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.514F, 1.3393F, 2.8668F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0003F, -0.3771F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 111).addBox(-1.009F, -4.3612F, -5.9606F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.509F, -1.9223F, 5.6368F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9787F, -0.7141F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 76).addBox(-1.009F, 5.9283F, -8.3572F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.514F, -4.1824F, 6.5523F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.588F, -2.8944F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(63, 103).addBox(-1.009F, 2.0104F, -12.0048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.511F, 0.599F, 10.1226F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.625F, -4.95F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(117, 40).addBox(-1.009F, -3.6769F, -12.3081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.511F, 5.1627F, 14.305F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6632F, 3.2092F, 0.4451F, 0.0F, 0.0F));

		PartDefinition beak = head.addOrReplaceChild("beak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.498F, -6.9442F, -11.6425F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftBeak = beak.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(3.9653F, 3.8113F, 0.1643F));

		PartDefinition rightBeak = beak.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-2.9693F, 3.8113F, 0.1643F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -13.3781F, -1.7971F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -13.3781F, -1.7971F));

		PartDefinition kineticMaxillae = head.addOrReplaceChild("kineticMaxillae", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9687F, -3.4498F, -4.0832F, -0.3491F, -0.0349F, -0.0873F));

		PartDefinition kineticMaxillae2 = kineticMaxillae.addOrReplaceChild("kineticMaxillae2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4928F, 3.2024F, -0.2909F, 0.3491F, 0.0F, 0.0F));

		PartDefinition kineticMaxillae3 = kineticMaxillae.addOrReplaceChild("kineticMaxillae3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.357F, 2.9465F, -1.8431F, 0.3491F, 0.0F, 0.0F));

		PartDefinition kineticMaxillae4 = head.addOrReplaceChild("kineticMaxillae4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9687F, -3.4498F, -4.0832F, -0.3491F, 0.0349F, 0.0873F));

		PartDefinition kineticMaxillae5 = kineticMaxillae4.addOrReplaceChild("kineticMaxillae5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4928F, 3.2024F, -0.2909F, 0.3491F, 0.0F, 0.0F));

		PartDefinition kineticMaxillae6 = kineticMaxillae4.addOrReplaceChild("kineticMaxillae6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.357F, 2.9465F, -1.8431F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.6081F, -5.142F, 0.1229F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 125, 125);
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