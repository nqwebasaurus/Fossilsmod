package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RhynchodercetisFossilSlabModel extends SkullModelBase {
	private final ModelPart Fossil;
	private final ModelPart rhynchodercetis;
	private final ModelPart body;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart frontLeftFin;
	private final ModelPart frontRightFin;
	private final ModelPart jaw;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart backLeftFin;
	private final ModelPart backRightFin;
	private final ModelPart tail3;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart tail4;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart Matrix;

	public RhynchodercetisFossilSlabModel(ModelPart root) {
		this.Fossil = root.getChild("Fossil");
		this.rhynchodercetis = this.Fossil.getChild("rhynchodercetis");
		this.body = this.rhynchodercetis.getChild("body");
		this.cube_r1 = this.body.getChild("cube_r1");
		this.cube_r2 = this.body.getChild("cube_r2");
		this.cube_r3 = this.body.getChild("cube_r3");
		this.cube_r4 = this.body.getChild("cube_r4");
		this.cube_r5 = this.body.getChild("cube_r5");
		this.cube_r6 = this.body.getChild("cube_r6");
		this.cube_r7 = this.body.getChild("cube_r7");
		this.cube_r8 = this.body.getChild("cube_r8");
		this.cube_r9 = this.body.getChild("cube_r9");
		this.frontLeftFin = this.body.getChild("frontLeftFin");
		this.frontRightFin = this.body.getChild("frontRightFin");
		this.jaw = this.body.getChild("jaw");
		this.cube_r10 = this.jaw.getChild("cube_r10");
		this.cube_r11 = this.jaw.getChild("cube_r11");
		this.tail = this.rhynchodercetis.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.backLeftFin = this.tail2.getChild("backLeftFin");
		this.backRightFin = this.tail2.getChild("backRightFin");
		this.tail3 = this.tail2.getChild("tail3");
		this.cube_r12 = this.tail3.getChild("cube_r12");
		this.cube_r13 = this.tail3.getChild("cube_r13");
		this.tail4 = this.tail3.getChild("tail4");
		this.cube_r14 = this.tail4.getChild("cube_r14");
		this.cube_r15 = this.tail4.getChild("cube_r15");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.Matrix = this.Fossil.getChild("Matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Fossil = partdefinition.addOrReplaceChild("Fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition rhynchodercetis = Fossil.addOrReplaceChild("rhynchodercetis", CubeListBuilder.create().texOffs(45, 40).addBox(0.025F, -13.9F, -5.0673F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.6663F, -0.125F, 3.7467F, -0.3491F, 0.0F, -1.5708F));

		PartDefinition body = rhynchodercetis.addOrReplaceChild("body", CubeListBuilder.create().texOffs(52, 55).addBox(-0.475F, -13.8088F, -7.8491F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(63, 59).addBox(-0.45F, -13.4686F, -8.8687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 63).addBox(0.0F, -13.933F, 2.3956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5776F, -0.5283F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 65).addBox(0.5F, -13.8769F, -3.6807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.9961F, -7.5138F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 59).addBox(0.5F, -14.151F, -3.7718F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.8391F, -3.5169F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 62).addBox(0.0F, -11.6249F, -3.141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.25F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 62).addBox(0.0F, -13.9877F, -0.558F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5552F, -11.4667F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -13.1429F, -6.4102F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2945F, -11.4444F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 62).addBox(0.0F, -13.1169F, -2.0269F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5747F, -8.5131F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 55).addBox(0.0F, -13.1249F, -0.141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.659F, -7.5605F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 56).addBox(0.025F, -13.1247F, -0.8615F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.675F, -3.75F, -0.0436F, 0.0F, 0.0F));

		PartDefinition frontLeftFin = body.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.825F, -2.25F, -0.7828F, 0.4242F, -0.3887F));

		PartDefinition frontRightFin = body.addOrReplaceChild("frontRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.825F, -2.25F, -0.7828F, -0.4242F, 0.3887F));

		PartDefinition jaw = body.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.7913F, -8.4085F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r10 = jaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 62).addBox(-0.05F, -12.9307F, -1.4015F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.236F, -2.9582F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r11 = jaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 40).addBox(-0.05F, -14.0807F, -7.3765F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.926F, -2.5134F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail = rhynchodercetis.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(56, 48).addBox(0.025F, -12.5311F, -6.3272F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(58, 40).addBox(0.0F, -10.5006F, -9.0961F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.75F, -0.2618F, 0.0F, 0.0F));

		PartDefinition backLeftFin = tail2.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.488F, 3.196F, -0.4606F, 0.3152F, -0.1526F));

		PartDefinition backRightFin = tail2.addOrReplaceChild("backRightFin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.488F, 3.196F, -0.4606F, -0.3152F, 0.1526F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0003F, 3.8101F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 55).addBox(0.0F, -1.286F, -13.1498F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.9994F, -0.0538F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 55).addBox(0.0F, 0.746F, -13.1568F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0253F, -0.0101F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0219F, 4.4682F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 52).addBox(0.0F, 7.8021F, -9.7736F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.7284F, 0.0217F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, 9.5415F, -9.0532F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7716F, 0.0217F, -0.048F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(30, 48).addBox(-0.025F, 12.1277F, -3.6797F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0284F, 4.5217F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(22, 62).addBox(-0.025F, 12.2761F, -3.1258F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(43, 48).addBox(-0.025F, 12.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(17, 40).addBox(0.95F, 10.6747F, 0.8616F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, 4.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Matrix = Fossil.addOrReplaceChild("Matrix", CubeListBuilder.create().texOffs(0, 0).addBox(-25.0F, -2.0F, -14.0F, 37.0F, 1.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 1.0F, -6.1423F));

		return LayerDefinition.create(meshdefinition, 160, 75);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {
		this.Fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}