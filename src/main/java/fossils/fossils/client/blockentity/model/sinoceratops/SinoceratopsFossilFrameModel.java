package fossils.fossils.client.blockentity.model.sinoceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SinoceratopsFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SinoceratopsFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -28.0F, 3.3F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 1.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-2.9F, -3.5F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -20.5F, -24.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(2.0F, -4.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -20.5F, -24.0F, 0.1745F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-4.5F, -5.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -23.0F, 3.8F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(1, 21).addBox(-0.5F, -0.2889F, -5.6091F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.1081F, 3.1982F, -0.1833F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 0.5838F, 0.4989F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 0.5838F, 0.4989F, 0.5847F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.7762F, -4.4099F, 0.3229F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.6865F, 4.6725F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.288F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5213F, -5.4155F, 0.1402F, 0.0864F, 0.0122F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 50).addBox(-0.5F, 0.6427F, -7.8423F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 34).addBox(-0.6F, -0.3073F, -7.6534F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3866F, -15.8671F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, 0.093F, -0.8666F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 9.5518F, -5.9424F, -0.4363F, 0.0F, -0.1745F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 7.5571F, 4.5001F, 0.3322F, -1.2608F, 0.0482F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 7.5086F, -2.6347F, 1.0463F, 0.6267F, -0.3359F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 9.5518F, -5.9424F, 0.0F, 0.0F, 0.1745F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.5571F, 4.5001F, -0.4806F, 1.2395F, -0.8996F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 7.5086F, -2.6347F, 1.0463F, -0.6267F, 0.3359F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.486F, -6.1216F, -0.0436F, 0.1309F, 0.0F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 78).addBox(-0.5F, -0.1F, -3.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, 0.0058F, 0.1744F, 0.0443F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 19).addBox(-0.5F, -0.4F, -6.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2262F, -5.5794F, -0.2504F, 0.1486F, 0.0807F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2423F, -0.0934F, -1.8267F, -1.3701F, 0.0349F, 0.0F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2423F, -0.0934F, -1.8267F, -1.3701F, -0.0349F, 0.0F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3297F, 7.266F, -13.544F, 0.0F, 0.0F, 0.0349F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3297F, 7.266F, -13.544F, 0.0F, 0.0F, -0.0349F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.108F, -6.8808F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.108F, -6.8808F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8567F, -2.0625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.471F, -5.1075F, 3.5343F, 0.1F, -0.3365F, 0.1941F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.471F, -5.1075F, 3.5343F, 0.1F, 0.3365F, -0.1941F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.4675F, -0.2504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offset(-0.0033F, 5.7221F, -8.2912F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.8038F, 0.0069F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.0994F, 6.3032F, -0.1921F, -0.0873F, 0.0015F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 21).addBox(-0.5F, -0.1697F, -0.1085F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9361F, 8.8961F, -0.0813F, -0.261F, 0.021F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(42, 50).addBox(-0.5F, 0.597F, -0.2166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9272F, 9.6761F, 0.2322F, -0.2125F, -0.0498F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.5468F, -0.7914F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0741F, 8.8502F, 0.3187F, -0.1659F, -0.0544F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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