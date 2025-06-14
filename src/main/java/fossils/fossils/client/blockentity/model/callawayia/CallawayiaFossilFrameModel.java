package fossils.fossils.client.blockentity.model.callawayia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CallawayiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart backleftflipper;
	private final ModelPart backrightflipper;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart upperbody;
	private final ModelPart chest;
	private final ModelPart frontleftflipper;
	private final ModelPart frontrightflipper;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public CallawayiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.backleftflipper = this.main.getChild("backleftflipper");
		this.backrightflipper = this.main.getChild("backrightflipper");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.upperbody = this.main.getChild("upperbody");
		this.chest = this.upperbody.getChild("chest");
		this.frontleftflipper = this.chest.getChild("frontleftflipper");
		this.frontrightflipper = this.chest.getChild("frontrightflipper");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, 6.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 48).addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1678F, 0.8871F, 1.5708F, -0.0349F, -1.5708F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 51).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -1.8309F, 0.9569F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 50).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition backleftflipper = main.addOrReplaceChild("backleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 1.4F, 0.8F, 0.0F, -0.4363F, 0.829F));

		PartDefinition backrightflipper = main.addOrReplaceChild("backrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 1.4F, 0.8F, 0.0F, 0.4363F, -0.829F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 28).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.4F, 3.7F, 0.1309F, -0.1309F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F, 0.4F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, 5.9F, 0.1745F, -0.1745F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, 0.4F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1745F, -0.2618F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.4F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.1F, 0.1309F, -0.2182F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.8F, -0.0177F, -0.1745F, 0.0031F));

		PartDefinition cube_r4 = tail5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 26).addBox(-0.5F, 1.6F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2F, -0.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3F, 3.9F));

		PartDefinition cube_r5 = tail6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 43).addBox(-1.0F, -0.5244F, -0.6972F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 7.0F, 5.2F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 38).addBox(-1.0F, -0.0918F, -0.075F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.6F, 2.1F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 38).addBox(-0.5F, -0.1079F, -2.7848F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6F, 2.1F, -0.5061F, 0.0F, 0.0F));

		PartDefinition upperbody = main.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8F, -0.1F, 0.1233F, -0.0869F, 0.0876F));

		PartDefinition cube_r8 = upperbody.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, 0.7F, 0.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9F, -9.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -9.9F, 0.0398F, -0.0872F, 0.0438F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 42).addBox(-1.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.851F, -10.343F, 1.5708F, 0.2443F, -1.5708F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 48).addBox(-0.5F, -0.5F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.2312F, -10.9962F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(58, 50).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4F, -12.5F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-1, 27).addBox(0.0F, 0.7135F, -0.2537F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(9, 47).addBox(0.0F, -0.3F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -9.8F, 0.1222F, 0.0F, 0.0F));

		PartDefinition frontleftflipper = chest.addOrReplaceChild("frontleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 4.9F, -9.7F, -0.0539F, -0.518F, 0.7635F));

		PartDefinition frontrightflipper = chest.addOrReplaceChild("frontrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 4.9F, -9.7F, 0.0339F, 0.0916F, -0.7802F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -12.5F, -0.0318F, 0.0839F, -0.0949F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 58).addBox(-0.5F, 0.7F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.4F, 0.3316F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -2.5F, 0.0F, 0.5672F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.3043F, -0.0188F, 0.0127F));

		return LayerDefinition.create(meshdefinition, 70, 70);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}