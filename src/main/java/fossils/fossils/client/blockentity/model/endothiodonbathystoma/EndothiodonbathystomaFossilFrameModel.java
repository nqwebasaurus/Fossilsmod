package fossils.fossils.client.blockentity.model.endothiodonbathystoma;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EndothiodonbathystomaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart endothiodon;
	private final ModelPart bodycentre;
	private final ModelPart bodyback;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart bodyfront;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart jaw;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;

	public EndothiodonbathystomaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.endothiodon = this.fossil.getChild("endothiodon");
		this.bodycentre = this.endothiodon.getChild("bodycentre");
		this.bodyback = this.bodycentre.getChild("bodyback");
		this.tail1 = this.bodyback.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.upperleg1 = this.bodyback.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.bodyback.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.bodyfront = this.bodycentre.getChild("bodyfront");
		this.neck1 = this.bodyfront.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.head.getChild("bone2");
		this.jaw = this.head.getChild("jaw");
		this.upperarm1 = this.bodyfront.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.bodyfront.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(5, 26).addBox(-0.5F, -18.0F, -10.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(0, 26).addBox(-0.5F, -17.0F, 8.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 56).addBox(4.9F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 50).addBox(0.5F, -5.0F, -18.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -9.0F, 8.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition endothiodon = fossil.addOrReplaceChild("endothiodon", CubeListBuilder.create(), PartPose.offset(5.0F, 0.0F, -5.0F));

		PartDefinition bodycentre = endothiodon.addOrReplaceChild("bodycentre", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bodycentre.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 10).addBox(-5.5F, 0.6941F, -0.084F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -19.6F, 4.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bodycentre.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 1).addBox(-5.5F, 0.833F, 0.2175F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -19.8F, -2.3F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bodyback = bodycentre.addOrReplaceChild("bodyback", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -18.4F, 11.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bodyback.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.8F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3617F, 0.1239F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail1 = bodyback.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(52, 44).addBox(-0.5F, 0.1035F, 0.0038F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6383F, 5.7239F, -0.6127F, 0.0715F, -0.0501F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(71, 71).addBox(-0.5F, 0.3292F, 0.0226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2965F, 3.7038F, -0.4396F, 0.1704F, -0.0381F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 37).addBox(-0.5F, 0.1123F, -0.8393F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1292F, 2.9226F, -0.1742F, 0.0869F, 0.0076F));

		PartDefinition upperleg1 = bodyback.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 3.8048F, 2.9621F, 0.2154F, -0.1188F, -0.6287F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8058F, 7.3369F, -0.2998F, 1.012F, 0.0393F, 0.5374F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5955F, 5.7218F, 0.5468F, -0.1606F, 0.1546F, -0.0508F));

		PartDefinition upperleg2 = bodyback.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 3.8048F, 2.9621F, -0.3954F, 0.1188F, 0.6287F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8058F, 7.3369F, -0.2998F, 0.6494F, 0.2614F, -0.6405F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5955F, 5.7218F, 0.5468F, -0.1587F, 0.0177F, 0.023F));

		PartDefinition bodyfront = bodycentre.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offset(-5.0F, -19.4F, -2.3F));

		PartDefinition cube_r5 = bodyfront.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.2F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 1.9F, -5.7F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck1 = bodyfront.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -5.5F, -0.4828F, 0.2598F, -0.0448F));

		PartDefinition cube_r6 = neck1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 60).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4958F, -2.7239F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6958F, -2.7239F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 37).addBox(0.0F, -0.2F, -1.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.0F, -3.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.8F, 0.9641F, 0.0795F, 0.1041F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4131F, -1.1435F, -4.9869F, 0.0669F, 0.3226F, 0.5187F));

		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4131F, -1.1435F, -4.9869F, 0.0669F, -0.3226F, -0.5187F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8024F, -1.5487F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm1 = bodyfront.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 9.2611F, -3.6721F, 0.6379F, 0.132F, -1.0545F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.181F, 6.2133F, 1.4092F, -0.8413F, 0.3092F, 0.9938F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.702F, 5.8683F, -0.7516F, 0.8489F, 0.2471F, 0.1721F));

		PartDefinition upperarm2 = bodyfront.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 9.2611F, -3.6721F, -0.1475F, -0.132F, 1.0545F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.181F, 6.2133F, 1.4092F, -0.839F, 0.3915F, -0.9835F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.702F, 5.8683F, -0.7516F, 1.3173F, 0.1432F, -0.0482F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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