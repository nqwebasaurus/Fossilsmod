package fossils.fossils.client.blockentity.model.zarafasaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ZarafasauraFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart snout;
	private final ModelPart snout2;
	private final ModelPart forehead;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;

	public ZarafasauraFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail = this.Hips.getChild("Tail");
		this.BackFlipperR2 = this.Tail.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Tail.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.tail3 = this.Tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.snout = this.Head.getChild("snout");
		this.snout2 = this.snout.getChild("snout2");
		this.forehead = this.snout2.getChild("forehead");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperR2 = this.Chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.Chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.8539F, -3.0305F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 13).addBox(-1.0F, 0.4978F, 0.085F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(49, 35).addBox(-0.5F, 0.2198F, 0.0363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6962F, 11.3425F, -0.1664F, 0.0861F, -0.0144F));

		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 31).addBox(-0.9F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9197F, 2.5363F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 36).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.7198F, 2.5363F, -1.5708F, 0.0F, 0.0F));

		PartDefinition BackFlipperR2 = Tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5415F, 3.5595F, 2.4315F, 0.4894F, -0.0718F, -0.5808F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4448F, 0.0209F, 0.4833F, 0.0F, -0.3403F, 0.0F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.415F, -0.4473F, -17.069F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperR3 = Tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5415F, 3.5595F, 2.4315F, 0.4457F, 0.0718F, 0.5808F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4448F, 0.0209F, 0.4833F, 0.0F, 0.3403F, 0.0F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.415F, -0.4473F, -17.069F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, 0.3887F, -0.5726F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 53).addBox(-0.5F, 0.3887F, 3.1274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2516F, 4.0885F, 0.1114F, 0.3471F, 0.038F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(38, 24).addBox(-0.5F, 0.0741F, -0.335F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.258F, 3.8826F, 0.0813F, 0.261F, 0.021F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8212F, 3.6925F, 0.0352F, 0.1308F, 0.0046F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.35F, -0.7F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -7.9F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r5 = Chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 31).addBox(-1.1F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.9526F, -2.973F, -1.5708F, -0.1745F, 1.5708F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 38).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.4073F, -3.5981F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 34).addBox(-0.5F, 0.4F, -6.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -5.7F, -0.1767F, 0.076F, 0.161F));

		PartDefinition cube_r8 = Neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 10).addBox(-1.5F, 0.325F, -3.15F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -4.9F, -0.1642F, 0.1437F, 0.064F));

		PartDefinition cube_r9 = Neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 29).addBox(-1.5F, -0.3F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 23).addBox(-1.5F, -0.3F, -3.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.3F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4453F, -7.0027F, -0.0272F, -0.1925F, -0.0948F));

		PartDefinition cube_r10 = Neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 35).addBox(-1.5F, -0.35F, -5.55F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0742F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.413F, -4.871F, -0.029F, -0.1177F, -0.1512F));

		PartDefinition cube_r11 = Neck5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -0.575F, -5.275F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 0.7F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(38, 17).addBox(-0.5F, -0.3F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.075F, -4.9991F, -0.0124F, -0.1765F, -0.0821F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(13, 49).addBox(-0.5F, -0.1F, -3.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.1457F, -4.7911F, 0.2657F, -0.1685F, -0.0456F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0393F, -2.7372F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7307F, -2.9796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forehead = snout2.addOrReplaceChild("forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5262F, -0.0568F, 1.0647F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4879F, 4.4123F, -3.3832F, -0.1361F, -0.3795F, 0.8012F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2723F, -4.2839F, -0.6396F, 0.0F, 0.0436F, 0.0F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9888F, 0.0F, -18.8073F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR3 = Chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4879F, 4.4123F, -3.3832F, -0.0648F, 0.3971F, -0.6136F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2723F, -4.2839F, -0.6396F, 0.0F, -0.0436F, 0.0F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9888F, 0.0F, -18.8073F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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