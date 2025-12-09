package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HungioidesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart Hungioides;
	private final ModelPart Cephalon;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart Thorax1;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart Thorax2;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart Thorax3;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart Thorax4;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart Thorax5;
	private final ModelPart cube_r25;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart Pygidium;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart Thorax6;
	private final ModelPart cube_r31;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart Pygidium2;
	private final ModelPart cube_r34;
	private final ModelPart cube_r35;
	private final ModelPart cube_r36;

	public HungioidesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.cube_r4 = this.fossil.getChild("cube_r4");
		this.Hungioides = this.fossil.getChild("Hungioides");
		this.Cephalon = this.Hungioides.getChild("Cephalon");
		this.cube_r5 = this.Cephalon.getChild("cube_r5");
		this.cube_r6 = this.Cephalon.getChild("cube_r6");
		this.cube_r7 = this.Cephalon.getChild("cube_r7");
		this.cube_r8 = this.Cephalon.getChild("cube_r8");
		this.cube_r9 = this.Cephalon.getChild("cube_r9");
		this.cube_r10 = this.Cephalon.getChild("cube_r10");
		this.cube_r11 = this.Cephalon.getChild("cube_r11");
		this.cube_r12 = this.Cephalon.getChild("cube_r12");
		this.Thorax1 = this.Hungioides.getChild("Thorax1");
		this.cube_r13 = this.Thorax1.getChild("cube_r13");
		this.cube_r14 = this.Thorax1.getChild("cube_r14");
		this.cube_r15 = this.Thorax1.getChild("cube_r15");
		this.Thorax2 = this.Thorax1.getChild("Thorax2");
		this.cube_r16 = this.Thorax2.getChild("cube_r16");
		this.cube_r17 = this.Thorax2.getChild("cube_r17");
		this.cube_r18 = this.Thorax2.getChild("cube_r18");
		this.Thorax3 = this.Thorax2.getChild("Thorax3");
		this.cube_r19 = this.Thorax3.getChild("cube_r19");
		this.cube_r20 = this.Thorax3.getChild("cube_r20");
		this.cube_r21 = this.Thorax3.getChild("cube_r21");
		this.Thorax4 = this.Thorax3.getChild("Thorax4");
		this.cube_r22 = this.Thorax4.getChild("cube_r22");
		this.cube_r23 = this.Thorax4.getChild("cube_r23");
		this.cube_r24 = this.Thorax4.getChild("cube_r24");
		this.Thorax5 = this.Thorax4.getChild("Thorax5");
		this.cube_r25 = this.Thorax5.getChild("cube_r25");
		this.cube_r26 = this.Thorax5.getChild("cube_r26");
		this.cube_r27 = this.Thorax5.getChild("cube_r27");
		this.Pygidium = this.Thorax5.getChild("Pygidium");
		this.cube_r28 = this.Pygidium.getChild("cube_r28");
		this.cube_r29 = this.Pygidium.getChild("cube_r29");
		this.cube_r30 = this.Pygidium.getChild("cube_r30");
		this.Thorax6 = this.fossil.getChild("Thorax6");
		this.cube_r31 = this.Thorax6.getChild("cube_r31");
		this.cube_r32 = this.Thorax6.getChild("cube_r32");
		this.cube_r33 = this.Thorax6.getChild("cube_r33");
		this.Pygidium2 = this.Thorax6.getChild("Pygidium2");
		this.cube_r34 = this.Pygidium2.getChild("cube_r34");
		this.cube_r35 = this.Pygidium2.getChild("cube_r35");
		this.cube_r36 = this.Pygidium2.getChild("cube_r36");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 34).addBox(-11.3F, -0.5F, -13.2F, 17.0F, 2.0F, 31.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.4618F, -1.5F, -0.6053F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 68).addBox(-21.5002F, -0.5F, 0.0258F, 22.0F, 2.0F, 16.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(13.7495F, -1.5F, 17.2972F, 0.0F, -0.5934F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-26.7F, -0.5F, -13.2F, 22.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.4527F, -1.5F, 0.2176F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 34).addBox(-13.4F, -0.5F, -6.8F, 22.0F, 2.0F, 26.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.7446F, -1.5F, -18.3496F, 0.0F, 0.9163F, 0.0F));

		PartDefinition Hungioides = fossil.addOrReplaceChild("Hungioides", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.25F, -4.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition Cephalon = Hungioides.addOrReplaceChild("Cephalon", CubeListBuilder.create().texOffs(76, 13).addBox(-4.0F, -0.9F, -8.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.001F))
				.texOffs(66, 34).addBox(-2.5F, -1.45F, -7.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(61, 73).addBox(2.25F, -1.45F, -4.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F))
				.texOffs(61, 68).addBox(-4.25F, -1.45F, -4.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, -6.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Cephalon.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 41).addBox(-7.5117F, -1.5885F, 2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0463F, -0.4246F, -0.2811F));

		PartDefinition cube_r6 = Cephalon.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 0).addBox(-4.9617F, -1.5885F, 1.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0971F, -1.1213F, -0.3496F));

		PartDefinition cube_r7 = Cephalon.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 8).addBox(-6.0617F, -1.5885F, 2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0589F, -0.7732F, -0.3032F));

		PartDefinition cube_r8 = Cephalon.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 50).addBox(6.5117F, -1.5885F, 2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0463F, 0.4246F, 0.2811F));

		PartDefinition cube_r9 = Cephalon.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 0).addBox(3.9617F, -1.5885F, 1.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0971F, 1.1213F, 0.3496F));

		PartDefinition cube_r10 = Cephalon.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 5).addBox(5.0617F, -1.5885F, 2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0589F, 0.7732F, 0.3032F));

		PartDefinition cube_r11 = Cephalon.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 68).addBox(-9.7117F, -1.6385F, -3.0F, 6.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0421F, 0.0113F, -0.2616F));

		PartDefinition cube_r12 = Cephalon.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 0).addBox(3.7117F, -1.6385F, -3.0F, 6.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0421F, -0.0113F, 0.2616F));

		PartDefinition Thorax1 = Hungioides.addOrReplaceChild("Thorax1", CubeListBuilder.create().texOffs(19, 87).addBox(-2.5F, -0.9F, -0.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.2F, -6.0F));

		PartDefinition cube_r13 = Thorax1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 68).addBox(-1.5F, -2.2F, -8.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 7.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Thorax1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 23).addBox(-9.15F, -2.1F, -8.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 8.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r15 = Thorax1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(85, 68).addBox(1.15F, -2.1F, -8.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 8.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Thorax2 = Thorax1.addOrReplaceChild("Thorax2", CubeListBuilder.create().texOffs(38, 87).addBox(-2.5F, -0.9F, 0.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offset(0.0F, 0.0F, 3.5F));

		PartDefinition cube_r16 = Thorax2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 88).addBox(-1.5F, -2.2F, -4.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.1F, 4.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Thorax2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 34).addBox(-9.05F, -2.0F, -5.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 4.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r18 = Thorax2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(71, 81).addBox(1.05F, -2.0F, -5.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 4.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Thorax3 = Thorax2.addOrReplaceChild("Thorax3", CubeListBuilder.create().texOffs(55, 87).addBox(-2.5F, -0.9F, 0.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r19 = Thorax3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 79).addBox(-1.5F, -2.2F, -1.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.1F, 1.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Thorax3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 16).addBox(-8.95F, -1.9F, -2.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 1.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r21 = Thorax3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(76, 24).addBox(0.95F, -1.9F, -2.0F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 1.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Thorax4 = Thorax3.addOrReplaceChild("Thorax4", CubeListBuilder.create().texOffs(0, 59).addBox(-2.5F, -0.9F, 0.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r22 = Thorax4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(17, 59).addBox(-1.5F, -2.2F, 1.6F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.1F, -1.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Thorax4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-8.85F, -1.8F, 1.0F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r24 = Thorax4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 8).addBox(1.85F, -1.8F, 1.0F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Thorax5 = Thorax4.addOrReplaceChild("Thorax5", CubeListBuilder.create().texOffs(0, 74).addBox(-2.5F, -0.4F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r25 = Thorax5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(66, 57).addBox(-1.5F, -2.2F, 4.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.6F, -4.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Thorax5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(66, 43).addBox(-6.95F, -1.7F, 4.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -4.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r27 = Thorax5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(66, 50).addBox(0.95F, -1.7F, 4.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -4.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Pygidium = Thorax5.addOrReplaceChild("Pygidium", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r28 = Pygidium.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 41).addBox(-4.55F, -1.65F, 6.5F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -6.5F, -0.0843F, -0.0226F, -0.2608F));

		PartDefinition cube_r29 = Pygidium.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 50).addBox(-0.45F, -1.65F, 6.5F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -6.5F, -0.0843F, 0.0226F, 0.2608F));

		PartDefinition cube_r30 = Pygidium.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 87).addBox(-1.5F, -2.45F, 6.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -6.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Thorax6 = fossil.addOrReplaceChild("Thorax6", CubeListBuilder.create().texOffs(0, 74).addBox(-2.5F, -0.4F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-8.0F, -3.15F, 21.0F, 0.0F, 2.5307F, 0.0F));

		PartDefinition cube_r31 = Thorax6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(66, 57).addBox(-1.5F, -2.2F, 4.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.6F, -4.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Thorax6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 43).addBox(-6.95F, -1.7F, 4.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -4.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r33 = Thorax6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 50).addBox(0.95F, -1.7F, 4.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -4.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Pygidium2 = Thorax6.addOrReplaceChild("Pygidium2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r34 = Pygidium2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 41).addBox(-4.55F, -1.65F, 6.5F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -6.5F, -0.0843F, -0.0226F, -0.2608F));

		PartDefinition cube_r35 = Pygidium2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 50).addBox(-0.45F, -1.65F, 6.5F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -6.5F, -0.0843F, 0.0226F, 0.2608F));

		PartDefinition cube_r36 = Pygidium2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 87).addBox(-1.5F, -2.45F, 6.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -6.5F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 100);
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