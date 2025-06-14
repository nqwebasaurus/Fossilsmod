package fossils.fossils.client.blockentity.model.qianosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class QianosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;

	public QianosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.backLeftLeg = this.main.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backRightLeg = this.main.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.main.getChild("body");
		this.frontLeftLeg = this.body.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontRightLeg = this.body.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -6.25F, 5.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(66, 23).addBox(0.0F, -1.7F, 4.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 48).mirror().addBox(-1.0F, 0.1F, 2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 33).mirror().addBox(-2.0F, 0.8F, 3.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(13, 42).mirror().addBox(-2.0F, -0.2F, 2.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 19).addBox(0.0F, -1.7F, 2.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 65).addBox(0.0F, -1.7F, 0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 33).addBox(1.0F, 0.8F, 3.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(9, 48).addBox(0.0F, 0.1F, 2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 42).addBox(1.0F, -0.2F, 2.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(29, 0).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.1F, -0.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(0.4F, -0.9756F, 1.3373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 45).mirror().addBox(0.4F, -0.4756F, -1.2627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -5.1187F, 3.5768F, -0.7641F, 0.2173F, -0.2037F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(59, 37).mirror().addBox(0.0F, -0.7839F, -3.1063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -5.5423F, 2.4725F, 0.7156F, -0.2443F, -0.0698F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 51).mirror().addBox(0.0F, -0.4268F, -1.2719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -5.5423F, 2.4725F, 0.4363F, -0.2443F, -0.0698F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -6.7894F, 0.4629F, 0.2005F, 0.0608F, -0.5873F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -6.7894F, 0.4629F, 0.1591F, 0.1368F, -1.0014F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(3, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7894F, 0.4629F, 0.2005F, -0.0608F, 0.5873F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 66).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7894F, 0.4629F, 0.1591F, -0.1368F, 1.0014F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 37).addBox(-1.0F, -0.7839F, -3.1063F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3F, -5.5423F, 2.4725F, 0.7156F, 0.2443F, 0.0698F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 61).addBox(-1.4F, -0.9756F, 1.3373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(0, 45).addBox(-1.4F, -0.4756F, -1.2627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, -5.1187F, 3.5768F, -0.7641F, -0.2173F, 0.2037F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 51).addBox(-1.0F, -0.4268F, -1.2719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, -5.5423F, 2.4725F, 0.4363F, 0.2443F, 0.0698F));

		PartDefinition backLeftLeg = main.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, -5.4F, 3.25F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r12 = backLeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 21).addBox(-0.5F, -1.9512F, -0.9064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3315F, 0.7444F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r13 = backLeftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 6).addBox(-0.5F, 0.0133F, -0.0609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1315F, -0.8556F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r14 = backLeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 53).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8315F, 0.3444F, -0.192F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create().texOffs(49, 21).addBox(-0.8F, -0.0152F, -0.1661F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.0111F, -0.4099F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r15 = backLeftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 48).addBox(0.5F, -0.2726F, -0.2654F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.2848F, 0.2339F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.2791F, 0.6847F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r16 = backLeftLeg3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 21).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.7F, 0.0F, 0.0F, 0.0F));

		PartDefinition backRightLeg = main.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, -5.4F, 3.25F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r17 = backRightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(61, 25).addBox(-0.5F, -1.9512F, -0.9064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3315F, 0.7444F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r18 = backRightLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(35, 65).addBox(-0.5F, 0.0133F, -0.0609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1315F, -0.8556F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r19 = backRightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(58, 13).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8315F, 0.3444F, -0.192F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create().texOffs(0, 50).addBox(-0.2F, -0.0152F, -0.1661F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.0111F, -0.4099F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r20 = backRightLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(23, 48).addBox(-1.5F, -0.2726F, -0.2654F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.2848F, 0.2339F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.2791F, 0.6847F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r21 = backRightLeg3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.7F, 0.0F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 27).addBox(-0.5F, -0.4503F, 0.0625F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F))
				.texOffs(66, 35).addBox(0.0F, -2.0503F, 1.0625F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.4F, 5.0F, -0.0982F, 0.0929F, -0.2388F));

		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 67).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4503F, 5.0625F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 39).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4503F, 3.0625F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(68, 13).addBox(0.0F, 1.3808F, 3.5506F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 29).addBox(0.0F, 0.7123F, 1.8202F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 67).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5497F, 1.0625F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.3638F, -0.1603F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0504F, 6.1581F, -0.0487F, -0.387F, 0.0687F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 67).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3638F, 4.8397F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 67).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3638F, 2.8397F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 9).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3638F, 0.8397F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 52).addBox(0.0F, 5.0808F, 8.8506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 69).addBox(0.0F, 4.2808F, 7.1506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 56).addBox(0.0F, 2.4808F, 5.3506F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6001F, -5.0956F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.0436F, -0.001F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F))
				.texOffs(46, 69).addBox(0.0F, -0.8436F, 7.999F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3556F, 6.8133F, -0.0813F, -0.261F, 0.021F));

		PartDefinition cube_r29 = tail3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(43, 69).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 5.999F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(19, 67).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 3.999F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 67).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 1.999F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 69).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, -0.001F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r33 = tail3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(67, 68).addBox(0.0F, 9.1808F, 17.4506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 50).addBox(0.0F, 8.3808F, 15.7506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 45).addBox(0.0F, 7.5808F, 14.0506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 69).addBox(0.0F, 6.6808F, 12.1506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 69).addBox(0.0F, 5.8808F, 10.4506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9557F, -11.909F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(21, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(49, 69).addBox(0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 49).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4564F, 8.999F, 0.0911F, -0.2052F, -0.1897F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5F, 6.6F, 0.1548F, -0.5618F, -0.083F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -6.825F, -0.75F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(46, 65).addBox(0.0F, -1.451F, 5.0052F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 65).addBox(0.0F, -1.251F, 3.0052F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 65).addBox(0.0F, -1.051F, 1.0052F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 19).addBox(-0.5F, 0.049F, 0.0052F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1972F, -5.9158F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(33, 57).mirror().addBox(0.7F, -0.6645F, -0.8974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 2.2241F, -9.691F, 1.0088F, 0.2018F, 0.3081F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(57, 29).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 29).addBox(4.9F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, 2.1387F, -8.7418F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 59).mirror().addBox(-0.5F, 0.0334F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 59).addBox(4.9F, 0.0334F, -0.0452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -0.2837F, -5.9823F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-0.5F, -0.0586F, 0.0106F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(60, 6).addBox(4.9F, -0.0586F, 0.0106F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.7F, 0.6163F, -5.6823F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(5, 57).mirror().addBox(-0.5F, -0.008F, 0.0947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(5, 57).addBox(4.9F, -0.008F, 0.0947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.7F, -0.6837F, -8.1823F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(33, 52).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(33, 52).addBox(4.9F, -0.8F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.7F, 0.5163F, -8.9823F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(50, 56).addBox(4.9F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.7F, 2.1387F, -8.7418F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-6.3833F, -1.3833F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8907F, -10.4813F, 0.1109F, 0.3684F, -1.4454F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8907F, -10.4813F, 0.3687F, 0.1097F, -0.4508F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(67, 55).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8907F, -10.4813F, 0.296F, 0.2483F, -0.8529F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(41, 41).mirror().addBox(-7.3833F, -1.3833F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8907F, -8.4813F, 0.0893F, 0.3016F, -1.3303F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8907F, -8.4813F, 0.2405F, 0.2041F, -0.7432F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(67, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8907F, -8.4813F, 0.3013F, 0.0905F, -0.3353F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5907F, -6.4813F, 0.2508F, 0.0757F, -0.2872F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5907F, -6.4813F, 0.1995F, 0.1706F, -0.6985F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(21, 19).mirror().addBox(-6.3833F, -1.3833F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5907F, -6.4813F, 0.0737F, 0.2514F, -1.2822F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(27, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1907F, -0.5813F, 0.2005F, 0.0608F, -0.4651F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(22, 67).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1907F, -0.5813F, 0.1591F, 0.1368F, -0.8792F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(58, 19).mirror().addBox(-3.3833F, -1.3833F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1907F, -0.5813F, 0.0585F, 0.2012F, -1.4602F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 41).mirror().addBox(-4.3833F, -1.3833F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3907F, -2.5813F, 0.0636F, 0.218F, -1.3719F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3907F, -2.5813F, 0.1725F, 0.1481F, -0.79F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3907F, -2.5813F, 0.2173F, 0.0658F, -0.3768F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(44, 5).mirror().addBox(-5.3833F, -1.3833F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5907F, -4.5813F, 0.0737F, 0.2514F, -1.352F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5907F, -4.5813F, 0.1995F, 0.1706F, -0.7683F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5907F, -4.5813F, 0.2508F, 0.0757F, -0.357F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 19).addBox(1.3833F, -1.3833F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1907F, -0.5813F, 0.0585F, -0.2012F, 1.4602F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(22, 67).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1907F, -0.5813F, 0.1591F, -0.1368F, 0.8792F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(27, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1907F, -0.5813F, 0.2005F, -0.0608F, 0.4651F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(68, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3907F, -2.5813F, 0.2173F, -0.0658F, 0.3768F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(35, 68).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3907F, -2.5813F, 0.1725F, -0.1481F, 0.79F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 41).addBox(1.3833F, -1.3833F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3907F, -2.5813F, 0.0636F, -0.218F, 1.3719F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(67, 55).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8907F, -10.4813F, 0.296F, -0.2483F, 0.8529F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8907F, -10.4813F, 0.3687F, -0.1097F, 0.4508F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 43).addBox(1.3833F, -1.3833F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8907F, -10.4813F, 0.1109F, -0.3684F, 1.4454F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8907F, -8.4813F, 0.3013F, -0.0905F, 0.3353F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(52, 67).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8907F, -8.4813F, 0.2405F, -0.2041F, 0.7432F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(41, 41).addBox(1.3833F, -1.3833F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8907F, -8.4813F, 0.0893F, -0.3016F, 1.3303F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(21, 19).addBox(1.3833F, -1.3833F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5907F, -6.4813F, 0.0737F, -0.2514F, 1.2822F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(67, 43).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5907F, -6.4813F, 0.1995F, -0.1706F, 0.6985F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(67, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5907F, -6.4813F, 0.2508F, -0.0757F, 0.2872F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(44, 5).addBox(1.3833F, -1.3833F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5907F, -4.5813F, 0.0737F, -0.2514F, 1.352F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(66, 27).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5907F, -4.5813F, 0.1995F, -0.1706F, 0.7683F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5907F, -4.5813F, 0.2508F, -0.0757F, 0.357F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.9754F, 0.0458F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8028F, -7.3158F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(69, 38).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 35).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 32).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 35).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2972F, -10.9158F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(33, 57).addBox(-2.7F, -0.6645F, -0.8974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 2.2241F, -9.691F, 1.0088F, -0.2018F, -0.3081F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, 0.4F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3662F, -8.7358F, -0.5236F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = body.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create().texOffs(57, 55).addBox(-0.5F, -0.3844F, -0.388F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.35F, 3.9362F, -9.2576F, -0.0436F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create().texOffs(28, 52).addBox(0.0F, -0.7504F, 0.0316F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 52).addBox(0.0F, 0.2496F, -0.7684F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 3.7931F, 0.4294F, -0.8727F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -0.5301F, -2.5954F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3398F, -0.0545F, 0.9599F, 0.0F, 0.0F));

		PartDefinition frontRightLeg = body.addOrReplaceChild("frontRightLeg", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -0.3844F, -0.388F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.35F, 3.9362F, -9.2576F, 0.7418F, 0.0F, 0.0F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create().texOffs(52, 29).addBox(-1.0F, -0.7504F, 0.0316F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(45, 52).addBox(-1.0F, 0.2496F, -0.7684F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 3.7931F, 0.4294F, -0.9163F, 0.0F, 0.0F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create().texOffs(38, 8).addBox(-2.0F, -0.5301F, -2.5954F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3398F, -0.0545F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9263F, -10.8942F, 0.0115F, -0.1304F, -0.088F));

		PartDefinition cube_r82 = neck.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 29).addBox(0.0F, -1.2609F, 2.9858F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 69).addBox(0.0F, -1.2609F, 0.9858F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 35).addBox(-0.5F, -0.6609F, -0.0142F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3327F, -4.5847F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r83 = neck.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-3.9135F, -0.4067F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1644F, -3.2871F, 0.1063F, 0.4717F, -1.3261F));

		PartDefinition cube_r84 = neck.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(67, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1644F, -3.2871F, 0.2971F, 0.3862F, -0.8743F));

		PartDefinition cube_r85 = neck.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4644F, -1.2871F, 0.2497F, 0.3323F, -0.8037F));

		PartDefinition cube_r86 = neck.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(29, 8).mirror().addBox(-3.9135F, -0.4067F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4644F, -1.2871F, 0.0879F, 0.4039F, -1.2466F));

		PartDefinition cube_r87 = neck.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(67, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1644F, -3.2871F, 0.2971F, -0.3862F, 0.8743F));

		PartDefinition cube_r88 = neck.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(55, 4).addBox(0.9135F, -0.4067F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1644F, -3.2871F, 0.1063F, -0.4717F, 1.3261F));

		PartDefinition cube_r89 = neck.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4644F, -1.2871F, 0.2497F, -0.3323F, 0.8037F));

		PartDefinition cube_r90 = neck.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(29, 8).addBox(0.9135F, -0.4067F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4644F, -1.2871F, 0.0879F, -0.4039F, 1.2466F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2459F, -4.5216F, -0.1733F, -0.267F, 0.0812F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(25, 69).addBox(0.0F, -0.6612F, 2.8918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 22).addBox(0.0F, -0.7612F, 0.8918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 35).addBox(-0.5F, -0.0612F, -0.1082F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5412F, -3.8904F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(60, 43).mirror().addBox(-2.9135F, -0.4067F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1185F, -2.6655F, 0.0968F, 0.9742F, -1.3631F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1185F, -2.6655F, 0.6042F, 0.8237F, -0.7249F));

		PartDefinition cube_r94 = neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(60, 11).mirror().addBox(-2.9135F, -0.4067F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2185F, -0.5655F, 0.2428F, 0.8406F, -1.2413F));

		PartDefinition cube_r95 = neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(62, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2185F, -0.5655F, 0.6069F, 0.6629F, -0.7166F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(67, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1185F, -2.6655F, 0.6042F, -0.8237F, 0.7249F));

		PartDefinition cube_r97 = neck2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(60, 43).addBox(0.9135F, -0.4067F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1185F, -2.6655F, 0.0968F, -0.9742F, 1.3631F));

		PartDefinition cube_r98 = neck2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(60, 11).addBox(0.9135F, -0.4067F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2185F, -0.5655F, 0.2428F, -0.8406F, 1.2413F));

		PartDefinition cube_r99 = neck2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2185F, -0.5655F, 0.6069F, -0.6629F, 0.7166F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2118F, -3.8631F, 0.31F, -0.2595F, -0.035F));

		PartDefinition cube_r100 = neck3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(22, 69).addBox(0.0F, -1.2F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 19).addBox(0.0F, -1.2F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1706F, -3.5274F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(47, 60).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -2.8024F, 0.382F, 1.0273F, -1.0178F));

		PartDefinition cube_r102 = neck3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(60, 45).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -0.8024F, 0.3215F, 0.9237F, -1.0691F));

		PartDefinition cube_r103 = neck3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(47, 60).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -2.8024F, 0.382F, -1.0273F, 1.0178F));

		PartDefinition cube_r104 = neck3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 45).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -0.8024F, 0.3215F, -0.9237F, 1.0691F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(51, 7).addBox(-1.5F, 0.2988F, -0.7236F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 48).addBox(-1.0F, 0.1988F, -3.6236F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0894F, -4.2057F, 0.1304F, -0.0114F, 0.0865F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(25, 64).addBox(-0.175F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.325F, 1.4572F, -6.6311F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-0.6F, -1.1199F, -0.0546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(64, 29).addBox(-0.4F, -1.1199F, -0.0546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, 1.8867F, -5.1303F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(22, 60).mirror().addBox(-0.675F, -1.8028F, -0.0987F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 60).mirror().addBox(-0.675F, -1.8028F, 0.7013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 60).addBox(-0.325F, -1.8028F, 0.7013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 60).addBox(-0.325F, -1.8028F, -0.0987F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.1988F, -5.0236F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(46, 48).addBox(-1.5F, -0.8F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.475F, 1.6488F, -3.5236F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(54, 21).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 1.0984F, -6.7131F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(52, 64).addBox(-0.5F, -0.1728F, -1.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 50).addBox(-0.5F, -0.1728F, -0.814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0188F, -5.4694F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 32).addBox(-0.5F, 0.0261F, -0.9627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2812F, -4.5694F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(20, 64).addBox(-0.5F, -0.0553F, -0.8646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3812F, -3.6694F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, 0.9884F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 48).addBox(-0.5F, -0.0116F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0012F, -1.7986F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.52F, -1.1134F, -0.8128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 64).mirror().addBox(-0.42F, -1.7134F, -0.8128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(63, 16).mirror().addBox(-0.52F, -0.8134F, -0.8128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1085F, -4.6569F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(63, 13).mirror().addBox(-0.52F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.1915F, -4.3569F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-0.51F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.079F, -2.4187F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.51F, -0.6F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4455F, -3.3492F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(57, 64).mirror().addBox(-1.51F, 0.1994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(64, 61).mirror().addBox(-1.51F, 0.5994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(65, 0).mirror().addBox(-1.8F, 0.2994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(62, 64).mirror().addBox(-1.61F, 0.2994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(64, 61).addBox(0.51F, 0.5994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(65, 0).addBox(0.8F, 0.2994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(62, 64).addBox(0.61F, 0.2994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(57, 64).addBox(0.51F, 0.1994F, -3.101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(49, 17).addBox(-1.5F, -0.0006F, -3.201F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.1512F, 1.4014F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(59, 61).mirror().addBox(-0.52F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(59, 61).addBox(1.92F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2F, 0.5108F, 0.4171F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(47, 62).mirror().addBox(-0.52F, 0.406F, -0.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 62).mirror().addBox(-0.52F, -0.194F, -0.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(47, 62).addBox(1.92F, 0.406F, -0.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 62).addBox(1.92F, -0.194F, -0.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2F, -0.5917F, 0.1497F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-0.52F, -0.8574F, -0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.7083F, 0.1497F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(-0.52F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 55).mirror().addBox(-0.52F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(62, 58).addBox(1.92F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 55).addBox(1.92F, -0.9F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.2F, 0.0083F, 0.0497F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-1.5F, -0.4F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 61).addBox(0.5F, -0.4F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6399F, 0.6333F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 47).mirror().addBox(-1.5F, 0.001F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 47).addBox(0.5F, 0.001F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7012F, 0.5764F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(37, 62).mirror().addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 62).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2988F, 0.2764F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(10, 64).addBox(-0.58F, -1.7134F, -0.8128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(0, 64).addBox(-0.48F, -1.1134F, -0.8128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 16).addBox(-0.48F, -0.8134F, -0.8128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.2F, -0.1085F, -4.6569F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(63, 13).addBox(-0.48F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.1915F, -4.3569F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 0).addBox(-0.49F, -0.6F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.4455F, -3.3492F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(17, 60).addBox(-0.49F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 0.079F, -2.4187F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(32, 61).addBox(-0.48F, -0.8574F, -0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.2F, 0.7083F, 0.1497F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(49, 13).addBox(-1.5F, -0.0045F, 0.0013F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.0512F, -0.7986F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(15, 64).addBox(-0.5F, -0.8851F, -0.3811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.0282F, -5.1657F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.9618F, -1.9139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1988F, -3.3236F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(51, 10).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2988F, -0.7236F, -0.1047F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(53, 43).addBox(0.2F, -0.0346F, -4.7791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(30, 64).addBox(-0.4F, -0.3346F, -5.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(53, 43).mirror().addBox(-1.2F, -0.0346F, -4.7791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(30, 64).mirror().addBox(-0.6F, -0.3346F, -5.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 43).addBox(-0.6F, -0.2346F, -7.8791F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 43).mirror().addBox(-0.4F, -0.2346F, -7.8791F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0988F, 1.2264F, 0.4573F, 0.013F, -0.0692F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(55, 47).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(44, 0).addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4654F, -6.3791F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(54, 25).mirror().addBox(-1.0F, -0.2F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 25).addBox(0.4F, -0.2F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 0.1654F, -4.5791F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(35, 43).mirror().addBox(-1.59F, -0.2061F, -0.2223F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3346F, -2.3791F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(65, 3).mirror().addBox(-1.59F, -0.2989F, -0.1967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(65, 3).addBox(0.79F, -0.2989F, -0.1967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.1F, -0.1346F, -2.9791F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(52, 37).mirror().addBox(-0.59F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 37).addBox(1.79F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.3629F, -0.0749F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(-1.59F, -0.752F, -0.2342F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(50, 52).addBox(0.79F, -0.752F, -0.2342F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1F, 0.9654F, -1.4791F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(17, 56).mirror().addBox(-1.59F, -1.2047F, 0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(5, 53).mirror().addBox(-1.59F, -0.8047F, -0.2226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 65).mirror().addBox(-1.6F, -1.1047F, 0.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 65).addBox(0.8F, -1.1047F, 0.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 56).addBox(0.79F, -1.2047F, 0.1774F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F))
				.texOffs(5, 53).addBox(0.79F, -0.8047F, -0.2226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 0.7654F, -3.0791F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 43).addBox(0.59F, -0.2061F, -0.2223F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1F, -0.3346F, -2.3791F, -0.1047F, 0.0F, 0.0F));

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