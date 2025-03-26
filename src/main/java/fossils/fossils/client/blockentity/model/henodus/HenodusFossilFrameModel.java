package fossils.fossils.client.blockentity.model.henodus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HenodusFossilFrameModel extends SkullModelBase {
	private final ModelPart henodus;
	private final ModelPart shell;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public HenodusFossilFrameModel(ModelPart root) {
		this.henodus = root.getChild("henodus");
		this.shell = this.henodus.getChild("shell");
		this.neck = this.shell.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.frontleftleg = this.shell.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontrightleg = this.shell.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.backleftleg = this.shell.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backrightleg3 = this.shell.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.shell.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition henodus = partdefinition.addOrReplaceChild("henodus", CubeListBuilder.create(), PartPose.offset(-0.5F, 23.0F, 0.0F));

		PartDefinition shell = henodus.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(51, 66).addBox(-2.0F, -0.5F, -5.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(41, 54).addBox(0.0F, -0.5F, -5.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.1F))
				.texOffs(51, 66).addBox(-2.0F, -0.85F, 7.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, -0.1745F));

		PartDefinition neck = shell.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.6644F, -4.7327F, 0.0024F, -0.1379F, 0.3024F));

		PartDefinition frame1_r1 = neck.addOrReplaceChild("frame1_r1", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.439F, -1.4305F, -0.1314F, 0.0865F, -0.0114F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.611F, -3.0037F, -0.294F, -0.289F, -0.1801F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2763F, 0.0081F, 0.7854F, 0.0F, 0.0F));

		PartDefinition frontleftleg = shell.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.75F, -0.25F, -4.75F, 0.201F, -0.9092F, -0.1144F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -1.75F, 0.0F, -0.5672F, 0.0F));

		PartDefinition frontrightleg = shell.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -0.25F, -4.75F, 0.126F, 0.2192F, -0.0175F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -1.75F, 0.0F, 0.2618F, 0.0F));

		PartDefinition backleftleg = shell.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, -0.25F, 7.25F, -0.2086F, -0.0786F, 0.0832F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3265F, -0.1358F, 2.3623F, 0.0F, -0.2618F, 0.0F));

		PartDefinition backrightleg3 = shell.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, -0.25F, 7.25F, -0.2294F, -0.4331F, 0.0311F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3265F, -0.1358F, 2.3623F, 0.0F, 0.3927F, 0.0F));

		PartDefinition tail = shell.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 36).addBox(-0.5F, 0.5F, -0.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.0F, 8.0F, 0.0423F, -0.1739F, 0.0154F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 3.25F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition frame4_r1 = tail2.addOrReplaceChild("frame4_r1", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.4F, 1.25F, 0.0F, 0.0349F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(28, 23).addBox(-0.5F, 0.9F, -0.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.25F, 0.0873F, -0.3491F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.henodus.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		henodus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}