package fossils.fossils.client.blockentity.model.muttaburrasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MuttaburrasaurusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart leftArm4;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public MuttaburrasaurusFossilFrameModel(ModelPart root) {
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
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -35.0F, -8.0F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -9.6F, -0.5F, 1.0F, 38.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.2F, -28.4F, -36.1F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.9F, -7.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.2F, -28.4F, -36.1F, 0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-7.5F, -7.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -27.0F, -7.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -33.0F, -8.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 1.0F, 0.3F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.0F, -5.2F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, -1.2F, 0.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.7086F, 1.594F, 0.8988F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.9544F, 1.2932F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.5F, -0.4F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, -1.2F, 0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.7086F, 1.594F, 0.8988F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.9544F, 1.2932F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.5F, -0.4F, 0.5585F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2681F, -3.0504F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -5.3F, -0.0003F, 0.0869F, -0.0076F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.9916F, -0.2872F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, -13.9F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(55, 48).addBox(-0.5F, 0.0F, -6.4F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -13.7F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, 0.1F, -8.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -2.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1F, 11.2F, -7.9F, 1.0787F, 0.473F, -0.4867F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 8.9F, 2.5F, -1.4403F, 0.5682F, 0.0691F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.638F, 9.008F, -0.4458F, 0.2562F, 0.2955F, 0.2874F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6578F, 3.0F, -0.2394F, 0.0F, 0.0F, 1.5708F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6284F, 0.3F, 1.5096F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1F, 11.2F, -7.9F, 0.999F, -0.2503F, 0.3401F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 8.9F, 2.5F, -1.3975F, -0.2786F, 0.038F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.638F, 9.008F, -0.4458F, 0.2562F, -0.2955F, -0.2874F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6578F, 3.0F, -0.2394F, 0.0F, 0.0F, -1.5708F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6284F, 0.3F, 1.5096F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2F, -9.2F, -0.0863F, -0.0876F, -0.0076F));

		PartDefinition cube_r8 = neck3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 57).addBox(-0.5F, -1.0637F, 0.0065F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.6F, -2.6F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 13).addBox(-0.5F, 0.5F, -5.4F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -8.3F, 0.1204F, -0.2685F, -0.0126F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 45).addBox(-0.8F, 0.6677F, 0.0703F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -5.0F, -6.2F, -0.6284F, -0.0141F, 0.0103F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5F, -6.0F, -0.3614F, -0.3976F, -0.2565F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 0).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.6F, -4.0F, 0.035F, -0.0698F, -0.0024F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, -0.07F, 0.0593F, 0.1113F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -0.6F, 1.2217F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(23, 29).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 9.6F, -0.3193F, 0.2909F, -0.0945F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 13.9F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(40, 16).addBox(-0.5F, 0.2995F, -0.3218F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 15.0F, 0.0464F, -0.3487F, -0.0159F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 13.9782F, -0.0371F, -0.3488F, 0.0127F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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