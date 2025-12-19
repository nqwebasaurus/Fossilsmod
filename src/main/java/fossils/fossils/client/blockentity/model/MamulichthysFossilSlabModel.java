package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MamulichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart tail;
	private final ModelPart backLeftFin;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart head;
	private final ModelPart frontLeftFin;
	private final ModelPart eyes;
	private final ModelPart jaw;

	public MamulichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.tail = this.main.getChild("tail");
		this.backLeftFin = this.tail.getChild("backLeftFin");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.head = this.main.getChild("head");
		this.frontLeftFin = this.head.getChild("frontLeftFin");
		this.eyes = this.head.getChild("eyes");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(36, 38).addBox(-2.5307F, -1.5571F, -12.9737F, 8.0F, 3.0F, 15.0F, new CubeDeformation(0.006F)), PartPose.offset(-1.3693F, 22.5571F, -2.0263F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 0).addBox(0.0495F, -3.0F, 0.0191F, 16.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3693F, 1.4429F, -11.9737F, 0.0F, -1.1345F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 53).addBox(-5.5F, -2.8F, -0.9F, 6.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6307F, 1.4429F, -11.9737F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 32).addBox(-12.1141F, -3.0F, 0.0328F, 8.0F, 3.0F, 17.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(13.0693F, 1.4429F, 4.3263F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 13).addBox(0.1F, -3.0F, 0.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.6307F, 1.4429F, 2.0263F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.098F, -2.0F, -0.1217F, 8.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2307F, 1.4429F, -9.6737F, 0.0F, 0.1571F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -9.25F, -0.25F, 3.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(34, 40).addBox(-1.5F, -10.95F, -1.25F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(6.3693F, -0.3571F, -3.0737F, 0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -10.95F, 2.75F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(21, 12).addBox(1.1F, -3.925F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -10.95F, -0.75F, -0.9163F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.8431F, -0.9133F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -6.9069F, 6.6632F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 15).addBox(-1.5F, -1.975F, 0.375F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 4.6569F, -0.9133F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 15).addBox(0.3F, -2.5819F, -0.1234F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0547F, 1.4028F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 32).addBox(-1.5F, -0.047F, -0.1111F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4431F, -0.4883F, -0.2531F, 0.0F, 0.0F));

		PartDefinition backLeftFin = tail.addOrReplaceChild("backLeftFin", CubeListBuilder.create().texOffs(22, 23).addBox(-0.5F, -0.0005F, -0.5326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 3.3569F, 0.1867F, 0.7539F, 0.0F, 0.0F));

		PartDefinition cube_r11 = backLeftFin.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 12).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3087F, 0.9072F, 2.8362F, 0.0F, -3.1416F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(46, 57).addBox(-1.6F, -1.4685F, -0.5919F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5254F, 4.1286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.3842F, 1.7756F, -0.48F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 66).addBox(-1.5F, -0.8F, -1.95F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5315F, 1.4081F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -0.1F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9685F, 1.4081F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, -0.1498F, 3.3836F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -2.0F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8145F, 4.3505F, -0.4014F, 0.0F, -3.1416F));

		PartDefinition cube_r16 = tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 37).addBox(-0.6F, -0.4372F, -0.116F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.1714F, 2.9817F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 67).addBox(-1.6F, -0.5F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7187F, 0.0245F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 43).addBox(-1.1F, -1.025F, -1.95F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0687F, 1.1282F, 0.5978F, 0.0F, 0.0F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.4F, -7.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 17).addBox(-1.65F, 0.0286F, -1.2583F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(0.65F, 0.0286F, -1.2583F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 0).addBox(-2.0F, 0.0036F, -1.0083F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -7.925F, 1.5752F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(68, 57).addBox(-0.5F, 0.0114F, -2.0098F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.5F, 0.025F, -7.0F, 1.0865F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 53).addBox(-2.5F, 0.0F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.001F))
				.texOffs(57, 61).addBox(-2.5F, 0.0F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.95F, -1.25F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(31, 57).addBox(-3.0F, -2.5F, -4.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.25F, -0.25F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 43).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.75F, -0.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition frontLeftFin = head.addOrReplaceChild("frontLeftFin", CubeListBuilder.create().texOffs(41, 65).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 4.35F, -0.75F, 0.0F, 0.9599F, 1.5708F));

		PartDefinition cube_r24 = frontLeftFin.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(12, 23).addBox(-1.0F, -0.1F, -2.8F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 2.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(12, 32).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, 0.925F, -6.3F, 0.5236F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(51, 32).addBox(-1.5F, 0.0F, -3.65F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(21, 7).addBox(1.05F, -0.25F, -3.15F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-1.05F, -0.25F, -3.15F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.8036F, -4.2582F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r25 = jaw.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(66, 32).addBox(-0.5F, -0.9888F, -2.9912F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0F, 1.7596F, 0.0101F, -0.2662F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 75);
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