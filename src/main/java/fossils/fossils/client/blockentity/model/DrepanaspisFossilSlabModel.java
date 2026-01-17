package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DrepanaspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart body;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart bone3;
	private final ModelPart cube_r18;
	private final ModelPart bone2;
	private final ModelPart cube_r19;
	private final ModelPart body2;
	private final ModelPart cube_r20;
	private final ModelPart body3;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart body4;
	private final ModelPart cube_r24;
	private final ModelPart cube_r25;
	private final ModelPart body5;
	private final ModelPart cube_r26;
	private final ModelPart fin;
	private final ModelPart bone;
	private final ModelPart cube_r27;

	public DrepanaspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.cube_r4 = this.fossil.getChild("cube_r4");
		this.cube_r5 = this.fossil.getChild("cube_r5");
		this.cube_r6 = this.fossil.getChild("cube_r6");
		this.body = this.fossil.getChild("body");
		this.cube_r7 = this.body.getChild("cube_r7");
		this.cube_r8 = this.body.getChild("cube_r8");
		this.cube_r9 = this.body.getChild("cube_r9");
		this.cube_r10 = this.body.getChild("cube_r10");
		this.cube_r11 = this.body.getChild("cube_r11");
		this.cube_r12 = this.body.getChild("cube_r12");
		this.cube_r13 = this.body.getChild("cube_r13");
		this.cube_r14 = this.body.getChild("cube_r14");
		this.cube_r15 = this.body.getChild("cube_r15");
		this.cube_r16 = this.body.getChild("cube_r16");
		this.cube_r17 = this.body.getChild("cube_r17");
		this.bone3 = this.body.getChild("bone3");
		this.cube_r18 = this.bone3.getChild("cube_r18");
		this.bone2 = this.body.getChild("bone2");
		this.cube_r19 = this.bone2.getChild("cube_r19");
		this.body2 = this.body.getChild("body2");
		this.cube_r20 = this.body2.getChild("cube_r20");
		this.body3 = this.body2.getChild("body3");
		this.cube_r21 = this.body3.getChild("cube_r21");
		this.cube_r22 = this.body3.getChild("cube_r22");
		this.cube_r23 = this.body3.getChild("cube_r23");
		this.body4 = this.body3.getChild("body4");
		this.cube_r24 = this.body4.getChild("cube_r24");
		this.cube_r25 = this.body4.getChild("cube_r25");
		this.body5 = this.body4.getChild("body5");
		this.cube_r26 = this.body5.getChild("cube_r26");
		this.fin = this.body5.getChild("fin");
		this.bone = this.body.getChild("bone");
		this.cube_r27 = this.bone.getChild("cube_r27");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -2.0F, -8.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 14).addBox(-4.4F, -1.5F, -1.5F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.5F, -9.5F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 24).addBox(-9.7717F, -1.0F, -2.8705F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.9F, 0.0F, 3.0F, 0.0F, 1.6406F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 45).addBox(-11.0F, -2.0F, -4.0F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(9.0F, 0.0F, -8.0F, 0.0F, 1.4835F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 29).addBox(0.0F, -2.0F, 0.0F, 3.0F, 2.0F, 13.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 14).addBox(1.0F, -1.0F, 0.0F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 3.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r6 = fossil.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -1.0F, 0.0F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, -8.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(36, 0).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(47, 11).addBox(-3.99F, -2.0F, 1.925F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-3.0F, -0.75F, -5.025F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(30, 54).addBox(-0.5F, -3.125F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -3.0F, -0.0441F, -0.1706F, 0.0948F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 7).addBox(-1.25F, 0.025F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 2.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 51).addBox(-0.75F, 0.025F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.0F, 2.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 33).addBox(-2.99F, -1.0F, -1.75F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-2.49F, -1.0F, -2.75F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 21).addBox(-2.5F, -3.875F, -6.775F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.15F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(50, 37).addBox(-0.15F, -0.25F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -1.8F, -5.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(32, 35).addBox(0.1F, 0.75F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -2.0F, -5.0F, -0.2618F, -0.48F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 42).addBox(-1.1F, 0.75F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, -5.0F, -0.2618F, 0.48F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(45, 50).addBox(0.55F, -0.35F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -2.125F, -5.1F, 0.2618F, -0.0873F, -0.0873F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(6, 51).addBox(-1.55F, -0.35F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.125F, -5.1F, 0.2618F, 0.0873F, 0.0873F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 51).addBox(-0.85F, -0.25F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -1.8F, -5.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(50, 29).addBox(-3.5F, 0.1F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 50).addBox(-3.0F, 0.1F, -2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -4.85F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1F, -1.9F, -4.65F, -0.0175F, -0.1745F, -0.2618F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 50).addBox(3.65F, 1.55F, -4.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.5F, 4.75F, -0.1745F, 0.1745F, -0.7854F));

		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1F, -1.9F, -4.65F, -0.0175F, 0.1745F, 0.2618F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 45).addBox(-4.65F, 1.55F, -4.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.5F, 4.75F, -0.1745F, -0.1745F, 0.7854F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 1.75F, -0.1309F, 0.1745F, -0.4363F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 24).addBox(-0.5F, -0.85F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 24).addBox(-0.5F, -1.25F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -1.199F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0865F, 0.0005F, -0.2068F));

		PartDefinition cube_r21 = body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(57, 14).addBox(-0.5F, 0.1F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 56).addBox(-0.5F, 0.8F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 24).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.835F, 0.1F, 0.6036F, -0.0244F, 0.0847F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(17, 55).addBox(-0.1F, -0.3F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 14).addBox(-0.5F, -1.3F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.301F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 54).addBox(0.0F, -1.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 37).addBox(-0.9F, -1.3F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(-0.4F, -0.3F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.301F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.0756F, 0.2221F, -0.0487F));

		PartDefinition cube_r24 = body4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 56).addBox(-0.5F, 0.6F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 35).addBox(-0.5F, -0.1F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 29).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.825F, 0.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(47, 55).addBox(-1.5F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(8, 14).addBox(-1.5F, -2.5F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(56, 37).addBox(-1.2F, -1.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 55).addBox(-0.9F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9F, 1.3F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -1.199F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0341F, -0.1264F, -0.0458F));

		PartDefinition cube_r26 = body5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(42, 54).addBox(-1.4F, -0.5F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 55).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.301F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition fin = body5.addOrReplaceChild("fin", CubeListBuilder.create().texOffs(0, 42).addBox(0.0F, -1.7F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(0.0F, -2.2F, 2.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0076F, 0.0869F, -0.4367F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.825F, 0.025F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(9, 51).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 70, 60);
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