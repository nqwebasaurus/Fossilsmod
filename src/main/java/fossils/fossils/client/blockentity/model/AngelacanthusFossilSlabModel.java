package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AngelacanthusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart backleftfin;
	private final ModelPart backrightfin;
	private final ModelPart frontleftfin;
	private final ModelPart frontrightfin;

	public AngelacanthusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.head = this.main.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.backleftfin = this.main.getChild("backleftfin");
		this.backrightfin = this.main.getChild("backrightfin");
		this.frontleftfin = this.main.getChild("frontleftfin");
		this.frontrightfin = this.main.getChild("frontrightfin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-14.5F, -2.0F, -14.0F, 29.0F, 1.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, -2.5357F, -2.849F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 38).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.2129F, -2.3135F, 0.3622F, 0.0F, -3.1416F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 3.8763F, 0.3506F, 0.1309F, 0.0F, -3.1416F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 29).addBox(-1.0001F, -10.9194F, -0.5443F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -1.8627F, -0.8567F, -0.4057F, -0.0069F, -0.016F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 29).addBox(0.0F, -4.0F, -1.5F, 0.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.695F, 2.4888F, -2.7358F, 0.0F, -3.1416F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -1.9399F, -0.0873F, 0.0524F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.1213F, -0.5713F, 0.1527F, 0.0F, -3.1416F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3002F, 1.2081F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -8.9783F, -0.2532F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -2.1641F, 2.4258F, -0.9642F, -0.0143F, -0.0099F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.4073F, 6.4053F, -2.1773F, 0.0F, 3.1416F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 36).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.3941F, 2.63F, 0.3578F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -1.5F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.1755F, 2.4823F, 0.0218F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(7, 3).addBox(-1.3F, 3.823F, 1.4529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.3F, -0.177F, 0.4529F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3348F, 1.6777F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(22, 12).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0501F, 4.2517F, 2.6616F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 15).addBox(0.0F, -1.5F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2572F, 2.0368F, -0.48F, 0.0F, 3.1416F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3654F, 4.9145F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0119F, 2.7082F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5357F, 0.149F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 12).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4F, 0.2519F, -6.5586F, -1.3614F, 0.0F, 3.1416F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(6, 20).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3295F, -5.6981F, -0.9905F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(23, 29).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.3536F, -4.0023F, 0.1353F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(6, 20).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -1.4379F, -4.8012F, 0.3098F, 0.0F, -3.1416F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(37, 29).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -2.5065F, -3.5097F, -0.3883F, 0.0F, -3.1416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0916F, -4.0297F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r20 = jaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(23, 37).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.3168F, -1.0541F, 0.1963F, 0.0F, -3.1416F));

		PartDefinition backleftfin = main.addOrReplaceChild("backleftfin", CubeListBuilder.create().texOffs(11, 24).addBox(-0.1F, 1.7F, 0.3F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).addBox(-0.1F, 1.5F, -0.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 20).addBox(3.9F, 1.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.225F, 3.8177F, 0.745F, 0.0F, -0.2618F, 1.5708F));

		PartDefinition backrightfin = main.addOrReplaceChild("backrightfin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.225F, 3.8177F, 0.745F, 0.0F, 0.0F, -1.5708F));

		PartDefinition frontleftfin = main.addOrReplaceChild("frontleftfin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.65F, 3.3847F, -2.0488F, 0.0F, 0.48F, 1.5708F));

		PartDefinition cube_r21 = frontleftfin.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 0).addBox(10.5F, -1.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(2.5F, -1.2F, -3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(2.5F, -1.0F, -2.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 2.0F, 1.3F, 0.0F, -0.2182F, 0.0F));

		PartDefinition frontrightfin = main.addOrReplaceChild("frontrightfin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, 2.0847F, -2.0488F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 112, 45);
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