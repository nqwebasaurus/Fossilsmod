package fossils.fossils.client.blockentity.model.lufengosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LufengosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart upperlegL;
	private final ModelPart lowerlegL;
	private final ModelPart feetL;
	private final ModelPart toesL;
	private final ModelPart upperlegL2;
	private final ModelPart lowerlegL2;
	private final ModelPart feetL2;
	private final ModelPart toesL2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart jaw2;
	private final ModelPart upperarmL;
	private final ModelPart lowerarmL;
	private final ModelPart handL;
	private final ModelPart thumbclawL;
	private final ModelPart upperarmL2;
	private final ModelPart lowerarmL2;
	private final ModelPart handL2;
	private final ModelPart thumbclawL2;

	public LufengosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.upperlegL = this.basin.getChild("upperlegL");
		this.lowerlegL = this.upperlegL.getChild("lowerlegL");
		this.feetL = this.lowerlegL.getChild("feetL");
		this.toesL = this.feetL.getChild("toesL");
		this.upperlegL2 = this.basin.getChild("upperlegL2");
		this.lowerlegL2 = this.upperlegL2.getChild("lowerlegL2");
		this.feetL2 = this.lowerlegL2.getChild("feetL2");
		this.toesL2 = this.feetL2.getChild("toesL2");
		this.body = this.basin.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head2 = this.neck4.getChild("head2");
		this.bone3 = this.head2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.jaw2 = this.head2.getChild("jaw2");
		this.upperarmL = this.chest.getChild("upperarmL");
		this.lowerarmL = this.upperarmL.getChild("lowerarmL");
		this.handL = this.lowerarmL.getChild("handL");
		this.thumbclawL = this.handL.getChild("thumbclawL");
		this.upperarmL2 = this.chest.getChild("upperarmL2");
		this.lowerarmL2 = this.upperarmL2.getChild("lowerarmL2");
		this.handL2 = this.lowerarmL2.getChild("handL2");
		this.thumbclawL2 = this.handL2.getChild("thumbclawL2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, 6.6F, -0.0456F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(1.2848F, 5.7772F, -2.6592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8599F, 4.977F, -7.9544F, -0.1436F, 0.0F, -0.1745F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-0.5173F, -0.4251F, -0.2881F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8599F, 4.977F, -7.9544F, -0.4617F, 0.0114F, -0.4723F));

		PartDefinition basin_r3 = basin.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-0.594F, 2.5772F, -2.2359F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.496F, 5.1542F, -0.7278F, 0.4887F, 0.0F, -0.3491F));

		PartDefinition basin_r4 = basin.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(51, 68).mirror().addBox(-0.594F, -2.6307F, -2.624F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.496F, 5.1542F, -0.7278F, 0.6807F, 0.0F, -0.3491F));

		PartDefinition basin_r5 = basin.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(33, 61).mirror().addBox(-0.7F, 0.8302F, -2.555F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.6348F, -3.0996F, 0.1745F, 0.0F, -0.1222F));

		PartDefinition basin_r6 = basin.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.7F, 2.2764F, -4.7745F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.6348F, -3.0996F, -0.0873F, 0.0F, -0.1222F));

		PartDefinition basin_r7 = basin.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.7F, 1.0037F, -1.5275F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.6348F, -3.0996F, -0.9163F, 0.0F, -0.1222F));

		PartDefinition basin_r8 = basin.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(69, 78).mirror().addBox(-0.5F, 0.2372F, -3.123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6F, -2.0171F, -3.5211F, -0.2182F, 0.1222F, 0.0F));

		PartDefinition basin_r9 = basin.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-0.5F, -0.6388F, -1.8104F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6F, -2.0171F, -3.5211F, -0.0873F, 0.1222F, 0.0F));

		PartDefinition basin_r10 = basin.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(15, 36).mirror().addBox(-0.7F, -1.7498F, -1.9503F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.6348F, -3.0996F, -0.4363F, 0.0F, -0.1222F));

		PartDefinition basin_r11 = basin.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-0.5F, -1.1389F, -3.1304F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, -2.0171F, -3.5211F, 0.2182F, 0.1222F, 0.0F));

		PartDefinition basin_r12 = basin.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(66, 45).mirror().addBox(-0.5F, -1.1711F, -0.4048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(66, 45).addBox(6.7F, -1.1711F, -0.4048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.6F, -2.0966F, -2.5569F, -0.0611F, 0.0F, 0.0F));

		PartDefinition basin_r13 = basin.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(9, 11).mirror().addBox(-0.5F, -0.9737F, 0.1924F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5966F, -2.5569F, -0.0873F, -0.1222F, 0.0F));

		PartDefinition basin_r14 = basin.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(73, 42).mirror().addBox(-0.5F, -2.1671F, 0.7781F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -1.5966F, -2.5569F, -0.48F, -0.1222F, 0.0F));

		PartDefinition basin_r15 = basin.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-3.2F, -0.2F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 0).addBox(0.2F, -0.2F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5F, -6.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r16 = basin.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(45, 73).addBox(-0.4827F, -0.4251F, -0.2881F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8599F, 4.977F, -7.9544F, -0.4617F, -0.0114F, 0.4723F));

		PartDefinition basin_r17 = basin.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(77, 69).addBox(-2.2848F, 5.7772F, -2.6592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8599F, 4.977F, -7.9544F, -0.1436F, 0.0F, 0.1745F));

		PartDefinition basin_r18 = basin.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(33, 61).addBox(-0.3F, 0.8302F, -2.555F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -0.6348F, -3.0996F, 0.1745F, 0.0F, 0.1222F));

		PartDefinition basin_r19 = basin.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(72, 48).addBox(-0.406F, 2.5772F, -2.2359F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.496F, 5.1542F, -0.7278F, 0.4887F, 0.0F, 0.3491F));

		PartDefinition basin_r20 = basin.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(51, 68).addBox(-0.406F, -2.6307F, -2.624F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.496F, 5.1542F, -0.7278F, 0.6807F, 0.0F, 0.3491F));

		PartDefinition basin_r21 = basin.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(39, 0).addBox(-0.3F, 2.2764F, -4.7745F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -0.6348F, -3.0996F, -0.0873F, 0.0F, 0.1222F));

		PartDefinition basin_r22 = basin.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, 1.0037F, -1.5275F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.4F, -0.6348F, -3.0996F, -0.9163F, 0.0F, 0.1222F));

		PartDefinition basin_r23 = basin.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(15, 36).addBox(-0.3F, -1.7498F, -1.9503F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.4F, -0.6348F, -3.0996F, -0.4363F, 0.0F, 0.1222F));

		PartDefinition basin_r24 = basin.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(73, 42).addBox(-0.5F, -2.1671F, 0.7781F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -1.5966F, -2.5569F, -0.48F, 0.1222F, 0.0F));

		PartDefinition basin_r25 = basin.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(69, 78).addBox(-0.5F, 0.2372F, -3.123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.6F, -2.0171F, -3.5211F, -0.2182F, -0.1222F, 0.0F));

		PartDefinition basin_r26 = basin.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(65, 53).addBox(-0.5F, -1.1389F, -3.1304F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, -2.0171F, -3.5211F, 0.2182F, -0.1222F, 0.0F));

		PartDefinition basin_r27 = basin.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(9, 11).addBox(-0.5F, -0.9737F, 0.1924F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.4F, -1.5966F, -2.5569F, -0.0873F, 0.1222F, 0.0F));

		PartDefinition basin_r28 = basin.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(36, 73).addBox(-0.5F, -0.6388F, -1.8104F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6F, -2.0171F, -3.5211F, -0.0873F, -0.1222F, 0.0F));

		PartDefinition cube_r1 = basin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 81).addBox(0.0F, -1.3F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 81).addBox(0.0F, -1.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.571F, -0.6653F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = basin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 61).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4934F, -2.6738F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r3 = basin.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(39, 0).addBox(0.0F, -1.2F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5727F, -18.6749F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, 1.6F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(31, 24).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8323F, -0.1374F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = tail1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 82).addBox(0.0F, -4.4F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 82).addBox(0.0F, -3.7F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 43).addBox(0.0F, -3.2F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 69).addBox(0.0F, -2.6F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 81).addBox(0.0F, -2.0F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 81).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.74F, 1.7237F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 70).addBox(0.0F, -2.0F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7782F, 0.2346F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(65, 80).addBox(0.0F, -1.0639F, 3.3414F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 80).addBox(0.0F, -1.4639F, 1.3414F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 80).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2233F, 8.3389F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 36).addBox(0.0F, -1.745F, 1.3762F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 38).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2808F, 4.3281F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 80).addBox(0.0F, -2.5F, -0.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0884F, 2.496F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7323F, 12.3626F, 0.0435F, 0.0872F, -0.0038F));

		PartDefinition tail2_r1 = tail2.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5F, -0.2155F, -0.0348F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9137F, -0.6388F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 83).addBox(0.0F, -8.5F, 20.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 58).addBox(0.0F, -7.9F, 19.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 62).addBox(0.0F, -7.3F, 17.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 66).addBox(0.0F, -6.7F, 15.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 82).addBox(0.0F, -6.0F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 81).addBox(0.0F, -5.2F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0077F, -10.6388F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 82).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2333F, 12.2837F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 82).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3899F, 10.2015F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 82).addBox(0.0F, 1.5361F, 11.3414F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 82).addBox(0.0F, 0.9361F, 9.3414F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 75).addBox(0.0F, 0.4361F, 7.3414F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 80).addBox(0.0F, -0.7639F, 5.3414F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9556F, -4.0237F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 12.7F, 0.0437F, -0.1308F, -0.0133F));

		PartDefinition tail3_r1 = tail3.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 0.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 61).addBox(0.0F, -2.05F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 61).addBox(0.0F, -1.65F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 68).addBox(0.0F, -1.25F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 70).addBox(0.0F, -0.75F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 82).addBox(0.0F, -0.35F, -3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 33).addBox(0.0F, 0.15F, -5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1143F, 6.119F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(14, 71).addBox(0.0F, 2.8F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 16).addBox(0.0F, 2.1F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 44).addBox(0.0F, 1.4F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 82).addBox(0.0F, 0.8F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 50).addBox(0.0F, -0.6F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 81).addBox(0.0F, -1.1F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6333F, -0.4163F, 0.2443F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.5815F, 0.1755F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.6F, 12.2F, -0.219F, -0.0852F, 0.0189F));

		PartDefinition cube_r15 = tail4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 11).addBox(0.0F, 2.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 11).addBox(0.0F, 2.1F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 36).addBox(0.0F, 1.3F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 45).addBox(0.0F, 0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 66).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6246F, 1.9597F, 0.4625F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.2967F, -0.181F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2815F, 11.2755F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create().texOffs(13, 61).addBox(-1.5F, -0.6F, -1.3679F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(46, 23).addBox(-0.7F, 3.4F, -0.3679F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 1.1F, -4.2F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperlegL.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(30, 39).addBox(-1.5F, 0.0F, -0.1F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -1.2679F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create().texOffs(0, 36).addBox(-1.1F, -0.225F, -0.6989F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(9, 70).addBox(-0.6F, 0.775F, 1.5011F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 12.8F, 1.0321F, 1.216F, 0.0F, 0.0F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create().texOffs(0, 66).addBox(-0.3F, 1.7F, -2.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 8.375F, 3.2011F, -0.81F, 0.0F, 0.0F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create().texOffs(46, 13).addBox(-1.3F, 0.6742F, -5.0256F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4F, -2.5F, 0.2276F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create().texOffs(33, 22).addBox(-0.5F, -0.6F, -1.3679F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(11, 0).addBox(-0.3F, 3.4F, -0.3679F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 1.1F, -4.2F, -0.5236F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperlegL2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.0F, -0.1F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -1.2679F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create().texOffs(22, 0).addBox(-0.9F, -0.225F, -0.6989F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(31, 0).addBox(-0.4F, 0.775F, 1.5011F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 12.8F, 1.0321F, 1.1723F, 0.0F, 0.0F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create().texOffs(62, 11).addBox(-1.7F, 1.7F, -2.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 8.375F, 3.2011F, -0.81F, 0.0F, 0.0F));

		PartDefinition toesL2 = feetL2.addOrReplaceChild("toesL2", CubeListBuilder.create().texOffs(43, 39).addBox(-2.7F, 0.6742F, -5.0256F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4F, -2.5F, 0.2276F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, -2.9F, -20.0F, 1.0F, 2.0F, 19.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.1F, -0.1F, -5.1F, 0.0457F, 0.0872F, 0.004F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(40, 22).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -1.5F, 0.0129F, 0.0006F, -1.0555F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(11, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -1.5F, 0.0122F, -0.0044F, -0.6628F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -3.5F, 0.087F, 0.0405F, -0.5393F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(21, 36).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -3.5F, 0.065F, 0.0707F, -0.9315F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-5.9466F, -2.9173F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -5.5F, 0.0341F, 0.1264F, -1.3417F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -5.5F, 0.0887F, 0.0964F, -0.8597F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(8, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -5.5F, 0.1188F, 0.0552F, -0.468F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(39, 9).mirror().addBox(-7.9466F, -2.9173F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -7.5F, 0.0526F, 0.1938F, -1.3213F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -7.5F, 0.1823F, 0.0844F, -0.4461F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -7.5F, 0.1366F, 0.1475F, -0.8364F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(22, 12).mirror().addBox(-8.9466F, -2.9173F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -9.5F, 0.0741F, 0.2695F, -1.2989F));

		PartDefinition body_r12 = body.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(75, 61).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -9.5F, 0.1914F, 0.2046F, -0.8093F));

		PartDefinition body_r13 = body.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -9.5F, 0.2543F, 0.1168F, -0.4214F));

		PartDefinition body_r14 = body.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -11.5F, 0.2864F, 0.131F, -0.3825F));

		PartDefinition body_r15 = body.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(77, 23).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -11.5F, 0.2161F, 0.2298F, -0.7691F));

		PartDefinition body_r16 = body.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-9.9466F, -2.9173F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -11.5F, 0.0839F, 0.3031F, -1.2613F));

		PartDefinition body_r17 = body.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(59, 43).mirror().addBox(-10.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -13.5F, 0.0939F, 0.3367F, -1.2581F));

		PartDefinition body_r18 = body.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(78, 1).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -13.5F, 0.2411F, 0.2549F, -0.7631F));

		PartDefinition body_r19 = body.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(79, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -13.5F, 0.3186F, 0.1451F, -0.3781F));

		PartDefinition body_r20 = body.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -15.5F, 0.3591F, 0.1624F, -0.3544F));

		PartDefinition body_r21 = body.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -15.5F, 0.2729F, 0.286F, -0.7371F));

		PartDefinition body_r22 = body.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-11.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -15.5F, 0.1068F, 0.3786F, -1.2362F));

		PartDefinition body_r23 = body.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(22, 16).mirror().addBox(-12.9466F, -2.9173F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -17.5F, 0.1201F, 0.4205F, -1.2484F));

		PartDefinition body_r24 = body.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -17.5F, 0.3052F, 0.3169F, -0.745F));

		PartDefinition body_r25 = body.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.4F, -17.5F, 0.3999F, 0.1796F, -0.3649F));

		PartDefinition body_r26 = body.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(80, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.3F, -19.5F, 0.4408F, 0.1964F, -0.3922F));

		PartDefinition body_r27 = body.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.3F, -19.5F, 0.3382F, 0.3474F, -0.7691F));

		PartDefinition body_r28 = body.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(46, 34).mirror().addBox(-12.9466F, -2.9173F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.3F, -19.5F, 0.1339F, 0.4623F, -1.2774F));

		PartDefinition body_r29 = body.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(40, 22).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -1.5F, 0.0129F, -0.0006F, 1.0555F));

		PartDefinition body_r30 = body.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(11, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -1.5F, 0.0122F, 0.0044F, 0.6628F));

		PartDefinition body_r31 = body.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(46, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -3.5F, 0.087F, -0.0405F, 0.5393F));

		PartDefinition body_r32 = body.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(21, 36).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -3.5F, 0.065F, -0.0707F, 0.9315F));

		PartDefinition body_r33 = body.addOrReplaceChild("body_r33", CubeListBuilder.create().texOffs(8, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -5.5F, 0.1188F, -0.0552F, 0.468F));

		PartDefinition body_r34 = body.addOrReplaceChild("body_r34", CubeListBuilder.create().texOffs(68, 4).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -5.5F, 0.0887F, -0.0964F, 0.8597F));

		PartDefinition body_r35 = body.addOrReplaceChild("body_r35", CubeListBuilder.create().texOffs(0, 56).addBox(3.9466F, -2.9173F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -5.5F, 0.0341F, -0.1264F, 1.3417F));

		PartDefinition body_r36 = body.addOrReplaceChild("body_r36", CubeListBuilder.create().texOffs(65, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -7.5F, 0.1823F, -0.0844F, 0.4461F));

		PartDefinition body_r37 = body.addOrReplaceChild("body_r37", CubeListBuilder.create().texOffs(72, 54).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -7.5F, 0.1366F, -0.1475F, 0.8364F));

		PartDefinition body_r38 = body.addOrReplaceChild("body_r38", CubeListBuilder.create().texOffs(39, 9).addBox(3.9466F, -2.9173F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -7.5F, 0.0526F, -0.1938F, 1.3213F));

		PartDefinition body_r39 = body.addOrReplaceChild("body_r39", CubeListBuilder.create().texOffs(75, 61).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -9.5F, 0.1914F, -0.2046F, 0.8093F));

		PartDefinition body_r40 = body.addOrReplaceChild("body_r40", CubeListBuilder.create().texOffs(65, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -9.5F, 0.2543F, -0.1168F, 0.4214F));

		PartDefinition body_r41 = body.addOrReplaceChild("body_r41", CubeListBuilder.create().texOffs(22, 12).addBox(3.9466F, -2.9173F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -9.5F, 0.0741F, -0.2695F, 1.2989F));

		PartDefinition body_r42 = body.addOrReplaceChild("body_r42", CubeListBuilder.create().texOffs(19, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -11.5F, 0.2864F, -0.131F, 0.3825F));

		PartDefinition body_r43 = body.addOrReplaceChild("body_r43", CubeListBuilder.create().texOffs(77, 23).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -11.5F, 0.2161F, -0.2298F, 0.7691F));

		PartDefinition body_r44 = body.addOrReplaceChild("body_r44", CubeListBuilder.create().texOffs(64, 0).addBox(3.9466F, -2.9173F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -11.5F, 0.0839F, -0.3031F, 1.2613F));

		PartDefinition body_r45 = body.addOrReplaceChild("body_r45", CubeListBuilder.create().texOffs(79, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -13.5F, 0.3186F, -0.1451F, 0.3781F));

		PartDefinition body_r46 = body.addOrReplaceChild("body_r46", CubeListBuilder.create().texOffs(78, 1).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -13.5F, 0.2411F, -0.2549F, 0.7631F));

		PartDefinition body_r47 = body.addOrReplaceChild("body_r47", CubeListBuilder.create().texOffs(59, 43).addBox(3.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -13.5F, 0.0939F, -0.3367F, 1.2581F));

		PartDefinition body_r48 = body.addOrReplaceChild("body_r48", CubeListBuilder.create().texOffs(78, 9).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -15.5F, 0.2729F, -0.286F, 0.7371F));

		PartDefinition body_r49 = body.addOrReplaceChild("body_r49", CubeListBuilder.create().texOffs(79, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -15.5F, 0.3591F, -0.1624F, 0.3544F));

		PartDefinition body_r50 = body.addOrReplaceChild("body_r50", CubeListBuilder.create().texOffs(53, 6).addBox(3.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -15.5F, 0.1068F, -0.3786F, 1.2362F));

		PartDefinition body_r51 = body.addOrReplaceChild("body_r51", CubeListBuilder.create().texOffs(22, 16).addBox(3.9466F, -2.9173F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -17.5F, 0.1201F, -0.4205F, 1.2484F));

		PartDefinition body_r52 = body.addOrReplaceChild("body_r52", CubeListBuilder.create().texOffs(79, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -17.5F, 0.3999F, -0.1796F, 0.3649F));

		PartDefinition body_r53 = body.addOrReplaceChild("body_r53", CubeListBuilder.create().texOffs(78, 48).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4F, -17.5F, 0.3052F, -0.3169F, 0.745F));

		PartDefinition body_r54 = body.addOrReplaceChild("body_r54", CubeListBuilder.create().texOffs(46, 34).addBox(3.9466F, -2.9173F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.3F, -19.5F, 0.1339F, -0.4623F, 1.2774F));

		PartDefinition body_r55 = body.addOrReplaceChild("body_r55", CubeListBuilder.create().texOffs(79, 37).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.3F, -19.5F, 0.3382F, -0.3474F, 0.7691F));

		PartDefinition body_r56 = body.addOrReplaceChild("body_r56", CubeListBuilder.create().texOffs(80, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.3F, -19.5F, 0.4408F, -0.1964F, 0.3922F));

		PartDefinition body_r57 = body.addOrReplaceChild("body_r57", CubeListBuilder.create().texOffs(0, 22).addBox(-5.5F, -2.8F, -5.7F, 11.0F, 3.0F, 10.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, 10.6F, -11.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(81, 29).addBox(0.0F, -1.8F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 0).addBox(0.0F, -1.1F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 0).addBox(0.0F, -1.3F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 51).addBox(0.0F, -1.4F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 81).addBox(0.0F, -1.7F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 81).addBox(0.0F, -1.8F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 81).addBox(0.0F, -1.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.4727F, -13.5749F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(43, 81).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.9202F, -15.5873F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 19).addBox(0.0F, -1.3F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 27).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.3419F, -19.5566F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -19.0F, 0.0437F, 0.0436F, 0.0019F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(30, 39).mirror().addBox(-0.9F, 0.2353F, -0.5201F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 8.4821F, -2.7763F, 0.1828F, -0.5941F, -0.3435F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.9F, 0.2353F, -0.2201F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 8.4821F, -2.7763F, 0.3841F, -0.7808F, -0.4419F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.9F, 0.2353F, -0.5201F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 8.4821F, -2.7763F, 0.3304F, -0.6748F, -0.3875F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(67, 15).mirror().addBox(-0.9F, 0.2353F, 0.2799F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 8.4821F, -2.7763F, 0.9683F, -0.9972F, -0.8084F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(60, 64).mirror().addBox(-1.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 26).mirror().addBox(-2.5F, -0.5F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 26).addBox(0.5F, -0.5F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(60, 64).addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 7.6741F, -4.5717F, -0.6458F, 0.0F, 0.0F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(67, 27).mirror().addBox(-0.4F, -2.3406F, -2.7236F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 3.6556F, -5.465F, 0.967F, -0.4446F, -0.5576F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(22, 61).mirror().addBox(-0.5F, -0.5F, -2.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 52).mirror().addBox(-0.5F, -1.0F, 1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 52).addBox(8.3F, -1.0F, 1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 61).addBox(8.3F, -0.5F, -2.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 0.9556F, -4.165F, 0.8378F, 0.0F, 0.0F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(67, 27).addBox(-0.6F, -2.3406F, -2.7236F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 3.6556F, -5.465F, 0.967F, 0.4446F, 0.5576F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(30, 39).addBox(-0.1F, 0.2353F, -0.5201F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 8.4821F, -2.7763F, 0.1828F, 0.5941F, 0.3435F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(0, 50).addBox(-0.1F, 0.2353F, -0.5201F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 8.4821F, -2.7763F, 0.3304F, 0.6748F, 0.3875F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(0, 11).addBox(-0.1F, 0.2353F, -0.2201F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 8.4821F, -2.7763F, 0.3841F, 0.7808F, 0.4419F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(67, 15).addBox(-0.1F, 0.2353F, 0.2799F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 8.4821F, -2.7763F, 0.9683F, 0.9972F, 0.8084F));

		PartDefinition chest_r13 = chest.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(46, 23).addBox(-0.5F, -0.3F, 0.6F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, -1.5F, -8.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body_r58 = chest.addOrReplaceChild("body_r58", CubeListBuilder.create().texOffs(56, 49).mirror().addBox(-11.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.6F, -2.8F, 0.1333F, 0.4625F, -1.3126F));

		PartDefinition body_r59 = chest.addOrReplaceChild("body_r59", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.6F, -2.8F, 0.3377F, 0.3478F, -0.8042F));

		PartDefinition body_r60 = chest.addOrReplaceChild("body_r60", CubeListBuilder.create().texOffs(80, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.6F, -2.8F, 0.4406F, 0.197F, -0.4271F));

		PartDefinition body_r61 = chest.addOrReplaceChild("body_r61", CubeListBuilder.create().texOffs(80, 11).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5F, -4.8F, 0.4884F, 0.2203F, -0.4696F));

		PartDefinition body_r62 = chest.addOrReplaceChild("body_r62", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5F, -4.8F, 0.3752F, 0.3867F, -0.8431F));

		PartDefinition body_r63 = chest.addOrReplaceChild("body_r63", CubeListBuilder.create().texOffs(53, 8).mirror().addBox(-11.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5F, -4.8F, 0.1462F, 0.5135F, -1.3589F));

		PartDefinition body_r64 = chest.addOrReplaceChild("body_r64", CubeListBuilder.create().texOffs(46, 59).mirror().addBox(-10.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.3F, -6.9F, 0.1534F, 0.5388F, -1.4078F));

		PartDefinition body_r65 = chest.addOrReplaceChild("body_r65", CubeListBuilder.create().texOffs(62, 78).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.3F, -6.9F, 0.3946F, 0.4056F, -0.8881F));

		PartDefinition body_r66 = chest.addOrReplaceChild("body_r66", CubeListBuilder.create().texOffs(80, 5).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.3F, -6.9F, 0.5126F, 0.2314F, -0.5167F));

		PartDefinition body_r67 = chest.addOrReplaceChild("body_r67", CubeListBuilder.create().texOffs(80, 5).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.3F, -6.9F, 0.5126F, -0.2314F, 0.5167F));

		PartDefinition body_r68 = chest.addOrReplaceChild("body_r68", CubeListBuilder.create().texOffs(62, 78).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.3F, -6.9F, 0.3946F, -0.4056F, 0.8881F));

		PartDefinition body_r69 = chest.addOrReplaceChild("body_r69", CubeListBuilder.create().texOffs(46, 59).addBox(3.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.3F, -6.9F, 0.1534F, -0.5388F, 1.4078F));

		PartDefinition body_r70 = chest.addOrReplaceChild("body_r70", CubeListBuilder.create().texOffs(80, 11).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.5F, -4.8F, 0.4884F, -0.2203F, 0.4696F));

		PartDefinition body_r71 = chest.addOrReplaceChild("body_r71", CubeListBuilder.create().texOffs(0, 79).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.5F, -4.8F, 0.3752F, -0.3867F, 0.8431F));

		PartDefinition body_r72 = chest.addOrReplaceChild("body_r72", CubeListBuilder.create().texOffs(53, 8).addBox(3.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.5F, -4.8F, 0.1462F, -0.5135F, 1.3589F));

		PartDefinition body_r73 = chest.addOrReplaceChild("body_r73", CubeListBuilder.create().texOffs(80, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.6F, -2.8F, 0.4406F, -0.197F, 0.4271F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(84, 50).addBox(0.0F, -1.0F, -1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.2507F, -2.223F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(84, 79).addBox(0.0F, -0.7F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 85).addBox(0.0F, -0.7F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.3674F, -9.2285F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body_r74 = chest.addOrReplaceChild("body_r74", CubeListBuilder.create().texOffs(35, 79).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.6F, -2.8F, 0.3377F, -0.3478F, 0.8042F));

		PartDefinition body_r75 = chest.addOrReplaceChild("body_r75", CubeListBuilder.create().texOffs(56, 49).addBox(3.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.6F, -2.8F, 0.1333F, -0.4625F, 1.3126F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(45, 49).addBox(-0.5F, -0.3096F, -7.8748F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.5F, -8.1F, -0.2903F, 0.1255F, -0.0374F));

		PartDefinition body_r76 = neck1.addOrReplaceChild("body_r76", CubeListBuilder.create().texOffs(64, 2).mirror().addBox(-7.8478F, -0.7654F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -1.0F, 0.3523F, 0.9255F, -0.9039F));

		PartDefinition body_r77 = neck1.addOrReplaceChild("body_r77", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -1.0F, 0.7224F, 0.7191F, -0.4062F));

		PartDefinition neck4_r1 = neck1.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(42, 61).mirror().addBox(0.5F, -0.5564F, -0.0981F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5725F, -4.7329F, -0.2122F, -0.3241F, 0.0716F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(53, 61).mirror().addBox(0.5F, -0.5564F, -0.0981F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6904F, -7.5748F, -0.2214F, -0.1704F, 0.0381F));

		PartDefinition neck3_r2 = neck1.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(42, 61).addBox(-0.5F, -0.5564F, -0.0981F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5725F, -4.7329F, -0.2122F, 0.3241F, -0.0716F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(53, 61).addBox(-0.5F, -0.5564F, -0.0981F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6904F, -7.5748F, -0.2214F, 0.1704F, -0.0381F));

		PartDefinition cube_r21 = neck1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 11).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8674F, -1.1285F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r22 = neck1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(47, 50).addBox(0.0F, -1.0F, 8.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 59).addBox(0.0F, -1.0F, 5.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8716F, -12.8302F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body_r78 = neck1.addOrReplaceChild("body_r78", CubeListBuilder.create().texOffs(80, 3).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, 0.7224F, -0.7191F, 0.4062F));

		PartDefinition body_r79 = neck1.addOrReplaceChild("body_r79", CubeListBuilder.create().texOffs(64, 2).addBox(1.8478F, -0.7654F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.0F, 0.3523F, -0.9255F, 0.9039F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(29, 52).addBox(-0.5F, -0.6073F, -7.0099F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.3404F, -7.0748F, -0.1797F, 0.1016F, 0.0702F));

		PartDefinition neck8_r1 = neck2.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(59, 57).mirror().addBox(-0.0039F, -0.5282F, -0.0103F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4796F, -3.7474F, -0.1081F, -0.216F, 0.0308F));

		PartDefinition neck7_r1 = neck2.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(0.0079F, -0.4444F, 0.0429F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3279F, -6.0249F, -0.143F, -0.216F, 0.0308F));

		PartDefinition neck7_r2 = neck2.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(59, 57).addBox(0.0039F, -0.5282F, -0.0103F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4796F, -3.7474F, -0.1081F, 0.216F, -0.0308F));

		PartDefinition cube_r23 = neck2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(22, 52).addBox(0.0F, -1.1F, 2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 52).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0193F, -5.5153F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck6_r1 = neck2.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(69, 6).addBox(-0.0079F, -0.4444F, 0.0429F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3279F, -6.0249F, -0.143F, 0.216F, -0.0308F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(12, 52).addBox(-0.5F, -0.3231F, -6.98F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(57, 23).addBox(0.0F, -1.4351F, -3.0854F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3073F, -6.5599F, 0.1138F, 0.1688F, 0.0624F));

		PartDefinition neck6_r2 = neck3.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-0.0124F, -0.4508F, -0.0488F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5265F, -2.7244F, -0.143F, -0.216F, 0.0308F));

		PartDefinition neck5_r1 = neck3.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(0.0F, -0.586F, -0.0094F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6726F, -5.7573F, -0.1418F, -0.1728F, 0.0245F));

		PartDefinition neck5_r2 = neck3.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(58, 70).addBox(0.0124F, -0.4508F, -0.0488F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5265F, -2.7244F, -0.143F, 0.216F, -0.0308F));

		PartDefinition neck4_r2 = neck3.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(14, 71).addBox(0.0F, -0.586F, -0.0094F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6726F, -5.7573F, -0.1418F, 0.1728F, -0.0245F));

		PartDefinition cube_r24 = neck3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 36).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7269F, -5.1835F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0231F, -6.98F, 0.1834F, 0.1698F, 0.0595F));

		PartDefinition cube_r25 = neck4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(0.0F, -0.4791F, -0.0163F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6845F, -2.0041F, -0.2214F, -0.1704F, 0.0381F));

		PartDefinition cube_r26 = neck4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(79, 78).mirror().addBox(-0.0218F, -0.5389F, -0.1426F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8152F, -3.4984F, -0.2651F, -0.1704F, 0.0381F));

		PartDefinition cube_r27 = neck4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(79, 78).addBox(0.0218F, -0.5389F, -0.1426F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8152F, -3.4984F, -0.2651F, 0.1704F, -0.0381F));

		PartDefinition cube_r28 = neck4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(75, 37).addBox(0.0F, -0.4791F, -0.0163F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6845F, -2.0041F, -0.2214F, 0.1704F, -0.0381F));

		PartDefinition cube_r29 = neck4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(63, 70).addBox(0.2F, -1.1F, 2.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 12).addBox(0.2F, -1.1F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 36).addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.2F, 0.416F, -4.1983F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head2 = neck4.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(40, 68).addBox(-1.5F, -0.8962F, -2.7616F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 77).addBox(0.71F, -0.9962F, -2.8616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 77).addBox(0.92F, -0.9962F, -2.8616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 64).addBox(0.93F, -0.9962F, -2.8616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(14, 77).mirror().addBox(-1.92F, -0.9962F, -2.8616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 64).mirror().addBox(-1.93F, -0.9962F, -2.8616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(28, 77).mirror().addBox(-1.71F, -0.9962F, -2.8616F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.366F, -4.3983F, 0.1311F, 0.043F, 0.0076F));

		PartDefinition head5_r1 = head2.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 81).addBox(1.92F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.21F, -0.0962F, -0.4616F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head2.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(76, 18).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 18).addBox(1.84F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.42F, 0.3038F, -3.7616F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head2.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(-1.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(39, 52).addBox(0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6038F, -0.2616F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = head2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(65, 74).addBox(-1.0F, 1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.8962F, -2.5616F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(67, 61).addBox(-0.9F, -0.75F, -3.725F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.1F, 2.0F, -0.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(67, 35).addBox(-1.0F, -0.0691F, -0.093F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 2.6F, 5.5F, -1.0341F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(41, 16).addBox(-1.0F, -0.0407F, -1.9939F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 2.6F, 5.5F, -0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 77).mirror().addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9797F, 1.6516F, 3.7642F, -0.6162F, -0.2621F, 0.2055F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(50, 77).addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9797F, 1.6516F, 3.7642F, -0.6162F, 0.2621F, -0.2055F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 20).addBox(-0.5F, 0.0602F, -2.9357F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1F, 4.8F, -0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(29, 61).addBox(-0.5F, -0.0009F, 0.6029F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
				.texOffs(39, 61).addBox(-0.5F, -0.0009F, -0.1637F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.6F, 0.9F, 0.1527F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(73, 56).addBox(0.6F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(73, 56).mirror().addBox(-1.4F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.1038F, 0.2384F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r37 = jaw2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(19, 68).addBox(-0.9F, -0.25F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F))
				.texOffs(56, 51).addBox(-0.9F, 0.0F, -3.45F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw2.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(48, 61).mirror().addBox(-1.5F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(48, 61).addBox(0.5F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, 0.1F, -0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition upperarmL = chest.addOrReplaceChild("upperarmL", CubeListBuilder.create().texOffs(0, 50).addBox(-0.3981F, -0.0334F, -0.028F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(57, 76).addBox(-0.3981F, 2.9666F, -0.028F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(4.05F, 5.85F, -6.2F, 0.5863F, 0.253F, -0.1442F));

		PartDefinition upperarm3_r1 = upperarmL.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(21, 75).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4019F, 2.9666F, -0.528F, 0.5236F, 0.0F, 0.0F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create().texOffs(0, 59).addBox(0.1F, -0.3106F, -4.9785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.21F))
				.texOffs(57, 23).addBox(0.1F, -1.7106F, -5.1785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4981F, 8.0666F, 1.272F, 0.3662F, 0.1996F, 0.1706F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create().texOffs(27, 70).addBox(-1.0F, -0.75F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.3F, -1.3106F, -5.1785F, 0.0F, 0.4363F, 0.0F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create().texOffs(74, 12).addBox(-0.3F, -0.6F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.3F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperarmL2 = chest.addOrReplaceChild("upperarmL2", CubeListBuilder.create().texOffs(43, 39).addBox(-0.6019F, -0.0334F, -0.028F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(76, 30).addBox(-0.6019F, 2.9666F, -0.028F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(-3.85F, 5.85F, -6.2F, 0.9887F, -0.3938F, 0.2524F));

		PartDefinition upperarm4_r1 = upperarmL2.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(74, 74).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4019F, 2.9666F, -0.528F, 0.5236F, 0.0F, 0.0F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create().texOffs(22, 52).addBox(-1.1F, -0.3106F, -4.9785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.21F))
				.texOffs(39, 50).addBox(-1.1F, -1.7106F, -5.1785F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4981F, 8.0666F, 1.272F, 0.5407F, -0.1996F, -0.1706F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create().texOffs(68, 67).addBox(0.0F, -0.75F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.3F, -1.3106F, -5.1785F, 0.0F, -0.3054F, 0.0F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create().texOffs(74, 4).addBox(-0.7F, -0.6F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3F, -0.9F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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