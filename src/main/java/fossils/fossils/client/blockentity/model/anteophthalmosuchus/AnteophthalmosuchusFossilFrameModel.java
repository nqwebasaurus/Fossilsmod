package fossils.fossils.client.blockentity.model.anteophthalmosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnteophthalmosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL9;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL8;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart forelegLx;
	private final ModelPart forelegL2;
	private final ModelPart forelegLx2;
	private final ModelPart forelegL3;
	private final ModelPart forelegLx3;
	private final ModelPart forelegL4;
	private final ModelPart forelegLx4;
	private final ModelPart forelegL5;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye3;
	private final ModelPart eye2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public AnteophthalmosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.hindlegL2 = this.bone.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.hindlegL9 = this.hindlegL4.getChild("hindlegL9");
		this.hindlegL5 = this.bone.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.hindlegL7 = this.hindlegL6.getChild("hindlegL7");
		this.hindlegL8 = this.hindlegL7.getChild("hindlegL8");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.forelegLx = this.body3.getChild("forelegLx");
		this.forelegL2 = this.forelegLx.getChild("forelegL2");
		this.forelegLx2 = this.forelegL2.getChild("forelegLx2");
		this.forelegL3 = this.forelegLx2.getChild("forelegL3");
		this.forelegLx3 = this.body3.getChild("forelegLx3");
		this.forelegL4 = this.forelegLx3.getChild("forelegL4");
		this.forelegLx4 = this.forelegL4.getChild("forelegLx4");
		this.forelegL5 = this.forelegLx4.getChild("forelegL5");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye3 = this.head.getChild("eye3");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -7.0F, 2.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(1.2F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.5F, -6.5F, -12.1F, -0.5236F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.8F, -1.2F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(6.5F, -6.5F, -12.1F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.7F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -8.5F, 2.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 1.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(-0.5F, -10.25F, 1.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 43).addBox(-0.5F, 1.1824F, 9.0432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 39).addBox(-0.5F, 1.1824F, 4.3432F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, -6.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.3F, 0.1978F, 2.117F));

		PartDefinition hindlegL2 = bone.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3529F, 2.2019F, -0.6808F, 0.1492F, -0.1608F, 0.2965F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1397F, -0.7F, -0.558F, 0.0F, 0.0436F, 1.1781F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 0.8F, 0.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition hindlegL9 = hindlegL4.addOrReplaceChild("hindlegL9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0997F, 0.0F, -0.0131F, -1.658F, 1.5632F, -1.4836F));

		PartDefinition hindlegL5 = bone.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9529F, 2.2019F, -0.6808F, 0.1559F, 0.3334F, -0.2692F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1397F, -0.7F, -0.558F, 0.0F, 0.48F, -1.1781F));

		PartDefinition hindlegL7 = hindlegL6.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 0.8F, 0.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition hindlegL8 = hindlegL7.addOrReplaceChild("hindlegL8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0997F, 0.0F, -0.0131F, 2.1678F, -1.2667F, -2.4627F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.85F, -1.4F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 47).addBox(-2.0F, 0.7F, 5.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, 0.3F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.425F, -4.0F, 0.0361F, -0.2616F, -0.0094F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -6.0F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(55, 57).addBox(-1.5F, 0.7F, 8.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 54).addBox(-1.5F, 0.7F, 4.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition forelegLx = body3.addOrReplaceChild("forelegLx", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7186F, 2.8426F, -4.1166F, 0.0922F, 0.2163F, 0.1355F));

		PartDefinition forelegL2 = forelegLx.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3F, -0.5F, -0.1F, 0.0F, 0.0F, 1.1781F));

		PartDefinition forelegLx2 = forelegL2.addOrReplaceChild("forelegLx2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3846F, -0.6916F, -0.1166F, -0.4705F, 0.4385F, 0.1001F));

		PartDefinition forelegL3 = forelegLx2.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3369F, -0.0703F, 0.2854F, 0.2738F, 1.1589F, 0.1358F));

		PartDefinition forelegLx3 = body3.addOrReplaceChild("forelegLx3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7186F, 2.8426F, -4.1166F, 0.1474F, 0.8286F, -0.0496F));

		PartDefinition forelegL4 = forelegLx3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3F, -0.5F, -0.1F, 0.0F, 0.0F, -1.1781F));

		PartDefinition forelegLx4 = forelegL4.addOrReplaceChild("forelegLx4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3846F, -0.6916F, -0.1166F, 0.1145F, -0.5275F, -0.3253F));

		PartDefinition forelegL5 = forelegLx4.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3369F, -0.0703F, 0.2854F, 0.2167F, -1.2008F, -0.1684F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(65, 48).addBox(-0.5F, 0.1F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 49).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.25F, -4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.3253F, -0.4538F, 0.023F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -0.15F, 5.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4886F, -0.3535F, -1.9604F, -0.4357F, -0.2267F, -0.2993F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5434F, -0.1015F, -5.2119F, 0.3471F, 0.7173F, 0.1955F));

		PartDefinition eye3 = head.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8048F, -0.1015F, -5.2119F, 0.3471F, -0.7173F, -0.1955F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2517F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 0.1619F, -1.0032F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 7).addBox(-0.5F, 0.5448F, 0.115F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0482F, 3.5269F, -0.4334F, 0.319F, -0.1441F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.5406F, -0.0292F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 35).addBox(-0.5F, 0.5406F, 5.6708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0103F, 5.6741F, 0.0804F, -0.2175F, -0.0174F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(40, 7).addBox(-0.5F, 0.6619F, -0.1468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1153F, 6.1118F, 0.2346F, -0.2549F, -0.0602F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.287F, -0.3774F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 4).addBox(-0.5F, 0.287F, 4.3226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3792F, 4.8499F, 0.0183F, -0.3054F, -0.0055F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, 0.5678F, -0.0375F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2521F, 4.7427F, 0.1372F, -0.3027F, -0.0411F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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