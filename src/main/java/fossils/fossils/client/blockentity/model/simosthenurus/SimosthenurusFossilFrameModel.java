package fossils.fossils.client.blockentity.model.simosthenurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SimosthenurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftThumb;
	private final ModelPart leftThumb2;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightThumb;
	private final ModelPart rightThumb2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftZygomaticarch;
	private final ModelPart rightZygomaticarch;
	private final ModelPart leftMaxilla;
	private final ModelPart rightMaxilla;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SimosthenurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftThumb = this.leftArm3.getChild("leftThumb");
		this.leftThumb2 = this.leftArm3.getChild("leftThumb2");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightThumb = this.rightArm3.getChild("rightThumb");
		this.rightThumb2 = this.rightArm3.getChild("rightThumb2");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftZygomaticarch = this.head.getChild("leftZygomaticarch");
		this.rightZygomaticarch = this.head.getChild("rightZygomaticarch");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -22.0F, 14.3F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.1F, -7.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -21.0F, 14.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-6.75F, -0.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, -27.25F, -8.6F, 0.3491F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-4.6F, -10.35F, -0.5F, 1.0F, 38.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.3F, -27.25F, -8.6F, 0.0F, 0.3491F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.7597F, 15.6796F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 29).addBox(-0.5F, 0.7F, -1.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1F, 0.7727F, -1.0827F, -0.8116F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 8.4682F, 3.6188F, 2.6704F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 20.796F, -2.1496F, -1.5621F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 4.6671F, -1.2262F, 0.5934F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1F, 0.7727F, -1.0827F, -1.2479F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 8.4682F, 3.6188F, 2.3911F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 20.796F, -2.1496F, -1.4748F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 4.6671F, -1.2262F, 1.2479F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.573F, -4.8887F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 60).addBox(-1.0F, 0.6F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.2741F, -4.018F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7741F, -3.818F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 61).addBox(-1.0F, 0.2F, -3.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.4537F, -3.7643F, 0.2021F, 0.06F, 0.1454F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, 0.351F, -5.1633F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.2F, 0.2793F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -4.9F, 0.7161F, 0.0329F, 0.0286F));

		PartDefinition cube_r8 = body4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 38).addBox(-1.0F, -0.7978F, -0.1163F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4F, -6.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.3463F, -5.8357F, -0.129F, 0.1414F, 0.069F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 43).addBox(-0.5F, 0.6186F, -0.0595F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.778F, -4.0456F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 46).addBox(-0.5F, -0.1747F, 0.0866F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.378F, -7.2456F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 7.3915F, -7.1202F, 0.6191F, 0.0927F, -0.3822F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.5302F, 3.9849F, -0.0322F, 0.0295F, 0.7413F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0209F, -3.6281F, -0.9599F, -1.3526F, 1.5708F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2911F, 1.5818F, -0.2411F, 0.6533F, 0.0337F, 0.0294F));

		PartDefinition leftThumb = leftArm3.addOrReplaceChild("leftThumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9707F, 0.5969F, -0.3022F, 0.1752F, 0.0983F, 0.2957F));

		PartDefinition leftThumb2 = leftArm3.addOrReplaceChild("leftThumb2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5992F, 0.9143F, -0.3746F, 0.3233F, -0.1537F, -0.8139F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 7.3915F, -7.1202F, -0.0354F, -0.0927F, 0.3822F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.5302F, 3.9849F, -0.0357F, -0.025F, -0.6104F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0209F, -3.6281F, -0.9599F, 1.3526F, -1.5708F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2911F, 1.5818F, -0.2411F, 0.6533F, -0.0337F, -0.0294F));

		PartDefinition rightThumb = rightArm3.addOrReplaceChild("rightThumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9707F, 0.5969F, -0.3022F, 0.1752F, -0.0983F, -0.2957F));

		PartDefinition rightThumb2 = rightArm3.addOrReplaceChild("rightThumb2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5992F, 0.9143F, -0.3746F, 0.3233F, 0.1537F, 0.8139F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.978F, -7.3456F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 36).addBox(-0.5F, 0.2F, -3.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.7F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -3.8F, 0.2612F, 0.4294F, 0.3097F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 53).addBox(-0.5F, 0.6595F, -1.8625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.7F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(82, 36).addBox(-0.5F, 0.2F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3199F, -2.7513F, 0.704F, 0.2359F, 0.1959F));

		PartDefinition leftZygomaticarch = head.addOrReplaceChild("leftZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9316F, -0.5966F, -5.585F, 0.0F, 0.3491F, 0.0F));

		PartDefinition rightZygomaticarch = head.addOrReplaceChild("rightZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9316F, -0.5966F, -5.585F, 0.0F, -0.3491F, 0.0F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.417F, -0.2803F, -8.7339F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(-0.417F, -0.2803F, -8.7339F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.5616F, -4.3199F, -5.488F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5616F, -4.3199F, -5.488F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, -1.3901F, -1.5979F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.3427F, 0.3074F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8228F, 1.6852F, -0.3328F, -0.0825F, 0.0285F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(-2, 26).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1427F, 8.7574F, 0.4061F, -0.3227F, -0.1355F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 7.9F, 0.429F, 0.0794F, 0.0363F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.8F, 0.5243F, 0.504F, 0.2723F));

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