package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KleptothuleFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Kleptothule;
	private final ModelPart head;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body8;
	private final ModelPart body9;
	private final ModelPart body10;
	private final ModelPart pygidium;

	public KleptothuleFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Kleptothule = this.fossil.getChild("Kleptothule");
		this.head = this.Kleptothule.getChild("head");
		this.body2 = this.Kleptothule.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
		this.body9 = this.body8.getChild("body9");
		this.body10 = this.body9.getChild("body10");
		this.pygidium = this.body10.getChild("pygidium");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -1.0F, -12.0F, 23.0F, 1.0F, 38.0F, new CubeDeformation(0.0F))
				.texOffs(76, 69).addBox(-12.0F, -2.0F, -12.0F, 8.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
				.texOffs(85, 28).addBox(-4.0F, -2.0F, -12.0F, 15.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(74, 40).addBox(4.0F, -2.0F, 5.0F, 7.0F, 1.0F, 21.0F, new CubeDeformation(0.003F))
				.texOffs(0, 0).addBox(6.0F, -2.0F, -5.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 24.0F, -9.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).addBox(5.0F, -2.0F, -21.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F))
				.texOffs(85, 20).addBox(5.0F, -2.0F, 0.0F, 18.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 69).addBox(0.0F, -2.0F, -21.0F, 5.0F, 1.0F, 27.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 40).addBox(0.0F, -1.0F, -21.0F, 23.0F, 1.0F, 27.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-12.0F, 0.0F, 32.0F, 0.0F, 0.4974F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 26).addBox(-12.0F, -0.5F, -0.2F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7349F, -1.5F, 27.9562F, 0.0F, -0.1134F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 69).addBox(-6.4F, -0.5F, -9.1F, 7.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -1.5F, 15.5F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 12).addBox(-11.5F, -0.5F, -1.7F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5F, -1.5F, -8.5F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 0).addBox(-3.5F, -0.5F, -6.2F, 7.0F, 1.0F, 18.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-9.7498F, -1.5F, 11.0743F, 0.0F, -0.4363F, 0.0F));

		PartDefinition Kleptothule = fossil.addOrReplaceChild("Kleptothule", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.6F, 1.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r6 = Kleptothule.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 5).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r7 = Kleptothule.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 52).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition head = Kleptothule.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(0, 29).addBox(-0.5F, -0.25F, -5.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 31).addBox(-2.0F, 0.0F, -4.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, 0.0F, -4.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition body2 = Kleptothule.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(19, 58).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(23, 12).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(14, 56).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(27, 15).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 49).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(7, 55).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r14 = body4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 34).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r15 = body4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 49).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r16 = body5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 31).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r17 = body5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(18, 52).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r18 = body6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(28, 34).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r19 = body6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 46).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(30, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r20 = body7.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 40).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r21 = body7.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(9, 46).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(30, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r22 = body8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 40).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r23 = body8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r24 = body9.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 40).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r25 = body9.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 43).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r26 = body10.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r27 = body10.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(9, 43).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition pygidium = body10.addOrReplaceChild("pygidium", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-0.5F, -0.25F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r28 = pygidium.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(16, 18).addBox(-3.0F, 0.0F, -4.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 4.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r29 = pygidium.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, 0.0F, -4.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, 4.0F, 0.0F, 0.0F, 0.3054F));

		return LayerDefinition.create(meshdefinition, 144, 100);
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