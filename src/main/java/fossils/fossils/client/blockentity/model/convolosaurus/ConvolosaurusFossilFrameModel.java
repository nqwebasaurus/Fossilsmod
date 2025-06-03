package fossils.fossils.client.blockentity.model.convolosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ConvolosaurusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart Head;
	private final ModelPart HeadslopeL;
	private final ModelPart HeadslopeL2;
	private final ModelPart BrowL;
	private final ModelPart Jaw;
	private final ModelPart JawslopeL;
	private final ModelPart JawslopeL2;
	private final ModelPart MasseterR;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public ConvolosaurusFossilFrameModel(ModelPart root) {
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
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.Head = this.neck.getChild("Head");
		this.HeadslopeL = this.Head.getChild("HeadslopeL");
		this.HeadslopeL2 = this.Head.getChild("HeadslopeL2");
		this.BrowL = this.Head.getChild("BrowL");
		this.Jaw = this.Head.getChild("Jaw");
		this.JawslopeL = this.Jaw.getChild("JawslopeL");
		this.JawslopeL2 = this.Jaw.getChild("JawslopeL2");
		this.MasseterR = this.Jaw.getChild("MasseterR");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -14.0F, -5.4F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(1, 1).addBox(-0.8F, -18.0F, -14.7F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.2F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -14.5F, -14.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.2F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -14.5F, -4.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.3F, -4.4F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 28).addBox(-1.0F, 0.5F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.3F, -1.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, 0.5F, -0.6F, -0.4391F, 0.0748F, 0.1578F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9046F, 0.4854F, 1.5097F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8229F, 0.2046F, -0.393F, -0.0403F, 0.0167F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 1.5F, -1.9F, 0.5883F, -0.0968F, -0.0746F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, 0.5F, -0.6F, -0.0959F, -0.0096F, -0.1352F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9046F, 0.4854F, 1.117F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8229F, 0.2046F, 0.3079F, 0.1248F, 0.0396F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.5F, -1.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -1.4F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 38).addBox(-1.0F, 0.5F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.5F, -3.6F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, 0.0F, -3.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -5.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 29).addBox(-0.5485F, -0.3339F, -0.4431F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 1.2112F, -3.2776F, 0.2456F, 0.1016F, 0.0254F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 3.4011F, -2.2655F, 0.5061F, 0.2182F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.7F, 2.5F, 0.5512F, 0.3412F, 0.1906F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(0.6F, 2.5F, -2.3F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 3.4011F, -2.2655F, 0.3391F, -0.2724F, 0.1028F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.7F, 2.5F, 0.9244F, -0.3059F, -0.3663F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(-0.6F, 2.5F, -2.3F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -2.8F, -0.4125F, 0.2998F, 0.3466F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 12).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.8344F, -0.9715F, 0.0353F, -0.0161F, 0.0068F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -3.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 24).addBox(-0.5F, -0.6F, -2.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2154F, -0.3808F, -0.4898F, 0.0598F, -0.036F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -1.6F, -0.1253F, 0.2665F, 0.3626F));

		PartDefinition Head = neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.4172F, -1.0103F, 0.5018F, 0.142F, 0.1737F));

		PartDefinition HeadslopeL = Head.addOrReplaceChild("HeadslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, 0.5415F, 1.1145F));

		PartDefinition HeadslopeL2 = Head.addOrReplaceChild("HeadslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5415F, 1.1145F));

		PartDefinition BrowL = Head.addOrReplaceChild("BrowL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0147F, 0.5239F, -2.5201F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3415F, -0.1855F, -0.2793F, 0.0F, 0.0F));

		PartDefinition JawslopeL = Jaw.addOrReplaceChild("JawslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, -0.4284F, 1.5189F));

		PartDefinition JawslopeL2 = Jaw.addOrReplaceChild("JawslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4284F, 1.5189F));

		PartDefinition MasseterR = Jaw.addOrReplaceChild("MasseterR", CubeListBuilder.create(), PartPose.offset(-0.3F, -2.2284F, 2.2189F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 2.3F, -0.3835F, -0.2028F, 0.0811F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-1, 27).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 0.6F, -0.6F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(13, 21).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0964F, -0.1307F, -0.0069F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(-1, 6).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, 0.2978F, 0.0834F, 0.0256F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.134F, 0.2163F, 0.0289F));

		return LayerDefinition.create(meshdefinition, 55, 55);
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