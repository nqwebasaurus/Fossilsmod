package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SenekichthysFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart leftpectoral;
	private final ModelPart jaw;
	private final ModelPart leftpelvic;
	private final ModelPart body2;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart head2;
	private final ModelPart eye2;
	private final ModelPart leftpectoral2;
	private final ModelPart jaw2;
	private final ModelPart leftpelvic2;
	private final ModelPart body3;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart head3;
	private final ModelPart eye3;
	private final ModelPart leftpectoral3;
	private final ModelPart jaw3;
	private final ModelPart leftpelvic3;

	public SenekichthysFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body = this.root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.head = this.body.getChild("head");
		this.eye = this.head.getChild("eye");
		this.leftpectoral = this.head.getChild("leftpectoral");
		this.jaw = this.head.getChild("jaw");
		this.leftpelvic = this.body.getChild("leftpelvic");
		this.body2 = this.root.getChild("body2");
		this.tail4 = this.body2.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.head2 = this.body2.getChild("head2");
		this.eye2 = this.head2.getChild("eye2");
		this.leftpectoral2 = this.head2.getChild("leftpectoral2");
		this.jaw2 = this.head2.getChild("jaw2");
		this.leftpelvic2 = this.body2.getChild("leftpelvic2");
		this.body3 = this.root.getChild("body3");
		this.tail7 = this.body3.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.head3 = this.body3.getChild("head3");
		this.eye3 = this.head3.getChild("eye3");
		this.leftpectoral3 = this.head3.getChild("leftpectoral3");
		this.jaw3 = this.head3.getChild("jaw3");
		this.leftpelvic3 = this.body3.getChild("leftpelvic3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, -2.0F, 0.0F, 30.0F, 2.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -26.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -2.0F, 0.0F, 24.0F, 2.0F, 47.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -26.0F, 0.0F, 0.4276F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 50).addBox(-32.0F, -2.0F, 0.0F, 32.0F, 2.0F, 26.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(19.0F, 0.0F, -7.0F, 0.0F, 0.2531F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(7.5F, 0.0F, 2.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -1.9F, 0.0F, -0.6109F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.1843F, -1.1495F, 0.1745F, 0.0F, -3.1416F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 12).addBox(0.1F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.25F, -1.45F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4616F, 0.2825F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 12).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5616F, 1.5175F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 9).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -2.8753F, 2.5836F, -2.5307F, 0.0F, -3.1416F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 15).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.5616F, 1.4825F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.0464F, 2.8348F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 18).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -0.0349F, 1.2077F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 10).addBox(0.0F, -2.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 3.0028F, 2.1972F, 2.5656F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = tail2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.5147F, 0.6204F, -0.5236F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 21).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.4799F, 1.1719F, 0.1745F, 0.0F, -3.1416F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.463F, 2.5029F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -0.5F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.425F, 2.0528F, 2.9593F, 0.48F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = tail3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -4.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1612F, 4.2871F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r15 = tail3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 1).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.25F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.4F, -2.0F, -3.9F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 21).addBox(0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0436F, 0.5363F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(15, 24).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 2.3094F, -1.1176F, 0.48F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 16).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.5795F, -2.3855F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 18).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.5358F, -2.4334F, -0.685F, 0.0F, 3.1416F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9723F, 0.3198F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(0.525F, 2.025F, -1.4F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r21 = eye.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition leftpectoral = head.addOrReplaceChild("leftpectoral", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 3.5795F, 0.4895F, -0.8306F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftpectoral.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(23, 3).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.825F, -0.7F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r23 = jaw.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition leftpelvic = body.addOrReplaceChild("leftpelvic", CubeListBuilder.create(), PartPose.offsetAndRotation(0.55F, 0.7827F, 0.2011F, -1.0549F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftpelvic.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 23).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1077F, 0.7989F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body2 = root.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.1F, -2.0F, -3.8F, 0.5236F, 0.0F, -1.5708F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.1843F, -1.1495F, 0.1745F, 0.0F, -3.1416F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 12).addBox(0.1F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.25F, -1.45F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tail4 = body2.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4616F, 0.2825F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(9, 12).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5616F, 1.5175F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r28 = tail4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(22, 9).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -2.8753F, 2.5836F, -2.5307F, 0.0F, -3.1416F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(13, 15).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.5616F, 1.4825F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.0464F, 2.8348F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(6, 18).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -0.0349F, 1.2077F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r31 = tail5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(17, 10).addBox(0.0F, -2.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 3.0028F, 2.1972F, 2.5656F, 0.0F, -3.1416F));

		PartDefinition cube_r32 = tail5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.5147F, 0.6204F, -0.5236F, 0.0F, -3.1416F));

		PartDefinition cube_r33 = tail5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 21).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.4799F, 1.1719F, 0.1745F, 0.0F, -3.1416F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.463F, 2.5029F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -0.5F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.425F, 2.0528F, 2.9593F, 0.48F, 0.0F, -3.1416F));

		PartDefinition cube_r35 = tail6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -4.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1612F, 4.2871F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r36 = tail6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(19, 1).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.25F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition head2 = body2.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -2.4F, -3.9F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(10, 21).addBox(0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0436F, 0.5363F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r38 = head2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 24).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 2.3094F, -1.1176F, 0.48F, 0.0F, -3.1416F));

		PartDefinition cube_r39 = head2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(21, 16).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.5795F, -2.3855F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r40 = head2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(17, 18).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.5358F, -2.4334F, -0.685F, 0.0F, 3.1416F));

		PartDefinition cube_r41 = head2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9723F, 0.3198F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition eye2 = head2.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.525F, 2.025F, -1.4F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r42 = eye2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition leftpectoral2 = head2.addOrReplaceChild("leftpectoral2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 3.5795F, 0.4895F, -0.8306F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftpectoral2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(23, 3).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.825F, -0.7F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r44 = jaw2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.5F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition leftpelvic2 = body2.addOrReplaceChild("leftpelvic2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.55F, 0.7827F, 0.2011F, -1.0549F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftpelvic2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(5, 23).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1077F, 0.7989F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body3 = root.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5F, -2.0F, 23.55F, 1.5446F, 0.0F, -1.5708F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.1F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.01F))
				.texOffs(0, 0).addBox(0.0F, 0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.1843F, -1.1495F, 0.1745F, 0.0F, -3.1416F));

		PartDefinition tail7 = body3.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.4616F, 0.2825F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail7.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(10, 13).addBox(0.0F, -0.6F, -7.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 13).addBox(0.1F, -0.6F, -3.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 13).addBox(0.1F, -0.6F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0616F, 2.0175F, 0.48F, 0.0F, -3.1416F));

		PartDefinition cube_r48 = tail7.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(22, 9).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -2.8753F, 2.5836F, -2.5307F, 0.0F, -3.1416F));

		PartDefinition cube_r49 = tail7.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(13, 15).addBox(0.1F, -0.6F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 15).addBox(-0.1F, 0.0F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.5616F, 1.4825F, 0.2182F, 0.0F, -3.1416F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.0464F, 2.8348F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail8.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(6, 18).addBox(-0.2F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -0.0349F, 1.2077F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r51 = tail8.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(17, 10).addBox(0.0F, -2.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 3.0028F, 2.1972F, 2.5656F, 0.0F, -3.1416F));

		PartDefinition cube_r52 = tail8.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.5147F, 0.6204F, -0.5236F, 0.0F, -3.1416F));

		PartDefinition cube_r53 = tail8.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(21, 21).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.4799F, 1.1719F, 0.1745F, 0.0F, -3.1416F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.463F, 2.5029F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail9.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(12, 2).addBox(0.0F, -0.5F, -3.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.425F, 2.0528F, 2.9593F, 0.48F, 0.0F, -3.1416F));

		PartDefinition cube_r55 = tail9.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -4.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1612F, 4.2871F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition cube_r56 = tail9.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 1).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.25F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition head3 = body3.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -2.4F, -3.9F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, 0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9723F, 0.3198F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition eye3 = head3.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.525F, 2.025F, -1.4F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftpectoral3 = head3.addOrReplaceChild("leftpectoral3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 3.5795F, 0.4895F, -0.8306F, 0.0F, 0.0F));

		PartDefinition jaw3 = head3.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.825F, -0.7F, 0.6545F, 0.0F, 0.0F));

		PartDefinition leftpelvic3 = body3.addOrReplaceChild("leftpelvic3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.55F, 0.7827F, 0.2011F, -1.0549F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 110);
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