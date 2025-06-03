package fossils.fossils.client.blockentity.model.rangifer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RangiferFossilFrameModel extends SkullModelBase {
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
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftHorn;
	private final ModelPart rightHorn;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public RangiferFossilFrameModel(ModelPart root) {
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
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftHorn = this.head.getChild("leftHorn");
		this.rightHorn = this.head.getChild("rightHorn");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -4.9F, 7.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 23.0F, 4.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -3.75F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.7F, -6.05F, -17.9F, 0.0F, -0.3142F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.8142F, -2.3721F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.7F, -6.05F, -17.9F, 0.3088F, 0.059F, -1.7536F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-1.5F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -3.8F, 8.2F, 0.0F, 0.0F, -1.9897F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.5553F, 8.3073F, -0.1571F, 0.0F, -0.2618F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, 0.5F, 0.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 2.7008F, 1.3755F, -1.817F, -0.3189F, -0.2756F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 2.2895F, 0.1653F, 0.143F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2856F, -1.2868F, -1.5794F, 0.0011F, 0.1309F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 8.7492F, -0.7306F, 1.4994F, -0.2073F, -0.0684F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.4F, 0.2142F, -5.3932F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 2.7008F, 1.3755F, -1.5026F, -0.1211F, -0.8046F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0874F, -0.0674F, 1.8435F, 0.1261F, 0.0352F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.2856F, -1.2868F, -1.3612F, 0.0015F, -0.0055F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 8.7492F, -0.7306F, 2.2686F, 0.0978F, -0.0795F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(-0.4F, 0.2142F, -5.3932F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.2386F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.8F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -6.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2814F, -7.8926F, -0.2024F, -0.1283F, 0.0262F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, 0.4F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2135F, 0.1404F, 0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9529F, -5.7577F, -0.0449F, -0.156F, -0.0693F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, -1).addBox(-0.5F, 0.4F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0551F, 0.0564F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.6145F, -7.2515F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.9F, 0.4102F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1F, 9.6885F, -6.2172F, 0.8208F, 0.2729F, -0.2264F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 5.1867F, 2.6698F, -1.8619F, -0.2253F, 0.0314F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9886F, 0.7915F, 1.8839F, 0.6739F, 0.3438F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4098F, 0.485F, 1.0523F, 0.2167F, 0.3644F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 9.6885F, -6.2172F, 1.1802F, 0.0196F, -0.3164F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 5.1867F, 2.6698F, -1.8586F, -0.4113F, -0.3602F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.9886F, 0.7915F, 1.9647F, 0.586F, -0.1994F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.4098F, 0.485F, 0.1988F, -0.2454F, -0.0153F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -8.9F, 0.2608F, -0.0226F, 0.0843F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 31).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.3F, 0.2789F, -0.3705F, 0.0321F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 48).addBox(-0.6745F, -0.4733F, -3.7469F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1745F, 0.9748F, -0.2505F, -0.9687F, -0.0099F, 0.0144F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1565F, -1.5193F, -0.4073F, -0.3549F, 0.2899F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 68).addBox(-0.5F, -0.3753F, -1.1709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.4F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(14, 81).addBox(-0.5F, -2.8F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2365F, -1.5677F, 1.0964F, -0.369F, 0.0471F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9339F, -0.2194F, -0.9619F, -0.2085F, -0.0647F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0665F, -1.7566F, -1.3789F, 0.0511F, 0.0068F, -0.8018F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0665F, -1.7566F, -1.3789F, 0.0511F, -0.0068F, 0.8018F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.6359F, 3.5361F, -8.5987F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.6359F, 3.5361F, -8.5987F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4917F, -1.5909F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2262F, 2.7023F, -0.721F, -0.2364F, -0.3195F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5644F, -0.2228F, -2.5937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0644F, 0.7731F, 2.5083F, 0.0F, 0.1396F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(70, 26).addBox(-0.5F, 0.5598F, -0.0232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0497F, 2.8147F, -0.5411F, 0.0F, 0.0F));

		PartDefinition tail3 = tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(48, 36).addBox(-0.5F, 0.5598F, -0.0232F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9804F, 4.529F, -0.8949F, 0.2838F, -0.336F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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