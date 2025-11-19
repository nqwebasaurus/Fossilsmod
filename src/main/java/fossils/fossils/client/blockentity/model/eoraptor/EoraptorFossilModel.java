package fossils.fossils.client.blockentity.model.eoraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EoraptorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eoraptor;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck5;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart digit;
	private final ModelPart digit2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart digit3;
	private final ModelPart digit4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;

	public EoraptorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eoraptor = this.fossil.getChild("Eoraptor");
		this.bone = this.Eoraptor.getChild("bone");
		this.bone4 = this.Eoraptor.getChild("bone4");
		this.Body = this.Eoraptor.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.Body2 = this.body4.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Neck5 = this.Neck3.getChild("Neck5");
		this.Head = this.Neck5.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Eoraptor.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.RLeg = this.Eoraptor.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Eoraptor.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.digit3 = this.RLeg6.getChild("digit3");
		this.digit4 = this.digit3.getChild("digit4");
		this.RFoot3 = this.RLeg6.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Eoraptor = fossil.addOrReplaceChild("Eoraptor", CubeListBuilder.create().texOffs(38, 41).addBox(-0.5F, -0.7891F, -2.2147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(55, 30).addBox(0.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(55, 30).mirror().addBox(-1.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -28.1673F, -0.7865F, -0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Eoraptor.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 65).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 2.7853F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Eoraptor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 46).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 0.7853F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Eoraptor.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 90).addBox(0.0F, -1.85F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8891F, -0.3147F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Eoraptor.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -1.8868F, 1.3911F, 0.0523F, -0.0027F, 0.0523F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 18).addBox(-0.9F, -1.9419F, 0.0815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.4F, 1.3762F, -1.4615F, -0.0087F, 0.0F, -0.1745F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 82).addBox(-0.9F, -2.6914F, 2.6448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(25, 84).addBox(-0.9F, -2.6914F, 2.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.4F, 1.3762F, -1.4615F, -0.384F, 0.0F, -0.1745F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 0).addBox(-0.9F, -2.441F, 1.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.4F, 1.3762F, -1.4615F, -0.2793F, 0.0F, -0.1745F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(47, 49).addBox(-0.9F, -0.922F, -0.5233F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.4F, 1.3762F, -1.4615F, 0.0524F, 0.0F, -0.1745F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 77).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9204F, 6.8736F, -3.4962F, -0.3256F, -0.0352F, 0.1531F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 78).addBox(-0.4012F, 3.507F, -0.6035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.9821F, 6.7852F, -4.1895F, 0.0584F, -0.0352F, 0.0833F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 30).addBox(-0.4012F, -0.165F, -0.1544F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9821F, 6.7852F, -4.1895F, -0.0638F, -0.0352F, 0.0833F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 73).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.633F, 5.1188F, -3.9632F, -0.1336F, -0.0352F, 0.1531F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3568F, 3.2081F, -3.4407F, -0.2645F, -0.0352F, 0.1531F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2335F, 2.3113F, -3.0159F, -0.439F, -0.0352F, 0.1531F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 75).addBox(-1.1F, 1.4489F, -0.384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.55F, 1.2F, -0.85F, -0.8901F, 0.0F, 0.1571F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 67).addBox(-0.9F, -1.8547F, -1.4737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(54, 86).addBox(-0.9F, -1.8547F, -0.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.4F, 1.3762F, -1.4615F, 0.4974F, 0.0F, -0.1745F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 81).addBox(-0.9F, -1.2227F, -0.2341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.4F, 1.3762F, -1.4615F, 0.9599F, 0.0F, -0.1745F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 84).addBox(-0.9F, -1.8352F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.4F, 1.3762F, -1.4615F, 0.3054F, 0.0F, -0.1745F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 69).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.4831F, 3.8873F, -1.7335F, -1.1345F, 0.0F, 0.1571F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 86).addBox(-0.5F, -0.65F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.6713F, 4.6417F, 0.1542F, 1.118F, -0.1034F, 0.1928F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(87, 6).addBox(-0.1524F, -2.3581F, -0.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.8065F, 7.7658F, 4.2802F, -2.1876F, 0.085F, 0.1052F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(85, 81).addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-1.4527F, 8.8446F, 5.6441F, -1.6203F, 0.085F, 0.1052F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 75).addBox(-0.1524F, -0.5787F, -0.1794F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-1.8065F, 7.7658F, 4.2802F, -0.8F, 0.085F, 0.1052F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 74).addBox(-0.1524F, -0.554F, -0.1579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8065F, 7.7658F, 4.2802F, -0.5557F, 0.085F, 0.1052F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 56).addBox(-0.4024F, -0.0075F, -0.0203F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0065F, 4.9657F, 1.7802F, -0.712F, -0.0006F, 0.1918F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 73).addBox(-0.5F, -0.7F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.028F, 5.6924F, 1.5874F, -0.4877F, -0.1034F, 0.1928F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 41).addBox(-0.5F, -0.7F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.028F, 5.6924F, 1.5874F, -0.7495F, -0.1034F, 0.1928F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(84, 3).addBox(-0.5F, -0.225F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F))
				.texOffs(59, 83).addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5728F, 3.9015F, 0.5894F, -1.2382F, -0.1034F, 0.1928F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5F, -1.575F, -1.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.2846F, 2.6337F, -1.0187F, 2.9234F, 0.0F, 0.1571F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(65, 5).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.4426F, 3.6318F, -0.6226F, -1.6144F, 0.0F, 0.1571F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(48, 67).addBox(-1.1F, -0.3063F, -1.2595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.55F, 1.2F, -0.5F, 0.2182F, 0.0F, 0.1571F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(41, 67).addBox(-1.1F, 0.0187F, -1.2595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.55F, 1.2F, -0.5F, -0.5672F, 0.0F, 0.1571F));

		PartDefinition bone4 = Eoraptor.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -1.8868F, 1.3911F, 0.0523F, 0.0027F, -0.0523F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-0.1F, -1.9419F, 0.0815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, -0.0087F, 0.0F, 0.1745F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 82).mirror().addBox(-0.1F, -2.6914F, 2.6448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(25, 84).mirror().addBox(-0.1F, -2.6914F, 2.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, -0.384F, 0.0F, 0.1745F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.1F, -2.441F, 1.5135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, -0.2793F, 0.0F, 0.1745F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 49).mirror().addBox(-0.1F, -0.922F, -0.5233F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, 0.0524F, 0.0F, 0.1745F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9204F, 6.8736F, -3.4962F, -0.3256F, 0.0352F, -0.1531F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.5988F, 3.507F, -0.6035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.9821F, 6.7852F, -4.1895F, 0.0584F, 0.0352F, -0.0833F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-0.5988F, -0.165F, -0.1544F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9821F, 6.7852F, -4.1895F, -0.0638F, 0.0352F, -0.0833F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.633F, 5.1188F, -3.9632F, -0.1336F, 0.0352F, -0.1531F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3568F, 3.2081F, -3.4407F, -0.2645F, 0.0352F, -0.1531F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2335F, 2.3113F, -3.0159F, -0.439F, 0.0352F, -0.1531F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 75).mirror().addBox(0.1F, 1.4489F, -0.384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 1.2F, -0.85F, -0.8901F, 0.0F, -0.1571F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(86, 67).mirror().addBox(-0.1F, -1.8547F, -1.4737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(54, 86).mirror().addBox(-0.1F, -1.8547F, -0.9737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, 0.4974F, 0.0F, 0.1745F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(44, 81).mirror().addBox(-0.1F, -1.2227F, -0.2341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, 0.9599F, 0.0F, 0.1745F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-0.1F, -1.8352F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3762F, -1.4615F, 0.3054F, 0.0F, 0.1745F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-0.5F, -0.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.4831F, 3.8873F, -1.7335F, -1.1345F, 0.0F, -0.1571F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(38, 86).mirror().addBox(-0.5F, -0.65F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.6713F, 4.6417F, 0.1542F, 1.118F, 0.1034F, -0.1928F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.8476F, -2.3581F, -0.6515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.8065F, 7.7658F, 4.2802F, -2.1876F, -0.085F, -0.1052F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(1.4527F, 8.8446F, 5.6441F, -1.6203F, -0.085F, -0.1052F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 75).mirror().addBox(-0.8476F, -0.5787F, -0.1794F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(1.8065F, 7.7658F, 4.2802F, -0.8F, -0.085F, -0.1052F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.8476F, -0.554F, -0.1579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.8065F, 7.7658F, 4.2802F, -0.5557F, -0.085F, -0.1052F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(-0.5976F, -0.0075F, -0.0203F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0065F, 4.9657F, 1.7802F, -0.712F, 0.0006F, -0.1918F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(-0.5F, -0.7F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.028F, 5.6924F, 1.5874F, -0.4877F, 0.1034F, -0.1928F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(73, 41).mirror().addBox(-0.5F, -0.7F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.028F, 5.6924F, 1.5874F, -0.7495F, 0.1034F, -0.1928F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(-0.5F, -0.225F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F)).mirror(false)
				.texOffs(59, 83).mirror().addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.5728F, 3.9015F, 0.5894F, -1.2382F, 0.1034F, -0.1928F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.5F, -1.575F, -1.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.2846F, 2.6337F, -1.0187F, 2.9234F, 0.0F, -0.1571F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.4426F, 3.6318F, -0.6226F, -1.6144F, 0.0F, -0.1571F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(0.1F, -0.3063F, -1.2595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 1.2F, -0.5F, 0.2182F, 0.0F, -0.1571F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(0.1F, 0.0187F, -1.2595F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 1.2F, -0.5F, -0.5672F, 0.0F, -0.1571F));

		PartDefinition Body = Eoraptor.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.3099F, 0.1664F, 0.053F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 92).addBox(0.0F, -1.6981F, -0.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6845F, -0.1375F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(3, 90).addBox(0.0F, -1.3981F, -0.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0619F, -2.1041F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(30, 92).addBox(0.0F, -1.2231F, 0.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4794F, -5.0749F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(53, 41).addBox(-0.5F, -0.9495F, -0.2088F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(87, 90).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1018F, -0.0605F, -1.2872F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(82, 90).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1173F, -0.016F, -0.8879F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(90, 81).mirror().addBox(-2.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, -0.0334F, 0.0793F, -1.6113F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(77, 90).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0019F, 0.086F, -1.191F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(72, 90).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0354F, 0.0784F, -0.7883F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(18, 92).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.1022F, 0.0819F, -0.6853F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0621F, 0.1153F, -1.0873F));

		PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0096F, 0.1305F, -1.5092F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(87, 90).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1018F, 0.0605F, 1.2872F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(82, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1173F, 0.016F, 0.8879F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(90, 81).addBox(1.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, -0.0334F, -0.0793F, 1.6113F));

		PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(77, 90).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0019F, -0.086F, 1.191F));

		PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(72, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0354F, -0.0784F, 0.7883F));

		PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(18, 92).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.1022F, -0.0819F, 0.6853F));

		PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(92, 0).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0621F, -0.1153F, 1.0873F));

		PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(79, 21).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0096F, -0.1305F, 1.5092F));

		PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(46, 18).addBox(-1.5F, -4.0851F, 0.0522F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 9.7555F, -6.5678F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(24, 90).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.302F, -1.5804F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(61, 89).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.302F, -3.5804F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.1882F, 0.1426F, -0.641F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(87, 58).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.1177F, 0.2046F, -1.0438F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(46, 30).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.023F, 0.2345F, -1.4721F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(59, 24).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.0247F, 0.2695F, -1.4194F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(87, 12).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.1341F, 0.2357F, -0.9879F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(62, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.2155F, 0.1649F, -0.5845F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(87, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.1882F, -0.1426F, 0.641F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(19, 43).addBox(-1.5F, -3.0987F, 0.0807F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 10.8845F, -4.2277F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(87, 58).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.1177F, -0.2046F, 1.0438F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(46, 30).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.023F, -0.2345F, 1.4721F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(59, 24).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.0247F, -0.2695F, 1.4194F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(87, 12).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.1341F, -0.2357F, 0.9879F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(62, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.2155F, -0.1649F, 0.5845F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.0715F, 0.2176F, 0.0155F));

		PartDefinition cube_r97 = body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(58, 89).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1885F, -3.0555F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(64, 88).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.0603F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(92, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5374F, 0.2003F, 0.1561F, -0.5346F));

		PartDefinition cube_r100 = body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(92, 51).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5374F, 0.1235F, 0.2217F, -0.938F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-8.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5374F, 0.0211F, 0.2524F, -1.3679F));

		PartDefinition cube_r102 = body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(46, 26).mirror().addBox(-9.5955F, -1.1381F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -2.5374F, 0.0284F, 0.2866F, -1.366F));

		PartDefinition cube_r103 = body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(43, 92).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -2.5374F, 0.1448F, 0.2498F, -0.933F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -2.5374F, 0.2308F, 0.1738F, -0.5296F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(48, 9).addBox(1.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5374F, 0.0211F, -0.2524F, 1.3679F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(92, 51).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5374F, 0.1235F, -0.2217F, 0.938F));

		PartDefinition cube_r107 = body4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5374F, 0.2003F, -0.1561F, 0.5346F));

		PartDefinition cube_r108 = body4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(92, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -2.5374F, 0.2308F, -0.1738F, 0.5296F));

		PartDefinition cube_r109 = body4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(43, 92).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -2.5374F, 0.1448F, -0.2498F, 0.933F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(46, 26).addBox(1.5955F, -1.1381F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -2.5374F, 0.0284F, -0.2866F, 1.366F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(34, 49).addBox(-1.0F, -1.9246F, -4.0919F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 10.4038F, 0.2916F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(39, 56).addBox(-0.5F, -0.9F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body4.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4905F, -4.0274F, 0.0266F, 0.1745F, 0.0046F));

		PartDefinition cube_r113 = Body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7033F, -0.4968F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(40, 89).addBox(0.0F, -1.05F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1147F, -2.9347F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(92, 55).addBox(0.0F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1826F, -4.8113F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.3567F, 0.3301F, 0.0218F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2959F, 8.032F, -2.249F, -0.2987F, -0.4958F, 0.4444F));

		PartDefinition cube_r117 = Body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.3912F, 0.326F, -0.1089F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2959F, 8.032F, -2.249F, -0.3189F, -0.8744F, 0.5766F));

		PartDefinition cube_r118 = Body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(48, 90).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.3638F, 0.2621F, -0.5355F));

		PartDefinition cube_r119 = Body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.234F, 0.382F, -0.9399F));

		PartDefinition cube_r120 = Body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.0497F, 0.4423F, -1.3931F));

		PartDefinition cube_r121 = Body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(90, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.2407F, 0.1911F, -0.4757F));

		PartDefinition cube_r122 = Body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(89, 47).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.1471F, 0.2695F, -0.8803F));

		PartDefinition cube_r123 = Body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-8.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.0217F, 0.3054F, -1.3159F));

		PartDefinition cube_r124 = Body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(51, 92).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5101F, 0.2461F, 0.1826F, -0.5269F));

		PartDefinition cube_r125 = Body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(46, 28).mirror().addBox(-9.5955F, -1.1381F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5101F, 0.0321F, 0.3037F, -1.3649F));

		PartDefinition cube_r126 = Body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 49).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5101F, 0.1556F, 0.2638F, -0.9303F));

		PartDefinition cube_r127 = Body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(48, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.3638F, -0.2621F, 0.5355F));

		PartDefinition cube_r128 = Body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(43, 90).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.234F, -0.382F, 0.9399F));

		PartDefinition cube_r129 = Body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(61, 16).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.0497F, -0.4423F, 1.3931F));

		PartDefinition cube_r130 = Body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 46).addBox(-0.6433F, 0.3301F, 0.0218F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2959F, 8.032F, -2.249F, -0.2987F, 0.4958F, -0.4444F));

		PartDefinition cube_r131 = Body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 60).addBox(-0.6088F, 0.326F, -0.1089F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2959F, 8.032F, -2.249F, -0.3189F, 0.8744F, -0.5766F));

		PartDefinition cube_r132 = Body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(23, 71).addBox(-0.5959F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0959F, 8.7013F, -3.3552F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(65, 26).addBox(-1.0959F, -1.0F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0959F, 8.1013F, -4.3944F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(90, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.2407F, -0.1911F, 0.4757F));

		PartDefinition cube_r135 = Body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(89, 47).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.1471F, -0.2695F, 0.8803F));

		PartDefinition cube_r136 = Body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(48, 7).addBox(1.5955F, -1.1381F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.0217F, -0.3054F, 1.3159F));

		PartDefinition cube_r137 = Body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(51, 92).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5101F, 0.2461F, -0.1826F, 0.5269F));

		PartDefinition cube_r138 = Body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(46, 28).addBox(1.5955F, -1.1381F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5101F, 0.0321F, -0.3037F, 1.3649F));

		PartDefinition cube_r139 = Body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(92, 49).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5101F, 0.1556F, -0.2638F, 0.9303F));

		PartDefinition cube_r140 = Body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 51).addBox(-0.5F, -1.1F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.4F, 6.1675F, -2.8554F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(28, 56).addBox(-0.5F, -0.625F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.0481F, 3.0271F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 17).addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -4.3348F, 3.577F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -0.35F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.5F, -5.2083F, 2.044F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(44, 84).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -5.2083F, 2.044F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(78, 30).addBox(-1.0F, -3.2357F, 0.0699F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0254F)), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -2.9463F, 0.256F, 0.5432F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(20, 86).addBox(-1.0F, -0.9464F, -1.8299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, 2.2025F, 0.256F, 0.5432F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(14, 75).addBox(-1.0F, -2.5641F, 1.7075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -2.3616F, 0.256F, 0.5432F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(75, 61).addBox(-1.0F, -0.5397F, 0.8316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0243F)), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -1.9253F, 0.256F, 0.5432F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(15, 86).addBox(-1.0F, 1.4862F, -0.7444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F)), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -1.3144F, 0.256F, 0.5432F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(86, 14).addBox(-1.0F, 0.3706F, -1.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -0.4155F, 0.256F, 0.5432F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(7, 74).addBox(-1.0F, 0.0035F, -1.4939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0257F)), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, 0.143F, 0.256F, 0.5432F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.5324F, -4.4318F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.5F, -4.0193F, 2.2146F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(32, 62).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.5F, -4.6846F, 1.7806F, 1.2915F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.4F, 6.1675F, -2.8554F));

		PartDefinition cube_r154 = bone3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(28, 56).mirror().addBox(-0.5F, -0.625F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.0481F, 3.0271F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r155 = bone3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(87, 17).mirror().addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.3348F, 3.577F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r156 = bone3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5F, -0.35F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(0.5F, -5.2083F, 2.044F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r157 = bone3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(44, 84).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, -5.2083F, 2.044F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r158 = bone3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(78, 30).mirror().addBox(0.0F, -3.2357F, 0.0699F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0254F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -2.9463F, -0.256F, -0.5432F));

		PartDefinition cube_r159 = bone3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(0.0F, -0.9464F, -1.8299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, 2.2025F, -0.256F, -0.5432F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(0.0F, -2.5641F, 1.7075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -2.3616F, -0.256F, -0.5432F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(75, 61).mirror().addBox(0.0F, -0.5397F, 0.8316F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0243F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -1.9253F, -0.256F, -0.5432F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(0.0F, 1.4862F, -0.7444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -1.3144F, -0.256F, -0.5432F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(0.0F, 0.3706F, -1.5866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, -0.4155F, -0.256F, -0.5432F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(0.0F, 0.0035F, -1.4939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0257F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6008F, -0.1986F, 0.143F, -0.256F, -0.5432F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -0.5324F, -4.4318F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.0193F, 2.2146F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(32, 62).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.6846F, 1.7806F, 1.2915F, 0.0F, 0.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5099F, -4.6814F, -0.3304F, 0.4285F, 0.3166F));

		PartDefinition cube_r167 = Neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(78, 34).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.0647F, 0.6864F, -1.5597F));

		PartDefinition cube_r168 = Neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(67, 90).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.3746F, 0.5927F, -1.0484F));

		PartDefinition cube_r169 = Neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(90, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.5726F, 0.4067F, -0.6413F));

		PartDefinition cube_r170 = Neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(78, 34).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.0647F, -0.6864F, 1.5597F));

		PartDefinition cube_r171 = Neck.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(67, 90).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.3746F, -0.5927F, 1.0484F));

		PartDefinition cube_r172 = Neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(90, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.5726F, -0.4067F, 0.6413F));

		PartDefinition cube_r173 = Neck.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(64, 92).addBox(0.0F, -1.7477F, 0.9598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 62).addBox(-0.5F, -0.9727F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Neck2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(67, 92).addBox(0.0F, -0.8F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2537F, 0.1119F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Neck2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(76, 92).addBox(0.0F, -0.65F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 62).addBox(-0.5F, 0.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6802F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Neck2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(72, 15).mirror().addBox(-2.8054F, -0.126F, -0.3696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0178F, -2.5495F, 0.2877F, 1.0442F, -1.0637F));

		PartDefinition cube_r177 = Neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-3.0902F, 0.0115F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.248F, -0.6768F, 0.4257F, 0.9655F, -0.9367F));

		PartDefinition cube_r178 = Neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(72, 15).addBox(-0.1946F, -0.126F, -0.3696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0178F, -2.5495F, 0.2877F, -1.0442F, 1.0637F));

		PartDefinition cube_r179 = Neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(72, 8).addBox(0.0902F, 0.0115F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.248F, -0.6768F, 0.4257F, -0.9655F, 0.9367F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.483F, -2.8502F, -0.5121F, 0.2295F, -0.1272F));

		PartDefinition cube_r180 = neck4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(50, 62).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(92, 73).addBox(0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r181 = neck4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-2.9822F, -0.0264F, -0.6676F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3512F, -1.605F, 0.2889F, 1.1115F, -1.1212F));

		PartDefinition cube_r182 = neck4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(70, 22).addBox(-0.0178F, -0.0264F, -0.6676F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3512F, -1.605F, 0.2889F, -1.1115F, 1.1212F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.7698F, -2.902F, -0.1333F, -0.0446F, 0.3142F));

		PartDefinition cube_r183 = Neck3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(10, 78).addBox(0.0F, -0.625F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.3813F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Neck3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(93, 41).addBox(0.0F, -1.2F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0227F, 0.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Neck3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1408F, -2.7407F, 0.6143F, 1.2862F, -0.8872F));

		PartDefinition cube_r186 = Neck3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(72, 24).mirror().addBox(-3.0F, -0.15F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3939F, 0.3346F, -0.7128F, 0.6907F, 1.3139F, -0.808F));

		PartDefinition cube_r187 = Neck3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(72, 51).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1408F, -2.7407F, 0.6143F, -1.2862F, 0.8872F));

		PartDefinition cube_r188 = Neck3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(72, 24).addBox(0.0F, -0.15F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3939F, 0.3346F, -0.7128F, 0.6907F, -1.3139F, 0.808F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(61, 11).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0276F, -2.7779F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Neck5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 58).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.3813F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Neck5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(0.0566F, -0.3459F, -1.0106F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1684F, 0.0372F, 0.6143F, 1.2862F, -0.8872F));

		PartDefinition cube_r191 = Neck5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 45).addBox(-2.0566F, -0.3459F, -1.0106F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1684F, 0.0372F, 0.6143F, -1.2862F, 0.8872F));

		PartDefinition Head = Neck5.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0592F, -2.735F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(75, 53).addBox(-1.5F, 0.0052F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7064F, -3.5167F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(68, 67).addBox(-1.5F, -0.0047F, -1.0183F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.8769F, -2.4935F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(75, 36).addBox(-0.5F, 0.015F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.9339F, -6.2701F, 0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(30, 71).addBox(-0.5F, -0.01F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9114F, -6.2584F, 0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(87, 73).addBox(-0.5F, -0.7752F, -0.2252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.6033F, -8.1342F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(14, 89).addBox(-0.5F, -0.1985F, -0.1976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4533F, -7.7654F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(88, 38).addBox(-0.5F, -0.1985F, -0.1976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.0382F, -8.1095F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(84, 46).addBox(-0.5F, -0.025F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3631F, -4.4355F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(75, 66).addBox(-1.5F, -0.0146F, -0.0015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.6766F, -0.512F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(70, 75).addBox(-1.0F, -1.025F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2221F, -2.3886F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(32, 67).addBox(-1.5F, -0.575F, -0.675F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.662F, -3.3562F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(59, 18).addBox(-1.5F, 1.25F, -0.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -2.1266F, -2.862F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(59, 64).addBox(-1.5F, -0.025F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.6899F, -0.5455F, -1.6668F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.3278F, -5.1282F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(39, 80).addBox(-0.9239F, -0.4818F, 1.0237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, 0.1924F, 0.15F, 0.0059F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(70, 11).addBox(-0.9239F, -0.6898F, 2.3059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, 0.0266F, 0.15F, 0.0059F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(30, 89).addBox(-0.7606F, -0.7305F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1839F, -0.0532F, -2.5262F, -0.8916F, 0.1688F, -0.0249F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(19, 89).addBox(-0.7606F, -0.8305F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, -0.8567F, 0.1688F, -0.0249F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(88, 29).addBox(-0.7606F, -0.2357F, -0.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, -0.115F, 0.1688F, -0.0249F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(23, 67).addBox(-0.9F, -0.5F, -0.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2978F, -0.8617F, 0.8499F, 0.3198F, -0.1359F, -0.05F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(75, 57).addBox(-0.7698F, -0.3083F, -0.304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2121F, -0.5627F, -0.9234F, 0.2743F, 0.305F, 0.0879F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(68, 63).addBox(-0.9239F, -0.3806F, 2.0198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, 0.2447F, 0.15F, 0.0059F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(68, 37).addBox(-0.9239F, -0.3252F, 2.2903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, -0.0694F, 0.15F, 0.0059F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 83).addBox(-0.7239F, -0.7602F, 0.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 81).addBox(-0.7239F, -0.1602F, 0.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 41).addBox(-0.7239F, -0.1602F, 0.3517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, 0.0004F, 0.15F, 0.0059F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(87, 63).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0942F, 1.2117F, 1.9722F, 0.0004F, 0.0191F, 0.0058F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(87, 55).addBox(-0.8919F, 0.3708F, 3.4231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 52).addBox(-0.8919F, 0.4208F, 2.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1253F, 0.3416F, -2.9732F, 0.0004F, 0.15F, 0.0059F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(33, 86).addBox(-0.8919F, 0.2447F, 1.8001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 83).addBox(-0.8919F, 0.1947F, 0.9001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1253F, 0.3416F, -2.9732F, -0.0869F, 0.15F, 0.0059F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(87, 70).addBox(-0.9179F, 0.1598F, -0.0748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1253F, 0.3416F, -2.9732F, -0.0004F, 0.2022F, 0.0013F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(88, 84).addBox(-0.9239F, -0.6245F, 1.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, -0.1916F, 0.15F, 0.0059F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(75, 81).addBox(-0.4975F, -0.6101F, -0.2756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.2162F, 0.1005F, -2.0802F, 0.1876F, 0.1789F, 0.0F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(80, 40).addBox(-0.4975F, -0.3101F, -0.3752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(-0.2162F, 0.1005F, -2.0802F, 0.8858F, 0.1789F, 0.0F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(82, 57).addBox(-0.4975F, -0.5074F, -0.6519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.2162F, 0.1005F, -2.0802F, 1.7977F, 0.1789F, 0.0F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(9, 87).addBox(-0.4975F, -0.5675F, -0.4134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2162F, 0.1005F, -2.0802F, 2.1031F, 0.1789F, 0.0F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(34, 80).addBox(-0.4975F, -0.7078F, -0.2939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.2162F, 0.1005F, -2.0802F, 2.8449F, 0.1789F, 0.0F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(82, 78).addBox(-0.542F, -0.7366F, -0.726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0252F, 0.1468F, 0.2774F, 1.345F, 0.151F, 0.0062F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(87, 35).addBox(-0.542F, -0.9743F, -0.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(87, 49).addBox(-0.542F, -0.4493F, -0.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.0252F, 0.1468F, 0.2774F, 1.9908F, 0.151F, 0.0062F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(25, 87).addBox(-0.542F, -0.1149F, -0.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0252F, 0.1468F, 0.2774F, 2.8634F, 0.151F, 0.0062F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 82).addBox(-0.442F, -0.8392F, -1.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(80, 81).addBox(-0.442F, -0.8392F, -0.8534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0252F, 0.1468F, 0.2774F, 2.9071F, 0.151F, 0.0062F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(43, 87).addBox(-0.542F, -0.7152F, -0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0252F, 0.1468F, 0.2774F, -3.0707F, 0.151F, 0.0062F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(81, 26).addBox(-0.75F, 0.0188F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2323F, -0.4147F, 3.4935F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(82, 54).addBox(-0.75F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(82, 51).addBox(-0.75F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2323F, -1.2942F, 2.2579F, -3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(82, 36).addBox(-0.75F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2323F, -0.8795F, 1.3479F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(80, 43).addBox(-0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2323F, 0.1038F, 1.1657F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(63, 80).addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2323F, 0.9948F, 1.6197F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(80, 61).addBox(-0.75F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.2323F, 1.134F, 2.6099F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(81, 23).addBox(-0.75F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2323F, 0.6041F, 3.458F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(82, 75).addBox(-0.75F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 82).addBox(-0.975F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.2823F, -0.1486F, 2.3981F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(89, 3).addBox(-0.75F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(88, 87).addBox(-0.75F, -0.45F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4823F, 1.2999F, 3.5073F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(81, 14).addBox(0.25F, -0.1157F, 0.295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7927F, -1.0311F, 5.2399F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(89, 44).addBox(0.25F, -0.85F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 89).addBox(0.25F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.6427F, 1.9258F, 4.0312F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(53, 89).addBox(0.25F, -0.875F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6427F, 1.6944F, 3.4501F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(83, 29).addBox(0.05F, -0.675F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.5927F, 0.1811F, 4.2968F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(73, 87).addBox(-0.75F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4823F, 1.1631F, 3.8832F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(43, 76).addBox(-0.75F, -1.775F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4323F, -0.4179F, 4.005F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(83, 87).addBox(-0.75F, -0.775F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4323F, -0.6902F, 4.5396F, -2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(78, 87).addBox(-0.75F, -0.775F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(87, 76).addBox(-0.75F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4323F, 0.0559F, 4.0363F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(87, 76).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(87, 76).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0823F, -0.8311F, 4.8901F, -2.186F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 72).addBox(-0.75F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.4323F, 0.5997F, 3.7828F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(48, 87).addBox(-0.75F, -0.275F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4323F, 0.8276F, 4.2932F, -1.5272F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.3278F, -5.1282F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(39, 80).mirror().addBox(-0.0761F, -0.4818F, 1.0237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, 0.1924F, -0.15F, -0.0059F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(70, 11).mirror().addBox(-0.0761F, -0.6898F, 2.3059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, 0.0266F, -0.15F, -0.0059F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.2394F, -0.7305F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1839F, -0.0532F, -2.5262F, -0.8916F, -0.1688F, 0.0249F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-0.2394F, -0.8305F, -0.2061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, -0.8567F, -0.1688F, 0.0249F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(88, 29).mirror().addBox(-0.2394F, -0.2357F, -0.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, -0.115F, -0.1688F, 0.0249F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(23, 67).mirror().addBox(-1.1F, -0.5F, -0.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2978F, -0.8617F, 0.8499F, 0.3198F, 0.1359F, 0.05F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(75, 57).mirror().addBox(-0.2302F, -0.3083F, -0.304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2121F, -0.5627F, -0.9234F, 0.2743F, -0.305F, -0.0879F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(68, 63).mirror().addBox(-0.0761F, -0.3806F, 2.0198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, 0.2447F, -0.15F, -0.0059F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(68, 37).mirror().addBox(-0.0761F, -0.3252F, 2.2903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, -0.0694F, -0.15F, -0.0059F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.2761F, -0.7602F, 0.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 81).mirror().addBox(-0.2761F, -0.1602F, 0.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 41).mirror().addBox(-0.2761F, -0.1602F, 0.3517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, 0.0004F, -0.15F, -0.0059F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(87, 63).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0942F, 1.2117F, 1.9722F, 0.0004F, -0.0191F, -0.0058F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(87, 55).mirror().addBox(-0.1081F, 0.3708F, 3.4231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 52).mirror().addBox(-0.1081F, 0.4208F, 2.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1253F, 0.3416F, -2.9732F, 0.0004F, -0.15F, -0.0059F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(-0.1081F, 0.2447F, 1.8001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 83).mirror().addBox(-0.1081F, 0.1947F, 0.9001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1253F, 0.3416F, -2.9732F, -0.0869F, -0.15F, -0.0059F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-0.0821F, 0.1598F, -0.0748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1253F, 0.3416F, -2.9732F, -0.0004F, -0.2022F, -0.0013F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 84).mirror().addBox(-0.0761F, -0.6245F, 1.369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, -0.1916F, -0.15F, -0.0059F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-0.5025F, -0.6101F, -0.2756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.2162F, 0.1005F, -2.0802F, 0.1876F, -0.1789F, 0.0F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(80, 40).mirror().addBox(-0.5025F, -0.3101F, -0.3752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(0.2162F, 0.1005F, -2.0802F, 0.8858F, -0.1789F, 0.0F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-0.5025F, -0.5074F, -0.6519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.2162F, 0.1005F, -2.0802F, 1.7977F, -0.1789F, 0.0F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(9, 87).mirror().addBox(-0.5025F, -0.5675F, -0.4134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2162F, 0.1005F, -2.0802F, 2.1031F, -0.1789F, 0.0F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(34, 80).mirror().addBox(-0.5025F, -0.7078F, -0.2939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.2162F, 0.1005F, -2.0802F, 2.8449F, -0.1789F, 0.0F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(-0.458F, -0.7366F, -0.726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.0252F, 0.1468F, 0.2774F, 1.345F, -0.151F, -0.0062F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-0.458F, -0.9743F, -0.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(87, 49).mirror().addBox(-0.458F, -0.4493F, -0.2378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.0252F, 0.1468F, 0.2774F, 1.9908F, -0.151F, -0.0062F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.458F, -0.1149F, -0.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.0252F, 0.1468F, 0.2774F, 2.8634F, -0.151F, -0.0062F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.558F, -0.8392F, -1.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(80, 81).mirror().addBox(-0.558F, -0.8392F, -0.8534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0252F, 0.1468F, 0.2774F, 2.9071F, -0.151F, -0.0062F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(43, 87).mirror().addBox(-0.458F, -0.7152F, -0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.0252F, 0.1468F, 0.2774F, -3.0707F, -0.151F, -0.0062F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(81, 26).mirror().addBox(-0.25F, 0.0188F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.4147F, 3.4935F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-0.25F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(82, 51).mirror().addBox(-0.25F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -1.2942F, 2.2579F, -3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-0.25F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, -0.8795F, 1.3479F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(-0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.1038F, 1.1657F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(63, 80).mirror().addBox(-0.25F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.9948F, 1.6197F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-0.25F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 1.134F, 2.6099F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(81, 23).mirror().addBox(-0.25F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 0.6041F, 3.458F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-0.25F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 82).mirror().addBox(-0.025F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2823F, -0.1486F, 2.3981F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-0.25F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(88, 87).mirror().addBox(-0.25F, -0.45F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4823F, 1.2999F, 3.5073F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(81, 14).mirror().addBox(-1.25F, -0.1157F, 0.295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7927F, -1.0311F, 5.2399F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(89, 44).mirror().addBox(-1.25F, -0.85F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(35, 89).mirror().addBox(-1.25F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.6427F, 1.9258F, 4.0312F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(53, 89).mirror().addBox(-1.25F, -0.875F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6427F, 1.6944F, 3.4501F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(83, 29).mirror().addBox(-1.05F, -0.675F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.5927F, 0.1811F, 4.2968F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(73, 87).mirror().addBox(-0.25F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4823F, 1.1631F, 3.8832F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(43, 76).mirror().addBox(-0.25F, -1.775F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, -0.4179F, 4.005F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-0.25F, -0.775F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, -0.6902F, 4.5396F, -2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(78, 87).mirror().addBox(-0.25F, -0.775F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(87, 76).mirror().addBox(-0.25F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, 0.0559F, 4.0363F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(87, 76).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(87, 76).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.0823F, -0.8311F, 4.8901F, -2.186F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-0.25F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, 0.5997F, 3.7828F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(48, 87).mirror().addBox(-0.25F, -0.275F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, 0.8276F, 4.2932F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.5151F, -0.5963F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r295 = Jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-0.5F, -0.8F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(87, 9).addBox(0.85F, -0.8F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.775F, 0.987F, -0.0421F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(87, 0).addBox(0.85F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.775F, 0.7347F, -0.3832F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r297 = Jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(37, 72).mirror().addBox(-0.175F, 0.2339F, -1.7917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1388F, -2.7932F, 0.0305F, -0.0698F, 0.0F));

		PartDefinition cube_r298 = Jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.525F, -0.825F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(82, 64).mirror().addBox(-0.525F, -0.825F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 83).addBox(0.875F, -0.825F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(82, 64).addBox(0.875F, -0.825F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.775F, 1.0124F, -2.2596F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r299 = Jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(83, 84).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(83, 84).addBox(0.85F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.775F, 1.1705F, -2.1916F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r300 = Jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.5F, -0.85F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(72, 4).addBox(0.85F, -0.85F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.775F, 1.1151F, -0.635F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r301 = Jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(69, 71).mirror().addBox(-0.1725F, 0.076F, -1.8166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3388F, -4.2932F, 0.0436F, -0.1745F, 0.0F));

		PartDefinition cube_r302 = Jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(78, 84).mirror().addBox(-0.2522F, 0.3157F, -1.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(73, 84).mirror().addBox(-0.2522F, 0.3157F, -1.2389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, -0.2609F, -0.1025F, 0.034F));

		PartDefinition cube_r303 = Jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(59, 86).mirror().addBox(-0.2522F, -0.0445F, -0.9184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, 0.2104F, -0.1025F, 0.034F));

		PartDefinition cube_r304 = Jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(39, 83).mirror().addBox(-0.2522F, -0.1212F, -1.294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, 0.2976F, -0.1025F, 0.034F));

		PartDefinition cube_r305 = Jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-0.2522F, -0.2817F, -1.8412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, 0.1667F, -0.1025F, 0.034F));

		PartDefinition cube_r306 = Jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-0.1929F, -0.0792F, -0.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, 0.1047F, -0.1047F, 0.0F));

		PartDefinition cube_r307 = Jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(49, 84).mirror().addBox(-0.1929F, -0.2281F, -0.7498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, 0.2618F, -0.1047F, 0.0F));

		PartDefinition cube_r308 = Jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(82, 17).mirror().addBox(-0.109F, -0.4306F, -1.6654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, 0.2007F, -0.1047F, 0.0F));

		PartDefinition cube_r309 = Jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(82, 11).mirror().addBox(-0.134F, -0.415F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5388F, -5.7932F, 0.1658F, -0.1047F, 0.0F));

		PartDefinition cube_r310 = Jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(81, 69).mirror().addBox(-0.1375F, -0.1596F, -1.8522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1388F, -2.7932F, 0.0338F, -0.0874F, 0.0061F));

		PartDefinition cube_r311 = Jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(49, 81).mirror().addBox(-0.0745F, -0.308F, -1.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3388F, -4.2932F, 0.034F, -0.131F, 0.0046F));

		PartDefinition cube_r312 = Jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.1725F, -0.1826F, -1.7215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3388F, -4.2932F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition cube_r313 = Jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.175F, -0.1935F, -1.7504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1388F, -2.7932F, 0.1309F, -0.0698F, 0.0F));

		PartDefinition cube_r314 = Jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(79, 47).addBox(0.85F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.775F, -0.0637F, -1.2333F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r315 = Jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 8).addBox(0.85F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.775F, 0.0404F, -0.6424F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r316 = Jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(62, 71).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(62, 71).addBox(0.85F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.775F, 0.0404F, -0.6424F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r317 = Jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(37, 72).addBox(-0.825F, 0.2339F, -1.7917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.9F, 0.1388F, -2.7932F, 0.0305F, 0.0698F, 0.0F));

		PartDefinition cube_r318 = Jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(69, 71).addBox(-0.8275F, 0.076F, -1.8166F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.3388F, -4.2932F, 0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r319 = Jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(78, 84).addBox(-0.7478F, 0.3157F, -1.5389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(73, 84).addBox(-0.7478F, 0.3157F, -1.2389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, -0.2609F, 0.1025F, -0.034F));

		PartDefinition cube_r320 = Jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(59, 86).addBox(-0.7478F, -0.0445F, -0.9184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, 0.2104F, 0.1025F, -0.034F));

		PartDefinition cube_r321 = Jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(39, 83).addBox(-0.7478F, -0.1212F, -1.294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, 0.2976F, 0.1025F, -0.034F));

		PartDefinition cube_r322 = Jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(7, 70).addBox(-0.7478F, -0.2817F, -1.8412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, 0.1667F, 0.1025F, -0.034F));

		PartDefinition cube_r323 = Jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 26).addBox(-0.8071F, -0.0792F, -0.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, 0.1047F, 0.1047F, 0.0F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(49, 84).addBox(-0.8071F, -0.2281F, -0.7498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, 0.2618F, 0.1047F, 0.0F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(82, 17).addBox(-0.891F, -0.4306F, -1.6654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, 0.2007F, 0.1047F, 0.0F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(82, 11).addBox(-0.866F, -0.415F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.5388F, -5.7932F, 0.1658F, 0.1047F, 0.0F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(81, 69).addBox(-0.8626F, -0.1596F, -1.8522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.1388F, -2.7932F, 0.0338F, 0.0874F, -0.0061F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(49, 81).addBox(-0.9255F, -0.308F, -1.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.3388F, -4.2932F, 0.034F, 0.131F, -0.0046F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(70, 0).addBox(-0.8275F, -0.1826F, -1.7215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.8F, 0.3388F, -4.2932F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 70).addBox(-0.825F, -0.1935F, -1.7504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.1388F, -2.7932F, 0.1309F, 0.0698F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6602F, 7.543F, -2.0141F, -0.4498F, 0.2368F, -0.0429F));

		PartDefinition cube_r331 = RArm.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(68, 59).addBox(0.0F, -0.05F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0771F, -0.5418F, 2.7527F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r332 = RArm.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(58, 75).addBox(0.0F, 0.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0771F, -0.0907F, 1.3221F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r333 = RArm.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(86, 20).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0771F, 1.4356F, 0.7448F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r334 = RArm.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(74, 26).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r335 = RArm.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(44, 72).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(67, 47).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(19, 26).addBox(0.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0771F, -0.5932F, 5.1985F, 0.5149F, 0.0F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(60, 48).addBox(-0.9F, -0.01F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8934F, 4.9741F, 0.4F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r336 = RHand.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(66, 41).addBox(-0.91F, -0.01F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.99F, 0.0F, 0.0F, -0.3656F, -0.1274F, -0.4185F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6602F, 7.543F, -2.0141F, -0.4498F, -0.2368F, 0.0429F));

		PartDefinition cube_r337 = RArm3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(68, 59).mirror().addBox(-1.0F, -0.05F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0771F, -0.5418F, 2.7527F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r338 = RArm3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(58, 75).mirror().addBox(-1.0F, 0.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0771F, -0.0907F, 1.3221F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r339 = RArm3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0771F, 1.4356F, 0.7448F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r340 = RArm3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(74, 26).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r341 = RArm3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(67, 47).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(19, 26).mirror().addBox(-1.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0771F, -0.5932F, 5.1985F, 0.5149F, 0.0F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(60, 48).mirror().addBox(-0.1F, -0.01F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8934F, 4.9741F, 0.4F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r342 = RHand2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(66, 41).mirror().addBox(-1.09F, -0.01F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.99F, 0.0F, 0.0F, -0.303F, 0.0393F, 0.1249F));

		PartDefinition Tail = Eoraptor.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 12).addBox(-0.5F, -0.6013F, -0.0611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, 0.1489F, -0.0863F, -0.0129F));

		PartDefinition cube_r343 = Tail.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(6, 85).addBox(0.0F, -2.15F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 6.9389F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r344 = Tail.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(34, 43).addBox(0.0F, -2.225F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 4.9389F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r345 = Tail.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(3, 85).addBox(0.0F, -2.325F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 2.9389F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r346 = Tail.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, 0.1591F, -0.1051F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3987F, 7.6389F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Tail.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(30, 84).addBox(0.0F, -0.4118F, -0.0885F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 5.4389F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r348 = Tail.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(64, 83).addBox(0.0F, -0.7761F, -0.1487F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 3.1389F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r349 = Tail.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(33, 92).addBox(0.0F, 0.3195F, 0.0822F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2987F, 0.2389F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Tail.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(14, 70).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 0.9389F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r351 = Tail.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(38, 33).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1013F, 0.9389F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r352 = Tail.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(38, 33).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1013F, 0.9389F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.6584F, -0.0376F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.006F))
				.texOffs(91, 24).addBox(0.0F, -2.1584F, 5.9624F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 66).addBox(0.0F, -2.0584F, 7.9624F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0958F, 8.9416F, 0.2452F, -0.0847F, -0.0212F));

		PartDefinition cube_r353 = Tail2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(92, 34).addBox(0.0F, -1.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 3.9624F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r354 = Tail2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(91, 20).addBox(0.0F, -1.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 1.9624F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r355 = Tail2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(67, 85).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, -0.0376F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r356 = Tail2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(25, 23).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1584F, -0.0376F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r357 = Tail2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(25, 23).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1584F, -0.0376F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r358 = Tail2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(27, 90).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0287F, 8.2777F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Tail2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(48, 92).addBox(0.0F, 0.1896F, -0.0633F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2772F, 5.5834F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r360 = Tail2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(70, 85).addBox(0.0F, -0.6408F, -0.1559F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Tail2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(85, 39).addBox(0.0F, -0.5043F, -0.4997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, 0.3275F, -0.1654F, -0.0559F));

		PartDefinition cube_r362 = Tail3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(93, 28).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3147F, 10.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r363 = Tail3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(92, 90).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 8.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Tail3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(79, 92).addBox(0.0F, -0.85F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 6.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Tail3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(92, 76).addBox(0.0F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 4.1474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Tail3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(15, 92).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 2.0474F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Tail3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(92, 14).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 0.0474F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Tail3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(56, 93).addBox(0.0F, 1.8F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 92).addBox(0.0F, 0.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 10).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5768F, 5.7818F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Tail3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(6, 90).addBox(0.0F, 0.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2041F, 2.913F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r370 = Tail3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(92, 6).addBox(0.0F, 0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0572F, 0.6352F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F))
				.texOffs(92, 62).addBox(0.0F, -0.6897F, 5.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 92).addBox(0.0F, -0.6397F, 7.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.044F, 10.9706F, 0.2903F, 0.1255F, 0.0374F));

		PartDefinition cube_r371 = Tail4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(73, 92).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 3.0474F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Tail4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(92, 70).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3147F, 1.0474F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Tail4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(93, 38).addBox(0.0F, 16.8F, 28.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 92).addBox(0.0F, 15.9F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 92).addBox(0.0F, 14.7F, 24.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 93).addBox(0.0F, 13.6F, 22.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 92).addBox(0.0F, 12.4F, 20.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3584F, -23.3624F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0366F, 10.9354F, -0.2409F, 0.3398F, -0.0817F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(19, 33).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, -0.5476F, 0.2249F, -0.1352F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.8F, -0.7785F, 0.39F, -0.3587F));

		PartDefinition RLeg = Eoraptor.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 1.5056F, 0.4703F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r374 = RLeg.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(72, 47).addBox(1.0F, 1.4829F, -0.2212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.3042F, 1.8434F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r375 = RLeg.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(48, 77).addBox(1.0F, 0.2269F, -0.0205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 7.3042F, 1.8434F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r376 = RLeg.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(77, 17).addBox(1.0F, -0.0419F, -0.0302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 7.3042F, 1.8434F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r377 = RLeg.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(28, 51).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0318F, 1.9723F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r378 = RLeg.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(33, 76).addBox(1.0F, -0.0005F, 0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.6042F, 0.7434F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r379 = RLeg.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(54, 83).addBox(-0.5F, 0.1343F, -0.3441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.8671F, 1.3788F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r380 = RLeg.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(58, 79).addBox(-0.5F, -1.9494F, -0.9296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 3.3474F, 1.7094F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r381 = RLeg.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(77, 10).addBox(1.0F, -0.35F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2145F, 1.1003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r382 = RLeg.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(85, 60).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.7145F, 0.2343F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r383 = RLeg.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(86, 23).addBox(1.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, 0.0275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r384 = RLeg.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(85, 32).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, 0.0275F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r385 = RLeg.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(38, 76).addBox(1.0F, -2.0F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 1.5067F, 1.3421F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r386 = RLeg.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(19, 79).addBox(1.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 3.5918F, 0.2858F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r387 = RLeg.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(70, 78).addBox(1.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5F, 3.5918F, 0.2858F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r388 = RLeg.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(79, 4).addBox(1.0F, -0.175F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6067F, 0.0421F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r389 = RLeg.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(77, 0).addBox(1.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6067F, 0.0421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.0769F, 3.9441F, 2.138F, 0.0F, 0.0F));

		PartDefinition cube_r390 = RLeg2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(13, 58).addBox(0.0F, -5.9F, -0.7F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 69).addBox(-1.0F, -6.15F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(18, 58).addBox(-1.0F, -5.2F, -0.7F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r391 = RLeg2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(65, 75).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.5F, 3.6534F, 0.0128F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r392 = RLeg2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(18, 69).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(-0.5F, 7.2091F, 0.576F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r393 = RLeg2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(24, 79).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.237F, 1.0389F, -0.4189F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(61, 56).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.4451F, 0.0F, 0.0F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, -0.0055F, -0.1046F, 0.009F));

		PartDefinition cube_r394 = digit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(68, 30).addBox(-0.2826F, -0.4019F, -0.5086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.1745F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r395 = digit2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(29, 80).addBox(-0.5F, -0.35F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(-0.0349F, -0.0805F, -0.6011F, 1.789F, 0.0F, 0.1745F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(55, 36).addBox(-0.9F, -0.8827F, -2.4239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4782F, 6.4836F, -0.1585F, 0.9165F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(46, 12).addBox(-0.9F, -0.5827F, -3.9239F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.3401F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Eoraptor.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 1.5056F, 0.4703F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r396 = RLeg4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(72, 47).mirror().addBox(-2.0F, 1.4829F, -0.2212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.3042F, 1.8434F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r397 = RLeg4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(48, 77).mirror().addBox(-2.0F, 0.2269F, -0.0205F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.3042F, 1.8434F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r398 = RLeg4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(-2.0F, -0.0419F, -0.0302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.3042F, 1.8434F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r399 = RLeg4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(28, 51).mirror().addBox(-0.5F, -1.0F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 6.0318F, 1.9723F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r400 = RLeg4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(33, 76).mirror().addBox(-2.0F, -0.0005F, 0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.6042F, 0.7434F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r401 = RLeg4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(54, 83).mirror().addBox(-0.5F, 0.1343F, -0.3441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.8671F, 1.3788F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r402 = RLeg4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(58, 79).mirror().addBox(-0.5F, -1.9494F, -0.9296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.3474F, 1.7094F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r403 = RLeg4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-2.0F, -0.35F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.2145F, 1.1003F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r404 = RLeg4.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(85, 60).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.7145F, 0.2343F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r405 = RLeg4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(86, 23).mirror().addBox(-2.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6629F, 0.0275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r406 = RLeg4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(85, 32).mirror().addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6629F, 0.0275F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r407 = RLeg4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(38, 76).mirror().addBox(-2.0F, -2.0F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5067F, 1.3421F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r408 = RLeg4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(19, 79).mirror().addBox(-2.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.5918F, 0.2858F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r409 = RLeg4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-2.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.5918F, 0.2858F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r410 = RLeg4.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-2.0F, -0.175F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6067F, 0.0421F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r411 = RLeg4.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-2.0F, 0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6067F, 0.0421F, 0.1222F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.0769F, 3.9441F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r412 = RLeg5.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(13, 58).mirror().addBox(-1.0F, -5.9F, -0.7F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 69).mirror().addBox(0.0F, -6.15F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(18, 58).mirror().addBox(0.0F, -5.2F, -0.7F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r413 = RLeg5.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(65, 75).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.6534F, 0.0128F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r414 = RLeg5.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(18, 69).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.2091F, 0.576F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r415 = RLeg5.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(24, 79).mirror().addBox(0.0F, -0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.237F, 1.0389F, -0.4189F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create().texOffs(61, 56).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.4451F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, -0.0055F, 0.1046F, -0.009F));

		PartDefinition cube_r416 = digit3.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(68, 30).mirror().addBox(-0.7174F, -0.4019F, -0.5086F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.022F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.1745F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r417 = digit4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(29, 80).mirror().addBox(-0.5F, -0.35F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)).mirror(false), PartPose.offsetAndRotation(0.0349F, -0.0805F, -0.6011F, 1.789F, 0.0F, -0.1745F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create().texOffs(55, 36).mirror().addBox(-2.1F, -0.8827F, -2.4239F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4782F, 6.4836F, -0.1585F, 0.8293F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-2.1F, -0.5827F, -3.9239F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.6455F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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