package fossils.fossils.client.blockentity.model.archelon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArchelonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR5;
	private final ModelPart FrontFlipperMiddleR5;
	private final ModelPart FrontFlipperEndR5;
	private final ModelPart Tail;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail2;
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

	public ArchelonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.FrontFlipperR3 = this.Hips.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR5 = this.Hips.getChild("FrontFlipperR5");
		this.FrontFlipperMiddleR5 = this.FrontFlipperR5.getChild("FrontFlipperMiddleR5");
		this.FrontFlipperEndR5 = this.FrontFlipperMiddleR5.getChild("FrontFlipperEndR5");
		this.Tail = this.Hips.getChild("Tail");
		this.tail3 = this.Tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
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

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.5612F, -8.1508F, 0.0666F, -0.021F, 0.3047F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 74).addBox(-1.0F, -0.3022F, -0.2149F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = Hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.119F, 2.9484F, 17.2872F, -0.0327F, -0.098F, 0.3324F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1563F, -0.2839F, -1.4716F, -0.0754F, -1.0456F, 0.0871F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1028F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR5 = Hips.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.119F, 2.9484F, 17.2872F, -0.0327F, 0.098F, -0.3324F));

		PartDefinition FrontFlipperMiddleR5 = FrontFlipperR5.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1563F, -0.2839F, -1.4716F, -0.519F, 0.8982F, -0.3289F));

		PartDefinition FrontFlipperEndR5 = FrontFlipperMiddleR5.addOrReplaceChild("FrontFlipperEndR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1028F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7027F, 10.429F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-1, 36).addBox(1.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1291F, 5.6839F, -1.5708F, -0.2793F, 1.5708F));

		PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 44).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.1291F, 5.6839F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.0386F, -0.0614F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3243F, -0.0106F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5F, 1.2747F, -0.2725F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 122).addBox(-0.5F, 1.2747F, 2.4275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3658F, 9.6224F, 0.0613F, 0.0871F, 0.0053F));

		PartDefinition cube_r5 = tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 107).addBox(-0.5F, -0.3495F, 0.046F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6242F, 2.9815F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(63, 61).addBox(-0.5F, -0.0259F, -0.535F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 68).addBox(-0.5F, -0.0259F, 7.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3533F, 6.8627F, 0.2721F, 0.1619F, -0.0897F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.1094F, -0.0604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0517F, 7.8498F, -0.0054F, 0.1753F, -0.1299F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -0.1094F, -0.2604F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0175F, 6.9181F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8212F, 3.6925F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 25).addBox(-0.5F, 0.55F, -0.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0367F, -8.0011F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(110, 71).addBox(-0.5F, 0.6F, 2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(45, 97).addBox(1.4F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.1466F, -4.7587F, 1.5708F, -0.0436F, 1.5708F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 105).addBox(-0.5F, -0.5F, -6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.0505F, -4.9376F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(55, 107).addBox(-0.5F, 0.8436F, -3.9738F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.9F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0712F, 2.2485F, -6.9064F, 0.9525F, -0.0104F, 0.0027F));

		PartDefinition cube_r11 = Neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(110, 117).addBox(-1.4288F, 0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3169F, -2.4772F, -0.304F, -0.2447F, -0.198F));

		PartDefinition cube_r12 = Neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(128, 35).addBox(-1.4288F, -0.2F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(127, 34).addBox(-1.4288F, -0.2F, 1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0002F, 0.156F, -1.7867F, -0.5094F, -0.2463F, 0.178F));

		PartDefinition cube_r13 = Neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(82, 61).addBox(-1.429F, -0.2F, -5.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.0818F, -3.5058F, -0.3056F, -0.0872F, 0.0038F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4F, 2.0497F, -8.8515F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.2579F, 2.0497F, -8.8515F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.4765F, -1.5936F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6303F, -9.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1952F, -8.8025F, 0.0436F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.6269F, 7.0981F, -3.049F, 0.5477F, 0.8231F, 0.2208F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(12.2544F, -0.2839F, -0.3736F, 0.0216F, -0.5826F, 0.6319F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.8923F, 0.0507F, 0.1028F, -0.0341F, -0.1264F, 0.264F));

		PartDefinition FrontFlipperR4 = Chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.6269F, 7.0981F, -3.049F, 0.536F, -0.6119F, -0.6308F));

		PartDefinition FrontFlipperMiddleR4 = FrontFlipperR4.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.2544F, -0.2839F, -0.3736F, 0.1709F, 0.7562F, -0.6091F));

		PartDefinition FrontFlipperEndR4 = FrontFlipperMiddleR4.addOrReplaceChild("FrontFlipperEndR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.8923F, 0.0507F, 0.1028F, -0.0285F, 0.1278F, -0.22F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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