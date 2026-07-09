package fossils.fossils.client.blockentity.model.peltephilus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PeltephilusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart leftArm7;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm7;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftSygomaticarch;
	private final ModelPart rightSygomaticarch;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail9;
	private final ModelPart tail3;
	private final ModelPart tail10;
	private final ModelPart tail4;

	public PeltephilusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm2 = this.leftLeg3.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm2 = this.rightLeg3.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.body4 = this.hips.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body = this.body3.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm5 = this.chest.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.leftArm7 = this.leftArm6.getChild("leftArm7");
		this.rightArm5 = this.chest.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm7 = this.rightArm6.getChild("rightArm7");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftSygomaticarch = this.head.getChild("leftSygomaticarch");
		this.rightSygomaticarch = this.head.getChild("rightSygomaticarch");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail9 = this.tail2.getChild("tail9");
		this.tail3 = this.tail9.getChild("tail3");
		this.tail10 = this.tail3.getChild("tail10");
		this.tail4 = this.tail10.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.55F, -19.6F, 6.1F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-4.9F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2F, -23.9F, -7.9F, 0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.65F, -7.8F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.2F, -23.9F, -7.9F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(5.0F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -19.5F, 6.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.7258F, 11.2747F, -0.4168F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.55F, 0.4943F, -0.2253F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0F, -6.4F, -0.5411F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1121F, 2.2943F, -2.344F, 0.0666F, -0.2184F, -0.041F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2286F, 8.7678F, -2.3023F, 1.5524F, 0.6001F, 0.3525F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5056F, 5.8111F, -3.8169F, -2.5096F, -0.3654F, 0.4207F));

		PartDefinition leftArm2 = leftLeg3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.8397F, -0.008F, 0.0104F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1121F, 2.2943F, -2.344F, 0.0442F, 0.3284F, 0.0923F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2286F, 8.7678F, -2.3023F, 1.5389F, -0.5772F, -0.2453F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5056F, 5.8111F, -3.8169F, -2.4191F, 0.3071F, -0.4044F));

		PartDefinition rightArm2 = rightLeg3.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.7961F, 0.008F, -0.0104F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.777F, 6.1211F, -2.5342F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.777F, 6.1211F, -2.5342F));

		PartDefinition body4 = hips.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5544F, -6.3999F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 33).addBox(-0.55F, 0.63F, -0.1269F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.4115F, -5.6215F, -0.3142F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9233F, -2.1172F, -5.5588F, -0.1206F, 0.0887F, 0.011F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, 0.7939F, -0.1558F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9233F, -1.2943F, -6.8627F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body = body3.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9233F, -0.8873F, -6.9564F, -0.2613F, 0.0467F, 0.0056F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 12).addBox(-0.5F, 0.6599F, -4.0382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6389F, 0.9878F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8127F, -2.8434F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(85, 19).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 17).addBox(-0.5F, -0.2F, -4.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2679F, 1.2698F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm5 = chest.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9487F, 3.3952F, 0.1863F, -1.0126F, 0.3692F, -0.3465F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.007F, -0.6075F, 8.5177F, -0.3997F, 0.1861F, 0.3909F));

		PartDefinition leftArm7 = leftArm6.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2965F, 5.4193F, -0.08F, 0.8691F, 0.4012F, 0.9684F));

		PartDefinition rightArm5 = chest.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9487F, 3.3952F, 0.1863F, -0.969F, -0.3692F, 0.3465F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.007F, -0.6075F, 8.5177F, -0.3199F, -0.2215F, -0.3587F));

		PartDefinition rightArm7 = rightArm6.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2965F, 5.4193F, -0.08F, 0.8103F, -0.5313F, -0.838F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9136F, -2.278F, -0.2801F, -0.0478F, 0.0864F));

		PartDefinition cube_r9 = chest2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 83).addBox(-0.5F, -0.2F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.5F, 5.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9676F, -2.902F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(84, 90).addBox(-0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4214F, -4.4019F, 0.4014F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0142F, -2.0956F, -0.1565F, 0.0136F, 0.0862F));

		PartDefinition leftSygomaticarch = head.addOrReplaceChild("leftSygomaticarch", CubeListBuilder.create(), PartPose.offset(3.4479F, 7.5262F, 1.6254F));

		PartDefinition rightSygomaticarch = head.addOrReplaceChild("rightSygomaticarch", CubeListBuilder.create(), PartPose.offset(-3.4479F, 7.5262F, 1.6254F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 3.2807F, 0.682F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7552F, -1.3417F, 3.5115F, 0.3489F, -0.1085F, 0.0335F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7552F, -1.3417F, 3.5115F, 0.3489F, 0.1085F, -0.0335F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2666F, 2.5887F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 13).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 10).addBox(-0.5F, -1.3F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0933F, 3.1971F, 0.0F, 0.0131F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(54, 69).addBox(-0.5F, 0.5945F, -0.1045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 72).addBox(-0.5F, 0.5945F, 3.3955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.8067F, 3.8971F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 59).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8726F, 3.8708F, 0.2967F, 0.0F, 0.0F));

		PartDefinition tail9 = tail2.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(65, 69).addBox(-0.5F, -0.2983F, -0.5261F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F))
				.texOffs(68, 72).addBox(-0.5F, -0.2983F, 3.1739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0078F, 4.9003F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail3 = tail9.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 71).addBox(-0.5F, -0.3088F, -0.1531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.153F))
				.texOffs(15, 74).addBox(-0.5F, -0.3088F, 3.5469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0017F, 3.8739F, 0.192F, 0.0F, 0.0F));

		PartDefinition tail10 = tail3.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(62, 83).addBox(-0.5F, -0.2641F, 0.0583F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0573F, 4.0767F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail10.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(57, 24).addBox(-0.5F, 0.3F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5609F, 2.7313F, 0.0698F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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