package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OsteolepisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart Osteolepis;
	private final ModelPart Cephalon;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart Jaw;
	private final ModelPart cube_r5;
	private final ModelPart Body1;
	private final ModelPart PectoralL;
	private final ModelPart Body2;
	private final ModelPart cube_r6;
	private final ModelPart Body3;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart VentralL;
	private final ModelPart Body4;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart Bady5;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;

	public OsteolepisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.Osteolepis = this.fossil.getChild("Osteolepis");
		this.Cephalon = this.Osteolepis.getChild("Cephalon");
		this.cube_r2 = this.Cephalon.getChild("cube_r2");
		this.cube_r3 = this.Cephalon.getChild("cube_r3");
		this.cube_r4 = this.Cephalon.getChild("cube_r4");
		this.Jaw = this.Cephalon.getChild("Jaw");
		this.cube_r5 = this.Jaw.getChild("cube_r5");
		this.Body1 = this.Osteolepis.getChild("Body1");
		this.PectoralL = this.Body1.getChild("PectoralL");
		this.Body2 = this.Body1.getChild("Body2");
		this.cube_r6 = this.Body2.getChild("cube_r6");
		this.Body3 = this.Body2.getChild("Body3");
		this.cube_r7 = this.Body3.getChild("cube_r7");
		this.cube_r8 = this.Body3.getChild("cube_r8");
		this.cube_r9 = this.Body3.getChild("cube_r9");
		this.VentralL = this.Body3.getChild("VentralL");
		this.Body4 = this.Body3.getChild("Body4");
		this.cube_r10 = this.Body4.getChild("cube_r10");
		this.cube_r11 = this.Body4.getChild("cube_r11");
		this.cube_r12 = this.Body4.getChild("cube_r12");
		this.Bady5 = this.Body4.getChild("Bady5");
		this.cube_r13 = this.Bady5.getChild("cube_r13");
		this.cube_r14 = this.Bady5.getChild("cube_r14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -2.0F, -21.0F, 21.0F, 2.0F, 42.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(-11.0F, -3.0F, 14.0F, 16.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(65, 45).addBox(-11.0F, -3.0F, 18.0F, 18.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(0, 45).addBox(-11.0F, -3.0F, -14.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.004F))
				.texOffs(11, 12).addBox(-11.0F, -3.0F, -17.2F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -3.0F, 0.0F, 16.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.0F, 0.0F, -14.0F, 0.0F, -0.2007F, 0.0F));

		PartDefinition Osteolepis = fossil.addOrReplaceChild("Osteolepis", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -3.2F, -6.0F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition Cephalon = Osteolepis.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(28, 35).addBox(0.1F, -1.3F, -4.6F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.7F, -3.3F));

		PartDefinition cube_r2 = Cephalon.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, -0.5578F, -0.5516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Cephalon.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 23).addBox(0.2F, -0.9F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -0.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Cephalon.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.3F, -4.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Jaw = Cephalon.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(22, 33).addBox(-0.1F, 0.0F, -4.9F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.0F, 0.2F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Jaw.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 32).addBox(-0.1F, -1.1F, -4.9F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7F, 0.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Body1 = Osteolepis.addOrReplaceChild("Body1", CubeListBuilder.create().texOffs(0, 45).addBox(0.3F, -1.2F, 0.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.8F, -3.3F));

		PartDefinition PectoralL = Body1.addOrReplaceChild("PectoralL", CubeListBuilder.create().texOffs(0, 6).addBox(-0.1938F, -0.5167F, -0.0875F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(11, 18).addBox(-0.0938F, -1.3167F, 0.0125F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.9F, 0.5F, -1.5708F, -1.0472F, 1.5708F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(21, 12).addBox(0.2F, -1.75F, -0.45F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.55F, 3.05F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(35, 12).addBox(0.1F, -3.4F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 3.25F, -0.48F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 5.25F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 26).addBox(0.2F, -2.9F, -0.7F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 17).addBox(0.1F, -1.8F, 0.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 23).addBox(0.3F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition VentralL = Body3.addOrReplaceChild("VentralL", CubeListBuilder.create().texOffs(16, 45).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.5F, 3.6F, -1.1177F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(23, 45).addBox(0.0F, -0.8F, -0.4F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 45).addBox(0.2F, -1.1F, -0.2F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 12).addBox(0.4F, -0.0002F, -0.2209F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bady5 = Body4.addOrReplaceChild("Bady5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.8F, 3.6F));

		PartDefinition cube_r13 = Bady5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 12).addBox(0.1F, -2.0F, 0.0F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.5F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Bady5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 27).addBox(-0.2F, -0.1277F, -0.468F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, 0.2F, 0.2443F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 80);
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