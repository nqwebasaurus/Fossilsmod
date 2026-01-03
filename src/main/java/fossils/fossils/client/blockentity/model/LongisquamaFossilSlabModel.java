package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LongisquamaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body2;
	private final ModelPart scale6;
	private final ModelPart scale7;
	private final ModelPart scale8;
	private final ModelPart scale9;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart upperjaw;
	private final ModelPart lowerjaw;
	private final ModelPart forelegL1;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart scale1;
	private final ModelPart scale2;
	private final ModelPart scale3;
	private final ModelPart scale4;
	private final ModelPart scale5;

	public LongisquamaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body2 = this.fossil.getChild("body2");
		this.scale6 = this.body2.getChild("scale6");
		this.scale7 = this.body2.getChild("scale7");
		this.scale8 = this.body2.getChild("scale8");
		this.scale9 = this.body2.getChild("scale9");
		this.body = this.fossil.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.upperjaw = this.head.getChild("upperjaw");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.forelegL1 = this.body.getChild("forelegL1");
		this.forelegL2 = this.forelegL1.getChild("forelegL2");
		this.forelegL3 = this.forelegL2.getChild("forelegL3");
		this.scale1 = this.body.getChild("scale1");
		this.scale2 = this.body.getChild("scale2");
		this.scale3 = this.body.getChild("scale3");
		this.scale4 = this.body.getChild("scale4");
		this.scale5 = this.body.getChild("scale5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 48).addBox(-8.0F, -2.0F, -33.0F, 37.0F, 2.0F, 22.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-27.0F, -2.0F, -11.0F, 45.0F, 2.0F, 45.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(117, 62).addBox(-0.3256F, -2.0F, -0.1006F, 11.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-18.0F, 0.0F, -30.2F, 0.0F, 0.2705F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(114, 106).addBox(0.1648F, -2.0F, -0.2055F, 11.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.0F, 0.0F, -20.4F, 0.0F, 1.0123F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(104, 91).addBox(-1.1822F, -2.0F, -3.513F, 18.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-22.0F, 0.0F, -17.0F, 0.0F, 0.1833F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 73).addBox(0.1547F, -2.0F, -27.7139F, 12.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.0F, 0.0F, 5.0F, 0.0F, -0.6458F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 104).addBox(0.2378F, -2.0F, -20.7375F, 12.0F, 2.0F, 21.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-40.0F, 0.0F, 26.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 73).addBox(0.0F, -2.0F, -15.0F, 24.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.0F, 0.0F, 34.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r7 = fossil.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 14).addBox(-8.8F, -1.0F, -2.8F, 10.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(16.8643F, -1.0F, 14.6572F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r8 = fossil.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(97, 48).addBox(0.1857F, -2.0F, -11.2247F, 27.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.0F, 0.0F, 25.0F, 0.0F, 1.7017F, 0.0F));

		PartDefinition cube_r9 = fossil.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -11.0F, 11.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(18.0F, 0.0F, 34.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r10 = fossil.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 91).addBox(-11.0F, -2.0F, 0.0F, 11.0F, 2.0F, 22.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(29.0F, 0.0F, -11.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, -2.3F, -16.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition scale6 = body2.addOrReplaceChild("scale6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 0.65F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r11 = scale6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 116).addBox(0.0F, -28.5F, -3.0F, 0.0F, 57.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -28.0F, 2.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition scale7 = body2.addOrReplaceChild("scale7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r12 = scale7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(123, 118).addBox(0.0F, 2.0F, -19.5F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -18.5F, 2.0F, -2.3126F, 0.0F, 3.1416F));

		PartDefinition cube_r13 = scale7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(100, 116).addBox(0.0F, -19.0F, -2.5F, 0.0F, 38.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -18.5F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition scale8 = body2.addOrReplaceChild("scale8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 3.5F, -1.4835F, 0.0F, 0.0F));

		PartDefinition scale9 = body2.addOrReplaceChild("scale9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 4.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 28).addBox(-0.9F, -1.6F, -4.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(40, 14).addBox(-0.9F, -0.6F, -4.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 14).addBox(-0.9F, -0.6F, -2.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.6F, -2.15F, -16.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 28).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 2.0624F, -5.4397F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 33).addBox(-0.9F, -0.5F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9F, -6.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 28).addBox(-1.3F, -1.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3555F, -5.6914F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(34, 7).addBox(-1.4F, -1.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9F, -5.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 14).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.9F, 0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(21, 28).addBox(-0.9F, -1.5F, -2.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r19 = neck.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(8, 28).addBox(-0.9F, -0.1F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.3F, 0.8378F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 1.0F, -3.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, -1.1F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 14).addBox(-0.4279F, -1.125F, -7.9015F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(9, 35).addBox(-0.2F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 35).addBox(0.01F, -3.1F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(6, 6).addBox(-0.49F, -1.25F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r20 = upperjaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.61F, -5.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r21 = upperjaw.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 48).addBox(-0.3F, 0.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = upperjaw.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 14).addBox(-0.6F, -1.5F, -1.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.49F))
				.texOffs(34, 0).addBox(-0.4F, -1.5F, -1.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.72F, -1.6F, -1.7F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r23 = upperjaw.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 35).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5496F, -0.325F, -5.8898F, 0.0F, 3.1416F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(33, 38).addBox(-0.19F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 35).addBox(0.5043F, -0.2F, -7.8847F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(26, 28).addBox(-0.4279F, 0.002F, -7.9015F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(13, 28).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition forelegL1 = body.addOrReplaceChild("forelegL1", CubeListBuilder.create().texOffs(32, 21).addBox(-0.4F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 2.8F, -5.0F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition forelegL2 = forelegL1.addOrReplaceChild("forelegL2", CubeListBuilder.create().texOffs(7, 48).addBox(-0.9F, 1.0F, 0.11F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 48).addBox(0.1F, 1.0F, 0.11F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.4F, -2.39F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition scale1 = body.addOrReplaceChild("scale1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -6.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition scale2 = body.addOrReplaceChild("scale2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -5.05F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r24 = scale2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(118, 121).addBox(0.0F, -17.5F, -1.0F, 0.0F, 35.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -16.9345F, 1.5023F, -3.098F, 0.0F, -3.1416F));

		PartDefinition scale3 = body.addOrReplaceChild("scale3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r25 = scale3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(111, 121).addBox(0.0F, -21.0F, -1.5F, 0.0F, 42.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -20.5F, 1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition scale4 = body.addOrReplaceChild("scale4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.3F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r26 = scale4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 116).addBox(0.0F, -28.5F, -2.0F, 0.0F, 57.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.0F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition scale5 = body.addOrReplaceChild("scale5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r27 = scale5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 116).addBox(0.0F, -20.0F, -2.5F, 0.0F, 40.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -19.5F, 2.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 184, 180);
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