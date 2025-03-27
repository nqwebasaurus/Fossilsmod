package fossils.fossils.client.blockentity.model.stagonolepis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StagonolepisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Stagonolepis;
	private final ModelPart body3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart leftBackLeg;
	private final ModelPart leftBjoint;
	private final ModelPart leftBfoot;
	private final ModelPart rightBackLeg;
	private final ModelPart rightBjoint;
	private final ModelPart rightBfoot;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart leftFrontLeg;
	private final ModelPart LeftFjoint;
	private final ModelPart LeftFFoot;
	private final ModelPart rightFrontLeg;
	private final ModelPart RightFjoint;
	private final ModelPart RightFFoot;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;

	public StagonolepisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Stagonolepis = this.fossil.getChild("Stagonolepis");
		this.body3 = this.Stagonolepis.getChild("body3");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftBackLeg = this.body3.getChild("leftBackLeg");
		this.leftBjoint = this.leftBackLeg.getChild("leftBjoint");
		this.leftBfoot = this.leftBjoint.getChild("leftBfoot");
		this.rightBackLeg = this.body3.getChild("rightBackLeg");
		this.rightBjoint = this.rightBackLeg.getChild("rightBjoint");
		this.rightBfoot = this.rightBjoint.getChild("rightBfoot");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.leftFrontLeg = this.body.getChild("leftFrontLeg");
		this.LeftFjoint = this.leftFrontLeg.getChild("LeftFjoint");
		this.LeftFFoot = this.LeftFjoint.getChild("LeftFFoot");
		this.rightFrontLeg = this.body.getChild("rightFrontLeg");
		this.RightFjoint = this.rightFrontLeg.getChild("RightFjoint");
		this.RightFFoot = this.RightFjoint.getChild("RightFFoot");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -12.0F, 5.8F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -1.55F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.5F, -10.45F, -10.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.25F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.5F, -10.45F, -10.4F, 0.1745F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(0.1F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.0F, 6.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Stagonolepis = fossil.addOrReplaceChild("Stagonolepis", CubeListBuilder.create(), PartPose.offset(-0.5F, -5.325F, 5.0F));

		PartDefinition body3 = Stagonolepis.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0335F, 0.4753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 65).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.3524F, -0.7172F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(54, 25).addBox(0.0F, 0.1493F, -0.3746F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5524F, 5.1828F, -0.0277F, -0.0011F, -0.0114F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 53).addBox(-0.5F, 0.6858F, -0.651F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.5007F, 9.0254F, -0.0896F, 0.0869F, -0.0078F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(65, 59).addBox(-0.5F, 0.35F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2858F, 8.849F, 0.0177F, 0.2618F, 0.0046F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.2494F, -0.5391F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 7.0F, 0.1578F, 0.3019F, 0.0473F));

		PartDefinition leftBackLeg = body3.addOrReplaceChild("leftBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.65F, 0.4976F, 0.9828F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftBjoint = leftBackLeg.addOrReplaceChild("leftBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.3861F, 1.7445F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftBfoot = leftBjoint.addOrReplaceChild("leftBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 5.1775F, 1.634F, -0.6535F, -0.0118F, 0.0063F));

		PartDefinition rightBackLeg = body3.addOrReplaceChild("rightBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.65F, 0.4976F, 0.9828F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightBjoint = rightBackLeg.addOrReplaceChild("rightBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.3861F, 1.7445F, 0.6981F, 0.0F, 0.0F));

		PartDefinition rightBfoot = rightBjoint.addOrReplaceChild("rightBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 5.1775F, 1.634F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8702F, -0.921F, 0.0968F, 0.1303F, 0.0126F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 6).addBox(-0.5F, 0.3861F, 0.2295F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.1146F, -4.8435F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0568F, -4.8612F, 0.0175F, 0.0436F, 0.0008F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 66).addBox(-0.5F, 0.7F, -6.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.388F, -4.7778F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(63, 68).addBox(-0.5F, 0.2F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.112F, 0.1222F, 0.0F, 0.0F, 0.0F));

		PartDefinition leftFrontLeg = body.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 5.1771F, -10.6219F, -0.6184F, 0.3044F, -0.2201F));

		PartDefinition LeftFjoint = leftFrontLeg.addOrReplaceChild("LeftFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6518F, 1.0023F, 4.5709F, 0.603F, 0.1607F, 0.2841F));

		PartDefinition LeftFFoot = LeftFjoint.addOrReplaceChild("LeftFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0892F, 4.6576F, -0.2639F, 0.3766F, -0.52F, 0.0503F));

		PartDefinition rightFrontLeg = body.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 5.1771F, -10.6219F, -1.6656F, -0.3044F, 0.2201F));

		PartDefinition RightFjoint = rightFrontLeg.addOrReplaceChild("RightFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6518F, 1.0023F, 4.5709F, 0.8212F, -0.1607F, -0.2841F));

		PartDefinition RightFFoot = RightFjoint.addOrReplaceChild("RightFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0892F, 4.6576F, -0.2639F, 1.2802F, 0.5622F, 0.0944F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(72, 33).addBox(-0.5F, 0.2452F, -2.8062F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.612F, -10.8778F, -0.0095F, 0.1743F, -0.0092F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, -1).addBox(-0.5F, -0.2F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3452F, -0.0062F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6F, -2.9F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, 0.64F, -2.0843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4548F, 0.0938F, -0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1452F, -1.7062F, 0.1861F, 0.2428F, 0.0985F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9718F, -0.2133F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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