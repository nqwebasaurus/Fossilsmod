package fossils.fossils.client.blockentity.model.luskhan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LuskhanFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart tail;
	private final ModelPart leftbackflipper;
	private final ModelPart leftbackflipper2;
	private final ModelPart leftbackflipper3;
	private final ModelPart leftbackflipper4;
	private final ModelPart rightbackflipper;
	private final ModelPart rightbackflipper2;
	private final ModelPart rightbackflipper3;
	private final ModelPart rightbackflipper4;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart leftfrontflipper;
	private final ModelPart leftfrontflipper2;
	private final ModelPart leftfrontflipper3;
	private final ModelPart leftfrontflipper4;
	private final ModelPart rightfrontflipper;
	private final ModelPart rightfrontflipper2;
	private final ModelPart rightfrontflipper3;
	private final ModelPart rightfrontflipper4;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart head;
	private final ModelPart jaw;

	public LuskhanFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.tail = this.main.getChild("tail");
		this.leftbackflipper = this.tail.getChild("leftbackflipper");
		this.leftbackflipper2 = this.leftbackflipper.getChild("leftbackflipper2");
		this.leftbackflipper3 = this.leftbackflipper2.getChild("leftbackflipper3");
		this.leftbackflipper4 = this.leftbackflipper3.getChild("leftbackflipper4");
		this.rightbackflipper = this.tail.getChild("rightbackflipper");
		this.rightbackflipper2 = this.rightbackflipper.getChild("rightbackflipper2");
		this.rightbackflipper3 = this.rightbackflipper2.getChild("rightbackflipper3");
		this.rightbackflipper4 = this.rightbackflipper3.getChild("rightbackflipper4");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.main.getChild("body");
		this.leftfrontflipper = this.body.getChild("leftfrontflipper");
		this.leftfrontflipper2 = this.leftfrontflipper.getChild("leftfrontflipper2");
		this.leftfrontflipper3 = this.leftfrontflipper2.getChild("leftfrontflipper3");
		this.leftfrontflipper4 = this.leftfrontflipper3.getChild("leftfrontflipper4");
		this.rightfrontflipper = this.body.getChild("rightfrontflipper");
		this.rightfrontflipper2 = this.rightfrontflipper.getChild("rightfrontflipper2");
		this.rightfrontflipper3 = this.rightfrontflipper2.getChild("rightfrontflipper3");
		this.rightfrontflipper4 = this.rightfrontflipper3.getChild("rightfrontflipper4");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.head = this.body3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.5F, 7.0F, -0.3328F, 0.1704F, 0.0906F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.8463F, 0.1547F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 1.1F, 0.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.4F, 6.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8861F, 17.1744F, -0.262F, 0.0421F, -0.0113F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 28).addBox(-1.6F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2556F, 8.6239F, -1.5708F, 0.0698F, -1.5708F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 35).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.5095F, 4.8534F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 30).addBox(-0.5F, 0.8619F, -0.0574F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0318F, -0.7058F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftbackflipper = tail.addOrReplaceChild("leftbackflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(6.25F, 6.3383F, 6.7991F, 0.7232F, 0.2799F, -0.8476F));

		PartDefinition leftbackflipper2 = leftbackflipper.addOrReplaceChild("leftbackflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.75F, 0.7F, 0.0872F, -0.0038F, 0.0435F));

		PartDefinition leftbackflipper3 = leftbackflipper2.addOrReplaceChild("leftbackflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.65F, -0.15F, 0.0F, 0.0F, 0.1745F));

		PartDefinition leftbackflipper4 = leftbackflipper3.addOrReplaceChild("leftbackflipper4", CubeListBuilder.create(), PartPose.offset(0.1F, 5.0F, 0.0F));

		PartDefinition rightbackflipper = tail.addOrReplaceChild("rightbackflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.25F, 6.3383F, 6.7991F, 0.8901F, -0.2126F, 0.8537F));

		PartDefinition rightbackflipper2 = rightbackflipper.addOrReplaceChild("rightbackflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.75F, 0.7F, 0.0852F, -0.0189F, 0.2174F));

		PartDefinition rightbackflipper3 = rightbackflipper2.addOrReplaceChild("rightbackflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.65F, -0.15F, 0.0F, 0.0F, -0.2182F));

		PartDefinition rightbackflipper4 = rightbackflipper3.addOrReplaceChild("rightbackflipper4", CubeListBuilder.create(), PartPose.offset(-0.1F, 5.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 0.0629F, 9.8315F, 0.0882F, 0.2616F, 0.0039F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 45).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.25F, -0.9F, 0.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 80).addBox(-0.5F, 0.35F, 0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.0F, 7.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(33, 97).addBox(-0.5F, 0.3019F, -0.1436F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, 4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0019F, 2.9564F, 0.0536F, 0.2179F, 0.0116F));

		PartDefinition cube_r7 = tail5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 77).addBox(-0.4F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7503F, 2.0131F, 0.0137F, 0.0065F, -0.0024F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(83, 55).addBox(-0.5F, 0.3037F, 0.2609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0003F, 3.6131F, 0.1354F, 0.2039F, -0.0865F));

		PartDefinition cube_r8 = tail6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(97, 17).addBox(0.0F, -0.2019F, -0.0576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5037F, 3.9609F, 0.1222F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(51, 0).addBox(0.0F, 0.2496F, -8.147F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.25F, -5.0F, 0.1752F, 0.0859F, 0.0152F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, -7).addBox(0.5F, -0.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.2496F, -4.647F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(55, 4).addBox(-0.5F, -1.0F, -4.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2496F, -4.147F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftfrontflipper = body.addOrReplaceChild("leftfrontflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(8.55F, 5.126F, -5.0818F, 0.0557F, 0.0963F, -1.9547F));

		PartDefinition leftfrontflipper2 = leftfrontflipper.addOrReplaceChild("leftfrontflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5159F, 5.0586F, -2.2609F, 0.0848F, -0.0016F, 0.1105F));

		PartDefinition leftfrontflipper3 = leftfrontflipper2.addOrReplaceChild("leftfrontflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.95F, 2.75F, 0.1074F, 0.0749F, -0.6068F));

		PartDefinition leftfrontflipper4 = leftfrontflipper3.addOrReplaceChild("leftfrontflipper4", CubeListBuilder.create(), PartPose.offset(0.1F, 6.9829F, -0.2611F));

		PartDefinition rightfrontflipper = body.addOrReplaceChild("rightfrontflipper", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.55F, 5.126F, -5.0818F, -0.2126F, -0.1748F, 1.9576F));

		PartDefinition rightfrontflipper2 = rightfrontflipper.addOrReplaceChild("rightfrontflipper2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5159F, 5.0586F, -2.2609F, 0.0848F, 0.0016F, -0.1105F));

		PartDefinition rightfrontflipper3 = rightfrontflipper2.addOrReplaceChild("rightfrontflipper3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 5.95F, 2.75F, 0.121F, -0.05F, 0.3897F));

		PartDefinition rightfrontflipper4 = rightfrontflipper3.addOrReplaceChild("rightfrontflipper4", CubeListBuilder.create(), PartPose.offset(-0.1F, 6.9829F, -0.2611F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(61, 13).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.276F, -9.1318F, 0.176F, 0.2175F, 0.0078F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.25F, 0.2829F, 0.179F, 0.1115F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F, -0.0685F, -0.5956F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.875F, -8.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head = body3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.25F, -9.0F, 0.0735F, 0.418F, 0.1783F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.809F, -0.1209F, 0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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