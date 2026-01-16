package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HeliopeltisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart Heliopeltis;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
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
	private final ModelPart cube_r18;
	private final ModelPart IMMOVABLESPINE1;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart IMMOVABLESPINE2;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart IMMOVABLESPINE4;
	private final ModelPart cube_r25;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart Thorax;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart cube_r31;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart Pygidium;
	private final ModelPart cube_r34;
	private final ModelPart cube_r35;
	private final ModelPart cube_r36;
	private final ModelPart cube_r37;

	public HeliopeltisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.Heliopeltis = this.fossil.getChild("Heliopeltis");
		this.cube_r3 = this.Heliopeltis.getChild("cube_r3");
		this.cube_r4 = this.Heliopeltis.getChild("cube_r4");
		this.cube_r5 = this.Heliopeltis.getChild("cube_r5");
		this.cube_r6 = this.Heliopeltis.getChild("cube_r6");
		this.cube_r7 = this.Heliopeltis.getChild("cube_r7");
		this.cube_r8 = this.Heliopeltis.getChild("cube_r8");
		this.cube_r9 = this.Heliopeltis.getChild("cube_r9");
		this.cube_r10 = this.Heliopeltis.getChild("cube_r10");
		this.cube_r11 = this.Heliopeltis.getChild("cube_r11");
		this.cube_r12 = this.Heliopeltis.getChild("cube_r12");
		this.cube_r13 = this.Heliopeltis.getChild("cube_r13");
		this.cube_r14 = this.Heliopeltis.getChild("cube_r14");
		this.cube_r15 = this.Heliopeltis.getChild("cube_r15");
		this.cube_r16 = this.Heliopeltis.getChild("cube_r16");
		this.cube_r17 = this.Heliopeltis.getChild("cube_r17");
		this.cube_r18 = this.Heliopeltis.getChild("cube_r18");
		this.IMMOVABLESPINE1 = this.Heliopeltis.getChild("IMMOVABLESPINE1");
		this.cube_r19 = this.IMMOVABLESPINE1.getChild("cube_r19");
		this.cube_r20 = this.IMMOVABLESPINE1.getChild("cube_r20");
		this.cube_r21 = this.IMMOVABLESPINE1.getChild("cube_r21");
		this.IMMOVABLESPINE2 = this.Heliopeltis.getChild("IMMOVABLESPINE2");
		this.cube_r22 = this.IMMOVABLESPINE2.getChild("cube_r22");
		this.cube_r23 = this.IMMOVABLESPINE2.getChild("cube_r23");
		this.cube_r24 = this.IMMOVABLESPINE2.getChild("cube_r24");
		this.IMMOVABLESPINE4 = this.Heliopeltis.getChild("IMMOVABLESPINE4");
		this.cube_r25 = this.IMMOVABLESPINE4.getChild("cube_r25");
		this.cube_r26 = this.IMMOVABLESPINE4.getChild("cube_r26");
		this.cube_r27 = this.IMMOVABLESPINE4.getChild("cube_r27");
		this.Thorax = this.Heliopeltis.getChild("Thorax");
		this.cube_r28 = this.Thorax.getChild("cube_r28");
		this.cube_r29 = this.Thorax.getChild("cube_r29");
		this.cube_r30 = this.Thorax.getChild("cube_r30");
		this.cube_r31 = this.Thorax.getChild("cube_r31");
		this.cube_r32 = this.Thorax.getChild("cube_r32");
		this.cube_r33 = this.Thorax.getChild("cube_r33");
		this.Pygidium = this.Thorax.getChild("Pygidium");
		this.cube_r34 = this.Pygidium.getChild("cube_r34");
		this.cube_r35 = this.Pygidium.getChild("cube_r35");
		this.cube_r36 = this.Pygidium.getChild("cube_r36");
		this.cube_r37 = this.Pygidium.getChild("cube_r37");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 44).addBox(-9.4155F, -1.0F, -10.2822F, 14.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offset(3.4155F, 23.0F, -4.7178F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-10.5F, -1.0F, -2.2F, 28.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4155F, 0.0F, -2.2822F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 26).addBox(0.0F, -0.5F, 0.0F, 18.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.5845F, -0.5F, -10.2822F, 0.0F, -0.829F, 0.0F));

		PartDefinition Heliopeltis = fossil.addOrReplaceChild("Heliopeltis", CubeListBuilder.create().texOffs(0, 7).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(0, 0).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 77).addBox(-4.0F, -1.0F, -5.5F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.4155F, -1.0F, -2.2822F));

		PartDefinition cube_r3 = Heliopeltis.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.55F, -0.3743F, -0.4887F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.798F, -1.6331F, -3.6537F, 1.213F, -0.5236F, 0.0F));

		PartDefinition cube_r4 = Heliopeltis.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 17).mirror().addBox(0.6285F, -0.1F, -0.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 16).mirror().addBox(0.1285F, -0.1F, -0.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.15F, -1.3F, -3.65F, 0.2139F, 0.6699F, 0.3365F));

		PartDefinition cube_r5 = Heliopeltis.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 17).mirror().addBox(-4.4F, -2.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.5672F, -0.5236F, 0.0F));

		PartDefinition cube_r6 = Heliopeltis.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 40).mirror().addBox(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3342F, -1.042F, -3.7571F, 0.7663F, -0.8352F, -0.3114F));

		PartDefinition cube_r7 = Heliopeltis.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 17).addBox(-1.6285F, -0.1F, -0.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 16).addBox(-1.1285F, -0.1F, -0.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.15F, -1.3F, -3.65F, 0.2139F, -0.6699F, -0.3365F));

		PartDefinition cube_r8 = Heliopeltis.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 37).mirror().addBox(-3.6857F, -1.0F, 0.3622F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r9 = Heliopeltis.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 37).addBox(1.6857F, -1.0F, 0.3622F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.5F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r10 = Heliopeltis.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 51).mirror().addBox(-0.4F, 10.95F, -1.7F, 7.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -11.3F, -4.25F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r11 = Heliopeltis.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.1794F, -1.0F, -1.4395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(7, 26).mirror().addBox(-2.7294F, -1.0F, -1.4395F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -6.0F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r12 = Heliopeltis.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 40).addBox(0.1794F, -1.0F, -1.4395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
				.texOffs(7, 26).addBox(0.7294F, -1.0F, -1.4395F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.0F, 0.0F, -6.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r13 = Heliopeltis.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-0.55F, -0.3743F, -0.4887F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.798F, -1.6331F, -3.6537F, 1.213F, 0.5236F, 0.0F));

		PartDefinition cube_r14 = Heliopeltis.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(5, 40).addBox(-0.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3342F, -1.042F, -3.7571F, 0.7663F, 0.8352F, 0.3114F));

		PartDefinition cube_r15 = Heliopeltis.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(16, 17).addBox(3.4F, -2.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.5672F, 0.5236F, 0.0F));

		PartDefinition cube_r16 = Heliopeltis.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(37, 44).addBox(-1.0F, -3.4F, -2.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Heliopeltis.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -0.5F, -3.8F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.2F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Heliopeltis.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(56, 51).addBox(-6.6F, 10.95F, -1.7F, 7.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, -11.3F, -4.25F, 0.0F, 0.9163F, 0.0F));

		PartDefinition IMMOVABLESPINE1 = Heliopeltis.addOrReplaceChild("IMMOVABLESPINE1", CubeListBuilder.create().texOffs(57, 52).addBox(-0.5F, -0.0117F, -0.2482F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1F, 8.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = IMMOVABLESPINE1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(12, 39).addBox(-0.5F, 0.5614F, -1.1878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.0F, -9.7F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r20 = IMMOVABLESPINE1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 17).addBox(-0.5F, -0.0359F, -0.0251F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r21 = IMMOVABLESPINE1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 26).addBox(-0.5F, -2.85F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 48).addBox(-0.5F, -2.85F, 0.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.95F, -7.45F, 0.3491F, 0.0F, 0.0F));

		PartDefinition IMMOVABLESPINE2 = Heliopeltis.addOrReplaceChild("IMMOVABLESPINE2", CubeListBuilder.create().texOffs(50, 51).addBox(-0.5F, -0.0117F, -0.2482F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.05F, -2.7F, 6.15F, -0.1745F, 0.5236F, 0.0F));

		PartDefinition cube_r22 = IMMOVABLESPINE2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 12).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1732F, 3.2365F, -10.1353F, 0.3065F, 0.0832F, 0.0263F));

		PartDefinition cube_r23 = IMMOVABLESPINE2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.0359F, -0.0251F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r24 = IMMOVABLESPINE2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(9, 32).addBox(-0.5F, -2.85F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(-0.5F, -2.85F, 0.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.95F, -7.45F, 0.3491F, 0.0F, 0.0F));

		PartDefinition IMMOVABLESPINE4 = Heliopeltis.addOrReplaceChild("IMMOVABLESPINE4", CubeListBuilder.create().texOffs(50, 43).addBox(-0.5F, -0.0117F, -0.2482F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.05F, -2.7F, 6.15F, -0.1745F, -0.5236F, 0.0F));

		PartDefinition cube_r25 = IMMOVABLESPINE4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 9).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1732F, 3.2365F, -10.1353F, 0.3065F, -0.0832F, -0.0263F));

		PartDefinition cube_r26 = IMMOVABLESPINE4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 11).addBox(-0.5F, -0.0359F, -0.0251F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r27 = IMMOVABLESPINE4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -2.85F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(18, 6).addBox(-0.5F, -2.85F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.95F, -7.45F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Thorax = Heliopeltis.addOrReplaceChild("Thorax", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F))
				.texOffs(50, 37).addBox(-0.5F, -0.75F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -0.5F, -2.0F));

		PartDefinition cube_r28 = Thorax.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(6.034F, 22.95F, -3.5794F, 11.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9F, -22.65F, -2.35F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r29 = Thorax.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(2.2743F, 22.85F, -5.4424F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9F, -22.65F, -2.25F, 0.0F, -1.4835F, 0.0F));

		PartDefinition cube_r30 = Thorax.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(4.2829F, 22.9F, -4.6526F, 9.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9F, -22.65F, -2.35F, 0.0F, -1.3526F, 0.0F));

		PartDefinition cube_r31 = Thorax.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 58).addBox(-16.35F, 22.95F, -1.7F, 11.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, -22.65F, -2.35F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r32 = Thorax.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 66).addBox(-6.1F, 22.85F, -3.45F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, -22.65F, -2.25F, 0.0F, 1.4835F, 0.0F));

		PartDefinition cube_r33 = Thorax.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(33, 66).addBox(-12.85F, 22.9F, -2.7F, 9.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, -22.65F, -2.35F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Pygidium = Thorax.addOrReplaceChild("Pygidium", CubeListBuilder.create().texOffs(27, 37).addBox(-0.5F, 0.45F, 3.0F, 1.0F, 0.0F, 20.0F, new CubeDeformation(0.0F))
				.texOffs(30, 37).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition cube_r34 = Pygidium.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(7.9478F, 23.05F, 3.4346F, 6.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9F, -22.6F, -5.25F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r35 = Pygidium.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(50, 37).mirror().addBox(7.8856F, 22.95F, -1.4821F, 10.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9F, -22.6F, -5.45F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r36 = Pygidium.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(50, 37).addBox(-16.6F, 22.95F, 0.05F, 10.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, -22.6F, -5.45F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r37 = Pygidium.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 26).addBox(-12.1F, 23.05F, 4.2F, 6.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, -22.6F, -5.25F, 0.0F, 0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 80);
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