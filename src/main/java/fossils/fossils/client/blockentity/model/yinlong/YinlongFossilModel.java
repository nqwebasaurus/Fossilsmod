package fossils.fossils.client.blockentity.model.yinlong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YinlongFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftleg4;
	private final ModelPart leftleg5;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightleg4;
	private final ModelPart rightleg5;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftface;
	private final ModelPart rightface;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftarm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightarm3;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart tail7;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail9;

	public YinlongFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftleg4 = this.leftleg3.getChild("leftleg4");
		this.leftleg5 = this.leftleg4.getChild("leftleg5");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightleg4 = this.rightleg3.getChild("rightleg4");
		this.rightleg5 = this.rightleg4.getChild("rightleg5");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.neck = this.neck4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftface = this.head.getChild("leftface");
		this.rightface = this.head.getChild("rightface");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftarm3 = this.leftarm2.getChild("leftarm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightarm3 = this.rightarm2.getChild("rightarm3");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail6 = this.tail2.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.tail7 = this.tail3.getChild("tail7");
		this.tail4 = this.tail7.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail9 = this.tail5.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.4976F, 4.8698F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 80).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -2.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 80).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 80).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 41).mirror().addBox(-1.5F, 0.5F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 41).addBox(0.5F, 0.5F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -2.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3562F, -2.277F, -0.0436F, 0.0F, -0.4014F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3562F, -2.277F, -0.0436F, 0.0F, 0.4014F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.9F, 0.2435F, 0.4505F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 0).addBox(-0.3255F, -4.0119F, -0.6963F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.272F, 1.9704F, 2.1065F, -2.8565F, -0.3031F, 0.0605F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 58).addBox(-0.3255F, -1.6624F, -0.4523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.272F, 1.9704F, 2.1065F, -2.6819F, -0.3031F, 0.0605F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 64).addBox(-0.1136F, -1.5673F, -0.3107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0178F, 0.9675F, 1.3731F, -2.4299F, -0.4136F, 0.1568F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 65).addBox(-0.1527F, -1.4959F, -0.9098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0084F, 0.0356F, -0.5667F, -2.4383F, -0.4F, 0.1465F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(54, 58).addBox(-0.1527F, -2.5898F, -0.4949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.0084F, 0.0356F, -0.5667F, -2.098F, -0.4F, 0.1465F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 21).addBox(-0.5F, -4.6369F, -0.677F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1997F, -0.0567F, -2.0153F, -2.1636F, -0.2838F, 0.0741F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(64, 24).addBox(-0.5F, -1.825F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(69, 23).addBox(-0.5F, -0.825F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0269F, -0.9551F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(59, 58).addBox(-0.575F, -0.9016F, -0.8252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.0038F, -1.3172F, -1.5885F, -0.1745F, 0.0031F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 58).addBox(-0.5F, -0.475F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 69).addBox(-0.5F, -0.475F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8129F, -1.6189F, -3.0061F, 0.406F, -0.2141F, -0.0423F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 5).addBox(-1.0F, -0.246F, -1.5608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.925F, -2.0435F, -1.2506F, 0.022F, -0.2141F, -0.0423F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 21).addBox(-1.0F, -0.0834F, -2.0506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.7435F, 1.7494F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 55).addBox(-0.75F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.425F, -1.0897F, 1.2913F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(77, 77).addBox(-0.5F, -0.225F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.175F, -1.2546F, 3.9287F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(77, 3).addBox(-0.5F, -0.875F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 77).addBox(-0.5F, -0.875F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.175F, -0.9339F, 2.8869F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 44).addBox(-0.5F, -0.875F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.175F, -0.9339F, 2.8869F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(67, 74).addBox(-1.0F, -0.2712F, -3.312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.675F, -0.8435F, 4.6495F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(42, 72).addBox(-0.5F, -1.1F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 19).addBox(-0.5F, 0.1F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(10, 76).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8475F, -0.8554F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.9F, -0.7541F, 0.5203F));

		PartDefinition cube_r23 = bone4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.6745F, -4.0119F, -0.6963F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.272F, 2.968F, 2.0367F, -2.8565F, 0.3031F, -0.0605F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-0.6745F, -1.6624F, -0.4523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.272F, 2.968F, 2.0367F, -2.6819F, 0.3031F, -0.0605F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-0.8864F, -1.5673F, -0.3107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0178F, 1.9651F, 1.3033F, -2.4299F, 0.4136F, -0.1568F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(17, 65).mirror().addBox(-0.8473F, -1.4959F, -0.9098F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0084F, 1.0331F, -0.6364F, -2.4383F, 0.4F, -0.1465F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-0.8473F, -2.5898F, -0.4949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.0084F, 1.0331F, -0.6364F, -2.098F, 0.4F, -0.1465F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-0.5F, -4.6369F, -0.677F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1997F, 0.9408F, -2.085F, -2.1636F, 0.2838F, -0.0741F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-0.5F, -1.825F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(69, 23).mirror().addBox(-0.5F, -0.825F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9706F, -1.0249F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-0.425F, -0.9016F, -0.8252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.0014F, -1.3869F, -1.5885F, 0.1745F, -0.0031F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(-0.5F, -0.475F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 69).mirror().addBox(-0.5F, -0.475F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.8129F, -0.6214F, -3.0758F, 0.406F, 0.2141F, 0.0423F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(44, 5).mirror().addBox(0.0F, -0.246F, -1.5608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -1.0459F, -1.3203F, 0.022F, 0.2141F, 0.0423F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(53, 21).mirror().addBox(0.0F, -0.0834F, -2.0506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7459F, 1.6797F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.25F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.425F, -0.0921F, 1.2216F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.5F, -0.225F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -0.257F, 3.8589F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(-0.5F, -0.875F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 77).mirror().addBox(-0.5F, -0.875F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 0.0636F, 2.8171F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.5F, -0.875F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 0.0636F, 2.8171F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(0.0F, -0.2712F, -3.312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.675F, 0.1541F, 4.5797F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(42, 72).mirror().addBox(-0.5F, -1.1F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 19).mirror().addBox(-0.5F, 0.1F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9976F, -0.0697F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.15F, -0.9251F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -0.2183F, 0.0374F, -1.3509F, -0.0736F, -0.047F));

		PartDefinition cube_r41 = leftleg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, 1.0765F, -0.1873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.5F, 4.2449F, -0.0121F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftleg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 37).addBox(-0.5F, 1.7755F, -0.3127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.021F)), PartPose.offsetAndRotation(0.5F, 1.6043F, -0.6655F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftleg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(24, 64).addBox(-0.5F, -1.875F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.5F, 1.3963F, 0.3788F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftleg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(7, 64).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.021F)), PartPose.offsetAndRotation(0.5F, 1.3963F, 0.3788F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftleg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(81, 15).addBox(0.0F, 0.8264F, -0.1429F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6043F, -0.6655F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftleg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(32, 48).addBox(-0.5F, -0.2262F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(0.5F, 1.6043F, -0.6655F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8971F, 2.505F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(60, 52).addBox(-0.5F, -0.925F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.0683F, 0.3032F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftleg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(10, 73).addBox(0.0F, -1.2562F, 0.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(72, 52).addBox(0.0F, -1.0562F, 0.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 1.1607F, -0.3877F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftleg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 37).addBox(0.0F, -7.9562F, -0.8842F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.0245F, 0.7874F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftleg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -3.6036F, -0.2444F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1F, 3.7683F, 0.0032F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(18, 47).addBox(-0.5F, 0.038F, -0.7986F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.5022F, 0.362F, -0.4102F, 0.0F, 0.0F));

		PartDefinition leftleg4 = leftleg3.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(24, 27).addBox(-1.0F, -0.4F, -1.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0762F, 0.0703F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftleg5 = leftleg4.addOrReplaceChild("leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftleg5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 0.0438F, -2.7342F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4438F, -0.2658F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -0.2183F, 0.0374F, -1.2327F, -0.0886F, 0.2467F));

		PartDefinition cube_r52 = rightleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5F, 1.0765F, -0.1873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.2449F, -0.0121F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(63, 37).mirror().addBox(-0.5F, 1.7755F, -0.3127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.021F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6043F, -0.6655F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightleg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(24, 64).mirror().addBox(-0.5F, -1.875F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3963F, 0.3788F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightleg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.021F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3963F, 0.3788F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightleg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(0.0F, 0.8264F, -0.1429F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6043F, -0.6655F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r57 = rightleg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-0.5F, -0.2262F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6043F, -0.6655F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8971F, 2.505F, 2.5884F, 0.1198F, 0.2333F));

		PartDefinition cube_r58 = rightleg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-0.5F, -0.925F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0683F, 0.3032F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r59 = rightleg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-1.0F, -1.2562F, 0.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(72, 52).mirror().addBox(-1.0F, -1.0562F, 0.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.1607F, -0.3877F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r60 = rightleg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(33, 37).mirror().addBox(-1.0F, -7.9562F, -0.8842F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 9.0245F, 0.7874F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r61 = rightleg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-0.5F, -3.6036F, -0.2444F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 3.7683F, 0.0032F, -0.0262F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(18, 47).mirror().addBox(-1.5F, 0.038F, -0.7986F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.5022F, 0.362F, -0.7765F, -0.1889F, 0.1824F));

		PartDefinition rightleg4 = rightleg3.addOrReplaceChild("rightleg4", CubeListBuilder.create().texOffs(24, 27).mirror().addBox(-3.0F, -0.4F, -1.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.0762F, 0.0703F, 1.117F, 0.0F, 0.0F));

		PartDefinition rightleg5 = rightleg4.addOrReplaceChild("rightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightleg5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-2.0F, 0.0438F, -2.7342F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4438F, -0.2658F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3245F, -2.9952F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(42, 80).addBox(0.0F, -0.9661F, 0.0004F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(11, 39).addBox(-1.0F, -0.5F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(78, 35).mirror().addBox(-3.1316F, -1.9799F, -0.5218F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0562F, -1.277F, -0.0366F, -0.0238F, -1.4133F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, -0.8378F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 33).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, -0.3142F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(78, 35).addBox(2.1316F, -1.9799F, -0.5218F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0562F, -1.277F, -0.0366F, 0.0238F, 1.4133F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(63, 41).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, 0.8378F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(78, 33).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0562F, -1.277F, -0.0436F, 0.0F, 0.3142F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.4538F, -2.3822F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(41, 17).mirror().addBox(-6.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1976F, -4.4698F, 0.0321F, 0.3005F, -1.2804F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(12, 61).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1976F, -4.4698F, 0.1933F, 0.2337F, -0.6865F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(78, 31).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.1976F, -4.4698F, 0.2765F, 0.0864F, -0.1769F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7976F, -2.4697F, 0.1904F, 0.0708F, -0.1837F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(60, 56).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7976F, -2.4697F, 0.1248F, 0.1779F, -0.7005F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(48, 28).mirror().addBox(-5.1316F, -1.9799F, -0.5218F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7976F, -2.4697F, 0.0065F, 0.2168F, -1.2869F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(78, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4976F, -0.6697F, 0.1075F, 0.0434F, -0.2234F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(64, 16).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4976F, -0.6697F, 0.0658F, 0.1131F, -0.7441F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-4.1316F, -1.9799F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.4976F, -0.6697F, -0.0067F, 0.1306F, -1.3242F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(78, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1976F, -4.4698F, 0.2765F, -0.0864F, 0.1769F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(12, 61).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1976F, -4.4698F, 0.1933F, -0.2337F, 0.6865F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(41, 17).addBox(2.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1976F, -4.4698F, 0.0321F, -0.3005F, 1.2804F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 28).addBox(2.1316F, -1.9799F, -0.5218F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7976F, -2.4697F, 0.0065F, -0.2168F, 1.2869F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 64).addBox(2.1316F, -1.9799F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4976F, -0.6697F, -0.0067F, -0.1306F, 1.3242F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(64, 16).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4976F, -0.6697F, 0.0658F, -0.1131F, 0.7441F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(60, 56).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7976F, -2.4697F, 0.1248F, -0.1779F, 0.7005F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(76, 80).addBox(0.0F, -0.9582F, 0.003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1538F, -1.0928F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(80, 37).addBox(0.0F, -0.8998F, -0.177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9018F, -4.8765F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(33, 80).addBox(0.0F, -1.0998F, -0.077F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6538F, -2.9928F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -0.014F, -5.1763F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8538F, 0.0072F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(39, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7976F, -2.4697F, 0.1904F, -0.0708F, 0.1837F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(78, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4976F, -0.6697F, 0.1075F, -0.0434F, 0.2234F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2504F, -4.9092F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(58, 80).addBox(0.0F, -0.9535F, 0.0778F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5976F, -1.9698F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(79, 80).addBox(0.0F, -1.1339F, -0.0583F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7976F, -3.5697F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 57).mirror().addBox(-0.918F, -0.8017F, 1.8325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5855F, 8.0759F, -4.3008F, -0.1097F, 0.5036F, -0.0531F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2088F, 8.0684F, -0.537F, 0.6492F, -0.7498F, -0.2759F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(13, 21).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1377F, 8.3237F, -0.7818F, 0.8517F, -0.9336F, -0.521F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.7413F, -2.9467F, 0.5292F, 0.1642F, -0.2133F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(49, 63).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.7413F, -2.9467F, 0.3875F, 0.4213F, -0.6918F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(44, 10).mirror().addBox(-6.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.7413F, -2.9467F, 0.0785F, 0.5595F, -1.3291F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(41, 19).mirror().addBox(-6.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7413F, -1.2467F, 0.0452F, 0.423F, -1.2748F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(63, 43).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7413F, -1.2467F, 0.2761F, 0.3277F, -0.6627F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7413F, -1.2467F, 0.3923F, 0.1303F, -0.1635F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3687F, 8.1239F, -0.5465F, 1.0725F, -1.0879F, -0.8612F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.7413F, -2.9467F, 0.5292F, -0.1642F, 0.2133F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 63).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.7413F, -2.9467F, 0.3875F, -0.4213F, 0.6918F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(44, 10).addBox(2.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.7413F, -2.9467F, 0.0785F, -0.5595F, 1.3291F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(41, 19).addBox(2.1316F, -1.9799F, -0.5218F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7413F, -1.2467F, 0.0452F, -0.423F, 1.2748F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(63, 43).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7413F, -1.2467F, 0.2761F, -0.3277F, 0.6627F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(40, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7413F, -1.2467F, 0.3923F, -0.1303F, 0.1635F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(33, 6).addBox(-1.0F, -0.9916F, 0.0687F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 3.4976F, -3.2697F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2088F, 8.0684F, -0.537F, 0.6492F, 0.7498F, 0.2759F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(13, 21).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1377F, 8.3237F, -0.7818F, 0.8517F, 0.9336F, 0.521F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(22, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3687F, 8.1239F, -0.5465F, 1.0725F, 1.0879F, 0.8612F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(14, 57).addBox(-0.082F, -0.8017F, 1.8325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5855F, 8.0759F, -4.3008F, -0.1097F, -0.5036F, 0.0531F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(38, 37).addBox(-3.0855F, -0.8017F, 0.0478F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 12).addBox(-2.0855F, -0.8017F, 2.0478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5855F, 8.0759F, -4.3008F, -0.096F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7981F, -3.6412F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(65, 54).mirror().addBox(-4.1316F, -1.9799F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6413F, -1.4467F, 0.0928F, 0.5036F, -1.4438F));

		PartDefinition cube_r118 = chest2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6413F, -1.4467F, 0.3626F, 0.3688F, -0.8233F));

		PartDefinition cube_r119 = chest2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6413F, -1.4467F, 0.4841F, 0.1283F, -0.3418F));

		PartDefinition cube_r120 = chest2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 54).addBox(2.1316F, -1.9799F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6413F, -1.4467F, 0.0928F, -0.5036F, 1.4438F));

		PartDefinition cube_r121 = chest2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(65, 52).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6413F, -1.4467F, 0.3626F, -0.3688F, 0.8233F));

		PartDefinition cube_r122 = chest2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(52, 50).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3976F, -1.7698F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(50, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6413F, -1.4467F, 0.4841F, -0.1283F, 0.3418F));

		PartDefinition cube_r124 = chest2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 80).addBox(0.0F, -1.5332F, -0.1792F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8976F, -1.7698F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8647F, -1.6621F));

		PartDefinition cube_r125 = neck3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(53, 25).addBox(0.0F, -1.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 45).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9976F, -3.0698F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-2.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8413F, -1.7467F, 0.3863F, 0.5816F, -1.1399F));

		PartDefinition cube_r127 = neck3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8413F, -1.7467F, 0.6055F, 0.3064F, -0.643F));

		PartDefinition cube_r128 = neck3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(45, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8413F, -1.7467F, 0.6055F, -0.3064F, 0.643F));

		PartDefinition cube_r129 = neck3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(64, 18).addBox(0.866F, -0.4995F, -0.5218F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8413F, -1.7467F, 0.3863F, -0.5816F, 1.1399F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0164F, -2.2286F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r130 = neck2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(24, 61).addBox(-0.5F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 12).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5024F, -1.7698F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r131 = neck2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-2.0F, 0.05F, -0.275F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2587F, -1.4467F, 0.1554F, 0.3717F, -1.1907F));

		PartDefinition cube_r132 = neck2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, 0.05F, -0.275F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2587F, -1.4467F, 0.1554F, -0.3717F, 1.1907F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4628F, -2.2113F, -1.8131F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r133 = neck4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 80).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 54).addBox(-0.5F, -0.2F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4628F, 0.6402F, -0.7361F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r134 = neck4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(29, 66).mirror().addBox(-2.349F, 0.1141F, -0.1026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9257F, 0.9976F, -1.1698F, 0.3322F, 0.5981F, -1.054F));

		PartDefinition cube_r135 = neck4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(29, 66).addBox(0.349F, 0.1141F, -0.1026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9976F, -1.1698F, 0.3322F, -0.5981F, 1.054F));

		PartDefinition neck = neck4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4628F, -0.5845F, -1.6957F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r136 = neck.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(49, 58).addBox(-0.5F, -1.5F, -3.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 53).addBox(-1.0F, -0.1985F, -3.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.2247F, 0.9597F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r137 = neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(-0.0024F, -0.4643F, -1.4645F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4628F, 1.5821F, 0.526F, 0.3322F, 0.5981F, -1.054F));

		PartDefinition cube_r138 = neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(79, 55).addBox(-0.9976F, -0.4643F, -1.4645F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4628F, 1.5821F, 0.526F, 0.3322F, -0.5981F, 1.054F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2888F, -1.7432F, -0.2566F, 0.056F, 0.2538F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(52, 73).addBox(-0.5F, -0.25F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.5891F, -6.0637F, 0.2799F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(47, 73).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0969F, -5.0962F, 0.9781F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(73, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.6749F, -6.0028F, 1.0304F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(73, 32).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.885F, -5.1119F, 1.0828F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(32, 72).addBox(-0.5F, -0.0114F, -0.9495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.1435F, -4.5189F, 1.013F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(72, 26).addBox(0.0F, 0.0628F, -1.9253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7024F, -0.6697F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(20, 42).addBox(0.0F, 1.9947F, -6.0085F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(0, 38).addBox(-1.0F, 1.9947F, -3.0085F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(25, 74).addBox(0.0F, -0.0053F, -0.0085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.2962F, -2.2799F, 0.5367F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(28, 18).addBox(-2.0F, -1.0053F, -0.0085F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(0, 27).addBox(-2.0F, -2.8053F, 0.9915F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 2.7933F, -1.6054F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(74, 22).addBox(0.0F, -0.1053F, -0.6336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.0546F, -2.4458F, 0.8683F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(39, 54).addBox(0.0F, -0.0803F, -2.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5154F, -1.6242F, 0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(73, 29).addBox(-0.5F, -0.025F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(7, 54).addBox(-0.5F, -0.025F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.5497F, -3.2468F, 0.4276F, 0.0F, 0.0F));

		PartDefinition leftface = head.addOrReplaceChild("leftface", CubeListBuilder.create(), PartPose.offset(0.2373F, 4.7351F, -7.6352F));

		PartDefinition cube_r150 = leftface.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(77, 6).addBox(-0.95F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 77).addBox(-0.95F, -0.15F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5497F, -1.2714F, 1.7483F, 0.9889F, 0.1186F, 0.1236F));

		PartDefinition cube_r151 = leftface.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(17, 69).addBox(-0.95F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4157F, -0.6146F, 1.3117F, 0.9366F, 0.1186F, 0.1236F));

		PartDefinition cube_r152 = leftface.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(62, 74).addBox(-0.05F, 0.075F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.149F, -3.7194F, 3.3161F, 0.4739F, -0.3912F, -0.1297F));

		PartDefinition cube_r153 = leftface.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(61, 63).addBox(-0.9816F, -0.0614F, -1.0276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9504F, -4.1898F, 4.073F, 1.9312F, 0.5872F, 0.1793F));

		PartDefinition cube_r154 = leftface.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(42, 75).addBox(-0.9816F, 0.5233F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 75).addBox(-0.9816F, 0.0233F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1832F, -3.6022F, 2.9085F, 2.0402F, 0.5207F, 0.1543F));

		PartDefinition cube_r155 = leftface.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(75, 38).addBox(-1.0464F, -0.0227F, -1.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8397F, -2.8533F, 2.3758F, 1.1709F, 0.281F, 0.1176F));

		PartDefinition cube_r156 = leftface.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 75).addBox(-1.0463F, 0.0423F, -0.0056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6219F, -2.026F, 1.9627F, 1.1128F, 0.3201F, 0.1584F));

		PartDefinition cube_r157 = leftface.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(72, 74).addBox(-1.0108F, 0.0146F, -1.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2397F, -3.6033F, 2.9008F, 0.9468F, 0.4411F, 0.2035F));

		PartDefinition cube_r158 = leftface.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(67, 77).addBox(-0.5F, -0.6715F, -2.2322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3127F, -3.8411F, 8.2353F, -0.8387F, 0.0211F, -0.0847F));

		PartDefinition cube_r159 = leftface.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(67, 20).addBox(-0.5083F, -0.4367F, -0.228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.481F, -2.7938F, 8.5635F, -0.011F, 0.0112F, -0.1011F));

		PartDefinition cube_r160 = leftface.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 45).addBox(-0.5083F, 0.1235F, -0.1217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.481F, -2.7938F, 8.5635F, 0.6435F, 0.0112F, -0.1011F));

		PartDefinition cube_r161 = leftface.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(19, 61).addBox(-0.425F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7462F, -0.8084F, 4.7496F, 1.8367F, 0.3984F, -0.0812F));

		PartDefinition cube_r162 = leftface.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(67, 13).addBox(-0.7877F, -2.0985F, -0.2729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.764F, 0.435F, 3.5877F, 1.9294F, 0.1938F, 0.1492F));

		PartDefinition cube_r163 = leftface.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(12, 67).addBox(-0.7568F, -1.4617F, -0.2497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.764F, 0.435F, 3.5877F, 1.7538F, 0.2147F, 0.0921F));

		PartDefinition cube_r164 = leftface.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(69, 59).addBox(-0.7568F, -0.7659F, -0.1517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.764F, 0.435F, 3.5877F, 1.9283F, 0.2147F, 0.0921F));

		PartDefinition cube_r165 = leftface.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(56, 63).addBox(-0.5F, -0.9F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.795F, 0.2708F, 4.4804F, 2.0275F, 0.3363F, 0.0954F));

		PartDefinition cube_r166 = leftface.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(66, 62).addBox(-0.8195F, -0.1418F, -0.8247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0917F, 0.0029F, 0.9634F, 2.1163F, 0.3141F, -0.1053F));

		PartDefinition cube_r167 = leftface.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(67, 10).addBox(-0.8195F, -0.3002F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0917F, 0.0029F, 0.9634F, 2.509F, 0.3141F, -0.1053F));

		PartDefinition cube_r168 = leftface.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(5, 68).addBox(-0.8195F, 0.2993F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0917F, 0.0029F, 0.9634F, 1.9854F, 0.3141F, -0.1053F));

		PartDefinition cube_r169 = leftface.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(36, 66).addBox(-0.9695F, 0.6399F, -0.7715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(67, 7).addBox(-0.9695F, 1.0399F, -0.8215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0917F, 0.0029F, 0.9634F, 1.8109F, 0.3141F, -0.1053F));

		PartDefinition cube_r170 = leftface.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(28, 60).addBox(-0.9695F, 0.7175F, -1.0712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0917F, 0.0029F, 0.9634F, 2.2908F, 0.3141F, -0.1053F));

		PartDefinition cube_r171 = leftface.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 74).addBox(-0.504F, -0.1831F, 0.0358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8028F, -2.1643F, 3.5914F, -1.9362F, 0.5056F, 0.1706F));

		PartDefinition cube_r172 = leftface.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 74).addBox(-0.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0972F, -0.143F, 1.6608F, -1.964F, 0.138F, 0.1433F));

		PartDefinition cube_r173 = leftface.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(57, 74).addBox(-0.525F, -0.275F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4938F, -0.681F, 3.3417F, -2.0143F, 0.3043F, -0.0002F));

		PartDefinition cube_r174 = leftface.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(74, 55).addBox(-0.3625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 72).addBox(-0.6375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.9632F, -2.2409F, 3.6831F, -2.3724F, 0.4874F, 0.1897F));

		PartDefinition cube_r175 = leftface.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(71, 65).addBox(-0.504F, -0.8901F, -0.4107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8028F, -2.1643F, 3.5914F, -2.6779F, 0.5056F, 0.1706F));

		PartDefinition cube_r176 = leftface.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(76, 44).addBox(-0.5207F, -0.0054F, -0.9825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8028F, -2.1643F, 3.5914F, 2.5032F, 0.5353F, 0.1981F));

		PartDefinition cube_r177 = leftface.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(76, 61).addBox(-0.5207F, 0.3458F, -0.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 76).addBox(-0.5207F, 0.3458F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(75, 0).addBox(-0.5207F, 0.0958F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8028F, -2.1643F, 3.5914F, 2.0232F, 0.5353F, 0.1981F));

		PartDefinition cube_r178 = leftface.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(69, 56).addBox(-0.504F, -0.7767F, -1.1595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.66F, -3.0868F, 3.0541F, 2.6628F, 0.5056F, 0.1706F));

		PartDefinition cube_r179 = leftface.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(32, 52).addBox(-0.9695F, 1.9045F, -1.065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0917F, 0.0029F, 0.9634F, 1.933F, 0.3141F, -0.1053F));

		PartDefinition cube_r180 = leftface.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(77, 74).addBox(-0.8572F, 0.8771F, -0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.1839F, -2.292F, 7.0999F, 2.1478F, -0.451F, 0.2782F));

		PartDefinition cube_r181 = leftface.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 41).addBox(-0.9459F, -0.0313F, -0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1839F, -2.292F, 7.0999F, 2.1254F, -0.37F, 0.3343F));

		PartDefinition cube_r182 = leftface.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(15, 78).addBox(1.2088F, -0.2249F, 0.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8838F, -1.6267F, 6.5022F, 2.303F, -0.3732F, 0.2272F));

		PartDefinition cube_r183 = leftface.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(76, 15).addBox(0.8038F, 0.5539F, -0.062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8838F, -1.2207F, 6.0172F, 2.3166F, -0.0165F, 0.5687F));

		PartDefinition cube_r184 = leftface.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(71, 62).addBox(-0.2379F, 1.4994F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8838F, -1.0064F, 4.3819F, 2.1616F, 0.2765F, 0.8822F));

		PartDefinition cube_r185 = leftface.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(38, 62).addBox(-0.6529F, -0.3575F, -0.491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8838F, -1.0064F, 4.3819F, 2.1927F, 0.4912F, 1.0471F));

		PartDefinition cube_r186 = leftface.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(59, 16).addBox(-0.9117F, -1.4324F, -0.9602F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8838F, -1.1051F, 3.2683F, 2.0221F, 0.3619F, 0.9367F));

		PartDefinition cube_r187 = leftface.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(45, 50).addBox(-0.5286F, -0.8527F, -0.8387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.481F, -2.7938F, 8.5635F, 1.9435F, 0.0145F, -0.0807F));

		PartDefinition cube_r188 = leftface.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(33, 62).addBox(-0.5083F, -1.499F, -1.0129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(67, 4).addBox(-0.5083F, -0.499F, -0.3879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.481F, -2.7938F, 8.5635F, 1.6471F, 0.0112F, -0.1011F));

		PartDefinition cube_r189 = leftface.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(66, 65).addBox(-0.5083F, -1.0048F, -0.4993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.481F, -2.7938F, 8.5635F, 0.7744F, 0.0112F, -0.1011F));

		PartDefinition cube_r190 = leftface.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(46, 54).addBox(-1.0213F, -1.0061F, -1.992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9712F, -1.0298F, 4.9696F, 0.0186F, 0.5085F, 0.175F));

		PartDefinition cube_r191 = leftface.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(37, 27).addBox(-3.0213F, 0.3939F, -1.992F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(33, 0).addBox(-1.0213F, -0.5061F, -3.992F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.8654F, -3.1011F, 5.9025F, 0.5073F, 0.5085F, 0.175F));

		PartDefinition cube_r192 = leftface.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0213F, -1.4061F, -2.992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8654F, -3.1011F, 5.9025F, 0.5121F, 0.5237F, 0.1848F));

		PartDefinition cube_r193 = leftface.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(71, 71).addBox(-0.4939F, 0.2565F, -1.3495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(57, 25).addBox(-0.4939F, -0.4435F, -1.3495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3653F, -3.4441F, 6.6471F, -2.7994F, 0.0449F, -0.1041F));

		PartDefinition cube_r194 = leftface.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(77, 50).addBox(-0.4939F, -1.3904F, -0.2907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3653F, -3.4441F, 6.6471F, -1.7522F, 0.0449F, -0.1041F));

		PartDefinition cube_r195 = leftface.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(66, 71).addBox(-0.4939F, -0.7321F, 0.3785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3653F, -3.4441F, 6.6471F, -1.1413F, 0.0449F, -0.1041F));

		PartDefinition cube_r196 = leftface.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(12, 63).addBox(-0.4939F, -0.6298F, 0.0032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3653F, -3.4441F, 6.6471F, 2.3057F, 0.0449F, -0.1041F));

		PartDefinition cube_r197 = leftface.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(48, 65).addBox(-0.4939F, -1.913F, 0.0198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.4866F, -2.1385F, 6.3535F, 0.4731F, 0.0449F, -0.1041F));

		PartDefinition cube_r198 = leftface.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(72, 9).addBox(-0.4952F, -0.8928F, -0.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 6).addBox(-0.4952F, -0.4928F, -0.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0657F, -2.811F, 5.602F, 0.1064F, 0.5024F, 0.1672F));

		PartDefinition cube_r199 = leftface.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(72, 3).addBox(-0.4968F, -0.267F, -0.1737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0657F, -2.811F, 5.602F, -0.4852F, 0.5098F, 0.1619F));

		PartDefinition cube_r200 = leftface.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(63, 33).addBox(-0.9788F, -1.2409F, -0.9878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8989F, -2.7898F, 6.0385F, 0.5601F, 0.5363F, 0.1896F));

		PartDefinition cube_r201 = leftface.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(35, 77).addBox(-0.4939F, 0.387F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3653F, -3.469F, 6.7471F, 0.0804F, 0.0449F, -0.1041F));

		PartDefinition cube_r202 = leftface.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(25, 47).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3409F, -3.274F, 6.3723F, 0.4331F, 0.0288F, -0.1002F));

		PartDefinition cube_r203 = leftface.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(38, 46).addBox(-0.475F, -1.4281F, -1.9462F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3127F, -3.8411F, 8.2353F, 0.2586F, 0.0288F, -0.1002F));

		PartDefinition cube_r204 = leftface.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(46, 31).addBox(-0.2036F, -0.9433F, 0.2252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0304F, -3.8498F, 6.1989F, 1.4522F, -0.7825F, -1.4654F));

		PartDefinition cube_r205 = leftface.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(70, 40).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1576F, -3.8402F, 5.3974F, 0.5397F, -0.2622F, -0.2189F));

		PartDefinition cube_r206 = leftface.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(10, 70).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1712F, -4.3379F, 6.2646F, 1.4908F, -1.0496F, -1.5435F));

		PartDefinition cube_r207 = leftface.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(70, 0).addBox(0.2163F, 0.0572F, 0.7509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2682F, -4.9143F, 6.0101F, 1.9436F, -0.3329F, -2.3061F));

		PartDefinition cube_r208 = leftface.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(55, 30).addBox(-0.6945F, -0.0678F, 0.0901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2682F, -4.9143F, 6.0101F, 1.7215F, -0.8444F, -1.8775F));

		PartDefinition cube_r209 = leftface.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(77, 12).addBox(-0.0195F, 0.0572F, 0.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2682F, -4.9143F, 6.0101F, 1.8454F, -0.4167F, -2.0393F));

		PartDefinition cube_r210 = leftface.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(72, 12).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.955F, -3.927F, 5.345F, 1.0289F, -0.953F, -0.9996F));

		PartDefinition cube_r211 = leftface.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(37, 74).addBox(-0.6F, -0.4F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7394F, -4.0878F, 5.562F, 0.8079F, -0.814F, -0.7151F));

		PartDefinition cube_r212 = leftface.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(56, 42).addBox(-1.1F, -0.4F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7394F, -4.0878F, 5.562F, 1.4009F, -1.0431F, -1.4397F));

		PartDefinition cube_r213 = leftface.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 47).addBox(-1.5F, -0.4F, -1.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7394F, -4.0378F, 5.562F, 1.4009F, -1.0431F, -1.4397F));

		PartDefinition cube_r214 = leftface.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(21, 57).addBox(-0.1189F, -0.2433F, -0.6406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3617F, -4.9902F, 6.408F, 1.7499F, -0.3251F, -1.7671F));

		PartDefinition cube_r215 = leftface.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(59, 49).addBox(-1.7164F, -0.1173F, -0.434F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3617F, -4.9902F, 6.408F, 1.7662F, 0.1854F, 2.2251F));

		PartDefinition cube_r216 = leftface.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(71, 16).addBox(-0.15F, -0.225F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.9077F, -5.6891F, 6.924F, 0.4081F, 1.2493F, 1.9749F));

		PartDefinition cube_r217 = leftface.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(71, 46).addBox(-0.5499F, -0.5F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(3.2631F, -5.089F, 6.631F, 2.016F, -0.0219F, 3.1294F));

		PartDefinition cube_r218 = leftface.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(71, 49).addBox(-0.5514F, -0.5F, -0.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.2631F, -5.089F, 6.631F, 1.8793F, -0.3269F, -2.4104F));

		PartDefinition cube_r219 = leftface.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(32, 69).addBox(-0.5499F, -0.5F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(3.3381F, -5.539F, 6.831F, 1.9083F, 0.0464F, 2.6793F));

		PartDefinition cube_r220 = leftface.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(71, 43).addBox(-0.5514F, -0.5F, -0.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.3381F, -5.539F, 6.831F, 1.8456F, -0.2037F, -2.8503F));

		PartDefinition cube_r221 = leftface.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(27, 71).addBox(-0.5499F, -0.5F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(3.1132F, -6.064F, 7.006F, 1.7347F, 0.2231F, 1.9862F));

		PartDefinition cube_r222 = leftface.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(37, 71).addBox(-0.5514F, -0.5F, -0.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.1132F, -6.064F, 7.006F, 1.8454F, 0.0286F, 2.8139F));

		PartDefinition cube_r223 = leftface.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(22, 71).addBox(-0.25F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(2.1205F, -6.4899F, 7.1772F, 1.5696F, 0.2685F, 1.3995F));

		PartDefinition cube_r224 = leftface.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(5, 71).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5422F, -6.3282F, 7.1141F, 1.7116F, 0.2294F, 1.9614F));

		PartDefinition cube_r225 = leftface.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(61, 71).addBox(-1.7035F, -0.1173F, 0.4824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3617F, -4.9902F, 6.408F, 1.6465F, 0.2579F, 1.6931F));

		PartDefinition cube_r226 = leftface.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(77, 9).addBox(-0.7841F, -0.8673F, -0.7145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.5806F, -5.0187F, 7.2113F, 1.4925F, 0.6085F, 1.1233F));

		PartDefinition cube_r227 = leftface.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(47, 76).addBox(-0.35F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2373F, 0.6171F, 1.0885F, 0.5854F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftface.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(72, 77).addBox(-0.8841F, -0.1673F, -0.8145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.4046F, -5.5663F, 6.3933F, 1.4925F, 0.6085F, 1.1233F));

		PartDefinition cube_r229 = leftface.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(73, 68).addBox(-0.7341F, -0.1173F, 1.1355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3617F, -4.9902F, 6.408F, 1.5043F, 0.2603F, 1.151F));

		PartDefinition cube_r230 = leftface.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(57, 77).addBox(-1.6763F, -1.0183F, -0.7532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 25).addBox(-0.9763F, -1.0183F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3766F, -4.6704F, 7.0031F, 0.9672F, 0.2367F, 0.1796F));

		PartDefinition cube_r231 = leftface.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(20, 74).addBox(-0.725F, -0.3F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3377F, 0.4257F, 1.3773F, 0.9325F, 0.4299F, 0.3088F));

		PartDefinition cube_r232 = leftface.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(76, 47).addBox(-0.725F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1377F, 0.6171F, 1.0885F, 0.6533F, 0.4299F, 0.3088F));

		PartDefinition cube_r233 = leftface.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(5, 74).addBox(-0.75F, -0.4F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1127F, 0.3048F, 0.9987F, 0.3121F, 0.4515F, 0.1399F));

		PartDefinition cube_r234 = leftface.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(62, 77).addBox(-0.9763F, -1.0433F, -0.2782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0304F, -3.8498F, 6.1989F, 0.7229F, 0.2367F, 0.1796F));

		PartDefinition cube_r235 = leftface.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(60, 21).addBox(-1.3108F, -0.8723F, -0.1185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8334F, -0.9522F, 2.3587F, 0.9561F, -0.2004F, -0.3906F));

		PartDefinition cube_r236 = leftface.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(60, 5).addBox(-1.1693F, -0.8723F, -0.3061F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.8334F, -0.9522F, 2.3587F, 1.0176F, -0.3454F, -0.6172F));

		PartDefinition cube_r237 = leftface.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(56, 38).addBox(-0.4245F, -0.8723F, 0.135F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.8334F, -0.9522F, 2.3587F, 0.9751F, 0.257F, 0.243F));

		PartDefinition rightface = head.addOrReplaceChild("rightface", CubeListBuilder.create(), PartPose.offset(-0.2373F, 4.7351F, -7.6352F));

		PartDefinition cube_r238 = rightface.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-0.05F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 77).mirror().addBox(-0.05F, -0.15F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.5497F, -1.2714F, 1.7483F, 0.9889F, -0.1186F, -0.1236F));

		PartDefinition cube_r239 = rightface.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(17, 69).mirror().addBox(-0.05F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4157F, -0.6146F, 1.3117F, 0.9366F, -0.1186F, -0.1236F));

		PartDefinition cube_r240 = rightface.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(62, 74).mirror().addBox(-0.95F, 0.075F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.149F, -3.7194F, 3.3161F, 0.4739F, 0.3912F, 0.1297F));

		PartDefinition cube_r241 = rightface.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(61, 63).mirror().addBox(-0.0184F, -0.0614F, -1.0276F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9504F, -4.1898F, 4.073F, 1.9312F, -0.5872F, -0.1793F));

		PartDefinition cube_r242 = rightface.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(42, 75).mirror().addBox(-0.0184F, 0.5233F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 75).mirror().addBox(-0.0184F, 0.0233F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1832F, -3.6022F, 2.9085F, 2.0402F, -0.5207F, -0.1543F));

		PartDefinition cube_r243 = rightface.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(75, 38).mirror().addBox(0.0464F, -0.0227F, -1.9313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8397F, -2.8533F, 2.3758F, 1.1709F, -0.281F, -0.1176F));

		PartDefinition cube_r244 = rightface.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(0.0464F, 0.0423F, -0.0056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6219F, -2.026F, 1.9627F, 1.1128F, -0.3201F, -0.1584F));

		PartDefinition cube_r245 = rightface.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(72, 74).mirror().addBox(0.0108F, 0.0146F, -1.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2397F, -3.6033F, 2.9008F, 0.9468F, -0.4411F, -0.2035F));

		PartDefinition cube_r246 = rightface.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-0.5F, -0.6715F, -2.2322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3127F, -3.8411F, 8.2353F, -0.8387F, -0.0211F, 0.0847F));

		PartDefinition cube_r247 = rightface.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(67, 20).mirror().addBox(-0.4917F, -0.4367F, -0.228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.481F, -2.7938F, 8.5635F, -0.011F, -0.0112F, 0.1011F));

		PartDefinition cube_r248 = rightface.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(66, 45).mirror().addBox(-0.4917F, 0.1235F, -0.1217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.481F, -2.7938F, 8.5635F, 0.6435F, -0.0112F, 0.1011F));

		PartDefinition cube_r249 = rightface.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(19, 61).mirror().addBox(-0.575F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7462F, -0.8084F, 4.7496F, 1.8367F, -0.3984F, 0.0812F));

		PartDefinition cube_r250 = rightface.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(67, 13).mirror().addBox(-0.2123F, -2.0985F, -0.2729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.764F, 0.435F, 3.5877F, 1.9294F, -0.1938F, -0.1492F));

		PartDefinition cube_r251 = rightface.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(12, 67).mirror().addBox(-0.2432F, -1.4617F, -0.2497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.764F, 0.435F, 3.5877F, 1.7538F, -0.2147F, -0.0921F));

		PartDefinition cube_r252 = rightface.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(69, 59).mirror().addBox(-0.2432F, -0.7659F, -0.1517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.764F, 0.435F, 3.5877F, 1.9283F, -0.2147F, -0.0921F));

		PartDefinition cube_r253 = rightface.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(56, 63).mirror().addBox(-0.5F, -0.9F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.795F, 0.2708F, 4.4804F, 2.0275F, -0.3363F, -0.0954F));

		PartDefinition cube_r254 = rightface.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-0.1805F, -0.1418F, -0.8247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0917F, 0.0029F, 0.9634F, 2.1163F, -0.3141F, 0.1053F));

		PartDefinition cube_r255 = rightface.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(67, 10).mirror().addBox(-0.1805F, -0.3002F, -1.2757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0917F, 0.0029F, 0.9634F, 2.509F, -0.3141F, 0.1053F));

		PartDefinition cube_r256 = rightface.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-0.1805F, 0.2993F, -1.1652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0917F, 0.0029F, 0.9634F, 1.9854F, -0.3141F, 0.1053F));

		PartDefinition cube_r257 = rightface.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(36, 66).mirror().addBox(-0.0305F, 0.6399F, -0.7715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(67, 7).mirror().addBox(-0.0305F, 1.0399F, -0.8215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0917F, 0.0029F, 0.9634F, 1.8109F, -0.3141F, 0.1053F));

		PartDefinition cube_r258 = rightface.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-0.0305F, 0.7175F, -1.0712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0917F, 0.0029F, 0.9634F, 2.2908F, -0.3141F, 0.1053F));

		PartDefinition cube_r259 = rightface.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.496F, -0.1831F, 0.0358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8028F, -2.1643F, 3.5914F, -1.9362F, -0.5056F, -0.1706F));

		PartDefinition cube_r260 = rightface.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-0.35F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0972F, -0.143F, 1.6608F, -1.964F, -0.138F, -0.1433F));

		PartDefinition cube_r261 = rightface.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-0.475F, -0.275F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4938F, -0.681F, 3.3417F, -2.0143F, -0.3043F, 0.0002F));

		PartDefinition cube_r262 = rightface.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(-0.6375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(15, 72).mirror().addBox(-0.3625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9632F, -2.2409F, 3.6831F, -2.3724F, -0.4874F, -0.1897F));

		PartDefinition cube_r263 = rightface.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-0.496F, -0.8901F, -0.4107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8028F, -2.1643F, 3.5914F, -2.6779F, -0.5056F, -0.1706F));

		PartDefinition cube_r264 = rightface.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-0.4793F, -0.0054F, -0.9825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8028F, -2.1643F, 3.5914F, 2.5032F, -0.5353F, -0.1981F));

		PartDefinition cube_r265 = rightface.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-0.4793F, 0.3458F, -0.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 76).mirror().addBox(-0.4793F, 0.3458F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(75, 0).mirror().addBox(-0.4793F, 0.0958F, 0.0503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8028F, -2.1643F, 3.5914F, 2.0232F, -0.5353F, -0.1981F));

		PartDefinition cube_r266 = rightface.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-0.496F, -0.7767F, -1.1595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.66F, -3.0868F, 3.0541F, 2.6628F, -0.5056F, -0.1706F));

		PartDefinition cube_r267 = rightface.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(32, 52).mirror().addBox(-0.0305F, 1.9045F, -1.065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0917F, 0.0029F, 0.9634F, 1.933F, -0.3141F, 0.1053F));

		PartDefinition cube_r268 = rightface.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(77, 74).mirror().addBox(-0.1428F, 0.8771F, -0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1839F, -2.292F, 7.0999F, 2.1478F, 0.451F, -0.2782F));

		PartDefinition cube_r269 = rightface.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(76, 41).mirror().addBox(-0.0541F, -0.0313F, -0.9867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1839F, -2.292F, 7.0999F, 2.1254F, 0.37F, -0.3343F));

		PartDefinition cube_r270 = rightface.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-2.2088F, -0.2249F, 0.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8838F, -1.6267F, 6.5022F, 2.303F, 0.3732F, -0.2272F));

		PartDefinition cube_r271 = rightface.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-1.8038F, 0.5539F, -0.062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8838F, -1.2207F, 6.0172F, 2.3166F, 0.0165F, -0.5687F));

		PartDefinition cube_r272 = rightface.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-0.7621F, 1.4994F, -0.5398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8838F, -1.0064F, 4.3819F, 2.1616F, -0.2765F, -0.8822F));

		PartDefinition cube_r273 = rightface.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(-0.3471F, -0.3575F, -0.491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8838F, -1.0064F, 4.3819F, 2.1927F, -0.4912F, -1.0471F));

		PartDefinition cube_r274 = rightface.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-0.0883F, -1.4324F, -0.9602F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8838F, -1.1051F, 3.2683F, 2.0221F, -0.3619F, -0.9367F));

		PartDefinition cube_r275 = rightface.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(45, 50).mirror().addBox(-0.4714F, -0.8527F, -0.8387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.481F, -2.7938F, 8.5635F, 1.9435F, -0.0145F, 0.0807F));

		PartDefinition cube_r276 = rightface.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(33, 62).mirror().addBox(-0.4917F, -1.499F, -1.0129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(67, 4).mirror().addBox(-0.4917F, -0.499F, -0.3879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.481F, -2.7938F, 8.5635F, 1.6471F, -0.0112F, 0.1011F));

		PartDefinition cube_r277 = rightface.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-0.4917F, -1.0048F, -0.4993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.481F, -2.7938F, 8.5635F, 0.7744F, -0.0112F, 0.1011F));

		PartDefinition cube_r278 = rightface.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(46, 54).mirror().addBox(0.0213F, -1.0061F, -1.992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9712F, -1.0298F, 4.9696F, 0.0186F, -0.5085F, -0.175F));

		PartDefinition cube_r279 = rightface.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(37, 27).mirror().addBox(0.0213F, 0.3939F, -1.992F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(33, 0).mirror().addBox(0.0213F, -0.5061F, -3.992F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8654F, -3.1011F, 5.9025F, 0.5073F, -0.5085F, -0.175F));

		PartDefinition cube_r280 = rightface.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(0.0213F, -1.4061F, -2.992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8654F, -3.1011F, 5.9025F, 0.5121F, -0.5237F, -0.1848F));

		PartDefinition cube_r281 = rightface.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(71, 71).mirror().addBox(-0.5061F, 0.2565F, -1.3495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(57, 25).mirror().addBox(-0.5061F, -0.4435F, -1.3495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3653F, -3.4441F, 6.6471F, -2.7994F, -0.0449F, 0.1041F));

		PartDefinition cube_r282 = rightface.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.5061F, -1.3904F, -0.2907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3653F, -3.4441F, 6.6471F, -1.7522F, -0.0449F, 0.1041F));

		PartDefinition cube_r283 = rightface.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(-0.5061F, -0.7321F, 0.3785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3653F, -3.4441F, 6.6471F, -1.1413F, -0.0449F, 0.1041F));

		PartDefinition cube_r284 = rightface.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(12, 63).mirror().addBox(-0.5061F, -0.6298F, 0.0032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3653F, -3.4441F, 6.6471F, 2.3057F, -0.0449F, 0.1041F));

		PartDefinition cube_r285 = rightface.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(48, 65).mirror().addBox(-0.5061F, -1.913F, 0.0198F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4866F, -2.1385F, 6.3535F, 0.4731F, -0.0449F, 0.1041F));

		PartDefinition cube_r286 = rightface.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(72, 9).mirror().addBox(-0.5048F, -0.8928F, -0.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 6).mirror().addBox(-0.5048F, -0.4928F, -0.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0657F, -2.811F, 5.602F, 0.1064F, -0.5024F, -0.1672F));

		PartDefinition cube_r287 = rightface.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(72, 3).mirror().addBox(-0.5032F, -0.267F, -0.1737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0657F, -2.811F, 5.602F, -0.4852F, -0.5098F, -0.1619F));

		PartDefinition cube_r288 = rightface.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-0.0212F, -1.2409F, -0.9878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8989F, -2.7898F, 6.0385F, 0.5601F, -0.5363F, -0.1896F));

		PartDefinition cube_r289 = rightface.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.5061F, 0.387F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3653F, -3.469F, 6.7471F, 0.0804F, -0.0449F, 0.1041F));

		PartDefinition cube_r290 = rightface.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3409F, -3.274F, 6.3723F, 0.4331F, -0.0288F, 0.1002F));

		PartDefinition cube_r291 = rightface.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(38, 46).mirror().addBox(-0.525F, -1.4281F, -1.9462F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3127F, -3.8411F, 8.2353F, 0.2586F, -0.0288F, 0.1002F));

		PartDefinition cube_r292 = rightface.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(-0.7964F, -0.9433F, 0.2252F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0304F, -3.8498F, 6.1989F, 1.4522F, 0.7825F, 1.4654F));

		PartDefinition cube_r293 = rightface.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(70, 40).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1576F, -3.8402F, 5.3974F, 0.5397F, 0.2622F, 0.2189F));

		PartDefinition cube_r294 = rightface.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1712F, -4.3379F, 6.2646F, 1.4908F, 1.0496F, 1.5435F));

		PartDefinition cube_r295 = rightface.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-1.2163F, 0.0572F, 0.7509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2682F, -4.9143F, 6.0101F, 1.9436F, 0.3329F, 2.3061F));

		PartDefinition cube_r296 = rightface.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(-0.3055F, -0.0678F, 0.0901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2682F, -4.9143F, 6.0101F, 1.7215F, 0.8444F, 1.8775F));

		PartDefinition cube_r297 = rightface.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-0.9805F, 0.0572F, 0.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2682F, -4.9143F, 6.0101F, 1.8454F, 0.4167F, 2.0393F));

		PartDefinition cube_r298 = rightface.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.955F, -3.927F, 5.345F, 1.0289F, 0.953F, 0.9996F));

		PartDefinition cube_r299 = rightface.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(37, 74).mirror().addBox(-0.4F, -0.4F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7394F, -4.0878F, 5.562F, 0.8079F, 0.814F, 0.7151F));

		PartDefinition cube_r300 = rightface.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-0.9F, -0.4F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7394F, -4.0878F, 5.562F, 1.4009F, 1.0431F, 1.4397F));

		PartDefinition cube_r301 = rightface.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.5F, -0.4F, -1.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7394F, -4.0378F, 5.562F, 1.4009F, 1.0431F, 1.4397F));

		PartDefinition cube_r302 = rightface.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(21, 57).mirror().addBox(-0.8811F, -0.2433F, -0.6406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3617F, -4.9902F, 6.408F, 1.7499F, 0.3251F, 1.7671F));

		PartDefinition cube_r303 = rightface.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(59, 49).mirror().addBox(-0.2836F, -0.1173F, -0.434F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3617F, -4.9902F, 6.408F, 1.7662F, -0.1854F, -2.2251F));

		PartDefinition cube_r304 = rightface.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-0.85F, -0.225F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9077F, -5.6891F, 6.924F, 0.4081F, -1.2493F, -1.9749F));

		PartDefinition cube_r305 = rightface.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(71, 46).mirror().addBox(-0.4501F, -0.5F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-3.2631F, -5.089F, 6.631F, 2.016F, 0.0219F, -3.1294F));

		PartDefinition cube_r306 = rightface.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-0.4486F, -0.5F, -0.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.2631F, -5.089F, 6.631F, 1.8793F, 0.3269F, 2.4104F));

		PartDefinition cube_r307 = rightface.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(32, 69).mirror().addBox(-0.4501F, -0.5F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-3.3381F, -5.539F, 6.831F, 1.9083F, -0.0464F, -2.6793F));

		PartDefinition cube_r308 = rightface.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(71, 43).mirror().addBox(-0.4486F, -0.5F, -0.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.3381F, -5.539F, 6.831F, 1.8456F, 0.2037F, 2.8503F));

		PartDefinition cube_r309 = rightface.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(27, 71).mirror().addBox(-0.4501F, -0.5F, -0.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-3.1132F, -6.064F, 7.006F, 1.7347F, -0.2231F, -1.9862F));

		PartDefinition cube_r310 = rightface.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(37, 71).mirror().addBox(-0.4486F, -0.5F, -0.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.1132F, -6.064F, 7.006F, 1.8454F, -0.0286F, -2.8139F));

		PartDefinition cube_r311 = rightface.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(22, 71).mirror().addBox(-0.75F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-2.1205F, -6.4899F, 7.1772F, 1.5696F, -0.2685F, -1.3995F));

		PartDefinition cube_r312 = rightface.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5422F, -6.3282F, 7.1141F, 1.7116F, -0.2294F, -1.9614F));

		PartDefinition cube_r313 = rightface.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(61, 71).mirror().addBox(0.7035F, -0.1173F, 0.4824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3617F, -4.9902F, 6.408F, 1.6465F, -0.2579F, -1.6931F));

		PartDefinition cube_r314 = rightface.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.2159F, -0.8673F, -0.7145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.5806F, -5.0187F, 7.2113F, 1.4925F, -0.6085F, -1.1233F));

		PartDefinition cube_r315 = rightface.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-0.65F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2373F, 0.6171F, 1.0885F, 0.5854F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightface.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(72, 77).mirror().addBox(-0.1159F, -0.1673F, -0.8145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.4046F, -5.5663F, 6.3933F, 1.4925F, -0.6085F, -1.1233F));

		PartDefinition cube_r317 = rightface.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(73, 68).mirror().addBox(-0.2659F, -0.1173F, 1.1355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3617F, -4.9902F, 6.408F, 1.5043F, -0.2603F, -1.151F));

		PartDefinition cube_r318 = rightface.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(57, 77).mirror().addBox(0.6763F, -1.0183F, -0.7532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 25).mirror().addBox(-0.0237F, -1.0183F, -0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.3766F, -4.6704F, 7.0031F, 0.9672F, -0.2367F, -0.1796F));

		PartDefinition cube_r319 = rightface.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.275F, -0.3F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3377F, 0.4257F, 1.3773F, 0.9325F, -0.4299F, -0.3088F));

		PartDefinition cube_r320 = rightface.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-0.275F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1377F, 0.6171F, 1.0885F, 0.6533F, -0.4299F, -0.3088F));

		PartDefinition cube_r321 = rightface.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-0.25F, -0.4F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1127F, 0.3048F, 0.9987F, 0.3121F, -0.4515F, -0.1399F));

		PartDefinition cube_r322 = rightface.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(62, 77).mirror().addBox(-0.0237F, -1.0433F, -0.2782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0304F, -3.8498F, 6.1989F, 0.7229F, -0.2367F, -0.1796F));

		PartDefinition cube_r323 = rightface.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.6892F, -0.8723F, -0.1185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8334F, -0.9522F, 2.3587F, 0.9561F, 0.2004F, 0.3906F));

		PartDefinition cube_r324 = rightface.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(60, 5).mirror().addBox(-0.8307F, -0.8723F, -0.3061F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.8334F, -0.9522F, 2.3587F, 1.0176F, 0.3454F, 0.6172F));

		PartDefinition cube_r325 = rightface.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(56, 38).mirror().addBox(-0.5755F, -0.8723F, 0.135F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.8334F, -0.9522F, 2.3587F, 0.9751F, -0.257F, -0.243F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5784F, 2.2668F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-0.5F, -0.6223F, 0.5623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.948F, -0.9427F, 0.48F, -0.1396F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(30, 56).mirror().addBox(-0.095F, 0.0294F, -1.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 0.1452F, -0.5376F, -0.1081F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(0.1696F, -5.1777F, -0.6484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 71).mirror().addBox(0.1696F, -4.4777F, -0.5984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.8463F, -0.3832F, -0.1193F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(0.0684F, -3.7209F, -0.6555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.8182F, -0.4156F, -0.1027F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(0.0684F, -3.1396F, -0.916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.8532F, -0.4156F, -0.1027F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(0.0684F, -3.9222F, -1.3152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 18).mirror().addBox(0.0684F, -3.5472F, -1.3152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.7135F, -0.4156F, -0.1027F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(68, 37).mirror().addBox(0.1527F, -5.4483F, -1.9411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 34).mirror().addBox(0.1527F, -5.0483F, -1.9411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.5908F, -0.3807F, -0.1012F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0376F, 3.1744F, -7.7856F, 1.6335F, -0.2236F, -0.098F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(0.1197F, -4.9397F, -0.9288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(76, 64).mirror().addBox(0.1696F, -4.5397F, -0.9788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.8114F, -0.3832F, -0.1193F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(0.2027F, -4.4428F, -1.7878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.617F, -0.3807F, -0.1012F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(0.0684F, -4.0704F, -1.7902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(51, 70).mirror().addBox(0.0684F, -3.7704F, -1.7902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.6175F, -0.4156F, -0.1027F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(62, 29).mirror().addBox(0.0684F, -3.1777F, -1.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.6873F, -0.4156F, -0.1027F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.095F, -2.1017F, -1.6478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.6375F, -0.5376F, -0.1081F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(37, 58).mirror().addBox(-0.095F, -0.5822F, -1.6029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.8972F, -2.9976F, 1.7596F, -0.5376F, -0.1081F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(22, 68).mirror().addBox(-0.2F, 0.7162F, -1.3157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3972F, -2.0976F, 0.4102F, -0.2269F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(78, 28).mirror().addBox(-0.5F, -0.5827F, -1.5662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.948F, -0.9427F, 0.672F, -0.1396F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(49, 36).mirror().addBox(-0.5F, -0.5318F, -0.9824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.948F, -0.9427F, 0.6021F, -0.1396F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(63, 68).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8149F, 1.8104F, -3.8306F, -0.1452F, -0.4156F, -0.1027F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(41, 68).mirror().addBox(-0.5F, -0.9F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(68, 31).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.708F, 2.1653F, -3.989F, -0.3198F, -0.4156F, -0.1027F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.07F, -0.4947F, -0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(58, 67).mirror().addBox(-0.07F, -0.4947F, -1.3054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.825F, 1.7222F, -2.9976F, 0.2063F, -0.5376F, -0.1081F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(61, 45).mirror().addBox(-0.2F, -0.325F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.95F, 1.3972F, -2.0976F, 0.1658F, -0.2269F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-0.5F, -0.6968F, -1.4481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.948F, -0.9427F, 0.3054F, -0.1396F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(53, 4).mirror().addBox(-0.5F, -0.2468F, -1.9231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-2.8857F, 1.2617F, -0.333F, 0.0436F, -0.1396F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(66, 48).addBox(-0.5F, -0.6223F, 0.5623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8F, 1.948F, -0.9427F, 0.48F, 0.1396F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(30, 56).addBox(-0.905F, 0.0294F, -1.611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 0.1452F, 0.5376F, 0.1081F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(56, 70).addBox(-1.1696F, -5.1777F, -0.6484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 71).addBox(-1.1696F, -4.4777F, -0.5984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.8463F, 0.3832F, 0.1193F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0684F, -3.7209F, -0.6555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.8182F, 0.4156F, 0.1027F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(62, 12).addBox(-1.0684F, -3.1396F, -0.916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.8532F, 0.4156F, 0.1027F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(25, 77).addBox(-1.0684F, -3.9222F, -1.3152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(77, 18).addBox(-1.0684F, -3.5472F, -1.3152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.7135F, 0.4156F, 0.1027F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(53, 67).addBox(-1.022F, -0.85F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.522F, 3.2518F, -7.5167F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(68, 37).addBox(-1.1527F, -5.4483F, -1.9411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 34).addBox(-1.1527F, -5.0483F, -1.9411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.5908F, 0.3807F, 0.1012F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(67, 28).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0376F, 3.1744F, -7.7856F, 1.6335F, 0.2236F, 0.098F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(20, 77).addBox(-1.1196F, -4.9397F, -0.9288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(76, 64).addBox(-1.1696F, -4.5397F, -0.9788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.8114F, 0.3832F, 0.1193F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(27, 68).addBox(-1.2027F, -4.4428F, -1.7878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.617F, 0.3807F, 0.1012F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0684F, -4.0704F, -1.7902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(51, 70).addBox(-1.0684F, -3.7704F, -1.7902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.6175F, 0.4156F, 0.1027F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(62, 29).addBox(-1.0684F, -3.1777F, -1.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.6873F, 0.4156F, 0.1027F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(62, 8).addBox(-0.905F, -2.1017F, -1.6478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.6375F, 0.5376F, 0.1081F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(37, 58).addBox(-0.905F, -0.5822F, -1.6029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(2.8F, 1.8972F, -2.9976F, 1.7596F, 0.5376F, 0.1081F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(22, 68).addBox(-0.8F, 0.7162F, -1.3157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.95F, 1.3972F, -2.0976F, 0.4102F, 0.2269F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(78, 28).addBox(-0.5F, -0.5827F, -1.5662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(2.8F, 1.948F, -0.9427F, 0.672F, 0.1396F, 0.0F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(49, 36).addBox(-0.5F, -0.5318F, -0.9824F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.8F, 1.948F, -0.9427F, 0.6021F, 0.1396F, 0.0F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(63, 68).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8149F, 1.8104F, -3.8306F, -0.1452F, 0.4156F, 0.1027F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(41, 68).addBox(-0.5F, -0.9F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(68, 31).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.708F, 2.1653F, -3.989F, -0.3198F, 0.4156F, 0.1027F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 68).addBox(-0.93F, -0.4947F, -0.6054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 67).addBox(-0.93F, -0.4947F, -1.3054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.825F, 1.7222F, -2.9976F, 0.2063F, 0.5376F, 0.1081F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(61, 45).addBox(-0.8F, -0.325F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.95F, 1.3972F, -2.0976F, 0.1658F, 0.2269F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(56, 34).addBox(-0.5F, -0.6968F, -1.4481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.8F, 1.948F, -0.9427F, 0.3054F, 0.1396F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(53, 4).addBox(-0.5F, -0.2468F, -1.9231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(2.8857F, 1.2617F, -0.333F, 0.0436F, 0.1396F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 2.8367F, -2.0398F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r373 = bone2.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(16, 53).addBox(-0.5F, 0.3234F, 0.1054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6314F, 0.682F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r374 = bone2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.0266F, 0.0304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.6314F, 0.682F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r375 = bone2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(38, 41).addBox(-0.5F, -0.9786F, 0.0138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 2.5034F, -0.3782F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r376 = bone2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(52, 17).addBox(-0.5F, 0.0213F, -2.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4976F, -1.0698F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r377 = bone2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(39, 21).addBox(-0.5F, 0.0F, 0.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.4378F, -1.5005F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r378 = bone2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(9, 49).addBox(-1.075F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 3.8264F, -1.6595F, 1.2516F, 0.3882F, 0.853F));

		PartDefinition cube_r379 = bone2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.7F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.5628F, -1.3148F, 1.0734F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 2.8367F, -2.0398F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r380 = bone3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(16, 53).mirror().addBox(-0.5F, 0.3234F, 0.1054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6314F, 0.682F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r381 = bone3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -0.0266F, 0.0304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6314F, 0.682F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r382 = bone3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(38, 41).mirror().addBox(-0.5F, -0.9786F, 0.0138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5034F, -0.3782F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r383 = bone3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(52, 17).mirror().addBox(-0.5F, 0.0213F, -2.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4976F, -1.0698F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r384 = bone3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(39, 21).mirror().addBox(-0.5F, 0.0F, 0.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4378F, -1.5005F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r385 = bone3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(9, 49).mirror().addBox(0.075F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.8264F, -1.6595F, 1.2516F, -0.3882F, -0.853F));

		PartDefinition cube_r386 = bone3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -0.7F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5628F, -1.3148F, 1.0734F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(55, 8).addBox(-0.7191F, 0.7564F, -0.2989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(3.7345F, 5.9403F, -2.452F, -1.1073F, 0.171F, -0.0778F));

		PartDefinition cube_r387 = leftarm.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(44, 0).addBox(2.0F, -0.625F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.7191F, 0.8564F, 1.7011F, 0.4974F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(7, 58).addBox(-0.5F, 0.969F, -0.5516F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 58).addBox(-0.5F, 1.069F, -1.3516F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.262F, -1.2886F, 3.6841F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r388 = leftarm2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(68, 68).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 1.169F, 0.2484F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftarm3 = leftarm2.addOrReplaceChild("leftarm3", CubeListBuilder.create().texOffs(48, 12).addBox(-1.0F, 0.9976F, -1.0697F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 3.7715F, -0.2819F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(55, 8).mirror().addBox(-0.2809F, 0.7564F, -0.2989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-3.7345F, 5.9403F, -2.452F, 0.1581F, -0.171F, 0.0778F));

		PartDefinition cube_r389 = rightarm.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-3.0F, -0.625F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.7191F, 0.8564F, 1.7011F, 0.4974F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.5F, 0.969F, -0.5516F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 58).mirror().addBox(-0.5F, 1.069F, -1.3516F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.262F, -1.2886F, 3.6841F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r390 = rightarm2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.169F, 0.2484F, 0.3491F, 0.0F, 0.0F));

		PartDefinition rightarm3 = rightarm2.addOrReplaceChild("rightarm3", CubeListBuilder.create().texOffs(48, 12).mirror().addBox(0.0F, 0.9976F, -1.0697F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.7715F, -0.2819F, 0.0F, 0.0F, -0.4363F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.6661F, 3.1153F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r391 = tail.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(30, 78).addBox(0.0F, -0.15F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6999F, 3.0641F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r392 = tail.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(29, 42).addBox(0.0F, 0.3F, 0.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0794F, 0.0465F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r393 = tail.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(23, 80).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 80).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 80).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r394 = tail.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.1F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r395 = tail.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(26, 21).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -0.1F, 0.0F, -0.0349F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0076F, -0.0177F, -0.0871F, 0.0053F));

		PartDefinition cube_r396 = tail8.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(13, 81).addBox(0.0F, -0.625F, 1.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3043F, 0.9374F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r397 = tail8.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(64, 80).addBox(0.0F, -0.675F, -0.075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3043F, 0.9374F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r398 = tail8.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(79, 21).addBox(0.0F, -1.9378F, -2.294F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 80).addBox(0.0F, 0.1122F, 1.131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 57).addBox(0.0F, -1.0878F, -0.569F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8989F, 2.7669F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r399 = tail8.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(45, 46).mirror().addBox(-0.425F, 0.0F, -0.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.1F, 1.4F, 0.0004F, 0.0431F, 0.0099F));

		PartDefinition cube_r400 = tail8.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(45, 46).addBox(-0.575F, 0.0F, -0.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.1F, 1.4F, 0.0004F, -0.0431F, -0.0099F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0033F, 4.8628F, 0.1924F, -0.0868F, -0.0091F));

		PartDefinition cube_r401 = tail2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(80, 0).addBox(0.0F, -0.6F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2123F, 2.1852F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r402 = tail2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(81, 40).addBox(0.0F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r403 = tail2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(26, 80).addBox(0.0F, 2.1038F, 3.594F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 79).addBox(0.0F, 0.5348F, 1.9744F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8989F, -1.133F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0039F, 3.9251F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r404 = tail6.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(3, 80).addBox(0.0F, -0.4F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2779F, 2.2455F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r405 = tail6.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(16, 81).addBox(0.0F, -0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1126F, 0.0931F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r406 = tail6.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(67, 80).addBox(0.0F, 3.7388F, 6.9091F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 80).addBox(0.0F, 2.9698F, 5.2895F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8989F, -5.133F, 0.5847F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0191F, 3.9018F, 0.1747F, -0.043F, -0.0076F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(35, 31).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail4 = tail7.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 31).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0111F, 4.0012F, -0.0615F, -0.0868F, 0.0091F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.04F, 3.9299F, -0.1488F, -0.0868F, 0.0091F));

		PartDefinition tail9 = tail5.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0379F, 3.8638F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r407 = tail9.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0437F, -0.0436F, 0.0019F));

		return LayerDefinition.create(meshdefinition, 84, 84);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}