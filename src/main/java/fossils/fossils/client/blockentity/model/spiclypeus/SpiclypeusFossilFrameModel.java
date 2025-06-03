package fossils.fossils.client.blockentity.model.spiclypeus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SpiclypeusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart browHorn;
	private final ModelPart rightFace;
	private final ModelPart browHorn2;
	private final ModelPart nasalHorn;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SpiclypeusFossilFrameModel(ModelPart root) {
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
		this.browHorn = this.leftFace.getChild("browHorn");
		this.rightFace = this.head.getChild("rightFace");
		this.browHorn2 = this.rightFace.getChild("browHorn2");
		this.nasalHorn = this.head.getChild("nasalHorn");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(2.2F, -23.0F, 2.8F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.8F, -3.35F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.9F, -16.65F, -14.2F, 0.0F, -0.2269F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.85F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(5.9F, -16.65F, -14.2F, 0.2269F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(3.8F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.5F, -18.0F, 3.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(2.661F, -23.2F, 3.7148F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9636F, -11.0709F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 7.3181F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, 0.4999F, 0.2552F, 0.1913F, -0.0166F, 0.0857F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8762F, -4.1099F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1865F, 4.2725F, -0.1391F, -0.0121F, -0.0864F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, 0.4999F, 0.2552F, 0.4529F, 0.0203F, -0.0849F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8762F, -4.1099F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1865F, 4.2725F, -0.1391F, 0.0121F, 0.0864F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1484F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0227F, -3.8884F, 0.3364F, -0.1649F, -0.0573F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 34).addBox(-0.5F, -0.96F, -0.1826F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.7683F, -9.8032F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 10).addBox(-0.5F, -0.3073F, -7.6534F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3683F, 2.6968F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7683F, -10.1032F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 31).addBox(-0.5F, -0.8282F, -0.4284F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1554F, -4.821F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, 6.8213F, -4.6418F, -0.1833F, 0.0F, -0.1745F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 7.0571F, 3.3001F, -0.8251F, -1.1317F, 1.2702F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 6.5086F, -2.6347F, 0.938F, 0.5578F, -0.5293F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, 6.8213F, -4.6418F, 0.3403F, 0.0F, 0.1745F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.0571F, 3.3001F, -1.2036F, 0.638F, -1.7412F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 6.5086F, -2.6347F, 1.4546F, -0.9034F, 0.9862F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4554F, -5.321F, -0.3357F, -0.2346F, -0.0367F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 44).addBox(-1.5F, -1.0029F, -0.3792F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 1.7288F, -4.383F, 0.1833F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4132F, -4.5076F, -0.0504F, -0.4306F, -0.0128F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.4F, -5.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -5.5F, 0.4784F, -0.0403F, 0.0774F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.274F, 0.8804F, -1.3643F, -1.5156F, 0.0302F, 0.0872F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.274F, 0.8804F, -1.3643F, -1.5156F, -0.0302F, -0.0872F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offset(0.5296F, 4.1294F, -11.1925F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offset(-0.5296F, 4.1294F, -11.1925F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.0822F, -4.1273F));

		PartDefinition browHorn = leftFace.addOrReplaceChild("browHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6227F, -7.3919F, -0.52F, -0.2182F, 0.0F, 0.6981F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.0822F, -4.1273F));

		PartDefinition browHorn2 = rightFace.addOrReplaceChild("browHorn2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6227F, -7.3919F, -0.52F, -0.2182F, 0.0F, -0.6981F));

		PartDefinition nasalHorn = head.addOrReplaceChild("nasalHorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.2822F, -8.4273F, -0.4538F, 0.0F, 0.0F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3178F, -1.0273F, -0.3863F, 0.009F, 0.0088F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.017F, -0.453F, 3.5091F, -0.1933F, -0.2635F, 0.128F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.017F, -0.453F, 3.5091F, -0.1933F, 0.2635F, -0.128F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 3.6389F, -3.5648F, 0.4008F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 15).addBox(-0.5F, 0.8038F, 0.4069F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.4645F, 7.5087F, -0.4821F, -0.1846F, 0.1169F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(30, 43).addBox(-0.5F, -0.2697F, -0.1085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9695F, 7.0283F, 0.3065F, -0.0832F, -0.0263F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(16, -1).addBox(-0.5F, 0.397F, -0.5166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6721F, 5.671F, 0.301F, 0.1668F, 0.0515F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, 0.1988F, -0.0752F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2549F, 7.942F, 0.2055F, 0.2137F, 0.0442F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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