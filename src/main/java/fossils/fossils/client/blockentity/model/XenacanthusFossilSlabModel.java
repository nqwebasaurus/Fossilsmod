package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class XenacanthusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart base;
	private final ModelPart pectoralfinright;
	private final ModelPart pectoralfinleft;
	private final ModelPart spine;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart pelvicfinright;
	private final ModelPart pelvicfinleft;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart jaw;

	public XenacanthusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.base = this.fossil.getChild("base");
		this.pectoralfinright = this.base.getChild("pectoralfinright");
		this.pectoralfinleft = this.base.getChild("pectoralfinleft");
		this.spine = this.base.getChild("spine");
		this.body = this.base.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.pelvicfinright = this.body2.getChild("pelvicfinright");
		this.pelvicfinleft = this.body2.getChild("pelvicfinleft");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.jaw = this.base.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 12).addBox(-9.3239F, -3.7F, -21.1656F, 12.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.8F, 2.25F, 37.95F, 0.0F, -0.8901F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(17.0681F, -3.65F, -13.5682F, 16.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.2F, 2.25F, 37.75F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(79, 58).addBox(-7.665F, -3.825F, -9.625F, 22.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 2.25F, 13.85F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(79, 76).addBox(6.4349F, -0.4F, -0.8841F, 22.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.1537F, -0.75F, -12.4546F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 58).addBox(13.0F, -3.5F, -14.0F, 25.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.0F, 2.25F, 0.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition base = fossil.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 72).addBox(-7.125F, -23.3766F, -16.7296F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-7.0F, -21.6266F, -18.9796F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(6, 12).addBox(-7.0F, -22.5766F, -20.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(-25.3F, 5.5F, 0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r6 = base.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 18).addBox(-8.0F, -17.8735F, -8.8761F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.0F, -5.95F, -10.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = base.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 25).addBox(-8.0F, -18.2019F, -5.2537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.0F, -6.125F, -10.775F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = base.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 6).addBox(-8.0F, -18.2019F, -5.2537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -6.625F, -11.775F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = base.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 49).addBox(-7.0F, -8.8088F, -19.7576F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -7.35F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r10 = base.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 88).addBox(-7.0F, -14.3451F, -11.6579F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.25F, -7.5F, -0.1702F, 0.0F, 0.0F));

		PartDefinition pectoralfinright = base.addOrReplaceChild("pectoralfinright", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, -3.25F, -3.5F, -0.48F, -0.5236F, 0.4363F));

		PartDefinition cube_r11 = pectoralfinright.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 65).addBox(0.9359F, -7.7573F, -16.6387F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9244F, -1.6719F, 3.4855F, -0.3294F, 0.6871F, -0.2418F));

		PartDefinition pectoralfinleft = base.addOrReplaceChild("pectoralfinleft", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, -3.25F, -3.5F, -0.48F, 0.5236F, -0.4363F));

		PartDefinition spine = base.addOrReplaceChild("spine", CubeListBuilder.create().texOffs(52, 36).addBox(-6.0F, -7.3203F, -18.2148F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.25F, -6.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition body = base.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 12).addBox(-7.4F, -18.1266F, -10.2296F, 1.0F, 6.0F, 11.0F, new CubeDeformation(0.01F))
				.texOffs(0, 30).addBox(-7.175F, -22.1266F, -9.2296F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -5.25F, -1.5F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(27, 25).addBox(-8.3F, -15.7097F, -10.8806F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.1F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(15, 20).addBox(-7.0F, -19.2019F, -8.1762F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(34, 38).addBox(-6.8F, -23.0519F, -7.1762F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, 0.1F, 10.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(11, 36).addBox(-7.35F, -18.7657F, -6.6868F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.25F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition pelvicfinright = body2.addOrReplaceChild("pelvicfinright", CubeListBuilder.create().texOffs(39, 12).addBox(-0.8518F, -16.7284F, -6.7823F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 2.0F, 1.0F, 0.084F, -0.0132F, 0.0467F));

		PartDefinition pelvicfinleft = body2.addOrReplaceChild("pelvicfinleft", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 2.0F, 1.0F, 0.0F, 0.1309F, -0.7418F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(41, 25).addBox(-7.0F, -19.7572F, -3.7383F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-6.81F, -23.6072F, -2.7383F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.5F, 9.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 12).addBox(-4.735F, -9.3007F, 13.4773F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.5F, 4.05F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 30).addBox(-4.725F, -13.3559F, 11.1211F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.5F, 1.75F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 78).addBox(-5.85F, -15.7878F, -1.3059F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 45).addBox(-6.1F, -18.8879F, 2.4147F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(43, 0).addBox(-5.7F, -20.3879F, 3.4147F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(30, 88).addBox(-5.9F, -16.0879F, 3.4147F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 5.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(79, 58).addBox(-5.5F, -16.1714F, 8.1558F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(-5.275F, -18.0214F, 9.1558F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(14, 18).addBox(-5.5F, -15.6714F, 13.9058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.45F, 0.0F, 6.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = base.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(15, 88).addBox(-8.0F, -15.7097F, -15.3806F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -4.225F, -7.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = jaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 38).addBox(-8.0F, -13.8772F, -13.1729F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.125F, -4.425F, -0.1658F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 100);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}