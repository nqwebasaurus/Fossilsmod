package fossils.fossils.client.blockentity.model.manidens;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ManidensFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Manidens;
	private final ModelPart hips;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL2;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart rightArm;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;

	public ManidensFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Manidens = this.fossil.getChild("Manidens");
		this.hips = this.Manidens.getChild("hips");
		this.LegL = this.hips.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.MetatarsalL = this.KneeL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.LegL2 = this.hips.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.MetatarsalL2 = this.KneeL2.getChild("MetatarsalL2");
		this.FootL2 = this.MetatarsalL2.getChild("FootL2");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.ElbowL = this.leftArm.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.rightArm = this.chest.getChild("rightArm");
		this.ElbowL2 = this.rightArm.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(2.0F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0F, -22.0F, -9.0F, -0.3316F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.5F, -8.0F, -0.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-4.0F, -22.0F, -9.0F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.9F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -19.5F, 1.4F, -0.4625F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2F, -19.5F, 1.4F, 0.0F, 0.4625F, 0.0F));

		PartDefinition Manidens = fossil.addOrReplaceChild("Manidens", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, 5.0F));

		PartDefinition hips = Manidens.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, -0.4908F, 0.4311F, -0.0175F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 31).addBox(-0.5F, 0.5596F, 0.3068F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7535F, -1.5286F, -0.2531F, 0.0F, 0.0F));

		PartDefinition LegL = hips.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 0.925F, -0.0821F, -0.8696F, 0.05F, 0.121F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4387F, -0.3215F, 0.6877F, 0.0271F, -0.1281F));

		PartDefinition MetatarsalL = KneeL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0039F, 5.8485F, -1.2828F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0345F, 2.0111F, 2.3126F, 0.0F, 0.0F));

		PartDefinition LegL2 = hips.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 0.925F, -0.0821F, 0.1298F, 0.017F, -0.1298F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.4387F, -0.3215F, -0.0964F, 0.145F, 0.1421F));

		PartDefinition MetatarsalL2 = KneeL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0039F, 5.8485F, -0.3229F, 0.0F, 0.0F));

		PartDefinition FootL2 = MetatarsalL2.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0345F, 2.0111F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(15, -1).addBox(-0.5F, 0.1495F, -0.7198F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.8465F, 3.6714F, -0.0987F, 0.0808F, -0.0421F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0495F, 8.8802F, 0.628F, 0.5057F, 0.228F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 13).addBox(-0.5F, -0.2F, -1.6F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2934F, 1.0645F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3934F, 9.0645F, 0.2256F, 0.2555F, 0.0579F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.4F, -1.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2791F, 0.9445F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5209F, 11.8445F, -0.4674F, -0.3542F, 0.1733F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6535F, -1.7286F, -0.2376F, -0.1273F, 0.0307F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, -2).addBox(-0.5F, 2.2F, -0.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.2921F, -6.4001F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3921F, -6.8001F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2341F, -0.1366F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1985F, -4.7349F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.5985F, -3.3349F, -0.1511F, -0.3573F, -0.7424F));

		PartDefinition ElbowL = leftArm.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 3.259F, 1.8468F, -0.1136F, -0.1998F, 0.0882F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.5273F, -1.6503F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.5985F, -3.3349F, -0.5538F, 0.0118F, 1.0003F));

		PartDefinition ElbowL2 = rightArm.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 3.259F, 1.8468F, -0.4653F, 0.4763F, -0.2263F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.5273F, -1.6503F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6985F, -4.6349F, -0.3079F, -0.1248F, 0.0396F));

		PartDefinition cube_r11 = neck1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 25).addBox(-0.5F, -0.4272F, -0.4735F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.301F, -3.8564F, -0.2356F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.701F, -3.5564F, -0.3414F, -0.0741F, -0.2054F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 37).addBox(-0.5F, 0.4231F, 0.2979F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.4F, -1.5F, -0.8814F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(45, 3).addBox(-0.5F, 0.3055F, 0.0771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.3F, -0.6458F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6347F, -0.4043F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 55, 55);
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