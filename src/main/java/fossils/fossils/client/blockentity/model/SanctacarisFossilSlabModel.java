package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SanctacarisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart tail;
	private final ModelPart jawL5;
	private final ModelPart legL5;
	private final ModelPart jawL6;
	private final ModelPart legL6;
	private final ModelPart jawL4;
	private final ModelPart legL4;
	private final ModelPart jawL7;
	private final ModelPart legL7;
	private final ModelPart jawL3;
	private final ModelPart legL3;
	private final ModelPart jawL8;
	private final ModelPart legL8;
	private final ModelPart jawL9;
	private final ModelPart legL9;
	private final ModelPart jawL2;
	private final ModelPart legL2;
	private final ModelPart jawL10;
	private final ModelPart legL10;
	private final ModelPart jawL;
	private final ModelPart legL;
	private final ModelPart jawL11;
	private final ModelPart legL11;

	public SanctacarisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Head = this.fossil.getChild("Head");
		this.Body = this.Head.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.tail = this.Body2.getChild("tail");
		this.jawL5 = this.Head.getChild("jawL5");
		this.legL5 = this.jawL5.getChild("legL5");
		this.jawL6 = this.Head.getChild("jawL6");
		this.legL6 = this.jawL6.getChild("legL6");
		this.jawL4 = this.Head.getChild("jawL4");
		this.legL4 = this.jawL4.getChild("legL4");
		this.jawL7 = this.Head.getChild("jawL7");
		this.legL7 = this.jawL7.getChild("legL7");
		this.jawL3 = this.Head.getChild("jawL3");
		this.legL3 = this.jawL3.getChild("legL3");
		this.jawL8 = this.Head.getChild("jawL8");
		this.legL8 = this.jawL8.getChild("legL8");
		this.jawL9 = this.Head.getChild("jawL9");
		this.legL9 = this.jawL9.getChild("legL9");
		this.jawL2 = this.Head.getChild("jawL2");
		this.legL2 = this.jawL2.getChild("legL2");
		this.jawL10 = this.Head.getChild("jawL10");
		this.legL10 = this.jawL10.getChild("legL10");
		this.jawL = this.Head.getChild("jawL");
		this.legL = this.jawL.getChild("legL");
		this.jawL11 = this.Head.getChild("jawL11");
		this.legL11 = this.jawL11.getChild("legL11");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -1.0F, -13.0F, 20.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = fossil.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(12, 32).addBox(2.0F, -0.08F, -7.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-2.0F, -0.1F, -8.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(2.0F, 0.0F, -8.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).mirror().addBox(-3.0F, 0.0F, -8.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 32).mirror().addBox(-6.0F, -0.08F, -7.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.4F, 0.0F));

		PartDefinition Body = Head.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 1.47F, 0.0F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(3.5F, 1.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).mirror().addBox(-5.5F, 1.5F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.5F, -2.5F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(0, 8).addBox(-2.5F, 0.75F, -1.0F, 5.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(25, 32).addBox(2.5F, 0.75F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(25, 32).mirror().addBox(-4.5F, 0.75F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.75F, 7.0F));

		PartDefinition tail = Body2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 23).addBox(-3.0F, 0.4F, 0.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, 6.0F));

		PartDefinition jawL5 = Head.addOrReplaceChild("jawL5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.43F, -0.475F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.25F, -5.25F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL5 = jawL5.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(15, 16).addBox(-1.5F, 0.02F, -5.25F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0F, -0.25F, 0.0F, -1.2654F, 0.0F));

		PartDefinition cube_r1 = legL5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 23).addBox(-0.5F, -0.225F, -4.75F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jawL6 = Head.addOrReplaceChild("jawL6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -0.43F, -0.475F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.25F, -5.25F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL6 = jawL6.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(15, 16).mirror().addBox(-0.5F, 0.02F, -5.25F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.0F, -0.25F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r2 = legL6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 23).mirror().addBox(-0.5F, -0.225F, -4.75F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition jawL4 = Head.addOrReplaceChild("jawL4", CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, -0.45F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.25F, -5.75F, 0.0F, 0.2182F, 0.0F));

		PartDefinition legL4 = jawL4.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(36, 32).addBox(-1.5F, 0.025F, -5.25F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0F, -0.25F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r3 = legL4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 38).addBox(-0.5F, -0.225F, -4.25F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jawL7 = Head.addOrReplaceChild("jawL7", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(-1.0F, -0.45F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.25F, -5.75F, 0.0F, -0.2182F, 0.0F));

		PartDefinition legL7 = jawL7.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-0.5F, 0.025F, -5.25F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.0F, -0.25F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r4 = legL7.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 38).mirror().addBox(-0.5F, -0.225F, -4.25F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition jawL3 = Head.addOrReplaceChild("jawL3", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -0.46F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.25F, -6.25F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL3 = jawL3.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(38, 38).addBox(-1.5F, 0.04F, -4.25F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0F, -0.25F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r5 = legL3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 8).addBox(-0.5F, -0.23F, -3.75F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jawL8 = Head.addOrReplaceChild("jawL8", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -0.46F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.25F, -6.25F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL8 = jawL8.addOrReplaceChild("legL8", CubeListBuilder.create().texOffs(38, 38).addBox(-1.5F, 0.04F, -4.25F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0F, -0.25F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r6 = legL8.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 8).addBox(-0.5F, -0.23F, -3.75F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jawL9 = Head.addOrReplaceChild("jawL9", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-1.0F, -0.46F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.25F, -6.25F, 0.0F, -0.0873F, 0.0F));

		PartDefinition legL9 = jawL9.addOrReplaceChild("legL9", CubeListBuilder.create().texOffs(38, 38).mirror().addBox(-0.5F, 0.04F, -4.25F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.0F, -0.25F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r7 = legL9.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 8).mirror().addBox(-0.5F, -0.23F, -3.75F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition jawL2 = Head.addOrReplaceChild("jawL2", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -0.45F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.25F, -6.75F, 0.0F, 0.0436F, 0.0F));

		PartDefinition legL2 = jawL2.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(27, 39).addBox(-1.5F, 0.05F, -3.75F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.0F, -0.25F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r8 = legL2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.225F, -3.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jawL10 = Head.addOrReplaceChild("jawL10", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, -0.45F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.25F, -6.75F, 0.0F, -0.0436F, 0.0F));

		PartDefinition legL10 = jawL10.addOrReplaceChild("legL10", CubeListBuilder.create().texOffs(27, 39).mirror().addBox(-0.5F, 0.05F, -3.75F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.0F, -0.25F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r9 = legL10.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-0.5F, -0.225F, -3.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition jawL = Head.addOrReplaceChild("jawL", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -0.47F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.25F, -7.25F, 0.0F, 0.1309F, 0.0F));

		PartDefinition legL = jawL.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(8, 42).addBox(-0.5F, -0.075F, -2.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r10 = legL.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 39).addBox(-0.5F, -0.225F, -2.75F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition jawL11 = Head.addOrReplaceChild("jawL11", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-1.0F, -0.47F, -0.475F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.25F, -7.25F, 0.0F, -0.1309F, 0.0F));

		PartDefinition legL11 = jawL11.addOrReplaceChild("legL11", CubeListBuilder.create().texOffs(8, 42).mirror().addBox(-0.5F, -0.075F, -2.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r11 = legL11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 39).mirror().addBox(-0.5F, -0.225F, -2.75F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 60);
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