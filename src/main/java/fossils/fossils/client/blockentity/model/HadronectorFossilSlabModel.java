package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HadronectorFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart eye;
	private final ModelPart frontLeftFin;
	private final ModelPart bone;
	private final ModelPart backLeftFin;
	private final ModelPart tail;
	private final ModelPart tail2;

	public HadronectorFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.head = this.main.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.eye = this.head.getChild("eye");
		this.frontLeftFin = this.main.getChild("frontLeftFin");
		this.bone = this.main.getChild("bone");
		this.backLeftFin = this.main.getChild("backLeftFin");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(75, 48).addBox(-24.0F, -2.0F, -27.0F, 24.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-32.0F, -2.0F, 0.0F, 32.0F, 2.0F, 45.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -27.0F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, -2.0F, 0.0F, 16.0F, 2.0F, 42.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-24.0F, 0.0F, -5.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5F, -1.95F, -12.75F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -10.9541F, -2.9954F, -2.5307F, 0.0F, 3.1416F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 7).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -9.1689F, -3.41F, -2.8362F, 0.0F, 3.1416F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 20).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -9.2546F, -7.0319F, 2.7925F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 27).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.3964F, -3.3907F, 3.0761F, 0.0F, 3.1416F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 30).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -2.6082F, -7.2443F, -2.9671F, 0.0F, 3.1416F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.5F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -6.0F, -5.25F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.5F, -9.5F, -9.25F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 33).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 2.4054F, -3.1251F, 2.5744F, 0.0F, 3.1416F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 2.7927F, -4.3445F, 2.138F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.1197F, -2.9433F, -2.9583F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 6).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5263F, -0.4789F, -3.002F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 3.5397F, -4.0771F, -3.0543F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 21).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 4.6885F, -0.6421F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 4.7257F, -2.3813F, -2.5351F, 0.0F, -3.1416F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 30).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 6.0946F, -1.2337F, -2.8362F, 0.0F, 3.1416F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.9226F, -0.8965F, 2.7925F, 0.0F, -3.1416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(-0.6F, 5.2098F, -2.5119F));

		PartDefinition cube_r18 = jaw.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 15).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.2623F, -1.198F, -3.0107F, 0.0F, -3.1416F));

		PartDefinition cube_r19 = jaw.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 18).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.0543F, -1.2704F, 0.0F, 3.1416F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6625F, 2.575F, -2.45F, 0.0154F, 0.0F, 0.0F));

		PartDefinition cube_r20 = eye.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(33, 35).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5625F, 0.0F, 0.0F, 2.6616F, 0.0F, -3.1416F));

		PartDefinition frontLeftFin = main.addOrReplaceChild("frontLeftFin", CubeListBuilder.create(), PartPose.offset(0.825F, -5.25F, -7.675F));

		PartDefinition cube_r21 = frontLeftFin.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(14, 31).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.5F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r22 = frontLeftFin.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 12).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone = main.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition backLeftFin = main.addOrReplaceChild("backLeftFin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -2.6308F, -5.7299F, -0.3487F, 0.0F, 0.0F));

		PartDefinition cube_r23 = backLeftFin.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(21, 31).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.25F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r24 = backLeftFin.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(33, 24).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -7.0F, -1.25F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r26 = tail.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.8952F, 2.4755F, 0.7418F, 0.0F, 3.1416F));

		PartDefinition cube_r27 = tail.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 4).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 4.4368F, 0.4039F, 3.0761F, 0.0F, 3.1416F));

		PartDefinition cube_r28 = tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -3.2724F, 2.4518F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition cube_r29 = tail.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -2.2117F, 0.6841F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 1.025F, 3.7656F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.025F, 8.7594F, -2.3998F, 0.0F, -3.1416F));

		PartDefinition cube_r31 = tail2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.025F, 6.7344F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r32 = tail2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -2.0F, -3.5F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.425F, 4.2344F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r33 = tail2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 9).addBox(0.0F, -2.0F, -3.5F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -2.275F, 4.2344F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r34 = tail2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(10, 23).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.0224F, 2.5343F, -2.6834F, 0.0F, -3.1416F));

		PartDefinition cube_r35 = tail2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(20, 16).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9724F, 2.5343F, 2.6834F, 0.0F, 3.1416F));

		PartDefinition cube_r36 = tail2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(21, 24).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.025F, 2.7344F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 100);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}