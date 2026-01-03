package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GuiyuFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Guiyu;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart Body1;
	private final ModelPart PectoralL;
	private final ModelPart PectoralR;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart AnalL;
	private final ModelPart Body4;
	private final ModelPart Body5;

	public GuiyuFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Guiyu = this.fossil.getChild("Guiyu");
		this.Head = this.Guiyu.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.Body1 = this.Head.getChild("Body1");
		this.PectoralL = this.Body1.getChild("PectoralL");
		this.PectoralR = this.Body1.getChild("PectoralR");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.AnalL = this.Body3.getChild("AnalL");
		this.Body4 = this.Body3.getChild("Body4");
		this.Body5 = this.Body4.getChild("Body5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -2.0F, -23.0F, 29.0F, 2.0F, 45.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Guiyu = fossil.addOrReplaceChild("Guiyu", CubeListBuilder.create(), PartPose.offset(4.0F, 8.8F, -3.0F));

		PartDefinition Head = Guiyu.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 57).addBox(-2.1F, -1.6F, -7.2F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(50, 48).addBox(-1.7F, -3.0F, -4.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-5.4F, -13.3F, -9.3F, -0.6545F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 54).addBox(-2.0F, -1.9563F, -0.4924F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 15).addBox(-2.2F, 0.4861F, -2.1768F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-1.9F, -0.0139F, -1.9768F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -7.2F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 19).addBox(-1.5F, -0.0458F, 0.0617F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.3F, -4.1F, -1.7F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 48).addBox(-1.5F, 0.0F, -0.2F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -1.9F, -7.0F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -0.2457F, -7.4974F, 2.6093F, 0.0F, 3.1416F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, -1.8F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 57).addBox(-2.0F, -2.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -7.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(11, 57).addBox(-1.7F, -0.2F, -3.9F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(24, 38).addBox(-1.9F, -0.4F, -3.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.8F, -4.0F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Jaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 0).addBox(-2.1F, -1.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 2).addBox(-1.8F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Jaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 57).addBox(-1.6F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Body1 = Head.addOrReplaceChild("Body1", CubeListBuilder.create().texOffs(10, 14).addBox(-1.9F, -4.3F, 0.0F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 8).addBox(-2.2F, 0.7F, 1.4F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3F, 0.0F, 0.4712F, 0.0F, 0.0F));

		PartDefinition PectoralL = Body1.addOrReplaceChild("PectoralL", CubeListBuilder.create().texOffs(12, 34).addBox(-0.1402F, -0.0376F, -1.3987F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 3.5F, 1.3F, 0.0F, -0.48F, 1.5708F));

		PartDefinition PectoralR = Body1.addOrReplaceChild("PectoralR", CubeListBuilder.create().texOffs(25, 0).addBox(-5.8598F, -0.0376F, -1.3987F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.5F, 1.3F, 0.0F, 1.0908F, -1.5708F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(18, 0).addBox(-2.0F, -4.0F, -1.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 38).addBox(-1.5F, 0.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -4.3F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -0.5897F, -5.9637F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 3.9F, 4.9F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(26, 19).addBox(-2.1F, -2.2F, -1.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(32, 4).addBox(-1.5F, -2.1F, -1.4F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 4.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 24).addBox(-2.3F, -5.0F, -0.1F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(26, 48).addBox(-2.3F, 0.0F, -0.1F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition AnalL = Body3.addOrReplaceChild("AnalL", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 3.0F, 0.6F, 0.0F, -1.0472F, 1.5708F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(31, 31).addBox(-2.2F, -1.2F, -1.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 14).addBox(-2.4F, -0.4123F, -0.5197F, 0.0F, 4.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 3.1F, 0.9F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 24).addBox(-2.3F, -1.8719F, -6.6501F, 0.0F, 2.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.0F, 5.4F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Body4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 48).addBox(-2.4F, 0.0F, 0.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(39, 48).addBox(-2.2F, -1.5F, -1.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.002F))
				.texOffs(0, 0).addBox(-2.3F, -6.3F, 2.0F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 5.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Body5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 26).addBox(-2.4F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -0.1F, 0.2269F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 70);
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