package fossils.fossils.client.blockentity.model.nqwebasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NqwebasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public NqwebasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -2.7F, -0.45F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.7138F, -15.3F, -13.8481F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.5F, -0.55F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7138F, -15.3F, -13.8481F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -15.0F, -3.1F, -0.2793F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -15.0F, -3.1F, 0.0F, 0.2793F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.0F, -3.0F, -0.1213F, 0.2482F, -0.1345F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-2, 20).addBox(-1.0F, 0.5F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.5F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 0.7F, -0.15F, -0.0417F, -0.0628F, 0.1316F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9052F, 0.8362F, 1.0297F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1946F, 0.178F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, -2.5F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 0.7F, -0.15F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9052F, 0.8362F, 0.8547F, -0.0329F, 0.0286F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1946F, 0.178F, -0.8616F, -0.051F, 0.1274F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7934F, -0.3088F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, -2.5F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -2.2F, -0.0409F, -0.1292F, 0.0486F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 25).addBox(-1.0F, 0.7087F, -2.0316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.3F, -3.8F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 26).addBox(-1.0F, 0.0F, -4.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.2F, 0.2F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -5.8F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-1, 27).addBox(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.3F, -3.7F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5474F, 4.1395F, -2.7157F, 0.7929F, 0.0569F, -0.3716F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 3.5353F, -0.0475F, -1.2658F, 0.0387F, -0.0202F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.8F, -0.3F, 0.499F, -0.223F, -0.0302F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.474F, -0.056F, -0.211F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5474F, 4.1395F, -2.7157F, -0.0596F, -0.2218F, 0.2273F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 3.5353F, -0.0475F, -1.2519F, 0.2938F, 0.1277F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.8F, -0.3F, 0.4868F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4716F, -0.0024F, -0.4765F, -0.024F, 0.0558F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -3.7F, -0.1309F, 0.1745F, 0.0F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 38).addBox(-1.1F, -0.2565F, -3.151F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.7F, 0.7F, -0.3515F, -0.1148F, 0.042F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.7F, -0.1429F, -0.4663F, -0.1698F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 18).addBox(-1.0F, 0.1F, -4.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.6F, -0.6F, -0.829F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2F, -3.8F, 0.1874F, -0.4199F, -0.0065F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(31, 5).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.637F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 24).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.9F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.8F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.1949F, -0.1713F, -0.0336F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.1347F, -0.4329F, 0.0568F));

		PartDefinition cube_r12 = tail4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6F, 0.0F, -0.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0175F, 0.0F));

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