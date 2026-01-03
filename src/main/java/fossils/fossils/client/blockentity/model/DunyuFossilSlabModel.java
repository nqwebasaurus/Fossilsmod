package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DunyuFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart main;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;

	public DunyuFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.main = this.fossil.getChild("main");
		this.cube_r3 = this.main.getChild("cube_r3");
		this.cube_r4 = this.main.getChild("cube_r4");
		this.cube_r5 = this.main.getChild("cube_r5");
		this.cube_r6 = this.main.getChild("cube_r6");
		this.cube_r7 = this.main.getChild("cube_r7");
		this.cube_r8 = this.main.getChild("cube_r8");
		this.cube_r9 = this.main.getChild("cube_r9");
		this.cube_r10 = this.main.getChild("cube_r10");
		this.cube_r11 = this.main.getChild("cube_r11");
		this.cube_r12 = this.main.getChild("cube_r12");
		this.cube_r13 = this.main.getChild("cube_r13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(30, 18).addBox(-8.3475F, -1.0F, 3.5131F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 18).addBox(-0.0112F, -1.0F, 0.8091F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.6F, 0.0F, -7.0F, 0.0F, -0.4189F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(3, 3).addBox(-1.0F, -1.0F, -5.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create().texOffs(30, 0).addBox(-1.4226F, -0.3158F, -4.4881F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(23, 35).addBox(-1.983F, -1.0158F, 0.3954F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0226F, -1.3842F, -0.5619F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 39).addBox(-2.175F, 0.0F, -1.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.4453F, -0.3158F, 2.6614F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 31).addBox(-0.825F, 0.0F, -1.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.2906F, -0.3158F, 2.6614F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(29, 24).addBox(0.0494F, 0.0F, -0.0003F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.0374F, -0.3158F, 1.2013F, 0.0F, -1.6232F, 0.0F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 38).addBox(-4.0494F, 0.0F, -0.0003F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-4.8827F, -0.3158F, 1.2013F, 0.0F, 1.6232F, 0.0F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(0.165F, 0.0F, 0.3238F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.6836F, -0.3158F, -1.9126F, 0.0F, -1.3526F, 0.0F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 6).addBox(-3.165F, 0.0F, 0.3238F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.5289F, -0.3158F, -1.9126F, 0.0F, 1.3526F, 0.0F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 8).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5774F, -0.3158F, -4.4881F, 0.0F, -0.781F, 0.0F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 33).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.4226F, -0.3158F, -4.4881F, 0.0F, 0.781F, 0.0F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.6957F, -1.1153F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(0.5F, 0.6457F, -1.6153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5774F, -1.7548F, -0.9185F, 0.1242F, -0.0414F, 0.3203F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 12).addBox(-1.5F, 0.6457F, -1.6153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-2.0F, 0.6957F, -1.1153F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4226F, -1.7548F, -0.9185F, 0.1242F, 0.0414F, -0.3203F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 0.4F, -4.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0774F, -1.8158F, -0.4881F, 0.2793F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 60, 44);
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