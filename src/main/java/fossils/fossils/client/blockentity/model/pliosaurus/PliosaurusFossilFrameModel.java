package fossils.fossils.client.blockentity.model.pliosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PliosaurusFossilFrameModel extends SkullModelBase {
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

	public PliosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(60, 33).addBox(-1.0F, -28.2206F, 22.2857F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition basin_r1 = fossil.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(56, 94).addBox(-2.9F, -13.0F, -1.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(-0.51F)), PartPose.offsetAndRotation(5.1F, -18.9206F, -16.1143F, 0.1745F, 0.0F, -1.5708F));

		PartDefinition basin_r2 = fossil.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, -6.4F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(5.1F, -18.9206F, -16.1143F, 0.0F, -0.1745F, 0.0F));

		PartDefinition basin_r3 = fossil.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(65, 94).addBox(-3.1F, -13.0F, -1.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(-0.51F)), PartPose.offsetAndRotation(0.0F, -23.2206F, 23.2857F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Pliosaurus = fossil.addOrReplaceChild("Pliosaurus", CubeListBuilder.create(), PartPose.offset(0.5F, -28.25F, 25.0F));

		PartDefinition basin_r4 = Pliosaurus.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(44, 14).addBox(-2.0F, -2.5206F, -0.3143F, 2.0F, 3.0F, 15.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5F, 1.3F, -7.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Pliosaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -7.4F, -0.0616F, -0.1307F, 0.008F));

		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 48).addBox(-1.5F, 1.9058F, -0.4546F, 2.0F, 3.0F, 12.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.3831F, -10.8622F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 18).addBox(-1.5F, 7.4851F, -0.8563F, 2.0F, 3.0F, 16.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -3.9831F, -26.2622F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Shoulder = Chest.addOrReplaceChild("Shoulder", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, 0.8996F, -13.0405F, 2.0F, 3.0F, 14.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 2.7169F, -26.4622F, 0.2452F, -0.0847F, -0.0212F));

		PartDefinition Neck3 = Shoulder.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0923F, -12.6223F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r3 = Neck3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(104, 60).addBox(-1.5F, 1.8F, -0.7F, 2.0F, 3.0F, 9.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(90, 40).addBox(-1.5F, 0.7569F, -9.6228F, 2.0F, 3.0F, 10.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.3F, -8.0F, -0.0436F, -0.2618F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 79).addBox(-1.5F, 0.7227F, -11.6583F, 2.0F, 3.0F, 12.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.0431F, -9.0228F, -0.105F, -0.1745F, 0.0031F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3174F, -7.9894F, -0.043F, -0.1264F, 0.1296F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.3441F, -0.0486F, 0.6283F, 0.0F, 0.0F));

		PartDefinition FrontFlipperL = Shoulder.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(10.5F, 9.7864F, -8.5035F, 0.2182F, 0.3491F, 0.3491F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(13.8742F, -1.7954F, 0.052F, 0.0F, -0.1745F, 0.0F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(15.8443F, 0.5F, 0.3531F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperL2 = Shoulder.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.5F, 9.7864F, -8.5035F, 0.0F, 0.0F, -0.3927F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.8742F, -1.7954F, 0.052F, 0.0F, 0.1745F, 0.0F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.8443F, 0.5F, 0.3531F, 0.0F, 0.1309F, 0.0F));

		PartDefinition BackFlipperL = Pliosaurus.addOrReplaceChild("BackFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0F, 6.4806F, -1.82F, 0.1309F, -0.3491F, -0.2618F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(11.267F, 0.5F, -2.3177F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(16.2489F, 0.5F, 3.4266F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperL2 = Pliosaurus.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.0F, 6.4806F, -1.82F, 0.0681F, 0.298F, 0.2284F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.267F, 0.5F, -2.3177F, 0.0F, 0.1309F, 0.0F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.2489F, 0.5F, 3.4266F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Tail1 = Pliosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 7.0F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r4 = Tail1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 0).addBox(-1.5F, -2.0746F, -0.5527F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.42F))
				.texOffs(112, 0).addBox(-1.5F, -1.6746F, -0.5527F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 2.8509F, 0.2314F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 123).addBox(-1.0F, -1.6845F, -0.3896F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1509F, 8.2314F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6491F, 13.8314F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r6 = Tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, 0.7286F, -0.296F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 2.9F, 0.0886F, -0.1739F, -0.0154F));

		PartDefinition cube_r7 = Tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, 0.6F, -0.293F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -0.0287F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3227F, 5.9713F, 0.0704F, -0.1306F, -0.0092F));

		PartDefinition cube_r8 = Tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 84).addBox(-1.0F, 1.3F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.6983F, 4.0488F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 134).addBox(-1.0F, -0.9F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7017F, -0.4512F, 0.0524F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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