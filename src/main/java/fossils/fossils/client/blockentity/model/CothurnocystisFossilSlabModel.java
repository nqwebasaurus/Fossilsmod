package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CothurnocystisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart creatures;
	private final ModelPart cothurnocystis;
	private final ModelPart front;
	private final ModelPart arm1;
	private final ModelPart arm2;
	private final ModelPart arm3;
	private final ModelPart arm5;
	private final ModelPart arm6;
	private final ModelPart arm7;
	private final ModelPart armlong;
	private final ModelPart armmedium;
	private final ModelPart armshort;
	private final ModelPart cothurnocystisnotail;
	private final ModelPart armlong3;
	private final ModelPart armmedium3;
	private final ModelPart armshort3;
	private final ModelPart cothurnocystisbroken;
	private final ModelPart front2;
	private final ModelPart arm4;
	private final ModelPart armlong2;
	private final ModelPart armmedium2;
	private final ModelPart armshort2;

	public CothurnocystisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.creatures = this.fossil.getChild("creatures");
		this.cothurnocystis = this.creatures.getChild("cothurnocystis");
		this.front = this.cothurnocystis.getChild("front");
		this.arm1 = this.front.getChild("arm1");
		this.arm2 = this.arm1.getChild("arm2");
		this.arm3 = this.arm2.getChild("arm3");
		this.arm5 = this.front.getChild("arm5");
		this.arm6 = this.arm5.getChild("arm6");
		this.arm7 = this.arm6.getChild("arm7");
		this.armlong = this.cothurnocystis.getChild("armlong");
		this.armmedium = this.cothurnocystis.getChild("armmedium");
		this.armshort = this.cothurnocystis.getChild("armshort");
		this.cothurnocystisnotail = this.creatures.getChild("cothurnocystisnotail");
		this.armlong3 = this.cothurnocystisnotail.getChild("armlong3");
		this.armmedium3 = this.cothurnocystisnotail.getChild("armmedium3");
		this.armshort3 = this.cothurnocystisnotail.getChild("armshort3");
		this.cothurnocystisbroken = this.creatures.getChild("cothurnocystisbroken");
		this.front2 = this.cothurnocystisbroken.getChild("front2");
		this.arm4 = this.front2.getChild("arm4");
		this.armlong2 = this.cothurnocystisbroken.getChild("armlong2");
		this.armmedium2 = this.cothurnocystisbroken.getChild("armmedium2");
		this.armshort2 = this.cothurnocystisbroken.getChild("armshort2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 105).addBox(-0.6838F, -1.0F, -0.3317F, 13.0F, 2.0F, 45.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-31.1046F, -1.0F, 17.6544F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-27.5F, -1.0F, -35.0F, 54.0F, 2.0F, 67.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-6.1046F, -1.0F, -18.3456F, 0.0F, 1.8762F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 70).addBox(-37.2F, -1.0F, -17.3F, 55.0F, 2.0F, 32.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(25.0F, -1.0F, -3.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition creatures = fossil.addOrReplaceChild("creatures", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cothurnocystis = creatures.addOrReplaceChild("cothurnocystis", CubeListBuilder.create().texOffs(19, 1).addBox(2.0F, -0.4F, -6.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(19, 29).addBox(-5.0F, -0.4F, -6.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(21, 40).addBox(-6.0F, -0.4F, -4.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 14).addBox(-6.0F, -0.4F, -6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 12).addBox(-3.0F, -0.4F, -7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r4 = cothurnocystis.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 40).addBox(-0.65F, -0.35F, -0.7F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 0.0F, -6.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition front = cothurnocystis.addOrReplaceChild("front", CubeListBuilder.create().texOffs(38, 4).addBox(-1.5F, 0.125F, -3.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -6.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition arm1 = front.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition arm2 = arm1.addOrReplaceChild("arm2", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.01F, -3.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition arm3 = arm2.addOrReplaceChild("arm3", CubeListBuilder.create().texOffs(7, 40).addBox(-0.5F, 0.02F, -4.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition arm5 = front.addOrReplaceChild("arm5", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 0.0F, 2.0F, 0.0F, 2.618F, 0.0F));

		PartDefinition arm6 = arm5.addOrReplaceChild("arm6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.01F, -3.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition arm7 = arm6.addOrReplaceChild("arm7", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.02F, -4.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition armlong = cothurnocystis.addOrReplaceChild("armlong", CubeListBuilder.create().texOffs(22, 23).addBox(-7.5F, -0.5F, 0.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 4.0F));

		PartDefinition armmedium = cothurnocystis.addOrReplaceChild("armmedium", CubeListBuilder.create().texOffs(33, 34).addBox(-4.0F, -0.5F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, -2.0F));

		PartDefinition armshort = cothurnocystis.addOrReplaceChild("armshort", CubeListBuilder.create().texOffs(28, 40).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 0.0F, 4.0F));

		PartDefinition cothurnocystisnotail = creatures.addOrReplaceChild("cothurnocystisnotail", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -0.2F, -6.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(25, 18).addBox(-5.0F, -0.2F, -6.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(19, 18).addBox(-6.0F, -0.2F, -4.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 8).addBox(-6.0F, -0.2F, -6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-3.0F, -0.2F, -7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -2.0F, -18.0F, 0.0F, 1.9635F, 0.0F));

		PartDefinition cube_r5 = cothurnocystisnotail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 7).addBox(-0.65F, 0.05F, -0.7F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -0.2F, -6.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armlong3 = cothurnocystisnotail.addOrReplaceChild("armlong3", CubeListBuilder.create().texOffs(19, 12).addBox(-7.5F, -0.2F, 0.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 4.0F));

		PartDefinition armmedium3 = cothurnocystisnotail.addOrReplaceChild("armmedium3", CubeListBuilder.create().texOffs(0, 33).addBox(-4.0F, -0.2F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, -2.0F));

		PartDefinition armshort3 = cothurnocystisnotail.addOrReplaceChild("armshort3", CubeListBuilder.create().texOffs(19, 4).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 0.0F, 4.0F));

		PartDefinition cothurnocystisbroken = creatures.addOrReplaceChild("cothurnocystisbroken", CubeListBuilder.create().texOffs(0, 11).addBox(2.0F, -0.2F, -6.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-5.0F, -0.2F, -6.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(38, 29).addBox(-6.0F, -0.2F, -4.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 19).addBox(-6.0F, -0.2F, -6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-3.0F, -0.2F, -7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -2.0F, -30.0F, 0.0F, -1.6144F, 0.0F));

		PartDefinition cube_r6 = cothurnocystisbroken.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 8).addBox(-0.65F, 0.05F, -0.7F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -0.2F, -6.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition front2 = cothurnocystisbroken.addOrReplaceChild("front2", CubeListBuilder.create().texOffs(38, 0).addBox(-1.5F, 0.325F, -3.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -6.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition arm4 = front2.addOrReplaceChild("arm4", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition armlong2 = cothurnocystisbroken.addOrReplaceChild("armlong2", CubeListBuilder.create().texOffs(0, 22).addBox(-7.5F, -0.2F, 0.0F, 8.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 4.0F));

		PartDefinition armmedium2 = cothurnocystisbroken.addOrReplaceChild("armmedium2", CubeListBuilder.create().texOffs(14, 34).addBox(-4.0F, -0.2F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, -2.0F));

		PartDefinition armshort2 = cothurnocystisbroken.addOrReplaceChild("armshort2", CubeListBuilder.create().texOffs(28, 34).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 0.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 256, 180);
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