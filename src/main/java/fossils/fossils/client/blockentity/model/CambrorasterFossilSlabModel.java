package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CambrorasterFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bodybase;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart tailfinR;
	private final ModelPart tailfinL;
	private final ModelPart finR8;
	private final ModelPart fin8;
	private final ModelPart finR7;
	private final ModelPart fin7;
	private final ModelPart finR4;
	private final ModelPart finR3;
	private final ModelPart finR2;
	private final ModelPart finR1;
	private final ModelPart fin4;
	private final ModelPart fin3;
	private final ModelPart fin2;
	private final ModelPart fin1;
	private final ModelPart apepndageL2;
	private final ModelPart apepndageL3;

	public CambrorasterFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bodybase = this.fossil.getChild("bodybase");
		this.body1 = this.bodybase.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.tailfinR = this.body3.getChild("tailfinR");
		this.tailfinL = this.body3.getChild("tailfinL");
		this.finR8 = this.body3.getChild("finR8");
		this.fin8 = this.body3.getChild("fin8");
		this.finR7 = this.body2.getChild("finR7");
		this.fin7 = this.body2.getChild("fin7");
		this.finR4 = this.body1.getChild("finR4");
		this.finR3 = this.body1.getChild("finR3");
		this.finR2 = this.body1.getChild("finR2");
		this.finR1 = this.body1.getChild("finR1");
		this.fin4 = this.body1.getChild("fin4");
		this.fin3 = this.body1.getChild("fin3");
		this.fin2 = this.body1.getChild("fin2");
		this.fin1 = this.body1.getChild("fin1");
		this.apepndageL2 = this.bodybase.getChild("apepndageL2");
		this.apepndageL3 = this.bodybase.getChild("apepndageL3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-14.9F, -0.5F, -6.8F, 20.0F, 1.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.5F, -8.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 33).addBox(-0.0381F, -0.5F, -0.0546F, 14.0F, 1.0F, 16.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(9.0298F, 4.5F, 8.2831F, 0.0F, 2.7227F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-19.9392F, -0.5F, 0.0124F, 20.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.8352F, 4.5F, -0.9183F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bodybase = fossil.addOrReplaceChild("bodybase", CubeListBuilder.create().texOffs(45, 43).addBox(-2.99F, -4.4F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(45, 33).addBox(-3.5F, -4.5F, -5.25F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-2.5F, -4.5F, -6.25F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-4.0F, -4.52F, -4.95F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-4.8F, -4.54F, -4.95F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(17, 51).addBox(-5.4F, -4.56F, -4.95F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(51, 51).addBox(-6.1F, -4.58F, -3.95F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(34, 51).addBox(5.1F, -4.58F, -3.95F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(4.4F, -4.56F, -4.95F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(3.8F, -4.54F, -4.95F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(3.0F, -4.52F, -4.95F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(9, 7).addBox(-3.5F, -4.3F, -1.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 3).addBox(2.5F, -4.3F, -1.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-1.0F, -4.3F, -4.8F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-0.5F, -4.29F, -4.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body1 = bodybase.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(54, 18).addBox(-2.5F, -2.15F, 0.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.25F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -2.4F, 0.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, 4.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(7, 33).addBox(-1.0F, -2.4F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition tailfinR = body3.addOrReplaceChild("tailfinR", CubeListBuilder.create().texOffs(9, 10).addBox(-1.0F, -2.5F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tailfinL = body3.addOrReplaceChild("tailfinL", CubeListBuilder.create().texOffs(9, 0).addBox(-0.1F, -2.5F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.5F, 0.0F, 0.0436F, 0.0F));

		PartDefinition finR8 = body3.addOrReplaceChild("finR8", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -2.2F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -0.25F, 0.25F));

		PartDefinition fin8 = body3.addOrReplaceChild("fin8", CubeListBuilder.create().texOffs(8, 35).addBox(0.0F, -2.2F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.25F, 0.25F));

		PartDefinition finR7 = body2.addOrReplaceChild("finR7", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -0.4F, 0.5F));

		PartDefinition fin7 = body2.addOrReplaceChild("fin7", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, -2.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -0.4F, 0.5F));

		PartDefinition finR4 = body1.addOrReplaceChild("finR4", CubeListBuilder.create().texOffs(7, 18).addBox(-1.0F, -1.9F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -0.25F, 3.5F));

		PartDefinition finR3 = body1.addOrReplaceChild("finR3", CubeListBuilder.create().texOffs(7, 20).addBox(-1.0F, -1.9F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -0.25F, 2.5F));

		PartDefinition finR2 = body1.addOrReplaceChild("finR2", CubeListBuilder.create().texOffs(7, 23).addBox(-1.0F, -1.9F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -0.25F, 1.5F));

		PartDefinition finR1 = body1.addOrReplaceChild("finR1", CubeListBuilder.create().texOffs(7, 25).addBox(-1.0F, -1.9F, -0.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -0.25F, 0.5F));

		PartDefinition fin4 = body1.addOrReplaceChild("fin4", CubeListBuilder.create().texOffs(4, 37).addBox(0.0F, -1.9F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -0.25F, 3.5F));

		PartDefinition fin3 = body1.addOrReplaceChild("fin3", CubeListBuilder.create().texOffs(9, 37).addBox(0.0F, -1.9F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -0.25F, 2.5F));

		PartDefinition fin2 = body1.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, -1.9F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -0.25F, 1.5F));

		PartDefinition fin1 = body1.addOrReplaceChild("fin1", CubeListBuilder.create().texOffs(4, 39).addBox(0.0F, -1.9F, -0.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -0.25F, 0.5F));

		PartDefinition apepndageL2 = bodybase.addOrReplaceChild("apepndageL2", CubeListBuilder.create().texOffs(3, 0).addBox(0.5F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -4.75F, -4.25F, 0.7854F, 0.0F, 1.5708F));

		PartDefinition apepndageL3 = bodybase.addOrReplaceChild("apepndageL3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -4.75F, -4.25F, 0.7854F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 80, 65);
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