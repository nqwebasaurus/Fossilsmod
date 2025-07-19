package fossils.fossils.client.blockentity.model.giraffatitan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GiraffatitanFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips2;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart neck11;
	private final ModelPart neck12;
	private final ModelPart neck13;
	private final ModelPart neck14;
	private final ModelPart neck15;
	private final ModelPart neck16;
	private final ModelPart head2;
	private final ModelPart bone;
	private final ModelPart bone9;
	private final ModelPart jaw2;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftHand;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightHand;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;

	public GiraffatitanFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips2 = this.root.getChild("hips2");
		this.tail8 = this.hips2.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.body2 = this.hips2.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.neck9 = this.body3.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.neck11 = this.neck10.getChild("neck11");
		this.neck12 = this.neck11.getChild("neck12");
		this.neck13 = this.neck12.getChild("neck13");
		this.neck14 = this.neck13.getChild("neck14");
		this.neck15 = this.neck14.getChild("neck15");
		this.neck16 = this.neck15.getChild("neck16");
		this.head2 = this.neck16.getChild("head2");
		this.bone = this.head2.getChild("bone");
		this.bone9 = this.bone.getChild("bone9");
		this.jaw2 = this.head2.getChild("jaw2");
		this.leftArm4 = this.body3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftHand = this.leftArm5.getChild("leftHand");
		this.rightArm4 = this.body3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightHand = this.rightArm5.getChild("rightHand");
		this.leftLeg5 = this.hips2.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.leftFoot = this.leftLeg6.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.rightLeg5 = this.hips2.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.rightFoot = this.rightLeg6.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -58.0F, 30.8F, 1.0F, 58.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.9F, -36.5F, -0.5F, 1.0F, 117.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -80.5F, -20.9F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.2F, -21.0F, -0.5F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.5F, -80.5F, -20.9F, 0.0349F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(30.5F, -12.0F, -0.5F, 1.0F, 25.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -85.0F, 31.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 1.45F, -25.0F));

		PartDefinition hips2 = root.addOrReplaceChild("hips2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -62.5F, 57.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 68).addBox(-1.5F, -1.1232F, -6.2257F, 4.0F, 5.0F, 20.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.0111F, -3.4302F, -0.4712F, 0.0F, 0.0F));

		PartDefinition tail8 = hips2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.25F, 8.2F, -0.1264F, 0.2598F, -0.0326F));

		PartDefinition cube_r5 = tail8.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 135).addBox(-0.5F, 0.5409F, -1.4913F, 3.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.7F, 1.3F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(159, 33).addBox(-1.5F, -0.4555F, -0.0038F, 3.0F, 4.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.95F, 13.375F, -0.3155F, -0.2494F, 0.0804F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1555F, 10.7962F, -0.1506F, -0.1726F, 0.0261F));

		PartDefinition cube_r6 = tail10.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, 0.9F, 0.175F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1614F, -0.3608F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5614F, 19.6142F, 0.407F, 0.1605F, 0.0688F));

		PartDefinition cube_r7 = tail11.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(102, 112).addBox(0.0F, 1.1F, -0.925F, 1.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1357F, 0.602F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2643F, 19.577F, 0.0177F, 0.1745F, 0.0031F));

		PartDefinition cube_r8 = tail12.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(102, 89).addBox(0.0F, 0.9F, -0.325F, 1.0F, 1.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8186F, 0.1841F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(51, 89).addBox(-0.5F, 0.2063F, -0.4528F, 1.0F, 1.0F, 24.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0186F, 20.6591F, -0.085F, 0.3914F, -0.0325F));

		PartDefinition body2 = hips2.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5F, -7.5F, 0.0089F, 0.0432F, 0.0061F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(121, 33).addBox(-2.5F, 0.6212F, 0.1209F, 4.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.2897F, -11.5791F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 0).addBox(-1.5F, 0.9488F, -0.3866F, 4.0F, 5.0F, 27.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -26.2897F, -30.9791F, -0.7069F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.5F, -32.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 62).addBox(-1.5F, 0.7569F, -0.4948F, 4.0F, 5.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.7F, -14.65F, -0.6894F, 0.0F, 0.0F));

		PartDefinition neck9 = body3.addOrReplaceChild("neck9", CubeListBuilder.create().texOffs(66, 33).addBox(-1.5F, -1.5165F, -22.3423F, 3.0F, 5.0F, 23.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -12.4595F, -16.0816F, -0.8818F, -0.0198F, 0.0389F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4165F, -22.3423F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck10.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 0).addBox(0.75F, 1.2F, -0.35F, 2.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -0.5199F, -28.1713F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck11 = neck10.addOrReplaceChild("neck11", CubeListBuilder.create().texOffs(131, 0).addBox(-1.0F, -0.7651F, -14.7846F, 2.0F, 4.0F, 15.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.4801F, -28.2213F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck12 = neck11.addOrReplaceChild("neck12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1349F, -14.7846F, 0.0872F, 0.0438F, 0.0038F));

		PartDefinition cube_r13 = neck12.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 34).addBox(0.25F, 1.0F, -0.15F, 2.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -2.4846F, -28.7085F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck13 = neck12.addOrReplaceChild("neck13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8846F, -28.7585F, 0.3056F, 0.0433F, 0.0057F));

		PartDefinition cube_r14 = neck13.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 135).addBox(0.25F, 0.7F, -0.05F, 2.0F, 3.0F, 15.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.25F, -2.2886F, -14.5954F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck14 = neck13.addOrReplaceChild("neck14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5886F, -14.5954F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck14.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(153, 122).addBox(0.25F, 0.9F, -0.05F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, -2.946F, -12.6159F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck15 = neck14.addOrReplaceChild("neck15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.696F, -12.7159F, 0.4362F, -0.0309F, -0.0534F));

		PartDefinition cube_r16 = neck15.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(168, 0).addBox(-1.0F, 0.9495F, -0.0719F, 2.0F, 3.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -3.9567F, -10.7093F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck15.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(203, 141).addBox(-1.0F, 0.85F, -0.05F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5567F, -18.7093F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck16 = neck15.addOrReplaceChild("neck16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8907F, -18.6933F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck16.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(126, 221).addBox(0.0F, 0.9F, -1.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -2.3415F, -4.444F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head2 = neck16.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -2.4062F, -5.11F, 0.2472F, 0.0118F, 0.0477F));

		PartDefinition bone = head2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -81.5255F, 213.9679F));

		PartDefinition bone9 = bone.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.5127F, -0.1909F, -0.8116F, 0.0F, 0.0F));

		PartDefinition leftArm4 = body3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(18.5F, 19.3509F, -14.2686F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 32.7613F, 0.3716F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm5.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 21.2963F, -3.8258F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm4 = body3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-17.5F, 19.3509F, -14.2686F, 0.2094F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 32.7613F, 0.3716F, -1.1345F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm5.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 21.2963F, -3.8258F, 0.6545F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = hips2.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(11.0F, 6.5691F, -0.0261F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 30.5593F, -0.1397F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg6.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 20.9319F, 0.7163F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		PartDefinition rightLeg5 = hips2.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, 6.5691F, -0.0261F, -0.0564F, 0.0258F, 0.0173F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 30.5593F, -0.1397F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg6.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 20.9319F, 0.7163F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
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