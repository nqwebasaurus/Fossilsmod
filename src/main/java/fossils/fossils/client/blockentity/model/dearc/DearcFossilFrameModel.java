package fossils.fossils.client.blockentity.model.dearc;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DearcFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart wingleft1;
	private final ModelPart wingleft2;
	private final ModelPart wingleft3;
	private final ModelPart wingleft4;
	private final ModelPart handleft;
	private final ModelPart wingright1;
	private final ModelPart wingright2;
	private final ModelPart wingright3;
	private final ModelPart wingright4;
	private final ModelPart handright;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head4;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart throat;
	private final ModelPart body1;
	private final ModelPart upperlegleft;
	private final ModelPart lowerlegleft;
	private final ModelPart footleft;
	private final ModelPart upperlegright;
	private final ModelPart lowerlegright;
	private final ModelPart footright;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public DearcFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.wingleft1 = this.chest.getChild("wingleft1");
		this.wingleft2 = this.wingleft1.getChild("wingleft2");
		this.wingleft3 = this.wingleft2.getChild("wingleft3");
		this.wingleft4 = this.wingleft3.getChild("wingleft4");
		this.handleft = this.wingleft3.getChild("handleft");
		this.wingright1 = this.chest.getChild("wingright1");
		this.wingright2 = this.wingright1.getChild("wingright2");
		this.wingright3 = this.wingright2.getChild("wingright3");
		this.wingright4 = this.wingright3.getChild("wingright4");
		this.handright = this.wingright3.getChild("handright");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head2 = this.neck2.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head4 = this.head3.getChild("head4");
		this.jaw = this.head2.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.throat = this.jaw2.getChild("throat");
		this.body1 = this.chest.getChild("body1");
		this.upperlegleft = this.body1.getChild("upperlegleft");
		this.lowerlegleft = this.upperlegleft.getChild("lowerlegleft");
		this.footleft = this.lowerlegleft.getChild("footleft");
		this.upperlegright = this.body1.getChild("upperlegright");
		this.lowerlegright = this.upperlegright.getChild("lowerlegright");
		this.footright = this.lowerlegright.getChild("footright");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.75F, 0.5F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.25F, -5.7F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, 0.4374F, 0.3853F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.65F, 2.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 53).addBox(-2.6F, 0.1F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.142F, 0.1152F, -1.5708F, -0.1396F, 1.5708F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(3, 55).addBox(-0.5F, 0.7F, -0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -1.4973F, 1.1365F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(3, 55).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.35F, -0.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition wingleft1 = chest.addOrReplaceChild("wingleft1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, -1.6152F, -2.1332F, 0.6676F, 0.2914F, -0.2661F));

		PartDefinition wingleft2 = wingleft1.addOrReplaceChild("wingleft2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0762F, 0.1784F, 0.1503F, -0.0796F, 0.5786F, -1.812F));

		PartDefinition wingleft3 = wingleft2.addOrReplaceChild("wingleft3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 10.3F, 1.0F, -1.9547F, -1.4023F, 1.1516F));

		PartDefinition wingleft4 = wingleft3.addOrReplaceChild("wingleft4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3863F, 0.4901F, 7.4559F, 0.1752F, 0.0873F, -1.4393F));

		PartDefinition handleft = wingleft3.addOrReplaceChild("handleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2137F, 1.2901F, 2.5559F, -0.0421F, 1.2222F, 1.0472F));

		PartDefinition wingright1 = chest.addOrReplaceChild("wingright1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, -1.6152F, -2.1332F, 0.7003F, -0.181F, 0.1271F));

		PartDefinition wingright2 = wingright1.addOrReplaceChild("wingright2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0762F, 0.1784F, 0.1503F, -0.1022F, -0.5601F, 1.8604F));

		PartDefinition wingright3 = wingright2.addOrReplaceChild("wingright3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 10.3F, 1.0F, -2.3336F, 1.3635F, -1.5799F));

		PartDefinition wingright4 = wingright3.addOrReplaceChild("wingright4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3863F, 0.4901F, 7.4559F, 0.1752F, -0.0873F, 1.4393F));

		PartDefinition handright = wingright3.addOrReplaceChild("handright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2137F, 1.2901F, 2.5559F, -0.0421F, -1.2222F, -1.0472F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.75F, -0.6F, 0.0424F, 0.2602F, -0.0193F));

		PartDefinition cube_r5 = neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 20).addBox(-0.5F, -0.479F, -3.3319F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5828F, -0.5635F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5828F, -3.8635F, 0.578F, 0.1492F, 0.1988F));

		PartDefinition cube_r6 = neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 55).addBox(-1.0F, 0.5373F, -2.9718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.8475F, -4.6567F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 39).addBox(-1.0F, 0.5F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.3475F, -0.2567F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head2 = neck2.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1025F, -6.6817F, 0.3469F, 0.1517F, 0.0866F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7732F, -2.1823F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head4 = head3.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -4.825F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3732F, -1.1823F, 0.3796F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4008F, -1.0017F, 0.48F, 0.0F, 0.0F));

		PartDefinition throat = jaw2.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body1 = chest.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -0.0558F, 0.042F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.95F, 6.2F, -0.0412F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 54).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4442F, 1.542F, 0.0F, -1.5708F, 0.0F));

		PartDefinition upperlegleft = body1.addOrReplaceChild("upperlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.8174F, 1.9066F, 0.3753F, -0.2484F, -1.3667F));

		PartDefinition lowerlegleft = upperlegleft.addOrReplaceChild("lowerlegleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 3.7F, -0.3F, 1.0683F, 0.0F, 0.0227F));

		PartDefinition footleft = lowerlegleft.addOrReplaceChild("footleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6F, -0.3F, 0.8992F, 0.4554F, 0.0094F));

		PartDefinition upperlegright = body1.addOrReplaceChild("upperlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.8174F, 1.9066F, 0.3753F, 0.2484F, 1.3667F));

		PartDefinition lowerlegright = upperlegright.addOrReplaceChild("lowerlegright", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 3.7F, -0.3F, 1.1555F, 0.0F, -0.0227F));

		PartDefinition footright = lowerlegright.addOrReplaceChild("footright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6F, -0.3F, 0.8556F, -0.4554F, -0.0094F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(52, 33).addBox(-0.5F, 0.1434F, -0.1336F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2308F, 2.842F, 0.0394F, -0.0872F, -0.0034F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 0.2088F, -0.3101F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1066F, 3.9664F, 0.0179F, -0.2181F, -0.0039F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, 0.1077F, -0.7507F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1338F, 6.0899F, 0.0F, 0.2618F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0077F, 4.5493F, -0.0226F, 0.2617F, -0.0058F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0285F, 0.6979F, 0.0183F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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