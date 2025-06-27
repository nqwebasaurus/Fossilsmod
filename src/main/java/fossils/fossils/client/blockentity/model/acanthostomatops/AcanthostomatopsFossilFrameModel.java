package fossils.fossils.client.blockentity.model.acanthostomatops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcanthostomatopsFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart leftHead;
	private final ModelPart rightHead;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legspineL2;
	private final ModelPart legL6;
	private final ModelPart legL10;
	private final ModelPart legL11;
	private final ModelPart legspineL4;
	private final ModelPart legL12;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legspineL;
	private final ModelPart legL3;
	private final ModelPart legL7;
	private final ModelPart legL8;
	private final ModelPart legspineL3;
	private final ModelPart legL9;

	public AcanthostomatopsFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.head = this.bone.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftHead = this.upperjaw.getChild("leftHead");
		this.rightHead = this.upperjaw.getChild("rightHead");
		this.body = this.bone.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.tail = this.body2.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.legL4 = this.body2.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legspineL2 = this.legL5.getChild("legspineL2");
		this.legL6 = this.legspineL2.getChild("legL6");
		this.legL10 = this.body2.getChild("legL10");
		this.legL11 = this.legL10.getChild("legL11");
		this.legspineL4 = this.legL11.getChild("legspineL4");
		this.legL12 = this.legspineL4.getChild("legL12");
		this.legL = this.body.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legspineL = this.legL2.getChild("legspineL");
		this.legL3 = this.legspineL.getChild("legL3");
		this.legL7 = this.body.getChild("legL7");
		this.legL8 = this.legL7.getChild("legL8");
		this.legspineL3 = this.legL8.getChild("legspineL3");
		this.legL9 = this.legspineL3.getChild("legL9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-0.25F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6F, -1.25F, 10.0F, -0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 4).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.6F, -1.25F, 10.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, -1.5F, 0.3F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 8).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4F, -1.5F, 0.3F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -3.125F, -3.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.7F, -0.281F, 0.2879F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.65F, -1.35F, 0.2618F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -3.15F, 0.0405F, 0.0F, 0.0F));

		PartDefinition leftHead = upperjaw.addOrReplaceChild("leftHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.65F, -4.45F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightHead = upperjaw.addOrReplaceChild("rightHead", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.65F, -4.45F, 0.0F, 0.0F, -0.0873F));

		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 20).addBox(-0.51F, 0.1F, 0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.05F, 0.8F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5347F, 0.2903F, 0.0674F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0347F, -0.2F, 6.897F, -0.0709F, 0.1741F, -0.0123F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(13, 27).addBox(-0.3038F, 0.2193F, -0.1594F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2312F, 0.05F, 6.8172F, -0.1065F, 0.2604F, -0.0275F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(34, 11).addBox(-0.51F, 0.2458F, 0.5115F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1962F, -0.0066F, 2.9309F, 0.0041F, 0.1743F, 0.0083F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5193F, 0.1304F, -0.0559F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1494F, 2.9765F, -0.1582F, 0.217F, 0.0224F));

		PartDefinition legL4 = body2.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9153F, 1.275F, 5.478F, -0.0917F, 0.338F, -0.2951F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, 0.25F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition legspineL2 = legL5.addOrReplaceChild("legspineL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, 0.25F, 0.0F, -0.1516F, 0.3626F, -0.3928F));

		PartDefinition legL6 = legspineL2.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.1165F, 0.204F, 0.6982F));

		PartDefinition legL10 = body2.addOrReplaceChild("legL10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9847F, 1.275F, 5.478F, 0.1023F, 0.1754F, 0.3368F));

		PartDefinition legL11 = legL10.addOrReplaceChild("legL11", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, 0.25F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition legspineL4 = legL11.addOrReplaceChild("legspineL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.05F, 0.25F, 0.0F, -0.1182F, -0.3744F, 0.3001F));

		PartDefinition legL12 = legspineL4.addOrReplaceChild("legL12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0981F, -0.2133F, -0.6095F));

		PartDefinition legL = body.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.05F, 1.375F, 2.25F, 0.0462F, -0.2588F, -0.1349F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4205F, 0.25F, -0.0003F, 0.0F, 1.2217F, 0.0F));

		PartDefinition legspineL = legL2.addOrReplaceChild("legspineL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.016F, 0.25F, -1.0428F, 0.0348F, -0.2308F, -0.8185F));

		PartDefinition legL3 = legspineL.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.85F, 2.433F, 0.1F, 0.1027F, 0.0524F, 0.8724F));

		PartDefinition legL7 = body.addOrReplaceChild("legL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.05F, 1.375F, 2.25F, 0.0544F, 0.6074F, 0.1542F));

		PartDefinition legL8 = legL7.addOrReplaceChild("legL8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4205F, 0.25F, -0.0003F, 0.0F, -1.2217F, 0.0F));

		PartDefinition legspineL3 = legL8.addOrReplaceChild("legspineL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.016F, 0.25F, -1.0428F, -0.0524F, 0.2308F, 0.8185F));

		PartDefinition legL9 = legspineL3.addOrReplaceChild("legL9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.85F, 2.433F, 0.1F, 0.1027F, -0.0524F, -0.8724F));

		return LayerDefinition.create(meshdefinition, 50, 50);
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