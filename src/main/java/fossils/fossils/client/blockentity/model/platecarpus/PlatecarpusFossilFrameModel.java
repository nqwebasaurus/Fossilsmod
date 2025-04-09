package fossils.fossils.client.blockentity.model.platecarpus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatecarpusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public PlatecarpusFossilFrameModel(ModelPart root) {
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
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
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

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -38.15F, -13.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, -5).addBox(4.1791F, -0.2398F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5485F, -1.3877F, 1.5708F, -0.3491F, 1.5708F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, -4).addBox(-0.5F, -0.2398F, -7.2791F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.5485F, -1.3877F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, 0.0F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftflipper = chest.addOrReplaceChild("frontleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9162F, 5.7061F, 1.0617F, 0.1888F, -0.3713F, 0.5037F));

		PartDefinition frontrightflipper = chest.addOrReplaceChild("frontrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9162F, 5.7061F, 1.0617F, -0.1725F, 0.2483F, -0.5263F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(45, 6).addBox(-0.5F, 0.3F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 9).addBox(-0.5F, 0.3F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.186F, 0.1716F, 0.0321F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(45, 12).addBox(-0.5F, 0.3F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 3.8004F, -0.096F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2784F, 7.7024F, -0.3678F, 0.0815F, -0.0313F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, 0.4F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 4).addBox(-1.0F, 0.4F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, 6.0F, -0.1848F, 0.1287F, -0.024F));

		PartDefinition hips = body3.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-1, 31).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 2.7478F, 3.2654F, 1.5708F, 0.3927F, -1.5708F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 33).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, 0.9F, 2.5F, 1.9635F, 0.0F, 0.0F));

		PartDefinition backleftflipper = hips.addOrReplaceChild("backleftflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8697F, 2.5093F, 3.7074F, 0.2527F, -0.4946F, 0.2506F));

		PartDefinition backrightflipper = hips.addOrReplaceChild("backrightflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8697F, 2.5093F, 3.7074F, 0.2589F, 0.5368F, -0.238F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 8).addBox(-1.0F, 0.4F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.007F, 4.9002F, -0.1489F, 0.0863F, -0.0129F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.4F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 5).addBox(-1.0F, 0.4F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.0718F, -0.127F, 0.0318F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0989F, -0.2736F, 0.2027F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(15, 16).addBox(-1.0F, 0.4F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0173F, -0.0431F, 0.0068F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(45, 43).addBox(-1.0F, 0.4F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, -0.3047F, -0.2421F, 0.2131F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 32).addBox(-1.0F, 0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0292F, 3.9044F, -0.351F, -0.1426F, 0.1416F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0259F, 4.9034F, -0.2967F, -0.1137F, 0.1161F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(15, 24).addBox(-1.0F, 0.4F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 29).addBox(-1.0F, 0.4F, 5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.284F, -0.3753F, -0.0664F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.2976F, -0.1016F, -0.2617F));

		PartDefinition cube_r7 = tail9.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 56).addBox(-1.0F, -0.2181F, -0.2781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail9.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(3, 50).addBox(-1.0F, 0.2F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 47).addBox(-1.0F, 0.2F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -3.7F, -0.1694F, 0.1722F, 0.1641F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 56).addBox(0.0F, 0.2F, 2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 54).addBox(0.0F, 0.2F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -2.9F, 0.1387F, 0.2406F, 0.1047F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 32).addBox(0.0F, 0.2F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.3F, -0.2182F, 0.1309F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -1.3478F, -0.4013F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -1.3478F, -0.4013F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 0.0F, 0.4538F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 91, 91);
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