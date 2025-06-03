package fossils.fossils.client.blockentity.model.kannemeyeria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KannemeyeriaFossilFrameModel extends SkullModelBase {
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
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public KannemeyeriaFossilFrameModel(ModelPart root) {
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
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -25.0F, 15.0F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-2.4F, -8.25F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.25F, -11.4F, -11.4F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.25F, -7.6F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.25F, -11.4F, -11.4F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -7.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -22.0F, 15.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -8.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, 0.9879F, -0.0463F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, 18.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 6.5665F, 23.4382F, -0.0399F, -0.1034F, -0.2533F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 0.4068F, -0.083F, 0.3154F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.3334F, -0.0204F, -0.0277F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 6.5665F, 23.4382F, -0.258F, 0.1034F, 0.2533F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 0.4068F, 0.083F, -0.3154F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, -0.1153F, 0.0204F, 0.0277F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 75).addBox(-0.5F, -0.078F, -1.9372F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, 27.0F, 0.8239F, -0.3297F, 0.2912F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(68, 91).addBox(-0.5F, -0.8285F, -1.1852F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 8.822F, 0.3628F, 0.1289F, 0.0227F, -0.1731F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 17.8F, 0.2628F, 0.0843F, 0.0226F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 59).addBox(-1.6F, -0.5732F, -11.8493F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 38).addBox(-1.6F, 0.165F, -6.9757F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.3F, 0.0F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3F, 11.6535F, -23.9464F, 0.5952F, 0.275F, -1.127F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6698F, 10.7583F, -0.2355F, -1.3796F, 0.1114F, 1.1764F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9069F, 7.8177F, -1.1504F, 1.0772F, -0.0743F, 0.0966F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 11.6535F, -23.9464F, 0.5578F, -0.4887F, 1.038F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4698F, 9.1583F, -0.1355F, -1.6795F, -0.0826F, -0.773F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8611F, 7.3052F, -1.0514F, 1.0829F, 0.1829F, -0.2617F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7613F, -27.8333F, 0.2049F, 0.2224F, 0.0023F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(65, 16).addBox(-1.6F, -1.3481F, -16.5017F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.1F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0446F, -1.7846F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(3.159F, 0.6541F, -4.1995F, -0.0196F, 0.1264F, -0.0341F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.159F, 0.6541F, -4.1995F, -0.0196F, -0.1264F, 0.0341F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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