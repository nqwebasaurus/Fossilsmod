package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SlimoniaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart tergite1;
	private final ModelPart tergite2_3;
	private final ModelPart tergite4_5;
	private final ModelPart tergite6;
	private final ModelPart tergite7;
	private final ModelPart tergite8;
	private final ModelPart tergite9;
	private final ModelPart tergite10;
	private final ModelPart tergite11;
	private final ModelPart tergite12;
	private final ModelPart telson;
	private final ModelPart legL2;
	private final ModelPart legL7;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL5_2;
	private final ModelPart legL5_3;
	private final ModelPart legL6;
	private final ModelPart legL5_4;
	private final ModelPart legL5_5;
	private final ModelPart legL1;
	private final ModelPart legR1;
	private final ModelPart cheliceraL;
	private final ModelPart cheliceraR;

	public SlimoniaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.tergite1 = this.body.getChild("tergite1");
		this.tergite2_3 = this.tergite1.getChild("tergite2_3");
		this.tergite4_5 = this.tergite2_3.getChild("tergite4_5");
		this.tergite6 = this.tergite4_5.getChild("tergite6");
		this.tergite7 = this.tergite6.getChild("tergite7");
		this.tergite8 = this.tergite7.getChild("tergite8");
		this.tergite9 = this.tergite8.getChild("tergite9");
		this.tergite10 = this.tergite9.getChild("tergite10");
		this.tergite11 = this.tergite10.getChild("tergite11");
		this.tergite12 = this.tergite11.getChild("tergite12");
		this.telson = this.tergite12.getChild("telson");
		this.legL2 = this.body.getChild("legL2");
		this.legL7 = this.body.getChild("legL7");
		this.legL3 = this.body.getChild("legL3");
		this.legL4 = this.body.getChild("legL4");
		this.legL5 = this.body.getChild("legL5");
		this.legL5_2 = this.legL5.getChild("legL5_2");
		this.legL5_3 = this.legL5_2.getChild("legL5_3");
		this.legL6 = this.body.getChild("legL6");
		this.legL5_4 = this.legL6.getChild("legL5_4");
		this.legL5_5 = this.legL5_4.getChild("legL5_5");
		this.legL1 = this.body.getChild("legL1");
		this.legR1 = this.body.getChild("legR1");
		this.cheliceraL = this.body.getChild("cheliceraL");
		this.cheliceraR = this.body.getChild("cheliceraR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -2.0F, -18.0F, 32.0F, 2.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.1131F, 0.9F, -12.5315F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -3.3F, -1.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition tergite1 = body.addOrReplaceChild("tergite1", CubeListBuilder.create().texOffs(0, 31).addBox(-4.5F, 1.0F, -0.2F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-4.5F, 1.0F, 1.8F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1131F, 0.0F, -4.5315F, 0.0F, 0.0436F, 0.0F));

		PartDefinition tergite2_3 = tergite1.addOrReplaceChild("tergite2_3", CubeListBuilder.create().texOffs(0, 23).addBox(-5.5F, 0.9F, 0.0F, 11.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tergite4_5 = tergite2_3.addOrReplaceChild("tergite4_5", CubeListBuilder.create().texOffs(0, 18).addBox(-5.5F, 1.0F, 0.0F, 11.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-5.5F, 1.1F, -2.0F, 11.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tergite6 = tergite4_5.addOrReplaceChild("tergite6", CubeListBuilder.create().texOffs(0, 28).addBox(-4.5F, 0.9F, 0.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-4.5F, 1.1F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tergite7 = tergite6.addOrReplaceChild("tergite7", CubeListBuilder.create().texOffs(19, 14).addBox(-3.5F, 1.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 14).addBox(-3.5F, 1.1F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tergite8 = tergite7.addOrReplaceChild("tergite8", CubeListBuilder.create().texOffs(21, 32).addBox(-2.5F, 1.1F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(21, 32).addBox(-2.5F, 1.2F, -0.4F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tergite9 = tergite8.addOrReplaceChild("tergite9", CubeListBuilder.create().texOffs(25, 3).addBox(-2.0F, 1.2F, 0.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 3).addBox(-2.0F, 1.1F, 0.4F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 3).addBox(-2.0F, 1.3F, -0.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition tergite10 = tergite9.addOrReplaceChild("tergite10", CubeListBuilder.create().texOffs(25, 0).addBox(-2.0F, 0.9F, 0.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition tergite11 = tergite10.addOrReplaceChild("tergite11", CubeListBuilder.create().texOffs(21, 28).addBox(-2.0F, 1.0F, -0.6F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition tergite12 = tergite11.addOrReplaceChild("tergite12", CubeListBuilder.create().texOffs(19, 9).addBox(-2.0F, 0.9F, 0.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.9F, 0.0F, 0.2618F, 0.0F));

		PartDefinition telson = tergite12.addOrReplaceChild("telson", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(-2.5F, 1.1F, 0.0F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.6F, 0.0F, 0.3491F, 0.0F));

		PartDefinition legL2 = body.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(25, 6).addBox(0.0F, 0.5F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7131F, 0.6F, -9.9315F, 0.0F, -0.0873F, 0.0F));

		PartDefinition legL7 = body.addOrReplaceChild("legL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7131F, 0.6F, -9.9315F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leg1L_r1 = legL7.addOrReplaceChild("leg1L_r1", CubeListBuilder.create().texOffs(24, 44).addBox(-0.2F, -0.1F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.5F, 0.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition legL3 = body.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(13, 44).addBox(0.0F, 0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7131F, 0.6F, -8.8315F, 0.0F, -0.1745F, 0.0F));

		PartDefinition leg1L_r2 = legL3.addOrReplaceChild("leg1L_r2", CubeListBuilder.create().texOffs(27, 20).addBox(0.0F, -0.1F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL4 = body.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(21, 35).addBox(0.0F, 0.5F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7131F, 0.6F, -7.7315F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leg1L_r3 = legL4.addOrReplaceChild("leg1L_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, 0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.5F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition legL5 = body.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(43, 42).addBox(0.0F, 0.5F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3869F, 0.6F, -5.5315F, 0.0F, -0.3054F, 0.0F));

		PartDefinition legL5_2 = legL5.addOrReplaceChild("legL5_2", CubeListBuilder.create().texOffs(13, 41).addBox(0.0F, 0.5F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.0F, -0.1F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition legL5_3 = legL5_2.addOrReplaceChild("legL5_3", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, 0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition legL6 = body.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(34, 41).addBox(0.0F, 0.5F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6131F, 0.7F, -5.5315F, 0.0F, -0.3491F, 0.0F));

		PartDefinition legL5_4 = legL6.addOrReplaceChild("legL5_4", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, 0.5F, -1.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition legL5_5 = legL5_4.addOrReplaceChild("legL5_5", CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, 0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition legL1 = body.addOrReplaceChild("legL1", CubeListBuilder.create().texOffs(27, 23).addBox(0.0F, 0.5F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9131F, 0.75F, -10.5315F, 0.0F, 0.3927F, 0.0F));

		PartDefinition legR1 = body.addOrReplaceChild("legR1", CubeListBuilder.create().texOffs(27, 17).addBox(-3.0F, 0.5F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3131F, 0.75F, -10.5315F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cheliceraL = body.addOrReplaceChild("cheliceraL", CubeListBuilder.create(), PartPose.offset(-1.7131F, 1.45F, -10.2315F));

		PartDefinition cube_r1 = cheliceraL.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.0F, -1.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cheliceraR = body.addOrReplaceChild("cheliceraR", CubeListBuilder.create(), PartPose.offset(-2.5131F, 1.45F, -10.2315F));

		PartDefinition cube_r2 = cheliceraR.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, 0.0F, -1.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 52);
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