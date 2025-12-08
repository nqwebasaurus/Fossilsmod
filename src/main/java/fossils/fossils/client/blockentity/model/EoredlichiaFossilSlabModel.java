package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EoredlichiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart antennaL;
	private final ModelPart antennaL2;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart tail;

	public EoredlichiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.antennaL = this.bone.getChild("antennaL");
		this.antennaL2 = this.bone.getChild("antennaL2");
		this.body1 = this.bone.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.tail = this.body4.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -2.0F, -14.0F, 22.0F, 2.0F, 22.0F, new CubeDeformation(0.006F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-20.9734F, -1.0F, -14.7606F, 21.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.3265F, -1.0F, 5.0375F, 0.0F, 0.7243F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 43).addBox(-6.6262F, -1.0F, 0.3729F, 7.0F, 2.0F, 19.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(9.6265F, -1.0F, -14.0625F, 0.0F, 0.1833F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 0.0F, -8.2F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-2.5F, 0.0F, -9.2F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 8).addBox(3.35F, 0.01F, -8.25F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(-3.0F, -0.05F, -8.02F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 12).addBox(-1.0F, -0.1F, -8.01F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 8).mirror().addBox(-4.35F, 0.01F, -8.25F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -2.2F, 3.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-9.5F, -0.08F, -2.65F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.65F, 0.2F, -7.4F, 0.0F, 1.4835F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-5.25F, -0.09F, -1.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.65F, 0.2F, -7.4F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-1.7F, -0.1F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.65F, 0.2F, -7.15F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 35).mirror().addBox(-1.75F, 1.02F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.75F, -1.0F, -9.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 11).addBox(4.5F, -0.08F, -2.65F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.65F, 0.2F, -7.4F, 0.0F, -1.4835F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 28).addBox(1.25F, -0.09F, -1.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.65F, 0.2F, -7.4F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 30).addBox(-0.3F, -0.1F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.65F, 0.2F, -7.15F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 35).addBox(-0.25F, 1.02F, -0.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -1.0F, -9.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition antennaL = bone.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(34, 50).addBox(0.0F, 0.1F, -6.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.75F, 0.0F, 0.2618F, 0.0F));

		PartDefinition antennaL2 = bone.addOrReplaceChild("antennaL2", CubeListBuilder.create().texOffs(34, 43).addBox(-7.0F, 0.1F, -6.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -8.75F, 0.0F, -0.6545F, 0.0F));

		PartDefinition body1 = bone.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(9, 46).addBox(2.0F, 0.6F, 0.25F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 43).addBox(-1.0F, 0.35F, -0.01F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(0.5F, 0.5F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).mirror().addBox(-3.5F, 0.5F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 46).mirror().addBox(-4.0F, 0.6F, 0.25F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 16).addBox(-1.5F, 0.49F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-1.5F, 0.48F, 2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -5.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 43).addBox(-0.99F, 0.349F, -0.01F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 38).addBox(1.75F, 0.6F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 19).addBox(0.25F, 0.49F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 19).mirror().addBox(-3.25F, 0.49F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 38).mirror().addBox(-3.75F, 0.6F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, 0.49F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 32).addBox(1.5F, 0.6F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).mirror().addBox(-3.0F, 0.49F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 32).mirror().addBox(-3.5F, 0.6F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 36).addBox(-1.0F, 0.35F, -0.01F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(7, 30).addBox(1.25F, 0.6F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 30).mirror().addBox(-3.25F, 0.6F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 33).addBox(-0.99F, 0.349F, -0.01F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-2.49F, 0.49F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 46).addBox(-1.49F, 0.48F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition tail = body4.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(51, 47).addBox(-0.5F, 1.09F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.75F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 80);
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