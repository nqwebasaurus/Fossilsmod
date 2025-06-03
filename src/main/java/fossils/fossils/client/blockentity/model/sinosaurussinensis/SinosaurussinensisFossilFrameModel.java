package fossils.fossils.client.blockentity.model.sinosaurussinensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SinosaurussinensisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart LegL;
	private final ModelPart TibiaL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart TibiaL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCrest;
	private final ModelPart rightCrest;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public SinosaurussinensisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.LegL = this.hips.getChild("LegL");
		this.TibiaL = this.LegL.getChild("TibiaL");
		this.MetatarsalL = this.TibiaL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.hips.getChild("LegL2");
		this.TibiaL2 = this.LegL2.getChild("TibiaL2");
		this.MetatarsalL2 = this.TibiaL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.ArmL = this.chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCrest = this.head.getChild("leftCrest");
		this.rightCrest = this.head.getChild("rightCrest");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -18.0F, -2.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-3.0F, -1.9F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -13.1F, -17.6F, 0.0F, 0.3142F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.4F, -6.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -13.1F, -17.6F, -0.3142F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.1F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -15.0F, -1.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.4F, -2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 11).addBox(-1.0F, 0.7F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.2F, -3.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition LegL = hips.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 1.0F, -0.8F, -0.6504F, 0.0795F, 0.1041F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1092F, -2.3F, 0.4447F, -0.0188F, 0.0394F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.7993F, 3.6236F, 0.0F, 0.0F, -0.1309F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.0941F, -1.1838F, -0.0872F, -0.0038F, -0.0435F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, -2.3F));

		PartDefinition LegL2 = hips.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 1.0F, -0.8F, 0.1731F, 0.0227F, -0.1289F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1092F, -2.3F, 0.1396F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.7993F, 3.6236F, -0.2575F, 0.0474F, 0.0866F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.0941F, -1.1838F, 0.217F, -0.0143F, 0.001F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.3F, -0.48F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(12, 11).addBox(-0.5F, 0.0902F, -9.1792F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.4F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, 0.2F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -9.1F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 34).addBox(-1.0F, 0.5174F, -0.0015F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.8F, 0.1396F, 0.0F, 0.0F));

		PartDefinition ArmL = chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 4.8709F, -3.1339F, -0.7348F, 0.2394F, -0.5325F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1722F, 2.6944F, 2.5395F, -0.6894F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.6586F, -0.9608F, -0.0756F, 0.0436F, 0.6267F));

		PartDefinition ArmL2 = chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 4.8709F, -3.1339F, 0.1923F, -0.3726F, 0.5986F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1722F, 2.6944F, 2.5395F, -0.6894F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.6586F, -0.9608F, -0.0791F, -0.0368F, -0.5396F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -4.7F, -0.3124F, 0.2079F, -0.0666F));

		PartDefinition cube_r7 = neck4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 39).addBox(-1.0F, -0.0465F, -0.2174F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.0F, -2.9F, 0.2793F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -0.3423F, 0.1116F, 0.0526F));

		PartDefinition cube_r8 = neck3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 27).addBox(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.9F, -0.1564F, 0.2518F, 0.0571F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, 0.7117F, 0.4711F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.5F, -4.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.2384F, 0.088F, 0.1994F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 26).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.1173F, 0.1839F, 0.065F));

		PartDefinition leftCrest = head.addOrReplaceChild("leftCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.8167F, -6.6333F, 0.0F, 0.0F, -0.1571F));

		PartDefinition rightCrest = head.addOrReplaceChild("rightCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.8167F, -6.6333F, 0.0F, 0.0F, 0.1571F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, 0.8F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(-1, 25).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.4F, 0.0252F, -0.1465F, 0.0047F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 11).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.2376F, -0.1273F, -0.0307F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(-1, 12).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.2833F, 0.1677F, -0.0486F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(16, 23).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.3604F, 0.2457F, -0.0914F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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