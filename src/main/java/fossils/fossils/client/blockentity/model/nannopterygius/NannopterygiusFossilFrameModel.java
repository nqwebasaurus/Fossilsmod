package fossils.fossils.client.blockentity.model.nannopterygius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NannopterygiusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart frontleftflipper;
	private final ModelPart frontrightflipper;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart backleftflipper;
	private final ModelPart backrightflipper;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public NannopterygiusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.frontleftflipper = this.main.getChild("frontleftflipper");
		this.frontrightflipper = this.main.getChild("frontrightflipper");
		this.neck = this.main.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.backleftflipper = this.body3.getChild("backleftflipper");
		this.backrightflipper = this.body3.getChild("backrightflipper");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.0F, -7.0F, -0.0532F, -0.1264F, -0.264F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.4485F, -0.0497F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.6F, -2.7F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(33, 17).addBox(1.4F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.3079F, -5.65F, -1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 22).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.7F, -6.4F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 23).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -6.4F, 0.2443F, 0.0F, 0.0F));

		PartDefinition frontleftflipper = main.addOrReplaceChild("frontleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 4.2F, -5.6F, 0.0F, -0.3054F, 0.6109F));

		PartDefinition frontrightflipper = main.addOrReplaceChild("frontrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 4.2F, -5.6F, 0.0F, 0.2182F, -0.6109F));

		PartDefinition neck = main.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7F, -6.6F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 33).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.4F, -1.4F, 0.48F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -3.6F, 0.0F, -0.3054F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, 0.4F, 0.5498F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 7.0F, 0.0038F, 0.0435F, 0.0873F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 23).addBox(-0.6F, -1.2046F, -6.753F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.4F, 6.3F, -0.192F, -0.0171F, 0.0033F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, 7.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 9).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 19).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.9F, 6.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 19).addBox(-2.2F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.1F, 0.3F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 24).addBox(-0.5F, -4.0F, -3.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.1F, 3.8F, 1.5708F, 0.0F, 0.0F));

		PartDefinition backleftflipper = body3.addOrReplaceChild("backleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 3.8F, 0.8F, 0.0F, -0.5236F, 0.5672F));

		PartDefinition backrightflipper = body3.addOrReplaceChild("backrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 3.8F, 0.8F, 0.0F, 0.1745F, -0.5672F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 7.7F, -0.1072F, 0.217F, -0.0232F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, 0.5F, -0.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.293F, 0.1742F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.793F, 7.8742F, 0.0894F, 0.2173F, 0.0193F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 40).addBox(-0.5F, 0.6929F, -0.1351F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3996F, 0.0087F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2004F, 4.8087F, -0.9132F, 0.1904F, -0.2403F));

		PartDefinition cube_r13 = tail3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, 0.3F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3442F, 8.0927F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(14, 46).addBox(-0.5F, 0.6F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3442F, -0.1073F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 39).addBox(-0.5F, 0.7052F, 0.144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.4442F, 3.2927F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, 0.7218F, 0.1439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.4442F, 1.3927F, 0.0087F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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