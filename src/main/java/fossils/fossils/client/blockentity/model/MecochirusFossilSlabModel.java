package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MecochirusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart bone;
	private final ModelPart eyeL;
	private final ModelPart antennaR;
	private final ModelPart antennaL;
	private final ModelPart antennaR2;
	private final ModelPart antennaL2;
	private final ModelPart armR;
	private final ModelPart armR2;
	private final ModelPart armR3;
	private final ModelPart armR4;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart legR;
	private final ModelPart legL;
	private final ModelPart legR2;
	private final ModelPart legL2;
	private final ModelPart legR3;
	private final ModelPart legL3;
	private final ModelPart legR4;
	private final ModelPart legL4;
	private final ModelPart body1;
	private final ModelPart pleopodR;
	private final ModelPart pleopodL;
	private final ModelPart body2;
	private final ModelPart pleopodR2;
	private final ModelPart pleopodL2;
	private final ModelPart body3;
	private final ModelPart pleopodR3;
	private final ModelPart pleopodL3;
	private final ModelPart body4;
	private final ModelPart pleopodR4;
	private final ModelPart pleopodL4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart tail2;
	private final ModelPart tailfanL;
	private final ModelPart tailfanL2;

	public MecochirusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.bone = this.fossil.getChild("bone");
		this.eyeL = this.bone.getChild("eyeL");
		this.antennaR = this.bone.getChild("antennaR");
		this.antennaL = this.bone.getChild("antennaL");
		this.antennaR2 = this.bone.getChild("antennaR2");
		this.antennaL2 = this.bone.getChild("antennaL2");
		this.armR = this.bone.getChild("armR");
		this.armR2 = this.armR.getChild("armR2");
		this.armR3 = this.armR2.getChild("armR3");
		this.armR4 = this.armR3.getChild("armR4");
		this.armL = this.bone.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.armL3.getChild("armL4");
		this.legR = this.bone.getChild("legR");
		this.legL = this.bone.getChild("legL");
		this.legR2 = this.bone.getChild("legR2");
		this.legL2 = this.bone.getChild("legL2");
		this.legR3 = this.bone.getChild("legR3");
		this.legL3 = this.bone.getChild("legL3");
		this.legR4 = this.bone.getChild("legR4");
		this.legL4 = this.bone.getChild("legL4");
		this.body1 = this.bone.getChild("body1");
		this.pleopodR = this.body1.getChild("pleopodR");
		this.pleopodL = this.body1.getChild("pleopodL");
		this.body2 = this.body1.getChild("body2");
		this.pleopodR2 = this.body2.getChild("pleopodR2");
		this.pleopodL2 = this.body2.getChild("pleopodL2");
		this.body3 = this.body2.getChild("body3");
		this.pleopodR3 = this.body3.getChild("pleopodR3");
		this.pleopodL3 = this.body3.getChild("pleopodL3");
		this.body4 = this.body3.getChild("body4");
		this.pleopodR4 = this.body4.getChild("pleopodR4");
		this.pleopodL4 = this.body4.getChild("pleopodL4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.tail2 = this.body6.getChild("tail2");
		this.tailfanL = this.tail2.getChild("tailfanL");
		this.tailfanL2 = this.tail2.getChild("tailfanL2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 66).addBox(-19.0F, -2.0F, -22.0F, 33.0F, 2.0F, 19.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.1829F, -2.0F, -0.2312F, 23.0F, 2.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6F, 0.0F, 25.0F, 0.0F, 1.9199F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -2.0F, 0.0F, 21.0F, 2.0F, 30.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-19.0F, 0.0F, -3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.45F, 13.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 14).addBox(0.3F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -5.5F, -7.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -5.0F, -6.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 23).addBox(0.3F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -4.5F, -5.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -4.0F, -3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition eyeL = bone.addOrReplaceChild("eyeL", CubeListBuilder.create(), PartPose.offset(0.6F, -4.9F, -7.0F));

		PartDefinition cube_r7 = eyeL.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(3, 9).addBox(0.2F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition antennaR = bone.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(82, 8).addBox(0.0F, -3.0F, -12.5F, 0.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, -9.3602F, -19.0667F, 0.1309F, 0.0F, -3.1416F));

		PartDefinition antennaL = bone.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(80, 63).addBox(0.0F, -0.3597F, -24.4176F, 0.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.85F, -5.3432F, -7.5918F, 0.3491F, 0.0F, -3.1416F));

		PartDefinition antennaR2 = bone.addOrReplaceChild("antennaR2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.175F, -5.25F, -7.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = antennaR2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition antennaL2 = bone.addOrReplaceChild("antennaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.425F, -5.25F, -7.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r9 = antennaL2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 14).addBox(0.4F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition armR = bone.addOrReplaceChild("armR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -2.75F, -4.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = armR.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(77, 0).addBox(0.0F, -0.5F, -5.5F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, -5.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition armR2 = armR.addOrReplaceChild("armR2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -10.6F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r11 = armR2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 33).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition armR3 = armR2.addOrReplaceChild("armR3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -2.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r12 = armR3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -0.5F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, -0.2094F, -5.9963F, 0.0349F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = armR3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -0.5F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.2617F, -5.9943F, -0.0436F, 0.0F, -3.1416F));

		PartDefinition armR4 = armR3.addOrReplaceChild("armR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -12.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r14 = armR4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 14).addBox(0.0F, -1.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0952F, -3.0052F, 0.0349F, 0.0F, -3.1416F));

		PartDefinition armL = bone.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, -2.75F, -4.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r15 = armL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(73, 40).addBox(0.0F, -0.5F, -5.5F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -5.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -10.6F, 0.3535F, 0.0F, 0.0F));

		PartDefinition cube_r16 = armL2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -2.75F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r17 = armL3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -0.2094F, -5.9963F, 0.0349F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = armL3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -0.5F, -6.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2617F, -5.9943F, -0.0436F, 0.0F, -3.1416F));

		PartDefinition armL4 = armL3.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -12.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r19 = armL4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 0).addBox(0.3F, -1.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0952F, -3.0052F, 0.0349F, 0.0F, -3.1416F));

		PartDefinition legR = bone.addOrReplaceChild("legR", CubeListBuilder.create(), PartPose.offsetAndRotation(1.05F, -3.0F, -5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = legR.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(77, 13).addBox(0.0F, -2.0F, -4.5F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.25F, -4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legL = bone.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, -3.0F, -5.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r21 = legL.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 66).addBox(0.4F, -2.0F, -4.5F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.25F, -4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legR2 = bone.addOrReplaceChild("legR2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.25F, -4.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r22 = legR2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(85, 40).addBox(0.0F, -1.5F, -3.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legL2 = bone.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -2.25F, -4.0F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r23 = legL2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(13, 47).addBox(0.4F, -1.5F, -3.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.25F, -3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legR3 = bone.addOrReplaceChild("legR3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -2.25F, -3.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r24 = legR3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 53).addBox(0.1F, -1.5F, -3.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legL3 = bone.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -2.25F, -3.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r25 = legL3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 33).addBox(0.4F, -1.5F, -3.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.25F, -3.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legR4 = bone.addOrReplaceChild("legR4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -2.25F, -2.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r26 = legR4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(13, 14).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition legL4 = bone.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -2.25F, -2.0F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r27 = legL4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(13, 0).addBox(0.4F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.25F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body1 = bone.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -5.9F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(9, 3).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.25F, 0.75F, 0.0F, 0.0F, -3.1416F));

		PartDefinition pleopodR = body1.addOrReplaceChild("pleopodR", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.4F, 1.9F, 0.0F, -1.5708F, 0.0F));

		PartDefinition pleopodL = body1.addOrReplaceChild("pleopodL", CubeListBuilder.create().texOffs(8, 14).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.6F, 2.1F, 1.5708F, -0.8727F, -1.5708F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, 1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(7, 33).addBox(-0.1F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 1.25F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition pleopodR2 = body2.addOrReplaceChild("pleopodR2", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.75F, 2.25F, 1.5708F, -0.8727F, -1.5708F));

		PartDefinition pleopodL2 = body2.addOrReplaceChild("pleopodL2", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.75F, 2.25F, 1.5708F, -1.2654F, -1.5708F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 1.9F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 10).addBox(0.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 1.5F, 0.75F, 0.0F, 0.0F, -3.1416F));

		PartDefinition pleopodR3 = body3.addOrReplaceChild("pleopodR3", CubeListBuilder.create().texOffs(8, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.7F, 2.35F, -1.5708F, -1.309F, 1.5708F));

		PartDefinition pleopodL3 = body3.addOrReplaceChild("pleopodL3", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.7F, 2.35F, 1.5708F, -1.2654F, -1.5708F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, 1.75F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 0).addBox(0.1F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.85F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r32 = body4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 7).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.9F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition pleopodR4 = body4.addOrReplaceChild("pleopodR4", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.2F, 2.35F, 0.0F, 0.3491F, 0.2182F));

		PartDefinition pleopodL4 = body4.addOrReplaceChild("pleopodL4", CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2F, 2.35F, 0.0F, -0.3491F, -0.2182F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, 2.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(13, 33).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.0F, 0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.25F, 1.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.5F, 0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tail2 = body6.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(22, 25).addBox(-0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.31F, 0.45F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tailfanL = tail2.addOrReplaceChild("tailfanL", CubeListBuilder.create().texOffs(0, 14).addBox(-0.29F, -0.1F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.35F, 0.25F, 0.0F, 0.0F, 0.1309F, 1.5708F));

		PartDefinition tailfanL2 = tail2.addOrReplaceChild("tailfanL2", CubeListBuilder.create().texOffs(0, 18).addBox(-0.2854F, -0.0998F, 0.0041F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.25F, 0.0F, 0.02F, 0.4325F, 1.5202F));

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