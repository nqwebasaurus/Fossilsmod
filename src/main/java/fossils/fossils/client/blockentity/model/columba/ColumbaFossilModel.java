package fossils.fossils.client.blockentity.model.columba;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ColumbaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public ColumbaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe3 = this.leftLeg3.getChild("toe3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe2 = this.rightLeg3.getChild("toe2");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail2.getChild("tail4");
		this.tail5 = this.tail2.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -17.2506F, 5.4398F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-0.4205F, -0.7534F, 0.0925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7206F, 7.4502F, 2.0236F, -1.0962F, -0.0791F, -0.1378F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-0.5106F, -0.9626F, -1.4384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9676F, 5.5006F, 3.0091F, -0.8197F, -0.2284F, 0.0435F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7496F, 7.2487F, 3.6455F, -1.0988F, -0.0467F, -0.147F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, -1.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9676F, 5.7006F, 3.4091F, -1.4043F, -0.0467F, -0.147F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 95).mirror().addBox(-0.2431F, -0.0279F, -2.0484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7206F, 10.1502F, 4.7237F, -1.3587F, -0.0831F, -0.1301F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 33).mirror().addBox(-0.0105F, -0.0757F, -1.8327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7206F, 11.9502F, 4.7237F, -1.5332F, -0.0831F, -0.1301F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 62).mirror().addBox(-0.307F, 0.0009F, 0.0479F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7206F, 8.9502F, 3.6237F, -1.1841F, -0.0831F, -0.1301F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 81).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6036F, 4.0922F, 1.0305F, -0.9689F, -0.1611F, -0.1387F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.7593F, -1.3934F, -0.3054F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7242F, 13.0015F, 3.8168F, -0.7024F, -0.0467F, -0.4679F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.5F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0093F, -0.5918F, -2.6244F, -1.0055F, 0.9313F, -1.5791F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 44).mirror().addBox(5.912F, -4.0196F, 5.7768F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -1.062F, -0.6309F, 0.4822F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(104, 70).mirror().addBox(-0.6F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4707F, -2.944F, -0.6047F, -0.2909F, 0.1957F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(17, 18).mirror().addBox(-8.5756F, -2.84F, -0.6493F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.9946F, 0.8226F, -1.1643F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(39, 50).mirror().addBox(-4.7825F, -3.028F, -1.9449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -1.4521F, 0.9196F, -1.7655F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(94, 48).mirror().addBox(0.1089F, -2.8637F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.4986F, 0.1313F, -0.9354F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(94, 64).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1212F, -2.0951F, -3.0382F, -0.5905F, -0.1223F, -0.8612F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7824F, -2.3805F, -2.531F, -0.887F, -0.592F, -0.0565F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-0.2953F, -3.7021F, -0.8133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.8845F, 0.1396F, -0.1682F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 56).mirror().addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7829F, 2.4419F, 2.8458F, -1.3646F, -0.3936F, 0.919F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(11, 68).mirror().addBox(-3.736F, -4.029F, 9.2564F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 20).mirror().addBox(-3.736F, -4.029F, 7.2564F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.7895F, -0.072F, -0.2392F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(105, 7).mirror().addBox(-8.4759F, -5.3623F, 11.5767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.9682F, 0.1715F, -0.486F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-7.8874F, -4.2353F, 12.5763F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.451F, -6.3424F, -1.0515F, -0.0467F, -0.4679F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(67, 81).mirror().addBox(-3.1446F, -4.2353F, 11.5216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.451F, -6.3424F, -1.0923F, -0.2151F, -0.1591F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-3.894F, -7.7684F, 10.1298F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -1.1224F, -0.0306F, -0.2003F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-3.894F, -1.3476F, 11.3589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.6424F, -0.0306F, -0.2003F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 94).mirror().addBox(-1.4354F, -7.6919F, 1.1995F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -1.7129F, -0.158F, -0.0101F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.6913F, -3.5541F, 1.7641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -1.0508F, -0.3113F, 0.0243F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(88, 30).mirror().addBox(-2.1868F, -3.4598F, 5.6566F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.7943F, -0.1611F, -0.1387F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(57, 89).mirror().addBox(-0.6913F, -1.2175F, 5.1219F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.4836F, -0.3113F, 0.0243F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(17, 9).mirror().addBox(-0.8018F, -1.0694F, -6.8205F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1084F, 7.9905F, 1.1432F, -1.1064F, -0.2941F, 0.1064F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7206F, 6.7502F, 2.5236F, -1.1101F, -0.1421F, -0.0125F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 47).mirror().addBox(-0.0672F, -1.9013F, 2.3415F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.249F, -4.5424F, -0.5288F, -0.3396F, -0.5181F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(104, 70).addBox(-0.4F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.4707F, -2.944F, -0.6047F, 0.2909F, -0.1957F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(17, 18).addBox(3.5756F, -2.84F, -0.6493F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.9946F, -0.8226F, 1.1643F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(39, 50).addBox(0.7825F, -3.028F, -1.9449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -1.4521F, -0.9196F, 1.7655F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(85, 81).addBox(-1.5F, -0.5F, -0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0093F, -0.5918F, -2.6244F, -1.0055F, -0.9313F, 1.5791F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(94, 48).addBox(-1.1088F, -2.8637F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.4986F, -0.1313F, 0.9354F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(94, 64).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1212F, -2.0951F, -3.0382F, -0.5905F, 0.1223F, 0.8612F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(94, 60).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7824F, -2.3805F, -2.531F, -0.887F, 0.592F, 0.0565F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 14).addBox(-0.7047F, -3.7021F, -0.8133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.8845F, -0.1396F, 0.1682F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(13, 56).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7829F, 2.4419F, 2.8458F, -1.3646F, 0.3936F, -0.919F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(52, 44).addBox(-7.912F, -4.0196F, 5.7768F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -1.062F, 0.6309F, -0.4822F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(11, 68).addBox(1.736F, -4.029F, 9.2564F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(58, 20).addBox(-0.264F, -4.029F, 7.2564F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.7895F, 0.072F, 0.2392F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(105, 7).addBox(7.4759F, -5.3623F, 11.5767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.9682F, -0.1715F, 0.486F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 82).addBox(-0.2407F, -1.3934F, -0.3054F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7242F, 13.0015F, 3.8168F, -0.7024F, 0.0467F, 0.4679F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(76, 81).addBox(6.8874F, -4.2353F, 12.5763F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.451F, -6.3424F, -1.0515F, 0.0467F, 0.4679F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(67, 81).addBox(2.1446F, -4.2353F, 11.5216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.451F, -6.3424F, -1.0923F, 0.2151F, 0.1591F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 71).addBox(2.894F, -7.7684F, 10.1298F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -1.1224F, 0.0306F, 0.2003F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 66).addBox(2.894F, -1.3476F, 11.3589F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6424F, 0.0306F, 0.2003F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 94).addBox(0.4354F, -7.6919F, 1.1995F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -1.7129F, 0.158F, 0.0101F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 77).addBox(-0.3086F, -3.5541F, 1.7641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -1.0508F, 0.3113F, -0.0243F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(9, 81).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6036F, 4.0922F, 1.0305F, -0.9689F, 0.1611F, 0.1387F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(88, 30).addBox(1.1868F, -3.4598F, 5.6566F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.7943F, 0.1611F, 0.1387F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 89).addBox(-0.3086F, -1.2175F, 5.1219F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.4836F, 0.3113F, -0.0243F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(17, 9).addBox(-0.1982F, -1.0694F, -6.8205F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1084F, 7.9905F, 1.1432F, -1.1064F, 0.2941F, -0.1064F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(55, 68).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7496F, 7.2487F, 3.6455F, -1.0988F, 0.0467F, 0.147F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(96, 19).addBox(-0.4894F, -0.9626F, -1.4384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9676F, 5.5006F, 3.0091F, -0.8197F, 0.2284F, -0.0435F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -1.6F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9676F, 5.7006F, 3.4091F, -1.4043F, 0.0467F, 0.147F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(71, 95).addBox(-0.7569F, -0.0279F, -2.0484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7206F, 10.1502F, 4.7237F, -1.3587F, 0.0831F, 0.1301F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(95, 33).addBox(-0.9895F, -0.0757F, -1.8327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7206F, 11.9502F, 4.7237F, -1.5332F, 0.0831F, 0.1301F));

		PartDefinition cube_r61 = hips.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(13, 62).addBox(-0.693F, 0.0009F, 0.0479F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7206F, 8.9502F, 3.6237F, -1.1841F, 0.0831F, 0.1301F));

		PartDefinition cube_r62 = hips.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(76, 61).addBox(-0.5795F, -0.7534F, 0.0925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7206F, 7.4502F, 2.0236F, -1.0962F, 0.0791F, 0.1378F));

		PartDefinition cube_r63 = hips.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(78, 20).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7206F, 6.7502F, 2.5236F, -1.1101F, 0.1421F, 0.0125F));

		PartDefinition cube_r64 = hips.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 7).addBox(-0.5F, -0.008F, -5.0282F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.0672F, 2.2297F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r65 = hips.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 30).addBox(-0.5F, -0.1F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.0672F, 4.4297F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r66 = hips.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(26, 47).addBox(-0.9328F, -1.9013F, 2.3415F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.5288F, 0.3396F, 0.5181F));

		PartDefinition cube_r67 = hips.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(9, 75).addBox(-1.0F, -1.9801F, -0.6585F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 6.1525F, -0.0695F, -1.8172F, -0.127F, 0.0318F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(92, 70).addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 43).addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.4946F, -0.3554F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 92).addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.4946F, -0.3554F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(34, 87).addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 8.4946F, -0.3554F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(27, 75).addBox(-4.5F, 0.0F, -1.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 2.2477F, 0.4023F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(71, 20).addBox(-4.5F, -5.489F, -0.0711F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 7.6F, -1.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(67, 86).addBox(-4.5F, -3.5F, -1.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5F, 2.3F, 0.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftLeg1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(69, 56).addBox(-1.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 1.7426F, -0.8044F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 87).addBox(-4.5F, 0.275F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.5F, -0.0396F, -1.5636F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 94).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.5F, -1.6244F, -1.8373F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(78, 25).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.5114F, -1.3755F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(82, 48).addBox(-4.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -1.6244F, -1.8373F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(18, 81).addBox(-1.5F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -1.3F, -0.1F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(74, 86).addBox(-1.7F, 9.0746F, -1.6615F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(27, 83).addBox(-1.7F, 9.0764F, -2.2209F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.3F, 9.1596F, -0.1524F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(18, 102).addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 49).addBox(-2.5F, -3.507F, -2.3331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(49, 58).addBox(-2.5F, -7.9356F, -0.1453F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8F, 9.1121F, -2.0756F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 51).addBox(-1.5F, -4.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(37, 55).addBox(-2.5F, -7.9751F, -0.9665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 9.0497F, -0.6949F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(97, 11).addBox(-5.7F, -3.0498F, -0.3321F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 77).addBox(-5.8F, -3.9498F, -1.3321F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(102, 32).addBox(-0.6532F, -0.294F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, 0.9636F, 0.4564F, -0.3576F, 0.0073F, -0.0005F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 69).addBox(-0.6532F, 1.4677F, -1.2621F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, 0.9636F, 0.4564F, -0.0958F, 0.0073F, -0.0005F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(30, 34).addBox(-1.5F, -0.4447F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 14.4163F, -2.2676F, -2.3126F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5267F, 7.1523F, 0.0405F, 1.3526F, -0.3927F, 0.0F));

		PartDefinition cube_r87 = toe3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(8, 104).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r88 = toe3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(92, 103).addBox(-0.5F, -2.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2679F, 2.0751F, 4.77F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r89 = toe3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 102).addBox(-1.5F, 0.2F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 1.3526F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(21, 0).addBox(-2.5F, -1.0F, -3.85F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1659F, 0.3788F, 1.309F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.5F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.4893F, -3.806F, 0.0038F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 6.1525F, -0.0695F, -1.8172F, 0.127F, -0.0318F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 43).mirror().addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.4946F, -0.3554F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(64, 92).mirror().addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.4946F, -0.3554F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(34, 87).mirror().addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 8.4946F, -0.3554F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(27, 75).mirror().addBox(2.5F, 0.0F, -1.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.2477F, 0.4023F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(2.5F, -5.489F, -0.0711F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 7.6F, -1.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 86).mirror().addBox(2.5F, -3.5F, -1.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.3F, 0.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-0.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.7426F, -0.8044F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(2.5F, 0.275F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -0.0396F, -1.5636F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(23, 94).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -1.6244F, -1.8373F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -2.5114F, -1.3755F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(82, 48).mirror().addBox(2.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -1.6244F, -1.8373F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(18, 81).mirror().addBox(-0.5F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.3F, -0.1F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(74, 86).mirror().addBox(-0.3F, 9.0746F, -1.6615F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(27, 83).mirror().addBox(-0.3F, 9.0764F, -2.2209F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 9.1596F, -0.1524F, 2.8536F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(18, 102).mirror().addBox(-0.5F, -3.507F, -2.3331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 49).mirror().addBox(0.5F, -3.507F, -2.3331F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.2472F, -1.4117F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(0.5F, -7.9356F, -0.1453F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 9.1121F, -2.0756F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-1.5F, -4.0F, -2.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 16.9905F, -1.533F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(37, 55).mirror().addBox(0.5F, -7.9751F, -0.9665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 9.0497F, -0.6949F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(97, 11).mirror().addBox(3.7F, -3.0498F, -0.3321F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 77).mirror().addBox(2.8F, -3.9498F, -1.3321F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.0472F, 0.0883F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(102, 32).mirror().addBox(-0.3468F, -0.294F, -0.8104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9636F, 0.4564F, -0.3576F, -0.0073F, 0.0005F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(64, 69).mirror().addBox(-0.3468F, 1.4677F, -1.2621F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.9636F, 0.4564F, -0.0958F, -0.0073F, 0.0005F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(30, 34).mirror().addBox(-0.5F, -0.4447F, -0.8239F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 14.4163F, -2.2676F, -2.3126F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5267F, 7.1523F, 0.0405F, 1.3526F, 0.3927F, 0.0F));

		PartDefinition cube_r109 = toe2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(8, 104).mirror().addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r110 = toe2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(92, 103).mirror().addBox(-0.5F, -2.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2679F, 2.0751F, 4.77F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r111 = toe2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(28, 102).mirror().addBox(0.5F, 0.2F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 1.3526F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-1.5F, -1.0F, -3.85F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.1659F, 0.3788F, 1.309F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.5F, -0.5F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4893F, -3.806F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(78, 76).addBox(-0.5F, -0.1056F, 0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(23, 86).addBox(0.0F, -0.7056F, 0.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 86).addBox(0.0F, -0.5056F, 2.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6914F, 5.7701F, -0.6109F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(97, 15).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(88, 104).addBox(0.0F, -0.594F, 1.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3085F, 2.8669F, 0.288F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(52, 100).addBox(-0.5F, -2.4415F, -0.1155F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1354F, 2.1702F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(100, 93).addBox(-0.5F, -2.4415F, -0.1155F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offset(0.0F, -0.1354F, 2.8702F));

		PartDefinition tail5 = tail2.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(104, 40).addBox(-0.2F, -0.9F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(104, 40).mirror().addBox(-0.8F, -0.9F, -2.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9231F, 3.2546F, -1.4399F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(48, 101).addBox(0.0F, -0.7822F, 0.4707F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(18, 75).addBox(0.0F, -0.1301F, -0.018F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(93, 3).mirror().addBox(-1.5F, 0.0296F, -0.8F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8034F, 3.821F, -0.6909F, 0.0301F, -1.0982F, -1.3563F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(92, 75).mirror().addBox(-1.4F, -0.0161F, 0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8891F, 4.2467F, -2.0442F, 0.0163F, -0.5748F, -1.3384F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(45, 30).mirror().addBox(-1.0F, 0.0245F, -1.3F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2042F, 3.6461F, -3.0114F, 0.1486F, -1.3785F, -1.4241F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(36, 22).mirror().addBox(-2.4F, -0.0472F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0948F, 3.1378F, -1.535F, 0.0394F, -0.7693F, -1.3056F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 7).mirror().addBox(-0.4F, -0.0229F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3555F, 4.2335F, -3.8805F, 0.0712F, -1.1615F, -1.3435F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(103, 77).mirror().addBox(0.0504F, 0.3566F, -0.9607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3073F, 5.9973F, 0.4306F, 0.0152F, -0.3295F, -1.4308F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-3.9496F, 0.3566F, -0.9607F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3073F, 5.9973F, 0.4306F, 0.0144F, -0.0677F, -1.4269F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(22, 73).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, 0.0144F, 0.0632F, -1.425F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, 0.0441F, 0.0475F, -0.9008F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -0.4408F, 0.0992F, -0.0009F, -0.3582F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(94, 68).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, 0.1025F, -0.015F, -0.2106F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(34, 75).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, 0.0542F, 0.0372F, -0.7527F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(30, 32).mirror().addBox(-11.3936F, -1.7918F, -0.5273F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.315F, -4.2408F, 0.0284F, 0.0593F, -1.2765F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(53, 20).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, 0.0751F, -0.0134F, -0.262F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, 0.0299F, 0.0244F, -0.8053F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(21, 7).mirror().addBox(-11.3936F, -1.7918F, -0.5273F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.015F, -2.2408F, 0.0137F, 0.036F, -1.329F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(106, 85).mirror().addBox(0.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 27).mirror().addBox(0.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 82).mirror().addBox(0.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.102F, -2.1332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(103, 77).addBox(-2.0504F, 0.3566F, -0.9607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3073F, 5.9973F, 0.4306F, 0.0152F, 0.3295F, 1.4308F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 12).addBox(-0.0504F, 0.3566F, -0.9607F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3073F, 5.9973F, 0.4306F, 0.0144F, 0.0677F, 1.4269F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(22, 73).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, 0.0144F, -0.0632F, 1.425F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(98, 9).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, 0.0441F, -0.0475F, 0.9008F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(96, 58).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -0.4408F, 0.0992F, 0.0009F, 0.3582F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(94, 68).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, 0.1025F, 0.015F, 0.2106F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(34, 75).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, 0.0542F, -0.0372F, 0.7527F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(45, 30).addBox(-1.0F, 0.0245F, -1.3F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2042F, 3.6461F, -3.0114F, 0.1486F, 1.3785F, 1.4241F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(36, 22).addBox(-0.6F, -0.0472F, -1.2F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0948F, 3.1378F, -1.535F, 0.0394F, 0.7693F, 1.3056F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(42, 7).addBox(-1.6F, -0.0229F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3555F, 4.2335F, -3.8805F, 0.0712F, 1.1615F, 1.3435F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(30, 32).addBox(2.3936F, -1.7918F, -0.5273F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.315F, -4.2408F, 0.0284F, -0.0593F, 1.2765F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(53, 20).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, 0.0751F, 0.0134F, 0.262F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(58, 28).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, 0.0299F, -0.0244F, 0.8053F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(93, 3).addBox(-1.5F, 0.0296F, -0.8F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8034F, 3.821F, -0.6909F, 0.0301F, 1.0982F, 1.3563F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(92, 75).addBox(-1.6F, -0.0161F, 0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8891F, 4.2467F, -2.0442F, 0.0163F, 0.5748F, 1.3384F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(21, 7).addBox(2.3936F, -1.7918F, -0.5273F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.015F, -2.2408F, 0.0137F, -0.036F, 1.329F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(106, 85).addBox(-1.0F, -0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 27).addBox(-1.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 82).addBox(-1.0F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.102F, -2.1332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(15, 24).addBox(-1.0F, -0.0506F, -2.0332F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0702F, -5.8129F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(85, 30).addBox(0.0F, -1.5468F, -1.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(53, 90).addBox(0.0F, -1.1008F, -1.0624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(64, 89).addBox(0.0F, -0.9924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2345F, -6.6273F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(5, 106).addBox(0.0F, -1.3924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(104, 11).mirror().addBox(-1.9F, -0.0189F, -1.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0944F, 4.9797F, 2.3978F, 0.0398F, -0.1414F, -1.3026F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(103, 21).mirror().addBox(0.5F, 0.0055F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2423F, 5.7153F, 0.9671F, 0.0519F, -0.7081F, -1.3307F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(87, 23).mirror().addBox(-0.2F, -0.0256F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3596F, 4.9964F, -1.1571F, 0.0377F, -0.7493F, -1.4267F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(107, 103).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -4.2408F, 0.4865F, 0.136F, -0.3393F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(103, 19).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -4.2408F, 0.3146F, 0.361F, -0.8525F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(9, 73).mirror().addBox(-7.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.115F, -4.2408F, 0.0831F, 0.4675F, -1.4142F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(99, 41).mirror().addBox(-1.0718F, -3.6973F, -0.6312F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1448F, 11.6002F, 3.9559F, 1.3341F, 0.0286F, 1.2621F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(78, 104).mirror().addBox(-1.3016F, 0.3092F, -0.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1448F, 11.6002F, 3.9559F, 1.5929F, 0.658F, 1.3274F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(23, 102).mirror().addBox(-0.8695F, -0.8697F, -0.5117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1448F, 11.6002F, 3.9559F, 1.5886F, 0.1781F, 1.317F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-1.0947F, -1.6199F, -0.4437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1448F, 11.6002F, 3.1559F, 1.2624F, -0.6885F, 1.4687F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(13, 102).mirror().addBox(-1.1957F, -0.8233F, -0.4486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1448F, 11.6002F, 3.9559F, 1.5479F, -0.2064F, 1.253F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(56, 62).mirror().addBox(-1.0789F, -0.5F, -3.5436F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.9018F, 3.6508F, -7.8493F, 1.5769F, -0.2321F, -0.8288F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(58, 105).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 105).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 104).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, -0.1068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(102, 98).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -4.1408F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(49, 14).mirror().addBox(-9.3936F, -1.7918F, -0.5273F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.028F, 0.1666F, -1.3964F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(85, 102).mirror().addBox(-2.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.1079F, 0.1302F, -0.8681F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(104, 17).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -2.1408F, 0.1963F, 0.0372F, -0.3294F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(38, 5).mirror().addBox(-10.3936F, -1.7918F, -0.5273F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, 0.04F, 0.1638F, -1.2904F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(78, 102).mirror().addBox(-2.9689F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, 0.1168F, 0.1218F, -0.763F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(87, 96).mirror().addBox(-1.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.815F, -0.1408F, 0.1995F, 0.0255F, -0.2253F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-0.5F, -0.5869F, 0.1413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 105).mirror().addBox(-0.5F, -0.5869F, -0.8587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.786F, -0.5404F, 0.1718F, -0.0624F, 0.1746F, 0.352F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(24, 62).mirror().addBox(-1.0487F, -0.5F, -0.4454F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9018F, 3.6508F, -7.8493F, 1.4247F, -0.181F, -0.1166F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(30, 24).mirror().addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0142F, -0.3474F, -2.9035F, 0.172F, -0.005F, 0.3309F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-0.311F, -0.6436F, -2.0153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.6846F, -6.2622F, 1.8777F, -0.2153F, -0.1146F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-1.5768F, -0.6709F, 0.3293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4346F, -4.0622F, 0.161F, -0.4454F, -0.285F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(52, 37).mirror().addBox(-0.0512F, -0.1688F, -4.8562F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.7846F, -6.0622F, 1.9912F, 0.0265F, -0.3862F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.0512F, -0.1869F, -4.89F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.7846F, -6.0622F, 2.0959F, 0.0265F, -0.3862F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(101, 73).mirror().addBox(-0.7391F, -1.051F, -0.5906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1862F, 14.5295F, 3.8079F, 2.0575F, 0.6998F, 1.4622F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(101, 84).mirror().addBox(-0.3284F, -0.974F, -0.5034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1862F, 14.5295F, 3.8079F, 1.683F, 0.5334F, 0.6657F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(100, 88).mirror().addBox(-0.5F, -2.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.043F, 7.1678F, -2.6625F, -0.2763F, 1.2312F, -0.3422F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(81, 86).mirror().addBox(-0.423F, -1.9296F, -0.547F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 7.7862F, -1.3795F, -0.6918F, 0.225F, -1.8981F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(75, 99).mirror().addBox(-0.2194F, -3.7003F, -0.5317F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 8.4862F, -0.8795F, -0.783F, 0.0789F, -1.7693F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.0334F, -4.9785F, -0.4276F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0794F, 9.2862F, -0.3795F, -0.9217F, -0.0897F, -1.6506F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.2931F, -6.0363F, -0.1629F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2958F, 9.937F, -0.1334F, -1.1513F, -0.0882F, -1.6061F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.5562F, -4.8858F, -1.4701F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7695F, 10.1657F, 0.0014F, 1.0323F, 0.8958F, 1.0843F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(100, 27).mirror().addBox(-1.0486F, -1.2406F, -1.1768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.309F, 9.291F, -1.8808F, 0.7728F, 0.7755F, 0.7547F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(70, 99).mirror().addBox(-0.5954F, -1.5216F, -1.011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.309F, 9.291F, -1.8808F, 0.412F, 0.5036F, 0.2864F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(92, 98).mirror().addBox(-1.0362F, -1.5258F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6109F, 11.9628F, -0.9579F, 0.8633F, 0.7516F, 0.7526F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(99, 68).mirror().addBox(-1.275F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7196F, 11.5404F, -0.0547F, 1.2149F, 0.73F, 1.1689F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(8, 99).mirror().addBox(-0.45F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7196F, 11.5404F, -0.0547F, 1.1208F, 0.931F, 1.0422F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.363F, -1.497F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6109F, 11.9628F, -0.9579F, 0.5606F, 0.4948F, 0.2897F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-1.375F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(38, 94).mirror().addBox(-0.4F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8335F, 12.8557F, 1.0641F, 1.3004F, 0.6836F, 1.115F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(33, 102).mirror().addBox(-0.9F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3911F, 13.8806F, 0.211F, 0.9268F, 0.2438F, 0.311F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(101, 55).mirror().addBox(-0.9154F, -1.7974F, -1.2609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.7799F, 13.9468F, 2.3665F, 1.6798F, -0.0132F, 0.6919F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(101, 80).mirror().addBox(-0.675F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0726F, 13.3258F, 2.6505F, 2.064F, 0.8541F, 1.62F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(101, 63).mirror().addBox(-0.2F, -0.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6308F, 13.4237F, 2.2276F, 1.9321F, 0.4951F, 1.4126F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(62, 101).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8614F, 14.1456F, 1.6472F, 1.6902F, 0.4204F, 0.7423F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(58, 105).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 105).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 104).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, -0.1068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(102, 98).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -4.1408F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(9, 73).addBox(2.3936F, -1.7918F, -0.5273F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -4.2408F, 0.0831F, -0.4675F, 1.4142F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(103, 19).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -4.2408F, 0.3146F, -0.361F, 0.8525F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(107, 103).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.115F, -4.2408F, 0.4865F, -0.136F, 0.3393F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(87, 23).addBox(-1.8F, -0.0256F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3596F, 4.9964F, -1.1571F, 0.0377F, 0.7493F, 1.4267F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(49, 14).addBox(2.3936F, -1.7918F, -0.5273F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.028F, -0.1666F, 1.3964F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 102).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.1079F, -0.1302F, 0.8681F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(104, 17).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -2.1408F, 0.1963F, -0.0372F, 0.3294F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(104, 11).addBox(-0.1F, -0.0189F, -1.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0944F, 4.9797F, 2.3978F, 0.0398F, 0.1414F, 1.3026F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(103, 21).addBox(-2.5F, 0.0055F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2423F, 5.7153F, 0.9671F, 0.0519F, 0.7081F, 1.3307F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(38, 5).addBox(2.3936F, -1.7918F, -0.5273F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, 0.04F, -0.1638F, 1.2904F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(78, 102).addBox(0.9688F, -0.3549F, -0.5273F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, 0.1168F, -0.1218F, 0.763F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(87, 96).addBox(0.013F, 0.1976F, -0.5156F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.815F, -0.1408F, 0.1995F, -0.0255F, 0.2253F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(79, 38).addBox(-0.5F, -0.5869F, 0.1413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(48, 105).addBox(-0.5F, -0.5869F, -0.8587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.786F, -0.5404F, 0.1718F, -0.0624F, -0.1746F, -0.352F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(56, 62).addBox(0.0789F, -0.5F, -3.5436F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.9018F, 3.6508F, -7.8493F, 1.5769F, 0.2321F, 0.8288F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(24, 62).addBox(0.0487F, -0.5F, -0.4454F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9018F, 3.6508F, -7.8493F, 1.4247F, 0.181F, 0.1166F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(30, 24).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0142F, -0.3474F, -2.9035F, 0.172F, 0.005F, -0.3309F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(79, 33).addBox(-0.689F, -0.6436F, -2.0153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.6846F, -6.2622F, 1.8777F, 0.2153F, 0.1146F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(89, 55).addBox(0.5768F, -0.6709F, 0.3293F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 6.4346F, -4.0622F, 0.161F, 0.4454F, 0.285F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 37).addBox(-0.9488F, -0.1688F, -4.8562F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2F, 2.7846F, -6.0622F, 1.9912F, -0.0265F, 0.3862F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 53).addBox(-0.9488F, -0.1869F, -4.89F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 2.7846F, -6.0622F, 2.0959F, -0.0265F, 0.3862F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(18, 86).addBox(-0.5F, -0.9524F, -0.9664F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.9346F, 5.8378F, 1.1764F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(101, 73).addBox(-0.2609F, -1.051F, -0.5906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1862F, 14.5295F, 3.8079F, 2.0575F, -0.6998F, -1.4622F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(101, 84).addBox(-0.6716F, -0.974F, -0.5034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1862F, 14.5295F, 3.8079F, 1.683F, -0.5334F, -0.6657F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5F, -2.0314F, 1.9249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 107).addBox(-0.5F, -0.0314F, 1.0249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(58, 94).addBox(-0.5F, -0.0314F, 0.0249F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.809F, 6.7736F, 1.5952F, 0.0F, 0.0F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(87, 65).addBox(-0.5F, -0.0315F, 0.0109F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.809F, 4.7736F, 1.5778F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(42, 71).addBox(-0.5F, -0.0219F, -0.0281F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 17.609F, 2.7736F, 1.4905F, 0.0F, 0.0F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(94, 23).addBox(-1.0F, -3.142F, -0.9783F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.9346F, 5.8378F, 1.2724F, 0.0F, 0.0F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(100, 88).addBox(-0.5F, -2.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.043F, 7.1678F, -2.6625F, -0.2763F, -1.2312F, 0.3422F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(81, 86).addBox(-0.577F, -1.9296F, -0.547F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 7.7862F, -1.3795F, -0.6918F, -0.225F, 1.8981F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(75, 99).addBox(-0.7806F, -3.7003F, -0.5317F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 8.4862F, -0.8795F, -0.783F, -0.0789F, 1.7693F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(5, 91).addBox(-0.9666F, -4.9785F, -0.4276F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0794F, 9.2862F, -0.3795F, -0.9217F, 0.0897F, 1.6506F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(30, 89).addBox(-0.7069F, -6.0363F, -0.1629F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2958F, 9.937F, -0.1334F, -1.1513F, 0.0882F, 1.6061F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(88, 89).addBox(-0.4438F, -4.8858F, -1.4701F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7695F, 10.1657F, 0.0014F, 1.0323F, -0.8958F, -1.0843F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(100, 27).addBox(0.0486F, -1.2406F, -1.1768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.309F, 9.291F, -1.8808F, 0.7728F, -0.7755F, -0.7547F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(67, 62).addBox(-2.809F, -3.4592F, -1.1219F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.309F, 9.291F, -1.8808F, 0.3124F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(70, 99).addBox(-0.4046F, -1.5216F, -1.011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.309F, 9.291F, -1.8808F, 0.412F, -0.5036F, -0.2864F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(92, 98).addBox(0.0362F, -1.5258F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6109F, 11.9628F, -0.9579F, 0.8633F, -0.7516F, -0.7526F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(99, 68).addBox(0.275F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7196F, 11.5404F, -0.0547F, 1.2149F, -0.73F, -1.1689F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(8, 99).addBox(-0.55F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7196F, 11.5404F, -0.0547F, 1.1208F, -0.931F, -1.0422F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 98).addBox(-0.637F, -1.497F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6109F, 11.9628F, -0.9579F, 0.5606F, -0.4948F, -0.2897F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(51, 75).addBox(-2.2799F, -1.9622F, -2.6801F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7799F, 11.6468F, 0.7665F, 0.487F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(101, 59).addBox(0.375F, -1.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(38, 94).addBox(-1.6F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8335F, 12.8557F, 1.0641F, 1.3004F, -0.6836F, -1.115F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(33, 102).addBox(-0.1F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3911F, 13.8806F, 0.211F, 0.9268F, -0.2438F, -0.311F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(85, 61).addBox(-2.2799F, -0.9974F, -1.879F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7799F, 12.9468F, 0.9665F, 0.8884F, 0.0F, 0.0F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(101, 55).addBox(-0.0846F, -1.7974F, -1.2609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.7799F, 13.9468F, 2.3665F, 1.6798F, 0.0132F, -0.6919F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(13, 102).addBox(0.1957F, -0.8233F, -0.4486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1448F, 11.6002F, 3.9559F, 1.5479F, 0.2064F, -1.253F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(99, 41).addBox(0.0718F, -3.6973F, -0.6312F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1448F, 11.6002F, 3.9559F, 1.3341F, -0.0286F, -1.2621F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(102, 0).addBox(0.0947F, -1.6199F, -0.4437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.1448F, 11.6002F, 3.1559F, 1.2624F, 0.6885F, -1.4687F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(23, 102).addBox(-0.1305F, -0.8697F, -0.5117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1448F, 11.6002F, 3.9559F, 1.5886F, -0.1781F, -1.317F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(78, 104).addBox(0.3016F, 0.3092F, -0.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.1448F, 11.6002F, 3.9559F, 1.5929F, -0.658F, -1.3274F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(101, 80).addBox(-0.325F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0726F, 13.3258F, 2.6505F, 2.064F, -0.8541F, -1.62F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(101, 63).addBox(-0.8F, -0.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6308F, 13.4237F, 2.2276F, 1.9321F, -0.4951F, -1.4126F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(62, 101).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8614F, 14.1456F, 1.6472F, 1.6902F, -0.4204F, -0.7423F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(73, 8).addBox(-0.5F, -0.0202F, -0.0473F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 17.3108F, 0.7988F, 1.4207F, 0.0F, 0.0F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(81, 89).addBox(-0.5F, -2.0461F, -1.4787F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 10.1192F, -4.0588F, -0.5341F, 0.0F, 0.0F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(26, 55).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.174F, -5.2617F, 0.4695F, 0.0F, 0.0F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -2.0104F, 0.0055F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 15.3066F, -4.8315F, 0.9058F, 0.0F, 0.0F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(23, 89).addBox(-0.5F, -1.9646F, 0.0182F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.6731F, -7.8961F, 0.7269F, 0.0F, 0.0F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(88, 35).addBox(-0.5F, -0.0054F, 0.0079F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 9.8731F, -7.6961F, 0.2906F, 0.0F, 0.0F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(45, 22).addBox(-0.5F, -2.0164F, 0.0066F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 14.0731F, -6.3961F, 0.8142F, 0.0F, 0.0F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(39, 42).addBox(-0.5F, -0.0091F, -0.0784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 16.0981F, -2.9961F, 1.2331F, 0.0F, 0.0F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(39, 34).addBox(-0.5F, 0.0046F, 0.0082F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.2981F, -4.8461F, 1.1196F, 0.0F, 0.0F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(76, 28).addBox(-0.5F, -0.0066F, 0.0308F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 16.8654F, -1.1263F, 1.2767F, 0.0F, 0.0F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(81, 14).addBox(-0.5F, -0.0421F, -0.0377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.0908F, -0.1418F, 1.3596F, 0.0F, 0.0F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(85, 85).addBox(-1.5F, 0.0631F, 0.0398F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.1269F, 0.6068F, 1.6476F, 0.0F, 0.0F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(87, 19).addBox(-1.5F, -0.36F, -0.5836F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4346F, -4.0622F, 0.4171F, 0.0F, 0.0F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(104, 13).addBox(-0.5F, -0.3205F, -0.6682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4346F, -4.0622F, 0.2426F, 0.0F, 0.0F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.3F, -5.9F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(44, 55).addBox(-0.6081F, 0.4786F, -0.3689F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.2493F, -1.0078F, -4.9171F, 2.1079F, -0.168F, 1.4803F));

		PartDefinition cube_r270 = leftArm1.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(82, 7).addBox(-0.8F, 0.4F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, -0.9832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftArm1.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(48, 90).addBox(0.0F, 0.0854F, -0.6726F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.6081F, 4.5786F, 0.7311F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftArm1.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(33, 91).addBox(0.0F, -3.8354F, -0.5748F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.6081F, 4.5786F, 0.6311F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftArm1.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(87, 70).addBox(0.0F, -0.1368F, -0.7128F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6081F, 1.4786F, 1.4311F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftArm1.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(91, 6).addBox(0.0F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.6081F, 1.4786F, 0.6311F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftArm1.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(43, 77).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1081F, 8.0079F, 0.0608F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2871F, 10.8869F, 0.5968F, 0.809F, -0.0045F, 3.0295F));

		PartDefinition cube_r276 = leftArm2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(89, 48).addBox(-0.4823F, -0.3448F, -0.1201F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0677F, 10.3684F, 0.4464F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftArm2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 91).addBox(-0.4823F, -0.4029F, -0.3197F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0677F, 6.5684F, 1.0464F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftArm2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(97, 98).addBox(-0.4823F, -0.7538F, -0.2297F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.0677F, 4.3684F, 1.0464F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftArm2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(69, 76).addBox(-0.9823F, -2.7409F, 0.2766F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0677F, 2.8684F, 0.8464F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftArm2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(62, 80).addBox(-0.5F, -0.1335F, -0.9143F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.05F, 7.8583F, 1.959F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftArm2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(53, 94).addBox(-0.5F, -0.2368F, -0.7616F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.05F, 4.3583F, 1.959F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftArm2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(95, 27).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 2.5583F, 1.559F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftArm2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(43, 101).addBox(-0.4823F, -3.1157F, -0.1113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0677F, 4.3684F, 1.0464F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftArm2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(57, 80).addBox(-0.5F, -6.7835F, -0.1263F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0781F, 11.9161F, -1.8291F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftArm2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(96, 52).addBox(-0.5F, -0.2044F, -0.4256F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0781F, 11.9161F, -1.5291F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftArm2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(43, 86).addBox(-0.5322F, -2.5041F, -0.9946F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 2.25F, -0.5F, -0.1777F, 0.007F, -0.0146F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3341F, 15.0997F, -0.1084F, 1.8514F, -0.138F, 0.451F));

		PartDefinition cube_r287 = leftHand.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(5, 99).addBox(0.0F, -0.3F, -1.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 0.6679F, -1.435F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftHand.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(26, 41).addBox(0.0F, -1.0F, 0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 15.3679F, -1.435F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftHand.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(97, 103).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3468F, 2.9127F, -0.5168F, 0.3577F, 0.0495F, 0.0529F));

		PartDefinition cube_r290 = leftHand.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(57, 100).addBox(-0.4468F, -0.2114F, -0.7058F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.3948F, 2.8215F, -0.5076F, 0.1481F, 0.0406F, 0.06F));

		PartDefinition cube_r291 = leftHand.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(101, 46).addBox(-0.6185F, -0.1419F, -0.7678F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3948F, 5.1215F, -0.1076F, -0.0475F, 0.0362F, -0.0359F));

		PartDefinition cube_r292 = leftHand.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(104, 36).addBox(-0.5F, -1.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3948F, 8.3557F, -1.0494F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftHand.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -5.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.3948F, 9.6176F, -1.6016F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftHand.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(69, 69).addBox(-1.0F, -0.65F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftHand.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(65, 37).addBox(-1.0F, 0.25F, -0.4F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1052F, -0.0821F, -1.435F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(44, 55).mirror().addBox(-0.3919F, 0.4786F, -0.3689F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.2493F, -1.0078F, -4.9171F, 1.4587F, 0.1377F, -2.4964F));

		PartDefinition cube_r296 = rightArm1.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(-1.2F, 0.4F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.1081F, -0.9832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightArm1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(48, 90).mirror().addBox(-1.0F, 0.0854F, -0.6726F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 4.5786F, 0.7311F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightArm1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-1.0F, -3.8354F, -0.5748F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 4.5786F, 0.6311F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightArm1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-1.0F, -0.1368F, -0.7128F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 1.4786F, 1.4311F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightArm1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-1.0F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 1.4786F, 0.6311F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightArm1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 8.0079F, 0.0608F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2871F, 10.8869F, 0.5968F, 0.5036F, 0.0045F, -3.0295F));

		PartDefinition cube_r302 = rightArm2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(-0.5177F, -0.3448F, -0.1201F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 10.3684F, 0.4464F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightArm2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.5177F, -0.4029F, -0.3197F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 6.5684F, 1.0464F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightArm2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-0.5177F, -0.7538F, -0.2297F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 4.3684F, 1.0464F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightArm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(69, 76).mirror().addBox(-1.0177F, -2.7409F, 0.2766F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 2.8684F, 0.8464F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightArm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(62, 80).mirror().addBox(-0.5F, -0.1335F, -0.9143F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.05F, 7.8583F, 1.959F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightArm2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(53, 94).mirror().addBox(-0.5F, -0.2368F, -0.7616F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.05F, 4.3583F, 1.959F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightArm2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 2.5583F, 1.559F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightArm2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(43, 101).mirror().addBox(-0.5177F, -3.1157F, -0.1113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0677F, 4.3684F, 1.0464F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightArm2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(57, 80).mirror().addBox(-0.5F, -6.7835F, -0.1263F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0781F, 11.9161F, -1.8291F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightArm2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(-0.5F, -0.2044F, -0.4256F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.0781F, 11.9161F, -1.5291F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightArm2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(43, 86).mirror().addBox(-0.4678F, -2.5041F, -0.9946F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 2.25F, -0.5F, -0.1777F, -0.007F, 0.0146F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3341F, 15.0997F, -0.1084F, 2.5931F, 0.138F, -0.451F));

		PartDefinition cube_r313 = rightHand.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(0.0F, -0.3F, -1.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 0.6679F, -1.435F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightHand.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(26, 41).mirror().addBox(0.0F, -1.0F, 0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 15.3679F, -1.435F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightHand.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(97, 103).mirror().addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3468F, 2.9127F, -0.5168F, 0.3577F, -0.0495F, -0.0529F));

		PartDefinition cube_r316 = rightHand.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(57, 100).mirror().addBox(-0.5532F, -0.2114F, -0.7058F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 2.8215F, -0.5076F, 0.1481F, -0.0406F, -0.06F));

		PartDefinition cube_r317 = rightHand.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(101, 46).mirror().addBox(-0.3815F, -0.1419F, -0.7678F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 5.1215F, -0.1076F, -0.0475F, -0.0362F, 0.0359F));

		PartDefinition cube_r318 = rightHand.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(104, 36).mirror().addBox(-0.5F, -1.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 8.3557F, -1.0494F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightHand.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.5F, -1.0F, -5.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.3948F, 9.6176F, -1.6016F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightHand.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(0.0F, -0.65F, -1.2F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightHand.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(0.0F, 0.25F, -0.4F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, -0.0821F, -1.435F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.586F, -6.3881F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r322 = neck6.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(67, 101).addBox(0.0F, -2.3943F, -5.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 77).addBox(0.0F, -2.3943F, -3.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 45).addBox(-0.5F, -1.9943F, -5.1586F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck6.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(102, 107).mirror().addBox(-0.8982F, -1.8504F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 65).mirror().addBox(-1.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1881F, 2.8174F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r324 = neck6.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(102, 107).addBox(-0.1018F, -1.8504F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 65).addBox(0.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1881F, 2.8174F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8727F, -3.8428F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r325 = neck5.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(60, 75).addBox(0.0F, -1.5F, -3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 0).addBox(0.0F, -1.5F, -5.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(-0.5F, -1.1F, -5.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -4.2F, -0.3914F, -0.0334F, -0.0807F));

		PartDefinition cube_r326 = neck4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(13, 41).addBox(-1.0F, -2.0981F, -0.0287F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.7F, -3.5F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6839F, -2.2921F, 0.1364F, 0.0301F, -0.2161F));

		PartDefinition cube_r327 = neck3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(45, 94).addBox(0.0F, 1.9374F, -0.1567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r328 = neck3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(93, 11).addBox(0.0F, -0.0626F, -0.4567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r329 = neck3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(35, 66).addBox(-1.0F, 0.0773F, -1.9318F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5F, -1.2F, 0.7556F, 0.0893F, -0.2784F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(38, 102).addBox(0.0F, 1.0061F, -1.5437F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -1.5F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0F, 0.9272F, -1.8396F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2F, -2.3F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6269F, -1.8657F, -0.0121F, -0.4088F, -0.3655F));

		PartDefinition cube_r332 = neck.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(51, 71).addBox(0.0F, -0.9039F, -0.0513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.7F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(9, 90).addBox(-1.0F, -0.1384F, 1.7138F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6044F, -1.8724F, 1.5492F, -0.0967F, -0.325F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(55, 0).addBox(-3.0F, 0.0011F, -1.9883F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8067F, -0.2197F, 1.357F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(54, 54).addBox(-3.0F, -0.0119F, -1.6437F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -4.0317F, -0.4947F, 1.8021F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(42, 68).addBox(-3.0F, -0.9796F, -0.9896F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -5.2067F, 0.9553F, 1.2261F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(69, 48).addBox(-3.0F, -0.1394F, -0.0161F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -4.7067F, -0.9697F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(68, 17).addBox(-3.0F, -1.0227F, -0.9913F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.5317F, 0.0553F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(53, 16).addBox(-3.0F, -1.0199F, -1.9853F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.8317F, 2.4303F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(54, 50).addBox(-3.0F, -0.9932F, -1.9727F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -4.5586F, 1.7102F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(38, 0).addBox(-3.0F, -1.0315F, -3.0025F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -2.9336F, 2.8602F, 0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(36, 17).addBox(-3.0F, -0.9801F, -3.0097F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.0336F, 3.1602F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(96, 77).addBox(-1.0F, -1.8F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.9576F, -4.3689F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(78, 98).addBox(-0.5F, -0.45F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.5601F, -2.2034F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(102, 100).addBox(-1.0F, -1.9712F, -0.9349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -3.1653F, -3.3814F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(43, 106).addBox(-1.0F, -1.6095F, -0.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F))
				.texOffs(38, 106).addBox(-1.0F, -1.0095F, -0.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -2.6653F, -3.2814F, 2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(85, 98).addBox(-1.0F, -0.9735F, -1.9444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.1653F, -2.9814F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(93, 89).addBox(-1.0F, 0.588F, -1.9658F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(71, 92).addBox(-2.0F, 0.063F, -1.5158F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -4.9653F, -5.3814F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(75, 3).addBox(-2.0F, -0.0247F, -1.5087F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -2.5403F, -5.7814F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(93, 0).addBox(-2.0F, 0.0197F, -0.0212F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -4.489F, -5.5296F, 0.7374F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(70, 0).addBox(-3.0F, 0.0F, 0.0531F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, -5.0884F, -4.8192F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(65, 34).addBox(-3.0F, -0.0223F, 0.0008F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -5.4707F, -3.8359F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(62, 8).addBox(-1.0F, -2.0735F, -0.0127F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.5F, -2.4821F, -1.4631F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(22, 68).addBox(-1.0F, -1.3F, -0.325F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(-0.5F, -1.7821F, -1.4631F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, 0.013F, -0.6658F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -5.0038F, -3.3447F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(70, 44).addBox(-3.0F, -0.0098F, -1.0094F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -5.7174F, -1.9474F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(68, 14).addBox(-3.0F, -0.0543F, 0.3638F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -5.6924F, -2.3224F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(56, 58).addBox(-2.0F, -0.118F, -2.0155F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.892F, 3.0826F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(88, 40).addBox(-1.5F, -0.325F, -0.175F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.7669F, -0.7119F, -0.8683F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(9, 86).addBox(-2.0F, -0.021F, -1.0084F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 0.533F, 0.1576F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(87, 77).addBox(-2.0F, 0.0328F, -1.0166F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.133F, 1.1326F, -1.1737F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(62, 4).addBox(-2.0F, -0.0169F, -2.3647F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.417F, 1.9076F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 60).addBox(-2.0F, -0.0169F, -2.0147F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.417F, 1.9076F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(58, 24).addBox(-2.0F, -0.0269F, -2.0233F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.117F, 2.6076F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(85, 25).addBox(-0.7F, -0.4676F, -0.3525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -1.3579F, -8.5119F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(83, 43).addBox(-0.7F, -0.4676F, -0.3525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.2F, -1.3579F, -8.5119F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(80, 56).addBox(-0.7F, -0.6662F, -0.3255F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.2F, -0.5579F, -10.8119F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(15, 33).addBox(-0.7F, -0.2959F, -0.3013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.2F, -1.1579F, -11.1119F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(13, 106).addBox(-0.5F, -0.264F, -0.0063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(105, 94).addBox(-0.5F, -0.264F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -0.8079F, -11.7119F, 0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(23, 106).addBox(-0.5F, -0.3172F, 0.4755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(18, 106).addBox(-0.5F, -0.3172F, 0.0755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(72, 105).addBox(-0.5F, -0.3172F, -0.3245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.1671F, -12.4119F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(97, 37).addBox(-0.5F, 0.2735F, 1.5562F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.2218F, -5.926F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(107, 100).addBox(-0.5F, -0.7621F, 0.9968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.2218F, -5.926F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(49, 55).addBox(-0.5F, -0.9924F, 0.0247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.2218F, -5.926F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(63, 107).addBox(-0.5F, -0.2679F, -1.2112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.9218F, -5.326F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -9.8924F, -0.9983F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(57, 4).addBox(-0.4183F, -0.0421F, 3.2277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(87, 107).addBox(-0.4183F, -0.0421F, 2.9277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9922F, 8.1402F, -4.3632F, -0.2662F, 0.3054F, 0.0F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(65, 28).addBox(-0.4183F, -0.3957F, -0.3232F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.9922F, 8.1402F, -4.3632F, -0.3796F, 0.3054F, 0.0F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(98, 5).addBox(-0.5F, -0.35F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9922F, 7.9902F, -4.7132F, -0.288F, 0.2356F, 0.0F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(77, 107).addBox(-1.025F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3223F, 6.9914F, -4.893F, 1.0903F, 0.4208F, 0.6841F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(67, 104).addBox(-0.268F, -0.5465F, -0.9868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.46F, 5.7573F, -3.9422F, 0.9463F, 0.0673F, 0.1124F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(97, 107).addBox(-0.2547F, -0.5325F, -0.1637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.46F, 5.7573F, -3.9422F, 0.7871F, 0.0596F, 0.0027F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(8, 95).addBox(1.5F, -0.9495F, -0.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2F, 9.4627F, 0.1385F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(106, 23).addBox(-0.5F, -0.7515F, -0.3723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2F, 9.7095F, -10.5385F, 0.432F, 0.1876F, 0.0F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(28, 106).addBox(-0.5F, -0.783F, -0.0268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2F, 9.7095F, -10.5385F, 0.3403F, 0.1876F, 0.0F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(80, 51).addBox(-0.5F, -0.8206F, 0.3425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 82).addBox(-0.5F, -0.8206F, 2.7425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2F, 9.7095F, -10.5385F, 0.2836F, 0.1876F, 0.0F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(105, 4).addBox(-0.5F, -0.5382F, -0.3947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7084F, 8.2713F, -7.2905F, -0.135F, 0.1468F, -0.493F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(102, 104).addBox(-0.5F, -0.5421F, -0.6038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7084F, 8.2713F, -7.2905F, 0.5981F, 0.1468F, -0.493F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(48, 85).addBox(0.4046F, -0.4449F, -0.4098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2F, 7.8345F, -5.6885F, 1.0299F, 0.2569F, 0.1192F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(34, 9).addBox(-0.7F, -0.2959F, -0.3013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-2.0F, 8.7345F, -10.1136F, 0.4286F, 0.0675F, 0.0308F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(33, 106).addBox(1.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 9.4627F, -0.4115F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(101, 23).addBox(-0.5F, -0.3259F, -0.5985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 7.0182F, 1.026F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(16, 94).addBox(0.0039F, -0.6448F, -0.8583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0496F, 9.0157F, -0.7487F, -0.9451F, 0.5195F, -0.2556F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(70, 37).addBox(-0.2825F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 70).addBox(-0.7175F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1383F, 7.1007F, -1.6816F, -0.0876F, 0.2644F, 0.026F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -9.8924F, -0.9983F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-0.5817F, -0.0421F, 3.2277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(87, 107).mirror().addBox(-0.5817F, -0.0421F, 2.9277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9922F, 8.1402F, -4.3632F, -0.2662F, -0.3054F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-0.5817F, -0.3957F, -0.3232F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.9922F, 8.1402F, -4.3632F, -0.3796F, -0.3054F, 0.0F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(98, 5).mirror().addBox(-0.5F, -0.35F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9922F, 7.9902F, -4.7132F, -0.288F, -0.2356F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(77, 107).mirror().addBox(0.025F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3223F, 6.9914F, -4.893F, 1.0903F, -0.4208F, -0.6841F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(67, 104).mirror().addBox(-0.732F, -0.5465F, -0.9868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.46F, 5.7573F, -3.9422F, 0.9463F, -0.0673F, -0.1124F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(97, 107).mirror().addBox(-0.7453F, -0.5325F, -0.1637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.46F, 5.7573F, -3.9422F, 0.7871F, -0.0596F, -0.0027F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(8, 95).mirror().addBox(-2.5F, -0.9495F, -0.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.4627F, 0.1385F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(106, 23).mirror().addBox(-0.5F, -0.7515F, -0.3723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.7095F, -10.5385F, 0.432F, -0.1876F, 0.0F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(28, 106).mirror().addBox(-0.5F, -0.783F, -0.0268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.7095F, -10.5385F, 0.3403F, -0.1876F, 0.0F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-0.5F, -0.8206F, 0.3425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 82).mirror().addBox(-0.5F, -0.8206F, 2.7425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.7095F, -10.5385F, 0.2836F, -0.1876F, 0.0F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(105, 4).mirror().addBox(-0.5F, -0.5382F, -0.3947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7084F, 8.2713F, -7.2905F, -0.135F, -0.1468F, 0.493F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(102, 104).mirror().addBox(-0.5F, -0.5421F, -0.6038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7084F, 8.2713F, -7.2905F, 0.5981F, -0.1468F, 0.493F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(48, 85).mirror().addBox(-1.4046F, -0.4449F, -0.4098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2F, 7.8345F, -5.6885F, 1.0299F, -0.2569F, -0.1192F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(34, 9).mirror().addBox(-0.3F, -0.2959F, -0.3013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(2.0F, 8.7345F, -10.1136F, 0.4286F, -0.0675F, -0.0308F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-2.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.4627F, -0.4115F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(101, 23).mirror().addBox(-0.5F, -0.3259F, -0.5985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 7.0182F, 1.026F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(16, 94).mirror().addBox(-1.0039F, -0.6448F, -0.8583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0496F, 9.0157F, -0.7487F, -0.9451F, -0.5195F, 0.2556F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(70, 37).mirror().addBox(-0.7175F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-0.2825F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1383F, 7.1007F, -1.6816F, -0.0876F, -0.2644F, -0.026F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0382F, -1.6506F, 0.1403F, 0.0F, 0.0F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(-0.3913F, 0.1369F, -0.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.4729F, -0.6792F, 1.1519F, -0.4189F, 0.0F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8758F, 0.6071F, -0.2419F, -0.5934F, -0.4189F, 0.0F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(106, 59).mirror().addBox(-0.5002F, -0.3396F, -1.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(106, 56).mirror().addBox(-0.5002F, -0.3396F, -1.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(106, 53).mirror().addBox(-0.5002F, -0.3396F, -0.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1974F, 0.4246F, -9.2203F, 0.2094F, -0.1047F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(106, 50).mirror().addBox(-0.5002F, -0.341F, -0.3718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(106, 47).mirror().addBox(-0.5002F, -0.341F, -0.0218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1974F, 0.4246F, -9.2203F, 0.4145F, -0.1047F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(106, 44).mirror().addBox(-0.5002F, -0.388F, 0.3252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1974F, 0.4246F, -9.2203F, 0.3403F, -0.1047F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(-0.5002F, -0.4723F, -0.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(106, 73).mirror().addBox(-0.5002F, -0.4723F, -0.4758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1974F, 0.4246F, -9.2203F, 0.5149F, -0.1047F, 0.0F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(106, 62).mirror().addBox(-0.5002F, -0.4916F, -0.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(105, 88).mirror().addBox(-0.5002F, -0.4916F, 0.3101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1974F, 0.4246F, -9.2203F, 0.4276F, -0.1047F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(93, 94).mirror().addBox(-0.3511F, -0.2521F, -1.7334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5906F, -0.6696F, -6.9609F, 0.3665F, -0.0611F, 0.0F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(94, 84).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.3782F, 0.0693F, -7.9947F, 0.2094F, -0.0611F, 0.0F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(92, 107).mirror().addBox(-0.0708F, -0.3304F, -3.4737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, -0.1654F, -1.8613F, -0.1667F, -0.3077F, 0.0375F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(82, 107).mirror().addBox(-0.0708F, 0.0006F, -3.1239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, -0.1654F, -1.8613F, -0.2889F, -0.3077F, 0.0375F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(94, 80).mirror().addBox(0.1306F, -0.5635F, 0.8171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.3239F, -3.0003F, -0.1473F, -0.1699F, 0.1255F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(48, 80).mirror().addBox(-0.2753F, 0.1456F, 2.112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.3239F, -3.0003F, 0.1472F, 0.0027F, 0.1513F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(22, 98).mirror().addBox(0.3513F, -0.8104F, -0.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.3239F, -3.0003F, -0.4067F, -0.3724F, 0.1812F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(63, 97).mirror().addBox(-0.5F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.6258F, 0.3171F, -1.4981F, -0.2967F, -0.1047F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(15, 98).mirror().addBox(-0.5F, -0.5955F, -0.9478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.5136F, -0.5138F, -5.9116F, -3.0677F, -0.1769F, 0.0363F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(101, 51).mirror().addBox(-0.5F, -1.0716F, -0.5819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5136F, -0.5138F, -5.9116F, -1.2787F, -0.1769F, 0.0363F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(107, 33).mirror().addBox(-0.0708F, 2.4894F, -1.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, -0.1654F, -1.8613F, -1.6153F, -0.3077F, 0.0375F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(107, 30).mirror().addBox(-0.0721F, -0.4623F, -2.629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, -0.1654F, -1.8613F, -0.2615F, -0.3092F, 0.033F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(36, 98).mirror().addBox(-0.0983F, -0.3659F, -2.2766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, -0.1654F, -1.8613F, -0.096F, -0.3142F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(29, 98).mirror().addBox(-0.0983F, -0.5151F, -2.1706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9915F, -0.1654F, -1.8613F, -0.2094F, -0.3142F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(104, 67).mirror().addBox(-0.5F, -0.6795F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6644F, -0.0654F, -1.2221F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(45, 97).mirror().addBox(-0.5F, -0.5824F, -0.3987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6644F, -0.0654F, -1.2221F, -0.4363F, -0.2443F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(105, 91).addBox(-0.6087F, 0.1369F, -0.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.4729F, -0.6792F, 1.1519F, 0.4189F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(38, 91).addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8758F, 0.6071F, -0.2419F, -0.5934F, 0.4189F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(106, 59).addBox(-0.4998F, -0.3396F, -1.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(106, 56).addBox(-0.4998F, -0.3396F, -1.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(106, 53).addBox(-0.4998F, -0.3396F, -0.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8026F, 0.4246F, -9.2203F, 0.2094F, 0.1047F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(106, 50).addBox(-0.4998F, -0.341F, -0.3718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(106, 47).addBox(-0.4998F, -0.341F, -0.0218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8026F, 0.4246F, -9.2203F, 0.4145F, 0.1047F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(106, 44).addBox(-0.4998F, -0.388F, 0.3252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8026F, 0.4246F, -9.2203F, 0.3403F, 0.1047F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(106, 79).addBox(-0.4998F, -0.4723F, -0.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(106, 73).addBox(-0.4998F, -0.4723F, -0.4758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8026F, 0.4246F, -9.2203F, 0.5149F, 0.1047F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(106, 62).addBox(-0.4998F, -0.4916F, -0.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(105, 88).addBox(-0.4998F, -0.4916F, 0.3101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8026F, 0.4246F, -9.2203F, 0.4276F, 0.1047F, 0.0F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(93, 94).addBox(-0.6489F, -0.2521F, -1.7334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4094F, -0.6696F, -6.9609F, 0.3665F, 0.0611F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(94, 84).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(-0.6218F, 0.0693F, -7.9947F, 0.2094F, 0.0611F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(92, 107).addBox(-0.9292F, -0.3304F, -3.4737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9915F, -0.1654F, -1.8613F, -0.1667F, 0.3077F, -0.0375F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(82, 107).addBox(-0.9292F, 0.0006F, -3.1239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9915F, -0.1654F, -1.8613F, -0.2889F, 0.3077F, -0.0375F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(94, 80).addBox(-1.1306F, -0.5635F, 0.8171F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.3239F, -3.0003F, -0.1473F, 0.1699F, -0.1255F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(48, 80).addBox(-0.7247F, 0.1456F, 2.112F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.3239F, -3.0003F, 0.1472F, -0.0027F, -0.1513F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(22, 98).addBox(-1.3514F, -0.8104F, -0.7266F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.3239F, -3.0003F, -0.4067F, 0.3724F, -0.1812F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(63, 97).addBox(-0.5F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6258F, 0.3171F, -1.4981F, -0.2967F, 0.1047F, 0.0F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(15, 98).addBox(-0.5F, -0.5955F, -0.9478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.4864F, -0.5138F, -5.9116F, -3.0677F, 0.1769F, -0.0363F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(101, 51).addBox(-0.5F, -1.0716F, -0.5819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4864F, -0.5138F, -5.9116F, -1.2787F, 0.1769F, -0.0363F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(107, 33).addBox(-0.9292F, 2.4894F, -1.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9915F, -0.1654F, -1.8613F, -1.6153F, 0.3077F, -0.0375F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(107, 30).addBox(-0.9279F, -0.4623F, -2.629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9915F, -0.1654F, -1.8613F, -0.2615F, 0.3092F, -0.033F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(36, 98).addBox(-0.9017F, -0.3659F, -2.2766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9915F, -0.1654F, -1.8613F, -0.096F, 0.3142F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(29, 98).addBox(-0.9017F, -0.5151F, -2.1706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9915F, -0.1654F, -1.8613F, -0.2094F, 0.3142F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(104, 67).addBox(-0.5F, -0.6795F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6644F, -0.0654F, -1.2221F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(45, 97).addBox(-0.5F, -0.5824F, -0.3987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6644F, -0.0654F, -1.2221F, -0.4363F, 0.2443F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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