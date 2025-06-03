package fossils.fossils.client.blockentity.model.simolestes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SimolestesFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Pliosaurus;
	private final ModelPart Chest;
	private final ModelPart Shoulder;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperL;
	private final ModelPart FrontFlipperMiddleL;
	private final ModelPart FrontFlipperEndL;
	private final ModelPart FrontFlipperL2;
	private final ModelPart FrontFlipperMiddleL2;
	private final ModelPart FrontFlipperEndL2;
	private final ModelPart BackFlipperL;
	private final ModelPart BackFlipperMiddleL;
	private final ModelPart BackFlipperEndL;
	private final ModelPart BackFlipperL2;
	private final ModelPart BackFlipperMiddleL2;
	private final ModelPart BackFlipperEndL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public SimolestesFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Pliosaurus = this.fossil.getChild("Pliosaurus");
		this.Chest = this.Pliosaurus.getChild("Chest");
		this.Shoulder = this.Chest.getChild("Shoulder");
		this.Neck3 = this.Shoulder.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperL = this.Shoulder.getChild("FrontFlipperL");
		this.FrontFlipperMiddleL = this.FrontFlipperL.getChild("FrontFlipperMiddleL");
		this.FrontFlipperEndL = this.FrontFlipperMiddleL.getChild("FrontFlipperEndL");
		this.FrontFlipperL2 = this.Shoulder.getChild("FrontFlipperL2");
		this.FrontFlipperMiddleL2 = this.FrontFlipperL2.getChild("FrontFlipperMiddleL2");
		this.FrontFlipperEndL2 = this.FrontFlipperMiddleL2.getChild("FrontFlipperEndL2");
		this.BackFlipperL = this.Pliosaurus.getChild("BackFlipperL");
		this.BackFlipperMiddleL = this.BackFlipperL.getChild("BackFlipperMiddleL");
		this.BackFlipperEndL = this.BackFlipperMiddleL.getChild("BackFlipperEndL");
		this.BackFlipperL2 = this.Pliosaurus.getChild("BackFlipperL2");
		this.BackFlipperMiddleL2 = this.BackFlipperL2.getChild("BackFlipperMiddleL2");
		this.BackFlipperEndL2 = this.BackFlipperMiddleL2.getChild("BackFlipperEndL2");
		this.Tail1 = this.Pliosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Pliosaurus = fossil.addOrReplaceChild("Pliosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -11.0F, 18.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Pliosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(36, 44).addBox(-0.1F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.1144F, -2.0188F, 1.5708F, 0.1047F, 1.5708F));

		PartDefinition basin_r2 = Pliosaurus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(46, 54).addBox(-0.5F, -2.3F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.5178F, 0.064F, 1.4661F, 0.0F, 0.0F));

		PartDefinition basin_r3 = Pliosaurus.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(45, 53).addBox(-0.5F, 1.5867F, -0.1527F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Chest = Pliosaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.3F, -0.1489F, -0.0863F, 0.0129F));

		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, 0.9398F, -0.4209F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0959F, -9.449F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Shoulder = Chest.addOrReplaceChild("Shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2041F, -9.649F, 0.2009F, -0.0428F, -0.0087F));

		PartDefinition cube_r2 = Shoulder.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(0.7F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.5692F, -11.4827F, -1.5708F, -0.0524F, -1.5708F));

		PartDefinition cube_r3 = Shoulder.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 18).addBox(-0.5F, -2.0F, 1.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.0004F, -12.6405F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Shoulder.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0004F, -12.6405F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck3 = Shoulder.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(15, 56).addBox(-1.0F, 0.2246F, -4.3057F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2077F, -12.5223F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -4.7F, -0.1752F, -0.1744F, 0.0077F));

		PartDefinition cube_r5 = Neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-1, 53).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.1556F, -4.9315F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4444F, -4.8315F, -0.1923F, -0.1745F, 0.0031F));

		PartDefinition cube_r6 = Neck1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(51, 60).addBox(-1.0F, 0.7F, -1.6F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0646F, -3.759F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2301F, -4.4901F, -0.3424F, -0.01F, 0.2345F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.1357F, 0.8573F, 0.9338F, 0.0F, 0.0F));

		PartDefinition FrontFlipperL = Shoulder.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4F, 4.8864F, -11.0035F, 0.1318F, -0.0683F, 0.4755F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7742F, -1.7954F, -0.248F, -0.035F, -0.2595F, 0.1355F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.6443F, 0.5F, -0.0469F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperL2 = Shoulder.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.4F, 4.8864F, -11.0035F, 0.1318F, 0.0683F, -0.4755F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7742F, -1.7954F, -0.248F, -0.1022F, 0.2415F, -0.4051F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.6443F, 0.5F, -0.0469F, 0.0F, 0.1309F, 0.0F));

		PartDefinition BackFlipperL = Pliosaurus.addOrReplaceChild("BackFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 3.2806F, -1.92F, 0.2227F, -0.3007F, -0.3379F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(10.167F, 0.5F, -0.3177F, 0.0396F, -0.1248F, -0.3079F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8307F, 0.5F, -1.0037F, 0.0F, 0.1658F, 0.0F));

		PartDefinition BackFlipperL2 = Pliosaurus.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9F, 3.2806F, -1.92F, 0.1954F, 0.3188F, 0.2482F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.167F, 0.5F, -0.3177F, 0.0172F, 0.1298F, 0.132F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8307F, 0.5F, -1.0037F, 0.0F, -0.1658F, 0.0F));

		PartDefinition Tail1 = Pliosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 2.6F, -0.1496F, 0.1295F, -0.0195F));

		PartDefinition cube_r7 = Tail1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 64).addBox(-1.0F, 0.9F, -1.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4143F, 1.0271F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Tail1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 80).addBox(-1.0F, -2.1F, -4.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9857F, 8.0271F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0143F, 5.7271F, 0.0709F, 0.1741F, 0.0123F));

		PartDefinition cube_r9 = Tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, 0.9284F, -0.3169F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 2.8F, -0.0549F, 0.305F, -0.0165F));

		PartDefinition cube_r10 = Tail3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 55).addBox(-1.0F, 0.8F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -0.0287F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, 0.1017F, -0.0512F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3227F, 2.9713F, 0.0755F, 0.3917F, 0.0289F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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