package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BellinymphaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart cube_r4;
	private final ModelPart antennaR;
	private final ModelPart antennaL;
	private final ModelPart abdomen;
	private final ModelPart hindwingL;
	private final ModelPart forewingL;
	private final ModelPart forewingR;
	private final ModelPart hindwingR;
	private final ModelPart legL1;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legR1;
	private final ModelPart legR2;
	private final ModelPart legR3;
	private final ModelPart body2;
	private final ModelPart head2;
	private final ModelPart cube_r5;
	private final ModelPart antennaR2;
	private final ModelPart antennaL2;
	private final ModelPart abdomen2;
	private final ModelPart hindwingL2;
	private final ModelPart forewingL2;
	private final ModelPart forewingR2;
	private final ModelPart hindwingR2;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart legR4;
	private final ModelPart legR5;
	private final ModelPart legR6;
	private final ModelPart body3;
	private final ModelPart head3;
	private final ModelPart cube_r6;
	private final ModelPart antennaR3;
	private final ModelPart antennaL3;
	private final ModelPart abdomen3;
	private final ModelPart hindwingL3;
	private final ModelPart forewingL3;
	private final ModelPart forewingR3;
	private final ModelPart hindwingR3;
	private final ModelPart legL7;
	private final ModelPart legL8;
	private final ModelPart legL9;
	private final ModelPart legR7;
	private final ModelPart legR8;
	private final ModelPart legR9;
	private final ModelPart body4;
	private final ModelPart head4;
	private final ModelPart cube_r7;
	private final ModelPart antennaR4;
	private final ModelPart antennaL4;
	private final ModelPart abdomen4;
	private final ModelPart hindwingL4;
	private final ModelPart forewingL4;
	private final ModelPart forewingR4;
	private final ModelPart hindwingR4;
	private final ModelPart legL10;
	private final ModelPart legL11;
	private final ModelPart legL12;
	private final ModelPart legR10;
	private final ModelPart legR11;
	private final ModelPart legR12;
	private final ModelPart body5;
	private final ModelPart head5;
	private final ModelPart cube_r8;
	private final ModelPart antennaR5;
	private final ModelPart antennaL5;
	private final ModelPart abdomen5;
	private final ModelPart hindwingL5;
	private final ModelPart forewingL5;
	private final ModelPart forewingR5;
	private final ModelPart hindwingR5;
	private final ModelPart legL13;
	private final ModelPart legL14;
	private final ModelPart legL15;
	private final ModelPart legR13;
	private final ModelPart legR14;
	private final ModelPart legR15;
	private final ModelPart body6;
	private final ModelPart head6;
	private final ModelPart cube_r9;
	private final ModelPart antennaR6;
	private final ModelPart antennaL6;
	private final ModelPart abdomen6;
	private final ModelPart hindwingL6;
	private final ModelPart forewingL6;
	private final ModelPart forewingR6;
	private final ModelPart hindwingR6;
	private final ModelPart legL16;
	private final ModelPart legL17;
	private final ModelPart legL18;
	private final ModelPart legR16;
	private final ModelPart legR17;
	private final ModelPart legR18;


	public BellinymphaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.body = this.fossil.getChild("body");
		this.head = this.body.getChild("head");
		this.cube_r4 = this.head.getChild("cube_r4");
		this.antennaR = this.head.getChild("antennaR");
		this.antennaL = this.head.getChild("antennaL");
		this.abdomen = this.body.getChild("abdomen");
		this.hindwingL = this.body.getChild("hindwingL");
		this.forewingL = this.body.getChild("forewingL");
		this.forewingR = this.body.getChild("forewingR");
		this.hindwingR = this.body.getChild("hindwingR");
		this.legL1 = this.body.getChild("legL1");
		this.legL2 = this.body.getChild("legL2");
		this.legL3 = this.body.getChild("legL3");
		this.legR1 = this.body.getChild("legR1");
		this.legR2 = this.body.getChild("legR2");
		this.legR3 = this.body.getChild("legR3");
		this.body2 = this.body.getChild("body2");
		this.head2 = this.body2.getChild("head2");
		this.cube_r5 = this.head2.getChild("cube_r5");
		this.antennaR2 = this.head2.getChild("antennaR2");
		this.antennaL2 = this.head2.getChild("antennaL2");
		this.abdomen2 = this.body2.getChild("abdomen2");
		this.hindwingL2 = this.body2.getChild("hindwingL2");
		this.forewingL2 = this.body2.getChild("forewingL2");
		this.forewingR2 = this.body2.getChild("forewingR2");
		this.hindwingR2 = this.body2.getChild("hindwingR2");
		this.legL4 = this.body2.getChild("legL4");
		this.legL5 = this.body2.getChild("legL5");
		this.legL6 = this.body2.getChild("legL6");
		this.legR4 = this.body2.getChild("legR4");
		this.legR5 = this.body2.getChild("legR5");
		this.legR6 = this.body2.getChild("legR6");
		this.body3 = this.body.getChild("body3");
		this.head3 = this.body3.getChild("head3");
		this.cube_r6 = this.head3.getChild("cube_r6");
		this.antennaR3 = this.head3.getChild("antennaR3");
		this.antennaL3 = this.head3.getChild("antennaL3");
		this.abdomen3 = this.body3.getChild("abdomen3");
		this.hindwingL3 = this.body3.getChild("hindwingL3");
		this.forewingL3 = this.body3.getChild("forewingL3");
		this.forewingR3 = this.body3.getChild("forewingR3");
		this.hindwingR3 = this.body3.getChild("hindwingR3");
		this.legL7 = this.body3.getChild("legL7");
		this.legL8 = this.body3.getChild("legL8");
		this.legL9 = this.body3.getChild("legL9");
		this.legR7 = this.body3.getChild("legR7");
		this.legR8 = this.body3.getChild("legR8");
		this.legR9 = this.body3.getChild("legR9");
		this.body4 = this.body3.getChild("body4");
		this.head4 = this.body4.getChild("head4");
		this.cube_r7 = this.head4.getChild("cube_r7");
		this.antennaR4 = this.head4.getChild("antennaR4");
		this.antennaL4 = this.head4.getChild("antennaL4");
		this.abdomen4 = this.body4.getChild("abdomen4");
		this.hindwingL4 = this.body4.getChild("hindwingL4");
		this.forewingL4 = this.body4.getChild("forewingL4");
		this.forewingR4 = this.body4.getChild("forewingR4");
		this.hindwingR4 = this.body4.getChild("hindwingR4");
		this.legL10 = this.body4.getChild("legL10");
		this.legL11 = this.body4.getChild("legL11");
		this.legL12 = this.body4.getChild("legL12");
		this.legR10 = this.body4.getChild("legR10");
		this.legR11 = this.body4.getChild("legR11");
		this.legR12 = this.body4.getChild("legR12");
		this.body5 = this.body3.getChild("body5");
		this.head5 = this.body5.getChild("head5");
		this.cube_r8 = this.head5.getChild("cube_r8");
		this.antennaR5 = this.head5.getChild("antennaR5");
		this.antennaL5 = this.head5.getChild("antennaL5");
		this.abdomen5 = this.body5.getChild("abdomen5");
		this.hindwingL5 = this.body5.getChild("hindwingL5");
		this.forewingL5 = this.body5.getChild("forewingL5");
		this.forewingR5 = this.body5.getChild("forewingR5");
		this.hindwingR5 = this.body5.getChild("hindwingR5");
		this.legL13 = this.body5.getChild("legL13");
		this.legL14 = this.body5.getChild("legL14");
		this.legL15 = this.body5.getChild("legL15");
		this.legR13 = this.body5.getChild("legR13");
		this.legR14 = this.body5.getChild("legR14");
		this.legR15 = this.body5.getChild("legR15");
		this.body6 = this.body5.getChild("body6");
		this.head6 = this.body6.getChild("head6");
		this.cube_r9 = this.head6.getChild("cube_r9");
		this.antennaR6 = this.head6.getChild("antennaR6");
		this.antennaL6 = this.head6.getChild("antennaL6");
		this.abdomen6 = this.body6.getChild("abdomen6");
		this.hindwingL6 = this.body6.getChild("hindwingL6");
		this.forewingL6 = this.body6.getChild("forewingL6");
		this.forewingR6 = this.body6.getChild("forewingR6");
		this.hindwingR6 = this.body6.getChild("hindwingR6");
		this.legL16 = this.body6.getChild("legL16");
		this.legL17 = this.body6.getChild("legL17");
		this.legL18 = this.body6.getChild("legL18");
		this.legR16 = this.body6.getChild("legR16");
		this.legR17 = this.body6.getChild("legR17");
		this.legR18 = this.body6.getChild("legR18");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 58).addBox(-37.0F, -2.01F, -39.0F, 63.0F, 2.0F, 60.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 44).addBox(0.367F, -2.0F, -0.6999F, 20.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-29.9F, 0.0F, 39.5F, 0.0F, 1.885F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 47).addBox(-22.7459F, -2.0F, -0.0632F, 23.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-15.4F, 0.0F, -46.4F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-45.0F, -2.0F, -19.0F, 87.0F, 2.0F, 55.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -2.0F, 0.0F, 1.3963F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(11.0F, 1.95F, -18.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(33, 31).addBox(-0.5F, -0.275F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 47).addBox(-0.85F, -0.276F, -1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 47).addBox(-0.15F, -0.277F, -1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, -3.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 46).addBox(0.0F, -1.025F, -1.8F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -1.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition antennaR = head.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(33, 27).addBox(0.0F, -1.025F, -3.0F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.75F, -1.5F, -0.2618F, 0.2618F, -0.3491F));

		PartDefinition antennaL = head.addOrReplaceChild("antennaL", CubeListBuilder.create().texOffs(33, 18).addBox(0.0F, -1.025F, -3.0F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.75F, -1.5F, -0.2618F, -0.2618F, 0.3491F));

		PartDefinition abdomen = body.addOrReplaceChild("abdomen", CubeListBuilder.create(), PartPose.offset(0.0F, -3.9F, 0.0F));

		PartDefinition hindwingL = body.addOrReplaceChild("hindwingL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -3.8F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition forewingL = body.addOrReplaceChild("forewingL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition forewingR = body.addOrReplaceChild("forewingR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -4.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition hindwingR = body.addOrReplaceChild("hindwingR", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.8F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL1 = body.addOrReplaceChild("legL1", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -2.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legL2 = body.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(45, 33).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -1.5F));

		PartDefinition legL3 = body.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(33, 45).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -0.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition legR1 = body.addOrReplaceChild("legR1", CubeListBuilder.create().texOffs(45, 32).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -2.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legR2 = body.addOrReplaceChild("legR2", CubeListBuilder.create().texOffs(45, 31).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, -1.5F));

		PartDefinition legR3 = body.addOrReplaceChild("legR3", CubeListBuilder.create().texOffs(45, 30).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -0.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(44, 62).addBox(-1.0F, -4.026F, -3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head2 = body2.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(33, 22).addBox(-0.5F, -0.275F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 45).addBox(-0.85F, -0.276F, -1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 43).addBox(-0.15F, -0.277F, -1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, -3.0F));

		PartDefinition cube_r5 = head2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 27).addBox(0.0F, -1.025F, -1.8F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -1.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition antennaR2 = head2.addOrReplaceChild("antennaR2", CubeListBuilder.create().texOffs(33, 9).addBox(0.0F, -1.025F, -3.0F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.75F, -1.5F, -0.2618F, 0.2618F, -0.3491F));

		PartDefinition antennaL2 = head2.addOrReplaceChild("antennaL2", CubeListBuilder.create().texOffs(33, 0).addBox(0.0F, -1.025F, -3.0F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.75F, -1.5F, -0.2618F, -0.2618F, 0.3491F));

		PartDefinition abdomen2 = body2.addOrReplaceChild("abdomen2", CubeListBuilder.create().texOffs(34, 35).addBox(-1.0F, -0.124F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.9F, 0.0F));

		PartDefinition hindwingL2 = body2.addOrReplaceChild("hindwingL2", CubeListBuilder.create().texOffs(115, 131).addBox(0.0F, -0.225F, -1.0F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.8F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition forewingL2 = body2.addOrReplaceChild("forewingL2", CubeListBuilder.create().texOffs(82, 130).addBox(0.0F, -0.024F, -5.0F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition forewingR2 = body2.addOrReplaceChild("forewingR2", CubeListBuilder.create().texOffs(41, 130).addBox(-12.0F, -0.024F, -5.0F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition hindwingR2 = body2.addOrReplaceChild("hindwingR2", CubeListBuilder.create().texOffs(0, 130).addBox(-12.0F, -0.225F, -1.0F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.8F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL4 = body2.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(45, 24).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -2.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legL5 = body2.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(45, 23).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -1.5F));

		PartDefinition legL6 = body2.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(45, 22).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -0.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition legR4 = body2.addOrReplaceChild("legR4", CubeListBuilder.create().texOffs(45, 21).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -2.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legR5 = body2.addOrReplaceChild("legR5", CubeListBuilder.create().texOffs(45, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, -1.5F));

		PartDefinition legR6 = body2.addOrReplaceChild("legR6", CubeListBuilder.create().texOffs(45, 14).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -0.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition head3 = body3.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offset(0.0F, -3.75F, -3.0F));

		PartDefinition cube_r6 = head3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 18).addBox(32.0429F, 12.0565F, 11.2815F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -1.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition antennaR3 = head3.addOrReplaceChild("antennaR3", CubeListBuilder.create().texOffs(0, 31).addBox(24.2964F, 2.9189F, 24.6248F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.75F, -1.5F, -0.2618F, 0.2618F, -0.3491F));

		PartDefinition antennaL3 = head3.addOrReplaceChild("antennaL3", CubeListBuilder.create().texOffs(0, 27).addBox(33.8727F, -14.2189F, 3.8966F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.75F, -1.5F, -0.2618F, -0.2618F, 0.3491F));

		PartDefinition abdomen3 = body3.addOrReplaceChild("abdomen3", CubeListBuilder.create(), PartPose.offset(0.0F, -3.9F, 0.0F));

		PartDefinition hindwingL3 = body3.addOrReplaceChild("hindwingL3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -3.8F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition forewingL3 = body3.addOrReplaceChild("forewingL3", CubeListBuilder.create().texOffs(82, 121).addBox(28.3436F, -0.024F, 18.7831F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition forewingR3 = body3.addOrReplaceChild("forewingR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -4.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition hindwingR3 = body3.addOrReplaceChild("hindwingR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.8F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL7 = body3.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(45, 13).addBox(18.5F, 0.0F, 32.0429F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -2.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legL8 = body3.addOrReplaceChild("legL8", CubeListBuilder.create().texOffs(45, 12).addBox(32.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -1.5F));

		PartDefinition legL9 = body3.addOrReplaceChild("legL9", CubeListBuilder.create().texOffs(45, 11).addBox(36.4379F, 0.0F, -6.425F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -0.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition legR7 = body3.addOrReplaceChild("legR7", CubeListBuilder.create().texOffs(45, 10).addBox(34.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -2.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legR8 = body3.addOrReplaceChild("legR8", CubeListBuilder.create().texOffs(45, 9).addBox(29.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, -1.5F));

		PartDefinition legR9 = body3.addOrReplaceChild("legR9", CubeListBuilder.create().texOffs(45, 6).addBox(9.6547F, 0.0F, 34.7686F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -0.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(44, 58).addBox(31.0429F, -4.026F, 15.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head4 = body4.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offset(0.0F, -3.75F, -3.0F));

		PartDefinition cube_r7 = head4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 3).addBox(32.0429F, 12.0565F, 11.2815F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -1.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition antennaR4 = head4.addOrReplaceChild("antennaR4", CubeListBuilder.create().texOffs(0, 22).addBox(24.2964F, 2.9189F, 24.6248F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.75F, -1.5F, -0.2618F, 0.2618F, -0.3491F));

		PartDefinition antennaL4 = head4.addOrReplaceChild("antennaL4", CubeListBuilder.create().texOffs(0, 18).addBox(33.8727F, -14.2189F, 3.8966F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.75F, -1.5F, -0.2618F, -0.2618F, 0.3491F));

		PartDefinition abdomen4 = body4.addOrReplaceChild("abdomen4", CubeListBuilder.create().texOffs(33, 18).addBox(31.0429F, -0.124F, 18.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.9F, 0.0F));

		PartDefinition hindwingL4 = body4.addOrReplaceChild("hindwingL4", CubeListBuilder.create().texOffs(0, 103).addBox(34.7686F, -0.225F, 11.6547F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.8F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition forewingL4 = body4.addOrReplaceChild("forewingL4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition forewingR4 = body4.addOrReplaceChild("forewingR4", CubeListBuilder.create().texOffs(0, 85).addBox(22.7686F, -0.024F, 7.6547F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition hindwingR4 = body4.addOrReplaceChild("hindwingR4", CubeListBuilder.create().texOffs(0, 76).addBox(16.3436F, -0.225F, 22.7831F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.8F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL10 = body4.addOrReplaceChild("legL10", CubeListBuilder.create().texOffs(45, 2).addBox(18.5F, 0.0F, 32.0429F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -2.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legL11 = body4.addOrReplaceChild("legL11", CubeListBuilder.create().texOffs(45, 1).addBox(32.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -1.5F));

		PartDefinition legL12 = body4.addOrReplaceChild("legL12", CubeListBuilder.create().texOffs(45, 0).addBox(36.4379F, 0.0F, -6.425F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -0.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition legR10 = body4.addOrReplaceChild("legR10", CubeListBuilder.create().texOffs(0, 45).addBox(34.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -2.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legR11 = body4.addOrReplaceChild("legR11", CubeListBuilder.create().texOffs(33, 43).addBox(29.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, -1.5F));

		PartDefinition legR12 = body4.addOrReplaceChild("legR12", CubeListBuilder.create().texOffs(0, 43).addBox(9.6547F, 0.0F, 34.7686F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -0.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition body5 = body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, 0.0F, 66.0F, 0.0F, 1.6581F, 0.0F));

		PartDefinition head5 = body5.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offset(0.0F, -3.75F, -3.0F));

		PartDefinition cube_r8 = head5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(3, 40).addBox(32.0429F, 12.0565F, 11.2815F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -1.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition antennaR5 = head5.addOrReplaceChild("antennaR5", CubeListBuilder.create().texOffs(0, 13).addBox(24.2964F, 2.9189F, 24.6248F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.75F, -1.5F, -0.2618F, 0.2618F, -0.3491F));

		PartDefinition antennaL5 = head5.addOrReplaceChild("antennaL5", CubeListBuilder.create().texOffs(0, 9).addBox(33.8727F, -14.2189F, 3.8966F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.75F, -1.5F, -0.2618F, -0.2618F, 0.3491F));

		PartDefinition abdomen5 = body5.addOrReplaceChild("abdomen5", CubeListBuilder.create(), PartPose.offset(0.0F, -3.9F, 0.0F));

		PartDefinition hindwingL5 = body5.addOrReplaceChild("hindwingL5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -3.8F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition forewingL5 = body5.addOrReplaceChild("forewingL5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition forewingR5 = body5.addOrReplaceChild("forewingR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -4.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition hindwingR5 = body5.addOrReplaceChild("hindwingR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.8F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL13 = body5.addOrReplaceChild("legL13", CubeListBuilder.create().texOffs(33, 41).addBox(18.5F, 0.0F, 32.0429F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -2.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legL14 = body5.addOrReplaceChild("legL14", CubeListBuilder.create().texOffs(41, 26).addBox(32.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -1.5F));

		PartDefinition legL15 = body5.addOrReplaceChild("legL15", CubeListBuilder.create().texOffs(41, 17).addBox(36.4379F, 0.0F, -6.425F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -0.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition legR13 = body5.addOrReplaceChild("legR13", CubeListBuilder.create().texOffs(41, 8).addBox(34.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -2.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legR14 = body5.addOrReplaceChild("legR14", CubeListBuilder.create().texOffs(33, 40).addBox(29.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, -1.5F));

		PartDefinition legR15 = body5.addOrReplaceChild("legR15", CubeListBuilder.create().texOffs(33, 39).addBox(9.6547F, 0.0F, 34.7686F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -0.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(38, 51).addBox(31.0429F, -4.026F, 15.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head6 = body6.addOrReplaceChild("head6", CubeListBuilder.create().texOffs(33, 4).addBox(31.5429F, -0.275F, 17.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 46).addBox(31.1929F, -0.276F, 17.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 35).addBox(31.8929F, -0.277F, 17.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, -3.0F));

		PartDefinition cube_r9 = head6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 39).addBox(32.0429F, 12.0565F, 11.2815F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -1.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition antennaR6 = head6.addOrReplaceChild("antennaR6", CubeListBuilder.create().texOffs(0, 4).addBox(24.2964F, 2.9189F, 24.6248F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.75F, -1.5F, -0.2618F, 0.2618F, -0.3491F));

		PartDefinition antennaL6 = head6.addOrReplaceChild("antennaL6", CubeListBuilder.create().texOffs(0, 0).addBox(33.8727F, -14.2189F, 3.8966F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 0.75F, -1.5F, -0.2618F, -0.2618F, 0.3491F));

		PartDefinition abdomen6 = body6.addOrReplaceChild("abdomen6", CubeListBuilder.create().texOffs(33, 0).addBox(31.0429F, -0.124F, 18.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.9F, 0.0F));

		PartDefinition hindwingL6 = body6.addOrReplaceChild("hindwingL6", CubeListBuilder.create().texOffs(0, 27).addBox(34.7686F, -0.225F, 11.6547F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.8F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition forewingL6 = body6.addOrReplaceChild("forewingL6", CubeListBuilder.create().texOffs(0, 18).addBox(28.3436F, -0.024F, 18.7831F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition forewingR6 = body6.addOrReplaceChild("forewingR6", CubeListBuilder.create().texOffs(0, 9).addBox(22.7686F, -0.024F, 7.6547F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition hindwingR6 = body6.addOrReplaceChild("hindwingR6", CubeListBuilder.create().texOffs(0, 0).addBox(16.3436F, -0.225F, 22.7831F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.8F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL16 = body6.addOrReplaceChild("legL16", CubeListBuilder.create().texOffs(33, 38).addBox(18.5F, 0.0F, 32.0429F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -2.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition legL17 = body6.addOrReplaceChild("legL17", CubeListBuilder.create().texOffs(0, 38).addBox(32.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -3.0F, -1.5F));

		PartDefinition legL18 = body6.addOrReplaceChild("legL18", CubeListBuilder.create().texOffs(33, 37).addBox(36.4379F, 0.0F, -6.425F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, -0.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition legR16 = body6.addOrReplaceChild("legR16", CubeListBuilder.create().texOffs(0, 37).addBox(34.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -2.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legR17 = body6.addOrReplaceChild("legR17", CubeListBuilder.create().texOffs(33, 36).addBox(29.0429F, 0.0F, 18.5F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -3.0F, -1.5F));

		PartDefinition legR18 = body6.addOrReplaceChild("legR18", CubeListBuilder.create().texOffs(0, 36).addBox(9.6547F, 0.0F, 34.7686F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, -0.5F, 0.0F, 0.6981F, 0.0F));

		return LayerDefinition.create(meshdefinition, 288, 162);
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