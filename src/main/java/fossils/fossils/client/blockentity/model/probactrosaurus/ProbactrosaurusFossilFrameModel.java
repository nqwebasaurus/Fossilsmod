package fossils.fossils.client.blockentity.model.probactrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProbactrosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public ProbactrosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -27.0F, -4.0F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-0.5F, -28.0F, -23.3F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -5.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(0.5F, -4.5F, 18.8F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -24.0F, -22.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.6F, 1.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, 0.6926F, -1.3693F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 0.1F, -3.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, 0.1F, 0.9861F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.5354F, -1.6811F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 0.1F, -3.9F, 0.0785F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, 0.1F, 0.9431F, 0.0042F, -0.0059F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.5354F, -1.6811F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2F, -0.4F, 0.1658F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 39).addBox(-0.5F, -0.3766F, -0.5972F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.3F, -0.0709F, 0.1741F, -0.0123F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.3F, 0.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6766F, 4.7028F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8766F, 13.6028F, 0.1787F, 0.2148F, 0.0385F));

		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.4F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.1999F, -0.014F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 16).addBox(-0.5F, 0.4712F, -0.0996F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6999F, 9.886F, -0.0804F, 0.2175F, -0.0174F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(33, 9).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 7.8004F, -0.186F, -0.1716F, 0.0321F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(17, 32).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.9F, -0.2303F, -0.17F, 0.0396F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -5.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 15).addBox(-0.5F, 0.7514F, -0.1015F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8738F, -10.8006F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 40).addBox(-0.5F, 0.8499F, -0.194F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.8262F, -5.0006F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9738F, -10.4006F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.6459F, -0.1103F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.6F, 0.4276F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 6.9883F, -6.5343F, 0.8995F, -0.0076F, -0.1744F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1326F, 6.2005F, 0.9431F, -1.1102F, 0.4228F, -0.0958F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 7.9F, -1.6F, 0.1265F, 0.3067F, 0.2896F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 6.9883F, -6.5343F, -0.4531F, 0.0076F, 0.1744F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1326F, 6.2005F, 0.9431F, -1.2F, -0.1543F, -0.14F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 7.9F, -1.6F, 0.1395F, 0.1684F, -0.2295F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 0.4038F, 0.3639F, -0.6092F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.5F, 1.675F, -5.4299F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 24).addBox(-1.0F, -0.2375F, -0.4515F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.682F, -4.0258F, 0.4712F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.025F, -3.8701F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 51).addBox(-0.5F, -0.1052F, 0.3453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3436F, -3.51F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(72, 23).addBox(-0.5F, -0.1368F, -0.2394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.0436F, -2.01F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5436F, -3.21F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, 1.7F, -1.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -3.2195F, -3.0783F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5195F, -5.0783F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 62).addBox(-0.5F, 0.416F, 0.7966F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.111F, -3.5428F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.011F, -1.8428F, 0.8154F, 0.0109F, 0.1848F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7192F, -1.5788F, 0.2183F, -0.0016F, 0.0113F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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