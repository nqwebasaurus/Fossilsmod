package fossils.fossils.client.blockentity.model.ichthyostega;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyostegaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart bodyfront;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart handL;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart handL2;
	private final ModelPart bodyfront2;
	private final ModelPart head;
	private final ModelPart upperjaw1;
	private final ModelPart snout;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bodyrear;
	private final ModelPart tailbase;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart footL;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart footL2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart bone;
	private final ModelPart bone4;

	public IchthyostegaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body = this.root.getChild("body");
		this.bodyfront = this.body.getChild("bodyfront");
		this.armL = this.bodyfront.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.handL = this.armL2.getChild("handL");
		this.armL3 = this.bodyfront.getChild("armL3");
		this.armL4 = this.armL3.getChild("armL4");
		this.handL2 = this.armL4.getChild("handL2");
		this.bodyfront2 = this.bodyfront.getChild("bodyfront2");
		this.head = this.bodyfront2.getChild("head");
		this.upperjaw1 = this.head.getChild("upperjaw1");
		this.snout = this.upperjaw1.getChild("snout");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw1 = this.head.getChild("lowerjaw1");
		this.bone2 = this.bodyfront.getChild("bone2");
		this.bone3 = this.bodyfront.getChild("bone3");
		this.bodyrear = this.body.getChild("bodyrear");
		this.tailbase = this.bodyrear.getChild("tailbase");
		this.legL = this.tailbase.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.footL = this.legL2.getChild("footL");
		this.legL3 = this.tailbase.getChild("legL3");
		this.legL4 = this.legL3.getChild("legL4");
		this.footL2 = this.legL4.getChild("footL2");
		this.tail1 = this.tailbase.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail = this.tail2.getChild("tail");
		this.tail3 = this.tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.bone = this.tailbase.getChild("bone");
		this.bone4 = this.tailbase.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -5.2F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -1.05F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(50, 76).addBox(0.0F, -3.05F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(53, 76).addBox(0.0F, -1.8F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.05F, 1.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(26, 76).addBox(0.0F, -1.8F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.05F, -3.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-3.5517F, -2.2637F, -0.7702F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.8078F, 0.8877F, 0.3216F, 0.8466F, -1.2592F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 60).mirror().addBox(-3.3814F, -0.4498F, -0.7702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.8078F, 0.8877F, 0.7559F, 0.5281F, -0.5979F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-1.442F, 0.1761F, -0.7702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.8078F, 0.8877F, 0.8732F, 0.2078F, -0.2782F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-4.9463F, -2.6426F, -0.6413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0258F, -0.7953F, -1.2703F, 0.619F, 0.9808F, -1.0837F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 34).mirror().addBox(-5.4175F, -2.6426F, 1.0942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0258F, -0.7953F, -1.2703F, 0.4211F, 0.6603F, -1.3501F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 29).mirror().addBox(-5.7493F, -2.7019F, -0.6313F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0258F, -0.7953F, -1.2703F, 0.3894F, 0.8679F, -1.211F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-3.7902F, -0.7026F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0258F, -0.7953F, -1.2703F, 0.8115F, 0.5182F, -0.5731F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 62).mirror().addBox(-1.9193F, 0.1198F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0258F, -0.7953F, -1.2703F, 0.9169F, 0.1836F, -0.2727F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 32).mirror().addBox(-1.9194F, 0.1198F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, -0.6953F, -3.0703F, 0.8293F, 0.2317F, -0.2848F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-3.7902F, -0.7025F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, -0.6953F, -3.0703F, 0.6997F, 0.5369F, -0.6234F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-7.7493F, -2.7019F, -0.6313F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, -0.6953F, -3.0703F, 0.257F, 0.8234F, -1.3041F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 60).mirror().addBox(-6.6957F, -2.7098F, 0.2276F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, -0.6953F, -3.0703F, 0.2609F, 0.7583F, -1.3412F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 30).mirror().addBox(-4.8954F, -2.7098F, -1.55F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, -0.6953F, -3.0703F, 0.4299F, 1.1048F, -1.134F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-6.479F, -2.7745F, 3.0518F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5258F, -0.6953F, -3.0703F, 0.2008F, 0.324F, -1.4753F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 62).addBox(-0.558F, 0.1761F, -0.7702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.8078F, 0.8877F, 0.8732F, -0.2078F, 0.2782F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(38, 60).addBox(1.3814F, -0.4498F, -0.7702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.8078F, 0.8877F, 0.7559F, -0.5281F, 0.5979F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(77, 30).addBox(2.5517F, -2.2637F, -0.7702F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.8078F, 0.8877F, 0.3216F, -0.8466F, 1.2592F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 62).addBox(-0.0806F, 0.1198F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0258F, -0.7953F, -1.2703F, 0.9169F, -0.1836F, 0.2727F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(58, 26).addBox(1.7902F, -0.7026F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0258F, -0.7953F, -1.2703F, 0.8115F, -0.5182F, 0.5731F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(44, 29).addBox(2.7493F, -2.7019F, -0.6313F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0258F, -0.7953F, -1.2703F, 0.3894F, -0.8679F, 1.211F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(78, 34).addBox(4.4175F, -2.6426F, 1.0942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0258F, -0.7953F, -1.2703F, 0.4211F, -0.6603F, 1.3501F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 5).addBox(2.9463F, -2.6426F, -0.6413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0258F, -0.7953F, -1.2703F, 0.619F, -0.9808F, 1.0837F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(76, 15).addBox(5.479F, -2.7745F, 3.0518F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5258F, -0.6953F, -3.0703F, 0.2008F, -0.324F, 1.4753F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 30).addBox(2.8954F, -2.7098F, -1.55F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5258F, -0.6953F, -3.0703F, 0.4299F, -1.1048F, 1.134F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 60).addBox(4.6957F, -2.7098F, 0.2276F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5258F, -0.6953F, -3.0703F, 0.2609F, -0.7583F, 1.3412F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(34, 0).addBox(2.7493F, -2.7019F, -0.6313F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5258F, -0.6953F, -3.0703F, 0.257F, -0.8234F, 1.3041F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 16).addBox(1.7902F, -0.7025F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5258F, -0.6953F, -3.0703F, 0.6997F, -0.5369F, 0.6234F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(60, 32).addBox(-0.0806F, 0.1198F, -0.6313F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5258F, -0.6953F, -3.0703F, 0.8293F, -0.2317F, 0.2848F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6869F, -3.5497F, 0.0524F, 0.0436F, 0.0023F));

		PartDefinition cube_r29 = bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(59, 3).mirror().addBox(-3.7336F, -0.7871F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1408F, -1.5209F, 0.5148F, 0.5295F, -0.6524F));

		PartDefinition cube_r30 = bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(-7.6551F, -2.7403F, -0.5191F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1408F, -1.5209F, 0.0926F, 0.716F, -1.3536F));

		PartDefinition cube_r31 = bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(-6.5936F, -2.7441F, 0.3341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1408F, -1.5209F, 0.1102F, 0.6476F, -1.3736F));

		PartDefinition cube_r32 = bodyfront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(59, 14).mirror().addBox(-4.8383F, -2.7441F, -1.414F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1408F, -1.5209F, 0.1659F, 1.0108F, -1.2994F));

		PartDefinition cube_r33 = bodyfront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(-6.3403F, -2.8063F, 3.1037F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1408F, -1.5209F, 0.0937F, 0.2026F, -1.438F));

		PartDefinition cube_r34 = bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 28).mirror().addBox(-1.9038F, 0.0193F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1408F, -1.5209F, 0.6728F, 0.282F, -0.2594F));

		PartDefinition cube_r35 = bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 64).mirror().addBox(-5.6943F, -2.7441F, 3.8777F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1408F, -3.7209F, 0.21F, 0.1938F, -1.4878F));

		PartDefinition cube_r36 = bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(58, 24).mirror().addBox(-4.8383F, -2.7441F, -1.214F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1408F, -3.7209F, 0.4644F, 1.0965F, -1.1096F));

		PartDefinition cube_r37 = bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-6.5936F, -2.7441F, 0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1408F, -3.7209F, 0.2843F, 0.7535F, -1.3315F));

		PartDefinition cube_r38 = bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(19, 15).mirror().addBox(-7.6551F, -2.7403F, -0.5191F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1408F, -3.7209F, 0.2818F, 0.818F, -1.2924F));

		PartDefinition cube_r39 = bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(38, 58).mirror().addBox(-3.7336F, -0.7871F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1408F, -3.7209F, 0.7111F, 0.5221F, -0.624F));

		PartDefinition cube_r40 = bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(29, 62).mirror().addBox(-1.9038F, 0.0193F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1408F, -3.7209F, 0.8337F, 0.2146F, -0.2901F));

		PartDefinition cube_r41 = bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(60, 28).addBox(-0.0962F, 0.0193F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1408F, -1.5209F, 0.6728F, -0.282F, 0.2594F));

		PartDefinition cube_r42 = bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(74, 76).addBox(5.3403F, -2.8063F, 3.1037F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1408F, -1.5209F, 0.0937F, -0.2026F, 1.438F));

		PartDefinition cube_r43 = bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(59, 14).addBox(2.8383F, -2.7441F, -1.414F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1408F, -1.5209F, 0.1659F, -1.0108F, 1.2994F));

		PartDefinition cube_r44 = bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 62).addBox(4.5936F, -2.7441F, 0.3341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1408F, -1.5209F, 0.1102F, -0.6476F, 1.3736F));

		PartDefinition cube_r45 = bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(31, 33).addBox(2.6551F, -2.7403F, -0.5191F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1408F, -1.5209F, 0.0926F, -0.716F, 1.3536F));

		PartDefinition cube_r46 = bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(59, 3).addBox(1.7336F, -0.7871F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1408F, -1.5209F, 0.5148F, -0.5295F, 0.6524F));

		PartDefinition cube_r47 = bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(29, 62).addBox(-0.0962F, 0.0193F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1408F, -3.7209F, 0.8337F, -0.2146F, 0.2901F));

		PartDefinition cube_r48 = bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(38, 58).addBox(1.7336F, -0.7871F, -0.5191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1408F, -3.7209F, 0.7111F, -0.5221F, 0.624F));

		PartDefinition cube_r49 = bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(58, 24).addBox(2.8383F, -2.7441F, -1.214F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1408F, -3.7209F, 0.4644F, -1.0965F, 1.1096F));

		PartDefinition cube_r50 = bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 64).addBox(4.6943F, -2.7441F, 3.8777F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1408F, -3.7209F, 0.21F, -0.1938F, 1.4878F));

		PartDefinition cube_r51 = bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(17, 60).addBox(4.5936F, -2.7441F, 0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1408F, -3.7209F, 0.2843F, -0.7535F, 1.3315F));

		PartDefinition cube_r52 = bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(19, 15).addBox(2.6551F, -2.7403F, -0.5191F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1408F, -3.7209F, 0.2818F, -0.818F, 1.2924F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.95F, -2.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 5.6099F, -6.0979F, -0.1571F, 0.0F, 0.0F));

		PartDefinition bodyfront_r2 = bodyfront.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.5F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.35F, -4.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_r1 = bodyfront.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(40, 78).addBox(0.0F, -1.54F, 0.0234F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2449F, -2.0223F, -0.2269F, 0.0F, 0.0F));

		PartDefinition neck_r2 = bodyfront.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(15, 78).addBox(0.0F, -1.24F, 0.0235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2449F, -3.9224F, -0.1222F, 0.0F, 0.0F));

		PartDefinition armL = bodyfront.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(35, 55).addBox(0.0F, -0.8341F, -0.4358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5576F, 4.8031F, -4.8017F, -0.3316F, -0.916F, 0.8647F));

		PartDefinition rightarm5_r1 = armL.addOrReplaceChild("rightarm5_r1", CubeListBuilder.create().texOffs(27, 64).addBox(-0.175F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0167F, -0.3341F, 0.4429F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightarm5_r2 = armL.addOrReplaceChild("rightarm5_r2", CubeListBuilder.create().texOffs(0, 64).addBox(-0.225F, -0.5F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(63, 55).addBox(-0.225F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6436F, -0.3341F, 0.62F, 0.0F, -1.3526F, 0.0F));

		PartDefinition rightarm3_r1 = armL.addOrReplaceChild("rightarm3_r1", CubeListBuilder.create().texOffs(30, 69).addBox(0.35F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3341F, 0.0642F, 0.0F, -0.7418F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(52, 18).addBox(-0.0927F, -0.7589F, 0.177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 46).addBox(1.6073F, -0.7589F, 0.177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 32).addBox(-0.0927F, -0.7589F, 0.377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, -0.2182F, 1.0036F, 0.1309F));

		PartDefinition rightarm5_r3 = armL2.addOrReplaceChild("rightarm5_r3", CubeListBuilder.create().texOffs(68, 52).addBox(-0.1F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7276F, -0.25F, -0.9202F, 0.0F, -0.3142F, 0.0F));

		PartDefinition rightarm5_r4 = armL2.addOrReplaceChild("rightarm5_r4", CubeListBuilder.create().texOffs(68, 55).addBox(-0.15F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0F, -0.25F, -0.4F, 0.0F, 0.0698F, 0.0F));

		PartDefinition rightarm5_r5 = armL2.addOrReplaceChild("rightarm5_r5", CubeListBuilder.create().texOffs(68, 67).addBox(-0.875F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.25F, -0.4F, 0.0F, -0.5847F, 0.0F));

		PartDefinition rightarm4_r1 = armL2.addOrReplaceChild("rightarm4_r1", CubeListBuilder.create().texOffs(25, 67).addBox(-0.8F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.0F, -0.25F, -0.4F, 0.0F, 0.3752F, 0.0F));

		PartDefinition handL = armL2.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3636F, -0.0764F, 0.5749F, 0.5104F, 0.3558F, -0.4522F));

		PartDefinition rightfrontfin_r1 = handL.addOrReplaceChild("rightfrontfin_r1", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4293F, 0.0F, 1.5905F, 0.0F, -1.5795F, 0.0F));

		PartDefinition rightfrontfin_r2 = handL.addOrReplaceChild("rightfrontfin_r2", CubeListBuilder.create().texOffs(53, 43).addBox(-1.4F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0702F, 0.0F, 1.8561F, 0.0F, -1.2741F, 0.0F));

		PartDefinition rightfrontfin_r3 = handL.addOrReplaceChild("rightfrontfin_r3", CubeListBuilder.create().texOffs(28, 55).addBox(-1.1F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9546F, 0.0F, 1.1944F, 0.0F, -0.9687F, 0.0F));

		PartDefinition rightfrontfin_r4 = handL.addOrReplaceChild("rightfrontfin_r4", CubeListBuilder.create().texOffs(21, 55).addBox(-0.4101F, -0.5F, -0.4934F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.0F, 0.35F, 0.0F, -0.5847F, 0.0F));

		PartDefinition rightfrontfin_r5 = handL.addOrReplaceChild("rightfrontfin_r5", CubeListBuilder.create().texOffs(53, 29).addBox(-0.3279F, -0.5F, -1.0442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.0F, 0.35F, 0.0F, -0.2443F, 0.0F));

		PartDefinition rightfrontfin_r6 = handL.addOrReplaceChild("rightfrontfin_r6", CubeListBuilder.create().texOffs(56, 49).addBox(-0.1928F, -0.5F, -1.5643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.0F, 0.35F, 0.0F, -0.0175F, 0.0F));

		PartDefinition rightfrontfin_r7 = handL.addOrReplaceChild("rightfrontfin_r7", CubeListBuilder.create().texOffs(49, 55).addBox(0.1368F, -0.5F, -1.9082F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.0F, 0.35F, 0.0F, 0.4014F, 0.0F));

		PartDefinition armL3 = bodyfront.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(-2.0F, -0.8341F, -0.4358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5576F, 4.8031F, -4.8017F, -0.2006F, -0.0175F, -0.8172F));

		PartDefinition leftarm6_r1 = armL3.addOrReplaceChild("leftarm6_r1", CubeListBuilder.create().texOffs(27, 64).mirror().addBox(-0.825F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0167F, -0.3341F, 0.4429F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftarm6_r2 = armL3.addOrReplaceChild("leftarm6_r2", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.775F, -0.5F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(63, 55).mirror().addBox(-0.775F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6436F, -0.3341F, 0.62F, 0.0F, 1.3526F, 0.0F));

		PartDefinition leftarm4_r1 = armL3.addOrReplaceChild("leftarm4_r1", CubeListBuilder.create().texOffs(30, 69).mirror().addBox(-1.35F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3341F, 0.0642F, 0.0F, 0.7418F, 0.0F));

		PartDefinition armL4 = armL3.addOrReplaceChild("armL4", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-1.9073F, -0.7589F, 0.177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 46).mirror().addBox(-2.6072F, -0.7589F, 0.177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 32).mirror().addBox(-1.9073F, -0.7589F, 0.377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 1.0427F, -0.8163F, -0.7156F));

		PartDefinition leftarm6_r3 = armL4.addOrReplaceChild("leftarm6_r3", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-0.9F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7276F, -0.25F, -0.9202F, 0.0F, 0.3142F, 0.0F));

		PartDefinition leftarm6_r4 = armL4.addOrReplaceChild("leftarm6_r4", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-0.85F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.25F, -0.4F, 0.0F, -0.0698F, 0.0F));

		PartDefinition leftarm6_r5 = armL4.addOrReplaceChild("leftarm6_r5", CubeListBuilder.create().texOffs(68, 67).mirror().addBox(-0.125F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.25F, -0.4F, 0.0F, 0.5847F, 0.0F));

		PartDefinition leftarm5_r1 = armL4.addOrReplaceChild("leftarm5_r1", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(-0.2F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.25F, -0.4F, 0.0F, -0.3752F, 0.0F));

		PartDefinition handL2 = armL4.addOrReplaceChild("handL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3636F, -0.0764F, 0.5749F, 0.5104F, -0.3558F, 0.4522F));

		PartDefinition leftfrontfin_r1 = handL2.addOrReplaceChild("leftfrontfin_r1", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4293F, 0.0F, 1.5905F, 0.0F, 1.5795F, 0.0F));

		PartDefinition leftfrontfin_r2 = handL2.addOrReplaceChild("leftfrontfin_r2", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-0.6F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0702F, 0.0F, 1.8561F, 0.0F, 1.2741F, 0.0F));

		PartDefinition leftfrontfin_r3 = handL2.addOrReplaceChild("leftfrontfin_r3", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.9F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9546F, 0.0F, 1.1944F, 0.0F, 0.9687F, 0.0F));

		PartDefinition leftfrontfin_r4 = handL2.addOrReplaceChild("leftfrontfin_r4", CubeListBuilder.create().texOffs(21, 55).mirror().addBox(-1.5899F, -0.5F, -0.4934F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.35F, 0.0F, 0.5847F, 0.0F));

		PartDefinition leftfrontfin_r5 = handL2.addOrReplaceChild("leftfrontfin_r5", CubeListBuilder.create().texOffs(53, 29).mirror().addBox(-1.6721F, -0.5F, -1.0442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.35F, 0.0F, 0.2443F, 0.0F));

		PartDefinition leftfrontfin_r6 = handL2.addOrReplaceChild("leftfrontfin_r6", CubeListBuilder.create().texOffs(56, 49).mirror().addBox(-1.8072F, -0.5F, -1.5643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.35F, 0.0F, 0.0175F, 0.0F));

		PartDefinition leftfrontfin_r7 = handL2.addOrReplaceChild("leftfrontfin_r7", CubeListBuilder.create().texOffs(49, 55).mirror().addBox(-2.1368F, -0.5F, -1.9082F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0F, 0.35F, 0.0F, -0.4014F, 0.0F));

		PartDefinition bodyfront2 = bodyfront.addOrReplaceChild("bodyfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -4.9F, 0.1695F, -0.1689F, -0.0441F));

		PartDefinition neck_r3 = bodyfront2.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(32, 78).addBox(0.0F, -1.6768F, 1.7997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 78).addBox(0.0F, -1.1626F, -0.1063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6449F, -2.7224F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bodyfront2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-1.342F, 0.2253F, -0.5639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.5592F, -2.7209F, 0.549F, 0.3449F, -0.4861F));

		PartDefinition cube_r54 = bodyfront2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 58).mirror().addBox(-3.3115F, -0.363F, -0.5639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.5592F, -2.7209F, 0.36F, 0.5398F, -0.9198F));

		PartDefinition cube_r55 = bodyfront2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(35, 31).mirror().addBox(-6.5424F, -2.1527F, -0.5639F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0592F, -0.7209F, 0.1045F, 0.6242F, -1.418F));

		PartDefinition cube_r56 = bodyfront2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-6.4899F, -2.1573F, 0.114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0592F, -0.7209F, 0.1237F, 0.5559F, -1.4377F));

		PartDefinition cube_r57 = bodyfront2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-4.7814F, -2.1573F, -0.9758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0592F, -0.7209F, 0.1494F, 0.7894F, -1.3968F));

		PartDefinition cube_r58 = bodyfront2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-3.3115F, -0.3629F, -0.5639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0592F, -0.7209F, 0.4572F, 0.4524F, -0.7513F));

		PartDefinition cube_r59 = bodyfront2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(77, 32).mirror().addBox(-1.342F, 0.2253F, -0.5639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0592F, -0.7209F, 0.5936F, 0.2305F, -0.3512F));

		PartDefinition cube_r60 = bodyfront2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 58).addBox(1.3115F, -0.363F, -0.5639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.5592F, -2.7209F, 0.36F, -0.5398F, 0.9198F));

		PartDefinition cube_r61 = bodyfront2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(10, 78).addBox(0.342F, 0.2253F, -0.5639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.5592F, -2.7209F, 0.549F, -0.3449F, 0.4861F));

		PartDefinition cube_r62 = bodyfront2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(77, 32).addBox(0.342F, 0.2253F, -0.5639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0592F, -0.7209F, 0.5936F, -0.2305F, 0.3512F));

		PartDefinition cube_r63 = bodyfront2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(45, 58).addBox(1.3115F, -0.3629F, -0.5639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0592F, -0.7209F, 0.4572F, -0.4524F, 0.7513F));

		PartDefinition cube_r64 = bodyfront2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(21, 58).addBox(2.7814F, -2.1573F, -0.9758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0592F, -0.7209F, 0.1494F, -0.7894F, 1.3968F));

		PartDefinition cube_r65 = bodyfront2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 58).addBox(4.4899F, -2.1573F, 0.114F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0592F, -0.7209F, 0.1237F, -0.5559F, 1.4377F));

		PartDefinition cube_r66 = bodyfront2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(35, 31).addBox(2.5424F, -2.1527F, -0.5639F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0592F, -0.7209F, 0.1045F, -0.6242F, 1.418F));

		PartDefinition neck_r4 = bodyfront2.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(32, 8).addBox(-0.5F, -0.0551F, -1.0777F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6449F, -2.7224F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head = bodyfront2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6928F, -2.5848F, -0.3814F, -0.2438F, -0.0273F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(64, 37).addBox(-0.5F, -0.85F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6966F, -9.0942F, -0.0785F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(58, 67).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.4982F, -7.9396F, 0.2793F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(69, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.8237F, -6.9941F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -0.6F, -2.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.0F, 0.5107F, -6.146F, -0.0611F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(7, 56).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.0657F, -6.0238F, 0.2443F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.2393F, -5.039F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(46, 64).addBox(-1.0F, -0.275F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 47).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.3091F, -4.0414F, 0.0698F, 0.0F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(49, 47).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.2916F, -3.0416F, -0.0175F, 0.0F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(35, 26).addBox(-0.5F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.1521F, -1.0464F, -0.0698F, 0.0F, 0.0F));

		PartDefinition upperjaw1 = head.addOrReplaceChild("upperjaw1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9744F, -4.6638F));

		PartDefinition snout = upperjaw1.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 0.4F, 0.1852F, 0.0F, -0.0035F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.625F, -0.9363F));

		PartDefinition head_r10 = leftFace.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(56, 46).addBox(-1.1199F, -0.7708F, 1.3957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0167F))
				.texOffs(50, 10).addBox(-0.1199F, -0.7708F, 1.3957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5061F, -0.0336F, -2.6339F, -0.0873F, 0.0435F, -0.1347F));

		PartDefinition head_r11 = leftFace.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(0, 39).addBox(-2.1F, -0.5F, -2.15F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3536F, 0.9681F, -6.3114F, -0.0698F, 0.5051F, -0.0338F));

		PartDefinition head_r12 = leftFace.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(0, 18).addBox(-1.3F, -0.85F, -2.6F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.5F, 1.1275F, -3.7065F, 0.079F, 0.2571F, 0.5258F));

		PartDefinition head_r13 = leftFace.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(0, 18).addBox(-0.6F, -0.5F, -2.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.5F, 1.1275F, -3.7065F, -0.0632F, 0.2613F, -0.0164F));

		PartDefinition head_r14 = leftFace.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(56, 35).addBox(-1.3453F, -0.7172F, -0.3083F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5061F, -0.0336F, -2.6339F, -0.0181F, 0.2618F, -0.1356F));

		PartDefinition head_r15 = leftFace.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(0, 43).addBox(-1.3328F, -0.0566F, -2.1062F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.386F, -0.7154F, -2.7779F, 0.143F, 0.3047F, -0.1089F));

		PartDefinition head_r16 = leftFace.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5378F, -1.3845F, 0.4517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 73).addBox(-0.5378F, -0.7845F, 0.4517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(3.0967F, 2.2014F, -0.2181F, 0.1242F, -0.523F, -0.1843F));

		PartDefinition head_r17 = leftFace.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(40, 73).addBox(-0.8315F, -1.5401F, -0.208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(20, 73).addBox(-0.8315F, -0.8901F, -0.208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0967F, 2.2014F, -0.2181F, -0.0436F, -0.0174F, -0.2087F));

		PartDefinition head_r18 = leftFace.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(53, 70).addBox(-0.5F, -0.45F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.3008F, 0.8751F, 0.2333F, 0.2969F, -0.0851F, -0.7647F));

		PartDefinition head_r19 = leftFace.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(70, 43).addBox(-0.85F, -0.825F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 70).addBox(-0.85F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.7747F, 0.776F, -0.4622F, -0.0958F, -0.0851F, -0.7647F));

		PartDefinition head_r20 = leftFace.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(68, 46).addBox(-0.5F, -0.53F, -0.189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.9658F, 0.5489F, -0.0034F, -0.6138F, -0.0436F, -0.7395F));

		PartDefinition head_r21 = leftFace.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(48, 70).addBox(-0.5F, -0.53F, -0.811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.9658F, 0.5489F, -0.0034F, -0.4218F, -0.0436F, -0.7395F));

		PartDefinition head_r22 = leftFace.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(73, 34).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5339F, 1.2254F, -0.5187F, -0.1249F, -0.0281F, -0.2609F));

		PartDefinition head_r23 = leftFace.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(5, 73).addBox(-0.8555F, -0.8846F, -0.2133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(3.1574F, 2.1417F, -0.8849F, -0.0376F, -0.0281F, -0.2609F));

		PartDefinition head_r24 = leftFace.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(52, 14).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3414F, -0.1297F, -1.1549F, -0.0031F, 0.1978F, 0.7584F));

		PartDefinition head_r25 = leftFace.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(31, 35).addBox(-1.8364F, -0.1511F, -0.3038F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.5453F, 0.5269F, -2.1972F, -0.0032F, 0.2415F, 0.7583F));

		PartDefinition head_r26 = leftFace.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(32, 43).addBox(-0.8364F, -1.4511F, -0.3038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 43).addBox(-0.8364F, -0.7761F, -0.2538F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.8333F, 1.7631F, -2.478F, -0.2194F, 0.1257F, -0.2568F));

		PartDefinition head_r27 = leftFace.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(20, 67).addBox(-0.275F, -0.125F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3749F, -7.8684F, 0.3882F, -0.3741F, 0.1876F));

		PartDefinition head_r28 = leftFace.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(0, 67).addBox(-0.35F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.3749F, -7.8684F, 0.4887F, 0.0F, 0.0F));

		PartDefinition head_r29 = leftFace.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(15, 69).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1014F, 0.7584F, -3.3519F, -0.1499F, 0.1653F, -0.2154F));

		PartDefinition head_r30 = leftFace.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(46, 31).addBox(-0.9F, -2.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 43).addBox(-0.9F, -1.85F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.5459F, 0.3339F, -2.6362F, -0.0914F, 0.1927F, -0.9442F));

		PartDefinition head_r31 = leftFace.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(45, 60).addBox(-0.95F, -1.825F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5459F, 0.3339F, -2.6362F, -0.2017F, 0.0244F, -0.8644F));

		PartDefinition head_r32 = leftFace.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(46, 43).addBox(-0.875F, -0.85F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5459F, 0.3339F, -2.6362F, -0.1019F, 0.1642F, -1.0126F));

		PartDefinition head_r33 = leftFace.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(21, 47).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.1014F, 0.7584F, -3.3519F, 0.0246F, 0.1653F, -0.2154F));

		PartDefinition head_r34 = leftFace.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(43, 21).addBox(-0.844F, -0.8579F, -0.1521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5075F, 1.6412F, -4.1962F, -0.1499F, 0.1653F, -0.2154F));

		PartDefinition head_r35 = leftFace.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(45, 39).addBox(-1.7745F, -0.175F, 0.1113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8262F, 0.5309F, -5.732F, 0.173F, -0.0462F, 0.4711F));

		PartDefinition head_r36 = leftFace.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(74, 58).addBox(-0.2621F, -0.4958F, -0.807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0084F, 0.0618F, -4.2804F, 1.6668F, 1.2921F, 2.1982F));

		PartDefinition head_r37 = leftFace.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(74, 18).addBox(-0.7852F, -0.1431F, -0.6239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0084F, -0.3132F, -4.4304F, 2.7273F, 1.0284F, -2.9403F));

		PartDefinition head_r38 = leftFace.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(75, 73).addBox(-0.9396F, -0.1431F, -0.0231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(75, 40).addBox(-0.9396F, -0.1431F, -0.2231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0084F, -0.3132F, -4.4304F, 1.2823F, 1.3523F, 1.8371F));

		PartDefinition head_r39 = leftFace.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(74, 37).addBox(-0.6636F, -0.1431F, 0.0977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0084F, -0.3132F, -4.4304F, 0.5871F, 1.1864F, 1.1142F));

		PartDefinition head_r40 = leftFace.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(35, 75).addBox(-0.2821F, -0.1431F, -0.0696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0084F, -0.3132F, -4.4304F, 0.2987F, 0.7869F, 0.7762F));

		PartDefinition head_r41 = leftFace.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(68, 49).addBox(-0.3877F, -0.4958F, -0.9528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0084F, 0.0618F, -4.2804F, 0.3407F, 0.6102F, 0.728F));

		PartDefinition head_r42 = leftFace.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(18, 39).addBox(-1.825F, -0.175F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.8262F, 0.5309F, -5.732F, 0.1762F, 0.1945F, 0.5136F));

		PartDefinition head_r43 = leftFace.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(44, 25).addBox(-0.825F, -1.175F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0675F, 1.5124F, -5.7332F, -0.0012F, 0.2347F, -0.1928F));

		PartDefinition head_r44 = leftFace.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(39, 43).addBox(-0.825F, -0.85F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.0675F, 1.5124F, -5.7332F, -0.1408F, 0.2347F, -0.1928F));

		PartDefinition head_r45 = leftFace.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(35, 51).addBox(1.0396F, -0.3247F, -1.0348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0283F, -0.1124F, -6.3241F, 0.3107F, 0.1221F, 0.5079F));

		PartDefinition head_r46 = leftFace.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(49, 51).addBox(0.3543F, -0.1613F, -1.0331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0283F, -0.1124F, -6.3241F, 0.2909F, 0.1636F, 0.3784F));

		PartDefinition head_r47 = leftFace.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(65, 40).addBox(-0.8057F, -0.6591F, -2.1141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0283F, -0.1124F, -6.3241F, 0.8033F, 0.3F, -1.194F));

		PartDefinition head_r48 = leftFace.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(56, 64).addBox(-0.1438F, -0.1793F, -1.8911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0283F, -0.1124F, -6.3241F, 0.3055F, -0.0875F, 0.3038F));

		PartDefinition head_r49 = leftFace.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(21, 51).addBox(-0.1438F, -0.1613F, -1.1919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.0283F, -0.1124F, -6.3241F, 0.288F, -0.0875F, 0.3038F));

		PartDefinition head_r50 = leftFace.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(52, 4).addBox(-0.825F, -0.85F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.5421F, 1.3855F, -7.345F, 0.0602F, 0.2963F, -0.1892F));

		PartDefinition head_r51 = leftFace.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(75, 27).addBox(-0.5F, -0.338F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(75, 24).addBox(-0.5F, -0.263F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 63).addBox(-0.5F, -1.163F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9819F, 1.6337F, -4.291F, -0.0684F, 0.1735F, -0.0326F));

		PartDefinition head_r52 = leftFace.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(12, 59).addBox(-0.5F, -1.15F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(57, 60).addBox(-0.5F, -1.05F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(7, 59).addBox(-0.5F, -0.95F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(70, 73).addBox(-0.5F, -0.35F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.4936F, 1.4517F, -5.8051F, -0.1103F, 0.3047F, -0.1167F));

		PartDefinition head_r53 = leftFace.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(69, 19).addBox(-0.5F, -0.25F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3489F, 1.3715F, -7.7876F, -0.5379F, 0.9793F, -0.4985F));

		PartDefinition head_r54 = leftFace.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, -1.05F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3489F, 1.3715F, -7.7876F, -0.4507F, 0.9793F, -0.4985F));

		PartDefinition head_r55 = leftFace.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(42, 51).addBox(-0.825F, -0.85F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5421F, 1.3855F, -7.345F, -0.1318F, 0.2963F, -0.1892F));

		PartDefinition head_r56 = leftFace.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(5, 67).addBox(-0.825F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0948F, 1.3335F, -8.0062F, -0.1746F, 0.5749F, -0.1979F));

		PartDefinition head_r57 = leftFace.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(10, 69).addBox(-0.825F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5011F, 1.3044F, -8.376F, -0.4012F, 0.9596F, -0.4289F));

		PartDefinition head_r58 = leftFace.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(41, 64).addBox(-0.825F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.175F, 1.2902F, -8.5566F, -0.724F, 1.2192F, -0.7344F));

		PartDefinition head_r59 = leftFace.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(14, 56).addBox(-1.2433F, -0.7432F, 0.582F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5061F, -0.0336F, -2.6339F, -0.0703F, 0.1219F, -0.1395F));

		PartDefinition head_r60 = leftFace.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(68, 34).addBox(-2.172F, -0.7708F, 1.5819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5061F, -0.0336F, -2.6339F, -0.1137F, 0.6949F, -0.2039F));

		PartDefinition head_r61 = leftFace.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(63, 67).addBox(-2.4326F, -0.7708F, 0.7966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5061F, -0.0336F, -2.6339F, -0.1353F, 0.8681F, -0.2344F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.625F, -0.9363F));

		PartDefinition head_r62 = rightFace.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-0.8801F, -0.7708F, 1.3957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0167F)).mirror(false)
				.texOffs(50, 10).mirror().addBox(-0.8801F, -0.7708F, 1.3957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5061F, -0.0336F, -2.6339F, -0.0873F, -0.0435F, 0.1347F));

		PartDefinition head_r63 = rightFace.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(0.1F, -0.5F, -2.15F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3536F, 0.9681F, -6.3114F, -0.0698F, -0.5051F, 0.0338F));

		PartDefinition head_r64 = rightFace.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.7F, -0.85F, -2.6F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1275F, -3.7065F, 0.079F, -0.2571F, -0.5258F));

		PartDefinition head_r65 = rightFace.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.4F, -0.5F, -2.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1275F, -3.7065F, -0.0632F, -0.2613F, 0.0164F));

		PartDefinition head_r66 = rightFace.addOrReplaceChild("head_r66", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(-0.6547F, -0.7172F, -0.3083F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5061F, -0.0336F, -2.6339F, -0.0181F, -0.2618F, 0.1356F));

		PartDefinition head_r67 = rightFace.addOrReplaceChild("head_r67", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.6672F, -0.0566F, -2.1062F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.386F, -0.7154F, -2.7779F, 0.143F, -0.3047F, 0.1089F));

		PartDefinition head_r68 = rightFace.addOrReplaceChild("head_r68", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-0.4622F, -1.3845F, 0.4517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 73).mirror().addBox(-0.4622F, -0.7845F, 0.4517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-3.0967F, 2.2014F, -0.2181F, 0.1242F, 0.523F, 0.1843F));

		PartDefinition head_r69 = rightFace.addOrReplaceChild("head_r69", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.1685F, -1.5401F, -0.208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(20, 73).mirror().addBox(-0.1685F, -0.8901F, -0.208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.0967F, 2.2014F, -0.2181F, -0.0436F, 0.0174F, 0.2087F));

		PartDefinition head_r70 = rightFace.addOrReplaceChild("head_r70", CubeListBuilder.create().texOffs(53, 70).mirror().addBox(-0.5F, -0.45F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.3008F, 0.8751F, 0.2333F, 0.2969F, 0.0851F, 0.7647F));

		PartDefinition head_r71 = rightFace.addOrReplaceChild("head_r71", CubeListBuilder.create().texOffs(70, 43).mirror().addBox(-0.15F, -0.825F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(43, 70).mirror().addBox(-0.15F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.7747F, 0.776F, -0.4622F, -0.0958F, 0.0851F, 0.7647F));

		PartDefinition head_r72 = rightFace.addOrReplaceChild("head_r72", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-0.5F, -0.53F, -0.189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.9658F, 0.5489F, -0.0034F, -0.6138F, 0.0436F, 0.7395F));

		PartDefinition head_r73 = rightFace.addOrReplaceChild("head_r73", CubeListBuilder.create().texOffs(48, 70).mirror().addBox(-0.5F, -0.53F, -0.811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.9658F, 0.5489F, -0.0034F, -0.4218F, 0.0436F, 0.7395F));

		PartDefinition head_r74 = rightFace.addOrReplaceChild("head_r74", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.5339F, 1.2254F, -0.5187F, -0.1249F, 0.0281F, 0.2609F));

		PartDefinition head_r75 = rightFace.addOrReplaceChild("head_r75", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.1445F, -0.8846F, -0.2133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-3.1574F, 2.1417F, -0.8849F, -0.0376F, 0.0281F, 0.2609F));

		PartDefinition head_r76 = rightFace.addOrReplaceChild("head_r76", CubeListBuilder.create().texOffs(52, 14).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3414F, -0.1297F, -1.1549F, -0.0031F, -0.1978F, -0.7584F));

		PartDefinition head_r77 = rightFace.addOrReplaceChild("head_r77", CubeListBuilder.create().texOffs(31, 35).mirror().addBox(-0.1636F, -0.1511F, -0.3038F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.5453F, 0.5269F, -2.1972F, -0.0032F, -0.2415F, -0.7583F));

		PartDefinition head_r78 = rightFace.addOrReplaceChild("head_r78", CubeListBuilder.create().texOffs(32, 43).mirror().addBox(-0.1636F, -1.4511F, -0.3038F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 43).mirror().addBox(-0.1636F, -0.7761F, -0.2538F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.8333F, 1.7631F, -2.478F, -0.2194F, -0.1257F, 0.2568F));

		PartDefinition head_r79 = rightFace.addOrReplaceChild("head_r79", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(-0.725F, -0.125F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3749F, -7.8684F, 0.3882F, 0.3741F, -0.1876F));

		PartDefinition head_r80 = rightFace.addOrReplaceChild("head_r80", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.65F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3749F, -7.8684F, 0.4887F, 0.0F, 0.0F));

		PartDefinition head_r81 = rightFace.addOrReplaceChild("head_r81", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1014F, 0.7584F, -3.3519F, -0.1499F, -0.1653F, 0.2154F));

		PartDefinition head_r82 = rightFace.addOrReplaceChild("head_r82", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(-0.1F, -2.15F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(9, 43).mirror().addBox(-0.1F, -1.85F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.5459F, 0.3339F, -2.6362F, -0.0914F, -0.1927F, 0.9442F));

		PartDefinition head_r83 = rightFace.addOrReplaceChild("head_r83", CubeListBuilder.create().texOffs(45, 60).mirror().addBox(-0.05F, -1.825F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.5459F, 0.3339F, -2.6362F, -0.2017F, -0.0244F, 0.8644F));

		PartDefinition head_r84 = rightFace.addOrReplaceChild("head_r84", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-0.125F, -0.85F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.5459F, 0.3339F, -2.6362F, -0.1019F, -0.1642F, 1.0126F));

		PartDefinition head_r85 = rightFace.addOrReplaceChild("head_r85", CubeListBuilder.create().texOffs(21, 47).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.1014F, 0.7584F, -3.3519F, 0.0246F, -0.1653F, 0.2154F));

		PartDefinition head_r86 = rightFace.addOrReplaceChild("head_r86", CubeListBuilder.create().texOffs(43, 21).mirror().addBox(-0.156F, -0.8579F, -0.1521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.5075F, 1.6412F, -4.1962F, -0.1499F, -0.1653F, 0.2154F));

		PartDefinition head_r87 = rightFace.addOrReplaceChild("head_r87", CubeListBuilder.create().texOffs(45, 39).mirror().addBox(0.7745F, -0.175F, 0.1113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8262F, 0.5309F, -5.732F, 0.173F, 0.0462F, -0.4711F));

		PartDefinition head_r88 = rightFace.addOrReplaceChild("head_r88", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(-0.7379F, -0.4958F, -0.807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, 0.0618F, -4.2804F, 1.6668F, -1.2921F, -2.1982F));

		PartDefinition head_r89 = rightFace.addOrReplaceChild("head_r89", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(-0.2148F, -0.1431F, -0.6239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, -0.3132F, -4.4304F, 2.7273F, -1.0284F, 2.9403F));

		PartDefinition head_r90 = rightFace.addOrReplaceChild("head_r90", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(-0.0604F, -0.1431F, -0.0231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(75, 40).mirror().addBox(-0.0604F, -0.1431F, -0.2231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, -0.3132F, -4.4304F, 1.2823F, -1.3523F, -1.8371F));

		PartDefinition head_r91 = rightFace.addOrReplaceChild("head_r91", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-0.3364F, -0.1431F, 0.0977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, -0.3132F, -4.4304F, 0.5871F, -1.1864F, -1.1142F));

		PartDefinition head_r92 = rightFace.addOrReplaceChild("head_r92", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-0.7179F, -0.1431F, -0.0696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, -0.3132F, -4.4304F, 0.2987F, -0.7869F, -0.7762F));

		PartDefinition head_r93 = rightFace.addOrReplaceChild("head_r93", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-0.6123F, -0.4958F, -0.9528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, 0.0618F, -4.2804F, 0.3407F, -0.6102F, -0.728F));

		PartDefinition head_r94 = rightFace.addOrReplaceChild("head_r94", CubeListBuilder.create().texOffs(18, 39).mirror().addBox(-0.175F, -0.175F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.8262F, 0.5309F, -5.732F, 0.1762F, -0.1945F, -0.5136F));

		PartDefinition head_r95 = rightFace.addOrReplaceChild("head_r95", CubeListBuilder.create().texOffs(44, 25).mirror().addBox(-0.175F, -1.175F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0675F, 1.5124F, -5.7332F, -0.0012F, -0.2347F, 0.1928F));

		PartDefinition head_r96 = rightFace.addOrReplaceChild("head_r96", CubeListBuilder.create().texOffs(39, 43).mirror().addBox(-0.175F, -0.85F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.0675F, 1.5124F, -5.7332F, -0.1408F, -0.2347F, 0.1928F));

		PartDefinition head_r97 = rightFace.addOrReplaceChild("head_r97", CubeListBuilder.create().texOffs(35, 51).mirror().addBox(-2.0396F, -0.3247F, -1.0348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0283F, -0.1124F, -6.3241F, 0.3107F, -0.1221F, -0.5079F));

		PartDefinition head_r98 = rightFace.addOrReplaceChild("head_r98", CubeListBuilder.create().texOffs(49, 51).mirror().addBox(-1.3543F, -0.1613F, -1.0331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0283F, -0.1124F, -6.3241F, 0.2909F, -0.1636F, -0.3784F));

		PartDefinition head_r99 = rightFace.addOrReplaceChild("head_r99", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-0.1943F, -0.6591F, -2.1141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0283F, -0.1124F, -6.3241F, 0.8033F, -0.3F, 1.194F));

		PartDefinition head_r100 = rightFace.addOrReplaceChild("head_r100", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(-0.8562F, -0.1793F, -1.8911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0283F, -0.1124F, -6.3241F, 0.3055F, 0.0875F, -0.3038F));

		PartDefinition head_r101 = rightFace.addOrReplaceChild("head_r101", CubeListBuilder.create().texOffs(21, 51).mirror().addBox(-0.8562F, -0.1613F, -1.1919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.0283F, -0.1124F, -6.3241F, 0.288F, 0.0875F, -0.3038F));

		PartDefinition head_r102 = rightFace.addOrReplaceChild("head_r102", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-0.175F, -0.85F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.5421F, 1.3855F, -7.345F, 0.0602F, -0.2963F, 0.1892F));

		PartDefinition head_r103 = rightFace.addOrReplaceChild("head_r103", CubeListBuilder.create().texOffs(75, 27).mirror().addBox(-0.5F, -0.338F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(75, 24).mirror().addBox(-0.5F, -0.263F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 63).mirror().addBox(-0.5F, -1.163F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9819F, 1.6337F, -4.291F, -0.0684F, -0.1735F, 0.0326F));

		PartDefinition head_r104 = rightFace.addOrReplaceChild("head_r104", CubeListBuilder.create().texOffs(12, 59).mirror().addBox(-0.5F, -1.15F, 0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(57, 60).mirror().addBox(-0.5F, -1.05F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(7, 59).mirror().addBox(-0.5F, -0.95F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 73).mirror().addBox(-0.5F, -0.35F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.4936F, 1.4517F, -5.8051F, -0.1103F, -0.3047F, 0.1167F));

		PartDefinition head_r105 = rightFace.addOrReplaceChild("head_r105", CubeListBuilder.create().texOffs(69, 19).mirror().addBox(-0.5F, -0.25F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3489F, 1.3715F, -7.7876F, -0.5379F, -0.9793F, 0.4985F));

		PartDefinition head_r106 = rightFace.addOrReplaceChild("head_r106", CubeListBuilder.create().texOffs(36, 62).mirror().addBox(-0.5F, -1.05F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3489F, 1.3715F, -7.7876F, -0.4507F, -0.9793F, 0.4985F));

		PartDefinition head_r107 = rightFace.addOrReplaceChild("head_r107", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(-0.175F, -0.85F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5421F, 1.3855F, -7.345F, -0.1318F, -0.2963F, 0.1892F));

		PartDefinition head_r108 = rightFace.addOrReplaceChild("head_r108", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-0.175F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0948F, 1.3335F, -8.0062F, -0.1746F, -0.5749F, 0.1979F));

		PartDefinition head_r109 = rightFace.addOrReplaceChild("head_r109", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-0.175F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5011F, 1.3044F, -8.376F, -0.4012F, -0.9596F, 0.4289F));

		PartDefinition head_r110 = rightFace.addOrReplaceChild("head_r110", CubeListBuilder.create().texOffs(41, 64).mirror().addBox(-0.175F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.175F, 1.2902F, -8.5566F, -0.724F, -1.2192F, 0.7344F));

		PartDefinition head_r111 = rightFace.addOrReplaceChild("head_r111", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-0.7567F, -0.7432F, 0.582F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5061F, -0.0336F, -2.6339F, -0.0703F, -0.1219F, 0.1395F));

		PartDefinition head_r112 = rightFace.addOrReplaceChild("head_r112", CubeListBuilder.create().texOffs(68, 34).mirror().addBox(1.172F, -0.7708F, 1.5819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-0.5061F, -0.0336F, -2.6339F, -0.1137F, -0.6949F, 0.2039F));

		PartDefinition head_r113 = rightFace.addOrReplaceChild("head_r113", CubeListBuilder.create().texOffs(63, 67).mirror().addBox(1.4326F, -0.7708F, 0.7966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5061F, -0.0336F, -2.6339F, -0.1353F, -0.8681F, 0.2344F));

		PartDefinition lowerjaw1 = head.addOrReplaceChild("lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5658F, -0.3578F, 0.5672F, 0.0F, 0.0F));

		PartDefinition lowerjaw6_r1 = lowerjaw1.addOrReplaceChild("lowerjaw6_r1", CubeListBuilder.create().texOffs(17, 62).mirror().addBox(-0.5F, -1.825F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(17, 62).addBox(5.4837F, -1.825F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.9918F, -0.0066F, -0.9132F, -1.4312F, 0.0F, 0.0F));

		PartDefinition lowerjaw19_r1 = lowerjaw1.addOrReplaceChild("lowerjaw19_r1", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.8324F, -0.841F, -0.8395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7604F, 1.2032F, -8.7661F, 2.006F, 1.2419F, -2.8049F));

		PartDefinition lowerjaw18_r1 = lowerjaw1.addOrReplaceChild("lowerjaw18_r1", CubeListBuilder.create().texOffs(66, 16).mirror().addBox(-0.1323F, -0.841F, -0.8395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.3264F, 1.3025F, -8.3664F, -1.7374F, 0.6077F, -0.1736F));

		PartDefinition lowerjaw17_r1 = lowerjaw1.addOrReplaceChild("lowerjaw17_r1", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.1323F, -0.141F, -0.8395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6668F, 1.412F, -7.7647F, -1.7279F, -0.5149F, 0.0F));

		PartDefinition lowerjaw18_r2 = lowerjaw1.addOrReplaceChild("lowerjaw18_r2", CubeListBuilder.create().texOffs(64, 7).mirror().addBox(-0.1324F, -0.1549F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.79F, 1.0092F, -8.7363F, -2.2573F, -1.1452F, 0.4872F));

		PartDefinition lowerjaw17_r2 = lowerjaw1.addOrReplaceChild("lowerjaw17_r2", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-0.1323F, -0.1549F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3381F, 1.2015F, -8.3457F, -2.0094F, -0.9067F, 0.1998F));

		PartDefinition lowerjaw16_r1 = lowerjaw1.addOrReplaceChild("lowerjaw16_r1", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(-0.1323F, -0.1549F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.6668F, 1.412F, -7.7647F, -1.8762F, -0.5149F, 0.0F));

		PartDefinition lowerjaw15_r1 = lowerjaw1.addOrReplaceChild("lowerjaw15_r1", CubeListBuilder.create().texOffs(61, 64).mirror().addBox(-0.0257F, 0.0642F, -0.4911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0668F, 1.412F, -6.8397F, -1.7628F, -0.4451F, 0.0F));

		PartDefinition lowerjaw22_r1 = lowerjaw1.addOrReplaceChild("lowerjaw22_r1", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(0.0F, 0.5331F, -0.3626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.2918F, 0.212F, -1.8647F, -1.309F, -0.1309F, 0.0F));

		PartDefinition lowerjaw21_r1 = lowerjaw1.addOrReplaceChild("lowerjaw21_r1", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(0.0235F, 0.4164F, -1.268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.2168F, 1.412F, -2.6147F, -1.4661F, -0.1833F, 0.0F));

		PartDefinition lowerjaw20_r1 = lowerjaw1.addOrReplaceChild("lowerjaw20_r1", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(0.0235F, 1.2409F, -1.1856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.2168F, 1.412F, -2.6147F, -1.501F, -0.1833F, 0.0F));

		PartDefinition lowerjaw19_r2 = lowerjaw1.addOrReplaceChild("lowerjaw19_r2", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(0.0201F, 0.4481F, -0.9901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.9168F, 1.412F, -4.2147F, -1.5533F, -0.2531F, 0.0F));

		PartDefinition lowerjaw18_r3 = lowerjaw1.addOrReplaceChild("lowerjaw18_r3", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(0.0518F, 0.3814F, -1.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(65, 43).mirror().addBox(0.0518F, -0.0437F, -0.3049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7168F, 1.412F, -5.1147F, -1.6581F, -0.288F, 0.0F));

		PartDefinition lowerjaw17_r3 = lowerjaw1.addOrReplaceChild("lowerjaw17_r3", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(0.0482F, 0.161F, -1.0645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(64, 20).mirror().addBox(0.0482F, -0.1048F, -0.3991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4168F, 1.412F, -6.1147F, -1.693F, -0.3578F, 0.0F));

		PartDefinition lowerjaw16_r2 = lowerjaw1.addOrReplaceChild("lowerjaw16_r2", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.0257F, 0.2235F, -0.9715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.0668F, 1.412F, -6.8397F, -1.7802F, -0.4451F, 0.0F));

		PartDefinition lowerjaw17_r4 = lowerjaw1.addOrReplaceChild("lowerjaw17_r4", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-0.375F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7935F, 0.5529F, -8.4094F, -1.8745F, -1.0001F, 0.0974F));

		PartDefinition lowerjaw16_r3 = lowerjaw1.addOrReplaceChild("lowerjaw16_r3", CubeListBuilder.create().texOffs(14, 52).mirror().addBox(-0.6F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2899F, 0.7667F, -8.4363F, -1.798F, -1.3353F, 0.2505F));

		PartDefinition lowerjaw15_r2 = lowerjaw1.addOrReplaceChild("lowerjaw15_r2", CubeListBuilder.create().texOffs(7, 52).mirror().addBox(-0.1323F, -0.1906F, -1.5442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.6668F, 1.412F, -7.7647F, -1.6493F, -0.5149F, 0.0F));

		PartDefinition lowerjaw12_r1 = lowerjaw1.addOrReplaceChild("lowerjaw12_r1", CubeListBuilder.create().texOffs(10, 63).mirror().addBox(0.0518F, 0.0339F, -0.4266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7168F, 1.412F, -5.1147F, -1.5359F, -0.288F, 0.0F));

		PartDefinition lowerjaw11_r1 = lowerjaw1.addOrReplaceChild("lowerjaw11_r1", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(0.0201F, -0.0618F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9168F, 1.412F, -4.2147F, -1.501F, -0.2531F, 0.0F));

		PartDefinition lowerjaw10_r1 = lowerjaw1.addOrReplaceChild("lowerjaw10_r1", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(0.0201F, 0.0199F, -0.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9168F, 1.412F, -4.2147F, -1.7104F, -0.2531F, 0.0F));

		PartDefinition lowerjaw9_r1 = lowerjaw1.addOrReplaceChild("lowerjaw9_r1", CubeListBuilder.create().texOffs(63, 52).mirror().addBox(0.0235F, 0.7006F, -0.0758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2168F, 1.412F, -2.6147F, -1.6406F, -0.1833F, 0.0F));

		PartDefinition lowerjaw8_r1 = lowerjaw1.addOrReplaceChild("lowerjaw8_r1", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(0.0235F, 0.8556F, -0.7496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2168F, 1.412F, -2.6147F, -1.4312F, -0.1833F, 0.0F));

		PartDefinition lowerjaw7_r1 = lowerjaw1.addOrReplaceChild("lowerjaw7_r1", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(0.0235F, -0.1505F, -0.8679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2168F, 1.412F, -2.6147F, -1.3003F, -0.1833F, 0.0F));

		PartDefinition lowerjaw6_r2 = lowerjaw1.addOrReplaceChild("lowerjaw6_r2", CubeListBuilder.create().texOffs(73, 49).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2918F, 0.212F, -1.8647F, -1.213F, -0.1309F, 0.0F));

		PartDefinition lowerjaw5_r1 = lowerjaw1.addOrReplaceChild("lowerjaw5_r1", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(73, 46).addBox(5.0837F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7918F, 0.212F, -1.8647F, -1.3439F, 0.0F, 0.0F));

		PartDefinition lowerjaw7_r2 = lowerjaw1.addOrReplaceChild("lowerjaw7_r2", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(0.0235F, -0.1644F, -0.1389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2168F, 1.412F, -2.6147F, -1.5446F, -0.1833F, 0.0F));

		PartDefinition lowerjaw6_r3 = lowerjaw1.addOrReplaceChild("lowerjaw6_r3", CubeListBuilder.create().texOffs(71, 3).mirror().addBox(0.0F, 0.1273F, 0.811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2918F, 0.212F, -1.8647F, -1.2828F, -0.1309F, 0.0F));

		PartDefinition lowerjaw5_r2 = lowerjaw1.addOrReplaceChild("lowerjaw5_r2", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(71, 64).addBox(5.0837F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.7918F, 1.3897F, -0.6685F, -0.9338F, 0.0F, 0.0F));

		PartDefinition lowerjaw4_r1 = lowerjaw1.addOrReplaceChild("lowerjaw4_r1", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 31).addBox(5.0837F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7918F, 0.8343F, -0.2424F, -0.6545F, 0.0F, 0.0F));

		PartDefinition lowerjaw19_r3 = lowerjaw1.addOrReplaceChild("lowerjaw19_r3", CubeListBuilder.create().texOffs(66, 64).addBox(-0.8615F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3615F, 0.8644F, -8.5052F, -0.1309F, 0.0F, 0.0F));

		PartDefinition lowerjaw18_r4 = lowerjaw1.addOrReplaceChild("lowerjaw18_r4", CubeListBuilder.create().texOffs(35, 66).addBox(-0.1677F, -0.841F, -0.8395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7604F, 1.2032F, -8.7661F, 2.006F, -1.2419F, 2.8049F));

		PartDefinition lowerjaw17_r5 = lowerjaw1.addOrReplaceChild("lowerjaw17_r5", CubeListBuilder.create().texOffs(66, 16).addBox(-0.8677F, -0.841F, -0.8395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.3264F, 1.3025F, -8.3664F, -1.7374F, -0.6077F, 0.1736F));

		PartDefinition lowerjaw16_r4 = lowerjaw1.addOrReplaceChild("lowerjaw16_r4", CubeListBuilder.create().texOffs(15, 66).addBox(-0.8677F, -0.141F, -0.8395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6668F, 1.412F, -7.7647F, -1.7279F, 0.5149F, 0.0F));

		PartDefinition lowerjaw17_r6 = lowerjaw1.addOrReplaceChild("lowerjaw17_r6", CubeListBuilder.create().texOffs(64, 7).addBox(-0.8676F, -0.1549F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.79F, 1.0092F, -8.7363F, -2.2573F, 1.1452F, -0.4872F));

		PartDefinition lowerjaw16_r5 = lowerjaw1.addOrReplaceChild("lowerjaw16_r5", CubeListBuilder.create().texOffs(64, 10).addBox(-0.8677F, -0.1549F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3381F, 1.2015F, -8.3457F, -2.0094F, 0.9067F, -0.1998F));

		PartDefinition lowerjaw15_r3 = lowerjaw1.addOrReplaceChild("lowerjaw15_r3", CubeListBuilder.create().texOffs(22, 64).addBox(-0.8677F, -0.1549F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.6668F, 1.412F, -7.7647F, -1.8762F, 0.5149F, 0.0F));

		PartDefinition lowerjaw14_r1 = lowerjaw1.addOrReplaceChild("lowerjaw14_r1", CubeListBuilder.create().texOffs(61, 64).addBox(-0.9743F, 0.0642F, -0.4911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0668F, 1.412F, -6.8397F, -1.7628F, 0.4451F, 0.0F));

		PartDefinition lowerjaw21_r2 = lowerjaw1.addOrReplaceChild("lowerjaw21_r2", CubeListBuilder.create().texOffs(10, 75).addBox(-1.0F, 0.5331F, -0.3626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.2918F, 0.212F, -1.8647F, -1.309F, 0.1309F, 0.0F));

		PartDefinition lowerjaw20_r2 = lowerjaw1.addOrReplaceChild("lowerjaw20_r2", CubeListBuilder.create().texOffs(74, 61).addBox(-1.0235F, 0.4164F, -1.268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.2168F, 1.412F, -2.6147F, -1.4661F, 0.1833F, 0.0F));

		PartDefinition lowerjaw19_r4 = lowerjaw1.addOrReplaceChild("lowerjaw19_r4", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0235F, 1.2409F, -1.1856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.2168F, 1.412F, -2.6147F, -1.501F, 0.1833F, 0.0F));

		PartDefinition lowerjaw18_r5 = lowerjaw1.addOrReplaceChild("lowerjaw18_r5", CubeListBuilder.create().texOffs(68, 70).addBox(-1.0201F, 0.4481F, -0.9901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.9168F, 1.412F, -4.2147F, -1.5533F, 0.2531F, 0.0F));

		PartDefinition lowerjaw17_r7 = lowerjaw1.addOrReplaceChild("lowerjaw17_r7", CubeListBuilder.create().texOffs(10, 72).addBox(-1.0518F, 0.3814F, -1.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(65, 43).addBox(-1.0518F, -0.0437F, -0.3049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7168F, 1.412F, -5.1147F, -1.6581F, 0.288F, 0.0F));

		PartDefinition lowerjaw16_r6 = lowerjaw1.addOrReplaceChild("lowerjaw16_r6", CubeListBuilder.create().texOffs(71, 15).addBox(-1.0482F, 0.161F, -1.0645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(64, 20).addBox(-1.0482F, -0.1048F, -0.3991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4168F, 1.412F, -6.1147F, -1.693F, 0.3578F, 0.0F));

		PartDefinition lowerjaw15_r4 = lowerjaw1.addOrReplaceChild("lowerjaw15_r4", CubeListBuilder.create().texOffs(63, 70).addBox(-0.9743F, 0.2235F, -0.9715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.0668F, 1.412F, -6.8397F, -1.7802F, 0.4451F, 0.0F));

		PartDefinition lowerjaw16_r7 = lowerjaw1.addOrReplaceChild("lowerjaw16_r7", CubeListBuilder.create().texOffs(73, 52).addBox(-0.625F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7935F, 0.5529F, -8.4094F, -1.8745F, 1.0001F, -0.0974F));

		PartDefinition lowerjaw15_r5 = lowerjaw1.addOrReplaceChild("lowerjaw15_r5", CubeListBuilder.create().texOffs(14, 52).addBox(-0.4F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2899F, 0.7667F, -8.4363F, -1.798F, 1.3353F, -0.2505F));

		PartDefinition lowerjaw14_r2 = lowerjaw1.addOrReplaceChild("lowerjaw14_r2", CubeListBuilder.create().texOffs(7, 52).addBox(-0.8677F, -0.1906F, -1.5442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.6668F, 1.412F, -7.7647F, -1.6493F, 0.5149F, 0.0F));

		PartDefinition lowerjaw11_r2 = lowerjaw1.addOrReplaceChild("lowerjaw11_r2", CubeListBuilder.create().texOffs(10, 63).addBox(-1.0518F, 0.0339F, -0.4266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7168F, 1.412F, -5.1147F, -1.5359F, 0.288F, 0.0F));

		PartDefinition lowerjaw10_r2 = lowerjaw1.addOrReplaceChild("lowerjaw10_r2", CubeListBuilder.create().texOffs(63, 34).addBox(-1.0201F, -0.0618F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9168F, 1.412F, -4.2147F, -1.501F, 0.2531F, 0.0F));

		PartDefinition lowerjaw9_r2 = lowerjaw1.addOrReplaceChild("lowerjaw9_r2", CubeListBuilder.create().texOffs(63, 49).addBox(-1.0201F, 0.0199F, -0.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9168F, 1.412F, -4.2147F, -1.7104F, 0.2531F, 0.0F));

		PartDefinition lowerjaw8_r2 = lowerjaw1.addOrReplaceChild("lowerjaw8_r2", CubeListBuilder.create().texOffs(63, 52).addBox(-1.0235F, 0.7006F, -0.0758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2168F, 1.412F, -2.6147F, -1.6406F, 0.1833F, 0.0F));

		PartDefinition lowerjaw7_r3 = lowerjaw1.addOrReplaceChild("lowerjaw7_r3", CubeListBuilder.create().texOffs(58, 70).addBox(-1.0235F, 0.8556F, -0.7496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2168F, 1.412F, -2.6147F, -1.4312F, 0.1833F, 0.0F));

		PartDefinition lowerjaw6_r4 = lowerjaw1.addOrReplaceChild("lowerjaw6_r4", CubeListBuilder.create().texOffs(50, 73).addBox(-1.0235F, -0.1505F, -0.8679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2168F, 1.412F, -2.6147F, -1.3003F, 0.1833F, 0.0F));

		PartDefinition lowerjaw5_r3 = lowerjaw1.addOrReplaceChild("lowerjaw5_r3", CubeListBuilder.create().texOffs(73, 49).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2918F, 0.212F, -1.8647F, -1.213F, 0.1309F, 0.0F));

		PartDefinition lowerjaw6_r5 = lowerjaw1.addOrReplaceChild("lowerjaw6_r5", CubeListBuilder.create().texOffs(71, 12).addBox(-1.0235F, -0.1644F, -0.1389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2168F, 1.412F, -2.6147F, -1.5446F, 0.1833F, 0.0F));

		PartDefinition lowerjaw5_r4 = lowerjaw1.addOrReplaceChild("lowerjaw5_r4", CubeListBuilder.create().texOffs(71, 3).addBox(-1.0F, 0.1273F, 0.811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2918F, 0.212F, -1.8647F, -1.2828F, 0.1309F, 0.0F));

		PartDefinition bone2 = bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.197F, 1.6813F, -3.1296F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bodyfront_r3 = bone2.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(70, 25).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -2.9524F, 0.1482F, 1.3352F, 0.0F, 0.0F));

		PartDefinition bodyfront_r4 = bone2.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(25, 70).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.1858F, 1.1206F, 1.8064F, 0.0F, 0.0F));

		PartDefinition bodyfront_r5 = bone2.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(48, 67).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -2.1104F, 2.0391F, 1.4923F, 0.0F, 0.0F));

		PartDefinition bodyfront_r6 = bone2.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(43, 67).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.2401F, 1.5467F, 1.0559F, 0.0F, 0.0F));

		PartDefinition bodyfront_r7 = bone2.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(49, 35).addBox(-1.0F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3496F, 0.4664F, 0.6894F, 0.0F, 0.0F));

		PartDefinition bodyfront_r8 = bone2.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(7, 48).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.8836F, -0.7038F, 0.8116F, 0.0F, 0.0F));

		PartDefinition bodyfront_r9 = bone2.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(35, 72).addBox(-1.0F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1643F, -1.4596F, 0.48F, 0.0F, 0.0F));

		PartDefinition bodyfront_r10 = bone2.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(28, 58).addBox(-0.5F, -0.05F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1632F, -3.4781F, 1.2392F, 0.0F, 0.0F));

		PartDefinition bodyfront_r11 = bone2.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(42, 55).addBox(-3.0F, -2.0F, -0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5049F, -3.2982F, 1.4198F, -0.2376F, -0.1142F));

		PartDefinition bodyfront_r12 = bone2.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(27, 39).addBox(-1.9F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0365F, 3.7016F, -1.2974F, 1.3603F, 0.7958F, -0.3014F));

		PartDefinition bodyfront_r13 = bone2.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(22, 33).addBox(-3.0F, -2.025F, -0.025F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.5049F, -3.2982F, 1.424F, -0.0218F, -0.1467F));

		PartDefinition bodyfront_r14 = bone2.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(16, 46).addBox(-0.5F, -0.025F, -0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.2093F, -5.2762F, 1.4224F, 0.0F, 0.0F));

		PartDefinition bodyfront_r15 = bone2.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(70, 40).addBox(-0.5F, -1.025F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.8465F, -4.8983F, 2.0857F, 0.0F, 0.0F));

		PartDefinition bodyfront_r16 = bone2.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(70, 28).addBox(-0.5F, -1.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.5429F, -3.6674F, 1.8413F, 0.0F, 0.0F));

		PartDefinition bodyfront_r17 = bone2.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(51, 64).addBox(-0.5F, -0.325F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.1632F, -3.4781F, 1.8937F, 0.0F, 0.0F));

		PartDefinition bodyfront_r18 = bone2.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(73, 55).addBox(-0.5F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3881F, -1.3864F, 1.3963F, 0.0F, 0.0F));

		PartDefinition bodyfront_r19 = bone2.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -1.025F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.3628F, -1.2009F, 1.9199F, 0.0F, 0.0F));

		PartDefinition bodyfront_r20 = bone2.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(53, 67).addBox(-1.0F, -1.025F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.5538F, -1.7887F, 2.1991F, 0.0F, 0.0F));

		PartDefinition bodyfront_r21 = bone2.addOrReplaceChild("bodyfront_r21", CubeListBuilder.create().texOffs(28, 51).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.2732F, -1.7851F, 0.672F, 0.0F, 0.0F));

		PartDefinition bodyfront_r22 = bone2.addOrReplaceChild("bodyfront_r22", CubeListBuilder.create().texOffs(51, 25).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -1.1498F, -0.5261F, 0.8465F, 0.0F, 0.0F));

		PartDefinition bodyfront_r23 = bone2.addOrReplaceChild("bodyfront_r23", CubeListBuilder.create().texOffs(28, 47).addBox(-0.5F, -0.989F, -0.0001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1257F, 0.0F, 0.0F));

		PartDefinition bone3 = bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.197F, 1.6813F, -3.1296F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bodyfront_r24 = bone3.addOrReplaceChild("bodyfront_r24", CubeListBuilder.create().texOffs(70, 25).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9524F, 0.1482F, 1.3352F, 0.0F, 0.0F));

		PartDefinition bodyfront_r25 = bone3.addOrReplaceChild("bodyfront_r25", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.1858F, 1.1206F, 1.8064F, 0.0F, 0.0F));

		PartDefinition bodyfront_r26 = bone3.addOrReplaceChild("bodyfront_r26", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.1104F, 2.0391F, 1.4923F, 0.0F, 0.0F));

		PartDefinition bodyfront_r27 = bone3.addOrReplaceChild("bodyfront_r27", CubeListBuilder.create().texOffs(43, 67).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2401F, 1.5467F, 1.0559F, 0.0F, 0.0F));

		PartDefinition bodyfront_r28 = bone3.addOrReplaceChild("bodyfront_r28", CubeListBuilder.create().texOffs(49, 35).mirror().addBox(0.0F, -1.0F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3496F, 0.4664F, 0.6894F, 0.0F, 0.0F));

		PartDefinition bodyfront_r29 = bone3.addOrReplaceChild("bodyfront_r29", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8836F, -0.7038F, 0.8116F, 0.0F, 0.0F));

		PartDefinition bodyfront_r30 = bone3.addOrReplaceChild("bodyfront_r30", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(0.0F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1643F, -1.4596F, 0.48F, 0.0F, 0.0F));

		PartDefinition bodyfront_r31 = bone3.addOrReplaceChild("bodyfront_r31", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(-0.5F, -0.05F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1632F, -3.4781F, 1.2392F, 0.0F, 0.0F));

		PartDefinition bodyfront_r32 = bone3.addOrReplaceChild("bodyfront_r32", CubeListBuilder.create().texOffs(42, 55).mirror().addBox(1.0F, -2.0F, -0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5049F, -3.2982F, 1.4198F, 0.2376F, 0.1142F));

		PartDefinition bodyfront_r33 = bone3.addOrReplaceChild("bodyfront_r33", CubeListBuilder.create().texOffs(27, 39).mirror().addBox(-1.1F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0365F, 3.7016F, -1.2974F, 1.3603F, -0.7958F, 0.3014F));

		PartDefinition bodyfront_r34 = bone3.addOrReplaceChild("bodyfront_r34", CubeListBuilder.create().texOffs(22, 33).mirror().addBox(0.0F, -2.025F, -0.025F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5049F, -3.2982F, 1.424F, 0.0218F, 0.1467F));

		PartDefinition bodyfront_r35 = bone3.addOrReplaceChild("bodyfront_r35", CubeListBuilder.create().texOffs(16, 46).mirror().addBox(-0.5F, -0.025F, -0.025F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2093F, -5.2762F, 1.4224F, 0.0F, 0.0F));

		PartDefinition bodyfront_r36 = bone3.addOrReplaceChild("bodyfront_r36", CubeListBuilder.create().texOffs(70, 40).mirror().addBox(-0.5F, -1.025F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8465F, -4.8983F, 2.0857F, 0.0F, 0.0F));

		PartDefinition bodyfront_r37 = bone3.addOrReplaceChild("bodyfront_r37", CubeListBuilder.create().texOffs(70, 28).mirror().addBox(-0.5F, -1.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5429F, -3.6674F, 1.8413F, 0.0F, 0.0F));

		PartDefinition bodyfront_r38 = bone3.addOrReplaceChild("bodyfront_r38", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-0.5F, -0.325F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1632F, -3.4781F, 1.8937F, 0.0F, 0.0F));

		PartDefinition bodyfront_r39 = bone3.addOrReplaceChild("bodyfront_r39", CubeListBuilder.create().texOffs(73, 55).mirror().addBox(-0.5F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3881F, -1.3864F, 1.3963F, 0.0F, 0.0F));

		PartDefinition bodyfront_r40 = bone3.addOrReplaceChild("bodyfront_r40", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(0.0F, -1.025F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3628F, -1.2009F, 1.9199F, 0.0F, 0.0F));

		PartDefinition bodyfront_r41 = bone3.addOrReplaceChild("bodyfront_r41", CubeListBuilder.create().texOffs(53, 67).mirror().addBox(0.0F, -1.025F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5538F, -1.7887F, 2.1991F, 0.0F, 0.0F));

		PartDefinition bodyfront_r42 = bone3.addOrReplaceChild("bodyfront_r42", CubeListBuilder.create().texOffs(28, 51).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2732F, -1.7851F, 0.672F, 0.0F, 0.0F));

		PartDefinition bodyfront_r43 = bone3.addOrReplaceChild("bodyfront_r43", CubeListBuilder.create().texOffs(51, 25).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1498F, -0.5261F, 0.8465F, 0.0F, 0.0F));

		PartDefinition bodyfront_r44 = bone3.addOrReplaceChild("bodyfront_r44", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-0.5F, -0.989F, -0.0001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1257F, 0.0F, 0.0F));

		PartDefinition bodyrear = body.addOrReplaceChild("bodyrear", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, -0.4379F, -0.0772F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6079F, 2.4999F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition bodyrear_r1 = bodyrear.addOrReplaceChild("bodyrear_r1", CubeListBuilder.create().texOffs(20, 76).addBox(0.0F, -1.6F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4379F, 2.9228F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bodyrear_r2 = bodyrear.addOrReplaceChild("bodyrear_r2", CubeListBuilder.create().texOffs(56, 76).addBox(0.0F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4379F, 0.9228F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bodyrear.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(45, 76).mirror().addBox(-0.9608F, 0.2727F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.4F, 4.6878F, 0.2167F, 0.1137F, -0.3915F));

		PartDefinition cube_r68 = bodyrear.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-1.9861F, -0.1589F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.4F, 4.6878F, 0.149F, 0.1943F, -0.8256F));

		PartDefinition cube_r69 = bodyrear.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-1.9861F, -0.1589F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.4F, 2.3878F, 0.5596F, 0.556F, -0.6708F));

		PartDefinition cube_r70 = bodyrear.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-0.9608F, 0.2727F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.4F, 2.3878F, 0.7203F, 0.2919F, -0.2875F));

		PartDefinition cube_r71 = bodyrear.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.9608F, 0.2727F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.2F, 0.3878F, 0.7791F, 0.2176F, -0.2814F));

		PartDefinition cube_r72 = bodyrear.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 18).mirror().addBox(-2.9861F, -0.1589F, -0.8657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5226F, -0.2F, 0.3878F, 0.6522F, 0.5071F, -0.6326F));

		PartDefinition cube_r73 = bodyrear.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 58).addBox(0.9861F, -0.1589F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.4F, 4.6878F, 0.149F, -0.1943F, 0.8256F));

		PartDefinition cube_r74 = bodyrear.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(45, 76).addBox(-0.0392F, 0.2727F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.4F, 4.6878F, 0.2167F, -0.1137F, 0.3915F));

		PartDefinition cube_r75 = bodyrear.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 76).addBox(-0.0392F, 0.2727F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.4F, 2.3878F, 0.7203F, -0.2919F, 0.2875F));

		PartDefinition cube_r76 = bodyrear.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(52, 8).addBox(0.9861F, -0.1589F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.4F, 2.3878F, 0.5596F, -0.556F, 0.6708F));

		PartDefinition cube_r77 = bodyrear.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(59, 18).addBox(0.9861F, -0.1589F, -0.8657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.2F, 0.3878F, 0.6522F, -0.5071F, 0.6326F));

		PartDefinition cube_r78 = bodyrear.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 78).addBox(-0.0392F, 0.2727F, -0.8657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5226F, -0.2F, 0.3878F, 0.7791F, -0.2176F, 0.2814F));

		PartDefinition neck_r5 = bodyrear.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(43, 78).addBox(0.0F, -1.9009F, -0.9015F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3489F, 4.8216F, 0.2094F, 0.0F, 0.0F));

		PartDefinition tailbase = bodyrear.addOrReplaceChild("tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0129F, 5.9728F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition tailbase_r1 = tailbase.addOrReplaceChild("tailbase_r1", CubeListBuilder.create().texOffs(36, 39).mirror().addBox(-1.5F, 0.0F, -0.2F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 39).addBox(0.5F, 0.0F, -0.2F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 33).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck_r6 = tailbase.addOrReplaceChild("neck_r6", CubeListBuilder.create().texOffs(32, 64).addBox(0.0F, -1.8661F, 0.2025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.361F, -1.1012F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck_r7 = tailbase.addOrReplaceChild("neck_r7", CubeListBuilder.create().texOffs(40, 67).addBox(0.0F, -2.1008F, 0.0471F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.361F, 0.1988F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck_r8 = tailbase.addOrReplaceChild("neck_r8", CubeListBuilder.create().texOffs(59, 76).addBox(0.0F, -2.1468F, -0.0913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0514F, 2.6368F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck_r9 = tailbase.addOrReplaceChild("neck_r9", CubeListBuilder.create().texOffs(67, 26).addBox(0.0F, -2.3097F, 0.007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0514F, 1.4368F, -0.0524F, 0.0F, 0.0F));

		PartDefinition legL = tailbase.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(43, 7).addBox(0.5F, -0.4F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9955F, 2.0084F, 0.7317F, 0.4955F, 0.3218F, 0.6033F));

		PartDefinition rightleg5_r1 = legL.addOrReplaceChild("rightleg5_r1", CubeListBuilder.create().texOffs(57, 8).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.267F, 0.1F, -1.0232F, 0.0F, -0.2269F, 0.0F));

		PartDefinition rightleg4_r1 = legL.addOrReplaceChild("rightleg4_r1", CubeListBuilder.create().texOffs(65, 73).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6F, 0.1F, -0.6F, 0.0F, -0.5236F, 0.0F));

		PartDefinition rightleg4_r2 = legL.addOrReplaceChild("rightleg4_r2", CubeListBuilder.create().texOffs(73, 70).addBox(-0.025F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3036F, 0.1F, 0.6866F, 0.0F, 1.9111F, 0.0F));

		PartDefinition rightleg3_r1 = legL.addOrReplaceChild("rightleg3_r1", CubeListBuilder.create().texOffs(60, 73).addBox(-0.425F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1F, 0.4F, 0.0F, 0.5236F, 0.0F));

		PartDefinition rightleg4_r3 = legL.addOrReplaceChild("rightleg4_r3", CubeListBuilder.create().texOffs(30, 75).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.5F, 0.1F, -0.5F, 0.0F, 0.7505F, 0.0F));

		PartDefinition rightleg3_r2 = legL.addOrReplaceChild("rightleg3_r2", CubeListBuilder.create().texOffs(69, 0).addBox(-1.3F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.1F, -0.5F, -0.2102F, 1.2023F, -0.2574F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(55, 73).addBox(0.0F, -0.5F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5752F, 0.3359F, -0.3658F, -0.0142F, -0.1603F, 0.1739F));

		PartDefinition rightleg6_r1 = legL2.addOrReplaceChild("rightleg6_r1", CubeListBuilder.create().texOffs(74, 0).addBox(-0.05F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 67).addBox(-0.575F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.65F, 0.0F, 0.1309F, 0.0F));

		PartDefinition rightleg7_r1 = legL2.addOrReplaceChild("rightleg7_r1", CubeListBuilder.create().texOffs(52, 39).addBox(-1.075F, -0.5F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5125F, 0.0F, -1.2207F, 0.0F, 1.7104F, 0.0F));

		PartDefinition rightleg6_r2 = legL2.addOrReplaceChild("rightleg6_r2", CubeListBuilder.create().texOffs(76, 3).addBox(-0.875F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(-0.675F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5125F, 0.0F, -1.2207F, 0.0F, 1.3177F, 0.0F));

		PartDefinition rightleg4_r4 = legL2.addOrReplaceChild("rightleg4_r4", CubeListBuilder.create().texOffs(5, 76).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5125F, 0.0F, -1.2207F, 0.0F, 1.0559F, 0.0F));

		PartDefinition rightleg3_r3 = legL2.addOrReplaceChild("rightleg3_r3", CubeListBuilder.create().texOffs(57, 21).addBox(-1.6F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5F, 0.0F, -0.55F, 0.0F, 0.4451F, 0.0F));

		PartDefinition footL = legL2.addOrReplaceChild("footL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.288F, -0.3513F, -0.4145F, -0.3491F, 0.0F, -0.5672F));

		PartDefinition rightrearfin_r1 = footL.addOrReplaceChild("rightrearfin_r1", CubeListBuilder.create().texOffs(15, 72).addBox(0.0F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 52).addBox(-1.4F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9239F, 0.3F, 0.9079F, 0.0F, -0.4538F, 0.0F));

		PartDefinition rightrearfin_r2 = footL.addOrReplaceChild("rightrearfin_r2", CubeListBuilder.create().texOffs(30, 72).addBox(0.8F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(16, 43).addBox(-1.6F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.1616F, 0.3F, 0.2748F, 0.0F, -0.1484F, 0.0F));

		PartDefinition rightrearfin_r3 = footL.addOrReplaceChild("rightrearfin_r3", CubeListBuilder.create().texOffs(74, 9).addBox(-1.0F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(57, 0).addBox(-0.6F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5819F, 0.3F, -1.751F, 0.0F, 0.5061F, 0.0F));

		PartDefinition rightrearfin_r4 = footL.addOrReplaceChild("rightrearfin_r4", CubeListBuilder.create().texOffs(57, 11).addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5819F, 0.3F, -1.751F, 0.0F, 0.637F, 0.0F));

		PartDefinition rightrearfin_r5 = footL.addOrReplaceChild("rightrearfin_r5", CubeListBuilder.create().texOffs(56, 55).addBox(-2.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.8055F, 0.3F, -1.3732F, 0.0F, 0.3752F, 0.0F));

		PartDefinition rightrearfin_r6 = footL.addOrReplaceChild("rightrearfin_r6", CubeListBuilder.create().texOffs(43, 18).addBox(-1.7F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.1809F, 0.3F, -0.5312F, 0.0F, 0.2007F, 0.0F));

		PartDefinition rightrearfin_r7 = footL.addOrReplaceChild("rightrearfin_r7", CubeListBuilder.create().texOffs(43, 15).addBox(-1.0F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4329F, 0.3F, 1.0022F, 0.0F, -0.2793F, 0.0F));

		PartDefinition rightleg6_r3 = footL.addOrReplaceChild("rightleg6_r3", CubeListBuilder.create().texOffs(35, 69).addBox(-0.375F, -0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 37).addBox(-0.775F, -0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.7755F, 0.3513F, -0.8062F, 0.0F, 1.3177F, 0.0F));

		PartDefinition rightleg8_r1 = footL.addOrReplaceChild("rightleg8_r1", CubeListBuilder.create().texOffs(15, 75).addBox(-0.75F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 58).addBox(-0.25F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.1946F, 0.3513F, 0.762F, 0.0F, 1.7191F, 0.0F));

		PartDefinition rightleg8_r2 = footL.addOrReplaceChild("rightleg8_r2", CubeListBuilder.create().texOffs(69, 61).addBox(-0.25F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(75, 21).addBox(-0.75F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(0, 70).addBox(0.55F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1946F, 0.3513F, 0.762F, 0.0F, 1.1956F, 0.0F));

		PartDefinition rightleg11_r1 = footL.addOrReplaceChild("rightleg11_r1", CubeListBuilder.create().texOffs(5, 70).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0882F, 0.3513F, -1.7923F, 0.1708F, 0.9531F, 0.0933F));

		PartDefinition rightleg12_r1 = footL.addOrReplaceChild("rightleg12_r1", CubeListBuilder.create().texOffs(76, 12).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5901F, 0.2906F, -1.2899F, 0.6421F, 1.3964F, 0.6026F));

		PartDefinition rightleg12_r2 = footL.addOrReplaceChild("rightleg12_r2", CubeListBuilder.create().texOffs(74, 6).addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(75, 43).addBox(0.025F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0882F, 0.3513F, -1.7923F, 0.1161F, 0.5555F, 0.0151F));

		PartDefinition legL3 = tailbase.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(43, 7).mirror().addBox(-3.5F, -0.4F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9955F, 2.0084F, 0.7317F, -0.0548F, 0.736F, -0.7388F));

		PartDefinition leftleg6_r1 = legL3.addOrReplaceChild("leftleg6_r1", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.267F, 0.1F, -1.0232F, 0.0F, 0.2269F, 0.0F));

		PartDefinition leftleg5_r1 = legL3.addOrReplaceChild("leftleg5_r1", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1F, -0.6F, 0.0F, 0.5236F, 0.0F));

		PartDefinition leftleg5_r2 = legL3.addOrReplaceChild("leftleg5_r2", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-0.975F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3036F, 0.1F, 0.6866F, 0.0F, -1.9111F, 0.0F));

		PartDefinition leftleg4_r1 = legL3.addOrReplaceChild("leftleg4_r1", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-0.575F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1F, 0.4F, 0.0F, -0.5236F, 0.0F));

		PartDefinition leftleg5_r3 = legL3.addOrReplaceChild("leftleg5_r3", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.1F, -0.5F, 0.0F, -0.7505F, 0.0F));

		PartDefinition leftleg4_r2 = legL3.addOrReplaceChild("leftleg4_r2", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(0.3F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.1F, -0.5F, -0.2102F, -1.2023F, 0.2574F));

		PartDefinition legL4 = legL3.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(-1.0F, -0.5F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5752F, 0.3359F, -0.3658F, -0.0142F, 0.1603F, -0.1739F));

		PartDefinition leftleg7_r1 = legL4.addOrReplaceChild("leftleg7_r1", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.95F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 67).mirror().addBox(-0.425F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.65F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftleg8_r1 = legL4.addOrReplaceChild("leftleg8_r1", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(0.075F, -0.5F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5125F, 0.0F, -1.2207F, 0.0F, -1.7104F, 0.0F));

		PartDefinition leftleg7_r2 = legL4.addOrReplaceChild("leftleg7_r2", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-0.125F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 76).mirror().addBox(-0.325F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5125F, 0.0F, -1.2207F, 0.0F, -1.3177F, 0.0F));

		PartDefinition leftleg5_r4 = legL4.addOrReplaceChild("leftleg5_r4", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5125F, 0.0F, -1.2207F, 0.0F, -1.0559F, 0.0F));

		PartDefinition leftleg4_r3 = legL4.addOrReplaceChild("leftleg4_r3", CubeListBuilder.create().texOffs(57, 21).mirror().addBox(-0.4F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -0.55F, 0.0F, -0.4451F, 0.0F));

		PartDefinition footL2 = legL4.addOrReplaceChild("footL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.288F, -0.3513F, -0.4145F, -0.3491F, 0.0F, 0.5672F));

		PartDefinition leftrearfin_r1 = footL2.addOrReplaceChild("leftrearfin_r1", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-1.0F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 52).mirror().addBox(-0.6F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9239F, 0.3F, 0.9079F, 0.0F, 0.4538F, 0.0F));

		PartDefinition leftrearfin_r2 = footL2.addOrReplaceChild("leftrearfin_r2", CubeListBuilder.create().texOffs(30, 72).mirror().addBox(-1.8F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(16, 43).mirror().addBox(-1.4F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.1616F, 0.3F, 0.2748F, 0.0F, 0.1484F, 0.0F));

		PartDefinition leftrearfin_r3 = footL2.addOrReplaceChild("leftrearfin_r3", CubeListBuilder.create().texOffs(74, 9).mirror().addBox(0.0F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(57, 0).mirror().addBox(-1.4F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5819F, 0.3F, -1.751F, 0.0F, -0.5061F, 0.0F));

		PartDefinition leftrearfin_r4 = footL2.addOrReplaceChild("leftrearfin_r4", CubeListBuilder.create().texOffs(57, 11).mirror().addBox(-1.0F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5819F, 0.3F, -1.751F, 0.0F, -0.637F, 0.0F));

		PartDefinition leftrearfin_r5 = footL2.addOrReplaceChild("leftrearfin_r5", CubeListBuilder.create().texOffs(56, 55).mirror().addBox(0.0F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.8055F, 0.3F, -1.3732F, 0.0F, -0.3752F, 0.0F));

		PartDefinition leftrearfin_r6 = footL2.addOrReplaceChild("leftrearfin_r6", CubeListBuilder.create().texOffs(43, 18).mirror().addBox(-1.3F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.1809F, 0.3F, -0.5312F, 0.0F, -0.2007F, 0.0F));

		PartDefinition leftrearfin_r7 = footL2.addOrReplaceChild("leftrearfin_r7", CubeListBuilder.create().texOffs(43, 15).mirror().addBox(-2.0F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4329F, 0.3F, 1.0022F, 0.0F, 0.2793F, 0.0F));

		PartDefinition leftleg7_r3 = footL2.addOrReplaceChild("leftleg7_r3", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-0.625F, -0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(69, 37).mirror().addBox(-0.225F, -0.5F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.7755F, 0.3513F, -0.8062F, 0.0F, -1.3177F, 0.0F));

		PartDefinition leftleg9_r1 = footL2.addOrReplaceChild("leftleg9_r1", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.25F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(69, 58).mirror().addBox(-0.75F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.1946F, 0.3513F, 0.762F, 0.0F, -1.7191F, 0.0F));

		PartDefinition leftleg9_r2 = footL2.addOrReplaceChild("leftleg9_r2", CubeListBuilder.create().texOffs(69, 61).mirror().addBox(-0.75F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(75, 21).mirror().addBox(-0.25F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-1.55F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1946F, 0.3513F, 0.762F, 0.0F, -1.1956F, 0.0F));

		PartDefinition leftleg1_r1 = footL2.addOrReplaceChild("leftleg1_r1", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0882F, 0.3513F, -1.7923F, 0.1708F, -0.9531F, -0.0933F));

		PartDefinition leftleg13_r1 = footL2.addOrReplaceChild("leftleg13_r1", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5901F, 0.2906F, -1.2899F, 0.6421F, -1.3964F, -0.6026F));

		PartDefinition leftleg13_r2 = footL2.addOrReplaceChild("leftleg13_r2", CubeListBuilder.create().texOffs(74, 6).mirror().addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(75, 43).mirror().addBox(-1.025F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0882F, 0.3513F, -1.7923F, 0.1161F, -0.5555F, -0.0151F));

		PartDefinition tail1 = tailbase.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(32, 14).addBox(-0.5F, -0.3758F, -0.0521F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F))
				.texOffs(40, 35).addBox(0.5F, 0.1242F, -0.0521F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 35).mirror().addBox(-1.5F, 0.1242F, -0.0521F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, 3.8F, -0.1362F, -0.1743F, 0.0085F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(78, 69).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3758F, 1.9479F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(23, 76).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3758F, -0.0521F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck_r10 = tail1.addOrReplaceChild("neck_r10", CubeListBuilder.create().texOffs(78, 66).addBox(0.0F, -0.0285F, 0.0933F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5105F, 2.4635F, 0.5934F, 0.0F, 0.0F));

		PartDefinition neck_r11 = tail1.addOrReplaceChild("neck_r11", CubeListBuilder.create().texOffs(78, 50).addBox(0.0F, -0.0208F, 0.0659F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.53F, 0.9204F, 0.7243F, 0.0F, 0.0F));

		PartDefinition neck_r12 = tail1.addOrReplaceChild("neck_r12", CubeListBuilder.create().texOffs(46, 78).addBox(0.0F, -0.3772F, -0.237F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.73F, -1.5796F, 0.7767F, 0.0F, 0.0F));

		PartDefinition neck_r13 = tail1.addOrReplaceChild("neck_r13", CubeListBuilder.create().texOffs(78, 46).addBox(0.0F, -0.4969F, -0.1394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.03F, 0.1204F, 0.8116F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(34, 2).addBox(-0.5F, -0.3047F, -0.0567F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0711F, 3.9046F, -0.0596F, 0.2205F, 0.0296F));

		PartDefinition tail5_r1 = tail2.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(62, 76).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3047F, 1.9433F, -0.4887F, 0.0F, 0.0F));

		PartDefinition tail4_r1 = tail2.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(74, 78).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3047F, -0.0567F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail5_r2 = tail2.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(-0.9F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1953F, -0.0567F, 0.0F, 0.1047F, 0.0F));

		PartDefinition tail4_r2 = tail2.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(9, 39).addBox(-0.1F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1953F, -0.0567F, 0.0F, -0.1047F, 0.0F));

		PartDefinition tail3_r2 = tail2.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(79, 57).addBox(0.0F, -0.5F, 0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 36).addBox(0.0F, -1.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4962F, 1.4128F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail = tail2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 20).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1953F, 2.9433F, -0.2478F, 0.2188F, 0.1276F));

		PartDefinition tail4_r3 = tail.addOrReplaceChild("tail4_r3", CubeListBuilder.create().texOffs(68, 76).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition tail3_r3 = tail.addOrReplaceChild("tail3_r3", CubeListBuilder.create().texOffs(65, 76).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.5934F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, -0.3F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5231F, 3.2072F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail5_r3 = tail.addOrReplaceChild("tail5_r3", CubeListBuilder.create().texOffs(6, 79).addBox(0.0F, 1.4F, 2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 60).addBox(0.0F, 0.5F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3009F, -1.5304F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail3 = tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.4802F, -0.0009F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0009F, 3.9446F, 0.1825F, 0.43F, 0.0768F));

		PartDefinition tail5_r4 = tail3.addOrReplaceChild("tail5_r4", CubeListBuilder.create().texOffs(78, 54).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4802F, 2.9991F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail4_r4 = tail3.addOrReplaceChild("tail4_r4", CubeListBuilder.create().texOffs(71, 76).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4802F, 0.9991F, -0.4712F, 0.0F, 0.0F));

		PartDefinition tail9_r1 = tail3.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(79, 6).addBox(0.0F, 2.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 17).addBox(0.0F, 1.7F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 0).addBox(0.0F, 0.6F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5222F, -0.7374F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, -0.4346F, 0.0213F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0793F, 3.9213F, 0.1593F, 0.4798F, 0.0131F));

		PartDefinition tail5_r5 = tail4.addOrReplaceChild("tail5_r5", CubeListBuilder.create().texOffs(77, 78).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4346F, 1.0213F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail11_r1 = tail4.addOrReplaceChild("tail11_r1", CubeListBuilder.create().texOffs(79, 9).addBox(0.0F, 4.6F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 79).addBox(0.0F, 3.7F, 2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6014F, -4.6587F, 0.9599F, 0.0F, 0.0F));

		PartDefinition bone = tailbase.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8015F, 0.4378F, 0.6295F, 0.0F, 0.0F, 0.1309F));

		PartDefinition tailbase_r2 = bone.addOrReplaceChild("tailbase_r2", CubeListBuilder.create().texOffs(20, 70).addBox(-0.5F, -0.85F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0F, 0.2666F, 1.0815F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tailbase_r3 = bone.addOrReplaceChild("tailbase_r3", CubeListBuilder.create().texOffs(59, 38).addBox(-0.5F, -0.7883F, -0.5777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 1.1477F, 0.7504F, 1.2392F, 0.0F, 0.2967F));

		PartDefinition tailbase_r4 = bone.addOrReplaceChild("tailbase_r4", CubeListBuilder.create().texOffs(69, 6).addBox(-0.5F, -0.7234F, -0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.1F, 1.1477F, 0.7504F, 0.7505F, 0.0F, 0.2967F));

		PartDefinition tailbase_r5 = bone.addOrReplaceChild("tailbase_r5", CubeListBuilder.create().texOffs(70, 22).addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0F, 0.2666F, 1.0815F, 0.7505F, 0.0F, 0.0F));

		PartDefinition tailbase_r6 = bone.addOrReplaceChild("tailbase_r6", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.85F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2666F, 1.0815F, 0.096F, 0.0F, 0.0F));

		PartDefinition tailbase_r7 = bone.addOrReplaceChild("tailbase_r7", CubeListBuilder.create().texOffs(50, 21).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.1808F, 1.874F, 0.2356F, 0.0F, 0.0F));

		PartDefinition tailbase_r8 = bone.addOrReplaceChild("tailbase_r8", CubeListBuilder.create().texOffs(33, 58).addBox(-0.9F, 1.2258F, 2.716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, 0.3142F, 0.0F, 0.3665F));

		PartDefinition tailbase_r9 = bone.addOrReplaceChild("tailbase_r9", CubeListBuilder.create().texOffs(52, 58).addBox(-0.9F, 2.0273F, 2.2359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, 0.576F, 0.0F, 0.3665F));

		PartDefinition tailbase_r10 = bone.addOrReplaceChild("tailbase_r10", CubeListBuilder.create().texOffs(67, 31).addBox(-0.9F, -2.1726F, -1.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, 2.3126F, 0.0F, 0.3665F));

		PartDefinition tailbase_r11 = bone.addOrReplaceChild("tailbase_r11", CubeListBuilder.create().texOffs(0, 60).addBox(-0.9F, 1.8928F, -1.4346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, -0.1745F, 0.0F, 0.3665F));

		PartDefinition tailbase_r12 = bone.addOrReplaceChild("tailbase_r12", CubeListBuilder.create().texOffs(43, 2).addBox(-0.9F, 1.5255F, -1.9027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, 0.0698F, 0.0F, 0.3665F));

		PartDefinition tailbase_r13 = bone.addOrReplaceChild("tailbase_r13", CubeListBuilder.create().texOffs(24, 26).addBox(-0.9F, 1.5103F, -0.4921F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, 0.1571F, 0.0F, 0.3665F));

		PartDefinition tailbase_r14 = bone.addOrReplaceChild("tailbase_r14", CubeListBuilder.create().texOffs(42, 47).addBox(-0.9F, 0.8107F, 3.5974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, -0.1222F, 0.0F, 0.3665F));

		PartDefinition tailbase_r15 = bone.addOrReplaceChild("tailbase_r15", CubeListBuilder.create().texOffs(35, 47).addBox(-0.9F, 2.9486F, 2.7147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, 0.2967F, 0.0F, 0.3665F));

		PartDefinition tailbase_r16 = bone.addOrReplaceChild("tailbase_r16", CubeListBuilder.create().texOffs(13, 26).addBox(-0.9F, -0.0852F, -0.1605F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, -0.0349F, 0.0F, 0.3665F));

		PartDefinition tailbase_r17 = bone.addOrReplaceChild("tailbase_r17", CubeListBuilder.create().texOffs(60, 42).addBox(-0.9F, -0.2124F, -0.1903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 1.1223F, -0.9929F, -0.4363F, 0.0F, 0.3665F));

		PartDefinition tailbase_r18 = bone.addOrReplaceChild("tailbase_r18", CubeListBuilder.create().texOffs(43, 10).addBox(1.4F, -0.6218F, 0.177F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.9F, 0.1691F, -1.4848F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tailbase_r19 = bone.addOrReplaceChild("tailbase_r19", CubeListBuilder.create().texOffs(10, 66).addBox(-0.786F, -0.492F, -1.0876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F))
				.texOffs(65, 23).addBox(-0.786F, -0.2086F, -0.1084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2774F, -0.5685F, -0.235F, 0.6354F, 0.0F, 0.0F));

		PartDefinition tailbase_r20 = bone.addOrReplaceChild("tailbase_r20", CubeListBuilder.create().texOffs(66, 13).addBox(-0.786F, -0.5832F, -0.1625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(66, 3).addBox(-0.786F, -0.5832F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2774F, -0.5685F, -0.235F, 1.0718F, 0.0F, 0.0F));

		PartDefinition bone4 = tailbase.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8015F, 0.4378F, 0.6295F, 0.0F, 0.0F, -0.1309F));

		PartDefinition tailbase_r21 = bone4.addOrReplaceChild("tailbase_r21", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.5F, -0.85F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2666F, 1.0815F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tailbase_r22 = bone4.addOrReplaceChild("tailbase_r22", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(-0.5F, -0.7883F, -0.5777F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.1477F, 0.7504F, 1.2392F, 0.0F, -0.2967F));

		PartDefinition tailbase_r23 = bone4.addOrReplaceChild("tailbase_r23", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-0.5F, -0.7234F, -0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.1477F, 0.7504F, 0.7505F, 0.0F, -0.2967F));

		PartDefinition tailbase_r24 = bone4.addOrReplaceChild("tailbase_r24", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-0.5F, -0.95F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2666F, 1.0815F, 0.7505F, 0.0F, 0.0F));

		PartDefinition tailbase_r25 = bone4.addOrReplaceChild("tailbase_r25", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -0.85F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2666F, 1.0815F, 0.096F, 0.0F, 0.0F));

		PartDefinition tailbase_r26 = bone4.addOrReplaceChild("tailbase_r26", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1808F, 1.874F, 0.2356F, 0.0F, 0.0F));

		PartDefinition tailbase_r27 = bone4.addOrReplaceChild("tailbase_r27", CubeListBuilder.create().texOffs(33, 58).mirror().addBox(-0.1F, 1.2258F, 2.716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, 0.3142F, 0.0F, -0.3665F));

		PartDefinition tailbase_r28 = bone4.addOrReplaceChild("tailbase_r28", CubeListBuilder.create().texOffs(52, 58).mirror().addBox(-0.1F, 2.0273F, 2.2359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, 0.576F, 0.0F, -0.3665F));

		PartDefinition tailbase_r29 = bone4.addOrReplaceChild("tailbase_r29", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-0.1F, -2.1726F, -1.3942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, 2.3126F, 0.0F, -0.3665F));

		PartDefinition tailbase_r30 = bone4.addOrReplaceChild("tailbase_r30", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.1F, 1.8928F, -1.4346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, -0.1745F, 0.0F, -0.3665F));

		PartDefinition tailbase_r31 = bone4.addOrReplaceChild("tailbase_r31", CubeListBuilder.create().texOffs(43, 2).mirror().addBox(-0.1F, 1.5255F, -1.9027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, 0.0698F, 0.0F, -0.3665F));

		PartDefinition tailbase_r32 = bone4.addOrReplaceChild("tailbase_r32", CubeListBuilder.create().texOffs(24, 26).mirror().addBox(-0.1F, 1.5103F, -0.4921F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, 0.1571F, 0.0F, -0.3665F));

		PartDefinition tailbase_r33 = bone4.addOrReplaceChild("tailbase_r33", CubeListBuilder.create().texOffs(42, 47).mirror().addBox(-0.1F, 0.8107F, 3.5974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, -0.1222F, 0.0F, -0.3665F));

		PartDefinition tailbase_r34 = bone4.addOrReplaceChild("tailbase_r34", CubeListBuilder.create().texOffs(35, 47).mirror().addBox(-0.1F, 2.9486F, 2.7147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, 0.2967F, 0.0F, -0.3665F));

		PartDefinition tailbase_r35 = bone4.addOrReplaceChild("tailbase_r35", CubeListBuilder.create().texOffs(13, 26).mirror().addBox(-0.1F, -0.0852F, -0.1605F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, -0.0349F, 0.0F, -0.3665F));

		PartDefinition tailbase_r36 = bone4.addOrReplaceChild("tailbase_r36", CubeListBuilder.create().texOffs(60, 42).mirror().addBox(-0.1F, -0.2124F, -0.1903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1223F, -0.9929F, -0.4363F, 0.0F, -0.3665F));

		PartDefinition tailbase_r37 = bone4.addOrReplaceChild("tailbase_r37", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-2.4F, -0.6218F, 0.177F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.9F, 0.1691F, -1.4848F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tailbase_r38 = bone4.addOrReplaceChild("tailbase_r38", CubeListBuilder.create().texOffs(10, 66).mirror().addBox(-0.214F, -0.492F, -1.0876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(65, 23).mirror().addBox(-0.214F, -0.2086F, -0.1084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.2774F, -0.5685F, -0.235F, 0.6354F, 0.0F, 0.0F));

		PartDefinition tailbase_r39 = bone4.addOrReplaceChild("tailbase_r39", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-0.214F, -0.5832F, -0.1625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(66, 3).mirror().addBox(-0.214F, -0.5832F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2774F, -0.5685F, -0.235F, 1.0718F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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