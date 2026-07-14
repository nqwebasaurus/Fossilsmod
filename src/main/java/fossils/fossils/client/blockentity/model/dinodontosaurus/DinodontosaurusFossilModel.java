package fossils.fossils.client.blockentity.model.dinodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DinodontosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public DinodontosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone4 = this.body.getChild("bone4");
		this.upperleg1 = this.body.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.body.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.8401F, 10.7712F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 46).addBox(-2.5F, -1.7414F, -0.0585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.4921F, 4.7519F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(95, 22).addBox(-2.5F, -1.7985F, -0.1112F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.6921F, 3.0519F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 95).addBox(0.0F, -2.1423F, -0.2003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4464F, 1.0888F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 63).addBox(0.0F, -1.8009F, 0.0446F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4376F, -0.9906F, -0.4363F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(17, 83).mirror().addBox(0.5F, 0.4506F, 1.0285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 83).addBox(2.5F, 0.4506F, 1.0285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.2921F, 1.9519F, -0.3665F, 0.0F, 0.0F));

		PartDefinition basin_r2 = body.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(9, 42).mirror().addBox(0.5F, 0.7559F, -4.5421F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 42).addBox(2.5F, 0.7559F, -4.5421F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.2921F, 3.5519F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, -0.0145F, 0.007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.5F, 0.2921F, 1.9519F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 29).addBox(-0.5F, -0.0121F, -0.0463F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3981F, -0.9128F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1596F, 4.4748F, 4.219F, 0.0F, 0.0F, 0.1745F));

		PartDefinition basin_r3 = bone.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(38, 82).addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2708F, -2.6161F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r4 = bone.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(66, 67).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2708F, -3.6093F, -1.1131F, -2.6965F, 0.0F, 0.0F));

		PartDefinition basin_r5 = bone.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(31, 77).addBox(-0.2386F, 0.0564F, -2.0161F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5708F, -3.3667F, -3.1445F, -0.0294F, -0.6108F, -0.1073F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(77, 30).addBox(-0.2386F, -0.7681F, -2.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5708F, -3.3667F, -3.1445F, -0.1167F, -0.6108F, -0.1073F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(77, 13).addBox(0.0F, 0.1291F, -1.6977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -3.3667F, -1.6445F, -0.0349F, -0.3491F, -0.0175F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(0, 69).addBox(-0.2386F, -2.1192F, -0.3366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5708F, -3.3667F, -3.1445F, 0.9305F, -0.6108F, -0.1073F));

		PartDefinition basin_r9 = bone.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(29, 41).addBox(0.0F, -1.991F, -0.1049F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7708F, -3.3667F, -1.6445F, 1.7104F, -0.3491F, -0.0175F));

		PartDefinition basin_r10 = bone.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(31, 68).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2708F, -5.6423F, -0.1532F, 2.8013F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(59, 67).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2708F, -4.1215F, 1.1457F, -2.4347F, 0.0F, 0.0F));

		PartDefinition basin_r12 = bone.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(36, 86).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2708F, -3.2189F, 1.5762F, -1.1257F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(76, 72).addBox(-0.5F, -1.225F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6805F, 1.4147F, 1.2144F, -1.9845F, -0.0255F, 0.111F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(38, 67).addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6097F, 2.3822F, -0.2281F, -2.3073F, -0.0255F, 0.111F));

		PartDefinition basin_r15 = bone.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(81, 94).addBox(-0.5F, 0.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.566F, 2.5469F, 0.7572F, -1.7401F, -0.0255F, 0.111F));

		PartDefinition basin_r16 = bone.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(87, 88).addBox(-0.5F, 0.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(84, 4).addBox(-0.5F, 0.0F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6245F, 1.6149F, 2.5259F, -1.0856F, -0.0255F, 0.111F));

		PartDefinition basin_r17 = bone.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(12, 66).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7956F, 0.7466F, -0.3668F, -2.2463F, -0.0255F, 0.111F));

		PartDefinition basin_r18 = bone.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(83, 60).addBox(-0.5021F, -0.3274F, -1.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.886F, -0.2268F, 0.3383F, -1.33F, -0.0255F, 0.111F));

		PartDefinition basin_r19 = bone.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(67, 76).addBox(-0.5F, -0.425F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0857F, -1.8691F, -0.3091F, -1.1554F, -0.0255F, 0.111F));

		PartDefinition basin_r20 = bone.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1137F, -1.9495F, -1.0479F, -2.2899F, -0.0255F, 0.111F));

		PartDefinition basin_r21 = bone.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(45, 92).addBox(-0.5F, -0.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -0.6055F, -1.6354F, -0.0255F, 0.111F));

		PartDefinition basin_r22 = bone.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(70, 15).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -0.6055F, -1.5918F, -0.0255F, 0.111F));

		PartDefinition bone4 = body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1596F, 4.4748F, 4.219F, 0.0F, 0.0F, -0.1745F));

		PartDefinition basin_r23 = bone4.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(38, 82).mirror().addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -2.6161F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r24 = bone4.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(66, 67).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -3.6093F, -1.1131F, -2.6965F, 0.0F, 0.0F));

		PartDefinition basin_r25 = bone4.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(31, 77).mirror().addBox(-0.7614F, 0.0564F, -2.0161F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5708F, -3.3667F, -3.1445F, -0.0294F, 0.6108F, 0.1073F));

		PartDefinition basin_r26 = bone4.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-0.7614F, -0.7681F, -2.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5708F, -3.3667F, -3.1445F, -0.1167F, 0.6108F, 0.1073F));

		PartDefinition basin_r27 = bone4.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-1.0F, 0.1291F, -1.6977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -3.3667F, -1.6445F, -0.0349F, 0.3491F, 0.0175F));

		PartDefinition basin_r28 = bone4.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.7614F, -2.1192F, -0.3366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5708F, -3.3667F, -3.1445F, 0.9305F, 0.6108F, 0.1073F));

		PartDefinition basin_r29 = bone4.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(29, 41).mirror().addBox(-1.0F, -1.991F, -0.1049F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -3.3667F, -1.6445F, 1.7104F, 0.3491F, 0.0175F));

		PartDefinition basin_r30 = bone4.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(31, 68).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -5.6423F, -0.1532F, 2.8013F, 0.0F, 0.0F));

		PartDefinition basin_r31 = bone4.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(59, 67).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -4.1215F, 1.1457F, -2.4347F, 0.0F, 0.0F));

		PartDefinition basin_r32 = bone4.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(36, 86).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -3.2189F, 1.5762F, -1.1257F, 0.0F, 0.0F));

		PartDefinition basin_r33 = bone4.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-0.5F, -1.225F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, 1.4147F, 1.2144F, -1.9845F, 0.0255F, -0.111F));

		PartDefinition basin_r34 = bone4.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(38, 67).mirror().addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6097F, 2.3822F, -0.2281F, -2.3073F, 0.0255F, -0.111F));

		PartDefinition basin_r35 = bone4.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(81, 94).mirror().addBox(-0.5F, 0.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.566F, 2.5469F, 0.7572F, -1.7401F, 0.0255F, -0.111F));

		PartDefinition basin_r36 = bone4.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(87, 88).mirror().addBox(-0.5F, 0.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(84, 4).mirror().addBox(-0.5F, 0.0F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6245F, 1.6149F, 2.5259F, -1.0856F, 0.0255F, -0.111F));

		PartDefinition basin_r37 = bone4.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7956F, 0.7466F, -0.3668F, -2.2463F, 0.0255F, -0.111F));

		PartDefinition basin_r38 = bone4.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(83, 60).mirror().addBox(-0.4979F, -0.3274F, -1.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.886F, -0.2268F, 0.3383F, -1.33F, 0.0255F, -0.111F));

		PartDefinition basin_r39 = bone4.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(67, 76).mirror().addBox(-0.5F, -0.425F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0857F, -1.8691F, -0.3091F, -1.1554F, 0.0255F, -0.111F));

		PartDefinition basin_r40 = bone4.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1137F, -1.9495F, -1.0479F, -2.2899F, 0.0255F, -0.111F));

		PartDefinition basin_r41 = bone4.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-0.5F, -0.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -0.6055F, -1.6354F, 0.0255F, -0.111F));

		PartDefinition basin_r42 = bone4.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(70, 15).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -0.6055F, -1.5918F, 0.0255F, -0.111F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9338F, 3.3997F, 4.1876F, -0.0471F, 0.1228F, -0.9243F));

		PartDefinition upperleg13_r1 = upperleg1.addOrReplaceChild("upperleg13_r1", CubeListBuilder.create().texOffs(17, 8).addBox(-0.5F, 0.0F, -6.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0982F, 8.3174F, 2.665F, -1.4835F, 0.0F, 0.0F));

		PartDefinition upperleg12_r1 = upperleg1.addOrReplaceChild("upperleg12_r1", CubeListBuilder.create().texOffs(54, 53).addBox(-1.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 8.0042F, 3.7396F, 0.672F, 0.0F, 0.0F));

		PartDefinition upperleg11_r1 = upperleg1.addOrReplaceChild("upperleg11_r1", CubeListBuilder.create().texOffs(55, 21).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4982F, 10.1709F, 1.9215F, 1.6581F, 0.0F, 0.0F));

		PartDefinition upperleg10_r1 = upperleg1.addOrReplaceChild("upperleg10_r1", CubeListBuilder.create().texOffs(25, 54).addBox(-1.5F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4982F, 8.8197F, 0.4469F, 1.8326F, 0.0F, 0.0F));

		PartDefinition upperleg9_r1 = upperleg1.addOrReplaceChild("upperleg9_r1", CubeListBuilder.create().texOffs(54, 8).addBox(-1.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4982F, 6.8501F, 0.0996F, -2.9671F, 0.0F, 0.0F));

		PartDefinition upperleg8_r1 = upperleg1.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(47, 43).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0982F, 5.6501F, 0.0996F, 3.1416F, 0.0F, 0.0F));

		PartDefinition upperleg8_r2 = upperleg1.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(45, 50).addBox(-1.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(34, 57).addBox(-0.9F, -5.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4982F, 0.8815F, -1.4039F, -2.8362F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg1.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(31, 81).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4982F, 0.1154F, -0.7611F, -2.2689F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg1.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(61, 33).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4982F, -0.0151F, 0.2303F, -1.4399F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg1.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(41, 18).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4982F, 1.0276F, 1.1858F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3823F, 10.8023F, 2.3119F, 0.8808F, -0.5956F, 0.5789F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(0, 56).addBox(-0.3165F, -4.7286F, 0.1836F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2489F, -0.0073F, 1.3147F, 0.1794F));

		PartDefinition leg2_r2 = leg1.addOrReplaceChild("leg2_r2", CubeListBuilder.create().texOffs(81, 75).addBox(-0.5F, -2.2557F, -0.4374F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6173F, 0.5145F, -0.2125F, 0.3418F, 1.3147F, 0.2666F));

		PartDefinition leg3_r1 = leg1.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(5, 95).addBox(-0.5F, -0.35F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9074F, 4.6825F, 0.0143F, -0.2691F, 1.3147F, 0.2666F));

		PartDefinition leg2_r3 = leg1.addOrReplaceChild("leg2_r3", CubeListBuilder.create().texOffs(38, 72).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1284F, 2.153F, -0.216F, 0.1673F, 1.3147F, 0.2666F));

		PartDefinition leg1_r1 = leg1.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(21, 78).addBox(-0.5F, -2.2905F, -0.2371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6173F, 0.5145F, -0.2125F, 0.0364F, 1.3147F, 0.2666F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.273F, 5.308F, -0.1457F, -0.2563F, 0.2269F, 0.3784F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(43, 12).addBox(-3.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 2.7818F, -0.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(24, 24).addBox(-3.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 1.7818F, -3.018F, -0.0036F, -0.0062F, -0.1214F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9338F, 3.3997F, 4.1876F, -0.5707F, -0.1228F, 0.9243F));

		PartDefinition upperleg14_r1 = upperleg2.addOrReplaceChild("upperleg14_r1", CubeListBuilder.create().texOffs(17, 16).addBox(-0.5F, 0.0F, -6.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0982F, 8.3174F, 2.665F, -1.4835F, 0.0F, 0.0F));

		PartDefinition upperleg13_r2 = upperleg2.addOrReplaceChild("upperleg13_r2", CubeListBuilder.create().texOffs(16, 55).addBox(-0.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 8.0042F, 3.7396F, 0.672F, 0.0F, 0.0F));

		PartDefinition upperleg12_r2 = upperleg2.addOrReplaceChild("upperleg12_r2", CubeListBuilder.create().texOffs(45, 55).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4982F, 10.1709F, 1.9215F, 1.6581F, 0.0F, 0.0F));

		PartDefinition upperleg11_r2 = upperleg2.addOrReplaceChild("upperleg11_r2", CubeListBuilder.create().texOffs(54, 48).addBox(-0.5F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4982F, 8.8197F, 0.4469F, 1.8326F, 0.0F, 0.0F));

		PartDefinition upperleg10_r2 = upperleg2.addOrReplaceChild("upperleg10_r2", CubeListBuilder.create().texOffs(54, 43).addBox(-0.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4982F, 6.8501F, 0.0996F, -2.9671F, 0.0F, 0.0F));

		PartDefinition upperleg9_r2 = upperleg2.addOrReplaceChild("upperleg9_r2", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0982F, 5.6501F, 0.0996F, 3.1416F, 0.0F, 0.0F));

		PartDefinition upperleg9_r3 = upperleg2.addOrReplaceChild("upperleg9_r3", CubeListBuilder.create().texOffs(36, 52).addBox(-0.5F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(5, 58).addBox(-0.1F, -5.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4982F, 0.8815F, -1.4039F, -2.8362F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(81, 72).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4982F, 0.1154F, -0.7611F, -2.2689F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(12, 62).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4982F, -0.0151F, 0.2303F, -1.4399F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg2.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(38, 41).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4982F, 1.0276F, 1.1858F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3823F, 10.8023F, 2.3119F, 0.5754F, 0.5956F, -0.5789F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(56, 34).addBox(-0.6835F, -4.7286F, 0.1836F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2489F, -0.0073F, -1.3147F, -0.1794F));

		PartDefinition leg3_r3 = leg2.addOrReplaceChild("leg3_r3", CubeListBuilder.create().texOffs(81, 80).addBox(-0.5F, -2.2557F, -0.4374F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6173F, 0.5145F, -0.2125F, 0.3418F, -1.3147F, -0.2666F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(15, 95).addBox(-0.5F, -0.35F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9074F, 4.6825F, 0.0143F, -0.2691F, -1.3147F, -0.2666F));

		PartDefinition leg3_r4 = leg2.addOrReplaceChild("leg3_r4", CubeListBuilder.create().texOffs(43, 72).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1284F, 2.153F, -0.216F, 0.1673F, -1.3147F, -0.2666F));

		PartDefinition leg2_r4 = leg2.addOrReplaceChild("leg2_r4", CubeListBuilder.create().texOffs(7, 80).addBox(-0.5F, -2.2905F, -0.2371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6173F, 0.5145F, -0.2125F, 0.0364F, -1.3147F, -0.2666F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.273F, 5.308F, -0.1457F, 0.0144F, -0.1797F, -0.2069F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(45, 4).addBox(0.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 2.7818F, -0.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(24, 29).addBox(0.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 1.7818F, -3.018F, -0.0036F, 0.0062F, 0.1214F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(86, 53).addBox(-0.5F, -0.0413F, -0.5234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.283F, 5.4165F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(41, 57).addBox(0.0F, -1.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3533F, -0.8371F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 0).addBox(-15.0F, 0.0F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.9587F, 0.4766F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(58, 86).addBox(-0.5F, 0.0272F, -1.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7957F, 0.4882F, -0.1687F, -0.045F, -0.258F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 95).addBox(-15.0F, 0.0F, -0.125F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 1.0272F, -0.0007F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, 0.0272F, -1.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1289F, -0.0227F, -0.1731F));

		PartDefinition cube_r10 = tail3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(49, 95).addBox(-15.0F, 0.0F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 1.0272F, -0.0007F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(86, 75).addBox(-0.5F, 0.0272F, -1.0007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.2618F, -0.2618F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(95, 19).addBox(-0.5F, 0.0272F, -0.0007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.3052F, -0.0131F, 0.0416F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0269F, -0.9128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 50).addBox(0.0F, -2.0419F, 0.0206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4845F, -1.9557F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 95).addBox(0.0F, -1.9689F, 0.0191F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -3.9557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 34).addBox(0.0F, -2.0954F, 0.0063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -5.9557F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.3F, 12.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3845F, -17.9557F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-7.6457F, -2.871F, -0.5334F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.0817F, 0.2147F, -1.5022F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(54, 13).mirror().addBox(-5.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.1652F, 0.1601F, -1.0614F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(43, 16).mirror().addBox(-1.5622F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.2247F, 0.0473F, -0.5021F));

		PartDefinition neck23_r1 = body2.addOrReplaceChild("neck23_r1", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-5.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.068F, 0.2501F, -1.5737F));

		PartDefinition neck22_r2 = body2.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.1683F, 0.1978F, -1.1292F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(82, 69).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.2473F, 0.0776F, -0.569F));

		PartDefinition neck23_r2 = body2.addOrReplaceChild("neck23_r2", CubeListBuilder.create().texOffs(85, 64).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.146F, 0.2067F, -1.2357F));

		PartDefinition neck22_r3 = body2.addOrReplaceChild("neck22_r3", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.2336F, 0.0967F, -0.6723F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(10, 86).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.2336F, -0.0967F, 0.6723F));

		PartDefinition neck22_r4 = body2.addOrReplaceChild("neck22_r4", CubeListBuilder.create().texOffs(85, 64).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.146F, -0.2067F, 1.2357F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(82, 69).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.2473F, -0.0776F, 0.569F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(54, 58).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.1683F, -0.1978F, 1.1292F));

		PartDefinition neck22_r5 = body2.addOrReplaceChild("neck22_r5", CubeListBuilder.create().texOffs(64, 31).addBox(4.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.068F, -0.2501F, 1.5737F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(43, 16).addBox(-0.4378F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.2247F, -0.0473F, 0.5021F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(54, 13).addBox(1.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.1652F, -0.1601F, 1.0614F));

		PartDefinition neck21_r5 = body2.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(73, 70).addBox(4.6457F, -2.871F, -0.5334F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.0817F, -0.2147F, 1.5022F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2355F, -5.9618F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(90, 16).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1688F, -5.9579F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(80, 89).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0399F, -3.9593F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck18_r1 = body3.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-10.6724F, -3.2692F, -0.5067F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.0866F, 0.2405F, -1.4139F));

		PartDefinition neck17_r1 = body3.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.1808F, 0.1814F, -0.9715F));

		PartDefinition neck16_r1 = body3.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.249F, 0.0571F, -0.4136F));

		PartDefinition neck17_r2 = body3.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.251F, 0.053F, -0.4138F));

		PartDefinition neck18_r2 = body3.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.1847F, 0.1789F, -0.9711F));

		PartDefinition neck19_r2 = body3.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(32, 2).mirror().addBox(-10.6724F, -3.2692F, -0.5067F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.0913F, 0.24F, -1.413F));

		PartDefinition neck18_r3 = body3.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4351F, 0.2034F, 0.0314F, -0.4333F));

		PartDefinition neck19_r3 = body3.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4351F, 0.1554F, 0.1354F, -0.9932F));

		PartDefinition neck20_r4 = body3.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-9.6724F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4351F, 0.0836F, 0.1882F, -1.4322F));

		PartDefinition neck19_r4 = body3.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(32, 6).addBox(4.6725F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4351F, 0.0836F, -0.1882F, 1.4322F));

		PartDefinition neck18_r4 = body3.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(59, 19).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4351F, 0.1554F, -0.1354F, 0.9932F));

		PartDefinition neck17_r3 = body3.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(84, 12).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4351F, 0.2034F, -0.0314F, 0.4333F));

		PartDefinition neck18_r5 = body3.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(32, 2).addBox(4.6725F, -3.2692F, -0.5067F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.0913F, -0.24F, 1.413F));

		PartDefinition neck17_r4 = body3.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(59, 17).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.1847F, -0.1789F, 0.9711F));

		PartDefinition neck16_r2 = body3.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(84, 10).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.251F, -0.053F, 0.4138F));

		PartDefinition neck15_r1 = body3.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(84, 8).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.249F, -0.0571F, 0.4136F));

		PartDefinition neck16_r3 = body3.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(59, 15).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.1808F, -0.1814F, 0.9715F));

		PartDefinition neck17_r5 = body3.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(32, 0).addBox(4.6725F, -3.2692F, -0.5067F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.0866F, -0.2405F, 1.4139F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 89).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2097F, -1.962F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.951F, -6.8189F, 0.1398F, -0.0432F, -0.0061F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 88).addBox(0.0F, -2.1693F, -0.0104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5433F, -1.0467F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 90).addBox(0.0F, -2.1693F, -0.0104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0952F, -2.9677F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 90).addBox(0.0F, -2.2906F, -0.1386F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5796F, -6.8916F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 90).addBox(0.0F, -2.2693F, -0.1104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1796F, -4.8916F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.0019F, 0.1302F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.1F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck16_r4 = chest.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(12, 60).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.1143F, 0.0785F, -1.0151F));

		PartDefinition neck17_r6 = chest.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(32, 4).mirror().addBox(-9.6724F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.0705F, 0.1194F, -1.4517F));

		PartDefinition neck15_r2 = chest.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(84, 14).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.5162F, 0.1385F, 0.005F, -0.452F));

		PartDefinition neck16_r5 = chest.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(84, 29).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.1858F, 0.0273F, -0.4862F));

		PartDefinition neck17_r7 = chest.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.1427F, 0.1226F, -1.0472F));

		PartDefinition neck18_r6 = chest.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(56, 5).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.5162F, 0.0774F, 0.1713F, -1.4856F));

		PartDefinition neck17_r8 = chest.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.5162F, 0.2784F, 0.0766F, -0.5163F));

		PartDefinition neck18_r7 = chest.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(41, 60).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.5162F, 0.1956F, 0.2134F, -1.0732F));

		PartDefinition neck19_r5 = chest.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-6.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.5162F, 0.086F, 0.2757F, -1.5186F));

		PartDefinition neck18_r8 = chest.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7927F, -6.5162F, 0.3548F, 0.1194F, -0.5088F));

		PartDefinition neck19_r6 = chest.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7927F, -6.5162F, 0.239F, 0.2898F, -1.0624F));

		PartDefinition neck20_r5 = chest.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-5.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7927F, -6.5162F, 0.0909F, 0.3628F, -1.5171F));

		PartDefinition neck19_r7 = chest.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(7, 69).addBox(4.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7927F, -6.5162F, 0.0909F, -0.3628F, 1.5171F));

		PartDefinition neck18_r9 = chest.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(52, 60).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7927F, -6.5162F, 0.239F, -0.2898F, 1.0624F));

		PartDefinition neck17_r9 = chest.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(84, 41).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7927F, -6.5162F, 0.3548F, -0.1194F, 0.5088F));

		PartDefinition neck18_r10 = chest.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(84, 33).addBox(4.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.5162F, 0.086F, -0.2757F, 1.5186F));

		PartDefinition neck17_r10 = chest.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(41, 60).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.5162F, 0.1956F, -0.2134F, 1.0732F));

		PartDefinition neck16_r6 = chest.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(84, 31).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.5162F, 0.2784F, -0.0766F, 0.5163F));

		PartDefinition neck17_r11 = chest.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(56, 5).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.0774F, -0.1713F, 1.4856F));

		PartDefinition neck16_r7 = chest.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(23, 60).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.1427F, -0.1226F, 1.0472F));

		PartDefinition neck15_r3 = chest.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(84, 29).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.5162F, 0.1858F, -0.0273F, 0.4862F));

		PartDefinition neck14_r1 = chest.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(84, 14).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.1385F, -0.005F, 0.452F));

		PartDefinition neck16_r8 = chest.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(32, 4).addBox(4.6725F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.0705F, -0.1194F, 1.4517F));

		PartDefinition neck15_r4 = chest.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(12, 60).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.5162F, 0.1143F, -0.0785F, 1.0151F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3428F, 5.557F, -5.237F, 0.7611F, -0.0397F, -0.8486F));

		PartDefinition upperarm10_r1 = upperarm1.addOrReplaceChild("upperarm10_r1", CubeListBuilder.create().texOffs(11, 36).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.3126F, 1.1937F, -1.0735F, -0.5205F, -0.2163F, -0.0289F));

		PartDefinition upperarm12_r1 = upperarm1.addOrReplaceChild("upperarm12_r1", CubeListBuilder.create().texOffs(0, 74).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.8273F, 1.7428F, -1.0126F, 1.1473F, -0.8076F, -0.8628F));

		PartDefinition upperarm10_r2 = upperarm1.addOrReplaceChild("upperarm10_r2", CubeListBuilder.create().texOffs(37, 24).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.6447F, 1.1026F, -0.2664F, 0.6878F, 0.1212F, 0.2493F));

		PartDefinition upperarm9_r1 = upperarm1.addOrReplaceChild("upperarm9_r1", CubeListBuilder.create().texOffs(63, 51).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3126F, 1.1937F, -1.0735F, 0.7013F, -0.2163F, -0.0289F));

		PartDefinition upperarm9_r2 = upperarm1.addOrReplaceChild("upperarm9_r2", CubeListBuilder.create().texOffs(86, 94).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.8493F, 2.2941F, -1.0402F, 0.0027F, -0.4483F, 1.0612F));

		PartDefinition upperarm8_r1 = upperarm1.addOrReplaceChild("upperarm8_r1", CubeListBuilder.create().texOffs(48, 62).addBox(-0.5F, -2.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0716F, 4.0884F, 1.0557F, 0.3958F, -0.2163F, -0.0289F));

		PartDefinition upperarm7_r1 = upperarm1.addOrReplaceChild("upperarm7_r1", CubeListBuilder.create().texOffs(41, 62).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0716F, 4.0884F, 1.0557F, -0.215F, -0.2163F, -0.0289F));

		PartDefinition upperarm6_r1 = upperarm1.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(9, 46).addBox(-0.5F, -3.0F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.2098F, 6.2369F, 0.0584F, 0.134F, -0.2163F, -0.0289F));

		PartDefinition upperarm5_r1 = upperarm1.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(63, 7).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1002F, 6.4921F, 0.5903F, 1.1376F, -0.2163F, -0.0289F));

		PartDefinition upperarm5_r2 = upperarm1.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(63, 41).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0775F, 8.0907F, -1.426F, 0.3522F, -0.2163F, -0.0289F));

		PartDefinition upperarm4_r1 = upperarm1.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(55, 72).addBox(0.0F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3797F, 7.4424F, 0.5691F, -0.1714F, -0.2163F, -0.0289F));

		PartDefinition upperarm3_r1 = upperarm1.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(70, 31).addBox(-0.5F, 0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1203F, 5.4934F, 0.8168F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7455F, 8.3196F, -0.1857F, -0.5816F, 0.4092F, 0.6047F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(26, 75).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(15, 89).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4955F, -0.2335F, -0.2897F, -0.3136F, 1.2533F, -0.3373F));

		PartDefinition lowerarm5_r1 = lowerarm1.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(86, 82).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 82).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0329F, 0.4103F, -0.022F, -1.4437F, 1.2578F, -0.246F));

		PartDefinition lowerarm4_r2 = lowerarm1.addOrReplaceChild("lowerarm4_r2", CubeListBuilder.create().texOffs(88, 60).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.814F, 0.5868F, 0.2093F, 0.607F, 1.2578F, -0.246F));

		PartDefinition lowerarm3_r1 = lowerarm1.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7381F, -0.4089F, 0.264F, -0.1784F, 1.2578F, -0.246F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(21, 62).addBox(-0.5F, -1.55F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1779F, 1.0197F, -0.3384F, -0.3965F, 1.2578F, -0.246F));

		PartDefinition lowerarm2_r2 = lowerarm1.addOrReplaceChild("lowerarm2_r2", CubeListBuilder.create().texOffs(26, 69).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0761F, 4.1855F, -0.6257F, -0.2874F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.646F, 4.5525F, -1.0493F, 0.6982F, 0.1525F, 0.1035F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(30, 8).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0538F, 1.3295F, -1.7957F, -0.5236F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(42, 34).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 1.6518F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(86, 79).addBox(0.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(79, 54).addBox(3.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3428F, 5.557F, -5.237F, -0.159F, 0.0192F, 0.7193F));

		PartDefinition upperarm11_r1 = upperarm2.addOrReplaceChild("upperarm11_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3126F, 1.1937F, -1.0735F, -0.5205F, 0.2163F, 0.0289F));

		PartDefinition upperarm13_r1 = upperarm2.addOrReplaceChild("upperarm13_r1", CubeListBuilder.create().texOffs(19, 74).addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8273F, 1.7428F, -1.0126F, 1.1473F, 0.8076F, 0.8628F));

		PartDefinition upperarm11_r2 = upperarm2.addOrReplaceChild("upperarm11_r2", CubeListBuilder.create().texOffs(20, 39).addBox(0.0F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.6447F, 1.1026F, -0.2664F, 0.6878F, -0.1212F, -0.2493F));

		PartDefinition upperarm10_r3 = upperarm2.addOrReplaceChild("upperarm10_r3", CubeListBuilder.create().texOffs(5, 64).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3126F, 1.1937F, -1.0735F, 0.7013F, 0.2163F, 0.0289F));

		PartDefinition upperarm10_r4 = upperarm2.addOrReplaceChild("upperarm10_r4", CubeListBuilder.create().texOffs(91, 94).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.8493F, 2.2941F, -1.0402F, 0.0027F, 0.4483F, -1.0612F));

		PartDefinition upperarm9_r3 = upperarm2.addOrReplaceChild("upperarm9_r3", CubeListBuilder.create().texOffs(62, 62).addBox(-0.5F, -2.5F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0716F, 4.0884F, 1.0557F, 0.3958F, 0.2163F, 0.0289F));

		PartDefinition upperarm8_r2 = upperarm2.addOrReplaceChild("upperarm8_r2", CubeListBuilder.create().texOffs(55, 62).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0716F, 4.0884F, 1.0557F, -0.215F, 0.2163F, 0.0289F));

		PartDefinition upperarm7_r2 = upperarm2.addOrReplaceChild("upperarm7_r2", CubeListBuilder.create().texOffs(29, 47).addBox(-0.5F, -3.0F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2098F, 6.2369F, 0.0584F, 0.134F, 0.2163F, 0.0289F));

		PartDefinition upperarm6_r2 = upperarm2.addOrReplaceChild("upperarm6_r2", CubeListBuilder.create().texOffs(31, 63).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1002F, 6.4921F, 0.5903F, 1.1376F, 0.2163F, 0.0289F));

		PartDefinition upperarm6_r3 = upperarm2.addOrReplaceChild("upperarm6_r3", CubeListBuilder.create().texOffs(63, 46).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0775F, 8.0907F, -1.426F, 0.3522F, 0.2163F, 0.0289F));

		PartDefinition upperarm5_r3 = upperarm2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(72, 56).addBox(-1.0F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3797F, 7.4424F, 0.5691F, -0.1714F, 0.2163F, 0.0289F));

		PartDefinition upperarm4_r2 = upperarm2.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(70, 36).addBox(-0.5F, 0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1203F, 5.4934F, 0.8168F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7455F, 8.3196F, -0.1857F, -0.5816F, -0.4092F, -0.6047F));

		PartDefinition lowerarm5_r2 = lowerarm2.addOrReplaceChild("lowerarm5_r2", CubeListBuilder.create().texOffs(62, 76).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(41, 89).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4955F, -0.2335F, -0.2897F, -0.3136F, -1.2533F, 0.3373F));

		PartDefinition lowerarm6_r1 = lowerarm2.addOrReplaceChild("lowerarm6_r1", CubeListBuilder.create().texOffs(87, 85).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 82).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0329F, 0.4103F, -0.022F, -1.4437F, -1.2578F, 0.246F));

		PartDefinition lowerarm5_r3 = lowerarm2.addOrReplaceChild("lowerarm5_r3", CubeListBuilder.create().texOffs(88, 71).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.814F, 0.5868F, 0.2093F, 0.607F, -1.2578F, 0.246F));

		PartDefinition lowerarm4_r3 = lowerarm2.addOrReplaceChild("lowerarm4_r3", CubeListBuilder.create().texOffs(27, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7381F, -0.4089F, 0.264F, -0.1784F, -1.2578F, 0.246F));

		PartDefinition lowerarm3_r2 = lowerarm2.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(26, 62).addBox(-0.5F, -1.55F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1779F, 1.0197F, -0.3384F, -0.3965F, -1.2578F, 0.246F));

		PartDefinition lowerarm3_r3 = lowerarm2.addOrReplaceChild("lowerarm3_r3", CubeListBuilder.create().texOffs(14, 71).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0761F, 4.1855F, -0.6257F, -0.2874F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.646F, 4.5525F, -1.0493F, 1.1252F, 0.3019F, 0.1192F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(30, 13).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0538F, 1.3295F, -1.7957F, -0.5236F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(43, 8).addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4807F, 1.6518F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(87, 66).addBox(-1.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r4 = hand2.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(79, 57).addBox(-5.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.0F, 16.4835F, -3.6304F));

		PartDefinition chest_r1 = bone2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(7, 76).addBox(-1.6F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9057F, -9.9112F, -2.2401F, 1.204F, -0.3203F, -0.6971F));

		PartDefinition chest_r2 = bone2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(72, 82).addBox(0.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.5544F, -9.1391F, -2.088F, 1.1733F, 0.4965F, -1.0148F));

		PartDefinition chest_r3 = bone2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(45, 80).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5544F, -9.1391F, -2.088F, 1.2163F, -0.1978F, -0.7448F));

		PartDefinition chest_r4 = bone2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(50, 80).addBox(-1.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2038F, -9.7844F, -4.4104F, 1.0956F, -0.0216F, -0.1155F));

		PartDefinition chest_r5 = bone2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(84, 47).addBox(-0.2F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.349F, -11.8086F, -4.2446F, -1.5551F, -1.1086F, 1.8434F));

		PartDefinition chest_r6 = bone2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(31, 84).addBox(-0.4408F, -1.764F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7788F, -10.3844F, -4.2104F, -1.5261F, -1.4139F, 1.8132F));

		PartDefinition chest_r7 = bone2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(48, 85).addBox(-0.3148F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7788F, -9.7844F, -4.2104F, 1.492F, -1.3739F, -0.858F));

		PartDefinition chest_r8 = bone2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(67, 80).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 80).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.0992F, -17.6187F, -2.0226F, 0.4567F, 0.0122F, -0.3769F));

		PartDefinition chest_r9 = bone2.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(84, 43).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.1593F, -17.8032F, -1.0416F, 3.0747F, 0.0122F, -0.3769F));

		PartDefinition chest_r10 = bone2.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(91, 7).addBox(-0.5F, -1.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(91, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1234F, -17.7455F, -0.0439F, -2.074F, 0.0122F, -0.3769F));

		PartDefinition chest_r11 = bone2.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(47, 38).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1967F, -15.3784F, -0.8323F, 1.7657F, 0.0122F, -0.3769F));

		PartDefinition chest_r12 = bone2.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(52, 67).addBox(-0.5F, -1.45F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1967F, -15.3784F, -0.8323F, 1.024F, 0.0122F, -0.3769F));

		PartDefinition chest_r13 = bone2.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(20, 90).addBox(-0.5F, -0.525F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, -13.851F, -1.9128F, 1.472F, 0.1321F, -0.1741F));

		PartDefinition chest_r14 = bone2.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(45, 67).addBox(-0.6708F, -1.3123F, 0.3066F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5056F, -12.3266F, -2.7568F, 0.7309F, 0.1166F, -0.1848F));

		PartDefinition chest_r15 = bone2.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(64, 26).addBox(-0.5F, -2.6F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5963F, -12.8822F, -1.1767F, 2.9562F, 0.1166F, -0.1848F));

		PartDefinition chest_r16 = bone2.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.5963F, -12.8822F, -1.1767F, 2.0399F, 0.1166F, -0.1848F));

		PartDefinition chest_r17 = bone2.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(20, 45).addBox(-0.6708F, 0.9757F, 0.279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5056F, -12.3266F, -2.7568F, 1.4291F, 0.1166F, -0.1848F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-5.0F, 16.4835F, -3.6304F));

		PartDefinition chest_r18 = bone5.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-0.4F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9057F, -9.9112F, -2.2401F, 1.204F, 0.3203F, 0.6971F));

		PartDefinition chest_r19 = bone5.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(72, 82).mirror().addBox(-1.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.5544F, -9.1391F, -2.088F, 1.1733F, -0.4965F, 1.0148F));

		PartDefinition chest_r20 = bone5.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5544F, -9.1391F, -2.088F, 1.2163F, 0.1978F, 0.7448F));

		PartDefinition chest_r21 = bone5.addOrReplaceChild("chest_r21", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(0.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2038F, -9.7844F, -4.4104F, 1.0956F, 0.0216F, 0.1155F));

		PartDefinition chest_r22 = bone5.addOrReplaceChild("chest_r22", CubeListBuilder.create().texOffs(84, 47).mirror().addBox(-0.8F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.349F, -11.8086F, -4.2446F, -1.5551F, 1.1086F, -1.8434F));

		PartDefinition chest_r23 = bone5.addOrReplaceChild("chest_r23", CubeListBuilder.create().texOffs(31, 84).mirror().addBox(-0.5592F, -1.764F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7788F, -10.3844F, -4.2104F, -1.5261F, 1.4139F, -1.8132F));

		PartDefinition chest_r24 = bone5.addOrReplaceChild("chest_r24", CubeListBuilder.create().texOffs(48, 85).mirror().addBox(-0.6852F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7788F, -9.7844F, -4.2104F, 1.492F, 1.3739F, 0.858F));

		PartDefinition chest_r25 = bone5.addOrReplaceChild("chest_r25", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 80).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(3.0992F, -17.6187F, -2.0226F, 0.4567F, -0.0122F, 0.3769F));

		PartDefinition chest_r26 = bone5.addOrReplaceChild("chest_r26", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(3.1593F, -17.8032F, -1.0416F, 3.0747F, -0.0122F, 0.3769F));

		PartDefinition chest_r27 = bone5.addOrReplaceChild("chest_r27", CubeListBuilder.create().texOffs(91, 7).mirror().addBox(-0.5F, -1.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(91, 0).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1234F, -17.7455F, -0.0439F, -2.074F, -0.0122F, 0.3769F));

		PartDefinition chest_r28 = bone5.addOrReplaceChild("chest_r28", CubeListBuilder.create().texOffs(47, 38).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -15.3784F, -0.8323F, 1.7657F, -0.0122F, 0.3769F));

		PartDefinition chest_r29 = bone5.addOrReplaceChild("chest_r29", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-0.5F, -1.45F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -15.3784F, -0.8323F, 1.024F, -0.0122F, 0.3769F));

		PartDefinition chest_r30 = bone5.addOrReplaceChild("chest_r30", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.5F, -0.525F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8348F, -13.851F, -1.9128F, 1.472F, -0.1321F, 0.1741F));

		PartDefinition chest_r31 = bone5.addOrReplaceChild("chest_r31", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-0.3292F, -1.3123F, 0.3066F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5056F, -12.3266F, -2.7568F, 0.7309F, -0.1166F, 0.1848F));

		PartDefinition chest_r32 = bone5.addOrReplaceChild("chest_r32", CubeListBuilder.create().texOffs(64, 26).mirror().addBox(-0.5F, -2.6F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5963F, -12.8822F, -1.1767F, 2.9562F, -0.1166F, 0.1848F));

		PartDefinition chest_r33 = bone5.addOrReplaceChild("chest_r33", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.5963F, -12.8822F, -1.1767F, 2.0399F, -0.1166F, 0.1848F));

		PartDefinition chest_r34 = bone5.addOrReplaceChild("chest_r34", CubeListBuilder.create().texOffs(20, 45).mirror().addBox(-0.3292F, 0.9757F, 0.279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5056F, -12.3266F, -2.7568F, 1.4291F, -0.1166F, 0.1848F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8995F, -6.7519F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r24 = neck2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 95).addBox(0.0F, -1.3693F, -0.0854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1173F, -1.9608F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r25 = neck2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(78, 17).addBox(-0.5F, 0.0052F, 3.0067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition neck18_r11 = neck2.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.6172F, 0.2995F, -0.63F));

		PartDefinition neck19_r8 = neck2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.3763F, 0.5775F, -1.1803F));

		PartDefinition neck18_r12 = neck2.addOrReplaceChild("neck18_r12", CubeListBuilder.create().texOffs(84, 51).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.3763F, -0.5775F, 1.1803F));

		PartDefinition neck17_r12 = neck2.addOrReplaceChild("neck17_r12", CubeListBuilder.create().texOffs(84, 35).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.6172F, -0.2995F, 0.63F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0358F, -1.6639F, -0.182F, -0.2555F, 0.0579F));

		PartDefinition cube_r26 = neck.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(77, 82).addBox(0.0F, -1.078F, -0.2611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -1.8665F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r27 = neck.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(77, 46).addBox(-0.5F, -0.1214F, 1.8322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck20_r6 = neck.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(76, 64).mirror().addBox(-3.1124F, 0.1478F, -0.4067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0026F, -1.812F, 0.7277F, 0.7614F, -0.8155F));

		PartDefinition neck19_r9 = neck.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(76, 64).addBox(0.1124F, 0.1478F, -0.4067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0026F, -1.812F, 0.7277F, -0.7614F, 0.8155F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4128F, -2.7762F, 0.22F, -0.0331F, -0.0521F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0418F, -3.4046F, -3.0805F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 69).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.1804F, -2.7407F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(93, 58).addBox(-0.5F, -2.1F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0997F, -3.8639F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(14, 78).addBox(-0.5F, -0.075F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2938F, -1.4147F, 2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 53).addBox(-0.5F, -0.075F, -2.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.346F, -1.8113F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 0).addBox(-1.0F, -0.625F, -3.2966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.9381F, -0.3608F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(77, 5).addBox(-1.0F, -0.825F, -0.1966F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.9381F, -0.3608F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 18).addBox(-1.0F, -0.825F, -2.4966F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.9381F, -0.3608F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(37, 30).addBox(-1.0F, 2.7F, 0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1084F, -5.984F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(91, 10).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(10, 91).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7671F, -8.7364F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(11, 31).addBox(-0.5F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -1.7374F, -8.4945F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(91, 74).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1519F, -8.2149F, -2.2209F, 0.3928F, -0.2833F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(69, 61).addBox(-0.5F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.5664F, -7.9353F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(61, 37).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -3.1889F, -7.1527F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(17, 85).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5473F, -6.2191F, 1.5243F, -0.1229F, 0.3276F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(19, 69).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -3.5473F, -6.2191F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 18).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8609F, -3.2355F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(90, 24).addBox(0.0F, -1.125F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 0).addBox(-0.5F, -0.8F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -2.7697F, -3.4346F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(50, 16).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.8607F, 1.4729F, 3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(16, 50).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4149F, 0.2143F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(80, 66).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -4.3888F, -0.7854F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 21).addBox(-1.0F, -1.1F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1766F, 0.2784F, -0.4363F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.034F, -0.6256F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2684F, 0.4978F, 0.1241F, -2.3565F, -0.0511F, 0.0113F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(77, 42).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2604F, -0.2093F, 0.1243F, -3.0986F, -0.03F, 0.0429F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(42, 38).mirror().addBox(-0.5F, -0.375F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2431F, 0.3517F, -1.2523F, 2.5301F, -0.03F, 0.0429F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(91, 80).mirror().addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2604F, -0.2093F, 0.1243F, -2.2259F, -0.03F, 0.0429F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(46, 89).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 1.2841F, -0.3929F, -1.6151F, -0.03F, 0.0429F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.0007F, 0.0121F, -0.0232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.243F, -1.3472F, -1.4435F, -0.0998F, 0.0431F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(-0.0007F, 0.0381F, -0.8227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.243F, -1.3472F, -1.4872F, -0.0998F, 0.0431F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-0.0007F, 1.5973F, -1.3004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.243F, -1.3472F, -1.3126F, -0.0998F, 0.0431F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(48, 76).mirror().addBox(-0.0007F, 0.9813F, -1.4647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.243F, -1.3472F, -1.0072F, -0.0998F, 0.0431F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-0.0007F, 0.9457F, -0.6757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.243F, -1.3472F, -1.6617F, -0.0998F, 0.0431F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(86, 91).mirror().addBox(-0.254F, 1.4576F, -0.2414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, -2.72F, -0.3439F, 0.0412F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(55, 76).mirror().addBox(-0.0007F, 1.8204F, -1.6394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7355F, 0.243F, -1.3472F, -0.9199F, -0.0998F, 0.0431F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 85).mirror().addBox(0.0134F, -2.0003F, -1.0169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6356F, 2.243F, -3.3472F, 0.1234F, -0.187F, 0.0436F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(76, 60).mirror().addBox(-0.0769F, -1.1077F, 0.0153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, 1.3452F, -0.187F, 0.0131F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 94).mirror().addBox(-0.254F, -0.1715F, 1.0698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, 2.7342F, -0.3439F, 0.0412F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(-0.254F, 1.9836F, -0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, -2.1964F, -0.3439F, 0.0412F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(91, 91).mirror().addBox(-0.254F, 1.4689F, -1.7188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, -1.7164F, -0.3439F, 0.0412F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-0.4537F, 1.531F, -2.6577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, -1.3674F, -0.3439F, 0.0412F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.4537F, 2.7224F, -0.0679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(62, 92).mirror().addBox(-0.0537F, 2.7224F, -0.0679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, -2.24F, -0.3439F, 0.0412F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.0769F, 1.4712F, -1.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3856F, 2.418F, -4.2222F, -2.7127F, -0.187F, 0.0131F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(15, 92).mirror().addBox(-0.325F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.332F, 0.7998F, -6.8383F, -2.1945F, 0.0065F, -0.2241F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(42, 38).addBox(-0.5F, -0.375F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2431F, 0.3517F, -1.2523F, 2.5301F, 0.03F, -0.0429F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 12).addBox(-0.9993F, 0.9457F, -0.6757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7355F, 0.243F, -1.3472F, -1.6617F, 0.0998F, -0.0431F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(5, 92).addBox(-0.9231F, 1.4712F, -1.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, -2.7127F, 0.187F, -0.0131F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(86, 91).addBox(-0.746F, 1.4576F, -0.2414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, -2.72F, 0.3439F, -0.0412F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(86, 57).addBox(-0.9993F, 1.5973F, -1.3004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.7355F, 0.243F, -1.3472F, -1.3126F, 0.0998F, -0.0431F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(50, 21).addBox(-0.9993F, 0.0381F, -0.8227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7355F, 0.243F, -1.3472F, -1.4872F, 0.0998F, -0.0431F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(15, 92).addBox(-0.675F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.332F, 0.7998F, -6.8383F, -2.1945F, -0.0065F, 0.2241F));

		PartDefinition cube_r78 = jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(62, 92).addBox(-0.9463F, 2.7224F, -0.0679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 92).addBox(-0.5463F, 2.7224F, -0.0679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, -2.24F, 0.3439F, -0.0412F));

		PartDefinition cube_r79 = jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5463F, 1.531F, -2.6577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, -1.3674F, 0.3439F, -0.0412F));

		PartDefinition cube_r80 = jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(91, 91).addBox(-0.746F, 1.4689F, -1.7188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, -1.7164F, 0.3439F, -0.0412F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(63, 89).addBox(-0.746F, 1.9836F, -0.3846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, -2.1964F, 0.3439F, -0.0412F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(76, 94).addBox(-0.746F, -0.1715F, 1.0698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, 2.7342F, 0.3439F, -0.0412F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(76, 60).addBox(-0.9231F, -1.1077F, 0.0153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3856F, 2.418F, -4.2222F, 1.3452F, 0.187F, -0.0131F));

		PartDefinition cube_r84 = jaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 85).addBox(-1.0134F, -2.0003F, -1.0169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6356F, 2.243F, -3.3472F, 0.1234F, 0.187F, -0.0436F));

		PartDefinition cube_r85 = jaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(55, 76).addBox(-0.9993F, 1.8204F, -1.6394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7355F, 0.243F, -1.3472F, -0.9199F, 0.0998F, -0.0431F));

		PartDefinition cube_r86 = jaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(48, 76).addBox(-0.9993F, 0.9813F, -1.4647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7355F, 0.243F, -1.3472F, -1.0072F, 0.0998F, -0.0431F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(89, 46).addBox(-0.9993F, 0.0121F, -0.0232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7355F, 0.243F, -1.3472F, -1.4435F, 0.0998F, -0.0431F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(46, 89).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3089F, 1.2841F, -0.3929F, -1.6151F, 0.03F, -0.0429F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(91, 80).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2604F, -0.2093F, 0.1243F, -2.2259F, 0.03F, -0.0429F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(77, 42).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2604F, -0.2093F, 0.1243F, -3.0986F, 0.03F, -0.0429F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(90, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2684F, 0.4978F, 0.1241F, -2.3565F, 0.0511F, -0.0113F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8122F, -4.679F, -0.781F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 9).addBox(-0.5F, -0.8203F, -1.1348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.576F, 1.6144F, -2.3455F, -0.4848F, -0.4799F, 0.7853F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(89, 43).addBox(-3.3852F, -1.1697F, -2.3752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4517F, 3.9894F, -2.1035F, -0.8351F, -1.1014F, -0.1263F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(46, 24).addBox(-1.9294F, 1.55F, -3.5776F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4517F, 3.9894F, -2.1035F, -1.0962F, -0.1065F, 0.4586F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 46).addBox(-3.264F, -0.7979F, -1.9684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2017F, 3.9894F, -2.1035F, 0.0491F, -0.0862F, 1.4058F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(92, 66).addBox(-1.6838F, 0.7034F, -3.8113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2017F, 3.9894F, -2.1035F, -1.0431F, -0.1434F, 0.399F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(92, 63).addBox(-0.5294F, 0.0017F, -1.6325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8213F, 5.825F, -5.1831F, 1.6801F, 0.4622F, -0.0746F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5294F, -0.9286F, 1.7025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.8213F, 5.825F, -5.1831F, -1.3305F, 0.4622F, -0.0746F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(93, 16).addBox(-0.5294F, -0.3697F, 1.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8213F, 5.825F, -5.1831F, -1.1124F, 0.4622F, -0.0746F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(20, 93).addBox(-1.0174F, -0.3571F, -0.2047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8039F, 7.9844F, -4.4084F, -1.2039F, 0.3827F, -0.1792F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(94, 46).addBox(-1.0174F, -0.2954F, 0.1463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(94, 43).addBox(-1.0174F, -0.2954F, 0.5463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.8039F, 7.9844F, -4.4084F, -1.073F, 0.3827F, -0.1792F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0174F, -0.5493F, -0.4789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.8039F, 7.9844F, -4.4084F, -1.2781F, 0.3827F, -0.1792F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(35, 93).addBox(-1.0174F, -0.5749F, -0.2907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(1.8039F, 7.9844F, -4.4084F, -1.3348F, 0.3827F, -0.1792F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(30, 93).addBox(-0.6485F, -0.242F, -0.1797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7539F, 7.8344F, -4.1084F, -1.2417F, 0.3968F, 0.0307F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(77, 50).addBox(-0.6485F, -0.2107F, -0.3868F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.7539F, 7.8344F, -4.1084F, -1.185F, 0.3968F, 0.0307F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(94, 36).addBox(-0.6485F, 0.0549F, 0.5675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 94).addBox(-0.6485F, 0.0549F, 0.1675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7539F, 7.8344F, -4.1084F, -0.9799F, 0.3968F, 0.0307F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 86).addBox(-0.6485F, -0.0126F, -0.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.7539F, 7.8344F, -4.1084F, -1.1108F, 0.3968F, 0.0307F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(92, 83).addBox(-0.5294F, 1.2466F, -0.187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.8213F, 5.825F, -5.1831F, 0.2402F, 0.4622F, -0.0746F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(26, 81).addBox(-0.5294F, -0.7868F, 0.2682F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8213F, 5.825F, -5.1831F, 0.0657F, 0.4622F, -0.0746F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(10, 94).addBox(-0.5F, -1.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F))
				.texOffs(38, 78).addBox(-0.5F, -0.85F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.3442F, 3.9618F, -7.6649F, 2.9897F, 0.3646F, 0.0912F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(70, 41).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.1075F, 2.5215F, -6.83F, -2.1154F, 0.3646F, 0.0912F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(33, 34).addBox(-0.5F, -1.775F, -2.475F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.3832F, 4.5708F, -5.6215F, -1.2427F, 0.3646F, 0.0912F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(22, 86).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3182F, 5.0243F, -7.3435F, -1.2863F, 0.3646F, 0.0912F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(77, 85).addBox(-0.6628F, 0.2727F, -0.6792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.7519F, 5.6795F, -5.6112F, -1.8222F, 0.4511F, -0.1318F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(70, 51).addBox(-0.6628F, -0.3143F, -0.5516F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8213F, 4.625F, -5.1831F, -1.9095F, 0.4511F, -0.1318F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 10).addBox(-0.6192F, -0.2645F, -0.2558F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.4036F, 5.0896F, -4.0177F, 2.7354F, 0.4688F, -0.0873F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(71, 92).addBox(-0.6192F, -0.2761F, -0.3344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(1.4036F, 5.0896F, -4.0177F, -1.7698F, 0.4511F, -0.1318F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(70, 5).addBox(-0.6628F, -1.0356F, -0.4241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.8213F, 4.625F, -5.1831F, -1.2462F, 0.4511F, -0.1318F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 34).addBox(-0.6628F, 0.2319F, -0.4623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.8213F, 4.625F, -5.1831F, -0.5917F, 0.4511F, -0.1318F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 4).addBox(-0.6628F, 1.3315F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.8213F, 4.625F, -5.1831F, 0.15F, 0.4511F, -0.1318F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(53, 85).addBox(-0.5726F, -0.1733F, -1.5471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8213F, 4.625F, -5.1831F, 0.7356F, 0.4544F, -0.0859F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 82).addBox(-1.2467F, 0.4727F, -3.1169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2017F, 3.9894F, -2.1035F, -1.6095F, -0.0135F, 0.3512F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(50, 92).addBox(-1.6269F, 0.248F, -3.8035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2017F, 3.9894F, -2.1035F, -1.09F, -0.1493F, 0.3786F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(84, 37).addBox(-0.5F, -0.8463F, -0.2133F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.576F, 1.6144F, -2.3455F, -0.5721F, -0.4799F, 0.7853F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(57, 26).addBox(-3.5205F, -2.7449F, -2.1079F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 2.8157F, 1.0251F, -0.0102F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(71, 25).addBox(-3.5575F, -2.763F, -2.5363F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 2.8171F, 0.9926F, -0.0717F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(91, 13).addBox(-0.475F, -0.65F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3031F, 5.5972F, 0.6244F, -1.5779F, 0.8881F, -0.0621F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(71, 20).addBox(-3.5575F, -3.6876F, -0.294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, -2.7679F, 0.9926F, -0.0717F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 24).addBox(-0.5F, -1.9F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.223F, 0.5765F, 1.2802F, 1.4407F, 0.9777F, -0.0063F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(94, 3).addBox(-3.4581F, 0.7521F, 0.5762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 1.3535F, 0.9777F, -0.0063F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(65, 85).addBox(-3.4581F, -0.0892F, -2.0749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 2.6886F, 0.9777F, -0.0063F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 85).addBox(-3.4581F, 0.5134F, -1.9545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 2.2959F, 0.9777F, -0.0063F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 85).addBox(-3.4581F, 1.0546F, -1.4866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 1.8596F, 0.9777F, -0.0063F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 65).addBox(-3.4581F, 1.3436F, -0.6944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 1.3796F, 0.9777F, -0.0063F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(79, 0).addBox(-3.4581F, 0.1417F, -3.2341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 2.4705F, 0.9777F, -0.0063F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(72, 0).addBox(-3.4581F, -3.0979F, -1.1024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, -2.4601F, 0.9777F, -0.0063F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.5313F, 3.8245F, -2.9886F, -0.1057F, 0.273F, -0.2222F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(89, 37).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(1.6811F, 3.6483F, -2.3279F, -1.3711F, 0.273F, -0.2222F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(51, 89).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.7773F, 3.307F, -1.7244F, -2.6801F, 0.273F, -0.2222F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(31, 73).addBox(-0.925F, -1.4365F, -1.1901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, -2.6699F, 0.375F, -0.2301F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(69, 72).addBox(-0.925F, -1.0177F, -1.398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, -2.9404F, 0.375F, -0.2301F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(91, 33).addBox(2.2154F, -0.2613F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 2.4709F, -1.3116F, 0.3058F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(91, 30).addBox(1.1202F, -0.2613F, -3.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(91, 27).addBox(1.1202F, 0.4387F, -3.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, 2.9707F, -0.3576F, -0.288F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(25, 91).addBox(-0.0937F, -0.0799F, -3.3185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, -3.1229F, 0.0716F, -0.3256F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(73, 66).addBox(-0.925F, -1.2708F, -2.9003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, -2.8095F, 0.375F, -0.2301F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(62, 72).addBox(-0.925F, -1.3893F, -2.7401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.8493F, 1.8088F, -1.8702F, -2.5914F, 0.375F, -0.2301F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(78, 25).addBox(-0.4661F, 0.8017F, 1.0388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4517F, 3.9894F, -2.1035F, -2.3637F, -0.2758F, -2.934F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 78).addBox(-0.3098F, -0.2507F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3149F, 0.8595F, -2.4118F, -1.2071F, 0.1437F, -0.0121F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(35, 90).addBox(-0.5437F, -0.1597F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3149F, 0.8595F, -2.4118F, -1.1346F, 0.3265F, -0.3701F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(5, 89).addBox(-0.425F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1042F, 3.4218F, -6.7055F, -0.5181F, 0.2162F, 0.2862F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(65, 0).addBox(-0.5F, -1.075F, -0.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.106F)), PartPose.offsetAndRotation(0.8091F, 2.2286F, -3.8058F, -1.2841F, 0.1366F, 0.1485F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(65, 56).addBox(-0.7594F, -0.9482F, -0.6772F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.0657F, 2.2202F, -3.8734F, 0.1995F, 0.1366F, 0.1485F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(91, 77).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1878F, 3.9119F, -7.9554F, 1.5088F, 0.0366F, 0.4787F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(85, 24).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1275F, 2.3038F, -6.8707F, -2.2354F, -0.1021F, 0.3927F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(85, 20).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8843F, 3.0551F, -7.4843F, -1.7419F, -0.3998F, -0.7376F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(77, 38).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1878F, 1.8013F, -6.763F, -0.9289F, -0.2146F, 0.2775F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(85, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1878F, 1.3109F, -5.9049F, 0.3462F, -0.1229F, 0.3276F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(91, 49).addBox(-1.0F, -1.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 40).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1878F, 1.0271F, -4.4436F, 1.7423F, 0.736F, 0.1016F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(91, 55).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8443F, 1.0826F, -4.8205F, 1.0018F, 0.4577F, -1.1458F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(91, 52).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1878F, 1.0271F, -4.4436F, 0.972F, 0.4863F, -1.1211F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(64, 21).addBox(-0.36F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(36, 47).addBox(-1.14F, -1.025F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(1.1771F, 2.3576F, -3.8245F, 0.1558F, 0.1366F, 0.1485F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.2375F, 1.3894F, 0.4432F, 0.2021F, 0.294F, 0.3811F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 43).addBox(-0.4F, -0.171F, -2.5043F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.425F, 0.0F, 0.1445F, -0.3655F, 0.38F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8122F, -4.679F, -0.781F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.5F, -0.8203F, -1.1348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.576F, 1.6144F, -2.3455F, -0.4848F, 0.4799F, -0.7853F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(2.3852F, -1.1697F, -2.3752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4517F, 3.9894F, -2.1035F, -0.8351F, 1.1014F, 0.1263F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(46, 24).mirror().addBox(0.9294F, 1.55F, -3.5776F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4517F, 3.9894F, -2.1035F, -1.0962F, 0.1065F, -0.4586F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(2.264F, -0.7979F, -1.9684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2017F, 3.9894F, -2.1035F, 0.0491F, 0.0862F, -1.4058F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(92, 66).mirror().addBox(0.6838F, 0.7034F, -3.8113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2017F, 3.9894F, -2.1035F, -1.0431F, 0.1434F, -0.399F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(92, 63).mirror().addBox(-0.4706F, 0.0017F, -1.6325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 5.825F, -5.1831F, 1.6801F, -0.4622F, 0.0746F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.4706F, -0.9286F, 1.7025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 5.825F, -5.1831F, -1.3305F, -0.4622F, 0.0746F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(-0.4706F, -0.3697F, 1.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 5.825F, -5.1831F, -1.1124F, -0.4622F, 0.0746F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(20, 93).mirror().addBox(0.0174F, -0.3571F, -0.2047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8039F, 7.9844F, -4.4084F, -1.2039F, -0.3827F, 0.1792F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(94, 46).mirror().addBox(0.0174F, -0.2954F, 0.1463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(94, 43).mirror().addBox(0.0174F, -0.2954F, 0.5463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-1.8039F, 7.9844F, -4.4084F, -1.073F, -0.3827F, 0.1792F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(0.0174F, -0.5493F, -0.4789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.8039F, 7.9844F, -4.4084F, -1.2781F, -0.3827F, 0.1792F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(35, 93).mirror().addBox(0.0174F, -0.5749F, -0.2907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-1.8039F, 7.9844F, -4.4084F, -1.3348F, -0.3827F, 0.1792F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(30, 93).mirror().addBox(-0.3515F, -0.242F, -0.1797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7539F, 7.8344F, -4.1084F, -1.2417F, -0.3968F, -0.0307F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.3515F, -0.2107F, -0.3868F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.7539F, 7.8344F, -4.1084F, -1.185F, -0.3968F, -0.0307F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(-0.3515F, 0.0549F, 0.5675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 94).mirror().addBox(-0.3515F, 0.0549F, 0.1675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7539F, 7.8344F, -4.1084F, -0.9799F, -0.3968F, -0.0307F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(92, 86).mirror().addBox(-0.3515F, -0.0126F, -0.138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.7539F, 7.8344F, -4.1084F, -1.1108F, -0.3968F, -0.0307F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(92, 83).mirror().addBox(-0.4706F, 1.2466F, -0.187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 5.825F, -5.1831F, 0.2402F, -0.4622F, 0.0746F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(26, 81).mirror().addBox(-0.4706F, -0.7868F, 0.2682F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 5.825F, -5.1831F, 0.0657F, -0.4622F, 0.0746F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-0.5F, -1.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false)
				.texOffs(38, 78).mirror().addBox(-0.5F, -0.85F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.3442F, 3.9618F, -7.6649F, 2.9897F, -0.3646F, -0.0912F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(70, 41).mirror().addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-0.1075F, 2.5215F, -6.83F, -2.1154F, -0.3646F, -0.0912F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(33, 34).mirror().addBox(-0.5F, -1.775F, -2.475F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.3832F, 4.5708F, -5.6215F, -1.2427F, -0.3646F, -0.0912F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3182F, 5.0243F, -7.3435F, -1.2863F, -0.3646F, -0.0912F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(77, 85).mirror().addBox(-0.3372F, 0.2727F, -0.6792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.7519F, 5.6795F, -5.6112F, -1.8222F, -0.4511F, 0.1318F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(70, 51).mirror().addBox(-0.3372F, -0.3143F, -0.5516F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 4.625F, -5.1831F, -1.9095F, -0.4511F, 0.1318F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(-0.3808F, -0.2645F, -0.2558F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.4036F, 5.0896F, -4.0177F, 2.7354F, -0.4688F, 0.0873F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(-0.3808F, -0.2761F, -0.3344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-1.4036F, 5.0896F, -4.0177F, -1.7698F, -0.4511F, 0.1318F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(-0.3372F, -1.0356F, -0.4241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 4.625F, -5.1831F, -1.2462F, -0.4511F, 0.1318F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.3372F, 0.2319F, -0.4623F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 4.625F, -5.1831F, -0.5917F, -0.4511F, 0.1318F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-0.3372F, 1.3315F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 4.625F, -5.1831F, 0.15F, -0.4511F, 0.1318F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(53, 85).mirror().addBox(-0.4274F, -0.1733F, -1.5471F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8213F, 4.625F, -5.1831F, 0.7356F, -0.4544F, 0.0859F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(0.2467F, 0.4727F, -3.1169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2017F, 3.9894F, -2.1035F, -1.6095F, 0.0135F, -0.3512F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(0.6269F, 0.248F, -3.8035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2017F, 3.9894F, -2.1035F, -1.09F, 0.1493F, -0.3786F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(84, 37).mirror().addBox(-0.5F, -0.8463F, -0.2133F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.576F, 1.6144F, -2.3455F, -0.5721F, 0.4799F, -0.7853F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(57, 26).mirror().addBox(2.5205F, -2.7449F, -2.1079F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 2.8157F, -1.0251F, 0.0102F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(2.5575F, -2.763F, -2.5363F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 2.8171F, -0.9926F, 0.0717F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 13).mirror().addBox(-0.525F, -0.65F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3031F, 5.5972F, 0.6244F, -1.5779F, -0.8881F, 0.0621F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(2.5575F, -3.6876F, -0.294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, -2.7679F, -0.9926F, 0.0717F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(13, 24).mirror().addBox(-0.5F, -1.9F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.223F, 0.5765F, 1.2802F, 1.4407F, -0.9777F, 0.0063F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(94, 3).mirror().addBox(2.4581F, 0.7521F, 0.5762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 1.3535F, -0.9777F, 0.0063F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(65, 85).mirror().addBox(2.4581F, -0.0892F, -2.0749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 2.6886F, -0.9777F, 0.0063F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(82, 85).mirror().addBox(2.4581F, 0.5134F, -1.9545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 2.2959F, -0.9777F, 0.0063F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(2.4581F, 1.0546F, -1.4866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 1.8596F, -0.9777F, 0.0063F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(2.4581F, 1.3436F, -0.6944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 1.3796F, -0.9777F, 0.0063F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(2.4581F, 0.1417F, -3.2341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 2.4705F, -0.9777F, 0.0063F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(2.4581F, -3.0979F, -1.1024F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, -2.4601F, -0.9777F, 0.0063F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.5313F, 3.8245F, -2.9886F, -0.1057F, -0.273F, 0.2222F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-1.6811F, 3.6483F, -2.3279F, -1.3711F, -0.273F, 0.2222F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(51, 89).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.7773F, 3.307F, -1.7244F, -2.6801F, -0.273F, 0.2222F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(31, 73).mirror().addBox(-0.075F, -1.4365F, -1.1901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, -2.6699F, -0.375F, 0.2301F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(69, 72).mirror().addBox(-0.075F, -1.0177F, -1.398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, -2.9404F, -0.375F, 0.2301F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-3.2154F, -0.2613F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 2.4709F, 1.3116F, -0.3058F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-2.1201F, -0.2613F, -3.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(91, 27).mirror().addBox(-2.1201F, 0.4387F, -3.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, 2.9707F, 0.3576F, 0.288F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(25, 91).mirror().addBox(-0.9063F, -0.0799F, -3.3185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, -3.1229F, -0.0716F, 0.3256F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-0.075F, -1.2708F, -2.9003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, -2.8095F, -0.375F, 0.2301F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-0.075F, -1.3893F, -2.7401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-1.8493F, 1.8088F, -1.8702F, -2.5914F, -0.375F, 0.2301F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-0.5339F, 0.8017F, 1.0388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4517F, 3.9894F, -2.1035F, -2.3637F, 0.2758F, 2.934F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(74, 78).mirror().addBox(-0.6902F, -0.2507F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3149F, 0.8595F, -2.4118F, -1.2071F, -0.1437F, 0.0121F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(35, 90).mirror().addBox(-0.4563F, -0.1597F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3149F, 0.8595F, -2.4118F, -1.1346F, -0.3265F, 0.3701F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.575F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1042F, 3.4218F, -6.7055F, -0.5181F, -0.2162F, -0.2862F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-0.5F, -1.075F, -0.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.106F)).mirror(false), PartPose.offsetAndRotation(-0.8091F, 2.2286F, -3.8058F, -1.2841F, -0.1366F, -0.1485F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-0.2406F, -0.9482F, -0.6772F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0657F, 2.2202F, -3.8734F, 0.1995F, -0.1366F, -0.1485F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(91, 77).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1878F, 3.9119F, -7.9554F, 1.5088F, -0.0366F, -0.4787F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1275F, 2.3038F, -6.8707F, -2.2354F, 0.1021F, -0.3927F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(85, 20).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8843F, 3.0551F, -7.4843F, -1.7419F, 0.3998F, 0.7376F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(77, 38).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1878F, 1.8013F, -6.763F, -0.9289F, 0.2146F, -0.2775F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1878F, 1.3109F, -5.9049F, 0.3462F, 0.1229F, -0.3276F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(0.0F, -1.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 40).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1878F, 1.0271F, -4.4436F, 1.7423F, -0.736F, -0.1016F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8443F, 1.0826F, -4.8205F, 1.0018F, -0.4577F, 1.1458F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(91, 52).mirror().addBox(0.0F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1878F, 1.0271F, -4.4436F, 0.972F, -0.4863F, 1.1211F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-0.64F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(36, 47).mirror().addBox(-0.86F, -1.025F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-1.1771F, 2.3576F, -3.8245F, 0.1558F, -0.1366F, -0.1485F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.2375F, 1.3894F, 0.4432F, 0.2021F, -0.294F, -0.3811F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.6F, -0.171F, -2.5043F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.425F, 0.0F, 0.1445F, 0.3655F, -0.38F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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