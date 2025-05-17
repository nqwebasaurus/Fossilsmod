package fossils.fossils.client.blockentity.model.crassigyrinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CrassigyrinusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart upperjaw;
	private final ModelPart lowerjaw;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart tail4;
	private final ModelPart tail;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart tail7;

	public CrassigyrinusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.chest = this.body.getChild("chest");
		this.armL3 = this.chest.getChild("armL3");
		this.armL4 = this.armL3.getChild("armL4");
		this.armL = this.chest.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.upperjaw = this.head.getChild("upperjaw");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.legL = this.body3.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body3.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.tail4 = this.body3.getChild("tail4");
		this.tail = this.tail4.getChild("tail");
		this.tail5 = this.tail.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.tail6 = this.tail2.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.tail7 = this.tail3.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.2185F, 0.0987F, -0.1226F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 19).addBox(-0.5F, 0.2F, 7.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 12).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.95F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0333F, -0.3232F, -6.892F, -0.0383F, -0.2525F, -0.0856F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 36).addBox(-0.5F, 0.6902F, -0.5208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 31).addBox(-0.5F, 0.6902F, -6.2208F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0333F, 3.3948F, -5.3001F, 1.5708F, -0.0087F, -1.5708F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(3, 34).addBox(-0.5F, -6.1098F, -4.2208F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.342F, 1.5621F, 0.0F, 0.0F));

		PartDefinition armL3 = chest.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.088F, 3.3662F, -5.7077F, -0.3491F, -0.6545F, 0.0F));

		PartDefinition armL4 = armL3.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition armL = chest.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1546F, 3.3662F, -5.7077F, -0.3491F, 0.6545F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0333F, 0.0232F, -5.958F, -0.3249F, -0.295F, -0.0667F));

		PartDefinition cube_r5 = neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 49).addBox(-0.5F, 1.4306F, -8.2332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, 6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3496F, -2.766F, 0.0041F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 1.9F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0063F, 3.8139F, 0.8814F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2958F, 0.9311F, 0.1103F, -0.1444F, -0.031F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, 0.4F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1499F, 10.0029F, 0.0144F, -0.349F, -0.0049F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9379F, 1.6471F, -1.5708F, -0.0524F, -1.5708F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(2, 41).addBox(-0.5F, -1.3F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition legL = body3.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8065F, 3.2F, 1.4809F, -0.1437F, 0.0995F, 0.093F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0904F, 0.1086F, 2.8889F, 0.0428F, -0.1746F, 0.0039F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.25F, 2.25F, 0.0F, -0.2182F, 0.0F));

		PartDefinition legL4 = body3.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8065F, 3.2F, 1.4809F, -0.162F, -0.4877F, -0.0309F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0904F, 0.1086F, 2.8889F, 0.0422F, 0.0438F, -0.0095F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -0.25F, 2.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition tail4 = body3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2099F, 3.9076F, -0.0283F, -0.3926F, 0.0108F));

		PartDefinition cube_r10 = tail4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 10).addBox(-0.5F, 0.7F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 6).addBox(-0.5F, 0.7F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail = tail4.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3009F, 5.0803F, 0.2122F, -0.3915F, -0.0311F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0949F, 5.9428F, 0.0472F, -0.3923F, -0.0181F));

		PartDefinition cube_r12 = tail5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(37, 26).addBox(-0.5F, 0.2F, 11.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 22).addBox(-0.5F, 0.2F, 5.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1448F, -5.9428F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, 0.25F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 35).addBox(-0.5F, 0.25F, 5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.2135F, 6.0571F, -0.0383F, 0.3035F, -0.178F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.351F, -0.0653F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.101F, 6.0653F, -0.2591F, 0.5172F, -0.3562F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0749F, 6.8187F, -0.1443F, 0.1905F, -0.2426F));

		PartDefinition cube_r13 = tail3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 35).addBox(-0.5F, 0.1F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 30).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 6.0F, -0.1509F, 0.5187F, -0.0752F));

		PartDefinition cube_r14 = tail7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.1F, 6.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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