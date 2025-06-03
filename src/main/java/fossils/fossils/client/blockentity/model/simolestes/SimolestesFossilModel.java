package fossils.fossils.client.blockentity.model.simolestes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SimolestesFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Pliosaurus;
	private final ModelPart Chest;
	private final ModelPart Shoulder;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperL;
	private final ModelPart FrontFlipperMiddleL;
	private final ModelPart FrontFlipperEndL;
	private final ModelPart FrontFlipperL2;
	private final ModelPart FrontFlipperMiddleL2;
	private final ModelPart FrontFlipperEndL2;
	private final ModelPart BackFlipperL;
	private final ModelPart BackFlipperMiddleL;
	private final ModelPart BackFlipperEndL;
	private final ModelPart BackFlipperL2;
	private final ModelPart BackFlipperMiddleL2;
	private final ModelPart BackFlipperEndL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public SimolestesFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Pliosaurus = this.fossil.getChild("Pliosaurus");
		this.Chest = this.Pliosaurus.getChild("Chest");
		this.Shoulder = this.Chest.getChild("Shoulder");
		this.Neck3 = this.Shoulder.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperL = this.Shoulder.getChild("FrontFlipperL");
		this.FrontFlipperMiddleL = this.FrontFlipperL.getChild("FrontFlipperMiddleL");
		this.FrontFlipperEndL = this.FrontFlipperMiddleL.getChild("FrontFlipperEndL");
		this.FrontFlipperL2 = this.Shoulder.getChild("FrontFlipperL2");
		this.FrontFlipperMiddleL2 = this.FrontFlipperL2.getChild("FrontFlipperMiddleL2");
		this.FrontFlipperEndL2 = this.FrontFlipperMiddleL2.getChild("FrontFlipperEndL2");
		this.BackFlipperL = this.Pliosaurus.getChild("BackFlipperL");
		this.BackFlipperMiddleL = this.BackFlipperL.getChild("BackFlipperMiddleL");
		this.BackFlipperEndL = this.BackFlipperMiddleL.getChild("BackFlipperEndL");
		this.BackFlipperL2 = this.Pliosaurus.getChild("BackFlipperL2");
		this.BackFlipperMiddleL2 = this.BackFlipperL2.getChild("BackFlipperMiddleL2");
		this.BackFlipperEndL2 = this.BackFlipperMiddleL2.getChild("BackFlipperEndL2");
		this.Tail1 = this.Pliosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Pliosaurus = fossil.addOrReplaceChild("Pliosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -11.0F, 18.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Pliosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 24).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 0.9973F, -0.0782F, 0.1215F, -0.1397F));

		PartDefinition cube_r2 = Pliosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(85, 10).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 0.9973F, -0.115F, 0.0875F, -0.489F));

		PartDefinition cube_r3 = Pliosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 20).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.6835F, -1.0027F, -0.115F, 0.0875F, -0.489F));

		PartDefinition cube_r4 = Pliosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 56).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.6835F, -1.0027F, -0.0782F, 0.1215F, -0.1397F));

		PartDefinition basin_r1 = Pliosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-4.1302F, -0.9844F, 4.366F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.5F, 4.3032F, -3.0741F, 0.3273F, -0.7581F, -0.2293F));

		PartDefinition basin_r2 = Pliosaurus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-8.1F, -0.9844F, -0.3484F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 22).mirror().addBox(-4.1F, -0.9844F, -0.3484F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 37).addBox(0.1F, -0.9844F, -0.3484F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 22).addBox(-1.9F, -0.9844F, -0.3484F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.3032F, -3.0741F, 0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r3 = Pliosaurus.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(44, 30).mirror().addBox(-0.1F, 4.0886F, -0.4614F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-7.5F, 0.0032F, -7.1741F, 0.2168F, 0.3844F, 0.0824F));

		PartDefinition basin_r4 = Pliosaurus.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(26, 33).mirror().addBox(-11.1F, 0.5F, -18.1F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 33).addBox(-3.9F, 0.5F, -18.1F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0032F, 10.8259F, 0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r5 = Pliosaurus.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(37, 42).mirror().addBox(0.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8881F, 1.6831F, -1.4902F, 0.9331F, 0.1807F, 0.2796F));

		PartDefinition basin_r6 = Pliosaurus.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(0, 40).addBox(-1.8698F, -0.9844F, 4.366F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.5F, 4.3032F, -3.0741F, 0.3273F, 0.7581F, 0.2293F));

		PartDefinition basin_r7 = Pliosaurus.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(44, 30).addBox(-5.9F, 4.0886F, -0.4614F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.5F, 0.0032F, -7.1741F, 0.2168F, -0.3844F, -0.0824F));

		PartDefinition basin_r8 = Pliosaurus.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(37, 42).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.8881F, 1.6831F, -1.4902F, 0.9331F, -0.1807F, -0.2796F));

		PartDefinition basin_r9 = Pliosaurus.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(54, 75).addBox(0.0F, -0.8133F, 2.8473F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 75).addBox(0.0F, -0.9133F, 0.8473F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 53).addBox(-1.0F, 0.5867F, -0.1527F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Pliosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 10).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 0.9973F, -0.115F, -0.0875F, 0.489F));

		PartDefinition cube_r6 = Pliosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 24).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 0.9973F, -0.0782F, -0.1215F, 0.1397F));

		PartDefinition cube_r7 = Pliosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 56).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6835F, -1.0027F, -0.0782F, -0.1215F, 0.1397F));

		PartDefinition cube_r8 = Pliosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(85, 20).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6835F, -1.0027F, -0.115F, -0.0875F, 0.489F));

		PartDefinition Chest = Pliosaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.3F, -0.1489F, -0.0863F, 0.0129F));

		PartDefinition cube_r9 = Chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -7.3007F, -15.5209F, 15.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 10.7302F, 4.8749F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 13).addBox(-0.5F, -1.5602F, 8.5791F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 22).addBox(-0.5F, -1.7602F, 6.5791F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 0).addBox(-0.5F, -1.8602F, 4.5791F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 37).addBox(-0.5F, -1.9602F, 2.5791F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).addBox(-0.5F, -1.9602F, 0.5791F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 9).addBox(-1.5F, -0.0602F, -0.4209F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0959F, -9.449F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(87, 24).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2038F, -0.4895F, -0.0782F, 0.1215F, -0.1397F));

		PartDefinition cube_r12 = Chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 85).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2038F, -0.4895F, -0.115F, 0.0875F, -0.489F));

		PartDefinition cube_r13 = Chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 56).mirror().addBox(-4.8896F, -2.9733F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2038F, -2.4895F, -0.1147F, 0.0656F, -0.9212F));

		PartDefinition cube_r14 = Chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 86).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2038F, -2.4895F, -0.0763F, 0.1079F, -0.4852F));

		PartDefinition cube_r15 = Chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2038F, -2.4895F, -0.0346F, 0.1275F, -0.1343F));

		PartDefinition cube_r16 = Chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(86, 16).mirror().addBox(-5.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3038F, -4.4895F, -0.0614F, 0.135F, -0.9159F));

		PartDefinition cube_r17 = Chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3038F, -4.4895F, 0.0018F, 0.1482F, -0.4753F));

		PartDefinition cube_r18 = Chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3038F, -4.4895F, 0.0527F, 0.1386F, -0.1227F));

		PartDefinition cube_r19 = Chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(27, 49).mirror().addBox(-6.8896F, -2.9733F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.5038F, -6.4895F, -0.0614F, 0.135F, -0.9159F));

		PartDefinition cube_r20 = Chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(27, 86).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.5038F, -6.4895F, 0.0018F, 0.1482F, -0.4753F));

		PartDefinition cube_r21 = Chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(74, 83).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.5038F, -6.4895F, 0.0527F, 0.1386F, -0.1227F));

		PartDefinition cube_r22 = Chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6038F, -8.1895F, 0.1052F, 0.1449F, -0.1152F));

		PartDefinition cube_r23 = Chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6038F, -8.1895F, 0.049F, 0.172F, -0.4677F));

		PartDefinition cube_r24 = Chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-7.8896F, -2.9733F, -0.4953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6038F, -8.1895F, -0.029F, 0.1765F, -0.9109F));

		PartDefinition cube_r25 = Chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 85).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2038F, -0.4895F, -0.115F, -0.0875F, 0.489F));

		PartDefinition cube_r26 = Chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(87, 24).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2038F, -0.4895F, -0.0782F, -0.1215F, 0.1397F));

		PartDefinition cube_r27 = Chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(82, 72).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2038F, -2.4895F, -0.0346F, -0.1275F, 0.1343F));

		PartDefinition cube_r28 = Chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(13, 86).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2038F, -2.4895F, -0.0763F, -0.1079F, 0.4852F));

		PartDefinition cube_r29 = Chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(55, 56).addBox(3.8896F, -2.9733F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2038F, -2.4895F, -0.1147F, -0.0656F, 0.9212F));

		PartDefinition cube_r30 = Chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(83, 8).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3038F, -4.4895F, 0.0527F, -0.1386F, 0.1227F));

		PartDefinition cube_r31 = Chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(20, 86).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3038F, -4.4895F, 0.0018F, -0.1482F, 0.4753F));

		PartDefinition cube_r32 = Chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 16).addBox(3.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3038F, -4.4895F, -0.0614F, -0.135F, 0.9159F));

		PartDefinition cube_r33 = Chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(74, 83).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5038F, -6.4895F, 0.0527F, -0.1386F, 0.1227F));

		PartDefinition cube_r34 = Chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(27, 86).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5038F, -6.4895F, 0.0018F, -0.1482F, 0.4753F));

		PartDefinition cube_r35 = Chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(27, 49).addBox(3.8896F, -2.9733F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5038F, -6.4895F, -0.0614F, -0.135F, 0.9159F));

		PartDefinition cube_r36 = Chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(47, 35).addBox(3.8896F, -2.9733F, -0.4953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.6038F, -8.1895F, -0.029F, -0.1765F, 0.9109F));

		PartDefinition cube_r37 = Chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(45, 86).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.6038F, -8.1895F, 0.049F, -0.172F, 0.4677F));

		PartDefinition cube_r38 = Chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(83, 76).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.6038F, -8.1895F, 0.1052F, -0.1449F, 0.1152F));

		PartDefinition Shoulder = Chest.addOrReplaceChild("Shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2041F, -9.649F, 0.2009F, -0.0428F, -0.0087F));

		PartDefinition cube_r39 = Shoulder.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0004F, -12.1405F, 0.1578F, 0.1507F, -0.1075F));

		PartDefinition cube_r40 = Shoulder.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(86, 55).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0004F, -12.1405F, 0.0967F, 0.1954F, -0.459F));

		PartDefinition cube_r41 = Shoulder.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-7.8896F, -2.9733F, -0.4953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0004F, -12.1405F, 0.0038F, 0.2177F, -0.9044F));

		PartDefinition cube_r42 = Shoulder.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(29, 69).mirror().addBox(-8.8896F, -2.9733F, -0.4953F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4996F, -0.3405F, -0.1463F, 0.0239F, -0.9226F));

		PartDefinition cube_r43 = Shoulder.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4996F, -0.3405F, -0.1227F, 0.0834F, -0.4897F));

		PartDefinition cube_r44 = Shoulder.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4996F, -0.3405F, -0.0869F, 0.1203F, -0.1407F));

		PartDefinition cube_r45 = Shoulder.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-9.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3996F, -2.1405F, -0.1252F, 0.0517F, -0.9218F));

		PartDefinition cube_r46 = Shoulder.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 60).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3996F, -2.1405F, -0.0918F, 0.0998F, -0.4868F));

		PartDefinition cube_r47 = Shoulder.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3996F, -2.1405F, -0.0521F, 0.1251F, -0.1364F));

		PartDefinition cube_r48 = Shoulder.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-9.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1996F, -4.1405F, -0.1147F, 0.0656F, -0.9212F));

		PartDefinition cube_r49 = Shoulder.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1996F, -4.1405F, -0.0763F, 0.1079F, -0.4852F));

		PartDefinition cube_r50 = Shoulder.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(18, 84).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1996F, -4.1405F, -0.0346F, 0.1275F, -0.1343F));

		PartDefinition cube_r51 = Shoulder.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(73, 35).mirror().addBox(-9.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0996F, -6.1405F, -0.1041F, 0.0795F, -0.9204F));

		PartDefinition cube_r52 = Shoulder.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 86).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0996F, -6.1405F, -0.0607F, 0.116F, -0.4835F));

		PartDefinition cube_r53 = Shoulder.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0996F, -6.1405F, -0.0172F, 0.1298F, -0.132F));

		PartDefinition cube_r54 = Shoulder.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(74, 14).mirror().addBox(-9.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0004F, -8.1405F, -0.0828F, 0.1073F, -0.9185F));

		PartDefinition cube_r55 = Shoulder.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(86, 80).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0004F, -8.1405F, -0.0295F, 0.1322F, -0.4796F));

		PartDefinition cube_r56 = Shoulder.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0004F, -8.1405F, 0.0177F, 0.1343F, -0.1274F));

		PartDefinition cube_r57 = Shoulder.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(76, 2).mirror().addBox(-8.8896F, -2.9733F, -0.4953F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -10.1405F, -0.0507F, 0.1489F, -0.9144F));

		PartDefinition cube_r58 = Shoulder.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -10.1405F, 0.0175F, 0.1562F, -0.4729F));

		PartDefinition cube_r59 = Shoulder.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -10.1405F, 0.0702F, 0.1408F, -0.1202F));

		PartDefinition cube_r60 = Shoulder.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(3.0014F, -5.9604F, -2.0985F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, 0.7139F, -0.5256F, -0.41F));

		PartDefinition cube_r61 = Shoulder.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-0.0155F, 0.1469F, -3.8703F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.71F, 5.4473F, -10.4674F, -0.4609F, -0.8535F, 0.3581F));

		PartDefinition cube_r62 = Shoulder.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(0.9359F, -3.5167F, -0.4114F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, -0.7215F, 0.696F, -0.4184F));

		PartDefinition cube_r63 = Shoulder.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(3.471F, -3.5167F, -1.4284F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, -0.5991F, 0.4536F, -0.1956F));

		PartDefinition cube_r64 = Shoulder.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(3.9922F, -3.5167F, -4.5483F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, -0.5431F, 0.196F, -0.0219F));

		PartDefinition cube_r65 = Shoulder.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(18, 25).mirror().addBox(1.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 62).mirror().addBox(-1.69F, -0.9349F, 3.7642F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(18, 25).addBox(4.51F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 62).addBox(4.51F, -0.9349F, 3.7642F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.91F, 5.4473F, -14.1674F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Shoulder.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-5.4749F, 0.0184F, 5.5696F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 5.4473F, -14.1674F, -0.1408F, 0.5193F, -0.0702F));

		PartDefinition cube_r67 = Shoulder.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(68, 31).mirror().addBox(-1.3532F, -0.9349F, 3.9994F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 5.4473F, -14.1674F, -0.2995F, -0.1335F, 0.0411F));

		PartDefinition cube_r68 = Shoulder.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(-1.4575F, 0.0272F, 5.8202F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 5.4473F, -14.1674F, -0.1234F, -0.1386F, 0.0171F));

		PartDefinition cube_r69 = Shoulder.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.69F, 0.0272F, 5.5917F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 0).addBox(4.51F, 0.0272F, 5.5917F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.91F, 5.4473F, -14.1674F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Shoulder.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 9).addBox(-4.0014F, -5.9604F, -2.0985F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, 0.7139F, 0.5256F, 0.41F));

		PartDefinition cube_r71 = Shoulder.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(63, 12).addBox(-2.9845F, 0.1469F, -3.8703F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.71F, 5.4473F, -10.4674F, -0.4609F, 0.8535F, -0.3581F));

		PartDefinition cube_r72 = Shoulder.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 25).addBox(-6.9359F, -3.5167F, -0.4114F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, -0.7215F, -0.696F, 0.4184F));

		PartDefinition cube_r73 = Shoulder.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(71, 74).addBox(-8.471F, -3.5167F, -1.4284F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, -0.5991F, -0.4536F, 0.1956F));

		PartDefinition cube_r74 = Shoulder.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(71, 5).addBox(-7.9922F, -3.5167F, -4.5483F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, -0.5431F, -0.196F, 0.0219F));

		PartDefinition cube_r75 = Shoulder.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 0).addBox(0.4749F, 0.0184F, 5.5696F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.91F, 5.4473F, -14.1674F, -0.1408F, -0.5193F, 0.0702F));

		PartDefinition cube_r76 = Shoulder.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(68, 31).addBox(-2.6468F, -0.9349F, 3.9994F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.91F, 5.4473F, -14.1674F, -0.2995F, 0.1335F, -0.0411F));

		PartDefinition cube_r77 = Shoulder.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(47, 46).addBox(-1.5425F, 0.0272F, 5.8202F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.91F, 5.4473F, -14.1674F, -0.1234F, 0.1386F, -0.0171F));

		PartDefinition cube_r78 = Shoulder.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(34, 86).addBox(0.0F, -1.9F, 12.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 86).addBox(0.0F, -1.9F, 10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 86).addBox(0.0F, -2.0F, 8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 87).addBox(0.0F, -1.9F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 87).addBox(0.0F, -1.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 43).addBox(0.0F, -1.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 87).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0004F, -12.6405F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Shoulder.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 83).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4996F, -0.3405F, -0.0869F, -0.1203F, 0.1407F));

		PartDefinition cube_r80 = Shoulder.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(57, 86).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4996F, -0.3405F, -0.1227F, -0.0834F, 0.4897F));

		PartDefinition cube_r81 = Shoulder.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(29, 69).addBox(3.8896F, -2.9733F, -0.4953F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4996F, -0.3405F, -0.1463F, -0.0239F, 0.9226F));

		PartDefinition cube_r82 = Shoulder.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(84, 6).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3996F, -2.1405F, -0.0521F, -0.1251F, 0.1364F));

		PartDefinition cube_r83 = Shoulder.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(86, 60).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3996F, -2.1405F, -0.0918F, -0.0998F, 0.4868F));

		PartDefinition cube_r84 = Shoulder.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 43).addBox(3.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3996F, -2.1405F, -0.1252F, -0.0517F, 0.9218F));

		PartDefinition cube_r85 = Shoulder.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(18, 84).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1996F, -4.1405F, -0.0346F, -0.1275F, 0.1343F));

		PartDefinition cube_r86 = Shoulder.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(86, 62).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1996F, -4.1405F, -0.0763F, -0.1079F, 0.4852F));

		PartDefinition cube_r87 = Shoulder.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(73, 0).addBox(3.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1996F, -4.1405F, -0.1147F, -0.0656F, 0.9212F));

		PartDefinition cube_r88 = Shoulder.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(25, 84).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0996F, -6.1405F, -0.0172F, -0.1298F, 0.132F));

		PartDefinition cube_r89 = Shoulder.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(64, 86).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0996F, -6.1405F, -0.0607F, -0.116F, 0.4835F));

		PartDefinition cube_r90 = Shoulder.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(73, 35).addBox(3.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0996F, -6.1405F, -0.1041F, -0.0795F, 0.9204F));

		PartDefinition cube_r91 = Shoulder.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 53).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0004F, -8.1405F, 0.0177F, -0.1343F, 0.1274F));

		PartDefinition cube_r92 = Shoulder.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(86, 80).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0004F, -8.1405F, -0.0295F, -0.1322F, 0.4796F));

		PartDefinition cube_r93 = Shoulder.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 14).addBox(3.8896F, -2.9733F, -0.4953F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0004F, -8.1405F, -0.0828F, -0.1073F, 0.9185F));

		PartDefinition cube_r94 = Shoulder.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 37).addBox(3.8896F, -2.9733F, -0.4953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0004F, -12.1405F, 0.0038F, -0.2177F, 0.9044F));

		PartDefinition cube_r95 = Shoulder.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(86, 55).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0004F, -12.1405F, 0.0967F, -0.1954F, 0.459F));

		PartDefinition cube_r96 = Shoulder.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(83, 78).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0004F, -12.1405F, 0.1578F, -0.1507F, 0.1075F));

		PartDefinition cube_r97 = Shoulder.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(84, 58).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -10.1405F, 0.0702F, -0.1408F, 0.1202F));

		PartDefinition cube_r98 = Shoulder.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(86, 86).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -10.1405F, 0.0175F, -0.1562F, 0.4729F));

		PartDefinition cube_r99 = Shoulder.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(76, 2).addBox(3.8896F, -2.9733F, -0.4953F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -10.1405F, -0.0507F, -0.1489F, 0.9144F));

		PartDefinition Neck3 = Shoulder.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(15, 56).addBox(-1.5F, -0.7754F, -4.8057F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(74, 87).addBox(-0.5F, -2.3754F, -3.8057F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 87).addBox(-0.5F, -2.3754F, -1.8057F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2077F, -12.5223F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r100 = Neck3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -3.4182F, 0.1754F, 0.1525F, -0.1048F));

		PartDefinition cube_r101 = Neck3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(85, 68).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -3.4182F, 0.1126F, 0.2032F, -0.4559F));

		PartDefinition cube_r102 = Neck3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 85).mirror().addBox(-5.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -3.4182F, 0.0149F, 0.2314F, -0.9019F));

		PartDefinition cube_r103 = Neck3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -1.4182F, 0.1754F, 0.1525F, -0.1048F));

		PartDefinition cube_r104 = Neck3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -1.4182F, 0.1126F, 0.2032F, -0.4559F));

		PartDefinition cube_r105 = Neck3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(6, 86).mirror().addBox(-5.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -1.4182F, 0.0149F, 0.2314F, -0.9019F));

		PartDefinition cube_r106 = Neck3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(73, 85).addBox(3.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -3.4182F, 0.0149F, -0.2314F, 0.9019F));

		PartDefinition cube_r107 = Neck3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(85, 68).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -3.4182F, 0.1126F, -0.2032F, 0.4559F));

		PartDefinition cube_r108 = Neck3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(7, 72).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -3.4182F, 0.1754F, -0.1525F, 0.1048F));

		PartDefinition cube_r109 = Neck3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(6, 86).addBox(3.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -1.4182F, 0.0149F, -0.2314F, 0.9019F));

		PartDefinition cube_r110 = Neck3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(80, 85).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -1.4182F, 0.1126F, -0.2032F, 0.4559F));

		PartDefinition cube_r111 = Neck3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(82, 4).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -1.4182F, 0.1754F, -0.1525F, 0.1048F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -4.7F, -0.1752F, -0.1744F, 0.0077F));

		PartDefinition cube_r112 = Neck2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(77, 87).addBox(-0.5F, -3.6F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 87).addBox(-0.5F, -3.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 87).addBox(-0.5F, -3.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(-1.5F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.1556F, -4.9315F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Neck2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-2.9495F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -4.7269F, 0.308F, 0.2358F, -0.5613F));

		PartDefinition cube_r114 = Neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(85, 39).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -2.7269F, 0.2583F, 0.2896F, -0.7522F));

		PartDefinition cube_r115 = Neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -2.7269F, 0.3399F, 0.1857F, -0.409F));

		PartDefinition cube_r116 = Neck2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(20, 45).mirror().addBox(-4.286F, -2.1868F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -0.7269F, 0.0373F, 0.2588F, -1.0361F));

		PartDefinition cube_r117 = Neck2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(85, 66).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -0.7269F, 0.1447F, 0.2184F, -0.5888F));

		PartDefinition cube_r118 = Neck2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(18, 71).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -0.7269F, 0.2105F, 0.1561F, -0.2391F));

		PartDefinition cube_r119 = Neck2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(43, 19).addBox(-0.0505F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -4.7269F, 0.308F, -0.2358F, 0.5613F));

		PartDefinition cube_r120 = Neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 56).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -2.7269F, 0.3399F, -0.1857F, 0.409F));

		PartDefinition cube_r121 = Neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(85, 39).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -2.7269F, 0.2583F, -0.2896F, 0.7522F));

		PartDefinition cube_r122 = Neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(18, 71).addBox(-0.0505F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -0.7269F, 0.2105F, -0.1561F, 0.2391F));

		PartDefinition cube_r123 = Neck2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(85, 66).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -0.7269F, 0.1447F, -0.2184F, 0.5888F));

		PartDefinition cube_r124 = Neck2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(20, 45).addBox(3.286F, -2.1868F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -0.7269F, 0.0373F, -0.2588F, 1.0361F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4444F, -4.8315F, -0.1923F, -0.1745F, 0.0031F));

		PartDefinition cube_r125 = Neck1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(6, 88).addBox(-0.5F, -1.6F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 88).addBox(-0.5F, -1.3F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 66).addBox(-1.5F, -0.3F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(54, 63).addBox(-1.5F, -0.3F, -0.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0646F, -3.759F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Neck1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.5604F, -0.3415F, -2.6003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 56).mirror().addBox(-2.0186F, 0.2345F, -0.7407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1781F, -1.5961F, 0.308F, 0.2358F, -0.5613F));

		PartDefinition cube_r127 = Neck1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 31).addBox(-0.4396F, -0.3415F, -2.6003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 56).addBox(0.0186F, 0.2345F, -0.7407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1781F, -1.5961F, 0.308F, -0.2358F, 0.5613F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(81, 30).addBox(-1.5F, -1.9644F, -5.3514F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 81).addBox(-2.0F, -1.4644F, -1.9514F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 8).addBox(-1.0F, 0.9F, -6.9777F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2301F, -4.4901F, -0.3424F, -0.01F, 0.2345F));

		PartDefinition cube_r128 = Head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(79, 39).addBox(-1.952F, -0.0382F, -2.9196F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -1.5981F, -13.957F, 0.0733F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(32, 42).addBox(-2.452F, 0.3776F, -2.9102F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -1.5981F, -13.957F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(58, 30).addBox(-2.452F, -0.0107F, -4.9722F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -1.4981F, -9.057F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-2.8F, -0.4F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 75).addBox(2.8F, -0.4F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7407F, -7.0083F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4187F, -1.3394F, -2.2855F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.952F, 1.8019F, -9.057F, -0.0947F, 0.0601F, 0.1696F));

		PartDefinition cube_r133 = Head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(0.5858F, -0.2479F, -0.3206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.1854F, -12.2661F, -0.0085F, 0.0019F, 0.2182F));

		PartDefinition cube_r134 = Head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(18, 88).mirror().addBox(1.0956F, -0.2575F, -0.2356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.5759F, -13.3609F, -0.1481F, 0.0019F, 0.2182F));

		PartDefinition cube_r135 = Head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(0.0216F, -0.9031F, -0.4881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4954F, 0.0446F, -14.82F, -0.128F, 0.0267F, 0.4086F));

		PartDefinition cube_r136 = Head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(12, 88).mirror().addBox(0.0649F, -0.8103F, -0.4515F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4975F, -0.558F, -16.1926F, -0.3052F, 0.0019F, 0.2182F));

		PartDefinition cube_r137 = Head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(0.2F, -1.0F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9263F, -0.3817F, -17.1414F, -1.5495F, -1.0926F, 1.7197F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 0).addBox(0.4187F, -1.3394F, -2.2855F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, 1.8019F, -9.057F, -0.0947F, -0.0601F, -0.1696F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(18, 88).addBox(-1.0956F, -0.2575F, -0.2356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.5759F, -13.3609F, -0.1481F, -0.0019F, -0.2182F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 66).addBox(-0.0216F, -0.9031F, -0.4881F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4954F, 0.0446F, -14.82F, -0.128F, -0.0267F, -0.4086F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(50, 67).addBox(-0.2F, -1.0F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0737F, -0.3817F, -17.1414F, -1.5495F, 1.0926F, -1.7197F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(12, 88).addBox(-0.0649F, -0.8103F, -0.4515F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4975F, -0.558F, -16.1926F, -0.3052F, -0.0019F, -0.2182F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(15, 88).addBox(-0.5858F, -0.2479F, -0.3206F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.1854F, -12.2661F, -0.0085F, -0.0019F, -0.2182F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 17).addBox(-3.452F, -1.9823F, -4.1882F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(53, 24).addBox(-3.952F, -1.9823F, -2.2882F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.952F, 1.8019F, -9.057F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(58, 78).addBox(-2.952F, -1.0049F, -1.9306F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.952F, 0.9019F, -13.257F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(20, 42).addBox(-2.952F, 0.7338F, -4.2944F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -1.4981F, -9.057F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.8902F, -0.2418F, -8.9133F, 0.4094F, -0.0164F, 0.0153F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.5F, -1.3F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.6952F, 0.2946F, -6.2485F, 0.2523F, -0.1037F, 0.0146F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(42, 80).mirror().addBox(-1.8747F, 0.8619F, 3.4932F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(80, 25).mirror().addBox(-2.0949F, 0.8619F, 3.4932F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-1.1921F, -1.6487F, -11.0976F, 0.008F, -0.1037F, 0.0146F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(8, 9).mirror().addBox(-1.2401F, 2.309F, -2.2225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.1921F, -1.6487F, -11.0976F, 1.7602F, -0.1901F, 0.027F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(-2.2469F, 0.2097F, -0.8529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.1921F, -1.4487F, -5.7976F, 0.7828F, -0.1901F, 0.027F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-0.3382F, -0.2717F, -0.0067F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.04F)).mirror(false), PartPose.offsetAndRotation(-3.1363F, -0.1117F, -5.9861F, 1.1319F, -0.1901F, 0.027F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(8, 9).addBox(0.2401F, 2.309F, -2.2225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.1921F, -1.6487F, -11.0976F, 1.7602F, 0.1901F, -0.027F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(15, 58).addBox(1.2469F, 0.2097F, -0.8529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.1921F, -1.4487F, -5.7976F, 0.7828F, 0.1901F, -0.027F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 9).addBox(-0.6618F, -0.2717F, -0.0067F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(2.1363F, -0.1117F, -5.9861F, 1.1319F, 0.1901F, -0.027F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(71, 47).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.8902F, -0.2418F, -8.9133F, 0.4094F, 0.0164F, -0.0153F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(80, 25).addBox(0.0949F, 0.8619F, 3.4932F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(42, 80).addBox(-0.1253F, 0.8619F, 3.4932F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1921F, -1.6487F, -11.0976F, 0.008F, 0.1037F, -0.0146F));

		PartDefinition cube_r158 = Head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, -1.3F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.6952F, 0.2946F, -6.2485F, 0.2523F, 0.1037F, -0.0146F));

		PartDefinition cube_r159 = Head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(36, 22).addBox(-4.1921F, -0.2768F, -0.1749F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6921F, -1.2487F, -9.0976F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(64, 18).addBox(-4.6921F, -0.1164F, 0.0951F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6921F, -1.7487F, -6.3976F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-4.5F, 3.9F, 1.9F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 76).addBox(0.5F, 3.9F, 1.9F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.1644F, -3.4514F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(16, 33).mirror().addBox(-0.8F, -1.0F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.8356F, -7.4514F, -0.0781F, -0.3054F, -0.0028F));

		PartDefinition cube_r163 = Head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(1.0F, -3.7F, -0.7F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 76).addBox(8.0F, -3.7F, -0.7F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 2.1121F, 0.7764F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(51, 81).mirror().addBox(-0.2795F, 1.0726F, 0.2143F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 0.2382F, -3.5005F, 0.9254F, -0.0697F, 0.0079F));

		PartDefinition cube_r165 = Head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(11, 71).mirror().addBox(-0.2795F, -0.2244F, 0.0634F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 0.2382F, -3.5005F, 0.4541F, -0.0697F, 0.0079F));

		PartDefinition cube_r166 = Head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-0.5F, -0.4026F, -6.7509F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, 0.2382F, -0.3005F, 0.0F, -0.5061F, 0.0F));

		PartDefinition cube_r167 = Head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(16, 33).addBox(-0.2F, -1.0F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8356F, -7.4514F, -0.0781F, 0.3054F, 0.0028F));

		PartDefinition cube_r168 = Head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(33, 13).addBox(-3.0F, -0.9F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9452F, -5.0163F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(51, 81).addBox(-0.7205F, 1.0726F, 0.2143F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.2F, 0.2382F, -3.5005F, 0.9254F, 0.0697F, -0.0079F));

		PartDefinition cube_r170 = Head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(11, 71).addBox(-0.7205F, -0.2244F, 0.0634F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, 0.2382F, -3.5005F, 0.4541F, 0.0697F, -0.0079F));

		PartDefinition cube_r171 = Head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(34, 10).addBox(-3.5F, -7.9F, 3.6F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 28).addBox(-1.0F, -7.7F, -0.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(9, 77).addBox(-1.5F, -7.9F, 2.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(9, 77).addBox(-1.5F, -7.9F, 0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.0356F, -3.4514F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(29, 64).addBox(-2.5F, 2.9F, -0.4F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.9644F, -1.4514F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(43, 6).addBox(-1.0F, -0.7461F, -0.3371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4644F, -4.3514F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(54, 16).addBox(-1.0F, -0.0103F, -1.0076F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2644F, -4.4514F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(74, 62).addBox(-0.5F, -0.4026F, -6.7509F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.2382F, -0.3005F, 0.0F, 0.5061F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.1357F, 0.8573F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(24, 9).mirror().addBox(-0.1596F, -0.9436F, 1.4518F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1897F, -1.465F, -15.5758F, -0.226F, -0.1923F, -0.3527F));

		PartDefinition cube_r177 = Jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0056F, -2.2205F, -14.865F, -0.2308F, -0.2773F, -0.3324F));

		PartDefinition cube_r178 = Jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(-0.1529F, -1.8408F, -0.1617F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1897F, -2.065F, -16.6758F, -0.1388F, -0.1923F, -0.3527F));

		PartDefinition cube_r179 = Jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(18, 9).mirror().addBox(0.0F, -1.0949F, -0.5783F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1897F, -2.065F, -17.4758F, -0.0054F, -0.2041F, -0.673F));

		PartDefinition cube_r180 = Jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-1.0F, -1.0898F, -10.3839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2013F, -7.8769F, -0.1309F, -0.1571F, 0.0F));

		PartDefinition cube_r181 = Jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.0F, 0.9733F, -8.379F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2013F, -7.8769F, -0.3752F, -0.1571F, 0.0F));

		PartDefinition cube_r182 = Jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(12, 42).mirror().addBox(-1.0129F, 0.0175F, -6.8428F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.4987F, -5.8769F, 0.0087F, -0.1571F, 0.0F));

		PartDefinition cube_r183 = Jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.0F, -0.9336F, -5.6126F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2013F, -7.8769F, -0.0262F, -0.1571F, 0.0F));

		PartDefinition cube_r184 = Jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-1.0F, 3.8436F, -9.197F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2013F, -7.8769F, -0.6283F, -0.1571F, 0.0F));

		PartDefinition cube_r185 = Jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(79, 20).mirror().addBox(-1.0F, -0.3355F, -8.4683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(71, 68).mirror().addBox(-1.0F, 0.2645F, -7.7683F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2013F, -7.8769F, -0.1222F, -0.1571F, 0.0F));

		PartDefinition cube_r186 = Jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(42, 72).mirror().addBox(-1.0F, -0.0692F, -3.8646F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2013F, -7.8769F, -0.0349F, -0.1571F, 0.0F));

		PartDefinition cube_r187 = Jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(24, 9).addBox(0.1596F, -0.9436F, 1.4518F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1897F, -1.465F, -15.5758F, -0.226F, 0.1923F, 0.3527F));

		PartDefinition cube_r188 = Jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(25, 64).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0056F, -2.2205F, -14.865F, -0.2308F, 0.2773F, 0.3324F));

		PartDefinition cube_r189 = Jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(22, 64).addBox(0.1529F, -1.8408F, -0.1617F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1897F, -2.065F, -16.6758F, -0.1388F, 0.1923F, 0.3527F));

		PartDefinition cube_r190 = Jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(18, 9).addBox(0.0F, -1.0949F, -0.5783F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1897F, -2.065F, -17.4758F, -0.0054F, 0.2041F, 0.673F));

		PartDefinition cube_r191 = Jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(82, 49).addBox(0.0F, -1.0898F, -10.3839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.9F, 0.2013F, -7.8769F, -0.1309F, 0.1571F, 0.0F));

		PartDefinition cube_r192 = Jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 78).addBox(0.0F, 0.9733F, -8.379F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9F, 0.2013F, -7.8769F, -0.3752F, 0.1571F, 0.0F));

		PartDefinition cube_r193 = Jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(12, 42).addBox(1.0129F, 0.0175F, -6.8428F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -1.4987F, -5.8769F, 0.0087F, 0.1571F, 0.0F));

		PartDefinition cube_r194 = Jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, -0.9336F, -5.6126F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9F, 0.2013F, -7.8769F, -0.0262F, 0.1571F, 0.0F));

		PartDefinition cube_r195 = Jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(77, 78).addBox(0.0F, 3.8436F, -9.197F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.9F, 0.2013F, -7.8769F, -0.6283F, 0.1571F, 0.0F));

		PartDefinition cube_r196 = Jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(79, 20).addBox(0.0F, -0.3355F, -8.4683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(71, 68).addBox(0.0F, 0.2645F, -7.7683F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.9F, 0.2013F, -7.8769F, -0.1222F, 0.1571F, 0.0F));

		PartDefinition cube_r197 = Jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(42, 72).addBox(0.0F, -0.0692F, -3.8646F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.2013F, -7.8769F, -0.0349F, 0.1571F, 0.0F));

		PartDefinition cube_r198 = Jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-0.4F, -3.5816F, -9.148F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.3013F, 1.0231F, 0.1571F, -0.2793F, 0.0F));

		PartDefinition cube_r199 = Jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.4F, -1.7865F, -9.8306F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.3013F, 1.0231F, -0.0349F, -0.2793F, 0.0F));

		PartDefinition cube_r200 = Jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(65, 58).mirror().addBox(0.0707F, -0.8626F, -0.2634F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.3013F, -2.7769F, -0.2269F, -0.192F, 0.0F));

		PartDefinition cube_r201 = Jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(60, 72).mirror().addBox(-0.4F, -0.7494F, -6.1847F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.3013F, 1.0231F, -0.3316F, -0.2793F, 0.0F));

		PartDefinition cube_r202 = Jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(0.0707F, 0.0461F, -0.0189F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 0.3013F, -2.7769F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r203 = Jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(60, 72).addBox(-0.6F, -0.7494F, -6.1847F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.0F, 1.3013F, 1.0231F, -0.3316F, 0.2793F, 0.0F));

		PartDefinition cube_r204 = Jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(65, 58).addBox(-1.0707F, -0.8626F, -0.2634F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.4F, 0.3013F, -2.7769F, -0.2269F, 0.192F, 0.0F));

		PartDefinition cube_r205 = Jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(22, 69).addBox(-0.6F, -3.5816F, -9.148F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 1.3013F, 1.0231F, 0.1571F, 0.2793F, 0.0F));

		PartDefinition cube_r206 = Jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 45).addBox(-0.6F, -1.7865F, -9.8306F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 1.3013F, 1.0231F, -0.0349F, 0.2793F, 0.0F));

		PartDefinition cube_r207 = Jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(63, 66).addBox(-1.0707F, 0.0461F, -0.0189F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 0.3013F, -2.7769F, 0.0F, 0.192F, 0.0F));

		PartDefinition FrontFlipperL = Shoulder.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4F, 4.8864F, -11.0035F, 0.1318F, -0.0683F, 0.4755F));

		PartDefinition cube_r208 = FrontFlipperL.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(73, 58).addBox(-9.1004F, -1.2798F, -0.0268F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2423F, -0.0906F, -2.9192F, -0.1764F, 0.155F, -0.0371F));

		PartDefinition cube_r209 = FrontFlipperL.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(69, 77).addBox(-0.0422F, -0.9671F, -1.0407F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8234F, 0.0905F, -0.5436F, -0.183F, -0.3089F, 0.0467F));

		PartDefinition cube_r210 = FrontFlipperL.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 61).addBox(11.8986F, -3.4459F, -9.6129F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(74, 10).addBox(7.0986F, -3.4459F, -8.7129F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.9158F, 3.9488F, 6.5455F, -0.1743F, 0.0003F, -0.0096F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7742F, -1.7954F, -0.248F, -0.035F, -0.2595F, 0.1355F));

		PartDefinition cube_r211 = FrontFlipperMiddleL.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(50, 38).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3885F, 1.8914F, 0.1046F, -0.1742F, -0.0407F, 0.0207F));

		PartDefinition cube_r212 = FrontFlipperMiddleL.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.5F, -2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 53).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 51).addBox(-0.5F, -0.5F, 1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2759F, 1.9118F, -0.1177F, -0.174F, 0.0195F, 0.0101F));

		PartDefinition cube_r213 = FrontFlipperMiddleL.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(78, 68).addBox(-0.9F, -0.5F, 0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 45).addBox(-0.9F, -0.5F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3876F, 1.9244F, 0.0988F, -0.1747F, 0.0882F, -0.002F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.6443F, 0.5F, -0.0469F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r214 = FrontFlipperEndL.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(68, 27).addBox(34.0681F, -2.8459F, -8.3913F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.0864F, 3.9442F, 6.2193F, -0.1707F, 0.0042F, 0.0356F));

		PartDefinition FrontFlipperL2 = Shoulder.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.4F, 4.8864F, -11.0035F, 0.1318F, 0.0683F, -0.4755F));

		PartDefinition cube_r215 = FrontFlipperL2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(33, 72).addBox(5.1004F, -1.2798F, -0.0268F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.2423F, -0.0906F, -2.9192F, -0.1764F, -0.155F, 0.0371F));

		PartDefinition cube_r216 = FrontFlipperL2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(77, 16).addBox(-2.9578F, -0.9671F, -1.0407F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.8234F, 0.0905F, -0.5436F, -0.183F, 0.3089F, -0.0467F));

		PartDefinition cube_r217 = FrontFlipperL2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(60, 50).addBox(-14.8986F, -3.4459F, -9.6129F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(73, 54).addBox(-11.0986F, -3.4459F, -8.7129F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.9158F, 3.9488F, 6.5455F, -0.1743F, -0.0003F, 0.0096F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7742F, -1.7954F, -0.248F, -0.1022F, 0.2415F, -0.4051F));

		PartDefinition cube_r218 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(49, 19).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3885F, 1.8914F, 0.1046F, -0.1742F, 0.0407F, -0.0207F));

		PartDefinition cube_r219 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.5F, -2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 45).addBox(-0.5F, -0.5F, 1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2759F, 1.9118F, -0.1177F, -0.174F, -0.0195F, -0.0101F));

		PartDefinition cube_r220 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(18, 15).addBox(-1.1F, -0.5F, 0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 45).addBox(-1.1F, -0.5F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3876F, 1.9244F, 0.0988F, -0.1747F, -0.0882F, 0.002F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.6443F, 0.5F, -0.0469F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r221 = FrontFlipperEndL2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(67, 23).addBox(-38.0681F, -2.8459F, -8.3913F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0864F, 3.9442F, 6.2193F, -0.1707F, -0.0042F, -0.0356F));

		PartDefinition BackFlipperL = Pliosaurus.addOrReplaceChild("BackFlipperL", CubeListBuilder.create().texOffs(31, 51).addBox(-0.433F, -0.5F, -1.7177F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(61, 5).addBox(7.567F, -0.5F, -2.6177F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9F, 3.2806F, -1.92F, 0.2227F, -0.3007F, -0.3379F));

		PartDefinition cube_r222 = BackFlipperL.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(51, 70).addBox(-0.4F, 0.0F, -1.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.605F, -0.5F, 0.4969F, 0.0F, 1.8326F, 0.0F));

		PartDefinition cube_r223 = BackFlipperL.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(55, 56).addBox(-0.4F, -1.5F, -10.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(13.567F, 1.0F, 3.8823F, 0.0F, 1.2217F, 0.0F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create().texOffs(59, 45).addBox(0.9307F, -1.0F, -0.8037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.167F, 0.5F, -0.3177F, 0.0396F, -0.1248F, -0.3079F));

		PartDefinition cube_r224 = BackFlipperMiddleL.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(18, 36).addBox(-2.2F, -1.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0307F, 0.5F, 3.5963F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r225 = BackFlipperMiddleL.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, -1.5F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8307F, 0.5F, 2.7963F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r226 = BackFlipperMiddleL.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(33, 82).addBox(-1.0F, -1.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5378F, 0.5F, -0.5388F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r227 = BackFlipperMiddleL.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(20, 42).addBox(-1.0F, -1.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6307F, 0.5F, -1.4037F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r228 = BackFlipperMiddleL.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(39, 67).addBox(-1.3F, 0.0F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0363F, -0.6F, -0.0328F, 0.0F, -0.0175F, 0.0F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8307F, 0.5F, -1.0037F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r229 = BackFlipperEndL.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(33, 38).addBox(0.2163F, -2.0F, -0.0338F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4105F, 1.0F, -0.983F, 0.0F, -0.2094F, 0.0F));

		PartDefinition BackFlipperL2 = Pliosaurus.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create().texOffs(12, 51).addBox(-5.567F, -0.5F, -1.7177F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(59, 43).addBox(-9.567F, -0.5F, -2.6177F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.9F, 3.2806F, -1.92F, 0.1954F, 0.3188F, 0.2482F));

		PartDefinition cube_r230 = BackFlipperL2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(69, 42).addBox(-2.6F, 0.0F, -1.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-6.605F, -0.5F, 0.4969F, 0.0F, -1.8326F, 0.0F));

		PartDefinition cube_r231 = BackFlipperL2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(30, 56).addBox(-1.6F, -1.5F, -10.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-13.567F, 1.0F, 3.8823F, 0.0F, -1.2217F, 0.0F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create().texOffs(40, 58).addBox(-1.9307F, -1.0F, -0.8037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.167F, 0.5F, -0.3177F, 0.0172F, 0.1298F, 0.132F));

		PartDefinition cube_r232 = BackFlipperMiddleL2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 25).addBox(1.2F, -1.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0307F, 0.5F, 3.5963F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r233 = BackFlipperMiddleL2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(58, 82).addBox(0.0F, -1.5F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8307F, 0.5F, 2.7963F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r234 = BackFlipperMiddleL2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(81, 62).addBox(0.0F, -1.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5378F, 0.5F, -0.5388F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r235 = BackFlipperMiddleL2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -1.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6307F, 0.5F, -1.4037F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r236 = BackFlipperMiddleL2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 67).addBox(-1.7F, 0.0F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0363F, -0.6F, -0.0328F, 0.0F, 0.0175F, 0.0F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8307F, 0.5F, -1.0037F, 0.0F, -0.1658F, 0.0F));

		PartDefinition cube_r237 = BackFlipperEndL2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 36).addBox(-7.2163F, -2.0F, -0.0338F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4105F, 1.0F, -0.983F, 0.0F, 0.2094F, 0.0F));

		PartDefinition Tail1 = Pliosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 2.6F, -0.1496F, 0.1295F, -0.0195F));

		PartDefinition cube_r238 = Tail1.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(70, 65).addBox(-0.5F, -1.2F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(-0.5F, -1.2F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 72).addBox(-0.5F, -1.2F, -1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 64).addBox(-1.5F, 0.0F, -1.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4143F, 1.0271F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r239 = Tail1.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(87, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6078F, -0.5053F, 4.5956F, 0.044F, 0.1376F, -0.1239F));

		PartDefinition cube_r240 = Tail1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(84, 74).mirror().addBox(-1.9495F, 0.0163F, 1.6353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 38).mirror().addBox(-2.9495F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 0.3973F, -0.0085F, 0.1309F, -0.1309F));

		PartDefinition cube_r241 = Tail1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(87, 12).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6078F, -0.5053F, 4.5956F, 0.044F, -0.1376F, 0.1239F));

		PartDefinition cube_r242 = Tail1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(84, 74).addBox(-0.0505F, 0.0163F, 1.6353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 38).addBox(-0.0505F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 0.3973F, -0.0085F, -0.1309F, 0.1309F));

		PartDefinition cube_r243 = Tail1.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(67, 81).addBox(-1.0F, -3.1F, -3.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9857F, 8.0271F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0143F, 5.7271F, 0.0709F, 0.1741F, 0.0123F));

		PartDefinition cube_r244 = Tail2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(26, 33).addBox(-0.5F, -0.6716F, 1.6831F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(-0.5F, -0.9716F, -0.3169F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 9).addBox(-1.0F, 0.0284F, -0.3169F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r245 = Tail2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 57).mirror().addBox(-0.6F, -0.1F, 1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4117F, 0.196F, 0.6555F, 0.1312F, 0.1309F, -0.1309F));

		PartDefinition cube_r246 = Tail2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 87).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 57).addBox(-0.4F, -0.1F, 1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4117F, 0.196F, 0.6555F, 0.1312F, -0.1309F, 0.1309F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 2.8F, -0.0549F, 0.305F, -0.0165F));

		PartDefinition cube_r247 = Tail3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(18, 30).addBox(-0.5F, -0.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 56).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -0.0287F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -0.6983F, -0.0512F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(28, 25).addBox(-0.5F, -1.0983F, -0.0512F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3227F, 2.9713F, 0.0755F, 0.3917F, 0.0289F));

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