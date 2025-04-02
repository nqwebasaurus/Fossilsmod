package fossils.fossils.client.blockentity.model.eremotherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EremotheriumFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public EremotheriumFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm3.getChild("leftArm5");
		this.leftArm6 = this.leftArm3.getChild("leftArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm3.getChild("rightArm5");
		this.rightArm6 = this.rightArm3.getChild("rightArm6");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -30.0F, 11.7F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-11.4F, -9.5F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -35.5F, 12.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(10.55F, -5.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -46.55F, -20.8F, 0.0524F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.7F, -14.45F, -0.5F, 1.0F, 61.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -46.55F, -20.8F, 0.0F, -0.0524F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -29.0F, 15.0F, -0.4778F, -0.008F, 0.0302F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.7943F, 0.0747F, 1.0F, 2.0F, 19.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0F, 6.5F, -1.4F, -0.6429F, -0.1726F, -0.1341F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 13.1F, 3.0F, -0.4162F, 0.0425F, 0.1238F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -3.2F, 12.4F, -1.7396F, -1.0849F, 0.1496F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, 6.5F, -1.4F, -0.3374F, 0.1726F, 0.1341F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 13.1F, 3.0F, -0.329F, -0.0425F, -0.1238F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -3.2F, 12.4F, -2.8433F, 1.1735F, -1.3269F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.25F, -6.6F, -0.218F, -0.0094F, -0.0426F));

		PartDefinition cube_r5 = body4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 16).addBox(-0.5F, 0.93F, 0.0731F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.7243F, -5.3348F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.43F, -5.2721F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 26).addBox(-0.5F, 1.0939F, -0.0558F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.6443F, -6.8627F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5F, 0.0F, -8.4F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -9.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 13).addBox(-0.5F, 1.0599F, -8.5382F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8F, -6.1F, 0.0038F, -0.0435F, -0.0002F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 37).addBox(-0.5F, 0.2F, -12.8F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8906F, 7.8609F, -9.1092F, -0.8875F, 0.5391F, -0.5596F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, 14.4F, 0.7316F, -0.0278F, -0.4777F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 16.9035F, -0.8472F, 0.0F, 0.0F, 0.1745F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.2164F, 0.0283F, 0.1278F));

		PartDefinition leftArm5 = leftArm3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 1.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition leftArm6 = leftArm3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 3.7F, 0.2314F, -0.084F, 0.6939F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8906F, 7.8609F, -9.1092F, -0.9059F, -0.4241F, 0.4113F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, 14.4F, 0.3639F, 0.1237F, 0.2333F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 16.9035F, -0.8472F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.211F, -0.056F, -0.2559F));

		PartDefinition rightArm5 = rightArm3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 1.9F, 0.0F, 0.0F, -0.48F));

		PartDefinition rightArm6 = rightArm3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, 3.7F, 0.2314F, 0.084F, -0.6939F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9F, -13.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(82, 11).addBox(-0.5F, 0.8F, 0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.6F, 0.4014F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.9F, 0.2831F, -0.165F, -0.1164F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 67).addBox(-0.5F, 0.0F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -3.1F, 0.0435F, 0.0038F, -0.0872F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(97, 82).addBox(-0.5F, 0.7742F, 0.0409F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -3.8F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -2.3F, -0.3042F, 0.0741F, -0.1684F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(2.9479F, 7.3281F, 0.4418F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-2.9479F, 7.3281F, 0.4418F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, -2.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.0933F, 0.3971F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.2F, 9.3F, -0.5536F, 0.1115F, -0.0687F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 6.9F, 0.2526F, 0.2538F, 0.0647F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.3155F, 0.2494F, 0.0804F));

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