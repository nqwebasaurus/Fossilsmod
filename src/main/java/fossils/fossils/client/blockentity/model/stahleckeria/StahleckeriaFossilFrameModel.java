package fossils.fossils.client.blockentity.model.stahleckeria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StahleckeriaFossilFrameModel extends SkullModelBase {
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

	public StahleckeriaFossilFrameModel(ModelPart root) {
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(41, 34).addBox(-1.5F, -25.7F, -14.0F, 1.0F, 26.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-0.5F, -24.0F, 14.4F, 1.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 67).addBox(8.5F, -8.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -13.0F, 14.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 42).addBox(3.5F, -9.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -13.0F, -13.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -8.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(38, 14).mirror().addBox(-2.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2696F, 0.1346F, -0.4439F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, 0.9879F, -0.0463F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6F, 18.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 6.5665F, 23.4382F, -0.2144F, -0.1034F, -0.2533F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 1.2368F, 0.0407F, 0.2725F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.0274F, 0.1098F, -0.0142F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 6.5665F, 23.4382F, -0.258F, 0.1034F, 0.2533F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 0.4068F, 0.083F, -0.3154F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, -0.1153F, 0.0204F, 0.0277F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(29, 80).addBox(-1.0F, 0.022F, -1.9372F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 4.7F, 27.0F, 0.8651F, 0.1334F, -0.1129F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(60, 88).addBox(-0.5F, -1.8285F, -1.2852F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.822F, 0.3628F, 0.1289F, 0.0227F, -0.1731F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 17.8F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 68).addBox(-1.0F, 1.0052F, 0.0067F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, 0.8F, -29.1F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 47).addBox(-1.0F, 1.0019F, -0.1698F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5F, -24.4F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.3F, 0.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3F, 9.6611F, -23.7721F, 0.1168F, 0.0778F, -0.6333F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1698F, 8.7583F, 0.8645F, -0.6293F, 0.0923F, 0.5673F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5421F, 8.0269F, -1.4569F, 0.7857F, 0.0383F, 0.0694F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3F, 9.6611F, -23.7721F, 0.7297F, -0.0487F, 0.6007F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1698F, 8.7583F, 0.8645F, -0.9746F, -0.1179F, -0.6028F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5421F, 8.0269F, -1.4569F, 1.1784F, -0.0383F, -0.0694F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -28.7F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, 0.8786F, -0.6678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0723F, -4.0511F, -0.0052F, 0.2098F, 0.0085F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4922F, -2.3457F, 0.4974F, 0.0F, 0.0F));

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