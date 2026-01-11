package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HelianthasterFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart root;
	private final ModelPart core;
	private final ModelPart armmiddlebase;
	private final ModelPart armbase;
	private final ModelPart arma;
	private final ModelPart armb;
	private final ModelPart armc;
	private final ModelPart armd;
	private final ModelPart armmiddlebase7;
	private final ModelPart armbase7;
	private final ModelPart arma7;
	private final ModelPart armb7;
	private final ModelPart armc7;
	private final ModelPart armd7;
	private final ModelPart armmiddlebase15;
	private final ModelPart armbase15;
	private final ModelPart arma15;
	private final ModelPart armb15;
	private final ModelPart armc15;
	private final ModelPart armd15;
	private final ModelPart armmiddlebase6;
	private final ModelPart armbase6;
	private final ModelPart arma6;
	private final ModelPart armb6;
	private final ModelPart armc6;
	private final ModelPart armd6;
	private final ModelPart armmiddlebase14;
	private final ModelPart armbase14;
	private final ModelPart arma14;
	private final ModelPart armb14;
	private final ModelPart armc14;
	private final ModelPart armd14;
	private final ModelPart armmiddlebase9;
	private final ModelPart armbase9;
	private final ModelPart arma9;
	private final ModelPart armb9;
	private final ModelPart armc9;
	private final ModelPart armd9;
	private final ModelPart armmiddlebase16;
	private final ModelPart armbase16;
	private final ModelPart arma16;
	private final ModelPart armb16;
	private final ModelPart armc16;
	private final ModelPart armd16;
	private final ModelPart armmiddlebase8;
	private final ModelPart armbase8;
	private final ModelPart arma8;
	private final ModelPart armb8;
	private final ModelPart armc8;
	private final ModelPart armd8;
	private final ModelPart armmiddlebase2;
	private final ModelPart armbase2;
	private final ModelPart arma2;
	private final ModelPart armb2;
	private final ModelPart armc2;
	private final ModelPart armd2;
	private final ModelPart armmiddlebase11;
	private final ModelPart armbase11;
	private final ModelPart arma11;
	private final ModelPart armb11;
	private final ModelPart armc11;
	private final ModelPart armd11;
	private final ModelPart armmiddlebase4;
	private final ModelPart armbase4;
	private final ModelPart arma4;
	private final ModelPart armb4;
	private final ModelPart armc4;
	private final ModelPart armd4;
	private final ModelPart armmiddlebase10;
	private final ModelPart armbase10;
	private final ModelPart arma10;
	private final ModelPart armb10;
	private final ModelPart armc10;
	private final ModelPart armd10;
	private final ModelPart armmiddlebase13;
	private final ModelPart armbase13;
	private final ModelPart arma13;
	private final ModelPart armb13;
	private final ModelPart armc13;
	private final ModelPart armd13;
	private final ModelPart armmiddlebase5;
	private final ModelPart armbase5;
	private final ModelPart arma5;
	private final ModelPart armb5;
	private final ModelPart armc5;
	private final ModelPart armd5;
	private final ModelPart armmiddlebase12;
	private final ModelPart armbase12;
	private final ModelPart arma12;
	private final ModelPart armb12;
	private final ModelPart armc12;
	private final ModelPart armd12;
	private final ModelPart armmiddlebase3;
	private final ModelPart armbase3;
	private final ModelPart arma3;
	private final ModelPart armb3;
	private final ModelPart armc3;
	private final ModelPart armd3;

	public HelianthasterFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.root = this.fossil.getChild("root");
		this.core = this.root.getChild("core");
		this.armmiddlebase = this.core.getChild("armmiddlebase");
		this.armbase = this.armmiddlebase.getChild("armbase");
		this.arma = this.armbase.getChild("arma");
		this.armb = this.arma.getChild("armb");
		this.armc = this.armb.getChild("armc");
		this.armd = this.armc.getChild("armd");
		this.armmiddlebase7 = this.core.getChild("armmiddlebase7");
		this.armbase7 = this.armmiddlebase7.getChild("armbase7");
		this.arma7 = this.armbase7.getChild("arma7");
		this.armb7 = this.arma7.getChild("armb7");
		this.armc7 = this.armb7.getChild("armc7");
		this.armd7 = this.armc7.getChild("armd7");
		this.armmiddlebase15 = this.core.getChild("armmiddlebase15");
		this.armbase15 = this.armmiddlebase15.getChild("armbase15");
		this.arma15 = this.armbase15.getChild("arma15");
		this.armb15 = this.arma15.getChild("armb15");
		this.armc15 = this.armb15.getChild("armc15");
		this.armd15 = this.armc15.getChild("armd15");
		this.armmiddlebase6 = this.core.getChild("armmiddlebase6");
		this.armbase6 = this.armmiddlebase6.getChild("armbase6");
		this.arma6 = this.armbase6.getChild("arma6");
		this.armb6 = this.arma6.getChild("armb6");
		this.armc6 = this.armb6.getChild("armc6");
		this.armd6 = this.armc6.getChild("armd6");
		this.armmiddlebase14 = this.core.getChild("armmiddlebase14");
		this.armbase14 = this.armmiddlebase14.getChild("armbase14");
		this.arma14 = this.armbase14.getChild("arma14");
		this.armb14 = this.arma14.getChild("armb14");
		this.armc14 = this.armb14.getChild("armc14");
		this.armd14 = this.armc14.getChild("armd14");
		this.armmiddlebase9 = this.core.getChild("armmiddlebase9");
		this.armbase9 = this.armmiddlebase9.getChild("armbase9");
		this.arma9 = this.armbase9.getChild("arma9");
		this.armb9 = this.arma9.getChild("armb9");
		this.armc9 = this.armb9.getChild("armc9");
		this.armd9 = this.armc9.getChild("armd9");
		this.armmiddlebase16 = this.core.getChild("armmiddlebase16");
		this.armbase16 = this.armmiddlebase16.getChild("armbase16");
		this.arma16 = this.armbase16.getChild("arma16");
		this.armb16 = this.arma16.getChild("armb16");
		this.armc16 = this.armb16.getChild("armc16");
		this.armd16 = this.armc16.getChild("armd16");
		this.armmiddlebase8 = this.core.getChild("armmiddlebase8");
		this.armbase8 = this.armmiddlebase8.getChild("armbase8");
		this.arma8 = this.armbase8.getChild("arma8");
		this.armb8 = this.arma8.getChild("armb8");
		this.armc8 = this.armb8.getChild("armc8");
		this.armd8 = this.armc8.getChild("armd8");
		this.armmiddlebase2 = this.core.getChild("armmiddlebase2");
		this.armbase2 = this.armmiddlebase2.getChild("armbase2");
		this.arma2 = this.armbase2.getChild("arma2");
		this.armb2 = this.arma2.getChild("armb2");
		this.armc2 = this.armb2.getChild("armc2");
		this.armd2 = this.armc2.getChild("armd2");
		this.armmiddlebase11 = this.core.getChild("armmiddlebase11");
		this.armbase11 = this.armmiddlebase11.getChild("armbase11");
		this.arma11 = this.armbase11.getChild("arma11");
		this.armb11 = this.arma11.getChild("armb11");
		this.armc11 = this.armb11.getChild("armc11");
		this.armd11 = this.armc11.getChild("armd11");
		this.armmiddlebase4 = this.core.getChild("armmiddlebase4");
		this.armbase4 = this.armmiddlebase4.getChild("armbase4");
		this.arma4 = this.armbase4.getChild("arma4");
		this.armb4 = this.arma4.getChild("armb4");
		this.armc4 = this.armb4.getChild("armc4");
		this.armd4 = this.armc4.getChild("armd4");
		this.armmiddlebase10 = this.core.getChild("armmiddlebase10");
		this.armbase10 = this.armmiddlebase10.getChild("armbase10");
		this.arma10 = this.armbase10.getChild("arma10");
		this.armb10 = this.arma10.getChild("armb10");
		this.armc10 = this.armb10.getChild("armc10");
		this.armd10 = this.armc10.getChild("armd10");
		this.armmiddlebase13 = this.core.getChild("armmiddlebase13");
		this.armbase13 = this.armmiddlebase13.getChild("armbase13");
		this.arma13 = this.armbase13.getChild("arma13");
		this.armb13 = this.arma13.getChild("armb13");
		this.armc13 = this.armb13.getChild("armc13");
		this.armd13 = this.armc13.getChild("armd13");
		this.armmiddlebase5 = this.core.getChild("armmiddlebase5");
		this.armbase5 = this.armmiddlebase5.getChild("armbase5");
		this.arma5 = this.armbase5.getChild("arma5");
		this.armb5 = this.arma5.getChild("armb5");
		this.armc5 = this.armb5.getChild("armc5");
		this.armd5 = this.armc5.getChild("armd5");
		this.armmiddlebase12 = this.core.getChild("armmiddlebase12");
		this.armbase12 = this.armmiddlebase12.getChild("armbase12");
		this.arma12 = this.armbase12.getChild("arma12");
		this.armb12 = this.arma12.getChild("armb12");
		this.armc12 = this.armb12.getChild("armc12");
		this.armd12 = this.armc12.getChild("armd12");
		this.armmiddlebase3 = this.core.getChild("armmiddlebase3");
		this.armbase3 = this.armmiddlebase3.getChild("armbase3");
		this.arma3 = this.armbase3.getChild("arma3");
		this.armb3 = this.arma3.getChild("armb3");
		this.armc3 = this.armb3.getChild("armc3");
		this.armd3 = this.armc3.getChild("armd3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 39).addBox(-44.0F, -2.0F, -17.0F, 89.0F, 2.0F, 36.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 78).addBox(-0.3628F, -2.0F, -0.2711F, 81.0F, 2.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-43.1F, 0.0F, -19.2F, 0.0F, 0.4014F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-96.0F, -2.0F, 0.0F, 96.0F, 2.0F, 36.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(45.0F, 0.0F, 19.0F, 0.0F, -0.4102F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2F, 0.0F));

		PartDefinition core = root.addOrReplaceChild("core", CubeListBuilder.create().texOffs(0, 78).addBox(-4.5F, -1.475F, -5.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition armmiddlebase = core.addOrReplaceChild("armmiddlebase", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition armbase = armmiddlebase.addOrReplaceChild("armbase", CubeListBuilder.create().texOffs(45, 161).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma = armbase.addOrReplaceChild("arma", CubeListBuilder.create().texOffs(25, 130).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition armb = arma.addOrReplaceChild("armb", CubeListBuilder.create().texOffs(148, 131).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition armc = armb.addOrReplaceChild("armc", CubeListBuilder.create().texOffs(167, 155).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition armd = armc.addOrReplaceChild("armd", CubeListBuilder.create().texOffs(75, 161).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -7.0F));

		PartDefinition armmiddlebase7 = core.addOrReplaceChild("armmiddlebase7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition armbase7 = armmiddlebase7.addOrReplaceChild("armbase7", CubeListBuilder.create().texOffs(70, 150).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma7 = armbase7.addOrReplaceChild("arma7", CubeListBuilder.create().texOffs(100, 119).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition armb7 = arma7.addOrReplaceChild("armb7", CubeListBuilder.create().texOffs(23, 142).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition armc7 = armb7.addOrReplaceChild("armc7", CubeListBuilder.create().texOffs(164, 128).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition armd7 = armc7.addOrReplaceChild("armd7", CubeListBuilder.create().texOffs(115, 160).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition armmiddlebase15 = core.addOrReplaceChild("armmiddlebase15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition armbase15 = armmiddlebase15.addOrReplaceChild("armbase15", CubeListBuilder.create().texOffs(57, 140).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma15 = armbase15.addOrReplaceChild("arma15", CubeListBuilder.create().texOffs(0, 119).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition armb15 = arma15.addOrReplaceChild("armb15", CubeListBuilder.create().texOffs(65, 140).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition armc15 = armb15.addOrReplaceChild("armc15", CubeListBuilder.create().texOffs(162, 144).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition armd15 = armc15.addOrReplaceChild("armd15", CubeListBuilder.create().texOffs(150, 151).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition armmiddlebase6 = core.addOrReplaceChild("armmiddlebase6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition armbase6 = armmiddlebase6.addOrReplaceChild("armbase6", CubeListBuilder.create().texOffs(16, 130).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma6 = armbase6.addOrReplaceChild("arma6", CubeListBuilder.create().texOffs(0, 50).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition armb6 = arma6.addOrReplaceChild("armb6", CubeListBuilder.create().texOffs(132, 119).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition armc6 = armb6.addOrReplaceChild("armc6", CubeListBuilder.create().texOffs(16, 50).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition armd6 = armc6.addOrReplaceChild("armd6", CubeListBuilder.create().texOffs(58, 150).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition armmiddlebase14 = core.addOrReplaceChild("armmiddlebase14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition armbase14 = armmiddlebase14.addOrReplaceChild("armbase14", CubeListBuilder.create().texOffs(16, 119).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma14 = armbase14.addOrReplaceChild("arma14", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition armb14 = arma14.addOrReplaceChild("armb14", CubeListBuilder.create().texOffs(50, 130).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition armc14 = armb14.addOrReplaceChild("armc14", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition armd14 = armc14.addOrReplaceChild("armd14", CubeListBuilder.create().texOffs(16, 92).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition armmiddlebase9 = core.addOrReplaceChild("armmiddlebase9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition armbase9 = armmiddlebase9.addOrReplaceChild("armbase9", CubeListBuilder.create().texOffs(91, 119).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma9 = armbase9.addOrReplaceChild("arma9", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition armb9 = arma9.addOrReplaceChild("armb9", CubeListBuilder.create().texOffs(111, 132).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition armc9 = armb9.addOrReplaceChild("armc9", CubeListBuilder.create().texOffs(16, 39).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition armd9 = armc9.addOrReplaceChild("armd9", CubeListBuilder.create().texOffs(37, 150).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition armmiddlebase16 = core.addOrReplaceChild("armmiddlebase16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition armbase16 = armmiddlebase16.addOrReplaceChild("armbase16", CubeListBuilder.create().texOffs(88, 130).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma16 = armbase16.addOrReplaceChild("arma16", CubeListBuilder.create().texOffs(0, 101).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -3.0F));

		PartDefinition armb16 = arma16.addOrReplaceChild("armb16", CubeListBuilder.create().texOffs(42, 140).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition armc16 = armb16.addOrReplaceChild("armc16", CubeListBuilder.create().texOffs(136, 162).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition armd16 = armc16.addOrReplaceChild("armd16", CubeListBuilder.create().texOffs(129, 151).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition armmiddlebase8 = core.addOrReplaceChild("armmiddlebase8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armbase8 = armmiddlebase8.addOrReplaceChild("armbase8", CubeListBuilder.create().texOffs(49, 150).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma8 = armbase8.addOrReplaceChild("arma8", CubeListBuilder.create().texOffs(75, 119).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition armb8 = arma8.addOrReplaceChild("armb8", CubeListBuilder.create().texOffs(141, 141).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition armc8 = armb8.addOrReplaceChild("armc8", CubeListBuilder.create().texOffs(12, 164).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition armd8 = armc8.addOrReplaceChild("armd8", CubeListBuilder.create().texOffs(103, 154).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition armmiddlebase2 = core.addOrReplaceChild("armmiddlebase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition armbase2 = armmiddlebase2.addOrReplaceChild("armbase2", CubeListBuilder.create().texOffs(141, 151).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma2 = armbase2.addOrReplaceChild("arma2", CubeListBuilder.create().texOffs(0, 130).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition armb2 = arma2.addOrReplaceChild("armb2", CubeListBuilder.create().texOffs(148, 121).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition armc2 = armb2.addOrReplaceChild("armc2", CubeListBuilder.create().texOffs(101, 167).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition armd2 = armc2.addOrReplaceChild("armd2", CubeListBuilder.create().texOffs(54, 161).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition armmiddlebase11 = core.addOrReplaceChild("armmiddlebase11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, -1.1781F, 0.0F));

		PartDefinition armbase11 = armmiddlebase11.addOrReplaceChild("armbase11", CubeListBuilder.create().texOffs(15, 141).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma11 = armbase11.addOrReplaceChild("arma11", CubeListBuilder.create().texOffs(50, 119).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition armb11 = arma11.addOrReplaceChild("armb11", CubeListBuilder.create().texOffs(0, 141).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition armc11 = armb11.addOrReplaceChild("armc11", CubeListBuilder.create().texOffs(163, 119).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition armd11 = armc11.addOrReplaceChild("armd11", CubeListBuilder.create().texOffs(91, 152).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition armmiddlebase4 = core.addOrReplaceChild("armmiddlebase4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, -1.9635F, 0.0F));

		PartDefinition armbase4 = armmiddlebase4.addOrReplaceChild("armbase4", CubeListBuilder.create().texOffs(65, 130).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma4 = armbase4.addOrReplaceChild("arma4", CubeListBuilder.create().texOffs(0, 90).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition armb4 = arma4.addOrReplaceChild("armb4", CubeListBuilder.create().texOffs(126, 139).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition armc4 = armb4.addOrReplaceChild("armc4", CubeListBuilder.create().texOffs(0, 162).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition armd4 = armc4.addOrReplaceChild("armd4", CubeListBuilder.create().texOffs(0, 151).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition armmiddlebase10 = core.addOrReplaceChild("armmiddlebase10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, -2.7489F, 0.0F));

		PartDefinition armbase10 = armmiddlebase10.addOrReplaceChild("armbase10", CubeListBuilder.create().texOffs(66, 119).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma10 = armbase10.addOrReplaceChild("arma10", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition armb10 = arma10.addOrReplaceChild("armb10", CubeListBuilder.create().texOffs(96, 130).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition armc10 = armb10.addOrReplaceChild("armc10", CubeListBuilder.create().texOffs(16, 22).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.8727F, 0.0F));

		PartDefinition armd10 = armc10.addOrReplaceChild("armd10", CubeListBuilder.create().texOffs(117, 149).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition armmiddlebase13 = core.addOrReplaceChild("armmiddlebase13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, 2.7489F, 0.0F));

		PartDefinition armbase13 = armmiddlebase13.addOrReplaceChild("armbase13", CubeListBuilder.create().texOffs(41, 119).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma13 = armbase13.addOrReplaceChild("arma13", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition armb13 = arma13.addOrReplaceChild("armb13", CubeListBuilder.create().texOffs(73, 130).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition armc13 = armb13.addOrReplaceChild("armc13", CubeListBuilder.create().texOffs(16, 11).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition armd13 = armc13.addOrReplaceChild("armd13", CubeListBuilder.create().texOffs(16, 103).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition armmiddlebase5 = core.addOrReplaceChild("armmiddlebase5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, 1.9635F, 0.0F));

		PartDefinition armbase5 = armmiddlebase5.addOrReplaceChild("armbase5", CubeListBuilder.create().texOffs(41, 130).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma5 = armbase5.addOrReplaceChild("arma5", CubeListBuilder.create().texOffs(0, 61).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition armb5 = arma5.addOrReplaceChild("armb5", CubeListBuilder.create().texOffs(133, 129).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition armc5 = armb5.addOrReplaceChild("armc5", CubeListBuilder.create().texOffs(16, 61).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition armd5 = armc5.addOrReplaceChild("armd5", CubeListBuilder.create().texOffs(79, 150).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition armmiddlebase12 = core.addOrReplaceChild("armmiddlebase12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, 1.1781F, 0.0F));

		PartDefinition armbase12 = armmiddlebase12.addOrReplaceChild("armbase12", CubeListBuilder.create().texOffs(80, 140).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma12 = armbase12.addOrReplaceChild("arma12", CubeListBuilder.create().texOffs(25, 119).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition armb12 = arma12.addOrReplaceChild("armb12", CubeListBuilder.create().texOffs(88, 140).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition armc12 = armb12.addOrReplaceChild("armc12", CubeListBuilder.create().texOffs(155, 162).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition armd12 = armc12.addOrReplaceChild("armd12", CubeListBuilder.create().texOffs(21, 152).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition armmiddlebase3 = core.addOrReplaceChild("armmiddlebase3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, -1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition armbase3 = armmiddlebase3.addOrReplaceChild("armbase3", CubeListBuilder.create().texOffs(12, 151).addBox(-1.5F, -1.3F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.5F));

		PartDefinition arma3 = armbase3.addOrReplaceChild("arma3", CubeListBuilder.create().texOffs(116, 121).addBox(-1.5F, -0.51F, -9.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition armb3 = arma3.addOrReplaceChild("armb3", CubeListBuilder.create().texOffs(103, 142).addBox(-1.5F, -0.5F, -8.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition armc3 = armb3.addOrReplaceChild("armc3", CubeListBuilder.create().texOffs(89, 165).addBox(-1.0F, -0.51F, -7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition armd3 = armc3.addOrReplaceChild("armd3", CubeListBuilder.create().texOffs(33, 161).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 272, 180);
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