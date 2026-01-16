package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AllenypterusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Allenypterus;
	private final ModelPart Cephalon;
	private final ModelPart Jaw;
	private final ModelPart Body1;
	private final ModelPart PectoralL;
	private final ModelPart PelvicL;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;

	public AllenypterusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Allenypterus = this.fossil.getChild("Allenypterus");
		this.Cephalon = this.Allenypterus.getChild("Cephalon");
		this.Jaw = this.Cephalon.getChild("Jaw");
		this.Body1 = this.Allenypterus.getChild("Body1");
		this.PectoralL = this.Body1.getChild("PectoralL");
		this.PelvicL = this.Body1.getChild("PelvicL");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(63, 41).addBox(-15.0F, -2.0F, -18.0F, 26.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 0).addBox(-5.0F, -2.0F, -18.0F, 16.0F, 2.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 41).addBox(-0.0685F, -2.0F, -0.2104F, 15.0F, 2.0F, 32.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-15.0F, 0.0F, -10.0F, 0.0F, 0.3229F, 0.0F));

		PartDefinition Allenypterus = fossil.addOrReplaceChild("Allenypterus", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -2.2F, -4.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Cephalon = Allenypterus.addOrReplaceChild("Cephalon", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3F, -5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Cephalon.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 41).addBox(-0.2F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8892F, -1.2381F, -3.1241F, 0.0F, 3.1416F));

		PartDefinition cube_r3 = Cephalon.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 31).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.443F, -1.277F, 0.8203F, 0.0F, 3.1416F));

		PartDefinition cube_r4 = Cephalon.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 12).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.361F, -2.8881F, -2.7925F, 0.0F, 3.1416F));

		PartDefinition cube_r5 = Cephalon.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(29, 21).addBox(0.0F, -3.0F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.1F, -1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r6 = Cephalon.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 15).addBox(0.0F, -0.4F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2686F, -1.6618F, -2.9583F, 0.0F, -3.1416F));

		PartDefinition Jaw = Cephalon.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.3F, -2.9F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Jaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 33).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0864F, -0.6228F, -2.8798F, 0.0F, -3.1416F));

		PartDefinition cube_r8 = Jaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.289F, -1.1719F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition Body1 = Allenypterus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -5.2F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 0).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2879F, 9.7796F, -0.4276F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 60).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -8.2847F, 4.8688F, -2.6529F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 56).addBox(0.1F, -3.0F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.838F, 0.7839F, -2.8449F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 24).addBox(0.3F, -4.0F, -2.5F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4F, 2.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1815F, 3.1295F, -3.0718F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = Body1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(25, 57).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.8093F, 0.9459F, 2.6529F, 0.0F, 3.1416F));

		PartDefinition PectoralL = Body1.addOrReplaceChild("PectoralL", CubeListBuilder.create(), PartPose.offset(0.7F, -1.75F, 1.75F));

		PartDefinition cube_r15 = PectoralL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 25).addBox(0.3F, -2.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition PelvicL = Body1.addOrReplaceChild("PelvicL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 2.8F, 3.1F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r16 = PelvicL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(27, 41).addBox(0.3F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 4.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -3.5F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9951F, 4.1801F, -2.7227F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(11, 16).addBox(0.3F, -3.0F, -4.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.8046F, 2.5989F, -2.7576F, 0.0F, 3.1416F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 0).addBox(0.3F, -3.5F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1F, 3.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 6.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(21, 47).addBox(0.0F, -2.0F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1F, 2.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r21 = Body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 52).addBox(0.2F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.1406F, 2.8601F, -2.7751F, 0.0F, 3.1416F));

		PartDefinition cube_r22 = Body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 15).addBox(0.3F, -1.5F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.6802F, 2.0252F, -2.7751F, 0.0F, 3.1416F));

		PartDefinition cube_r23 = Body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 41).addBox(0.1F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, 2.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offset(0.1F, 0.4F, 4.8F));

		PartDefinition cube_r24 = Body4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -7.0F, -4.5F, 0.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.3F, 4.7F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r25 = Body4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0117F, 5.067F, 2.7053F, 0.0F, 3.1416F));

		PartDefinition cube_r26 = Body4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 0).addBox(0.1F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.5856F, 1.528F, 2.7227F, 0.0F, 3.1416F));

		PartDefinition cube_r27 = Body4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5932F, 2.84F, -2.9147F, 0.0F, -3.1416F));

		PartDefinition cube_r28 = Body4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(8, 41).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6434F, 4.1517F, -2.9147F, 0.0F, -3.1416F));

		PartDefinition cube_r29 = Body4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 57).addBox(0.1F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3439F, 1.0037F, -2.9147F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 144, 80);
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