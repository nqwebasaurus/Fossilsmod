package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KerygmachelaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart head;
	private final ModelPart mouthtentacle;
	private final ModelPart body1;
	private final ModelPart finL1;
	private final ModelPart finR1;
	private final ModelPart legL1;
	private final ModelPart legR1;
	private final ModelPart body2;
	private final ModelPart finL2;
	private final ModelPart finR2;
	private final ModelPart legL2;
	private final ModelPart legR2;
	private final ModelPart body3;
	private final ModelPart finL3;
	private final ModelPart finR3;
	private final ModelPart legL3;
	private final ModelPart legR3;
	private final ModelPart body4;
	private final ModelPart finL4;
	private final ModelPart finR4;
	private final ModelPart legL4;
	private final ModelPart legR4;
	private final ModelPart body5;
	private final ModelPart finL5;
	private final ModelPart finR5;
	private final ModelPart legL5;
	private final ModelPart legR5;
	private final ModelPart body6;
	private final ModelPart finL6;
	private final ModelPart finR6;
	private final ModelPart legL6;
	private final ModelPart legR6;
	private final ModelPart body7;
	private final ModelPart finL7;
	private final ModelPart finR7;
	private final ModelPart legL7;
	private final ModelPart legR7;
	private final ModelPart body8;
	private final ModelPart finL8;
	private final ModelPart finR8;
	private final ModelPart legL8;
	private final ModelPart legR8;
	private final ModelPart body9;
	private final ModelPart finL9;
	private final ModelPart finR9;
	private final ModelPart legL9;
	private final ModelPart legR9;
	private final ModelPart body10;
	private final ModelPart finL10;
	private final ModelPart finR10;
	private final ModelPart legL10;
	private final ModelPart legR10;
	private final ModelPart body11;
	private final ModelPart finL11;
	private final ModelPart finR11;
	private final ModelPart legL11;
	private final ModelPart legR11;
	private final ModelPart tail;
	private final ModelPart appendageR;
	private final ModelPart appendageR1;
	private final ModelPart appendageL;
	private final ModelPart appendageL1;
	private final ModelPart head2;
	private final ModelPart mouthtentacle2;
	private final ModelPart body12;
	private final ModelPart finL12;
	private final ModelPart finR12;
	private final ModelPart body13;
	private final ModelPart finL13;
	private final ModelPart finR13;
	private final ModelPart body14;
	private final ModelPart finL14;
	private final ModelPart finR14;
	private final ModelPart body15;
	private final ModelPart finL15;
	private final ModelPart finR15;
	private final ModelPart body16;
	private final ModelPart finL16;
	private final ModelPart finR16;
	private final ModelPart body17;
	private final ModelPart finL17;
	private final ModelPart finR17;
	private final ModelPart body18;
	private final ModelPart finL18;
	private final ModelPart finR18;
	private final ModelPart body19;
	private final ModelPart finL19;
	private final ModelPart finR19;
	private final ModelPart body20;
	private final ModelPart finL20;
	private final ModelPart finR20;
	private final ModelPart body21;
	private final ModelPart finL21;
	private final ModelPart finR21;
	private final ModelPart body22;
	private final ModelPart finL22;
	private final ModelPart finR22;
	private final ModelPart tail2;
	private final ModelPart appendageR2;
	private final ModelPart appendageR3;
	private final ModelPart appendageL2;
	private final ModelPart appendageL3;

	public KerygmachelaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.head = this.fossil.getChild("head");
		this.mouthtentacle = this.head.getChild("mouthtentacle");
		this.body1 = this.head.getChild("body1");
		this.finL1 = this.body1.getChild("finL1");
		this.finR1 = this.body1.getChild("finR1");
		this.legL1 = this.body1.getChild("legL1");
		this.legR1 = this.body1.getChild("legR1");
		this.body2 = this.body1.getChild("body2");
		this.finL2 = this.body2.getChild("finL2");
		this.finR2 = this.body2.getChild("finR2");
		this.legL2 = this.body2.getChild("legL2");
		this.legR2 = this.body2.getChild("legR2");
		this.body3 = this.body2.getChild("body3");
		this.finL3 = this.body3.getChild("finL3");
		this.finR3 = this.body3.getChild("finR3");
		this.legL3 = this.body3.getChild("legL3");
		this.legR3 = this.body3.getChild("legR3");
		this.body4 = this.body3.getChild("body4");
		this.finL4 = this.body4.getChild("finL4");
		this.finR4 = this.body4.getChild("finR4");
		this.legL4 = this.body4.getChild("legL4");
		this.legR4 = this.body4.getChild("legR4");
		this.body5 = this.body4.getChild("body5");
		this.finL5 = this.body5.getChild("finL5");
		this.finR5 = this.body5.getChild("finR5");
		this.legL5 = this.body5.getChild("legL5");
		this.legR5 = this.body5.getChild("legR5");
		this.body6 = this.body5.getChild("body6");
		this.finL6 = this.body6.getChild("finL6");
		this.finR6 = this.body6.getChild("finR6");
		this.legL6 = this.body6.getChild("legL6");
		this.legR6 = this.body6.getChild("legR6");
		this.body7 = this.body6.getChild("body7");
		this.finL7 = this.body7.getChild("finL7");
		this.finR7 = this.body7.getChild("finR7");
		this.legL7 = this.body7.getChild("legL7");
		this.legR7 = this.body7.getChild("legR7");
		this.body8 = this.body7.getChild("body8");
		this.finL8 = this.body8.getChild("finL8");
		this.finR8 = this.body8.getChild("finR8");
		this.legL8 = this.body8.getChild("legL8");
		this.legR8 = this.body8.getChild("legR8");
		this.body9 = this.body8.getChild("body9");
		this.finL9 = this.body9.getChild("finL9");
		this.finR9 = this.body9.getChild("finR9");
		this.legL9 = this.body9.getChild("legL9");
		this.legR9 = this.body9.getChild("legR9");
		this.body10 = this.body9.getChild("body10");
		this.finL10 = this.body10.getChild("finL10");
		this.finR10 = this.body10.getChild("finR10");
		this.legL10 = this.body10.getChild("legL10");
		this.legR10 = this.body10.getChild("legR10");
		this.body11 = this.body10.getChild("body11");
		this.finL11 = this.body11.getChild("finL11");
		this.finR11 = this.body11.getChild("finR11");
		this.legL11 = this.body11.getChild("legL11");
		this.legR11 = this.body11.getChild("legR11");
		this.tail = this.body11.getChild("tail");
		this.appendageR = this.head.getChild("appendageR");
		this.appendageR1 = this.appendageR.getChild("appendageR1");
		this.appendageL = this.head.getChild("appendageL");
		this.appendageL1 = this.appendageL.getChild("appendageL1");
		this.head2 = this.fossil.getChild("head2");
		this.mouthtentacle2 = this.head2.getChild("mouthtentacle2");
		this.body12 = this.head2.getChild("body12");
		this.finL12 = this.body12.getChild("finL12");
		this.finR12 = this.body12.getChild("finR12");
		this.body13 = this.body12.getChild("body13");
		this.finL13 = this.body13.getChild("finL13");
		this.finR13 = this.body13.getChild("finR13");
		this.body14 = this.body13.getChild("body14");
		this.finL14 = this.body14.getChild("finL14");
		this.finR14 = this.body14.getChild("finR14");
		this.body15 = this.body14.getChild("body15");
		this.finL15 = this.body15.getChild("finL15");
		this.finR15 = this.body15.getChild("finR15");
		this.body16 = this.body15.getChild("body16");
		this.finL16 = this.body16.getChild("finL16");
		this.finR16 = this.body16.getChild("finR16");
		this.body17 = this.body16.getChild("body17");
		this.finL17 = this.body17.getChild("finL17");
		this.finR17 = this.body17.getChild("finR17");
		this.body18 = this.body17.getChild("body18");
		this.finL18 = this.body18.getChild("finL18");
		this.finR18 = this.body18.getChild("finR18");
		this.body19 = this.body18.getChild("body19");
		this.finL19 = this.body19.getChild("finL19");
		this.finR19 = this.body19.getChild("finR19");
		this.body20 = this.body19.getChild("body20");
		this.finL20 = this.body20.getChild("finL20");
		this.finR20 = this.body20.getChild("finR20");
		this.body21 = this.body20.getChild("body21");
		this.finL21 = this.body21.getChild("finL21");
		this.finR21 = this.body21.getChild("finR21");
		this.body22 = this.body21.getChild("body22");
		this.finL22 = this.body22.getChild("finL22");
		this.finR22 = this.body22.getChild("finR22");
		this.tail2 = this.body22.getChild("tail2");
		this.appendageR2 = this.head2.getChild("appendageR2");
		this.appendageR3 = this.appendageR2.getChild("appendageR3");
		this.appendageL2 = this.head2.getChild("appendageL2");
		this.appendageL3 = this.appendageL2.getChild("appendageL3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 48).addBox(-28.6026F, -1.0F, -24.8502F, 8.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(5.6026F, 23.0F, -1.1498F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(5.5F, -1.0F, 0.4F, 11.0F, 2.0F, 9.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 0).addBox(5.5F, -1.0F, -0.3F, 11.0F, 2.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.6334F, 0.0F, 10.7397F, 0.0F, 1.3526F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 48).addBox(-37.2F, -1.0F, -6.7F, 25.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.4514F, 0.0F, -8.187F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 67).addBox(3.6F, -1.0F, -6.6F, 22.0F, 2.0F, 16.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-7.1923F, 0.0F, -7.7863F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-17.4F, -1.0F, -13.1F, 34.0F, 2.0F, 45.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.1923F, 0.0F, -7.7863F, 0.0F, -0.2618F, 0.0F));

		PartDefinition head = fossil.addOrReplaceChild("head", CubeListBuilder.create().texOffs(21, 82).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-1.51F, -1.21F, -7.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.6026F, -2.45F, -2.8502F, 0.0F, 0.0F, -3.1416F));

		PartDefinition mouthtentacle = head.addOrReplaceChild("mouthtentacle", CubeListBuilder.create().texOffs(7, 70).addBox(0.0F, -0.65F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 69).addBox(-1.5F, -0.65F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -7.0F));

		PartDefinition body1 = head.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(9, 68).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -4.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition finL1 = body1.addOrReplaceChild("finL1", CubeListBuilder.create().texOffs(0, 64).addBox(-1.5F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition finR1 = body1.addOrReplaceChild("finR1", CubeListBuilder.create().texOffs(48, 62).addBox(-2.5F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL1 = body1.addOrReplaceChild("legL1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 1.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r5 = legL1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 82).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR1 = body1.addOrReplaceChild("legR1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, 0.5F, 0.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r6 = legR1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 82).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, -0.2F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 68).addBox(-1.49F, 0.09F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL2 = body2.addOrReplaceChild("finL2", CubeListBuilder.create().texOffs(11, 62).addBox(-1.0F, -0.005F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition finR2 = body2.addOrReplaceChild("finR2", CubeListBuilder.create().texOffs(0, 62).addBox(-3.0F, -0.005F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition legL2 = body2.addOrReplaceChild("legL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 0.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r7 = legL2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR2 = body2.addOrReplaceChild("legR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, 0.5F, 1.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r8 = legR2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 77).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, -0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(66, 67).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL3 = body3.addOrReplaceChild("finL3", CubeListBuilder.create().texOffs(48, 60).addBox(-0.75F, -0.01F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition finR3 = body3.addOrReplaceChild("finR3", CubeListBuilder.create().texOffs(11, 60).addBox(-3.25F, -0.01F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition legL3 = body3.addOrReplaceChild("legL3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 0.1F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r9 = legL3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 77).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR3 = body3.addOrReplaceChild("legR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, 0.5F, 1.1F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r10 = legR3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, -0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(57, 67).addBox(-1.49F, 0.09F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL4 = body4.addOrReplaceChild("finL4", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.015F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR4 = body4.addOrReplaceChild("finR4", CubeListBuilder.create().texOffs(48, 58).addBox(-3.5F, -0.015F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL4 = body4.addOrReplaceChild("legL4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 1.2F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r11 = legL4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 76).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, -0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR4 = body4.addOrReplaceChild("legR4", CubeListBuilder.create(), PartPose.offset(-1.25F, 0.5F, 0.3F));

		PartDefinition cube_r12 = legR4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 76).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(48, 67).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition finL5 = body5.addOrReplaceChild("finL5", CubeListBuilder.create().texOffs(11, 58).addBox(-0.5F, -0.02F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR5 = body5.addOrReplaceChild("finR5", CubeListBuilder.create().texOffs(0, 58).addBox(-3.5F, -0.02F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL5 = body5.addOrReplaceChild("legL5", CubeListBuilder.create(), PartPose.offset(1.25F, 0.5F, 0.3F));

		PartDefinition cube_r13 = legL5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 76).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR5 = body5.addOrReplaceChild("legR5", CubeListBuilder.create(), PartPose.offset(-1.25F, 0.5F, 0.4F));

		PartDefinition cube_r14 = legR5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 76).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(18, 66).addBox(-1.49F, 0.09F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL6 = body6.addOrReplaceChild("finL6", CubeListBuilder.create().texOffs(48, 56).addBox(-0.75F, -0.025F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR6 = body6.addOrReplaceChild("finR6", CubeListBuilder.create().texOffs(11, 56).addBox(-3.25F, -0.025F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL6 = body6.addOrReplaceChild("legL6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 0.4F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r15 = legL6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(6, 76).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR6 = body6.addOrReplaceChild("legR6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, 0.5F, 0.5F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r16 = legR6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(48, 75).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(9, 66).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL7 = body7.addOrReplaceChild("finL7", CubeListBuilder.create().texOffs(0, 56).addBox(-0.75F, -0.03F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR7 = body7.addOrReplaceChild("finR7", CubeListBuilder.create().texOffs(48, 54).addBox(-3.25F, -0.03F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition legL7 = body7.addOrReplaceChild("legL7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 0.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r17 = legL7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 75).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR7 = body7.addOrReplaceChild("legR7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, 0.5F, 0.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r18 = legR7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.22F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(0, 66).addBox(-1.49F, 0.09F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition finL8 = body8.addOrReplaceChild("finL8", CubeListBuilder.create().texOffs(11, 54).addBox(-1.0F, -0.035F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition finR8 = body8.addOrReplaceChild("finR8", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -0.035F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL8 = body8.addOrReplaceChild("legL8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 0.5F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r19 = legL8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(68, 74).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR8 = body8.addOrReplaceChild("legR8", CubeListBuilder.create(), PartPose.offset(-1.25F, 0.5F, 0.5F));

		PartDefinition cube_r20 = legR8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 74).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(20, 64).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL9 = body9.addOrReplaceChild("finL9", CubeListBuilder.create().texOffs(48, 52).addBox(-1.25F, -0.04F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, -0.2618F, 0.0F));

		PartDefinition finR9 = body9.addOrReplaceChild("finR9", CubeListBuilder.create().texOffs(11, 52).addBox(-2.75F, -0.04F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL9 = body9.addOrReplaceChild("legL9", CubeListBuilder.create(), PartPose.offset(1.25F, 0.5F, 0.7F));

		PartDefinition cube_r21 = legL9.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(54, 74).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR9 = body9.addOrReplaceChild("legR9", CubeListBuilder.create(), PartPose.offset(-1.25F, 0.5F, 0.5F));

		PartDefinition cube_r22 = legR9.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(13, 74).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.26F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(11, 64).addBox(-1.49F, 0.09F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL10 = body10.addOrReplaceChild("finL10", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, -0.045F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, -0.3491F, 0.0F));

		PartDefinition finR10 = body10.addOrReplaceChild("finR10", CubeListBuilder.create().texOffs(48, 50).addBox(-2.5F, -0.045F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition legL10 = body10.addOrReplaceChild("legL10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 0.7F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r23 = legL10.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(6, 74).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR10 = body10.addOrReplaceChild("legR10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, 0.5F, 0.5F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r24 = legR10.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body11 = body10.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(22, 62).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL11 = body11.addOrReplaceChild("finL11", CubeListBuilder.create().texOffs(11, 50).addBox(-1.75F, -0.05F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, -0.48F, 0.0F));

		PartDefinition finR11 = body11.addOrReplaceChild("finR11", CubeListBuilder.create().texOffs(0, 50).addBox(-2.25F, -0.05F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL11 = body11.addOrReplaceChild("legL11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 0.5F, 0.5F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r25 = legL11.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(67, 72).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition legR11 = body11.addOrReplaceChild("legR11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, 0.5F, 0.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r26 = legR11.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 72).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.5F, 3.1416F, 0.0F, 0.0F));

		PartDefinition tail = body11.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition appendageR = head.addOrReplaceChild("appendageR", CubeListBuilder.create().texOffs(0, 28).addBox(-3.5F, -0.1F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 35).addBox(-4.5F, -0.1F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.25F, -5.75F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r27 = appendageR.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(12, 71).addBox(-0.5F, -0.15F, -1.1F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.0F, -1.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r28 = appendageR.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 71).addBox(0.0F, -0.15F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.0F, -1.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition appendageR1 = appendageR.addOrReplaceChild("appendageR1", CubeListBuilder.create().texOffs(18, 22).addBox(-8.0F, 0.0F, -3.5F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.0F, -0.25F, 0.0F, -0.2618F, 0.0F));

		PartDefinition appendageL = head.addOrReplaceChild("appendageL", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.1F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 37).addBox(3.5F, -0.1F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.25F, -5.75F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r29 = appendageL.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -1.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r30 = appendageL.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 72).addBox(-1.0F, -0.15F, -1.6F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0F, -1.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition appendageL1 = appendageL.addOrReplaceChild("appendageL1", CubeListBuilder.create().texOffs(18, 28).addBox(0.0F, 0.0F, -3.5F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.0F, -0.25F, 0.0F, 0.2618F, 0.0F));

		PartDefinition head2 = fossil.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(53, 72).addBox(-1.0F, -1.0F, -7.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-1.51F, -1.01F, -7.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.3974F, -0.25F, 1.1498F, 0.0F, 1.3526F, 0.0F));

		PartDefinition mouthtentacle2 = head2.addOrReplaceChild("mouthtentacle2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -7.0F));

		PartDefinition body12 = head2.addOrReplaceChild("body12", CubeListBuilder.create().texOffs(22, 60).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -4.0F));

		PartDefinition finL12 = body12.addOrReplaceChild("finL12", CubeListBuilder.create().texOffs(48, 48).addBox(-1.5F, 0.1F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR12 = body12.addOrReplaceChild("finR12", CubeListBuilder.create().texOffs(11, 48).addBox(-2.5F, 0.1F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body13 = body12.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(22, 58).addBox(-1.49F, -0.01F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL13 = body13.addOrReplaceChild("finL13", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, 0.095F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR13 = body13.addOrReplaceChild("finR13", CubeListBuilder.create().texOffs(32, 43).addBox(-3.0F, 0.095F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body14 = body13.addOrReplaceChild("body14", CubeListBuilder.create().texOffs(22, 56).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL14 = body14.addOrReplaceChild("finL14", CubeListBuilder.create().texOffs(29, 41).addBox(-0.75F, 0.09F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR14 = body14.addOrReplaceChild("finR14", CubeListBuilder.create().texOffs(18, 41).addBox(-3.25F, 0.09F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body15 = body14.addOrReplaceChild("body15", CubeListBuilder.create().texOffs(22, 54).addBox(-1.49F, -0.01F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL15 = body15.addOrReplaceChild("finL15", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.085F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR15 = body15.addOrReplaceChild("finR15", CubeListBuilder.create().texOffs(29, 39).addBox(-3.5F, 0.085F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body16 = body15.addOrReplaceChild("body16", CubeListBuilder.create().texOffs(22, 52).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL16 = body16.addOrReplaceChild("finL16", CubeListBuilder.create().texOffs(18, 39).addBox(-0.5F, 0.08F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR16 = body16.addOrReplaceChild("finR16", CubeListBuilder.create().texOffs(0, 38).addBox(-3.5F, 0.08F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body17 = body16.addOrReplaceChild("body17", CubeListBuilder.create().texOffs(22, 50).addBox(-1.49F, -0.01F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL17 = body17.addOrReplaceChild("finL17", CubeListBuilder.create().texOffs(29, 37).addBox(-0.75F, 0.075F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR17 = body17.addOrReplaceChild("finR17", CubeListBuilder.create().texOffs(18, 37).addBox(-3.25F, 0.075F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body18 = body17.addOrReplaceChild("body18", CubeListBuilder.create().texOffs(22, 48).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL18 = body18.addOrReplaceChild("finL18", CubeListBuilder.create().texOffs(0, 36).addBox(-0.75F, 0.07F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR18 = body18.addOrReplaceChild("finR18", CubeListBuilder.create().texOffs(29, 35).addBox(-3.25F, 0.07F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body19 = body18.addOrReplaceChild("body19", CubeListBuilder.create().texOffs(0, 6).addBox(-1.49F, -0.01F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL19 = body19.addOrReplaceChild("finL19", CubeListBuilder.create().texOffs(18, 35).addBox(-1.0F, 0.065F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR19 = body19.addOrReplaceChild("finR19", CubeListBuilder.create().texOffs(0, 34).addBox(-3.0F, 0.065F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body20 = body19.addOrReplaceChild("body20", CubeListBuilder.create().texOffs(0, 4).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL20 = body20.addOrReplaceChild("finL20", CubeListBuilder.create().texOffs(29, 33).addBox(-1.25F, 0.06F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR20 = body20.addOrReplaceChild("finR20", CubeListBuilder.create().texOffs(18, 33).addBox(-2.75F, 0.06F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body21 = body20.addOrReplaceChild("body21", CubeListBuilder.create().texOffs(0, 2).addBox(-1.49F, -0.01F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL21 = body21.addOrReplaceChild("finL21", CubeListBuilder.create().texOffs(32, 6).addBox(-1.5F, 0.055F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR21 = body21.addOrReplaceChild("finR21", CubeListBuilder.create().texOffs(32, 4).addBox(-2.5F, 0.055F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition body22 = body21.addOrReplaceChild("body22", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition finL22 = body22.addOrReplaceChild("finL22", CubeListBuilder.create().texOffs(32, 2).addBox(-1.75F, 0.05F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.5F));

		PartDefinition finR22 = body22.addOrReplaceChild("finR22", CubeListBuilder.create().texOffs(32, 0).addBox(-2.25F, 0.05F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.5F));

		PartDefinition tail2 = body22.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition appendageR2 = head2.addOrReplaceChild("appendageR2", CubeListBuilder.create().texOffs(0, 23).addBox(-3.5F, 0.3F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 16).addBox(-4.5F, 0.3F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.25F, -5.75F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r31 = appendageR2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 68).addBox(2.2F, 0.35F, 0.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 68).addBox(1.1F, 0.35F, -0.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(0.0F, 0.35F, -1.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.0F, -1.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition appendageR3 = appendageR2.addOrReplaceChild("appendageR3", CubeListBuilder.create().texOffs(18, 17).addBox(-7.9447F, 0.3F, -3.0411F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.0F, -0.25F, 0.0F, -0.0436F, 0.0F));

		PartDefinition appendageL2 = head2.addOrReplaceChild("appendageL2", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.3F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 12).addBox(3.5F, 0.3F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.25F, -5.75F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r32 = appendageL2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(48, 69).addBox(-3.0F, 0.45F, 0.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 69).addBox(-1.9F, 0.45F, -0.7F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(69, 69).addBox(-0.7F, 0.45F, -1.4F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0F, -1.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition appendageL3 = appendageL2.addOrReplaceChild("appendageL3", CubeListBuilder.create().texOffs(18, 12).addBox(0.0F, 0.3F, -3.5F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.0F, -0.25F, 0.0F, 0.0436F, 0.0F));

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