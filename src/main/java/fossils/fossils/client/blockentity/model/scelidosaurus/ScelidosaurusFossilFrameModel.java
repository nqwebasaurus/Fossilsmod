package fossils.fossils.client.blockentity.model.scelidosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ScelidosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart hipsOsteoderms;
	private final ModelPart hipsOsteoderms2;
	private final ModelPart tail;
	private final ModelPart tailOsteoderms;
	private final ModelPart tailOsteoderms2;
	private final ModelPart tail2;
	private final ModelPart tail2Osteoderms;
	private final ModelPart tail2Osteoderms2;
	private final ModelPart tail3;
	private final ModelPart tail3Osteoderms;
	private final ModelPart tail3Osteoderms2;
	private final ModelPart tail4;
	private final ModelPart tail4Osteoderms;
	private final ModelPart tail4Osteoderms2;
	private final ModelPart tail5;
	private final ModelPart tail5Osteoderms;
	private final ModelPart tail5Osteoderms2;
	private final ModelPart body;
	private final ModelPart bodyOsteoderms;
	private final ModelPart bodyOsteoderms2;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart chestOsteoderms;
	private final ModelPart chestOsteoderms2;
	private final ModelPart neck;
	private final ModelPart bipartiteOsteoderm3;
	private final ModelPart bipartiteOsteoderm6;
	private final ModelPart neck2;
	private final ModelPart bipartiteOsteoderm2;
	private final ModelPart bipartiteOsteoderm5;
	private final ModelPart neck3;
	private final ModelPart bipartiteOsteoderm;
	private final ModelPart bipartiteOsteoderm4;
	private final ModelPart head;
	private final ModelPart occipitalhorn;
	private final ModelPart occipitalhorn2;
	private final ModelPart Jaw;

	public ScelidosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.hipsOsteoderms = this.hips.getChild("hipsOsteoderms");
		this.hipsOsteoderms2 = this.hips.getChild("hipsOsteoderms2");
		this.tail = this.hips.getChild("tail");
		this.tailOsteoderms = this.tail.getChild("tailOsteoderms");
		this.tailOsteoderms2 = this.tail.getChild("tailOsteoderms2");
		this.tail2 = this.tail.getChild("tail2");
		this.tail2Osteoderms = this.tail2.getChild("tail2Osteoderms");
		this.tail2Osteoderms2 = this.tail2.getChild("tail2Osteoderms2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail3Osteoderms = this.tail3.getChild("tail3Osteoderms");
		this.tail3Osteoderms2 = this.tail3.getChild("tail3Osteoderms2");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail4Osteoderms = this.tail4.getChild("tail4Osteoderms");
		this.tail4Osteoderms2 = this.tail4.getChild("tail4Osteoderms2");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail5Osteoderms = this.tail5.getChild("tail5Osteoderms");
		this.tail5Osteoderms2 = this.tail5.getChild("tail5Osteoderms2");
		this.body = this.hips.getChild("body");
		this.bodyOsteoderms = this.body.getChild("bodyOsteoderms");
		this.bodyOsteoderms2 = this.body.getChild("bodyOsteoderms2");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.chestOsteoderms = this.chest.getChild("chestOsteoderms");
		this.chestOsteoderms2 = this.chest.getChild("chestOsteoderms2");
		this.neck = this.chest.getChild("neck");
		this.bipartiteOsteoderm3 = this.neck.getChild("bipartiteOsteoderm3");
		this.bipartiteOsteoderm6 = this.neck.getChild("bipartiteOsteoderm6");
		this.neck2 = this.neck.getChild("neck2");
		this.bipartiteOsteoderm2 = this.neck2.getChild("bipartiteOsteoderm2");
		this.bipartiteOsteoderm5 = this.neck2.getChild("bipartiteOsteoderm5");
		this.neck3 = this.neck2.getChild("neck3");
		this.bipartiteOsteoderm = this.neck3.getChild("bipartiteOsteoderm");
		this.bipartiteOsteoderm4 = this.neck3.getChild("bipartiteOsteoderm4");
		this.head = this.neck3.getChild("head");
		this.occipitalhorn = this.head.getChild("occipitalhorn");
		this.occipitalhorn2 = this.head.getChild("occipitalhorn2");
		this.Jaw = this.head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -18.0F, 1.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -5.6F, -0.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.4F, -16.2F, -20.9F, 0.0F, -0.2094F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.7F, -4.2F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.4F, -16.2F, -20.9F, 0.2094F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(2.6F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -15.0F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.6F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 38).addBox(-0.5F, 2.2F, -1.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 2.9F, 2.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 8.2932F, 1.4924F, 1.1345F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 8.1458F, 0.9011F, -0.48F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 2.9F, 2.7F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 8.2932F, 1.4924F, 1.0472F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 8.1458F, 0.9011F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, 0.6109F, 0.0F, 0.0F));

		PartDefinition hipsOsteoderms = hips.addOrReplaceChild("hipsOsteoderms", CubeListBuilder.create(), PartPose.offset(1.4F, -0.9589F, 5.103F));

		PartDefinition hipsOsteoderms2 = hips.addOrReplaceChild("hipsOsteoderms2", CubeListBuilder.create(), PartPose.offset(-1.4F, -0.9589F, 5.103F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.2829F, 0.1129F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.5976F, 7.7784F, -0.0632F, 0.2613F, -0.0164F));

		PartDefinition tailOsteoderms = tail.addOrReplaceChild("tailOsteoderms", CubeListBuilder.create(), PartPose.offset(1.4F, -3.1171F, 1.6129F));

		PartDefinition tailOsteoderms2 = tail.addOrReplaceChild("tailOsteoderms2", CubeListBuilder.create(), PartPose.offset(-1.4F, -3.1171F, 1.6129F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5F, 0.4218F, -0.1424F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1906F, 10.8833F, 0.0089F, 0.2182F, 0.0019F));

		PartDefinition tail2Osteoderms = tail2.addOrReplaceChild("tail2Osteoderms", CubeListBuilder.create(), PartPose.offset(1.2F, -0.6782F, 7.9576F));

		PartDefinition tail2Osteoderms2 = tail2.addOrReplaceChild("tail2Osteoderms2", CubeListBuilder.create(), PartPose.offset(-1.2F, -0.6782F, 7.9576F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, 0.2712F, -0.161F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1392F, 7.8499F, -0.1485F, -0.0432F, 0.0065F));

		PartDefinition tail3Osteoderms = tail3.addOrReplaceChild("tail3Osteoderms", CubeListBuilder.create(), PartPose.offset(0.8072F, -0.7288F, 0.9196F));

		PartDefinition tail3Osteoderms2 = tail3.addOrReplaceChild("tail3Osteoderms2", CubeListBuilder.create(), PartPose.offset(-0.8072F, -0.7288F, 0.9196F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(63, 57).addBox(-0.5F, 0.3019F, -0.3436F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 8.939F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition tail4Osteoderms = tail4.addOrReplaceChild("tail4Osteoderms", CubeListBuilder.create(), PartPose.offset(1.5F, 1.2019F, 4.4564F));

		PartDefinition tail4Osteoderms2 = tail4.addOrReplaceChild("tail4Osteoderms2", CubeListBuilder.create(), PartPose.offset(-1.5F, 1.2019F, 4.4564F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(25, 27).addBox(-0.5F, 0.2902F, -0.5883F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0019F, 7.8564F, -0.006F, -0.2577F, 0.0465F));

		PartDefinition tail5Osteoderms = tail5.addOrReplaceChild("tail5Osteoderms", CubeListBuilder.create(), PartPose.offset(0.1F, -0.4098F, 9.9117F));

		PartDefinition tail5Osteoderms2 = tail5.addOrReplaceChild("tail5Osteoderms2", CubeListBuilder.create(), PartPose.offset(-0.1F, -0.4098F, 9.9117F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1F, -1.0F, -0.0436F, -0.1309F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, 0.792F, 0.0135F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.0F, -7.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 86).addBox(-1.0F, 3.7F, 0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.7F, -13.9F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bodyOsteoderms = body.addOrReplaceChild("bodyOsteoderms", CubeListBuilder.create(), PartPose.offset(5.0681F, 6.5016F, -1.9836F));

		PartDefinition bodyOsteoderms2 = body.addOrReplaceChild("bodyOsteoderms2", CubeListBuilder.create(), PartPose.offset(-5.0681F, 6.5016F, -1.9836F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -12.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(63, 37).addBox(-0.5F, -0.2011F, 0.1837F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9F, -7.4F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9374F, 5.8803F, -5.9046F, 1.2246F, 0.045F, -0.258F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0397F, 6.5668F, -0.7516F, -1.0375F, 0.2524F, -0.0967F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4324F, 5.9545F, -0.6483F, 1.866F, 0.1926F, 0.4897F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9374F, 5.8803F, -5.9046F, 1.2683F, -0.045F, 0.258F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0397F, 6.5668F, -0.7516F, -1.2993F, -0.2524F, 0.0967F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4324F, 5.9545F, -0.6483F, 1.866F, -0.1926F, -0.4897F));

		PartDefinition chestOsteoderms = chest.addOrReplaceChild("chestOsteoderms", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -0.9F));

		PartDefinition chestOsteoderms2 = chest.addOrReplaceChild("chestOsteoderms2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, -0.9F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3F, -7.5F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 104).addBox(-0.5F, -0.0775F, -3.8859F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3496F, 0.7459F, -0.0873F, -0.0174F, 0.0015F));

		PartDefinition bipartiteOsteoderm3 = neck.addOrReplaceChild("bipartiteOsteoderm3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8881F, -0.7104F, -2.0107F, 0.0F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm6 = neck.addOrReplaceChild("bipartiteOsteoderm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8881F, -0.7104F, -2.0107F, 0.0F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3504F, -2.7541F, -0.4505F, -0.49F, -0.3187F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 105).addBox(-0.5F, -0.4123F, 0.2574F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4056F, -2.6947F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm2 = neck2.addOrReplaceChild("bipartiteOsteoderm2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.16F, 0.7681F, -2.2875F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm5 = neck2.addOrReplaceChild("bipartiteOsteoderm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.16F, 0.7681F, -2.2875F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6866F, -2.6915F, 0.6281F, -0.3587F, -0.443F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 99).addBox(-0.5F, 0.4155F, 0.0188F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0795F, -3.2718F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm = neck3.addOrReplaceChild("bipartiteOsteoderm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3144F, -1.1915F, -1.934F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm4 = neck3.addOrReplaceChild("bipartiteOsteoderm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3144F, -1.1915F, -1.934F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9795F, -3.1718F, 0.4079F, -0.2308F, -0.0092F));

		PartDefinition occipitalhorn = head.addOrReplaceChild("occipitalhorn", CubeListBuilder.create(), PartPose.offset(0.9F, -1.7809F, 0.353F));

		PartDefinition occipitalhorn2 = head.addOrReplaceChild("occipitalhorn2", CubeListBuilder.create(), PartPose.offset(-0.9F, -1.7809F, 0.353F));

		PartDefinition Jaw = head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8528F, -0.3321F, 0.2531F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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