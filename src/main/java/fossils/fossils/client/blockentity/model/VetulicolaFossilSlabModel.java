package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VetulicolaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Vetulicola;
	private final ModelPart JawUpper;
	private final ModelPart JawLower;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;

	public VetulicolaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Vetulicola = this.fossil.getChild("Vetulicola");
		this.JawUpper = this.Vetulicola.getChild("JawUpper");
		this.JawLower = this.Vetulicola.getChild("JawLower");
		this.Tail = this.Vetulicola.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-6.4074F, -1.0F, -11.2311F, 14.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Vetulicola = fossil.addOrReplaceChild("Vetulicola", CubeListBuilder.create().texOffs(0, 25).addBox(-0.05F, -1.325F, -3.375F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.06F, -1.825F, -3.375F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.175F, -2.625F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = Vetulicola.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.07F, -0.8811F, -3.733F, -0.5585F, 0.0F, -3.1416F));

		PartDefinition cube_r2 = Vetulicola.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 0).addBox(0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.07F, -1.0401F, -3.4786F, -0.5585F, 0.0F, -3.1416F));

		PartDefinition cube_r3 = Vetulicola.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.02F, 0.475F, -3.875F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r4 = Vetulicola.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.325F, 3.125F, 0.0F, 3.1416F, 0.0F));

		PartDefinition JawUpper = Vetulicola.addOrReplaceChild("JawUpper", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.725F, -4.375F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = JawUpper.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.683F, 0.183F, -1.0472F, 0.0F, 3.1416F));

		PartDefinition JawLower = Vetulicola.addOrReplaceChild("JawLower", CubeListBuilder.create(), PartPose.offset(0.0F, 1.675F, -4.375F));

		PartDefinition cube_r6 = JawLower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 0).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0435F, 0.6364F, 2.3562F, 0.0F, 3.1416F));

		PartDefinition cube_r7 = JawLower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.11F, -0.2393F, 0.3536F, 2.3562F, 0.0F, 3.1416F));

		PartDefinition Tail = Vetulicola.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.325F, 3.625F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 4).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.01F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.09F, 1.49F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = Tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.51F, 1.49F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = Tail2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(3, 16).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.01F, 0.49F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.09F, 1.98F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Tail3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = Tail3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.0F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = Tail3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r15 = Tail3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(6, 16).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.3742F, -0.1515F, 0.4625F, 0.0F, -3.1416F));

		PartDefinition cube_r16 = Tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 16).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.817F, -0.163F, -0.5236F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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