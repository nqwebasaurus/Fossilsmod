package fossils.fossils.client.blockentity.model.armadillosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArmadillosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail9;

	public ArmadillosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.head.getChild("crestl2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail9 = this.tail6.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0611F, 7.7618F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 104).addBox(0.0F, -0.9438F, -0.0741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2508F, -2.9262F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 104).addBox(0.0F, -1.2F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 0.8989F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(91, 104).addBox(0.0F, -1.1938F, 0.0259F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0522F, -1.0366F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-2.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 0).addBox(0.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(17, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.886F, -0.1037F, 0.0071F, 0.005F, -0.6108F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(0.0F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8192F, -1.3386F, 2.9012F, 0.0073F, 0.1708F, -0.6097F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(0.025F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4507F, -0.1455F, -2.9095F, 0.0082F, 0.5024F, -0.607F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 73).addBox(-1.025F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4507F, -0.1455F, -2.9095F, 0.0082F, -0.5024F, 0.607F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 22).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8192F, -1.3386F, 2.9012F, 0.0073F, -0.1708F, 0.6097F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 30).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.886F, -0.1037F, 0.0071F, -0.005F, 0.6108F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -1.0F, -0.15F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8612F, -2.9449F, 0.0087F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9149F, 2.043F, 1.3976F, 0.1744F, -0.0076F, 0.0866F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(80, 18).addBox(-0.5F, -0.5154F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -1.2937F, 2.773F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, 0.325F, -0.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0188F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(59, 95).addBox(-0.5F, -0.825F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -2.9242F, 0.8197F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 54).addBox(-0.5F, -0.175F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0188F, -3.1465F, 0.2089F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(54, 95).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -3.2594F, -0.4313F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 85).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0188F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(93, 45).addBox(-0.5F, 0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(95, 51).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0188F, -3.1756F, -1.119F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(55, 104).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0188F, -3.2911F, -0.4286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(85, 22).addBox(-0.55F, -0.95F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0188F, -1.747F, 0.9858F, 1.1894F, 0.0457F, 0.1134F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(49, 95).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0188F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(55, 86).addBox(-0.5F, -2.825F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0188F, -0.5467F, 2.3057F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(100, 90).addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0188F, -1.0502F, 2.7919F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(66, 68).addBox(-0.5F, -0.5834F, -2.8141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.0188F, -1.2937F, 2.773F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 33).addBox(-0.5F, -1.0F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0844F, -1.428F, -0.8628F, -0.2182F, 0.0F, 0.1222F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 104).addBox(-0.8326F, -2.0331F, -3.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(12, 85).addBox(-0.8326F, -2.0331F, -3.0732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, 2.6621F, -0.0674F, 0.4759F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 95).addBox(-0.8326F, -1.7676F, 0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -2.2685F, -0.0674F, 0.4759F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 78).addBox(-0.8326F, 0.4843F, -0.598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -0.9159F, -0.0674F, 0.4759F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 95).addBox(-0.8576F, -0.0659F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 78).addBox(-0.8576F, -0.2659F, 0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -1.1777F, -0.0674F, 0.4759F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(88, 43).addBox(-0.863F, -0.8055F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(51, 78).addBox(-0.863F, -1.0055F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0542F, -0.3917F, -0.3343F, -1.6161F, -0.0932F, 0.482F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 101).addBox(-0.5F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(101, 0).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.3322F, 2.1887F, -2.6078F, -0.486F, 0.0046F, 0.445F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(100, 93).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-1.4362F, 2.3999F, -3.267F, 0.3431F, 0.0046F, 0.445F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.85F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.9628F, 1.4187F, -2.1644F, 0.7794F, 0.0046F, 0.445F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(101, 6).addBox(-0.8967F, -0.7442F, -1.4139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.092F, 0.1316F, -1.8807F, 1.4164F, 0.0046F, 0.445F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 78).addBox(-0.8967F, -0.7692F, -1.6389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.092F, 0.1316F, -1.8807F, 1.3466F, 0.0046F, 0.445F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(87, 26).addBox(-1.0584F, -0.8372F, -0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, -0.5871F, -0.0417F, 0.1149F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(10, 95).addBox(-1.0584F, 0.2683F, -1.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, 0.3728F, -0.0417F, 0.1149F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(5, 95).addBox(-1.0584F, -0.9792F, -1.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, 1.3328F, -0.0417F, 0.1149F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(94, 84).addBox(-1.0584F, -0.9513F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3938F, -0.7399F, -1.4942F, 1.263F, -0.0417F, 0.1149F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(78, 38).addBox(-0.9F, -0.0663F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, -0.2618F, 0.0F, 0.1222F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9149F, 2.043F, 1.3976F, 0.1744F, 0.0076F, -0.0866F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.5F, -0.5154F, -2.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.2937F, 2.773F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, 0.325F, -0.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(59, 95).mirror().addBox(-0.5F, -0.825F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.9242F, 0.8197F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(95, 54).mirror().addBox(-0.5F, -0.175F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.1465F, 0.2089F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2594F, -0.4313F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(33, 85).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(93, 45).mirror().addBox(-0.5F, 0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(95, 51).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.1756F, -1.119F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(55, 104).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -3.2911F, -0.4286F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(85, 22).mirror().addBox(-0.45F, -0.95F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.747F, 0.9858F, 1.1894F, -0.0457F, -0.1134F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(49, 95).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(55, 86).mirror().addBox(-0.5F, -2.825F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -0.5467F, 2.3057F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(100, 90).mirror().addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.0502F, 2.7919F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(66, 68).mirror().addBox(-0.5F, -0.5834F, -2.8141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -1.2937F, 2.773F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(78, 33).mirror().addBox(-0.5F, -1.0F, -1.425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0844F, -1.428F, -0.8628F, -0.2182F, 0.0F, -0.1222F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 104).mirror().addBox(-0.1674F, -2.0331F, -3.6982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(12, 85).mirror().addBox(-0.1674F, -2.0331F, -3.0732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, 2.6621F, 0.0674F, -0.4759F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 95).mirror().addBox(-0.1674F, -1.7676F, 0.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -2.2685F, 0.0674F, -0.4759F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(73, 78).mirror().addBox(-0.1674F, 0.4843F, -0.598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -0.9159F, 0.0674F, -0.4759F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(-0.1424F, -0.0659F, -0.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(58, 78).mirror().addBox(-0.1424F, -0.2659F, 0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -1.1777F, 0.0674F, -0.4759F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-0.137F, -0.8055F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(51, 78).mirror().addBox(-0.137F, -1.0055F, -0.2483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0542F, -0.3917F, -0.3343F, -1.6161F, 0.0932F, -0.482F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(5, 101).mirror().addBox(-0.5F, -1.55F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(101, 0).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(1.3322F, 2.1887F, -2.6078F, -0.486F, -0.0046F, -0.445F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(100, 93).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(1.4362F, 2.3999F, -3.267F, 0.3431F, -0.0046F, -0.445F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5F, -0.85F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.9628F, 1.4187F, -2.1644F, 0.7794F, -0.0046F, -0.445F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(101, 6).mirror().addBox(-0.1033F, -0.7442F, -1.4139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.092F, 0.1316F, -1.8807F, 1.4164F, -0.0046F, -0.445F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(44, 78).mirror().addBox(-0.1033F, -0.7692F, -1.6389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.092F, 0.1316F, -1.8807F, 1.3466F, -0.0046F, -0.445F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(87, 26).mirror().addBox(0.0584F, -0.8372F, -0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, -0.5871F, 0.0417F, -0.1149F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(0.0584F, 0.2683F, -1.2903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.163F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, 0.3728F, 0.0417F, -0.1149F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(0.0584F, -0.9792F, -1.1936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, 1.3328F, 0.0417F, -0.1149F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(94, 84).mirror().addBox(0.0584F, -0.9513F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -0.7399F, -1.4942F, 1.263F, 0.0417F, -0.1149F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-0.1F, -0.0663F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, -0.2618F, 0.0F, -0.1222F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.7644F, 0.9725F, 0.7375F, 0.0528F, -0.1877F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(89, 4).addBox(0.5F, -0.375F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3639F, 0.014F, 0.3665F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(15, 96).addBox(0.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.7753F, -0.5098F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(93, 42).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 0.1725F, -0.5285F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg2.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(80, 78).addBox(-0.5F, -4.0F, -0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 4.5907F, 0.5135F, 0.192F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg2.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(77, 7).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5702F, 1.4149F, 0.1484F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(87, 88).addBox(0.5F, -0.0186F, -0.8635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(96, 13).addBox(-0.5F, -0.8F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(96, 10).addBox(-0.5F, -0.2F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 6.89F, 2.523F, -1.3788F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(5, 104).addBox(-0.5F, -0.2958F, -0.8406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 6.7242F, 2.3279F, -1.1606F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg2.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(82, 88).addBox(-0.5F, -0.0454F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 4.6064F, 0.4771F, 0.4712F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg2.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(104, 3).addBox(-0.5F, 1.492F, -0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 4.6064F, 0.4771F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 7.2965F, 2.6286F, 0.8226F, -0.064F, 0.0593F));

		PartDefinition leg6_r1 = leg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(94, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.4535F, 7.1529F, 0.2504F, 1.5708F, 0.7505F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(85, 76).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.4535F, 4.6421F, 0.5165F, 1.5708F, 1.5359F, 1.5708F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(85, 56).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4535F, 4.6421F, 0.5165F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition leg6_r2 = leg2.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(96, 7).addBox(-0.75F, -1.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(96, 0).addBox(-0.75F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 96).addBox(-0.75F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4535F, 1.199F, -0.2867F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(80, 22).addBox(-0.725F, -0.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.4535F, 1.1968F, -0.2618F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition leg8_r1 = leg2.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(88, 47).addBox(-0.1F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6465F, 5.5893F, -0.2671F, 1.5708F, -1.405F, 1.5708F));

		PartDefinition leg7_r1 = leg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(9, 69).addBox(-0.1F, -6.9F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.6465F, 0.5961F, -0.5288F, -1.5708F, -1.5184F, -1.5708F));

		PartDefinition leg6_r3 = leg2.addOrReplaceChild("leg6_r3", CubeListBuilder.create().texOffs(95, 95).addBox(-0.9F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(95, 92).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6465F, -0.0175F, 0.5073F, -1.5708F, -0.192F, -1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(95, 77).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.6465F, 0.5846F, 0.514F, -1.5708F, 0.8552F, -1.5708F));

		PartDefinition leg6_r4 = leg2.addOrReplaceChild("leg6_r4", CubeListBuilder.create().texOffs(95, 74).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(64, 95).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.6465F, 1.7476F, -0.0454F, -1.5708F, 1.2392F, -1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0487F, -0.4749F, -4.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.4856F, 0.473F, 1.5407F, 0.1797F, 0.1692F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition toes2_r1 = toes2.addOrReplaceChild("toes2_r1", CubeListBuilder.create().texOffs(28, 38).addBox(3.3513F, 0.4022F, 4.8364F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.4F, -0.075F, -7.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.7644F, 0.9725F, 0.6247F, -0.2311F, 0.0606F));

		PartDefinition upperleg5_r1 = upperleg3.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(80, 92).addBox(-1.5F, -0.375F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.3639F, 0.014F, 0.3665F, 0.0F, 0.0F));

		PartDefinition upperleg8_r1 = upperleg3.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(83, 102).addBox(-1.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.7753F, -0.5098F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = upperleg3.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(44, 93).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 0.1725F, -0.5285F, -0.5411F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(77, 84).addBox(-0.5F, -4.0F, -0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 4.5907F, 0.5135F, 0.192F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg3.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(105, 55).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.5702F, 1.4149F, 0.1484F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperleg3.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(92, 36).addBox(-1.5F, -0.0186F, -0.8635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg7_r3 = upperleg3.addOrReplaceChild("upperleg7_r3", CubeListBuilder.create().texOffs(102, 80).addBox(-0.5F, -0.8F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(78, 102).addBox(-0.5F, -0.2F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 6.89F, 2.523F, -1.3788F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperleg3.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(25, 104).addBox(-0.5F, -0.2958F, -0.8406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 6.7242F, 2.3279F, -1.1606F, 0.0F, 0.0F));

		PartDefinition upperleg4_r6 = upperleg3.addOrReplaceChild("upperleg4_r6", CubeListBuilder.create().texOffs(92, 32).addBox(-0.5F, -0.0454F, 0.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 4.6064F, 0.4771F, 0.4712F, 0.0F, 0.0F));

		PartDefinition upperleg3_r3 = upperleg3.addOrReplaceChild("upperleg3_r3", CubeListBuilder.create().texOffs(10, 104).addBox(-0.5F, 1.492F, -0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 4.6064F, 0.4771F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 7.2965F, 2.6286F, 0.9536F, -0.0712F, 0.0505F));

		PartDefinition leg7_r2 = leg3.addOrReplaceChild("leg7_r2", CubeListBuilder.create().texOffs(73, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.4535F, 7.1529F, 0.2504F, 1.5708F, -0.7505F, -1.5708F));

		PartDefinition leg6_r5 = leg3.addOrReplaceChild("leg6_r5", CubeListBuilder.create().texOffs(65, 86).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.4535F, 4.6421F, 0.5165F, 1.5708F, -1.5359F, -1.5708F));

		PartDefinition leg5_r2 = leg3.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(60, 86).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4535F, 4.6421F, 0.5165F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition leg7_r3 = leg3.addOrReplaceChild("leg7_r3", CubeListBuilder.create().texOffs(73, 102).addBox(-0.25F, -1.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(102, 57).addBox(-0.25F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(40, 102).addBox(-0.25F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4535F, 1.199F, -0.2867F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition leg4_r3 = leg3.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(84, 63).addBox(-0.275F, -0.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.4535F, 1.1968F, -0.2618F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leg9_r1 = leg3.addOrReplaceChild("leg9_r1", CubeListBuilder.create().texOffs(92, 26).addBox(-0.9F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6465F, 5.5893F, -0.2671F, 1.5708F, 1.405F, -1.5708F));

		PartDefinition leg8_r2 = leg3.addOrReplaceChild("leg8_r2", CubeListBuilder.create().texOffs(68, 73).addBox(-0.9F, -6.9F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.6465F, 0.5961F, -0.5288F, -1.5708F, 1.5184F, 1.5708F));

		PartDefinition leg7_r4 = leg3.addOrReplaceChild("leg7_r4", CubeListBuilder.create().texOffs(102, 39).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(102, 36).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6465F, -0.0175F, 0.5073F, -1.5708F, 0.192F, 1.5708F));

		PartDefinition leg5_r3 = leg3.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(35, 102).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6465F, 0.5846F, 0.514F, -1.5708F, -0.8552F, 1.5708F));

		PartDefinition leg7_r5 = leg3.addOrReplaceChild("leg7_r5", CubeListBuilder.create().texOffs(102, 33).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(102, 30).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.6465F, 1.7476F, -0.0454F, -1.5708F, -1.2392F, 1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(0, 7).addBox(-1.9513F, -0.4749F, -4.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.4856F, 0.473F, 1.442F, -0.0382F, 0.4338F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5229F, -4.3873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition toes3_r1 = toes3.addOrReplaceChild("toes3_r1", CubeListBuilder.create().texOffs(51, 7).addBox(-7.3513F, 0.4022F, 4.8364F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4F, -0.4F, -7.8F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(43, 38).addBox(-0.5F, -0.0001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(34, 14).addBox(-1.0F, -1.6835F, -4.9326F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1997F, -2.9826F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(70, 105).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0001F, -2.0122F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(88, 104).addBox(0.0F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0999F, -4.0122F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(105, 53).mirror().addBox(-2.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -3.5122F, 0.2342F, 0.3926F, -1.0087F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-1.6132F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -3.5122F, 0.3542F, 0.2902F, -0.6541F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 91).mirror().addBox(-1.6143F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2999F, -1.5122F, 0.27F, 0.105F, -0.71F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-3.0F, 0.0236F, -0.0523F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7071F, -4.8803F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(46, 91).addBox(-0.3857F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -1.5122F, 0.27F, -0.105F, 0.71F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(92, 40).addBox(-0.3868F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -3.5122F, 0.3542F, -0.2902F, 0.6541F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(105, 53).addBox(1.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2999F, -3.5122F, 0.2342F, -0.3926F, 1.0087F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0236F, -0.0523F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.7071F, -4.8803F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(19, 7).addBox(-2.0F, -0.2739F, 1.9255F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7039F, -5.7795F, 0.2967F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.0F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9192F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -4.6F, 0.5172F, 0.301F, -0.582F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(91, 69).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -4.6F, 0.3911F, 0.4557F, -0.9194F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-5.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -4.6F, 0.1204F, 0.5805F, -1.4552F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(103, 99).mirror().addBox(-4.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.1123F, 0.5198F, -1.4594F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(47, 28).mirror().addBox(-3.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.3508F, 0.4068F, -0.9363F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(85, 61).mirror().addBox(-1.6054F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -2.6F, 0.4643F, 0.267F, -0.5968F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(87, 30).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -0.6F, 0.4166F, 0.2592F, -0.6403F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, -0.6F, 0.3066F, 0.384F, -0.9843F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(39, 59).mirror().addBox(-3.0F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.7386F, -2.7258F, 0.0931F, 0.065F, -0.6078F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(52, 59).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6993F, -1.2263F, -0.0214F, -0.015F, -0.6107F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(39, 59).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.7386F, -2.7258F, 0.0931F, -0.065F, 0.6078F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(44, 64).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7386F, -2.7258F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 59).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.6993F, -1.2263F, -0.0214F, 0.015F, 0.6107F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2257F, -2.239F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(106, 10).addBox(0.0F, -1.125F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(106, 6).addBox(0.0F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1047F, -1.1018F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(105, 104).addBox(0.0F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.1F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(5, 89).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -0.6F, 0.3066F, -0.384F, 0.9843F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(87, 30).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -0.6F, 0.4166F, -0.2592F, 0.6403F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(85, 61).addBox(-0.3945F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.4643F, -0.267F, 0.5968F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(47, 28).addBox(1.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.3508F, -0.4068F, 0.9363F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(103, 99).addBox(3.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4F, -2.6F, 0.1123F, -0.5198F, 1.4594F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(67, 50).addBox(3.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.6F, 0.1204F, -0.5805F, 1.4552F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(91, 69).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.6F, 0.3911F, -0.4557F, 0.9194F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(62, 18).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.6F, 0.5172F, -0.301F, 0.582F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(17, 14).addBox(-1.5F, -0.7805F, -2.7982F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.5491F, -1.6709F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.1949F, 0.1713F, 0.0336F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-5.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.0811F, 0.4275F, -1.5053F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(89, 10).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.3735F, 0.2277F, -0.6506F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.2759F, 0.3402F, -0.9952F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(13, 59).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.8404F, -1.45F, 0.0353F, 0.0256F, -0.6279F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(13, 59).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.8404F, -1.45F, 0.0353F, -0.0256F, 0.6279F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -0.525F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3247F, -1.2273F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(97, 104).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(11, 64).addBox(-1.5F, -0.8891F, -4.7874F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.6714F, 2.0946F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(12, 89).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.2759F, -0.3402F, 0.9952F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(89, 10).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.3735F, -0.2277F, 0.6506F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 8).addBox(3.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.0811F, -0.4275F, 1.5053F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0516F, -0.2083F, -2.9595F, -0.0655F, 0.0696F, -0.013F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-1.6819F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.5449F, 0.2688F, -0.6852F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(104, 83).mirror().addBox(-4.1784F, -1.9179F, -0.6508F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.1703F, 0.5797F, -1.5388F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 14).mirror().addBox(-3.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.4306F, 0.4339F, -1.0134F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(89, 16).mirror().addBox(-1.59F, 0.2686F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.4634F, 0.2323F, -0.6178F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 26).mirror().addBox(-3.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.3624F, 0.3737F, -0.9526F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(29, 89).mirror().addBox(-5.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.1417F, 0.4964F, -1.4659F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(100, 104).mirror().addBox(-3.4869F, -1.5872F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.0527F, 0.6412F, -1.5154F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.9709F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.5306F, 0.3823F, -0.5988F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-2.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.3735F, 0.5365F, -0.9491F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(0.8677F, 1.1071F, 0.3794F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 5.4343F, -4.0058F, 0.7758F, -0.9955F, -0.2493F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(55, 64).mirror().addBox(0.8243F, 1.5627F, 1.1789F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 5.4343F, -4.0058F, 0.6544F, -0.7653F, -0.3302F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(0.1034F, 1.6646F, 1.7046F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0067F, 5.4343F, -4.0058F, 0.5282F, -0.5693F, -0.3362F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(85, 40).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6931F, -0.154F, -3.9529F, 0.0248F, 0.4942F, -0.5978F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(41, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0535F, -1.3114F, -3.4819F, 0.0219F, 0.0144F, -0.6092F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.055F, -1.4577F, -1.0759F, 0.0906F, 0.0684F, -0.6499F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(0.0F, 0.0F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4143F, 0.2374F, -0.0158F, 0.0718F, -0.2806F, -0.6636F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(73, 9).addBox(-1.0F, 0.0F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.3111F, 0.2374F, -0.0158F, 0.0718F, 0.2806F, 0.6636F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 74).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9518F, -1.4577F, -1.0759F, 0.0906F, -0.0684F, 0.6499F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(23, 74).addBox(-1.0044F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0472F, -0.3495F, -1.9555F, 0.1134F, 0.0007F, -0.0015F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(41, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9503F, -1.3114F, -3.4819F, 0.0219F, -0.0144F, 0.6092F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(85, 40).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5899F, -0.154F, -3.9529F, 0.0248F, -0.4942F, 0.5978F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(22, 64).addBox(-1.0016F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.05F, -0.7708F, -4.9676F, 0.0262F, 0.0007F, -0.0015F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(28, 43).addBox(-0.5457F, 0.1395F, 2.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(107, 23).addBox(0.0F, -0.8413F, -0.0199F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -1.1223F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(15, 105).addBox(0.5F, -1.6328F, -0.037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5059F, 0.758F, -5.0253F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(104, 63).addBox(0.0F, -1.2505F, 0.0138F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -3.1223F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(14, 69).addBox(-0.4035F, -0.8675F, -0.1239F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(58, 28).addBox(-1.1034F, 1.6646F, 1.7046F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, 0.5282F, 0.5693F, 0.3362F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(55, 64).addBox(-1.8243F, 1.5627F, 1.1789F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, 0.6544F, 0.7653F, 0.3302F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(73, 14).addBox(-1.8677F, 1.1071F, 0.3794F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0965F, 5.4343F, -4.0058F, 0.7758F, 0.9955F, 0.2493F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(89, 63).addBox(0.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.3735F, -0.5365F, 0.9491F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 105).addBox(-0.0291F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.5306F, -0.3823F, 0.5988F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(100, 104).addBox(2.4869F, -1.5872F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.0527F, -0.6412F, 1.5154F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(29, 89).addBox(3.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.1417F, -0.4964F, 1.4659F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(60, 26).addBox(1.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.3624F, -0.3737F, 0.9526F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(89, 16).addBox(-0.41F, 0.2686F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.4634F, -0.2323F, 0.6178F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(89, 14).addBox(1.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.4306F, -0.4339F, 1.0134F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(104, 83).addBox(3.1784F, -1.9179F, -0.6508F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.1703F, -0.5797F, 1.5388F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(89, 12).addBox(-0.3181F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.5449F, -0.2688F, 0.6852F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5484F, 4.082F, -4.8672F, 1.1972F, 0.1406F, -0.1814F));

		PartDefinition cube_r157 = UpperArmL.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(88, 96).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.7938F, 0.7823F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r158 = UpperArmL.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 96).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 6.0779F, -0.1765F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r159 = UpperArmL.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(78, 96).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 4.8316F, 0.6849F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r160 = UpperArmL.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(96, 61).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.2464F, -0.6136F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r161 = UpperArmL.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(40, 96).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.2574F, -0.4658F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r162 = UpperArmL.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 96).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.4973F, 0.1903F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r163 = UpperArmL.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(80, 28).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2425F, 0.6626F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r164 = UpperArmL.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(20, 96).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.2406F, 0.6016F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r165 = UpperArmL.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -1.0F, 0.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create().texOffs(0, 74).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 6.2359F, 0.8519F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r166 = LowerArmL.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(97, 16).addBox(-1.0F, -2.4F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(89, 72).addBox(-1.0F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0F, 2.2026F, -0.7749F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r167 = LowerArmL.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(89, 65).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5F, 4.7518F, -0.5701F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r168 = LowerArmL.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(40, 86).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.5F, 2.2F, -1.35F, 0.0698F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(65, 52).addBox(-3.0F, -0.9F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.0971F, -0.3152F, 1.4366F, 0.1704F, -0.0381F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1069F, -1.9028F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r169 = HandL2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(36, 7).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.25F, -3.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6516F, 4.082F, -4.8672F, 1.2013F, -0.3481F, 0.2553F));

		PartDefinition cube_r170 = UpperArmL2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(103, 67).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.7938F, 0.7823F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r171 = UpperArmL2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(65, 103).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.0779F, -0.1765F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r172 = UpperArmL2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(103, 48).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 4.8316F, 0.6849F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r173 = UpperArmL2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(103, 45).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.2464F, -0.6136F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r174 = UpperArmL2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(103, 42).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.2574F, -0.4658F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r175 = UpperArmL2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(102, 101).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.4973F, 0.1903F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r176 = UpperArmL2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(82, 84).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2425F, 0.6626F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r177 = UpperArmL2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(102, 86).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.2406F, 0.6016F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r178 = UpperArmL2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(19, 87).addBox(-0.5F, -1.0F, 0.125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create().texOffs(76, 44).addBox(1.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 6.2359F, 0.8519F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r179 = LowerArmL2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(103, 96).addBox(0.0F, -2.4F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(85, 92).addBox(0.0F, -1.8F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0F, 2.2026F, -0.7749F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r180 = LowerArmL2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(92, 80).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.5F, 4.7518F, -0.5701F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r181 = LowerArmL2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.5F, 2.2F, -1.35F, 0.0698F, 0.0F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(66, 64).addBox(0.0F, -0.925F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 6.0971F, -0.3152F, 1.4395F, -0.1308F, 0.0057F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1069F, -1.9028F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r182 = HandL4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7386F, 2.3731F, -3.6473F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(23, 69).addBox(-0.4767F, -0.8811F, -0.5906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0749F, 2.2944F, -0.1903F, 1.8662F, 0.1206F, 1.1895F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(90, 55).addBox(-0.4767F, -0.3351F, -0.7593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0749F, 2.2944F, -0.1903F, 1.4298F, 0.1206F, 1.1895F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(45, 86).addBox(-0.4767F, -1.3362F, -1.3082F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0749F, 2.2944F, -0.1903F, 1.7353F, 0.1206F, 1.1895F));

		PartDefinition cube_r186 = bone2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(81, 43).addBox(-0.4428F, -1.1783F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2475F, -0.7891F, 0.4957F, 1.1147F, 0.0843F, -0.2571F));

		PartDefinition cube_r187 = bone2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(35, 81).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.1789F, -2.7445F, 1.0882F, -2.1752F, 0.0843F, -0.2571F));

		PartDefinition cube_r188 = bone2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(97, 25).addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1956F, -1.4046F, 1.3418F, -0.4735F, 0.0843F, -0.2571F));

		PartDefinition cube_r189 = bone2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(97, 22).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2587F, -2.7168F, 0.0917F, -3.1351F, 0.0843F, -0.2571F));

		PartDefinition cube_r190 = bone2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(12, 81).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2698F, -2.4398F, -0.8691F, 1.8391F, 0.0843F, -0.2571F));

		PartDefinition cube_r191 = bone2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(97, 19).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.1854F, -1.8501F, -1.6784F, 0.5301F, 0.0843F, -0.2571F));

		PartDefinition cube_r192 = bone2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(90, 51).addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0765F, -1.0935F, -0.9579F, 0.3555F, 0.0843F, -0.2571F));

		PartDefinition cube_r193 = bone2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(89, 84).addBox(-0.4653F, -0.9104F, -1.9371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.2475F, -0.7891F, 0.4957F, 0.0501F, 0.0843F, -0.2571F));

		PartDefinition cube_r194 = bone2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(92, 88).addBox(-0.4653F, -1.8897F, -0.4881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2475F, -0.7891F, 0.4957F, 2.2056F, 0.0843F, -0.2571F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8418F, 2.3731F, -3.6473F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r195 = bone4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(23, 69).mirror().addBox(-0.5233F, -0.8811F, -0.5906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0749F, 2.2944F, -0.1903F, 1.8662F, -0.1206F, -1.1895F));

		PartDefinition cube_r196 = bone4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-0.5233F, -0.3351F, -0.7593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.0749F, 2.2944F, -0.1903F, 1.4298F, -0.1206F, -1.1895F));

		PartDefinition cube_r197 = bone4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.5233F, -1.3362F, -1.3082F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0749F, 2.2944F, -0.1903F, 1.7353F, -0.1206F, -1.1895F));

		PartDefinition cube_r198 = bone4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.5572F, -1.1783F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2475F, -0.7891F, 0.4957F, 1.1147F, -0.0843F, 0.2571F));

		PartDefinition cube_r199 = bone4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.1789F, -2.7445F, 1.0882F, -2.1752F, -0.0843F, 0.2571F));

		PartDefinition cube_r200 = bone4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(97, 25).mirror().addBox(-0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1956F, -1.4046F, 1.3418F, -0.4735F, -0.0843F, 0.2571F));

		PartDefinition cube_r201 = bone4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(97, 22).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2587F, -2.7168F, 0.0917F, -3.1351F, -0.0843F, 0.2571F));

		PartDefinition cube_r202 = bone4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(12, 81).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.2698F, -2.4398F, -0.8691F, 1.8391F, -0.0843F, 0.2571F));

		PartDefinition cube_r203 = bone4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.1854F, -1.8501F, -1.6784F, 0.5301F, -0.0843F, 0.2571F));

		PartDefinition cube_r204 = bone4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(90, 51).mirror().addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0765F, -1.0935F, -0.9579F, 0.3555F, -0.0843F, 0.2571F));

		PartDefinition cube_r205 = bone4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.5347F, -0.9104F, -1.9371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.2475F, -0.7891F, 0.4957F, 0.0501F, -0.0843F, 0.2571F));

		PartDefinition cube_r206 = bone4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(92, 88).mirror().addBox(-0.5347F, -1.8897F, -0.4881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2475F, -0.7891F, 0.4957F, 2.2056F, -0.0843F, 0.2571F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.558F, -4.8253F, -0.1928F, 0.3323F, -0.109F));

		PartDefinition cube_r207 = neck3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(104, 70).addBox(0.5F, -1.4805F, -0.1119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6131F, -2.1009F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r208 = neck3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(90, 59).mirror().addBox(-2.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0347F, -1.797F, 0.6465F, 0.7906F, -0.779F));

		PartDefinition cube_r209 = neck3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(18, 105).mirror().addBox(-0.9709F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0347F, -1.797F, 0.8516F, 0.5503F, -0.453F));

		PartDefinition cube_r210 = neck3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(94, 4).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(82, 15).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0445F, -2.6452F, -1.7224F, 0.0756F, 0.0436F, -0.522F));

		PartDefinition cube_r211 = neck3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(45, 104).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9106F, -2.2342F, -0.6827F, 0.1772F, 1.1285F, -0.3648F));

		PartDefinition cube_r212 = neck3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(94, 65).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6787F, -1.7522F, -1.104F, 2.8053F, 1.3401F, 2.2884F));

		PartDefinition cube_r213 = neck3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(82, 15).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 4).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9532F, -2.6452F, -1.7224F, 0.0756F, -0.0436F, 0.522F));

		PartDefinition cube_r214 = neck3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(94, 65).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5874F, -1.7522F, -1.104F, 2.8053F, -1.3401F, -2.2884F));

		PartDefinition cube_r215 = neck3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(45, 104).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8192F, -2.2342F, -0.6827F, 0.1772F, -1.1285F, 0.3648F));

		PartDefinition cube_r216 = neck3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(76, 52).addBox(-0.9989F, 0.4F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0468F, -3.1047F, -1.0599F, 0.0872F, 0.0F, 0.0F));

		PartDefinition cube_r217 = neck3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(18, 105).addBox(-0.0291F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0347F, -1.797F, 0.8516F, -0.5503F, 0.453F));

		PartDefinition cube_r218 = neck3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(90, 59).addBox(0.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0347F, -1.797F, 0.6465F, -0.7906F, 0.779F));

		PartDefinition cube_r219 = neck3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(32, 69).addBox(-0.0457F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2557F, -3.0053F, -0.0873F, 0.0444F, -0.0029F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(5, 74).addBox(0.5F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(105, 51).mirror().addBox(-1.9388F, -0.2595F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0904F, -0.6917F, 0.1185F, 1.0167F, -1.4477F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(-0.05F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7687F, -1.8863F, 0.0973F, 0.243F, 0.0452F, -0.4938F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(38, 105).mirror().addBox(-0.9709F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.0904F, -0.6917F, 0.5893F, 0.8912F, -0.8768F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(32, 74).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 74).addBox(0.0F, 0.0F, -2.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9476F, -2.9207F, 0.0817F, 0.2473F, -0.2229F, 0.4851F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(76, 56).addBox(0.0068F, -0.5F, -2.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(76, 56).addBox(0.0068F, -0.5F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0524F, -2.385F, 0.0273F, 0.2792F, -0.0084F, -0.0024F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(76, 56).addBox(0.0068F, -0.5F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(76, 56).addBox(0.0068F, -0.5F, -2.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0524F, -2.385F, 0.0273F, 0.2805F, -0.0923F, -0.0265F));

		PartDefinition cube_r227 = neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(105, 51).addBox(0.9388F, -0.2595F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.6917F, 0.1185F, -1.0167F, 1.4477F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(38, 105).addBox(-0.0291F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0904F, -0.6917F, 0.5893F, -0.8912F, 0.8768F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(85, 36).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -2.0022F, -0.0425F, 0.017F, 0.1298F));

		PartDefinition cube_r230 = neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(35, 105).addBox(0.5F, -1.4F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r231 = neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(0.0F, 0.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4874F, -1.2512F, -0.9732F, 0.8652F, -1.1837F, -1.4085F));

		PartDefinition cube_r232 = neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(19, 83).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.0389F, -1.7404F, -2.2626F, 0.4193F, -0.7872F, -0.8873F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(101, 9).mirror().addBox(0.0F, 0.0F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(101, 9).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4874F, -1.2512F, -0.9732F, 2.1038F, -1.2307F, -2.7114F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(39, 91).mirror().addBox(-1.9709F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, -0.1404F, -0.6895F, 0.4936F, 1.0085F, -1.0199F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(10, 101).addBox(-1.0F, 0.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3961F, -1.2512F, -0.9732F, 0.8652F, 1.1837F, 1.4085F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(101, 9).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3961F, -1.2512F, -0.9732F, 2.1038F, 1.2307F, 2.7114F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(19, 83).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.9476F, -1.7404F, -2.2626F, 0.4193F, 0.7872F, 0.8873F));

		PartDefinition cube_r238 = neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(14, 74).addBox(-0.9932F, -0.475F, -1.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0524F, -1.5831F, -1.1209F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(39, 91).addBox(-0.0291F, 0.0772F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1404F, -0.6895F, 0.4936F, -1.0085F, 1.0199F));

		PartDefinition cube_r240 = neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(82, 72).addBox(-0.0457F, -0.1F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0019F, -0.0746F, -1.3769F, 0.3615F, 0.1297F, 0.1379F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(98, 42).addBox(-0.5F, -0.0934F, -0.1332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0554F, -0.1421F, -10.4179F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(30, 98).addBox(-0.5F, -0.1528F, -0.923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0554F, -0.4922F, -9.6929F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(25, 98).addBox(-0.5F, 0.3115F, -2.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.5171F, -6.6929F, -3.0805F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(10, 98).addBox(-0.5F, -1.9883F, 0.207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.1672F, -7.4429F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(5, 98).addBox(-0.5F, 0.1352F, 0.0701F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.1672F, -7.4429F, -2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(97, 87).addBox(-0.5F, -0.8804F, -1.131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.1672F, -7.4429F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(97, 80).addBox(-0.5F, -1.0033F, 0.0017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.5171F, -6.6929F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(69, 97).addBox(-0.5F, 0.9105F, 0.0868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, -0.5171F, -6.6929F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(69, 34).addBox(-0.5098F, -0.05F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.8316F, -2.3427F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(67, 44).addBox(-0.5F, -1.0F, -2.375F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0554F, -1.1475F, -1.3156F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(87, 18).addBox(-0.5F, -0.6F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -1.4928F, -1.7401F, 1.4311F, 0.0041F, -0.0057F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(97, 28).addBox(-0.5F, -0.092F, -0.9045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -2.2006F, -2.1449F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(85, 32).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.2006F, -2.1449F, 0.096F, 0.0F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2116F, -1.5158F, -3.3618F, 0.0989F, 0.0773F, 0.0698F));

		PartDefinition cube_r254 = crestl.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(97, 57).addBox(-2.154F, 0.0981F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 37).addBox(-2.154F, 0.4981F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, 0.8039F, 0.6358F, -0.5017F));

		PartDefinition cube_r255 = crestl.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(97, 34).addBox(-0.6692F, 1.4763F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 31).addBox(-0.6692F, 1.0763F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, 0.9782F, -0.0259F, 0.0355F));

		PartDefinition cube_r256 = crestl.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(75, 90).addBox(-2.1113F, -1.5968F, -0.2573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, 0.4055F, 0.9178F, -1.0572F));

		PartDefinition cube_r257 = crestl.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(76, 60).addBox(-2.7035F, -0.6395F, 0.7182F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, -0.503F, -0.0143F, 0.0161F));

		PartDefinition cube_r258 = crestl.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(12, 78).addBox(-2.6872F, -0.4893F, 0.3748F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, -0.3744F, -0.0259F, 0.0355F));

		PartDefinition cube_r259 = crestl.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(35, 78).addBox(-2.6872F, -0.4298F, -0.0113F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, -0.2872F, -0.0259F, 0.0355F));

		PartDefinition cube_r260 = crestl.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(58, 34).addBox(-2.6872F, -0.5989F, -0.4041F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, -1.7707F, -0.0259F, 0.0355F));

		PartDefinition cube_r261 = crestl.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(77, 4).addBox(-2.6872F, -0.5915F, -0.2036F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2331F, -0.0373F, 1.8292F, 2.9853F, -0.0259F, 0.0355F));

		PartDefinition cube_r262 = crestl.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(75, 68).addBox(-2.6624F, -1.6848F, -0.5499F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2212F, -0.0735F, 1.3306F, 1.4989F, 0.0786F, 0.0318F));

		PartDefinition cube_r263 = crestl.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(75, 0).addBox(-1.7F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1761F, -0.2299F, -0.0949F, -0.1725F, 0.0658F, -0.0462F));

		PartDefinition cube_r264 = crestl.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(84, 69).addBox(-0.9093F, -0.5204F, -0.1922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7187F, -0.2281F, -0.3828F, -0.1779F, 0.2549F, -0.08F));

		PartDefinition cube_r265 = crestl.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(59, 69).addBox(-1.7F, -0.35F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3923F, -0.5342F, -1.1274F, -1.4288F, 0.4982F, -0.0906F));

		PartDefinition cube_r266 = crestl.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(85, 81).addBox(-0.9853F, -0.2788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 9).addBox(-0.9853F, -0.6788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7187F, -0.2281F, -0.3828F, -1.6781F, 0.5844F, -0.1207F));

		PartDefinition crestl2 = head.addOrReplaceChild("crestl2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3068F, -1.5158F, -3.3618F, 0.0989F, -0.0773F, -0.0698F));

		PartDefinition cube_r267 = crestl2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(97, 57).mirror().addBox(1.154F, 0.0981F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 37).mirror().addBox(1.154F, 0.4981F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, 0.8039F, -0.6358F, 0.5017F));

		PartDefinition cube_r268 = crestl2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(97, 34).mirror().addBox(-0.3308F, 1.4763F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 31).mirror().addBox(-0.3308F, 1.0763F, -0.2573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, 0.9782F, 0.0259F, -0.0355F));

		PartDefinition cube_r269 = crestl2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(75, 90).mirror().addBox(1.1113F, -1.5968F, -0.2573F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, 0.4055F, -0.9178F, 1.0572F));

		PartDefinition cube_r270 = crestl2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-0.2965F, -0.6395F, 0.7182F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, -0.503F, 0.0143F, -0.0161F));

		PartDefinition cube_r271 = crestl2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(12, 78).mirror().addBox(-0.3128F, -0.4893F, 0.3748F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, -0.3744F, 0.0259F, -0.0355F));

		PartDefinition cube_r272 = crestl2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.3128F, -0.4298F, -0.0113F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, -0.2872F, 0.0259F, -0.0355F));

		PartDefinition cube_r273 = crestl2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 34).mirror().addBox(-0.3128F, -0.5989F, -0.4041F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, -1.7707F, 0.0259F, -0.0355F));

		PartDefinition cube_r274 = crestl2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(77, 4).mirror().addBox(-0.3128F, -0.5915F, -0.2036F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2331F, -0.0373F, 1.8292F, 2.9853F, 0.0259F, -0.0355F));

		PartDefinition cube_r275 = crestl2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-0.3376F, -1.6848F, -0.5499F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2212F, -0.0735F, 1.3306F, 1.4989F, -0.0786F, -0.0318F));

		PartDefinition cube_r276 = crestl2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.3F, -0.5F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1761F, -0.2299F, -0.0949F, -0.1725F, -0.0658F, 0.0462F));

		PartDefinition cube_r277 = crestl2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(-1.0907F, -0.5204F, -0.1922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7187F, -0.2281F, -0.3828F, -0.1779F, -0.2549F, 0.08F));

		PartDefinition cube_r278 = crestl2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(59, 69).mirror().addBox(-0.3F, -0.35F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3923F, -0.5342F, -1.1274F, -1.4288F, -0.4982F, 0.0906F));

		PartDefinition cube_r279 = crestl2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-1.0147F, -0.2788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 9).mirror().addBox(-1.0147F, -0.6788F, -0.5067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7187F, -0.2281F, -0.3828F, -1.6781F, -0.5844F, 0.1207F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5261F, 0.5959F, -10.8604F, 0.1222F, 0.0173F, 0.0021F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(56, 82).addBox(-0.5F, -0.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3471F, 0.8501F, 0.2273F, 1.8071F, 0.0641F, -0.1577F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(74, 99).addBox(-0.7569F, 3.7111F, -1.8628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1811F, 0.3775F, 0.5075F, 1.7418F, 0.0812F, -0.158F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(49, 82).addBox(-0.7569F, 2.9864F, -1.4962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1811F, 0.3775F, 0.5075F, 1.672F, 0.0812F, -0.158F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(42, 82).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2138F, 0.4065F, 3.2221F, 1.5847F, 0.0812F, -0.158F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(82, 11).addBox(-0.9011F, 1.3218F, -1.179F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0561F, 0.3775F, 0.5075F, 1.6707F, 0.0986F, -0.1581F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(82, 7).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3078F, 0.4014F, 1.578F, 1.5017F, 0.0641F, -0.1577F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(25, 101).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4226F, 1.2238F, 10.5559F, -2.303F, 0.0194F, -0.0672F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(85, 51).addBox(-0.7583F, -3.9182F, 0.3843F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -1.7351F, 0.0F, -0.0698F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(71, 28).addBox(-0.234F, -1.824F, 0.2985F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -0.9319F, 0.4164F, -0.0095F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(71, 23).addBox(-0.234F, -2.4569F, -0.1437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -1.1588F, 0.4164F, -0.0095F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(71, 18).addBox(-0.234F, -1.1012F, 0.3461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -0.7225F, 0.4164F, -0.0095F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(68, 91).addBox(-0.9974F, -0.6755F, 0.0476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -0.2589F, 0.2233F, -0.0965F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 91).addBox(-0.0882F, -1.2493F, 1.7838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -0.2924F, 0.5271F, -0.109F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(81, 47).addBox(0.0628F, 0.8047F, -0.5174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, 1.1496F, 0.4001F, -0.0945F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(21, 78).addBox(-0.5F, 0.0F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2433F, 0.9284F, 3.7647F, 3.0543F, 0.0959F, -0.0874F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(77, 63).addBox(0.0628F, -0.7414F, -1.6608F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, 3.0258F, 0.4001F, -0.0945F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(99, 71).addBox(-0.047F, -0.0675F, 0.5181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8311F, 0.3775F, 2.9075F, -2.8942F, 0.0612F, -0.0872F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(55, 101).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3698F, 0.0596F, 0.1806F, 2.6385F, 0.0612F, -0.0872F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(99, 64).addBox(0.153F, -0.9398F, 1.9026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.8311F, 0.3775F, 2.9075F, 2.9875F, 0.0612F, -0.0872F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(60, 20).addBox(-0.8719F, -0.9779F, 1.0239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2311F, 0.3775F, 0.5075F, 0.1134F, 0.0959F, -0.0874F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(40, 99).addBox(0.053F, 0.9245F, 0.9524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.8311F, 0.3775F, 2.9075F, -2.6499F, 0.0612F, -0.0872F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(35, 99).addBox(-0.2526F, -1.0064F, -0.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8311F, -0.7225F, 1.1075F, -1.332F, 0.0549F, -0.0912F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(84, 0).addBox(-0.7583F, -1.9728F, 0.6021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -0.365F, 0.0F, -0.0698F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(33, 64).addBox(-2.7583F, -1.1112F, 0.9466F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -0.1468F, 0.0F, -0.0698F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(20, 99).addBox(-0.5005F, -0.3585F, -0.3586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2124F, -0.1379F, 0.7963F, -1.8586F, 0.0712F, -0.0944F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(15, 99).addBox(-0.5005F, -0.5921F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(99, 3).addBox(-0.5005F, -0.4171F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2124F, -0.1379F, 0.7963F, -2.644F, 0.0712F, -0.0944F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(97, 101).addBox(-0.5424F, 0.9981F, 1.42F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, 0.3777F, -0.0167F, -0.0557F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5424F, -1.5293F, 1.2576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(98, 98).addBox(-0.5424F, -1.5293F, 1.0576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -0.6695F, -0.0167F, -0.0557F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(101, 60).addBox(-0.8428F, -0.6557F, -1.4129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -2.9294F, 0.262F, -0.0929F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(92, 101).addBox(-0.8428F, -0.2922F, -0.9912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, 2.3938F, 0.262F, -0.0929F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(93, 98).addBox(-0.5424F, -1.8574F, -0.8429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -1.7778F, -0.0167F, -0.0557F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(98, 68).addBox(-0.5509F, -2.5431F, -0.3615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 98).addBox(-0.5509F, -1.843F, -0.3615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -1.8651F, -0.0167F, -0.0557F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(60, 101).addBox(-0.7914F, -1.4949F, -0.3832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -1.879F, 0.2205F, -0.0792F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(50, 101).addBox(0.2077F, 0.5943F, 1.6694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, 0.8485F, 0.4751F, -0.1059F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(45, 101).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.0726F, -0.4098F, 7.4192F, 1.502F, 0.5012F, -0.1079F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(30, 101).addBox(0.2077F, 1.1938F, -1.933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, 2.3756F, 0.4751F, -0.1059F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(63, 91).addBox(0.1992F, -0.5614F, -2.3943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -3.0785F, 0.4751F, -0.1059F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(58, 91).addBox(0.1992F, -1.6931F, -1.2659F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -2.0313F, 0.4751F, -0.1059F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(53, 91).addBox(0.1992F, -2.0265F, -1.5527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -1.8568F, 0.4751F, -0.1059F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(101, 12).addBox(0.1992F, -1.7992F, -1.1978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -1.2459F, 0.4751F, -0.1059F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(55, 98).addBox(0.1992F, -1.7966F, 0.9018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -0.1115F, 0.4751F, -0.1059F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(26, 83).addBox(-1.9974F, -1.8229F, 0.002F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.6189F, 0.3275F, 7.5575F, -0.128F, 0.2233F, -0.0965F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(50, 86).addBox(-0.0882F, -1.9867F, 1.8153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -0.1179F, 0.5271F, -0.109F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(50, 69).addBox(-0.9372F, -2.2468F, 0.5202F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -0.1594F, 0.4001F, -0.0945F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(50, 98).addBox(0.0645F, -0.8784F, -2.1319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5811F, 0.3775F, 5.6075F, -1.5557F, 0.4001F, -0.0945F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(98, 48).addBox(-0.525F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2919F, -1.0588F, 5.0809F, -2.7833F, 0.1143F, -0.0665F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(91, 0).addBox(-0.186F, 0.0486F, -1.0214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8311F, -1.2225F, 3.0075F, 1.7454F, 0.1004F, -0.0823F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(90, 76).addBox(-0.2305F, 0.0591F, 0.0648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8311F, -1.0225F, 2.0075F, 0.23F, 0.0596F, -0.0882F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(41, 69).addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4714F, 0.0259F, 1.8486F, -0.0581F, 0.0612F, -0.0872F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(98, 45).addBox(-0.047F, -0.8526F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8311F, 0.3775F, 2.9075F, 1.2073F, 0.0612F, -0.0872F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(45, 98).addBox(-0.8719F, -0.9205F, 2.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2311F, 0.3775F, 0.5075F, -0.1484F, 0.0959F, -0.0874F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6212F, 0.5959F, -10.8604F, 0.1222F, -0.0173F, -0.0021F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(56, 82).mirror().addBox(-0.5F, -0.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3471F, 0.8501F, 0.2273F, 1.8071F, -0.0641F, 0.1577F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(74, 99).mirror().addBox(-0.2431F, 3.7111F, -1.8628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1811F, 0.3775F, 0.5075F, 1.7418F, -0.0812F, 0.158F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-0.2431F, 2.9864F, -1.4962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1811F, 0.3775F, 0.5075F, 1.672F, -0.0812F, 0.158F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(42, 82).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2138F, 0.4065F, 3.2221F, 1.5847F, -0.0812F, 0.158F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(82, 11).mirror().addBox(-0.0989F, 1.3218F, -1.179F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0561F, 0.3775F, 0.5075F, 1.6707F, -0.0986F, 0.1581F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3078F, 0.4014F, 1.578F, 1.5017F, -0.0641F, 0.1577F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(25, 101).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4226F, 1.2238F, 10.5559F, -2.303F, -0.0194F, 0.0672F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-0.2417F, -3.9182F, 0.3843F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -1.7351F, 0.0F, 0.0698F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(71, 28).mirror().addBox(-0.766F, -1.824F, 0.2985F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -0.9319F, -0.4164F, 0.0095F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-0.766F, -2.4569F, -0.1437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -1.1588F, -0.4164F, 0.0095F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-0.766F, -1.1012F, 0.3461F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -0.7225F, -0.4164F, 0.0095F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(68, 91).mirror().addBox(-0.0026F, -0.6755F, 0.0476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -0.2589F, -0.2233F, 0.0965F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.9118F, -1.2493F, 1.7838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -0.2924F, -0.5271F, 0.109F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(-1.0628F, 0.8047F, -0.5174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, 1.1496F, -0.4001F, 0.0945F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(21, 78).mirror().addBox(-0.5F, 0.0F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2433F, 0.9284F, 3.7647F, 3.0543F, -0.0959F, 0.0874F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-1.0628F, -0.7414F, -1.6608F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, 3.0258F, -0.4001F, 0.0945F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(99, 71).mirror().addBox(-0.953F, -0.0675F, 0.5181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8311F, 0.3775F, 2.9075F, -2.8942F, -0.0612F, 0.0872F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(55, 101).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.3698F, 0.0596F, 0.1806F, 2.6385F, -0.0612F, 0.0872F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(99, 64).mirror().addBox(-1.153F, -0.9398F, 1.9026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.8311F, 0.3775F, 2.9075F, 2.9875F, -0.0612F, 0.0872F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-0.1281F, -0.9779F, 1.0239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2311F, 0.3775F, 0.5075F, 0.1134F, -0.0959F, 0.0874F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(40, 99).mirror().addBox(-1.053F, 0.9245F, 0.9524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.8311F, 0.3775F, 2.9075F, -2.6499F, -0.0612F, 0.0872F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(35, 99).mirror().addBox(-0.7474F, -1.0064F, -0.0144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.8311F, -0.7225F, 1.1075F, -1.332F, -0.0549F, 0.0912F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.2417F, -1.9728F, 0.6021F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -0.365F, 0.0F, 0.0698F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(33, 64).mirror().addBox(-0.2417F, -1.1112F, 0.9466F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -0.1468F, 0.0F, 0.0698F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(-0.4995F, -0.3585F, -0.3586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2124F, -0.1379F, 0.7963F, -1.8586F, -0.0712F, 0.0944F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(-0.4995F, -0.5921F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(99, 3).mirror().addBox(-0.4995F, -0.4171F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2124F, -0.1379F, 0.7963F, -2.644F, -0.0712F, 0.0944F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(97, 101).mirror().addBox(-0.4576F, 0.9981F, 1.42F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, 0.3777F, 0.0167F, 0.0557F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.4576F, -1.5293F, 1.2576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(98, 98).mirror().addBox(-0.4576F, -1.5293F, 1.0576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -0.6695F, 0.0167F, 0.0557F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(101, 60).mirror().addBox(-0.1572F, -0.6557F, -1.4129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -2.9294F, -0.262F, 0.0929F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(92, 101).mirror().addBox(-0.1572F, -0.2922F, -0.9912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, 2.3938F, -0.262F, 0.0929F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(93, 98).mirror().addBox(-0.4576F, -1.8574F, -0.8429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -1.7778F, 0.0167F, 0.0557F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(98, 68).mirror().addBox(-0.4491F, -2.5431F, -0.3615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 98).mirror().addBox(-0.4491F, -1.843F, -0.3615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -1.8651F, 0.0167F, 0.0557F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(60, 101).mirror().addBox(-0.2086F, -1.4949F, -0.3832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -1.879F, -0.2205F, 0.0792F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(50, 101).mirror().addBox(-1.2077F, 0.5943F, 1.6694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, 0.8485F, -0.4751F, 0.1059F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(45, 101).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.0726F, -0.4098F, 7.4192F, 1.502F, -0.5012F, 0.1079F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(30, 101).mirror().addBox(-1.2077F, 1.1938F, -1.933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, 2.3756F, -0.4751F, 0.1059F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(63, 91).mirror().addBox(-1.1992F, -0.5614F, -2.3943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -3.0785F, -0.4751F, 0.1059F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(58, 91).mirror().addBox(-1.1992F, -1.6931F, -1.2659F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -2.0313F, -0.4751F, 0.1059F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(53, 91).mirror().addBox(-1.1992F, -2.0265F, -1.5527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -1.8568F, -0.4751F, 0.1059F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(-1.1992F, -1.7992F, -1.1978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -1.2459F, -0.4751F, 0.1059F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(55, 98).mirror().addBox(-1.1992F, -1.7966F, 0.9018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -0.1115F, -0.4751F, 0.1059F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(26, 83).mirror().addBox(-0.0026F, -1.8229F, 0.002F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6189F, 0.3275F, 7.5575F, -0.128F, -0.2233F, 0.0965F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(-0.9118F, -1.9867F, 1.8153F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -0.1179F, -0.5271F, 0.109F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-1.0628F, -2.2468F, 0.5202F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -0.1594F, -0.4001F, 0.0945F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(50, 98).mirror().addBox(-1.0645F, -0.8784F, -2.1319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5811F, 0.3775F, 5.6075F, -1.5557F, -0.4001F, 0.0945F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(98, 48).mirror().addBox(-0.475F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2919F, -1.0588F, 5.0809F, -2.7833F, -0.1143F, 0.0665F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.8141F, 0.0486F, -1.0214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8311F, -1.2225F, 3.0075F, 1.7454F, -0.1004F, 0.0823F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-0.7695F, 0.0591F, 0.0648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.8311F, -1.0225F, 2.0075F, 0.23F, -0.0596F, 0.0882F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(41, 69).mirror().addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4714F, 0.0259F, 1.8486F, -0.0581F, -0.0612F, 0.0872F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(98, 45).mirror().addBox(-0.953F, -0.8526F, -0.5573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.8311F, 0.3775F, 2.9075F, 1.2073F, -0.0612F, 0.0872F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-0.1281F, -0.9205F, 2.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2311F, 0.3775F, 0.5075F, -0.1484F, -0.0959F, 0.0874F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0567F, 1.2577F, 0.3125F, 0.7678F, 0.0003F, 0.0011F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(79, 99).mirror().addBox(-0.1475F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(100, 54).mirror().addBox(-0.1475F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, 0.0664F, -0.0628F, 0.0777F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(99, 83).mirror().addBox(-0.1475F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(84, 99).mirror().addBox(-0.1475F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, 2.4226F, -0.0628F, 0.0777F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-0.1475F, 0.696F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, -2.2025F, -0.0628F, 0.0777F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(29, 91).mirror().addBox(-0.1286F, -4.1007F, -0.9052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(102, 27).mirror().addBox(-0.1286F, -4.8007F, -0.9052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, 0.8177F, -0.0624F, 0.0656F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(100, 51).mirror().addBox(-0.1475F, -0.5914F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, -0.2827F, -0.0628F, 0.0777F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(65, 100).mirror().addBox(-0.1475F, -1.6672F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, 1.6023F, -0.0628F, 0.0777F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(39, 93).mirror().addBox(-0.1475F, -0.7303F, 1.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, 2.9549F, -0.0628F, 0.0777F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(63, 82).mirror().addBox(-0.1475F, 1.8814F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, -1.8884F, -0.0628F, 0.0777F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(34, 91).mirror().addBox(-0.1475F, -0.5359F, -3.3919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, -0.4921F, -0.0628F, 0.0777F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.3233F, 0.7347F, -2.2936F, 0.9042F, -0.0628F, 0.0777F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-0.1497F, -0.5277F, 0.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, 2.728F, -0.0653F, 0.076F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(100, 74).mirror().addBox(-0.3182F, -0.9702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 77).mirror().addBox(-0.3182F, -0.9702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 74).mirror().addBox(-0.3182F, -1.3702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 77).mirror().addBox(-0.3182F, -1.3702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 77).mirror().addBox(-0.3182F, -0.9702F, 2.9506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 74).mirror().addBox(-0.3182F, -0.9702F, 3.3506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 77).mirror().addBox(-0.3182F, -1.3702F, 2.9506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 74).mirror().addBox(-0.3182F, -1.3702F, 3.3506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9207F, 1.0628F, 1.1555F, 2.5184F, -0.0696F, 0.0591F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.2247F, -2.0695F, 0.0895F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.4633F, -1.1333F, -2.7064F, 0.8533F, -0.3004F, 0.2809F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(90, 92).mirror().addBox(-0.2247F, -3.1093F, 0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.4633F, -1.1333F, -2.7064F, 0.8097F, -0.3004F, 0.2809F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(15, 92).mirror().addBox(-0.8673F, -1.4322F, 0.1608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5633F, -2.8333F, -4.9064F, 0.8789F, -0.1792F, 0.1967F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(7, 83).mirror().addBox(-0.534F, -1.6261F, -0.5907F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(102, 18).mirror().addBox(-0.534F, -0.4011F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 102).mirror().addBox(-0.534F, 0.4989F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 104).mirror().addBox(-0.534F, 1.3989F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2499F, -5.5773F, -6.8153F, 0.8043F, -0.1008F, 0.102F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(28, 78).mirror().addBox(-0.215F, -1.8249F, -1.3858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.4633F, -1.1333F, -2.7064F, 0.6314F, -0.3002F, 0.2936F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.215F, -3.4108F, -1.5271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(92, 22).mirror().addBox(-0.215F, -3.4108F, -0.9271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.4633F, -1.1333F, -2.7064F, 0.5441F, -0.3002F, 0.2936F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(-0.832F, -1.4233F, -0.5066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5633F, -2.8333F, -4.9064F, 0.7458F, -0.1793F, 0.209F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(24, 87).mirror().addBox(-0.472F, -0.6209F, -1.0328F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2499F, -5.5773F, -6.8153F, 0.7594F, -0.1011F, 0.1142F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.472F, -1.0348F, -1.126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(15, 102).mirror().addBox(-0.472F, -1.3348F, -1.126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2499F, -5.5773F, -6.8153F, 0.4539F, -0.1011F, 0.1142F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(102, 15).mirror().addBox(-0.5323F, -1.2669F, -0.1879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2499F, -5.5773F, -6.8153F, 0.9355F, -0.1078F, 0.0954F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(102, 21).mirror().addBox(-0.8673F, -0.9811F, 0.4222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5633F, -2.8333F, -4.9064F, 0.7916F, -0.1792F, 0.1967F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(102, 24).mirror().addBox(-0.1747F, -3.2725F, 0.1165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4633F, -1.1333F, -2.7064F, 0.766F, -0.3004F, 0.2809F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(100, 74).addBox(-0.6818F, -1.3702F, 3.3506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 77).addBox(-0.6818F, -1.3702F, 2.9506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 74).addBox(-0.6818F, -0.9702F, 3.3506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 77).addBox(-0.6818F, -0.9702F, 2.9506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 77).addBox(-0.6818F, -1.3702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 74).addBox(-0.6818F, -1.3702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 77).addBox(-0.6818F, -0.9702F, 3.7506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 74).addBox(-0.6818F, -0.9702F, 4.1506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, 2.5184F, 0.0696F, -0.0591F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(70, 82).addBox(-0.8503F, -0.5277F, 0.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, 2.728F, 0.0653F, -0.076F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(15, 102).addBox(-0.528F, -1.3348F, -1.126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 102).addBox(-0.528F, -1.0348F, -1.126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2681F, -5.5773F, -6.8153F, 0.4539F, 0.1011F, -0.1142F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(24, 87).addBox(-0.528F, -0.6209F, -1.0328F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2681F, -5.5773F, -6.8153F, 0.7594F, 0.1011F, -0.1142F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(20, 92).addBox(-0.168F, -1.4233F, -0.5066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5815F, -2.8333F, -4.9064F, 0.7458F, 0.1793F, -0.209F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(92, 22).addBox(-0.785F, -3.4108F, -0.9271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(92, 18).addBox(-0.785F, -3.4108F, -1.5271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4815F, -1.1333F, -2.7064F, 0.5441F, 0.3002F, -0.2936F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(28, 78).addBox(-0.785F, -1.8249F, -1.3858F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4815F, -1.1333F, -2.7064F, 0.6314F, 0.3002F, -0.2936F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.3415F, 0.7347F, -2.2936F, 0.9042F, 0.0628F, -0.0777F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(34, 91).addBox(-0.8525F, -0.5359F, -3.3919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, -0.4921F, 0.0628F, -0.0777F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(63, 82).addBox(-0.8525F, 1.8814F, -0.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, -1.8884F, 0.0628F, -0.0777F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(39, 93).addBox(-0.8525F, -0.7303F, 1.2754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, 2.9549F, 0.0628F, -0.0777F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(65, 100).addBox(-0.8525F, -1.6672F, -0.4081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, 1.6023F, 0.0628F, -0.0777F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(100, 54).addBox(-0.8525F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(79, 99).addBox(-0.8525F, -0.6206F, -0.9757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, 0.0664F, 0.0628F, -0.0777F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(100, 51).addBox(-0.8525F, -0.5914F, -0.8897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, -0.2827F, 0.0628F, -0.0777F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(102, 24).addBox(-0.8253F, -3.2725F, 0.1165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4815F, -1.1333F, -2.7064F, 0.766F, 0.3004F, -0.2809F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(102, 21).addBox(-0.1327F, -0.9811F, 0.4222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5815F, -2.8333F, -4.9064F, 0.7916F, 0.1792F, -0.1967F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(50, 104).addBox(-0.466F, 1.3989F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 102).addBox(-0.466F, 0.4989F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(102, 18).addBox(-0.466F, -0.4011F, -0.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 83).addBox(-0.466F, -1.6261F, -0.5907F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2681F, -5.5773F, -6.8153F, 0.8043F, 0.1008F, -0.102F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(102, 15).addBox(-0.4677F, -1.2669F, -0.1879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2681F, -5.5773F, -6.8153F, 0.9355F, 0.1078F, -0.0954F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(15, 92).addBox(-0.1327F, -1.4322F, 0.1608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5815F, -2.8333F, -4.9064F, 0.8789F, 0.1792F, -0.1967F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(90, 92).addBox(-0.7753F, -3.1093F, 0.0332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.4815F, -1.1333F, -2.7064F, 0.8097F, 0.3004F, -0.2809F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 92).addBox(-0.7753F, -2.0695F, 0.0895F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4815F, -1.1333F, -2.7064F, 0.8533F, 0.3004F, -0.2809F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(102, 27).addBox(-0.8714F, -4.8007F, -0.9052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 91).addBox(-0.8714F, -4.1007F, -0.9052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, 0.8177F, 0.0624F, -0.0656F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(84, 99).addBox(-0.8525F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(99, 83).addBox(-0.8525F, -0.8235F, 1.4043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, 2.4226F, 0.0628F, -0.0777F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(10, 91).addBox(-0.8525F, 0.696F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.9389F, 1.0628F, 1.1555F, -2.2025F, 0.0628F, -0.0777F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, -0.4531F, 0.0037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r430 = tail.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(70, 100).addBox(0.0F, -0.0853F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.767F, 0.8431F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r431 = tail.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(89, 99).addBox(0.0F, -0.4565F, -0.0999F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4867F, 2.8578F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r432 = tail.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(12, 107).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 89).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 2.0037F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r433 = tail.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(63, 106).addBox(0.0F, -1.2044F, 0.0292F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 0.0037F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r434 = tail.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(65, 60).mirror().addBox(-1.5015F, 0.0F, -0.9651F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 5).mirror().addBox(-1.5015F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, 0.0F, 0.07F, -0.0023F));

		PartDefinition cube_r435 = tail.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.5141F, -0.0451F, -0.0762F, -0.0584F, -0.6523F));

		PartDefinition cube_r436 = tail.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(56, 37).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -2.5141F, -0.0451F, -0.0762F, 0.0584F, 0.6523F));

		PartDefinition cube_r437 = tail.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5141F, -0.0451F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r438 = tail.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(66, 5).addBox(-0.4985F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(65, 60).addBox(-0.4985F, 0.0F, -0.9651F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, 0.0F, -0.07F, 0.0023F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(13, 45).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5438F, 4.9252F, -0.1094F, -0.1745F, 0.0038F));

		PartDefinition cube_r439 = tail7.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(25, 92).addBox(0.0F, -1.0581F, 0.0912F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r440 = tail7.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(86, 4).addBox(0.0F, -1.1054F, 0.0608F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r441 = tail7.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(73, 105).addBox(0.0F, -0.7666F, -0.1787F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5058F, 3.3969F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r442 = tail7.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(65, 78).addBox(0.0F, 0.1899F, 0.0372F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0603F, 0.2541F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r443 = tail7.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-1.5198F, 0.0F, 7.0203F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5F, -6.0F, 0.0F, 0.0525F, -0.0023F));

		PartDefinition cube_r444 = tail7.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(15, 38).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8212F, -2.4917F, 1.8684F, 0.05F, 0.0753F, 0.8863F));

		PartDefinition cube_r445 = tail7.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0452F, -0.1363F, -0.0257F, 0.0866F, 0.0107F));

		PartDefinition cube_r446 = tail7.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(15, 38).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8212F, -2.4917F, 1.8684F, 0.05F, -0.0753F, -0.8863F));

		PartDefinition cube_r447 = tail7.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -2.0452F, -0.1363F, -0.0257F, -0.0866F, -0.0107F));

		PartDefinition cube_r448 = tail7.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(26, 57).addBox(-0.5F, -0.9716F, -0.0016F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.5736F, -0.147F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r449 = tail7.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(65, 56).addBox(-0.4802F, 0.0F, 7.0203F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -6.0F, 0.0F, -0.0525F, 0.0023F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0143F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.982F, 4.7913F, -0.0386F, -0.222F, -0.0767F));

		PartDefinition cube_r450 = tail2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(106, 60).addBox(0.0F, -0.9206F, -0.0527F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0143F, 4.0362F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r451 = tail2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(9, 107).addBox(0.0F, -1.1003F, -0.0086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1143F, 2.0362F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r452 = tail2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(6, 107).addBox(0.0F, -1.3092F, -0.0816F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3143F, 0.1362F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(85, 105).addBox(0.0F, -0.3367F, -0.0865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9541F, 4.6903F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r454 = tail2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(82, 105).addBox(0.0F, -0.4261F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0541F, 2.3903F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r455 = tail2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(79, 105).addBox(0.0F, -0.4837F, 0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3217F, 0.2876F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r456 = tail2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4248F, 0.0217F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(45, 30).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(41, 45).addBox(-0.5F, -1.1731F, -0.0087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1196F, 5.9509F, -0.0536F, -0.2179F, 0.0116F));

		PartDefinition cube_r457 = tail8.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(24, 107).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 106).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0334F, 2.0524F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r458 = tail8.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(105, 93).addBox(0.0F, -0.7889F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r459 = tail8.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(76, 105).addBox(0.0F, -0.4837F, 0.0485F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9397F, 3.0541F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r460 = tail8.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(105, 74).addBox(0.0F, -0.3479F, -0.1812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8397F, 1.0541F, 0.4625F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(47, 21).addBox(-0.4968F, -0.1985F, -0.0349F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, 0.109F, 4.8057F, 0.1014F, -0.2785F, 0.0052F));

		PartDefinition cube_r461 = tail3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(3, 107).addBox(-0.0106F, 0.1907F, -0.0686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 2.6192F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r462 = tail3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(0, 107).addBox(-0.0106F, 0.2782F, -0.1654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 0.5192F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r463 = tail3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3113F, 0.0873F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r464 = tail3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(100, 106).addBox(0.0F, -1.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 0).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 0.9651F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 50).addBox(-0.4968F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1934F, 4.9757F, 0.0765F, -0.2215F, 0.0542F));

		PartDefinition cube_r465 = tail4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(107, 17).addBox(-0.0106F, 2.2907F, 3.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 14).addBox(-0.0106F, 1.0907F, 1.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0365F, -2.3135F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r466 = tail4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(93, 48).addBox(-0.5F, -0.825F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 52).addBox(-0.5F, -0.825F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0032F, -0.2168F, -0.1415F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(51, 0).addBox(-0.4968F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(52, 52).addBox(-0.4968F, -0.95F, 0.075F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0179F, -0.2181F, 0.0039F));

		PartDefinition cube_r467 = tail5.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(21, 107).addBox(-0.0106F, 5.3907F, 9.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 20).addBox(-0.0106F, 4.3907F, 7.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 107).addBox(-0.0106F, 3.1907F, 5.9314F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.164F, -7.2943F, 0.5411F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 52).addBox(-0.4968F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, -0.0327F, -0.3435F, -0.0631F));

		PartDefinition cube_r468 = tail6.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(54, 45).addBox(-0.5F, -0.125F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0032F, -1.7997F, 0.2327F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail9 = tail6.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.2007F, -0.5142F, -0.0952F));

		PartDefinition cube_r469 = tail9.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(62, 12).addBox(-0.4968F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.2182F, 0.0F, 0.0F));

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