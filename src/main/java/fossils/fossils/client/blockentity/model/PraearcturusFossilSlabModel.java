package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PraearcturusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart abdomen;
	private final ModelPart baby5;
	private final ModelPart abdomen2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart baby4;
	private final ModelPart baby3;
	private final ModelPart baby2;
	private final ModelPart baby1;
	private final ModelPart armR;
	private final ModelPart armR2;
	private final ModelPart armR3;
	private final ModelPart clawR;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart clawL;
	private final ModelPart cheliceraR;
	private final ModelPart cheliceraL;
	private final ModelPart legsR;
	private final ModelPart legR;
	private final ModelPart legR2;
	private final ModelPart legR3;
	private final ModelPart legR4;
	private final ModelPart legsL;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;

	public PraearcturusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.abdomen = this.body.getChild("abdomen");
		this.baby5 = this.abdomen.getChild("baby5");
		this.abdomen2 = this.abdomen.getChild("abdomen2");
		this.tail1 = this.abdomen2.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.baby4 = this.abdomen.getChild("baby4");
		this.baby3 = this.abdomen.getChild("baby3");
		this.baby2 = this.abdomen.getChild("baby2");
		this.baby1 = this.abdomen.getChild("baby1");
		this.armR = this.body.getChild("armR");
		this.armR2 = this.armR.getChild("armR2");
		this.armR3 = this.armR2.getChild("armR3");
		this.clawR = this.armR3.getChild("clawR");
		this.armL = this.body.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.clawL = this.armL3.getChild("clawL");
		this.cheliceraR = this.body.getChild("cheliceraR");
		this.cheliceraL = this.body.getChild("cheliceraL");
		this.legsR = this.body.getChild("legsR");
		this.legR = this.legsR.getChild("legR");
		this.legR2 = this.legsR.getChild("legR2");
		this.legR3 = this.legsR.getChild("legR3");
		this.legR4 = this.legsR.getChild("legR4");
		this.legsL = this.body.getChild("legsL");
		this.legL = this.legsL.getChild("legL");
		this.legL2 = this.legsL.getChild("legL2");
		this.legL3 = this.legsL.getChild("legL3");
		this.legL4 = this.legsL.getChild("legL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 34).addBox(-8.0F, -2.0F, -14.0F, 20.0F, 2.0F, 27.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1177F, -2.0F, -31.1333F, 8.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.8F, 0.0F, 13.7F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -2.0F, 7.0F, 11.0F, 2.0F, 31.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(19.0F, 0.0F, 12.0F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 64).addBox(-26.0F, -2.0F, -26.0F, 21.0F, 2.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(19.0F, 0.0F, -14.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 51).addBox(-1.5F, -1.8F, -7.25F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(78, 48).addBox(-2.5F, -1.9F, -2.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -0.5F, -3.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 14).addBox(-1.0F, -3.0F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.1F, -7.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition carapace_r1 = body.addOrReplaceChild("carapace_r1", CubeListBuilder.create().texOffs(0, 64).addBox(-1.9F, -3.0F, 0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.015F))
				.texOffs(0, 18).addBox(-1.9F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.5F, 1.2F, -7.25F, 0.0F, 0.2269F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -3.0F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.1F, -7.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition carapace_r2 = body.addOrReplaceChild("carapace_r2", CubeListBuilder.create().texOffs(12, 19).addBox(-0.1F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(68, 48).addBox(-0.1F, -3.0F, 0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.5F, 1.2F, -7.25F, 0.0F, -0.2269F, 0.0F));

		PartDefinition abdomen = body.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(64, 64).addBox(-3.49F, 0.0F, 1.0F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(12, 51).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition baby5 = abdomen.addOrReplaceChild("baby5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 9.25F, 0.0F, 2.8362F, 0.0F));

		PartDefinition abdomen2 = abdomen.addOrReplaceChild("abdomen2", CubeListBuilder.create().texOffs(0, 44).addBox(-2.5F, 0.1F, -1.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tail1 = abdomen2.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(79, 77).addBox(-1.5F, 0.2F, -1.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(80, 0).addBox(-1.499F, 0.2F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(79, 52).addBox(-1.5F, 0.2F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(64, 77).addBox(-1.499F, 0.2F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 72).addBox(-1.5F, 0.2F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(19, 27).addBox(-0.999F, 0.3F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-0.499F, 0.5F, 2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition baby4 = abdomen.addOrReplaceChild("baby4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -1.0F, 7.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition baby3 = abdomen.addOrReplaceChild("baby3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -1.0F, 7.0F, 0.0F, -2.4435F, 0.0F));

		PartDefinition baby2 = abdomen.addOrReplaceChild("baby2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -1.0F, 4.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition baby1 = abdomen.addOrReplaceChild("baby1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -1.0F, 3.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition armR = body.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(68, 44).addBox(-6.25F, 0.0F, -1.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.8F, -7.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition armR2 = armR.addOrReplaceChild("armR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.25F, 0.0F, -0.5F, 0.0F, 1.2654F, 0.0F));

		PartDefinition armR2_r1 = armR2.addOrReplaceChild("armR2_r1", CubeListBuilder.create().texOffs(0, 79).addBox(-7.0F, -2.1F, -12.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.75F, 2.0F, 8.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition armR3 = armR2.addOrReplaceChild("armR3", CubeListBuilder.create().texOffs(12, 19).addBox(-0.75F, 0.15F, -10.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(80, 22).addBox(-1.0F, -0.1F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -0.1F, -3.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition clawR = armR3.addOrReplaceChild("clawR", CubeListBuilder.create().texOffs(0, 18).addBox(-0.75F, -0.75F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 1.0F, -3.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition armL = body.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(0, 27).addBox(-0.75F, 0.0F, -1.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.7F, -7.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.25F, 0.0F, -0.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition armR3_r1 = armL2.addOrReplaceChild("armR3_r1", CubeListBuilder.create().texOffs(13, 55).addBox(5.0F, -2.1F, -12.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.75F, 2.0F, 8.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(12, 11).addBox(-1.25F, -0.35F, -10.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(80, 16).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.2F, -3.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition clawL = armL3.addOrReplaceChild("clawL", CubeListBuilder.create().texOffs(0, 10).addBox(-1.25F, -1.15F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 1.0F, -3.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cheliceraR = body.addOrReplaceChild("cheliceraR", CubeListBuilder.create().texOffs(12, 10).addBox(-1.125F, 0.199F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -7.0F));

		PartDefinition cheliceraL = body.addOrReplaceChild("cheliceraL", CubeListBuilder.create().texOffs(0, 10).addBox(0.125F, 0.199F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -7.0F));

		PartDefinition legsR = body.addOrReplaceChild("legsR", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition legR = legsR.addOrReplaceChild("legR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, -2.5F, -6.5F, 1.5708F, 0.1745F, 0.0F));

		PartDefinition leg1R_r1 = legR.addOrReplaceChild("leg1R_r1", CubeListBuilder.create().texOffs(80, 11).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.5F, 0.2F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR2 = legsR.addOrReplaceChild("legR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -2.0F, -5.75F, 1.5708F, 0.1745F, 0.0F));

		PartDefinition leg2R_r1 = legR2.addOrReplaceChild("leg2R_r1", CubeListBuilder.create().texOffs(0, 39).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8307F, 0.0F, 0.5825F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR3 = legsR.addOrReplaceChild("legR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -2.0F, -4.45F, 1.5708F, 0.5236F, 0.0F));

		PartDefinition leg3R_r1 = legR3.addOrReplaceChild("leg3R_r1", CubeListBuilder.create().texOffs(0, 5).addBox(-6.5F, -2.0F, 0.0F, 13.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5391F, 0.0F, 0.6498F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR4 = legsR.addOrReplaceChild("legR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -2.0F, -2.75F, 1.5708F, 0.8727F, 0.0F));

		PartDefinition leg4R_r1 = legR4.addOrReplaceChild("leg4R_r1", CubeListBuilder.create().texOffs(68, 39).addBox(-8.5F, -2.0F, 0.0F, 17.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.3533F, 0.0F, 0.6031F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legsL = body.addOrReplaceChild("legsL", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition legL = legsL.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -2.4F, -6.5F, 1.5708F, 0.6545F, 0.0F));

		PartDefinition leg1R_r2 = legL.addOrReplaceChild("leg1R_r2", CubeListBuilder.create().texOffs(80, 6).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.5F, 0.2F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legL2 = legsL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -2.0F, -5.75F, 1.5708F, -0.3491F, 0.0F));

		PartDefinition leg2R_r2 = legL2.addOrReplaceChild("leg2R_r2", CubeListBuilder.create().texOffs(0, 34).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8307F, 0.0F, 0.5825F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legL3 = legsL.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -2.0F, -4.45F, 1.5708F, -0.5236F, 0.0F));

		PartDefinition leg3R_r2 = legL3.addOrReplaceChild("leg3R_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -2.0F, 0.0F, 13.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5391F, 0.0F, 0.6498F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legL4 = legsL.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -2.0F, -2.75F, 1.5708F, -0.9599F, 0.0F));

		PartDefinition leg4R_r2 = legL4.addOrReplaceChild("leg4R_r2", CubeListBuilder.create().texOffs(68, 34).addBox(-8.5F, -2.0F, 0.0F, 17.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.3533F, 0.0F, 0.6031F, 3.1416F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 95);
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