package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KaykayFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Kaykay;
	private final ModelPart Head;
	private final ModelPart Maxillary;
	private final ModelPart Maxillary2;
	private final ModelPart Jaw;
	private final ModelPart rock;

	public KaykayFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Kaykay = this.fossil.getChild("Kaykay");
		this.Head = this.Kaykay.getChild("Head");
		this.Maxillary = this.Head.getChild("Maxillary");
		this.Maxillary2 = this.Head.getChild("Maxillary2");
		this.Jaw = this.Head.getChild("Jaw");
		this.rock = this.fossil.getChild("rock");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Kaykay = fossil.addOrReplaceChild("Kaykay", CubeListBuilder.create(), PartPose.offset(2.0F, 1.5F, -4.0F));

		PartDefinition Head = Kaykay.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(33, 0).addBox(-1.375F, -4.0277F, 0.9413F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.375F, -3.0277F, 4.9413F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-1.375F, -5.0277F, 4.9413F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.002F))
				.texOffs(41, 68).addBox(-1.375F, -1.0277F, -4.0587F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(0, 71).addBox(-1.375F, -0.0277F, -6.9587F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(72, 11).addBox(0.525F, 0.2723F, -6.9587F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 65).addBox(-1.275F, 0.2723F, -6.9587F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-1.875F, -3.0277F, -1.0587F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.5322F, -3.625F, 0.1401F, -0.3914F, 0.0334F, -1.4901F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 71).addBox(-1.4F, -0.7F, 0.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 73).addBox(0.4F, -0.7F, 0.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(70, 61).addBox(-1.5F, -1.0F, 0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.125F, 0.9723F, -4.0587F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 57).addBox(-1.5F, -0.0855F, 2.9894F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(54, 70).addBox(-1.5F, -0.0855F, -0.0106F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.375F, -4.9277F, 2.0413F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 57).addBox(-1.5F, 0.0F, -6.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F))
				.texOffs(44, 14).addBox(-1.0F, 0.9F, -6.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(11, 71).addBox(-1.0F, 0.0F, -8.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, -4.0277F, 0.2413F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 44).addBox(-0.5F, -2.0F, 0.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 5.5723F, 4.9413F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 64).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 5.0723F, 0.9413F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 70).addBox(-1.5F, 1.9993F, 2.9185F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.03F))
				.texOffs(33, 14).addBox(-1.5F, 2.4993F, 3.4185F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-0.375F, -4.6277F, -4.0587F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Maxillary = Head.addOrReplaceChild("Maxillary", CubeListBuilder.create().texOffs(28, 66).addBox(-0.4F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.125F, 0.9723F, -4.0587F, -0.8811F, 0.1822F, 0.1081F));

		PartDefinition cube_r7 = Maxillary.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Maxillary2 = Head.addOrReplaceChild("Maxillary2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.875F, 0.9723F, -4.0587F, -0.7939F, -0.1822F, -0.1081F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(60, 7).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(71, 3).addBox(1.1F, -0.6F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 24).addBox(-0.8F, -0.6F, -6.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(-1.1F, -0.6F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 0).addBox(0.8F, -0.6F, -6.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 20).addBox(-1.0F, 1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 1.9723F, 0.9413F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Jaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.0046F, 0.0231F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 2.5F, -2.4F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Jaw.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0028F, 0.008F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.3F, -6.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Jaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 20).addBox(-0.5F, -1.0449F, 0.0389F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Jaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 16).addBox(0.7F, -0.6F, -1.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(14, 16).addBox(-1.0F, 0.0F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 20).addBox(-0.7F, -0.6F, -1.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rock = fossil.addOrReplaceChild("rock", CubeListBuilder.create().texOffs(0, 27).addBox(-10.0F, -2.0F, -5.0F, 18.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(43, 44).addBox(-10.0F, -3.0F, 9.0F, 10.0F, 3.0F, 9.0F, new CubeDeformation(0.02F))
				.texOffs(21, 56).addBox(0.0F, -2.0F, -10.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -4.0F));

		PartDefinition cube_r12 = rock.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 0).addBox(-1.75F, -1.0F, 1.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.25F, -1.25F, -8.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r13 = rock.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(51, 32).addBox(-15.0F, -2.0F, 0.0F, 15.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r14 = rock.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -2.0F, -9.0F, 12.0F, 2.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 18.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r15 = rock.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(51, 20).addBox(-1.75F, -3.0F, 5.75F, 9.0F, 1.0F, 10.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r16 = rock.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 56).addBox(-4.75F, -1.0F, -5.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-6.4482F, -2.0F, 4.88F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r17 = rock.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 0).addBox(-0.25F, -3.0F, 3.0F, 4.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.25F, -2.0F, -3.0F, 4.0F, 2.0F, 24.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-13.5F, 0.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 92, 78);
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