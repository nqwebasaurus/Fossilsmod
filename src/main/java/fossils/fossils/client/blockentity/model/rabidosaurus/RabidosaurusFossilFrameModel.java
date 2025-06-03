package fossils.fossils.client.blockentity.model.rabidosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RabidosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart body2;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public RabidosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.upperleg1 = this.body.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.body.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.body2 = this.body.getChild("body2");
		this.upperarm1 = this.body2.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.body2.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.neck = this.body2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(3, 1).addBox(-0.5F, -24.0F, 14.0F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(3, 1).addBox(-0.4F, -5.5F, -0.5F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(8.0F, -20.5F, -12.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(3, 1).addBox(3.3F, -8.5F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(8.0F, -20.5F, -12.5F, -0.3054F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(3, 1).addBox(-0.5F, -8.5F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -20.5F, 14.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -8.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 21).addBox(-0.5F, 0.9879F, -0.0463F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, 18.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 6.5665F, 23.4382F, 0.1347F, -0.1034F, -0.2533F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 0.7559F, -0.083F, 0.3154F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.4207F, -0.0204F, -0.0277F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 6.5665F, 23.4382F, -0.5198F, 0.1034F, 0.2533F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 0.4068F, 0.083F, -0.3154F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, 0.3211F, 0.0204F, 0.0277F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7F, 27.0F, 0.8012F, 0.3931F, -0.3554F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 83).addBox(-0.5F, -8.2F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.622F, -0.9372F, 0.0F, 0.0F, -0.0349F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 34).addBox(-0.5F, -0.8285F, -1.1852F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 8.822F, 0.3628F, 0.1041F, 0.0795F, -0.6504F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 17.8F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(65, 73).addBox(-0.6F, -0.4185F, -11.5157F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.2705F, -0.1745F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 32).addBox(-0.6F, 0.284F, -6.6277F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.1658F, -0.1745F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.3F, 0.0F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3F, 9.6611F, -23.7721F, 0.7977F, 0.2039F, -0.7552F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1698F, 8.7583F, 0.8645F, -1.1928F, 0.1179F, 0.6028F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5421F, 8.0269F, -1.4569F, 1.3966F, 0.0383F, 0.0694F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 9.6611F, -23.7721F, 0.9444F, 0.0993F, 0.5057F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1698F, 8.7583F, 0.8645F, -0.5455F, -0.0729F, -0.5277F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5421F, 8.0269F, -1.4569F, 0.2621F, -0.0383F, -0.0694F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(1.831F, 1.7473F, -28.3406F, -0.317F, -0.5956F, 0.3607F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 75).addBox(-0.5F, 0.8786F, -1.1678F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3431F, 0.1234F, 0.0439F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.1F, 0.6191F, -0.285F, 0.2028F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.2899F, -2.9681F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.4848F, 0.6078F, -12.7207F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.4848F, 0.6078F, -12.7207F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2895F, 1.0154F, -8.7972F, -0.0349F, 0.1231F, -0.1571F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2895F, 1.0154F, -8.7972F, -0.0349F, -0.1231F, 0.1571F));

		return LayerDefinition.create(meshdefinition, 118, 118);
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