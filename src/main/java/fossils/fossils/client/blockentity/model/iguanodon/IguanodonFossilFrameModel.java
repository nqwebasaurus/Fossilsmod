package fossils.fossils.client.blockentity.model.iguanodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IguanodonFossilFrameModel extends SkullModelBase {
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public IguanodonFossilFrameModel(ModelPart root) {
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -40.0F, 0.8F, 1.0F, 40.0F, 1.0F, new CubeDeformation(-0.12F))
				.texOffs(1, 1).addBox(-0.4F, -36.0F, -27.1F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-6.9F, -6.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(2.5F, -8.0F, 27.4F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -34.0F, -26.6F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -39.9F, 3.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 24).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 3.0F, 14.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, -6.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 2.8F, -1.3F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.3686F, -0.9016F, 0.7592F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.8354F, -2.6811F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.2F, -1.0F, 0.6021F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 2.8F, -1.3F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.3686F, -0.9016F, 0.7156F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.8354F, -2.6811F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.2F, -1.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -6.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -14.9F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -15.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 49).addBox(-0.5F, 0.0F, -11.6F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8F, 12.8F, -8.4F, 0.5164F, -0.0048F, -0.3447F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0611F, 12.3871F, 2.0344F, -0.6564F, 0.5468F, -0.0034F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7942F, 10.8866F, 0.9749F, 0.2646F, 0.265F, 0.467F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2492F, 0.1824F, 1.8494F, 1.1695F, -0.2013F, 0.0846F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8F, 12.8F, -8.4F, 0.0433F, -0.0167F, 0.2148F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0611F, 12.3871F, 2.0344F, -0.7722F, -0.4388F, 0.1865F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7942F, 10.8866F, 0.9749F, 0.4152F, -0.2868F, -0.3792F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2492F, 0.1824F, 1.8494F, 1.0208F, 0.7493F, -0.3956F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r5 = neck4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-1, 68).addBox(-0.5F, -0.7736F, 0.0238F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -8.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -7.8F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r6 = neck3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 73).addBox(-0.5F, -1.0F, 0.6F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.1F, -6.9F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -6.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 17).addBox(-0.5F, 0.6911F, 1.1071F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, -7.5F, -0.6196F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.6F, -7.5F, 0.2182F, -0.4363F, 0.0F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 100).addBox(-0.5F, 0.0066F, -3.1212F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -3.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 4.8F, 0.7F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 7.8F, -0.2322F, 0.2125F, -0.0498F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, -0.0529F, 0.085F, -0.0091F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 3).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 14.9F, 0.0266F, -0.1745F, -0.0046F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 14.9F, 0.1519F, -0.2157F, -0.0328F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(19, 42).addBox(-0.5F, 0.5F, -0.1F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, 13.9F, -0.0715F, -0.2176F, 0.0155F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, 0.5F, -0.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 14.0F, -0.0536F, -0.2179F, 0.0116F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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