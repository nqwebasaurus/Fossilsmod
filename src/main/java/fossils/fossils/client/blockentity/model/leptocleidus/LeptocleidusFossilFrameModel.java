package fossils.fossils.client.blockentity.model.leptocleidus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LeptocleidusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public LeptocleidusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.body = this.main.getChild("body");
		this.FrontFlipperR2 = this.body.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.body.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.main.getChild("tail");
		this.BackFlipperR2 = this.tail.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.tail.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.2F, -3.0F, 0.0472F, 0.0006F, 0.0106F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-2, 7).addBox(-3.0F, -0.2F, -0.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, 1.2F, -5.3F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.65F, -5.0F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 18).addBox(-2.1F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0458F, 3.676F, -4.5953F, -1.5533F, 0.0698F, -1.5708F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 25).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0458F, 1.0823F, -4.7766F, -1.501F, -0.0174F, -0.0012F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 22).addBox(0.1F, -0.2F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.0F, -7.0F, 0.0698F, -0.0174F, -0.0012F));

		PartDefinition FrontFlipperR2 = body.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 5.5551F, -4.9755F, -0.1328F, 0.4401F, 0.0767F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9522F, -0.071F, -0.3716F, -0.045F, -0.123F, 0.3518F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3469F, 0.0F, -0.8308F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR3 = body.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 5.5551F, -4.9755F, -0.2872F, -0.2378F, -0.383F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9522F, -0.071F, -0.3716F, -0.0396F, 0.1248F, -0.3079F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3469F, 0.0F, -0.8308F, 0.0F, 0.1309F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.45F, -7.0F, 0.0432F, -0.0084F, -0.1704F));

		PartDefinition cube_r5 = neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 11).addBox(0.0F, -0.5F, -0.9F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.2F, -8.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.65F, -8.1F, -0.263F, 0.089F, 0.1093F));

		PartDefinition cube_r6 = neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.6F, -5.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(30, 29).addBox(-0.5F, 0.3F, -5.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.05F, -5.9F, -0.0871F, 0.1692F, 0.1791F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1232F, -5.0162F, -0.283F, 0.2047F, -0.0942F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7996F, 0.1833F, -5.9863F, 0.2213F, 0.271F, -0.4931F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7996F, 0.1833F, -5.9863F, 0.2213F, -0.271F, 0.4931F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.9627F, 0.9064F, 0.7505F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9F, 3.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 37).addBox(-2.5F, 0.6F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, -0.6893F, 0.156F, 0.0349F, 0.0F, 0.0F));

		PartDefinition BackFlipperR2 = tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 4.0611F, 4.9647F, 0.2376F, -0.1233F, -0.0943F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9029F, 0.0189F, 0.7426F, 0.0411F, -0.3027F, -0.1372F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6407F, 0.0F, -0.9261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperR3 = tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 4.0611F, 4.9647F, 0.2376F, 0.1233F, 0.0943F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9029F, 0.0189F, 0.7426F, 0.0945F, 0.2909F, 0.3193F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6407F, 0.0F, -0.9261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6393F, 4.856F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 3).addBox(-2.3F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 2.808F, 0.7365F, -1.5708F, 0.0873F, -1.5708F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(41, 10).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 0.716F, 0.5534F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(41, 10).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.6824F, 0.0432F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1176F, 3.4932F, 0.1834F, -0.0429F, -0.008F));

		PartDefinition cube_r11 = tail3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 40).addBox(-0.5F, 0.6F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.3984F, 0.2742F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(45, 45).addBox(0.0F, 0.7F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6484F, 4.0242F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.375F, 3.95F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r12 = tail5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.6F, 0.0F, 0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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