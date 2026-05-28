package fossils.fossils.client.blockentity.model.attenborosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AttenborosaurusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart tail6;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck8;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart snout;
	private final ModelPart snout2;
	private final ModelPart forehead;
	private final ModelPart forehead2;
	private final ModelPart forehead3;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;

	public AttenborosaurusFossilFrameModel(ModelPart root) {
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
		this.tail5 = this.tail4.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.tail6 = this.tail2.getChild("tail6");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck8 = this.Neck6.getChild("Neck8");
		this.Neck7 = this.Neck8.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.snout = this.Head.getChild("snout");
		this.snout2 = this.snout.getChild("snout2");
		this.forehead = this.snout2.getChild("forehead");
		this.forehead2 = this.forehead.getChild("forehead2");
		this.forehead3 = this.forehead.getChild("forehead3");
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

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.871F, 10.2507F, -0.2747F, -0.3082F, -0.6546F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 0).addBox(-1.0F, -0.2022F, -0.1149F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, 0.3607F, 0.1281F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7027F, 10.429F, -0.2376F, -0.1273F, 0.0307F));

		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.3877F, 4.0005F, -1.5708F, 0.3927F, -1.5708F));

		PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 3).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.5607F, 2.1281F, -1.1781F, 0.0F, 0.0F));

		PartDefinition BackFlipperR2 = Tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 8.5106F, 3.4723F, 0.4233F, -0.3897F, 0.7006F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7288F, 0.0209F, 1.8225F, 0.0F, -0.3403F, 0.0F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(12.2241F, -0.0158F, -1.8824F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperR3 = Tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, 8.5106F, 3.4723F, 0.4737F, 0.5865F, -0.5937F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7288F, 0.0209F, 1.8225F, -0.1205F, 0.3191F, -0.3685F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.2241F, -0.0158F, -1.8824F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.44F, 10.2261F, 0.0179F, -0.2181F, -0.0039F));

		PartDefinition cube_r4 = tail3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 71).addBox(-0.5F, -1.0F, 9.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 62).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6887F, 0.9274F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(77, 75).addBox(-0.5F, 0.1741F, -0.135F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 82).addBox(-0.5F, 0.1741F, 7.065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.2135F, 10.8853F, 0.1409F, -0.2179F, -0.0116F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(61, 85).addBox(-0.5F, 0.0906F, -0.4604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 91).addBox(-0.5F, 0.0906F, 6.2396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0517F, 7.8498F, 0.2365F, -0.3054F, -0.0055F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(78, 85).addBox(-0.5F, 0.0906F, -0.1604F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0175F, 6.9181F, 0.0951F, -0.218F, 0.0077F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(66, 49).addBox(-0.575F, 0.0906F, -0.6604F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.0007F, 0.1745F, -0.3491F, 0.0F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8212F, 3.6925F, 0.0714F, 0.2177F, 0.0097F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5F, 0.3795F, -12.9815F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -14.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 39).addBox(-0.5F, 0.65F, -7.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -27.0F, 0.0087F, 0.0436F, -0.0015F));

		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(97, 37).addBox(-0.5F, -0.4784F, -3.8094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.0F, -10.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(97, 37).addBox(-0.5F, -0.4784F, 4.4906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(93, 33).addBox(-0.5F, -0.4784F, -0.2094F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.2023F, -13.3929F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 66).addBox(-3.6F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.9966F, -8.2448F, -1.5708F, -0.2182F, -1.5708F));

		PartDefinition cube_r10 = Chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 71).addBox(-0.5F, 3.0F, 1.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.8963F, -3.5291F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 70).addBox(-0.5F, 0.7F, -2.9F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -13.5F, -0.0074F, -0.0541F, 0.003F));

		PartDefinition cube_r12 = Neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 92).addBox(-1.5F, -0.1F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.6498F, -6.2799F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1105F, -5.9049F, 0.1671F, -0.0637F, 0.1103F));

		PartDefinition cube_r13 = Neck3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1877F, -10.0066F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -10.0F, 0.0528F, -0.1742F, -0.0168F));

		PartDefinition cube_r14 = Neck4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(93, 67).addBox(-1.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(87, 61).addBox(-1.5F, -0.2F, -7.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5971F, -7.2045F, -0.1111F, -0.1252F, 0.0613F));

		PartDefinition cube_r15 = Neck5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 55).addBox(-1.5F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 49).addBox(-1.5F, -0.3F, -7.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.7F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, 0.0F, -6.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -7.0F, -0.1643F, -0.0717F, 0.1038F));

		PartDefinition Neck8 = Neck6.addOrReplaceChild("Neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.003F, -6.9963F, -0.115F, -0.1148F, 0.1289F));

		PartDefinition cube_r16 = Neck8.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 17).addBox(-0.5F, -0.5F, 7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(82, 10).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0F, 0.0131F, 0.0F));

		PartDefinition Neck7 = Neck8.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2328F, -7.7095F, 0.1617F, -0.2367F, 0.1794F));

		PartDefinition cube_r17 = Neck7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(74, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, -9.4F, 0.0F, 0.0175F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0564F, -10.0991F, -0.088F, -0.1304F, 0.0115F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7557F, -2.4796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forehead = snout2.addOrReplaceChild("forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition forehead2 = forehead.addOrReplaceChild("forehead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9354F, -1.1362F, -0.1876F, 0.0F, 0.0F));

		PartDefinition forehead3 = forehead.addOrReplaceChild("forehead3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.9354F, -1.1362F, -0.1876F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 2.2556F, 0.4423F, 0.7251F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7853F, 10.1441F, -8.6801F, -0.3566F, 0.0593F, -0.303F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5701F, -0.2839F, -0.74F, -0.0184F, 0.0395F, -0.4367F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.1695F, 0.0507F, -1.8509F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR3 = Chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7853F, 10.1441F, -8.6801F, -0.0817F, -0.0159F, 0.2638F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5701F, -0.2839F, -0.74F, -0.0184F, -0.0395F, 0.4367F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.1695F, 0.0507F, -1.8509F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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