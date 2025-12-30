package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PalaeoniscumFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Palaeoniscum;
	private final ModelPart Cephalon;
	private final ModelPart Jaw;
	private final ModelPart Body1;
	private final ModelPart PectoralL;
	private final ModelPart Body2;
	private final ModelPart AnalL;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart Body5;

	public PalaeoniscumFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Palaeoniscum = this.fossil.getChild("Palaeoniscum");
		this.Cephalon = this.Palaeoniscum.getChild("Cephalon");
		this.Jaw = this.Cephalon.getChild("Jaw");
		this.Body1 = this.Palaeoniscum.getChild("Body1");
		this.PectoralL = this.Body1.getChild("PectoralL");
		this.Body2 = this.Body1.getChild("Body2");
		this.AnalL = this.Body2.getChild("AnalL");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.Body5 = this.Body4.getChild("Body5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 58).addBox(-34.0F, -2.0F, -25.0F, 35.0F, 2.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 24.0F, -5.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-68.7879F, -2.0F, -0.0395F, 69.0F, 2.0F, 26.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(25.0F, 0.0F, 40.0F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -2.0F, -26.0F, 66.0F, 2.0F, 26.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-34.0F, 0.0F, 1.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition Palaeoniscum = fossil.addOrReplaceChild("Palaeoniscum", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, -4.0F, -1.2217F, 0.0F, -1.5708F));

		PartDefinition Cephalon = Palaeoniscum.addOrReplaceChild("Cephalon", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, -12.0F));

		PartDefinition cube_r3 = Cephalon.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, -1.1767F, -14.5933F, 2.6965F, 0.0F, -3.1416F));

		PartDefinition cube_r4 = Cephalon.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, -5.2563F, -1.7457F, 2.9845F, 0.0F, -3.1416F));

		PartDefinition cube_r5 = Cephalon.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 108).addBox(0.0F, -5.0F, -3.0F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0F, -2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r6 = Cephalon.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 29).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 4.3662F, -2.4196F, -3.0369F, 0.0F, 3.1416F));

		PartDefinition cube_r7 = Cephalon.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.0F, -5.0F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.1433F, -8.4374F, 2.9758F, 0.0F, -3.1416F));

		PartDefinition cube_r8 = Cephalon.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 0).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.142F, -12.5123F, -2.9583F, 0.0F, 3.1416F));

		PartDefinition cube_r9 = Cephalon.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(62, 87).addBox(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, -0.5F, -12.9F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r10 = Cephalon.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(91, 108).addBox(0.0F, -3.0F, -3.5F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, -1.0F, -6.9F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Jaw = Cephalon.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Jaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -1.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r12 = Jaw.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 87).addBox(0.0F, -0.5F, -5.5F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 1.613F, -5.4328F, -2.9496F, 0.0F, 3.1416F));

		PartDefinition cube_r13 = Jaw.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 1.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r14 = Jaw.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 87).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.5F, -8.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body1 = Palaeoniscum.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -12.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(114, 98).addBox(0.0F, -1.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 4.8785F, 13.463F, 3.1067F, 0.0F, -3.1416F));

		PartDefinition cube_r16 = Body1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -1.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 4.819F, 5.0345F, -3.098F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = Body1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 87).addBox(0.0F, -1.5F, -8.5F, 0.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -5.8481F, 8.6333F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition cube_r18 = Body1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 87).addBox(0.0F, -5.5F, -8.0F, 0.0F, 11.0F, 16.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.0F, -0.5F, 8.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition PectoralL = Body1.addOrReplaceChild("PectoralL", CubeListBuilder.create().texOffs(23, 87).addBox(0.0F, 0.0F, -3.0F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 3.0F, -0.2F, 0.0F, -0.825F, 1.5708F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 17.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -3.5F, -4.5F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -9.5F, 5.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 92).addBox(0.0F, -1.5F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 3.8418F, 2.4232F, 3.002F, 0.0F, 3.1416F));

		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(106, 114).addBox(0.0F, -1.5F, -3.5F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -6.259F, 3.3257F, -3.0543F, 0.0F, -3.1416F));

		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -5.0F, -4.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition AnalL = Body2.addOrReplaceChild("AnalL", CubeListBuilder.create().texOffs(23, 95).addBox(0.0F, 0.0F, -1.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 4.0F, 1.0F, 0.0F, -0.6109F, 1.5708F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(9, 69).addBox(0.0F, -3.0F, -4.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 6.0538F, 5.9625F, 2.8274F, 0.0F, 3.1416F));

		PartDefinition cube_r24 = Body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(97, 58).addBox(0.0F, -1.5F, -4.5F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 2.3338F, 3.1253F, 2.9147F, 0.0F, 3.1416F));

		PartDefinition cube_r25 = Body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(97, 71).addBox(0.0F, -2.0F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -4.8358F, 3.5919F, -2.9671F, 0.0F, 3.1416F));

		PartDefinition cube_r26 = Body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(96, 87).addBox(0.0F, -3.5F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, -1.5F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Body4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 115).addBox(0.0F, -1.5F, -3.5F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 1.9563F, 3.0452F, 3.002F, 0.0F, -3.1416F));

		PartDefinition cube_r28 = Body4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(109, 64).addBox(0.0F, -2.0F, -3.5F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -2.3781F, 4.0357F, -2.9496F, 0.0F, 3.1416F));

		PartDefinition cube_r29 = Body4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(105, 100).addBox(0.0F, -2.5F, -4.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -0.5F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Body5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -8.5F, -11.0F, 0.0F, 17.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 0.5F, 12.8F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r31 = Body5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(11, 0).addBox(0.0F, -1.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -5.3799F, 14.186F, 2.8972F, 0.0F, 3.1416F));

		PartDefinition cube_r32 = Body5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(113, 87).addBox(0.0F, -1.5F, -3.5F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -2.8539F, 7.8051F, 2.7751F, 0.0F, -3.1416F));

		PartDefinition cube_r33 = Body5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(13, 17).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.9255F, 1.8337F, 3.002F, 0.0F, 3.1416F));

		PartDefinition cube_r34 = Body5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(9, 58).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -3.084F, 2.4469F, -3.0543F, 0.0F, -3.1416F));

		PartDefinition cube_r35 = Body5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(13, 40).addBox(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -0.5F, 2.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 192, 130);
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