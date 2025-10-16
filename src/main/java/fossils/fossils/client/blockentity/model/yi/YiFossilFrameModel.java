package fossils.fossils.client.blockentity.model.yi;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YiFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftPelvis;
	private final ModelPart rightPelvis;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart leftScapula;
	private final ModelPart rightScapula;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
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

	public YiFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftPelvis = this.hips.getChild("leftPelvis");
		this.rightPelvis = this.hips.getChild("rightPelvis");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.leftScapula = this.chest.getChild("leftScapula");
		this.rightScapula = this.chest.getChild("rightScapula");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.neck2.getChild("bone2");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -29.0F, -0.8F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -34.5F, -15.6F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(12.1F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(9.2F, -2.5F, 14.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -19.0F, -15.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(19, 16).addBox(-0.5F, 0.5019F, -3.4716F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -29.825F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftPelvis = hips.addOrReplaceChild("leftPelvis", CubeListBuilder.create(), PartPose.offset(1.25F, 1.7079F, 0.4497F));

		PartDefinition rightPelvis = hips.addOrReplaceChild("rightPelvis", CubeListBuilder.create(), PartPose.offset(-1.25F, 1.7079F, 0.4497F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1847F, -3.0727F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 29).addBox(-0.5F, -0.2495F, 1.8912F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2852F, -4.9123F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7316F, -2.9918F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 45).addBox(-0.5F, -0.1F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 42).addBox(-0.5F, -0.1F, 0.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.042F, -4.9605F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.455F, -3.9354F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 30).addBox(-0.5F, -0.3F, 2.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9334F, -7.7719F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftScapula = chest.addOrReplaceChild("leftScapula", CubeListBuilder.create(), PartPose.offset(2.0251F, 2.6259F, -3.6583F));

		PartDefinition rightScapula = chest.addOrReplaceChild("rightScapula", CubeListBuilder.create(), PartPose.offset(-2.0251F, 2.6259F, -3.6583F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7848F, -4.819F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 21).addBox(-0.5F, -0.2727F, 2.4598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 20).addBox(-0.5F, -0.2727F, -0.2402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1473F, -2.8287F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3955F, -2.6983F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 42).addBox(-0.5F, 0.7F, 3.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0543F, -6.6105F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7704F, -3.7121F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 30).addBox(-0.5F, -0.7417F, 1.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 29).addBox(-0.5F, -0.7417F, -0.2174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4336F, -1.869F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(49, 4).addBox(-0.5F, 0.4525F, -2.9462F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8126F, -1.8065F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6418F, -2.6176F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, 31.9937F, 25.5533F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, 31.9937F, 25.5533F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.439F, -0.0835F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 3.8919F, -4.6002F, -1.168F, -0.2449F, -1.6518F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.4F, 14.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 15.0F, 0.0F, 0.5996F, -0.1245F, 0.1796F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.8919F, -4.6002F, -1.1209F, 0.144F, 1.6317F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.4F, 14.9F, 0.219F, 0.1019F, -0.0214F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 15.0F, 0.0F, 0.5996F, 0.1245F, -0.1796F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 52).addBox(-0.5F, 0.1556F, -0.3863F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 54).addBox(-0.5F, 0.1556F, 2.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3489F, 2.7038F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(48, 52).addBox(-0.5F, 0.322F, -0.5201F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 54).addBox(-0.5F, 0.322F, 2.1799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2027F, 2.9989F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 15).addBox(-0.5F, 0.4333F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 19).addBox(-0.5F, 0.4333F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1513F, 2.7914F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(9, 57).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 59).addBox(-0.5F, 0.2F, 2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2274F, 5.0732F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0116F, 2.9354F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.95F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 1.0909F, 0.156F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0385F, 10.0093F, 4.298F, 1.309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0385F, 13.8162F, 1.6812F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0081F, 9.0526F, 0.4857F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0052F, -2.6304F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 1.0909F, 0.156F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0385F, 10.0093F, 4.298F, 1.6144F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0385F, 13.8162F, 1.6812F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0081F, 9.0526F, 0.4857F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0052F, -2.6304F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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