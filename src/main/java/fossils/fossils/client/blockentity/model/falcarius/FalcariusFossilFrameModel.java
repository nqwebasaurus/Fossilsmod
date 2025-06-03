package fossils.fossils.client.blockentity.model.falcarius;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class FalcariusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
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

	public FalcariusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -14.0F, -2.8F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.4F, -3.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-0.7F, -14.0F, -15.4F, 0.0F, 0.2094F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.5F, -3.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, -14.0F, -15.4F, -0.2094F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -13.0F, -2.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.8F, -2.4F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.8F, -2.7F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, 1.0F, 0.05F, -0.6906F, 0.1119F, 0.1343F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9052F, 1.1362F, 1.1606F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.1946F, 0.578F, -0.7346F, -0.1132F, -0.1328F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7934F, -0.3088F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 1.0F, 0.05F, -1.5275F, 0.0057F, -0.1308F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9052F, 1.1362F, 1.3788F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.1946F, 0.578F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7934F, -0.3088F, 1.6144F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -2.5F, 0.0228F, 0.1299F, 0.0436F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-1, 11).addBox(-1.0F, 0.6028F, -3.3624F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -2.2F, -4.2F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 23).addBox(-1.0F, 0.2F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.1F, 0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(32, 33).addBox(-0.5F, 0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.6F, -7.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1474F, 2.2395F, -3.2157F, 0.9206F, 0.2777F, -0.1204F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0941F, 4.4353F, -0.2475F, -1.0879F, 0.0006F, 0.1502F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.1F, -0.3F, 0.4224F, -0.281F, 0.2936F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0388F, 0.6879F, -0.4515F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1474F, 2.2395F, -3.2157F, 0.4842F, -0.2777F, 0.1204F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0941F, 4.4353F, -0.2475F, -1.3497F, -0.0006F, -0.1502F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.1F, -0.3F, 0.4224F, 0.281F, -0.2936F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0388F, 0.6879F, -0.4515F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -2.8F));

		PartDefinition cube_r7 = neck4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-1, 31).addBox(-1.0F, 0.1F, -3.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.3F, -0.4189F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.4F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r8 = neck3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -0.3828F, 0.2841F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -4.2F, -4.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.6F, -3.9F, 0.1614F, 0.6102F, 0.0532F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 29).addBox(-1.0F, 0.3589F, -0.3633F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -3.2F, -1.9F, -0.9512F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.5707F, 0.1624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.4F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(7, 43).addBox(-0.5F, 0.6F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.9F, -3.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -3.3F, 0.0F, 0.0F, -0.0436F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 0.2F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(16, 19).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3F, 2.1F, -0.2428F, -0.1022F, 0.1926F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.0894F, -0.2173F, -0.0193F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(-2, 10).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0081F, 0.5001F, -0.3254F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.151F, 0.3887F, -0.0576F));

		return LayerDefinition.create(meshdefinition, 60, 60);
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