package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TuzoiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart valveright;
	private final ModelPart valveleft;

	public TuzoiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.valveright = this.body.getChild("valveright");
		this.valveleft = this.body.getChild("valveleft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 19.25F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-10.3856F, -1.0F, -3.754F, 41.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(10.9503F, -1.0F, -14.0368F, 22.0F, 1.0F, 37.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 77).addBox(3.1138F, -1.0F, -3.7697F, 30.0F, 1.0F, 17.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 39).addBox(-11.4711F, -1.0F, -12.5696F, 42.0F, 1.0F, 17.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 96).addBox(11.7758F, -1.0F, -12.6674F, 21.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(77, 114).addBox(-9.8004F, -1.0F, -19.8794F, 17.0F, 1.0F, 14.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 98).addBox(-15.4624F, -1.0F, -20.617F, 24.0F, 1.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, 1.4181F, 0.0F));

		PartDefinition cube_r7 = fossil.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 115).addBox(12.8925F, -1.0F, -15.6642F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r8 = fossil.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 77).addBox(-2.4002F, -1.0F, -29.3128F, 22.0F, 1.0F, 19.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(-4.9F, 4.0F, -4.3F, 0.0F, -0.0436F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, 6.2F, 5.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition valveright = body.addOrReplaceChild("valveright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4F, -6.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r9 = valveright.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(119, 18).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, 1.75F, 0.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition cube_r10 = valveright.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(117, 58).addBox(-3.0F, 4.5F, -8.0F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3481F, -3.0041F, -26.0F, -3.1416F, 0.829F, 2.7925F));

		PartDefinition cube_r11 = valveright.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(119, 0).addBox(-5.3246F, -0.5F, -2.1182F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.6519F, -3.0041F, -16.0F, 0.0F, 1.2217F, -0.3491F));

		PartDefinition cube_r12 = valveright.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(119, 40).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition valveleft = body.addOrReplaceChild("valveleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4F, -6.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r13 = valveleft.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 130).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 1.75F, 0.0F, 0.0F, 0.0F, 1.9199F));

		PartDefinition cube_r14 = valveleft.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(90, 130).addBox(0.0F, 0.0F, -1.0F, 5.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 192, 192);
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