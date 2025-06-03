package fossils.fossils.client.blockentity.model.altirhinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AltirhinusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public AltirhinusFossilFrameModel(ModelPart root) {
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
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -29.0F, -4.7F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.5F, -6.7F, -0.5F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -19.3F, -25.6F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -4.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -19.3F, -25.6F, 0.1047F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(8.5F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -19.0F, -4.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -28.3F, -3.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.5926F, -0.2693F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1F, -4.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, -0.5F, -0.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.7F, 0.1F, 1.0734F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.1354F, -1.4811F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2F, -0.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2681F, -3.0504F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, -0.5F, -0.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.7F, 0.1F, 0.9425F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.1354F, -1.4811F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2F, -0.4F, 0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 48).addBox(-0.5F, -0.2234F, 0.2096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -1.1F, 4.5F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 4).addBox(-0.5F, 0.3F, -0.1F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5234F, 5.0096F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7234F, 14.9096F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.3994F, -0.0349F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(-1, 26).addBox(-0.5F, 0.6712F, -0.5996F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9994F, 11.8651F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, 0.6F, 0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.0288F, 7.9004F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, 7.9F, -0.2288F, 0.1275F, -0.0296F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -4.8F, -0.1747F, -0.043F, 0.0076F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 11).addBox(-0.5F, 0.7514F, 0.0985F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8199F, -11.612F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(41, 2).addBox(-0.5F, 0.3836F, -8.9828F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -1.1801F, 3.088F, 0.1309F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2199F, -11.712F, 0.3406F, -0.0411F, -0.0146F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 29).addBox(-0.5F, 0.621F, 0.2311F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 2.4F, -6.5F, 0.3752F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 9.7F, -7.5F, -0.3927F, 0.0F, -0.1745F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 7.5F, 1.3F, -0.2289F, 0.5701F, 0.0983F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1523F, 7.8157F, -0.6682F, 0.2431F, 0.3063F, 0.2431F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 9.7F, -7.5F, 0.3054F, 0.0F, 0.1745F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 7.5F, 1.3F, -0.7344F, -0.4728F, 0.1272F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1523F, 7.8157F, -0.6682F, 0.303F, -0.2472F, -0.4615F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0294F, 0.3F, 1.749F, 1.1781F, 0.0F, 0.0F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.557F, -5.9557F, -0.1839F, 0.0858F, -0.0159F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 55).addBox(-1.0F, 0.5404F, -0.4446F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.4F, 0.5411F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.043F, -3.4443F, 0.2452F, -0.0847F, -0.0212F));

		PartDefinition cube_r11 = neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 47).addBox(-0.5F, 0.5025F, -0.7124F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -1.8132F, -4.2827F, -0.3142F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7132F, -4.4827F, -0.3765F, 0.0812F, -0.0321F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 55).addBox(-1.0F, 0.7067F, -0.0262F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.046F, -2.9785F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5975F, -3.0619F, -0.1262F, 0.1354F, 0.0265F));

		PartDefinition cube_r13 = neck2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(66, 66).addBox(-0.5F, 0.6337F, 0.2234F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -1.7658F, -2.407F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5379F, -2.5912F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 55).addBox(-1.0F, -0.2156F, -2.8221F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5762F, 0.0414F, 0.1396F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2721F, -2.0158F, 0.4521F, -0.0449F, 0.0749F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7513F, -0.1653F, 0.3056F, -0.0016F, 0.0113F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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