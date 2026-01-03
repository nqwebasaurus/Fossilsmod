package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CrotalocephalusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Crotalocephalus;
	private final ModelPart Cephalon3;
	private final ModelPart Thorax2;
	private final ModelPart ThoracicSegment6;
	private final ModelPart LegL6;
	private final ModelPart LegL5;
	private final ModelPart ThoracicSegment7;
	private final ModelPart LegL7;
	private final ModelPart LegL10;
	private final ModelPart ThoracicSegment8;
	private final ModelPart LegL8;
	private final ModelPart LegL11;
	private final ModelPart ThoracicSegment9;
	private final ModelPart LegL9;
	private final ModelPart LegL12;
	private final ModelPart ThoracicSegment2;
	private final ModelPart LegL2;
	private final ModelPart LegL13;
	private final ModelPart ThoracicSegment3;
	private final ModelPart LegL3;
	private final ModelPart LegL4;
	private final ModelPart Rock;

	public CrotalocephalusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Crotalocephalus = this.fossil.getChild("Crotalocephalus");
		this.Cephalon3 = this.Crotalocephalus.getChild("Cephalon3");
		this.Thorax2 = this.Crotalocephalus.getChild("Thorax2");
		this.ThoracicSegment6 = this.Thorax2.getChild("ThoracicSegment6");
		this.LegL6 = this.ThoracicSegment6.getChild("LegL6");
		this.LegL5 = this.ThoracicSegment6.getChild("LegL5");
		this.ThoracicSegment7 = this.Thorax2.getChild("ThoracicSegment7");
		this.LegL7 = this.ThoracicSegment7.getChild("LegL7");
		this.LegL10 = this.ThoracicSegment7.getChild("LegL10");
		this.ThoracicSegment8 = this.Thorax2.getChild("ThoracicSegment8");
		this.LegL8 = this.ThoracicSegment8.getChild("LegL8");
		this.LegL11 = this.ThoracicSegment8.getChild("LegL11");
		this.ThoracicSegment9 = this.Thorax2.getChild("ThoracicSegment9");
		this.LegL9 = this.ThoracicSegment9.getChild("LegL9");
		this.LegL12 = this.ThoracicSegment9.getChild("LegL12");
		this.ThoracicSegment2 = this.Thorax2.getChild("ThoracicSegment2");
		this.LegL2 = this.ThoracicSegment2.getChild("LegL2");
		this.LegL13 = this.ThoracicSegment2.getChild("LegL13");
		this.ThoracicSegment3 = this.Thorax2.getChild("ThoracicSegment3");
		this.LegL3 = this.ThoracicSegment3.getChild("LegL3");
		this.LegL4 = this.ThoracicSegment3.getChild("LegL4");
		this.Rock = this.fossil.getChild("Rock");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Crotalocephalus = fossil.addOrReplaceChild("Crotalocephalus", CubeListBuilder.create(), PartPose.offset(0.5F, -4.5F, -3.0F));

		PartDefinition Cephalon3 = Crotalocephalus.addOrReplaceChild("Cephalon3", CubeListBuilder.create().texOffs(15, 33).addBox(-1.5F, -2.0F, -3.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 38).addBox(-1.5F, -3.4F, -2.1F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.5F, -2.4F, -0.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-1.0F, -3.3F, -0.1F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 13).addBox(-2.0F, -1.75F, 0.8F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.4F, -3.7F, 0.5613F, -0.0204F, -0.1041F));

		PartDefinition Librigena_r1 = Cephalon3.addOrReplaceChild("Librigena_r1", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(0.0956F, -0.0433F, -0.1763F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.0F, 1.1F, 0.2967F, -0.0611F, -0.3927F));

		PartDefinition Librigena_r2 = Cephalon3.addOrReplaceChild("Librigena_r2", CubeListBuilder.create().texOffs(0, 33).addBox(-4.0956F, -0.0433F, -0.1763F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0F, 1.1F, 0.2967F, 0.0611F, 0.3927F));

		PartDefinition Librigena_r3 = Cephalon3.addOrReplaceChild("Librigena_r3", CubeListBuilder.create().texOffs(44, 23).addBox(-0.5806F, -0.0976F, -0.0195F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.6F, 3.0F, 0.0F, 0.2007F, 0.3927F));

		PartDefinition Librigena_r4 = Cephalon3.addOrReplaceChild("Librigena_r4", CubeListBuilder.create().texOffs(44, 23).mirror().addBox(-0.4194F, -0.0976F, -0.0195F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.6F, 3.0F, 0.0F, -0.2007F, -0.3927F));

		PartDefinition Librigena_r5 = Cephalon3.addOrReplaceChild("Librigena_r5", CubeListBuilder.create().texOffs(30, 29).mirror().addBox(-2.0F, -1.0F, -4.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, -0.3927F, -0.3927F));

		PartDefinition Librigena_r6 = Cephalon3.addOrReplaceChild("Librigena_r6", CubeListBuilder.create().texOffs(30, 29).addBox(-1.0F, -1.0F, -4.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, 0.3927F, 0.3927F));

		PartDefinition Glabella_r1 = Cephalon3.addOrReplaceChild("Glabella_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -1.0F, -3.9F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.7592F, 0.0F, 0.0F));

		PartDefinition Thorax2 = Crotalocephalus.addOrReplaceChild("Thorax2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, 3.1F, 0.0873F, 0.0F, -0.192F));

		PartDefinition ThoracicSegment6 = Thorax2.addOrReplaceChild("ThoracicSegment6", CubeListBuilder.create().texOffs(44, 18).addBox(-0.99F, -2.31F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.1F));

		PartDefinition PleuralBand3_r1 = ThoracicSegment6.addOrReplaceChild("PleuralBand3_r1", CubeListBuilder.create().texOffs(45, 47).mirror().addBox(-2.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.3F, 1.0F, 0.0F, 0.0F, -0.4538F));

		PartDefinition PleuralBand2_r1 = ThoracicSegment6.addOrReplaceChild("PleuralBand2_r1", CubeListBuilder.create().texOffs(45, 47).addBox(0.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.3F, 1.0F, 0.0F, 0.0F, 0.4538F));

		PartDefinition PleuralBand2_r2 = ThoracicSegment6.addOrReplaceChild("PleuralBand2_r2", CubeListBuilder.create().texOffs(31, 42).mirror().addBox(-3.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.6632F));

		PartDefinition PleuralBand1_r1 = ThoracicSegment6.addOrReplaceChild("PleuralBand1_r1", CubeListBuilder.create().texOffs(31, 42).addBox(0.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.6632F));

		PartDefinition LegL6 = ThoracicSegment6.addOrReplaceChild("LegL6", CubeListBuilder.create().texOffs(0, 0).addBox(3.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.3F, 1.0F, 0.0F, 0.0F, 0.7156F));

		PartDefinition LegL5 = ThoracicSegment6.addOrReplaceChild("LegL5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.3F, 1.0F, 0.0F, 0.0F, -0.7156F));

		PartDefinition ThoracicSegment7 = Thorax2.addOrReplaceChild("ThoracicSegment7", CubeListBuilder.create().texOffs(0, 44).addBox(-0.99F, -2.31F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition PleuralBand4_r1 = ThoracicSegment7.addOrReplaceChild("PleuralBand4_r1", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(-2.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.3F, 1.0F, 0.0F, 0.0F, -0.4538F));

		PartDefinition PleuralBand3_r2 = ThoracicSegment7.addOrReplaceChild("PleuralBand3_r2", CubeListBuilder.create().texOffs(38, 47).addBox(0.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.3F, 1.0F, 0.0F, 0.0F, 0.4538F));

		PartDefinition PleuralBand3_r3 = ThoracicSegment7.addOrReplaceChild("PleuralBand3_r3", CubeListBuilder.create().texOffs(20, 42).mirror().addBox(-3.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.6632F));

		PartDefinition PleuralBand2_r3 = ThoracicSegment7.addOrReplaceChild("PleuralBand2_r3", CubeListBuilder.create().texOffs(20, 42).addBox(0.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.6632F));

		PartDefinition LegL7 = ThoracicSegment7.addOrReplaceChild("LegL7", CubeListBuilder.create().texOffs(0, 0).addBox(3.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.3F, 1.0F, 0.0F, 0.0F, 0.7156F));

		PartDefinition LegL10 = ThoracicSegment7.addOrReplaceChild("LegL10", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.3F, 1.0F, 0.0F, 0.0F, -0.7156F));

		PartDefinition ThoracicSegment8 = Thorax2.addOrReplaceChild("ThoracicSegment8", CubeListBuilder.create().texOffs(9, 43).addBox(-0.99F, -2.31F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.6F, -0.2094F, 0.0F, 0.0F));

		PartDefinition PleuralBand5_r1 = ThoracicSegment8.addOrReplaceChild("PleuralBand5_r1", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-2.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.3F, 1.0F, 0.0F, 0.0F, -0.4538F));

		PartDefinition PleuralBand4_r2 = ThoracicSegment8.addOrReplaceChild("PleuralBand4_r2", CubeListBuilder.create().texOffs(46, 38).addBox(0.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.3F, 1.0F, 0.0F, 0.0F, 0.4538F));

		PartDefinition PleuralBand4_r3 = ThoracicSegment8.addOrReplaceChild("PleuralBand4_r3", CubeListBuilder.create().texOffs(11, 39).mirror().addBox(-3.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.6632F));

		PartDefinition PleuralBand3_r4 = ThoracicSegment8.addOrReplaceChild("PleuralBand3_r4", CubeListBuilder.create().texOffs(11, 39).addBox(0.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.6632F));

		PartDefinition LegL8 = ThoracicSegment8.addOrReplaceChild("LegL8", CubeListBuilder.create().texOffs(0, 0).addBox(3.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.3F, 1.0F, 0.0F, 0.0F, 0.7156F));

		PartDefinition LegL11 = ThoracicSegment8.addOrReplaceChild("LegL11", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.3F, 1.0F, 0.0F, 0.0F, -0.7156F));

		PartDefinition ThoracicSegment9 = Thorax2.addOrReplaceChild("ThoracicSegment9", CubeListBuilder.create().texOffs(42, 42).addBox(-0.99F, -2.31F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.3F, -0.2443F, 0.0F, 0.0F));

		PartDefinition PleuralBand6_r1 = ThoracicSegment9.addOrReplaceChild("PleuralBand6_r1", CubeListBuilder.create().texOffs(32, 46).mirror().addBox(-2.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.3F, 1.0F, 0.0F, 0.0F, -0.4538F));

		PartDefinition PleuralBand5_r2 = ThoracicSegment9.addOrReplaceChild("PleuralBand5_r2", CubeListBuilder.create().texOffs(32, 46).addBox(0.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.3F, 1.0F, 0.0F, 0.0F, 0.4538F));

		PartDefinition PleuralBand5_r3 = ThoracicSegment9.addOrReplaceChild("PleuralBand5_r3", CubeListBuilder.create().texOffs(37, 38).mirror().addBox(-3.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.6632F));

		PartDefinition PleuralBand4_r4 = ThoracicSegment9.addOrReplaceChild("PleuralBand4_r4", CubeListBuilder.create().texOffs(37, 38).addBox(0.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.6632F));

		PartDefinition LegL9 = ThoracicSegment9.addOrReplaceChild("LegL9", CubeListBuilder.create().texOffs(0, 0).addBox(3.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.3F, 1.0F, 0.0F, 0.0F, 0.7156F));

		PartDefinition LegL12 = ThoracicSegment9.addOrReplaceChild("LegL12", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.3F, 1.0F, 0.0F, 0.0F, -0.7156F));

		PartDefinition ThoracicSegment2 = Thorax2.addOrReplaceChild("ThoracicSegment2", CubeListBuilder.create().texOffs(23, 23).addBox(-0.99F, -2.31F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.7F, -0.4887F, 0.0F, 0.0F));

		PartDefinition PleuralBand7_r1 = ThoracicSegment2.addOrReplaceChild("PleuralBand7_r1", CubeListBuilder.create().texOffs(25, 46).mirror().addBox(-2.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.3F, 1.0F, 0.0F, 0.0F, -0.4538F));

		PartDefinition PleuralBand6_r2 = ThoracicSegment2.addOrReplaceChild("PleuralBand6_r2", CubeListBuilder.create().texOffs(25, 46).addBox(0.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.3F, 1.0F, 0.0F, 0.0F, 0.4538F));

		PartDefinition PleuralBand6_r3 = ThoracicSegment2.addOrReplaceChild("PleuralBand6_r3", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-3.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.6632F));

		PartDefinition PleuralBand5_r4 = ThoracicSegment2.addOrReplaceChild("PleuralBand5_r4", CubeListBuilder.create().texOffs(26, 38).addBox(0.01F, 0.09F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.6632F));

		PartDefinition LegL2 = ThoracicSegment2.addOrReplaceChild("LegL2", CubeListBuilder.create().texOffs(0, 0).addBox(3.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.3F, 1.0F, 0.0F, 0.0F, 0.7156F));

		PartDefinition LegL13 = ThoracicSegment2.addOrReplaceChild("LegL13", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.3F, 1.0F, 0.0F, 0.0F, -0.7156F));

		PartDefinition ThoracicSegment3 = Thorax2.addOrReplaceChild("ThoracicSegment3", CubeListBuilder.create().texOffs(23, 18).addBox(-0.99F, -2.31F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 29).addBox(-0.99F, -2.31F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 3.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition PleuralBand11_r1 = ThoracicSegment3.addOrReplaceChild("PleuralBand11_r1", CubeListBuilder.create().texOffs(23, 29).mirror().addBox(-3.3382F, -0.6034F, 2.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.3F, 4.0F, 0.0F, 1.4486F, -0.4538F));

		PartDefinition PleuralBand10_r1 = ThoracicSegment3.addOrReplaceChild("PleuralBand10_r1", CubeListBuilder.create().texOffs(23, 29).addBox(-0.6618F, -0.6034F, 2.7F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.3F, 4.0F, 0.0F, -1.4486F, 0.4538F));

		PartDefinition PleuralBand10_r2 = ThoracicSegment3.addOrReplaceChild("PleuralBand10_r2", CubeListBuilder.create().texOffs(25, 33).mirror().addBox(-2.3382F, -0.0034F, 0.9F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.3F, 4.0F, 0.0F, 1.2392F, -0.4538F));

		PartDefinition PleuralBand9_r1 = ThoracicSegment3.addOrReplaceChild("PleuralBand9_r1", CubeListBuilder.create().texOffs(25, 33).addBox(-0.6618F, -0.0034F, 0.9F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.3F, 4.0F, 0.0F, -1.2392F, 0.4538F));

		PartDefinition PleuralBand9_r2 = ThoracicSegment3.addOrReplaceChild("PleuralBand9_r2", CubeListBuilder.create().texOffs(44, 33).mirror().addBox(-1.3382F, -0.0034F, -1.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.3F, 4.0F, 0.0F, 0.6283F, -0.4538F));

		PartDefinition PleuralBand8_r1 = ThoracicSegment3.addOrReplaceChild("PleuralBand8_r1", CubeListBuilder.create().texOffs(44, 33).addBox(-0.6618F, -0.0034F, -1.1F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.3F, 4.0F, 0.0F, -0.6283F, 0.4538F));

		PartDefinition PleuralBand8_r2 = ThoracicSegment3.addOrReplaceChild("PleuralBand8_r2", CubeListBuilder.create().texOffs(18, 46).mirror().addBox(-2.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.3F, 1.0F, 0.0F, 0.0F, -0.4538F));

		PartDefinition PleuralBand7_r2 = ThoracicSegment3.addOrReplaceChild("PleuralBand7_r2", CubeListBuilder.create().texOffs(18, 46).addBox(0.018F, -0.0911F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.3F, 1.0F, 0.0F, 0.0F, 0.4538F));

		PartDefinition PleuralBand7_r3 = ThoracicSegment3.addOrReplaceChild("PleuralBand7_r3", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-3.01F, 0.09F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.6632F));

		PartDefinition PleuralBand6_r4 = ThoracicSegment3.addOrReplaceChild("PleuralBand6_r4", CubeListBuilder.create().texOffs(0, 7).addBox(0.01F, 0.09F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.6632F));

		PartDefinition LegL3 = ThoracicSegment3.addOrReplaceChild("LegL3", CubeListBuilder.create().texOffs(0, 0).addBox(3.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.3F, 1.0F, 0.0F, 0.0F, 0.7156F));

		PartDefinition LegL4 = ThoracicSegment3.addOrReplaceChild("LegL4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.053F, 0.0347F, 0.0F, -3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.3F, 1.0F, 0.0F, 0.0F, -0.7156F));

		PartDefinition Rock = fossil.addOrReplaceChild("Rock", CubeListBuilder.create().texOffs(8, 8).addBox(-3.6F, -4.8F, -3.8F, 12.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(3, 0).addBox(-3.6F, -4.8F, -19.7F, 12.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(7, 1).addBox(-2.6F, -5.8F, -19.4F, 11.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
				.texOffs(7, 3).addBox(-1.6F, -6.8F, -16.5F, 10.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(9, 3).addBox(0.4F, -7.2F, -15.5F, 8.0F, 1.0F, 13.0F, new CubeDeformation(-0.001F))
				.texOffs(17, 6).addBox(0.6F, -8.2F, -12.7F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(17, 6).addBox(0.6F, -9.2F, -11.5F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(17, 6).addBox(1.2F, -10.2F, -11.5F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(18, 8).addBox(1.4F, -6.8F, -3.5F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 9).addBox(-1.6F, -5.8F, -4.7F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offset(-2.4F, 4.5F, 7.4F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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