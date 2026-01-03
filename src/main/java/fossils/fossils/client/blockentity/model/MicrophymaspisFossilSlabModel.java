package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MicrophymaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart platycaraspis;
	private final ModelPart Cephalon;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart HEadinclination;

	public MicrophymaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.platycaraspis = this.fossil.getChild("platycaraspis");
		this.Cephalon = this.platycaraspis.getChild("Cephalon");
		this.cube_r4 = this.Cephalon.getChild("cube_r4");
		this.cube_r5 = this.Cephalon.getChild("cube_r5");
		this.cube_r6 = this.Cephalon.getChild("cube_r6");
		this.cube_r7 = this.Cephalon.getChild("cube_r7");
		this.cube_r8 = this.Cephalon.getChild("cube_r8");
		this.cube_r9 = this.Cephalon.getChild("cube_r9");
		this.cube_r10 = this.Cephalon.getChild("cube_r10");
		this.cube_r11 = this.Cephalon.getChild("cube_r11");
		this.HEadinclination = this.Cephalon.getChild("HEadinclination");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 41).addBox(-18.2181F, -1.0F, -15.0663F, 18.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.9707F, -1.0F, 14.1265F, 0.0F, -0.2007F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 17).addBox(-10.0561F, -1.0F, 0.2086F, 10.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.9707F, -1.0F, -8.7735F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -2.0F, -10.0F, 30.0F, 2.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -2.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition platycaraspis = fossil.addOrReplaceChild("platycaraspis", CubeListBuilder.create(), PartPose.offset(-4.0F, -4.0F, -2.0F));

		PartDefinition Cephalon = platycaraspis.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(42, 17).addBox(-5.9717F, -0.2724F, -3.566F, 12.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(21, 59).addBox(-3.9717F, -0.2724F, -5.566F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(8.0283F, -0.2724F, 0.434F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(6.0283F, -0.2724F, -1.566F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(42, 27).addBox(-3.9717F, -1.2724F, -3.566F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-8.9717F, -0.2724F, -1.566F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.01F))
				.texOffs(0, 41).addBox(-10.9717F, -0.2724F, 0.434F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.784F, 1.4724F, 1.4196F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r4 = Cephalon.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 59).addBox(-3.0F, -0.5F, -8.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0283F, -1.3724F, 4.434F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Cephalon.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 10).addBox(-0.7F, -1.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0283F, 0.7276F, -6.566F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r6 = Cephalon.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 41).addBox(-0.0422F, -1.0F, -4.1931F, 14.0F, 1.0F, 4.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(-4.1717F, 0.7276F, -6.566F, -3.1416F, -0.7243F, -3.1416F));

		PartDefinition cube_r7 = Cephalon.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-3.6304F, -1.0F, -0.9391F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-6.2717F, 0.7276F, 7.534F, 0.0F, -2.426F, 0.0F));

		PartDefinition cube_r8 = Cephalon.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 5).addBox(1.6304F, -1.0F, -0.9391F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.3283F, 0.7276F, 7.534F, 0.0F, 2.426F, 0.0F));

		PartDefinition cube_r9 = Cephalon.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(55, 59).addBox(-0.1784F, -1.0F, -0.847F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-3.9717F, 0.7276F, -5.566F, -0.0008F, 0.2444F, 0.0F));

		PartDefinition cube_r10 = Cephalon.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 47).addBox(-13.9578F, -1.0F, -4.1931F, 14.0F, 1.0F, 4.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(4.2283F, 0.7276F, -6.566F, -3.1416F, 0.7243F, 3.1416F));

		PartDefinition cube_r11 = Cephalon.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 59).addBox(0.1216F, -1.0F, -3.1259F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0283F, 0.7276F, -5.566F, -3.1416F, 0.2182F, 3.1416F));

		PartDefinition HEadinclination = Cephalon.addOrReplaceChild("HEadinclination", CubeListBuilder.create().texOffs(21, 63).addBox(-3.0F, -0.5F, -0.9F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0283F, -0.2724F, -3.566F, -1.0908F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 70);
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