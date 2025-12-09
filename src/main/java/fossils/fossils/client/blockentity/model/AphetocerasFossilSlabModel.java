package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AphetocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart shellbase;
	private final ModelPart shell1;
	private final ModelPart shell2;
	private final ModelPart shell3;
	private final ModelPart shell4;
	private final ModelPart shell5;
	private final ModelPart shell6;
	private final ModelPart shell7;
	private final ModelPart shell8;
	private final ModelPart shell9;
	private final ModelPart shell10;
	private final ModelPart shell11;
	private final ModelPart shell12;
	private final ModelPart shelltip;

	public AphetocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.shellbase = this.root.getChild("shellbase");
		this.shell1 = this.shellbase.getChild("shell1");
		this.shell2 = this.shell1.getChild("shell2");
		this.shell3 = this.shell2.getChild("shell3");
		this.shell4 = this.shell3.getChild("shell4");
		this.shell5 = this.shell4.getChild("shell5");
		this.shell6 = this.shell5.getChild("shell6");
		this.shell7 = this.shell6.getChild("shell7");
		this.shell8 = this.shell7.getChild("shell8");
		this.shell9 = this.shell8.getChild("shell9");
		this.shell10 = this.shell9.getChild("shell10");
		this.shell11 = this.shell10.getChild("shell11");
		this.shell12 = this.shell11.getChild("shell12");
		this.shelltip = this.shell12.getChild("shelltip");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(69, 52).addBox(-18.0F, -4.0F, -12.0F, 22.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 0).addBox(-5.7F, -7.0F, -6.0F, 16.0F, 14.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9611F, -6.0F, -13.0108F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 52).addBox(-9.5F, -2.5F, -19.0F, 18.0F, 8.0F, 32.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(7.9741F, -4.5F, -2.6768F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, 0.0F, -57.0F, 19.0F, 11.0F, 40.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0603F, -10.0F, 33.3399F, 0.0F, 0.2618F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-12.0F, -24.0F, 0.0F));

		PartDefinition shellbase = root.addOrReplaceChild("shellbase", CubeListBuilder.create().texOffs(0, 93).addBox(-6.5F, -6.4F, -10.0F, 13.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, 16.9F, 0.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition shell1 = shellbase.addOrReplaceChild("shell1", CubeListBuilder.create().texOffs(86, 84).addBox(-6.0F, -6.0F, 0.0F, 12.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.6F, 0.4538F, 0.0F, 0.0F));

		PartDefinition shell2 = shell1.addOrReplaceChild("shell2", CubeListBuilder.create().texOffs(47, 100).addBox(-4.5F, -6.5F, 0.0F, 11.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.9F, 12.1F, 0.4887F, 0.0F, 0.0F));

		PartDefinition shell3 = shell2.addOrReplaceChild("shell3", CubeListBuilder.create().texOffs(81, 112).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, 9.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition shell4 = shell3.addOrReplaceChild("shell4", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -4.5F, 0.0F, 9.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 11.0F, 0.4887F, 0.0F, 0.0F));

		PartDefinition shell5 = shell4.addOrReplaceChild("shell5", CubeListBuilder.create().texOffs(0, 117).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 7.9F, 0.4887F, 0.0F, 0.0F));

		PartDefinition shell6 = shell5.addOrReplaceChild("shell6", CubeListBuilder.create().texOffs(0, 20).addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 10.2F, 0.5236F, 0.0F, 0.0F));

		PartDefinition shell7 = shell6.addOrReplaceChild("shell7", CubeListBuilder.create().texOffs(119, 33).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 9.2F, 0.5236F, 0.0F, 0.0F));

		PartDefinition shell8 = shell7.addOrReplaceChild("shell8", CubeListBuilder.create().texOffs(0, 52).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 8.3F, 0.6632F, 0.0F, 0.0F));

		PartDefinition shell9 = shell8.addOrReplaceChild("shell9", CubeListBuilder.create().texOffs(0, 67).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 7.8F, 0.5585F, 0.0F, 0.0F));

		PartDefinition shell10 = shell9.addOrReplaceChild("shell10", CubeListBuilder.create().texOffs(79, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.6283F, 0.0F, 0.0F));

		PartDefinition shell11 = shell10.addOrReplaceChild("shell11", CubeListBuilder.create().texOffs(79, 9).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.5585F, 0.0F, 0.0F));

		PartDefinition shell12 = shell11.addOrReplaceChild("shell12", CubeListBuilder.create().texOffs(26, 20).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.6283F, 0.0F, 0.0F));

		PartDefinition shelltip = shell12.addOrReplaceChild("shelltip", CubeListBuilder.create().texOffs(69, 52).addBox(0.0F, -5.0F, 0.0F, 0.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 1.2F, 0.9317F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 150);
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