package fossils.fossils.client.blockentity.model.tapinocaninus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TapinocaninusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart bone6;

	public TapinocaninusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body2 = this.Bodymiddle.getChild("body2");
		this.body = this.body2.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.head = this.Neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftarm = this.Bodyfront.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.Bodyfront.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.leftLeg = this.Hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.rightLeg = this.Hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm7 = this.rightLeg3.getChild("rightArm7");
		this.rightArm6 = this.rightArm7.getChild("rightArm6");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone5 = this.Hips.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -18.6F, 16.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -9.9F, -0.5F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(5.5F, -15.8F, -8.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.2F, -6.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.5F, -15.8F, -8.5F, 0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-1.4F, -5.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -14.5F, 16.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.5054F, 18.2633F, -0.6037F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(23, 6).addBox(-0.5F, 0.1F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 0).addBox(-0.5F, 0.1F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.2642F, -0.0843F, -0.0228F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(17, 15).addBox(-0.5F, 0.5F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1026F, -5.9083F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition Bodymiddle_r2 = body2.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(15, 23).addBox(-0.5F, 0.5089F, -5.7758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -6.0F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(6, 6).addBox(-0.5F, 0.5944F, -0.5631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, 0.5944F, -7.2631F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8221F, -6.8881F, -0.0221F, -0.0872F, 0.0019F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.3F, 0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, 0.2095F, -3.2026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 52).addBox(-0.5F, 0.2095F, -0.5026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3017F, -6.8405F, -0.2685F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(50, 39).addBox(-0.5F, 0.0085F, -3.0078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, 0.1172F, -0.1734F, -0.0203F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, 0.211F, -4.7025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1893F, -2.9615F, 0.0175F, -0.2627F, 0.0376F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5958F, -4.8353F, 0.6389F, -0.1395F, 0.2223F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -0.1691F, -4.1514F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -0.1691F, -4.1514F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2122F, -0.2723F, 0.6545F, 0.0F, 0.0F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6531F, 9.9173F, -3.5745F, 0.1714F, -0.0262F, -0.3351F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2379F, 8.716F, 1.472F, -0.7559F, -0.1729F, 0.2176F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4087F, 5.0385F, 0.2275F, 0.0264F, -0.0191F, -0.0459F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, 0.8203F, -0.0002F, 0.0001F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6531F, 9.9173F, -3.5745F, -0.7298F, -0.2044F, 0.6399F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2379F, 8.716F, 1.472F, -1.2387F, 0.3879F, -0.4216F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4087F, 5.0385F, 0.2275F, 0.0264F, 0.0191F, 0.0459F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, 0.5891F, 0.2818F, -0.3941F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5998F, 6.5849F, -6.9685F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5998F, 6.5849F, -6.9685F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(72, 51).addBox(-0.5F, 0.158F, -0.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -1.2756F, 2.0903F, -0.2177F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(72, 15).addBox(-0.5F, 0.0068F, -0.0378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0937F, 1.7033F, -0.235F, 0.0F, 0.0F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1009F, 3.189F, 0.242F, 1.1479F, 0.0154F, -0.0804F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0132F, 7.3211F, -3.9844F, 1.0204F, 0.0356F, 0.0797F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1045F, 4.6995F, -2.2195F, -1.5273F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 2.087F, 0.2608F, -0.2947F, -0.008F, 0.0104F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.1658F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1009F, 3.189F, 0.242F, 0.188F, -0.0154F, 0.0804F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0132F, 7.3211F, -3.9844F, 1.1077F, -0.0356F, -0.0797F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1045F, 4.6995F, -2.2195F, -1.5273F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 2.087F, 0.2608F, 0.8834F, 0.008F, -0.0104F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.4276F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3151F, -0.5251F, -0.8095F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3151F, -0.5251F, -0.8095F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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