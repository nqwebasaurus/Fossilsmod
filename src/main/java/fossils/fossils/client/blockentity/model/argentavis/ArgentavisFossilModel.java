package fossils.fossils.client.blockentity.model.argentavis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArgentavisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public ArgentavisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
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
		this.tail4 = this.tail3.getChild("tail4");
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
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck7 = this.neck2.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.head = this.neck10.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -30.5506F, 6.3398F, 0.2966F, 0.1309F, -0.0011F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(115, 35).addBox(-0.6F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.4707F, -2.944F, -0.6047F, -0.2909F, 0.1957F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(115, 7).addBox(-0.4F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -2.4707F, -2.944F, -0.6047F, 0.2909F, -0.1957F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 100).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.2533F, -1.3581F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 100).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.0787F, -1.1515F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.6278F, -4.9675F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.5436F, 1.8286F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(116, 23).addBox(-0.5F, -0.0479F, -0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.5436F, 3.6286F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(98, 72).addBox(-0.5F, -0.6308F, -0.0326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5436F, 1.8286F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.9801F, -0.6585F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.249F, -4.5424F, -0.6196F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, 0.974F, -4.5424F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 0).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.923F, 2.2295F, 6.628F, -0.8079F, -0.4905F, 0.8048F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 62).addBox(-2.1519F, -0.6768F, -1.6211F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2667F, 4.1325F, 7.8749F, -1.2751F, -0.6633F, 1.5212F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 8).addBox(-2.5F, -0.5F, -2.2F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2423F, 0.0354F, 4.1363F, -1.341F, -0.9045F, 1.625F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 82).addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4649F, -1.5886F, 1.1141F, -2.4733F, 0.2404F, -2.6123F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 83).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0604F, -0.2702F, 2.4951F, -2.4247F, -0.4128F, -3.1345F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 41).addBox(-1.2F, -0.5F, -1.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9496F, -0.4197F, 3.2516F, -1.7388F, -0.9142F, 2.1253F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(69, 86).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1514F, -2.0907F, 3.2248F, -1.1514F, -0.7976F, 1.7653F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(86, 0).addBox(-1.5F, -0.5F, 0.275F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5093F, -0.9907F, 1.918F, -1.057F, -0.9537F, 1.6428F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(116, 20).addBox(-1.1089F, -2.8637F, -0.5255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.45F, 0.0F, -0.4986F, -0.1313F, 0.9354F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(96, 83).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2211F, -2.7941F, 1.5042F, -0.5905F, 0.1223F, 0.8612F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(96, 87).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2824F, -2.6295F, 2.0114F, -0.887F, 0.592F, 0.0565F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(25, 47).addBox(-0.5F, 0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2829F, 2.193F, 7.3882F, -1.3646F, 0.3936F, -0.919F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(98, 68).addBox(-0.775F, -0.45F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2038F, 4.7553F, 8.7857F, -1.0991F, 0.5246F, -0.329F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(104, 100).addBox(-1.1686F, -1.0464F, 0.104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8376F, 4.7917F, 7.9851F, -1.0079F, 0.1451F, 0.1813F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1561F, 6.9747F, 6.8104F, -1.0468F, 0.1053F, 0.459F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(82, 60).addBox(-0.4837F, -0.4843F, -0.2472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.269F, 4.6526F, 6.094F, -1.0943F, 0.234F, 0.1295F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 54).addBox(0.5298F, -1.0103F, -0.9916F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8376F, 4.7917F, 7.9851F, -0.938F, -0.1858F, 0.6527F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(38, 44).addBox(-0.75F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8342F, 1.6603F, 4.3274F, -0.9719F, 0.3286F, -0.0508F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 52).addBox(0.1363F, -0.3053F, -4.7731F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9681F, 5.6201F, 6.784F, -1.1878F, 0.2849F, -0.1296F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(117, 62).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9637F, 5.2018F, 6.5199F, -0.8196F, 0.0467F, 0.147F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(125, 6).addBox(-0.8063F, -0.8522F, -0.1572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 90).addBox(-0.8063F, -0.8522F, 0.2428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, -0.8297F, 0.0043F, 0.234F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 117).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0936F, 4.4255F, 6.8369F, -1.1687F, 0.0467F, 0.147F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(30, 110).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.231F, 3.4305F, 6.626F, -2.1286F, 0.0467F, 0.147F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(117, 56).addBox(-0.5F, -0.375F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1131F, 4.2033F, 6.5536F, -1.8232F, 0.0467F, 0.147F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(76, 99).addBox(-0.5F, -0.375F, -1.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1131F, 4.2033F, 6.5536F, -1.1687F, 0.0467F, 0.147F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(115, 50).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.983F, 4.9667F, 6.1928F, -1.6486F, 0.0467F, 0.147F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(25, 117).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 117).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9643F, 5.4339F, 7.2611F, -2.5213F, 0.0467F, 0.147F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 105).addBox(-0.8063F, -3.5997F, -1.2532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(71, 95).addBox(-0.8063F, -3.7997F, -0.6532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, -2.6623F, 0.0043F, 0.234F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(117, 53).addBox(-0.8063F, 0.8055F, 0.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, 1.2036F, 0.0043F, 0.234F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(56, 115).addBox(-0.8063F, 0.4243F, -0.7232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, 1.7708F, 0.0043F, 0.234F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(69, 90).addBox(-0.8063F, 0.2815F, -2.2712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, 2.2508F, 0.0043F, 0.234F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(22, 94).addBox(-0.8063F, 0.9156F, -2.917F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, 1.8581F, 0.0043F, 0.234F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 110).addBox(-0.8063F, -2.2709F, -3.5336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, 2.7744F, 0.0043F, 0.234F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(122, 100).addBox(-0.8063F, -3.956F, 0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.2173F, 5.687F, 6.8474F, -2.1998F, 0.0043F, 0.234F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(98, 64).addBox(0.5258F, -0.5851F, -1.4243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2667F, 4.1325F, 7.8749F, -0.9601F, 0.1121F, 0.2234F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 7).addBox(-2.0242F, -0.5965F, -2.0218F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2667F, 4.1325F, 7.8749F, -0.9383F, 0.1121F, 0.2234F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5353F, 0.9941F, 4.0095F, -0.5724F, 0.3396F, 0.5181F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.974F, -4.5424F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.923F, 2.2295F, 6.628F, -0.8079F, 0.4905F, -0.8048F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(73, 62).mirror().addBox(1.1519F, -0.6768F, -1.6211F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2667F, 4.1325F, 7.8749F, -1.2751F, 0.6633F, -1.5212F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(24, 8).mirror().addBox(-2.5F, -0.5F, -2.2F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2423F, 0.0354F, 4.1363F, -1.341F, 0.9045F, -1.625F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4649F, -1.5886F, 1.1141F, -2.4733F, -0.2404F, 2.6123F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(18, 83).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0604F, -0.2702F, 2.4951F, -2.4247F, 0.4128F, 3.1345F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.8F, -0.5F, -1.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9496F, -0.4197F, 3.2516F, -1.7388F, 0.9142F, -2.1253F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 86).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1514F, -2.0907F, 3.2248F, -1.1514F, 0.7976F, -1.7653F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, -0.5F, 0.275F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5093F, -0.9907F, 1.918F, -1.057F, 0.9537F, -1.6428F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(116, 20).mirror().addBox(0.1089F, -2.8637F, -0.5255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.45F, 0.0F, -0.4986F, 0.1313F, -0.9354F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(96, 83).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2211F, -2.7941F, 1.5042F, -0.5905F, -0.1223F, -0.8612F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(96, 87).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2824F, -2.6295F, 2.0114F, -0.887F, -0.592F, -0.0565F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-0.5F, 0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2829F, 2.193F, 7.3882F, -1.3646F, -0.3936F, 0.919F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(98, 68).mirror().addBox(-0.225F, -0.45F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2038F, 4.7553F, 8.7857F, -1.0991F, -0.5246F, 0.329F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(104, 100).mirror().addBox(-0.8314F, -1.0464F, 0.104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8376F, 4.7917F, 7.9851F, -1.0079F, -0.1451F, -0.1813F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1561F, 6.9747F, 6.8104F, -1.0468F, -0.1053F, -0.459F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(82, 60).mirror().addBox(-0.5163F, -0.4843F, -0.2472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.269F, 4.6526F, 6.094F, -1.0943F, -0.234F, -0.1295F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(73, 54).mirror().addBox(-1.5298F, -1.0103F, -0.9916F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8376F, 4.7917F, 7.9851F, -0.938F, 0.1858F, -0.6527F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 44).mirror().addBox(-0.25F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8342F, 1.6603F, 4.3274F, -0.9719F, -0.3286F, 0.0508F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-1.1363F, -0.3053F, -4.7731F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9681F, 5.6201F, 6.784F, -1.1878F, -0.2849F, 0.1296F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(117, 62).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9637F, 5.2018F, 6.5199F, -0.8196F, -0.0467F, -0.147F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(125, 6).mirror().addBox(-0.1937F, -0.8522F, -0.1572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 90).mirror().addBox(-0.1937F, -0.8522F, 0.2428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, -0.8297F, -0.0043F, -0.234F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(30, 117).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0936F, 4.4255F, 6.8369F, -1.1687F, -0.0467F, -0.147F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(30, 110).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.231F, 3.4305F, 6.626F, -2.1286F, -0.0467F, -0.147F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(117, 56).mirror().addBox(-0.5F, -0.375F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1131F, 4.2033F, 6.5536F, -1.8232F, -0.0467F, -0.147F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(-0.5F, -0.375F, -1.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1131F, 4.2033F, 6.5536F, -1.1687F, -0.0467F, -0.147F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(115, 50).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.983F, 4.9667F, 6.1928F, -1.6486F, -0.0467F, -0.147F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(25, 117).mirror().addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 117).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9643F, 5.4339F, 7.2611F, -2.5213F, -0.0467F, -0.147F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.1937F, -3.5997F, -1.2532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(71, 95).mirror().addBox(-0.1937F, -3.7997F, -0.6532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, -2.6623F, -0.0043F, -0.234F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(117, 53).mirror().addBox(-0.1937F, 0.8055F, 0.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, 1.2036F, -0.0043F, -0.234F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(56, 115).mirror().addBox(-0.1937F, 0.4243F, -0.7232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, 1.7708F, -0.0043F, -0.234F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 90).mirror().addBox(-0.1937F, 0.2815F, -2.2712F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, 2.2508F, -0.0043F, -0.234F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(22, 94).mirror().addBox(-0.1937F, 0.9156F, -2.917F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, 1.8581F, -0.0043F, -0.234F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(25, 110).mirror().addBox(-0.1937F, -2.2709F, -3.5336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, 2.7744F, -0.0043F, -0.234F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(122, 100).mirror().addBox(-0.1937F, -3.956F, 0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, 5.687F, 6.8474F, -2.1998F, -0.0043F, -0.234F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(98, 64).mirror().addBox(-1.5258F, -0.5851F, -1.4243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2667F, 4.1325F, 7.8749F, -0.9601F, -0.1121F, -0.2234F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(41, 7).mirror().addBox(-0.9758F, -0.5965F, -2.0218F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2667F, 4.1325F, 7.8749F, -0.9383F, -0.1121F, -0.2234F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5353F, 0.9941F, 4.0095F, -0.5724F, -0.3396F, -0.5181F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.935F, 3.4355F, 2.1172F, -1.6839F, -0.0106F, -0.2126F));

		PartDefinition cube_r83 = leftLeg1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(15, 123).addBox(-0.5F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.7852F, 1.1539F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(120, 107).addBox(-0.9F, -2.0F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 4.8861F, 0.3761F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(120, 116).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.556F, -0.6758F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(79, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5446F, -0.4143F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(78, 77).addBox(-0.5F, 1.25F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.5446F, -1.6643F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(120, 119).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 9.3925F, 0.8366F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(10, 123).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4686F, 0.4539F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(27, 77).addBox(-0.5F, 0.231F, -3.2171F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.3406F, -0.3322F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(97, 91).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3406F, 0.9178F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.3406F, 0.9178F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(120, 104).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8289F, 0.2178F, -1.8326F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2071F, 9.6565F, 2.2328F, 1.0255F, -0.1784F, 0.0995F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(111, 18).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 1.1093F, 0.8739F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftLeg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(120, 113).addBox(-0.5F, -0.725F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.8921F, 0.1714F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftLeg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(121, 13).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.0501F, -0.0847F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftLeg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(121, 19).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 0.7758F, 0.1757F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftLeg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(121, 16).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6772F, -0.9514F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(120, 110).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 0.3135F, -0.518F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(28, 32).addBox(-0.5F, -4.5F, -0.625F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 5.059F, -0.7066F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r101 = leftLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(55, 124).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 13.0009F, -3.7509F, 2.2777F, 0.0F, 0.0F));

		PartDefinition cube_r102 = leftLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(124, 93).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 13.7931F, -3.6395F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(83, 124).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 13.3841F, -3.0962F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(68, 124).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 14.0473F, -2.1318F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(121, 25).addBox(-0.5F, 0.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(121, 22).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 12.9999F, -2.4565F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(63, 6).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, 5.6785F, -1.3093F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(123, 44).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(123, 31).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 5.5842F, -1.2759F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(46, 81).addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.5366F, 0.4999F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(123, 71).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0F, 0.771F, -0.0524F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(64, 112).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0F, 2.391F, 0.4914F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(97, 103).addBox(0.7F, -0.65F, -0.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(104, 12).addBox(-0.3F, -0.65F, 0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 2.5731F, -0.3422F, -0.3403F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.003F, 14.3199F, -3.1546F, -0.4378F, -0.0791F, 0.037F));

		PartDefinition cube_r112 = leftLeg3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(17, 87).addBox(-5.5F, -5.5F, -0.625F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(4.0F, 5.5111F, -0.3758F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftLeg3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(41, 104).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.0F, 0.3469F, 0.7174F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftLeg3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(104, 124).addBox(-0.5F, -0.7F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(115, 38).addBox(-0.5F, -0.7F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(55, 121).addBox(-0.5F, -0.7F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(50, 121).addBox(-0.5F, -0.1F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.5007F, -0.3512F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftLeg3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(68, 121).addBox(-0.5F, -0.7F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.5007F, -0.3512F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(79, 121).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.0F, 7.9822F, -1.0855F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(84, 121).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.0F, 8.0501F, -0.4894F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(105, 69).addBox(-5.5F, 0.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.0F, 4.8568F, -1.132F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 103).addBox(-5.5F, -0.7F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, 4.8568F, -1.132F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(12, 86).addBox(-5.5F, -5.5F, -0.025F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.0F, 5.4553F, -1.1739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition toe3 = leftLeg3.addOrReplaceChild("toe3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.375F, 7.0962F, -0.3641F, 0.6981F, -0.3927F, 0.0F));

		PartDefinition cube_r121 = toe3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 107).addBox(-1.5F, -2.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r122 = toe3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(45, 90).addBox(-0.7F, -0.3F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2679F, 1.4476F, 1.2638F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(24, 13).addBox(-2.0F, -1.0F, -3.85F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7376F, 8.7882F, -0.6247F, 0.7458F, 0.0599F, 0.1285F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(39, 20).addBox(-2.5F, -0.4662F, -2.8479F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(82, 65).addBox(-0.5F, -1.4662F, -5.8478F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5027F, -3.3623F, 0.4752F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftToes.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(83, 33).addBox(-0.5F, -1.0F, -1.9F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6886F, -0.4662F, -3.6093F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r124 = leftToes.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(85, 27).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.4662F, -3.3478F, 0.0F, -0.0873F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.935F, 3.4355F, 2.1172F, -1.6402F, 0.0106F, 0.2126F));

		PartDefinition cube_r125 = rightLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(123, 28).addBox(-0.5F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.7852F, 1.1539F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(20, 122).addBox(-0.1F, -2.0F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 4.8861F, 0.3761F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(122, 3).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.556F, -0.6758F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(9, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5446F, -0.4143F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightLeg1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, 1.25F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.5446F, -1.6643F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightLeg1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(109, 121).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 9.3925F, 0.8366F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightLeg1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(28, 123).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4686F, 0.4539F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightLeg1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(18, 78).addBox(-0.5F, 0.231F, -3.2171F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.3406F, -0.3322F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightLeg1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(98, 4).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3406F, 0.9178F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightLeg1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(97, 95).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.3406F, 0.9178F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightLeg1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(104, 121).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8289F, 0.2178F, -1.8326F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2071F, 9.6565F, 2.2328F, 1.1128F, 0.1784F, -0.0995F));

		PartDefinition cube_r136 = rightLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 111).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 1.1093F, 0.8739F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(122, 62).addBox(-0.5F, -0.725F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.8921F, 0.1714F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(60, 122).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.0501F, -0.0847F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(122, 55).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 0.7758F, 0.1757F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(122, 52).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6772F, -0.9514F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(45, 122).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 0.3135F, -0.518F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightLeg2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, -4.5F, -0.625F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, 5.059F, -0.7066F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightLeg2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(124, 58).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 13.0009F, -3.7509F, 2.2777F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightLeg2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(109, 124).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 13.7931F, -3.6395F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightLeg2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(88, 124).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 13.3841F, -3.0962F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightLeg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(78, 124).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, 14.0473F, -2.1318F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightLeg2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(40, 122).addBox(-0.5F, 0.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(35, 122).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 12.9999F, -2.4565F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightLeg2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(45, 63).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, 5.6785F, -1.3093F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightLeg2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(50, 124).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(124, 9).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 5.5842F, -1.2759F, -1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r150 = rightLeg2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(55, 81).addBox(-0.5F, -0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.5366F, 0.4999F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightLeg2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(124, 0).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0F, 0.771F, -0.0524F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r152 = rightLeg2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(112, 100).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0F, 2.391F, 0.4914F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r153 = rightLeg2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(102, 103).addBox(-1.7F, -0.65F, -0.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(28, 104).addBox(-0.7F, -0.65F, 0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 2.5731F, -0.3422F, -0.3403F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.003F, 14.3199F, -3.1546F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r154 = rightLeg3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(87, 77).addBox(4.5F, -5.5F, -0.625F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-4.0F, 5.5111F, -0.3758F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r155 = rightLeg3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(48, 104).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0F, 0.3469F, 0.7174F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r156 = rightLeg3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(124, 122).addBox(-0.5F, -0.7F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(115, 47).addBox(-0.5F, -0.7F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(122, 97).addBox(-0.5F, -0.7F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(94, 122).addBox(-0.5F, -0.1F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.5007F, -0.3512F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r157 = rightLeg3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(99, 122).addBox(-0.5F, -0.7F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.5007F, -0.3512F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r158 = rightLeg3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 122).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0F, 7.9822F, -1.0855F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r159 = rightLeg3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(122, 65).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0F, 8.0501F, -0.4894F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r160 = rightLeg3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(106, 18).addBox(4.5F, 0.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.0F, 4.8568F, -1.132F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r161 = rightLeg3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(103, 80).addBox(4.5F, -0.7F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0F, 4.8568F, -1.132F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightLeg3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(40, 87).addBox(4.5F, -5.5F, -0.025F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.0F, 5.4553F, -1.1739F, -0.0698F, 0.0F, 0.0F));

		PartDefinition toe2 = rightLeg3.addOrReplaceChild("toe2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.375F, 7.0962F, -0.3641F, 0.6981F, 0.3927F, 0.0F));

		PartDefinition cube_r163 = toe2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(107, 55).addBox(0.5F, -2.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2679F, 1.7518F, 0.5397F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r164 = toe2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(52, 90).addBox(-0.3F, -0.3F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2679F, 1.4476F, 1.2638F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(24, 19).addBox(-1.0F, -1.0F, -3.85F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7376F, 8.7882F, -0.6247F, 1.0623F, 0.1276F, 0.1099F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(38, 39).addBox(-1.5F, -0.4662F, -2.8479F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(82, 71).addBox(0.5F, -1.4662F, -5.8478F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5027F, -3.3623F, 0.2134F, 0.0F, 0.0F));

		PartDefinition cube_r165 = rightToes.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(85, 21).addBox(0.5F, -1.0F, -1.9F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6886F, -0.4662F, -3.6093F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r166 = rightToes.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(5, 86).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -0.4662F, -3.3478F, 0.0F, 0.0873F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(83, 98).addBox(-0.5F, -0.0056F, 0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(46, 78).addBox(0.0F, -0.3056F, 1.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1553F, 4.0927F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(90, 98).addBox(-0.505F, -0.9F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, 0.8981F, 2.0591F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 76).addBox(-0.505F, -1.0F, 0.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 1.925F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.4F));

		PartDefinition cube_r167 = tail4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(117, 65).mirror().addBox(0.0F, -0.7917F, -0.1304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(114, 122).mirror().addBox(0.0F, -0.7917F, 0.3696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.91F, -0.2083F, 0.1554F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r168 = tail4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(117, 98).mirror().addBox(0.0F, 1.118F, 0.1191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.91F, -0.2083F, 0.1554F, 1.309F, 0.1309F, 0.0F));

		PartDefinition cube_r169 = tail4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(103, 36).mirror().addBox(0.0F, -0.2995F, 1.2024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.91F, -0.2083F, 0.1554F, 0.1309F, 0.1309F, 0.0F));

		PartDefinition cube_r170 = tail4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(97, 99).mirror().addBox(0.0F, 0.0722F, 0.2473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.91F, -0.2083F, 0.1554F, 0.3054F, 0.1309F, 0.0F));

		PartDefinition cube_r171 = tail4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(117, 101).mirror().addBox(0.0F, 0.0202F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.91F, -0.2083F, 0.1554F, 0.9163F, 0.1309F, 0.0F));

		PartDefinition cube_r172 = tail4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(114, 122).addBox(-1.0F, -0.7917F, 0.3696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(117, 65).addBox(-1.0F, -0.7917F, -0.1304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, -0.2083F, 0.1554F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r173 = tail4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(117, 98).addBox(-1.0F, 1.118F, 0.1191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, -0.2083F, 0.1554F, 1.309F, -0.1309F, 0.0F));

		PartDefinition cube_r174 = tail4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(117, 101).addBox(-1.0F, 0.0202F, -0.4125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2083F, 0.1554F, 0.9163F, -0.1309F, 0.0F));

		PartDefinition cube_r175 = tail4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(97, 99).addBox(-1.0F, 0.0722F, 0.2473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9F, -0.2083F, 0.1554F, 0.3054F, -0.1309F, 0.0F));

		PartDefinition cube_r176 = tail4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(103, 36).addBox(-1.0F, -0.2995F, 1.2024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, -0.2083F, 0.1554F, 0.1309F, -0.1309F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(101, 125).addBox(0.0F, -1.2822F, -0.0293F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0828F, -0.8773F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(78, 45).addBox(0.0F, -0.7301F, 2.782F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 40).addBox(0.0F, -0.6801F, 0.782F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 125).addBox(0.0F, -0.7051F, -1.218F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(116, 26).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 116).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 116).mirror().addBox(0.0F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.1021F, -2.1332F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r180 = body.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-8.0188F, -1.8846F, -0.6111F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -2.2408F, -0.003F, -0.0318F, -1.329F));

		PartDefinition cube_r181 = body.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(107, 60).mirror().addBox(-2.6906F, -0.6227F, -0.6111F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -2.2408F, -0.0185F, -0.026F, -0.8053F));

		PartDefinition cube_r182 = body.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(123, 47).mirror().addBox(-0.9152F, -0.1784F, -0.5874F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.415F, -2.2408F, 0.0076F, -0.0314F, -0.2605F));

		PartDefinition cube_r183 = body.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(-8.2026F, -1.8494F, -0.5143F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.0385F, 0.0927F, -1.2757F));

		PartDefinition cube_r184 = body.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(109, 16).mirror().addBox(-2.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.0797F, 0.061F, -0.7515F));

		PartDefinition cube_r185 = body.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(125, 37).mirror().addBox(-0.9711F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.115F, -4.2408F, 0.1367F, -0.0077F, -0.211F));

		PartDefinition cube_r186 = body.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(73, 125).mirror().addBox(-0.9502F, -0.0937F, -0.4813F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.115F, -6.0408F, 0.2135F, 0.0088F, -0.2109F));

		PartDefinition cube_r187 = body.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(111, 30).mirror().addBox(-2.7642F, -0.5727F, -0.5026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.115F, -6.0408F, 0.1375F, 0.1145F, -0.7464F));

		PartDefinition cube_r188 = body.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(36, 50).mirror().addBox(-8.1075F, -1.8781F, -0.5026F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.115F, -6.0408F, 0.0617F, 0.1678F, -1.2727F));

		PartDefinition cube_r189 = body.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 116).mirror().addBox(0.0F, 0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.2021F, -3.9333F, -0.3425F, 0.1055F, 0.2872F));

		PartDefinition cube_r190 = body.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(125, 68).mirror().addBox(-0.9319F, -0.0082F, -0.3996F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.565F, -0.6158F, -0.1302F, -0.0858F, -0.3482F));

		PartDefinition cube_r191 = body.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(56, 109).mirror().addBox(-2.7926F, -0.4936F, -0.4175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.565F, -0.6158F, -0.1083F, -0.1439F, -0.8934F));

		PartDefinition cube_r192 = body.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-7.1716F, -1.8238F, -0.4175F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.565F, -0.6158F, -0.0213F, -0.1786F, -1.4229F));

		PartDefinition cube_r193 = body.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(125, 83).mirror().addBox(-3.8824F, -1.8494F, -1.6807F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0999F, -4.2408F, 0.047F, 0.6158F, -1.2521F));

		PartDefinition cube_r194 = body.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(90, 37).mirror().addBox(-3.5535F, -1.8845F, -1.2346F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3648F, -2.2408F, -0.0033F, 0.4046F, -1.3304F));

		PartDefinition cube_r195 = body.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(125, 85).mirror().addBox(-2.9322F, -1.8237F, -1.342F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.5256F, -0.6158F, -0.0231F, 0.4321F, -1.4364F));

		PartDefinition cube_r196 = body.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(96, 125).mirror().addBox(-5.4975F, -1.8781F, -1.2118F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.0713F, -6.0408F, 0.0683F, 0.4726F, -1.2519F));

		PartDefinition cube_r197 = body.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(55, 63).mirror().addBox(-7.1716F, -1.8237F, -0.4175F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.135F, 0.9842F, -0.0387F, -0.2908F, -1.4189F));

		PartDefinition cube_r198 = body.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(76, 33).mirror().addBox(-2.7926F, -0.4936F, -0.4175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.135F, 0.9842F, -0.1813F, -0.2318F, -0.8798F));

		PartDefinition cube_r199 = body.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.9319F, -0.0082F, -0.3996F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.135F, 0.9842F, -0.2376F, -0.124F, -0.3369F));

		PartDefinition cube_r200 = body.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(79, 21).addBox(-0.0681F, -0.0082F, -0.3996F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.135F, 0.9842F, -0.2376F, 0.124F, 0.3369F));

		PartDefinition cube_r201 = body.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(76, 33).addBox(0.7926F, -0.4936F, -0.4175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.135F, 0.9842F, -0.1813F, 0.2318F, 0.8798F));

		PartDefinition cube_r202 = body.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(55, 63).addBox(2.1717F, -1.8237F, -0.4175F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.135F, 0.9842F, -0.0387F, 0.2908F, 1.4189F));

		PartDefinition cube_r203 = body.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(125, 85).addBox(1.9322F, -1.8237F, -1.342F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.5256F, -0.6158F, -0.0231F, -0.4321F, 1.4364F));

		PartDefinition cube_r204 = body.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(63, 60).addBox(2.1717F, -1.8238F, -0.4175F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.565F, -0.6158F, -0.0213F, 0.1786F, 1.4229F));

		PartDefinition cube_r205 = body.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(56, 109).addBox(0.7926F, -0.4936F, -0.4175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.565F, -0.6158F, -0.1083F, 0.1439F, 0.8934F));

		PartDefinition cube_r206 = body.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(125, 68).addBox(-0.0681F, -0.0082F, -0.3996F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.565F, -0.6158F, -0.1302F, 0.0858F, 0.3482F));

		PartDefinition cube_r207 = body.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(45, 116).addBox(-1.0F, 0.4F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.2021F, -3.9333F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r208 = body.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(96, 125).addBox(4.4975F, -1.8781F, -1.2118F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.0713F, -6.0408F, 0.0683F, -0.4726F, 1.2519F));

		PartDefinition cube_r209 = body.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(36, 50).addBox(2.1075F, -1.8781F, -0.5026F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.115F, -6.0408F, 0.0617F, -0.1678F, 1.2727F));

		PartDefinition cube_r210 = body.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(111, 30).addBox(0.7642F, -0.5727F, -0.5026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.115F, -6.0408F, 0.1375F, -0.1145F, 0.7464F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(73, 125).addBox(-0.0498F, -0.0937F, -0.4813F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.115F, -6.0408F, 0.2135F, -0.0088F, 0.2109F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(125, 37).addBox(-0.0289F, 0.003F, -0.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.1367F, 0.0077F, 0.211F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(109, 16).addBox(0.8322F, -0.5004F, -0.5143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.0797F, -0.061F, 0.7515F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(125, 83).addBox(2.8824F, -1.8494F, -1.6807F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0999F, -4.2408F, 0.047F, -0.6158F, 1.2521F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(49, 2).addBox(2.2026F, -1.8494F, -0.5143F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.115F, -4.2408F, 0.0385F, -0.0927F, 1.2757F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(123, 47).addBox(-0.0848F, -0.1784F, -0.5874F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -2.2408F, 0.0076F, 0.0314F, 0.2605F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(107, 60).addBox(0.6906F, -0.6227F, -0.6111F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -2.2408F, -0.0185F, 0.026F, 0.8053F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(90, 37).addBox(2.5535F, -1.8845F, -1.2346F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3648F, -2.2408F, -0.0033F, -0.4046F, 1.3304F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(49, 0).addBox(2.0188F, -1.8846F, -0.6111F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.415F, -2.2408F, -0.003F, 0.0318F, 1.329F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(40, 116).addBox(-1.0F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 116).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 26).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1021F, -2.1332F, -0.3425F, -0.1055F, -0.2872F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.0506F, -4.0332F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.7F, -0.3578F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1702F, -7.4128F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(64, 81).addBox(0.0F, -1.9968F, -1.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.1F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(41, 69).addBox(0.0F, -1.7508F, -1.0624F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(74, 116).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 88).mirror().addBox(0.3F, -0.1F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0902F, -0.8345F, -0.4068F, -0.0807F, 0.1055F, 0.2872F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(38, 125).mirror().addBox(-0.9934F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.415F, -0.6658F, 0.4127F, 0.0733F, -0.2147F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(70, 109).mirror().addBox(-2.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.415F, -0.6658F, 0.2798F, 0.2704F, -0.7311F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-8.3167F, -1.8145F, -0.4043F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.415F, -0.6658F, 0.1043F, 0.373F, -1.2733F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(125, 39).mirror().addBox(-1.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.615F, -2.7408F, 0.5464F, 0.1512F, -0.296F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(106, 33).mirror().addBox(-2.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.615F, -2.7408F, 0.3625F, 0.4031F, -0.8F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(96, 41).mirror().addBox(-5.4102F, -1.789F, -0.4287F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.615F, -2.7408F, 0.1F, 0.5269F, -1.3715F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(125, 49).mirror().addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9653F, 4.5208F, 2.1043F, 0.1474F, 0.8494F, -1.2004F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(116, 88).addBox(-1.3F, -0.1F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 116).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0902F, -0.8345F, -0.4068F, -0.0807F, -0.1055F, -0.2872F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(96, 41).addBox(2.4102F, -1.789F, -0.4287F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.615F, -2.7408F, 0.1F, -0.5269F, 1.3715F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(106, 33).addBox(0.9818F, -0.3442F, -0.4287F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.615F, -2.7408F, 0.3625F, -0.4031F, 0.8F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(125, 39).addBox(0.0167F, 0.2171F, -0.4176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.615F, -2.7408F, 0.5464F, -0.1512F, 0.296F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(125, 49).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9653F, 4.5208F, 2.1043F, 0.1474F, -0.8494F, 1.2004F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(49, 4).addBox(2.3167F, -1.8145F, -0.4043F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.415F, -0.6658F, 0.1043F, -0.373F, 1.2733F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(70, 109).addBox(0.9136F, -0.413F, -0.4043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.415F, -0.6658F, 0.2798F, -0.2704F, 0.7311F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(38, 125).addBox(-0.0066F, 0.1238F, -0.3901F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.415F, -0.6658F, 0.4127F, -0.0733F, 0.2147F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(55, 86).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.47F, 0.7674F, 1.1764F, 0.0F, 0.0F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 61).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(91, 58).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.2709F, -2.9355F, 0.6091F, 0.0F, 0.0F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(46, 86).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6246F, -1.4633F, 0.8273F, 0.0F, 0.0F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(99, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.3562F, 0.3041F, 1.1764F, 0.0F, 0.0F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(64, 116).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 12.5507F, 3.424F, 2.7384F, 0.0F, 0.0F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.725F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 9.0472F, -3.7667F, 0.6833F, 0.0F, 0.0F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(100, 116).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.9855F, -4.3204F, -2.4147F, 0.0F, 0.0F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(5, 110).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.8621F, -4.8778F, 1.5123F, 0.0F, 0.0F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 117).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.4234F, -5.7053F, 0.596F, 0.0F, 0.0F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(115, 116).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.4107F, -5.5463F, 0.1597F, 0.0F, 0.0F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(95, 116).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 10.2383F, -4.9849F, -0.9748F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(105, 45).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 11.606F, -3.5361F, 2.4723F, 0.0F, 0.0F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(74, 35).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.1187F, -2.6776F, 1.0324F, 0.0F, 0.0F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(105, 40).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 12.4501F, -1.7341F, -0.3377F, 0.0F, 0.0F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(78, 40).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 12.6098F, -0.7579F, -1.734F, 0.0F, 0.0F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 12.6843F, 0.2278F, 3.0657F, 0.0F, 0.0F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(91, 53).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 10.7492F, 2.2796F, 1.5385F, 0.0F, 0.0F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(103, 86).addBox(-0.5F, 3.0852F, -2.7589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 9.748F, -0.806F, 1.4949F, 0.0F, 0.0F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(49, 44).addBox(-1.0F, -1.3F, -1.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.7F, -2.3F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.287F, -0.1215F, -1.4115F, 2.8788F, 0.2434F, 0.6886F));

		PartDefinition cube_r259 = leftArm1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(9, 71).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(0.0919F, 0.8272F, -2.5922F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftArm1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0919F, -0.4004F, -1.2758F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r261 = leftArm1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(70, 18).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(0.0919F, 0.2658F, 0.0681F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftArm1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(55, 71).addBox(-1.0F, -1.9F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(0.0919F, 0.6907F, 1.2679F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftArm1.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(69, 44).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0919F, 0.2658F, 0.0681F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftArm1.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(9, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0919F, 16.1218F, -3.2936F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftArm1.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(87, 39).addBox(-0.5F, -0.1F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4081F, 18.0456F, -5.2359F, 0.8596F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftArm1.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(51, 31).addBox(-0.5F, -2.0F, -0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.4081F, 19.865F, -4.6884F, 0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftArm1.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(82, 5).addBox(-0.5F, -2.0F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4081F, 20.2007F, -2.92F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftArm1.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(22, 87).addBox(-0.5F, -0.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4081F, 18.4565F, -1.677F, -1.3657F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftArm1.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(89, 69).addBox(-0.5F, -0.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(89, 65).addBox(-0.5F, 0.6F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4081F, 19.0518F, -1.3087F, -1.0167F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftArm1.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(88, 15).addBox(-0.5F, 0.15F, -0.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.4081F, 19.0381F, -2.78F, 0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftArm1.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4081F, 13.9254F, -3.7132F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftArm1.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(27, 82).addBox(-0.5F, 1.0F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.4081F, 12.5338F, -1.278F, -0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftArm1.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(36, 52).addBox(-0.5F, -2.0F, -1.275F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.4081F, 8.0226F, -1.0049F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftArm1.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(37, 25).addBox(-0.5F, -0.1F, -0.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.4081F, 3.0794F, 1.0887F, 3.0412F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftArm1.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(9, 65).addBox(-0.5F, -0.1F, -1.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4081F, 4.8297F, 0.8342F, -1.7148F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftArm1.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(82, 45).addBox(-0.5F, -1.8F, -1.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(-0.4081F, 6.4315F, 0.353F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftArm1.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(55, 65).addBox(-0.5F, -1.5F, -1.175F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.4081F, 3.8121F, -1.1129F, 0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftArm1.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(18, 67).addBox(-0.5F, -2.1F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.4081F, 6.4315F, 0.353F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftArm1.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(45, 56).addBox(-0.5F, -2.0F, -0.925F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4081F, 8.0226F, -1.0049F, -0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftArm1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(53, 37).addBox(-1.0F, -0.1F, -1.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0919F, 9.981F, -0.5415F, -0.2836F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0644F, 20.2454F, -1.7765F, 2.3691F, -0.1384F, 3.0123F));

		PartDefinition cube_r281 = leftArm2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.65F, 21.0807F, 2.6425F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftArm2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(15, 39).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.65F, 10.8371F, -0.1483F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftArm2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(36, 95).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.65F, 3.5795F, 0.4193F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftArm2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(104, 90).addBox(-0.5F, -2.7F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 104).addBox(-0.5F, -2.7F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.65F, 3.569F, -0.7807F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftArm2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(31, 53).addBox(-0.5F, -3.8F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.65F, 7.2639F, -0.587F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftArm2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(12, 94).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.65F, 8.0214F, -0.1918F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftArm2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(68, 76).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.05F, 7.2867F, 1.3158F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftArm2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(11, 52).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 0.7224F, 0.6114F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftArm2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(69, 35).addBox(-0.5F, -0.2368F, -1.0116F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(68, 50).addBox(-0.5F, -0.2368F, -0.4116F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.05F, 4.3583F, 1.959F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftArm2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(41, 96).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.188F)), PartPose.offsetAndRotation(-0.05F, 27.6672F, 5.3361F, 2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftArm2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(119, 122).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.05F, 28.2581F, 5.4403F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftArm2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(111, 22).addBox(-0.5F, -1.475F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.05F, 28.4836F, 4.0599F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftArm2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(109, 0).addBox(-0.5F, -1.475F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.05F, 28.4836F, 4.0599F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftArm2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(65, 108).addBox(-0.5F, -1.375F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.05F, 28.4836F, 4.0599F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftArm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(5, 21).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(19, 11).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.05F, 10.8223F, 2.1424F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r296 = leftArm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(62, 35).addBox(-0.5F, -2.0F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, 2.5583F, 1.559F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r297 = leftArm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(107, 103).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.05F, 2.8365F, 0.5207F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7267F, 29.6275F, 3.2519F, 1.3296F, -0.4112F, 0.3494F));

		PartDefinition cube_r298 = leftHand.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(50, 116).addBox(0.0F, -1.5F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3948F, 2.7577F, -1.7599F, -2.7489F, 0.0F, 3.1416F));

		PartDefinition cube_r299 = leftHand.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(65, 122).addBox(0.0F, -3.9F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2948F, 15.9449F, -2.8236F, -3.0805F, 0.0F, 3.1416F));

		PartDefinition cube_r300 = leftHand.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(112, 104).addBox(0.0F, -5.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2948F, 18.4589F, -4.3758F, -2.9932F, 0.0F, 3.1416F));

		PartDefinition cube_r301 = leftHand.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(87, 106).addBox(-0.8657F, -0.1428F, -0.4717F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1052F, 0.8179F, -1.035F, 0.1656F, 0.0587F, 0.0425F));

		PartDefinition cube_r302 = leftHand.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(29, 98).addBox(-0.5F, -3.7F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4198F, 7.1584F, -0.4059F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r303 = leftHand.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(64, 85).addBox(-0.5F, -5.7F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4198F, 7.1584F, -0.4059F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r304 = leftHand.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(87, 111).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.4198F, 8.5211F, -0.7268F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftHand.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(92, 111).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.4198F, 10.8004F, -1.4784F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftHand.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(106, 23).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4198F, 8.5211F, -0.7268F, -0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftHand.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(54, 6).addBox(-0.5F, -1.0327F, 2.2083F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.2948F, 16.356F, -3.8127F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftHand.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(76, 90).addBox(-1.0F, 0.85F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftHand.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(50, 63).addBox(-0.5F, -6.5F, -0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3948F, 6.8206F, -1.7596F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftHand.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(98, 8).addBox(-0.5F, -9.5F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3948F, 16.417F, -4.3689F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftHand.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(91, 9).addBox(-0.5F, -6.6F, -3.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3948F, 16.3653F, -4.5621F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r312 = leftHand.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(5, 105).addBox(-0.5F, -8.9F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3948F, 16.3653F, -4.5621F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftHand.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(36, 78).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3948F, 7.2405F, -1.941F, -0.288F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.287F, -0.1215F, -1.4115F, 2.6764F, -0.0438F, -0.668F));

		PartDefinition cube_r314 = rightArm1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(73, 49).addBox(-1.0F, -1.9F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.0919F, 0.8272F, -2.5922F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightArm1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(41, 73).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.0919F, -0.4004F, -1.2758F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightArm1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(18, 73).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(-0.0919F, 0.2658F, 0.0681F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightArm1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(27, 72).addBox(-1.0F, -1.9F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.119F)), PartPose.offsetAndRotation(-0.0919F, 0.6907F, 1.2679F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(64, 71).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.0919F, 0.2658F, 0.0681F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(18, 60).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0919F, 16.1218F, -3.2936F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(87, 85).addBox(-1.5F, -0.1F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4081F, 18.0456F, -5.2359F, 0.8596F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(51, 50).addBox(-1.5F, -2.0F, -0.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.4081F, 19.865F, -4.6884F, 0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightArm1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(82, 10).addBox(-1.5F, -2.0F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.4081F, 20.2007F, -2.92F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r323 = rightArm1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(31, 87).addBox(-1.5F, -0.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4081F, 18.4565F, -1.677F, -1.3657F, 0.0F, 0.0F));

		PartDefinition cube_r324 = rightArm1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(90, 33).addBox(-1.5F, -0.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(87, 89).addBox(-1.5F, 0.6F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4081F, 19.0518F, -1.3087F, -1.0167F, 0.0F, 0.0F));

		PartDefinition cube_r325 = rightArm1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(89, 73).addBox(-1.5F, 0.15F, -0.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(0.4081F, 19.0381F, -2.78F, 0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r326 = rightArm1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(31, 59).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.4081F, 13.9254F, -3.7132F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightArm1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(82, 55).addBox(-1.5F, 1.0F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(0.4081F, 12.5338F, -1.278F, -0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightArm1.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(22, 53).addBox(-1.5F, -2.0F, -1.275F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(0.4081F, 8.0226F, -1.0049F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r329 = rightArm1.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(39, 13).addBox(-1.5F, -0.1F, -0.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4081F, 3.0794F, 1.0887F, 3.0412F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightArm1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(27, 66).addBox(-1.5F, -0.1F, -1.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.4081F, 4.8297F, 0.8342F, -1.7148F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightArm1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(82, 50).addBox(-1.5F, -1.8F, -1.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.116F)), PartPose.offsetAndRotation(0.4081F, 6.4315F, 0.353F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightArm1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(64, 65).addBox(-1.5F, -1.5F, -1.175F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.4081F, 3.8121F, -1.1129F, 0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightArm1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(67, 24).addBox(-1.5F, -2.1F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4081F, 6.4315F, 0.353F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightArm1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(54, 56).addBox(-1.5F, -2.0F, -0.925F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.4081F, 8.0226F, -1.0049F, -0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightArm1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(54, 18).addBox(-1.0F, -0.1F, -1.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0919F, 9.981F, -0.5415F, -0.2836F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0644F, 20.2454F, -1.7765F, 2.2732F, 0.0465F, -3.106F));

		PartDefinition cube_r336 = rightArm2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(62, 25).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.65F, 21.0807F, 2.6425F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightArm2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(20, 39).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.65F, 10.8371F, -0.1483F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r338 = rightArm2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(66, 95).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.65F, 3.5795F, 0.4193F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightArm2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(104, 95).addBox(-0.5F, -2.7F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 104).addBox(-0.5F, -2.7F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.65F, 3.569F, -0.7807F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightArm2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -3.8F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.65F, 7.2639F, -0.587F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightArm2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(17, 95).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.65F, 8.0214F, -0.1918F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r342 = rightArm2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(73, 77).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.05F, 7.2867F, 1.3158F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightArm2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(52, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 0.7224F, 0.6114F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightArm2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(70, 9).addBox(-0.5F, -0.2368F, -1.0116F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(36, 69).addBox(-0.5F, -0.2368F, -0.4116F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.05F, 4.3583F, 1.959F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightArm2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(48, 96).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.188F)), PartPose.offsetAndRotation(0.05F, 27.6672F, 5.3361F, 2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightArm2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(5, 123).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.05F, 28.2581F, 5.4403F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightArm2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(70, 111).addBox(-0.5F, -1.475F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.05F, 28.4836F, 4.0599F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightArm2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5F, -1.475F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.05F, 28.4836F, 4.0599F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightArm2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(108, 74).addBox(-0.5F, -1.375F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.05F, 28.4836F, 4.0599F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightArm2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(0, 21).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.05F, 10.8223F, 2.1424F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightArm2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(63, 16).addBox(-0.5F, -2.0F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, 2.5583F, 1.559F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightArm2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(41, 108).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.05F, 2.8365F, 0.5207F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7267F, 29.6275F, 3.2519F, 1.2066F, 0.3264F, -0.3274F));

		PartDefinition cube_r353 = rightHand.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(120, 44).addBox(0.0F, -1.5F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3948F, 2.7577F, -1.7599F, -2.7489F, 0.0F, -3.1416F));

		PartDefinition cube_r354 = rightHand.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(25, 123).addBox(0.0F, -3.9F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2948F, 15.9449F, -2.8236F, -3.0805F, 0.0F, -3.1416F));

		PartDefinition cube_r355 = rightHand.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(107, 112).addBox(0.0F, -5.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2948F, 18.4589F, -4.3758F, -2.9932F, 0.0F, -3.1416F));

		PartDefinition cube_r356 = rightHand.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(92, 106).addBox(-0.1343F, -0.1428F, -0.4717F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1052F, 0.8179F, -1.035F, 0.1656F, -0.0587F, -0.0425F));

		PartDefinition cube_r357 = rightHand.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(60, 98).addBox(-0.5F, -3.7F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4198F, 7.1584F, -0.4059F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r358 = rightHand.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -5.7F, -0.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4198F, 7.1584F, -0.4059F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r359 = rightHand.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(35, 112).addBox(-0.5F, -1.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.4198F, 8.5211F, -0.7268F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r360 = rightHand.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(20, 112).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.4198F, 10.8004F, -1.4784F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r361 = rightHand.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(82, 106).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4198F, 8.5211F, -0.7268F, -0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r362 = rightHand.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(60, 44).addBox(-0.5F, -1.0327F, 2.2083F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.2948F, 16.356F, -3.8127F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightHand.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(91, 4).addBox(0.0F, 0.85F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.1052F, -0.0821F, -1.435F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r364 = rightHand.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(63, 50).addBox(-0.5F, -6.5F, -0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3948F, 6.8206F, -1.7596F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightHand.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(55, 98).addBox(-0.5F, -9.5F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.3948F, 16.417F, -4.3689F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightHand.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(91, 43).addBox(-0.5F, -6.6F, -3.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3948F, 16.3653F, -4.5621F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightHand.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(15, 105).addBox(-0.5F, -8.9F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3948F, 16.3653F, -4.5621F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightHand.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(41, 78).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3948F, 7.2405F, -1.941F, -0.288F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0142F, -0.1474F, -3.0035F));

		PartDefinition cube_r369 = bone2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(46, 108).addBox(-0.4718F, 0.2901F, -0.6972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3093F, 0.8106F, 0.2663F, 0.6698F, 0.2097F, 0.1358F));

		PartDefinition cube_r370 = bone2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(10, 105).addBox(-0.4718F, -0.828F, -0.6133F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3093F, 0.8106F, 0.2663F, 0.4517F, 0.2097F, 0.1358F));

		PartDefinition cube_r371 = bone2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(106, 28).addBox(-0.4718F, 2.1605F, 0.0381F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3093F, 0.8106F, 0.2663F, 0.1462F, 0.2097F, 0.1358F));

		PartDefinition cube_r372 = bone2.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(10, 110).addBox(-0.4718F, 2.1212F, -0.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3093F, 0.8106F, 0.2663F, 0.3557F, 0.2097F, 0.1358F));

		PartDefinition cube_r373 = bone2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(46, 112).addBox(-0.4718F, 3.9344F, -1.2941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3093F, 0.8106F, 0.2663F, 0.5738F, 0.2097F, 0.1358F));

		PartDefinition cube_r374 = bone2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(117, 3).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 6.7436F, 3.8427F, 0.2422F, 0.2097F, 0.3801F));

		PartDefinition cube_r375 = bone2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(110, 7).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0252F, 6.2336F, 2.8481F, 0.6786F, 0.2097F, 0.3801F));

		PartDefinition cube_r376 = bone2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(108, 78).addBox(-0.5F, -2.0F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.9436F, 8.4873F, 2.7701F, 0.7658F, 0.2097F, 0.3801F));

		PartDefinition cube_r377 = bone2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(97, 14).addBox(-0.9683F, -0.3865F, -3.188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(99, 22).addBox(-0.9683F, -0.7865F, -3.188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5623F, 5.6437F, 2.1337F, 1.5512F, 0.2097F, 0.3801F));

		PartDefinition cube_r378 = bone2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(5, 92).addBox(-0.9683F, -1.8704F, -0.6673F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5623F, 5.6437F, 2.1337F, 2.8166F, 0.2097F, 0.3801F));

		PartDefinition cube_r379 = bone2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(38, 105).addBox(0.0F, 0.0F, -0.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4503F, 10.5281F, 6.184F, 2.0838F, -0.2946F, 1.6127F));

		PartDefinition cube_r380 = bone2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(25, 39).addBox(0.0F, -0.2F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1574F, 10.2234F, 5.5427F, 2.0893F, -0.3249F, 1.5947F));

		PartDefinition cube_r381 = bone2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(15, 21).addBox(0.0F, -0.8F, -0.8F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9594F, 9.8375F, 5.1403F, 2.1628F, -0.3388F, 1.5833F));

		PartDefinition cube_r382 = bone2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(61, 111).addBox(0.0F, -0.4F, -0.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7751F, 9.3904F, 4.8832F, 2.3203F, -0.4498F, 1.4914F));

		PartDefinition cube_r383 = bone2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(27, 60).addBox(0.0F, -0.6F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7959F, 8.8954F, 4.5164F, 2.5251F, -0.6175F, 1.2436F));

		PartDefinition cube_r384 = bone2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(11, 46).addBox(0.0F, -1.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4535F, 8.4306F, 4.3506F, 2.791F, -0.3032F, 0.914F));

		PartDefinition cube_r385 = bone2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(90, 93).addBox(-0.5902F, -0.3248F, -0.0112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1715F, 9.4047F, 2.9419F, 1.8747F, -0.0431F, 0.3423F));

		PartDefinition cube_r386 = bone2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(91, 48).addBox(-0.5902F, -1.3709F, -1.7087F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.1715F, 9.4047F, 2.9419F, -2.6195F, -0.0431F, 0.3423F));

		PartDefinition cube_r387 = bone2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(10, 117).addBox(0.0F, -2.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 110).addBox(0.0F, -2.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3309F, 10.5016F, 6.0289F, -2.0112F, 0.2763F, 0.0711F));

		PartDefinition cube_r388 = bone2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(92, 24).addBox(-0.5902F, -3.4726F, -1.1367F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1715F, 9.4047F, 2.9419F, -2.2704F, -0.0431F, 0.3423F));

		PartDefinition cube_r389 = bone2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(99, 32).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6765F, 11.6555F, 5.9615F, -2.0828F, 0.671F, -0.0118F));

		PartDefinition cube_r390 = bone2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(75, 9).addBox(-0.5902F, -3.6537F, -0.0399F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.1715F, 9.4047F, 2.9419F, -1.965F, -0.0431F, 0.3423F));

		PartDefinition cube_r391 = bone2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(92, 19).addBox(-0.5902F, -0.0397F, -1.6551F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1715F, 9.4047F, 2.9419F, -0.7433F, -0.0431F, 0.3423F));

		PartDefinition cube_r392 = bone2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(5, 117).addBox(-0.5F, -0.575F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(107, 108).addBox(-0.5F, -0.575F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9899F, 8.4255F, 0.9566F, 1.5549F, 0.1289F, 0.169F));

		PartDefinition cube_r393 = bone2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(108, 82).addBox(-1.0265F, -2.0229F, -0.0151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7715F, 9.9047F, 0.4419F, 0.5077F, 0.1289F, 0.169F));

		PartDefinition cube_r394 = bone2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(105, 50).addBox(-1.0265F, -1.6141F, 1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7715F, 9.9047F, 0.4419F, 1.1622F, 0.1289F, 0.169F));

		PartDefinition cube_r395 = bone2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(83, 93).addBox(-0.9683F, -2.9477F, -1.4467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5623F, 5.6437F, 2.1337F, 2.4239F, 0.2097F, 0.3801F));

		PartDefinition cube_r396 = bone2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(114, 95).addBox(-0.4908F, -0.347F, -1.2414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2881F, 1.2991F, -1.7962F, 0.938F, -0.4354F, 0.4777F));

		PartDefinition cube_r397 = bone2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(115, 44).addBox(-0.9318F, -0.9404F, 0.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(115, 41).addBox(-0.9318F, -0.9404F, -0.2036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6707F, 5.9305F, -2.8484F, -1.921F, -0.0511F, 0.9679F));

		PartDefinition cube_r398 = bone2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(30, 120).addBox(-0.8318F, -1.5698F, -0.5763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9663F, 4.7918F, -2.4275F, 3.0828F, -0.1523F, 0.6781F));

		PartDefinition cube_r399 = bone2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(25, 120).addBox(-0.8318F, -0.8423F, -0.4527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.9663F, 4.7918F, -2.4275F, -3.0258F, -0.1523F, 0.6781F));

		PartDefinition cube_r400 = bone2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(112, 55).addBox(-0.8844F, -2.1617F, -0.4883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1663F, 2.8918F, -2.4275F, 3.1265F, -0.1523F, 0.3727F));

		PartDefinition cube_r401 = bone2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 123).addBox(-0.8844F, -0.6006F, -0.8671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1663F, 2.8918F, -2.4275F, 1.6429F, -0.1523F, 0.3727F));

		PartDefinition cube_r402 = bone2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(120, 38).addBox(-0.4724F, -2.531F, 0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1663F, 0.5918F, -1.5275F, 2.9443F, -0.3012F, 0.3143F));

		PartDefinition cube_r403 = bone2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(120, 41).addBox(-0.4908F, -1.242F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2881F, 1.2991F, -1.7962F, -0.3273F, -0.4354F, 0.4777F));

		PartDefinition cube_r404 = bone2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(123, 80).addBox(-0.4908F, -0.941F, -0.874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.2881F, 1.2991F, -1.7962F, -1.1127F, -0.4354F, 0.4777F));

		PartDefinition cube_r405 = bone2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(123, 77).addBox(-0.4908F, -0.2006F, -0.4341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2881F, 1.2991F, -1.7962F, -2.2908F, -0.4354F, 0.4777F));

		PartDefinition cube_r406 = bone2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(120, 35).addBox(-0.4908F, -1.134F, -0.0928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.2881F, 1.2991F, -1.7962F, 2.727F, -0.4354F, 0.4777F));

		PartDefinition cube_r407 = bone2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(110, 69).addBox(-0.4724F, -2.9001F, -0.3834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.1663F, 0.5918F, -1.5275F, 2.7698F, -0.3012F, 0.3143F));

		PartDefinition cube_r408 = bone2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(22, 99).addBox(-0.4908F, -0.3072F, -0.7663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.2881F, 1.2991F, -1.7962F, 0.8071F, -0.4354F, 0.4777F));

		PartDefinition cube_r409 = bone2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7361F, 0.0925F, 7.1355F, -0.3094F, -0.2294F, -0.3198F));

		PartDefinition cube_r410 = bone2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(73, 67).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1771F, -0.3806F, 4.2263F, -0.0913F, -0.2294F, -0.3198F));

		PartDefinition cube_r411 = bone2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(50, 25).addBox(-0.379F, -0.3622F, -0.3857F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.015F, -0.0487F, -0.3274F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0142F, -0.1474F, -3.0035F));

		PartDefinition cube_r412 = bone4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(46, 108).mirror().addBox(-0.5282F, 0.2901F, -0.6972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 0.8106F, 0.2663F, 0.6698F, -0.2097F, -0.1358F));

		PartDefinition cube_r413 = bone4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-0.5282F, -0.828F, -0.6133F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 0.8106F, 0.2663F, 0.4517F, -0.2097F, -0.1358F));

		PartDefinition cube_r414 = bone4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(106, 28).mirror().addBox(-0.5282F, 2.1605F, 0.0381F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 0.8106F, 0.2663F, 0.1462F, -0.2097F, -0.1358F));

		PartDefinition cube_r415 = bone4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(10, 110).mirror().addBox(-0.5282F, 2.1212F, -0.4119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 0.8106F, 0.2663F, 0.3557F, -0.2097F, -0.1358F));

		PartDefinition cube_r416 = bone4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(46, 112).mirror().addBox(-0.5282F, 3.9344F, -1.2941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3093F, 0.8106F, 0.2663F, 0.5738F, -0.2097F, -0.1358F));

		PartDefinition cube_r417 = bone4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(117, 3).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.001F, 6.7436F, 3.8427F, 0.2422F, -0.2097F, -0.3801F));

		PartDefinition cube_r418 = bone4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(110, 7).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0252F, 6.2336F, 2.8481F, 0.6786F, -0.2097F, -0.3801F));

		PartDefinition cube_r419 = bone4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(108, 78).mirror().addBox(-0.5F, -2.0F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.9436F, 8.4873F, 2.7701F, 0.7658F, -0.2097F, -0.3801F));

		PartDefinition cube_r420 = bone4.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(97, 14).mirror().addBox(-0.0317F, -0.3865F, -3.188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(99, 22).mirror().addBox(-0.0317F, -0.7865F, -3.188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5623F, 5.6437F, 2.1337F, 1.5512F, -0.2097F, -0.3801F));

		PartDefinition cube_r421 = bone4.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.0317F, -1.8704F, -0.6673F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5623F, 5.6437F, 2.1337F, 2.8166F, -0.2097F, -0.3801F));

		PartDefinition cube_r422 = bone4.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(38, 105).mirror().addBox(0.0F, 0.0F, -0.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4503F, 10.5281F, 6.184F, 2.0838F, 0.2946F, -1.6127F));

		PartDefinition cube_r423 = bone4.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(25, 39).mirror().addBox(0.0F, -0.2F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1574F, 10.2234F, 5.5427F, 2.0893F, 0.3249F, -1.5947F));

		PartDefinition cube_r424 = bone4.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(15, 21).mirror().addBox(0.0F, -0.8F, -0.8F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9594F, 9.8375F, 5.1403F, 2.1628F, 0.3388F, -1.5833F));

		PartDefinition cube_r425 = bone4.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(61, 111).mirror().addBox(0.0F, -0.4F, -0.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7751F, 9.3904F, 4.8832F, 2.3203F, 0.4498F, -1.4914F));

		PartDefinition cube_r426 = bone4.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(27, 60).mirror().addBox(0.0F, -0.6F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7959F, 8.8954F, 4.5164F, 2.5251F, 0.6175F, -1.2436F));

		PartDefinition cube_r427 = bone4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(11, 46).mirror().addBox(0.0F, -1.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4535F, 8.4306F, 4.3506F, 2.791F, 0.3032F, -0.914F));

		PartDefinition cube_r428 = bone4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(90, 93).mirror().addBox(-0.4098F, -0.3248F, -0.0112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1715F, 9.4047F, 2.9419F, 1.8747F, 0.0431F, -0.3423F));

		PartDefinition cube_r429 = bone4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(91, 48).mirror().addBox(-0.4098F, -1.3709F, -1.7087F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.1715F, 9.4047F, 2.9419F, -2.6195F, 0.0431F, -0.3423F));

		PartDefinition cube_r430 = bone4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(10, 117).mirror().addBox(-1.0F, -2.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 110).mirror().addBox(-1.0F, -2.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3309F, 10.5016F, 6.0289F, -2.0112F, -0.2763F, -0.0711F));

		PartDefinition cube_r431 = bone4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(92, 24).mirror().addBox(-0.4098F, -3.4726F, -1.1367F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1715F, 9.4047F, 2.9419F, -2.2704F, 0.0431F, -0.3423F));

		PartDefinition cube_r432 = bone4.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(99, 32).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6765F, 11.6555F, 5.9615F, -2.0828F, -0.671F, 0.0118F));

		PartDefinition cube_r433 = bone4.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(75, 9).mirror().addBox(-0.4098F, -3.6537F, -0.0399F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.1715F, 9.4047F, 2.9419F, -1.965F, 0.0431F, -0.3423F));

		PartDefinition cube_r434 = bone4.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(92, 19).mirror().addBox(-0.4098F, -0.0397F, -1.6551F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1715F, 9.4047F, 2.9419F, -0.7433F, 0.0431F, -0.3423F));

		PartDefinition cube_r435 = bone4.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(5, 117).mirror().addBox(-0.5F, -0.575F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(107, 108).mirror().addBox(-0.5F, -0.575F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9899F, 8.4255F, 0.9566F, 1.5549F, -0.1289F, -0.169F));

		PartDefinition cube_r436 = bone4.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(0.0265F, -2.0229F, -0.0151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7715F, 9.9047F, 0.4419F, 0.5077F, -0.1289F, -0.169F));

		PartDefinition cube_r437 = bone4.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(105, 50).mirror().addBox(0.0265F, -1.6141F, 1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7715F, 9.9047F, 0.4419F, 1.1622F, -0.1289F, -0.169F));

		PartDefinition cube_r438 = bone4.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(-0.0317F, -2.9477F, -1.4467F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5623F, 5.6437F, 2.1337F, 2.4239F, -0.2097F, -0.3801F));

		PartDefinition cube_r439 = bone4.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(114, 95).mirror().addBox(-0.5092F, -0.347F, -1.2414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2881F, 1.2991F, -1.7962F, 0.938F, 0.4354F, -0.4777F));

		PartDefinition cube_r440 = bone4.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(115, 44).mirror().addBox(-0.0682F, -0.9404F, 0.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(115, 41).mirror().addBox(-0.0682F, -0.9404F, -0.2036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6707F, 5.9305F, -2.8484F, -1.921F, 0.0511F, -0.9679F));

		PartDefinition cube_r441 = bone4.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(30, 120).mirror().addBox(-0.1682F, -1.5698F, -0.5763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9663F, 4.7918F, -2.4275F, 3.0828F, 0.1523F, -0.6781F));

		PartDefinition cube_r442 = bone4.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(25, 120).mirror().addBox(-0.1682F, -0.8423F, -0.4527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.9663F, 4.7918F, -2.4275F, -3.0258F, 0.1523F, -0.6781F));

		PartDefinition cube_r443 = bone4.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(112, 55).mirror().addBox(-0.1156F, -2.1617F, -0.4883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1663F, 2.8918F, -2.4275F, 3.1265F, 0.1523F, -0.3727F));

		PartDefinition cube_r444 = bone4.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-0.1156F, -0.6006F, -0.8671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1663F, 2.8918F, -2.4275F, 1.6429F, 0.1523F, -0.3727F));

		PartDefinition cube_r445 = bone4.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(120, 38).mirror().addBox(-0.5276F, -2.531F, 0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1663F, 0.5918F, -1.5275F, 2.9443F, 0.3012F, -0.3143F));

		PartDefinition cube_r446 = bone4.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(120, 41).mirror().addBox(-0.5092F, -1.242F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2881F, 1.2991F, -1.7962F, -0.3273F, 0.4354F, -0.4777F));

		PartDefinition cube_r447 = bone4.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(123, 80).mirror().addBox(-0.5092F, -0.941F, -0.874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.2881F, 1.2991F, -1.7962F, -1.1127F, 0.4354F, -0.4777F));

		PartDefinition cube_r448 = bone4.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(123, 77).mirror().addBox(-0.5092F, -0.2006F, -0.4341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2881F, 1.2991F, -1.7962F, -2.2908F, 0.4354F, -0.4777F));

		PartDefinition cube_r449 = bone4.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(120, 35).mirror().addBox(-0.5092F, -1.134F, -0.0928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.2881F, 1.2991F, -1.7962F, 2.727F, 0.4354F, -0.4777F));

		PartDefinition cube_r450 = bone4.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(110, 69).mirror().addBox(-0.5276F, -2.9001F, -0.3834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.1663F, 0.5918F, -1.5275F, 2.7698F, 0.3012F, -0.3143F));

		PartDefinition cube_r451 = bone4.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(22, 99).mirror().addBox(-0.5092F, -0.3072F, -0.7663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.2881F, 1.2991F, -1.7962F, 0.8071F, 0.4354F, -0.4777F));

		PartDefinition cube_r452 = bone4.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.7361F, 0.0925F, 7.1355F, -0.3094F, 0.2294F, 0.3198F));

		PartDefinition cube_r453 = bone4.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(73, 67).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1771F, -0.3806F, 4.2263F, -0.0913F, 0.2294F, 0.3198F));

		PartDefinition cube_r454 = bone4.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(-0.621F, -0.3622F, -0.3857F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.015F, 0.0487F, 0.3274F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8093F, -4.1F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r455 = neck6.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(46, 125).addBox(0.0F, -3.3943F, -3.1586F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 72).addBox(-0.495F, -1.9943F, -3.1586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.005F, 1.8616F, -0.6323F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r456 = neck6.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(43, 125).addBox(0.0F, -1.5924F, -0.0881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.3863F, -0.8056F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r457 = neck6.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(125, 41).mirror().addBox(-1.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.495F, 0.5702F, 2.1901F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r458 = neck6.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(109, 90).mirror().addBox(-1.7161F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.495F, 0.4295F, 1.62F, 0.0174F, -0.0729F, -0.3327F));

		PartDefinition cube_r459 = neck6.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(109, 90).addBox(-0.284F, -0.1985F, -2.4881F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, 0.4295F, 1.62F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition cube_r460 = neck6.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(125, 41).addBox(0.0641F, -0.961F, -5.2471F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.495F, 0.5702F, 2.1901F, 0.0174F, 0.0729F, 0.3327F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0001F, -2.7542F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r461 = neck5.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(60, 125).addBox(0.0F, -1.3F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.9707F, -1.2801F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r462 = neck5.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(68, 4).addBox(0.005F, -1.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.505F, 0.9138F, 0.1583F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9983F, -2.401F, 0.7399F, -0.0589F, 0.0644F));

		PartDefinition cube_r463 = neck4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(36, 66).addBox(0.0F, -0.575F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.4535F, -0.7282F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r464 = neck4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(15, 28).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.6362F, 0.1304F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r465 = neck4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(67, 30).addBox(-0.995F, -2.0981F, 1.9713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.495F, -3.3882F, -3.9709F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2888F, -1.9482F, 0.313F, -0.0269F, 0.083F));

		PartDefinition cube_r466 = neck3.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(21, 8).addBox(0.0F, -0.5F, -0.55F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -1.6362F, 0.3829F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r467 = neck3.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(33, 105).addBox(-0.995F, 3.0773F, -0.9318F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.495F, -6.1189F, -0.6178F, 0.2443F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8246F, -0.6854F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r468 = neck2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(77, 109).addBox(-0.995F, 1.9272F, -0.8396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.495F, -3.3083F, -2.2532F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck7 = neck2.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6757F, -0.9972F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r469 = neck7.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(109, 92).addBox(-0.995F, 1.9272F, -0.8396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.495F, -2.8858F, -2.5273F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.941F, -1.7695F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r470 = neck8.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(109, 96).addBox(-0.995F, 1.9272F, -0.8396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.495F, -3.3461F, -2.1947F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -1.425F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r471 = neck9.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(97, 109).addBox(-0.995F, 1.9272F, -0.8396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.495F, -3.3461F, -2.1947F, 0.7941F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -0.725F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r472 = neck10.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(102, 109).addBox(-0.995F, 1.9272F, -0.8396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.495F, -2.6461F, -2.8947F, 0.7941F, 0.0F, 0.0F));

		PartDefinition head = neck10.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8815F, -1.3581F, 0.8883F, 0.0678F, -0.055F));

		PartDefinition cube_r473 = head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(89, 118).addBox(-0.5F, 0.225F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.006F, -2.3937F, -3.272F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r474 = head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(84, 118).addBox(-0.5F, -0.325F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.006F, -2.3937F, -3.272F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r475 = head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(110, 39).addBox(-0.5F, 0.0F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.006F, -1.6447F, -2.8489F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r476 = head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(7, 101).addBox(-0.5F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(118, 81).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.006F, -2.1775F, -1.213F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r477 = head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(110, 43).addBox(-0.5F, -0.4F, 0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(110, 35).addBox(-0.5F, 0.2F, 0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.006F, -1.1695F, -2.3294F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r478 = head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(101, 26).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.006F, -2.7629F, -6.6922F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(119, 0).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.006F, -2.4858F, -6.1599F, 2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r480 = head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(110, 118).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.006F, -2.4075F, -5.5651F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r481 = head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(105, 118).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.006F, -2.7728F, -5.0891F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r482 = head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(118, 72).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.006F, -3.2324F, -4.7034F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r483 = head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(25, 114).addBox(-0.5F, -1.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.006F, -3.2306F, -4.7033F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r484 = head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(114, 11).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.006F, -3.2306F, -4.7033F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r485 = head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(65, 105).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -2.7706F, -0.3733F, 2.4478F, 0.0F, 0.0F));

		PartDefinition cube_r486 = head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(105, 66).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -3.1975F, -1.0499F, 1.0079F, 0.0F, 0.0F));

		PartDefinition cube_r487 = head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(116, 17).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.5964F, -2.719F, -1.4808F, 0.9542F, -0.2396F, -0.6272F));

		PartDefinition cube_r488 = head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(105, 63).addBox(-1.0F, -0.9F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -2.6938F, -1.9313F, -0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r489 = head.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(105, 4).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -3.7713F, -2.2762F, 1.0952F, 0.0F, 0.0F));

		PartDefinition cube_r490 = head.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(100, 59).addBox(-1.0F, -1.869F, -0.8057F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.006F, -3.687F, -2.3189F, 1.165F, 0.0F, 0.0F));

		PartDefinition cube_r491 = head.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(31, 91).addBox(-2.0F, -0.1F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.494F, -1.8485F, 0.6083F, -0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r492 = head.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(22, 91).addBox(-2.0F, -0.9F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.494F, -1.1834F, 1.0527F, 0.589F, 0.0F, 0.0F));

		PartDefinition cube_r493 = head.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(92, 80).addBox(-2.0F, -0.1F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.494F, -1.1763F, 1.0465F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r494 = head.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(78, 86).addBox(-1.5F, -0.4024F, -0.1551F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.006F, -0.3034F, -0.0149F, -3.05F, 0.0F, 0.0F));

		PartDefinition cube_r495 = head.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(92, 77).addBox(-1.5F, -0.5376F, -0.6734F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.006F, -0.5284F, -0.0649F, -2.2209F, 0.0F, 0.0F));

		PartDefinition cube_r496 = head.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(92, 29).addBox(-2.0F, 0.4731F, -0.5983F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.494F, -1.1694F, 0.9643F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r497 = head.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(76, 95).addBox(-0.5F, -0.0203F, -1.6717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.006F, -3.8015F, -2.9696F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r498 = head.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(118, 32).addBox(-0.5F, 0.1754F, -1.5742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.006F, -3.8015F, -2.9696F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r499 = head.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(113, 32).addBox(-0.5F, -0.3912F, -0.4128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(110, 112).addBox(-0.5F, -0.3912F, -0.2128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 114).addBox(-0.5F, -0.3912F, -0.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(0.0F, -4.702F, -13.2162F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r500 = head.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(29, 94).addBox(-0.5F, -0.4628F, -0.233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.0F, -4.702F, -13.2162F, 0.877F, 0.0F, 0.0F));

		PartDefinition cube_r501 = head.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(113, 73).addBox(-0.5F, 0.1048F, -0.6817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.404F))
				.texOffs(112, 66).addBox(-0.5F, 0.1798F, -0.5067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -4.702F, -13.2162F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r502 = head.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(97, 113).addBox(-0.5F, -0.984F, 0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -4.577F, -13.3162F, 0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r503 = head.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(45, 52).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, -5.6093F, -11.9591F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r504 = head.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(51, 113).addBox(-0.5F, -1.4237F, 0.6826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -4.577F, -13.3162F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r505 = head.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(118, 29).addBox(-0.5F, -0.4933F, -1.4004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0F, -4.702F, -13.2162F, -2.0726F, 0.0F, 0.0F));

		PartDefinition cube_r506 = head.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(5, 114).addBox(-0.5F, -1.7782F, -0.6018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -4.702F, -13.2162F, -0.589F, 0.0F, 0.0F));

		PartDefinition cube_r507 = head.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(100, 55).addBox(-0.5F, -0.5289F, 1.1033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(0.0F, -4.577F, -13.3162F, 0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r508 = head.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(15, 114).addBox(-0.5F, -0.3039F, -0.2967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -6.3826F, -12.3688F, 0.7199F, 0.0F, 0.0F));

		PartDefinition cube_r509 = head.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5F, -0.8539F, 1.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0F, -4.702F, -13.2162F, 0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r510 = head.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(0, 114).addBox(-0.5F, 0.2535F, -0.308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0F, -6.0037F, -10.8F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r511 = head.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(33, 125).addBox(-0.5F, -0.7574F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -6.7892F, -9.3763F, 2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r512 = head.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(125, 34).addBox(-0.5F, 0.733F, -0.6059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -7.0142F, -10.8513F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r513 = head.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(20, 125).addBox(-0.5F, -0.3079F, 0.2418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0F, -7.0142F, -10.8513F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r514 = head.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(68, 62).addBox(-0.5F, -0.7451F, -0.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -7.0142F, -10.8513F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r515 = head.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(112, 4).addBox(-0.5F, -0.5111F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -5.8617F, -11.2794F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r516 = head.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(77, 5).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0F, -6.8087F, -11.8322F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r517 = head.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(14, 101).addBox(-1.0F, -0.25F, -0.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.006F, -4.7642F, -4.5041F, 1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r518 = head.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(50, 73).addBox(-0.5F, -0.525F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -4.5422F, -4.709F, -0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r519 = head.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(24, 25).addBox(-0.5F, -0.2779F, 0.1753F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -6.7892F, -9.3763F, -0.4058F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.2F, -12.517F, -3.363F));

		PartDefinition cube_r520 = leftFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(89, 121).addBox(-0.6315F, -0.5613F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3149F, 8.4886F, -0.2782F, -2.1369F, 0.7515F, -0.4936F));

		PartDefinition cube_r521 = leftFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(111, 26).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.0538F, 8.0312F, -0.6112F, -1.9148F, 0.3677F, -0.1146F));

		PartDefinition cube_r522 = leftFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(121, 87).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.9545F, 8.2272F, -0.0529F, -1.9202F, 0.139F, -0.1056F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(113, 82).addBox(-0.6233F, -0.472F, -0.4651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(113, 79).addBox(-0.6233F, -0.472F, -0.9651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.3261F, 11.5962F, 2.5169F, -0.8243F, 0.2861F, -0.1666F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(69, 118).addBox(-0.6111F, 0.0119F, -0.5136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3261F, 11.5962F, 2.5169F, -0.5043F, 0.0781F, -0.2594F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(115, 119).addBox(-0.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.1576F, 12.683F, 2.4601F, -1.2461F, 0.0781F, -0.2594F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(58, 118).addBox(-0.5F, -0.55F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.2868F, 12.1141F, 2.7299F, -1.7697F, 0.0781F, -0.2594F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(75, 113).addBox(-0.5F, -0.625F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3986F, 11.5851F, 3.0821F, -2.9478F, 0.0781F, -0.2594F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(96, 37).addBox(-0.6111F, -0.9612F, -1.4158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.3261F, 11.5962F, 2.5169F, -2.1188F, 0.0781F, -0.2594F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(110, 51).addBox(-0.4725F, 2.5864F, -0.5629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.259F))
				.texOffs(110, 47).addBox(-0.4725F, 2.5864F, -0.1879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, 1.2665F, 0.0605F, -0.2065F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(99, 119).addBox(-0.75F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.148F, 8.0115F, -1.336F, 1.4069F, 0.2644F, 0.6099F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(119, 94).addBox(-0.4725F, 1.672F, 1.5751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, 0.5248F, 0.0605F, -0.2065F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(101, 76).addBox(-0.4725F, 0.6293F, 0.9541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.27F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, 0.0884F, 0.0605F, -0.2065F));

		PartDefinition cube_r533 = leftFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(74, 119).addBox(-0.4725F, -0.0263F, 1.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(9, 76).addBox(-0.4725F, 0.3548F, -1.4498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.4875F, 0.0605F, -0.2065F));

		PartDefinition cube_r534 = leftFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(35, 119).addBox(-0.4725F, 0.5634F, 0.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, 0.0361F, 0.0605F, -0.2065F));

		PartDefinition cube_r535 = leftFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(119, 59).addBox(-0.477F, 1.0112F, -1.6672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -1.1856F, 0.0567F, -0.2102F));

		PartDefinition cube_r536 = leftFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(94, 119).addBox(-0.477F, 1.5383F, 0.1312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -2.7127F, 0.0567F, -0.2102F));

		PartDefinition cube_r537 = leftFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(63, 119).addBox(-0.477F, 1.6882F, -0.4274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -2.2328F, 0.0567F, -0.2102F));

		PartDefinition cube_r538 = leftFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(45, 119).addBox(-0.477F, 1.4569F, -1.2817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -1.6219F, 0.0567F, -0.2102F));

		PartDefinition cube_r539 = leftFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(40, 119).addBox(-0.477F, 0.5913F, -1.6893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.8365F, 0.0567F, -0.2102F));

		PartDefinition cube_r540 = leftFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(95, 0).addBox(-0.477F, 0.1827F, -2.1462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.4874F, 0.0567F, -0.2102F));

		PartDefinition cube_r541 = leftFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(34, 101).addBox(-0.4725F, 0.1085F, -0.8121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.3566F, 0.0605F, -0.2065F));

		PartDefinition cube_r542 = leftFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(20, 119).addBox(-0.4725F, 0.2008F, 0.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.2694F, 0.0605F, -0.2065F));

		PartDefinition cube_r543 = leftFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(38, 32).addBox(-0.65F, -0.5F, -0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6005F, 10.0633F, -1.805F, -0.4289F, 0.0495F, -0.1714F));

		PartDefinition cube_r544 = leftFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(76, 23).addBox(-0.4484F, -0.6992F, -0.4069F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2298F, 9.3487F, -3.85F, -0.467F, 0.1288F, -0.2079F));

		PartDefinition cube_r545 = leftFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(119, 10).addBox(-0.5F, -0.425F, -1.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(-1.2298F, 9.3487F, -3.05F, -0.4526F, 0.0605F, -0.2065F));

		PartDefinition cube_r546 = leftFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(119, 91).addBox(-0.4725F, 0.0168F, -4.0844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.361F, 0.0605F, -0.2065F));

		PartDefinition cube_r547 = leftFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(83, 102).addBox(-0.4725F, -3.6518F, -2.5802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, 0.7298F, 0.0605F, -0.2065F));

		PartDefinition cube_r548 = leftFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(102, 0).addBox(-0.4725F, -1.6327F, -3.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.1865F, 0.0605F, -0.2065F));

		PartDefinition cube_r549 = leftFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(59, 93).addBox(-0.4725F, -0.8523F, -3.6596F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.4046F, 0.0605F, -0.2065F));

		PartDefinition cube_r550 = leftFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(65, 101).addBox(-0.4725F, 0.3897F, -2.891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-1.7419F, 7.5861F, -4.9027F, -0.5181F, 0.0605F, -0.2065F));

		PartDefinition cube_r551 = leftFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(53, 118).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(120, 49).addBox(-0.6875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9636F, 9.9487F, 0.67F, -0.4812F, 0.5483F, -0.3702F));

		PartDefinition cube_r552 = leftFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(123, 74).addBox(-0.75F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.856F, 5.9013F, -5.5454F, 2.7989F, 0.1151F, -0.041F));

		PartDefinition cube_r553 = leftFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(59, 90).addBox(-0.75F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.456F, 7.7528F, -1.1411F, -0.3542F, -0.075F, -0.7128F));

		PartDefinition cube_r554 = leftFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(76, 59).addBox(-0.75F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.456F, 7.7528F, -1.1411F, -0.3231F, 0.1657F, -0.0552F));

		PartDefinition cube_r555 = leftFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(98, 43).addBox(-0.5F, -0.8832F, -1.3858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.231F, 9.1715F, -1.192F, -0.451F, 0.1037F, -0.1753F));

		PartDefinition cube_r556 = leftFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(115, 104).addBox(-0.5F, -0.0044F, -0.0551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.231F, 9.1715F, -1.192F, -0.6255F, 0.1037F, -0.1753F));

		PartDefinition cube_r557 = leftFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(113, 76).addBox(-0.5F, -0.3309F, -0.2005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(102, 113).addBox(-0.5F, -0.9059F, -0.2005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.231F, 9.1715F, -1.192F, -0.2241F, 0.1037F, -0.1753F));

		PartDefinition cube_r558 = leftFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(115, 110).addBox(-0.9F, -0.975F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-1.0304F, 9.6101F, 2.8258F, 2.5225F, -0.2073F, -0.6869F));

		PartDefinition cube_r559 = leftFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(110, 115).addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.794F, 10.0956F, 3.4208F, 2.4353F, -0.2073F, -0.6869F));

		PartDefinition cube_r560 = leftFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(115, 107).addBox(-0.9F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.7898F, 10.0979F, 3.4124F, 2.4244F, 0.2333F, -0.1989F));

		PartDefinition cube_r561 = leftFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(85, 115).addBox(-0.4594F, -0.9277F, -0.5785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.8858F, 10.3766F, 2.3609F, -1.8911F, -0.0785F, -0.5787F));

		PartDefinition cube_r562 = leftFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(80, 115).addBox(-0.4594F, -0.4491F, -0.4846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8858F, 10.3766F, 2.3609F, -1.2366F, -0.0785F, -0.5787F));

		PartDefinition cube_r563 = leftFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(115, 85).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(115, 69).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.752F, 10.4389F, 1.8888F, -0.5004F, 0.0133F, -0.4099F));

		PartDefinition cube_r564 = leftFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(69, 115).addBox(-0.4594F, -0.8027F, -0.7726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8858F, 10.3766F, 2.3609F, 0.2469F, -0.0785F, -0.5787F));

		PartDefinition cube_r565 = leftFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(20, 116).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.0864F, 9.2952F, 2.2746F, 0.411F, -1.0062F, 0.3295F));

		PartDefinition cube_r566 = leftFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(116, 14).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-1.0342F, 9.5068F, 2.61F, 1.0415F, -0.2396F, -0.6272F));

		PartDefinition cube_r567 = leftFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(115, 113).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-1.406F, 9.8712F, 2.438F, 1.004F, 0.1106F, -0.0701F));

		PartDefinition cube_r568 = leftFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(76, 28).addBox(-0.9F, -0.1F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.1911F, 8.9716F, 1.5036F, -0.442F, -0.0082F, -0.3272F));

		PartDefinition cube_r569 = leftFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(90, 102).addBox(-0.525F, -0.5F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.506F, 9.5382F, 1.7915F, -0.4263F, 0.1211F, -0.0498F));

		PartDefinition cube_r570 = leftFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(0, 120).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.806F, 10.3795F, 3.6947F, -0.692F, -0.4553F, -0.4878F));

		PartDefinition cube_r571 = leftFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(114, 59).addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.806F, 11.3337F, 4.4158F, 0.8431F, -0.1287F, -0.8302F));

		PartDefinition cube_r572 = leftFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(114, 92).addBox(-0.9F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.319F, 11.3537F, 3.6658F, 0.9284F, -0.8039F, -0.7662F));

		PartDefinition cube_r573 = leftFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(30, 114).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.806F, 11.0011F, 4.1936F, 0.7F, -0.5307F, -0.403F));

		PartDefinition cube_r574 = leftFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(40, 113).addBox(-0.75F, -0.25F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-1.546F, 7.5458F, -1.7112F, -0.3693F, -0.1874F, -0.6347F));

		PartDefinition cube_r575 = leftFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(15, 32).addBox(-0.675F, -0.3F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.259F)), PartPose.offsetAndRotation(-1.606F, 7.6727F, -1.5426F, -0.4068F, 0.0681F, -0.0293F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2F, -12.517F, -3.363F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(89, 121).mirror().addBox(-0.3685F, -0.5613F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3149F, 8.4886F, -0.2782F, -2.1369F, -0.7515F, 0.4936F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(111, 26).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.0538F, 8.0312F, -0.6112F, -1.9148F, -0.3677F, 0.1146F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(121, 87).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.9545F, 8.2272F, -0.0529F, -1.9202F, -0.139F, 0.1056F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(113, 82).mirror().addBox(-0.3767F, -0.472F, -0.4651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(113, 79).mirror().addBox(-0.3767F, -0.472F, -0.9651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.3261F, 11.5962F, 2.5169F, -0.8243F, -0.2861F, 0.1666F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(69, 118).mirror().addBox(-0.3889F, 0.0119F, -0.5136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3261F, 11.5962F, 2.5169F, -0.5043F, -0.0781F, 0.2594F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(115, 119).mirror().addBox(-0.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.1576F, 12.683F, 2.4601F, -1.2461F, -0.0781F, 0.2594F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(58, 118).mirror().addBox(-0.5F, -0.55F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.2868F, 12.1141F, 2.7299F, -1.7697F, -0.0781F, 0.2594F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(75, 113).mirror().addBox(-0.5F, -0.625F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3986F, 11.5851F, 3.0821F, -2.9478F, -0.0781F, 0.2594F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(96, 37).mirror().addBox(-0.3889F, -0.9612F, -1.4158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.3261F, 11.5962F, 2.5169F, -2.1188F, -0.0781F, 0.2594F));

		PartDefinition cube_r585 = rightFace.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(110, 51).mirror().addBox(-0.5275F, 2.5864F, -0.5629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.259F)).mirror(false)
				.texOffs(110, 47).mirror().addBox(-0.5275F, 2.5864F, -0.1879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, 1.2665F, -0.0605F, 0.2065F));

		PartDefinition cube_r586 = rightFace.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(99, 119).mirror().addBox(-0.25F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.148F, 8.0115F, -1.336F, 1.4069F, -0.2644F, -0.6099F));

		PartDefinition cube_r587 = rightFace.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(119, 94).mirror().addBox(-0.5275F, 1.672F, 1.5751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, 0.5248F, -0.0605F, 0.2065F));

		PartDefinition cube_r588 = rightFace.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(101, 76).mirror().addBox(-0.5275F, 0.6293F, 0.9541F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, 0.0884F, -0.0605F, 0.2065F));

		PartDefinition cube_r589 = rightFace.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(74, 119).mirror().addBox(-0.5275F, -0.0263F, 1.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(9, 76).mirror().addBox(-0.5275F, 0.3548F, -1.4498F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.4875F, -0.0605F, 0.2065F));

		PartDefinition cube_r590 = rightFace.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(35, 119).mirror().addBox(-0.5275F, 0.5634F, 0.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, 0.0361F, -0.0605F, 0.2065F));

		PartDefinition cube_r591 = rightFace.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(119, 59).mirror().addBox(-0.523F, 1.0112F, -1.6672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -1.1856F, -0.0567F, 0.2102F));

		PartDefinition cube_r592 = rightFace.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(94, 119).mirror().addBox(-0.523F, 1.5383F, 0.1312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -2.7127F, -0.0567F, 0.2102F));

		PartDefinition cube_r593 = rightFace.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(63, 119).mirror().addBox(-0.523F, 1.6882F, -0.4274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -2.2328F, -0.0567F, 0.2102F));

		PartDefinition cube_r594 = rightFace.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(45, 119).mirror().addBox(-0.523F, 1.4569F, -1.2817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -1.6219F, -0.0567F, 0.2102F));

		PartDefinition cube_r595 = rightFace.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(40, 119).mirror().addBox(-0.523F, 0.5913F, -1.6893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.8365F, -0.0567F, 0.2102F));

		PartDefinition cube_r596 = rightFace.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-0.523F, 0.1827F, -2.1462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.4874F, -0.0567F, 0.2102F));

		PartDefinition cube_r597 = rightFace.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(34, 101).mirror().addBox(-0.5275F, 0.1085F, -0.8121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.3566F, -0.0605F, 0.2065F));

		PartDefinition cube_r598 = rightFace.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(20, 119).mirror().addBox(-0.5275F, 0.2008F, 0.5264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.2694F, -0.0605F, 0.2065F));

		PartDefinition cube_r599 = rightFace.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-0.35F, -0.5F, -0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6005F, 10.0633F, -1.805F, -0.4289F, -0.0495F, 0.1714F));

		PartDefinition cube_r600 = rightFace.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(76, 23).mirror().addBox(-0.5516F, -0.6992F, -0.4069F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.2298F, 9.3487F, -3.85F, -0.467F, -0.1288F, 0.2079F));

		PartDefinition cube_r601 = rightFace.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(119, 10).mirror().addBox(-0.5F, -0.425F, -1.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(1.2298F, 9.3487F, -3.05F, -0.4526F, -0.0605F, 0.2065F));

		PartDefinition cube_r602 = rightFace.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(119, 91).mirror().addBox(-0.5275F, 0.0168F, -4.0844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.361F, -0.0605F, 0.2065F));

		PartDefinition cube_r603 = rightFace.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(83, 102).mirror().addBox(-0.5275F, -3.6518F, -2.5802F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, 0.7298F, -0.0605F, 0.2065F));

		PartDefinition cube_r604 = rightFace.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-0.5275F, -1.6327F, -3.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.1865F, -0.0605F, 0.2065F));

		PartDefinition cube_r605 = rightFace.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(-0.5275F, -0.8523F, -3.6596F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.4046F, -0.0605F, 0.2065F));

		PartDefinition cube_r606 = rightFace.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(65, 101).mirror().addBox(-0.5275F, 0.3897F, -2.891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(1.7419F, 7.5861F, -4.9027F, -0.5181F, -0.0605F, 0.2065F));

		PartDefinition cube_r607 = rightFace.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(53, 118).mirror().addBox(-0.4875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(120, 49).mirror().addBox(-0.3125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9636F, 9.9487F, 0.67F, -0.4812F, -0.5483F, 0.3702F));

		PartDefinition cube_r608 = rightFace.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(123, 74).mirror().addBox(-0.25F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.856F, 5.9013F, -5.5454F, 2.7989F, -0.1151F, 0.041F));

		PartDefinition cube_r609 = rightFace.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(59, 90).mirror().addBox(-0.25F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.456F, 7.7528F, -1.1411F, -0.3542F, 0.075F, 0.7128F));

		PartDefinition cube_r610 = rightFace.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.25F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.456F, 7.7528F, -1.1411F, -0.3231F, -0.1657F, 0.0552F));

		PartDefinition cube_r611 = rightFace.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-0.5F, -0.8832F, -1.3858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.231F, 9.1715F, -1.192F, -0.451F, -0.1037F, 0.1753F));

		PartDefinition cube_r612 = rightFace.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(115, 104).mirror().addBox(-0.5F, -0.0044F, -0.0551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.231F, 9.1715F, -1.192F, -0.6255F, -0.1037F, 0.1753F));

		PartDefinition cube_r613 = rightFace.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(113, 76).mirror().addBox(-0.5F, -0.3309F, -0.2005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(102, 113).mirror().addBox(-0.5F, -0.9059F, -0.2005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.231F, 9.1715F, -1.192F, -0.2241F, -0.1037F, 0.1753F));

		PartDefinition cube_r614 = rightFace.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(115, 110).mirror().addBox(-0.1F, -0.975F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(1.0304F, 9.6101F, 2.8258F, 2.5225F, 0.2073F, 0.6869F));

		PartDefinition cube_r615 = rightFace.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(110, 115).mirror().addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.794F, 10.0956F, 3.4208F, 2.4353F, 0.2073F, 0.6869F));

		PartDefinition cube_r616 = rightFace.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(115, 107).mirror().addBox(-0.1F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.7898F, 10.0979F, 3.4124F, 2.4244F, -0.2333F, 0.1989F));

		PartDefinition cube_r617 = rightFace.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(85, 115).mirror().addBox(-0.5406F, -0.9277F, -0.5785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.8858F, 10.3766F, 2.3609F, -1.8911F, 0.0785F, 0.5787F));

		PartDefinition cube_r618 = rightFace.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(80, 115).mirror().addBox(-0.5406F, -0.4491F, -0.4846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8858F, 10.3766F, 2.3609F, -1.2366F, 0.0785F, 0.5787F));

		PartDefinition cube_r619 = rightFace.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(115, 85).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(115, 69).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.752F, 10.4389F, 1.8888F, -0.5004F, -0.0133F, 0.4099F));

		PartDefinition cube_r620 = rightFace.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(69, 115).mirror().addBox(-0.5406F, -0.8027F, -0.7726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8858F, 10.3766F, 2.3609F, 0.2469F, 0.0785F, 0.5787F));

		PartDefinition cube_r621 = rightFace.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(20, 116).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.0864F, 9.2952F, 2.2746F, 0.411F, 1.0062F, -0.3295F));

		PartDefinition cube_r622 = rightFace.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(116, 14).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(1.0342F, 9.5068F, 2.61F, 1.0415F, 0.2396F, 0.6272F));

		PartDefinition cube_r623 = rightFace.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(115, 113).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(1.406F, 9.8712F, 2.438F, 1.004F, -0.1106F, 0.0701F));

		PartDefinition cube_r624 = rightFace.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(76, 28).mirror().addBox(-0.1F, -0.1F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.1911F, 8.9716F, 1.5036F, -0.442F, 0.0082F, 0.3272F));

		PartDefinition cube_r625 = rightFace.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(90, 102).mirror().addBox(-0.475F, -0.5F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.506F, 9.5382F, 1.7915F, -0.4263F, -0.1211F, 0.0498F));

		PartDefinition cube_r626 = rightFace.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.806F, 10.3795F, 3.6947F, -0.692F, 0.4553F, 0.4878F));

		PartDefinition cube_r627 = rightFace.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(114, 59).mirror().addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.806F, 11.3337F, 4.4158F, 0.8431F, 0.1287F, 0.8302F));

		PartDefinition cube_r628 = rightFace.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(114, 92).mirror().addBox(-0.1F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.319F, 11.3537F, 3.6658F, 0.9284F, 0.8039F, 0.7662F));

		PartDefinition cube_r629 = rightFace.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(30, 114).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.806F, 11.0011F, 4.1936F, 0.7F, 0.5307F, 0.403F));

		PartDefinition cube_r630 = rightFace.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(40, 113).mirror().addBox(-0.25F, -0.25F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(1.546F, 7.5458F, -1.7112F, -0.3693F, 0.1874F, 0.6347F));

		PartDefinition cube_r631 = rightFace.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(15, 32).mirror().addBox(-0.325F, -0.3F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.259F)).mirror(false), PartPose.offsetAndRotation(1.606F, 7.6727F, -1.5426F, -0.4068F, -0.0681F, 0.0293F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.7518F, -0.6699F, -0.2524F, 0.0F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(118, 75).mirror().addBox(-0.027F, -0.5229F, 0.3097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 0.1104F, -0.1474F, -0.0466F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(118, 78).mirror().addBox(-0.0263F, -0.6684F, -0.7367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 1.4299F, -0.1709F, -0.0959F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.0114F, -1.0814F, -1.1172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 3.0683F, -0.1479F, -0.0332F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(79, 118).mirror().addBox(-0.0023F, -0.5946F, -1.3155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 2.7244F, -0.1486F, 0.0293F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(5, 120).mirror().addBox(-0.0114F, -0.7294F, -0.7152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -2.5167F, -0.1479F, -0.0332F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(120, 6).mirror().addBox(-0.0263F, -0.4816F, -1.3277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 0.2955F, -0.1709F, -0.0959F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(50, 76).mirror().addBox(-0.0114F, -1.0773F, -0.0334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.098F)).mirror(false)
				.texOffs(103, 8).mirror().addBox(-0.0114F, -0.6523F, 0.3666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -3.0491F, -0.1479F, -0.0332F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(120, 68).mirror().addBox(-0.0114F, -1.0527F, 1.3894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 3.0159F, -0.1479F, -0.0332F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(120, 84).mirror().addBox(-0.0114F, -3.1681F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 1.6633F, -0.1479F, -0.0332F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(59, 76).mirror().addBox(-0.0114F, -0.5799F, -5.9501F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 0.1362F, -0.1479F, -0.0332F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(21, 103).mirror().addBox(-0.0114F, -0.8355F, 2.5715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -2.9618F, -0.1479F, -0.0332F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(10, 120).mirror().addBox(-0.0114F, -1.0685F, 4.3269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -3.0142F, -0.1479F, -0.0332F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(72, 103).mirror().addBox(-0.0114F, 4.8629F, 1.0048F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -1.6266F, -0.1479F, -0.0332F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(112, 62).mirror().addBox(-0.0114F, 6.9216F, -0.5336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -1.4521F, -0.1479F, -0.0332F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(56, 111).mirror().addBox(-0.0114F, 5.1324F, -0.2883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -1.487F, -0.1479F, -0.0332F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(110, 86).mirror().addBox(-0.1113F, 8.6127F, -0.7875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -1.4346F, -0.1479F, -0.0332F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(51, 109).mirror().addBox(-0.1113F, 10.1211F, 0.5845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -1.5655F, -0.1479F, -0.0332F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(15, 120).mirror().addBox(-0.1113F, 5.395F, 10.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -2.5255F, -0.1479F, -0.0332F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(98, 47).mirror().addBox(-0.1113F, 0.5686F, 10.5884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -2.9356F, -0.1479F, -0.0332F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(98, 51).mirror().addBox(-0.1113F, -1.1359F, 9.0697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, -3.0927F, -0.1479F, -0.0332F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(90, 115).mirror().addBox(-0.1113F, -9.3779F, -1.9402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.2193F, 0.1506F, -1.0267F, 1.5324F, -0.1479F, -0.0332F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(79, 118).addBox(-0.9977F, -0.5946F, -1.3155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 2.7244F, 0.1486F, -0.0293F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(5, 120).addBox(-0.9887F, -0.7294F, -0.7152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -2.5167F, 0.1479F, 0.0332F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(59, 76).addBox(-0.9887F, -0.5799F, -5.9501F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 0.1362F, 0.1479F, 0.0332F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(120, 84).addBox(-0.9887F, -3.1681F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 1.6633F, 0.1479F, 0.0332F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(120, 68).addBox(-0.9887F, -1.0527F, 1.3894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 3.0159F, 0.1479F, 0.0332F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(103, 8).addBox(-0.9887F, -0.6523F, 0.3666F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 76).addBox(-0.9887F, -1.0773F, -0.0334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -3.0491F, 0.1479F, 0.0332F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(56, 111).addBox(-0.9887F, 5.1324F, -0.2883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -1.487F, 0.1479F, 0.0332F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(90, 115).addBox(-0.8886F, -9.3779F, -1.9402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 1.5324F, 0.1479F, 0.0332F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(98, 51).addBox(-0.8886F, -1.1359F, 9.0697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -3.0927F, 0.1479F, 0.0332F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(98, 47).addBox(-0.8886F, 0.5686F, 10.5884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -2.9356F, 0.1479F, 0.0332F));

		PartDefinition cube_r663 = jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(15, 120).addBox(-0.8886F, 5.395F, 10.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -2.5255F, 0.1479F, 0.0332F));

		PartDefinition cube_r664 = jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(51, 109).addBox(-0.8886F, 10.1211F, 0.5845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -1.5655F, 0.1479F, 0.0332F));

		PartDefinition cube_r665 = jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(110, 86).addBox(-0.8886F, 8.6127F, -0.7875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -1.4346F, 0.1479F, 0.0332F));

		PartDefinition cube_r666 = jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(112, 62).addBox(-0.9887F, 6.9216F, -0.5336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -1.4521F, 0.1479F, 0.0332F));

		PartDefinition cube_r667 = jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(72, 103).addBox(-0.9887F, 4.8629F, 1.0048F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -1.6266F, 0.1479F, 0.0332F));

		PartDefinition cube_r668 = jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(10, 120).addBox(-0.9887F, -1.0685F, 4.3269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -3.0142F, 0.1479F, 0.0332F));

		PartDefinition cube_r669 = jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(21, 103).addBox(-0.9887F, -0.8355F, 2.5715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, -2.9618F, 0.1479F, 0.0332F));

		PartDefinition cube_r670 = jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(0, 101).addBox(-0.9887F, -1.0814F, -1.1172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 3.0683F, 0.1479F, 0.0332F));

		PartDefinition cube_r671 = jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(120, 6).addBox(-0.9737F, -0.4816F, -1.3277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 0.2955F, 0.1709F, 0.0959F));

		PartDefinition cube_r672 = jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(118, 78).addBox(-0.9737F, -0.6684F, -0.7367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 1.4299F, 0.1709F, 0.0959F));

		PartDefinition cube_r673 = jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(118, 75).addBox(-0.973F, -0.5229F, 0.3097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2193F, 0.1506F, -1.0267F, 0.1104F, 0.1474F, 0.0466F));

		return LayerDefinition.create(meshdefinition, 130, 130);
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