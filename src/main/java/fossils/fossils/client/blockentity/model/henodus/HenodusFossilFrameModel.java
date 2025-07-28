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
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart backleftleg;
	private final ModelPart frontleftleg3;
	private final ModelPart backrightleg;
	private final ModelPart frontrightleg3;
	private final ModelPart leftShell;
	private final ModelPart rightShell;
	private final ModelPart leftShell2;
	private final ModelPart rightShell2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public HenodusFossilFrameModel(ModelPart root) {
		this.henodus = root.getChild("henodus");
		this.shell = this.henodus.getChild("shell");
		this.neck2 = this.shell.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.frontleftleg = this.shell.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontrightleg = this.shell.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.backleftleg = this.shell.getChild("backleftleg");
		this.frontleftleg3 = this.backleftleg.getChild("frontleftleg3");
		this.backrightleg = this.shell.getChild("backrightleg");
		this.frontrightleg3 = this.backrightleg.getChild("frontrightleg3");
		this.leftShell = this.shell.getChild("leftShell");
		this.rightShell = this.shell.getChild("rightShell");
		this.leftShell2 = this.shell.getChild("leftShell2");
		this.rightShell2 = this.shell.getChild("rightShell2");
		this.tail = this.shell.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition henodus = partdefinition.addOrReplaceChild("henodus", CubeListBuilder.create(), PartPose.offset(-0.5F, 23.0F, 0.0F));

		PartDefinition shell = henodus.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -0.85F, -5.6F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 68).addBox(0.0F, -0.85F, 7.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1638F, -0.9629F, 0.2143F, -0.2159F, -0.0001F, 0.1686F));

		PartDefinition cube_r1 = shell.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 68).addBox(-14.2F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F))
				.texOffs(10, 67).addBox(-0.9F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -0.35F, 8.1F, 0.0F, -1.5708F, 0.0F));

		PartDefinition neck2 = shell.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0251F, -5.0393F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r2 = neck2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(85, 88).addBox(0.0F, -0.4F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.1544F, -1.9184F, -0.2192F, -0.218F, 0.0097F));

		PartDefinition cube_r3 = neck.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(90, 25).addBox(0.0F, -0.4F, -3.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.7644F, 1.9827F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.011F, -0.5037F, -0.2084F, -0.1281F, 0.027F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.1044F, -1.4251F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1F, -1.0256F, -1.8393F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1F, -1.0256F, -1.8393F));

		PartDefinition frontleftleg = shell.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4098F, -0.8688F, -5.4915F, 0.1491F, -0.5997F, -0.0396F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3695F, 0.5F, -2.7298F, 0.8733F, -0.9938F, -0.9328F));

		PartDefinition frontrightleg = shell.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4098F, -0.8688F, -5.4915F, 0.1286F, 0.2971F, -0.0071F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3694F, 0.5F, -2.7298F, 0.3972F, 0.5904F, 0.6459F));

		PartDefinition backleftleg = shell.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2398F, -0.263F, 7.6647F, -0.2685F, 0.8908F, -0.2229F));

		PartDefinition frontleftleg3 = backleftleg.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2717F, -0.5058F, 2.7352F, 2.8292F, -0.7738F, 0.4939F));

		PartDefinition backrightleg = shell.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2398F, -0.263F, 7.6647F, -0.3751F, -1.0981F, 0.3494F));

		PartDefinition frontrightleg3 = backrightleg.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2717F, -0.5058F, 2.7352F, 2.8606F, 0.4478F, -0.588F));

		PartDefinition leftShell = shell.addOrReplaceChild("leftShell", CubeListBuilder.create(), PartPose.offset(1.5F, -0.5F, 0.5F));

		PartDefinition rightShell = shell.addOrReplaceChild("rightShell", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.5F, 0.5F));

		PartDefinition leftShell2 = shell.addOrReplaceChild("leftShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0698F));

		PartDefinition rightShell2 = shell.addOrReplaceChild("rightShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 1.0F, 0.5F, 0.0F, 0.0F, -0.0698F));

		PartDefinition tail = shell.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, 0.2F, 0.45F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.0F, 8.0F, -0.0061F, -0.1319F, -0.0857F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(41, 76).addBox(-0.425F, 0.2F, 0.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0035F, 3.9501F, 0.0183F, -0.3054F, -0.0055F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, 0.0189F, -0.3926F, -0.0072F));

		return LayerDefinition.create(meshdefinition, 104, 104);
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