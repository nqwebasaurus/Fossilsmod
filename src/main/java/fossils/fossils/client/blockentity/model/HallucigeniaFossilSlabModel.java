package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HallucigeniaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart spikeL1;
	private final ModelPart spikeL2;
	private final ModelPart spikeL3;
	private final ModelPart spikeL4;
	private final ModelPart spikeL5;
	private final ModelPart armL3;
	private final ModelPart legL1;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legR2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart armL1;
	private final ModelPart armL2;
	private final ModelPart tail;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart legL7;
	private final ModelPart spikeL6;
	private final ModelPart spikeL7;

	public HallucigeniaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.spikeL1 = this.body.getChild("spikeL1");
		this.spikeL2 = this.body.getChild("spikeL2");
		this.spikeL3 = this.body.getChild("spikeL3");
		this.spikeL4 = this.body.getChild("spikeL4");
		this.spikeL5 = this.body.getChild("spikeL5");
		this.armL3 = this.body.getChild("armL3");
		this.legL1 = this.body.getChild("legL1");
		this.legL2 = this.body.getChild("legL2");
		this.legL3 = this.body.getChild("legL3");
		this.legL4 = this.body.getChild("legL4");
		this.legR2 = this.body.getChild("legR2");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.armL1 = this.neck.getChild("armL1");
		this.armL2 = this.neck.getChild("armL2");
		this.tail = this.body.getChild("tail");
		this.legL5 = this.tail.getChild("legL5");
		this.legL6 = this.tail.getChild("legL6");
		this.legL7 = this.tail.getChild("legL7");
		this.spikeL6 = this.tail.getChild("spikeL6");
		this.spikeL7 = this.tail.getChild("spikeL7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, -2.0F, 0.0F, -0.2094F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-29.9F, -0.5F, -11.0F, 42.0F, 1.0F, 37.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0732F, -0.5F, 9.6822F, 0.0F, -1.3614F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -5.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -6.5F, 0.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 6.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition spikeL1 = body.addOrReplaceChild("spikeL1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.35F, -2.0F, 1.25F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = spikeL1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 21).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition spikeL2 = body.addOrReplaceChild("spikeL2", CubeListBuilder.create(), PartPose.offset(0.25F, -2.0F, 3.25F));

		PartDefinition cube_r4 = spikeL2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 22).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -4.031F, -0.5264F, 3.0107F, 0.0F, 3.1416F));

		PartDefinition spikeL3 = body.addOrReplaceChild("spikeL3", CubeListBuilder.create(), PartPose.offset(0.25F, -2.0F, 5.75F));

		PartDefinition cube_r5 = spikeL3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 22).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -4.018F, -0.175F, 3.098F, 0.0F, 3.1416F));

		PartDefinition spikeL4 = body.addOrReplaceChild("spikeL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -2.0F, 8.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = spikeL4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -3.9005F, 0.5178F, -3.0107F, 0.0F, -3.1416F));

		PartDefinition spikeL5 = body.addOrReplaceChild("spikeL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -2.0F, 10.75F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = spikeL5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 0).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -3.797F, 0.8539F, -2.9234F, 0.0F, -3.1416F));

		PartDefinition armL3 = body.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, -0.5F, 1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = armL3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 16).addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.12F, 3.5F, -0.75F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legL1 = body.addOrReplaceChild("legL1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, -0.5F, 3.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = legL1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legL2 = body.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, -0.5F, 5.75F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = legL2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 26).addBox(0.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legL3 = body.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, -0.5F, 8.25F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = legL3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 26).addBox(0.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legL4 = body.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offset(0.75F, -0.5F, 10.75F));

		PartDefinition cube_r12 = legL4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 25).addBox(0.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legR2 = body.addOrReplaceChild("legR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, -0.5F, 5.75F, 0.0F, 0.0F, 0.2618F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.25F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.52F, 1.1006F, -4.6495F, -0.5672F, 0.0F, 3.1416F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.281F, -2.9213F, -0.3054F, 0.0F, -3.1416F));

		PartDefinition cube_r15 = neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0F, -1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -5.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 9).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.5032F, -0.0984F, -0.5672F, 0.0F, 3.1416F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 16).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7886F, -1.6509F, -0.5672F, 0.0F, 3.1416F));

		PartDefinition armL1 = neck.addOrReplaceChild("armL1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.45F, 0.5F, -2.25F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r18 = armL1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -0.75F, 0.0F, 3.1416F, 0.0F));

		PartDefinition armL2 = neck.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.45F, 0.5F, -0.75F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r19 = armL2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(14, 0).addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -0.75F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.75F, 13.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(5, 9).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.61F, 1.0F, 6.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.75F, 3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legL5 = tail.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 0.75F, 1.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r22 = legL5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(25, 16).addBox(0.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legL6 = tail.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 1.25F, 4.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r23 = legL6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legL7 = tail.addOrReplaceChild("legL7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 1.5F, 6.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r24 = legL7.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(3, 27).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition spikeL6 = tail.addOrReplaceChild("spikeL6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -0.25F, 0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r25 = spikeL6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 16).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -3.8524F, 0.687F, -2.9671F, 0.0F, 3.1416F));

		PartDefinition spikeL7 = tail.addOrReplaceChild("spikeL7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -0.25F, 3.75F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = spikeL7.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 16).addBox(0.0F, -4.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -3.6645F, 1.1797F, -2.8362F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 160, 100);
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