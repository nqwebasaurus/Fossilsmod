package fossils.fossils.client.blockentity.model.estemmenosuchusmirabilis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EstemmenosuchusmirabilisFossilFrameModel extends SkullModelBase {
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
	private final ModelPart Tailmiddlebase2;
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

	public EstemmenosuchusmirabilisFossilFrameModel(ModelPart root) {
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
		this.Tailmiddlebase2 = this.Tailmiddlebase.getChild("Tailmiddlebase2");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -13.0F, 16.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.2F, -6.35F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.6F, -11.65F, -6.5F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.05F, -5.7F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.6F, -11.65F, -6.5F, 0.3491F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-2.2F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.5F, 16.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.1161F, 18.1281F, -0.499F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(30, 26).addBox(-0.5F, 0.2F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.1941F, -0.0856F, -0.0168F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(28, 5).addBox(-0.5F, 0.6F, 5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 0).addBox(-0.5F, 0.6F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1026F, -5.9083F, 0.1577F, -0.0862F, -0.0137F));

		PartDefinition Bodymiddle_r2 = body2.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(23, 8).addBox(-0.5F, 0.6089F, -6.0758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0015F, -5.9651F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(15, 32).addBox(-0.5F, 0.6944F, -6.8631F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2225F, -4.9012F, 0.0828F, -0.0435F, -0.0036F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, -0.3F, 7.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 18).addBox(-0.5F, -0.3F, 1.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(60, 46).addBox(-0.5F, 0.2095F, -2.9026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5512F, -5.8931F, -0.127F, -0.1412F, -0.0692F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(63, 23).addBox(-0.5F, 0.1085F, -3.2078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 25).addBox(-0.5F, 0.1085F, -0.5078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, -0.1978F, -0.3657F, -0.0687F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, 0.211F, -2.7025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0899F, -2.9509F, -0.098F, -0.477F, -0.0554F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3439F, -3.2321F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.8632F, -0.2522F, -1.4712F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.8632F, -0.2522F, -1.4712F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4633F, -1.859F, 1.4835F, 0.0F, 0.0F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2274F, 8.4252F, -4.9903F, 0.6957F, 0.1478F, -0.4752F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1474F, 6.9516F, 0.8482F, -0.7933F, 0.1552F, 0.4931F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4192F, 4.5545F, -0.3853F, -0.0608F, -0.0191F, -0.0459F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, -0.1396F, -0.0002F, 0.0001F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2274F, 8.4252F, -4.9903F, -0.3515F, -0.1478F, 0.4752F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1474F, 6.9516F, 0.8482F, -0.5483F, 0.1265F, -0.4822F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4192F, 4.5545F, -0.3853F, -0.0608F, 0.0191F, 0.0459F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, 0.3403F, 0.0002F, -0.0001F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offset(0.0127F, 0.7642F, -1.4173F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6893F, 4.1657F, -5.7045F, -0.4367F, 0.0869F, -0.0076F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6893F, 4.1657F, -5.7045F, -0.4367F, -0.0869F, 0.0076F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, 0.258F, -0.0094F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2009F, 0.2281F, -0.0527F, -0.1743F, 0.0091F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(13, 46).addBox(-0.5F, 0.1068F, -0.1378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(16, 49).addBox(-0.5F, 0.1068F, 3.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1525F, 3.9001F, -0.1253F, -0.2069F, 0.1117F));

		PartDefinition Tailmiddlebase2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase2", CubeListBuilder.create().texOffs(34, 16).addBox(-0.5F, 0.1068F, -0.0378F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0378F, 3.8633F, 0.1736F, -0.4306F, -0.0731F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9528F, 1.5221F, -0.6579F, 0.9298F, 0.0154F, -0.0804F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1962F, 5.6055F, -2.697F, 1.1077F, 0.0356F, 0.0797F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 2.087F, 0.2608F, -0.2511F, -0.008F, 0.0104F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.2094F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9528F, 1.5221F, -0.6579F, 0.3189F, -0.0154F, 0.0804F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1962F, 5.6055F, -2.697F, 1.1077F, -0.0356F, -0.0797F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 2.087F, 0.2608F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5937F, 1.1499F, -1.4605F, -0.0118F, -0.2613F, 0.0896F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5937F, 1.1499F, -1.4605F, -0.0118F, 0.2613F, -0.0896F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 107, 107);
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