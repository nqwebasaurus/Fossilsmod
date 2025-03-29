package fossils.fossils.client.blockentity.model.patagosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PatagosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart leftLeg7;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart rightLeg7;
	private final ModelPart rightLeg8;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart upperarmleft;
	private final ModelPart lowerarmleft;
	private final ModelPart handleft;
	private final ModelPart Leftclaw;
	private final ModelPart neck6;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PatagosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg5 = this.hips.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.leftLeg7 = this.leftLeg6.getChild("leftLeg7");
		this.leftLeg8 = this.leftLeg7.getChild("leftLeg8");
		this.rightLeg5 = this.hips.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.rightLeg7 = this.rightLeg6.getChild("rightLeg7");
		this.rightLeg8 = this.rightLeg7.getChild("rightLeg8");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm4 = this.chest.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightArm4 = this.chest.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.upperarmleft = this.chest.getChild("upperarmleft");
		this.lowerarmleft = this.upperarmleft.getChild("lowerarmleft");
		this.handleft = this.lowerarmleft.getChild("handleft");
		this.Leftclaw = this.handleft.getChild("Leftclaw");
		this.neck6 = this.chest.getChild("neck6");
		this.neck5 = this.neck6.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.head.getChild("jaw2");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -44.0F, 15.9F, 2.0F, 44.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-8.0F, -10.0F, 0.0F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -31.0F, 16.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -9.0F, 0.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -31.0F, -18.3F, 0.1658F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -14.0F, -1.0F, 2.0F, 45.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2F, -31.0F, -18.3F, 0.0F, 0.1658F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.8F, 15.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 69).addBox(-1.0F, 0.3F, -0.9F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -5.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = hips.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0F, 3.45F, 1.2F, 1.7017F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 3.7348F, -17.1514F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg7 = leftLeg6.addOrReplaceChild("leftLeg7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg7.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3537F, -1.8561F));

		PartDefinition rightLeg5 = hips.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 3.45F, 1.2F, 1.3963F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 3.7348F, -17.1514F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg7 = rightLeg6.addOrReplaceChild("rightLeg7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg7.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3537F, -1.8561F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -7.0F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, 1.0F, 0.0F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -18.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5F, -18.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.9217F, -0.1407F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -9.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftArm4 = chest.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(7.8412F, 12.7424F, -9.5629F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 16.4601F, -0.9271F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 10.9475F, -1.6938F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightArm4 = chest.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.8412F, 12.7424F, -9.5629F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 16.4601F, -0.9271F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 10.9475F, -1.6938F, 0.7854F, 0.0F, 0.0F));

		PartDefinition upperarmleft = chest.addOrReplaceChild("upperarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(9.9F, 30.1082F, 13.023F, 0.0625F, 0.0F, 0.0F));

		PartDefinition lowerarmleft = upperarmleft.addOrReplaceChild("lowerarmleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.3226F, 0.4916F, -0.4552F, 0.0F, 0.0F));

		PartDefinition handleft = lowerarmleft.addOrReplaceChild("handleft", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 8.4811F, -1.6829F, 0.4351F, 0.0F, 0.0F));

		PartDefinition Leftclaw = handleft.addOrReplaceChild("Leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.98F, 1.4337F, 1.3758F, 0.3183F, 0.2122F, 0.5732F));

		PartDefinition neck6 = chest.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3F, -9.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, 0.6214F, -0.8375F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.307F, -7.8292F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck5 = neck6.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.393F, -7.3292F, 0.0252F, 0.221F, -0.0797F));

		PartDefinition cube_r8 = neck5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-1, 90).addBox(-1.0F, 0.4988F, -0.0493F, 2.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8F, -11.6F, -0.4625F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, -11.1F, 0.1329F, 0.173F, 0.023F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 126).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.3F, -10.3F, -0.3161F, 0.5872F, -0.1793F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 126).addBox(-1.0F, -15.2F, -1.8F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.1F, -9.3F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(124, 104).addBox(-0.5F, 0.9726F, 2.9067F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1106F, -8.0784F, -0.672F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.3106F, -6.6784F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(140, 3).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.8F, -4.4F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 3.4F, -0.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition jaw2 = head.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 3.3F, 0.1F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(68, 41).addBox(-1.0F, -0.9F, -0.8F, 2.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 9.0F, 0.1232F, 0.1299F, 0.016F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.8F, 0.0F, 2.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, 17.7F, -0.143F, 0.216F, -0.0308F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 29.0F, 0.0536F, -0.2179F, -0.0116F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 38).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 27.0F, 0.0542F, -0.2614F, -0.014F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(48, 16).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 19.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 28.0F, -0.0264F, -0.1309F, 0.0034F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(68, 16).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 23.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 19.0F, -0.0723F, -0.2611F, 0.0187F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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