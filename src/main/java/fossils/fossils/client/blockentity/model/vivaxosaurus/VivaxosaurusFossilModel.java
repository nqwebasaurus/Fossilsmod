package fossils.fossils.client.blockentity.model.vivaxosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VivaxosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart bone3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public VivaxosaurusFossilModel(ModelPart root) {
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
		this.bone3 = this.chest.getChild("bone3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.3151F, 10.1679F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 66).addBox(0.0F, -1.5423F, 3.7997F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2376F, -0.7906F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 76).addBox(0.0F, -1.6423F, -0.2003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4465F, 1.0888F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 76).addBox(0.0F, -1.3423F, -0.2003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2376F, -0.7906F, -0.2618F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(0.5F, -1.6F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 17).addBox(2.5F, -1.6F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 2.6921F, 3.5519F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 9).addBox(-0.5F, -0.0121F, -0.0463F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3981F, -0.9128F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2464F, 3.9825F, 2.619F, 0.0F, 0.0F, 0.1745F));

		PartDefinition basin_r2 = bone.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -4.4941F, 0.0856F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r3 = bone.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(52, 66).addBox(0.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -4.7782F, -0.8405F, -0.3578F, 0.0F, 0.0F));

		PartDefinition basin_r4 = bone.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(15, 66).addBox(0.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -4.9174F, -1.8308F, -0.1396F, 0.0F, 0.0F));

		PartDefinition basin_r5 = bone.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(20, 66).addBox(0.0F, -0.0176F, -1.0439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -4.8524F, -2.7969F, 0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(65, 65).addBox(0.0F, -0.1221F, -1.0384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -4.8524F, -1.7969F, 0.1047F, 0.0F, 0.0F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -0.35F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.2708F, -3.1074F, -1.7537F, -0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(67, 57).addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2708F, -2.6161F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r9 = bone.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(67, 53).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2708F, -3.2744F, 0.8713F, -0.8639F, 0.0F, 0.0F));

		PartDefinition basin_r10 = bone.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(50, 74).addBox(0.0F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7708F, -4.3869F, -3.7956F, -0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(48, 55).addBox(-0.5F, -0.9F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2708F, -2.7628F, -3.14F, 0.096F, 0.0F, 0.0F));

		PartDefinition basin_r12 = bone.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(72, 53).addBox(-0.5F, -1.0F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2708F, -2.2664F, -3.2362F, -0.3403F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(29, 52).addBox(-0.5F, -1.225F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6805F, 1.4147F, 1.2144F, -1.9845F, -0.0255F, 0.111F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(7, 48).addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6097F, 2.3822F, -0.2281F, -2.3073F, -0.0255F, 0.111F));

		PartDefinition basin_r15 = bone.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(73, 34).addBox(-0.5F, 0.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.566F, 2.5469F, 0.7572F, -1.7401F, -0.0255F, 0.111F));

		PartDefinition basin_r16 = bone.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(59, 73).addBox(-0.5F, 0.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(65, 61).addBox(-0.5F, 0.0F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6245F, 1.6149F, 2.5259F, -1.0856F, -0.0255F, 0.111F));

		PartDefinition basin_r17 = bone.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(50, 12).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7956F, 0.7466F, -0.3668F, -2.2463F, -0.0255F, 0.111F));

		PartDefinition basin_r18 = bone.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(67, 31).addBox(-0.5021F, -0.3274F, -1.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.886F, -0.2268F, 0.3383F, -1.33F, -0.0255F, 0.111F));

		PartDefinition basin_r19 = bone.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(55, 26).addBox(-0.5F, -0.425F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0857F, -1.8691F, -0.3091F, -1.1554F, -0.0255F, 0.111F));

		PartDefinition basin_r20 = bone.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(45, 74).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1137F, -1.9495F, -1.0479F, -2.2899F, -0.0255F, 0.111F));

		PartDefinition basin_r21 = bone.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(74, 44).addBox(-0.5F, -0.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -0.6055F, -1.6354F, -0.0255F, 0.111F));

		PartDefinition basin_r22 = bone.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -0.6055F, -1.4172F, -0.0255F, 0.111F));

		PartDefinition bone4 = body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2464F, 3.9825F, 2.619F, 0.0F, 0.0F, -0.1745F));

		PartDefinition basin_r23 = bone4.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.4941F, 0.0856F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r24 = bone4.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(52, 66).mirror().addBox(-1.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.7782F, -0.8405F, -0.3578F, 0.0F, 0.0F));

		PartDefinition basin_r25 = bone4.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-1.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.9174F, -1.8308F, -0.1396F, 0.0F, 0.0F));

		PartDefinition basin_r26 = bone4.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-1.0F, -0.0176F, -1.0439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.8524F, -2.7969F, 0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r27 = bone4.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-1.0F, -0.1221F, -1.0384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.8524F, -1.7969F, 0.1047F, 0.0F, 0.0F));

		PartDefinition basin_r28 = bone4.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.5F, -0.35F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -3.1074F, -1.7537F, -0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r29 = bone4.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -2.6161F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r30 = bone4.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -3.2744F, 0.8713F, -0.8639F, 0.0F, 0.0F));

		PartDefinition basin_r31 = bone4.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-1.0F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.3869F, -3.7956F, -0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r32 = bone4.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(48, 55).mirror().addBox(-0.5F, -0.9F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -2.7628F, -3.14F, 0.096F, 0.0F, 0.0F));

		PartDefinition basin_r33 = bone4.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-0.5F, -1.0F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -2.2664F, -3.2362F, -0.3403F, 0.0F, 0.0F));

		PartDefinition basin_r34 = bone4.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(29, 52).mirror().addBox(-0.5F, -1.225F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, 1.4147F, 1.2144F, -1.9845F, 0.0255F, -0.111F));

		PartDefinition basin_r35 = bone4.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6097F, 2.3822F, -0.2281F, -2.3073F, 0.0255F, -0.111F));

		PartDefinition basin_r36 = bone4.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-0.5F, 0.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.566F, 2.5469F, 0.7572F, -1.7401F, 0.0255F, -0.111F));

		PartDefinition basin_r37 = bone4.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(-0.5F, 0.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(65, 61).mirror().addBox(-0.5F, 0.0F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6245F, 1.6149F, 2.5259F, -1.0856F, 0.0255F, -0.111F));

		PartDefinition basin_r38 = bone4.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(50, 12).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7956F, 0.7466F, -0.3668F, -2.2463F, 0.0255F, -0.111F));

		PartDefinition basin_r39 = bone4.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-0.4979F, -0.3274F, -1.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.886F, -0.2268F, 0.3383F, -1.33F, 0.0255F, -0.111F));

		PartDefinition basin_r40 = bone4.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(55, 26).mirror().addBox(-0.5F, -0.425F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0857F, -1.8691F, -0.3091F, -1.1554F, 0.0255F, -0.111F));

		PartDefinition basin_r41 = bone4.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1137F, -1.9495F, -1.0479F, -2.2899F, 0.0255F, -0.111F));

		PartDefinition basin_r42 = bone4.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-0.5F, -0.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -0.6055F, -1.6354F, 0.0255F, -0.111F));

		PartDefinition basin_r43 = bone4.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -0.6055F, -1.4172F, 0.0255F, -0.111F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(62, 31).addBox(0.0F, 2.4F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 4.1612F, 3.4906F, -0.5271F, 0.1228F, -0.9243F));

		PartDefinition upperleg4_r1 = upperleg1.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(44, 68).addBox(-0.5018F, -2.134F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(5, 63).addBox(-0.5018F, -1.659F, -0.1037F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.3F, -1.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg1.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(68, 35).addBox(-0.5018F, -1.984F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, -1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg1.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(10, 68).addBox(-0.5F, -1.875F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 7.2112F, -0.6875F, -0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg1.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(74, 72).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(74, 69).addBox(-0.5F, 1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.2F, -0.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2083F, 7.444F, -1.0166F, 0.8808F, -0.5956F, 0.5789F));

		PartDefinition leg3_r1 = leg1.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(5, 68).addBox(-0.3165F, 0.1931F, 0.3245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2489F, -0.1382F, 1.3147F, 0.1794F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(55, 55).addBox(-0.3165F, -3.4286F, 0.1836F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2489F, 0.1673F, 1.3147F, 0.1794F));

		PartDefinition leg1_r1 = leg1.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(29, 44).addBox(-0.3984F, -3.5022F, -1.4302F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2489F, 0.0364F, 1.3147F, 0.1794F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.273F, 5.308F, -0.1457F, -0.4257F, 0.3519F, 0.0785F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(11, 34).addBox(-3.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 2.7818F, -0.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-3.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 1.7818F, -3.018F, -0.0036F, -0.0062F, -0.1214F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, 2.4F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 4.1612F, 3.4906F, 0.0402F, -0.1228F, 0.9243F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(70, 65).addBox(-0.4982F, -2.134F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(64, 6).addBox(-0.4982F, -1.659F, -0.1037F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(70, 61).addBox(-0.4982F, -1.984F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg2.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(54, 70).addBox(-0.5F, -1.875F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 7.2112F, -0.6875F, -0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg2.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(10, 75).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(5, 75).addBox(-0.5F, 1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.2F, -0.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2083F, 7.444F, -1.0166F, 0.8808F, 0.5956F, -0.5789F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(49, 70).addBox(-0.6835F, 0.1931F, 0.3245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2489F, -0.1382F, -1.3147F, -0.1794F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(0, 57).addBox(-0.6835F, -3.4286F, 0.1836F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2489F, 0.1673F, -1.3147F, -0.1794F));

		PartDefinition leg2_r2 = leg2.addOrReplaceChild("leg2_r2", CubeListBuilder.create().texOffs(45, 44).addBox(-0.6016F, -3.5022F, -1.4302F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2489F, 0.0364F, -1.3147F, -0.1794F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.273F, 5.308F, -0.1457F, -0.4646F, -0.3978F, -0.2102F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(35, 35).addBox(0.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 2.7818F, -0.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(11, 29).addBox(0.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 1.7818F, -3.018F, -0.0036F, 0.0062F, 0.1214F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(10, 63).addBox(-0.5F, 0.022F, 0.0628F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.974F, 4.5227F, 1.2139F, -0.2048F, 0.0757F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 66).addBox(0.0F, -1.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 69).addBox(0.0F, -0.2F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4166F, -0.2509F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 65).addBox(-15.0F, 2.0F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 63).addBox(-15.0F, 0.0F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.022F, 1.0628F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(5, 53).addBox(-0.5F, -0.1285F, -0.4852F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0666F, 0.5743F, 0.0F, 0.0F, 0.2618F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0269F, -0.9128F, -0.0528F, 0.1307F, -0.0069F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 47).addBox(0.0F, -1.5419F, 0.0206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4845F, -1.9557F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 74).addBox(0.0F, -1.469F, 0.0191F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -3.9557F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 77).addBox(0.0F, -1.3954F, 0.0063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -5.9557F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.3F, 12.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3845F, -17.9557F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.0565F, -0.0454F, -0.6768F));

		PartDefinition neck23_r1 = body2.addOrReplaceChild("neck23_r1", CubeListBuilder.create().texOffs(28, 22).mirror().addBox(-4.6386F, -0.9872F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.072F, -0.008F, -1.2431F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.1005F, -0.017F, -0.5735F));

		PartDefinition neck22_r2 = body2.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(37, 27).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.0939F, 0.0396F, -1.138F));

		PartDefinition neck23_r2 = body2.addOrReplaceChild("neck23_r2", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-5.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.0685F, 0.0755F, -1.5736F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-1.5622F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.1329F, -0.0033F, -0.5042F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(17, 7).mirror().addBox(-5.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.114F, 0.0685F, -1.0673F));

		PartDefinition neck22_r3 = body2.addOrReplaceChild("neck22_r3", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(-6.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.0745F, 0.1103F, -1.5034F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(64, 14).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.0565F, 0.0454F, 0.6768F));

		PartDefinition neck22_r4 = body2.addOrReplaceChild("neck22_r4", CubeListBuilder.create().texOffs(28, 22).addBox(1.6386F, -0.9872F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.072F, 0.008F, 1.2431F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(69, 6).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.1005F, 0.017F, 0.5735F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(37, 27).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.0939F, -0.0396F, 1.138F));

		PartDefinition neck22_r5 = body2.addOrReplaceChild("neck22_r5", CubeListBuilder.create().texOffs(59, 20).addBox(4.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.0685F, -0.0755F, 1.5736F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(69, 0).addBox(-0.4378F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.1329F, 0.0033F, 0.5042F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(17, 7).addBox(1.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.114F, -0.0685F, 1.0673F));

		PartDefinition neck21_r5 = body2.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(68, 39).addBox(4.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.0745F, -0.1103F, 1.5034F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2355F, -5.9618F, 0.0088F, 0.0873F, 0.0008F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 76).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1688F, -5.9579F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(58, 76).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0399F, -3.9593F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck20_r4 = body3.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(48, 53).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.0714F, 0.1018F, -1.4339F));

		PartDefinition neck19_r2 = body3.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(46, 22).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.1077F, 0.0621F, -0.9979F));

		PartDefinition neck18_r1 = body3.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4352F, 0.1242F, -0.0053F, -0.4344F));

		PartDefinition neck19_r3 = body3.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(53, 33).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.0747F, 0.1365F, -1.4161F));

		PartDefinition neck18_r2 = body3.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(41, 20).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.1254F, 0.0922F, -0.9791F));

		PartDefinition neck17_r1 = body3.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(67, 29).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4352F, 0.1552F, 0.0108F, -0.4169F));

		PartDefinition neck16_r1 = body3.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.1851F, 0.029F, -0.4164F));

		PartDefinition neck17_r2 = body3.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.1411F, 0.1236F, -0.9776F));

		PartDefinition neck18_r3 = body3.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.0756F, 0.1715F, -1.4161F));

		PartDefinition neck19_r4 = body3.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(48, 53).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.0714F, -0.1018F, 1.4339F));

		PartDefinition neck18_r4 = body3.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(46, 22).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.1077F, -0.0621F, 0.9979F));

		PartDefinition neck17_r3 = body3.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(69, 20).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4352F, 0.1242F, 0.0053F, 0.4344F));

		PartDefinition neck18_r5 = body3.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(53, 33).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.0747F, -0.1365F, 1.4161F));

		PartDefinition neck17_r4 = body3.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(41, 20).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.1254F, -0.0922F, 0.9791F));

		PartDefinition neck16_r2 = body3.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(67, 29).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4352F, 0.1552F, -0.0108F, 0.4169F));

		PartDefinition neck15_r1 = body3.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(69, 8).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.1851F, -0.029F, 0.4164F));

		PartDefinition neck16_r3 = body3.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(37, 29).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.1411F, -0.1236F, 0.9776F));

		PartDefinition neck17_r5 = body3.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(53, 35).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.0756F, -0.1715F, 1.4161F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 53).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2097F, -1.962F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.951F, -6.6189F, 0.1314F, 0.0865F, 0.0114F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(14, 48).addBox(0.0F, -1.7693F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5433F, -1.2467F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(70, 76).addBox(0.0F, -1.9693F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0952F, -3.1677F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(41, 46).addBox(0.0F, -2.1693F, -0.1104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1796F, -5.0916F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 17).addBox(-0.5F, 0.0019F, 2.1302F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.3F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck18_r6 = chest.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.1956F, 0.2134F, -1.0732F));

		PartDefinition neck17_r6 = chest.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.2784F, 0.0766F, -0.5163F));

		PartDefinition neck18_r7 = chest.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-5.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.0835F, 0.2409F, -1.4844F));

		PartDefinition neck17_r7 = chest.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(34, 44).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.1781F, 0.183F, -1.0418F));

		PartDefinition neck16_r4 = chest.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.2477F, 0.0599F, -0.4835F));

		PartDefinition neck15_r2 = chest.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(71, 14).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.1385F, 0.005F, -0.452F));

		PartDefinition neck17_r8 = chest.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-6.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.0705F, 0.1194F, -1.4517F));

		PartDefinition neck16_r5 = chest.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(46, 24).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.1143F, 0.0785F, -1.0151F));

		PartDefinition neck17_r9 = chest.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(46, 31).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.1956F, -0.2134F, 1.0732F));

		PartDefinition neck16_r6 = chest.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(59, 71).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.2784F, -0.0766F, 0.5163F));

		PartDefinition neck17_r10 = chest.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(76, 0).addBox(4.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.0835F, -0.2409F, 1.4844F));

		PartDefinition neck16_r7 = chest.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(34, 44).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.1781F, -0.183F, 1.0418F));

		PartDefinition neck15_r3 = chest.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(69, 22).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.2477F, -0.0599F, 0.4835F));

		PartDefinition neck14_r1 = chest.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(71, 14).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.1385F, -0.005F, 0.452F));

		PartDefinition neck16_r8 = chest.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(71, 4).addBox(4.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.0705F, -0.1194F, 1.4517F));

		PartDefinition neck15_r4 = chest.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(46, 24).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.1143F, -0.0785F, 1.0151F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(0, 50).addBox(-0.3797F, -0.0885F, -1.2806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2551F, 4.7223F, -4.4872F, 0.1503F, -0.0397F, -0.8486F));

		PartDefinition upperarm4_r1 = upperarm1.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(48, 59).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, -0.6545F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarm1.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(26, 59).addBox(-0.5F, -1.1F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, 0.9163F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarm1.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(41, 15).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm6_r1 = upperarm1.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(57, 66).addBox(-0.5F, -0.725F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2534F, -1.2654F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarm1.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(52, 17).addBox(-0.5F, -2.2F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2534F, 2.8798F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarm1.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2534F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm3_r2 = upperarm1.addOrReplaceChild("upperarm3_r2", CubeListBuilder.create().texOffs(29, 64).addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 0.9115F, -0.7806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6795F, 4.7465F, -0.4007F, -0.6624F, -0.4302F, 1.1838F));

		PartDefinition lowerarm3_r1 = lowerarm1.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(19, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8955F, -0.2335F, -0.2897F, 0.0791F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(19, 52).addBox(-0.5F, -1.75F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1779F, 1.0197F, -0.3384F, -0.3572F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r2 = lowerarm1.addOrReplaceChild("lowerarm2_r2", CubeListBuilder.create().texOffs(30, 69).addBox(0.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3115F, 2.0518F, -0.2838F, -0.2961F, 1.2533F, -0.2064F));

		PartDefinition lowerarm1_r1 = lowerarm1.addOrReplaceChild("lowerarm1_r1", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3239F, 4.1855F, -0.6257F, -0.2001F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0518F, 4.4716F, -1.0283F, 1.1813F, 0.8778F, 0.4275F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(13, 24).addBox(0.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.446F, 2.8811F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(0, 35).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(75, 37).addBox(0.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(62, 0).addBox(3.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(50, 0).addBox(-0.6203F, -0.0885F, -1.2806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2551F, 4.7223F, -4.4872F, 0.9357F, 0.0397F, 0.8486F));

		PartDefinition upperarm5_r2 = upperarm2.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(60, 57).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, -0.6545F, 0.0F, 0.0F));

		PartDefinition upperarm5_r3 = upperarm2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(60, 53).addBox(-0.5F, -1.1F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, 0.9163F, 0.0F, 0.0F));

		PartDefinition upperarm4_r4 = upperarm2.addOrReplaceChild("upperarm4_r4", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm7_r1 = upperarm2.addOrReplaceChild("upperarm7_r1", CubeListBuilder.create().texOffs(67, 25).addBox(-0.5F, -0.725F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2534F, -1.2654F, 0.0F, 0.0F));

		PartDefinition upperarm6_r2 = upperarm2.addOrReplaceChild("upperarm6_r2", CubeListBuilder.create().texOffs(41, 52).addBox(-0.5F, -2.2F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2534F, 2.8798F, 0.0F, 0.0F));

		PartDefinition upperarm5_r4 = upperarm2.addOrReplaceChild("upperarm5_r4", CubeListBuilder.create().texOffs(20, 70).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2534F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm4_r5 = upperarm2.addOrReplaceChild("upperarm4_r5", CubeListBuilder.create().texOffs(34, 64).addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1203F, 0.9115F, -0.7806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6795F, 4.7465F, -0.4007F, -1.2402F, -0.0209F, -1.6946F));

		PartDefinition lowerarm4_r1 = lowerarm2.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(33, 60).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8955F, -0.2335F, -0.2897F, 0.0791F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r2 = lowerarm2.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(24, 52).addBox(-0.5F, -1.75F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1779F, 1.0197F, -0.3384F, -0.3572F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r3 = lowerarm2.addOrReplaceChild("lowerarm3_r3", CubeListBuilder.create().texOffs(15, 70).addBox(-1.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3115F, 2.0518F, -0.2838F, -0.2961F, -1.2533F, 0.2064F));

		PartDefinition lowerarm2_r3 = lowerarm2.addOrReplaceChild("lowerarm2_r3", CubeListBuilder.create().texOffs(69, 69).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3239F, 4.1855F, -0.6257F, -0.2001F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0518F, 4.4716F, -1.0283F, 1.5989F, -0.9358F, -0.0374F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(28, 17).addBox(-3.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.446F, 2.8811F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(35, 31).addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(40, 75).addBox(-1.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r4 = hand2.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(64, 3).addBox(-5.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3668F, 2.7934F, -5.7148F, -0.3054F, 0.0F, 0.0F));

		PartDefinition chest_r1 = bone2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(34, 51).addBox(-0.2336F, -1.3165F, -0.4478F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6685F, 3.002F, -0.1745F, 1.3781F, 0.055F, -0.2509F));

		PartDefinition chest_r2 = bone2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(62, 26).addBox(-1.266F, -1.6151F, -0.6538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6685F, 3.002F, -0.1745F, 1.3123F, 0.0038F, -0.1174F));

		PartDefinition chest_r3 = bone2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(26, 24).addBox(-0.5F, -1.7F, -4.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9627F, -5.2407F, 0.893F, 1.661F, 0.0122F, -0.3769F));

		PartDefinition chest_r4 = bone2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(48, 26).addBox(-1.4225F, -0.2301F, -0.7124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4365F, -4.2086F, 0.7706F, 1.4167F, 0.0122F, -0.3769F));

		PartDefinition chest_r5 = bone2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(69, 45).addBox(-0.4658F, -1.864F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5705F, 1.5854F, -1.9076F, -1.5574F, -1.0213F, 1.846F));

		PartDefinition chest_r6 = bone2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(69, 41).addBox(-0.3148F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5705F, 2.1854F, -1.9076F, 1.492F, -1.3739F, -0.858F));

		PartDefinition chest_r7 = bone2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.3F, -1.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4365F, -1.7086F, 0.9706F, 1.024F, 0.0122F, -0.3769F));

		PartDefinition chest_r8 = bone2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(20, 42).addBox(-0.6708F, -0.0467F, 0.031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1276F, 1.3432F, -0.954F, 1.3847F, 0.1321F, -0.1741F));

		PartDefinition chest_r9 = bone2.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(50, 43).addBox(-0.6708F, -1.0373F, -0.7934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1276F, 1.3432F, -0.954F, 0.6001F, 0.1166F, -0.1848F));

		PartDefinition chest_r10 = bone2.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(30, 0).addBox(-0.6708F, 0.6757F, -0.771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1276F, 1.3432F, -0.954F, 1.4291F, 0.1166F, -0.1848F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3668F, 2.7934F, -5.7148F, -0.3054F, 0.0F, 0.0F));

		PartDefinition chest_r11 = bone3.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(34, 51).mirror().addBox(-1.7664F, -1.3165F, -0.4478F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6685F, 3.002F, -0.1745F, 1.3781F, -0.055F, 0.2509F));

		PartDefinition chest_r12 = bone3.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(0.266F, -1.6151F, -0.6538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6685F, 3.002F, -0.1745F, 1.3123F, -0.0038F, 0.1174F));

		PartDefinition chest_r13 = bone3.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-0.5F, -1.7F, -4.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.9627F, -5.2407F, 0.893F, 1.661F, -0.0122F, 0.3769F));

		PartDefinition chest_r14 = bone3.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(0.4225F, -0.2301F, -0.7124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4365F, -4.2086F, 0.7706F, 1.4167F, -0.0122F, 0.3769F));

		PartDefinition chest_r15 = bone3.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(69, 45).mirror().addBox(-0.5342F, -1.864F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5705F, 1.5854F, -1.9076F, -1.5574F, 1.0213F, -1.846F));

		PartDefinition chest_r16 = bone3.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-0.6851F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5705F, 2.1854F, -1.9076F, 1.492F, 1.3739F, 0.858F));

		PartDefinition chest_r17 = bone3.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(-0.5F, -0.3F, -1.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4365F, -1.7086F, 0.9706F, 1.024F, -0.0122F, 0.3769F));

		PartDefinition chest_r18 = bone3.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(20, 42).mirror().addBox(-0.3292F, -0.0467F, 0.031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1276F, 1.3432F, -0.954F, 1.3847F, -0.1321F, 0.1741F));

		PartDefinition chest_r19 = bone3.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(50, 43).mirror().addBox(-0.3292F, -1.0373F, -0.7934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1276F, 1.3432F, -0.954F, 0.6001F, -0.1166F, 0.1848F));

		PartDefinition chest_r20 = bone3.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.3292F, 0.6757F, -0.771F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1276F, 1.3432F, -0.954F, 1.4291F, -0.1166F, 0.1848F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -5.075F, -0.3672F, 0.3267F, 0.0752F));

		PartDefinition cube_r19 = neck2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 22).addBox(0.0F, -1.9693F, -0.0854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1173F, -1.9608F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r20 = neck2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(18, 77).addBox(0.0F, -1.9693F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r21 = neck2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 6).addBox(-0.5F, 0.0052F, 1.0067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition neck19_r5 = neck2.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8927F, -3.3412F, 0.6264F, 0.3294F, -0.7833F));

		PartDefinition neck20_r5 = neck2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-2.6386F, -0.9872F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8927F, -3.3412F, 0.3663F, 0.6076F, -1.3421F));

		PartDefinition neck19_r6 = neck2.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(71, 2).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.4272F, 0.6738F, -1.1505F));

		PartDefinition neck18_r8 = neck2.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(69, 49).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.7076F, 0.36F, -0.6007F));

		PartDefinition neck18_r9 = neck2.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(69, 51).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8927F, -3.3412F, 0.6264F, -0.3294F, 0.7833F));

		PartDefinition neck19_r7 = neck2.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(76, 12).addBox(1.6386F, -0.9872F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8927F, -3.3412F, 0.3663F, -0.6076F, 1.3421F));

		PartDefinition neck18_r10 = neck2.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(71, 2).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.4272F, -0.6738F, 1.1505F));

		PartDefinition neck17_r11 = neck2.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(69, 49).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.7076F, -0.36F, 0.6007F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5953F, -3.5292F, -0.098F, 0.4742F, -0.0887F));

		PartDefinition cube_r22 = neck.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 77).addBox(0.0F, -2.378F, -0.3611F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -1.8665F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r23 = neck.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(41, 5).addBox(-0.5F, -0.1214F, 0.8322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(43, 7).addBox(-0.5F, -0.1214F, -0.1678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck20_r6 = neck.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(62, 69).mirror().addBox(-2.1124F, 0.1478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0026F, -1.812F, 0.7371F, 0.6383F, -0.8069F));

		PartDefinition neck19_r8 = neck.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(62, 69).addBox(0.1124F, 0.1478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0026F, -1.812F, 0.7371F, -0.6383F, 0.8069F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4842F, -2.8051F, 0.0375F, 0.6003F, 0.121F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(0.0F, 0.075F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5041F, -4.5022F, -2.6794F, 0.7427F, 0.4472F, 0.3901F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(0.075F, -0.0576F, -0.0216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.8401F, -6.9149F, 0.9311F, 0.0425F, 0.2752F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(64, 73).mirror().addBox(-0.15F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2034F, -7.2941F, -1.9895F, -0.2306F, -0.1494F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(0.075F, -0.0576F, -2.0216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.8401F, -6.9149F, 1.1903F, -0.1979F, -0.0889F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 73).addBox(-0.85F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 1.2034F, -7.2941F, -1.9895F, 0.2306F, 0.1494F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 63).addBox(-1.0F, -0.275F, -0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.0193F, -6.9902F, -1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-1.0F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.062F, -7.7419F, -2.5923F, 0.957F, 0.464F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 73).addBox(0.0F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, 2.062F, -7.7419F, -2.5923F, -0.957F, -0.464F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 12).addBox(-1.5F, -0.4F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 2.062F, -7.7419F, -2.8362F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(64, 11).addBox(-1.5F, -1.025F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.9982F, -7.6755F, 3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(57, 12).addBox(-0.5F, -0.2315F, -3.6663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2316F, -2.5278F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, -1.5205F, -1.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4545F, -2.6988F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(14, 52).addBox(-0.5F, -2.2F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.5222F, -1.6793F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(41, 10).addBox(-0.5F, 0.3574F, -2.2925F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.4545F, -2.6988F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, 0.075F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5041F, -4.5022F, -2.6794F, 0.7427F, -0.4472F, -0.3901F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(76, 19).addBox(-0.5F, 0.0174F, -0.9716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -4.2876F, -3.4197F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, -0.0576F, -1.0466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -4.9237F, -2.648F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 76).addBox(-0.5F, -0.2826F, -2.0216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.033F))
				.texOffs(0, 28).addBox(-0.5F, -0.0576F, -4.0216F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.3283F, -1.6856F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(24, 31).addBox(-1.0F, -0.0575F, -0.0716F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.3594F, -5.6348F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 41).addBox(-1.0F, -0.0576F, -0.0466F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.64F, -6.3295F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(57, 8).addBox(-1.0F, -0.0576F, 0.0784F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.7558F, -6.9838F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(57, 49).addBox(-1.075F, -0.0576F, -2.0216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -0.8401F, -6.9149F, 1.1903F, 0.1979F, 0.0889F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(15, 74).addBox(-1.075F, -0.0576F, -0.0216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -0.8401F, -6.9149F, 0.9311F, -0.0425F, -0.2752F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(37, 22).addBox(-1.5F, -0.0576F, -2.0216F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.8401F, -6.9149F, 1.1694F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1596F, -0.2236F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(0.0093F, 0.7596F, -1.4252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3791F, 0.1264F, -1.872F, -0.0442F, -0.2792F, 0.0024F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(0.0093F, -0.8196F, -2.2972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0258F)).mirror(false), PartPose.offsetAndRotation(-2.3791F, 0.1264F, -1.872F, 0.5579F, -0.2792F, 0.0024F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(57, 45).mirror().addBox(-0.0313F, -0.9291F, -1.8748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-1.1489F, 2.7991F, -4.7447F, -0.4206F, -0.4666F, -0.11F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-0.0313F, 0.1649F, -1.0822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 0.6264F, -4.172F, 0.199F, -0.4666F, -0.11F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-0.0313F, 0.027F, -0.8383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0255F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 0.6264F, -4.172F, 0.5132F, -0.4666F, -0.11F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-0.0313F, 0.1885F, -2.7659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0252F)).mirror(false)
				.texOffs(20, 74).mirror().addBox(-0.0313F, 0.1885F, -2.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0254F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 0.6264F, -4.172F, -0.0541F, -0.4666F, -0.11F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.0313F, 0.0885F, -1.7731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0254F)).mirror(false)
				.texOffs(56, 37).mirror().addBox(-0.0313F, -0.4115F, -1.9731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.028F)).mirror(false), PartPose.offsetAndRotation(-1.6791F, 0.6264F, -4.172F, 0.4695F, -0.4666F, -0.11F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(69, 73).mirror().addBox(0.0093F, -0.7409F, -2.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-2.3791F, 0.1264F, -1.872F, 0.3397F, -0.2792F, 0.0024F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(34, 56).mirror().addBox(0.0093F, -0.0709F, -1.7638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0243F)).mirror(false), PartPose.offsetAndRotation(-2.3791F, 0.1264F, -1.872F, -0.0704F, -0.2792F, 0.0024F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(-0.4686F, -0.0952F, -1.0852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.9791F, 0.1264F, -0.372F, 1.0559F, -0.0523F, 0.0023F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.4686F, 0.4413F, 0.0472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.9791F, 0.1264F, -0.372F, 0.1396F, -0.0523F, 0.0023F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.4691F, 0.2656F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.9791F, 0.1264F, -0.372F, 1.423F, -0.0473F, -0.0226F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 24).mirror().addBox(-0.4686F, -0.2102F, -1.5612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.9791F, 0.1264F, -0.372F, 0.1134F, -0.0523F, 0.0023F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.4686F, -0.0959F, -0.6762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.028F)).mirror(false), PartPose.offsetAndRotation(-1.9791F, 0.1264F, -0.372F, -0.0786F, -0.0523F, 0.0023F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-0.4686F, 0.5002F, 0.3803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9791F, 0.1264F, -0.372F, -1.2654F, -0.0523F, 0.0023F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 30).addBox(-0.5314F, 0.5002F, 0.3803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9791F, 0.1264F, -0.372F, -1.2654F, 0.0523F, -0.0023F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(57, 4).addBox(-1.0093F, 0.7596F, -1.4252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3791F, 0.1264F, -1.872F, -0.0442F, 0.2792F, -0.0024F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(71, 10).addBox(-1.0093F, -0.8196F, -2.2972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0258F)), PartPose.offsetAndRotation(2.3791F, 0.1264F, -1.872F, 0.5579F, 0.2792F, -0.0024F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(25, 73).addBox(-0.6325F, -0.4556F, -1.2362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F))
				.texOffs(72, 56).addBox(-0.6325F, -0.4556F, -0.5362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0245F)), PartPose.offsetAndRotation(0.1325F, 1.2093F, -6.286F, -0.8634F, 0.0F, 0.0F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(30, 73).addBox(-0.6325F, -0.3649F, 0.2251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.1325F, 1.2093F, -6.286F, -0.6191F, 0.0F, 0.0F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(57, 45).addBox(-0.9687F, -0.9291F, -1.8748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(1.1489F, 2.7991F, -4.7447F, -0.4206F, 0.4666F, 0.11F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 45).addBox(-0.9687F, 0.1649F, -1.0822F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.6791F, 0.6264F, -4.172F, 0.199F, 0.4666F, 0.11F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 49).addBox(-0.9687F, 0.027F, -0.8383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0255F)), PartPose.offsetAndRotation(1.6791F, 0.6264F, -4.172F, 0.5132F, 0.4666F, 0.11F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(74, 41).addBox(-0.9687F, 0.1885F, -2.7659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0252F))
				.texOffs(20, 74).addBox(-0.9687F, 0.1885F, -2.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0254F)), PartPose.offsetAndRotation(1.6791F, 0.6264F, -4.172F, -0.0541F, 0.4666F, 0.11F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(74, 27).addBox(-0.9687F, 0.0885F, -1.7731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0254F))
				.texOffs(56, 37).addBox(-0.9687F, -0.4115F, -1.9731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.028F)), PartPose.offsetAndRotation(1.6791F, 0.6264F, -4.172F, 0.4695F, 0.4666F, 0.11F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 73).addBox(-1.0093F, -0.7409F, -2.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(2.3791F, 0.1264F, -1.872F, 0.3397F, 0.2792F, -0.0024F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(34, 56).addBox(-1.0093F, -0.0709F, -1.7638F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0243F)), PartPose.offsetAndRotation(2.3791F, 0.1264F, -1.872F, -0.0704F, 0.2792F, -0.0024F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(10, 72).addBox(-0.5314F, -0.0952F, -1.0852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.9791F, 0.1264F, -0.372F, 1.0559F, 0.0523F, -0.0023F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(5, 72).addBox(-0.5314F, 0.4413F, 0.0472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.9791F, 0.1264F, -0.372F, 0.1396F, 0.0523F, -0.0023F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5309F, 0.2656F, -0.8822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.9791F, 0.1264F, -0.372F, 1.423F, 0.0473F, 0.0226F));

		PartDefinition cube_r78 = jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 24).addBox(-0.5314F, -0.2102F, -1.5612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.9791F, 0.1264F, -0.372F, 0.1134F, 0.0523F, -0.0023F));

		PartDefinition cube_r79 = jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(76, 6).addBox(-0.5314F, -0.0959F, -0.6762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.028F)), PartPose.offsetAndRotation(1.9791F, 0.1264F, -0.372F, -0.0786F, 0.0523F, -0.0023F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9216F, 2.0855F, -6.0897F, 0.1536F, -0.354F, 0.2246F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(59, 16).addBox(-0.525F, -1.025F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5521F, -4.7193F, 2.4067F, -1.8576F, -0.2956F, -1.8338F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(12, 59).addBox(-0.875F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5521F, -4.7193F, 2.4067F, -1.9485F, 0.7469F, -2.1829F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(76, 47).addBox(-0.1481F, -0.6067F, -1.159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4931F, -4.1133F, 2.746F, -1.846F, 0.9711F, -1.6659F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(75, 59).addBox(-0.5169F, -0.9775F, -0.7217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5825F, -0.5381F, 0.2612F, 1.0322F, 0.5434F, -0.2638F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(76, 50).addBox(-0.1596F, -0.4959F, -1.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4931F, -4.1133F, 2.746F, -2.1455F, 0.9258F, -1.6049F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(75, 62).addBox(-0.5375F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 9).addBox(-0.8125F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2089F, -3.2629F, 1.8484F, -1.0465F, 0.9485F, -0.3052F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(5, 59).addBox(-0.4296F, -0.4959F, -0.7838F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.4931F, -4.1133F, 2.746F, -1.2886F, 1.0176F, -0.5954F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(74, 75).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 65).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.2326F, -3.8328F, 2.9443F, -0.3361F, 0.8714F, -0.497F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(76, 16).addBox(-0.4296F, -0.5962F, 0.1937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4931F, -4.1133F, 2.746F, -1.7686F, 1.0176F, -0.5954F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(50, 7).addBox(-1.6F, -1.95F, -0.375F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4382F, -5.0049F, 7.0075F, -3.0755F, -0.6577F, -0.3921F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(40, 61).addBox(-0.6832F, 0.612F, -1.1328F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9568F, -3.8314F, 6.6296F, -2.9833F, 0.0104F, -0.4896F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 48).addBox(-2.8082F, -1.5925F, -0.5359F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9568F, -3.8314F, 6.6296F, 2.9683F, -0.3397F, -1.3555F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(64, 20).addBox(0.0695F, -4.155F, -0.5359F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(40, 39).addBox(-1.9305F, -1.455F, -0.5359F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.9568F, -3.8314F, 6.6296F, 2.7619F, 0.0066F, -0.2521F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(60, 61).addBox(-0.5551F, -2.0081F, -0.0012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.6498F, -4.6521F, 6.3508F, -2.9093F, -0.1674F, -0.0317F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(46, 33).addBox(-0.5054F, -0.5996F, -0.6539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.6498F, -4.6521F, 6.3508F, 2.3267F, -0.1674F, -0.0317F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(34, 46).addBox(-0.5054F, -0.4996F, -1.1215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6498F, -4.6521F, 6.3508F, -2.6038F, -0.1674F, -0.0317F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(22, 37).addBox(-0.6F, -0.875F, -1.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8533F, -5.0589F, 4.4053F, -2.6706F, 0.0868F, -0.0621F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(39, 65).addBox(-1.2217F, -0.4486F, -1.2373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(55, 61).addBox(-1.2217F, -0.7986F, -1.4373F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3376F, -1.4478F, 0.5284F, -2.319F, 0.8651F, -0.5757F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(41, 57).addBox(-1.8388F, -2.0586F, -0.8301F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.0937F, -4.6075F, 2.3255F, 2.0295F, 0.3904F, -0.3751F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(15, 63).addBox(-1.842F, -0.3875F, -0.9073F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.0937F, -4.6075F, 2.3255F, 1.7539F, 0.3873F, -0.365F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 22).addBox(-1.5F, -0.5F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.358F, -2.1627F, 0.628F, 2.6661F, 0.3763F, -0.3114F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(18, 47).addBox(-1.1717F, -0.1744F, -0.4295F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3376F, -1.4478F, 0.5284F, -2.9298F, 0.8651F, -0.5757F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(31, 39).addBox(-0.7565F, -0.4955F, 0.2244F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.874F, -2.6462F, 1.9641F, -2.5644F, 0.8143F, -0.3036F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 39).addBox(-0.45F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.1068F, -3.1672F, 2.6471F, -2.4487F, 0.7914F, -0.1135F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 44).addBox(-0.557F, -1.8369F, -1.0379F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5825F, -0.5381F, 0.2612F, -0.7857F, 0.5534F, -0.3459F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(49, 38).addBox(-0.5135F, -1.5793F, -0.9573F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5825F, -0.5381F, 0.2612F, -1.8936F, 0.5959F, -0.2213F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(11, 38).addBox(-0.7565F, -0.5131F, -0.0873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.874F, -2.6462F, 1.9641F, -2.4073F, 0.8143F, -0.3036F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9216F, 2.0855F, -6.0897F, 0.1536F, 0.354F, -0.2246F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-0.475F, -1.025F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5521F, -4.7193F, 2.4067F, -1.8576F, 0.2956F, 1.8338F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 59).mirror().addBox(-0.125F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5521F, -4.7193F, 2.4067F, -1.9485F, -0.7469F, 2.1829F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-0.8519F, -0.6067F, -1.159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4931F, -4.1133F, 2.746F, -1.846F, -0.9711F, 1.6659F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(75, 59).mirror().addBox(-0.4831F, -0.9775F, -0.7217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.5825F, -0.5381F, 0.2612F, 1.0322F, -0.5434F, 0.2638F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(76, 50).mirror().addBox(-0.8404F, -0.4959F, -1.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4931F, -4.1133F, 2.746F, -2.1455F, -0.9258F, 1.6049F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(75, 62).mirror().addBox(-0.4625F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 9).mirror().addBox(-0.1875F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2089F, -3.2629F, 1.8484F, -1.0465F, -0.9485F, 0.3052F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(-0.5704F, -0.4959F, -0.7838F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.4931F, -4.1133F, 2.746F, -1.2886F, -1.0176F, 0.5954F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(75, 65).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.2326F, -3.8328F, 2.9443F, -0.3361F, -0.8714F, 0.497F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.5704F, -0.5962F, 0.1937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4931F, -4.1133F, 2.746F, -1.7686F, -1.0176F, 0.5954F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(50, 7).mirror().addBox(-0.4F, -1.95F, -0.375F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4382F, -5.0049F, 7.0075F, -3.0755F, 0.6577F, 0.3921F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-1.3168F, 0.612F, -1.1328F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.9568F, -3.8314F, 6.6296F, -2.9833F, -0.0104F, 0.4896F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(0.8082F, -1.5925F, -0.5359F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9568F, -3.8314F, 6.6296F, 2.9683F, 0.3397F, 1.3555F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-1.0695F, -4.155F, -0.5359F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(40, 39).mirror().addBox(-1.0695F, -1.455F, -0.5359F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.9568F, -3.8314F, 6.6296F, 2.7619F, -0.0066F, 0.2521F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.4449F, -2.0081F, -0.0012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.6498F, -4.6521F, 6.3508F, -2.9093F, 0.1674F, 0.0317F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(46, 33).mirror().addBox(-0.4946F, -0.5996F, -0.6539F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.6498F, -4.6521F, 6.3508F, 2.3267F, 0.1674F, 0.0317F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(34, 46).mirror().addBox(-0.4946F, -0.4996F, -1.1215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6498F, -4.6521F, 6.3508F, -2.6038F, 0.1674F, 0.0317F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-0.4F, -0.875F, -1.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8533F, -5.0589F, 4.4053F, -2.6706F, -0.0868F, 0.0621F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(39, 65).mirror().addBox(0.2217F, -0.4486F, -1.2373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(55, 61).mirror().addBox(0.2217F, -0.7986F, -1.4373F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3376F, -1.4478F, 0.5284F, -2.319F, -0.8651F, 0.5757F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(-0.1612F, -2.0586F, -0.8301F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.0937F, -4.6075F, 2.3255F, 2.0295F, -0.3904F, 0.3751F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(15, 63).mirror().addBox(-0.158F, -0.3875F, -0.9073F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.0937F, -4.6075F, 2.3255F, 1.7539F, -0.3873F, 0.365F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(-0.5F, -0.5F, -0.45F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.358F, -2.1627F, 0.628F, 2.6661F, -0.3763F, 0.3114F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(18, 47).mirror().addBox(0.1717F, -0.1744F, -0.4295F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3376F, -1.4478F, 0.5284F, -2.9298F, -0.8651F, 0.5757F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(31, 39).mirror().addBox(-0.2435F, -0.4955F, 0.2244F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.874F, -2.6462F, 1.9641F, -2.5644F, -0.8143F, 0.3036F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.55F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.1068F, -3.1672F, 2.6471F, -2.4487F, -0.7914F, 0.1135F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.443F, -1.8369F, -1.0379F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.5825F, -0.5381F, 0.2612F, -0.7857F, -0.5534F, 0.3459F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(49, 38).mirror().addBox(-0.4865F, -1.5793F, -0.9573F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.5825F, -0.5381F, 0.2612F, -1.8936F, -0.5959F, 0.2213F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(11, 38).mirror().addBox(-0.2435F, -0.5131F, -0.0873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.874F, -2.6462F, 1.9641F, -2.4073F, -0.8143F, 0.3036F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6206F, 3.8759F, -5.1452F, 0.173F, 0.3589F, -0.1247F));

		PartDefinition cube_r134 = leftTusk.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 41).addBox(-0.502F, -0.8171F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, 0.2096F, -0.0575F, 0.1241F));

		PartDefinition cube_r135 = leftTusk.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 72).addBox(-0.502F, 0.0813F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(72, 31).addBox(-0.502F, -0.2187F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, 0.515F, -0.0575F, 0.1241F));

		PartDefinition cube_r136 = leftTusk.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(71, 16).addBox(-0.502F, -1.8037F, -0.8766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0853F, -0.8681F, 0.4305F, -0.3184F, -0.0575F, 0.1241F));

		PartDefinition cube_r137 = leftTusk.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 63).addBox(-0.502F, -2.6037F, -0.4766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, -0.1002F, -0.0575F, 0.1241F));

		PartDefinition cube_r138 = leftTusk.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(63, 36).addBox(-0.502F, -2.6037F, -0.5016F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0191F, -0.1145F, -0.0467F, 0.1529F, -0.0575F, 0.1241F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6206F, 3.8759F, -5.1452F, 0.173F, -0.3589F, 0.1247F));

		PartDefinition cube_r139 = rightTusk.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-0.498F, -0.8171F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, 0.2096F, 0.0575F, -0.1241F));

		PartDefinition cube_r140 = rightTusk.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(40, 72).mirror().addBox(-0.498F, 0.0813F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(72, 31).mirror().addBox(-0.498F, -0.2187F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, 0.515F, 0.0575F, -0.1241F));

		PartDefinition cube_r141 = rightTusk.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-0.498F, -1.8037F, -0.8766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.0853F, -0.8681F, 0.4305F, -0.3184F, 0.0575F, -0.1241F));

		PartDefinition cube_r142 = rightTusk.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(47, 63).mirror().addBox(-0.498F, -2.6037F, -0.4766F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, -0.1002F, 0.0575F, -0.1241F));

		PartDefinition cube_r143 = rightTusk.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(63, 36).mirror().addBox(-0.498F, -2.6037F, -0.5016F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.0191F, -0.1145F, -0.0467F, 0.1529F, 0.0575F, -0.1241F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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