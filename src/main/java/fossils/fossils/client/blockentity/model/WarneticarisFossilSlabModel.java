package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class WarneticarisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart antennaR;
	private final ModelPart antennaL;
	private final ModelPart antennaR2;
	private final ModelPart antennaL2;
	private final ModelPart eyeR;
	private final ModelPart legR;
	private final ModelPart legRs;
	private final ModelPart legRs2;
	private final ModelPart legL;
	private final ModelPart legLs;
	private final ModelPart legLs2;
	private final ModelPart legR2;
	private final ModelPart legR3;
	private final ModelPart legR4;
	private final ModelPart legR5;
	private final ModelPart legR6;
	private final ModelPart legR7;
	private final ModelPart legR8;
	private final ModelPart legR9;
	private final ModelPart gillR;
	private final ModelPart gillR2;
	private final ModelPart gillR3;
	private final ModelPart seg;
	private final ModelPart gillR4;
	private final ModelPart seg2;
	private final ModelPart gillR5;
	private final ModelPart seg3;
	private final ModelPart seg4;

	public WarneticarisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.antennaR = this.body.getChild("antennaR");
		this.antennaL = this.body.getChild("antennaL");
		this.antennaR2 = this.body.getChild("antennaR2");
		this.antennaL2 = this.body.getChild("antennaL2");
		this.eyeR = this.body.getChild("eyeR");
		this.legR = this.body.getChild("legR");
		this.legRs = this.legR.getChild("legRs");
		this.legRs2 = this.legRs.getChild("legRs2");
		this.legL = this.body.getChild("legL");
		this.legLs = this.legL.getChild("legLs");
		this.legLs2 = this.legLs.getChild("legLs2");
		this.legR2 = this.body.getChild("legR2");
		this.legR3 = this.body.getChild("legR3");
		this.legR4 = this.body.getChild("legR4");
		this.legR5 = this.body.getChild("legR5");
		this.legR6 = this.body.getChild("legR6");
		this.legR7 = this.body.getChild("legR7");
		this.legR8 = this.body.getChild("legR8");
		this.legR9 = this.body.getChild("legR9");
		this.gillR = this.body.getChild("gillR");
		this.gillR2 = this.body.getChild("gillR2");
		this.gillR3 = this.body.getChild("gillR3");
		this.seg = this.body.getChild("seg");
		this.gillR4 = this.seg.getChild("gillR4");
		this.seg2 = this.seg.getChild("seg2");
		this.gillR5 = this.seg2.getChild("gillR5");
		this.seg3 = this.seg2.getChild("seg3");
		this.seg4 = this.seg3.getChild("seg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -2.0F, 2.0F, 25.0F, 2.0F, 13.0F, new CubeDeformation(0.003F))
				.texOffs(0, 16).addBox(-6.0F, -2.0F, -13.0F, 18.0F, 2.0F, 15.0F, new CubeDeformation(0.003F))
				.texOffs(0, 34).addBox(-18.0F, -2.0F, -23.0F, 23.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(64, 0).addBox(-7.0F, -2.0F, 15.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 47).addBox(0.0F, -2.0F, -8.0F, 15.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 23.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 25).addBox(-10.0F, -2.0F, -5.0F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, 23.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 47).addBox(0.0F, -2.0F, -5.0F, 13.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-18.0F, 0.0F, -13.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 34).addBox(0.0F, -2.0F, 0.0F, 12.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, 0.0F, -23.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 16).addBox(0.0F, -2.0F, 0.0F, 13.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 0.0F, 2.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 16).addBox(4.425F, -3.3125F, 1.7573F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(48, 58).addBox(4.425F, -3.3125F, -3.2427F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(3.975F, -4.0625F, -3.9927F, 0.0F, 12.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -6.5375F, 1.7927F, 2.9671F, 0.0F, 1.5708F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 47).addBox(5.375F, 0.0F, -7.0F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -4.0625F, -3.9927F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(4.325F, 0.0F, -6.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3125F, -3.2427F, 0.5585F, 0.0F, 0.0F));

		PartDefinition antennaR = body.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(48, 73).addBox(0.0F, -4.5F, -12.0F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.25F, 0.9375F, -7.4927F, -0.1309F, 0.0F, 0.0F));

		PartDefinition antennaL = body.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(35, 61).addBox(0.0F, -4.5F, -12.0F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.35F, 0.9375F, -7.4927F, -0.4363F, 0.0F, 0.0F));

		PartDefinition antennaR2 = body.addOrReplaceChild("antennaR2", CubeListBuilder.create().texOffs(66, 61).addBox(0.0F, -4.5F, -12.0F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.15F, 0.9375F, -7.2427F, 0.0873F, 0.0F, 0.0F));

		PartDefinition antennaL2 = body.addOrReplaceChild("antennaL2", CubeListBuilder.create().texOffs(53, 55).addBox(0.0F, -4.5F, -12.0F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.25F, 0.9375F, -7.2427F, 0.3927F, 0.0F, 0.0F));

		PartDefinition eyeR = body.addOrReplaceChild("eyeR", CubeListBuilder.create().texOffs(7, 0).addBox(5.375F, -0.5F, -2.25F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 16).addBox(5.0F, -1.0F, -2.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4375F, -7.4927F, 0.4363F, 0.0F, 0.0F));

		PartDefinition legR = body.addOrReplaceChild("legR", CubeListBuilder.create().texOffs(3, 0).addBox(1.025F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.35F, 0.4375F, -4.9927F, 0.7854F, 0.0F, 0.0F));

		PartDefinition legRs = legR.addOrReplaceChild("legRs", CubeListBuilder.create().texOffs(79, 64).addBox(0.775F, -0.5F, -1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -0.5F, -1.0036F, 0.0F, 0.0F));

		PartDefinition legRs2 = legRs.addOrReplaceChild("legRs2", CubeListBuilder.create().texOffs(66, 55).addBox(0.8F, -0.75F, -3.5F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition legL = body.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(0, 0).addBox(1.2F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.05F, 0.4375F, -4.9927F, 1.4835F, 0.0F, 0.0F));

		PartDefinition legLs = legL.addOrReplaceChild("legLs", CubeListBuilder.create().texOffs(59, 58).addBox(1.1F, -0.5F, -1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -0.5F, -2.4435F, 0.0F, 0.0F));

		PartDefinition legLs2 = legLs.addOrReplaceChild("legLs2", CubeListBuilder.create().texOffs(0, 34).addBox(1.125F, -0.75F, -3.5F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition legR2 = body.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(35, 88).addBox(0.525F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, -0.5625F, -1.9927F, -0.2618F, 0.0F, 0.0F));

		PartDefinition legR3 = body.addOrReplaceChild("legR3", CubeListBuilder.create().texOffs(28, 88).addBox(0.525F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.65F, -0.5625F, -1.4927F, -0.0873F, 0.0F, 0.0F));

		PartDefinition legR4 = body.addOrReplaceChild("legR4", CubeListBuilder.create().texOffs(87, 79).addBox(0.525F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.55F, -0.5625F, -0.9927F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legR5 = body.addOrReplaceChild("legR5", CubeListBuilder.create().texOffs(21, 86).addBox(0.525F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.85F, -0.5625F, -0.4927F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legR6 = body.addOrReplaceChild("legR6", CubeListBuilder.create().texOffs(14, 86).addBox(0.525F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, -0.5625F, 0.0073F, 0.1745F, 0.0F, 0.0F));

		PartDefinition legR7 = body.addOrReplaceChild("legR7", CubeListBuilder.create().texOffs(80, 79).addBox(0.525F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.65F, -0.5625F, 0.5073F, 0.2182F, 0.0F, 0.0F));

		PartDefinition legR8 = body.addOrReplaceChild("legR8", CubeListBuilder.create().texOffs(73, 79).addBox(0.7F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.45F, -0.5625F, 1.0073F, 0.5236F, 0.0F, 0.0F));

		PartDefinition legR9 = body.addOrReplaceChild("legR9", CubeListBuilder.create().texOffs(35, 58).addBox(0.525F, 0.0F, -0.5F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.65F, -0.5625F, 1.5073F, 0.3054F, 0.0F, 0.0F));

		PartDefinition gillR = body.addOrReplaceChild("gillR", CubeListBuilder.create().texOffs(0, 89).addBox(0.525F, 0.0F, -0.5F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 0.4375F, 3.0073F, 0.4363F, 0.0F, 0.0F));

		PartDefinition gillR2 = body.addOrReplaceChild("gillR2", CubeListBuilder.create().texOffs(42, 88).addBox(0.525F, 0.0F, -0.5F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 0.4375F, 5.0073F, 0.48F, 0.0F, 0.0F));

		PartDefinition gillR3 = body.addOrReplaceChild("gillR3", CubeListBuilder.create().texOffs(42, 58).addBox(0.525F, 0.0F, -0.5F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 0.4375F, 7.0073F, 0.5672F, 0.0F, 0.0F));

		PartDefinition seg = body.addOrReplaceChild("seg", CubeListBuilder.create().texOffs(0, 16).addBox(2.525F, -0.75F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.5625F, 8.5073F, 0.0436F, 0.0F, 0.0F));

		PartDefinition gillR4 = seg.addOrReplaceChild("gillR4", CubeListBuilder.create().texOffs(85, 11).addBox(0.525F, -1.0F, -0.5F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 3.0F, 0.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition seg2 = seg.addOrReplaceChild("seg2", CubeListBuilder.create().texOffs(61, 75).addBox(2.525F, -0.5F, -1.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.25F, 2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition gillR5 = seg2.addOrReplaceChild("gillR5", CubeListBuilder.create().texOffs(5, 89).addBox(0.525F, -2.0F, -0.5F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 3.25F, 0.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition seg3 = seg2.addOrReplaceChild("seg3", CubeListBuilder.create().texOffs(0, 77).addBox(2.025F, -0.5F, -2.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.25F, 2.975F, 0.5236F, 0.0F, 0.0F));

		PartDefinition seg4 = seg3.addOrReplaceChild("seg4", CubeListBuilder.create().texOffs(52, 25).addBox(-1.0F, 2.525F, -1.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(79, 55).addBox(-0.5F, 2.525F, 3.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.4F, 5.95F, 0.0F, 0.7418F, -1.5708F));

		PartDefinition cube_r8 = seg4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 77).addBox(-1.0F, 2.025F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r9 = seg4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 79).addBox(0.0F, 2.025F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.6F, 0.0F, 0.0F, -0.4363F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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