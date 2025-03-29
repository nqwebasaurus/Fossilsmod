package fossils.fossils.client.blockentity.model.apatosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ApatosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hip;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat;

	public ApatosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hip = this.root.getChild("hip");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hip.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail1 = this.hip.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -55.0F, 22.7F, 2.0F, 55.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-21.2F, -14.5F, -1.0F, 2.0F, 29.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.5F, 23.7F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-5.25F, -16.5F, -1.0F, 2.0F, 33.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -34.75F, -20.6F, -0.2182F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -26.25F, -1.0F, 2.0F, 61.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -34.75F, -20.6F, 0.0F, -0.2182F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -51.0F, 10.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition hip = root.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 4.0F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -0.0702F, -0.4404F, 4.0F, 4.0F, 28.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -15.484F, 5.1554F, -1.8762F, 0.0F, 0.0F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(16.0F, -3.25F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 1.7348F, -27.6514F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -15.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offset(0.0F, -6.3142F, -8.231F));

		PartDefinition rightLeg = hip.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, -3.25F, -6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 1.7348F, -27.6514F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -15.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offset(0.0F, -6.3142F, -8.231F));

		PartDefinition tail1 = hip.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.8F, -4.1F, -0.4737F, -0.0803F, -0.1551F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(113, 150).addBox(-1.5F, 5.9F, -3.6F, 3.0F, 20.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -6.929F, -1.156F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(59, 126).addBox(-1.5F, -0.7482F, -3.1932F, 3.0F, 28.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 18.171F, 5.044F, 0.1705F, 0.0376F, -0.215F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 27.9518F, 0.2068F, 0.1719F, 0.0302F, -0.1719F));

		PartDefinition cube_r6 = tail3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(91, 132).addBox(-1.5F, -1.6F, -2.5F, 3.0F, 28.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0679F, 0.096F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 26.3321F, -0.604F, 0.0807F, 0.0334F, -0.3914F));

		PartDefinition cube_r7 = tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(104, 149).addBox(-1.0F, 0.0F, -1.7F, 2.0F, 29.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.6241F, -0.7911F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 27.1759F, 2.8089F, 0.0859F, 0.0151F, -0.1739F));

		PartDefinition cube_r8 = tail5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1864F, -0.2971F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(75, 190).addBox(-0.5F, -1.0F, -1.4F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 16.3136F, 0.7029F, 0.0F, 0.0F, -0.3491F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(189, 183).addBox(-0.5F, -0.1784F, -1.4443F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 12.8F, 0.05F, -0.0832F, -0.0262F, -0.3043F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.3216F, -0.4443F, -0.1278F, -0.0283F, -0.2164F));

		PartDefinition cube_r9 = tail8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(164, 185).addBox(0.1F, -0.5F, -1.7F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.5077F, 0.6175F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.1923F, 1.3175F, -0.1278F, 0.0283F, 0.2164F));

		PartDefinition cube_r10 = tail9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(41, 186).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2146F, 0.2974F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.9854F, 0.6974F, -0.0807F, 0.0334F, 0.3914F));

		PartDefinition cube_r11 = tail10.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(107, 190).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, -0.6026F, -0.8608F, 0.0F, 0.0F, -0.0175F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(169, 185).addBox(-0.5F, -0.3166F, -1.3485F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 10.1974F, -0.1608F, -0.3655F, 0.147F, 0.3655F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.6834F, 0.1515F, -0.3271F, 0.2213F, 0.5742F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.5F, 5.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(37, 27).addBox(-2.0F, -0.8186F, 0.2757F, 4.0F, 4.0F, 23.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -23.2718F, 3.015F, -1.7191F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -22.8F, 3.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(76, 62).addBox(-2.0F, -0.5638F, -2.0095F, 4.0F, 4.0F, 18.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -15.333F, 0.9079F, -1.6144F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(15.0F, -8.95F, -24.5F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -4.3855F, -17.0197F, -0.829F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.5111F, -13.9829F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.0F, -8.95F, -24.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -4.3855F, -17.0197F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.5111F, -13.9829F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.7F, 0.95F, -0.3747F, 0.0747F, 0.2995F));

		PartDefinition cube_r14 = neck1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 27).addBox(-2.0F, -11.9529F, -3.4544F, 4.0F, 18.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.2961F, -0.0567F, 0.0F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.3067F, -0.5158F, -0.1711F, -0.0914F, 0.2372F));

		PartDefinition cube_r15 = neck2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 128).addBox(-2.0F, -0.7F, -4.4F, 4.0F, 26.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -23.5632F, 4.1558F, -0.1134F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.2377F, 3.1173F, -0.1765F, -0.2633F, 0.2678F));

		PartDefinition cube_r16 = neck3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 162).addBox(-1.5F, -0.1522F, -2.5013F, 3.0F, 20.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -16.0374F, 2.8717F, -0.1309F, 0.0F, -0.0175F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.2374F, 3.4217F, 0.1344F, -0.1793F, 0.373F));

		PartDefinition cube_r17 = neck4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(53, 175).addBox(-1.0F, -1.0207F, -0.4071F, 2.0F, 19.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -18.3588F, -0.6306F, -0.0645F, -0.0077F, 0.0375F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.3343F, 1.326F, 0.1701F, -0.3248F, 0.3434F));

		PartDefinition cube_r18 = neck5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 43).addBox(-1.0F, -0.4608F, -3.5326F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -7.5945F, 2.0058F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(85, 63).addBox(-1.0F, -5.7922F, -2.1568F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -7.3445F, 0.6558F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.8692F, -0.7612F, -0.0269F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.35F, -1.05F, 0.5672F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -8.0461F, -4.2632F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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