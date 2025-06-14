package fossils.fossils.client.blockentity.model.geikiaelginensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GeikiaelginensisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public GeikiaelginensisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.upperleg1 = this.body.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.body.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -12.8F, 14.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.2F, -5.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(6.5F, -10.5F, -9.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, -6.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(6.5F, -10.5F, -9.5F, 0.5236F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-1.2F, -3.7F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -10.5F, 15.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.6401F, 11.6712F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, 0.6879F, 0.2537F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4374F, 4.8973F, 3.7317F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4374F, 4.8973F, 3.7317F, 0.0F, 0.0F, -0.1745F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 6.168F, 4.4033F, -0.429F, 0.092F, -1.102F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1222F, 6.8553F, -0.6478F, 0.4589F, -0.6789F, 0.7475F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.273F, 5.308F, -0.1457F, 0.1023F, 0.3512F, 0.301F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 6.168F, 4.4033F, 0.4327F, -0.2618F, 0.6657F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1222F, 6.8553F, -0.6478F, 0.7226F, 0.2566F, -0.502F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.273F, 5.308F, -0.1457F, -0.9828F, -0.4076F, -0.1158F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, 0.022F, -0.6372F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.9721F, 4.4354F, 1.2217F, -0.1745F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(36, 53).addBox(-0.5F, -0.3285F, -1.1852F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.0753F, 0.4747F, -0.1745F, 0.0F, 0.48F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, -1.2F, -0.0873F, -0.1309F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 6).addBox(-0.5F, 1.0F, 17.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, 1.0F, 9.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.551F, -7.8061F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 1.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.651F, -6.6189F, 0.0524F, -0.2618F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, 0.7019F, 2.3302F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.3F, 0.1658F, 0.0F, 0.0F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3087F, 5.5365F, -6.642F, 1.1968F, 0.5539F, -0.6815F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.693F, 5.388F, -0.1855F, -0.6945F, -0.5351F, 1.3421F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2002F, 6.1609F, -0.8725F, 0.3333F, 1.1611F, -0.3931F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3087F, 5.5365F, -6.642F, 0.5866F, 0.0397F, 0.8486F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.693F, 5.388F, -0.1855F, -0.7267F, 0.4074F, -1.3568F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2002F, 6.1609F, -0.8725F, 1.0029F, -0.9274F, -0.1544F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.0F, 14.4834F, -4.9304F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.0F, 14.4834F, -4.9304F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -5.075F, -0.2117F, -0.3065F, -0.1488F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(33, 3).addBox(-0.5F, 0.6052F, 4.7067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 0).addBox(-0.5F, 0.6052F, 1.0067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5953F, -3.5292F, -0.0873F, -0.3491F, -0.0873F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 43).addBox(-0.5F, 0.4786F, 1.2322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8807F, -2.3828F, 0.2607F, -0.0142F, -0.2909F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.68F, -1.4655F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8122F, -3.6136F, -1.6327F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8122F, -3.6136F, -1.6327F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6125F, -4.2219F, 2.8679F, -0.0196F, 0.1264F, -0.0341F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6125F, -4.2219F, 2.8679F, -0.0196F, -0.1264F, 0.0341F));

		return LayerDefinition.create(meshdefinition, 76, 76);
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