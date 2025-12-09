package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TremaglaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart matrix;
	private final ModelPart tremaglaspis;
	private final ModelPart carapace;
	private final ModelPart thorax;
	private final ModelPart telson;

	public TremaglaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.matrix = this.fossil.getChild("matrix");
		this.tremaglaspis = this.fossil.getChild("tremaglaspis");
		this.carapace = this.tremaglaspis.getChild("carapace");
		this.thorax = this.carapace.getChild("thorax");
		this.telson = this.thorax.getChild("telson");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create().texOffs(20, 25).addBox(-2.0F, -3.25F, -1.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition cube_r1 = matrix.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 10).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, 0.2135F, -0.6918F, -0.0772F));

		PartDefinition cube_r2 = matrix.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -4.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0445F, 0.218F, -0.0058F));

		PartDefinition cube_r3 = matrix.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 22).addBox(-2.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -2.2F, 1.85F, -0.0159F, -0.3487F, 0.0464F));

		PartDefinition cube_r4 = matrix.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 19).addBox(-2.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.0F, 1.85F, -0.0159F, -0.3487F, 0.0464F));

		PartDefinition cube_r5 = matrix.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.275F, 0.0F, 0.3808F, -0.4627F, 0.0256F));

		PartDefinition cube_r6 = matrix.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 14).addBox(-4.0F, -3.0F, -3.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, -0.3F, 2.6F, -0.0873F, 0.6109F, 0.0F));

		PartDefinition cube_r7 = matrix.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 26).addBox(-4.0F, -3.0F, -3.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 0.0F, 4.4F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r8 = matrix.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-2, 19).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(3.775F, -1.85F, 1.5F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r9 = matrix.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -2.0F, -2.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(-5.35F, -0.9F, 2.35F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r10 = matrix.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 38).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(1.75F, -1.0F, -2.55F, 0.0F, -1.309F, 0.0F));

		PartDefinition cube_r11 = matrix.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, -3.725F, -2.3F, 2.4624F, 1.2905F, 2.4662F));

		PartDefinition cube_r12 = matrix.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 20).addBox(-4.0F, -1.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -3.25F, -2.0F, -3.0041F, 1.2624F, -2.9974F));

		PartDefinition cube_r13 = matrix.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(-3.4F, 0.1F, -4.525F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r14 = matrix.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 38).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-3.25F, 0.225F, -4.7F, 0.1011F, 0.3885F, 0.0116F));

		PartDefinition cube_r15 = matrix.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 25).addBox(-2.0F, -4.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.4F, -3.0F, 0.0554F, -0.7822F, -0.1639F));

		PartDefinition cube_r16 = matrix.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -3.0F, -6.0F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition tremaglaspis = fossil.addOrReplaceChild("tremaglaspis", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, 0.0F, 0.0436F, 0.6109F, 0.0F));

		PartDefinition carapace = tremaglaspis.addOrReplaceChild("carapace", CubeListBuilder.create().texOffs(20, 43).addBox(0.0F, -2.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 13).addBox(-1.0F, -1.25F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offset(-0.5F, -0.1F, 0.0F));

		PartDefinition cube_r17 = carapace.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 27).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.1548F, -6.8126F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r18 = carapace.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(18, 46).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.8126F, -1.1548F, -3.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition cube_r19 = carapace.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 42).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r20 = carapace.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 41).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 46).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, 0.3922F, 0.1964F, -0.4408F));

		PartDefinition cube_r21 = carapace.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(42, 16).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r22 = carapace.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 45).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.8126F, -1.1548F, -3.0F, 0.0F, 0.0F, 1.1345F));

		PartDefinition cube_r23 = carapace.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(16, 29).addBox(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 45).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -5.0F, 0.3922F, -0.1964F, 0.4408F));

		PartDefinition cube_r24 = carapace.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(6, 44).addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition thorax = carapace.addOrReplaceChild("thorax", CubeListBuilder.create().texOffs(34, 6).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.5F, 0.5F, -0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -3.0F, -0.1745F, 0.0873F, 0.0F));

		PartDefinition cube_r25 = thorax.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(12, 43).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4932F, 0.7347F, 5.7441F, -0.1106F, 0.2585F, -0.2995F));

		PartDefinition cube_r26 = thorax.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 31).addBox(-1.8F, -0.1F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1152F, 0.25F, 2.6736F, -0.0262F, 0.0396F, -0.3054F));

		PartDefinition cube_r27 = thorax.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 42).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4932F, 0.7347F, 5.7441F, -0.1106F, -0.2585F, 0.2995F));

		PartDefinition cube_r28 = thorax.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(16, 31).addBox(-0.2F, -0.1F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8848F, 0.25F, 2.6736F, -0.0262F, -0.0396F, 0.3054F));

		PartDefinition cube_r29 = thorax.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition telson = thorax.addOrReplaceChild("telson", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.275F, 7.975F, -0.2618F, 0.2182F, 0.0F));

		PartDefinition cube_r30 = telson.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 46).addBox(-0.5F, 0.1F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.25F, 0.3861F, -0.0171F, -0.0309F, -0.0308F, -0.7849F));

		PartDefinition cube_r31 = telson.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(44, 45).addBox(-0.5F, 0.1F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.25F, 0.3861F, -0.0171F, -0.0309F, 0.0308F, 0.7849F));

		PartDefinition cube_r32 = telson.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 43).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.275F, -2.0F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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