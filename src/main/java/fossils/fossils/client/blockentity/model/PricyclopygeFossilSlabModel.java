package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PricyclopygeFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Smalltrilo;
	private final ModelPart Antennae1;
	private final ModelPart Antennae2;
	private final ModelPart Thorax1;
	private final ModelPart Thorax2;
	private final ModelPart Thorax3;
	private final ModelPart LLeg5;

	public PricyclopygeFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Smalltrilo = this.fossil.getChild("Smalltrilo");
		this.Antennae1 = this.Smalltrilo.getChild("Antennae1");
		this.Antennae2 = this.Smalltrilo.getChild("Antennae2");
		this.Thorax1 = this.Smalltrilo.getChild("Thorax1");
		this.Thorax2 = this.Thorax1.getChild("Thorax2");
		this.Thorax3 = this.Thorax2.getChild("Thorax3");
		this.LLeg5 = this.Thorax3.getChild("LLeg5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -2.0F, -12.0F, 16.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Smalltrilo = fossil.addOrReplaceChild("Smalltrilo", CubeListBuilder.create().texOffs(17, 4).addBox(-2.1F, 0.6153F, -0.0399F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -4.2653F, -2.6601F, 0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = Smalltrilo.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6153F, -0.0399F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Smalltrilo.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 15).addBox(-4.2F, -1.0F, -1.575F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-4.3F, -1.5F, -2.075F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.3847F, 0.9601F, -0.4051F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Smalltrilo.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 0).addBox(-1.9F, -2.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6918F, -1.8139F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Smalltrilo.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 6).addBox(-2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.5521F, -0.0921F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Antennae1 = Smalltrilo.addOrReplaceChild("Antennae1", CubeListBuilder.create().texOffs(0, 27).addBox(0.0096F, -2.0F, 0.0054F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9596F, -2.2847F, -2.0453F));

		PartDefinition Antennae2 = Smalltrilo.addOrReplaceChild("Antennae2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0096F, -2.0F, 0.0054F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0404F, -2.2847F, -2.0453F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Thorax1 = Smalltrilo.addOrReplaceChild("Thorax1", CubeListBuilder.create().texOffs(10, 17).addBox(-2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4653F, 1.9601F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Thorax1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 14).addBox(-0.1104F, 0.0925F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0797F, -0.8597F, 1.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Thorax2 = Thorax1.addOrReplaceChild("Thorax2", CubeListBuilder.create().texOffs(5, 17).addBox(-2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r6 = Thorax2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 7).addBox(-0.0928F, -3.497F, 1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.5F, -1.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Thorax3 = Thorax2.addOrReplaceChild("Thorax3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 0).addBox(-2.2F, -1.1F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.9F));

		PartDefinition cube_r7 = Thorax3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 14).addBox(-0.1428F, -3.572F, 3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.5F, -3.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition LLeg5 = Thorax3.addOrReplaceChild("LLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3176F, -0.7275F, 0.5F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 80, 40);
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