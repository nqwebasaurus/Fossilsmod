package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GroenlandaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Groenlandaspis;
	private final ModelPart head;
	private final ModelPart mouth;
	private final ModelPart head3;
	private final ModelPart mouth3;
	private final ModelPart head2;
	private final ModelPart mouth2;
	private final ModelPart head4;
	private final ModelPart mouth4;

	public GroenlandaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Groenlandaspis = this.fossil.getChild("Groenlandaspis");
		this.head = this.Groenlandaspis.getChild("head");
		this.mouth = this.head.getChild("mouth");
		this.head3 = this.Groenlandaspis.getChild("head3");
		this.mouth3 = this.head3.getChild("mouth3");
		this.head2 = this.Groenlandaspis.getChild("head2");
		this.mouth2 = this.head2.getChild("mouth2");
		this.head4 = this.Groenlandaspis.getChild("head4");
		this.mouth4 = this.head4.getChild("mouth4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -2.0F, -23.0F, 23.0F, 2.0F, 27.0F, new CubeDeformation(0.003F))
				.texOffs(33, 33).addBox(-2.1838F, -3.0F, -22.2654F, 10.0F, 2.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 46).addBox(-44.0F, -2.0F, 0.0F, 44.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -23.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 21).addBox(-12.2638F, -4.0F, 7.5327F, 12.0F, 2.0F, 22.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 0).addBox(-23.2638F, -2.0F, -0.4673F, 23.0F, 2.0F, 43.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(21.0F, 0.0F, 4.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 31).addBox(-3.5F, 0.0F, 0.0F, 23.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-12.3021F, -3.0F, 0.9224F, 0.0F, -0.2182F, 0.0F));

		PartDefinition Groenlandaspis = fossil.addOrReplaceChild("Groenlandaspis", CubeListBuilder.create(), PartPose.offset(9.0F, 0.0F, -4.0F));

		PartDefinition head = Groenlandaspis.addOrReplaceChild("head", CubeListBuilder.create().texOffs(19, 17).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-2.5F, -5.0F, -6.5F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-3.5F, -6.75F, -1.25F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-1.0F, -7.25F, -0.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.2F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 33).addBox(-0.5F, -0.25F, -3.25F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.25F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 26).addBox(-2.25F, -0.3F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -2.5F, 0.25F, -0.0873F, -0.6109F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 28).addBox(-0.75F, -0.3F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.5F, 0.25F, -0.0873F, 0.6109F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 6).addBox(-0.75F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -2.75F, -1.75F, -0.0873F, -0.8727F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 21).addBox(-3.25F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.75F, -1.75F, -0.0873F, 0.8727F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.15F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3374F, -4.7561F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 35).addBox(-2.0F, -0.05F, -1.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -7.25F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.1221F, -0.7795F, 5.0F, 3.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -5.0F, -7.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5874F, -6.2561F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r12 = mouth.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(31, 38).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5093F, -0.7517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head3 = Groenlandaspis.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(0, 11).addBox(-3.5F, -5.25F, -1.25F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-1.0F, -5.75F, -0.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, 0.1F, 18.0F, 0.0291F, 1.4329F, -0.3228F));

		PartDefinition cube_r13 = head3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(9, 33).addBox(-0.5F, -0.25F, -3.25F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.75F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(14, 26).addBox(-2.25F, -0.3F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -2.5F, 0.25F, -0.0873F, -0.6109F, 0.0F));

		PartDefinition cube_r15 = head3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 6).addBox(-0.75F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -2.75F, -1.75F, -0.0873F, -0.8727F, 0.0F));

		PartDefinition mouth3 = head3.addOrReplaceChild("mouth3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5874F, -6.2561F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head2 = Groenlandaspis.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(19, 17).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(-2.5F, -5.0F, -6.5F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-3.5F, -6.75F, -1.25F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-1.0F, -7.25F, -0.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 0.45F, 0.0F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r16 = head2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 33).addBox(-0.5F, -0.25F, -3.25F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.25F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(14, 26).addBox(-2.25F, -0.3F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -2.5F, 0.25F, -0.0873F, -0.6109F, 0.0F));

		PartDefinition cube_r18 = head2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 28).addBox(-0.75F, -0.3F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.5F, 0.25F, -0.0873F, 0.6109F, 0.0F));

		PartDefinition cube_r19 = head2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(20, 6).addBox(-0.75F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -2.75F, -1.75F, -0.0873F, -0.8727F, 0.0F));

		PartDefinition cube_r20 = head2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 21).addBox(-3.25F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.75F, -1.75F, -0.0873F, 0.8727F, 0.0F));

		PartDefinition cube_r21 = head2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.15F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3374F, -4.7561F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 35).addBox(-2.0F, -0.05F, -1.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -7.25F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.1221F, -0.7795F, 5.0F, 3.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -5.0F, -7.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition mouth2 = head2.addOrReplaceChild("mouth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5874F, -6.2561F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r24 = mouth2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(31, 38).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5093F, -0.7517F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head4 = Groenlandaspis.addOrReplaceChild("head4", CubeListBuilder.create().texOffs(0, 11).addBox(-3.5F, -6.75F, -1.25F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-1.0F, -7.25F, -0.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.8F, 0.45F, 14.8F, 2.9754F, 0.175F, -2.8181F));

		PartDefinition cube_r25 = head4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 33).addBox(-0.5F, -0.25F, -3.25F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.25F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(26, 28).addBox(-0.75F, -0.3F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.5F, 0.25F, -0.0873F, 0.6109F, 0.0F));

		PartDefinition cube_r27 = head4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 21).addBox(-3.25F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.75F, -1.75F, -0.0873F, 0.8727F, 0.0F));

		PartDefinition cube_r28 = head4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.15F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3374F, -4.7561F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 35).addBox(-2.0F, -6.2979F, -2.6388F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.5F, 1.1432F, 0.0F, 0.2618F));

		PartDefinition cube_r30 = head4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(18, 0).addBox(-2.5F, -3.4F, -4.9F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 17).addBox(-3.0F, -4.4F, -3.4F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.5F, 0.2269F, 0.0F, 0.2618F));

		PartDefinition cube_r31 = head4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.9524F, -4.9495F, 5.0F, 3.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.5F, 0.5236F, 0.0F, 0.2618F));

		PartDefinition mouth4 = head4.addOrReplaceChild("mouth4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5874F, -6.2561F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r32 = mouth4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 38).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5093F, -0.7517F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 192, 80);
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