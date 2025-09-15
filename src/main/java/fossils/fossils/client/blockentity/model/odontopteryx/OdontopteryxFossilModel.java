package fossils.fossils.client.blockentity.model.odontopteryx;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OdontopteryxFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart body;
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
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public OdontopteryxFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
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
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck7 = this.neck2.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 18.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.5506F, -10.2602F, 0.4336F, -0.0447F, 0.1231F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-4.1962F, -1.8207F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.665F, -3.0158F, -0.0239F, -0.1959F, -1.4224F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(107, 17).mirror().addBox(-2.8122F, -0.4787F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.665F, -3.0158F, -0.1194F, -0.1575F, -0.8917F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(114, 16).mirror().addBox(-0.9428F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.665F, -3.0158F, -0.1467F, -0.0918F, -0.3467F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(109, 51).mirror().addBox(-0.6F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4707F, -2.944F, -0.6047F, -0.2909F, 0.1957F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(109, 51).addBox(-0.4F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.4707F, -2.944F, -0.6047F, 0.2909F, -0.1957F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 22).addBox(-0.5F, -0.6278F, -4.9675F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5436F, 1.8286F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 5).addBox(-0.5F, -0.0478F, -0.0075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.5436F, 3.6286F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 35).addBox(-0.5F, -0.6308F, -0.0326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5436F, 1.8286F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 87).addBox(-1.0F, -0.0791F, -0.0064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.549F, 3.3576F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 16).addBox(-0.0572F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.665F, -3.0158F, -0.1467F, 0.0918F, 0.3467F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(107, 17).addBox(0.8122F, -0.4787F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.665F, -3.0158F, -0.1194F, 0.1575F, 0.8917F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(104, 0).addBox(2.1962F, -1.8207F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.665F, -3.0158F, -0.0239F, 0.1959F, 1.4224F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.9801F, -0.6585F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, 0.974F, -4.5424F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(75, 17).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.923F, 2.2295F, 6.628F, -0.8079F, -0.4905F, 0.8048F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 83).addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.844F, 1.9184F, 6.3442F, -1.2622F, -0.8376F, 1.5124F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 29).addBox(-2.5F, -0.5F, -1.2F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2423F, 0.0354F, 4.1363F, -1.341F, -0.9045F, 1.625F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(91, 88).addBox(-1.5F, -0.5F, 0.275F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5093F, -0.9908F, 1.918F, -1.057F, -0.9537F, 1.6428F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(97, 52).addBox(-1.1089F, -2.8637F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.45F, 0.0F, -0.4986F, -0.1313F, 0.9354F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(27, 98).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2211F, -2.7941F, 1.5042F, -0.5905F, 0.1223F, 0.8612F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 98).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2824F, -2.6295F, 2.0113F, -0.887F, 0.592F, 0.0565F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(93, 26).addBox(-0.7047F, -3.4021F, -0.8133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9281F, -0.1396F, 0.1682F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 55).addBox(-0.5F, 0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2829F, 2.193F, 7.3882F, -1.3646F, 0.3936F, -0.919F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(97, 61).addBox(-7.412F, -4.0196F, 5.5768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.062F, 0.6309F, -0.4822F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(110, 33).addBox(-1.9265F, -0.4689F, 0.3811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -0.9514F, -0.0141F, 0.4017F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(37, 61).addBox(-2.2265F, -0.4689F, -0.2439F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -0.9646F, 0.1371F, 0.1874F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 46).addBox(0.7385F, -1.0987F, -0.9039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2314F, 5.9121F, 6.8344F, -0.9175F, 0.0231F, 0.4695F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(82, 78).addBox(-1.05F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7666F, 4.9267F, 6.0028F, -0.9086F, 0.2065F, 0.1701F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(82, 73).addBox(-1.25F, -0.6F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9177F, 5.704F, 9.4666F, -0.9026F, -0.2122F, 0.6456F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(61, 33).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2858F, 6.9264F, 9.1857F, -1.3374F, 0.0647F, 0.1921F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 112).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5002F, 5.8504F, 9.2647F, -0.8574F, 0.0647F, 0.1921F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(55, 27).addBox(-0.75F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8342F, 1.6603F, 4.3274F, -0.9719F, 0.3286F, -0.0508F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(53, 52).addBox(-1.6189F, -0.6306F, -1.3734F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8084F, 1.7415F, 3.8856F, -1.0519F, 0.2993F, -0.0904F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(98, 108).addBox(-0.5F, -0.6F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 79).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4435F, 5.6012F, 9.3894F, -1.797F, 0.0467F, 0.147F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(81, 93).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5113F, 5.264F, 7.1226F, -2.5475F, 0.0467F, 0.147F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(107, 47).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5173F, 5.487F, 7.9474F, -2.1897F, 0.0467F, 0.147F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 112).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3804F, 5.7803F, 8.6156F, -1.317F, 0.0467F, 0.147F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 112).addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4077F, 5.6554F, 8.8007F, -0.9679F, 0.0467F, 0.147F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(100, 26).addBox(2.086F, -4.004F, 6.8564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, 0.072F, 0.2392F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(51, 0).addBox(-1.5F, -0.475F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8449F, 3.3167F, 7.8724F, -0.7677F, 0.072F, 0.2392F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(35, 41).addBox(-0.9328F, -2.1513F, 1.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, 0.3396F, 0.5181F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.974F, -4.5424F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.923F, 2.2295F, 6.628F, -0.8079F, 0.4905F, -0.8048F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-1.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.844F, 1.9184F, 6.3442F, -1.2622F, 0.8376F, -1.5124F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(-2.5F, -0.5F, -1.2F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2423F, 0.0354F, 4.1363F, -1.341F, 0.9045F, -1.625F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(91, 88).mirror().addBox(-0.5F, -0.5F, 0.275F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5093F, -0.9908F, 1.918F, -1.057F, 0.9537F, -1.6428F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(97, 52).mirror().addBox(0.1089F, -2.8637F, -0.5255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.45F, 0.0F, -0.4986F, 0.1313F, -0.9354F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(27, 98).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2211F, -2.7941F, 1.5042F, -0.5905F, -0.1223F, -0.8612F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(15, 98).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2824F, -2.6295F, 2.0113F, -0.887F, -0.592F, -0.0565F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-0.2953F, -3.4021F, -0.8133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9281F, 0.1396F, -0.1682F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(34, 55).mirror().addBox(-0.5F, 0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2829F, 2.193F, 7.3882F, -1.3646F, -0.3936F, 0.919F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(97, 61).mirror().addBox(6.412F, -4.0196F, 5.5768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.062F, -0.6309F, 0.4822F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(110, 33).mirror().addBox(0.9265F, -0.4689F, 0.3811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -0.9514F, 0.0141F, -0.4017F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 61).mirror().addBox(0.2265F, -0.4689F, -0.2439F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -0.9646F, -0.1371F, -0.1874F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(53, 46).mirror().addBox(-1.7385F, -1.0987F, -0.9039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2314F, 5.9121F, 6.8344F, -0.9175F, -0.0231F, -0.4695F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(0.05F, -0.625F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7666F, 4.9267F, 6.0028F, -0.9086F, -0.2065F, -0.1701F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(0.25F, -0.6F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9177F, 5.704F, 9.4666F, -0.9026F, 0.2122F, -0.6456F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 33).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2858F, 6.9264F, 9.1857F, -1.3374F, -0.0647F, -0.1921F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 112).mirror().addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, 5.8504F, 9.2647F, -0.8574F, -0.0647F, -0.1921F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(-0.25F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8342F, 1.6603F, 4.3274F, -0.9719F, -0.3286F, 0.0508F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(53, 52).mirror().addBox(0.6189F, -0.6306F, -1.3734F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8084F, 1.7415F, 3.8856F, -1.0519F, -0.2993F, 0.0904F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(98, 108).mirror().addBox(-0.5F, -0.6F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 79).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4435F, 5.6012F, 9.3894F, -1.797F, -0.0467F, -0.147F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(81, 93).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5113F, 5.264F, 7.1226F, -2.5475F, -0.0467F, -0.147F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(107, 47).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5173F, 5.487F, 7.9474F, -2.1897F, -0.0467F, -0.147F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 112).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3804F, 5.7803F, 8.6156F, -1.317F, -0.0467F, -0.147F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(55, 112).mirror().addBox(-0.5F, -0.775F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4077F, 5.6554F, 8.8007F, -0.9679F, -0.0467F, -0.147F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(100, 26).mirror().addBox(-3.086F, -4.004F, 6.8564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, -0.072F, -0.2392F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-1.5F, -0.475F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8449F, 3.3167F, 7.8724F, -0.7677F, -0.072F, -0.2392F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(35, 41).mirror().addBox(-0.0672F, -2.1513F, 1.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, -0.3396F, -0.5181F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.955F, 2.5707F, -0.2284F, -1.4208F, -0.0945F, -0.2368F));

		PartDefinition cube_r68 = leftLeg1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(114, 0).addBox(-0.9F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 4.8861F, 0.3761F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftLeg1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(45, 13).addBox(-1.0F, -0.2F, -1.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, 3.8164F, -0.0186F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftLeg1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(20, 113).addBox(-4.5F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, 0.4493F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftLeg1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(92, 112).addBox(-4.5F, -0.075F, -1.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(4.0F, -0.4377F, -0.5898F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftLeg1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(113, 108).addBox(-4.5F, 0.25F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.0F, 0.4493F, -1.0515F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftLeg1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(113, 71).addBox(-1.0F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.5F, 0.7887F, 0.0456F, -1.6581F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(82, 112).addBox(-1.7F, 9.1899F, -1.7734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0467F, 6.0237F, 0.1296F, 2.6339F, 0.0252F, 0.1781F));

		PartDefinition cube_r74 = leftLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(58, 17).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 1.0921F, 0.4714F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(112, 65).addBox(-1.75F, -1.8F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.05F, 1.8629F, -0.6323F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(70, 112).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2F, 9.5321F, -1.5563F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 70).addBox(-2.5F, -0.2856F, 0.1297F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.9646F, -0.4919F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(27, 102).addBox(-0.5F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.2F, 2.7732F, -0.0422F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 10.206F, -1.7969F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 94).addBox(-5.5F, -5.2F, 0.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, 4.6553F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4797F, 1.6247F, -0.073F, -0.1745F, -0.3927F, 0.0F));

		PartDefinition cube_r80 = toe3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(42, 108).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r81 = toe3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(52, 108).addBox(-1.5F, -0.1918F, -0.3882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2679F, 1.0768F, 0.6897F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(35, 35).addBox(-2.0F, -1.0F, -3.85F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5977F, 4.8121F, 0.2449F, 1.3509F, -0.0736F, 0.047F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(19, 11).addBox(-2.5F, -0.4662F, -5.8478F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.541F, -3.6525F, 0.2658F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.955F, 2.5707F, -0.2284F, -1.2899F, 0.0945F, 0.2368F));

		PartDefinition cube_r82 = rightLeg1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(114, 3).addBox(-0.1F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 4.8861F, 0.3761F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(35, 48).addBox(0.0F, -0.2F, -1.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.5F, 3.8164F, -0.0186F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(107, 113).addBox(3.5F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0F, 0.4493F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(102, 113).addBox(3.5F, -0.075F, -1.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-4.0F, -0.4377F, -0.5898F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(113, 111).addBox(3.5F, 0.25F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.0F, 0.4493F, -1.0515F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(113, 78).addBox(0.0F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.5F, 0.7887F, 0.0456F, -1.6581F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(87, 112).addBox(0.7F, 9.1899F, -1.7734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0467F, 6.0237F, 0.1296F, 2.4157F, -0.0252F, -0.1781F));

		PartDefinition cube_r88 = rightLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(108, 72).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 1.0921F, 0.4714F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(112, 68).addBox(0.75F, -1.8F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.05F, 1.8629F, -0.6323F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(112, 85).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.2F, 9.5321F, -1.5563F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(41, 70).addBox(1.5F, -0.2856F, 0.1297F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 0.9646F, -0.4919F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(102, 45).addBox(-0.5F, -2.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2F, 2.7732F, -0.0422F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 10.206F, -1.7969F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(63, 96).addBox(4.5F, -5.2F, 0.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0F, 4.6553F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4797F, 1.6247F, -0.073F, -0.1745F, 0.3927F, 0.0F));

		PartDefinition cube_r94 = toe2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(47, 108).addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r95 = toe2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 108).addBox(0.5F, -0.1918F, -0.3882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2679F, 1.0768F, 0.6897F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -1.0F, -3.85F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5977F, 4.8121F, 0.2449F, 1.3509F, 0.0736F, -0.047F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(19, 19).addBox(-1.5F, -0.4662F, -5.8478F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.541F, -3.6525F, 0.2658F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -0.1056F, -0.9932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(114, 59).addBox(0.0F, -0.7056F, 0.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 93).addBox(0.0F, -0.5056F, 2.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5348F, 5.926F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(75, 114).addBox(0.0F, -0.594F, 1.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2795F, 2.9096F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(78, 114).addBox(0.0F, -0.4822F, 1.0707F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(41, 99).addBox(0.0F, -0.0801F, 2.782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 99).addBox(0.0F, -0.0801F, 0.782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 94).addBox(0.0F, -0.1801F, -1.218F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(91, 92).mirror().addBox(-6.1962F, -1.8207F, -0.5144F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.565F, -0.5158F, -0.0239F, -0.1959F, -1.4224F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(98, 106).mirror().addBox(-2.8122F, -0.4786F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.565F, -0.5158F, -0.1194F, -0.1575F, -0.8917F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(110, 57).mirror().addBox(-0.9428F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.565F, -0.5158F, -0.1467F, -0.0918F, -0.3467F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(35, 112).mirror().addBox(0.0F, 0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.202F, -3.9333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-6.2026F, -1.8495F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, -0.0121F, -0.0743F, -1.2762F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(57, 106).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, -0.0477F, -0.0583F, -0.7517F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, -0.0341F, -0.0439F, -0.2066F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(79, 58).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, -0.1368F, -0.0651F, -0.201F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(10, 106).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, -0.1248F, -0.1296F, -0.7444F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(86, 19).mirror().addBox(-6.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, -0.043F, -0.1745F, -1.2724F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.9094F, -0.1878F, -0.488F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -2.3408F, -0.1784F, -0.08F, -0.2501F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(105, 24).mirror().addBox(-2.6805F, -0.6317F, -0.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -2.3408F, -0.1529F, -0.1638F, -0.7925F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-7.0055F, -1.8874F, -0.512F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -2.3408F, -0.0498F, -0.2181F, -1.3232F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(82, 109).mirror().addBox(0.0F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 109).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 59).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1021F, -2.1333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(91, 92).addBox(2.1962F, -1.8207F, -0.5144F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.565F, -0.5158F, -0.0239F, 0.1959F, 1.4224F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(98, 106).addBox(0.8122F, -0.4786F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.565F, -0.5158F, -0.1194F, 0.1575F, 0.8917F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(110, 57).addBox(-0.0572F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.565F, -0.5158F, -0.1467F, 0.0918F, 0.3467F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(35, 112).addBox(-1.0F, 0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.202F, -3.9333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(93, 0).addBox(2.2026F, -1.8495F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, -0.0121F, 0.0743F, 1.2762F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(57, 106).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, -0.0477F, 0.0583F, 0.7517F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(79, 67).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, -0.0341F, 0.0439F, 0.2066F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(79, 58).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, -0.1368F, 0.0651F, 0.201F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(10, 106).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, -0.1248F, 0.1296F, 0.7444F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(86, 19).addBox(2.2026F, -1.8494F, -0.5143F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, -0.043F, 0.1745F, 1.2724F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(18, 58).addBox(-0.0907F, -0.1878F, -0.488F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -2.3408F, -0.1784F, 0.08F, 0.2501F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(105, 24).addBox(0.6805F, -0.6317F, -0.512F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -2.3408F, -0.1529F, 0.1638F, 0.7925F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(21, 8).addBox(2.0055F, -1.8874F, -0.512F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -2.3408F, -0.0498F, 0.2181F, 1.3232F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(82, 109).addBox(-1.0F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 109).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 59).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1021F, -2.1333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.0506F, -4.0332F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, -2.8702F, -8.7128F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 115).addBox(0.0F, -1.5218F, -1.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(114, 90).addBox(0.0F, -1.1008F, -1.0624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -0.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(114, 51).addBox(0.0F, -1.5424F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(110, 19).mirror().addBox(0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 8).mirror().addBox(0.3F, -0.1F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 109).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, 0.8932F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(114, 6).mirror().addBox(-3.4102F, -1.789F, -0.4287F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.4408F, 0.0311F, 0.1838F, -1.3958F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(107, 13).mirror().addBox(-2.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.4408F, 0.1193F, 0.1435F, -0.8665F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(112, 88).mirror().addBox(-1.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.4408F, 0.2128F, 0.0429F, -0.3287F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(40, 33).mirror().addBox(-5.3167F, -1.8145F, -0.4043F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.6342F, 0.0086F, 0.0547F, -1.2939F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(103, 84).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.6342F, 0.0348F, 0.0431F, -0.7697F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(5, 41).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.715F, 0.6342F, 0.089F, 0.0001F, -0.2267F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(110, 19).addBox(-1.5F, -0.3F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 8).addBox(-1.3F, -0.1F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 109).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, 0.8932F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(114, 6).addBox(2.4102F, -1.789F, -0.4287F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.4408F, 0.0311F, -0.1838F, 1.3958F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(107, 13).addBox(0.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.4408F, 0.1193F, -0.1435F, 0.8665F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(112, 88).addBox(0.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.4408F, 0.2128F, -0.0429F, 0.3287F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(40, 33).addBox(2.3167F, -1.8145F, -0.4043F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.6342F, 0.0086F, -0.0547F, 1.2939F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(103, 84).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.6342F, 0.0348F, -0.0431F, 0.7697F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(5, 41).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.715F, 0.6342F, 0.089F, -0.0001F, 0.2267F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(109, 90).addBox(-0.5F, 4.0273F, -3.6093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.8134F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(69, 11).addBox(-1.5F, -3.0991F, -0.6351F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 0.8797F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(84, 5).addBox(-1.5F, 0.7592F, -0.8052F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.0542F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(93, 6).addBox(-1.5F, -1.425F, -0.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.87F, 3.298F, 1.6301F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(98, 94).addBox(-0.5F, 2.9042F, -4.9133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 2.0403F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(50, 33).addBox(-0.5F, -1.9953F, -2.5334F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.124F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(20, 110).addBox(-0.5F, -1.257F, 0.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 109).addBox(-0.5F, -0.982F, 0.0176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0711F, -5.6369F, 0.4564F, 0.0F, 0.0F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(96, 78).addBox(-0.5F, -0.525F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 5.001F, -4.9663F, -0.4512F, 0.0F, 0.0F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, -0.725F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 4.9722F, -3.9667F, 0.6833F, 0.0F, 0.0F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(96, 57).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 4.9722F, -3.9667F, 0.0288F, 0.0F, 0.0F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(37, 108).addBox(-0.5F, -3.7536F, -2.6973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.0324F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(30, 93).addBox(-0.5F, 1.1829F, -2.6261F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.4513F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, -0.5363F, -2.4748F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.3378F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(98, 39).addBox(-0.5F, 3.0852F, -2.7589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.4949F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(96, 10).addBox(-0.5F, 3.818F, -3.0878F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.673F, -1.006F, 1.5778F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 2).addBox(-1.5F, -0.95F, -0.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5219F, -3.843F, 0.3299F, 0.0F, 0.0F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7615F, -0.5945F, -2.0974F, 3.098F, 0.3376F, 0.9924F));

		PartDefinition cube_r161 = leftArm1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(39, 89).addBox(-0.8F, 0.4F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, -0.9832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftArm1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(22, 97).addBox(-0.5F, -2.4F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(-0.1081F, 15.8568F, -2.861F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftArm1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(97, 14).addBox(-0.5F, 0.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.116F))
				.texOffs(96, 82).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 13.5797F, -1.1834F, -0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftArm1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(66, 80).addBox(-0.5F, -2.0F, -1.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.1081F, 11.6672F, -1.4522F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftArm1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(44, 97).addBox(-0.5F, -3.7F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 20.4309F, -4.1701F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftArm1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5F, -8.7F, -0.875F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 28.4701F, -7.7494F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftArm1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(73, 89).addBox(-0.5F, 0.0F, -0.875F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 34.0522F, -9.7857F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftArm1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(58, 89).addBox(-0.5F, 0.0F, -0.875F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 34.0522F, -9.7857F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftArm1.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -17.8F, -0.875F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, 34.2022F, -9.8357F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftArm1.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(53, 89).addBox(-0.5F, 0.0F, -0.075F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 11.7135F, -2.713F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftArm1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(48, 89).addBox(-0.5F, -4.5F, -0.575F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 10.5592F, -1.9334F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftArm1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(15, 93).addBox(-0.5F, -1.5F, -1.725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(-0.1081F, 9.8424F, -0.483F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftArm1.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(104, 51).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.113F)), PartPose.offsetAndRotation(-0.1081F, 6.642F, -0.4609F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftArm1.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(25, 89).addBox(0.0F, -0.4905F, -0.7455F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.6081F, 2.8786F, 0.3312F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftArm1.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(105, 39).addBox(0.0F, 0.1859F, -0.3263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.6081F, 0.3786F, 0.3312F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftArm1.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(30, 79).addBox(0.0F, 0.0589F, 0.307F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.6081F, 1.7786F, -1.2689F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftArm1.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(27, 108).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 1.2467F, -0.3734F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(51, 76).addBox(-0.55F, 26.6597F, 3.3334F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.2727F, 40.9097F, -10.3355F, 2.7681F, -0.0148F, -3.0959F));

		PartDefinition cube_r178 = leftArm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(40, 6).addBox(-0.5F, -3.7803F, 0.2049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.65F, 26.7293F, 1.559F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftArm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(58, 64).addBox(-0.5F, -0.0803F, -0.0451F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.65F, 26.7293F, 1.559F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftArm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(21, 66).addBox(-0.5F, -0.0297F, -0.3886F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.65F, 17.235F, 2.0053F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftArm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(25, 35).addBox(-0.5F, -20.2277F, -0.0218F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.65F, 22.435F, 2.0053F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftArm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(10, 78).addBox(-0.5F, 2.3435F, -0.9583F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 7.8583F, 2.459F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftArm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -0.2095F, -0.1963F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.05F, 6.52F, 1.3451F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftArm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.7278F, -1.142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.05F, 4.3583F, 1.959F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftArm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(66, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 0.7224F, 0.6114F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftArm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(16, 66).addBox(-0.5F, 0.0081F, -1.2443F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(11, 66).addBox(-0.5F, 0.0081F, -0.7443F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.05F, 17.1425F, 3.9295F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftArm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(107, 43).addBox(-0.5F, -0.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0008F, 35.6267F, 3.3439F, -1.4572F, -0.0307F, -0.0231F));

		PartDefinition cube_r188 = leftArm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(100, 20).addBox(-0.5F, -3.6919F, -0.0443F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0489F, 36.5755F, 2.4919F, -0.2791F, -0.0307F, -0.0231F));

		PartDefinition cube_r189 = leftArm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(47, 103).addBox(-0.5F, -0.0919F, -0.7443F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.05F, 34.4004F, 4.076F, -0.1482F, -0.0307F, -0.0231F));

		PartDefinition cube_r190 = leftArm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(46, 76).addBox(-0.5F, -0.0919F, -0.7443F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.05F, 26.8189F, 4.6062F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftArm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(48, 64).addBox(-0.5F, -0.1919F, -0.7443F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.05F, 7.8583F, 2.459F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftArm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(68, 96).addBox(-0.5F, -0.2368F, -0.7616F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.05F, 4.3583F, 1.959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftArm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(102, 65).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 2.5583F, 1.559F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftArm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 104).addBox(-0.4823F, -3.1157F, -0.1113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0677F, 4.3683F, 1.0464F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4406F, 38.0557F, 3.1948F, 0.8431F, -0.3563F, 0.2404F));

		PartDefinition cube_r195 = leftHand.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(59, 97).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4448F, 10.3992F, -5.7575F, -2.8362F, 0.0F, 3.1416F));

		PartDefinition cube_r196 = leftHand.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(64, 51).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 6.6488F, -3.874F, -2.5307F, 0.0F, 3.1416F));

		PartDefinition cube_r197 = leftHand.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(42, 81).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 23.9449F, -6.8236F, -3.0805F, 0.0F, 3.1416F));

		PartDefinition cube_r198 = leftHand.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(15, 50).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 26.4589F, -8.3758F, -2.9932F, 0.0F, 3.1416F));

		PartDefinition cube_r199 = leftHand.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(67, 108).addBox(-0.8657F, 0.4572F, -0.9717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1052F, 0.8179F, -1.035F, 0.1656F, 0.0587F, 0.0425F));

		PartDefinition cube_r200 = leftHand.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(72, 29).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.4451F, 4.2058F, -1.8735F, -0.4801F, 0.0576F, 0.044F));

		PartDefinition cube_r201 = leftHand.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(74, 0).addBox(-0.65F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3131F, 15.7491F, -5.2103F, -0.3515F, 0.0375F, -0.0015F));

		PartDefinition cube_r202 = leftHand.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -4.5F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4198F, 8.4883F, -3.295F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftHand.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(53, 20).addBox(-0.5F, -1.0327F, 1.2083F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.3948F, 24.356F, -7.8127F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftHand.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(78, 10).addBox(-1.0F, 0.35F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftHand.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(18, 43).addBox(-0.5F, -7.5F, -0.7F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3948F, 7.407F, -3.0465F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftHand.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(79, 0).addBox(-1.0F, 0.3883F, 0.0231F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(20, 78).addBox(-1.0F, 0.3883F, -0.1769F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1052F, 11.6029F, -5.3804F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftHand.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(5, 50).addBox(-1.0F, 0.3883F, -0.9769F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1052F, 0.8179F, -1.035F, -0.3142F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7615F, -0.5945F, -2.0974F, -3.0645F, -0.3387F, -1.2237F));

		PartDefinition cube_r208 = rightArm1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(89, 41).addBox(-1.2F, 0.4F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(0.1081F, -0.9832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightArm1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(54, 97).addBox(-0.5F, -2.4F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(0.1081F, 15.8568F, -2.861F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightArm1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(49, 97).addBox(-0.5F, 0.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.116F))
				.texOffs(97, 31).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1081F, 13.5797F, -1.1834F, -0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightArm1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(35, 81).addBox(-0.5F, -2.0F, -1.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(0.1081F, 11.6672F, -1.4522F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightArm1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(97, 46).addBox(-0.5F, -3.7F, -0.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1081F, 20.4309F, -4.1701F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightArm1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(68, 69).addBox(-0.5F, -8.7F, -0.875F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.1081F, 28.4701F, -7.7494F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightArm1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(91, 80).addBox(-0.5F, 0.0F, -0.875F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1081F, 34.0522F, -9.7857F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightArm1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(91, 72).addBox(-0.5F, 0.0F, -0.875F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.1081F, 34.0522F, -9.7857F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightArm1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 21).addBox(-0.5F, -17.8F, -0.875F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(0.1081F, 34.2022F, -9.8357F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightArm1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(10, 91).addBox(-0.5F, 0.0F, -0.075F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.1081F, 11.7135F, -2.713F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightArm1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(5, 91).addBox(-0.5F, -4.5F, -0.575F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.1081F, 10.5592F, -1.9334F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightArm1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(93, 21).addBox(-0.5F, -1.5F, -1.725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(0.1081F, 9.8424F, -0.483F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r220 = rightArm1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(104, 59).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.113F)), PartPose.offsetAndRotation(0.1081F, 6.642F, -0.4609F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightArm1.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 90).addBox(-1.0F, -0.4905F, -0.7455F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(0.6081F, 2.8786F, 0.3312F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightArm1.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(83, 105).addBox(-1.0F, 0.1859F, -0.3263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6081F, 0.3786F, 0.3312F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightArm1.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, 0.0589F, 0.307F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.6081F, 1.7786F, -1.2689F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightArm1.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(32, 108).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1081F, 1.2467F, -0.3734F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(61, 76).addBox(-0.45F, 26.6597F, 3.3334F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.2727F, 40.9097F, -10.3355F, 2.7682F, -0.0171F, 3.0146F));

		PartDefinition cube_r225 = rightArm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -3.7803F, 0.2049F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.65F, 26.7293F, 1.559F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightArm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(63, 64).addBox(-0.5F, -0.0803F, -0.0451F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.65F, 26.7293F, 1.559F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r227 = rightArm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(67, 51).addBox(-0.5F, -0.0297F, -0.3886F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.65F, 17.235F, 2.0053F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r228 = rightArm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, -20.2277F, -0.0218F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.65F, 22.435F, 2.0053F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r229 = rightArm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(15, 78).addBox(-0.5F, 2.3435F, -0.9583F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 7.8583F, 2.459F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightArm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, -0.2095F, -0.1963F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.05F, 6.52F, 1.3451F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightArm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(32, 103).addBox(-0.5F, -0.7278F, -1.142F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.05F, 4.3583F, 1.959F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightArm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(68, 63).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 0.7224F, 0.6114F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightArm2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(31, 67).addBox(-0.5F, 0.0081F, -1.2443F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(26, 67).addBox(-0.5F, 0.0081F, -0.7443F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.05F, 17.1425F, 3.9295F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightArm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(15, 108).addBox(-0.5F, -0.9F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0008F, 35.6267F, 3.3439F, -1.4572F, 0.0307F, 0.0231F));

		PartDefinition cube_r235 = rightArm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(102, 14).addBox(-0.5F, -3.6919F, -0.0443F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.0489F, 36.5755F, 2.4919F, -0.2791F, 0.0307F, 0.0231F));

		PartDefinition cube_r236 = rightArm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(52, 103).addBox(-0.5F, -0.0919F, -0.7443F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.05F, 34.4004F, 4.076F, -0.1482F, 0.0307F, 0.0231F));

		PartDefinition cube_r237 = rightArm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(56, 76).addBox(-0.5F, -0.0919F, -0.7443F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.05F, 26.8189F, 4.6062F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightArm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(53, 64).addBox(-0.5F, -0.1919F, -0.7443F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.05F, 7.8583F, 2.459F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightArm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(96, 72).addBox(-0.5F, -0.2368F, -0.7616F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.05F, 4.3583F, 1.959F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightArm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(68, 102).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 2.5583F, 1.559F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightArm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(104, 30).addBox(-0.5177F, -3.1157F, -0.1113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0677F, 4.3683F, 1.0464F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4406F, 38.0557F, 3.1948F, 0.8533F, 0.3236F, -0.2098F));

		PartDefinition cube_r242 = rightHand.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(64, 103).addBox(0.05F, 0.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3948F, 8.246F, -5.6029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightHand.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(24, 103).addBox(0.0F, -4.2F, -0.9F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3948F, 8.2707F, -4.5215F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightHand.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(112, 25).addBox(0.0F, -4.2F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3948F, 26.6215F, -7.2879F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightHand.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(78, 89).addBox(0.0F, -1.837F, -0.7461F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3948F, 24.356F, -7.8127F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightHand.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(72, 108).addBox(-0.1343F, 0.4572F, -0.9717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1052F, 0.8179F, -1.035F, 0.1656F, -0.0587F, -0.0425F));

		PartDefinition cube_r247 = rightHand.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(72, 51).addBox(-0.5F, -4.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.4451F, 4.2058F, -1.8735F, -0.4801F, -0.0576F, -0.044F));

		PartDefinition cube_r248 = rightHand.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(75, 38).addBox(-0.35F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3131F, 15.7491F, -5.2103F, -0.3515F, -0.0375F, 0.0015F));

		PartDefinition cube_r249 = rightHand.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, -4.5F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4198F, 8.4883F, -3.295F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightHand.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(23, 53).addBox(-0.5F, -1.0327F, 1.2083F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.3948F, 24.356F, -7.8127F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightHand.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(79, 31).addBox(0.0F, 0.35F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightHand.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(48, 41).addBox(-0.5F, -7.5F, -0.7F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3948F, 7.407F, -3.0465F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightHand.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(25, 79).addBox(0.0F, 0.3883F, 0.0231F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(79, 21).addBox(0.0F, 0.3883F, -0.1769F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1052F, 11.6029F, -5.3804F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightHand.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(10, 50).addBox(0.0F, 0.3883F, -0.9769F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1052F, 0.8179F, -1.035F, -0.3142F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, -0.4474F, -2.9035F));

		PartDefinition cube_r255 = bone2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(77, 108).addBox(-0.0328F, 2.9678F, -1.2435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, -0.6634F, 0.7642F, 2.9898F));

		PartDefinition cube_r256 = bone2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(65, 112).addBox(1.994F, 0.7508F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, 0.176F, 1.0174F, -2.0804F));

		PartDefinition cube_r257 = bone2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(34, 8).addBox(0.662F, 0.0245F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, -0.0383F, 1.0265F, -2.3312F));

		PartDefinition cube_r258 = bone2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(105, 35).addBox(-0.0066F, 1.2111F, -0.7991F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, -0.7752F, 0.7607F, 3.0392F));

		PartDefinition cube_r259 = bone2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 98).addBox(-1.7863F, 1.1528F, -1.0824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, 1.3003F, -0.0593F, -0.7668F));

		PartDefinition cube_r260 = bone2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(105, 106).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4579F, 8.0599F, 5.3429F, 1.5185F, -0.0593F, -0.7668F));

		PartDefinition cube_r261 = bone2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(73, 103).addBox(-1.7783F, -0.9547F, -0.8569F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, 1.1526F, -0.3876F, -0.684F));

		PartDefinition cube_r262 = bone2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(45, 20).addBox(-1.2783F, -1.9547F, 0.3431F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2692F, 6.3626F, 3.2368F, 1.1819F, -1.0392F, -0.7579F));

		PartDefinition cube_r263 = bone2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(72, 60).addBox(-0.7783F, -0.1547F, 0.3431F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2692F, 6.3626F, 3.2368F, -0.2743F, -1.0779F, 0.9102F));

		PartDefinition cube_r264 = bone2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(98, 43).addBox(-0.2783F, -0.1547F, 0.3431F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2692F, 6.3626F, 3.2368F, 0.3506F, -1.1205F, 0.2235F));

		PartDefinition cube_r265 = bone2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(45, 56).addBox(-0.5783F, -0.9547F, 0.3431F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2692F, 6.3626F, 3.2368F, 0.5497F, -1.0709F, -0.0001F));

		PartDefinition cube_r266 = bone2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(103, 79).addBox(-0.9783F, -0.9547F, -0.8569F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, 1.0739F, -0.6623F, -0.5286F));

		PartDefinition cube_r267 = bone2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(19, 103).addBox(-1.5691F, -3.4152F, -1.1895F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, 0.9378F, -0.2986F, -0.4969F));

		PartDefinition cube_r268 = bone2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(5, 103).addBox(-0.5F, -1.5F, -0.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8212F, 5.1635F, 1.5251F, 1.0282F, -0.2954F, -0.6976F));

		PartDefinition cube_r269 = bone2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(105, 94).addBox(0.3546F, -4.4592F, -0.9593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, 1.0712F, -0.0428F, -0.8759F));

		PartDefinition cube_r270 = bone2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(105, 20).addBox(-1.2041F, -2.2886F, -0.9593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8264F, 5.8736F, 3.5376F, 0.9503F, -0.6038F, -0.5137F));

		PartDefinition cube_r271 = bone2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(30, 88).addBox(-0.8727F, -0.9799F, -2.4142F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1858F, 2.232F, -0.0587F, 2.5984F, 0.2097F, 0.3278F));

		PartDefinition cube_r272 = bone2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(82, 88).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.8679F, 3.3741F, -3.419F, 1.4604F, 0.5648F, 0.6784F));

		PartDefinition cube_r273 = bone2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(64, 45).addBox(0.5413F, -0.5715F, 0.0265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6488F, 2.5486F, -2.7474F, 0.8314F, 0.2142F, 0.0189F));

		PartDefinition cube_r274 = bone2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(88, 61).addBox(-0.7848F, -0.0985F, -0.2181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0864F, 2.4152F, -0.4443F, 1.4413F, 0.2153F, 0.1146F));

		PartDefinition cube_r275 = bone2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(25, 27).addBox(0.7279F, -1.8172F, 5.7052F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.351F, -0.2686F, -0.288F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(21, 0).addBox(-0.3248F, -0.4275F, 0.2082F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.1094F, -0.0903F, -0.3188F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.0142F, -0.4474F, -2.9035F));

		PartDefinition cube_r277 = bone3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(77, 108).mirror().addBox(-0.9672F, 2.9678F, -1.2435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, -0.6634F, -0.7642F, -2.9898F));

		PartDefinition cube_r278 = bone3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(65, 112).mirror().addBox(-2.994F, 0.7508F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, 0.176F, -1.0174F, 2.0804F));

		PartDefinition cube_r279 = bone3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-1.662F, 0.0245F, -0.7991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, -0.0383F, -1.0265F, 2.3312F));

		PartDefinition cube_r280 = bone3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(105, 35).mirror().addBox(-0.9934F, 1.2111F, -0.7991F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, -0.7752F, -0.7607F, -3.0392F));

		PartDefinition cube_r281 = bone3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(0.7863F, 1.1528F, -1.0824F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, 1.3003F, 0.0593F, 0.7668F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(105, 106).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4579F, 8.0599F, 5.3429F, 1.5185F, 0.0593F, 0.7668F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(73, 103).mirror().addBox(0.7783F, -0.9547F, -0.8569F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, 1.1526F, 0.3876F, 0.684F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-1.7217F, -1.9547F, 0.3431F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2692F, 6.3626F, 3.2368F, 1.1819F, 1.0392F, 0.7579F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(72, 60).mirror().addBox(-5.2217F, -0.1547F, 0.3431F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2692F, 6.3626F, 3.2368F, -0.2743F, 1.0779F, -0.9102F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-3.7217F, -0.1547F, 0.3431F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2692F, 6.3626F, 3.2368F, 0.3506F, 1.1205F, -0.2235F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(45, 56).mirror().addBox(-2.4217F, -0.9547F, 0.3431F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2692F, 6.3626F, 3.2368F, 0.5497F, 1.0709F, 0.0001F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(103, 79).mirror().addBox(-0.0217F, -0.9547F, -0.8569F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, 1.0739F, 0.6623F, 0.5286F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(19, 103).mirror().addBox(0.5691F, -3.4152F, -1.1895F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, 0.9378F, 0.2986F, 0.4969F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-0.5F, -1.5F, -0.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8212F, 5.1635F, 1.5251F, 1.0282F, 0.2954F, 0.6976F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(105, 94).mirror().addBox(-1.3546F, -4.4592F, -0.9593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, 1.0712F, 0.0428F, 0.8759F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(105, 20).mirror().addBox(0.2041F, -2.2886F, -0.9593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8264F, 5.8736F, 3.5376F, 0.9503F, 0.6038F, 0.5137F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.1273F, -0.9799F, -2.4142F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1858F, 2.232F, -0.0587F, 2.5984F, -0.2097F, -0.3278F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(82, 88).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.8679F, 3.3741F, -3.419F, 1.4604F, -0.5648F, -0.6784F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-1.5413F, -0.5715F, 0.0265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6488F, 2.5486F, -2.7474F, 0.8314F, -0.2142F, -0.0189F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(-0.2152F, -0.0985F, -0.2181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0864F, 2.4152F, -0.4443F, 1.4413F, -0.2153F, -0.1146F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(25, 27).mirror().addBox(-1.7279F, -1.8172F, 5.7052F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.351F, 0.2686F, 0.288F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.6752F, -0.4275F, 0.2082F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.1094F, 0.0903F, 0.3188F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0093F, -4.6F, 0.2092F, 0.0091F, -0.0427F));

		PartDefinition cube_r299 = neck6.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(112, 114).addBox(0.0F, -2.6943F, -3.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 21).addBox(-0.5F, -1.9943F, -3.1586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5577F, -0.5466F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r300 = neck6.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(97, 114).addBox(0.0F, -1.0924F, -0.0881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1939F, -0.7809F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r301 = neck6.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(107, 15).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1256F, 1.7056F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r302 = neck6.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(114, 14).mirror().addBox(-1.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2664F, 2.2758F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r303 = neck6.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(107, 15).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1256F, 1.7056F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r304 = neck6.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(114, 14).addBox(0.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2664F, 2.2758F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7237F, -2.8727F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r305 = neck5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(75, 48).addBox(0.0F, -1.5F, -2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 26).addBox(-0.5F, -1.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5061F, -2.3701F, 0.5334F, -0.2514F, 0.036F));

		PartDefinition cube_r306 = neck4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(114, 30).addBox(-0.5F, -2.3981F, 1.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 8).addBox(-0.5F, -2.3981F, 3.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 42).addBox(-1.0F, -2.0981F, 1.9713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.4937F, -3.9554F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4102F, -1.85F, 0.2663F, -0.0652F, 0.0726F));

		PartDefinition cube_r307 = neck3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(115, 18).addBox(0.0F, 0.9374F, -0.1567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 115).addBox(0.0F, 2.9374F, -0.1567F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -0.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r308 = neck3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(73, 97).addBox(-1.0F, 2.0773F, -0.9318F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8091F, -0.9294F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r309 = neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 115).addBox(0.0F, 1.0061F, -0.4687F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -1.5F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r310 = neck2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(37, 103).addBox(-1.0F, 0.9272F, -0.8396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -3.2F, -2.3F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck7 = neck2.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2128F, -1.7719F, 0.0093F, -0.1525F, 0.1049F));

		PartDefinition cube_r311 = neck7.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(9, 115).addBox(0.0F, 0.0061F, -0.5437F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 115).addBox(0.0F, 2.0061F, -0.5437F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4704F, -1.7174F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r312 = neck7.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(42, 103).addBox(-1.0F, 0.9272F, -0.8396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.9704F, -2.5174F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9642F, -1.9505F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r313 = neck8.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(12, 115).addBox(0.0F, -0.9939F, -0.5437F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 115).addBox(0.0F, 1.0061F, -0.5437F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4704F, -1.7174F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r314 = neck8.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(86, 99).addBox(-1.0F, -0.0728F, -0.8396F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.9704F, -2.5174F, 0.7941F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6942F, -2.961F, -0.2174F, -0.0189F, -0.0852F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(103, 76).addBox(-0.5F, -0.425F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.3512F, -2.3751F, 1.4792F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(57, 103).addBox(-0.5F, -1.95F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 56).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.7956F, -2.7331F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r317 = head.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(93, 69).addBox(-1.5F, -1.5329F, -1.013F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(53, 86).addBox(-2.0F, -1.0329F, -1.013F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1954F, 0.5375F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r318 = head.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(37, 94).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.0028F, -1.9849F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r319 = head.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(110, 93).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.5496F, -1.3677F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r320 = head.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(103, 10).addBox(-1.0F, -1.0065F, -1.0078F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.7574F, -0.8611F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r321 = head.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(42, 86).addBox(-2.0F, -1.0252F, -0.9788F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.3274F, 1.0081F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r322 = head.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(5, 88).addBox(-2.0F, -0.425F, -0.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6742F, 0.1296F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 16).addBox(-2.0F, 0.007F, -0.9905F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3944F, 1.2142F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(63, 92).addBox(-1.5F, -0.925F, -1.05F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 0.6981F, -0.3997F, -2.3955F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(93, 66).addBox(-1.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.2893F, 0.4665F, -1.5664F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(73, 69).addBox(-2.0F, -0.9169F, -1.0897F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.3027F, 0.6088F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(85, 58).addBox(-2.0F, 0.4731F, -0.6233F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -1.0027F, 1.3088F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(16, 88).addBox(-0.5F, -0.5529F, -0.1677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7015F, -6.6983F, -0.1394F, 0.2421F, -0.0336F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(84, 67).addBox(-0.5F, -0.5779F, -3.0677F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3105F, -3.8248F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(10, 35).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.1712F, -7.5409F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(100, 86).addBox(-0.5F, -0.1803F, -0.2075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.2298F, -9.4986F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(78, 100).addBox(-0.5F, -0.1803F, -0.1325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.4801F, -11.0789F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(110, 82).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, -4.2733F, -16.5542F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(110, 75).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, -4.5688F, -16.0319F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(110, 54).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, -4.6987F, -15.4462F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(110, 39).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, -4.3359F, -15.1617F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(110, 36).addBox(-0.5F, -0.2053F, -0.7325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.8554F, -14.6516F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 72).addBox(-0.5F, -0.2803F, -0.2325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.7868F, -14.6643F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.3553F, -3.6325F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -4.2806F, -11.0928F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(45, 58).addBox(-0.5F, -0.1803F, -3.6325F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, -4.3306F, -11.6928F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -9.7781F, -2.2971F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(112, 45).addBox(-0.3467F, -0.3814F, -0.2565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(45, 112).addBox(-0.3467F, -0.3814F, -0.7565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5336F, 10.3523F, 1.7963F, -0.5573F, 0.171F, -0.0261F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(112, 42).addBox(-0.3467F, -0.2347F, -0.2255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(40, 112).addBox(-0.3467F, -0.2347F, -0.7255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5336F, 10.3523F, 1.7963F, -0.854F, 0.171F, -0.0261F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(110, 102).addBox(-0.6849F, -0.3959F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.46F, 7.4605F, -1.0937F, 1.4689F, 0.8709F, -0.0542F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(110, 96).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 7.2078F, 1.872F, 1.1761F, 0.6081F, -0.2548F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(110, 99).addBox(-1.0F, -0.85F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8072F, 6.9686F, 1.1144F, 1.5344F, 0.497F, -0.1393F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(112, 62).addBox(-0.275F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6272F, 7.3921F, -2.0727F, 1.5046F, -0.1298F, 0.0325F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(112, 48).addBox(-0.4083F, -0.6913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.46F, 7.4605F, -1.0937F, 1.5029F, 0.262F, 0.0063F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(73, 84).addBox(-0.3487F, -0.3839F, -3.2534F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.5336F, 10.3523F, 1.7963F, -0.5311F, 0.171F, -0.0261F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(79, 53).addBox(-0.537F, -1.0769F, -5.5167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5336F, 10.3523F, 1.7963F, -0.2935F, 0.0838F, -0.0549F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(107, 26).addBox(1.0F, -0.2169F, -0.5897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 9.4754F, 2.906F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(64, 17).addBox(-0.8247F, -0.4459F, 0.7596F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8674F, 5.449F, -14.5689F, -0.1325F, -0.0131F, -0.2909F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(107, 68).addBox(-0.5F, -1.0375F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6555F, 7.4606F, -6.6158F, -0.3394F, 0.0485F, -0.0811F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(107, 86).addBox(-0.5F, -0.9943F, -0.6066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.6555F, 7.4606F, -6.6158F, -0.034F, 0.0485F, -0.0811F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(105, 102).addBox(-0.5F, -1.0375F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8305F, 6.9856F, -9.4908F, -0.4265F, 0.0413F, -0.085F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(105, 98).addBox(-0.5F, -0.9943F, -0.6066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.8305F, 6.9856F, -9.4908F, -0.1211F, 0.0413F, -0.085F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(114, 11).addBox(-0.2F, -0.075F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 5).addBox(-0.425F, -0.275F, 2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9826F, 6.7287F, -11.1897F, -0.1733F, 0.0368F, -0.087F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(103, 110).addBox(-0.45F, -0.45F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9826F, 6.7787F, -11.0647F, -0.1733F, 0.0368F, -0.087F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(109, 2).addBox(-0.375F, -0.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 2).addBox(-0.375F, -0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0635F, 6.4238F, -12.4166F, -0.2605F, 0.0368F, -0.087F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 109).addBox(-0.4F, -0.35F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0635F, 6.2738F, -13.0416F, -0.2605F, 0.0368F, -0.087F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(107, 64).addBox(-0.45F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.083F, 6.3544F, -13.7579F, -0.4787F, 0.0368F, -0.087F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(5, 43).addBox(-0.8997F, -0.1459F, -4.2404F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.523F, 6.3391F, -10.0673F, -0.2169F, 0.0368F, -0.087F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(64, 39).addBox(-0.8F, -0.775F, -3.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6883F, 6.3781F, -7.0008F, -0.1866F, -0.0536F, -0.5516F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(37, 64).addBox(-0.8F, -0.875F, -3.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4653F, 7.0277F, -7.1357F, -0.1938F, -0.0106F, -0.3287F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(56, 58).addBox(-0.5F, -0.625F, -3.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7358F, 7.3969F, -7.1911F, -0.1907F, 0.0364F, -0.0888F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(50, 112).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2487F, 7.9138F, -2.5783F, 0.6889F, 0.1682F, -0.2996F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(80, 37).addBox(-0.825F, -0.775F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1175F, 7.2386F, -3.6152F, -0.3068F, 0.0021F, -0.5574F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(73, 79).addBox(-0.825F, -0.775F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9277F, 7.7796F, -3.7921F, -0.3001F, 0.0648F, -0.3575F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(79, 62).addBox(-0.5F, -0.475F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2287F, 8.1018F, -3.8274F, -0.2742F, 0.1394F, -0.1052F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(88, 52).addBox(-0.8725F, -0.818F, -2.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3095F, 6.8637F, -5.1556F, -0.282F, -0.0003F, -0.543F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(88, 47).addBox(-0.8725F, -0.718F, -2.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1394F, 7.3135F, -5.2927F, -0.278F, 0.048F, -0.3752F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(88, 31).addBox(-1.0725F, 0.082F, -2.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9562F, 7.0996F, -5.2669F, -0.2549F, 0.122F, -0.1049F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(89, 36).addBox(-1.0825F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(86, 94).addBox(-0.4175F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.905F, 8.3081F, 0.4898F, -0.3102F, 0.257F, -0.1601F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(45, 6).addBox(-0.625F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.0F, 6.3078F, -6.7137F, -0.2012F, 0.0684F, -0.0139F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -9.7781F, -2.2971F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(112, 45).mirror().addBox(-0.6533F, -0.3814F, -0.2565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(45, 112).mirror().addBox(-0.6533F, -0.3814F, -0.7565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.5336F, 10.3523F, 1.7963F, -0.5573F, -0.171F, 0.0261F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(112, 42).mirror().addBox(-0.6533F, -0.2347F, -0.2255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(40, 112).mirror().addBox(-0.6533F, -0.2347F, -0.7255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5336F, 10.3523F, 1.7963F, -0.854F, -0.171F, 0.0261F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(110, 102).mirror().addBox(-0.3151F, -0.3959F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.46F, 7.4605F, -1.0937F, 1.4689F, -0.8709F, 0.0542F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(110, 96).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 7.2078F, 1.872F, 1.1761F, -0.6081F, 0.2548F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(110, 99).mirror().addBox(0.0F, -0.85F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8072F, 6.9686F, 1.1144F, 1.5344F, -0.497F, 0.1393F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(112, 62).mirror().addBox(-0.725F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6272F, 7.3921F, -2.0727F, 1.5046F, 0.1298F, -0.0325F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(112, 48).mirror().addBox(-0.5917F, -0.6913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.46F, 7.4605F, -1.0937F, 1.5029F, -0.262F, -0.0063F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(73, 84).mirror().addBox(-0.6513F, -0.3839F, -3.2534F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.5336F, 10.3523F, 1.7963F, -0.5311F, -0.171F, 0.0261F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(-0.463F, -1.0769F, -5.5167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5336F, 10.3523F, 1.7963F, -0.2935F, -0.0838F, 0.0549F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(107, 26).mirror().addBox(-2.0F, -0.2169F, -0.5897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.4754F, 2.906F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(64, 17).mirror().addBox(-0.1753F, -0.4459F, 0.7596F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8674F, 5.449F, -14.5689F, -0.1325F, 0.0131F, 0.2909F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(107, 68).mirror().addBox(-0.5F, -1.0375F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6555F, 7.4606F, -6.6158F, -0.3394F, -0.0485F, 0.0811F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(107, 86).mirror().addBox(-0.5F, -0.9943F, -0.6066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.6555F, 7.4606F, -6.6158F, -0.034F, -0.0485F, 0.0811F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(105, 102).mirror().addBox(-0.5F, -1.0375F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8305F, 6.9856F, -9.4908F, -0.4265F, -0.0413F, 0.085F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(105, 98).mirror().addBox(-0.5F, -0.9943F, -0.6066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.8305F, 6.9856F, -9.4908F, -0.1211F, -0.0413F, 0.085F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(114, 11).mirror().addBox(-0.8F, -0.075F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 5).mirror().addBox(-0.575F, -0.275F, 2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9826F, 6.7287F, -11.1897F, -0.1733F, -0.0368F, 0.087F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(103, 110).mirror().addBox(-0.55F, -0.45F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9826F, 6.7787F, -11.0647F, -0.1733F, -0.0368F, 0.087F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(109, 2).mirror().addBox(-0.625F, -0.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 2).mirror().addBox(-0.625F, -0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0635F, 6.4238F, -12.4166F, -0.2605F, -0.0368F, 0.087F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.6F, -0.35F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0635F, 6.2738F, -13.0416F, -0.2605F, -0.0368F, 0.087F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(107, 64).mirror().addBox(-0.55F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.083F, 6.3544F, -13.7579F, -0.4787F, -0.0368F, 0.087F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(-0.1003F, -0.1459F, -4.2404F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.523F, 6.3391F, -10.0673F, -0.2169F, -0.0368F, 0.087F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(-0.2F, -0.775F, -3.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6883F, 6.3781F, -7.0008F, -0.1866F, 0.0536F, 0.5516F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(37, 64).mirror().addBox(-0.2F, -0.875F, -3.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4653F, 7.0277F, -7.1357F, -0.1938F, 0.0106F, 0.3287F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-0.5F, -0.625F, -3.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7358F, 7.3969F, -7.1911F, -0.1907F, -0.0364F, 0.0888F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(50, 112).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2487F, 7.9138F, -2.5783F, 0.6889F, -0.1682F, 0.2996F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(80, 37).mirror().addBox(-0.175F, -0.775F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1175F, 7.2386F, -3.6152F, -0.3068F, -0.0021F, 0.5574F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(73, 79).mirror().addBox(-0.175F, -0.775F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9277F, 7.7796F, -3.7921F, -0.3001F, -0.0648F, 0.3575F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(79, 62).mirror().addBox(-0.5F, -0.475F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2287F, 8.1018F, -3.8274F, -0.2742F, -0.1394F, 0.1052F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(88, 52).mirror().addBox(-0.1275F, -0.818F, -2.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3095F, 6.8637F, -5.1556F, -0.282F, 0.0003F, 0.543F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(88, 47).mirror().addBox(-0.1275F, -0.718F, -2.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1394F, 7.3135F, -5.2927F, -0.278F, -0.048F, 0.3752F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(0.0725F, 0.082F, -2.5066F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9562F, 7.0996F, -5.2669F, -0.2549F, -0.122F, 0.1049F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-0.9175F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(86, 94).mirror().addBox(-0.5825F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.905F, 8.3081F, 0.4898F, -0.3102F, -0.257F, 0.1601F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(45, 6).mirror().addBox(-0.375F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.0F, 6.3078F, -6.7137F, -0.2012F, -0.0684F, 0.0139F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.1988F, -0.5257F, -0.104F, 0.0F, 0.0F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(93, 105).mirror().addBox(-0.5F, -0.1502F, -0.3985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.2016F, 0.0281F, -1.3484F, 1.1912F, -0.24F, 0.0F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(88, 105).mirror().addBox(-0.5F, -0.1488F, -0.5886F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2016F, 0.0281F, -1.3484F, -1.7279F, -0.24F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(26, 61).mirror().addBox(-0.0415F, -0.4761F, -12.5166F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.265F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.0209F, -0.0515F, 0.0218F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(77, 111).mirror().addBox(-0.0415F, 0.7106F, -12.9257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, -0.0751F, -0.0515F, 0.0218F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(108, 110).mirror().addBox(-0.0415F, 4.48F, -12.3517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false)
				.texOffs(110, 105).mirror().addBox(-0.0415F, 4.48F, -11.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, -0.3806F, -0.0515F, 0.0218F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(66, 29).mirror().addBox(-0.5F, -0.875F, 8.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 108).mirror().addBox(-0.5F, -0.675F, 7.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 112).mirror().addBox(-0.5F, -0.375F, 5.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(112, 22).mirror().addBox(-0.5F, -0.575F, 4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 112).mirror().addBox(-0.5F, -0.275F, 3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 108).mirror().addBox(-0.5F, -0.55F, 2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 112).mirror().addBox(-0.5F, -0.25F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 112).mirror().addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 112).mirror().addBox(-0.5F, -0.3F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 111).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1368F, -0.0018F, -16.0127F, 0.0558F, -0.0515F, 0.0218F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-0.0415F, 0.7573F, -12.5194F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, -0.0664F, -0.0515F, 0.0218F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(98, 102).mirror().addBox(0.0603F, -0.0062F, -2.0274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, -0.6458F, -0.0873F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(102, 90).mirror().addBox(0.0603F, -0.521F, -2.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.0087F, -0.0873F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(102, 2).mirror().addBox(-0.2066F, -1.0422F, 7.0119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 3.1382F, -0.083F, 0.0255F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(78, 104).mirror().addBox(-0.2066F, 6.8402F, -1.263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, -1.4433F, -0.083F, 0.0255F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(102, 6).mirror().addBox(0.0947F, -1.2168F, -7.0337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.1228F, -0.0301F, 0.0315F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(79, 48).mirror().addBox(0.0947F, -1.6493F, -5.2423F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.2101F, -0.0301F, 0.0315F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(34, 99).mirror().addBox(0.0947F, -1.5841F, -2.624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.1839F, -0.0301F, 0.0315F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(0.127F, -0.8813F, -5.5021F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.1484F, -0.0349F, 0.0F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(0.127F, -0.515F, -7.291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.0785F, -0.0349F, 0.0F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(109, 30).mirror().addBox(0.0114F, -0.6539F, -0.9571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2291F, 0.0687F, -3.7561F, 0.5233F, -0.1395F, 0.0055F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(12, 102).mirror().addBox(-0.1713F, 0.7385F, -0.1091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(98, 98).mirror().addBox(-0.1713F, -0.0615F, -0.1091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8855F, -1.2791F, -4.7108F, 0.0868F, -0.157F, 0.0055F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(91, 101).mirror().addBox(-0.1591F, -0.429F, -1.1883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1483F, -0.1364F, -3.0905F, 0.1309F, -0.2443F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(87, 10).mirror().addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8488F, -1.4292F, -2.8824F, -0.4522F, -0.244F, -0.013F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(93, 105).addBox(-0.5F, -0.1502F, -0.3985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.2017F, 0.0281F, -1.3484F, 1.1912F, 0.24F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(88, 105).addBox(-0.5F, -0.1488F, -0.5886F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2017F, 0.0281F, -1.3484F, -1.7279F, 0.24F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(26, 61).addBox(-0.9585F, -0.4761F, -12.5166F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.265F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.0209F, 0.0515F, -0.0218F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(77, 111).addBox(-0.9585F, 0.7106F, -12.9257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, -0.0751F, 0.0515F, -0.0218F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(108, 110).addBox(-0.9585F, 4.48F, -12.3517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F))
				.texOffs(110, 105).addBox(-0.9585F, 4.48F, -11.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, -0.3806F, 0.0515F, -0.0218F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(66, 29).addBox(-0.5F, -0.875F, 8.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 108).addBox(-0.5F, -0.675F, 7.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 112).addBox(-0.5F, -0.375F, 5.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(112, 22).addBox(-0.5F, -0.575F, 4.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 112).addBox(-0.5F, -0.275F, 3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 108).addBox(-0.5F, -0.55F, 2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 112).addBox(-0.5F, -0.25F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 112).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 112).addBox(-0.5F, -0.3F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 111).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8632F, -0.0018F, -16.0127F, 0.0558F, 0.0515F, -0.0218F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(15, 60).addBox(-0.9585F, 0.7573F, -12.5194F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, -0.0664F, 0.0515F, -0.0218F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(98, 102).addBox(-1.0603F, -0.0062F, -2.0274F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, -0.6458F, 0.0873F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(102, 90).addBox(-1.0603F, -0.521F, -2.7978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.0087F, 0.0873F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(102, 2).addBox(-0.7934F, -1.0422F, 7.0119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 3.1382F, 0.083F, -0.0255F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(78, 104).addBox(-0.7934F, 6.8402F, -1.263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, -1.4433F, 0.083F, -0.0255F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(102, 6).addBox(-1.0947F, -1.2168F, -7.0337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.1228F, 0.0301F, -0.0315F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(79, 48).addBox(-1.0947F, -1.6493F, -5.2423F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.2101F, 0.0301F, -0.0315F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(34, 99).addBox(-1.0947F, -1.5841F, -2.624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.1839F, 0.0301F, -0.0315F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(53, 40).addBox(-1.127F, -0.8813F, -5.5021F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.1484F, 0.0349F, 0.0F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(5, 99).addBox(-1.127F, -0.515F, -7.291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.0785F, 0.0349F, 0.0F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(109, 30).addBox(-1.0114F, -0.6539F, -0.9571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2291F, 0.0687F, -3.7561F, 0.5233F, 0.1395F, -0.0055F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(12, 102).addBox(-0.8287F, 0.7385F, -0.1091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(98, 98).addBox(-0.8287F, -0.0615F, -0.1091F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1145F, -1.2791F, -4.7108F, 0.0868F, 0.157F, -0.0055F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(91, 101).addBox(-0.8409F, -0.429F, -1.1883F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1483F, -0.1364F, -3.0905F, 0.1309F, 0.2443F, 0.0F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(87, 10).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1512F, -1.4292F, -2.8824F, -0.4522F, 0.244F, 0.013F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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