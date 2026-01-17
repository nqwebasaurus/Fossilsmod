package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AegerFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart antennaL1;
	private final ModelPart antennaL4;
	private final ModelPart antennaR2;
	private final ModelPart antennaR3;
	private final ModelPart antennaL3;
	private final ModelPart antennaR5;
	private final ModelPart legL1;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart legL7;
	private final ModelPart legR7;
	private final ModelPart legR3;
	private final ModelPart legR2;
	private final ModelPart eyeL;
	private final ModelPart eyeR;
	private final ModelPart body1;
	private final ModelPart body2;
	private final ModelPart pleopodR2;
	private final ModelPart body3;
	private final ModelPart pleopodR3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart tail;
	private final ModelPart tailfanL;

	public AegerFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.antennaL1 = this.bone.getChild("antennaL1");
		this.antennaL4 = this.bone.getChild("antennaL4");
		this.antennaR2 = this.bone.getChild("antennaR2");
		this.antennaR3 = this.bone.getChild("antennaR3");
		this.antennaL3 = this.bone.getChild("antennaL3");
		this.antennaR5 = this.bone.getChild("antennaR5");
		this.legL1 = this.bone.getChild("legL1");
		this.legL2 = this.bone.getChild("legL2");
		this.legL3 = this.bone.getChild("legL3");
		this.legL4 = this.bone.getChild("legL4");
		this.legL5 = this.bone.getChild("legL5");
		this.legL6 = this.bone.getChild("legL6");
		this.legL7 = this.bone.getChild("legL7");
		this.legR7 = this.bone.getChild("legR7");
		this.legR3 = this.bone.getChild("legR3");
		this.legR2 = this.bone.getChild("legR2");
		this.eyeL = this.bone.getChild("eyeL");
		this.eyeR = this.bone.getChild("eyeR");
		this.body1 = this.bone.getChild("body1");
		this.body2 = this.body1.getChild("body2");
		this.pleopodR2 = this.body2.getChild("pleopodR2");
		this.body3 = this.body2.getChild("body3");
		this.pleopodR3 = this.body3.getChild("pleopodR3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.tail = this.body6.getChild("tail");
		this.tailfanL = this.tail.getChild("tailfanL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-14.4167F, -0.2813F, -18.8369F, 33.0F, 1.0F, 33.0F, new CubeDeformation(-0.01F))
				.texOffs(79, 56).addBox(-11.4167F, -0.2813F, -21.7869F, 30.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5833F, 23.2813F, -2.1631F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(59, 96).addBox(-8.0F, -0.5F, 0.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.3837F, 0.2188F, 19.9056F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 70).addBox(-5.5F, -0.5F, -1.5F, 13.0F, 1.0F, 5.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-12.8837F, 0.2188F, 14.4056F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(79, 61).addBox(-5.5F, -0.5F, -1.5F, 13.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.0413F, 0.2188F, 14.4056F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(79, 35).addBox(-5.5F, -0.5F, -9.5F, 11.0F, 1.0F, 19.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2528F, 0.2188F, 12.8328F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 112).addBox(-3.95F, -1.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-11.4417F, 0.7188F, -21.7369F, 0.0F, 1.0036F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(22, 113).addBox(1.09F, 1.7134F, 0.45F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(100, 86).addBox(1.1F, -1.2F, -0.1F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(39, 118).addBox(1.1F, -1.2F, -1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 114).addBox(1.1F, -1.2F, -5.1F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(69, 93).addBox(1.1F, -1.2F, -2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0167F, -1.5313F, 2.6631F, -2.618F, 0.0F, 1.5708F));

		PartDefinition antennaL1 = bone.addOrReplaceChild("antennaL1", CubeListBuilder.create().texOffs(100, 77).addBox(-0.75F, 0.0F, -8.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.4F, -0.6F, 0.0F, 0.0436F, -1.5708F));

		PartDefinition cube_r6 = antennaL1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(107, 96).addBox(-0.4241F, 0.1407F, -6.0372F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3259F, -0.1407F, -7.9628F, 0.0F, 0.5236F, 0.0F));

		PartDefinition antennaL4 = bone.addOrReplaceChild("antennaL4", CubeListBuilder.create().texOffs(100, 77).addBox(-0.75F, 0.0F, -8.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.4F, -0.6F, 0.0F, -0.2182F, -1.5708F));

		PartDefinition cube_r7 = antennaL4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(107, 96).addBox(-0.4241F, 0.1407F, -6.0372F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3259F, -0.1407F, -7.9628F, 0.0F, 0.2618F, 0.0F));

		PartDefinition antennaR2 = bone.addOrReplaceChild("antennaR2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 0.55F, -0.6F, 0.0F, -0.6109F, 1.5708F));

		PartDefinition cube_r8 = antennaR2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(33, 113).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition antennaR3 = bone.addOrReplaceChild("antennaR3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3F, 1.616F, -1.1F, 0.0F, 0.5483F, 1.586F));

		PartDefinition cube_r9 = antennaR3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 35).addBox(-5.5F, 0.0F, -14.0F, 11.0F, 0.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3023F, 0.0131F, 8.3187F, 0.0F, 0.0F, -3.1416F));

		PartDefinition antennaL3 = bone.addOrReplaceChild("antennaL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.75F, -0.6F, 0.0039F, -0.2619F, -1.5283F));

		PartDefinition cube_r10 = antennaL3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 64).addBox(-10.7541F, -0.0999F, -4.9985F, 11.0F, 0.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0943F, 2.2978F, -1.0343F, -0.0175F, -0.2269F, -0.0349F));

		PartDefinition antennaR5 = bone.addOrReplaceChild("antennaR5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -0.6F, -0.141F, 0.192F, 1.658F));

		PartDefinition legL1 = bone.addOrReplaceChild("legL1", CubeListBuilder.create().texOffs(11, 113).addBox(0.0F, -0.5F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 1.15F, 0.15F, 0.1745F, 0.0F, 0.0F));

		PartDefinition legL2 = bone.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 93).addBox(2.2998F, -0.5133F, -9.9774F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.15F, 0.65F, -0.3846F, 0.011F, 0.0031F));

		PartDefinition legL3 = bone.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(21, 93).addBox(2.296F, -0.4337F, -8.8827F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 2.4F, 2.4F, 0.469F, 0.0586F, -0.0026F));

		PartDefinition legL4 = bone.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(107, 103).addBox(-0.01F, -0.5F, -5.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2F, 2.15F, 1.65F));

		PartDefinition legL5 = bone.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(0, 112).addBox(-0.01F, -0.5F, -5.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 2.15F, 2.65F, 1.3526F, 0.0F, 0.0F));

		PartDefinition legL6 = bone.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(59, 104).addBox(0.0F, -0.5F, -5.0F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 2.15F, 4.65F, -0.0689F, 0.0F, 0.0F));

		PartDefinition legL7 = bone.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(70, 104).addBox(0.0F, -0.5F, -5.0F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.15F, 5.65F, 0.762F, 0.0F, 0.0F));

		PartDefinition legR7 = bone.addOrReplaceChild("legR7", CubeListBuilder.create().texOffs(81, 105).addBox(0.01F, -0.5F, -5.0F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.15F, 5.65F, 0.2531F, 0.0F, 0.0F));

		PartDefinition legR3 = bone.addOrReplaceChild("legR3", CubeListBuilder.create().texOffs(40, 93).addBox(0.0F, -0.5F, -9.0F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.15F, 2.4F, 2.4F, -0.0992F, 0.0F, 0.0F));

		PartDefinition legR2 = bone.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(79, 77).addBox(0.1F, -0.5F, -10.0F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.15F, 0.65F, 0.7062F, 0.0F, 0.0F));

		PartDefinition eyeL = bone.addOrReplaceChild("eyeL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -0.6F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r11 = eyeL.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(113, 90).addBox(-0.6882F, -1.3F, -2.961F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7385F, 0.3F, 0.4155F, 0.0436F, -0.2094F, 0.0F));

		PartDefinition eyeR = bone.addOrReplaceChild("eyeR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -0.6F, 0.0F, -0.2182F, 0.0F));

		PartDefinition body1 = bone.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(116, 70).addBox(1.2F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 5.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(116, 70).addBox(1.21F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition pleopodR2 = body2.addOrReplaceChild("pleopodR2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, 4.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r12 = pleopodR2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 118).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(116, 70).addBox(1.19F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition pleopodR3 = body3.addOrReplaceChild("pleopodR3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = pleopodR3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(33, 118).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1411F, 0.7873F, -0.7F, 3.1416F, 0.0F, 0.0349F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(116, 70).addBox(1.21F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(116, 70).addBox(1.2F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(102, 117).addBox(1.21F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail = body6.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(44, 113).addBox(1.21F, 0.0F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tailfanL = tail.addOrReplaceChild("tailfanL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.7439F, -0.0695F, 0.0F, 0.3738F, 1.5708F));

		PartDefinition cube_r14 = tailfanL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(113, 86).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(64, 93).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.0F, 2.25F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r15 = tailfanL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(59, 93).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.0F, 0.25F, 3.1416F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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