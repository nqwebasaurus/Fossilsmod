package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BrochoadmonesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Brochoadmones;
	private final ModelPart Headbase;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Ventral7L;
	private final ModelPart Ventral6L;
	private final ModelPart Ventral5L;
	private final ModelPart Body4;
	private final ModelPart Body5;
	private final ModelPart Ventral4L;
	private final ModelPart Ventral3L;
	private final ModelPart PectoralL;
	private final ModelPart Ventral2L;
	private final ModelPart Ventral1L;
	private final ModelPart Cephalon;
	private final ModelPart Jaw;

	public BrochoadmonesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Brochoadmones = this.fossil.getChild("Brochoadmones");
		this.Headbase = this.Brochoadmones.getChild("Headbase");
		this.Body1 = this.Headbase.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Ventral7L = this.Body3.getChild("Ventral7L");
		this.Ventral6L = this.Body3.getChild("Ventral6L");
		this.Ventral5L = this.Body3.getChild("Ventral5L");
		this.Body4 = this.Body3.getChild("Body4");
		this.Body5 = this.Body4.getChild("Body5");
		this.Ventral4L = this.Body2.getChild("Ventral4L");
		this.Ventral3L = this.Body2.getChild("Ventral3L");
		this.PectoralL = this.Body1.getChild("PectoralL");
		this.Ventral2L = this.Body1.getChild("Ventral2L");
		this.Ventral1L = this.Body1.getChild("Ventral1L");
		this.Cephalon = this.Headbase.getChild("Cephalon");
		this.Jaw = this.Cephalon.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-19.0F, -2.0F, -26.0F, 34.0F, 2.0F, 53.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Brochoadmones = fossil.addOrReplaceChild("Brochoadmones", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, -21.0F));

		PartDefinition Headbase = Brochoadmones.addOrReplaceChild("Headbase", CubeListBuilder.create().texOffs(48, 38).addBox(-2.4F, -3.0F, 1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2F, 1.0F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = Headbase.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-2.6F, -3.5954F, 0.029F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, -0.5934F, 0.0F, 0.0F));

		PartDefinition Body1 = Headbase.addOrReplaceChild("Body1", CubeListBuilder.create().texOffs(39, 56).addBox(-2.4F, -6.0F, 0.0F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 0).addBox(-3.1F, -12.0F, 0.4F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 0).addBox(-2.6F, -12.0F, 0.4F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.3403F, 0.0F, 0.0F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(26, 56).addBox(-2.3F, -4.0F, 0.0F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(39, 21).addBox(-2.5F, -4.0F, -1.0F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 6.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(15, 40).addBox(-2.5F, -2.0F, 7.0F, 0.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(-2.4F, -2.0F, 0.0F, 0.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-2.2F, -2.0F, -1.0F, 0.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 6.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 22).addBox(-2.6F, -12.0F, 0.0F, 0.0F, 12.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(60, 66).addBox(-3.1F, -12.0F, 0.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition Ventral7L = Body3.addOrReplaceChild("Ventral7L", CubeListBuilder.create(), PartPose.offset(-2.7F, 8.0F, 5.6F));

		PartDefinition cube_r5 = Ventral7L.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 14).addBox(-0.3F, 0.0F, -0.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 0).addBox(0.1F, 0.0F, 0.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3715F, 0.0F, 0.0F));

		PartDefinition Ventral6L = Body3.addOrReplaceChild("Ventral6L", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, 8.0F, 3.1F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Ventral6L.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 38).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0739F, 0.0F, 0.0F));

		PartDefinition Ventral5L = Body3.addOrReplaceChild("Ventral5L", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 8.0F, 1.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Ventral5L.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 56).addBox(-0.7F, -0.5F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 62).addBox(0.0F, 0.0F, -0.7F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0457F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(52, 56).addBox(-2.7F, 5.5F, -4.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-2.4F, -2.0F, -1.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 56).addBox(-2.6F, -1.5F, 0.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -3.0F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 8.5F, -3.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition cube_r10 = Body5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -4.0F, 0.0F, 0.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Body5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 38).addBox(-2.5F, -2.0F, 0.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Ventral4L = Body2.addOrReplaceChild("Ventral4L", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, 6.0F, 4.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Ventral4L.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(8, 56).addBox(-0.6F, -0.3F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 69).addBox(0.0F, 0.0F, -0.3F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0765F, 0.0F, 0.0F));

		PartDefinition Ventral3L = Body2.addOrReplaceChild("Ventral3L", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 6.0F, 1.1F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Ventral3L.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, -0.7F, -1.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(61, 56).addBox(0.3F, -0.5F, -1.5F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, 0.7794F, -0.0328F, 0.0F, 0.0F));

		PartDefinition PectoralL = Body1.addOrReplaceChild("PectoralL", CubeListBuilder.create().texOffs(28, 0).addBox(0.1F, -1.0F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Ventral2L = Body1.addOrReplaceChild("Ventral2L", CubeListBuilder.create().texOffs(71, 56).addBox(0.1F, 0.0F, -0.3F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.75F, 4.0F, 3.5F, 1.1098F, 0.0F, 0.0F));

		PartDefinition Ventral1L = Body1.addOrReplaceChild("Ventral1L", CubeListBuilder.create().texOffs(71, 68).addBox(-0.4F, 0.0F, 0.1F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(-0.9F, 0.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2F, 4.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Cephalon = Headbase.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(42, 43).addBox(-2.4F, -1.4F, -4.9F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, 0.9F));

		PartDefinition cube_r14 = Cephalon.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 31).addBox(-4.3F, -0.8F, -1.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.6F, -2.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Cephalon.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(7, 0).addBox(-2.5F, 0.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, 0.1F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Cephalon.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 48).addBox(-2.6F, -1.2148F, -0.0299F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, -0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Cephalon.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 56).addBox(-2.7F, 0.0F, -4.2F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.1F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Jaw = Cephalon.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(24, 44).addBox(-2.7F, 0.0F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, 0.1F, -0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 84);
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