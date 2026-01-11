package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StensioellaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Stensioella;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart frontLeftFin;
	private final ModelPart frontRightFin;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart backLeftFin;
	private final ModelPart backRightFin;

	public StensioellaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Stensioella = this.fossil.getChild("Stensioella");
		this.head = this.Stensioella.getChild("head");
		this.body = this.head.getChild("body");
		this.frontLeftFin = this.body.getChild("frontLeftFin");
		this.frontRightFin = this.body.getChild("frontRightFin");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.backLeftFin = this.tail.getChild("backLeftFin");
		this.backRightFin = this.tail.getChild("backRightFin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.225F, 24.0F, -1.2F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8177F, -1.0F, 0.2041F, 12.0F, 2.0F, 36.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-8.525F, -1.0F, -15.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 42).addBox(-10.6174F, -1.0F, -0.4939F, 10.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.775F, -1.0F, 2.3F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 39).addBox(-4.5F, -1.0F, -18.0F, 13.0F, 2.0F, 24.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.275F, -1.0F, -0.3F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Stensioella = fossil.addOrReplaceChild("Stensioella", CubeListBuilder.create(), PartPose.offset(-0.225F, -2.0F, -8.8F));

		PartDefinition head = Stensioella.addOrReplaceChild("head", CubeListBuilder.create().texOffs(22, 25).addBox(-2.0F, 0.3136F, -7.1464F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-2.5F, 0.1694F, -6.4707F, 5.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(18, 10).addBox(-1.0F, 0.1679F, -6.7036F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5518F, -1.3342F));

		PartDefinition eyeother_r1 = head.addOrReplaceChild("eyeother_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6315F, 0.1038F, -5.2756F, 0.0F, -0.2182F, 0.0F));

		PartDefinition eyeother_r2 = head.addOrReplaceChild("eyeother_r2", CubeListBuilder.create().texOffs(0, 3).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6315F, 0.1038F, -5.2756F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-0.0501F, -2.3115F, -5.3811F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3518F, 0.8342F, 0.0F, 1.0897F, -0.0669F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 11).addBox(-0.9499F, -2.3115F, -5.3811F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3518F, 0.8342F, 0.0F, -1.0897F, 0.0669F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 10).addBox(-1.3827F, -2.321F, -4.1027F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3518F, 0.8342F, 0.0F, 0.7848F, -0.0349F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 27).addBox(-0.6173F, -2.321F, -4.1027F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3518F, 0.8342F, 0.0F, -0.7848F, 0.0349F));

		PartDefinition body = head.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2518F, -0.1658F, 0.0F, 0.0436F, 0.0F));

		PartDefinition frontLeftFin = body.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -0.6215F, -0.2793F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r8 = frontLeftFin.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 66).addBox(-5.0038F, 0.75F, -0.7934F, 7.0F, 0.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(-1.0038F, 0.65F, -0.7934F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition frontRightFin = body.addOrReplaceChild("frontRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -0.6215F, -0.2793F, 0.0F, 0.2356F, 0.0F));

		PartDefinition cube_r9 = frontRightFin.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 0).addBox(-1.9962F, 0.75F, -0.7934F, 7.0F, 0.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(12, 25).addBox(-0.9962F, 0.65F, -0.7934F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.1F, -1.25F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.9F, -1.25F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 5.75F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, 0.7F, -1.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 5.75F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(18, 1).addBox(-0.7F, -0.5F, 0.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 6.5F, -0.0873F, 0.0F, 1.5708F));

		PartDefinition backLeftFin = tail.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 1.1285F, 5.2207F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r10 = backLeftFin.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 15).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8715F, -0.85F, 0.0293F, 0.0F, 0.0F, 1.5708F));

		PartDefinition backRightFin = tail.addOrReplaceChild("backRightFin", CubeListBuilder.create().texOffs(26, 0).addBox(-0.25F, -0.6285F, -1.9707F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.5285F, 5.2207F, 0.48F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 90);
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