package fossils.fossils.client.blockentity.model.platyhystrix;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatyhystrixFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart Hip;
	private final ModelPart cube_r4;
	private final ModelPart UpperLegR;
	private final ModelPart LowerLegR;
	private final ModelPart FootR;
	private final ModelPart UpperLegR2;
	private final ModelPart LowerLegR2;
	private final ModelPart FootR2;
	private final ModelPart Tail1;
	private final ModelPart cube_r5;
	private final ModelPart Tail2;
	private final ModelPart body;
	private final ModelPart cube_r6;
	private final ModelPart body1;
	private final ModelPart Chest;
	private final ModelPart cube_r7;
	private final ModelPart Head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart UpperArmR;
	private final ModelPart LowerArmR;
	private final ModelPart HandR;
	private final ModelPart UpperArmR2;
	private final ModelPart LowerArmR2;
	private final ModelPart HandR2;

	public PlatyhystrixFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.Hip = this.fossil.getChild("Hip");
		this.cube_r4 = this.Hip.getChild("cube_r4");
		this.UpperLegR = this.Hip.getChild("UpperLegR");
		this.LowerLegR = this.UpperLegR.getChild("LowerLegR");
		this.FootR = this.LowerLegR.getChild("FootR");
		this.UpperLegR2 = this.Hip.getChild("UpperLegR2");
		this.LowerLegR2 = this.UpperLegR2.getChild("LowerLegR2");
		this.FootR2 = this.LowerLegR2.getChild("FootR2");
		this.Tail1 = this.Hip.getChild("Tail1");
		this.cube_r5 = this.Tail1.getChild("cube_r5");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.body = this.Hip.getChild("body");
		this.cube_r6 = this.body.getChild("cube_r6");
		this.body1 = this.body.getChild("body1");
		this.Chest = this.body1.getChild("Chest");
		this.cube_r7 = this.Chest.getChild("cube_r7");
		this.Head = this.Chest.getChild("Head");
		this.lowerjaw = this.Head.getChild("lowerjaw");
		this.upperjaw = this.Head.getChild("upperjaw");
		this.UpperArmR = this.Chest.getChild("UpperArmR");
		this.LowerArmR = this.UpperArmR.getChild("LowerArmR");
		this.HandR = this.LowerArmR.getChild("HandR");
		this.UpperArmR2 = this.Chest.getChild("UpperArmR2");
		this.LowerArmR2 = this.UpperArmR2.getChild("LowerArmR2");
		this.HandR2 = this.LowerArmR2.getChild("HandR2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -4.725F, 4.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.775F, -3.15F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.05F, -3.15F, -4.4F, -0.3491F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.35F, -2.65F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.05F, -3.15F, -4.4F, 0.0F, 0.3229F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-3.0F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.9F, 4.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hip = fossil.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, 3.75F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, 0.7F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.825F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition UpperLegR = Hip.addOrReplaceChild("UpperLegR", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, 3.3795F, 2.3566F, 0.1707F, 0.8296F, -0.2618F));

		PartDefinition LowerLegR = UpperLegR.addOrReplaceChild("LowerLegR", CubeListBuilder.create(), PartPose.offsetAndRotation(2.795F, 0.0426F, -1.2444F, 0.4134F, 0.2255F, 1.2984F));

		PartDefinition FootR = LowerLegR.addOrReplaceChild("FootR", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4729F, 0.0003F, 0.6126F, 0.4258F, 0.2465F, 0.5699F));

		PartDefinition UpperLegR2 = Hip.addOrReplaceChild("UpperLegR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, 3.3795F, 2.3566F, 0.1219F, 0.3389F, 0.429F));

		PartDefinition LowerLegR2 = UpperLegR2.addOrReplaceChild("LowerLegR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.795F, 0.0426F, -1.2444F, 0.3719F, 0.3249F, -1.5815F));

		PartDefinition FootR2 = LowerLegR2.addOrReplaceChild("FootR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4729F, 0.0003F, 0.6126F, 0.3686F, -0.1702F, -0.2953F));

		PartDefinition Tail1 = Hip.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.75F, 2.0F, -0.1806F, -0.2577F, 0.0465F));

		PartDefinition cube_r5 = Tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 8).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.5848F, 0.8639F, 0.0829F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.9755F, -0.5218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1828F, -0.3006F, -0.0547F));

		PartDefinition body = Hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(37, 21).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.975F, -1.05F, -0.0131F, 0.0F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(19, 18).addBox(-0.5F, -0.525F, -5.85F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.75F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition Chest = body1.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.25F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, 0.25F, -0.65F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.15F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Chest.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.75F, -0.09F, 0.123F, -0.045F));

		PartDefinition lowerjaw = Head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.525F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition upperjaw = Head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition UpperArmR = Chest.addOrReplaceChild("UpperArmR", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 2.25F, -0.9F, -0.0436F, -0.0436F, 0.6109F));

		PartDefinition LowerArmR = UpperArmR.addOrReplaceChild("LowerArmR", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6466F, 0.1384F, -0.9439F, -1.1405F, 1.2249F, -0.123F));

		PartDefinition HandR = LowerArmR.addOrReplaceChild("HandR", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, 0.5F, -0.3F, 2.7822F, -1.5145F, -2.6566F));

		PartDefinition UpperArmR2 = Chest.addOrReplaceChild("UpperArmR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 2.25F, -0.9F, 0.0F, 1.2217F, -0.6109F));

		PartDefinition LowerArmR2 = UpperArmR2.addOrReplaceChild("LowerArmR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6466F, 0.1384F, -0.9439F, 0.2618F, -1.3963F, -1.2217F));

		PartDefinition HandR2 = LowerArmR2.addOrReplaceChild("HandR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, 0.5F, -0.3F, -0.1738F, 0.7346F, -0.4035F));

		return LayerDefinition.create(meshdefinition, 48, 48);
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