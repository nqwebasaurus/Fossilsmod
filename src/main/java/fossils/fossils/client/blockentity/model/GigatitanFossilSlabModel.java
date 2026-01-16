package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GigatitanFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart forelegR;
	private final ModelPart forelegR2;
	private final ModelPart forelegR3;
	private final ModelPart forelegR4;
	private final ModelPart legR2;
	private final ModelPart legR4;
	private final ModelPart legR3;
	private final ModelPart legR5;
	private final ModelPart head;
	private final ModelPart antennaL;
	private final ModelPart antennaR;
	private final ModelPart body2;
	private final ModelPart tailR;
	private final ModelPart forewingR;
	private final ModelPart forewingR2;
	private final ModelPart forewingR3;
	private final ModelPart forewingR4;

	public GigatitanFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.forelegR = this.body.getChild("forelegR");
		this.forelegR2 = this.forelegR.getChild("forelegR2");
		this.forelegR3 = this.body.getChild("forelegR3");
		this.forelegR4 = this.forelegR3.getChild("forelegR4");
		this.legR2 = this.body.getChild("legR2");
		this.legR4 = this.body.getChild("legR4");
		this.legR3 = this.body.getChild("legR3");
		this.legR5 = this.body.getChild("legR5");
		this.head = this.body.getChild("head");
		this.antennaL = this.head.getChild("antennaL");
		this.antennaR = this.head.getChild("antennaR");
		this.body2 = this.body.getChild("body2");
		this.tailR = this.body2.getChild("tailR");
		this.forewingR = this.body.getChild("forewingR");
		this.forewingR2 = this.body.getChild("forewingR2");
		this.forewingR3 = this.body.getChild("forewingR3");
		this.forewingR4 = this.body.getChild("forewingR4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1221F, 23.5F, 0.1946F, 0.0F, -0.2094F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-26.9F, -0.5F, -8.0F, 31.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1954F, 0.0F, 9.4876F, 0.0F, -1.3614F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 17).addBox(0.9F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7027F, -1.7F, -1.7813F, 0.0F, 0.0F, 1.5708F));

		PartDefinition forelegR = body.addOrReplaceChild("forelegR", CubeListBuilder.create().texOffs(9, 6).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -0.5F, -0.829F, 0.0F, 0.0F));

		PartDefinition forelegR2 = forelegR.addOrReplaceChild("forelegR2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r2 = forelegR2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 17).addBox(0.0F, 0.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.0F, 1.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition forelegR3 = body.addOrReplaceChild("forelegR3", CubeListBuilder.create().texOffs(9, 0).addBox(0.1F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -0.5F, -1.7017F, 0.0F, 0.0F));

		PartDefinition forelegR4 = forelegR3.addOrReplaceChild("forelegR4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r3 = forelegR4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 17).addBox(0.1F, 0.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legR2 = body.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(0, 17).addBox(-0.265F, -5.076F, -0.1684F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.1F, 1.15F, 0.6545F, 0.0F, 3.1416F));

		PartDefinition legR4 = body.addOrReplaceChild("legR4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.27F, -5.076F, -0.1684F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.1F, 1.15F, 1.5708F, 0.0F, 3.1416F));

		PartDefinition legR3 = body.addOrReplaceChild("legR3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.078F, -4.9021F, -0.1405F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.45F, 0.2172F, 0.0F, -3.1416F));

		PartDefinition legR5 = body.addOrReplaceChild("legR5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.078F, -4.9021F, -0.1405F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.45F, 1.0899F, 0.0F, -3.1416F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(1.01F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -1.5F));

		PartDefinition antennaL = head.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(54, 35).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0F, -0.75F, 0.6545F, 0.0F, 0.0F));

		PartDefinition antennaR = head.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0406F, -4.0F, 0.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -0.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 0).addBox(1.01F, 0.0F, 0.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tailR = body2.addOrReplaceChild("tailR", CubeListBuilder.create().texOffs(5, 0).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.05F, 1.0F, 6.0F));

		PartDefinition forewingR = body.addOrReplaceChild("forewingR", CubeListBuilder.create().texOffs(33, 47).addBox(-2.0F, -0.113F, 0.0F, 4.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.5F, -0.5F, 0.0F, -0.1745F, 1.5708F));

		PartDefinition forewingR2 = body.addOrReplaceChild("forewingR2", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -0.115F, 0.0F, 4.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.8F, -0.5F, 0.0F, -0.6109F, 1.5708F));

		PartDefinition forewingR3 = body.addOrReplaceChild("forewingR3", CubeListBuilder.create().texOffs(33, 34).addBox(-3.0F, -0.115F, 0.0F, 4.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.8F, -0.5F, 0.0F, 0.2182F, 1.5708F));

		PartDefinition forewingR4 = body.addOrReplaceChild("forewingR4", CubeListBuilder.create().texOffs(0, 34).addBox(-3.0F, -0.1F, 0.0F, 4.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.6F, -0.5F, 0.0F, -0.7418F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 70);
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