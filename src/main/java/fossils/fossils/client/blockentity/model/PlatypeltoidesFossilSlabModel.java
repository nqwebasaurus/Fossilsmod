package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatypeltoidesFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart Asaphellus;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart Thorax1;
	private final ModelPart Thorax2;
	private final ModelPart Thorax3;
	private final ModelPart Pygidium;
	private final ModelPart Asaphellus2;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart Thorax4;
	private final ModelPart Thorax5;
	private final ModelPart Thorax6;
	private final ModelPart Pygidium2;

	public PlatypeltoidesFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.cube_r3 = this.fossil.getChild("cube_r3");
		this.cube_r4 = this.fossil.getChild("cube_r4");
		this.cube_r5 = this.fossil.getChild("cube_r5");
		this.Asaphellus = this.fossil.getChild("Asaphellus");
		this.cube_r6 = this.Asaphellus.getChild("cube_r6");
		this.cube_r7 = this.Asaphellus.getChild("cube_r7");
		this.cube_r8 = this.Asaphellus.getChild("cube_r8");
		this.cube_r9 = this.Asaphellus.getChild("cube_r9");
		this.cube_r10 = this.Asaphellus.getChild("cube_r10");
		this.cube_r11 = this.Asaphellus.getChild("cube_r11");
		this.cube_r12 = this.Asaphellus.getChild("cube_r12");
		this.Thorax1 = this.Asaphellus.getChild("Thorax1");
		this.Thorax2 = this.Thorax1.getChild("Thorax2");
		this.Thorax3 = this.Thorax2.getChild("Thorax3");
		this.Pygidium = this.Thorax3.getChild("Pygidium");
		this.Asaphellus2 = this.fossil.getChild("Asaphellus2");
		this.cube_r13 = this.Asaphellus2.getChild("cube_r13");
		this.cube_r14 = this.Asaphellus2.getChild("cube_r14");
		this.cube_r15 = this.Asaphellus2.getChild("cube_r15");
		this.cube_r16 = this.Asaphellus2.getChild("cube_r16");
		this.cube_r17 = this.Asaphellus2.getChild("cube_r17");
		this.cube_r18 = this.Asaphellus2.getChild("cube_r18");
		this.cube_r19 = this.Asaphellus2.getChild("cube_r19");
		this.cube_r20 = this.Asaphellus2.getChild("cube_r20");
		this.cube_r21 = this.Asaphellus2.getChild("cube_r21");
		this.Thorax4 = this.Asaphellus2.getChild("Thorax4");
		this.Thorax5 = this.Thorax4.getChild("Thorax5");
		this.Thorax6 = this.Thorax5.getChild("Thorax6");
		this.Pygidium2 = this.Thorax6.getChild("Pygidium2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -4.2F, -6.9F, 36.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(68, 37).addBox(-18.0F, -3.2F, 14.1F, 33.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-20.8119F, -0.5F, -24.661F, 21.0F, 2.0F, 25.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-7.3F, -1.7F, -13.3F, 0.0F, 2.1031F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 60).addBox(-16.8191F, -1.5F, -24.776F, 17.0F, 3.0F, 25.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(17.7F, -1.7F, -10.9F, 0.0F, 1.4748F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 54).addBox(-13.3F, -2.5F, -12.6F, 17.0F, 4.0F, 26.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(20.5F, -1.7F, 2.1F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 26).addBox(-14.6248F, -0.2F, -0.8906F, 28.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1176F, -5.2F, 9.587F, -0.2269F, 0.288F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-4.7F, -1.1F, -4.3F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 92).addBox(-7.7F, -1.0F, -2.4F, 11.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.5F, 7.1F, 0.0F, 0.3054F, 0.0F));

		PartDefinition Asaphellus = fossil.addOrReplaceChild("Asaphellus", CubeListBuilder.create().texOffs(80, 104).addBox(-1.0F, -0.4F, -4.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(62, 89).addBox(5.974F, 0.15F, -0.2254F, 12.0F, 0.0F, 6.0F, new CubeDeformation(-0.01F))
				.texOffs(87, 48).addBox(-17.974F, 0.15F, -0.2254F, 12.0F, 0.0F, 6.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 74).addBox(-2.0F, -1.15F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-4.0F, -0.75F, -1.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(57, 104).addBox(-2.5F, -0.4F, -2.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offset(0.0F, -4.5F, -2.0F));

		PartDefinition cube_r6 = Asaphellus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 62).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -4.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r7 = Asaphellus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 99).addBox(-1.0F, -0.85F, -0.425F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 0.35F, -3.75F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Asaphellus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 64).addBox(-0.75F, -0.5F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.35F, -1.3F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r9 = Asaphellus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 68).addBox(-0.25F, -0.5F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -0.35F, -1.3F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r10 = Asaphellus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, -1.0F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 0.6F, -4.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r11 = Asaphellus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 97).addBox(-5.35F, -1.0F, -5.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r12 = Asaphellus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 99).addBox(0.35F, -1.0F, -5.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Thorax1 = Asaphellus.addOrReplaceChild("Thorax1", CubeListBuilder.create().texOffs(94, 12).addBox(-5.5F, -0.5F, -0.05F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(39, 103).addBox(-2.0F, -1.0F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(68, 47).addBox(-4.0F, -0.75F, -0.05F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.1F, 2.0F));

		PartDefinition Thorax2 = Thorax1.addOrReplaceChild("Thorax2", CubeListBuilder.create().texOffs(13, 103).addBox(-2.0F, -1.0F, -0.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(61, 66).addBox(-4.0F, -0.75F, -0.1F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(94, 4).addBox(-5.5F, -0.5F, -0.1F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition Thorax3 = Thorax2.addOrReplaceChild("Thorax3", CubeListBuilder.create().texOffs(94, 0).addBox(-5.5F, -0.5F, 0.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F))
				.texOffs(0, 62).addBox(-4.0F, -0.75F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F))
				.texOffs(28, 101).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offset(0.0F, 0.0F, 1.85F));

		PartDefinition Pygidium = Thorax3.addOrReplaceChild("Pygidium", CubeListBuilder.create().texOffs(91, 106).addBox(-1.5F, -1.0F, 0.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
				.texOffs(94, 8).addBox(-5.5F, -0.5F, -0.1F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F))
				.texOffs(61, 70).addBox(-4.5F, -0.5F, 1.825F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F))
				.texOffs(90, 96).addBox(-3.5F, -0.75F, 1.65F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(0, 66).addBox(-4.0F, -0.75F, -0.1F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F))
				.texOffs(0, 103).addBox(-2.0F, -1.0F, -0.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F))
				.texOffs(56, 96).addBox(-3.0F, -0.5F, 1.65F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
				.texOffs(102, 106).addBox(-1.0F, -0.5F, 3.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F))
				.texOffs(70, 104).addBox(-2.5F, -0.75F, 2.4F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition Asaphellus2 = fossil.addOrReplaceChild("Asaphellus2", CubeListBuilder.create().texOffs(49, 104).addBox(-1.0F, -0.4F, -4.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(61, 73).addBox(-2.0F, -1.15F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 38).addBox(-4.0F, -0.75F, -1.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(95, 103).addBox(-2.5F, -0.4F, -2.8F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, -4.3F, 15.0F, -2.8974F, -0.2709F, -3.1389F));

		PartDefinition cube_r13 = Asaphellus2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 58).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, 0.6F, -4.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r14 = Asaphellus2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 99).addBox(-1.0F, -0.85F, -0.425F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 0.35F, -3.75F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Asaphellus2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 56).addBox(-0.75F, -0.5F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.35F, -1.3F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r16 = Asaphellus2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(19, 60).addBox(-0.25F, -0.5F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -0.35F, -1.3F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r17 = Asaphellus2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 85).addBox(-7.0F, 0.0F, -2.0F, 12.0F, 0.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-5.974F, 0.15F, 1.7746F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r18 = Asaphellus2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(31, 86).addBox(-14.026F, -0.475F, -1.2254F, 12.0F, 0.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(15.0F, 0.625F, 3.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r19 = Asaphellus2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(61, 58).addBox(0.0F, -1.0F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 0.6F, -4.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r20 = Asaphellus2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 99).addBox(-5.35F, -1.0F, -5.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r21 = Asaphellus2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 99).addBox(0.35F, -1.0F, -5.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Thorax4 = Asaphellus2.addOrReplaceChild("Thorax4", CubeListBuilder.create().texOffs(93, 89).addBox(-5.5F, -0.5F, -0.05F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(57, 100).addBox(-2.0F, -1.0F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 54).addBox(-4.0F, -0.75F, -0.05F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.1F, 2.0F));

		PartDefinition Thorax5 = Thorax4.addOrReplaceChild("Thorax5", CubeListBuilder.create().texOffs(96, 99).addBox(-2.0F, -1.0F, -0.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(0, 15).addBox(-4.0F, -0.75F, -0.1F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(31, 93).addBox(-5.5F, -0.5F, -0.1F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Thorax6 = Thorax5.addOrReplaceChild("Thorax6", CubeListBuilder.create().texOffs(86, 56).addBox(-5.5F, -0.5F, 0.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F))
				.texOffs(0, 11).addBox(-4.0F, -0.75F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F))
				.texOffs(74, 73).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.85F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Pygidium2 = Thorax6.addOrReplaceChild("Pygidium2", CubeListBuilder.create().texOffs(24, 105).addBox(-1.5F, -1.0F, 0.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
				.texOffs(61, 54).addBox(-5.5F, -0.5F, -0.1F, 11.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F))
				.texOffs(0, 48).addBox(-4.5F, -0.5F, 1.825F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F))
				.texOffs(73, 96).addBox(-3.5F, -0.75F, 1.65F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(0, 7).addBox(-4.0F, -0.75F, -0.1F, 8.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F))
				.texOffs(13, 74).addBox(-2.0F, -1.0F, -0.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F))
				.texOffs(94, 16).addBox(-3.0F, -0.5F, 1.65F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
				.texOffs(78, 77).addBox(-1.0F, -0.5F, 3.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F))
				.texOffs(99, 93).addBox(-2.5F, -0.75F, 2.4F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 120);
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