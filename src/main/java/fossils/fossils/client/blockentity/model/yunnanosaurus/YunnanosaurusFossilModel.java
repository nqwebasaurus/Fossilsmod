package fossils.fossils.client.blockentity.model.yunnanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YunnanosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart upperlegL;
	private final ModelPart lowerlegL;
	private final ModelPart feetL;
	private final ModelPart toesL;
	private final ModelPart toesL2;
	private final ModelPart upperlegL2;
	private final ModelPart lowerlegL2;
	private final ModelPart feetL2;
	private final ModelPart toesL3;
	private final ModelPart toesL4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck;
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

	public YunnanosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.upperlegL = this.basin.getChild("upperlegL");
		this.lowerlegL = this.upperlegL.getChild("lowerlegL");
		this.feetL = this.lowerlegL.getChild("feetL");
		this.toesL = this.feetL.getChild("toesL");
		this.toesL2 = this.toesL.getChild("toesL2");
		this.upperlegL2 = this.basin.getChild("upperlegL2");
		this.lowerlegL2 = this.upperlegL2.getChild("lowerlegL2");
		this.feetL2 = this.lowerlegL2.getChild("feetL2");
		this.toesL3 = this.feetL2.getChild("toesL3");
		this.toesL4 = this.toesL3.getChild("toesL4");
		this.body = this.basin.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
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

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.1672F, 0.8983F, -0.3074F, 0.0F, 0.0F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(121, 101).mirror().addBox(-0.5F, -0.4F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0734F, 8.9174F, 3.9927F, 1.0647F, 0.0F, -0.3491F));

		PartDefinition basin_r2 = basin.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-0.4147F, -0.0767F, -5.0502F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2104F, 1.4508F, 1.4154F, -0.2269F, 0.0F, -0.1222F));

		PartDefinition basin_r3 = basin.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(115, 14).mirror().addBox(-0.5F, -3.1F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2104F, 0.7508F, -1.2846F, 0.5411F, 0.0F, -0.1222F));

		PartDefinition basin_r4 = basin.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(75, 113).mirror().addBox(-0.305F, -2.9623F, -2.1945F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6052F, -1.4229F, 2.1142F, 0.5672F, -0.1222F, 0.0F));

		PartDefinition basin_r5 = basin.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(84, 118).mirror().addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(0, 118).mirror().addBox(-0.5F, -0.2F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6052F, -2.7229F, 3.7142F, 0.3054F, -0.1222F, 0.0F));

		PartDefinition basin_r6 = basin.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(122, 52).mirror().addBox(-0.5F, -0.0757F, -0.0139F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(122, 52).addBox(6.7F, -0.0757F, -0.0139F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.6F, -4.6309F, 1.7537F, -0.1484F, 0.0F, 0.0F));

		PartDefinition basin_r7 = basin.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(34, 113).mirror().addBox(-1.153F, 0.4344F, 0.0702F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8599F, 3.177F, -7.2544F, -0.4617F, 0.0114F, -0.4723F));

		PartDefinition basin_r8 = basin.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(116, 75).mirror().addBox(-0.5F, -2.0F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0647F, 10.1458F, -9.6704F, -0.0738F, 0.0F, -0.1745F));

		PartDefinition basin_r9 = basin.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(77, 95).mirror().addBox(-0.7F, 0.8302F, -2.355F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.4348F, -2.3996F, 0.1745F, 0.0F, -0.1222F));

		PartDefinition basin_r10 = basin.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(108, 7).mirror().addBox(-1.0659F, 7.1113F, -0.4081F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.496F, 3.3542F, -0.0278F, 0.4887F, 0.0F, -0.3491F));

		PartDefinition basin_r11 = basin.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(48, 108).mirror().addBox(-1.0659F, -0.029F, -1.4715F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.496F, 3.3542F, -0.0278F, 0.6807F, 0.0F, -0.3491F));

		PartDefinition basin_r12 = basin.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, -2.6F, -1.5F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0577F, 1.9945F, -6.4765F, 0.3142F, 0.0F, -0.1222F));

		PartDefinition basin_r13 = basin.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(41, 113).mirror().addBox(-0.7F, -0.6624F, -0.2491F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.4348F, -4.4996F, -0.9687F, 0.0F, -0.1222F));

		PartDefinition basin_r14 = basin.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(102, 53).mirror().addBox(-0.7F, -0.7498F, -1.9503F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.4348F, -2.3996F, -0.4363F, 0.0F, -0.1222F));

		PartDefinition basin_r15 = basin.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(131, 100).mirror().addBox(-0.5F, -2.0671F, 0.7781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.8966F, 2.0431F, -0.48F, -0.1222F, 0.0F));

		PartDefinition basin_r16 = basin.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-0.5F, -0.0243F, -0.1141F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(87, 66).addBox(6.7F, -0.0243F, -0.1141F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.6F, -4.6309F, -4.1463F, 0.0087F, 0.0F, 0.0F));

		PartDefinition basin_r17 = basin.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(111, 58).mirror().addBox(-0.5F, 0.2372F, -5.123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6F, -3.8171F, -2.8211F, -0.0524F, 0.1222F, 0.0F));

		PartDefinition basin_r18 = basin.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(111, 64).mirror().addBox(-0.5F, -1.1389F, -5.1304F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, -3.8171F, -2.8211F, 0.2182F, 0.1222F, 0.0F));

		PartDefinition basin_r19 = basin.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(55, 115).mirror().addBox(-0.5F, -0.6388F, -1.8104F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6F, -3.8171F, -2.8211F, -0.0873F, 0.1222F, 0.0F));

		PartDefinition basin_r20 = basin.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(62, 95).mirror().addBox(-3.2F, -0.2F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 95).addBox(0.2F, -0.2F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(47, 125).addBox(0.0F, -3.3F, 2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 124).addBox(0.0F, -3.3F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(31, 51).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5F, -6.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r21 = basin.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(34, 113).addBox(0.153F, 0.4344F, 0.0702F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8599F, 3.177F, -7.2544F, -0.4617F, -0.0114F, 0.4723F));

		PartDefinition basin_r22 = basin.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(116, 75).addBox(-0.5F, -2.0F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0647F, 10.1458F, -9.6704F, -0.0738F, 0.0F, 0.1745F));

		PartDefinition basin_r23 = basin.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(89, 53).addBox(-0.5853F, -0.0767F, -5.0502F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2104F, 1.4508F, 1.4154F, -0.2269F, 0.0F, 0.1222F));

		PartDefinition basin_r24 = basin.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(115, 14).addBox(-0.5F, -3.1F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2104F, 0.7508F, -1.2846F, 0.5411F, 0.0F, 0.1222F));

		PartDefinition basin_r25 = basin.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(77, 95).addBox(-0.3F, 0.8302F, -2.355F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.4F, -2.4348F, -2.3996F, 0.1745F, 0.0F, 0.1222F));

		PartDefinition basin_r26 = basin.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(108, 7).addBox(0.0659F, 7.1113F, -0.4081F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.496F, 3.3542F, -0.0278F, 0.4887F, 0.0F, 0.3491F));

		PartDefinition basin_r27 = basin.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(121, 101).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0734F, 8.9174F, 3.9927F, 1.0647F, 0.0F, 0.3491F));

		PartDefinition basin_r28 = basin.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(48, 108).addBox(0.0659F, -0.029F, -1.4715F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.496F, 3.3542F, -0.0278F, 0.6807F, 0.0F, 0.3491F));

		PartDefinition basin_r29 = basin.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -2.6F, -1.5F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0577F, 1.9945F, -6.4765F, 0.3142F, 0.0F, 0.1222F));

		PartDefinition basin_r30 = basin.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(41, 113).addBox(-0.3F, -0.6624F, -0.2491F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.4F, -2.4348F, -4.4996F, -0.9687F, 0.0F, 0.1222F));

		PartDefinition basin_r31 = basin.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(102, 53).addBox(-0.3F, -0.7498F, -1.9503F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.4F, -2.4348F, -2.3996F, -0.4363F, 0.0F, 0.1222F));

		PartDefinition basin_r32 = basin.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(131, 100).addBox(-0.5F, -2.0671F, 0.7781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, -2.8966F, 2.0431F, -0.48F, 0.1222F, 0.0F));

		PartDefinition basin_r33 = basin.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(111, 58).addBox(-0.5F, 0.2372F, -5.123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.6F, -3.8171F, -2.8211F, -0.0524F, -0.1222F, 0.0F));

		PartDefinition basin_r34 = basin.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(111, 64).addBox(-0.5F, -1.1389F, -5.1304F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, -3.8171F, -2.8211F, 0.2182F, -0.1222F, 0.0F));

		PartDefinition basin_r35 = basin.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(84, 118).addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(0, 118).addBox(-0.5F, -0.2F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6052F, -2.7229F, 3.7142F, 0.3054F, 0.1222F, 0.0F));

		PartDefinition basin_r36 = basin.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(75, 113).addBox(-0.695F, -2.9623F, -2.1945F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.6052F, -1.4229F, 2.1142F, 0.5672F, 0.1222F, 0.0F));

		PartDefinition basin_r37 = basin.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(55, 115).addBox(-0.5F, -0.6388F, -1.8104F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6F, -3.8171F, -2.8211F, -0.0873F, -0.1222F, 0.0F));

		PartDefinition cube_r1 = basin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(128, 91).addBox(0.0F, -2.6F, 4.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 85).addBox(0.0F, -2.4F, 2.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 128).addBox(0.0F, -2.1F, 0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 128).addBox(0.0F, -1.8F, -1.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.571F, 0.3347F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0257F, 5.5875F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6325F, -0.1287F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = tail1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 130).addBox(0.0F, -5.8F, 10.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 128).addBox(0.0F, -5.6F, 9.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5402F, 1.7325F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r3 = tail1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 127).addBox(0.0F, -3.7129F, -0.0611F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1402F, 8.9325F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r4 = tail1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(128, 115).addBox(0.0F, -3.9586F, 0.0046F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2402F, 6.8325F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 123).addBox(0.0F, -4.3726F, 0.0185F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4402F, 4.8325F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 80).addBox(0.0F, -4.1867F, 0.0324F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6402F, 2.8325F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(68, 124).addBox(0.0F, -3.0F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.978F, 2.5434F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 121).addBox(0.0F, 0.1392F, -0.519F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0231F, 12.1476F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(93, 118).addBox(0.0F, -0.1718F, 0.031F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9231F, 9.5476F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(71, 117).addBox(0.0F, -0.4066F, -0.1444F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7806F, 7.3368F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 68).addBox(0.0F, -0.3005F, 0.0392F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6806F, 5.2368F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 120).addBox(0.0F, -4.0F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2882F, 4.8047F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 128).addBox(0.0F, -3.8008F, 0.0462F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8402F, 0.8325F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6983F, 14.7641F, -0.0189F, -0.1755F, -0.0397F));

		PartDefinition tail2_r1 = tail2.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.2155F, -0.0348F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1115F, -0.0829F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(33, 132).addBox(0.0F, -1.8144F, -0.0694F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0777F, 11.9327F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 132).addBox(0.0F, -1.8459F, -0.0176F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1452F, 9.9427F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(80, 129).addBox(0.0F, -2.1692F, -0.0056F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1526F, 7.8611F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(84, 113).addBox(0.0F, -2.1609F, -0.0455F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2201F, 5.9711F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(87, 75).addBox(0.0F, -2.2609F, -0.0455F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2441F, 3.9097F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 130).addBox(0.0F, -5.1F, 9.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.033F, -10.083F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(85, 46).addBox(0.0F, -2.4657F, -0.0225F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.233F, 1.917F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(41, 121).addBox(0.0F, -0.7796F, 0.1416F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7081F, 10.8395F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(122, 60).addBox(0.0F, -0.6427F, -0.005F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6646F, 8.5573F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(3, 123).addBox(0.0F, 0.0404F, 0.0036F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7304F, 6.3321F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 123).addBox(0.0F, -0.051F, -0.0172F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7782F, 4.2305F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(119, 121).addBox(0.0F, -0.5969F, -0.2046F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6304F, 2.2321F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 121).addBox(0.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3914F, 1.4661F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3051F, 13.6327F, 0.312F, 0.4114F, -0.007F));

		PartDefinition tail3_r1 = tail3.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(62, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3765F, 0.122F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(51, 132).addBox(0.0F, -2.35F, 4.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 132).addBox(0.0F, -1.75F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 113).addBox(0.0F, -1.25F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 109).addBox(0.0F, -0.85F, -1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 132).addBox(0.0F, -0.55F, -3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 117).addBox(0.0F, -0.25F, -5.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3378F, 5.5409F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(77, 126).addBox(0.0F, -1.1906F, -0.2594F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9568F, 10.4056F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(74, 126).addBox(0.0F, -0.9113F, 0.0197F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7568F, 8.2056F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 125).addBox(0.0F, -1.1121F, -0.0153F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4568F, 6.1056F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(71, 127).addBox(0.0F, -0.913F, -0.0502F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1568F, 4.0056F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(21, 123).addBox(0.0F, -1.4897F, 0.0119F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8568F, 1.8056F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r33 = tail3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(115, 122).addBox(0.0F, -1.2876F, 0.0011F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6568F, -0.2944F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(35, 15).addBox(-0.5F, -0.5815F, 0.1755F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.003F))
				.texOffs(133, 44).addBox(0.0F, -1.6815F, 12.1755F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 134).addBox(0.0F, -1.5815F, 14.1755F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8235F, 11.622F, -0.1263F, 0.1984F, -0.1595F));

		PartDefinition cube_r34 = tail4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(132, 124).addBox(0.0F, 2.4098F, 4.033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 96).addBox(0.0F, 1.6098F, 2.033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(129, 127).addBox(0.0F, 0.0098F, 0.033F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4246F, 9.1597F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(103, 129).addBox(0.0F, 0.3914F, 0.0018F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4246F, 6.9597F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r36 = tail4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(100, 129).addBox(0.0F, 0.5731F, -0.0293F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4246F, 4.7597F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r37 = tail4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(128, 109).addBox(0.0F, -0.0689F, -0.0607F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6246F, 2.6597F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(128, 100).addBox(0.0F, 0.402F, 0.0871F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6246F, 0.2597F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail10_r1 = tail4.addOrReplaceChild("tail10_r1", CubeListBuilder.create().texOffs(133, 40).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 10.1755F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail9_r1 = tail4.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(133, 36).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4815F, 8.1755F, -0.1571F, 0.0F, 0.0F));

		PartDefinition tail8_r1 = tail4.addOrReplaceChild("tail8_r1", CubeListBuilder.create().texOffs(133, 28).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 6.1755F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail7_r1 = tail4.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(133, 24).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 4.1755F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail4.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(133, 20).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 2.1755F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail4.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(133, 4).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5815F, 0.1755F, -0.1571F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(66, 32).addBox(-0.5F, -0.2967F, -0.181F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(58, 133).addBox(0.0F, -1.1967F, 0.819F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 133).addBox(0.0F, -1.0967F, 2.819F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 133).addBox(0.0F, -0.9967F, 4.819F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 133).addBox(0.0F, -0.8967F, 6.819F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 133).addBox(0.0F, -0.7967F, 8.819F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2418F, 15.2765F, -0.1995F, 0.3661F, -0.2175F));

		PartDefinition cube_r39 = tail5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 134).addBox(0.0F, 7.4098F, 14.033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 133).addBox(0.0F, 6.5098F, 12.033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 133).addBox(0.0F, 5.6098F, 10.033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 0).addBox(0.0F, 3.9098F, 8.033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(132, 128).addBox(0.0F, 3.3098F, 6.033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6664F, -6.1168F, 0.4974F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.2967F, -0.181F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.041F, 11.9419F, -0.128F, -0.3031F, 0.0384F));

		PartDefinition upperlegL = basin.addOrReplaceChild("upperlegL", CubeListBuilder.create().texOffs(122, 11).addBox(-0.2F, 3.4F, 0.3321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 0.2722F, -3.0798F, 0.0F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperlegL.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(93, 8).addBox(-1.5F, -1.8F, -1.4F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7322F, 2.6637F, 0.7418F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperlegL.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(87, 109).addBox(-1.5F, -0.1624F, -1.8999F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 7.2F, 1.3321F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperlegL.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(66, 108).addBox(-1.5F, -6.0308F, -0.0528F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.3F, 0.5321F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperlegL.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(122, 16).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 3.4F, 2.3321F, 0.8203F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperlegL.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(101, 95).addBox(-1.5F, -1.6F, -1.1F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperlegL.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(102, 64).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0321F, 0.0873F, 0.0F, 0.0F));

		PartDefinition lowerlegL = upperlegL.addOrReplaceChild("lowerlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 14.3666F, 2.6101F, 1.0414F, 0.0F, 0.0F));

		PartDefinition lowerleg4_r1 = lowerlegL.addOrReplaceChild("lowerleg4_r1", CubeListBuilder.create().texOffs(74, 120).addBox(-1.4F, -13.55F, 0.35F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 109).addBox(-0.9F, -9.95F, 0.35F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1F, 13.225F, 1.1511F, 1.5708F, 1.5533F, 1.5708F));

		PartDefinition lowerleg4_r2 = lowerlegL.addOrReplaceChild("lowerleg4_r2", CubeListBuilder.create().texOffs(102, 22).addBox(-2.9607F, -0.0526F, -2.85F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(0.4F, -0.275F, 2.1511F, -1.5708F, 0.6807F, -1.5708F));

		PartDefinition lowerleg4_r3 = lowerlegL.addOrReplaceChild("lowerleg4_r3", CubeListBuilder.create().texOffs(62, 89).addBox(-2.0071F, -0.045F, -1.85F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 1.925F, -0.7489F, 1.5708F, 1.2741F, 1.5708F));

		PartDefinition lowerleg3_r1 = lowerlegL.addOrReplaceChild("lowerleg3_r1", CubeListBuilder.create().texOffs(106, 36).addBox(-1.9F, -13.45F, -2.85F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 13.225F, 1.1511F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition lowerleg2_r1 = lowerlegL.addOrReplaceChild("lowerleg2_r1", CubeListBuilder.create().texOffs(72, 80).addBox(-1.4F, -11.95F, -1.85F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 13.225F, 1.1511F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition feetL = lowerlegL.addOrReplaceChild("feetL", CubeListBuilder.create().texOffs(37, 105).addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 13.2801F, 1.685F, -0.7664F, 0.0F, 0.0F));

		PartDefinition toes3_r1 = feetL.addOrReplaceChild("toes3_r1", CubeListBuilder.create().texOffs(108, 29).addBox(-0.4396F, -0.1728F, -3.8487F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5984F, 1.7747F, -0.869F, 2.183F, 0.0801F, 0.2495F));

		PartDefinition toesL = feetL.addOrReplaceChild("toesL", CubeListBuilder.create().texOffs(0, 88).addBox(-2.0F, -0.9235F, -3.6059F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.7997F, 0.6996F, 0.5854F, 0.0F, 0.0F));

		PartDefinition toesL2 = toesL.addOrReplaceChild("toesL2", CubeListBuilder.create().texOffs(78, 0).addBox(-2.0F, -0.9235F, -4.6059F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, -0.4356F, 0.0F, 0.0F));

		PartDefinition upperlegL2 = basin.addOrReplaceChild("upperlegL2", CubeListBuilder.create().texOffs(27, 122).addBox(-0.8F, 3.4F, 0.3321F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2F, 0.2722F, -3.0798F, -0.2182F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperlegL2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(93, 29).addBox(-1.5F, -1.8F, -1.4F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7322F, 2.6637F, 0.7418F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperlegL2.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(20, 110).addBox(-0.5F, -0.1624F, -1.8999F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 7.2F, 1.3321F, 0.4363F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperlegL2.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(11, 110).addBox(-0.5F, -6.0308F, -0.0528F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.3F, 0.5321F, 0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperlegL2.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(34, 122).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3F, 3.4F, 2.3321F, 0.8203F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperlegL2.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(102, 15).addBox(-1.5F, -1.6F, -1.1F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4531F, -0.6839F, 0.5585F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperlegL2.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(101, 102).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0321F, 0.0873F, 0.0F, 0.0F));

		PartDefinition lowerlegL2 = upperlegL2.addOrReplaceChild("lowerlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 14.3666F, 2.6101F, 0.9542F, 0.0F, 0.0F));

		PartDefinition lowerleg5_r1 = lowerlegL2.addOrReplaceChild("lowerleg5_r1", CubeListBuilder.create().texOffs(121, 0).addBox(-0.6F, -13.55F, 0.35F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 110).addBox(-0.1F, -9.95F, 0.35F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1F, 13.225F, 1.1511F, 1.5708F, -1.5533F, -1.5708F));

		PartDefinition lowerleg5_r2 = lowerlegL2.addOrReplaceChild("lowerleg5_r2", CubeListBuilder.create().texOffs(24, 103).addBox(-0.0393F, -0.0526F, -2.85F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.06F)), PartPose.offsetAndRotation(-0.4F, -0.275F, 2.1511F, -1.5708F, -0.6807F, 1.5708F));

		PartDefinition lowerleg5_r3 = lowerlegL2.addOrReplaceChild("lowerleg5_r3", CubeListBuilder.create().texOffs(101, 113).addBox(0.0071F, -0.045F, -1.85F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 1.925F, -0.7489F, 1.5708F, -1.2741F, -1.5708F));

		PartDefinition lowerleg4_r4 = lowerlegL2.addOrReplaceChild("lowerleg4_r4", CubeListBuilder.create().texOffs(106, 46).addBox(-1.1F, -13.45F, -2.85F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 13.225F, 1.1511F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition lowerleg3_r2 = lowerlegL2.addOrReplaceChild("lowerleg3_r2", CubeListBuilder.create().texOffs(81, 80).addBox(-0.6F, -11.95F, -1.85F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 13.225F, 1.1511F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition feetL2 = lowerlegL2.addOrReplaceChild("feetL2", CubeListBuilder.create().texOffs(76, 105).addBox(-1.5F, -0.1003F, -1.0004F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 13.2801F, 1.685F, -0.7664F, 0.0F, 0.0F));

		PartDefinition toes4_r1 = feetL2.addOrReplaceChild("toes4_r1", CubeListBuilder.create().texOffs(55, 108).addBox(-0.569F, 0.0394F, -3.9188F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5984F, 1.6747F, -1.069F, 2.1655F, -0.0801F, -0.2495F));

		PartDefinition toesL3 = feetL2.addOrReplaceChild("toesL3", CubeListBuilder.create().texOffs(89, 46).addBox(-2.0F, -0.9235F, -3.6059F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 4.7997F, 0.6996F, 0.3323F, 0.0F, 0.0F));

		PartDefinition toesL4 = toesL3.addOrReplaceChild("toesL4", CubeListBuilder.create().texOffs(21, 79).addBox(-2.0F, -0.9235F, -4.6059F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -0.0417F, -3.0825F, 0.0094F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(33, 33).addBox(-0.4F, -0.7566F, -15.0967F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.1F, -2.4086F, -8.1116F, 0.0095F, 0.0868F, 0.0878F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(66, 48).mirror().addBox(-11.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6434F, -20.4967F, 0.0621F, 0.2274F, -1.3019F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(125, 75).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6434F, -20.4967F, 0.1608F, 0.173F, -0.8151F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(129, 52).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6434F, -20.4967F, 0.2142F, 0.0988F, -0.4257F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-11.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8434F, -22.4967F, 0.0717F, 0.2611F, -1.2996F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(125, 66).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8434F, -22.4967F, 0.1852F, 0.1983F, -0.8106F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(129, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8434F, -22.4967F, 0.2462F, 0.1132F, -0.4223F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(129, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8434F, -24.4967F, 0.2783F, 0.1274F, -0.4185F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(125, 64).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8434F, -24.4967F, 0.2099F, 0.2236F, -0.8054F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(43, 12).mirror().addBox(-11.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8434F, -24.4967F, 0.0814F, 0.2947F, -1.2969F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(131, 73).mirror().addBox(-2.8478F, -0.7654F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1434F, -1.0967F, -0.0388F, -0.0905F, -1.0532F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(129, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1434F, -1.0967F, -0.0705F, -0.0687F, -0.6598F));

		PartDefinition body_r12 = body.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(13, 129).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -4.1967F, -0.0369F, -0.0239F, -0.4704F));

		PartDefinition body_r13 = body.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(125, 60).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -4.1967F, -0.0249F, -0.0362F, -0.8631F));

		PartDefinition body_r14 = body.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(129, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -7.1967F, 0.1508F, 0.0693F, -0.4485F));

		PartDefinition body_r15 = body.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(124, 25).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -7.1967F, 0.113F, 0.1216F, -0.8395F));

		PartDefinition body_r16 = body.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(-4.9466F, -2.9173F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -7.1967F, 0.0439F, 0.16F, -1.3229F));

		PartDefinition body_r17 = body.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(129, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1434F, -10.1967F, 0.205F, 0.098F, -0.3918F));

		PartDefinition body_r18 = body.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(122, 125).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1434F, -10.1967F, 0.1525F, 0.1687F, -0.7817F));

		PartDefinition body_r19 = body.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(125, 83).mirror().addBox(-6.9466F, -2.9173F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1434F, -10.1967F, 0.0567F, 0.2199F, -1.2683F));

		PartDefinition body_r20 = body.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(128, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -13.1967F, 0.156F, 0.079F, -0.3963F));

		PartDefinition body_r21 = body.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(110, 44).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -13.1967F, 0.1142F, 0.1326F, -0.7876F));

		PartDefinition body_r22 = body.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-8.9466F, -2.9173F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0434F, -13.1967F, 0.0397F, 0.1702F, -1.2718F));

		PartDefinition body_r23 = body.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(78, 8).mirror().addBox(-9.9466F, -2.9173F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2434F, -16.0967F, 0.0632F, 0.2544F, -1.2673F));

		PartDefinition body_r24 = body.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(128, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2434F, -16.0967F, 0.2358F, 0.1152F, -0.3891F));

		PartDefinition body_r25 = body.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(37, 96).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2434F, -16.0967F, 0.1747F, 0.1962F, -0.7782F));

		PartDefinition body_r26 = body.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(93, 44).mirror().addBox(-10.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4434F, -18.4967F, 0.0621F, 0.2274F, -1.3019F));

		PartDefinition body_r27 = body.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(124, 23).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4434F, -18.4967F, 0.1608F, 0.173F, -0.8151F));

		PartDefinition body_r28 = body.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(129, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4434F, -18.4967F, 0.2142F, 0.0988F, -0.4257F));

		PartDefinition body_r29 = body.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(131, 73).addBox(1.8478F, -0.7654F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1434F, -1.0967F, -0.0388F, 0.0905F, 1.0532F));

		PartDefinition body_r30 = body.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(129, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1434F, -1.0967F, -0.0705F, 0.0687F, 0.6598F));

		PartDefinition body_r31 = body.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(13, 129).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -4.1967F, -0.0369F, 0.0239F, 0.4704F));

		PartDefinition body_r32 = body.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(125, 60).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -4.1967F, -0.0249F, 0.0362F, 0.8631F));

		PartDefinition body_r33 = body.addOrReplaceChild("body_r33", CubeListBuilder.create().texOffs(129, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -7.1967F, 0.1508F, -0.0693F, 0.4485F));

		PartDefinition body_r34 = body.addOrReplaceChild("body_r34", CubeListBuilder.create().texOffs(124, 25).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -7.1967F, 0.113F, -0.1216F, 0.8395F));

		PartDefinition body_r35 = body.addOrReplaceChild("body_r35", CubeListBuilder.create().texOffs(57, 78).addBox(3.9466F, -2.9173F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -7.1967F, 0.0439F, -0.16F, 1.3229F));

		PartDefinition body_r36 = body.addOrReplaceChild("body_r36", CubeListBuilder.create().texOffs(129, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1434F, -10.1967F, 0.205F, -0.098F, 0.3918F));

		PartDefinition body_r37 = body.addOrReplaceChild("body_r37", CubeListBuilder.create().texOffs(122, 125).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1434F, -10.1967F, 0.1525F, -0.1687F, 0.7817F));

		PartDefinition body_r38 = body.addOrReplaceChild("body_r38", CubeListBuilder.create().texOffs(125, 83).addBox(3.9466F, -2.9173F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1434F, -10.1967F, 0.0567F, -0.2199F, 1.2683F));

		PartDefinition body_r39 = body.addOrReplaceChild("body_r39", CubeListBuilder.create().texOffs(128, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -13.1967F, 0.156F, -0.079F, 0.3963F));

		PartDefinition body_r40 = body.addOrReplaceChild("body_r40", CubeListBuilder.create().texOffs(110, 44).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -13.1967F, 0.1142F, -0.1326F, 0.7876F));

		PartDefinition body_r41 = body.addOrReplaceChild("body_r41", CubeListBuilder.create().texOffs(89, 63).addBox(3.9466F, -2.9173F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0434F, -13.1967F, 0.0397F, -0.1702F, 1.2718F));

		PartDefinition body_r42 = body.addOrReplaceChild("body_r42", CubeListBuilder.create().texOffs(78, 8).addBox(3.9466F, -2.9173F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2434F, -16.0967F, 0.0632F, -0.2544F, 1.2673F));

		PartDefinition body_r43 = body.addOrReplaceChild("body_r43", CubeListBuilder.create().texOffs(128, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2434F, -16.0967F, 0.2358F, -0.1152F, 0.3891F));

		PartDefinition body_r44 = body.addOrReplaceChild("body_r44", CubeListBuilder.create().texOffs(37, 96).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2434F, -16.0967F, 0.1747F, -0.1962F, 0.7782F));

		PartDefinition body_r45 = body.addOrReplaceChild("body_r45", CubeListBuilder.create().texOffs(129, 52).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6434F, -20.4967F, 0.2142F, -0.0988F, 0.4257F));

		PartDefinition body_r46 = body.addOrReplaceChild("body_r46", CubeListBuilder.create().texOffs(125, 75).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6434F, -20.4967F, 0.1608F, -0.173F, 0.8151F));

		PartDefinition body_r47 = body.addOrReplaceChild("body_r47", CubeListBuilder.create().texOffs(66, 48).addBox(3.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.6434F, -20.4967F, 0.0621F, -0.2274F, 1.3019F));

		PartDefinition body_r48 = body.addOrReplaceChild("body_r48", CubeListBuilder.create().texOffs(129, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8434F, -22.4967F, 0.2462F, -0.1132F, 0.4223F));

		PartDefinition body_r49 = body.addOrReplaceChild("body_r49", CubeListBuilder.create().texOffs(125, 66).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8434F, -22.4967F, 0.1852F, -0.1983F, 0.8106F));

		PartDefinition body_r50 = body.addOrReplaceChild("body_r50", CubeListBuilder.create().texOffs(66, 46).addBox(3.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8434F, -22.4967F, 0.0717F, -0.2611F, 1.2996F));

		PartDefinition body_r51 = body.addOrReplaceChild("body_r51", CubeListBuilder.create().texOffs(43, 12).addBox(3.9466F, -2.9173F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8434F, -24.4967F, 0.0814F, -0.2947F, 1.2969F));

		PartDefinition body_r52 = body.addOrReplaceChild("body_r52", CubeListBuilder.create().texOffs(125, 64).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8434F, -24.4967F, 0.2099F, -0.2236F, 0.8054F));

		PartDefinition body_r53 = body.addOrReplaceChild("body_r53", CubeListBuilder.create().texOffs(129, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8434F, -24.4967F, 0.2783F, -0.1274F, 0.4185F));

		PartDefinition body_r54 = body.addOrReplaceChild("body_r54", CubeListBuilder.create().texOffs(93, 44).addBox(3.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4434F, -18.4967F, 0.0621F, -0.2274F, 1.3019F));

		PartDefinition body_r55 = body.addOrReplaceChild("body_r55", CubeListBuilder.create().texOffs(124, 23).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4434F, -18.4967F, 0.1608F, -0.173F, 0.8151F));

		PartDefinition body_r56 = body.addOrReplaceChild("body_r56", CubeListBuilder.create().texOffs(129, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4434F, -18.4967F, 0.2142F, -0.0988F, 0.4257F));

		PartDefinition body_r57 = body.addOrReplaceChild("body_r57", CubeListBuilder.create().texOffs(68, 12).addBox(-3.5F, -2.1275F, -5.0888F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, 14.1434F, -21.7967F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body_r58 = body.addOrReplaceChild("body_r58", CubeListBuilder.create().texOffs(43, 0).addBox(-4.5F, -2.9878F, -8.0876F, 9.0F, 3.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, 14.1434F, -13.7967F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body_r59 = body.addOrReplaceChild("body_r59", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -3.9911F, -9.9607F, 11.0F, 4.0F, 10.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, 12.9434F, -3.9967F, 0.1222F, 0.0F, 0.0F));

		PartDefinition body_r60 = body.addOrReplaceChild("body_r60", CubeListBuilder.create().texOffs(62, 66).addBox(-0.5F, 0.0F, -11.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, -0.7566F, -15.0967F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(125, 77).addBox(0.0F, -2.6167F, -0.0054F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9294F, -2.1715F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(123, 92).addBox(0.0F, -2.2F, 7.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 123).addBox(0.0F, -1.9F, 4.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 123).addBox(0.0F, -1.8F, 1.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.3294F, -12.6715F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(6, 123).addBox(0.0F, -2.3127F, 0.0263F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7768F, -14.1839F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(123, 86).addBox(0.0F, -2.2032F, 0.0455F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.5985F, -17.1533F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(131, 85).addBox(0.0F, -1.3F, -2.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 131).addBox(0.0F, -1.3F, -4.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 131).addBox(0.0F, -1.3F, -6.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 130).addBox(0.0F, -1.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.1985F, -18.6533F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1122F, -25.967F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-0.4292F, -2.9089F, -0.8776F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 6.8718F, -5.8221F, 0.3682F, 0.0241F, 0.0252F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(115, 22).mirror().addBox(-0.5F, -0.6F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 22).addBox(8.3F, -0.6F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, -0.6554F, -2.5877F, 0.6196F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(63, 101).mirror().addBox(-0.5F, -0.0908F, -4.8812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(63, 101).addBox(8.3F, -0.0908F, -4.8812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.3F, -0.1282F, -0.0221F, 0.2967F, 0.0F, 0.0F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-0.5F, -0.0762F, -0.9141F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(110, 0).addBox(8.3F, -0.0762F, -0.9141F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.3F, 0.0718F, -4.7221F, 1.2217F, 0.0F, 0.0F));

		PartDefinition body_r61 = chest.addOrReplaceChild("body_r61", CubeListBuilder.create().texOffs(129, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1838F, -0.4571F, 0.2019F, 0.084F, -0.4608F));

		PartDefinition body_r62 = chest.addOrReplaceChild("body_r62", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1838F, -0.4571F, 0.155F, 0.1546F, -0.8499F));

		PartDefinition body_r63 = chest.addOrReplaceChild("body_r63", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-10.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1838F, -0.4571F, 0.0657F, 0.2085F, -1.3351F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(40, 68).mirror().addBox(-0.9F, 0.2353F, -0.5201F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 10.7983F, -4.4334F, 0.3918F, -0.5303F, -0.31F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(88, 103).mirror().addBox(-0.9F, 0.2353F, 0.1799F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 10.7983F, -4.4334F, 0.9513F, -0.7808F, -0.4419F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(119, 32).mirror().addBox(-2.5F, -0.5F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 52).mirror().addBox(-1.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 32).addBox(0.5F, -0.5F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 52).addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 9.9903F, -6.2288F, -0.6458F, 0.0F, 0.0F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(103, 87).mirror().addBox(-0.9F, 0.2353F, -0.0201F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 10.7983F, -4.4334F, 1.4477F, -0.9932F, -0.5999F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(47, 89).mirror().addBox(-0.5F, -1.4F, -2.8F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 27).mirror().addBox(-0.5F, -1.0F, 5.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(128, 27).addBox(8.3F, -1.0F, 5.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(47, 89).addBox(8.3F, -1.4F, -2.8F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 3.2718F, -5.8221F, 0.8378F, 0.0F, 0.0F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(110, 109).mirror().addBox(-0.4F, -2.3406F, -2.7236F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 5.9718F, -7.1221F, 0.967F, -0.4446F, -0.5576F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.9F, 0.2353F, -0.5201F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 10.7983F, -4.4334F, 0.5579F, -0.6936F, -0.2909F));

		PartDefinition body_r64 = chest.addOrReplaceChild("body_r64", CubeListBuilder.create().texOffs(6, 129).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3162F, -6.5571F, 0.3294F, 0.1246F, -0.5493F));

		PartDefinition body_r65 = chest.addOrReplaceChild("body_r65", CubeListBuilder.create().texOffs(124, 21).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3162F, -6.5571F, 0.2592F, 0.24F, -0.9313F));

		PartDefinition body_r66 = chest.addOrReplaceChild("body_r66", CubeListBuilder.create().texOffs(50, 98).mirror().addBox(-7.9466F, -2.9173F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3162F, -6.5571F, 0.1178F, 0.3318F, -1.4229F));

		PartDefinition body_r67 = chest.addOrReplaceChild("body_r67", CubeListBuilder.create().texOffs(128, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2162F, -4.4571F, 0.2391F, 0.0885F, -0.5082F));

		PartDefinition body_r68 = chest.addOrReplaceChild("body_r68", CubeListBuilder.create().texOffs(123, 98).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2162F, -4.4571F, 0.188F, 0.1728F, -0.8952F));

		PartDefinition body_r69 = chest.addOrReplaceChild("body_r69", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-8.9466F, -2.9173F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2162F, -4.4571F, 0.0865F, 0.2398F, -1.3811F));

		PartDefinition body_r70 = chest.addOrReplaceChild("body_r70", CubeListBuilder.create().texOffs(128, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1162F, -2.4571F, 0.1862F, 0.0762F, -0.462F));

		PartDefinition body_r71 = chest.addOrReplaceChild("body_r71", CubeListBuilder.create().texOffs(122, 73).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1162F, -2.4571F, 0.1434F, 0.1415F, -0.8517F));

		PartDefinition body_r72 = chest.addOrReplaceChild("body_r72", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-9.9466F, -2.9173F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1162F, -2.4571F, 0.0615F, 0.1915F, -1.3359F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(128, 0).addBox(-0.5708F, -2.9089F, -0.8776F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 6.8718F, -5.8221F, 0.3682F, -0.0241F, -0.0252F));

		PartDefinition chest_r13 = chest.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(110, 109).addBox(-0.6F, -2.3406F, -2.7236F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 5.9718F, -7.1221F, 0.967F, 0.4446F, 0.5576F));

		PartDefinition chest_r14 = chest.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(40, 68).addBox(-0.1F, 0.2353F, -0.5201F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.7983F, -4.4334F, 0.3918F, 0.5303F, 0.31F));

		PartDefinition chest_r15 = chest.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(0, 80).addBox(-0.1F, 0.2353F, -0.5201F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.7983F, -4.4334F, 0.5579F, 0.6936F, 0.2909F));

		PartDefinition chest_r16 = chest.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(88, 103).addBox(-0.1F, 0.2353F, 0.1799F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.7983F, -4.4334F, 0.9513F, 0.7808F, 0.4419F));

		PartDefinition chest_r17 = chest.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(103, 87).addBox(-0.1F, 0.2353F, -0.0201F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 10.7983F, -4.4334F, 1.4477F, 0.9932F, 0.5999F));

		PartDefinition chest_r18 = chest.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, -0.1838F, -8.5571F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body_r73 = chest.addOrReplaceChild("body_r73", CubeListBuilder.create().texOffs(6, 129).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3162F, -6.5571F, 0.3294F, -0.1246F, 0.5493F));

		PartDefinition body_r74 = chest.addOrReplaceChild("body_r74", CubeListBuilder.create().texOffs(124, 21).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3162F, -6.5571F, 0.2592F, -0.24F, 0.9313F));

		PartDefinition body_r75 = chest.addOrReplaceChild("body_r75", CubeListBuilder.create().texOffs(50, 98).addBox(3.9466F, -2.9173F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3162F, -6.5571F, 0.1178F, -0.3318F, 1.4229F));

		PartDefinition body_r76 = chest.addOrReplaceChild("body_r76", CubeListBuilder.create().texOffs(128, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2162F, -4.4571F, 0.2391F, -0.0885F, 0.5082F));

		PartDefinition body_r77 = chest.addOrReplaceChild("body_r77", CubeListBuilder.create().texOffs(123, 98).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2162F, -4.4571F, 0.188F, -0.1728F, 0.8952F));

		PartDefinition body_r78 = chest.addOrReplaceChild("body_r78", CubeListBuilder.create().texOffs(106, 42).addBox(3.9466F, -2.9173F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2162F, -4.4571F, 0.0865F, -0.2398F, 1.3811F));

		PartDefinition body_r79 = chest.addOrReplaceChild("body_r79", CubeListBuilder.create().texOffs(103, 93).addBox(3.9466F, -2.9173F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1838F, -0.4571F, 0.0657F, -0.2085F, 1.3351F));

		PartDefinition body_r80 = chest.addOrReplaceChild("body_r80", CubeListBuilder.create().texOffs(125, 62).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1838F, -0.4571F, 0.155F, -0.1546F, 0.8499F));

		PartDefinition body_r81 = chest.addOrReplaceChild("body_r81", CubeListBuilder.create().texOffs(129, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1838F, -0.4571F, 0.2019F, -0.084F, 0.4608F));

		PartDefinition body_r82 = chest.addOrReplaceChild("body_r82", CubeListBuilder.create().texOffs(128, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1162F, -2.4571F, 0.1862F, -0.0762F, 0.462F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(126, 130).addBox(0.0F, -2.3015F, 0.0198F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7345F, -0.9801F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 130).addBox(0.0F, -2.1855F, -0.0838F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.7345F, -2.8801F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 130).addBox(0.0F, -1.7F, 3.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 77).addBox(0.0F, -1.7F, 1.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.0512F, -8.8856F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body_r83 = chest.addOrReplaceChild("body_r83", CubeListBuilder.create().texOffs(122, 73).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1162F, -2.4571F, 0.1434F, -0.1415F, 0.8517F));

		PartDefinition body_r84 = chest.addOrReplaceChild("body_r84", CubeListBuilder.create().texOffs(78, 10).addBox(3.9466F, -2.9173F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1162F, -2.4571F, 0.0615F, -0.1915F, 1.3359F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, -0.3096F, -7.8748F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0955F, -8.4221F, -0.281F, 0.1082F, 0.0593F));

		PartDefinition neck4_r1 = neck1.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(0.4927F, -0.5462F, -0.1195F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2725F, -3.7329F, -0.3867F, -0.3241F, 0.0716F));

		PartDefinition neck3_r1 = neck1.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(11, 96).mirror().addBox(0.4792F, -0.5241F, -0.2163F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.3904F, -6.4748F, -0.3785F, -0.1704F, 0.0381F));

		PartDefinition body_r85 = neck1.addOrReplaceChild("body_r85", CubeListBuilder.create().texOffs(126, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -0.8F, 0.5222F, 0.6398F, -0.5324F));

		PartDefinition body_r86 = neck1.addOrReplaceChild("body_r86", CubeListBuilder.create().texOffs(47, 87).mirror().addBox(-4.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6F, -0.8F, 0.2003F, 0.782F, -1.0188F));

		PartDefinition neck3_r2 = neck1.addOrReplaceChild("neck3_r2", CubeListBuilder.create().texOffs(88, 95).addBox(-0.4927F, -0.5462F, -0.1195F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2725F, -3.7329F, -0.3867F, 0.3241F, -0.0716F));

		PartDefinition neck2_r1 = neck1.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(11, 96).addBox(-0.4792F, -0.5241F, -0.2163F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3904F, -6.4748F, -0.3785F, 0.1704F, -0.0381F));

		PartDefinition cube_r48 = neck1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(113, 130).addBox(0.0F, -1.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8674F, -1.1285F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r49 = neck1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(132, 132).addBox(0.0F, -1.9289F, -0.909F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2716F, -3.0302F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r50 = neck1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(128, 5).addBox(0.0F, -1.3F, 5.8F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8716F, -12.8302F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body_r87 = neck1.addOrReplaceChild("body_r87", CubeListBuilder.create().texOffs(126, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.8F, 0.5222F, -0.6398F, 0.5324F));

		PartDefinition body_r88 = neck1.addOrReplaceChild("body_r88", CubeListBuilder.create().texOffs(47, 87).addBox(1.8478F, -0.7654F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.8F, 0.2003F, -0.782F, 1.0188F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(21, 68).addBox(-0.5F, -0.6073F, -8.0099F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2894F, -7.3583F, -0.4157F, 0.0531F, 0.1197F));

		PartDefinition neck8_r1 = neck2.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(57, 80).mirror().addBox(0.0034F, -0.6193F, 0.0257F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2796F, -2.3474F, -0.0732F, -0.216F, 0.0308F));

		PartDefinition neck7_r1 = neck2.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(87, 20).mirror().addBox(0.0109F, -0.4595F, 0.0563F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2279F, -5.9249F, -0.2651F, -0.216F, 0.0308F));

		PartDefinition neck7_r2 = neck2.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(57, 80).addBox(-0.0034F, -0.6193F, 0.0257F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2796F, -2.3474F, -0.0732F, 0.216F, -0.0308F));

		PartDefinition cube_r51 = neck2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(27, 127).addBox(0.0F, -1.2F, 2.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 126).addBox(0.0F, -0.9F, -0.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0193F, -5.5153F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck6_r1 = neck2.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(87, 20).addBox(-0.0109F, -0.4595F, 0.0563F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2279F, -5.9249F, -0.2651F, 0.216F, -0.0308F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(17, 87).addBox(-0.5F, -0.5651F, -6.0097F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(32, 127).addBox(0.0F, -1.6771F, -2.9151F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0162F, -7.6324F, -0.3962F, 0.1396F, 0.321F));

		PartDefinition neck6_r2 = neck3.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(32, 87).mirror().addBox(-0.0117F, -0.5236F, -0.0457F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0846F, -2.1541F, -0.0732F, -0.216F, 0.0308F));

		PartDefinition neck5_r1 = neck3.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(93, 36).mirror().addBox(-0.0062F, -0.3949F, -0.0443F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1307F, -5.387F, -0.0894F, -0.1728F, 0.0245F));

		PartDefinition neck5_r2 = neck3.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(32, 87).addBox(0.0117F, -0.5236F, -0.0457F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0846F, -2.1541F, -0.0732F, 0.216F, -0.0308F));

		PartDefinition neck4_r2 = neck3.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(93, 36).addBox(0.0062F, -0.3949F, -0.0443F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1307F, -5.387F, -0.0894F, 0.1728F, -0.0245F));

		PartDefinition cube_r52 = neck3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(133, 77).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9689F, -5.0132F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, -0.988F, -6.9946F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4317F, -5.9155F, -0.0843F, 0.0226F, 0.2608F));

		PartDefinition cube_r53 = neck.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(116, 133).addBox(0.0F, -0.1F, 2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 80).addBox(0.0F, 0.0F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3918F, -5.1981F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6655F, -6.8098F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r54 = neck4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(114, 95).mirror().addBox(-0.0218F, -0.5389F, -0.1426F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7383F, -1.5352F, -0.4832F, -0.1704F, 0.0381F));

		PartDefinition cube_r55 = neck4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.0149F, -0.5166F, -0.101F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8076F, 0.6591F, -0.4832F, -0.1704F, 0.0381F));

		PartDefinition cube_r56 = neck4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(110, 102).mirror().addBox(-0.004F, -0.4718F, -0.0248F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9076F, 3.7591F, -0.4309F, -0.1704F, 0.0381F));

		PartDefinition cube_r57 = neck4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(114, 95).addBox(0.0218F, -0.5389F, -0.1426F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7383F, -1.5352F, -0.4832F, 0.1704F, -0.0381F));

		PartDefinition cube_r58 = neck4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(110, 102).addBox(0.004F, -0.4718F, -0.0248F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9076F, 3.7591F, -0.4309F, 0.1704F, -0.0381F));

		PartDefinition cube_r59 = neck4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 106).addBox(0.0149F, -0.5166F, -0.101F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8076F, 0.6591F, -0.4832F, 0.1704F, -0.0381F));

		PartDefinition cube_r60 = neck4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(119, 11).addBox(0.2F, -0.7F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 110).addBox(0.2F, -0.7F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 117).addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.2F, 0.3391F, -2.2351F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head2 = neck4.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(104, 76).addBox(-1.5F, -0.8962F, -2.7616F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3525F, -2.745F, 0.6981F, 0.0F, 0.0F));

		PartDefinition head6_r1 = head2.addOrReplaceChild("head6_r1", CubeListBuilder.create().texOffs(131, 56).mirror().addBox(-0.3F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(131, 90).mirror().addBox(-0.3F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(131, 90).addBox(1.14F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(131, 56).addBox(1.14F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.92F, 0.4522F, -5.3846F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head7_r1 = head2.addOrReplaceChild("head7_r1", CubeListBuilder.create().texOffs(106, 131).mirror().addBox(-0.51F, -0.0779F, -0.2599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(15, 131).mirror().addBox(-0.51F, -0.5779F, -0.0599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(10, 131).mirror().addBox(-0.51F, -0.0779F, -0.0599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(15, 131).addBox(1.71F, -0.5779F, -0.0599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F))
				.texOffs(10, 131).addBox(1.71F, -0.0779F, -0.0599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(106, 131).addBox(1.71F, -0.0779F, -0.2599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.1F, -0.2855F, -2.6797F, 0.7243F, 0.0F, 0.0F));

		PartDefinition head6_r2 = head2.addOrReplaceChild("head6_r2", CubeListBuilder.create().texOffs(131, 103).mirror().addBox(-0.51F, -0.0787F, -0.6683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(131, 103).addBox(1.71F, -0.0787F, -0.6683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, -0.2855F, -2.6797F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head5_r1 = head2.addOrReplaceChild("head5_r1", CubeListBuilder.create().texOffs(5, 131).mirror().addBox(-0.51F, -0.308F, -0.9102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(130, 106).mirror().addBox(-0.51F, -1.008F, -0.9102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(5, 131).addBox(1.71F, -0.308F, -0.9102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F))
				.texOffs(130, 106).addBox(1.71F, -1.008F, -0.9102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.1F, -0.2855F, -2.6797F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head10_r1 = head2.addOrReplaceChild("head10_r1", CubeListBuilder.create().texOffs(46, 131).mirror().addBox(-0.51F, -0.9471F, -0.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(46, 131).addBox(1.71F, -0.9471F, -0.4893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, -0.2855F, -2.6797F, 0.2094F, 0.0F, 0.0F));

		PartDefinition head6_r3 = head2.addOrReplaceChild("head6_r3", CubeListBuilder.create().texOffs(131, 93).mirror().addBox(-0.58F, -0.5126F, -0.4956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(116, 130).mirror().addBox(-0.42F, -0.5126F, -0.4956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 93).addBox(1.78F, -0.5126F, -0.4956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(116, 130).addBox(1.62F, -0.5126F, -0.4956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.2855F, -2.6797F, 0.4363F, 0.0F, 0.0F));

		PartDefinition head5_r2 = head2.addOrReplaceChild("head5_r2", CubeListBuilder.create().texOffs(129, 121).mirror().addBox(-0.5F, -4.4719F, -1.2248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(63, 130).mirror().addBox(-0.5F, -4.4719F, -1.7248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 130).addBox(1.92F, -4.4719F, -1.7248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(129, 121).addBox(1.92F, -4.4719F, -1.2248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.21F, 4.7038F, -1.0616F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head7_r2 = head2.addOrReplaceChild("head7_r2", CubeListBuilder.create().texOffs(121, 130).mirror().addBox(-0.5F, -0.7618F, -0.254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(0, 131).mirror().addBox(-0.5F, -1.2618F, -0.254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 131).addBox(1.92F, -1.2618F, -0.254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(121, 130).addBox(1.92F, -0.7618F, -0.254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.21F, 0.2038F, -1.7616F, -0.9774F, 0.0F, 0.0F));

		PartDefinition head4_r1 = head2.addOrReplaceChild("head4_r1", CubeListBuilder.create().texOffs(129, 70).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(58, 130).mirror().addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(58, 130).addBox(1.5F, -0.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(129, 70).addBox(1.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.6141F, -0.894F, -0.1833F, 0.0F, 0.0F));

		PartDefinition head8_r1 = head2.addOrReplaceChild("head8_r1", CubeListBuilder.create().texOffs(5, 131).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(5, 131).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 131).addBox(0.92F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(5, 131).addBox(0.92F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.71F, 0.358F, -3.7047F, 0.1484F, 0.0F, 0.0F));

		PartDefinition head6_r4 = head2.addOrReplaceChild("head6_r4", CubeListBuilder.create().texOffs(5, 131).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 131).addBox(0.92F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.71F, 0.2737F, -3.7584F, 0.7069F, 0.0F, 0.0F));

		PartDefinition head3_r1 = head2.addOrReplaceChild("head3_r1", CubeListBuilder.create().texOffs(105, 77).addBox(-1.5F, -2.0703F, -0.0581F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 1.1038F, -2.7616F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone3 = head2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8962F, -2.5616F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(122, 127).addBox(-0.8F, -0.9178F, -2.0995F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(119, 48).addBox(-0.8F, -1.5178F, -0.9995F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F))
				.texOffs(119, 7).addBox(-0.8F, -0.9178F, -1.8995F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 1.9178F, -2.0005F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(119, 28).addBox(-0.9F, -0.9086F, -2.1273F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 2.2F, -2.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(126, 43).addBox(-0.9F, -0.8873F, -1.7343F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.1F, 2.0F, -0.2F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(93, 15).addBox(-0.8F, -1.5178F, -1.8995F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, 1.5178F, -0.1005F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(119, 117).addBox(-1.0F, -0.033F, 0.0161F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.026F)), PartPose.offsetAndRotation(-0.5F, 3.6F, 6.3F, -1.4617F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(119, 113).addBox(-1.0F, -0.0226F, -0.0295F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 2.8F, 6.0F, -1.1999F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(119, 109).addBox(-1.0F, -0.0691F, -0.393F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 2.6F, 5.5F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(122, 57).addBox(-1.0F, -0.0833F, -0.9729F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 2.0F, 4.8F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(121, 106).addBox(-1.0F, -0.0407F, -0.9939F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 2.6F, 5.5F, -0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(122, 121).mirror().addBox(-0.1609F, -0.4297F, -1.903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4797F, 1.6516F, 3.9642F, -0.531F, -0.3691F, 0.2678F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(122, 121).addBox(-0.8391F, -0.4297F, -1.903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4797F, 1.6516F, 3.9642F, -0.531F, 0.3691F, -0.2678F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(126, 36).addBox(-0.5F, -0.0287F, 0.0051F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 3.8F, -0.7199F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(84, 123).addBox(-0.5F, -0.0723F, -0.084F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5F, 0.6F, 2.2F, -0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(101, 125).addBox(-0.5F, -0.0287F, -0.9949F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2F, 3.8F, -0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(84, 127).addBox(-0.5F, -0.071F, -0.1561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F)), PartPose.offsetAndRotation(-0.5F, 0.6F, 1.5F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(126, 40).addBox(-0.5F, -0.0756F, -0.1034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5F, 0.8F, 0.7F, 0.24F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 1.1195F, -0.0612F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r77 = jaw2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(111, 70).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1F, 0.7279F, -4.7699F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r78 = jaw2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(9, 119).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1F, 0.9231F, -3.5102F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r79 = jaw2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(18, 119).addBox(-1.0F, -0.2447F, -0.2242F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.6798F, -4.309F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r80 = jaw2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 113).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1F, 0.9798F, -4.809F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw4_r1 = jaw2.addOrReplaceChild("jaw4_r1", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-0.5F, -0.8018F, -0.2191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 29).mirror().addBox(-0.5F, -0.8018F, 0.3809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 29).addBox(1.9F, -0.8018F, 0.3809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 12).addBox(1.9F, -0.8018F, -0.2191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.6073F, -0.1625F, 0.4538F, 0.0F, 0.0F));

		PartDefinition jaw4_r2 = jaw2.addOrReplaceChild("jaw4_r2", CubeListBuilder.create().texOffs(122, 69).mirror().addBox(-1.5F, -0.2174F, -1.8015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(122, 69).addBox(0.7F, -0.2174F, -1.8015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition jaw3_r1 = jaw2.addOrReplaceChild("jaw3_r1", CubeListBuilder.create().texOffs(116, 81).mirror().addBox(-0.5F, -0.8018F, -2.8191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(116, 81).addBox(1.7F, -0.8018F, -2.8191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.0F, 0.6073F, -0.1625F, 0.2443F, 0.0F, 0.0F));

		PartDefinition jaw5_r1 = jaw2.addOrReplaceChild("jaw5_r1", CubeListBuilder.create().texOffs(108, 122).mirror().addBox(-1.5F, -0.1857F, -1.7894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(108, 122).addBox(0.7F, -0.1857F, -1.7894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.8F, 0.2793F, 0.0F, 0.0F));

		PartDefinition upperarmL = chest.addOrReplaceChild("upperarmL", CubeListBuilder.create().texOffs(119, 36).addBox(-0.2479F, -0.3958F, -0.482F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(55, 121).addBox(-0.2479F, 2.6042F, -0.482F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(4.5669F, 7.9355F, -6.3857F, -0.8776F, -0.3328F, -0.6064F));

		PartDefinition upperarm4_r1 = upperarmL.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(116, 86).addBox(-0.5F, -3.8768F, -0.2206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5521F, 2.4042F, -1.882F, -0.384F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarmL.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(48, 119).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5521F, 2.6042F, -0.982F, 0.5236F, 0.0F, 0.0F));

		PartDefinition lowerarmL = upperarmL.addOrReplaceChild("lowerarmL", CubeListBuilder.create().texOffs(37, 98).addBox(-1.0591F, -0.297F, -5.2888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.21F))
				.texOffs(24, 96).addBox(-1.0591F, -1.697F, -5.4888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7226F, 8.0147F, 0.448F, 0.6955F, 0.0337F, 0.3747F));

		PartDefinition handL = lowerarmL.addOrReplaceChild("handL", CubeListBuilder.create().texOffs(90, 75).addBox(-1.0F, -1.65F, -5.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1409F, -0.397F, -5.4888F, 0.0F, 0.4363F, 0.0F));

		PartDefinition thumbclawL = handL.addOrReplaceChild("thumbclawL", CubeListBuilder.create().texOffs(103, 81).addBox(-1.7F, -0.6F, -3.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition upperarmL2 = chest.addOrReplaceChild("upperarmL2", CubeListBuilder.create().texOffs(119, 42).addBox(-0.7521F, -0.3958F, -0.482F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(96, 121).addBox(-0.7521F, 2.6042F, -0.482F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.19F)), PartPose.offsetAndRotation(-4.3669F, 7.9355F, -6.3857F, 0.5109F, 0.4386F, 0.2007F));

		PartDefinition upperarm5_r1 = upperarmL2.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(64, 117).addBox(-0.5F, -3.8768F, -0.2206F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5521F, 2.4042F, -1.882F, -0.384F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarmL2.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(101, 119).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5521F, 2.6042F, -0.982F, 0.5236F, 0.0F, 0.0F));

		PartDefinition lowerarmL2 = upperarmL2.addOrReplaceChild("lowerarmL2", CubeListBuilder.create().texOffs(50, 101).addBox(0.0591F, -0.297F, -5.2888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.21F))
				.texOffs(97, 0).addBox(0.0591F, -1.697F, -5.4888F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7226F, 8.0147F, 0.448F, 0.6716F, -0.1996F, -0.1706F));

		PartDefinition handL2 = lowerarmL2.addOrReplaceChild("handL2", CubeListBuilder.create().texOffs(90, 85).addBox(0.0F, -1.65F, -5.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.1409F, -0.397F, -5.4888F, 0.0F, -0.4363F, 0.0F));

		PartDefinition thumbclawL2 = handL2.addOrReplaceChild("thumbclawL2", CubeListBuilder.create().texOffs(11, 104).addBox(-0.3F, -0.6F, -3.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -1.2F, -0.9F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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