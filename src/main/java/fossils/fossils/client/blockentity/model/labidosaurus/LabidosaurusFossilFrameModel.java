package fossils.fossils.client.blockentity.model.labidosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LabidosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart leftArm8;
	private final ModelPart leftArm9;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart rightArm8;
	private final ModelPart rightArm9;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart bone;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public LabidosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.leftArm5 = this.Hips.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.leftArm8 = this.leftArm7.getChild("leftArm8");
		this.leftArm9 = this.leftArm8.getChild("leftArm9");
		this.rightArm5 = this.Hips.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.rightArm8 = this.rightArm7.getChild("rightArm8");
		this.rightArm9 = this.rightArm8.getChild("rightArm9");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.bone = this.Bodyfront.getChild("bone");
		this.leftArm2 = this.bone.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm2 = this.bone.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.rightArm3 = this.rightArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone3 = this.bone.getChild("bone3");
		this.bone5 = this.bone.getChild("bone5");
		this.Neck = this.bone.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.rightFace2 = this.Head.getChild("rightFace2");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -8.7F, 4.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -3.35F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(6.4F, -6.65F, -17.6F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.15F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.4F, -6.65F, -17.6F, -0.5672F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.0F, 4.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.5943F, 2.6001F, -0.217F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(21, 0).addBox(0.8842F, -0.3F, 2.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3842F, 0.4091F, -2.9063F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftArm5 = Hips.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0119F, 2.2864F, 3.0353F, 0.1967F, -0.3864F, 0.1604F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4477F, 0.2816F, -0.5594F, 1.3517F, -0.5766F, 0.753F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2441F, -0.2663F, -3.2249F, -0.8407F, 0.1235F, 1.1749F));

		PartDefinition leftArm8 = leftArm7.addOrReplaceChild("leftArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.289F, 0.0F, -0.9165F, 0.0F, 1.5272F, 0.0F));

		PartDefinition leftArm9 = leftArm8.addOrReplaceChild("leftArm9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.347F, 0.0F, -1.5726F, 0.0F, 0.0436F, 0.0F));

		PartDefinition rightArm5 = Hips.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0119F, 2.2864F, 3.0353F, 0.1673F, -0.5494F, -0.4129F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4477F, 0.2816F, -0.5594F, 1.3644F, 0.3786F, -0.6105F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2441F, -0.2663F, -3.2249F, -0.8407F, -0.1235F, -1.1749F));

		PartDefinition rightArm8 = rightArm7.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.289F, 0.0F, -0.9165F, 0.0F, -1.1781F, 0.0F));

		PartDefinition rightArm9 = rightArm8.addOrReplaceChild("rightArm9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.347F, 0.0F, -1.5726F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3842F, 0.1091F, -0.0063F, 0.0722F, -0.1306F, -0.0094F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(17, 30).addBox(0.8842F, -0.3F, 3.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2638F, -9.7034F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2362F, -5.9034F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Belly_r2 = body.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(42, 7).addBox(0.8842F, -0.3F, -1.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2906F, -4.9018F, -0.0064F, -0.0873F, 0.0006F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(32, 30).addBox(0.8842F, -0.3237F, 5.0609F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1669F, -10.8572F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1669F, -5.9572F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Bodyfront_r2 = bone.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(16, 47).addBox(0.8842F, -0.742F, -0.5209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 44).addBox(0.8842F, -0.742F, -5.2209F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = bone.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3961F, 4.1662F, -4.9301F, 0.1736F, -1.0633F, 0.2558F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5223F, -0.171F, -1.1706F, 1.5177F, 0.3102F, 0.7562F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.772F, 0.3727F, -3.305F, -1.0688F, 0.2945F, 1.0037F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5346F, 0.0F, -0.8871F, 0.0F, 0.9163F, 0.0F));

		PartDefinition rightArm2 = bone.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6277F, 4.1662F, -4.9301F, 0.2065F, -0.1534F, -0.4001F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5223F, -0.171F, -1.1706F, 1.5123F, -0.5281F, -0.7429F));

		PartDefinition rightArm3 = rightArm.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.772F, 0.3727F, -3.305F, -1.0596F, -0.1619F, -1.2357F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5346F, 0.0F, -0.8871F, 0.0F, -0.7418F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(5.7842F, 4.6381F, -4.6865F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-3.0158F, 4.6381F, -4.6865F));

		PartDefinition Neck = bone.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7849F, -4.9332F, -0.3358F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(47, 56).addBox(0.8842F, -0.4375F, 1.0526F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7907F, -3.9119F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.9119F, 0.0303F, -0.2932F, -0.0867F));

		PartDefinition Neck_r2 = neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(21, 71).addBox(0.8842F, -0.3572F, 1.3512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.3F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4942F, -1.3596F, 0.3453F, -0.0148F, 0.0409F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0489F, -1.254F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(3.9F, -1.8645F, -4.5575F));

		PartDefinition rightFace2 = Head.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(-1.1316F, -1.8645F, -4.5575F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(7.698F, 2.6078F, -2.3324F, -0.0698F, -0.0174F, -0.1559F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9296F, 2.6078F, -2.3324F, -0.0698F, 0.0174F, 0.1559F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(49, 35).addBox(0.8842F, 0.0024F, -0.3156F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 38).addBox(0.8842F, 0.0024F, 3.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3842F, 0.6091F, 7.0187F, -0.084F, 0.2174F, -0.0182F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(32, 42).addBox(-0.5158F, 0.3289F, 0.1754F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4F, -0.2978F, 3.8729F, -0.1414F, 0.2196F, -0.0354F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(42, 14).addBox(0.8842F, 0.1547F, 0.243F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.0869F, 4.9738F, -0.1844F, 0.3467F, 0.0413F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(26, 49).addBox(0.8842F, 0.0787F, 0.2742F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0681F, 4.9343F, 0.0776F, 0.3046F, 0.0233F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(45, 42).addBox(0.8842F, 0.0787F, -0.2258F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0349F, 3.8763F, 0.2137F, -0.0435F, -0.0036F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.131F, 4.0168F, -0.0859F, 0.0151F, 0.1739F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.131F, 4.0168F, -0.0859F, -0.0151F, -0.1739F));

		return LayerDefinition.create(meshdefinition, 93, 93);
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