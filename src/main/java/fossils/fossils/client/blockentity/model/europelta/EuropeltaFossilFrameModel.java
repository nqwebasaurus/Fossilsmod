package fossils.fossils.client.blockentity.model.europelta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuropeltaFossilFrameModel extends SkullModelBase {
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
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public EuropeltaFossilFrameModel(ModelPart root) {
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
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -18.0F, 5.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(-1.8F, -18.0F, -15.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(2.5F, -5.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-2.0F, -7.0F, 19.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -16.0F, -14.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -19.1F, 6.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-1, 49).addBox(0.0F, 0.5199F, -0.1166F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 29).addBox(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4F, 1.1999F, -0.2448F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1762F, -2.8099F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.4F, 1.1999F, -0.2448F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1762F, -2.8099F, 0.1484F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5865F, 3.4725F, 0.3403F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -8.3F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 10).addBox(0.0F, 0.4F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.3F, 0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -8.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(55, 76).addBox(-0.1F, 0.4651F, -3.0774F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -4.7F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 7).addBox(0.0F, 0.1F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.3F, 0.192F, 0.0175F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3F, 5.5669F, -3.5334F, 0.5149F, -0.0008F, -0.2182F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 5.3571F, 1.7001F, -0.55F, -0.9424F, 1.0623F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1439F, 6.5086F, -2.6347F, 0.9395F, 0.7562F, -0.2091F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3F, 5.3669F, -3.5334F, -0.7451F, 0.0454F, 0.1941F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 5.3571F, 1.7001F, 1.0233F, 1.1447F, 0.2858F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 6.5086F, -2.6347F, 0.9309F, -0.6437F, 0.5477F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -7.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 38).addBox(-0.1F, -0.1F, -4.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, 0.1745F, 0.2618F, 0.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 70).addBox(0.0F, 0.0F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 78).addBox(0.0F, 0.5F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -2.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1742F, -2.7931F, 0.4115F, 0.08F, 0.0349F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, -0.524F, -1.7014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.2594F, -5.524F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.2594F, -5.524F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.3117F, 0.2096F, 0.2705F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.2961F, -0.0014F, 0.0248F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0204F, -0.3459F, -0.0676F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0925F, 0.2444F, -0.1618F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.0021F, 0.2033F, 0.0126F));

		PartDefinition cube_r10 = tail4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(23, 58).addBox(-0.4F, 0.0F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, 0.003F, -0.0171F, -0.002F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.3024F, 0.0122F, -0.0223F));

		return LayerDefinition.create(meshdefinition, 106, 106);
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