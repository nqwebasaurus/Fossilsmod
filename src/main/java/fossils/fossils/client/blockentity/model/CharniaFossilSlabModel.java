package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CharniaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart rock;
	private final ModelPart frond1;
	private final ModelPart frond2;
	private final ModelPart frond3;
	private final ModelPart frond4;

	public CharniaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.rock = this.fossil.getChild("rock");
		this.frond1 = this.rock.getChild("frond1");
		this.frond2 = this.frond1.getChild("frond2");
		this.frond3 = this.frond2.getChild("frond3");
		this.frond4 = this.frond3.getChild("frond4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rock = fossil.addOrReplaceChild("rock", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = rock.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 14).addBox(-5.0F, -1.0F, -5.25F, 23.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5422F, -1.0F, 6.8399F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r2 = rock.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 22).addBox(-1.75F, -1.0F, -3.0F, 12.0F, 2.0F, 6.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-14.2151F, -1.0F, -1.3336F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r3 = rock.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).addBox(-5.75F, -1.0F, -2.5F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2591F, -1.0F, -3.7344F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r4 = rock.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 30).addBox(-1.0F, -1.0F, -2.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-15.5527F, -1.0F, -2.1814F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r5 = rock.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-22.25F, -1.0F, -0.25F, 27.0F, 2.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(14.0F, -1.0F, -4.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition frond1 = rock.addOrReplaceChild("frond1", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 7.9F, -16.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition frond2 = frond1.addOrReplaceChild("frond2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -2.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.5F, -1.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(-1.5F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 2).addBox(-1.5F, 0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-1.0F, 1.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -20.1F, -10.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition frond3 = frond2.addOrReplaceChild("frond3", CubeListBuilder.create().texOffs(0, 17).addBox(-9.5F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-9.5F, -4.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-9.5F, -3.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 11).addBox(-9.5F, -2.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-9.5F, -1.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -2.5F, -8.0F));

		PartDefinition frond4 = frond3.addOrReplaceChild("frond4", CubeListBuilder.create().texOffs(0, 16).addBox(-9.5F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 10).addBox(-9.5F, -4.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-9.5F, -3.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 9).addBox(-9.5F, -2.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(5, 8).addBox(-9.5F, -1.0F, 8.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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