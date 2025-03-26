package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AlienumFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart tail2;

	public AlienumFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.body = this.main.getChild("body");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0828F, -11.569F, 1.0F, 12.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2422F, 23.0F, -2.231F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 13.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -3.0828F, -11.569F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 30).addBox(-1.0F, -0.025F, 0.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -7.1578F, 0.756F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 44).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -2.1578F, 6.981F, -0.1745F, 0.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.45F, 2.9172F, -1.819F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(39, 0).addBox(-0.45F, -0.75F, -8.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(31, 44).addBox(-0.4F, -0.25F, -7.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(12, 50).addBox(-0.45F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offset(0.0F, -2.25F, 2.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 22).addBox(-0.45F, 2.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(7, 50).addBox(-0.45F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.75F, -8.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 13).addBox(-1.45F, 0.0F, -8.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.975F, 3.3028F, 1.0621F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 22).addBox(-1.45F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.0F, 4.1637F, -0.0599F, 1.7017F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 50).addBox(-0.45F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 50).addBox(-0.95F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.075F, 2.375F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition cube_r8 = tail2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 51).addBox(-1.45F, -0.3673F, -0.0846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, -0.3F, -0.2F, -0.1614F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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