package fossils.fossils.client.blockentity.model.deinocheirus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DeinocheirusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck2;
	private final ModelPart neck9;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
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

	public DeinocheirusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body2 = this.body4.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck7 = this.neck3.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck2 = this.neck8.getChild("neck2");
		this.neck9 = this.neck2.getChild("neck9");
		this.neck = this.neck9.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.288F, 1.5877F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(175, 25).addBox(-0.5F, -2.8F, -2.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(0, 90).addBox(-0.5F, -2.8F, -2.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -19.2479F, 3.8745F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(101, 172).addBox(-0.5F, -8.7F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 100).addBox(-0.5F, -6.5F, 0.0F, 1.0F, 16.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -15.4601F, 0.0466F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(150, 164).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -9.9659F, 15.9482F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 175).addBox(-0.5F, 0.0105F, 0.5735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.953F, 14.7769F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 117).addBox(-0.5F, 0.0105F, -0.4265F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -13.6088F, 12.2752F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 49).addBox(-0.5F, -14.7895F, -1.0265F, 1.0F, 14.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -7.5F, -2.4F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-3.0F, 1.0F, 1.0F, 2.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 0).addBox(1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1F, -6.1F, -0.4189F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.2496F, -5.0564F, -0.3905F, -0.0973F, -0.007F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 152).addBox(-0.5F, -5.562F, -2.2321F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.5916F, -0.184F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(79, 137).addBox(-0.5F, -2.0034F, -2.0509F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -13.5916F, -0.184F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 130).addBox(-0.5F, -14.0804F, -0.7492F, 1.0F, 14.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.284F, -1.6952F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 140).addBox(-0.5F, -2.1959F, -1.5312F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -12.7444F, -4.2386F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 130).addBox(-0.5F, -2.0F, -0.75F, 1.0F, 13.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 147).addBox(-0.5F, -7.0F, -1.75F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.7444F, -4.2386F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(83, 117).addBox(-0.5F, -16.4983F, -1.2849F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7947F, -7.226F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(167, 95).mirror().addBox(-2.8767F, -0.0436F, -0.36F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4F, -5.4F, -0.3833F, -0.0163F, -0.0768F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(167, 60).mirror().addBox(-5.4725F, -1.4904F, -0.6025F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4F, -5.4F, -0.3433F, -0.1221F, -0.5999F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(43, 74).mirror().addBox(-7.4306F, -4.5105F, -0.6025F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4F, -5.4F, -0.2015F, -0.3047F, -1.2445F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(134, 17).mirror().addBox(-10.4784F, -4.4705F, -1.1614F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.07F, -2.5306F, -7.7519F, -0.148F, -0.1473F, -1.2566F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(166, 87).mirror().addBox(-5.4861F, -1.4295F, -1.1614F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.07F, -2.5306F, -7.7519F, -0.2066F, -0.0277F, -0.6101F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(167, 8).mirror().addBox(-2.9049F, 0.0301F, -0.9167F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.07F, -2.5306F, -7.7519F, -0.218F, -0.0034F, -0.0785F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(167, 95).addBox(-0.1233F, -0.0436F, -0.36F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4F, -5.4F, -0.3833F, 0.0163F, 0.0768F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(167, 60).addBox(2.4725F, -1.4904F, -0.6025F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4F, -5.4F, -0.3433F, 0.1221F, 0.5999F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 74).addBox(3.4306F, -4.5105F, -0.6025F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4F, -5.4F, -0.2015F, 0.3047F, 1.2445F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(134, 17).addBox(3.4784F, -4.4705F, -1.1614F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.07F, -2.5306F, -7.7519F, -0.148F, 0.1473F, 1.2566F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(166, 87).addBox(2.4861F, -1.4295F, -1.1614F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.07F, -2.5306F, -7.7519F, -0.2066F, 0.0277F, 0.6101F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(167, 8).addBox(-0.0951F, 0.0301F, -0.9167F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.07F, -2.5306F, -7.7519F, -0.218F, 0.0034F, 0.0785F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(37, 17).addBox(-5.0F, -6.0F, 0.0F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.9628F, -11.5061F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(23, 90).addBox(-4.0F, -3.9045F, -5.0859F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.347F, -19.3639F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 49).addBox(-4.0F, -5.9011F, -7.9852F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.8628F, -11.5061F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(134, 9).addBox(-1.0F, -0.2F, 5.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.5F, -8.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(105, 0).addBox(-1.0F, -2.9061F, -7.9605F, 2.0F, 3.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.5F, -0.4887F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9556F, -2.9736F, -10.6848F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(164, 120).mirror().addBox(-2.7163F, -0.0968F, -0.218F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1606F, -1.4118F, -1.435F, 0.0598F, 0.0232F, -0.146F));

		PartDefinition cube_r32 = body4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(28, 166).mirror().addBox(-5.3198F, -1.459F, -0.4462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1606F, -1.4118F, -1.435F, 0.0204F, 0.1356F, -0.6681F));

		PartDefinition cube_r33 = body4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(110, 73).mirror().addBox(-14.3285F, -4.3927F, -0.4462F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1606F, -1.4118F, -1.435F, -0.0668F, 0.1198F, -1.328F));

		PartDefinition cube_r34 = body4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(87, 169).mirror().addBox(-2.9453F, -0.1865F, -0.2623F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9203F, -2.0749F, -4.1998F, 0.1635F, 0.0382F, -0.1428F));

		PartDefinition cube_r35 = body4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(169, 74).mirror().addBox(-5.4685F, -1.6504F, -0.5073F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9203F, -2.0749F, -4.1998F, 0.1042F, 0.1999F, -0.6541F));

		PartDefinition cube_r36 = body4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(89, 61).mirror().addBox(-18.33F, -4.635F, -0.5073F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9203F, -2.0749F, -4.1998F, -0.041F, 0.2214F, -1.3236F));

		PartDefinition cube_r37 = body4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(89, 61).addBox(3.33F, -4.635F, -0.5073F, 15.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9909F, -2.0749F, -4.1998F, -0.041F, -0.2214F, 1.3236F));

		PartDefinition cube_r38 = body4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(169, 74).addBox(2.4685F, -1.6504F, -0.5073F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9909F, -2.0749F, -4.1998F, 0.1042F, -0.1999F, 0.6541F));

		PartDefinition cube_r39 = body4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(87, 169).addBox(-0.0547F, -0.1865F, -0.2623F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9909F, -2.0749F, -4.1998F, 0.1635F, -0.0382F, 0.1428F));

		PartDefinition cube_r40 = body4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(108, 133).addBox(-5.4556F, -10.407F, -0.1325F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6819F, -4.9693F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(110, 73).addBox(3.3285F, -4.3927F, -0.4462F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7506F, -1.4118F, -1.435F, -0.0668F, -0.1198F, 1.328F));

		PartDefinition cube_r42 = body4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(28, 166).addBox(2.3198F, -1.459F, -0.4462F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7506F, -1.4118F, -1.435F, 0.0204F, -0.1356F, 0.6681F));

		PartDefinition cube_r43 = body4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(164, 120).addBox(-0.2837F, -0.0968F, -0.218F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7506F, -1.4118F, -1.435F, 0.0598F, -0.0232F, 0.146F));

		PartDefinition cube_r44 = body4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(90, 124).addBox(-5.4556F, -13.0286F, 0.2846F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9661F, -2.4026F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 120).addBox(-5.9556F, -2.4305F, -6.123F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body2 = body4.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(-22.0954F, -4.6739F, -0.528F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8368F, -1.3118F, -2.135F, -0.1446F, -0.1936F, -1.3251F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(164, 157).mirror().addBox(-5.306F, -1.824F, -0.528F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8368F, -1.3118F, -2.135F, -0.2319F, -0.0666F, -0.6769F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(114, 59).mirror().addBox(-2.8939F, -0.4175F, -0.2933F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8368F, -1.3118F, -2.135F, -0.2596F, -0.0242F, -0.1459F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-22.8277F, -4.6761F, -0.5501F, 20.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8965F, -1.6749F, -5.0998F, -0.1233F, -0.1089F, -1.3283F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(169, 122).mirror().addBox(-5.095F, -1.9887F, -0.5501F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8965F, -1.6749F, -5.0998F, -0.1639F, -0.0119F, -0.6796F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(167, 10).mirror().addBox(-2.7963F, -0.6651F, -0.33F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8965F, -1.6749F, -5.0998F, -0.1732F, -0.0114F, -0.1474F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(74, 15).addBox(3.0954F, -4.6739F, -0.528F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0743F, -1.3118F, -2.135F, -0.1446F, 0.1936F, 1.3251F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(164, 157).addBox(2.306F, -1.824F, -0.528F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0743F, -1.3118F, -2.135F, -0.2319F, 0.0666F, 0.6769F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(114, 59).addBox(-0.1061F, -0.4175F, -0.2933F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0743F, -1.3118F, -2.135F, -0.2596F, 0.0242F, 0.1459F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 74).addBox(2.8277F, -4.6761F, -0.5501F, 20.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0147F, -1.6749F, -5.0998F, -0.1233F, 0.1089F, 1.3283F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(169, 122).addBox(2.095F, -1.9887F, -0.5501F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0147F, -1.6749F, -5.0998F, -0.1639F, 0.0119F, 0.6796F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(167, 10).addBox(-0.2037F, -0.6651F, -0.33F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0147F, -1.6749F, -5.0998F, -0.1732F, 0.0114F, 0.1474F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(93, 105).addBox(-5.4556F, -7.9286F, -1.6154F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9231F, -0.8539F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(32, 147).addBox(-5.4556F, -5.107F, -0.6325F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7589F, -4.9534F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(108, 80).addBox(-5.9556F, -2.4305F, -7.123F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1448F, -5.6003F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 13).mirror().addBox(-21.8099F, -4.7613F, -0.6277F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8112F, 0.5F, -2.8F, -0.2069F, -0.4217F, -1.3061F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(19, 166).mirror().addBox(-5.1327F, -2.0671F, -0.6277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8112F, 0.5F, -2.8F, -0.4191F, -0.2122F, -0.6507F));

		PartDefinition cube_r63 = body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(125, 102).mirror().addBox(-2.8746F, -0.7121F, -0.4026F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8112F, 0.5F, -2.8F, -0.493F, -0.0575F, -0.1363F));

		PartDefinition cube_r64 = body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(74, 17).mirror().addBox(-20.013F, -0.7326F, -0.4595F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.9112F, -0.3F, -5.5F, -0.1804F, -0.3289F, -1.3158F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(169, 72).mirror().addBox(-2.0481F, 0.644F, -0.4595F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.9112F, -0.3F, -5.5F, -0.3419F, -0.1535F, -0.6648F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(169, 70).mirror().addBox(1.1542F, 0.0876F, -0.5529F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.9112F, -0.3F, -5.5F, -0.3978F, -0.0442F, -0.1411F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(74, 13).addBox(2.8099F, -4.7613F, -0.6277F, 19.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, 0.5F, -2.8F, -0.2069F, 0.4217F, 1.3061F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(19, 166).addBox(2.1327F, -2.0671F, -0.6277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, 0.5F, -2.8F, -0.4191F, 0.2122F, 0.6507F));

		PartDefinition cube_r69 = body3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(125, 102).addBox(-0.1254F, -0.7121F, -0.4026F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, 0.5F, -2.8F, -0.493F, 0.0575F, 0.1363F));

		PartDefinition cube_r70 = body3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(74, 17).addBox(2.013F, -0.7326F, -0.4595F, 18.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.5F, -0.1804F, 0.3289F, 1.3158F));

		PartDefinition cube_r71 = body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(169, 72).addBox(-0.9519F, 0.644F, -0.4595F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.5F, -0.3419F, 0.1535F, 0.6648F));

		PartDefinition cube_r72 = body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(169, 70).addBox(-4.1542F, 0.0876F, -0.5529F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.5F, -0.3978F, 0.0442F, 0.1411F));

		PartDefinition cube_r73 = body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(58, 169).addBox(-5.4556F, -3.2286F, -1.2154F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5954F, -1.5149F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(168, 144).addBox(-5.4556F, -2.407F, -1.0325F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2523F, -4.7149F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(126, 0).addBox(-5.9556F, -2.4305F, -6.123F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.2F, -0.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9556F, 0.1124F, -5.8308F, -0.0913F, -0.083F, 0.0512F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(139, 171).addBox(-0.5F, -2.3682F, -0.1375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2566F, -2.8963F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(89, 152).addBox(-0.5F, -2.1595F, -0.0718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1566F, -4.9963F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(170, 6).mirror().addBox(-2.7573F, -0.4873F, -0.6176F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.057F, -7.2087F, -0.0406F, -0.0107F, -0.2511F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(-14.9611F, -4.5526F, -0.8378F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.057F, -7.2087F, -0.0735F, 0.0141F, -1.4329F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(10, 170).mirror().addBox(-5.1257F, -1.8095F, -0.8378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.057F, -7.2087F, -0.0498F, 0.0559F, -0.7793F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(-16.9611F, -4.5526F, -0.8378F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -4.5087F, -0.0904F, -0.1069F, -1.3798F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(19, 168).mirror().addBox(-5.1257F, -1.8095F, -0.8378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -4.5087F, -0.1366F, -0.03F, -0.7281F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(167, 97).mirror().addBox(-2.7573F, -0.4873F, -0.6176F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.157F, -4.5087F, -0.159F, -0.0409F, -0.1957F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(85, 78).mirror().addBox(-19.0648F, -4.5165F, -0.8824F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.657F, -2.5087F, -0.1254F, -0.1444F, -1.3795F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(170, 16).mirror().addBox(-5.186F, -1.7177F, -0.8824F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.657F, -2.5087F, -0.187F, -0.0388F, -0.7305F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(170, 4).mirror().addBox(-2.7671F, -0.3765F, -0.6587F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0131F, -0.657F, -2.5087F, -0.2069F, -0.023F, -0.1983F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(-11.8F, 0.0F, -0.4F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6507F, 13.529F, -11.9507F, -0.7537F, 0.6861F, -0.4041F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(110, 75).mirror().addBox(-9.8F, 0.0F, 0.2F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2676F, 13.0771F, -12.3398F, -0.6539F, 0.6276F, -0.2623F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(114, 57).mirror().addBox(-8.2F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4199F, 13.1378F, -12.2085F, -0.5581F, 0.7312F, -0.1782F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(170, 6).addBox(-0.2427F, -0.4873F, -0.6176F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.057F, -7.2087F, -0.0406F, 0.0107F, 0.2511F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(108, 91).addBox(2.9611F, -4.5526F, -0.8378F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.057F, -7.2087F, -0.0735F, -0.0141F, 1.4329F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(10, 170).addBox(2.1257F, -1.8095F, -0.8378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.057F, -7.2087F, -0.0498F, -0.0559F, 0.7793F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(99, 43).addBox(2.9611F, -4.5526F, -0.8378F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -4.5087F, -0.0904F, 0.1069F, 1.3798F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(19, 168).addBox(2.1257F, -1.8095F, -0.8378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -4.5087F, -0.1366F, 0.03F, 0.7281F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(167, 97).addBox(-0.2427F, -0.4873F, -0.6176F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.157F, -4.5087F, -0.159F, 0.0409F, 0.1957F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(85, 78).addBox(3.0648F, -4.5165F, -0.8824F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.657F, -2.5087F, -0.1254F, 0.1444F, 1.3795F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(170, 16).addBox(2.186F, -1.7177F, -0.8824F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.657F, -2.5087F, -0.187F, 0.0388F, 0.7305F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(170, 4).addBox(-0.2329F, -0.3765F, -0.6587F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0131F, -0.657F, -2.5087F, -0.2069F, 0.023F, 0.1983F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(171, 135).addBox(-0.5F, -2.1961F, -1.4884F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0991F, -6.099F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(130, 40).addBox(-1.0F, 0.2F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7768F, -12.1223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(99, 45).addBox(-0.2F, 0.0F, -0.4F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6507F, 13.529F, -11.9507F, -0.7537F, -0.6861F, 0.4041F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(110, 75).addBox(-0.2F, 0.0F, 0.2F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2676F, 13.0771F, -12.3398F, -0.6539F, -0.6276F, 0.2623F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(114, 57).addBox(-0.8F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4199F, 13.1378F, -12.2085F, -0.5581F, -0.7312F, 0.1782F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 64).addBox(-1.0F, -0.1F, -9.8F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -0.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2074F, 9.7513F, -13.1242F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(133, 47).addBox(-0.5F, -2.5F, -2.3F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8389F, 0.9092F, 1.0001F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(162, 123).addBox(-0.5129F, -1.7558F, -1.4248F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9274F, -3.0825F, 0.6498F, 0.3284F, 0.6024F, 0.2465F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(80, 165).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4654F, -4.3903F, 0.9675F, 0.5466F, 0.6024F, 0.2465F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(115, 133).addBox(-0.5129F, -2.3308F, -3.3881F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9274F, -3.0825F, 0.6498F, 0.9829F, 0.6024F, 0.2465F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(72, 105).addBox(-0.5F, -0.6F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2469F, -9.4801F, 8.5621F, 0.7019F, 0.2765F, -0.1452F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 163).addBox(-0.1746F, -4.0649F, 0.3346F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.8672F, -0.7996F, 4.0041F, 1.0073F, 0.2765F, -0.1452F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(125, 93).addBox(-0.1746F, -2.8429F, -0.2156F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.8672F, -0.7996F, 4.0041F, 0.9026F, 0.2765F, -0.1452F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2074F, 9.7513F, -13.1242F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r112 = bone3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(133, 47).mirror().addBox(-0.5F, -2.5F, -2.3F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8389F, -0.9092F, -1.0001F));

		PartDefinition cube_r113 = bone3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(162, 123).mirror().addBox(-0.4871F, -1.7558F, -1.4248F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9274F, -3.0825F, 0.6498F, 0.3284F, -0.6024F, -0.2465F));

		PartDefinition cube_r114 = bone3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(80, 165).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4654F, -4.3903F, 0.9675F, 0.5466F, -0.6024F, -0.2465F));

		PartDefinition cube_r115 = bone3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(115, 133).mirror().addBox(-0.4871F, -2.3308F, -3.3881F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9274F, -3.0825F, 0.6498F, 0.9829F, -0.6024F, -0.2465F));

		PartDefinition cube_r116 = bone3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(72, 105).mirror().addBox(-0.5F, -0.6F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2469F, -9.4801F, 8.5621F, 0.7019F, -0.2765F, 0.1452F));

		PartDefinition cube_r117 = bone3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(65, 163).mirror().addBox(-0.8254F, -4.0649F, 0.3346F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8672F, -0.7996F, 4.0041F, 1.0073F, -0.2765F, 0.1452F));

		PartDefinition cube_r118 = bone3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(125, 93).mirror().addBox(-0.8254F, -2.8429F, -0.2156F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8672F, -0.7996F, 4.0041F, 0.9026F, -0.2765F, 0.1452F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9964F, 10.1957F, -12.1282F, -0.8065F, 0.5711F, -0.7857F));

		PartDefinition cube_r119 = leftArm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(108, 124).addBox(-0.5F, 0.0F, -4.6F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4393F, 0.6635F, 3.4606F, -0.2835F, -0.1153F, -0.3762F));

		PartDefinition cube_r120 = leftArm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(137, 149).addBox(-1.0F, -0.6F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.447F, 13.2691F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftArm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(51, 122).addBox(-1.0F, -2.0F, -3.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0496F, 1.2093F, 2.0519F, -0.2359F, -0.0065F, 0.0651F));

		PartDefinition cube_r122 = leftArm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(124, 150).addBox(-1.0F, -0.7F, 0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0038F, -0.1845F, 8.9116F, -0.105F, -0.0065F, 0.0651F));

		PartDefinition cube_r123 = leftArm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(80, 160).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0038F, -0.1845F, 8.9116F, 0.0259F, -0.0065F, 0.0651F));

		PartDefinition cube_r124 = leftArm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(58, 149).addBox(-1.0F, -0.7F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.5F, 0.2005F, -0.0065F, 0.0651F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2076F, 2.3638F, 14.9111F, 0.281F, -0.3263F, -0.1036F));

		PartDefinition cube_r125 = leftArm2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(167, 89).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 6.2715F, -0.2545F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftArm2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(60, 161).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftArm2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(164, 175).addBox(-0.5F, -3.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.7875F, 1.3626F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftArm2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(175, 176).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4583F, 1.52F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftArm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(169, 150).addBox(-0.5F, -3.9F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9002F, 0.7412F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftArm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(73, 142).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(152, 129).addBox(-0.6F, -1.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0532F, 9.0401F, 0.7037F, 0.4367F, 0.0057F, 0.3489F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0644F, 2.0906F, 0.0136F, -0.2084F, -0.0651F, -0.2986F));

		PartDefinition cube_r131 = leftArm4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(153, 98).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r132 = leftArm4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(27, 134).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0945F, 2.0376F, 1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r133 = leftArm5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(154, 34).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7941F, 4.8296F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r134 = leftArm5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(108, 165).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0945F, 2.0544F, 1.7439F, 0.1249F, 0.0393F, -0.303F));

		PartDefinition cube_r135 = leftArm6.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(57, 155).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r136 = leftArm6.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(131, 166).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9964F, 10.1957F, -12.1282F, -0.7273F, -0.5404F, 0.6359F));

		PartDefinition cube_r137 = rightArm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(123, 124).addBox(-0.5F, 0.0F, -4.6F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4393F, 0.6635F, 3.4606F, -0.2835F, 0.1153F, 0.3762F));

		PartDefinition cube_r138 = rightArm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(151, 123).addBox(-1.0F, -0.6F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.447F, 13.2691F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightArm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(123, 104).addBox(-1.0F, -2.0F, -3.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0496F, 1.2093F, 2.0519F, -0.2359F, 0.0065F, -0.0651F));

		PartDefinition cube_r140 = rightArm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(151, 92).addBox(-1.0F, -0.7F, 0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0038F, -0.1845F, 8.9116F, -0.105F, 0.0065F, -0.0651F));

		PartDefinition cube_r141 = rightArm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(110, 160).addBox(-1.0F, -0.7F, -1.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0038F, -0.1845F, 8.9116F, 0.0259F, 0.0065F, -0.0651F));

		PartDefinition cube_r142 = rightArm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(69, 151).addBox(-1.0F, -0.7F, -2.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.5F, 0.2005F, 0.0065F, -0.0651F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2076F, 2.3638F, 14.9111F, 0.3029F, 0.4935F, 0.1583F));

		PartDefinition cube_r143 = rightArm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(5, 168).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 6.2715F, -0.2545F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightArm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(162, 92).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightArm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(175, 168).addBox(-0.5F, -3.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 8.7875F, 1.3626F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightArm2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(100, 177).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4583F, 1.52F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightArm2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(169, 159).addBox(-0.5F, -3.9F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9002F, 0.7412F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightArm2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(105, 156).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(148, 152).addBox(-0.4F, -1.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0532F, 9.0401F, 0.7037F, 0.4367F, -0.0057F, -0.3489F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0644F, 2.0906F, 0.0136F, -0.2084F, 0.0651F, 0.2986F));

		PartDefinition cube_r149 = rightArm4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(154, 16).addBox(0.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r150 = rightArm4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(139, 34).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0945F, 2.0376F, 1.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r151 = rightArm5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(113, 154).addBox(0.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7941F, 4.8296F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r152 = rightArm5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(113, 165).addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0945F, 2.0544F, 1.7439F, 0.1249F, -0.0393F, 0.303F));

		PartDefinition cube_r153 = rightArm6.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(96, 156).addBox(0.0F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5353F, 3.8637F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r154 = rightArm6.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(167, 54).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4685F, -9.6561F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(139, 131).addBox(-1.0F, 0.1F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.1F, -2.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(77, 166).mirror().addBox(0.0F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2386F, 3.2477F, -0.2963F, 0.3377F, -0.0883F, 0.2961F));

		PartDefinition cube_r157 = neck5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(90, 177).mirror().addBox(-0.2163F, -0.8945F, -0.874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(168, 21).mirror().addBox(-0.2163F, -1.2945F, -1.874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8991F, -0.5146F, -1.7466F, 2.1774F, -0.1393F, 0.4529F));

		PartDefinition cube_r158 = neck5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(171, 140).mirror().addBox(-1.5791F, -0.4693F, -0.3593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1739F, -1.6772F, -1.4344F, 1.7493F, -0.1548F, -1.3071F));

		PartDefinition cube_r159 = neck5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(177, 0).mirror().addBox(-0.3374F, -0.5222F, -0.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1739F, -1.6772F, -1.6344F, 1.5971F, -0.2034F, -0.6386F));

		PartDefinition cube_r160 = neck5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(149, 174).mirror().addBox(-0.2163F, -1.3336F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.8991F, -0.5146F, -1.7466F, 2.4828F, -0.1393F, 0.4529F));

		PartDefinition cube_r161 = neck5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(164, 44).mirror().addBox(0.1588F, -0.4182F, -2.6994F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8991F, -0.5146F, -1.7466F, 1.7377F, -0.1564F, 0.5389F));

		PartDefinition cube_r162 = neck5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(25, 177).mirror().addBox(0.2545F, 2.0215F, -1.0816F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8991F, -0.5146F, -1.7466F, 0.4359F, -0.1714F, 0.5465F));

		PartDefinition cube_r163 = neck5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(171, 140).addBox(-0.4209F, -0.4693F, -0.3593F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1739F, -1.6772F, -1.4344F, 1.7493F, 0.1548F, 1.3071F));

		PartDefinition cube_r164 = neck5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(170, 33).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2929F, -2.59F, -0.9612F, 1.4108F, -0.0632F, 0.6314F));

		PartDefinition cube_r165 = neck5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(170, 33).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2929F, -2.59F, -0.9612F, 1.4108F, 0.0632F, -0.6314F));

		PartDefinition cube_r166 = neck5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(177, 0).addBox(-0.6626F, -0.5222F, -0.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1739F, -1.6772F, -1.6344F, 1.5971F, 0.2034F, 0.6386F));

		PartDefinition cube_r167 = neck5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(90, 177).addBox(-0.7837F, -0.8945F, -0.874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(168, 21).addBox(-0.7837F, -1.2945F, -1.874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8991F, -0.5146F, -1.7466F, 2.1774F, 0.1393F, -0.4529F));

		PartDefinition cube_r168 = neck5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(149, 174).addBox(-0.7837F, -1.3336F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.8991F, -0.5146F, -1.7466F, 2.4828F, 0.1393F, -0.4529F));

		PartDefinition cube_r169 = neck5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(164, 44).addBox(-0.1588F, -0.4182F, -2.6994F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8991F, -0.5146F, -1.7466F, 1.7377F, 0.1564F, -0.5389F));

		PartDefinition cube_r170 = neck5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(77, 166).addBox(0.0F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2386F, 3.2477F, -0.2963F, 0.3377F, 0.0883F, -0.2961F));

		PartDefinition cube_r171 = neck5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(25, 177).addBox(-0.2545F, 2.0215F, -1.0816F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8991F, -0.5146F, -1.7466F, 0.4359F, 0.1714F, -0.5465F));

		PartDefinition cube_r172 = neck5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(22, 177).addBox(0.0F, -1.6F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6236F, -0.9915F, -0.096F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.19F, -4.1486F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r173 = neck4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(106, 172).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7368F, -0.5022F, -2.1365F, 2.4151F, -0.3785F, -0.1583F));

		PartDefinition cube_r174 = neck4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(95, 177).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(177, 90).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7358F, -0.5337F, -1.9371F, 1.7546F, -0.2701F, 0.0754F));

		PartDefinition cube_r175 = neck4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(149, 171).mirror().addBox(-1.8805F, -0.4476F, -1.1693F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.7523F, -2.7493F, -1.6065F, 1.4612F, -0.3498F, -1.1656F));

		PartDefinition cube_r176 = neck4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(174, 159).mirror().addBox(-0.5F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5227F, -0.6784F, -2.2951F, 1.8827F, -0.3674F, 0.137F));

		PartDefinition cube_r177 = neck4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(174, 151).mirror().addBox(-0.5882F, -1.8593F, 0.7609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7997F, -0.3015F, -1.47F, 2.0572F, -0.3674F, 0.137F));

		PartDefinition cube_r178 = neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(14, 162).mirror().addBox(-0.6303F, -2.9955F, -0.8726F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7997F, -0.3015F, -1.47F, 1.2885F, -0.2943F, -0.0182F));

		PartDefinition cube_r179 = neck4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(149, 171).addBox(-0.1195F, -0.4476F, -1.1693F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.7523F, -2.7493F, -1.6065F, 1.4612F, 0.3498F, 1.1656F));

		PartDefinition cube_r180 = neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(95, 177).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(177, 90).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7358F, -0.5337F, -1.9371F, 1.7546F, 0.2701F, -0.0754F));

		PartDefinition cube_r181 = neck4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(106, 172).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7368F, -0.5022F, -2.1365F, 2.4151F, 0.3785F, 0.1583F));

		PartDefinition cube_r182 = neck4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(174, 159).addBox(-0.5F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5227F, -0.6784F, -2.2951F, 1.8827F, 0.3674F, -0.137F));

		PartDefinition cube_r183 = neck4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(174, 151).addBox(-0.4118F, -1.8593F, 0.7609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7997F, -0.3015F, -1.47F, 2.0572F, 0.3674F, -0.137F));

		PartDefinition cube_r184 = neck4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(14, 162).addBox(-0.3697F, -2.9955F, -0.8726F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7997F, -0.3015F, -1.47F, 1.2885F, 0.2943F, 0.0182F));

		PartDefinition cube_r185 = neck4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(144, 171).mirror().addBox(-0.6903F, -0.8693F, 0.5316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9586F, -2.202F, -2.2567F, 1.3374F, 0.1583F, 0.5939F));

		PartDefinition cube_r186 = neck4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(144, 171).addBox(-0.3097F, -0.8693F, 0.5316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9586F, -2.202F, -2.2567F, 1.3374F, -0.1583F, -0.5939F));

		PartDefinition cube_r187 = neck4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(177, 12).addBox(-0.901F, -0.4356F, -1.1368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7523F, -2.7493F, -1.6065F, 1.2514F, 0.1829F, 0.5028F));

		PartDefinition cube_r188 = neck4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(153, 80).addBox(0.0F, -0.4F, -0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4621F, -0.7898F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r189 = neck4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(146, 109).addBox(-0.5F, -0.8417F, -3.8835F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 0.2F, -0.2705F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9054F, -3.3566F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r190 = neck3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(146, 116).addBox(-0.5F, -0.4F, 7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -7.0286F, -8.5275F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r191 = neck3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(49, 177).addBox(0.0F, -1.0F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1482F, -2.6393F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(171, 49).mirror().addBox(-0.7343F, -0.9498F, 0.2329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -2.0768F, -1.6112F, 1.1189F, 0.3439F, 0.517F));

		PartDefinition cube_r193 = neck3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(171, 49).addBox(-0.2657F, -0.9498F, 0.2329F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -2.0768F, -1.6112F, 1.1189F, -0.3439F, -0.517F));

		PartDefinition cube_r194 = neck3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(34, 175).mirror().addBox(-0.4717F, -0.6438F, -0.7784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.821F, -0.5064F, -2.4296F, 0.3052F, -0.1349F, 0.0473F));

		PartDefinition cube_r195 = neck3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(113, 172).mirror().addBox(-0.4717F, -0.2438F, -0.1784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7397F, 0.289F, -3.3051F, 0.9073F, -0.1349F, 0.0473F));

		PartDefinition cube_r196 = neck3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(175, 33).mirror().addBox(-0.4717F, -1.8438F, -0.4784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 175).mirror().addBox(-0.4717F, -1.8438F, -1.0784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8197F, -0.192F, -2.5487F, 0.5582F, -0.1349F, 0.0473F));

		PartDefinition cube_r197 = neck3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(33, 172).mirror().addBox(0.9048F, -1.1935F, 0.2697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8197F, -0.192F, -2.5487F, 1.1087F, -0.7581F, -0.7193F));

		PartDefinition cube_r198 = neck3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(172, 18).mirror().addBox(-0.2837F, -1.2565F, -0.6475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8197F, -0.192F, -2.5487F, 1.8547F, -0.846F, -1.6802F));

		PartDefinition cube_r199 = neck3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(10, 172).mirror().addBox(-0.2254F, -1.0903F, -0.5408F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8197F, -0.192F, -2.5487F, 0.7661F, -0.12F, -0.1147F));

		PartDefinition cube_r200 = neck3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(33, 172).addBox(-2.9048F, -1.1935F, 0.2697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8197F, -0.192F, -2.5487F, 1.1087F, 0.7581F, 0.7193F));

		PartDefinition cube_r201 = neck3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(172, 18).addBox(-1.7163F, -1.2565F, -0.6475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8197F, -0.192F, -2.5487F, 1.8547F, 0.846F, 1.6802F));

		PartDefinition cube_r202 = neck3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(10, 172).addBox(-1.7746F, -1.0903F, -0.5408F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8197F, -0.192F, -2.5487F, 0.7661F, 0.12F, 0.1147F));

		PartDefinition cube_r203 = neck3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(175, 33).addBox(-0.5283F, -1.8438F, -0.4784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 175).addBox(-0.5283F, -1.8438F, -1.0784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8197F, -0.192F, -2.5487F, 0.5582F, 0.1349F, -0.0473F));

		PartDefinition cube_r204 = neck3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(34, 175).addBox(-0.5283F, -0.6438F, -0.7784F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.821F, -0.5064F, -2.4296F, 0.3052F, 0.1349F, -0.0473F));

		PartDefinition cube_r205 = neck3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(113, 172).addBox(-0.5283F, -0.2438F, -0.1784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7397F, 0.289F, -3.3051F, 0.9073F, 0.1349F, -0.0473F));

		PartDefinition neck7 = neck3.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9763F, -2.9274F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r206 = neck7.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(66, 134).addBox(-0.5F, -0.4F, 1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -4.0F, -4.4F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck7.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(131, 172).mirror().addBox(-0.5F, -1.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.819F, 0.5663F, -2.8737F, 0.9509F, -0.1349F, 0.0473F));

		PartDefinition cube_r208 = neck7.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(175, 37).mirror().addBox(-0.8698F, -1.1661F, -3.439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false)
				.texOffs(170, 174).mirror().addBox(-0.8698F, -1.1661F, -3.039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4946F, -2.3971F, -1.4797F, 0.6891F, -0.1349F, 0.0473F));

		PartDefinition cube_r209 = neck7.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(145, 44).mirror().addBox(-1.0968F, -0.6528F, -0.8098F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4946F, -2.3971F, -1.4797F, 1.0386F, -0.6109F, -0.7307F));

		PartDefinition cube_r210 = neck7.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(85, 174).mirror().addBox(-0.8329F, -1.3561F, -2.7011F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4946F, -2.3971F, -1.4797F, 1.0705F, -0.0801F, -0.1453F));

		PartDefinition cube_r211 = neck7.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(126, 9).mirror().addBox(-2.5224F, -0.6805F, -0.2902F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4946F, -2.3971F, -1.4797F, 1.6354F, -0.7972F, -1.5751F));

		PartDefinition cube_r212 = neck7.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(131, 172).addBox(-0.5F, -1.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.819F, 0.5663F, -2.8737F, 0.9509F, 0.1349F, -0.0473F));

		PartDefinition cube_r213 = neck7.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(175, 37).addBox(-0.1302F, -1.1661F, -3.439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.23F))
				.texOffs(170, 174).addBox(-0.1302F, -1.1661F, -3.039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4946F, -2.3971F, -1.4797F, 0.6891F, 0.1349F, -0.0473F));

		PartDefinition cube_r214 = neck7.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(145, 44).addBox(-0.9032F, -0.6528F, -0.8098F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4946F, -2.3971F, -1.4797F, 1.0386F, 0.6109F, 0.7307F));

		PartDefinition cube_r215 = neck7.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(85, 174).addBox(-1.1671F, -1.3561F, -2.7011F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4946F, -2.3971F, -1.4797F, 1.0705F, 0.0801F, 0.1453F));

		PartDefinition cube_r216 = neck7.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(126, 9).addBox(0.5224F, -0.6805F, -0.2902F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4946F, -2.3971F, -1.4797F, 1.6354F, 0.7972F, 1.5751F));

		PartDefinition cube_r217 = neck7.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(171, 44).mirror().addBox(-0.7451F, -3.9983F, 0.2446F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -0.5482F, 0.4164F, 1.0316F, 0.3439F, 0.517F));

		PartDefinition cube_r218 = neck7.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(171, 44).addBox(-0.2549F, -3.9983F, 0.2446F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -0.5482F, 0.4164F, 1.0316F, -0.3439F, -0.517F));

		PartDefinition cube_r219 = neck7.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(144, 155).addBox(0.0F, -0.9F, 0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4386F, -1.5387F, -0.6196F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3015F, -4.371F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r220 = neck8.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(14, 134).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.7F, 0.1F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck8.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(156, 172).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6554F, -0.0189F, -2.5275F, 0.9591F, -0.1308F, 0.0578F));

		PartDefinition cube_r222 = neck8.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(58, 175).mirror().addBox(-0.5F, -2.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 21).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7534F, -0.4342F, -1.6013F, 0.61F, -0.1308F, 0.0578F));

		PartDefinition cube_r223 = neck8.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(174, 108).mirror().addBox(-1.2455F, 1.8447F, -1.7351F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -3.4679F, -3.017F, 0.949F, -0.0972F, -0.1346F));

		PartDefinition cube_r224 = neck8.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(172, 57).mirror().addBox(-1.6267F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -2.1752F, -1.1595F, 1.7427F, -0.6686F, -1.5538F));

		PartDefinition cube_r225 = neck8.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(172, 54).mirror().addBox(-0.385F, -0.4748F, -0.37F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -2.1752F, -1.1595F, 1.2183F, -0.5829F, -0.7387F));

		PartDefinition cube_r226 = neck8.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(174, 108).addBox(-0.7545F, 1.8447F, -1.7351F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, -3.4679F, -3.017F, 0.949F, 0.0972F, 0.1346F));

		PartDefinition cube_r227 = neck8.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(156, 172).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6554F, -0.0189F, -2.5275F, 0.9591F, 0.1308F, -0.0578F));

		PartDefinition cube_r228 = neck8.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(58, 175).addBox(-0.5F, -2.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 21).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7534F, -0.4342F, -1.6013F, 0.61F, 0.1308F, -0.0578F));

		PartDefinition cube_r229 = neck8.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(172, 57).addBox(-0.3733F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4659F, -2.1752F, -1.1595F, 1.7427F, 0.6686F, 1.5538F));

		PartDefinition cube_r230 = neck8.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(172, 54).addBox(-1.615F, -0.4748F, -0.37F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4659F, -2.1752F, -1.1595F, 1.2183F, 0.5829F, 0.7387F));

		PartDefinition cube_r231 = neck8.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(110, 156).addBox(0.0F, 0.0F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.759F, -0.8743F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck8.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(50, 172).mirror().addBox(-0.6213F, 2.8015F, 0.0917F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, -5.1679F, -4.217F, 0.9992F, 0.361F, 0.5058F));

		PartDefinition cube_r233 = neck8.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(50, 172).addBox(-0.3787F, 2.8015F, 0.0917F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9282F, -5.1679F, -4.217F, 0.9992F, -0.361F, -0.5058F));

		PartDefinition neck2 = neck8.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.5755F, -2.8037F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(153, 54).addBox(-0.5F, 0.0F, 4.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9092F, -5.1F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r235 = neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(176, 41).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7863F, 1.4037F, -0.7871F, 0.8728F, -0.1372F, 0.0401F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(174, 102).mirror().addBox(-1.2118F, -3.5002F, -1.3332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9282F, 1.2175F, 1.1659F, 0.949F, -0.0972F, -0.1346F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(171, 62).mirror().addBox(-1.6267F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -0.797F, -1.1805F, 1.7903F, -0.6683F, -1.6058F));

		PartDefinition cube_r238 = neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(171, 81).mirror().addBox(-0.385F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -0.797F, -1.1805F, 1.2494F, -0.6101F, -0.7786F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(39, 176).mirror().addBox(-0.6888F, -4.3359F, -1.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8563F, 2.2665F, 0.849F, 0.7419F, -0.1372F, 0.0401F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(174, 102).addBox(-0.7882F, -3.5002F, -1.3332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9282F, 1.2175F, 1.1659F, 0.949F, 0.0972F, 0.1346F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 179).addBox(0.0F, -0.6132F, 1.9835F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4034F, -1.8746F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(171, 62).addBox(-0.3733F, -0.4623F, -0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.4659F, -0.797F, -1.1805F, 1.7903F, 0.6683F, 1.6058F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(171, 81).addBox(-1.615F, -0.5248F, -0.27F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4659F, -0.797F, -1.1805F, 1.2494F, 0.6101F, 0.7786F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(118, 174).mirror().addBox(-0.5F, 0.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5235F, -3.1338F, -1.9314F, 0.9463F, 0.3622F, 0.524F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(118, 174).addBox(-0.5F, 0.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5235F, -3.1338F, -1.9314F, 0.9463F, -0.3622F, -0.524F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(176, 41).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7863F, 1.4037F, -0.7871F, 0.8728F, 0.1372F, -0.0401F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(39, 176).addBox(-0.3112F, -4.3359F, -1.1139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8563F, 2.2665F, 0.849F, 0.7419F, 0.1372F, -0.0401F));

		PartDefinition neck9 = neck2.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1265F, -2.6013F, -0.4331F, -0.0552F, -0.1188F));

		PartDefinition cube_r248 = neck9.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(143, 19).addBox(-0.5F, 0.0F, 3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -5.5F, -4.7F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck9.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(45, 170).mirror().addBox(-0.5F, -2.2F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7741F, -0.3364F, -1.4158F, 0.8313F, -0.1427F, 0.0093F));

		PartDefinition cube_r250 = neck9.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(22, 174).mirror().addBox(-0.5443F, -1.3124F, 0.1112F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1999F, -1.8927F, -1.1755F, 1.4214F, -0.4498F, -0.866F));

		PartDefinition cube_r251 = neck9.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(173, 119).mirror().addBox(-1.5275F, -1.2378F, 0.1177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1999F, -1.8927F, -1.1755F, 1.7819F, -0.4502F, -1.6013F));

		PartDefinition cube_r252 = neck9.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(174, 105).mirror().addBox(-0.9643F, -1.0571F, -1.3011F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1999F, -1.8927F, -1.4755F, 1.1657F, -0.0659F, -0.1523F));

		PartDefinition cube_r253 = neck9.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(174, 105).addBox(-1.0357F, -1.0571F, -1.3011F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1999F, -1.8927F, -1.4755F, 1.1657F, 0.0659F, 0.1523F));

		PartDefinition cube_r254 = neck9.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(3, 179).addBox(0.0F, -0.8132F, 0.5835F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9942F, -1.4746F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r255 = neck9.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(173, 119).addBox(-0.4725F, -1.2378F, 0.1177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1999F, -1.8927F, -1.1755F, 1.7819F, 0.4502F, 1.6013F));

		PartDefinition cube_r256 = neck9.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(22, 174).addBox(-1.4557F, -1.3124F, 0.1112F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1999F, -1.8927F, -1.1755F, 1.4214F, 0.4498F, 0.866F));

		PartDefinition cube_r257 = neck9.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(40, 170).mirror().addBox(-0.7897F, -2.3628F, 0.8622F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1999F, -1.8927F, -1.4755F, 1.1408F, 0.2472F, 0.5826F));

		PartDefinition cube_r258 = neck9.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(40, 170).addBox(-0.2103F, -2.3628F, 0.8622F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1999F, -1.8927F, -1.4755F, 1.1408F, -0.2472F, -0.5826F));

		PartDefinition cube_r259 = neck9.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(45, 170).addBox(-0.5F, -2.2F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7741F, -0.3364F, -1.4158F, 0.8313F, 0.1427F, -0.0093F));

		PartDefinition neck = neck9.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -2.4655F, -2.9692F));

		PartDefinition cube_r260 = neck.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(92, 174).mirror().addBox(-1.2507F, -1.1387F, -1.4949F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9164F, -1.1222F, -1.3397F, 1.5019F, -0.0115F, -0.1654F));

		PartDefinition cube_r261 = neck.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(80, 170).mirror().addBox(-0.5F, -2.4F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8328F, 0.522F, -0.9123F, 1.2623F, -0.1375F, -0.0392F));

		PartDefinition cube_r262 = neck.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(174, 148).mirror().addBox(-1.3001F, -1.3128F, 0.052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9164F, -1.1222F, -1.3397F, 1.554F, -0.0679F, -1.3262F));

		PartDefinition cube_r263 = neck.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(169, 178).mirror().addBox(-0.3236F, -1.3328F, 0.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9164F, -1.1222F, -1.3397F, 1.4969F, -0.0154F, -0.6684F));

		PartDefinition cube_r264 = neck.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(92, 174).addBox(-0.7493F, -1.1387F, -1.4949F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9164F, -1.1222F, -1.3397F, 1.5019F, 0.0115F, 0.1654F));

		PartDefinition cube_r265 = neck.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(80, 170).addBox(-0.5F, -2.4F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8328F, 0.522F, -0.9123F, 1.2623F, 0.1375F, 0.0392F));

		PartDefinition cube_r266 = neck.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(174, 148).addBox(-0.6999F, -1.3128F, 0.052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9164F, -1.1222F, -1.3397F, 1.554F, 0.0679F, 1.3262F));

		PartDefinition cube_r267 = neck.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(169, 178).addBox(-0.6764F, -1.3328F, 0.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9164F, -1.1222F, -1.3397F, 1.4969F, 0.0154F, 0.6684F));

		PartDefinition cube_r268 = neck.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(170, 39).mirror().addBox(-0.8402F, -1.3842F, 0.6728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9164F, -1.1222F, -2.1397F, 1.4821F, 0.0593F, 0.6096F));

		PartDefinition cube_r269 = neck.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(170, 39).addBox(-0.1598F, -1.3842F, 0.6728F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9164F, -1.1222F, -2.1397F, 1.4821F, -0.0593F, -0.6096F));

		PartDefinition cube_r270 = neck.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(50, 90).addBox(-0.9164F, -2.4083F, -0.343F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9164F, -1.1222F, -2.1397F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r271 = neck.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(142, 77).addBox(-0.5F, -0.4F, 2.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.9F, -6.1F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(47, 146).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9651F, -3.2791F, 0.3914F, 0.0334F, -0.0807F));

		PartDefinition cube_r272 = neck6.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(68, 159).addBox(-0.5F, -0.4F, -2.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(66, 157).addBox(-0.5F, -0.4F, -1.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r273 = neck6.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(14, 130).addBox(0.0F, -0.5F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.095F, -4.4282F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r274 = neck6.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(123, 59).mirror().addBox(-0.6927F, -1.4565F, 0.8794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1572F, 0.9876F, -1.7012F, 1.7329F, -0.1156F, 0.6025F));

		PartDefinition cube_r275 = neck6.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(123, 59).addBox(-0.3073F, -1.4565F, 0.8794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1572F, 0.9876F, -1.7012F, 1.7329F, 0.1156F, -0.6025F));

		PartDefinition cube_r276 = neck6.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(163, 18).mirror().addBox(-0.9855F, -1.083F, -0.1428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1572F, 0.9876F, -1.7012F, 1.7042F, 0.1946F, -0.9647F));

		PartDefinition cube_r277 = neck6.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(174, 99).mirror().addBox(-0.9866F, -0.9089F, -0.8758F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1572F, 0.9876F, -1.7012F, 1.8033F, 0.0385F, -0.1613F));

		PartDefinition cube_r278 = neck6.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(75, 174).mirror().addBox(-1.1353F, -0.8268F, -0.9709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1572F, 0.9876F, -1.7012F, 1.5697F, -0.1194F, -0.0788F));

		PartDefinition cube_r279 = neck6.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(170, 169).mirror().addBox(-0.7483F, -0.9123F, -0.7006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3485F, 1.8311F, -4.1142F, 1.6045F, -0.0771F, -0.1205F));

		PartDefinition cube_r280 = neck6.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(120, 77).mirror().addBox(-0.4557F, -0.8351F, -0.3033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3485F, 1.8311F, -4.1142F, 2.1424F, 0.4105F, -0.7185F));

		PartDefinition cube_r281 = neck6.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(163, 18).addBox(-2.0145F, -1.083F, -0.1428F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1572F, 0.9876F, -1.7012F, 1.7042F, -0.1946F, 0.9647F));

		PartDefinition cube_r282 = neck6.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(174, 99).addBox(-1.0134F, -0.9089F, -0.8758F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1572F, 0.9876F, -1.7012F, 1.8033F, -0.0385F, 0.1613F));

		PartDefinition cube_r283 = neck6.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(75, 174).addBox(0.1353F, -0.8268F, -0.9709F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1572F, 0.9876F, -1.7012F, 1.5697F, 0.1194F, 0.0788F));

		PartDefinition cube_r284 = neck6.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(170, 169).addBox(-0.2517F, -0.9123F, -0.7006F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3485F, 1.8311F, -4.1142F, 1.6045F, 0.0771F, 0.1205F));

		PartDefinition cube_r285 = neck6.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(171, 84).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6645F, 0.8352F, -3.1204F, 1.6137F, 0.0079F, -0.1831F));

		PartDefinition cube_r286 = neck6.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(120, 77).addBox(-1.5443F, -0.8351F, -0.3033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3485F, 1.8311F, -4.1142F, 2.1424F, -0.4105F, 0.7185F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5194F, -5.9931F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(176, 48).addBox(-0.3F, -0.675F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3325F, 0.7575F, -17.9199F, 1.3745F, -0.6503F, 0.0836F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(44, 176).addBox(-0.5F, -2.7733F, -1.1985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1484F, -15.7557F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(162, 62).addBox(-1.0F, -0.2F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(177, 87).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.4154F, -0.2076F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(172, 165).addBox(-1.5F, 0.025F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.238F, -1.6463F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(85, 171).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.9796F, -0.6772F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(123, 113).addBox(-1.5F, -0.6F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4185F, -0.4612F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(153, 49).addBox(-1.0F, -0.0791F, 0.0433F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, -1.4F, -1.6F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(162, 140).addBox(-1.5F, -0.9F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.0957F, -4.3218F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(163, 13).addBox(0.0F, -0.0212F, -1.9937F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.236F, -5.6227F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(163, 34).mirror().addBox(0.0F, -0.2212F, 0.2063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0288F, -5.7067F, 0.0811F, -0.2523F, -0.0203F));

		PartDefinition cube_r297 = head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(163, 34).addBox(-1.0F, -0.2212F, 0.2063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -2.0288F, -5.7067F, 0.0811F, 0.2523F, 0.0203F));

		PartDefinition cube_r298 = head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(127, 86).addBox(0.0F, -0.2212F, -1.9937F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.1936F, -3.6132F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(161, 5).addBox(-1.5F, -0.0462F, -0.1687F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.6266F, -0.8548F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r300 = head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(124, 26).addBox(-1.5F, 0.1788F, -0.3187F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(19, 162).addBox(-1.0F, -0.2212F, -0.0187F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1936F, -3.6132F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r301 = head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(176, 133).addBox(-0.5F, -1.2632F, -2.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(176, 124).addBox(-0.5F, -1.2632F, -2.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1484F, -15.7557F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r302 = head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(166, 66).addBox(-0.5F, 0.0368F, 0.0343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.8572F, -16.3458F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r303 = head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(176, 136).addBox(-0.5F, 0.0368F, 0.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5649F, -17.3021F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r304 = head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(36, 100).addBox(-1.5F, -1.4F, -1.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0233F, -2.1212F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(170, 0).addBox(-0.1F, -1.0079F, 0.4994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.1484F, -15.7557F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(135, 155).addBox(-0.1F, -0.0368F, -2.9248F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.9996F, -7.6049F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(159, 145).addBox(-0.1F, -0.0368F, -3.0248F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.7468F, -10.4939F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(173, 156).addBox(-1.0F, -1.3832F, 2.8607F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1484F, -15.7557F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(153, 44).addBox(-1.0F, -0.9832F, -0.0393F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1765F, -9.8361F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(154, 40).addBox(-1.0F, -0.9832F, -0.0393F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1241F, -11.8354F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r311 = head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(19, 170).addBox(-0.5F, -0.075F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.3454F, -3.3802F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r312 = head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(159, 178).addBox(-0.5F, -0.075F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.1317F, -4.259F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r313 = head.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(178, 66).addBox(-0.5F, -0.275F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -0.2946F, -5.2657F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r314 = head.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(165, 165).addBox(-0.5F, -0.175F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5373F, -6.3433F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r315 = head.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(162, 136).addBox(-1.0F, -0.4F, -0.85F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5373F, -6.3433F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r316 = head.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(46, 153).addBox(-1.0F, -2.3201F, -2.0545F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 1.3437F, -3.311F, -0.7767F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.2F, -0.0052F, -1.304F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(178, 130).addBox(0.52F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(178, 69).addBox(0.52F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(66, 131).addBox(0.93F, 0.0827F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(60, 139).addBox(0.93F, -0.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6F, -0.5236F, 0.3625F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(176, 45).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.83F, -0.4943F, -2.0165F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(158, 13).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.83F, 0.6647F, -1.3334F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(176, 114).addBox(0.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6F, -0.5236F, 0.3625F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(85, 177).addBox(0.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.6F, -1.496F, 0.129F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(68, 177).addBox(0.93F, -1.5173F, -2.0874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5052F, 0.504F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(176, 111).addBox(-0.705F, -0.4F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(176, 94).addBox(-0.495F, -0.4F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.945F, -1.0294F, -0.9966F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(129, 69).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.83F, -0.5936F, -1.2418F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(157, 71).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.83F, -0.4943F, -2.0165F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(178, 145).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.5F, -0.4048F, -6.3437F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(178, 139).addBox(-0.5F, 0.15F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.5F, -0.977F, -5.5176F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(153, 159).addBox(-0.5F, -0.5064F, -2.7427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.144F))
				.texOffs(157, 87).addBox(-0.5F, -0.1064F, -2.7427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(0.5F, -1.1271F, -3.2799F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(148, 74).addBox(-0.5F, -0.6927F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(142, 66).addBox(-0.5F, -0.6927F, 0.1398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.1271F, -3.2799F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(28, 168).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.5F, -1.4855F, -3.5594F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(176, 51).addBox(-0.5F, 0.1495F, -0.7411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.5F, -1.1271F, -3.2799F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(176, 76).addBox(-0.5F, -0.6636F, -0.9243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.5F, -1.1271F, -3.2799F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(122, 40).addBox(-1.0F, -2.9741F, -1.4303F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 0.1537F, -14.4517F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(63, 177).addBox(-0.17F, 0.6258F, -1.1899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.3F, 0.0537F, -14.4517F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(177, 29).addBox(-0.17F, 1.1321F, -1.308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.0537F, -14.4517F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(147, 178).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8388F, 1.8643F, -17.191F, 2.0745F, 0.7405F, 0.1274F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(111, 177).addBox(-0.575F, -0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3071F, 0.7066F, -15.9594F, 3.0381F, -0.5501F, -0.2504F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(80, 176).addBox(-0.975F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7614F, 0.5591F, -15.3784F, 2.0712F, -0.6679F, -0.4678F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(142, 176).addBox(-0.55F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8448F, 0.8577F, -16.3334F, 1.957F, 0.0088F, -0.1377F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(114, 47).addBox(-0.5F, -0.3213F, -10.8819F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, -1.7993F, -2.9986F, 0.1134F, 0.0349F, 0.0F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(148, 146).addBox(-0.5F, -0.1953F, -2.8932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, -1.7993F, -2.9986F, 0.0698F, 0.0349F, 0.0F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(17, 174).addBox(-0.175F, -2.566F, -0.0784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2286F, -13.6507F, 1.9551F, -0.0405F, -0.0164F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(154, 22).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8F, 2.2674F, 0.163F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(164, 77).addBox(1.0F, -1.2562F, -0.4742F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, 1.6793F, -1.178F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(164, 49).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 0.3592F, -2.2398F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(171, 76).addBox(-0.1F, 0.5077F, -0.1002F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 0.1537F, -14.4517F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(169, 124).addBox(-0.5F, -1.0498F, 0.5257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2F, 0.1537F, -14.4517F, 0.1658F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2F, -0.0052F, -1.304F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(178, 130).mirror().addBox(-1.52F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(178, 69).mirror().addBox(-1.52F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(66, 131).mirror().addBox(-1.93F, 0.0827F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(60, 139).mirror().addBox(-1.93F, -0.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.5236F, 0.3625F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(176, 45).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.83F, -0.4943F, -2.0165F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(158, 13).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.83F, 0.6647F, -1.3334F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(176, 114).mirror().addBox(-1.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.5236F, 0.3625F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(85, 177).mirror().addBox(-1.93F, -1.0173F, -0.9874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.6F, -1.496F, 0.129F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(68, 177).mirror().addBox(-1.93F, -1.5173F, -2.0874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.5052F, 0.504F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(176, 111).mirror().addBox(-0.295F, -0.4F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(176, 94).mirror().addBox(-0.505F, -0.4F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.945F, -1.0294F, -0.9966F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(129, 69).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.83F, -0.5936F, -1.2418F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(157, 71).mirror().addBox(-0.5F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.83F, -0.4943F, -2.0165F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(178, 145).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4048F, -6.3437F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(178, 139).mirror().addBox(-0.5F, 0.15F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.977F, -5.5176F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(153, 159).mirror().addBox(-0.5F, -0.5064F, -2.7427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(157, 87).mirror().addBox(-0.5F, -0.1064F, -2.7427F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1271F, -3.2799F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(148, 74).mirror().addBox(-0.5F, -0.6927F, -0.5602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(142, 66).mirror().addBox(-0.5F, -0.6927F, 0.1398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1271F, -3.2799F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(28, 168).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4855F, -3.5594F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(176, 51).mirror().addBox(-0.5F, 0.1495F, -0.7411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1271F, -3.2799F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(176, 76).mirror().addBox(-0.5F, -0.6636F, -0.9243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1271F, -3.2799F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(122, 40).mirror().addBox(-1.0F, -2.9741F, -1.4303F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1537F, -14.4517F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(63, 177).mirror().addBox(-0.83F, 0.6258F, -1.1899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.0537F, -14.4517F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(177, 29).mirror().addBox(-0.83F, 1.1321F, -1.308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.0537F, -14.4517F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(147, 178).mirror().addBox(0.0F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8388F, 1.8643F, -17.191F, 2.0745F, -0.7405F, -0.1274F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(111, 177).mirror().addBox(-0.425F, -0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3071F, 0.7066F, -15.9594F, 3.0381F, 0.5501F, 0.2504F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(80, 176).mirror().addBox(-0.025F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7614F, 0.5591F, -15.3784F, 2.0712F, 0.6679F, 0.4678F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(142, 176).mirror().addBox(-0.45F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8448F, 0.8577F, -16.3334F, 1.957F, -0.0088F, 0.1377F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(114, 47).mirror().addBox(-0.5F, -0.3213F, -10.8819F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.7993F, -2.9986F, 0.1134F, -0.0349F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(148, 146).mirror().addBox(-0.5F, -0.1953F, -2.8932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.7993F, -2.9986F, 0.0698F, -0.0349F, 0.0F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(17, 174).mirror().addBox(-0.825F, -2.566F, -0.0784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.2286F, -13.6507F, 1.9551F, 0.0405F, 0.0164F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(154, 22).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 2.2674F, 0.163F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(164, 77).mirror().addBox(-2.0F, -1.2562F, -0.4742F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7F, 1.6793F, -1.178F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(164, 49).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.3592F, -2.2398F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(171, 76).mirror().addBox(-0.9F, 0.5077F, -0.1002F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1537F, -14.4517F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(169, 124).mirror().addBox(-0.5F, -1.0498F, 0.5257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1537F, -14.4517F, 0.1658F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.3028F, -0.9573F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(96, 162).mirror().addBox(-1.0F, 0.0055F, -1.9722F, 1.0F, 1.3117F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 162).mirror().addBox(-1.0F, 1.3072F, -1.9722F, 1.0F, 1.6983F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(96, 162).addBox(0.6F, 0.0055F, -1.9722F, 1.0F, 1.3117F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 162).addBox(0.6F, 1.3072F, -1.9722F, 1.0F, 1.6983F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8F, -1.1846F, -3.5522F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(178, 63).mirror().addBox(-0.5F, -1.1F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(178, 60).mirror().addBox(-0.5F, -1.1F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(154, 177).mirror().addBox(-0.5F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(178, 63).addBox(1.74F, -1.1F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(178, 60).addBox(1.74F, -1.1F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(154, 177).addBox(1.74F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.62F, -0.2808F, -2.4115F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(106, 175).mirror().addBox(-0.5F, 0.35F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 175).addBox(1.54F, 0.35F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.52F, 1.5299F, -3.2609F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(5, 174).mirror().addBox(-0.5F, -0.9F, -1.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(131, 177).mirror().addBox(-0.5F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(5, 174).addBox(1.54F, -0.9F, -1.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(131, 177).addBox(1.54F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.52F, 1.5299F, -3.2609F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(176, 8).mirror().addBox(-0.5F, -0.5F, 0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 172).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(176, 8).addBox(1.54F, -0.5F, 0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 172).addBox(1.54F, -0.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.52F, 0.1249F, -2.5356F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(119, 162).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.0067F)).mirror(false)
				.texOffs(119, 162).addBox(1.1F, -0.4F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.0067F)), PartPose.offsetAndRotation(-1.3F, -0.0737F, -8.2795F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(122, 156).mirror().addBox(-0.5F, -2.0F, -3.025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(122, 156).addBox(1.1F, -2.0F, -3.025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.3F, 2.1939F, -3.6804F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(162, 100).mirror().addBox(-1.0F, 0.0055F, -1.9722F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(162, 100).addBox(0.6F, 0.0055F, -1.9722F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8F, -1.1061F, -5.5507F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(123, 175).mirror().addBox(-1.0F, 0.0055F, -0.9722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(123, 175).addBox(0.6F, 0.0055F, -0.9722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8F, -1.1366F, -2.5534F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(51, 168).mirror().addBox(-1.0F, -0.3682F, -1.1338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 168).addBox(0.8F, -0.3682F, -1.1338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.5F, -1.6F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(37, 162).mirror().addBox(-0.9F, -3.012F, -2.022F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 162).addBox(0.7F, -3.012F, -2.022F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 2.8798F, -6.5533F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(131, 161).mirror().addBox(-0.347F, -0.7213F, -0.2318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2843F, 2.9703F, -2.058F, 0.3543F, -0.0287F, 0.1486F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(170, 29).mirror().addBox(-0.647F, -0.5213F, -0.2318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 2.9103F, -3.3847F, 0.0644F, -0.1922F, 0.0872F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(170, 12).mirror().addBox(-0.3965F, -0.6912F, -0.486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8844F, -4.4635F, -0.1826F, -0.4015F, 0.0963F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(164, 82).mirror().addBox(-0.5F, -1.6F, -2.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(164, 82).addBox(1.1F, -1.6F, -2.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, 0.8943F, -1.0571F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(168, 25).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(168, 25).addBox(1.3F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4F, 0.3793F, -0.2F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(178, 142).mirror().addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(178, 142).addBox(1.3F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.4F, -0.0795F, -0.8553F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(178, 127).mirror().addBox(-0.5F, 0.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(178, 127).addBox(-0.1F, 0.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.7F, 4.2448F, -16.4185F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(178, 79).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.2315F, -16.3973F, 0.9265F, 0.8462F, 0.7837F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(169, 115).mirror().addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(169, 115).addBox(-0.1F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7F, 3.0003F, -14.2291F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(33, 168).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(33, 168).addBox(-0.1F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7F, 1.4528F, -14.017F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(178, 82).mirror().addBox(-0.5F, 0.475F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(178, 72).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(178, 82).addBox(-0.1F, 0.475F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(178, 72).addBox(-0.1F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7F, 2.5728F, -15.6311F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(44, 165).mirror().addBox(-0.5F, -2.075F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(44, 165).addBox(-0.1F, -2.075F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 3.3249F, -13.2039F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(89, 164).mirror().addBox(-0.5F, 0.025F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 164).addBox(-0.1F, 0.025F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7F, 0.5617F, -12.1155F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(23, 156).mirror().addBox(-0.3F, -1.9209F, -0.2663F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(23, 156).addBox(0.5F, -1.9209F, -0.2663F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1F, 2.3819F, -11.4026F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 156).mirror().addBox(-0.3F, -1.4812F, -0.0915F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 156).addBox(0.5F, -1.4812F, -0.0915F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 2.3819F, -11.4026F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(63, 174).addBox(-1.2F, -0.3F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 3.3332F, -16.2806F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(178, 79).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 4.2315F, -16.3973F, 0.9265F, -0.8462F, -0.7837F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(131, 161).addBox(-0.653F, -0.7213F, -0.2318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2843F, 2.9703F, -2.058F, 0.3543F, 0.0287F, -0.1486F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(170, 29).addBox(-0.353F, -0.5213F, -0.2318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.287F, 2.9103F, -3.3847F, 0.0644F, 0.1922F, -0.0872F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(170, 12).addBox(-0.6035F, -0.6912F, -0.486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 2.8844F, -4.4635F, -0.1826F, 0.4015F, -0.0963F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4099F, 0.4786F, -1.4188F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r412 = bone.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(141, 0).addBox(-0.425F, -1.6F, -1.725F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.558F, -12.8298F, -10.6847F, 0.9421F, -0.4561F, -0.2061F));

		PartDefinition cube_r413 = bone.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(0, 162).addBox(-0.9957F, 4.8535F, -5.7939F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8642F, 6.4258F, -5.7686F, 0.3556F, 0.0085F, 0.1055F));

		PartDefinition cube_r414 = bone.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(163, 39).addBox(-0.9957F, 7.2177F, -2.2559F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8642F, 6.4258F, -5.7686F, 0.0065F, 0.0085F, 0.1055F));

		PartDefinition cube_r415 = bone.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(147, 9).addBox(-0.9792F, -8.2586F, -2.7367F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8642F, 6.4258F, -5.7686F, 3.0783F, 0.0085F, 0.1055F));

		PartDefinition cube_r416 = bone.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(169, 111).addBox(-0.9817F, 6.7878F, 1.7645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8642F, 6.4258F, -5.7686F, 0.1112F, 0.0091F, 0.1052F));

		PartDefinition cube_r417 = bone.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(140, 102).addBox(-0.9817F, 7.5584F, -3.49F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8642F, 6.4258F, -5.7686F, 0.373F, 0.0091F, 0.1052F));

		PartDefinition cube_r418 = bone.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(9, 153).addBox(-0.857F, -0.3782F, -0.5236F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7642F, 6.4258F, -5.7686F, -0.2391F, 0.0125F, 0.1572F));

		PartDefinition cube_r419 = bone.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(89, 156).addBox(-0.9792F, 0.4408F, -6.708F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(162, 71).addBox(-0.9792F, 0.4408F, -7.3079F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8642F, 6.4258F, -5.7686F, 1.1235F, 0.0085F, 0.1055F));

		PartDefinition cube_r420 = bone.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(161, 129).addBox(-0.7685F, 2.4771F, 1.6185F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5826F, -3.716F, -4.9197F, -0.3008F, -0.0852F, 0.2229F));

		PartDefinition cube_r421 = bone.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(16, 153).addBox(-1.1229F, 6.3616F, -0.0962F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5826F, -5.516F, -5.6197F, -0.044F, -0.0665F, 0.1738F));

		PartDefinition cube_r422 = bone.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(140, 109).addBox(-0.5856F, 3.1056F, 0.5899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.921F, -1.3945F, 0.9277F, 1.0297F, -0.2793F, 0.1047F));

		PartDefinition cube_r423 = bone.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(123, 169).addBox(-0.5856F, 3.3041F, -0.7208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.921F, -1.3945F, 0.9277F, 1.2043F, -0.2793F, 0.1047F));

		PartDefinition cube_r424 = bone.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(72, 166).addBox(-0.5856F, 2.7519F, 1.9523F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.921F, -1.3945F, 0.9277F, 0.8552F, -0.2793F, 0.1047F));

		PartDefinition cube_r425 = bone.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(0, 168).addBox(-0.9837F, -0.1446F, -0.6293F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8463F, 1.2031F, 7.5157F, 0.8882F, -0.1533F, 0.0386F));

		PartDefinition cube_r426 = bone.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(160, 165).addBox(-1.0956F, -0.032F, -0.8905F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2824F, 3.2277F, 10.562F, 0.621F, -0.0661F, 0.0383F));

		PartDefinition cube_r427 = bone.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(9, 146).addBox(-1.0956F, 0.0489F, -0.6751F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2824F, 3.2277F, 10.562F, 0.7519F, -0.0661F, 0.0383F));

		PartDefinition cube_r428 = bone.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(162, 159).addBox(-1.4619F, -0.3115F, -6.1144F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2824F, 3.2277F, 10.562F, 1.9752F, -0.0005F, -0.0176F));

		PartDefinition cube_r429 = bone.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(165, 169).addBox(-0.9837F, -0.2118F, -0.3804F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8463F, 1.2031F, 7.5157F, 0.9143F, -0.1533F, 0.0386F));

		PartDefinition cube_r430 = bone.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(7, 162).addBox(-0.5856F, 0.6985F, -1.8439F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.921F, -1.3945F, 0.9277F, 1.4661F, -0.2793F, 0.1047F));

		PartDefinition cube_r431 = bone.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(23, 147).addBox(-0.5856F, -2.9657F, 0.7032F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.921F, -1.3945F, 0.9277F, 0.5585F, -0.2793F, 0.1047F));

		PartDefinition cube_r432 = bone.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(36, 105).addBox(-0.925F, -3.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0931F, -1.535F, -1.3897F, 0.4253F, -0.0132F, 0.0578F));

		PartDefinition cube_r433 = bone.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(39, 152).addBox(-0.7685F, -0.4867F, -2.7586F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5826F, -3.716F, -4.9197F, 0.3712F, -0.0852F, 0.2229F));

		PartDefinition cube_r434 = bone.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(95, 148).addBox(-0.5F, -1.9364F, -2.5015F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4985F, -8.8727F, 2.7281F, 0.3392F, 0.0643F, -0.2278F));

		PartDefinition cube_r435 = bone.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(140, 93).addBox(-0.5F, -1.83F, -0.3415F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4985F, -8.8727F, 2.7281F, 0.6359F, 0.0643F, -0.2278F));

		PartDefinition cube_r436 = bone.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(127, 77).addBox(-0.5F, -1.0F, -2.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.723F, -9.9162F, 9.1236F, 0.2345F, 0.0643F, -0.4023F));

		PartDefinition cube_r437 = bone.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(129, 59).addBox(-0.5F, -1.8F, -1.9F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.142F, -11.9129F, 8.9048F, -0.3116F, -0.0391F, -0.4053F));

		PartDefinition cube_r438 = bone.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(157, 152).addBox(-0.8F, -2.0F, -2.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1888F, -8.5399F, -4.1716F, 0.5238F, -0.0128F, -0.0325F));

		PartDefinition cube_r439 = bone.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(157, 109).addBox(1.9256F, 1.5136F, -0.4526F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2099F, -8.2768F, -4.9444F, -0.3925F, -0.0336F, -0.0096F));

		PartDefinition cube_r440 = bone.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(157, 80).addBox(-0.45F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8109F, -10.4667F, -12.0737F, -0.0747F, -0.5229F, -0.2408F));

		PartDefinition cube_r441 = bone.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(135, 113).addBox(-0.2F, -2.5F, -1.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0297F, -11.2952F, -9.0858F, -1.1882F, -0.2683F, -0.2338F));

		PartDefinition cube_r442 = bone.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(97, 138).addBox(-1.3F, -2.5F, -0.9F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9015F, -10.6565F, -10.4781F, -0.6233F, -0.5191F, -0.1907F));

		PartDefinition cube_r443 = bone.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -3.5F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0363F, -4.6371F, -2.0596F, -0.1485F, 0.0018F, -0.0496F));

		PartDefinition cube_r444 = bone.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(17, 122).addBox(-0.975F, -2.7F, -0.1F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4959F, -13.2047F, -9.3752F, 0.3939F, -0.3222F, -0.12F));

		PartDefinition cube_r445 = bone.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(97, 124).addBox(-0.5635F, -0.2389F, 0.0675F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2099F, -15.2768F, 0.8556F, -0.4486F, 0.0361F, -0.2601F));

		PartDefinition cube_r446 = bone.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(55, 105).addBox(-0.5635F, -0.2389F, -6.6325F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2099F, -15.2768F, 0.8556F, -0.3274F, -0.1404F, -0.1792F));

		PartDefinition cube_r447 = bone.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(36, 120).addBox(-0.675F, -2.55F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0617F, -11.7525F, 5.3314F, -0.0945F, -0.02F, -0.2713F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4099F, 0.4786F, -1.4188F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r448 = bone4.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(141, 0).mirror().addBox(-0.575F, -1.6F, -1.725F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.558F, -12.8298F, -10.6847F, 0.9421F, 0.4561F, 0.2061F));

		PartDefinition cube_r449 = bone4.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(0, 162).mirror().addBox(-0.0043F, 4.8535F, -5.7939F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8642F, 6.4258F, -5.7686F, 0.3556F, -0.0085F, -0.1055F));

		PartDefinition cube_r450 = bone4.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(163, 39).mirror().addBox(-0.0043F, 7.2177F, -2.2559F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8642F, 6.4258F, -5.7686F, 0.0065F, -0.0085F, -0.1055F));

		PartDefinition cube_r451 = bone4.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(147, 9).mirror().addBox(-0.0208F, -8.2586F, -2.7367F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8642F, 6.4258F, -5.7686F, 3.0783F, -0.0085F, -0.1055F));

		PartDefinition cube_r452 = bone4.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(169, 111).mirror().addBox(-0.0183F, 6.7878F, 1.7645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8642F, 6.4258F, -5.7686F, 0.1112F, -0.0091F, -0.1052F));

		PartDefinition cube_r453 = bone4.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(140, 102).mirror().addBox(-0.0183F, 7.5584F, -3.49F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8642F, 6.4258F, -5.7686F, 0.373F, -0.0091F, -0.1052F));

		PartDefinition cube_r454 = bone4.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(9, 153).mirror().addBox(-0.1429F, -0.3782F, -0.5236F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7642F, 6.4258F, -5.7686F, -0.2391F, -0.0125F, -0.1572F));

		PartDefinition cube_r455 = bone4.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(89, 156).mirror().addBox(-0.0208F, 0.4408F, -6.708F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(162, 71).mirror().addBox(-0.0208F, 0.4408F, -7.3079F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8642F, 6.4258F, -5.7686F, 1.1235F, -0.0085F, -0.1055F));

		PartDefinition cube_r456 = bone4.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(161, 129).mirror().addBox(-0.2315F, 2.4771F, 1.6185F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5826F, -3.716F, -4.9197F, -0.3008F, 0.0852F, -0.2229F));

		PartDefinition cube_r457 = bone4.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(16, 153).mirror().addBox(0.1229F, 6.3616F, -0.0962F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5826F, -5.516F, -5.6197F, -0.044F, 0.0665F, -0.1738F));

		PartDefinition cube_r458 = bone4.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(140, 109).mirror().addBox(-0.4144F, 3.1056F, 0.5899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.921F, -1.3945F, 0.9277F, 1.0297F, 0.2793F, -0.1047F));

		PartDefinition cube_r459 = bone4.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(123, 169).mirror().addBox(-0.4144F, 3.3041F, -0.7208F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.921F, -1.3945F, 0.9277F, 1.2043F, 0.2793F, -0.1047F));

		PartDefinition cube_r460 = bone4.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(72, 166).mirror().addBox(-0.4144F, 2.7519F, 1.9523F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.921F, -1.3945F, 0.9277F, 0.8552F, 0.2793F, -0.1047F));

		PartDefinition cube_r461 = bone4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 168).mirror().addBox(-0.0163F, -0.1446F, -0.6293F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8463F, 1.2031F, 7.5157F, 0.8882F, 0.1533F, -0.0386F));

		PartDefinition cube_r462 = bone4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(160, 165).mirror().addBox(0.0956F, -0.032F, -0.8905F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2824F, 3.2277F, 10.562F, 0.621F, 0.0661F, -0.0383F));

		PartDefinition cube_r463 = bone4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(9, 146).mirror().addBox(0.0956F, 0.0489F, -0.6751F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2824F, 3.2277F, 10.562F, 0.7519F, 0.0661F, -0.0383F));

		PartDefinition cube_r464 = bone4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(162, 159).mirror().addBox(0.4619F, -0.3115F, -6.1144F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2824F, 3.2277F, 10.562F, 1.9752F, 0.0005F, 0.0176F));

		PartDefinition cube_r465 = bone4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(165, 169).mirror().addBox(-0.0163F, -0.2118F, -0.3804F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8463F, 1.2031F, 7.5157F, 0.9143F, 0.1533F, -0.0386F));

		PartDefinition cube_r466 = bone4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(7, 162).mirror().addBox(-0.4144F, 0.6985F, -1.8439F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.921F, -1.3945F, 0.9277F, 1.4661F, 0.2793F, -0.1047F));

		PartDefinition cube_r467 = bone4.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(23, 147).mirror().addBox(-0.4144F, -2.9657F, 0.7032F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.921F, -1.3945F, 0.9277F, 0.5585F, 0.2793F, -0.1047F));

		PartDefinition cube_r468 = bone4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(36, 105).mirror().addBox(-0.075F, -3.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0931F, -1.535F, -1.3897F, 0.4253F, 0.0132F, -0.0578F));

		PartDefinition cube_r469 = bone4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(39, 152).mirror().addBox(-0.2315F, -0.4867F, -2.7586F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5826F, -3.716F, -4.9197F, 0.3712F, 0.0852F, -0.2229F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(95, 148).mirror().addBox(-0.5F, -1.9364F, -2.5015F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4985F, -8.8727F, 2.7281F, 0.3392F, -0.0643F, 0.2278F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(140, 93).mirror().addBox(-0.5F, -1.83F, -0.3415F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4985F, -8.8727F, 2.7281F, 0.6359F, -0.0643F, 0.2278F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(127, 77).mirror().addBox(-0.5F, -1.0F, -2.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.723F, -9.9162F, 9.1236F, 0.2345F, -0.0643F, 0.4023F));

		PartDefinition cube_r473 = bone4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(129, 59).mirror().addBox(-0.5F, -1.8F, -1.9F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.142F, -11.9129F, 8.9048F, -0.3116F, 0.0391F, 0.4053F));

		PartDefinition cube_r474 = bone4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(157, 152).mirror().addBox(-0.2F, -2.0F, -2.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1888F, -8.5399F, -4.1716F, 0.5238F, 0.0128F, 0.0325F));

		PartDefinition cube_r475 = bone4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(157, 109).mirror().addBox(-2.9256F, 1.5136F, -0.4526F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2099F, -8.2768F, -4.9444F, -0.3925F, 0.0336F, 0.0096F));

		PartDefinition cube_r476 = bone4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(157, 80).mirror().addBox(-0.55F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8109F, -10.4667F, -12.0737F, -0.0747F, 0.5229F, 0.2408F));

		PartDefinition cube_r477 = bone4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(135, 113).mirror().addBox(-0.8F, -2.5F, -1.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0297F, -11.2952F, -9.0858F, -1.1882F, 0.2683F, 0.2338F));

		PartDefinition cube_r478 = bone4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(97, 138).mirror().addBox(0.3F, -2.5F, -0.9F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9015F, -10.6565F, -10.4781F, -0.6233F, 0.5191F, 0.1907F));

		PartDefinition cube_r479 = bone4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, -3.5F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0363F, -4.6371F, -2.0596F, -0.1485F, -0.0018F, 0.0496F));

		PartDefinition cube_r480 = bone4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(17, 122).mirror().addBox(-0.025F, -2.7F, -0.1F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4959F, -13.2047F, -9.3752F, 0.3939F, 0.3222F, 0.12F));

		PartDefinition cube_r481 = bone4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(97, 124).mirror().addBox(-0.4365F, -0.2389F, 0.0675F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2099F, -15.2768F, 0.8556F, -0.4486F, -0.0361F, 0.2601F));

		PartDefinition cube_r482 = bone4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(55, 105).mirror().addBox(-0.4365F, -0.2389F, -6.6325F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2099F, -15.2768F, 0.8556F, -0.3274F, 0.1404F, 0.1792F));

		PartDefinition cube_r483 = bone4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(36, 120).mirror().addBox(-0.325F, -2.55F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0617F, -11.7525F, 5.3314F, -0.0945F, 0.02F, 0.2713F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(56, 64).addBox(-1.0F, -1.0163F, -0.2023F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.004F))
				.texOffs(100, 94).addBox(1.0F, -0.0163F, 1.7977F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(100, 94).mirror().addBox(-4.0F, -0.0163F, 1.7977F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 162).addBox(0.0F, -4.8282F, 5.6851F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3217F, 8.8445F, -0.2515F, -0.1162F, 0.0744F));

		PartDefinition cube_r484 = tail.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(164, 150).addBox(0.0F, -0.0372F, -0.1633F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4553F, 9.0042F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r485 = tail.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(164, 113).addBox(-0.005F, -6.6372F, -0.1633F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0989F, 7.9054F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r486 = tail.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(103, 165).addBox(-0.005F, -3.9845F, 0.0064F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8198F, 5.698F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r487 = tail.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(19, 112).addBox(0.0F, -3.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1511F, 13.0956F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r488 = tail.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(90, 117).addBox(0.0F, 0.055F, -0.9117F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4774F, 8.1495F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r489 = tail.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(19, 104).addBox(0.0F, -0.0937F, -1.2226F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3256F, 3.7778F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r490 = tail.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(157, 136).addBox(-0.005F, -5.179F, 0.3456F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.8769F, 2.3107F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r491 = tail.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(164, 106).addBox(0.0F, -3.7791F, -0.9544F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1163F, 2.7977F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -0.8985F, -0.1488F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0118F, 11.6812F, -0.1489F, -0.0863F, 0.0129F));

		PartDefinition cube_r492 = tail2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(32, 157).addBox(0.0F, -5.2F, 3.1F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 157).addBox(0.0F, -5.1F, 0.2F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7985F, 6.6512F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r493 = tail2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(169, 99).addBox(-0.005F, -3.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4104F, 3.8981F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r494 = tail2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(96, 168).addBox(0.0F, -2.8F, -0.3F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5985F, 4.0512F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r495 = tail2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(169, 105).addBox(-0.005F, -3.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.639F, 0.1626F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r496 = tail2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(65, 168).addBox(0.0F, -2.7F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.945F, -0.0437F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1015F, -0.1488F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r498 = tail2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(74, 0).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1015F, -0.1488F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r499 = tail2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(128, 169).addBox(0.0F, 1.1F, -1.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5079F, 11.7003F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r500 = tail2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(33, 39).addBox(0.0F, -0.5F, -0.3F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3066F, 9.027F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r501 = tail2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(68, 122).addBox(0.0F, 0.1F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.216F, 6.0352F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r502 = tail2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(32, 122).addBox(0.0F, -2.0F, -0.1F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1617F, 3.8872F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(70, 32).addBox(-1.0F, -0.9532F, -0.0544F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0618F, 12.577F, 0.1865F, 0.1132F, 0.1093F));

		PartDefinition cube_r503 = tail3.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(155, 164).addBox(0.0F, -3.5F, -1.6F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.461F, 11.5284F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r504 = tail3.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(145, 164).addBox(0.0F, -3.4F, -0.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8532F, 7.0455F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r505 = tail3.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(140, 164).addBox(0.0F, -3.6F, -0.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8532F, 4.0455F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r506 = tail3.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(162, 54).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5927F, 0.802F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r507 = tail3.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-2.0F, -0.1F, -0.1F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1468F, 1.0455F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r508 = tail3.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(74, 19).addBox(0.0F, -0.1F, -0.1F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1468F, 1.0455F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r509 = tail3.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(161, 172).addBox(0.0F, 1.6F, 0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9173F, 7.0909F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r510 = tail3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(136, 166).addBox(0.0F, -0.2608F, -0.0072F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8905F, 4.6588F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r511 = tail3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(47, 132).addBox(0.0F, 0.4196F, -1.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7585F, 2.7268F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -0.4994F, -0.9791F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4321F, 11.8672F, 0.1876F, 0.2145F, 0.0404F));

		PartDefinition cube_r512 = tail4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(173, 128).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7721F, 13.6175F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r513 = tail4.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(173, 65).addBox(0.0F, -1.9F, 2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 172).addBox(0.0F, -1.9F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3995F, 8.0209F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r514 = tail4.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(168, 129).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3995F, 4.0209F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r515 = tail4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(118, 168).addBox(0.0F, -2.9F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3995F, 2.0209F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r516 = tail4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(128, 176).addBox(0.0F, 5.2F, 7.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 156).addBox(0.0F, 4.0F, 5.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 142).addBox(0.0F, 2.3F, 3.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2093F, 3.1143F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r517 = tail4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(136, 174).addBox(0.0F, -0.7F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7852F, 5.3098F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r518 = tail4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(139, 176).addBox(0.0F, -1.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2128F, 0.9852F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r519 = tail4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(55, 172).addBox(0.0F, -1.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2093F, 3.1143F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(89, 48).addBox(-0.5F, -0.4815F, 0.8203F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.004F))
				.texOffs(172, 89).addBox(0.0F, -1.5815F, 1.8203F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(173, 143).addBox(0.0F, -1.5815F, 4.8203F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0474F, 14.0963F, 0.0568F, 0.1866F, -0.1616F));

		PartDefinition cube_r520 = tail5.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(28, 162).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.899F, 11.302F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail5.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(0, 174).addBox(0.0F, -1.1F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 8.8203F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail5.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(9, 179).addBox(0.0F, 1.3F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 179).addBox(0.0F, 0.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(179, 3).addBox(0.0F, -0.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6391F, 5.2047F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r523 = tail5.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(86, 137).addBox(0.0F, -0.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8551F, 2.9437F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail5.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(52, 177).addBox(0.0F, -0.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0366F, 0.9303F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(110, 63).addBox(-0.5F, -0.4592F, -0.0336F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.0153F, 11.7175F, -0.1085F, 0.3352F, -0.2006F));

		PartDefinition cube_r525 = tail6.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(151, 16).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4977F, 7.452F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r526 = tail6.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(79, 134).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7847F, 5.4626F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r527 = tail6.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(72, 163).addBox(0.0F, 6.1F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 161).addBox(0.0F, 5.1F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 158).addBox(0.0F, 4.1F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 179).addBox(0.0F, 2.1F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6543F, -6.5127F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r528 = tail6.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(132, 113).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 178).addBox(0.0F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9592F, 1.4664F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(122, 31).addBox(-0.5F, -0.4472F, -0.0182F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0023F, 7.8935F, -0.0944F, 0.3911F, -0.0361F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(99, 31).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.2879F, 7.0366F, -0.2875F, 0.4205F, -0.1201F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(51, 131).addBox(-2.0F, -1.8F, -1.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -5.0892F, -0.4302F, -0.7847F, -0.0124F, 0.0054F));

		PartDefinition cube_r529 = leftLeg.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(158, 8).addBox(-1.0F, -2.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 18.7714F, -2.1428F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r530 = leftLeg.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(138, 123).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.1376F, -0.3288F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r531 = leftLeg.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(115, 144).addBox(-1.0F, -0.183F, -1.6069F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.7009F, 0.2588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r532 = leftLeg.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(139, 138).addBox(-1.0F, -0.183F, -1.8069F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 9.7009F, 0.2588F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r533 = leftLeg.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(161, 22).addBox(-0.5F, -4.0836F, -2.0371F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 4.6618F, 2.3905F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r534 = leftLeg.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(157, 116).addBox(-0.5F, -1.0836F, -0.0371F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8009F, 0.1588F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r535 = leftLeg.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(86, 142).addBox(-1.0F, -2.2903F, -0.5277F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.8009F, 0.1588F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r536 = leftLeg.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(148, 66).addBox(-1.0F, 0.2345F, -1.6658F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8009F, 0.1588F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r537 = leftLeg.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(161, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.8784F, 0.8867F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r538 = leftLeg.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(152, 0).addBox(-1.0F, -5.1F, -0.6F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 5.3F, -0.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(126, 133).addBox(-0.6F, -1.7F, 1.1F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(-0.6F, -1.7F, 5.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(27, 76).addBox(-0.6F, -0.9F, 5.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, 18.727F, 0.9851F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r539 = leftLeg2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(27, 140).addBox(-1.4F, -0.7F, 1.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.7F, 13.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r540 = leftLeg2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(135, 86).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.5F, -1.0815F, 10.7127F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r541 = leftLeg2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(153, 60).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.096F)), PartPose.offsetAndRotation(2.5F, -1.9304F, 0.3409F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r542 = leftLeg2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(153, 104).addBox(-0.5F, -1.4F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.5F, -1.7182F, 1.2233F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r543 = leftLeg2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(37, 32).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.107F)), PartPose.offsetAndRotation(2.5F, -0.0611F, 0.0468F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r544 = leftLeg2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(101, 19).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(2.5F, -0.9F, 5.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r545 = leftLeg2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(104, 148).addBox(-1.0F, -4.9F, -2.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 3.3253F, 1.8516F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r546 = leftLeg2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(126, 141).addBox(-1.0F, -2.5F, -2.3F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.4F, 0.8F, 1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(50, 94).addBox(-1.0F, -0.5F, -0.2F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.1775F, 18.7351F, -0.9076F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(93, 116).addBox(-1.0F, -1.2F, -1.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7978F, 8.0698F, -1.1083F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(115, 12).addBox(-1.0F, -1.2F, -0.1F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 3.9015F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(32, 132).addBox(-1.0F, -1.8F, -1.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -5.0892F, -0.4302F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r547 = rightLeg.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(144, 159).addBox(-1.0F, -2.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 18.7714F, -2.1428F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r548 = rightLeg.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(139, 26).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 17.1376F, -0.3288F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r549 = rightLeg.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(145, 34).addBox(-1.0F, -0.183F, -1.6069F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.7009F, 0.2588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r550 = rightLeg.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(14, 142).addBox(-1.0F, -0.183F, -1.8069F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 9.7009F, 0.2588F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r551 = rightLeg.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(53, 161).addBox(-0.5F, -4.0836F, -2.0371F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 4.6618F, 2.3905F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r552 = rightLeg.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(46, 158).addBox(-0.5F, -1.0836F, -0.0371F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8009F, 0.1588F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r553 = rightLeg.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(144, 47).addBox(-1.0F, -2.2903F, -0.5277F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.8009F, 0.1588F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r554 = rightLeg.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(148, 84).addBox(-1.0F, 0.2345F, -1.6658F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8009F, 0.1588F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r555 = rightLeg.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(161, 29).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.8784F, 0.8867F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r556 = rightLeg.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(152, 26).addBox(-1.0F, -5.1F, -0.6F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 5.3F, -0.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(135, 69).addBox(-1.4F, -1.7F, 1.1F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 80).addBox(-1.4F, -1.7F, 5.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(81, 80).addBox(-1.4F, -0.9F, 5.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, 18.727F, 0.9851F, -0.6824F, 0.02F, 0.0075F));

		PartDefinition cube_r557 = rightLeg2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(60, 142).addBox(-1.6F, -0.7F, 1.7F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.7F, 13.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r558 = rightLeg2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(47, 139).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.5F, -1.0815F, 10.7127F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r559 = rightLeg2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(153, 74).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.096F)), PartPose.offsetAndRotation(-2.5F, -1.9304F, 0.3409F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r560 = rightLeg2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(157, 66).addBox(-0.5F, -1.4F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.5F, -1.7182F, 1.2233F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r561 = rightLeg2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.107F)), PartPose.offsetAndRotation(-2.5F, -0.0611F, 0.0468F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r562 = rightLeg2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(100, 104).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(-2.5F, -0.9F, 5.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r563 = rightLeg2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(148, 138).addBox(-1.0F, -4.9F, -2.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 3.3253F, 1.8516F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r564 = rightLeg2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(142, 57).addBox(-1.0F, -2.5F, -2.3F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.4F, 0.8F, 1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(75, 94).addBox(-3.0F, -0.5F, -0.2F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1775F, 18.7351F, -1.1257F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(114, 116).addBox(-4.0F, -1.2F, -1.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7978F, 8.0698F, -1.1519F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(124, 19).addBox(-4.0F, -1.2F, -0.1F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, -0.0174F, 3.9015F));

		return LayerDefinition.create(meshdefinition, 185, 185);
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