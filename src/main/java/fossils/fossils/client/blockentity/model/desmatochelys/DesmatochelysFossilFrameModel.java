package fossils.fossils.client.blockentity.model.desmatochelys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DesmatochelysFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR5;
	private final ModelPart FrontFlipperMiddleR5;
	private final ModelPart FrontFlipperEndR5;
	private final ModelPart Tail;
	private final ModelPart bone;
	private final ModelPart tail3;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart FrontFlipperMiddleR4;
	private final ModelPart FrontFlipperEndR4;

	public DesmatochelysFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.FrontFlipperR3 = this.Hips.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR5 = this.Hips.getChild("FrontFlipperR5");
		this.FrontFlipperMiddleR5 = this.FrontFlipperR5.getChild("FrontFlipperMiddleR5");
		this.FrontFlipperEndR5 = this.FrontFlipperMiddleR5.getChild("FrontFlipperEndR5");
		this.Tail = this.Hips.getChild("Tail");
		this.bone = this.Tail.getChild("bone");
		this.tail3 = this.Tail.getChild("tail3");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.FrontFlipperR2 = this.Chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR4 = this.Chest.getChild("FrontFlipperR4");
		this.FrontFlipperMiddleR4 = this.FrontFlipperR4.getChild("FrontFlipperMiddleR4");
		this.FrontFlipperEndR4 = this.FrontFlipperMiddleR4.getChild("FrontFlipperEndR4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.5612F, -8.1508F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 34).addBox(-1.0F, -0.1522F, -0.3149F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = Hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8908F, 2.4001F, 13.5401F, -0.0327F, -0.098F, 0.3324F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1563F, -0.2839F, -1.4716F, 0.1957F, -1.0294F, -0.4292F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1027F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR5 = Hips.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8908F, 2.4001F, 13.5401F, -0.0327F, 0.098F, -0.3324F));

		PartDefinition FrontFlipperMiddleR5 = FrontFlipperR5.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1563F, -0.2839F, -1.4716F, 0.2278F, 1.0075F, 0.4173F));

		PartDefinition FrontFlipperEndR5 = FrontFlipperMiddleR5.addOrReplaceChild("FrontFlipperEndR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1027F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7027F, 10.429F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 4).addBox(0.8F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.2105F, 3.224F, -1.5708F, 0.3229F, -1.5708F));

		PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 5).addBox(-0.5F, -2.7136F, 1.2386F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.3243F, -0.4106F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0864F, -0.1614F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3243F, -0.0106F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bone = Tail.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.4011F, -0.6327F, 5.6838F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(20, 75).addBox(-0.5F, 1.4497F, -0.3225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3658F, 9.6224F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8212F, 3.6925F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, 0.65F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0367F, -8.0011F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 41).addBox(-0.5F, 0.65F, 2.175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 56).addBox(-0.8F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 7.271F, -5.4213F, 1.5765F, -0.1308F, 1.5268F));

		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 62).addBox(-0.5F, -0.5F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.1154F, -6.1001F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(65, 63).addBox(-0.5F, 0.9186F, -3.9738F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0712F, 2.2485F, -6.9064F, 0.9525F, -0.0104F, 0.0027F));

		PartDefinition cube_r10 = Neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 75).addBox(-1.4288F, 0.6F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3169F, -2.4772F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(93, 1).addBox(-1.4288F, -0.1F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(92, 0).addBox(-1.4288F, -0.1F, 1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0002F, 0.156F, -1.7867F, -0.2705F, 0.0042F, 0.002F));

		PartDefinition cube_r12 = Neck4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 0).addBox(-1.429F, -0.2F, -5.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0818F, -3.5058F, 0.4352F, -0.017F, 0.1298F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4F, 2.0497F, -8.8515F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2579F, 2.0497F, -8.8515F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.8418F, -2.9379F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6303F, -9.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1952F, -8.8025F, 0.0436F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4684F, 6.5407F, -4.0884F, 0.3322F, 0.6267F, 0.5804F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7697F, -0.2839F, -1.9413F, 0.0F, -1.0472F, 0.0F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1028F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR4 = Chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4684F, 6.5407F, -4.0884F, 0.5666F, 0.0943F, -0.0808F));

		PartDefinition FrontFlipperMiddleR4 = FrontFlipperR4.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7697F, -0.2839F, -1.9413F, 0.3587F, 1.0075F, 0.4173F));

		PartDefinition FrontFlipperEndR4 = FrontFlipperMiddleR4.addOrReplaceChild("FrontFlipperEndR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1028F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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