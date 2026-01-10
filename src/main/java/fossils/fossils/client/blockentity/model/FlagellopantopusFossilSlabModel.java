package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class FlagellopantopusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Rock;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart body;
	private final ModelPart talson;
	private final ModelPart tail;
	private final ModelPart legR1;
	private final ModelPart legRs1;
	private final ModelPart legL1;
	private final ModelPart legLs1;
	private final ModelPart legLss1;
	private final ModelPart legL2;
	private final ModelPart legLs2;
	private final ModelPart legLss2;
	private final ModelPart legL3;
	private final ModelPart legLs3;
	private final ModelPart legLss3;
	private final ModelPart legLsss3;
	private final ModelPart legL4;
	private final ModelPart legLs4;
	private final ModelPart legLss4;
	private final ModelPart legLsss4;
	private final ModelPart legR2;
	private final ModelPart legRs2;
	private final ModelPart legRss2;
	private final ModelPart legRsss2;
	private final ModelPart legR3;
	private final ModelPart legRs3;
	private final ModelPart legRss3;
	private final ModelPart legRsss3;
	private final ModelPart legR4;
	private final ModelPart legRs4;
	private final ModelPart legRss4;
	private final ModelPart legRsss4;
	private final ModelPart proboscis;

	public FlagellopantopusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Rock = this.fossil.getChild("Rock");
		this.bone = this.fossil.getChild("bone");
		this.bone2 = this.fossil.getChild("bone2");
		this.bone3 = this.fossil.getChild("bone3");
		this.body = this.fossil.getChild("body");
		this.talson = this.body.getChild("talson");
		this.tail = this.talson.getChild("tail");
		this.legR1 = this.body.getChild("legR1");
		this.legRs1 = this.legR1.getChild("legRs1");
		this.legL1 = this.body.getChild("legL1");
		this.legLs1 = this.legL1.getChild("legLs1");
		this.legLss1 = this.legLs1.getChild("legLss1");
		this.legL2 = this.body.getChild("legL2");
		this.legLs2 = this.legL2.getChild("legLs2");
		this.legLss2 = this.legLs2.getChild("legLss2");
		this.legL3 = this.body.getChild("legL3");
		this.legLs3 = this.legL3.getChild("legLs3");
		this.legLss3 = this.legLs3.getChild("legLss3");
		this.legLsss3 = this.legLss3.getChild("legLsss3");
		this.legL4 = this.body.getChild("legL4");
		this.legLs4 = this.legL4.getChild("legLs4");
		this.legLss4 = this.legLs4.getChild("legLss4");
		this.legLsss4 = this.legLss4.getChild("legLsss4");
		this.legR2 = this.body.getChild("legR2");
		this.legRs2 = this.legR2.getChild("legRs2");
		this.legRss2 = this.legRs2.getChild("legRss2");
		this.legRsss2 = this.legRss2.getChild("legRsss2");
		this.legR3 = this.body.getChild("legR3");
		this.legRs3 = this.legR3.getChild("legRs3");
		this.legRss3 = this.legRs3.getChild("legRss3");
		this.legRsss3 = this.legRss3.getChild("legRsss3");
		this.legR4 = this.body.getChild("legR4");
		this.legRs4 = this.legR4.getChild("legRs4");
		this.legRss4 = this.legRs4.getChild("legRss4");
		this.legRsss4 = this.legRss4.getChild("legRsss4");
		this.proboscis = this.body.getChild("proboscis");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Rock = fossil.addOrReplaceChild("Rock", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -2.0F, -5.0F, 25.0F, 2.0F, 37.0F, new CubeDeformation(0.01F))
				.texOffs(0, 40).addBox(-21.0F, -2.0F, -28.0F, 45.0F, 2.0F, 23.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Rock.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 66).addBox(-9.15F, -2.0F, -39.85F, 12.0F, 2.0F, 39.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, 0.0F, 32.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = Rock.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 69).addBox(0.0F, -2.0F, -39.0F, 12.0F, 2.0F, 39.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 0.0F, 32.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = fossil.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = fossil.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -5.25F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition talson = body.addOrReplaceChild("talson", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -0.25F, -0.2628F, 0.0843F, -0.0226F));

		PartDefinition tail = talson.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(88, 0).addBox(-0.025F, -5.5F, 0.0F, 0.0F, 6.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.75F, -0.0098F, -0.2616F, 1.5708F));

		PartDefinition legR1 = body.addOrReplaceChild("legR1", CubeListBuilder.create().texOffs(9, 25).addBox(-4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.25F, -4.0F, -1.5708F, -1.0468F, -0.0135F));

		PartDefinition legRs1 = legR1.addOrReplaceChild("legRs1", CubeListBuilder.create().texOffs(15, 21).addBox(-5.0F, -0.5F, -0.01F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition legL1 = body.addOrReplaceChild("legL1", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -4.0F, -1.7083F, 1.2624F, -0.1442F));

		PartDefinition legLs1 = legL1.addOrReplaceChild("legLs1", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -0.5F, -0.01F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition legLss1 = legLs1.addOrReplaceChild("legLss1", CubeListBuilder.create().texOffs(0, 11).addBox(0.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition legL2 = body.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(18, 23).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -3.0F, -1.6107F, 0.7401F, -0.0463F));

		PartDefinition legLs2 = legL2.addOrReplaceChild("legLs2", CubeListBuilder.create().texOffs(15, 12).addBox(0.0F, -0.5F, -0.01F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition legLss2 = legLs2.addOrReplaceChild("legLss2", CubeListBuilder.create().texOffs(10, 2).addBox(0.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition legL3 = body.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(9, 23).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1F, -2.0F, -1.5708F, 0.5164F, 0.0071F));

		PartDefinition legLs3 = legL3.addOrReplaceChild("legLs3", CubeListBuilder.create().texOffs(15, 10).addBox(0.0F, -0.5F, -0.01F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition legLss3 = legLs3.addOrReplaceChild("legLss3", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3963F));

		PartDefinition legLsss3 = legLss3.addOrReplaceChild("legLsss3", CubeListBuilder.create().texOffs(26, 6).addBox(0.0F, -0.5F, -0.01F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition legL4 = body.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -1.0F, -1.5708F, 0.3054F, -0.0436F));

		PartDefinition legLs4 = legL4.addOrReplaceChild("legLs4", CubeListBuilder.create().texOffs(15, 8).addBox(0.0F, -0.5F, 0.04F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.2689F));

		PartDefinition legLss4 = legLs4.addOrReplaceChild("legLss4", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition legLsss4 = legLss4.addOrReplaceChild("legLsss4", CubeListBuilder.create().texOffs(25, 25).addBox(0.0F, -0.5F, -0.01F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition legR2 = body.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(25, 2).addBox(-4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.25F, -3.0F, -1.5708F, -0.6974F, -0.0326F));

		PartDefinition legRs2 = legR2.addOrReplaceChild("legRs2", CubeListBuilder.create().texOffs(15, 19).addBox(-5.0F, -0.5F, -0.01F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.0436F, -0.0087F, 0.524F));

		PartDefinition legRss2 = legRs2.addOrReplaceChild("legRss2", CubeListBuilder.create().texOffs(0, 15).addBox(-7.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition legRsss2 = legRss2.addOrReplaceChild("legRsss2", CubeListBuilder.create().texOffs(26, 18).addBox(-3.0F, -0.5F, -0.01F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition legR3 = body.addOrReplaceChild("legR3", CubeListBuilder.create().texOffs(25, 0).addBox(-4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.25F, -2.0F, -1.5708F, -0.2618F, 0.0F));

		PartDefinition legRs3 = legR3.addOrReplaceChild("legRs3", CubeListBuilder.create().texOffs(18, 14).addBox(-5.0F, -0.5F, -0.01F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition legRss3 = legRs3.addOrReplaceChild("legRss3", CubeListBuilder.create().texOffs(0, 13).addBox(-7.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0908F));

		PartDefinition legRsss3 = legRss3.addOrReplaceChild("legRsss3", CubeListBuilder.create().texOffs(26, 12).addBox(-3.0F, -0.5F, -0.01F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition legR4 = body.addOrReplaceChild("legR4", CubeListBuilder.create().texOffs(21, 16).addBox(-4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.025F, -1.0F, -1.5708F, 0.3941F, 0.0024F));

		PartDefinition legRs4 = legR4.addOrReplaceChild("legRs4", CubeListBuilder.create().texOffs(15, 6).addBox(-5.0F, -0.5F, -0.01F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition legRss4 = legRs4.addOrReplaceChild("legRss4", CubeListBuilder.create().texOffs(0, 7).addBox(-7.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.6581F));

		PartDefinition legRsss4 = legRss4.addOrReplaceChild("legRsss4", CubeListBuilder.create().texOffs(18, 25).addBox(-3.0F, -0.5F, -0.01F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition proboscis = body.addOrReplaceChild("proboscis", CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -5.0F, 0.1772F, 0.1719F, 0.0306F));

		return LayerDefinition.create(meshdefinition, 168, 120);
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