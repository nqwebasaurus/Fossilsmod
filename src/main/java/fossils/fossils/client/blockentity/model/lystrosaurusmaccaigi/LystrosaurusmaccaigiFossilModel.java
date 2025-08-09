package fossils.fossils.client.blockentity.model.lystrosaurusmaccaigi;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LystrosaurusmaccaigiFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
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
	private final ModelPart bone4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public LystrosaurusmaccaigiFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
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
		this.bone4 = this.chest.getChild("bone4");
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

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.9401F, 10.1712F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 79).addBox(0.0F, -1.5423F, 3.7997F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2376F, -0.7906F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 58).addBox(0.0F, -1.6423F, -0.2003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4465F, 1.0888F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 26).addBox(0.0F, -1.3423F, -0.2003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2376F, -0.7906F, -0.2618F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(17, 8).mirror().addBox(0.5F, -1.6F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 8).addBox(2.5F, -1.6F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 2.6921F, 3.5519F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.0121F, -0.0463F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3981F, -0.9128F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2464F, 3.9825F, 2.619F, 0.0F, 0.0F, 0.1745F));

		PartDefinition basin_r2 = bone.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(78, 67).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -4.4941F, 0.0856F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r3 = bone.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(50, 77).addBox(0.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -4.7782F, -0.8405F, -0.3578F, 0.0F, 0.0F));

		PartDefinition basin_r4 = bone.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(45, 77).addBox(0.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -4.9174F, -1.8308F, -0.1396F, 0.0F, 0.0F));

		PartDefinition basin_r5 = bone.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(78, 75).addBox(0.0F, -0.0176F, -1.0439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7708F, -4.8524F, -2.7969F, 0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(78, 71).addBox(0.0F, -0.1221F, -1.0384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -4.8524F, -1.7969F, 0.1047F, 0.0F, 0.0F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.35F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.2708F, -3.1074F, -1.7537F, -0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2708F, -2.6161F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r9 = bone.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(65, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2708F, -3.2744F, 0.8713F, -0.8639F, 0.0F, 0.0F));

		PartDefinition basin_r10 = bone.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(82, 20).addBox(0.0F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7708F, -4.3869F, -3.7956F, -0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(59, 69).addBox(-0.5F, -0.9F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2708F, -2.7628F, -3.14F, 0.096F, 0.0F, 0.0F));

		PartDefinition basin_r12 = bone.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(82, 17).addBox(-0.5F, -1.0F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2708F, -2.2664F, -3.2362F, -0.3403F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(5, 66).addBox(-0.5F, -1.225F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6805F, 1.4147F, 1.2144F, -1.9845F, -0.0255F, 0.111F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(63, 7).addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6097F, 2.3822F, -0.2281F, -2.3073F, -0.0255F, 0.111F));

		PartDefinition basin_r15 = bone.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(81, 37).addBox(-0.5F, 0.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.566F, 2.5469F, 0.7573F, -1.7401F, -0.0255F, 0.111F));

		PartDefinition basin_r16 = bone.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(70, 80).addBox(-0.5F, 0.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(75, 15).addBox(-0.5F, 0.0F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6245F, 1.6149F, 2.5259F, -1.0856F, -0.0255F, 0.111F));

		PartDefinition basin_r17 = bone.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(61, 18).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7956F, 0.7466F, -0.3668F, -2.2463F, -0.0255F, 0.111F));

		PartDefinition basin_r18 = bone.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(77, 8).addBox(-0.5021F, -0.3274F, -1.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.886F, -0.2268F, 0.3383F, -1.33F, -0.0255F, 0.111F));

		PartDefinition basin_r19 = bone.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(31, 68).addBox(-0.5F, -0.425F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0857F, -1.8691F, -0.3091F, -1.1554F, -0.0255F, 0.111F));

		PartDefinition basin_r20 = bone.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1137F, -1.9495F, -1.0479F, -2.2899F, -0.0255F, 0.111F));

		PartDefinition basin_r21 = bone.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(81, 46).addBox(-0.5F, -0.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -0.6055F, -1.6354F, -0.0255F, 0.111F));

		PartDefinition basin_r22 = bone.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(65, 65).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -0.6055F, -1.4172F, -0.0255F, 0.111F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2464F, 3.9825F, 2.619F, 0.0F, 0.0F, -0.1745F));

		PartDefinition basin_r23 = bone3.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.4941F, 0.0856F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r24 = bone3.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(50, 77).mirror().addBox(-1.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.7782F, -0.8405F, -0.3578F, 0.0F, 0.0F));

		PartDefinition basin_r25 = bone3.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(45, 77).mirror().addBox(-1.0F, -0.05F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.9174F, -1.8308F, -0.1396F, 0.0F, 0.0F));

		PartDefinition basin_r26 = bone3.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(78, 75).mirror().addBox(-1.0F, -0.0176F, -1.0439F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.8524F, -2.7969F, 0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r27 = bone3.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-1.0F, -0.1221F, -1.0384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.8524F, -1.7969F, 0.1047F, 0.0F, 0.0F));

		PartDefinition basin_r28 = bone3.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.5F, -0.35F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -3.1074F, -1.7537F, -0.3752F, 0.0F, 0.0F));

		PartDefinition basin_r29 = bone3.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.5F, -0.45F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -2.6161F, 1.2463F, -1.3788F, 0.0F, 0.0F));

		PartDefinition basin_r30 = bone3.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -3.2744F, 0.8713F, -0.8639F, 0.0F, 0.0F));

		PartDefinition basin_r31 = bone3.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-1.0F, -0.1F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.3869F, -3.7956F, -0.6807F, 0.0F, 0.0F));

		PartDefinition basin_r32 = bone3.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(59, 69).mirror().addBox(-0.5F, -0.9F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -2.7628F, -3.14F, 0.096F, 0.0F, 0.0F));

		PartDefinition basin_r33 = bone3.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(82, 17).mirror().addBox(-0.5F, -1.0F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, -2.2664F, -3.2362F, -0.3403F, 0.0F, 0.0F));

		PartDefinition basin_r34 = bone3.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.5F, -1.225F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, 1.4147F, 1.2144F, -1.9845F, 0.0255F, -0.111F));

		PartDefinition basin_r35 = bone3.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(63, 7).mirror().addBox(-0.5F, 0.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6097F, 2.3822F, -0.2281F, -2.3073F, 0.0255F, -0.111F));

		PartDefinition basin_r36 = bone3.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-0.5F, 0.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.566F, 2.5469F, 0.7573F, -1.7401F, 0.0255F, -0.111F));

		PartDefinition basin_r37 = bone3.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(70, 80).mirror().addBox(-0.5F, 0.6F, -2.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(75, 15).mirror().addBox(-0.5F, 0.0F, -1.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6245F, 1.6149F, 2.5259F, -1.0856F, 0.0255F, -0.111F));

		PartDefinition basin_r38 = bone3.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7956F, 0.7466F, -0.3668F, -2.2463F, 0.0255F, -0.111F));

		PartDefinition basin_r39 = bone3.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(77, 8).mirror().addBox(-0.4979F, -0.3274F, -1.0935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.886F, -0.2268F, 0.3383F, -1.33F, 0.0255F, -0.111F));

		PartDefinition basin_r40 = bone3.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(31, 68).mirror().addBox(-0.5F, -0.425F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0857F, -1.8691F, -0.3091F, -1.1554F, 0.0255F, -0.111F));

		PartDefinition basin_r41 = bone3.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1137F, -1.9495F, -1.0479F, -2.2899F, 0.0255F, -0.111F));

		PartDefinition basin_r42 = bone3.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-0.5F, -0.05F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -0.6055F, -1.6354F, 0.0255F, -0.111F));

		PartDefinition basin_r43 = bone3.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -0.6055F, -1.4172F, 0.0255F, -0.111F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, 2.4F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 4.1612F, 3.4906F, -0.3962F, 0.1228F, -0.9243F));

		PartDefinition upperleg4_r1 = upperleg1.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(76, 41).addBox(-0.5018F, -2.134F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(72, 63).addBox(-0.5018F, -1.659F, -0.1037F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.3F, -1.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg1.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(76, 37).addBox(-0.5018F, -1.984F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, -1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg1.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(63, 73).addBox(-0.5F, -1.875F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 7.2112F, -0.6875F, -0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg1.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(65, 81).addBox(-0.5F, 1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.2F, -0.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2083F, 7.444F, -1.0166F, 0.8808F, -0.5956F, 0.5789F));

		PartDefinition leg3_r1 = leg1.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(0, 75).addBox(-0.3165F, 0.1931F, 0.3245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2488F, -0.1382F, 1.3147F, 0.1794F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(63, 53).addBox(-0.3165F, -3.4286F, 0.1836F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2488F, 0.1673F, 1.3147F, 0.1794F));

		PartDefinition leg1_r1 = leg1.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(54, 48).addBox(-0.3984F, -3.5022F, -1.4302F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.1722F, 0.2488F, 0.0364F, 1.3147F, 0.1794F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.273F, 5.308F, -0.1457F, -0.4646F, 0.3978F, 0.2102F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(41, 19).addBox(-3.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 2.7818F, -0.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(28, 21).addBox(-3.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 1.7818F, -3.018F, -0.0036F, -0.0062F, -0.1214F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(71, 45).addBox(-1.0F, 2.4F, -1.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 4.1612F, 3.4906F, 0.043F, -0.3844F, 0.9131F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(77, 4).addBox(-0.4982F, -2.134F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(10, 73).addBox(-0.4982F, -1.659F, -0.1037F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(73, 76).addBox(-0.4982F, -1.984F, -0.1037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg2.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(73, 72).addBox(-0.5F, -1.875F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 7.2112F, -0.6875F, -0.2007F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg2.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(82, 9).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(82, 6).addBox(-0.5F, 1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.2F, -0.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2083F, 7.444F, -1.0166F, 0.8808F, 0.5956F, -0.5789F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(75, 0).addBox(-0.6835F, 0.1931F, 0.3245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2488F, -0.1382F, -1.3147F, -0.1794F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(12, 64).addBox(-0.6835F, -3.4286F, 0.1836F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2488F, 0.1673F, -1.3147F, -0.1794F));

		PartDefinition leg2_r2 = leg2.addOrReplaceChild("leg2_r2", CubeListBuilder.create().texOffs(0, 55).addBox(-0.6016F, -3.5022F, -1.4302F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.1722F, 0.2488F, 0.0364F, -1.3147F, -0.1794F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.273F, 5.308F, -0.1457F, -0.6392F, -0.3978F, -0.2102F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(9, 42).addBox(0.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 2.7818F, -0.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(24, 28).addBox(0.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7012F, 1.7818F, -3.018F, -0.0036F, 0.0062F, 0.1214F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 45).addBox(-0.5F, 0.022F, 0.0628F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.974F, 4.5227F, 1.177F, -0.1298F, 0.0172F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 53).addBox(0.0F, -1.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 77).addBox(0.0F, -0.2F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4166F, -0.2509F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 84).addBox(-15.0F, 2.0F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 45).addBox(-15.0F, 0.0F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.022F, 1.0628F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(66, 45).addBox(-0.5F, -0.1285F, -0.4852F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0666F, 0.5743F, -0.003F, -0.0226F, 0.2608F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0269F, -0.9128F, -0.0526F, 0.0871F, -0.0046F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 71).addBox(0.0F, -1.5419F, 0.0206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4845F, -1.9557F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 83).addBox(0.0F, -1.469F, 0.0191F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -3.9557F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(31, 39).addBox(0.0F, -1.3954F, 0.0063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5845F, -5.9557F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.3F, 12.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3845F, -17.9557F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.0565F, -0.0454F, -0.6768F));

		PartDefinition neck23_r1 = body2.addOrReplaceChild("neck23_r1", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -1.4969F, 0.072F, -0.008F, -1.2431F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(75, 21).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.1005F, -0.017F, -0.5735F));

		PartDefinition neck22_r2 = body2.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(36, 55).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.0939F, 0.0396F, -1.138F));

		PartDefinition neck23_r2 = body2.addOrReplaceChild("neck23_r2", CubeListBuilder.create().texOffs(28, 26).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0667F, -3.4969F, 0.0685F, 0.0755F, -1.5736F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-1.5622F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.1329F, -0.0033F, -0.5042F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-5.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.114F, 0.0685F, -1.0673F));

		PartDefinition neck22_r3 = body2.addOrReplaceChild("neck22_r3", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-8.6457F, -2.871F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2667F, -5.4969F, 0.0745F, 0.1103F, -1.5034F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(77, 12).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.0565F, 0.0454F, 0.6768F));

		PartDefinition neck22_r4 = body2.addOrReplaceChild("neck22_r4", CubeListBuilder.create().texOffs(19, 58).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -1.4969F, 0.072F, 0.008F, 1.2431F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(75, 21).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.1005F, 0.017F, 0.5735F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(36, 55).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.0939F, -0.0396F, 1.138F));

		PartDefinition neck22_r5 = body2.addOrReplaceChild("neck22_r5", CubeListBuilder.create().texOffs(28, 26).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0667F, -3.4969F, 0.0685F, -0.0755F, 1.5736F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(20, 75).addBox(-0.4378F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.1329F, 0.0033F, 0.5042F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(54, 23).addBox(1.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.114F, -0.0685F, 1.0673F));

		PartDefinition neck21_r5 = body2.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(54, 16).addBox(4.6457F, -2.871F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2667F, -5.4969F, 0.0745F, -0.1103F, 1.5034F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2355F, -5.9618F, 0.0524F, 0.0436F, 0.0023F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(21, 84).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1688F, -5.9579F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 84).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0399F, -3.9593F, -0.0262F, 0.0F, 0.0F));

		PartDefinition neck20_r4 = body3.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(41, 23).mirror().addBox(-9.6724F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4351F, 0.0714F, 0.1018F, -1.4339F));

		PartDefinition neck19_r2 = body3.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(56, 5).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4351F, 0.1077F, 0.0621F, -0.9979F));

		PartDefinition neck18_r1 = body3.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(75, 25).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1937F, -1.4351F, 0.1242F, -0.0053F, -0.4344F));

		PartDefinition neck19_r3 = body3.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(32, 12).mirror().addBox(-9.6724F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4351F, 0.0747F, 0.1365F, -1.4161F));

		PartDefinition neck18_r2 = body3.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(57, 25).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4351F, 0.1254F, 0.0922F, -0.9791F));

		PartDefinition neck17_r1 = body3.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2937F, -3.4351F, 0.1552F, 0.0108F, -0.4169F));

		PartDefinition neck16_r1 = body3.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.1851F, 0.029F, -0.4164F));

		PartDefinition neck17_r2 = body3.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(34, 57).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.1411F, 0.1236F, -0.9776F));

		PartDefinition neck18_r3 = body3.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(43, 6).mirror().addBox(-9.6724F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4937F, -5.4352F, 0.0756F, 0.1715F, -1.4161F));

		PartDefinition neck19_r4 = body3.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(41, 23).addBox(4.6725F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4351F, 0.0714F, -0.1018F, 1.4339F));

		PartDefinition neck18_r4 = body3.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(56, 5).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4351F, 0.1077F, -0.0621F, 0.9979F));

		PartDefinition neck17_r3 = body3.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(75, 25).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1937F, -1.4351F, 0.1242F, 0.0053F, 0.4344F));

		PartDefinition neck18_r5 = body3.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(32, 12).addBox(4.6725F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4351F, 0.0747F, -0.1365F, 1.4161F));

		PartDefinition neck17_r4 = body3.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(57, 25).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4351F, 0.1254F, -0.0922F, 0.9791F));

		PartDefinition neck16_r2 = body3.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(75, 23).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2937F, -3.4351F, 0.1552F, -0.0108F, 0.4169F));

		PartDefinition neck15_r1 = body3.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(75, 56).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.1851F, -0.029F, 0.4164F));

		PartDefinition neck16_r3 = body3.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(34, 57).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.1411F, -0.1236F, 0.9776F));

		PartDefinition neck17_r5 = body3.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(43, 6).addBox(4.6725F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4937F, -5.4352F, 0.0756F, -0.1715F, 1.4161F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 84).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2097F, -1.962F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.951F, -6.6189F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 84).addBox(0.0F, -1.7693F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5433F, -1.2467F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(5, 84).addBox(0.0F, -1.9693F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0952F, -3.1677F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(9, 37).addBox(0.0F, -2.1693F, -0.1104F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1796F, -5.0916F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, 0.0019F, 2.1302F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.3F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck19_r5 = chest.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(66, 63).mirror().addBox(-5.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.086F, 0.2757F, -1.5186F));

		PartDefinition neck18_r6 = chest.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(23, 56).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.1956F, 0.2134F, -1.0732F));

		PartDefinition neck17_r6 = chest.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.2784F, 0.0766F, -0.5163F));

		PartDefinition neck18_r7 = chest.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(41, 73).mirror().addBox(-6.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.0835F, 0.2409F, -1.4844F));

		PartDefinition neck17_r7 = chest.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(30, 19).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.1781F, 0.183F, -1.0418F));

		PartDefinition neck16_r4 = chest.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(71, 31).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.2477F, 0.0599F, -0.4835F));

		PartDefinition neck15_r2 = chest.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(41, 75).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.217F, 0.0431F, -0.4501F));

		PartDefinition neck17_r8 = chest.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.0811F, 0.206F, -1.45F));

		PartDefinition neck16_r5 = chest.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(12, 56).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.1608F, 0.1525F, -1.0097F));

		PartDefinition neck18_r8 = chest.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(66, 63).addBox(4.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.086F, -0.2757F, 1.5186F));

		PartDefinition neck17_r9 = chest.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(23, 56).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.1956F, -0.2134F, 1.0732F));

		PartDefinition neck16_r6 = chest.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(75, 50).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.2784F, -0.0766F, 0.5163F));

		PartDefinition neck17_r10 = chest.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(41, 73).addBox(4.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.0835F, -0.2409F, 1.4844F));

		PartDefinition neck16_r7 = chest.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(30, 19).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.1781F, -0.183F, 1.0418F));

		PartDefinition neck15_r3 = chest.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(71, 31).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.2477F, -0.0599F, 0.4835F));

		PartDefinition neck14_r1 = chest.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(41, 75).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.217F, -0.0431F, 0.4501F));

		PartDefinition neck16_r8 = chest.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(57, 27).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.0811F, -0.206F, 1.45F));

		PartDefinition neck15_r4 = chest.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(12, 56).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.1608F, -0.1525F, 1.0097F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(19, 60).addBox(-0.3797F, -0.0885F, -1.2806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2551F, 4.7223F, -4.4872F, 0.9556F, 0.2676F, -0.8463F));

		PartDefinition upperarm4_r1 = upperarm1.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(38, 68).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, -0.6545F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarm1.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(36, 64).addBox(-0.5F, -1.1F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, 0.9163F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarm1.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(52, 18).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm6_r1 = upperarm1.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(73, 59).addBox(-0.5F, -0.725F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2535F, -1.2654F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarm1.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(52, 60).addBox(-0.5F, -2.2F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2535F, 2.8798F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarm1.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(58, 73).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1203F, 0.3875F, -1.2535F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm3_r2 = upperarm1.addOrReplaceChild("upperarm3_r2", CubeListBuilder.create().texOffs(31, 72).addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 0.9115F, -0.7806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6795F, 4.7465F, -0.4007F, -0.7754F, -0.3884F, 1.5228F));

		PartDefinition lowerarm3_r1 = lowerarm1.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(64, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8955F, -0.2335F, -0.2897F, 0.0791F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(62, 33).addBox(-0.5F, -1.75F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1779F, 1.0197F, -0.3384F, -0.3572F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r2 = lowerarm1.addOrReplaceChild("lowerarm2_r2", CubeListBuilder.create().texOffs(48, 73).addBox(0.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3115F, 2.0518F, -0.2838F, -0.2961F, 1.2533F, -0.2064F));

		PartDefinition lowerarm1_r1 = lowerarm1.addOrReplaceChild("lowerarm1_r1", CubeListBuilder.create().texOffs(5, 77).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3239F, 4.1855F, -0.6257F, -0.2001F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0518F, 4.4716F, -1.0283F, 0.956F, 0.9896F, 0.1577F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(30, 14).addBox(0.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.446F, 2.8811F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(9, 46).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(82, 62).addBox(0.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(10, 70).addBox(3.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(24, 60).addBox(-0.6203F, -0.0885F, -1.2806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2551F, 4.7223F, -4.4872F, -0.417F, 0.0397F, 0.8486F));

		PartDefinition upperarm5_r2 = upperarm2.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(69, 41).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, -0.6545F, 0.0F, 0.0F));

		PartDefinition upperarm5_r3 = upperarm2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(58, 65).addBox(-0.5F, -1.1F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, 0.9163F, 0.0F, 0.0F));

		PartDefinition upperarm4_r4 = upperarm2.addOrReplaceChild("upperarm4_r4", CubeListBuilder.create().texOffs(53, 34).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperarm7_r1 = upperarm2.addOrReplaceChild("upperarm7_r1", CubeListBuilder.create().texOffs(73, 68).addBox(-0.5F, -0.725F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2535F, -1.2654F, 0.0F, 0.0F));

		PartDefinition upperarm6_r2 = upperarm2.addOrReplaceChild("upperarm6_r2", CubeListBuilder.create().texOffs(59, 60).addBox(-0.5F, -2.2F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2535F, 2.8798F, 0.0F, 0.0F));

		PartDefinition upperarm5_r4 = upperarm2.addOrReplaceChild("upperarm5_r4", CubeListBuilder.create().texOffs(68, 73).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.1203F, 0.3875F, -1.2535F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm4_r5 = upperarm2.addOrReplaceChild("upperarm4_r5", CubeListBuilder.create().texOffs(36, 72).addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1203F, 0.9115F, -0.7806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6795F, 4.7465F, -0.4007F, -0.3467F, 0.941F, -1.1426F));

		PartDefinition lowerarm4_r1 = lowerarm2.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(51, 65).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8955F, -0.2335F, -0.2897F, 0.0791F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r2 = lowerarm2.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -1.75F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1779F, 1.0197F, -0.3384F, -0.3572F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r3 = lowerarm2.addOrReplaceChild("lowerarm3_r3", CubeListBuilder.create().texOffs(53, 73).addBox(-1.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3115F, 2.0518F, -0.2838F, -0.2961F, -1.2533F, 0.2064F));

		PartDefinition lowerarm2_r3 = lowerarm2.addOrReplaceChild("lowerarm2_r3", CubeListBuilder.create().texOffs(20, 77).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3239F, 4.1855F, -0.6257F, -0.2001F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0518F, 4.4716F, -1.0283F, 1.0753F, -0.9358F, -0.0374F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-3.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.446F, 2.8811F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(46, 25).addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4807F, 1.6517F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(75, 82).addBox(-1.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r4 = hand2.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(71, 28).addBox(-5.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.0F, 14.4834F, -3.2304F));

		PartDefinition chest_r1 = bone2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(44, 63).addBox(0.1559F, -1.3089F, 1.2978F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2716F, -7.3193F, -2.9703F, 1.1669F, 0.0F, -0.2568F));

		PartDefinition chest_r2 = bone2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(5, 72).addBox(-1.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2038F, -9.7844F, -3.8104F, 1.0956F, -0.0216F, -0.1155F));

		PartDefinition chest_r3 = bone2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(30, 77).addBox(-0.4658F, -1.864F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2038F, -10.3844F, -3.8104F, -1.5574F, -1.0213F, 1.846F));

		PartDefinition chest_r4 = bone2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(25, 77).addBox(-0.3148F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2038F, -9.7844F, -3.8104F, 1.492F, -1.3739F, -0.858F));

		PartDefinition chest_r5 = bone2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(20, 45).addBox(-0.5F, -1.7F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.1967F, -13.2784F, -1.1323F, 1.7657F, 0.0122F, -0.3769F));

		PartDefinition chest_r6 = bone2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(74, 33).addBox(-1.4225F, -0.0301F, -0.7124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1967F, -15.7784F, -1.3323F, 1.4167F, 0.0122F, -0.3769F));

		PartDefinition chest_r7 = bone2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(45, 12).addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1967F, -13.2784F, -1.1323F, 1.024F, 0.0122F, -0.3769F));

		PartDefinition chest_r8 = bone2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(0, 50).addBox(-0.6708F, 0.3783F, 0.031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5056F, -10.2266F, -3.0568F, 1.6029F, 0.1321F, -0.1741F));

		PartDefinition chest_r9 = bone2.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(15, 74).addBox(-0.6708F, -0.3373F, 0.2066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5056F, -10.2266F, -3.0568F, 0.7309F, 0.1166F, -0.1848F));

		PartDefinition chest_r10 = bone2.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(18, 51).addBox(-0.6708F, 0.6757F, 0.229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5056F, -10.2266F, -3.0568F, 1.4291F, 0.1166F, -0.1848F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.0F, 14.4834F, -3.2304F));

		PartDefinition chest_r11 = bone4.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(44, 63).mirror().addBox(-2.1559F, -1.3089F, 1.2978F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2716F, -7.3193F, -2.9703F, 1.1669F, 0.0F, 0.2568F));

		PartDefinition chest_r12 = bone4.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(0.4242F, 0.1175F, -0.6619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2038F, -9.7844F, -3.8104F, 1.0956F, 0.0216F, 0.1155F));

		PartDefinition chest_r13 = bone4.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.5342F, -1.864F, -0.5099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2038F, -10.3844F, -3.8104F, -1.5574F, 1.0213F, -1.846F));

		PartDefinition chest_r14 = bone4.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(-0.6851F, -0.7616F, -0.081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2038F, -9.7844F, -3.8104F, 1.492F, 1.3739F, 0.858F));

		PartDefinition chest_r15 = bone4.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(20, 45).mirror().addBox(-0.5F, -1.7F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -13.2784F, -1.1323F, 1.7657F, -0.0122F, 0.3769F));

		PartDefinition chest_r16 = bone4.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(74, 33).mirror().addBox(0.4225F, -0.0301F, -0.7124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -15.7784F, -1.3323F, 1.4167F, -0.0122F, 0.3769F));

		PartDefinition chest_r17 = bone4.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(45, 12).mirror().addBox(-0.5F, -1.4F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.1967F, -13.2784F, -1.1323F, 1.024F, -0.0122F, 0.3769F));

		PartDefinition chest_r18 = bone4.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.3292F, 0.3783F, 0.031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5056F, -10.2266F, -3.0568F, 1.6029F, -0.1321F, 0.1741F));

		PartDefinition chest_r19 = bone4.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.3292F, -0.3373F, 0.2066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5056F, -10.2266F, -3.0568F, 0.7309F, -0.1166F, 0.1848F));

		PartDefinition chest_r20 = bone4.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(18, 51).mirror().addBox(-0.3292F, 0.6757F, 0.229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5056F, -10.2266F, -3.0568F, 1.4291F, -0.1166F, 0.1848F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -5.075F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r19 = neck2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(15, 83).addBox(0.0F, -1.9693F, -0.0854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1173F, -1.9608F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r20 = neck2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(83, 67).addBox(0.0F, -1.9693F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r21 = neck2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(24, 33).addBox(-0.5F, 0.0052F, 1.0067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition neck19_r6 = neck2.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(75, 54).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8927F, -3.3412F, 0.6264F, 0.3294F, -0.7833F));

		PartDefinition neck20_r5 = neck2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(82, 65).mirror().addBox(-2.6386F, -0.9872F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8927F, -3.3412F, 0.3663F, 0.6076F, -1.3421F));

		PartDefinition neck19_r7 = neck2.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-3.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.4272F, 0.6738F, -1.1505F));

		PartDefinition neck18_r9 = neck2.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(75, 52).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.7076F, 0.36F, -0.6007F));

		PartDefinition neck18_r10 = neck2.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(75, 54).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8927F, -3.3412F, 0.6264F, -0.3294F, 0.7833F));

		PartDefinition neck19_r8 = neck2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(82, 65).addBox(1.6386F, -0.9872F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8927F, -3.3412F, 0.3663F, -0.6076F, 1.3421F));

		PartDefinition neck18_r11 = neck2.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(75, 19).addBox(1.6386F, -0.9872F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.4272F, -0.6738F, 1.1505F));

		PartDefinition neck17_r11 = neck2.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(75, 52).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.7076F, -0.36F, 0.6007F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5953F, -3.5292F, -0.1888F, 0.206F, 0.1358F));

		PartDefinition cube_r22 = neck.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(83, 75).addBox(0.0F, -2.378F, -0.3611F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -1.8665F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r23 = neck.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(53, 39).addBox(-0.5F, -0.1214F, 0.8322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck20_r6 = neck.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-2.1124F, 0.1478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0025F, -1.812F, 0.7371F, 0.6383F, -0.8069F));

		PartDefinition neck19_r9 = neck.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(10, 78).addBox(0.1124F, 0.1478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0025F, -1.812F, 0.7371F, -0.6383F, 0.8069F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3791F, -3.1525F, 0.354F, 0.1639F, 0.0602F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 38).addBox(-0.5F, -1.9701F, -2.9871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.8779F, -6.4049F, -3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -0.9726F, -6.0204F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.3587F, -4.1746F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(66, 69).addBox(-1.0F, -1.9726F, -0.1204F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.0361F, -5.0148F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(24, 72).addBox(-1.0F, -0.9726F, -0.0204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.2395F, -5.4716F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(35, 81).addBox(-0.5F, 0.0274F, -0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.8011F, -6.3704F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(30, 81).addBox(-0.5F, -1.0099F, -0.0454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.2774F, -2.5418F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, -1.225F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9997F, -3.8639F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 51).addBox(-0.5F, -0.75F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9997F, -3.8639F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 16).addBox(-0.5F, -0.7F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.142F, -3.5339F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -0.9F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.446F, -1.8113F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(13, 35).addBox(-0.5F, -1.9599F, -2.9494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9815F, -4.3371F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 56).addBox(-1.0F, -0.625F, -3.2966F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.0381F, -0.3608F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(29, 64).addBox(-1.0F, -0.825F, -0.1966F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.0381F, -0.3608F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -0.825F, -2.4966F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.0381F, -0.3608F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(43, 8).addBox(-1.0F, 2.7F, 0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.0F, -0.3F, -0.2F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2084F, -5.984F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 58).addBox(-0.5F, -1.05F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.716F, -4.8992F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(27, 51).addBox(-0.5F, -0.825F, -2.825F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.018F, -5.7824F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(10, 83).addBox(0.0F, -1.125F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(32, 6).addBox(-0.5F, -0.8F, 0.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.8697F, -3.4346F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(66, 59).addBox(-1.0F, 0.5361F, 0.0733F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.0381F, -0.3608F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0601F, -0.3267F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r43 = jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(52, 69).mirror().addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.4809F, 0.8974F, -2.5686F, 0.6221F, -0.3781F, -0.0386F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(17, 71).mirror().addBox(-0.3922F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(70, 12).mirror().addBox(-0.3922F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6078F, 0.7604F, -5.2055F, -0.8292F, 0.0F, 0.0F));

		PartDefinition cube_r45 = jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(-0.5F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7179F, 1.4847F, -4.6571F, -0.8273F, -0.3235F, -0.0346F));

		PartDefinition cube_r46 = jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 81).mirror().addBox(-0.5F, -0.375F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8669F, 1.7096F, -4.1897F, -0.6528F, -0.3235F, -0.0346F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(82, 23).mirror().addBox(-0.4943F, 0.3426F, -0.1013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-0.9147F, 1.0816F, -4.2115F, 0.2267F, -0.3161F, -0.0779F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(55, 81).mirror().addBox(-0.4943F, 0.5493F, -0.4122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-0.9147F, 1.0816F, -4.2115F, 1.0557F, -0.3161F, -0.0779F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(-0.5F, -0.725F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9122F, 1.0956F, -4.1978F, 0.0522F, -0.3161F, -0.0779F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.4943F, -0.5137F, -0.2038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-0.9147F, 1.0816F, -4.2115F, 0.5321F, -0.3161F, -0.0779F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(17, 67).mirror().addBox(-0.4126F, -0.5355F, 0.6515F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-0.9147F, 1.0816F, -4.2115F, 0.4476F, -0.3781F, -0.0386F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7426F, 0.411F, -0.4676F, -1.7453F, -0.0524F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, -0.85F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6898F, 0.7522F, -1.4745F, -0.829F, -0.0524F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(-0.5F, -0.775F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.6701F, 1.216F, -1.8514F, -1.8937F, -0.0524F, 0.0F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-0.5F, 0.4F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(78, 79).mirror().addBox(-0.5F, -0.4F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.3736F, 0.6275F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.6919F, -0.7839F, -1.4347F, 0.2967F, -0.0524F, 0.0F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.7424F, -0.7736F, -0.471F, 0.6632F, -0.0524F, 0.0F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(52, 69).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.4809F, 0.8974F, -2.5686F, 0.6221F, 0.3781F, 0.0386F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 3).addBox(-0.5F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7179F, 1.4847F, -4.6571F, -0.8273F, 0.3235F, 0.0346F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(60, 81).addBox(-0.5F, -0.375F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8669F, 1.7096F, -4.1897F, -0.6528F, 0.3235F, 0.0346F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(82, 23).addBox(-0.5057F, 0.3426F, -0.1013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.9147F, 1.0816F, -4.2115F, 0.2267F, 0.3161F, 0.0779F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(55, 81).addBox(-0.5057F, 0.5493F, -0.4122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.9147F, 1.0816F, -4.2115F, 1.0557F, 0.3161F, 0.0779F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(67, 33).addBox(-0.5F, -0.725F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9122F, 1.0956F, -4.1978F, 0.0522F, 0.3161F, 0.0779F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5057F, -0.5137F, -0.2038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(0.9147F, 1.0816F, -4.2115F, 0.5321F, 0.3161F, 0.0779F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(17, 67).addBox(-0.5874F, -0.5355F, 0.6515F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(0.9147F, 1.0816F, -4.2115F, 0.4476F, 0.3781F, 0.0386F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7426F, 0.411F, -0.4676F, -1.7453F, 0.0524F, 0.0F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -0.85F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6898F, 0.7522F, -1.4745F, -0.829F, 0.0524F, 0.0F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(80, 82).addBox(-0.5F, -0.775F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.6701F, 1.216F, -1.8514F, -1.8937F, 0.0524F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(20, 81).addBox(-0.5F, 0.4F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(78, 79).addBox(-0.5F, -0.4F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.8F, -0.3736F, 0.6275F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.6919F, -0.7839F, -1.4347F, 0.2967F, 0.0524F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(80, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.7424F, -0.7736F, -0.471F, 0.6632F, 0.0524F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8122F, -4.679F, -0.781F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(70, 8).addBox(-0.5F, -0.8203F, -1.6348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.576F, 1.2143F, -2.3455F, -0.3539F, -0.4799F, 0.7853F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(40, 81).addBox(-0.5695F, -0.8757F, -0.1753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2536F, 2.1949F, -5.2069F, -0.7812F, -1.2394F, -0.176F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(55, 77).addBox(-0.5695F, -1.6228F, -0.9406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2536F, 2.1949F, -5.2069F, -1.3048F, -1.2394F, -0.176F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(78, 27).addBox(-0.5F, -1.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5731F, 1.6205F, -5.4771F, -2.3743F, -1.1342F, 0.9251F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(79, 31).addBox(-0.4712F, -0.0855F, -1.128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2536F, 2.1949F, -5.2069F, -1.7588F, -0.2832F, 0.4508F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(43, 0).addBox(0.3F, -1.9701F, -2.9871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(44, 44).addBox(0.0F, -1.9701F, -2.9871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3122F, 6.5569F, -5.6239F, -3.0967F, -0.6802F, -0.0283F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(79, 34).addBox(0.0F, 0.0274F, -0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.51F, 8.6983F, -5.0636F, 1.2287F, -1.3093F, 0.3524F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(45, 81).addBox(0.0F, 0.0274F, -0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3122F, 8.4801F, -5.5894F, 1.2283F, -0.5537F, 0.2594F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(37, 26).addBox(0.3F, 0.0401F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(35, 38).addBox(0.0F, 0.0401F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3122F, 6.5074F, -5.6807F, 1.5162F, -0.6451F, 0.0329F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(10, 80).addBox(-0.5233F, -0.3137F, -1.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7457F, 0.8857F, -4.3968F, -0.4062F, -0.2832F, 0.3809F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(15, 80).addBox(-0.5F, -0.7978F, -0.5343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7217F, 1.3736F, -5.3944F, -0.4062F, -0.2832F, 0.6253F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(9, 50).addBox(-0.4727F, -0.4086F, -0.8266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.2536F, 2.1949F, -5.2069F, -1.1595F, -0.2314F, 0.4693F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(29, 45).addBox(-0.775F, -0.925F, -0.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1551F, 1.2646F, -5.0782F, -0.2952F, 0.024F, 1.4448F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 4).addBox(-0.775F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1551F, 1.2646F, -5.0782F, -1.4296F, 0.024F, 1.4448F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 55).addBox(-0.6F, 0.1F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8288F, 0.9736F, -4.5152F, -1.3468F, -0.2332F, 0.6725F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(77, 63).addBox(-0.5108F, -1.8372F, -0.5882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7457F, 0.8857F, -4.3968F, -1.8627F, -0.0662F, 0.3767F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(82, 52).addBox(-0.5108F, -0.3569F, -0.5402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7457F, 0.8857F, -4.3968F, -1.3468F, -0.2332F, 0.4281F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(35, 77).addBox(-0.5F, -0.8463F, -0.2133F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.576F, 1.2143F, -2.3455F, -0.5721F, -0.4799F, 0.7853F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(47, 50).addBox(-0.55F, -1.1F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.7178F, 4.4818F, 1.2859F, 2.9611F, 0.9162F, 0.1055F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(68, 24).addBox(-0.5F, -0.975F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.7178F, 4.4818F, 1.2859F, -2.3008F, 0.8302F, 0.1287F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 55).addBox(-0.5096F, -1.3337F, -0.6302F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.289F, 3.176F, 1.6914F, -2.1928F, 0.8689F, 0.0982F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(59, 48).addBox(-0.5096F, -1.4161F, -1.5636F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.289F, 3.176F, 1.6914F, -1.5819F, 0.8689F, 0.0982F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(13, 28).addBox(-0.5096F, 1.1634F, -1.3211F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.289F, 3.301F, 1.6914F, 3.0869F, 0.8689F, 0.0982F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 44).addBox(-2.0292F, -0.8309F, -1.85F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(3.7988F, 0.2627F, 0.9402F, -3.1016F, -0.5758F, -0.2229F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(54, 12).addBox(-1.8437F, -0.7559F, -1.7655F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(3.5499F, 0.6584F, -0.6943F, -2.9302F, 0.1452F, -0.2162F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(54, 8).addBox(-1.8644F, -0.2315F, -0.4186F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.6171F, 1.2141F, -0.6752F, -2.559F, 0.4528F, -0.1182F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(63, 12).addBox(-1.0F, -0.725F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.1671F, 2.2364F, -2.0435F, -2.3646F, 0.426F, -0.1254F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(63, 12).addBox(-0.75F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 12).addBox(-0.2F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.1671F, 2.2364F, -2.0435F, -2.2768F, 0.5752F, 0.0564F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(24, 68).addBox(-0.4907F, -0.8011F, -0.7635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0715F, 4.2979F, -3.1019F, -1.7273F, 0.2244F, 0.3386F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(68, 20).addBox(-0.4907F, -0.3031F, -0.731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.0715F, 4.2979F, -3.1019F, -1.8582F, 0.2244F, 0.3386F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(15, 21).addBox(-1.0F, -1.375F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0777F, 6.7483F, -4.2666F, -1.7188F, -0.1443F, -3.1109F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(35, 33).addBox(-0.4F, -0.6F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8369F, 3.9202F, -4.9192F, -1.6581F, -0.1105F, -2.9025F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 69).addBox(-0.175F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2017F, 3.9894F, -4.2035F, -2.3348F, -0.1391F, -2.94F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 44).addBox(-0.4821F, -0.447F, -1.4376F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0715F, 4.2979F, -3.1019F, -2.2793F, 0.276F, 0.3997F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(62, 40).addBox(-0.1733F, -1.178F, -1.5898F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1077F, 3.246F, -3.1665F, -2.1101F, 0.196F, 0.7497F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 37).addBox(-0.95F, -0.0599F, -2.9494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6378F, 3.6146F, -5.4543F, 1.5387F, 0.0143F, 0.3663F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(46, 34).addBox(-0.3098F, -0.2508F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3149F, 0.7095F, -2.1118F, -1.6215F, 0.0026F, -0.3396F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5437F, -0.1597F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3149F, 0.7095F, -2.1118F, -1.4734F, 0.0431F, -0.7303F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(5, 61).addBox(-0.5F, -1.075F, -1.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.106F)), PartPose.offsetAndRotation(0.9591F, 2.2286F, -3.8058F, -0.8041F, 0.1366F, 0.1485F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(61, 0).addBox(-0.7594F, -0.9482F, -0.6772F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.2157F, 2.2202F, -3.8734F, 0.1995F, 0.1366F, 0.1485F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(37, 59).addBox(-0.1394F, -1.1185F, -1.0038F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(46, 29).addBox(-0.9194F, -1.1185F, -1.0038F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(1.1157F, 2.2202F, -3.8734F, 0.6794F, 0.1366F, 0.1485F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(55, 29).addBox(-1.05F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.339F, 4.4463F, -4.7543F, 1.5417F, 0.136F, 0.2378F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(30, 59).addBox(0.0F, -0.171F, -0.8043F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.125F, 0.0F, 0.1405F, 0.2829F, 0.4714F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(22, 39).addBox(-0.4F, -0.171F, -2.5043F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.125F, 0.0F, 0.1445F, -0.3655F, 0.38F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8122F, -4.679F, -0.781F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 8).mirror().addBox(-0.5F, -0.8203F, -1.6348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.576F, 1.2143F, -2.3455F, -0.3539F, 0.4799F, -0.7853F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.4305F, -0.8757F, -0.1753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2536F, 2.1949F, -5.2069F, -0.7812F, 1.2394F, 0.176F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(55, 77).mirror().addBox(-0.4305F, -1.6228F, -0.9406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2536F, 2.1949F, -5.2069F, -1.3048F, 1.2394F, 0.176F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 27).mirror().addBox(-0.5F, -1.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5731F, 1.6205F, -5.4771F, -2.3743F, 1.1342F, -0.9251F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 31).mirror().addBox(-0.5288F, -0.0855F, -1.128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2536F, 2.1949F, -5.2069F, -1.7588F, 0.2832F, -0.4508F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-1.3F, -1.9701F, -2.9871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(44, 44).mirror().addBox(-1.0F, -1.9701F, -2.9871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3122F, 6.5569F, -5.6239F, -3.0967F, 0.6802F, 0.0283F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-1.0F, 0.0274F, -0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.51F, 8.6983F, -5.0636F, 1.2287F, 1.3093F, -0.3524F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-1.0F, 0.0274F, -0.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3122F, 8.4801F, -5.5894F, 1.2283F, 0.5537F, -0.2594F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(37, 26).mirror().addBox(-1.3F, 0.0401F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(35, 38).mirror().addBox(-1.0F, 0.0401F, -0.0494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3122F, 6.5074F, -5.6807F, 1.5162F, 0.6451F, -0.0329F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.4767F, -0.3137F, -1.3207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7457F, 0.8857F, -4.3968F, -0.4062F, 0.2832F, -0.3809F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.5F, -0.7978F, -0.5343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7217F, 1.3736F, -5.3944F, -0.4062F, 0.2832F, -0.6253F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(9, 50).mirror().addBox(-0.5273F, -0.4086F, -0.8266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.2536F, 2.1949F, -5.2069F, -1.1595F, 0.2314F, -0.4693F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(29, 45).mirror().addBox(-0.225F, -0.925F, -0.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1551F, 1.2646F, -5.0782F, -0.2952F, -0.024F, -1.4448F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-0.225F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1551F, 1.2646F, -5.0782F, -1.4296F, -0.024F, -1.4448F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(-0.4F, 0.1F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8288F, 0.9736F, -4.5152F, -1.3468F, 0.2332F, -0.6725F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-0.4892F, -1.8372F, -0.5882F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7457F, 0.8857F, -4.3968F, -1.8627F, 0.0662F, -0.3767F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(-0.4892F, -0.3569F, -0.5402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7457F, 0.8857F, -4.3968F, -1.3468F, 0.2332F, -0.4281F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.5F, -0.8463F, -0.2133F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.576F, 1.2143F, -2.3455F, -0.5721F, 0.4799F, -0.7853F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(47, 50).mirror().addBox(-0.45F, -1.1F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.7178F, 4.4818F, 1.2859F, 2.9611F, -0.9162F, -0.1055F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(68, 24).mirror().addBox(-0.5F, -0.975F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.7178F, 4.4818F, 1.2859F, -2.3008F, -0.8302F, -0.1287F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-0.4904F, -1.3337F, -0.6302F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.289F, 3.176F, 1.6914F, -2.1928F, -0.8689F, -0.0982F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.4904F, -1.4161F, -1.5636F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.289F, 3.176F, 1.6914F, -1.5819F, -0.8689F, -0.0982F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(13, 28).mirror().addBox(-0.4904F, 1.1634F, -1.3211F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.289F, 3.301F, 1.6914F, 3.0869F, -0.8689F, -0.0982F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(0.0292F, -0.8309F, -1.85F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-3.7988F, 0.2627F, 0.9402F, -3.1016F, 0.5758F, 0.2229F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-0.1563F, -0.7559F, -1.7655F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-3.5499F, 0.6584F, -0.6943F, -2.9302F, -0.1452F, 0.2162F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-0.1356F, -0.2315F, -0.4186F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.6171F, 1.2141F, -0.6752F, -2.559F, -0.4528F, 0.1182F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(0.0F, -0.725F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.1671F, 2.2364F, -2.0435F, -2.3646F, -0.426F, 0.1254F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-0.25F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(63, 12).mirror().addBox(-0.8F, -0.725F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.1671F, 2.2364F, -2.0435F, -2.2768F, -0.5752F, -0.0564F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(24, 68).mirror().addBox(-0.5093F, -0.8011F, -0.7635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0715F, 4.2979F, -3.1019F, -1.7273F, -0.2244F, -0.3386F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(68, 20).mirror().addBox(-0.5093F, -0.3031F, -0.731F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.0715F, 4.2979F, -3.1019F, -1.8582F, -0.2244F, -0.3386F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(15, 21).mirror().addBox(-1.0F, -1.375F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0777F, 6.7483F, -4.2666F, -1.7188F, 0.1443F, 3.1109F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 33).mirror().addBox(-1.6F, -0.6F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, 3.9202F, -4.9192F, -1.6581F, 0.1105F, 2.9025F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.825F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2017F, 3.9894F, -4.2035F, -2.3348F, 0.1391F, 2.94F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.5179F, -0.447F, -1.4376F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0715F, 4.2979F, -3.1019F, -2.2793F, -0.276F, -0.3997F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(62, 40).mirror().addBox(-0.8267F, -1.178F, -1.5898F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1077F, 3.246F, -3.1665F, -2.1101F, -0.196F, -0.7497F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.05F, -0.0599F, -2.9494F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6378F, 3.6146F, -5.4543F, 1.5387F, -0.0143F, -0.3663F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(46, 34).mirror().addBox(-0.6902F, -0.2508F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3149F, 0.7095F, -2.1118F, -1.6215F, -0.0026F, 0.3396F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.4563F, -0.1597F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3149F, 0.7095F, -2.1118F, -1.4734F, -0.0431F, 0.7303F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.5F, -1.075F, -1.225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.106F)).mirror(false), PartPose.offsetAndRotation(-0.9591F, 2.2286F, -3.8058F, -0.8041F, -0.1366F, -0.1485F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.2406F, -0.9482F, -0.6772F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2157F, 2.2202F, -3.8734F, 0.1995F, -0.1366F, -0.1485F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(37, 59).mirror().addBox(-0.8606F, -1.1185F, -1.0038F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(46, 29).mirror().addBox(-1.0806F, -1.1185F, -1.0038F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-1.1157F, 2.2202F, -3.8734F, 0.6794F, -0.1366F, -0.1485F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 29).mirror().addBox(-0.95F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.339F, 4.4463F, -4.7543F, 1.5417F, -0.136F, -0.2378F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-1.0F, -0.171F, -0.8043F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.125F, 0.0F, 0.1405F, -0.2829F, -0.4714F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(22, 39).mirror().addBox(-0.6F, -0.171F, -2.5043F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.125F, 0.0F, 0.1445F, 0.3655F, -0.38F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5676F, 1.2078F, -3.9985F, -0.036F, 0.1228F, -0.1659F));

		PartDefinition cube_r160 = leftTusk.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(76, 45).addBox(-0.502F, -0.8171F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.6633F, 3.7051F, 0.3467F, 0.2096F, -0.0575F, 0.1241F));

		PartDefinition cube_r161 = leftTusk.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(81, 43).addBox(-0.502F, 0.0813F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(81, 40).addBox(-0.502F, -0.2187F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.6633F, 3.7051F, 0.3467F, 0.515F, -0.0575F, 0.1241F));

		PartDefinition cube_r162 = leftTusk.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(60, 77).addBox(-0.502F, -1.6037F, -0.5016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6633F, 3.7051F, 0.3467F, 0.166F, -0.0575F, 0.1241F));

		PartDefinition cube_r163 = leftTusk.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(12, 58).addBox(-1.5F, -2.0F, -0.625F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.1654F, 1.1168F, 0.4529F, 0.0793F, -0.0465F, 0.1286F));

		PartDefinition cube_r164 = leftTusk.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(69, 37).addBox(-1.5F, -0.5F, -0.775F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2081F, -1.744F, 0.3775F, 0.0737F, -0.0998F, 0.1552F));

		PartDefinition cube_r165 = leftTusk.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(68, 55).addBox(-1.5F, -1.9F, -0.125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.1027F, -0.4546F, -0.9287F, -0.4007F, -0.0465F, 0.1286F));

		PartDefinition cube_r166 = leftTusk.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(45, 57).addBox(-1.5F, -2.0F, 0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1266F, 1.3892F, -1.1232F, 0.1665F, -0.0465F, 0.1286F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5676F, 1.2078F, -3.9985F, -0.036F, -0.1228F, 0.1659F));

		PartDefinition cube_r167 = rightTusk.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(76, 45).mirror().addBox(-0.498F, -0.8171F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.6633F, 3.7051F, 0.3467F, 0.2096F, 0.0575F, -0.1241F));

		PartDefinition cube_r168 = rightTusk.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.498F, 0.0813F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 40).mirror().addBox(-0.498F, -0.2187F, -0.6506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.6633F, 3.7051F, 0.3467F, 0.515F, 0.0575F, -0.1241F));

		PartDefinition cube_r169 = rightTusk.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.498F, -1.6037F, -0.5016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6633F, 3.7051F, 0.3467F, 0.166F, 0.0575F, -0.1241F));

		PartDefinition cube_r170 = rightTusk.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(12, 58).mirror().addBox(-0.5F, -2.0F, -0.625F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.1654F, 1.1168F, 0.4529F, 0.0793F, 0.0465F, -0.1286F));

		PartDefinition cube_r171 = rightTusk.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(69, 37).mirror().addBox(-0.5F, -0.5F, -0.775F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2081F, -1.744F, 0.3775F, 0.0737F, 0.0998F, -0.1552F));

		PartDefinition cube_r172 = rightTusk.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-0.5F, -1.9F, -0.125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.1027F, -0.4546F, -0.9287F, -0.4007F, 0.0465F, -0.1286F));

		PartDefinition cube_r173 = rightTusk.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(45, 57).mirror().addBox(-0.5F, -2.0F, 0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1266F, 1.3892F, -1.1232F, 0.1665F, 0.0465F, -0.1286F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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