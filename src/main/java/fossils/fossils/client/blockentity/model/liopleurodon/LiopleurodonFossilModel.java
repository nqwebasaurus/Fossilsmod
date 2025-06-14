package fossils.fossils.client.blockentity.model.liopleurodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LiopleurodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Pliosaurus;
	private final ModelPart Chest;
	private final ModelPart Shoulder;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
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

	public LiopleurodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Pliosaurus = this.fossil.getChild("Pliosaurus");
		this.Chest = this.Pliosaurus.getChild("Chest");
		this.Shoulder = this.Chest.getChild("Shoulder");
		this.Neck3 = this.Shoulder.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
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

		PartDefinition Pliosaurus = fossil.addOrReplaceChild("Pliosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -8.5001F, 22.607F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Pliosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(115, 106).mirror().addBox(-2.8718F, -0.5575F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 2.9973F, -0.115F, 0.0875F, -0.489F));

		PartDefinition cube_r2 = Pliosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 2.9973F, -0.0782F, 0.1215F, -0.1397F));

		PartDefinition basin_r1 = Pliosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(104, 89).mirror().addBox(-0.5F, 0.4F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3514F, -1.2009F, -1.2992F, 0.1913F, 0.1807F, 0.2796F));

		PartDefinition basin_r2 = Pliosaurus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.3514F, -1.2009F, -1.2992F, 1.3258F, 0.1807F, 0.2796F));

		PartDefinition basin_r3 = Pliosaurus.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.7618F, 0.6006F, -0.7371F, 0.6713F, 0.1807F, 0.2796F));

		PartDefinition basin_r4 = Pliosaurus.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(45, 5).mirror().addBox(-2.7524F, -0.5F, -0.7616F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 3.9132F, -0.1089F, 0.2683F, -0.7672F, -0.1885F));

		PartDefinition basin_r5 = Pliosaurus.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(75, 61).mirror().addBox(-3.5F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(31, 10).mirror().addBox(0.5F, -0.5F, -3.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 61).addBox(4.7F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 10).addBox(2.7F, -0.5F, -3.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, 3.9132F, -0.1089F, 0.192F, 0.0F, 0.0F));

		PartDefinition basin_r6 = Pliosaurus.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-2.9219F, -0.5F, -2.111F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2616F, 5.3112F, -9.024F, 0.1698F, 0.3876F, 0.0647F));

		PartDefinition basin_r7 = Pliosaurus.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(25, 26).mirror().addBox(-3.3384F, -0.5F, -0.9056F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 26).addBox(2.8616F, -0.5F, -0.9056F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2616F, 5.3112F, -9.024F, 0.1571F, 0.0F, 0.0F));

		PartDefinition basin_r8 = Pliosaurus.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(28, 77).mirror().addBox(0.0F, -0.7F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.8881F, 2.1831F, -1.4902F, 1.2821F, 0.1807F, 0.2796F));

		PartDefinition cube_r3 = Pliosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(107, 27).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 0.9973F, -0.115F, 0.0875F, -0.489F));

		PartDefinition cube_r4 = Pliosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 106).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 0.9973F, -0.0782F, 0.1215F, -0.1397F));

		PartDefinition cube_r5 = Pliosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(106, 40).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.6835F, -1.0027F, -0.0782F, 0.1215F, -0.1397F));

		PartDefinition cube_r6 = Pliosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 107).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.6835F, -1.0027F, -0.115F, 0.0875F, -0.489F));

		PartDefinition basin_r9 = Pliosaurus.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(45, 5).addBox(-3.2476F, -0.5F, -0.7616F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1F, 3.9132F, -0.1089F, 0.2683F, 0.7672F, 0.1885F));

		PartDefinition basin_r10 = Pliosaurus.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(54, 10).addBox(-3.0781F, -0.5F, -2.111F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2616F, 5.3112F, -9.024F, 0.1698F, -0.3876F, -0.0647F));

		PartDefinition basin_r11 = Pliosaurus.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(104, 89).addBox(-0.5F, 0.4F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.3514F, -1.2009F, -1.2992F, 0.1913F, -0.1807F, -0.2796F));

		PartDefinition basin_r12 = Pliosaurus.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(105, 85).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.3514F, -1.2009F, -1.2992F, 1.3258F, -0.1807F, -0.2796F));

		PartDefinition basin_r13 = Pliosaurus.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(99, 12).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7618F, 0.6006F, -0.7371F, 0.6713F, -0.1807F, -0.2796F));

		PartDefinition basin_r14 = Pliosaurus.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(28, 77).addBox(-1.0F, -0.7F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.8881F, 2.1831F, -1.4902F, 1.2821F, -0.1807F, -0.2796F));

		PartDefinition basin_r15 = Pliosaurus.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(104, 113).addBox(0.0F, -2.1134F, 0.0473F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2015F, 2.711F, -0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r16 = Pliosaurus.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(98, 113).addBox(0.0F, -2.2133F, -0.0527F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4002F, 0.8214F, -0.2793F, 0.0F, 0.0F));

		PartDefinition basin_r17 = Pliosaurus.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(113, 97).addBox(0.0F, -2.6133F, -0.0527F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5098F, -1.1781F, -0.2793F, 0.0F, 0.0F));

		PartDefinition basin_r18 = Pliosaurus.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(19, 44).addBox(-1.0F, 0.5867F, -0.1527F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.3F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Pliosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(107, 0).addBox(-0.0504F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 2.9973F, -0.0782F, -0.1215F, 0.1397F));

		PartDefinition cube_r8 = Pliosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(115, 106).addBox(1.8718F, -0.5575F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 2.9973F, -0.115F, -0.0875F, 0.489F));

		PartDefinition cube_r9 = Pliosaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(107, 27).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 0.9973F, -0.115F, -0.0875F, 0.489F));

		PartDefinition cube_r10 = Pliosaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(65, 106).addBox(-0.0504F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 0.9973F, -0.0782F, -0.1215F, 0.1397F));

		PartDefinition cube_r11 = Pliosaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(106, 40).addBox(-0.0504F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6835F, -1.0027F, -0.0782F, -0.1215F, 0.1397F));

		PartDefinition cube_r12 = Pliosaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 107).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.6835F, -1.0027F, -0.115F, -0.0875F, 0.489F));

		PartDefinition Chest = Pliosaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -2.3F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(63, 110).addBox(-0.5F, -2.7602F, -0.0209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7706F, -0.8755F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 113).addBox(-0.5F, -2.8601F, -0.0209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6137F, -2.8693F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(3, 109).addBox(-0.5F, -2.8602F, -0.0209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4568F, -4.8631F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(113, 6).addBox(-0.5F, -2.8602F, -0.0209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2999F, -6.857F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(85, 110).addBox(-0.5F, -2.8352F, -0.0209F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.143F, -8.8508F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(103, 97).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2038F, -0.4894F, -0.115F, 0.0875F, -0.489F));

		PartDefinition cube_r19 = Chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(104, 36).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2038F, -0.4894F, -0.0782F, 0.1215F, -0.1397F));

		PartDefinition cube_r20 = Chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 106).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2038F, -2.4894F, -0.0346F, 0.1275F, -0.1343F));

		PartDefinition cube_r21 = Chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(107, 55).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2038F, -2.4894F, -0.0763F, 0.1079F, -0.4852F));

		PartDefinition cube_r22 = Chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(106, 71).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3038F, -4.4894F, 0.0527F, 0.1386F, -0.1227F));

		PartDefinition cube_r23 = Chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(107, 44).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3038F, -4.4894F, 0.0018F, 0.1482F, -0.4753F));

		PartDefinition cube_r24 = Chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(70, 61).mirror().addBox(-4.8896F, -2.9733F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3038F, -4.4894F, -0.0614F, 0.135F, -0.9159F));

		PartDefinition cube_r25 = Chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(106, 69).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.5038F, -6.4894F, 0.0527F, 0.1386F, -0.1227F));

		PartDefinition cube_r26 = Chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(107, 42).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.5038F, -6.4894F, 0.0018F, 0.1482F, -0.4753F));

		PartDefinition cube_r27 = Chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(107, 29).mirror().addBox(-5.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.5038F, -6.4894F, -0.0614F, 0.135F, -0.9159F));

		PartDefinition cube_r28 = Chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-5.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6038F, -8.1894F, -0.029F, 0.1765F, -0.9109F));

		PartDefinition cube_r29 = Chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(104, 75).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6038F, -8.1894F, 0.049F, 0.172F, -0.4677F));

		PartDefinition cube_r30 = Chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(65, 104).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6038F, -8.1894F, 0.1052F, 0.1449F, -0.1152F));

		PartDefinition cube_r31 = Chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(103, 97).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2038F, -0.4894F, -0.115F, -0.0875F, 0.489F));

		PartDefinition cube_r32 = Chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(104, 36).addBox(-0.0504F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2038F, -0.4894F, -0.0782F, -0.1215F, 0.1397F));

		PartDefinition cube_r33 = Chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 106).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2038F, -2.4894F, -0.0346F, -0.1275F, 0.1343F));

		PartDefinition cube_r34 = Chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(107, 55).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2038F, -2.4894F, -0.0763F, -0.1079F, 0.4852F));

		PartDefinition cube_r35 = Chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(106, 71).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3038F, -4.4894F, 0.0527F, -0.1386F, 0.1227F));

		PartDefinition cube_r36 = Chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(107, 44).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3038F, -4.4894F, 0.0018F, -0.1482F, 0.4753F));

		PartDefinition cube_r37 = Chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(70, 61).addBox(3.8896F, -2.9733F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3038F, -4.4894F, -0.0614F, -0.135F, 0.9159F));

		PartDefinition cube_r38 = Chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(106, 69).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5038F, -6.4894F, 0.0527F, -0.1386F, 0.1227F));

		PartDefinition cube_r39 = Chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(107, 42).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5038F, -6.4894F, 0.0018F, -0.1482F, 0.4753F));

		PartDefinition cube_r40 = Chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(107, 29).addBox(3.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.5038F, -6.4894F, -0.0614F, -0.135F, 0.9159F));

		PartDefinition cube_r41 = Chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 105).addBox(3.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.6038F, -8.1894F, -0.029F, -0.1765F, 0.9109F));

		PartDefinition cube_r42 = Chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(104, 75).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.6038F, -8.1894F, 0.049F, -0.172F, 0.4677F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(65, 104).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.6038F, -8.1894F, 0.1052F, -0.1449F, 0.1152F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, -0.0602F, -0.4209F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0959F, -9.449F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Shoulder = Chest.addOrReplaceChild("Shoulder", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 7.211F, -7.6611F, 15.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3123F, -10.1371F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Shoulder.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(105, 81).mirror().addBox(-1.312F, 0.2361F, -0.3277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0592F, 3.6924F, -18.5736F, 0.0594F, -0.5256F, -0.7416F));

		PartDefinition cube_r46 = Shoulder.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(113, 38).mirror().addBox(-0.7408F, 0.0549F, -0.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0592F, 3.6924F, -18.5736F, -0.4189F, 0.0F, -0.3316F));

		PartDefinition cube_r47 = Shoulder.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(106, 23).mirror().addBox(-0.7408F, -0.9377F, -0.3728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0592F, 3.6924F, -18.5736F, -0.4014F, 0.0F, -0.3316F));

		PartDefinition cube_r48 = Shoulder.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(111, 23).mirror().addBox(-0.7408F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0592F, 3.6924F, -18.5736F, -1.4486F, 0.0F, -0.3316F));

		PartDefinition cube_r49 = Shoulder.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(45, 104).mirror().addBox(-0.7408F, -2.2035F, -0.6742F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0592F, 3.6924F, -18.5736F, -0.7941F, 0.0F, -0.3316F));

		PartDefinition cube_r50 = Shoulder.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(16, 109).mirror().addBox(-0.7408F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.0592F, 3.6924F, -18.5736F, -0.576F, 0.0F, -0.3316F));

		PartDefinition cube_r51 = Shoulder.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(106, 9).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0997F, -8.3405F, -0.0521F, 0.1251F, -0.1364F));

		PartDefinition cube_r52 = Shoulder.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(106, 15).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0997F, -8.3405F, -0.0918F, 0.0998F, -0.4868F));

		PartDefinition cube_r53 = Shoulder.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(-11.8896F, -2.9733F, -0.4952F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0997F, -8.3405F, -0.1252F, 0.0517F, -0.9218F));

		PartDefinition cube_r54 = Shoulder.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 22).mirror().addBox(-11.8896F, -2.9733F, -0.4952F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -10.3405F, -0.1252F, 0.0517F, -0.9218F));

		PartDefinition cube_r55 = Shoulder.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(106, 13).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -10.3405F, -0.0918F, 0.0998F, -0.4868F));

		PartDefinition cube_r56 = Shoulder.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(106, 7).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -10.3405F, -0.0521F, 0.1251F, -0.1364F));

		PartDefinition cube_r57 = Shoulder.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(105, 53).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -12.3405F, 0.0003F, 0.1321F, -0.1297F));

		PartDefinition cube_r58 = Shoulder.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(106, 11).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -12.3405F, -0.0451F, 0.1241F, -0.4816F));

		PartDefinition cube_r59 = Shoulder.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-10.8896F, -2.9733F, -0.4952F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -12.3405F, -0.0935F, 0.0934F, -0.9195F));

		PartDefinition cube_r60 = Shoulder.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-1.312F, -0.0182F, -2.3194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.0592F, 3.6924F, -18.5736F, 0.4957F, -0.5256F, -0.7416F));

		PartDefinition cube_r61 = Shoulder.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-0.0155F, 0.1469F, -3.8703F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.71F, 6.6473F, -15.4674F, -0.4609F, -0.8535F, 0.3581F));

		PartDefinition cube_r62 = Shoulder.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(78, 36).mirror().addBox(0.9359F, -3.5167F, -0.4114F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 10.0339F, -17.8977F, -0.7215F, 0.696F, -0.4184F));

		PartDefinition cube_r63 = Shoulder.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(85, 52).mirror().addBox(3.471F, -3.5167F, -1.4284F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 10.0339F, -17.8977F, -0.5991F, 0.4536F, -0.1956F));

		PartDefinition cube_r64 = Shoulder.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(81, 5).mirror().addBox(3.9922F, -3.5167F, -4.5483F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 10.0339F, -17.8977F, -0.5431F, 0.196F, -0.0219F));

		PartDefinition cube_r65 = Shoulder.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(1.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(71, 24).mirror().addBox(-1.69F, -0.9349F, 3.7642F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 77).addBox(4.51F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(71, 24).addBox(4.51F, -0.9349F, 3.7642F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.91F, 6.6473F, -19.1674F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Shoulder.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(52, 25).mirror().addBox(-5.4749F, 0.0184F, 5.5696F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 6.6473F, -19.1674F, -0.1408F, 0.5193F, -0.0702F));

		PartDefinition cube_r67 = Shoulder.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(-1.3532F, -0.9349F, 3.9994F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 6.6473F, -19.1674F, -0.2995F, -0.1335F, 0.0411F));

		PartDefinition cube_r68 = Shoulder.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(-1.4575F, 0.0272F, 5.8202F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 6.6473F, -19.1674F, -0.1234F, -0.1386F, 0.0171F));

		PartDefinition cube_r69 = Shoulder.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 5).mirror().addBox(-0.69F, 0.0272F, 5.5917F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(64, 5).addBox(4.51F, 0.0272F, 5.5917F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.91F, 6.6473F, -19.1674F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Shoulder.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4997F, -0.3405F, -0.0869F, 0.1203F, -0.1407F));

		PartDefinition cube_r71 = Shoulder.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(103, 108).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4997F, -0.3405F, -0.1227F, 0.0834F, -0.4897F));

		PartDefinition cube_r72 = Shoulder.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-6.8896F, -2.9733F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4997F, -0.3405F, -0.1463F, 0.0239F, -0.9226F));

		PartDefinition cube_r73 = Shoulder.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(103, 106).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3996F, -2.1405F, -0.0521F, 0.1251F, -0.1364F));

		PartDefinition cube_r74 = Shoulder.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(96, 108).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3996F, -2.1405F, -0.0918F, 0.0998F, -0.4868F));

		PartDefinition cube_r75 = Shoulder.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(95, 41).mirror().addBox(-7.8896F, -2.9733F, -0.4952F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3996F, -2.1405F, -0.1252F, 0.0517F, -0.9218F));

		PartDefinition cube_r76 = Shoulder.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(106, 101).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1997F, -4.1405F, -0.0346F, 0.1275F, -0.1343F));

		PartDefinition cube_r77 = Shoulder.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(82, 108).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1997F, -4.1405F, -0.0763F, 0.1079F, -0.4852F));

		PartDefinition cube_r78 = Shoulder.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-9.8896F, -2.9733F, -0.4952F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1997F, -4.1405F, -0.1147F, 0.0656F, -0.9212F));

		PartDefinition cube_r79 = Shoulder.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(105, 51).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1496F, -6.3405F, -0.0521F, 0.1251F, -0.1364F));

		PartDefinition cube_r80 = Shoulder.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(105, 49).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1496F, -6.3405F, -0.0918F, 0.0998F, -0.4868F));

		PartDefinition cube_r81 = Shoulder.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-10.8896F, -2.9733F, -0.4952F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1496F, -6.3405F, -0.1252F, 0.0517F, -0.9218F));

		PartDefinition cube_r82 = Shoulder.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(110, 85).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1253F, -14.3405F, 0.0527F, 0.1386F, -0.1227F));

		PartDefinition cube_r83 = Shoulder.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(110, 87).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1253F, -14.3405F, 0.0018F, 0.1482F, -0.4753F));

		PartDefinition cube_r84 = Shoulder.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(83, 2).mirror().addBox(-9.8896F, -2.9733F, -0.4952F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1253F, -14.3405F, -0.0614F, 0.135F, -0.9159F));

		PartDefinition cube_r85 = Shoulder.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(92, 21).mirror().addBox(-7.8896F, -2.9733F, -0.4953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0003F, -18.4405F, 0.0317F, 0.2519F, -0.8979F));

		PartDefinition cube_r86 = Shoulder.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(105, 47).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0003F, -18.4405F, 0.1367F, 0.2146F, -0.4509F));

		PartDefinition cube_r87 = Shoulder.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(104, 73).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0003F, -18.4405F, 0.2017F, 0.1552F, -0.1008F));

		PartDefinition cube_r88 = Shoulder.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(106, 99).mirror().addBox(-2.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -16.4405F, 0.1227F, 0.1468F, -0.1127F));

		PartDefinition cube_r89 = Shoulder.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(-4.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -16.4405F, 0.0649F, 0.1799F, -0.4649F));

		PartDefinition cube_r90 = Shoulder.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(-8.8896F, -2.9733F, -0.4952F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1004F, -16.4405F, -0.0182F, 0.1902F, -0.9089F));

		PartDefinition cube_r91 = Shoulder.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(105, 81).addBox(0.312F, 0.2361F, -0.3277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0592F, 3.6924F, -18.5736F, 0.0594F, 0.5256F, 0.7416F));

		PartDefinition cube_r92 = Shoulder.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 59).addBox(0.312F, -0.0182F, -2.3194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.0592F, 3.6924F, -18.5736F, 0.4957F, 0.5256F, 0.7416F));

		PartDefinition cube_r93 = Shoulder.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(30, 71).addBox(-2.9845F, 0.1469F, -3.8703F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.71F, 6.6473F, -15.4674F, -0.4609F, 0.8535F, -0.3581F));

		PartDefinition cube_r94 = Shoulder.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(78, 36).addBox(-6.9359F, -3.5167F, -0.4114F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.5986F, 10.0339F, -17.8977F, -0.7215F, -0.696F, 0.4184F));

		PartDefinition cube_r95 = Shoulder.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(85, 52).addBox(-8.471F, -3.5167F, -1.4284F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.5986F, 10.0339F, -17.8977F, -0.5991F, -0.4536F, 0.1956F));

		PartDefinition cube_r96 = Shoulder.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(81, 5).addBox(-7.9922F, -3.5167F, -4.5483F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5986F, 10.0339F, -17.8977F, -0.5431F, -0.196F, 0.0219F));

		PartDefinition cube_r97 = Shoulder.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(52, 25).addBox(0.4749F, 0.0184F, 5.5696F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.91F, 6.6473F, -19.1674F, -0.1408F, -0.5193F, 0.0702F));

		PartDefinition cube_r98 = Shoulder.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(78, 43).addBox(-2.6468F, -0.9349F, 3.9994F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.91F, 6.6473F, -19.1674F, -0.2995F, 0.1335F, -0.0411F));

		PartDefinition cube_r99 = Shoulder.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 15).addBox(-1.5425F, 0.0272F, 5.8202F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.91F, 6.6473F, -19.1674F, -0.1234F, 0.1386F, -0.0171F));

		PartDefinition cube_r100 = Shoulder.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(95, 113).addBox(0.0F, -2.825F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3723F, -0.6569F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Shoulder.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(92, 113).addBox(0.0F, -2.85F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.477F, -2.6542F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Shoulder.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(113, 76).addBox(0.0F, -2.925F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5817F, -4.6514F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Shoulder.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(113, 68).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6863F, -6.6487F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Shoulder.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(107, 113).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.791F, -8.646F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Shoulder.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(26, 113).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8957F, -10.6432F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Shoulder.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 109).addBox(0.0F, -3.25F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0604F, -18.6623F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Shoulder.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(89, 108).addBox(0.0F, -3.225F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0206F, -16.6602F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Shoulder.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 107).addBox(0.0F, -3.225F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.993F, -14.6504F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Shoulder.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(7, 107).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0003F, -12.6405F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Shoulder.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 107).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4997F, -0.3405F, -0.0869F, -0.1203F, 0.1407F));

		PartDefinition cube_r111 = Shoulder.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(103, 108).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4997F, -0.3405F, -0.1227F, -0.0834F, 0.4897F));

		PartDefinition cube_r112 = Shoulder.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 101).addBox(3.8896F, -2.9733F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4997F, -0.3405F, -0.1463F, -0.0239F, 0.9226F));

		PartDefinition cube_r113 = Shoulder.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(103, 106).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3996F, -2.1405F, -0.0521F, -0.1251F, 0.1364F));

		PartDefinition cube_r114 = Shoulder.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(96, 108).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3996F, -2.1405F, -0.0918F, -0.0998F, 0.4868F));

		PartDefinition cube_r115 = Shoulder.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(95, 41).addBox(3.8896F, -2.9733F, -0.4952F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3996F, -2.1405F, -0.1252F, -0.0517F, 0.9218F));

		PartDefinition cube_r116 = Shoulder.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(106, 101).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1997F, -4.1405F, -0.0346F, -0.1275F, 0.1343F));

		PartDefinition cube_r117 = Shoulder.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(82, 108).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1997F, -4.1405F, -0.0763F, -0.1079F, 0.4852F));

		PartDefinition cube_r118 = Shoulder.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(83, 0).addBox(3.8896F, -2.9733F, -0.4952F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1997F, -4.1405F, -0.1147F, -0.0656F, 0.9212F));

		PartDefinition cube_r119 = Shoulder.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(70, 59).addBox(3.8896F, -2.9733F, -0.4952F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0997F, -8.3405F, -0.1252F, -0.0517F, 0.9218F));

		PartDefinition cube_r120 = Shoulder.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(106, 15).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0997F, -8.3405F, -0.0918F, -0.0998F, 0.4868F));

		PartDefinition cube_r121 = Shoulder.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(106, 9).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.0997F, -8.3405F, -0.0521F, -0.1251F, 0.1364F));

		PartDefinition cube_r122 = Shoulder.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(106, 7).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -10.3405F, -0.0521F, -0.1251F, 0.1364F));

		PartDefinition cube_r123 = Shoulder.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(106, 13).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -10.3405F, -0.0918F, -0.0998F, 0.4868F));

		PartDefinition cube_r124 = Shoulder.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(56, 22).addBox(3.8896F, -2.9733F, -0.4952F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -10.3405F, -0.1252F, -0.0517F, 0.9218F));

		PartDefinition cube_r125 = Shoulder.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(75, 22).addBox(3.8896F, -2.9733F, -0.4952F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -12.3405F, -0.0935F, -0.0934F, 0.9195F));

		PartDefinition cube_r126 = Shoulder.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(106, 11).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -12.3405F, -0.0451F, -0.1241F, 0.4816F));

		PartDefinition cube_r127 = Shoulder.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(105, 53).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -12.3405F, 0.0003F, -0.1321F, 0.1297F));

		PartDefinition cube_r128 = Shoulder.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(105, 51).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1496F, -6.3405F, -0.0521F, -0.1251F, 0.1364F));

		PartDefinition cube_r129 = Shoulder.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(105, 49).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1496F, -6.3405F, -0.0918F, -0.0998F, 0.4868F));

		PartDefinition cube_r130 = Shoulder.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(73, 20).addBox(3.8896F, -2.9733F, -0.4952F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1496F, -6.3405F, -0.1252F, -0.0517F, 0.9218F));

		PartDefinition cube_r131 = Shoulder.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(110, 85).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1253F, -14.3405F, 0.0527F, -0.1386F, 0.1227F));

		PartDefinition cube_r132 = Shoulder.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(110, 87).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1253F, -14.3405F, 0.0018F, -0.1482F, 0.4753F));

		PartDefinition cube_r133 = Shoulder.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(83, 2).addBox(3.8896F, -2.9733F, -0.4952F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1253F, -14.3405F, -0.0614F, -0.135F, 0.9159F));

		PartDefinition cube_r134 = Shoulder.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(92, 21).addBox(3.8896F, -2.9733F, -0.4953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0003F, -18.4405F, 0.0317F, -0.2519F, 0.8979F));

		PartDefinition cube_r135 = Shoulder.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(105, 47).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0003F, -18.4405F, 0.1367F, -0.2146F, 0.4509F));

		PartDefinition cube_r136 = Shoulder.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(104, 73).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.0003F, -18.4405F, 0.2017F, -0.1552F, 0.1008F));

		PartDefinition cube_r137 = Shoulder.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(106, 99).addBox(0.9325F, -0.0131F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -16.4405F, 0.1227F, -0.1468F, 0.1127F));

		PartDefinition cube_r138 = Shoulder.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(75, 108).addBox(2.7512F, -1.0153F, -0.4952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -16.4405F, 0.0649F, -0.1799F, 0.4649F));

		PartDefinition cube_r139 = Shoulder.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(86, 14).addBox(3.8896F, -2.9733F, -0.4952F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1004F, -16.4405F, -0.0182F, -0.1902F, 0.9089F));

		PartDefinition cube_r140 = Shoulder.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(111, 23).addBox(-0.2592F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.0592F, 3.6924F, -18.5736F, -1.4486F, 0.0F, 0.3316F));

		PartDefinition cube_r141 = Shoulder.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(45, 104).addBox(-0.2592F, -2.2035F, -0.6742F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0592F, 3.6924F, -18.5736F, -0.7941F, 0.0F, 0.3316F));

		PartDefinition cube_r142 = Shoulder.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(106, 23).addBox(-0.2592F, -0.9377F, -0.3728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.0592F, 3.6924F, -18.5736F, -0.4014F, 0.0F, 0.3316F));

		PartDefinition cube_r143 = Shoulder.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(113, 38).addBox(-0.2592F, 0.0549F, -0.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0592F, 3.6924F, -18.5736F, -0.4189F, 0.0F, 0.3316F));

		PartDefinition cube_r144 = Shoulder.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(16, 109).addBox(-0.2592F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.0592F, 3.6924F, -18.5736F, -0.576F, 0.0F, 0.3316F));

		PartDefinition cube_r145 = Shoulder.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(38, 49).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0003F, -12.6405F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Shoulder.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0003F, -12.6405F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck3 = Shoulder.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(73, 10).addBox(-1.5F, -0.7754F, -3.9057F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2652F, -18.722F, 0.0286F, 0.1724F, 0.0276F));

		PartDefinition cube_r147 = Neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(93, 107).addBox(-0.5F, -3.3754F, -0.0057F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(13, 107).addBox(-0.5F, -3.4754F, -0.0057F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Neck3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(52, 108).mirror().addBox(-5.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -3.5182F, 0.0149F, 0.2314F, -0.9019F));

		PartDefinition cube_r150 = Neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(45, 108).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -3.5182F, 0.1126F, 0.2032F, -0.4559F));

		PartDefinition cube_r151 = Neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(79, 106).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -3.5182F, 0.1754F, 0.1525F, -0.1048F));

		PartDefinition cube_r152 = Neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(108, 17).mirror().addBox(-5.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -1.5182F, 0.0149F, 0.2314F, -0.9019F));

		PartDefinition cube_r153 = Neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(107, 57).mirror().addBox(-4.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -1.5182F, 0.1126F, 0.2032F, -0.4559F));

		PartDefinition cube_r154 = Neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(106, 77).mirror().addBox(-2.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2073F, -1.5182F, 0.1754F, 0.1525F, -0.1048F));

		PartDefinition cube_r155 = Neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(52, 108).addBox(3.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -3.5182F, 0.0149F, -0.2314F, 0.9019F));

		PartDefinition cube_r156 = Neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 108).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -3.5182F, 0.1126F, -0.2032F, 0.4559F));

		PartDefinition cube_r157 = Neck3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(79, 106).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -3.5182F, 0.1754F, -0.1525F, 0.1048F));

		PartDefinition cube_r158 = Neck3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(108, 17).addBox(3.8896F, -2.9733F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -1.5182F, 0.0149F, -0.2314F, 0.9019F));

		PartDefinition cube_r159 = Neck3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(107, 57).addBox(2.7512F, -1.0153F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -1.5182F, 0.1126F, -0.2032F, 0.4559F));

		PartDefinition cube_r160 = Neck3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(106, 77).addBox(0.9325F, -0.0131F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.2073F, -1.5182F, 0.1754F, -0.1525F, 0.1048F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -3.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(66, 108).addBox(-0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.051F, -2.0417F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(108, 63).addBox(-0.5F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8465F, -4.0337F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(99, 67).mirror().addBox(-2.9495F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -5.7269F, 0.308F, 0.2358F, -0.5613F));

		PartDefinition cube_r164 = Neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(110, 81).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -3.7269F, 0.3399F, 0.1857F, -0.409F));

		PartDefinition cube_r165 = Neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(110, 83).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -3.7269F, 0.2583F, 0.2896F, -0.7522F));

		PartDefinition cube_r166 = Neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(-1.9495F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -1.7269F, 0.2105F, 0.1561F, -0.2391F));

		PartDefinition cube_r167 = Neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(59, 108).mirror().addBox(-3.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -1.7269F, 0.1447F, 0.2184F, -0.5888F));

		PartDefinition cube_r168 = Neck2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(79, 88).mirror().addBox(-4.286F, -2.1868F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.194F, -1.7269F, 0.0373F, 0.2588F, -1.0361F));

		PartDefinition cube_r169 = Neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(99, 67).addBox(-0.0504F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -5.7269F, 0.308F, -0.2358F, 0.5613F));

		PartDefinition cube_r170 = Neck2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(110, 81).addBox(-0.0504F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -3.7269F, 0.3399F, -0.1857F, 0.409F));

		PartDefinition cube_r171 = Neck2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(110, 83).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -3.7269F, 0.2583F, -0.2896F, 0.7522F));

		PartDefinition cube_r172 = Neck2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(106, 79).addBox(-0.0504F, 0.1163F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -1.7269F, 0.2105F, -0.1561F, 0.2391F));

		PartDefinition cube_r173 = Neck2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(59, 108).addBox(1.8718F, -0.5575F, -0.3647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -1.7269F, 0.1447F, -0.2184F, 0.5888F));

		PartDefinition cube_r174 = Neck2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(79, 88).addBox(3.286F, -2.1868F, -0.3647F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.194F, -1.7269F, 0.0373F, -0.2588F, 1.0361F));

		PartDefinition cube_r175 = Neck2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(42, 104).addBox(-0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8417F, -6.0362F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Neck2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 43).addBox(-1.5F, -2.0F, -2.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.1556F, -4.9315F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3346F, -6.8299F, -0.0275F, 0.1293F, -0.0206F));

		PartDefinition cube_r177 = Neck1.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(72, 108).addBox(-0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3942F, -1.0645F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Neck1.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(114, 44).mirror().addBox(-0.5604F, -0.3415F, -2.6003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 106).mirror().addBox(-2.0186F, 0.2345F, -0.7407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1781F, -0.5961F, 0.308F, 0.2358F, -0.5613F));

		PartDefinition cube_r179 = Neck1.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(114, 44).addBox(-0.4396F, -0.3415F, -2.6003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 106).addBox(0.0186F, 0.2345F, -0.7407F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1781F, -0.5961F, 0.308F, -0.2358F, 0.5613F));

		PartDefinition cube_r180 = Neck1.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(101, 113).addBox(-0.5F, -2.8F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3855F, -4.0682F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Neck1.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(69, 108).addBox(-0.5F, -3.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4593F, -3.066F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Neck1.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(46, 35).addBox(-1.5F, -0.3F, -2.3F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0646F, -3.759F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(49, 90).addBox(-1.0F, -2.1394F, -6.4014F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(46, 110).addBox(-1.0F, -1.1394F, -4.4014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 93).addBox(-2.0F, -1.0643F, -0.2514F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 31).addBox(-1.0F, 0.3F, -5.2777F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(63, 31).addBox(-1.0F, 0.3F, -11.2777F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.4132F, -7.4845F, -0.4638F, 0.1293F, -0.0206F));

		PartDefinition cube_r183 = Head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(29, 114).addBox(-1.952F, -0.1632F, -1.0196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 114).addBox(-1.952F, -0.1632F, -0.8196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.952F, -1.0596F, -21.1925F, 0.4224F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(14, 113).addBox(-1.952F, -0.2382F, -2.2196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -0.9981F, -18.957F, 0.0733F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(114, 29).mirror().addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1157F, -21.3504F, -0.2375F, -0.2974F, 0.0708F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(114, 41).mirror().addBox(-0.325F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1127F, 0.1704F, -20.9331F, -0.1685F, -0.2694F, 0.0481F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(106, 59).mirror().addBox(-0.4F, -0.6F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5271F, 0.329F, -18.8757F, -0.0333F, -0.149F, 0.0274F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(49, 114).mirror().addBox(-0.35F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 114).mirror().addBox(-0.35F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.1786F, -20.5801F, -0.0549F, -0.305F, 0.0165F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(111, 65).mirror().addBox(-0.1F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2857F, 0.8151F, -16.6067F, -0.3157F, -0.0963F, 0.1951F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(35, 106).mirror().addBox(-0.375F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5271F, 0.329F, -18.8757F, 0.3157F, -0.149F, 0.0274F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(58, 100).mirror().addBox(-0.4F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.23F, -19.1493F, 0.0817F, -0.1378F, -0.0286F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(100, 43).mirror().addBox(-0.4F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.0524F, -17.2883F, -0.3438F, -0.1398F, 0.0498F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-0.1F, -0.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3743F, 0.8649F, -16.0425F, 0.0378F, -0.0778F, 0.2642F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(16, 104).mirror().addBox(-0.1F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4521F, 0.9939F, -14.8578F, 0.1178F, -0.1056F, 0.3059F));

		PartDefinition cube_r195 = Head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(75, 110).mirror().addBox(0.0F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.638F, 1.1148F, -13.5536F, 0.0273F, -0.0821F, 0.3954F));

		PartDefinition cube_r196 = Head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 89).mirror().addBox(-0.35F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.0223F, -15.4184F, -0.1139F, -0.0867F, 0.0099F));

		PartDefinition cube_r197 = Head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(-0.65F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(51, 99).mirror().addBox(-0.65F, -0.3F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.1436F, -12.5568F, -0.0306F, -0.0654F, 0.002F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(-0.5F, -0.95F, -1.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.8626F, -9.6646F, 0.0213F, -0.1306F, 0.0086F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(37, 99).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.2639F, -9.6254F, -0.066F, -0.1306F, 0.0086F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(99, 23).mirror().addBox(-0.0079F, -1.9268F, -1.9749F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3921F, 1.2745F, -6.9915F, -0.0089F, -0.2182F, 0.0019F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(114, 29).addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1157F, -21.3504F, -0.2375F, 0.2974F, -0.0708F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(114, 26).addBox(0.0F, -0.525F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -0.2688F, -21.8093F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(58, 100).addBox(-0.6F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.23F, -19.1493F, 0.0817F, 0.1378F, 0.0286F));

		PartDefinition cube_r204 = Head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(94, 95).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3469F, -20.107F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(66, 114).addBox(-0.65F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(49, 114).addBox(-0.65F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.1786F, -20.5801F, -0.0549F, 0.305F, -0.0165F));

		PartDefinition cube_r206 = Head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(86, 9).addBox(-2.452F, -0.0107F, -1.9722F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -1.1835F, -18.2745F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(15, 76).addBox(-2.452F, -0.0107F, -3.9722F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -1.4625F, -14.2843F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(45, 63).addBox(-2.452F, -0.0107F, -0.0222F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, -1.4625F, -14.2843F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(55, 49).addBox(-0.5F, -0.95F, -1.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4F, 0.8626F, -9.6646F, 0.0213F, 0.1306F, -0.0086F));

		PartDefinition cube_r210 = Head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(37, 99).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4F, 0.2639F, -9.6254F, -0.066F, 0.1306F, -0.0086F));

		PartDefinition cube_r211 = Head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(78, 31).addBox(-3.452F, -1.9823F, -0.1382F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, 1.1877F, -10.5496F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(44, 114).addBox(-0.45F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5662F, 0.2392F, -21.7619F, -0.3388F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(114, 41).addBox(-0.675F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1127F, 0.1704F, -20.9331F, -0.1685F, 0.2694F, -0.0481F));

		PartDefinition cube_r214 = Head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(106, 59).addBox(-0.6F, -0.6F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5271F, 0.329F, -18.8757F, -0.0333F, 0.149F, -0.0274F));

		PartDefinition cube_r215 = Head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(35, 106).addBox(-0.625F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5271F, 0.329F, -18.8757F, 0.3157F, 0.149F, -0.0274F));

		PartDefinition cube_r216 = Head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(111, 65).addBox(-0.9F, -0.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2857F, 0.8151F, -16.6067F, -0.3157F, 0.0963F, -0.1951F));

		PartDefinition cube_r217 = Head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(80, 110).addBox(-0.9F, -0.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3743F, 0.8649F, -16.0425F, 0.0378F, 0.0778F, -0.2642F));

		PartDefinition cube_r218 = Head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(16, 104).addBox(-0.9F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4521F, 0.9939F, -14.8578F, 0.1178F, 0.1056F, -0.3059F));

		PartDefinition cube_r219 = Head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(75, 110).addBox(-1.0F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.638F, 1.1148F, -13.5536F, 0.0273F, 0.0821F, -0.3954F));

		PartDefinition cube_r220 = Head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(51, 99).addBox(-0.35F, -0.3F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 78).addBox(-0.35F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 0.1436F, -12.5568F, -0.0306F, 0.0654F, -0.002F));

		PartDefinition cube_r221 = Head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(15, 54).addBox(-3.452F, -1.9823F, -0.0382F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.952F, 1.0656F, -14.5477F, -0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(97, 89).addBox(-0.65F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1F, -0.0223F, -15.4184F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r223 = Head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(46, 85).addBox(-2.952F, -1.9823F, 0.0118F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.952F, 0.8392F, -16.5349F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r224 = Head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(85, 86).addBox(-2.952F, -1.1299F, 0.2694F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.952F, 0.2519F, -18.3873F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r225 = Head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(100, 43).addBox(-0.6F, -0.5F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8F, 0.0524F, -17.2883F, -0.3438F, 0.1398F, -0.0498F));

		PartDefinition cube_r226 = Head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(86, 69).addBox(-2.952F, -1.0549F, -0.0306F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.952F, 0.2519F, -18.3873F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r227 = Head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(25, 35).addBox(-1.5F, -0.9F, -4.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5261F, -11.0056F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r228 = Head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-1.1F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.3568F, -5.9583F, -0.0089F, -0.1833F, 0.0016F));

		PartDefinition cube_r229 = Head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(30, 99).addBox(0.1F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3568F, -5.9583F, -0.0089F, 0.1833F, -0.0016F));

		PartDefinition cube_r230 = Head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(99, 23).addBox(-0.9921F, -1.9268F, -1.9749F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3921F, 1.2745F, -6.9915F, -0.0089F, 0.2182F, -0.0019F));

		PartDefinition cube_r231 = Head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(60, 63).addBox(-4.1921F, -0.6768F, -0.1748F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6921F, -1.2486F, -9.0976F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r232 = Head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(66, 0).addBox(-4.6921F, -0.0163F, -2.0049F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6921F, -2.4296F, -6.7335F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r233 = Head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(110, 93).addBox(-0.4033F, -4.4034F, -1.4129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0006F, 0.5493F, -2.1632F, 1.4019F, 0.2535F, 0.0354F));

		PartDefinition cube_r234 = Head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(26, 109).mirror().addBox(-0.475F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3272F, 0.042F, -5.2155F, 1.0909F, -0.2923F, -0.0146F));

		PartDefinition cube_r235 = Head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(26, 109).addBox(-0.525F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3272F, 0.042F, -5.2155F, 1.0909F, 0.2923F, 0.0146F));

		PartDefinition cube_r236 = Head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(75, 66).addBox(-5.1921F, 1.9836F, -2.3049F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 86).addBox(-3.6921F, -0.0164F, -2.0049F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6921F, -3.1219F, -4.8571F, 0.3534F, 0.0F, 0.0F));

		PartDefinition cube_r237 = Head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 36).mirror().addBox(-0.4F, -1.0965F, 6.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(63, 31).mirror().addBox(-0.4F, -1.0965F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3966F, -5.3777F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r238 = Head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(68, 36).addBox(-0.6F, -1.0965F, 6.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(63, 31).addBox(-0.6F, -1.0965F, 0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.3966F, -5.3777F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r239 = Head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(73, 17).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7249F, -0.5015F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r240 = Head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(71, 28).addBox(-3.5F, -9.1F, 3.6F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.0357F, -3.4514F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(70, 55).addBox(-3.5F, 0.025F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7823F, 0.4832F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(109, 31).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4818F, -2.4791F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r243 = Head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(39, 114).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 110).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.564F, -1.4954F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r244 = Head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(36, 110).addBox(-1.0F, 1.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(44, 99).addBox(-1.0F, -0.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.5053F, -1.1504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r245 = Head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(58, 90).addBox(-1.0F, -1.9F, 0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7729F, -1.782F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r246 = Head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(52, 31).addBox(-1.5F, -0.5F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -3.1226F, -1.6138F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(21, 104).addBox(-1.0F, -0.0211F, -1.0371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.6504F, -2.9511F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(103, 103).addBox(-1.0F, 0.0147F, -0.9826F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.4445F, -3.9746F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(72, 102).addBox(-1.0F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2393F, -4.4014F, 0.3491F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.0736F, -0.7817F, -17.1414F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(103, 94).addBox(-1.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0063F, -0.3359F, 6.5939F, 0.1476F, 0.0164F, -0.0153F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(9, 94).addBox(-1.988F, -0.308F, -1.6834F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9505F, -1.0456F, 17.9674F, -1.3881F, 0.2484F, -0.511F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(103, 20).addBox(-1.988F, -0.5502F, -0.8152F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.2646F, -0.2257F, 18.1653F, -1.0823F, 0.2093F, -0.3179F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(18, 95).addBox(-1.5F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8487F, 2.5947F, 18.5056F, -1.3005F, 0.2093F, -0.0038F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(57, 85).addBox(-1.5F, -0.45F, -1.55F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.8393F, 1.244F, 18.4857F, -1.5187F, 0.2093F, -0.0038F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(40, 90).addBox(-0.4799F, -0.3635F, 0.4447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0742F, 1.331F, 14.9782F, -0.0352F, 0.2093F, -0.0038F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(22, 90).addBox(-0.4799F, -0.1994F, 0.4992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0742F, 1.331F, 14.9782F, 0.3575F, 0.2093F, -0.0038F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(114, 55).addBox(-0.4228F, 1.1251F, -0.4379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(3.0742F, 1.331F, 14.9782F, 1.3167F, 0.1917F, -0.0145F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(31, 110).addBox(-0.5F, -1.5F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1081F, 3.8575F, 19.7121F, 0.4004F, 0.1917F, -0.0145F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(110, 19).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(4.1081F, 3.8575F, 19.7121F, 0.5749F, 0.1917F, -0.0145F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(98, 103).addBox(-0.4228F, 0.8915F, 0.3872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.0742F, 1.331F, 14.9782F, 0.924F, 0.1917F, -0.0145F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(90, 59).addBox(-1.1159F, -1.0949F, -0.7376F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(90, 64).addBox(-0.8956F, -1.0949F, -0.7376F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(2.0184F, 0.4351F, 9.7646F, 0.0072F, 0.1561F, -0.0147F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(110, 2).addBox(-0.5259F, -0.6667F, 0.4809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(2.0184F, 0.4351F, 9.7646F, 0.557F, 0.1561F, -0.0147F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(114, 32).addBox(-0.5259F, -0.1499F, 0.1528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.0184F, 0.4351F, 9.7646F, -0.0103F, 0.1561F, -0.0147F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(109, 89).addBox(-0.5259F, -1.2099F, -0.6134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.0184F, 0.4351F, 9.7646F, -0.2284F, 0.1561F, -0.0147F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(34, 114).addBox(-0.5259F, 0.0415F, -1.0726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.0184F, 0.4351F, 9.7646F, -1.232F, 0.1561F, -0.0147F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(113, 11).addBox(-0.5259F, -0.1175F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(2.0184F, 0.4351F, 9.7646F, -0.403F, 0.1561F, -0.0147F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(28, 104).addBox(-1.5043F, -0.4469F, 0.4021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.134F)), PartPose.offsetAndRotation(2.2667F, -0.1959F, 10.3625F, 0.5222F, 0.1465F, -0.0268F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(110, 106).addBox(-0.5042F, -2.1731F, 0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F))
				.texOffs(106, 110).addBox(-0.5042F, -1.4481F, 0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.134F)), PartPose.offsetAndRotation(2.2667F, -0.1959F, 10.3625F, 1.9708F, 0.1465F, -0.0268F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(101, 110).addBox(-0.5042F, -1.1262F, 0.2569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(2.2667F, -0.1959F, 10.3625F, 1.6654F, 0.1465F, -0.0268F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(110, 103).addBox(-0.5042F, -0.6711F, 0.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.134F))
				.texOffs(96, 110).addBox(-0.5042F, -0.0711F, 0.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(2.2667F, -0.1959F, 10.3625F, 1.4036F, 0.1465F, -0.0268F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(32, 54).addBox(-1.2043F, 0.1047F, 0.2924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.13F))
				.texOffs(93, 102).addBox(-0.5042F, 0.4047F, 0.2924F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(2.2667F, -0.1959F, 10.3625F, 0.784F, 0.1465F, -0.0268F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(103, 3).addBox(-0.3353F, 0.2596F, -3.0952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(9, 103).addBox(-0.3353F, -0.3022F, -2.7516F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0742F, 1.331F, 14.9782F, -0.1323F, 0.2796F, 0.0114F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(102, 32).addBox(-0.4228F, -0.483F, -0.7423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0742F, 1.331F, 14.9782F, 0.1037F, 0.1917F, -0.0145F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(100, 28).addBox(-0.4228F, -0.3216F, -1.4368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0742F, 1.331F, 14.9782F, 0.1473F, 0.1917F, -0.0145F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9264F, -0.7817F, -17.1414F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(103, 94).mirror().addBox(-0.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0063F, -0.3359F, 6.5939F, 0.1476F, -0.0164F, 0.0153F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(-0.012F, -0.308F, -1.6834F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9505F, -1.0456F, 17.9674F, -1.3881F, -0.2484F, 0.511F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(103, 20).mirror().addBox(-0.012F, -0.5502F, -0.8152F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2646F, -0.2257F, 18.1653F, -1.0823F, -0.2093F, 0.3179F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(18, 95).mirror().addBox(-0.5F, -0.8F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8487F, 2.5947F, 18.5056F, -1.3005F, -0.2093F, 0.0038F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(-0.5F, -0.45F, -1.55F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.8393F, 1.244F, 18.4857F, -1.5187F, -0.2093F, 0.0038F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(-0.5201F, -0.3635F, 0.4447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0742F, 1.331F, 14.9782F, -0.0352F, -0.2093F, 0.0038F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(22, 90).mirror().addBox(-0.5201F, -0.1994F, 0.4992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0742F, 1.331F, 14.9782F, 0.3575F, -0.2093F, 0.0038F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(114, 55).mirror().addBox(-0.5772F, 1.1251F, -0.4379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-3.0742F, 1.331F, 14.9782F, 1.3167F, -0.1917F, 0.0145F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(31, 110).mirror().addBox(-0.5F, -1.5F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1081F, 3.8575F, 19.7121F, 0.4004F, -0.1917F, 0.0145F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(110, 19).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-4.1081F, 3.8575F, 19.7121F, 0.5749F, -0.1917F, 0.0145F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(98, 103).mirror().addBox(-0.5772F, 0.8915F, 0.3872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0742F, 1.331F, 14.9782F, 0.924F, -0.1917F, 0.0145F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(90, 59).mirror().addBox(-0.8841F, -1.0949F, -0.7376F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(90, 64).mirror().addBox(-1.1044F, -1.0949F, -0.7376F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-2.0184F, 0.4351F, 9.7646F, 0.0072F, -0.1561F, 0.0147F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(110, 2).mirror().addBox(-0.4741F, -0.6667F, 0.4809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-2.0184F, 0.4351F, 9.7646F, 0.557F, -0.1561F, 0.0147F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(114, 32).mirror().addBox(-0.4741F, -0.1499F, 0.1528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.0184F, 0.4351F, 9.7646F, -0.0103F, -0.1561F, 0.0147F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(109, 89).mirror().addBox(-0.4741F, -1.2099F, -0.6134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.0184F, 0.4351F, 9.7646F, -0.2284F, -0.1561F, 0.0147F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(34, 114).mirror().addBox(-0.4741F, 0.0415F, -1.0726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.0184F, 0.4351F, 9.7646F, -1.232F, -0.1561F, 0.0147F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(113, 11).mirror().addBox(-0.4741F, -0.1175F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-2.0184F, 0.4351F, 9.7646F, -0.403F, -0.1561F, 0.0147F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(28, 104).mirror().addBox(-0.4958F, -0.4469F, 0.4021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.134F)).mirror(false), PartPose.offsetAndRotation(-2.2667F, -0.1959F, 10.3625F, 0.5222F, -0.1465F, 0.0268F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(110, 106).mirror().addBox(-0.4958F, -2.1731F, 0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false)
				.texOffs(106, 110).mirror().addBox(-0.4958F, -1.4481F, 0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.134F)).mirror(false), PartPose.offsetAndRotation(-2.2667F, -0.1959F, 10.3625F, 1.9708F, -0.1465F, 0.0268F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(101, 110).mirror().addBox(-0.4958F, -1.1262F, 0.2569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(-2.2667F, -0.1959F, 10.3625F, 1.6654F, -0.1465F, 0.0268F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(110, 103).mirror().addBox(-0.4958F, -0.6711F, 0.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.134F)).mirror(false)
				.texOffs(96, 110).mirror().addBox(-0.4958F, -0.0711F, 0.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(-2.2667F, -0.1959F, 10.3625F, 1.4036F, -0.1465F, 0.0268F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(32, 54).mirror().addBox(0.2043F, 0.1047F, 0.2924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false)
				.texOffs(93, 102).mirror().addBox(-0.4958F, 0.4047F, 0.2924F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(-2.2667F, -0.1959F, 10.3625F, 0.784F, -0.1465F, 0.0268F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(103, 3).mirror().addBox(-0.6647F, 0.2596F, -3.0952F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(9, 103).mirror().addBox(-0.6647F, -0.3022F, -2.7516F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0742F, 1.331F, 14.9782F, -0.1323F, -0.2796F, -0.0114F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(102, 32).mirror().addBox(-0.5772F, -0.483F, -0.7423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0742F, 1.331F, 14.9782F, 0.1037F, -0.1917F, 0.0145F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(100, 28).mirror().addBox(-0.5772F, -0.3216F, -1.4368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0742F, 1.331F, 14.9782F, 0.1473F, -0.1917F, 0.0145F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 3.8531F, 1.9722F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r300 = Jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(111, 59).mirror().addBox(-0.6527F, -3.0438F, -6.3821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(111, 35).mirror().addBox(-0.6527F, -3.0438F, -5.6821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, 0.0106F, -0.1643F, -0.0221F));

		PartDefinition cube_r301 = Jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-0.6128F, -2.0401F, -5.2808F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.163F, -0.1623F, -0.033F));

		PartDefinition cube_r302 = Jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(88, 90).mirror().addBox(-0.6128F, -2.1852F, -2.7983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.1106F, -0.1623F, -0.033F));

		PartDefinition cube_r303 = Jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.8485F, -1.0966F, -3.703F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7013F, -13.3769F, -0.0874F, -0.0349F, -0.0041F));

		PartDefinition cube_r304 = Jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(61, 78).mirror().addBox(-0.8485F, -2.4424F, -3.6906F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7013F, -13.3769F, -0.0351F, -0.0349F, -0.0041F));

		PartDefinition cube_r305 = Jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(60, 104).mirror().addBox(-0.4202F, -1.0728F, -3.0387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1725F, -2.6392F, -20.5404F, 0.033F, -0.1703F, -0.1783F));

		PartDefinition cube_r306 = Jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(55, 104).mirror().addBox(-0.4202F, -1.2244F, -1.8254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1725F, -2.6392F, -20.5404F, -0.0979F, -0.1703F, -0.1783F));

		PartDefinition cube_r307 = Jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(50, 104).mirror().addBox(-0.5202F, -1.6754F, -0.8167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(23, 99).mirror().addBox(-0.5202F, -0.7031F, 1.4413F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1725F, -2.6392F, -20.5404F, -0.1416F, -0.1703F, -0.1783F));

		PartDefinition cube_r308 = Jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(21, 107).mirror().addBox(-0.5202F, -1.4661F, 0.2033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1725F, -2.6392F, -20.5404F, -0.2288F, -0.1703F, -0.1783F));

		PartDefinition cube_r309 = Jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(24, 84).mirror().addBox(-0.875F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4739F, -2.0254F, -15.0892F, -0.0504F, -0.0395F, -0.0139F));

		PartDefinition cube_r310 = Jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(30, 63).mirror().addBox(-0.0392F, -0.3292F, -5.6079F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6102F, -1.7987F, -7.8784F, -0.0517F, -0.2268F, -0.0042F));

		PartDefinition cube_r311 = Jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.0392F, -2.4292F, -5.5079F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7013F, -7.8769F, 0.0006F, -0.2268F, -0.0042F));

		PartDefinition cube_r312 = Jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(56, 112).mirror().addBox(-0.7211F, -0.4717F, -5.8091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.3229F, -0.1658F, 0.0F));

		PartDefinition cube_r313 = Jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(6, 113).mirror().addBox(-0.7211F, 1.8509F, -6.7498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(111, 112).mirror().addBox(-0.7211F, 1.8509F, -7.2498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.6894F, -0.1658F, 0.0F));

		PartDefinition cube_r314 = Jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(111, 62).mirror().addBox(-0.7211F, 0.1655F, -6.4606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(21, 111).mirror().addBox(-0.7211F, 0.6655F, -6.4606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.4974F, -0.1658F, 0.0F));

		PartDefinition cube_r315 = Jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(113, 14).mirror().addBox(-0.7211F, 5.4883F, -3.9298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -1.4137F, -0.1658F, 0.0F));

		PartDefinition cube_r316 = Jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.7211F, -1.6314F, -5.2992F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.1222F, -0.1658F, 0.0F));

		PartDefinition cube_r317 = Jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(99, 99).mirror().addBox(-0.7211F, -0.741F, -5.0387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.2618F, -0.1658F, 0.0F));

		PartDefinition cube_r318 = Jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-0.7211F, -1.0206F, -3.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3013F, -16.9769F, -0.1745F, -0.1658F, 0.0F));

		PartDefinition cube_r319 = Jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(86, 102).mirror().addBox(-0.049F, -0.4314F, -5.8068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7013F, -7.8769F, -0.1134F, -0.2269F, 0.0F));

		PartDefinition cube_r320 = Jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(31, 90).mirror().addBox(-0.049F, -0.2948F, -3.8195F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7013F, -7.8769F, -0.1484F, -0.2269F, 0.0F));

		PartDefinition cube_r321 = Jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(79, 90).mirror().addBox(-0.0827F, -0.7242F, -3.2468F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, -0.1134F, -0.2269F, 0.0F));

		PartDefinition cube_r322 = Jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(51, 110).mirror().addBox(-0.046F, -1.3834F, -0.8173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, -1.2305F, -0.192F, 0.0F));

		PartDefinition cube_r323 = Jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(79, 102).mirror().addBox(-0.046F, 0.004F, -1.3571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, 0.0785F, -0.192F, 0.0F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(112, 46).mirror().addBox(-0.046F, 0.1633F, 0.2608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, 0.4276F, -0.192F, 0.0F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(65, 100).mirror().addBox(-0.046F, -0.8206F, 0.3432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, -0.2269F, -0.192F, 0.0F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(39, 77).mirror().addBox(0.0341F, -0.2438F, -9.0489F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, -0.1309F, -0.192F, 0.0F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(9, 98).mirror().addBox(0.0341F, -0.0651F, -8.0972F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, -0.2967F, -0.192F, 0.0F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(0.0341F, -0.3256F, -6.1334F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, -0.2531F, -0.192F, 0.0F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(16, 99).mirror().addBox(0.0341F, -0.7386F, -5.203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, -0.0349F, -0.192F, 0.0F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(98, 51).mirror().addBox(-0.0906F, -0.9031F, -3.2932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.7013F, 0.1231F, 0.0176F, -0.2269F, -0.0006F));

		PartDefinition cube_r331 = Jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(111, 59).addBox(-0.3473F, -3.0438F, -6.3821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(111, 35).addBox(-0.3473F, -3.0438F, -5.6821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, 0.0106F, 0.1643F, 0.0221F));

		PartDefinition cube_r332 = Jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(91, 28).addBox(-0.3872F, -2.0401F, -5.2808F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.163F, 0.1623F, 0.033F));

		PartDefinition cube_r333 = Jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(88, 90).addBox(-0.3872F, -2.1852F, -2.7983F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.1106F, 0.1623F, 0.033F));

		PartDefinition cube_r334 = Jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(35, 84).addBox(-0.1515F, -1.0966F, -3.703F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 0.7013F, -13.3769F, -0.0874F, 0.0349F, 0.0041F));

		PartDefinition cube_r335 = Jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(61, 78).addBox(-0.1515F, -2.4424F, -3.6906F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 0.7013F, -13.3769F, -0.0351F, 0.0349F, 0.0041F));

		PartDefinition cube_r336 = Jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(60, 104).addBox(-0.5798F, -1.0728F, -3.0387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1725F, -2.6392F, -20.5404F, 0.033F, 0.1703F, 0.1783F));

		PartDefinition cube_r337 = Jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(55, 104).addBox(-0.5798F, -1.2244F, -1.8254F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1725F, -2.6392F, -20.5404F, -0.0979F, 0.1703F, 0.1783F));

		PartDefinition cube_r338 = Jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(50, 104).addBox(-0.4798F, -1.6754F, -0.8167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(23, 99).addBox(-0.4798F, -0.7031F, 1.4413F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1725F, -2.6392F, -20.5404F, -0.1416F, 0.1703F, 0.1783F));

		PartDefinition cube_r339 = Jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(21, 107).addBox(-0.4798F, -1.4661F, 0.2033F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1725F, -2.6392F, -20.5404F, -0.2288F, 0.1703F, 0.1783F));

		PartDefinition cube_r340 = Jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(24, 84).addBox(-0.125F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4739F, -2.0254F, -15.0892F, -0.0504F, 0.0395F, 0.0139F));

		PartDefinition cube_r341 = Jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(30, 63).addBox(-0.9608F, -0.3292F, -5.6079F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.6102F, -1.7987F, -7.8784F, -0.0517F, 0.2268F, 0.0042F));

		PartDefinition cube_r342 = Jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(0, 53).addBox(-0.9608F, -2.4292F, -5.5079F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.6F, 0.7013F, -7.8769F, 0.0006F, 0.2268F, 0.0042F));

		PartDefinition cube_r343 = Jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(56, 112).addBox(-0.2789F, -0.4717F, -5.8091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.3229F, 0.1658F, 0.0F));

		PartDefinition cube_r344 = Jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(6, 113).addBox(-0.2789F, 1.8509F, -6.7498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(111, 112).addBox(-0.2789F, 1.8509F, -7.2498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.6894F, 0.1658F, 0.0F));

		PartDefinition cube_r345 = Jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(111, 62).addBox(-0.2789F, 0.1655F, -6.4606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 111).addBox(-0.2789F, 0.6655F, -6.4606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.4974F, 0.1658F, 0.0F));

		PartDefinition cube_r346 = Jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(113, 14).addBox(-0.2789F, 5.4883F, -3.9298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -1.4137F, 0.1658F, 0.0F));

		PartDefinition cube_r347 = Jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(15, 61).addBox(-0.2789F, -1.6314F, -5.2992F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.1222F, 0.1658F, 0.0F));

		PartDefinition cube_r348 = Jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(99, 99).addBox(-0.2789F, -0.741F, -5.0387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.2618F, 0.1658F, 0.0F));

		PartDefinition cube_r349 = Jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(90, 16).addBox(-0.2789F, -1.0206F, -3.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 0.3013F, -16.9769F, -0.1745F, 0.1658F, 0.0F));

		PartDefinition cube_r350 = Jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(86, 102).addBox(-0.951F, -0.4314F, -5.8068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 0.7013F, -7.8769F, -0.1134F, 0.2269F, 0.0F));

		PartDefinition cube_r351 = Jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(31, 90).addBox(-0.951F, -0.2948F, -3.8195F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 0.7013F, -7.8769F, -0.1484F, 0.2269F, 0.0F));

		PartDefinition cube_r352 = Jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(79, 90).addBox(-0.9173F, -0.7242F, -3.2468F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, -0.1134F, 0.2269F, 0.0F));

		PartDefinition cube_r353 = Jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(51, 110).addBox(-0.954F, -1.3834F, -0.8173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, -1.2305F, 0.192F, 0.0F));

		PartDefinition cube_r354 = Jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(79, 102).addBox(-0.954F, 0.004F, -1.3571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, 0.0785F, 0.192F, 0.0F));

		PartDefinition cube_r355 = Jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(112, 46).addBox(-0.954F, 0.1633F, 0.2608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, 0.4276F, 0.192F, 0.0F));

		PartDefinition cube_r356 = Jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(65, 100).addBox(-0.954F, -0.8206F, 0.3432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, -0.2269F, 0.192F, 0.0F));

		PartDefinition cube_r357 = Jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(39, 77).addBox(-1.0341F, -0.2438F, -9.0489F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, -0.1309F, 0.192F, 0.0F));

		PartDefinition cube_r358 = Jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(9, 98).addBox(-1.0341F, -0.0651F, -8.0972F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, -0.2967F, 0.192F, 0.0F));

		PartDefinition cube_r359 = Jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0341F, -0.3256F, -6.1334F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, -0.2531F, 0.192F, 0.0F));

		PartDefinition cube_r360 = Jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(16, 99).addBox(-1.0341F, -0.7386F, -5.203F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, -0.0349F, 0.192F, 0.0F));

		PartDefinition cube_r361 = Jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(98, 51).addBox(-0.9094F, -0.9031F, -3.2932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, 0.7013F, 0.1231F, 0.0176F, 0.2269F, 0.0006F));

		PartDefinition FrontFlipperL = Shoulder.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0209F, 6.6141F, -17.8528F, 0.1708F, -0.2149F, 0.4326F));

		PartDefinition cube_r362 = FrontFlipperL.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(81, 99).addBox(-0.95F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.3533F, -0.5066F, 0.1499F, -0.1987F, 0.4981F, -0.1054F));

		PartDefinition cube_r363 = FrontFlipperL.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 89).addBox(-7.7004F, -1.2799F, -0.1019F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2423F, -0.0906F, -1.7192F, -0.1764F, 0.155F, -0.0371F));

		PartDefinition cube_r364 = FrontFlipperL.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(99, 64).addBox(0.5078F, -0.9671F, -0.6407F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8234F, 0.0905F, 0.6564F, -0.183F, -0.3089F, 0.0467F));

		PartDefinition cube_r365 = FrontFlipperL.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(96, 85).addBox(-2.0F, -0.5F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(8.4277F, -0.3408F, 1.2045F, -0.1758F, 0.1292F, -0.0324F));

		PartDefinition cube_r366 = FrontFlipperL.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(88, 24).addBox(-1.5F, -0.5F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.4415F, -0.2276F, 1.7395F, -0.1918F, -0.429F, 0.0711F));

		PartDefinition cube_r367 = FrontFlipperL.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(115, 0).addBox(-0.7F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0926F, -0.2769F, 1.1151F, -0.1918F, -0.429F, 0.0711F));

		PartDefinition cube_r368 = FrontFlipperL.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(54, 115).addBox(0.075F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0778F, -0.5631F, -0.5196F, -0.3945F, -1.1028F, 0.3462F));

		PartDefinition cube_r369 = FrontFlipperL.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 97).addBox(-0.3F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0778F, -0.5631F, -0.5196F, -0.2439F, -0.7701F, 0.162F));

		PartDefinition cube_r370 = FrontFlipperL.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(72, 84).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1387F, -0.4463F, 0.2636F, -0.1757F, -0.1286F, 0.0132F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1946F, -0.3954F, 0.7967F, -0.1215F, -0.1702F, -0.3099F));

		PartDefinition cube_r371 = FrontFlipperMiddleL.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(32, 58).addBox(-2.6359F, 0.0281F, -2.144F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9885F, -0.1086F, 0.1046F, -0.1742F, -0.0407F, 0.0207F));

		PartDefinition cube_r372 = FrontFlipperMiddleL.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(76, 114).addBox(-0.6269F, -0.4719F, -2.202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 17).addBox(-0.6269F, -0.4719F, -0.702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 114).addBox(-0.6269F, -0.4719F, 0.898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8759F, -0.0882F, -0.1177F, -0.174F, 0.0195F, 0.0101F));

		PartDefinition cube_r373 = FrontFlipperMiddleL.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(85, 95).addBox(-0.9F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 96).addBox(-0.9F, -0.5F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9876F, -0.0756F, 0.0988F, -0.1747F, 0.0882F, -0.002F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2443F, -1.5F, -0.0469F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r374 = FrontFlipperEndL.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(59, 44).addBox(0.0194F, 0.3139F, -1.0496F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0864F, 0.9443F, -0.7807F, -0.1689F, -0.0254F, -0.1364F));

		PartDefinition FrontFlipperL2 = Shoulder.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0209F, 6.6141F, -17.8528F, 0.1397F, 0.4744F, -0.3957F));

		PartDefinition cube_r375 = FrontFlipperL2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(90, 99).addBox(-2.05F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-6.3533F, -0.5066F, 0.1499F, -0.1987F, -0.4981F, 0.1054F));

		PartDefinition cube_r376 = FrontFlipperL2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(11, 90).addBox(4.7004F, -1.2799F, -0.1019F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.2423F, -0.0906F, -1.7192F, -0.1764F, -0.155F, 0.0371F));

		PartDefinition cube_r377 = FrontFlipperL2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(72, 99).addBox(-3.5078F, -0.9671F, -0.6407F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.8234F, 0.0905F, 0.6564F, -0.183F, 0.3089F, -0.0467F));

		PartDefinition cube_r378 = FrontFlipperL2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(97, 69).addBox(0.0F, -0.5F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-8.4277F, -0.3408F, 1.2045F, -0.1758F, -0.1292F, 0.0324F));

		PartDefinition cube_r379 = FrontFlipperL2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(68, 88).addBox(-1.5F, -0.5F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-6.4415F, -0.2276F, 1.7395F, -0.1918F, 0.429F, -0.0711F));

		PartDefinition cube_r380 = FrontFlipperL2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(115, 3).addBox(-0.3F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0926F, -0.2769F, 1.1151F, -0.1918F, 0.429F, -0.0711F));

		PartDefinition cube_r381 = FrontFlipperL2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(59, 115).addBox(-1.075F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0778F, -0.5631F, -0.5196F, -0.3945F, 1.1028F, -0.3462F));

		PartDefinition cube_r382 = FrontFlipperL2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(97, 8).addBox(-1.7F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0778F, -0.5631F, -0.5196F, -0.2439F, 0.7701F, -0.162F));

		PartDefinition cube_r383 = FrontFlipperL2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(84, 77).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.1387F, -0.4463F, 0.2636F, -0.1757F, 0.1286F, -0.0132F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1946F, -0.3954F, 0.7967F, -0.1118F, 0.1942F, 0.3532F));

		PartDefinition cube_r384 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(51, 58).addBox(-2.3641F, 0.0281F, -2.144F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.9885F, -0.1086F, 0.1046F, -0.1742F, 0.0407F, -0.0207F));

		PartDefinition cube_r385 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 115).addBox(-0.3731F, -0.4719F, -2.202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 20).addBox(-0.3731F, -0.4719F, -0.702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 89).addBox(-0.3731F, -0.4719F, 0.898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8759F, -0.0882F, -0.1177F, -0.174F, -0.0195F, -0.0101F));

		PartDefinition cube_r386 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(96, 47).addBox(-1.1F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 81).addBox(-1.1F, -0.5F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9876F, -0.0756F, 0.0988F, -0.1747F, -0.0882F, 0.002F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.2443F, -1.5F, -0.0469F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r387 = FrontFlipperEndL2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(63, 39).addBox(-39.9202F, -2.6678F, -8.5229F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0864F, 3.9443F, 6.2193F, -0.1707F, -0.0042F, -0.0356F));

		PartDefinition BackFlipperL = Pliosaurus.addOrReplaceChild("BackFlipperL", CubeListBuilder.create().texOffs(86, 73).addBox(2.5671F, -0.5F, -1.6427F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4156F, 3.5484F, -1.8153F, -0.0922F, -0.7274F, 0.4009F));

		PartDefinition cube_r388 = BackFlipperL.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(15, 69).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.6032F, 0.0F, -1.0555F, 0.0F, 1.7017F, 0.0F));

		PartDefinition cube_r389 = BackFlipperL.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(45, 70).addBox(0.0F, -1.5F, -10.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(13.567F, 1.0F, 3.8823F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r390 = BackFlipperL.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(94, 4).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3064F, 0.0F, 1.953F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r391 = BackFlipperL.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(93, 33).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(10.2299F, 0.0F, 0.179F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r392 = BackFlipperL.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(85, 47).addBox(-0.6F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5671F, 0.0F, -0.6177F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r393 = BackFlipperL.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(45, 95).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4486F, 0.0F, -0.5665F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r394 = BackFlipperL.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(98, 0).addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F))
				.texOffs(97, 78).addBox(0.0F, -0.5F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4486F, 0.0F, -0.5665F, 0.0F, -0.1134F, 0.0F));

		PartDefinition cube_r395 = BackFlipperL.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(11, 82).addBox(-1.5F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0671F, 0.0F, -0.6427F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create().texOffs(81, 115).addBox(1.5209F, -1.0F, 0.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(95, 37).addBox(-0.9625F, -1.0F, 0.7615F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.1585F, 0.5F, -0.1872F, -0.1897F, -0.1278F, -0.22F));

		PartDefinition cube_r396 = BackFlipperMiddleL.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(111, 109).addBox(-1.7923F, -1.5F, -1.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(3.0307F, 0.5F, 3.5963F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r397 = BackFlipperMiddleL.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(91, 43).addBox(-1.5F, -1.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5378F, 0.5F, -0.5388F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r398 = BackFlipperMiddleL.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(111, 73).addBox(-0.2493F, -1.5F, -0.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(1.6307F, 0.5F, -1.4037F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r399 = BackFlipperMiddleL.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(38, 44).addBox(-0.2824F, 0.0F, -1.6334F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0363F, -0.6F, -0.0328F, 0.0F, -0.0175F, 0.0F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8307F, 0.5F, -1.0037F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r400 = BackFlipperEndL.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(31, 21).addBox(-0.2825F, 0.0F, 0.0148F, 9.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.258F, -1.0F, 0.2552F, 0.07F, -0.3778F, -0.1879F));

		PartDefinition BackFlipperL2 = Pliosaurus.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create().texOffs(87, 55).addBox(-5.5671F, -0.5F, -1.6427F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.4156F, 3.5484F, -1.8153F, -0.0076F, -0.043F, -0.3053F));

		PartDefinition cube_r401 = BackFlipperL2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-6.6032F, 0.0F, -1.0555F, 0.0F, -1.7017F, 0.0F));

		PartDefinition cube_r402 = BackFlipperL2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(70, 48).addBox(-2.0F, -1.5F, -10.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-13.567F, 1.0F, 3.8823F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r403 = BackFlipperL2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(36, 95).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.3064F, 0.0F, 1.953F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r404 = BackFlipperL2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(27, 95).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-10.2299F, 0.0F, 0.179F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r405 = BackFlipperL2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(85, 81).addBox(-1.4F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5671F, 0.0F, -0.6177F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r406 = BackFlipperL2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(54, 95).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4486F, 0.0F, -0.5665F, 0.0F, -0.4538F, 0.0F));

		PartDefinition cube_r407 = BackFlipperL2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(99, 17).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F))
				.texOffs(98, 56).addBox(-3.0F, -0.5F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4486F, 0.0F, -0.5665F, 0.0F, 0.1134F, 0.0F));

		PartDefinition cube_r408 = BackFlipperL2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(82, 39).addBox(-2.5F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.0671F, 0.0F, -0.6427F, 0.0F, 0.1309F, 0.0F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create().texOffs(86, 115).addBox(-2.5209F, -1.0F, 0.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(76, 95).addBox(-1.0375F, -1.0F, 0.7615F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.1585F, 0.5F, -0.1872F, 0.0285F, 0.1278F, 0.22F));

		PartDefinition cube_r409 = BackFlipperMiddleL2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(112, 52).addBox(0.7923F, -1.5F, -1.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-3.0307F, 0.5F, 3.5963F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r410 = BackFlipperMiddleL2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(67, 92).addBox(-0.5F, -1.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5378F, 0.5F, -0.5388F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r411 = BackFlipperMiddleL2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(112, 49).addBox(-0.7507F, -1.5F, -0.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.6307F, 0.5F, -1.4037F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r412 = BackFlipperMiddleL2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(45, 0).addBox(-5.7176F, 0.0F, -1.6334F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0363F, -0.6F, -0.0328F, 0.0F, 0.0175F, 0.0F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8307F, 0.5F, -1.0037F, 0.0F, -0.1658F, 0.0F));

		PartDefinition cube_r413 = BackFlipperEndL2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(0, 39).addBox(-8.7175F, 0.0F, 0.0148F, 9.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.258F, -1.0F, 0.2552F, 0.0F, 0.384F, 0.0F));

		PartDefinition Tail1 = Pliosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3101F, 4.4898F, -0.3694F, 0.1222F, -0.0471F));

		PartDefinition cube_r414 = Tail1.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(115, 92).addBox(-0.5F, -1.6028F, -0.0069F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6143F, 3.9272F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Tail1.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(116, 66).addBox(0.0F, -0.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 58).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8473F, 2.2226F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Tail1.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(14, 116).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4771F, 1.925F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Tail1.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(8, 116).addBox(-0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3376F, -0.0702F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Tail1.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(73, 70).addBox(-1.5F, 0.0F, -1.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4143F, 1.0271F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r419 = Tail1.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(35, 104).mirror().addBox(-1.8249F, 1.0491F, 0.015F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6143F, 3.9272F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r420 = Tail1.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(104, 38).mirror().addBox(-1.9495F, 0.0163F, 1.6353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 103).mirror().addBox(-2.4495F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.4835F, 0.3973F, -0.0085F, 0.1309F, -0.1309F));

		PartDefinition cube_r421 = Tail1.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(35, 104).addBox(-0.1751F, 1.0491F, 0.015F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6143F, 3.9272F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r422 = Tail1.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(104, 38).addBox(-0.0504F, 0.0163F, 1.6353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(-0.5504F, 0.1163F, -0.3647F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.4835F, 0.3973F, -0.0085F, -0.1309F, 0.1309F));

		PartDefinition cube_r423 = Tail1.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(97, 73).addBox(-1.0F, -0.0197F, -0.1474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.6143F, 3.9272F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9599F, 5.799F, -0.2288F, 0.1275F, -0.0296F));

		PartDefinition cube_r424 = Tail2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(110, 115).addBox(-0.5F, -1.3716F, -0.0169F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1659F, 1.8791F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r425 = Tail2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(115, 102).addBox(-0.5F, -1.4716F, -0.017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8531F, -0.0963F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r426 = Tail2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(116, 6).mirror().addBox(-0.6F, -0.1F, 1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 110).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4117F, 0.196F, 0.6555F, 0.1312F, 0.1309F, -0.1309F));

		PartDefinition cube_r427 = Tail2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(56, 110).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 6).addBox(-0.4F, -0.1F, 1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4117F, 0.196F, 0.6555F, 0.1312F, -0.1309F, 0.1309F));

		PartDefinition cube_r428 = Tail2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(116, 8).addBox(0.0F, 2.1F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 62).addBox(0.0F, 0.5F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.8071F, -3.5764F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r429 = Tail2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(73, 77).addBox(-1.0F, 0.0284F, -0.3169F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7472F, 3.8143F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition cube_r430 = Tail3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(88, 28).addBox(-0.5F, -1.1F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9145F, 3.9657F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r431 = Tail3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8622F, 1.9664F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r432 = Tail3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(113, 115).addBox(-0.5F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -0.0287F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r433 = Tail3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(72, 96).addBox(0.0F, 3.7F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 92).addBox(0.0F, 2.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.5544F, -7.3907F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Tail3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(60, 70).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -0.0287F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -0.6983F, -0.0512F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5619F, 4.9594F, 0.2037F, 0.171F, 0.0351F));

		PartDefinition cube_r435 = Tail4.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(68, 85).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7233F, 1.4488F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r436 = Tail4.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(116, 23).addBox(0.0F, 4.5F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.1163F, -12.3501F, 0.637F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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