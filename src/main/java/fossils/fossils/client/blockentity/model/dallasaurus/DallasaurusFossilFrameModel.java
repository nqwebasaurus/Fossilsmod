package fossils.fossils.client.blockentity.model.dallasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DallasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart frontleftflipper;
	private final ModelPart frontrightflipper;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart hips;
	private final ModelPart backleftflipper;
	private final ModelPart backrightflipper;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public DallasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.frontleftflipper = this.chest.getChild("frontleftflipper");
		this.frontrightflipper = this.chest.getChild("frontrightflipper");
		this.body = this.chest.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.hips = this.body3.getChild("hips");
		this.backleftflipper = this.hips.getChild("backleftflipper");
		this.backrightflipper = this.hips.getChild("backrightflipper");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, -12.3988F, -5.0634F, -0.1321F, 0.3896F, -0.0504F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 40).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 37).addBox(-0.5F, -0.2F, -4.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 34).addBox(1.1F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.2842F, -2.078F, -1.5708F, -0.2618F, 1.5708F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 37).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.1592F, -2.6474F, -1.309F, 0.0F, 0.0F));

		PartDefinition frontleftflipper = chest.addOrReplaceChild("frontleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(3.686F, 4.9696F, 0.2526F, 1.0808F, -1.1379F, 0.6591F));

		PartDefinition frontrightflipper = chest.addOrReplaceChild("frontrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.686F, 4.9696F, 0.2526F, 1.0808F, 1.1379F, -0.6591F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4367F, 0.0395F, 0.0184F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 19).addBox(-0.5F, 0.1F, 6.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 13).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 3.8004F, -0.096F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5939F, 10.7628F, 0.0393F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.1F, -0.6F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0698F, 7.9988F, 0.25F, 0.2116F, 0.0536F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.6F, 10.1F, 0.0F, 0.1396F, 0.0F));

		PartDefinition hips = body3.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(30, 30).addBox(-1.0F, 0.2F, 0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.012F, 11.0062F, 0.2009F, 0.2504F, -0.1232F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 33).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, 2.1F, 1.1F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 30).addBox(-2.3F, 0.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.7F, 2.9F, 0.0F, -1.5708F, 0.0F));

		PartDefinition backleftflipper = hips.addOrReplaceChild("backleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0075F, 2.0367F, 0.9293F, 0.4084F, -1.0444F, 1.1143F));

		PartDefinition backrightflipper = hips.addOrReplaceChild("backrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0075F, 2.0367F, 0.9293F, 0.4084F, 1.0444F, -1.1143F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, 0.1F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 28).addBox(-1.0F, 0.1F, 5.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.007F, 4.9002F, 0.0816F, 0.0144F, -0.1739F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 30).addBox(-1.0F, 0.1F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1179F, 0.1898F, -0.1074F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 5).addBox(-1.0F, 0.1F, 5.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 0).addBox(-1.0F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 22).addBox(-1.0F, 0.1F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(43, 30).addBox(-1.0F, 0.1F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 33).addBox(-1.0F, 0.1F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, 0.1883F, -0.0857F, -0.0163F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(11, 38).addBox(-1.0F, 0.1F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0292F, 3.9044F, 0.0616F, -0.1307F, -0.008F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0259F, 3.9034F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -3.7F, 0.1445F, -0.2592F, -0.0373F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 43).addBox(0.0F, 0.0F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4433F, -3.6012F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, 0.1F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4349F, -3.9015F, -0.1865F, -0.4755F, 0.0182F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -1.3478F, -0.4013F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -1.3478F, -0.4013F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3502F, 0.0836F, -0.0087F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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