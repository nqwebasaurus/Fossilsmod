package fossils.fossils.client.blockentity.model.xenicibis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class XenicibisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart toe3;
	private final ModelPart toe;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart toe5;
	private final ModelPart toe6;
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
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck10;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public XenicibisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.toe3 = this.leftLeg3.getChild("toe3");
		this.toe = this.toe3.getChild("toe");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.toe5 = this.rightLeg3.getChild("toe5");
		this.toe6 = this.toe5.getChild("toe6");
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
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck10 = this.neck5.getChild("neck10");
		this.neck4 = this.neck10.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck7 = this.neck.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.head = this.neck9.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.7571F, 5.2609F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 37).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1875F, -4.2359F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 104).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.6569F, -3.3529F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(79, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.5F, -1.3591F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 79).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.4402F, 0.337F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(79, 5).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1019F, 1.8233F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 77).addBox(-0.5F, -0.2278F, -1.9675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.772F, 2.4647F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 62).addBox(-0.5F, -0.0478F, -0.0075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.5436F, 3.6286F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(79, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.5079F, 4.144F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(62, 28).addBox(-0.5F, -0.625F, -2.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5812F, 3.1705F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 75).mirror().addBox(-5.1947F, -1.8203F, -0.4144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -3.0408F, -0.0279F, -0.2217F, -1.4216F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 21).mirror().addBox(-8.6025F, -1.8203F, 1.5451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -3.0408F, -0.0333F, -0.6143F, -1.4085F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(103, 49).mirror().addBox(-2.8108F, -0.4791F, -0.4144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -3.0408F, -0.1361F, -0.1778F, -0.889F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 12).mirror().addBox(-0.94F, 0.0138F, -0.3972F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.015F, -3.0408F, -0.1714F, -0.1006F, -0.3444F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(111, 12).addBox(-0.06F, 0.0138F, -0.3972F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -3.0408F, -0.1714F, 0.1006F, 0.3444F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(103, 49).addBox(0.8108F, -0.4791F, -0.4144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -3.0408F, -0.1361F, 0.1778F, 0.889F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 21).addBox(4.6024F, -1.8203F, 1.5451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -3.0408F, -0.0333F, 0.6143F, 1.4085F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 75).addBox(2.1947F, -1.8203F, -0.4144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.015F, -3.0408F, -0.0279F, 0.2217F, 1.4216F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -1.9801F, -0.6585F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, 0.774F, -4.5424F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 16).addBox(-5.1F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4818F, 3.2218F, 7.8122F, -0.9238F, -0.9085F, 1.0715F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 74).addBox(-1.4131F, -1.0435F, 1.4437F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.285F, -0.7929F, -0.2092F, -0.6042F, -0.9292F, 1.0214F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(100, 70).addBox(-0.3294F, -1.0435F, 0.9932F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.285F, -0.7929F, -0.2092F, -1.7342F, -1.219F, 2.261F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(100, 61).addBox(-0.0155F, -1.0435F, 0.0462F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.285F, -0.7929F, -0.2092F, -2.3499F, -1.0726F, 2.9308F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 53).addBox(-2.0F, 0.0F, -0.45F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4474F, -0.8823F, 2.0044F, -0.9434F, -1.0897F, 1.5365F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(34, 28).addBox(-1.2175F, -0.528F, -0.3449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1197F, 0.226F, 2.6581F, -1.1467F, -0.9196F, 1.7655F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(47, 18).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1661F, 1.8501F, 8.6471F, -1.2889F, 0.6309F, -0.4822F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(20, 40).addBox(-1.8265F, -0.4689F, -0.0189F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -0.9646F, 0.1371F, 0.1874F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(110, 0).addBox(0.309F, -1.3205F, 2.4654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -1.2937F, 0.0647F, 0.1921F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(71, 81).addBox(0.309F, 0.4553F, 1.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9657F, 4.6825F, 8.8698F, -0.8138F, 0.0647F, 0.1921F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(89, 53).addBox(-0.55F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6342F, 1.6603F, 4.3274F, -0.7101F, 0.3286F, -0.0508F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 47).addBox(-0.55F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6342F, 1.6603F, 4.3274F, -0.9719F, 0.3286F, -0.0508F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 14).addBox(-0.525F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2507F, 3.3685F, 6.0658F, -0.8137F, 0.3136F, 0.0405F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(70, 5).addBox(-0.443F, -0.5468F, 1.3437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.452F, 8.3732F, 5.576F, -0.6908F, -0.1896F, 0.4363F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(89, 34).addBox(-0.8F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0977F, 10.6682F, 8.8123F, -0.9746F, -0.3767F, 0.6997F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(89, 30).addBox(-0.7912F, -0.8533F, -0.2142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.452F, 8.3732F, 5.576F, -0.895F, 0.0298F, 0.3614F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(19, 89).addBox(-0.7687F, -0.6143F, -0.2573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.652F, 6.9732F, 4.876F, -0.9591F, 0.1319F, 0.2237F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(61, 88).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9528F, 5.7403F, 3.9861F, -1.0298F, 0.2881F, -0.1219F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(88, 49).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6756F, 4.1919F, 3.6935F, -1.3789F, 0.2881F, -0.1219F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(62, 43).addBox(-1.5905F, -0.5427F, -0.4116F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6084F, 1.7415F, 3.9856F, -1.728F, 0.2881F, -0.1219F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 108).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2496F, 6.9998F, 8.1879F, -0.4007F, 0.0467F, 0.147F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(27, 51).addBox(-0.5F, -1.8F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2496F, 6.9998F, 8.1879F, -1.0988F, 0.0467F, 0.147F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(106, 107).addBox(-0.5F, 0.6F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3093F, 6.3431F, 7.3944F, -2.1897F, 0.0467F, 0.147F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(75, 101).addBox(-0.5F, -0.4F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3093F, 6.3431F, 7.3944F, -1.7533F, 0.0467F, 0.147F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(70, 101).addBox(-0.7569F, -1.2279F, -2.2484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2206F, 9.9012F, 9.266F, -1.3587F, 0.0831F, 0.1301F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(81, 50).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1468F, 8.1474F, 8.7518F, -2.1441F, 0.0831F, 0.1301F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(63, 72).addBox(-0.5F, -0.125F, -1.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2098F, 7.6032F, 8.1332F, -1.1399F, 0.0791F, 0.1378F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(34, 88).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9627F, 4.7232F, 5.1085F, -1.5028F, 0.1421F, 0.0125F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(26, 81).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0554F, 5.5328F, 5.8271F, -1.241F, 0.1421F, 0.0125F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(46, 0).addBox(-0.464F, -4.029F, 7.2564F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, 0.072F, 0.2392F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(34, 21).addBox(-0.9328F, -1.9013F, 2.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, 0.3396F, 0.5181F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(62, 34).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.8629F, 7.4653F, -0.515F, -0.3613F, -0.5584F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(21, 100).addBox(-1.0F, -0.0278F, 0.9325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 108).addBox(-1.0F, -0.0278F, -0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.803F, 6.3696F, -1.0381F, -0.5592F, -0.3031F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(104, 81).addBox(-1.0F, 0.9722F, -0.0675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.803F, 6.3696F, -0.7326F, -0.5592F, -0.3031F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(9, 71).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.8759F, 6.3657F, -0.6468F, -0.373F, -0.4496F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(34, 73).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2141F, 4.8794F, -0.4827F, -0.2928F, -0.5034F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 57).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.274F, 3.1833F, -1.9842F, -0.045F, -0.6094F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(25, 71).addBox(-1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(5, 108).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.274F, 3.1833F, -1.6352F, -0.045F, -0.6094F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.774F, -4.5424F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 16).mirror().addBox(0.1F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4818F, 3.2218F, 7.8122F, -0.9238F, 0.9085F, -1.0715F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5869F, -1.0435F, 1.4437F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.285F, -0.7929F, -0.2092F, -0.6042F, 0.9292F, -1.0214F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-1.6706F, -1.0435F, 0.9932F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.285F, -0.7929F, -0.2092F, -1.7342F, 1.219F, -2.261F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-1.9845F, -1.0435F, 0.0462F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.285F, -0.7929F, -0.2092F, -2.3499F, 1.0726F, -2.9308F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(36, 53).mirror().addBox(0.0F, 0.0F, -0.45F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4474F, -0.8823F, 2.0044F, -0.9434F, 1.0897F, -1.5365F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-2.7825F, -0.528F, -0.3449F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1197F, 0.226F, 2.6581F, -1.1467F, 0.9196F, -1.7655F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1661F, 1.8501F, 8.6471F, -1.2889F, -0.6309F, 0.4822F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(20, 40).mirror().addBox(-1.1735F, -0.4689F, -0.0189F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -0.9646F, -0.1371F, -0.1874F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-1.309F, -1.3205F, 2.4654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -1.2937F, -0.0647F, -0.1921F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 81).mirror().addBox(-1.309F, 0.4553F, 1.6755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9657F, 4.6825F, 8.8698F, -0.8138F, -0.0647F, -0.1921F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-0.45F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6342F, 1.6603F, 4.3274F, -0.7101F, -0.3286F, 0.0508F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.45F, -0.2F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6342F, 1.6603F, 4.3274F, -0.9719F, -0.3286F, 0.0508F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-0.475F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2507F, 3.3685F, 6.0658F, -0.8137F, -0.3136F, -0.0405F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(-0.557F, -0.5468F, 1.3437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.452F, 8.3732F, 5.576F, -0.6908F, 0.1896F, -0.4363F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-0.2F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0977F, 10.6682F, 8.8123F, -0.9746F, 0.3767F, -0.6997F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(89, 30).mirror().addBox(-0.2088F, -0.8533F, -0.2142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.452F, 8.3732F, 5.576F, -0.895F, -0.0298F, -0.3614F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-0.2313F, -0.6143F, -0.2573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.652F, 6.9732F, 4.876F, -0.9591F, -0.1319F, -0.2237F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(61, 88).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9528F, 5.7403F, 3.9861F, -1.0298F, -0.2881F, 0.1219F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(88, 49).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6756F, 4.1919F, 3.6935F, -1.3789F, -0.2881F, 0.1219F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(62, 43).mirror().addBox(0.5905F, -0.5427F, -0.4116F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6084F, 1.7415F, 3.9856F, -1.728F, -0.2881F, 0.1219F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(26, 108).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2496F, 6.9998F, 8.1879F, -0.4007F, -0.0467F, -0.147F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-0.5F, -1.8F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2496F, 6.9998F, 8.1879F, -1.0988F, -0.0467F, -0.147F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(-0.5F, 0.6F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3093F, 6.3431F, 7.3944F, -2.1897F, -0.0467F, -0.147F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(75, 101).mirror().addBox(-0.5F, -0.4F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3093F, 6.3431F, 7.3944F, -1.7533F, -0.0467F, -0.147F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(70, 101).mirror().addBox(-0.2431F, -1.2279F, -2.2484F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2206F, 9.9012F, 9.266F, -1.3587F, -0.0831F, -0.1301F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(81, 50).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1468F, 8.1474F, 8.7518F, -2.1441F, -0.0831F, -0.1301F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(63, 72).mirror().addBox(-0.5F, -0.125F, -1.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2098F, 7.6032F, 8.1332F, -1.1399F, -0.0791F, -0.1378F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(34, 88).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9627F, 4.7232F, 5.1085F, -1.5028F, -0.1421F, -0.0125F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(26, 81).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0554F, 5.5328F, 5.8271F, -1.241F, -0.1421F, -0.0125F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-3.536F, -4.029F, 7.2564F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7895F, -0.072F, -0.2392F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(34, 21).mirror().addBox(-0.0672F, -1.9013F, 2.3415F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5288F, -0.3396F, -0.5181F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(62, 34).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8629F, 7.4653F, -0.515F, 0.3613F, 0.5584F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(21, 100).mirror().addBox(0.0F, -0.0278F, 0.9325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 108).mirror().addBox(0.0F, -0.0278F, -0.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.803F, 6.3696F, -1.0381F, 0.5592F, 0.3031F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(104, 81).mirror().addBox(0.0F, 0.9722F, -0.0675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.803F, 6.3696F, -0.7326F, 0.5592F, 0.3031F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(9, 71).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8759F, 6.3657F, -0.6468F, 0.373F, 0.4496F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(34, 73).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2141F, 4.8794F, -0.4827F, 0.2928F, 0.5034F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.274F, 3.1833F, -1.9842F, 0.045F, 0.6094F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(25, 71).mirror().addBox(0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(5, 108).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.274F, 3.1833F, -1.6352F, 0.045F, 0.6094F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0377F, 3.0237F, 0.1598F, -1.6139F, -0.2854F, -0.0975F));

		PartDefinition cube_r95 = leftLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 77).addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(26, 76).addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.1684F, 0.8304F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(50, 77).addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.1684F, 0.8304F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(70, 10).addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 10.1684F, 0.8304F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(47, 53).addBox(-4.5F, 0.0F, -1.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.5F, 3.3215F, 1.188F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(11, 47).addBox(-1.0F, -4.025F, -0.4F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.2207F, -0.0127F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(72, 72).addBox(-4.5F, -3.5F, -1.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5F, 3.3738F, 1.1857F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 43).addBox(-1.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5F, 2.8164F, -0.1186F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(51, 38).addBox(-4.5F, 0.275F, -1.85F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.5F, 1.0342F, -0.8779F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(100, 5).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.5F, -0.5507F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(94, 18).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.5F, -1.4377F, -0.5898F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(40, 18).addBox(-4.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -0.5507F, -1.0515F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 89).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, -1.0988F, 1.259F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(78, 81).addBox(-1.5F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.2263F, 0.6857F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.586F, 11.2034F, 1.7574F, 2.0271F, -0.1317F, 0.1015F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(104, 85).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2F, 0.0623F, -1.5565F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(40, 98).addBox(0.25F, -0.9F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.95F, 0.8629F, -0.9073F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(40, 98).addBox(0.25F, -1.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 0.8629F, -0.9073F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(82, 35).addBox(-1.75F, -1.5F, 0.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.05F, 0.8629F, -0.9073F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(73, 37).addBox(-1.5F, -0.9F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, 17.2535F, -2.8351F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(40, 80).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 32).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 17.2535F, -2.8351F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(20, 45).addBox(-2.5F, -8.7751F, -0.9915F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8F, 8.0497F, -0.9699F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(33, 40).addBox(-2.5F, -8.6751F, -0.3665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8F, 16.7026F, -2.3794F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(101, 77).addBox(-0.6047F, -0.8761F, -0.102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7309F, 0.2869F, -0.5919F, -0.3576F, 0.0073F, 0.0344F));

		PartDefinition cube_r117 = leftLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 53).addBox(-0.6047F, 1.0621F, -0.3169F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7309F, 0.2869F, -0.5919F, -0.1133F, 0.0073F, 0.0344F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 18.7253F, -3.5995F, -0.5742F, -0.147F, 0.0945F));

		PartDefinition cube_r118 = leftLeg3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 54).addBox(-1.0F, -0.9F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 0.786F, 0.6547F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 82).addBox(-5.5F, -5.1F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.6554F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(13, 35).addBox(-1.0F, 0.1F, -0.9F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.5439F, 0.3491F, -0.2967F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.296F, 9.1138F, -2.6067F, 0.2182F, -0.3927F, 0.0F));

		PartDefinition cube_r121 = toe3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(80, 101).addBox(-1.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition toe = toe3.addOrReplaceChild("toe", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5679F, 1.4768F, 0.5897F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r122 = toe.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 101).addBox(-0.4F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.407F, 3.9622F, 2.6311F, 0.8132F, -0.0787F, 0.0152F));

		PartDefinition cube_r123 = toe.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(15, 81).addBox(-1.5F, 0.3082F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4F, 0.1F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(23, 10).addBox(-4.5F, -1.0F, -3.85F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8892F, -2.5418F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -0.4662F, -7.8479F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.541F, -3.6525F, -0.0396F, -0.0045F, 0.0003F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0377F, 3.0237F, 0.1598F, -1.8757F, 0.2854F, 0.0975F));

		PartDefinition cube_r124 = rightLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 77).mirror().addBox(0.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 76).mirror().addBox(-1.5F, -0.667F, -1.0746F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 10.1684F, 0.8304F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 77).mirror().addBox(-0.5F, -0.92F, -0.8685F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 10.1684F, 0.8304F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(-1.0F, -0.7226F, -1.227F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 10.1684F, 0.8304F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(47, 53).mirror().addBox(2.5F, 0.0F, -1.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.3215F, 1.188F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(11, 47).mirror().addBox(-1.0F, -4.025F, -0.4F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.2207F, -0.0127F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(2.5F, -3.5F, -1.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 3.3738F, 1.1857F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(51, 43).mirror().addBox(-0.5F, -0.3F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8164F, -0.1186F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(51, 38).mirror().addBox(2.5F, 0.275F, -1.85F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 1.0342F, -0.8779F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(100, 5).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -0.5507F, -1.0515F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 18).mirror().addBox(2.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -1.4377F, -0.5898F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(40, 18).mirror().addBox(2.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -0.5507F, -1.0515F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 89).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0988F, 1.259F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightLeg1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(78, 81).mirror().addBox(-0.5F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.2263F, 0.6857F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.586F, 11.2034F, 1.7574F, 2.6852F, 0.0534F, -0.0627F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(104, 85).mirror().addBox(-0.5F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0623F, -1.5565F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(-1.25F, -0.9F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.95F, 0.8629F, -0.9073F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(-1.25F, -1.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.95F, 0.8629F, -0.9073F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(82, 35).mirror().addBox(-0.25F, -1.5F, 0.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 0.8629F, -0.9073F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(73, 37).mirror().addBox(-1.5F, -0.9F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7F, 17.2535F, -2.8351F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-1.5F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 32).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7F, 17.2535F, -2.8351F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(20, 45).mirror().addBox(0.5F, -8.7751F, -0.9915F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 8.0497F, -0.9699F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(33, 40).mirror().addBox(0.5F, -8.6751F, -0.3665F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 16.7026F, -2.3794F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightLeg2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(101, 77).mirror().addBox(-0.3953F, -0.8761F, -0.102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7309F, 0.2869F, -0.5919F, -0.3576F, -0.0073F, -0.0344F));

		PartDefinition cube_r146 = rightLeg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(54, 53).mirror().addBox(-0.3953F, 1.0621F, -0.3169F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7309F, 0.2869F, -0.5919F, -0.1133F, -0.0073F, -0.0344F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 18.7253F, -3.5995F, -2.0057F, -0.0368F, -0.0791F));

		PartDefinition cube_r147 = rightLeg3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-1.0F, -0.9F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.786F, 0.6547F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightLeg3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(3.5F, -5.1F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 4.6554F, -0.7739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightLeg3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(13, 35).mirror().addBox(-1.0F, 0.1F, -0.9F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5439F, 0.3491F, -0.2967F, 0.0F, 0.0F));

		PartDefinition toe5 = rightLeg3.addOrReplaceChild("toe5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.296F, 9.1138F, -2.6067F, -0.2182F, 0.3927F, 0.0F));

		PartDefinition cube_r150 = toe5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(80, 101).mirror().addBox(0.5F, -2.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition toe6 = toe5.addOrReplaceChild("toe6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5679F, 1.4768F, 0.5897F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r151 = toe6.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(60, 101).mirror().addBox(-0.6F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.407F, 3.9622F, 2.6311F, 0.8132F, 0.0787F, -0.0152F));

		PartDefinition cube_r152 = toe6.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(0.5F, 0.3082F, -0.3881F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.4F, 0.1F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(23, 10).mirror().addBox(-3.5F, -1.0F, -3.85F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.6392F, -2.5418F, 2.0857F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.541F, -3.6525F, -0.0396F, 0.0045F, -0.0003F));

		PartDefinition cube_r153 = rightToes.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-7.0F, -1.0F, -7.25F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(3.5F, 0.6338F, -0.3979F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(62, 48).addBox(-0.5F, -1.1056F, 0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(21, 73).addBox(0.0F, -1.7056F, 0.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 14).addBox(0.0F, -1.5056F, 2.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4798F, 4.347F, -0.7679F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(56, 82).addBox(-0.5F, -0.394F, 0.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(68, 90).addBox(0.0F, -0.594F, 1.0598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6631F, 2.771F, 0.4014F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1354F, 2.1702F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(26, 101).addBox(-0.5F, -1.9F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3415F, -0.1155F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail4 = tail2.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1354F, 4.8702F));

		PartDefinition cube_r155 = tail4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(21, 93).addBox(-0.5F, 0.1103F, -1.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.1415F, -0.2155F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tail5 = tail2.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9231F, 3.2546F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(96, 58).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(95, 74).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.5F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 111).addBox(0.0F, -1.4822F, -0.5043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6983F, -0.5421F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(109, 110).addBox(0.0F, -1.3822F, 0.0957F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9293F, -2.718F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(21, 23).addBox(0.0F, -0.7301F, -3.018F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(3, 111).mirror().addBox(-0.94F, 0.0137F, -0.3972F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.5408F, -0.0235F, -0.0467F, -0.3553F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-2.8108F, -0.4791F, -0.4144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.5408F, -0.0372F, -0.0552F, -0.9005F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-5.1947F, -1.8204F, -0.4144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.5408F, -0.0046F, -0.0664F, -1.425F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(110, 101).mirror().addBox(-0.7412F, -1.8204F, 4.7965F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.5408F, -0.0422F, -1.4625F, -1.3833F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-9.6025F, -1.8204F, 1.5451F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.815F, -0.5408F, -0.0051F, -0.4591F, -1.423F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(106, 77).mirror().addBox(0.0F, -0.2F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 105).mirror().addBox(0.0F, -0.2F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.602F, -3.0332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(110, 67).mirror().addBox(0.8F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 14).mirror().addBox(-1.2F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.95F, 2.5963F, -3.7814F, -0.0145F, -1.0612F, -1.2643F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(111, 18).mirror().addBox(-0.93F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 68).mirror().addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.95F, 1.8652F, -5.3145F, 0.0143F, -0.9674F, -1.2887F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(106, 24).mirror().addBox(0.0F, -0.2F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 105).mirror().addBox(0.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.202F, -3.9333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(110, 34).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.715F, -7.9408F, 0.0513F, -0.0259F, -0.2096F));

		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(38, 103).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.715F, -7.9408F, 0.016F, 0.0014F, -0.7535F));

		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-9.2026F, -1.8495F, -0.5143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.715F, -7.9408F, 0.0132F, 0.0092F, -1.277F));

		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(103, 35).mirror().addBox(-2.5707F, -1.8249F, 4.6809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.715F, -7.9408F, 0.028F, -1.0815F, -1.3019F));

		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(99, 91).mirror().addBox(-0.197F, 0.0F, -1.3F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.788F, 4.1615F, -2.0125F, 0.019F, -1.4108F, -1.444F));

		PartDefinition cube_r174 = body.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-5.1962F, -1.8207F, -0.5144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.615F, -2.3408F, 0.003F, -0.0146F, -1.4253F));

		PartDefinition cube_r175 = body.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(103, 59).mirror().addBox(-2.8122F, -0.4786F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.615F, -2.3408F, -0.0047F, -0.0141F, -0.9016F));

		PartDefinition cube_r176 = body.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(-0.9428F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.615F, -2.3408F, 0.0256F, -0.0284F, -0.3571F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(34, 38).mirror().addBox(-9.2026F, -1.8495F, -0.5143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.0081F, -0.0075F, -1.277F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(73, 41).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.0033F, -0.0106F, -0.7534F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.215F, -6.0408F, 0.0343F, -0.0295F, -0.2091F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.515F, -4.2408F, -0.017F, -0.0403F, -0.2073F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.515F, -4.2408F, -0.035F, -0.0464F, -0.7523F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-9.2026F, -1.8494F, -0.5143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.515F, -4.2408F, -0.0071F, -0.0576F, -1.2765F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(26, 105).mirror().addBox(0.0F, -0.6F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.102F, -2.1332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6619F, 3.2995F, -1.9323F, 0.0033F, -0.4073F, -1.4265F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(50, 8).addBox(4.6024F, -1.8204F, 1.5451F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.5408F, -0.0051F, 0.4591F, 1.423F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(110, 101).addBox(-0.2588F, -1.8204F, 4.7965F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.5408F, -0.0422F, 1.4625F, 1.3833F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(86, 8).addBox(2.1947F, -1.8204F, -0.4144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.5408F, -0.0046F, 0.0664F, 1.425F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(45, 103).addBox(0.8108F, -0.4791F, -0.4144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.5408F, -0.0372F, 0.0552F, 0.9005F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(3, 111).addBox(-0.06F, 0.0137F, -0.3972F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.815F, -0.5408F, -0.0235F, 0.0467F, 0.3553F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(99, 91).addBox(-1.803F, 0.0F, -1.3F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.788F, 4.1615F, -2.0125F, 0.019F, 1.4108F, 1.444F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(82, 39).addBox(2.1962F, -1.8207F, -0.5144F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.615F, -2.3408F, 0.003F, 0.0146F, 1.4253F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(103, 59).addBox(0.8122F, -0.4786F, -0.5144F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.615F, -2.3408F, -0.0047F, 0.0141F, 0.9016F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(55, 94).addBox(-0.0572F, 0.0112F, -0.4971F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.615F, -2.3408F, 0.0256F, 0.0284F, 0.3571F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(106, 24).addBox(-1.0F, -0.2F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 105).addBox(-1.0F, -0.2F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.202F, -3.9333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(103, 35).addBox(0.5707F, -1.8249F, 4.6809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.715F, -7.9408F, 0.028F, 1.0815F, 1.3019F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(40, 16).addBox(2.2026F, -1.8495F, -0.5143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.715F, -7.9408F, 0.0132F, -0.0092F, 1.277F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(38, 103).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.715F, -7.9408F, 0.016F, -0.0014F, 0.7535F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(110, 34).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.715F, -7.9408F, 0.0513F, 0.0259F, 0.2096F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(111, 18).addBox(-0.07F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 68).addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.95F, 1.8652F, -5.3145F, 0.0143F, 0.9674F, 1.2887F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(34, 38).addBox(2.2026F, -1.8495F, -0.5143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.0081F, 0.0075F, 1.277F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(73, 41).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.0033F, 0.0106F, 0.7534F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 85).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.215F, -6.0408F, 0.0343F, 0.0295F, 0.2091F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(20, 83).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.515F, -4.2408F, -0.017F, 0.0403F, 0.2073F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(63, 8).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.515F, -4.2408F, -0.035F, 0.0464F, 0.7523F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(110, 67).addBox(-1.8F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 14).addBox(-0.8F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.95F, 2.5963F, -3.7814F, -0.0145F, 1.0612F, 1.2643F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(33, 8).addBox(2.2026F, -1.8494F, -0.5143F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.515F, -4.2408F, -0.0071F, 0.0576F, 1.2765F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(106, 77).addBox(-1.0F, -0.2F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 105).addBox(-1.0F, -0.2F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.602F, -3.0332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(26, 105).addBox(-1.0F, -0.6F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.102F, -2.1332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(70, 53).addBox(0.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6619F, 3.2995F, -1.9323F, 0.0033F, 0.4073F, 1.4265F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -0.0506F, -5.0332F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1566F, -8.5916F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(110, 57).addBox(0.0F, -1.4468F, -0.4375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0721F, -1.3209F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(110, 47).addBox(0.0F, -1.5924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.8F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(15, 106).mirror().addBox(-0.3F, -3.9F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.604F, 8.6855F, 0.4703F, -0.6398F, 0.5685F, -1.6188F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-0.5F, -4.9F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5717F, 9.359F, 0.9009F, -0.8667F, 0.5685F, -1.6188F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(18, 101).mirror().addBox(-0.5F, -5.7F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 10.1549F, 1.4447F, -0.961F, 0.5117F, -1.6662F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(71, 105).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 105).mirror().addBox(0.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -1.1345F, 0.7932F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-6.4102F, -1.789F, -0.4287F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.5408F, 0.042F, 0.2439F, -1.3935F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(-2.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.5408F, 0.1596F, 0.1899F, -0.8598F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(106, 27).mirror().addBox(-1.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.915F, -1.5408F, 0.2707F, 0.0625F, -0.3257F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.5F, -5.7F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 10.2857F, 2.0635F, -1.1279F, 0.3553F, -1.7516F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(68, 82).mirror().addBox(0.2438F, -6.7506F, -0.3396F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.766F, 11.3434F, 2.5187F, -1.0861F, 0.2051F, -1.6535F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(12, 78).mirror().addBox(-0.2728F, -8.2734F, -0.143F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.766F, 11.3434F, 2.5187F, -1.165F, 0.185F, -1.6209F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(71, 105).addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 105).addBox(-1.3F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -1.1345F, 0.7932F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(70, 55).addBox(2.4102F, -1.789F, -0.4287F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.5408F, 0.042F, -0.2439F, 1.3935F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(102, 47).addBox(0.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.5408F, 0.1596F, -0.1899F, 0.8598F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(106, 27).addBox(0.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.915F, -1.5408F, 0.2707F, -0.0625F, 0.3257F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(15, 106).addBox(-0.7F, -3.9F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.604F, 8.6855F, 0.4703F, -0.6398F, -0.5685F, 1.6188F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(101, 37).addBox(-0.5F, -4.9F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5717F, 9.359F, 0.9009F, -0.8667F, -0.5685F, 1.6188F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(18, 101).addBox(-0.5F, -5.7F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, 10.1549F, 1.4447F, -0.961F, -0.5117F, 1.6662F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 99).addBox(-0.5F, -5.7F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, 10.2857F, 2.0635F, -1.1279F, -0.3553F, 1.7516F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(68, 82).addBox(-1.2438F, -6.7506F, -0.3396F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.766F, 11.3434F, 2.5187F, -1.0861F, -0.2051F, 1.6535F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(12, 78).addBox(-0.7272F, -8.2734F, -0.143F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.766F, 11.3434F, 2.5187F, -1.165F, -0.185F, 1.6209F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(9, 58).addBox(-2.366F, -1.9446F, 0.0276F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.866F, 13.1434F, 0.3187F, 0.9495F, 0.0F, 0.0F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 46).addBox(-0.5F, 0.125F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 9.6391F, -2.0632F, 1.3378F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.4976F, -2.576F, 1.0324F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(75, 57).addBox(-2.366F, -4.7597F, 0.4323F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.866F, 12.0434F, -1.1813F, 0.2121F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 58).addBox(-2.366F, -2.0834F, 0.0065F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.866F, 12.0434F, -1.1813F, 0.7357F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(103, 51).addBox(-0.5F, -1.0F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 12.0783F, 3.416F, 1.3814F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(5, 78).addBox(-2.366F, 1.9241F, -0.1618F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.866F, 13.2434F, 0.4187F, 1.5123F, 0.0F, 0.0F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(18, 56).addBox(-2.366F, -0.0789F, 0.0576F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.866F, 13.2434F, 0.4187F, 1.3989F, 0.0F, 0.0F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(82, 58).addBox(-2.366F, 3.9332F, -0.3293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.866F, 13.2184F, 0.3687F, 1.556F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(46, 105).addBox(-2.366F, 4.8642F, -0.7367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.866F, 13.2184F, 0.3687F, 1.6389F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(52, 73).addBox(-1.5F, -0.925F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8577F, 0.4777F, 0.0681F, 0.0F, 0.0F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(21, 32).addBox(-1.0F, -1.3F, -3.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5234F, 0.5766F, -2.0487F, -2.4349F, 0.1018F, 1.6773F));

		PartDefinition cube_r245 = leftArm1.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(54, 63).addBox(-0.8F, 0.0F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.1081F, -0.0832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftArm1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(107, 4).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.1081F, 12.3531F, -7.6151F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftArm1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(101, 24).addBox(-0.5F, -1.55F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.1081F, 11.7208F, -6.4529F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftArm1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, -2.0F, 0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.1081F, 9.6856F, -6.0191F, -0.8247F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftArm1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(14, 87).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 10.3387F, -5.6743F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftArm1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 99).addBox(0.0F, 3.0546F, -0.2353F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(-0.6081F, 7.4786F, -4.0688F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftArm1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 78).addBox(0.0F, -0.0905F, -0.5205F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.6081F, 3.3246F, -0.5598F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftArm1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(98, 65).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1081F, 2.5128F, 0.1794F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftArm1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(77, 67).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1081F, 0.9916F, 0.5522F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftArm1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(50, 98).addBox(-0.5F, -2.9F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1081F, 9.7952F, -4.2177F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftArm1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(45, 98).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1081F, 2.1467F, -0.3734F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5405F, 13.1405F, -7.1482F, 2.759F, -0.0725F, -2.8694F));

		PartDefinition cube_r256 = leftArm2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(63, 63).addBox(-0.6208F, -3.3025F, 0.2053F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0708F, 6.3788F, -0.9407F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftArm2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(27, 85).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.05F, -0.1563F, 0.7999F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftArm2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(27, 45).addBox(-0.5F, -3.8F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 3.4272F, 0.4548F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftArm2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(33, 99).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.05F, 1.8358F, -0.08F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftArm2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(5, 99).addBox(-0.5F, -2.475F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.05F, 1.7375F, -0.3897F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r261 = leftArm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(107, 41).addBox(-0.5F, 4.2156F, -0.2397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(21, 76).addBox(-0.5F, -0.2844F, -0.2397F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0781F, 5.116F, -1.4291F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftArm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(16, 73).addBox(-0.5322F, -2.5041F, -0.9946F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 1.95F, -0.1F, -0.1777F, 0.007F, -0.0146F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1077F, 10.1925F, -1.4556F, 1.2506F, -0.0844F, 0.2519F));

		PartDefinition cube_r263 = leftHand.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(23, 109).addBox(0.0F, -0.4F, -1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1052F, 1.6679F, -1.035F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftHand.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(18, 62).addBox(-1.0F, -0.65F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.6052F, 0.9179F, -1.035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftHand.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(100, 0).addBox(-1.0F, -0.2156F, -0.0494F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6052F, 4.7512F, -5.5685F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftHand.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(99, 86).addBox(-1.0F, -0.3156F, -0.0494F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6052F, 3.0946F, -3.6961F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftHand.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(55, 100).addBox(-1.0F, -0.5156F, -0.0494F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6052F, 1.8929F, -1.735F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftHand.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 101).addBox(-1.0F, -0.5261F, 0.1068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.6052F, 1.1929F, -2.135F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftHand.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(107, 73).addBox(-0.2F, 1.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 8).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1052F, 7.4916F, -7.955F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftHand.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(107, 70).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1052F, 6.9148F, -7.7896F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftHand.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(107, 61).addBox(-0.5F, -0.35F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(107, 44).addBox(-0.5F, -0.35F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1052F, 6.8253F, -7.1532F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftHand.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(5, 104).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1052F, 6.2563F, -6.9628F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftHand.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(103, 93).addBox(-0.525F, -0.1862F, -0.1194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1302F, 5.3085F, -7.5737F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftHand.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(99, 81).addBox(-0.525F, -1.1862F, 0.3806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(103, 64).addBox(-0.525F, -0.1862F, -0.1194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1302F, 3.9371F, -6.7497F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftHand.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(13, 101).addBox(-0.525F, -0.2862F, 0.1806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(101, 12).addBox(-0.525F, -0.2862F, -0.2194F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1302F, 2.3724F, -4.7973F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftHand.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 104).addBox(-0.525F, -0.1862F, 0.1556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 55).addBox(-0.525F, -0.1862F, -0.2194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1302F, 1.5612F, -3.3033F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftHand.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(21, 105).addBox(-1.0F, -0.5612F, -0.2194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6052F, 1.1929F, -2.135F, -1.2654F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5234F, 0.5766F, -2.0487F, 2.2908F, -0.0157F, -1.7657F));

		PartDefinition cube_r278 = rightArm1.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(54, 63).mirror().addBox(-1.2F, 0.0F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.1081F, -0.0832F, -0.8753F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightArm1.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(107, 4).mirror().addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.116F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 12.3531F, -7.6151F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightArm1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-0.5F, -1.55F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 11.7208F, -6.4529F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightArm1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(63, 82).mirror().addBox(-0.5F, -2.0F, 0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.116F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 9.6856F, -6.0191F, -0.8247F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightArm1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(14, 87).mirror().addBox(-0.5F, -1.5F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 10.3387F, -5.6743F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightArm1.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-1.0F, 3.0546F, -0.2353F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.114F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 7.4786F, -4.0688F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightArm1.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.0F, -0.0905F, -0.5205F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(0.6081F, 3.3246F, -0.5598F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightArm1.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 2.5128F, 0.1794F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightArm1.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 0.9916F, 0.5522F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightArm1.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(50, 98).mirror().addBox(-0.5F, -2.9F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 9.7952F, -4.2177F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightArm1.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1081F, 2.1467F, -0.3734F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5405F, 13.1405F, -7.1482F, 1.1769F, 0.254F, -3.0003F));

		PartDefinition cube_r289 = rightArm2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(63, 63).mirror().addBox(-0.3792F, -3.3025F, 0.2053F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.0708F, 6.3788F, -0.9407F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightArm2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(27, 85).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.05F, -0.1563F, 0.7999F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightArm2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(27, 45).mirror().addBox(-0.5F, -3.8F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.05F, 3.4272F, 0.4548F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightArm2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(33, 99).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.8358F, -0.08F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightArm2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-0.5F, -2.475F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.7375F, -0.3897F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightArm2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(107, 41).mirror().addBox(-0.5F, 4.2156F, -0.2397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(21, 76).mirror().addBox(-0.5F, -0.2844F, -0.2397F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0781F, 5.116F, -1.4291F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightArm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(16, 73).mirror().addBox(-0.4678F, -2.5041F, -0.9946F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 1.95F, -0.1F, -0.1777F, -0.007F, 0.0146F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1077F, 10.1925F, -1.4556F, 1.1213F, 0.0686F, -0.2455F));

		PartDefinition cube_r296 = rightHand.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(23, 109).mirror().addBox(0.0F, -0.4F, -1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 1.6679F, -1.035F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightHand.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(18, 62).mirror().addBox(0.0F, -0.65F, -1.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 0.9179F, -1.035F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightHand.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(0.0F, -0.2156F, -0.0494F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 4.7512F, -5.5685F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightHand.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(99, 86).mirror().addBox(0.0F, -0.3156F, -0.0494F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 3.0946F, -3.6961F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightHand.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(55, 100).mirror().addBox(0.0F, -0.5156F, -0.0494F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 1.8929F, -1.735F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightHand.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(65, 101).mirror().addBox(0.0F, -0.5261F, 0.1068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 1.1929F, -2.135F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightHand.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(107, 73).mirror().addBox(-0.8F, 1.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 8).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 7.4916F, -7.955F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightHand.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(107, 70).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 6.9148F, -7.7896F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightHand.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(107, 61).mirror().addBox(-0.5F, -0.35F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(107, 44).mirror().addBox(-0.5F, -0.35F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 6.8253F, -7.1532F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightHand.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(5, 104).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1052F, 6.2563F, -6.9628F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightHand.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-0.475F, -0.1862F, -0.1194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 5.3085F, -7.5737F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightHand.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(99, 81).mirror().addBox(-0.475F, -1.1862F, 0.3806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(103, 64).mirror().addBox(-0.475F, -0.1862F, -0.1194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 3.9371F, -6.7497F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightHand.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(13, 101).mirror().addBox(-0.475F, -0.2862F, 0.1806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(101, 12).mirror().addBox(-0.475F, -0.2862F, -0.2194F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 2.3724F, -4.7973F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightHand.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.475F, -0.1862F, 0.1556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 55).mirror().addBox(-0.475F, -0.1862F, -0.2194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1302F, 1.5612F, -3.3033F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightHand.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(21, 105).mirror().addBox(0.0F, -0.5612F, -0.2194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6052F, 1.1929F, -2.135F, -1.2654F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, 1.0526F, -2.0035F));

		PartDefinition cube_r311 = bone2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(61, 105).addBox(-0.4971F, 2.344F, -1.0173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, -0.4206F, 0.7759F, -3.1239F));

		PartDefinition cube_r312 = bone2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(41, 91).addBox(1.2118F, 0.6003F, -0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 0.3062F, 0.8605F, -1.9749F));

		PartDefinition cube_r313 = bone2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(56, 105).addBox(-0.0938F, -0.2268F, -0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 0.1531F, 0.8904F, -2.174F));

		PartDefinition cube_r314 = bone2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(102, 73).addBox(-0.4816F, 0.5717F, -0.6528F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, -0.5336F, 0.764F, -3.0768F));

		PartDefinition cube_r315 = bone2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(27, 88).addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(51, 105).addBox(0.5F, 0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.6227F, 12.4663F, 6.0173F, 1.4603F, 0.1569F, -0.5157F));

		PartDefinition cube_r316 = bone2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(102, 43).addBox(-0.6565F, -0.158F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6319F, 10.7201F, 6.7638F, 1.4497F, 0.2983F, -0.8306F));

		PartDefinition cube_r317 = bone2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(100, 101).addBox(-0.6776F, -1.9378F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6319F, 10.7201F, 6.7638F, 1.4546F, -0.0917F, -0.7841F));

		PartDefinition cube_r318 = bone2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(105, 0).addBox(-0.625F, -1.125F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0574F, 10.9773F, 5.5424F, 1.5333F, -0.1486F, -0.5559F));

		PartDefinition cube_r319 = bone2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(99, 21).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5688F, 12.338F, 3.6011F, 1.5741F, -0.3249F, -0.4414F));

		PartDefinition cube_r320 = bone2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(106, 104).addBox(0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5688F, 12.338F, 3.6011F, 1.5739F, -0.0631F, -0.4406F));

		PartDefinition cube_r321 = bone2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(40, 83).addBox(-3.3219F, 0.1909F, -1.0408F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 0.9196F, -0.3685F, -0.4416F));

		PartDefinition cube_r322 = bone2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(95, 101).addBox(-1.4645F, -0.0829F, -1.058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 0.9172F, -0.2369F, -0.4708F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(90, 101).addBox(-1.022F, 0.0026F, -0.8012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 1.0112F, -0.4568F, -0.6447F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(41, 77).addBox(-0.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1817F, 8.472F, 1.1814F, 0.8388F, -0.0925F, -0.7207F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(80, 41).addBox(-3.3425F, -2.6293F, -1.0012F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 0.7728F, -0.3777F, -0.442F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(28, 96).addBox(-0.475F, -1.6F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.923F, 8.6304F, 2.3759F, 0.7548F, -0.3457F, -0.3817F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(85, 101).addBox(0.1123F, -3.3019F, -0.8058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 0.958F, -0.1763F, -0.8635F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(101, 17).addBox(-0.9352F, -1.5403F, -0.8058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3264F, 8.8936F, 3.7606F, 0.7544F, -0.6808F, -0.3961F));

		PartDefinition cube_r329 = bone2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0613F, 0.9029F, -0.5105F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3096F, 6.9472F, -0.4697F, 1.8206F, 0.1355F, 0.2066F));

		PartDefinition cube_r330 = bone2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(80, 77).addBox(-0.9988F, -0.3608F, -0.1448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4124F, 6.5982F, 0.0542F, 2.4004F, -0.0034F, 0.8276F));

		PartDefinition cube_r331 = bone2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(87, 77).addBox(-0.9988F, -0.8673F, 1.4882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.4124F, 6.5982F, 0.0542F, 2.095F, -0.0034F, 0.8276F));

		PartDefinition cube_r332 = bone2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(87, 45).addBox(-0.8848F, -0.5388F, -0.0016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6124F, 4.7982F, -1.8458F, 1.7895F, -0.0034F, 0.5309F));

		PartDefinition cube_r333 = bone2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(87, 41).addBox(-0.8655F, -0.842F, -0.0937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2376F, 3.3982F, -1.9458F, 1.3968F, -0.0034F, 0.3041F));

		PartDefinition cube_r334 = bone2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(83, 13).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8437F, 1.9175F, -2.0741F, 1.0405F, -0.2101F, -0.0324F));

		PartDefinition cube_r335 = bone2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(70, 0).addBox(-0.2038F, 0.3068F, 4.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3096F, 6.9472F, -0.4697F, 1.6619F, 0.1854F, 0.0016F));

		PartDefinition cube_r336 = bone2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 64).addBox(-0.2038F, 1.4945F, 3.8077F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3096F, 6.9472F, -0.4697F, 1.9411F, 0.1854F, 0.0016F));

		PartDefinition cube_r337 = bone2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(106, 89).addBox(0.7028F, -4.036F, 6.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, 0.6F, 0.6F, -0.4913F, -0.1438F, -0.3287F));

		PartDefinition cube_r338 = bone2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(97, 97).addBox(0.7028F, -1.9935F, 5.0992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, 0.6F, 0.6F, -0.1859F, -0.1438F, -0.3287F));

		PartDefinition cube_r339 = bone2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(40, 87).addBox(-0.1719F, -0.965F, -0.3374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 0.6F, 0.6F, -0.0817F, -0.0076F, -0.322F));

		PartDefinition cube_r340 = bone2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(40, 47).addBox(-0.2479F, -0.7403F, 1.665F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 0.6F, 0.6F, 0.0503F, 0.037F, -0.3298F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0142F, 1.0526F, -2.0035F));

		PartDefinition cube_r341 = bone4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(61, 105).mirror().addBox(-0.5029F, 2.344F, -1.0173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, -0.4206F, -0.7759F, 3.1239F));

		PartDefinition cube_r342 = bone4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(41, 91).mirror().addBox(-2.2118F, 0.6003F, -0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 0.3062F, -0.8605F, 1.9749F));

		PartDefinition cube_r343 = bone4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(56, 105).mirror().addBox(-0.9062F, -0.2268F, -0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 0.1531F, -0.8904F, 2.174F));

		PartDefinition cube_r344 = bone4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(102, 73).mirror().addBox(-0.5184F, 0.5717F, -0.6528F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, -0.5336F, -0.764F, 3.0768F));

		PartDefinition cube_r345 = bone4.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(27, 88).mirror().addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(51, 105).mirror().addBox(-1.5F, 0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.6227F, 12.4663F, 6.0173F, 1.4603F, -0.1569F, 0.5157F));

		PartDefinition cube_r346 = bone4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(102, 43).mirror().addBox(-0.3435F, -0.158F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6319F, 10.7201F, 6.7638F, 1.4497F, -0.2983F, 0.8306F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(100, 101).mirror().addBox(-0.3224F, -1.9378F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6319F, 10.7201F, 6.7638F, 1.4546F, 0.0917F, 0.7841F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.375F, -1.125F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0574F, 10.9773F, 5.5424F, 1.5333F, 0.1486F, 0.5559F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5688F, 12.338F, 3.6011F, 1.5741F, 0.3249F, 0.4414F));

		PartDefinition cube_r350 = bone4.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(106, 104).mirror().addBox(-1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5688F, 12.338F, 3.6011F, 1.5739F, 0.0631F, 0.4406F));

		PartDefinition cube_r351 = bone4.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(1.3219F, 0.1909F, -1.0408F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 0.9196F, 0.3685F, 0.4416F));

		PartDefinition cube_r352 = bone4.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(95, 101).mirror().addBox(0.4645F, -0.0829F, -1.058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 0.9172F, 0.2369F, 0.4708F));

		PartDefinition cube_r353 = bone4.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(90, 101).mirror().addBox(0.022F, 0.0026F, -0.8012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 1.0112F, 0.4568F, 0.6447F));

		PartDefinition cube_r354 = bone4.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(41, 77).mirror().addBox(-2.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1817F, 8.472F, 1.1814F, 0.8388F, 0.0925F, 0.7207F));

		PartDefinition cube_r355 = bone4.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(80, 41).mirror().addBox(1.3425F, -2.6293F, -1.0012F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 0.7728F, 0.3777F, 0.442F));

		PartDefinition cube_r356 = bone4.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(28, 96).mirror().addBox(-0.525F, -1.6F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.923F, 8.6304F, 2.3759F, 0.7548F, 0.3457F, 0.3817F));

		PartDefinition cube_r357 = bone4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(85, 101).mirror().addBox(-1.1123F, -3.3019F, -0.8058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 0.958F, 0.1763F, 0.8635F));

		PartDefinition cube_r358 = bone4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(101, 17).mirror().addBox(-0.0648F, -1.5403F, -0.8058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 8.8936F, 3.7606F, 0.7544F, 0.6808F, 0.3961F));

		PartDefinition cube_r359 = bone4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(0.0613F, 0.9029F, -0.5105F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3096F, 6.9472F, -0.4697F, 1.8206F, -0.1355F, -0.2066F));

		PartDefinition cube_r360 = bone4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.0012F, -0.3608F, -0.1448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4124F, 6.5982F, 0.0542F, 2.4004F, 0.0034F, -0.8276F));

		PartDefinition cube_r361 = bone4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(87, 77).mirror().addBox(-0.0012F, -0.8673F, 1.4882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.4124F, 6.5982F, 0.0542F, 2.095F, 0.0034F, -0.8276F));

		PartDefinition cube_r362 = bone4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(87, 45).mirror().addBox(-0.1152F, -0.5388F, -0.0016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6124F, 4.7982F, -1.8458F, 1.7895F, 0.0034F, -0.5309F));

		PartDefinition cube_r363 = bone4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(87, 41).mirror().addBox(-0.1345F, -0.842F, -0.0937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2376F, 3.3982F, -1.9458F, 1.3968F, 0.0034F, -0.3041F));

		PartDefinition cube_r364 = bone4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(83, 13).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8437F, 1.9175F, -2.0741F, 1.0405F, 0.2101F, 0.0324F));

		PartDefinition cube_r365 = bone4.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.7962F, 0.3068F, 4.2466F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3096F, 6.9472F, -0.4697F, 1.6619F, -0.1854F, -0.0016F));

		PartDefinition cube_r366 = bone4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.7962F, 1.4945F, 3.8077F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3096F, 6.9472F, -0.4697F, 1.9411F, -0.1854F, -0.0016F));

		PartDefinition cube_r367 = bone4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(106, 89).mirror().addBox(-1.7028F, -4.036F, 6.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.6F, 0.6F, -0.4913F, 0.1438F, 0.3287F));

		PartDefinition cube_r368 = bone4.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(97, 97).mirror().addBox(-1.7028F, -1.9935F, 5.0992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.6F, 0.6F, -0.1859F, 0.1438F, 0.3287F));

		PartDefinition cube_r369 = bone4.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.8281F, -0.965F, -0.3374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.6F, 0.6F, -0.0817F, 0.0076F, 0.322F));

		PartDefinition cube_r370 = bone4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(40, 47).mirror().addBox(-0.7521F, -0.7403F, 1.665F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.6F, 0.6F, 0.0503F, -0.037F, 0.3298F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.386F, -4.8881F, 0.631F, -0.1771F, -0.128F));

		PartDefinition cube_r371 = neck6.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(111, 20).addBox(0.0F, -2.3943F, -5.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 111).addBox(0.0F, -2.6943F, -3.1586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 0).addBox(-0.5F, -1.9943F, -5.1586F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.1032F, -0.0049F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r372 = neck6.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(91, 38).addBox(0.0F, -1.2924F, -0.1881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6485F, -0.2392F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r373 = neck6.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(103, 29).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3289F, 2.2473F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r374 = neck6.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(110, 29).mirror().addBox(-0.8982F, -1.8503F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 10).mirror().addBox(-1.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1882F, 2.8174F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r375 = neck6.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(103, 29).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3289F, 2.2473F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r376 = neck6.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(110, 29).addBox(-0.1018F, -1.8503F, -7.0308F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 10).addBox(0.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1882F, 2.8174F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8727F, -3.8428F, -0.1189F, -0.3034F, 0.0357F));

		PartDefinition cube_r377 = neck5.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(111, 23).addBox(0.0F, -1.5F, -3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 40).addBox(-0.5F, -1.1F, -4.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck10 = neck5.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.4F, -3.25F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r378 = neck10.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(60, 22).addBox(-1.0F, -2.0981F, 2.9713F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(111, 26).addBox(-0.5F, -2.3981F, 3.9713F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -4.0F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck4 = neck10.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -1.9F, -2.3F, -0.2833F, -0.1677F, 0.0486F));

		PartDefinition cube_r379 = neck4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(58, 16).addBox(-1.0F, -2.0981F, -0.0287F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.5F, -1.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4839F, -0.4921F, -0.4716F, -0.0389F, 0.0198F));

		PartDefinition cube_r380 = neck3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(9, 64).addBox(-1.0F, 2.0773F, -1.9318F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4068F, -1.9056F, -1.2214F, -0.041F, -0.0149F));

		PartDefinition cube_r381 = neck2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(27, 64).addBox(-1.0F, -0.0728F, -1.8396F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -4.0434F, -1.7627F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3944F, -2.269F, -0.7298F, -0.1468F, -0.162F));

		PartDefinition cube_r382 = neck.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(27, 58).addBox(-1.0F, -0.1384F, 0.7138F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck7 = neck.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.35F, -2.825F, 0.4132F, 0.0707F, -0.1597F));

		PartDefinition cube_r383 = neck7.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(79, 0).addBox(-1.0F, -0.1384F, 1.7138F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.6F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.375F, -1.95F, 0.4765F, 0.0603F, -0.1163F));

		PartDefinition cube_r384 = neck8.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(29, 111).addBox(0.0F, 0.0961F, -2.0513F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 111).addBox(0.0F, -0.5039F, -0.0513F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.8F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r385 = neck8.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(36, 62).addBox(-1.0F, -0.1384F, 0.7138F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.6F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -2.85F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r386 = neck9.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(106, 110).addBox(0.0F, -0.5039F, -1.0513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.9F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r387 = neck9.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(59, 57).addBox(-1.0F, -0.1384F, 0.7138F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.7F, -3.7F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head = neck9.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0634F, -2.5396F, 1.1951F, -0.0812F, -0.2027F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 42).addBox(-3.0F, 0.4011F, -0.5883F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6924F, -1.5185F, 1.357F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(49, 34).addBox(-2.5F, 0.1F, -1.2F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -3.9582F, -0.9935F, 2.1513F, 0.0014F, -0.0084F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(62, 40).addBox(-3.0F, -1.9124F, -0.6728F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -4.6531F, 0.9288F, 1.2086F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(68, 64).addBox(-3.0F, -2.8198F, -0.3259F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.6531F, 0.9288F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r392 = head.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(49, 30).addBox(-3.0F, -0.983F, -1.913F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -3.8193F, 1.4614F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r393 = head.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(67, 19).addBox(-3.0F, -0.9835F, -1.0097F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, -4.6531F, 0.9288F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r394 = head.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(46, 4).addBox(-2.5F, -0.0521F, -1.9672F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -3.8027F, 1.5088F, 0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r395 = head.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(34, 33).addBox(-2.5F, -0.0387F, -2.9889F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.9027F, 1.9088F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r396 = head.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(85, 89).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -4.0867F, -4.2528F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r397 = head.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(108, 51).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.5841F, -3.9173F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r398 = head.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(80, 27).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -4.1875F, -2.9993F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r399 = head.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(104, 97).addBox(0.0F, -0.3735F, 0.9873F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(-0.5F, -2.3678F, -2.7619F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r400 = head.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(68, 57).addBox(0.0F, -3.0735F, -0.9127F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.5F, -2.3678F, -2.7619F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r401 = head.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -1.3F, -0.325F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(-0.5F, -1.6678F, -2.7619F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r402 = head.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(108, 54).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.284F, -5.5866F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r403 = head.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(78, 89).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.2025F, -5.0832F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r404 = head.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(101, 105).addBox(-0.5F, 0.1095F, 0.8464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -4.851F, -7.4835F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r405 = head.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(109, 7).mirror().addBox(0.0F, -0.0842F, -0.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6993F, -5.0654F, -4.9324F, 0.201F, -0.2139F, -0.0432F));

		PartDefinition cube_r406 = head.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(101, 108).mirror().addBox(-0.7F, -0.0824F, -0.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.1016F, -4.7508F, 0.5492F, -0.1118F, -0.0682F));

		PartDefinition cube_r407 = head.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(96, 108).mirror().addBox(-0.55F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -5.186F, -3.8549F, 0.5609F, -0.2231F, -0.1381F));

		PartDefinition cube_r408 = head.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(109, 7).addBox(-1.0F, -0.0842F, -0.8539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6993F, -5.0654F, -4.9324F, 0.201F, 0.2139F, 0.0432F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(108, 31).addBox(-0.5F, -0.1092F, -0.0539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -4.926F, -5.6335F, 0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(96, 108).addBox(-0.45F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, -5.186F, -3.8549F, 0.5609F, 0.2231F, 0.1381F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(66, 108).addBox(-0.5F, -0.1074F, 0.3097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(31, 108).addBox(-0.5F, -0.1074F, -0.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -5.1016F, -4.7508F, 0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(101, 108).addBox(-0.3F, -0.0824F, -0.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -5.1016F, -4.7508F, 0.5492F, 0.1118F, 0.0682F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(79, 10).addBox(-2.5F, -0.0046F, -1.0221F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -5.8789F, -2.6933F, 0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(71, 78).addBox(-2.5F, -0.0046F, -1.0221F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -5.7961F, -1.6968F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(59, 53).addBox(-2.0F, 0.7814F, -1.429F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -2.9027F, 1.9088F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(59, 10).addBox(-1.5F, -2.018F, -0.9745F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.0526F, -2.4107F, -0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(51, 48).addBox(-2.0F, 0.679F, -2.3084F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 0.6473F, -1.1412F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(78, 19).addBox(-2.0F, -0.6672F, -1.7166F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.2473F, -0.1662F, -1.1737F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(59, 4).addBox(-2.0F, -0.7169F, -2.9647F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -0.3027F, 0.6088F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(59, 0).addBox(-2.0F, 0.9703F, -1.8061F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.1027F, 1.4088F, -1.3744F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(36, 58).addBox(-2.0F, -0.0084F, -1.9851F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -1.1027F, 1.4088F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(16, 68).addBox(-0.5F, -0.182F, -3.0913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.751F, -19.4835F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.1332F, -2.2835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.251F, -17.5835F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(45, 67).addBox(-0.5F, -0.1308F, -2.5279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.651F, -15.5835F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(85, 85).addBox(-0.5F, -0.0156F, -2.0016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.951F, -13.5835F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(67, 14).addBox(-0.5F, 0.0002F, -1.9095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -4.151F, -11.6835F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(71, 85).addBox(-0.5F, -0.0256F, -0.1468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.851F, -7.4835F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(51, 108).addBox(-0.5F, -0.1861F, 0.9222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 22).addBox(-0.5F, -0.1861F, -0.1778F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7278F, -26.9952F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(20, 85).addBox(-0.5F, -0.1494F, -0.1291F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, 1.7278F, -26.9952F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(46, 108).addBox(-0.5F, -0.1377F, -0.8656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0113F, -25.221F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(41, 108).addBox(-0.5F, -0.1377F, -0.8656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.4645F, -24.5779F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(36, 108).addBox(-0.5F, -0.1377F, -0.8655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.8944F, -23.9032F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(84, 67).addBox(-0.5F, -0.1377F, -1.9656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.801F, -22.2335F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(48, 10).addBox(-0.5F, -2.3265F, -0.0438F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.1075F, -7.2249F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(33, 84).addBox(-0.5F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0125F)), PartPose.offsetAndRotation(0.0F, -3.2391F, -6.6485F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(93, 70).addBox(-0.5F, -0.3079F, -1.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -4.851F, -7.6835F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(68, 93).addBox(-0.5F, -0.3221F, -0.3143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0F, -4.4816F, -10.1063F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(93, 61).addBox(-0.5F, -0.3722F, -2.2393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -4.551F, -9.5835F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7F, -9.7781F, -2.2971F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(96, 105).addBox(-0.6476F, -0.4496F, -0.6481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(91, 105).addBox(-0.6476F, -0.4496F, -1.1481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.1828F, 8.9402F, 0.3368F, -0.4504F, 0.1211F, -0.016F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(86, 105).addBox(-0.6476F, -0.1854F, -0.6199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F))
				.texOffs(81, 105).addBox(-0.6476F, -0.1854F, -1.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1828F, 8.9402F, 0.3368F, -0.7471F, 0.1211F, -0.016F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(49, 24).addBox(-0.6476F, -0.4522F, -4.2992F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.1828F, 8.9402F, 0.3368F, -0.4242F, 0.1211F, -0.016F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(54, 68).addBox(-0.5F, -0.55F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4284F, 7.4367F, -3.173F, -0.4733F, 0.0123F, -0.0644F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(47, 86).addBox(1.5F, -0.9495F, -0.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.2F, 9.0627F, 1.2385F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(76, 105).addBox(1.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 9.0627F, 0.6885F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(92, 81).addBox(-0.821F, -0.5712F, -0.3879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.8203F, 0.0262F, 0.0F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(61, 92).addBox(-0.821F, -0.7607F, 1.147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.6807F, 0.0262F, 0.0F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(26, 92).addBox(-0.821F, -1.2595F, 2.6052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.5061F, 0.0262F, 0.0F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(92, 21).addBox(-0.821F, -1.6373F, 4.0962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.4189F, 0.0262F, 0.0F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(71, 27).addBox(-0.821F, -2.1685F, 5.5236F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.3316F, 0.0262F, 0.0F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(91, 66).addBox(-0.821F, -2.8327F, 7.0922F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.2443F, 0.0262F, 0.0F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(93, 4).addBox(-0.821F, -2.9879F, 8.7441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.2269F, 0.0262F, 0.0F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(34, 91).addBox(-0.821F, -3.4482F, 8.5834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(93, 0).addBox(-0.821F, -3.3766F, 12.1469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.1745F, 0.0262F, 0.0F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(7, 91).addBox(-0.821F, -4.2163F, 10.0529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.1047F, 0.0262F, 0.0F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(0, 91).addBox(-0.821F, -4.8362F, 11.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2383F, 11.6011F, -24.116F, 0.0524F, 0.0262F, 0.0F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(92, 89).addBox(-0.9234F, -0.5703F, -0.0763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.788F, 6.3973F, -10.8357F, 0.1047F, 0.0611F, 0.0F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(54, 90).addBox(-0.9234F, -0.3335F, -0.1328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.788F, 6.3973F, -10.8357F, 0.0F, 0.0611F, 0.0F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(92, 85).addBox(-0.8177F, -0.9744F, -1.932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.6383F, 6.6011F, -7.341F, 0.0F, 0.0785F, 0.0F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(47, 90).addBox(-0.8177F, -0.4729F, -1.9521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6383F, 6.6011F, -7.341F, -0.0349F, 0.0785F, 0.0F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(108, 92).addBox(-1.0F, -0.0705F, -0.6332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2383F, 6.6011F, -5.441F, -2.9671F, 0.0436F, 0.0F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(91, 108).addBox(-1.0F, -1.404F, -0.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2383F, 6.6011F, -5.441F, 1.4399F, 0.1134F, 0.0F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(81, 108).addBox(-1.0F, -0.975F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(86, 4).addBox(-1.0F, -0.475F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.2383F, 6.6011F, -5.441F, 0.0F, 0.1134F, 0.0F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(86, 108).addBox(-1.0F, -0.4417F, -0.8057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2383F, 6.6011F, -5.441F, -0.6109F, 0.1134F, 0.0F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(90, 10).addBox(-0.5F, -0.05F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6274F, 5.1799F, -4.2056F, 0.4651F, 0.1439F, 0.0361F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(76, 108).addBox(-1.0F, -0.0077F, -0.979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2749F, 3.8884F, -0.4123F, -1.3188F, 1.4827F, -1.358F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(71, 108).addBox(-1.075F, -0.0077F, -0.979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 3.9271F, -1.4863F, 1.0334F, 1.5279F, 0.9955F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(56, 108).addBox(-1.0F, -0.0077F, -0.929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, 3.9271F, -1.4863F, 0.2225F, 0.1484F, 0.0F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(10, 109).addBox(-1.0F, -0.0039F, -1.2068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(61, 108).addBox(-1.0F, -0.0039F, -1.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1671F, 4.1301F, -2.3758F, 0.4931F, 0.1484F, 0.0F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(78, 85).addBox(-0.5F, -0.3079F, -1.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-1.4F, 4.9271F, -5.3863F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(85, 81).addBox(-0.5F, -0.3722F, -2.2393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-1.4F, 5.2271F, -7.2863F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(14, 93).addBox(-0.5F, -0.3221F, -0.3143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, 5.2965F, -7.8091F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(108, 64).addBox(-1.2513F, -0.0345F, -1.1893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 4.6271F, -3.1863F, 0.4651F, 0.1439F, 0.0361F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(34, 68).addBox(-1.02F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(78, 22).addBox(-0.48F, -0.7F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.054F, 6.2289F, -0.1628F, -0.0981F, 0.3473F, -0.0277F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7F, -9.7781F, -2.2971F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(96, 105).mirror().addBox(-0.3524F, -0.4496F, -0.6481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(91, 105).mirror().addBox(-0.3524F, -0.4496F, -1.1481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.1828F, 8.9402F, 0.3368F, -0.4504F, -0.1211F, 0.016F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(86, 105).mirror().addBox(-0.3524F, -0.1854F, -0.6199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false)
				.texOffs(81, 105).mirror().addBox(-0.3524F, -0.1854F, -1.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1828F, 8.9402F, 0.3368F, -0.7471F, -0.1211F, 0.016F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-0.3524F, -0.4522F, -4.2992F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.1828F, 8.9402F, 0.3368F, -0.4242F, -0.1211F, 0.016F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(54, 68).mirror().addBox(-0.5F, -0.55F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4284F, 7.4367F, -3.173F, -0.4733F, -0.0123F, 0.0644F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(-2.5F, -0.9495F, -0.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.0627F, 1.2385F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(76, 105).mirror().addBox(-2.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 9.0627F, 0.6885F, 1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(92, 81).mirror().addBox(-0.179F, -0.5712F, -0.3879F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.8203F, -0.0262F, 0.0F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(61, 92).mirror().addBox(-0.179F, -0.7607F, 1.147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.6807F, -0.0262F, 0.0F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(26, 92).mirror().addBox(-0.179F, -1.2595F, 2.6052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.5061F, -0.0262F, 0.0F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(92, 21).mirror().addBox(-0.179F, -1.6373F, 4.0962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.4189F, -0.0262F, 0.0F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-0.179F, -2.1685F, 5.5236F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.3316F, -0.0262F, 0.0F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(91, 66).mirror().addBox(-0.179F, -2.8327F, 7.0922F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.2443F, -0.0262F, 0.0F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-0.179F, -2.9879F, 8.7441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.2269F, -0.0262F, 0.0F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(34, 91).mirror().addBox(-0.179F, -3.4482F, 8.5834F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(93, 0).mirror().addBox(-0.179F, -3.3766F, 12.1469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.1745F, -0.0262F, 0.0F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(7, 91).mirror().addBox(-0.179F, -4.2163F, 10.0529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.1047F, -0.0262F, 0.0F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.179F, -4.8362F, 11.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2383F, 11.6011F, -24.116F, 0.0524F, -0.0262F, 0.0F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(92, 89).mirror().addBox(-0.0766F, -0.5703F, -0.0763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.788F, 6.3973F, -10.8357F, 0.1047F, -0.0611F, 0.0F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(54, 90).mirror().addBox(-0.0766F, -0.3335F, -0.1328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.788F, 6.3973F, -10.8357F, 0.0F, -0.0611F, 0.0F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(92, 85).mirror().addBox(-0.1823F, -0.9744F, -1.932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.6383F, 6.6011F, -7.341F, 0.0F, -0.0785F, 0.0F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(47, 90).mirror().addBox(-0.1823F, -0.4729F, -1.9521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6383F, 6.6011F, -7.341F, -0.0349F, -0.0785F, 0.0F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(108, 92).mirror().addBox(0.0F, -0.0705F, -0.6332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2383F, 6.6011F, -5.441F, -2.9671F, -0.0436F, 0.0F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(91, 108).mirror().addBox(0.0F, -1.404F, -0.1891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2383F, 6.6011F, -5.441F, 1.4399F, -0.1134F, 0.0F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(81, 108).mirror().addBox(0.0F, -0.975F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(86, 4).mirror().addBox(0.0F, -0.475F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.2383F, 6.6011F, -5.441F, 0.0F, -0.1134F, 0.0F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(86, 108).mirror().addBox(0.0F, -0.4417F, -0.8057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2383F, 6.6011F, -5.441F, -0.6109F, -0.1134F, 0.0F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(90, 10).mirror().addBox(-0.5F, -0.05F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6274F, 5.1799F, -4.2056F, 0.4651F, -0.1439F, -0.0361F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(76, 108).mirror().addBox(0.0F, -0.0077F, -0.979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2749F, 3.8884F, -0.4123F, -1.3188F, -1.4827F, 1.358F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(71, 108).mirror().addBox(0.075F, -0.0077F, -0.979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.9271F, -1.4863F, 1.0334F, -1.5279F, -0.9955F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(56, 108).mirror().addBox(0.0F, -0.0077F, -0.929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.9271F, -1.4863F, 0.2225F, -0.1484F, 0.0F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(0.0F, -0.0039F, -1.2068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(61, 108).mirror().addBox(0.0F, -0.0039F, -1.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1671F, 4.1301F, -2.3758F, 0.4931F, -0.1484F, 0.0F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(78, 85).mirror().addBox(-0.5F, -0.3079F, -1.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(1.4F, 4.9271F, -5.3863F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.5F, -0.3722F, -2.2393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(1.4F, 5.2271F, -7.2863F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(14, 93).mirror().addBox(-0.5F, -0.3221F, -0.3143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4F, 5.2965F, -7.8091F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(108, 64).mirror().addBox(0.2513F, -0.0345F, -1.1893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 4.6271F, -3.1863F, 0.4651F, -0.1439F, -0.0361F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(34, 68).mirror().addBox(-0.98F, -0.7F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(78, 22).mirror().addBox(-0.52F, -0.7F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.054F, 6.2289F, -0.1628F, -0.0981F, -0.3473F, 0.0277F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0647F, -1.687F, 0.0356F, 0.0F, 0.0F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(76, 97).mirror().addBox(-0.2005F, -0.2751F, 1.3897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5437F, -1.8898F, -18.7262F, 0.1383F, -0.0221F, 0.0176F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(69, 97).mirror().addBox(-0.2005F, -0.134F, -0.2155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 97).mirror().addBox(-0.2005F, -0.209F, -0.2155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5437F, -1.8898F, -18.7262F, 0.2256F, -0.0221F, 0.0176F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(96, 50).mirror().addBox(-0.5455F, -1.6492F, 5.2051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.2652F, -0.0047F, 0.0176F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(96, 33).mirror().addBox(-0.5455F, -1.0368F, 3.911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.3743F, -0.0047F, 0.0176F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(83, 97).mirror().addBox(-0.2005F, -0.3195F, 1.38F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5437F, -1.8898F, -18.7262F, 0.1558F, -0.0221F, 0.0176F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(62, 97).mirror().addBox(-0.5455F, -0.5644F, 1.2088F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.5488F, -0.0047F, 0.0176F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(109, 98).mirror().addBox(-0.5455F, -0.4316F, 0.8243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(109, 95).mirror().addBox(-0.5455F, -0.4316F, 0.4243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.6361F, -0.0047F, 0.0176F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(14, 97).mirror().addBox(-0.5426F, -0.4905F, 0.9466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.323F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.5093F, -0.007F, 0.0064F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(97, 8).mirror().addBox(-0.5426F, -0.3346F, -0.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.6271F, -0.007F, 0.0064F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(109, 86).mirror().addBox(-0.5643F, -0.3408F, 0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)).mirror(false)
				.texOffs(109, 83).mirror().addBox(-0.5643F, -0.3408F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.7754F, -0.0053F, 0.008F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(96, 93).mirror().addBox(-0.5455F, -0.7667F, 2.5832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.479F, -0.0047F, 0.0176F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(55, 96).mirror().addBox(-0.5455F, -1.0643F, 3.9403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.4092F, -0.0047F, 0.0176F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(96, 54).mirror().addBox(-0.5455F, -1.5918F, 5.2415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.3132F, -0.0047F, 0.0176F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(43, 72).mirror().addBox(-0.5884F, -0.5362F, 2.2983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.1289F, 1.4786F, -24.9225F, 0.4918F, 0.0084F, 0.0146F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(109, 80).mirror().addBox(-0.062F, -2.7912F, -3.779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3823F, -1.0604F, -3.0918F, -2.906F, -0.2269F, 0.0F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(109, 37).mirror().addBox(-0.062F, 0.492F, -3.7894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 109).mirror().addBox(-0.062F, 0.492F, -2.7894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3823F, -1.0604F, -3.0918F, 2.3736F, -0.2269F, 0.0F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(96, 29).mirror().addBox(-0.5F, -0.125F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.3366F, -0.9104F, -21.3426F, 0.3734F, -0.057F, 0.0176F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(21, 96).mirror().addBox(-0.5F, -0.725F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4927F, -1.2239F, -18.5115F, 0.2643F, -0.057F, 0.0176F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(95, 46).mirror().addBox(-0.5F, -0.825F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4722F, -1.5662F, -17.0132F, 0.225F, -0.057F, 0.0176F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(33, 95).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5554F, -1.8057F, -15.4829F, 0.1377F, -0.057F, 0.0176F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(7, 95).mirror().addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.5891F, -1.9639F, -13.9667F, -0.0368F, -0.057F, 0.0176F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.634F, -1.9505F, -12.3084F, -0.0892F, -0.057F, 0.0176F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-0.5F, -0.875F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8351F, -1.5091F, -8.922F, -0.2157F, -0.057F, 0.0176F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(94, 77).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7226F, -2.7488F, -10.5098F, -0.0892F, -0.057F, 0.0176F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(71, 43).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8276F, -2.5903F, -8.7198F, -0.0543F, -0.057F, 0.0176F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(48, 94).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.7351F, -1.7528F, -10.5987F, -0.159F, -0.057F, 0.0176F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(94, 42).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.62F, -2.7504F, -12.3068F, -0.0019F, -0.057F, 0.0176F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(41, 94).mirror().addBox(-0.5F, -0.15F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5748F, -2.6629F, -14.0019F, 0.0505F, -0.057F, 0.0176F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(94, 38).mirror().addBox(-0.5F, -0.15F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.487F, -2.4971F, -15.5909F, 0.1028F, -0.057F, 0.0176F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(94, 25).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4513F, -2.2482F, -17.1691F, 0.1552F, -0.057F, 0.0176F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(94, 14).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3687F, -1.8898F, -18.7262F, 0.225F, -0.057F, 0.0176F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-0.5F, -0.675F, -0.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.3053F, 0.3613F, -22.5499F, 0.491F, -0.0439F, 0.0147F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(89, 93).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.3955F, -1.4276F, -20.1514F, 0.3123F, -0.057F, 0.0176F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(82, 93).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3366F, -0.9104F, -21.3426F, 0.4083F, -0.057F, 0.0176F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(75, 93).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.2772F, -0.2651F, -22.5836F, 0.4781F, -0.057F, 0.0176F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(106, 21).mirror().addBox(-0.062F, 1.1917F, -0.21F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3823F, -1.0604F, -3.0918F, 1.1519F, -0.2269F, 0.0F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(103, 31).mirror().addBox(-0.062F, -3.9185F, -0.6877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.3823F, -1.0604F, -3.0918F, -2.1206F, -0.2269F, 0.0F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(106, 18).mirror().addBox(-0.3788F, -0.6143F, -0.361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(106, 15).mirror().addBox(-0.3788F, -0.6143F, -0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)).mirror(false), PartPose.offsetAndRotation(-1.3289F, 1.6286F, -24.6975F, 0.775F, -0.0577F, 0.008F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(87, 26).mirror().addBox(-0.3704F, -0.8748F, -0.3937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-1.3289F, 1.8286F, -24.4975F, 0.6267F, -0.0593F, 0.0064F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-0.3704F, -1.0097F, 0.7371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.323F)).mirror(false), PartPose.offsetAndRotation(-1.3289F, 1.8286F, -24.4975F, 0.5089F, -0.0593F, 0.0064F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(106, 12).mirror().addBox(-0.3655F, -0.3353F, -0.2817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 106).mirror().addBox(-0.3655F, -0.3353F, 0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.3289F, 0.9786F, -24.4225F, 0.6352F, -0.057F, 0.0176F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(7, 87).mirror().addBox(-0.3655F, -0.4069F, 0.5139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3289F, 0.9786F, -24.4225F, 0.5479F, -0.057F, 0.0176F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.1376F, -0.7364F, -0.5126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.1239F, -2.6003F, -0.3224F, -0.1456F, 0.153F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-0.3274F, -0.4086F, 0.863F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.1239F, -2.6003F, -0.0254F, 0.0289F, 0.1486F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(86, 71).mirror().addBox(-0.1897F, -0.6684F, -1.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7843F, 1.1239F, -2.6003F, -0.5886F, -0.3354F, 0.2444F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -0.475F, -0.275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, -0.7829F, -3.3981F, -0.2967F, -0.1047F, 0.0F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9494F, -1.7425F, -5.0715F, -0.2094F, -0.0475F, 0.0315F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(68, 67).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-1.9527F, -1.1434F, -5.1343F, -0.2269F, -0.0524F, 0.0F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(105, 101).mirror().addBox(0.1421F, -0.7931F, -0.6266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6915F, -1.2654F, -3.9613F, -0.6109F, -0.1571F, 0.0F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(54, 86).mirror().addBox(-0.2473F, -0.6542F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3823F, -1.0604F, -3.0918F, -0.3067F, -0.1023F, 0.0158F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(109, 80).addBox(-0.938F, -2.7912F, -3.779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3823F, -1.0604F, -3.0918F, -2.906F, 0.2269F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(109, 37).addBox(-0.938F, 0.492F, -3.7894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 109).addBox(-0.938F, 0.492F, -2.7894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3823F, -1.0604F, -3.0918F, 2.3736F, 0.2269F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(106, 21).addBox(-0.938F, 1.1917F, -0.21F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3823F, -1.0604F, -3.0918F, 1.1519F, 0.2269F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(103, 31).addBox(-0.938F, -3.9185F, -0.6877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3823F, -1.0604F, -3.0918F, -2.1206F, 0.2269F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(96, 33).addBox(-0.4545F, -1.0368F, 3.911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.3743F, 0.0047F, -0.0176F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(96, 50).addBox(-0.4545F, -1.6492F, 5.2051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.2652F, 0.0047F, -0.0176F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(43, 72).addBox(-0.4116F, -0.5362F, 2.2983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.4918F, -0.0084F, -0.0146F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(96, 54).addBox(-0.4545F, -1.5918F, 5.2415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.3132F, 0.0047F, -0.0176F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(55, 96).addBox(-0.4545F, -1.0643F, 3.9403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.4092F, 0.0047F, -0.0176F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(96, 93).addBox(-0.4545F, -0.7667F, 2.5832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.479F, 0.0047F, -0.0176F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(109, 83).addBox(-0.4357F, -0.3408F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(109, 86).addBox(-0.4357F, -0.3408F, 0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.7754F, 0.0053F, -0.008F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(97, 8).addBox(-0.4574F, -0.3346F, -0.2466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.6271F, 0.007F, -0.0064F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(14, 97).addBox(-0.4574F, -0.4905F, 0.9466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.323F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.5093F, 0.007F, -0.0064F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(109, 95).addBox(-0.4545F, -0.4316F, 0.4243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 98).addBox(-0.4545F, -0.4316F, 0.8243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.6361F, 0.0047F, -0.0176F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(62, 97).addBox(-0.4545F, -0.5644F, 1.2088F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8711F, 1.4786F, -24.9225F, 0.5488F, 0.0047F, -0.0176F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(106, 18).addBox(-0.6212F, -0.6143F, -0.361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(106, 15).addBox(-0.6212F, -0.6143F, -0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.324F)), PartPose.offsetAndRotation(-0.6711F, 1.6286F, -24.6975F, 0.775F, 0.0577F, -0.008F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(87, 26).addBox(-0.6296F, -0.8748F, -0.3937F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.6711F, 1.8286F, -24.4975F, 0.6267F, 0.0593F, -0.0064F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(71, 32).addBox(-0.5F, -0.675F, -0.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(-0.6947F, 0.3613F, -22.5499F, 0.491F, 0.0439F, -0.0147F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(87, 17).addBox(-0.6296F, -1.0097F, 0.7371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.323F)), PartPose.offsetAndRotation(-0.6711F, 1.8286F, -24.4975F, 0.5089F, 0.0593F, -0.0064F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(106, 12).addBox(-0.6345F, -0.3353F, -0.2817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 106).addBox(-0.6345F, -0.3353F, 0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.6711F, 0.9786F, -24.4225F, 0.6352F, 0.057F, -0.0176F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(71, 48).addBox(-0.5F, -0.875F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1649F, -1.5091F, -8.922F, -0.2157F, 0.057F, -0.0176F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(71, 43).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1724F, -2.5903F, -8.7198F, -0.0543F, 0.057F, -0.0176F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(94, 77).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2774F, -2.7488F, -10.5098F, -0.0892F, 0.057F, -0.0176F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(48, 94).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2649F, -1.7528F, -10.5987F, -0.159F, 0.057F, -0.0176F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.366F, -1.9505F, -12.3084F, -0.0892F, 0.057F, -0.0176F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(94, 42).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.38F, -2.7504F, -12.3068F, -0.0019F, 0.057F, -0.0176F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(7, 95).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4109F, -1.9639F, -13.9667F, -0.0368F, 0.057F, -0.0176F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(41, 94).addBox(-0.5F, -0.15F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4252F, -2.6629F, -14.0019F, 0.0505F, 0.057F, -0.0176F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(94, 38).addBox(-0.5F, -0.15F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.513F, -2.4971F, -15.5909F, 0.1028F, 0.057F, -0.0176F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(69, 97).addBox(-0.7995F, -0.134F, -0.2155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 97).addBox(-0.7995F, -0.209F, -0.2155F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4563F, -1.8898F, -18.7262F, 0.2256F, 0.0221F, -0.0176F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(76, 97).addBox(-0.7995F, -0.2751F, 1.3897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4563F, -1.8898F, -18.7262F, 0.1383F, 0.0221F, -0.0176F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(83, 97).addBox(-0.7995F, -0.3195F, 1.38F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4563F, -1.8898F, -18.7262F, 0.1558F, 0.0221F, -0.0176F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(33, 95).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4446F, -1.8057F, -15.4829F, 0.1377F, 0.057F, -0.0176F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(94, 25).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5487F, -2.2482F, -17.1691F, 0.1552F, 0.057F, -0.0176F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(95, 46).addBox(-0.5F, -0.825F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5278F, -1.5662F, -17.0132F, 0.225F, 0.057F, -0.0176F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(94, 14).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6313F, -1.8898F, -18.7262F, 0.225F, 0.057F, -0.0176F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(21, 96).addBox(-0.5F, -0.725F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5073F, -1.2239F, -18.5115F, 0.2643F, 0.057F, -0.0176F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(89, 93).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6045F, -1.4276F, -20.1514F, 0.3123F, 0.057F, -0.0176F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(96, 29).addBox(-0.5F, -0.125F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6634F, -0.9104F, -21.3426F, 0.3734F, 0.057F, -0.0176F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(82, 93).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6634F, -0.9104F, -21.3426F, 0.4083F, 0.057F, -0.0176F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(75, 93).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.7228F, -0.2651F, -22.5836F, 0.4781F, 0.057F, -0.0176F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(7, 87).addBox(-0.6345F, -0.4069F, 0.5139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6711F, 0.9786F, -24.4225F, 0.5479F, 0.057F, -0.0176F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(0, 87).addBox(-0.8624F, -0.7364F, -0.5126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.1239F, -2.6003F, -0.3224F, 0.1456F, -0.153F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(69, 22).addBox(-0.6726F, -0.4086F, 0.863F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.1239F, -2.6003F, -0.0254F, -0.0289F, -0.1486F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(86, 71).addBox(-0.8103F, -0.6684F, -1.9744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2157F, 1.1239F, -2.6003F, -0.5886F, 0.3354F, -0.2444F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.475F, -0.275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0758F, -0.7829F, -3.3981F, -0.2967F, 0.1047F, 0.0F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(86, 62).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0506F, -1.7425F, -5.0715F, -0.2094F, 0.0475F, -0.0315F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(68, 67).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(-0.0473F, -1.1434F, -5.1343F, -0.2269F, 0.0524F, 0.0F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(105, 101).addBox(-1.1421F, -0.7931F, -0.6266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6915F, -1.2654F, -3.9613F, -0.6109F, 0.1571F, 0.0F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(54, 86).addBox(-0.7527F, -0.6542F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3823F, -1.0604F, -3.0918F, -0.3067F, 0.1023F, -0.0158F));

		return LayerDefinition.create(meshdefinition, 115, 115);
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
