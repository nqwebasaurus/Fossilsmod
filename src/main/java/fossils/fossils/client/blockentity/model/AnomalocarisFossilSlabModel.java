package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnomalocarisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart anomalocaris;
	private final ModelPart tail;
	private final ModelPart appendage;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart matrix;

	public AnomalocarisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.anomalocaris = this.fossil.getChild("anomalocaris");
		this.tail = this.anomalocaris.getChild("tail");
		this.appendage = this.anomalocaris.getChild("appendage");
		this.head = this.anomalocaris.getChild("head");
		this.body = this.anomalocaris.getChild("body");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition anomalocaris = fossil.addOrReplaceChild("anomalocaris", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = anomalocaris.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.8F, 0.0F, 9.0F));

		PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(96, 80).addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.275F, 0.175F, 1.95F, 0.0F, 0.6632F, 0.0F));

		PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 82).addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.375F, 0.225F, 2.975F, 0.0F, 1.1737F, 0.0F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 83).addBox(0.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-2.275F, 0.175F, 3.65F, 0.0F, 1.2392F, 0.0F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 57).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.625F, 0.2F, 0.725F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 76).addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.625F, 0.225F, -1.25F, 0.0F, -0.0218F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 39).addBox(0.0F, -2.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.75F, 0.2F, 0.175F, 0.0F, -0.2923F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 55).addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-1.425F, 0.225F, 0.15F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.25F, 0.175F, 1.475F, 0.0F, 0.4843F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 71).addBox(0.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.725F, 0.2F, 3.3F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(36, 90).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.225F, 0.225F, 4.45F, 0.0F, 1.1956F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 64).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.6F, 0.2F, 2.1F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 56).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.85F, 0.2F, 0.925F, 0.0F, -0.5061F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 82).addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.05F, 0.225F, 0.7F, 0.0F, -0.5061F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 65).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.15F, 0.225F, 0.5F, 0.0F, -0.6065F, 0.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 64).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(1.05F, 0.225F, 1.475F, 0.0F, 0.7461F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 63).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.375F, 0.4F, 0.1F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 64).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 0.576F, 0.0F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 23).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.425F, 0.0F, 0.0F, 0.4014F, 0.0F));

		PartDefinition appendage = anomalocaris.addOrReplaceChild("appendage", CubeListBuilder.create(), PartPose.offset(-2.35F, 0.0F, -6.475F));

		PartDefinition cube_r19 = appendage.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(96, 18).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 0.1F, -0.725F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r20 = appendage.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 82).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.3F, 0.1F, -1.2F, 0.0F, 1.597F, 0.0F));

		PartDefinition cube_r21 = appendage.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(72, 94).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.025F, 0.1F, -1.65F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r22 = appendage.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(94, 65).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.05F, 0.1F, -2.175F, 0.0F, 1.0734F, 0.0F));

		PartDefinition cube_r23 = appendage.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(6, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.125F, 0.125F, -0.375F, 0.0F, -1.4268F, 0.0F));

		PartDefinition cube_r24 = appendage.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(94, 92).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.725F, 0.125F, -1.775F, 0.0F, -1.165F, 0.0F));

		PartDefinition cube_r25 = appendage.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.125F, 0.125F, -0.65F, 0.0F, 0.2793F, 0.0F));

		PartDefinition cube_r26 = appendage.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(12, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.1F, 0.125F, -2.35F, 0.0F, 0.672F, 0.0F));

		PartDefinition cube_r27 = appendage.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(78, 94).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.1F, 0.125F, -2.85F, 0.0F, -0.9425F, 0.0F));

		PartDefinition cube_r28 = appendage.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 87).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.65F, 0.1F, -3.075F, 0.0F, 0.7592F, 0.0F));

		PartDefinition cube_r29 = appendage.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(94, 68).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 0.1F, -0.2F, 0.0F, 2.0551F, 0.0F));

		PartDefinition head = anomalocaris.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(48, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(1.95F, 0.2F, -10.55F, 0.0F, -0.0742F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(4, 98).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(2.15F, 0.2F, -9.975F, 0.0F, -1.2523F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(78, 97).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.425F, 0.2F, -10.925F, 0.0F, -1.2435F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(42, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.15F, 0.2F, -10.8F, 0.0F, -0.6196F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(76, 65).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.925F, 0.2F, -11.5F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 97).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.7F, 0.2F, -9.775F, 0.0F, 0.7679F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(52, 98).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.225F, 0.1F, -9.95F, 0.0F, 2.0595F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(12, 98).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.75F, 0.1F, -10.625F, 0.0F, -1.5403F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(8, 98).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(2.7F, 0.1F, -10.625F, 0.0F, -1.4094F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(82, 90).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(3.325F, 0.1F, -10.7F, 0.0F, -2.5831F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 81).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(3.225F, 0.1F, -10.5F, 0.0F, -2.8885F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(96, 77).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.4F, 0.1F, -10.0F, 0.0F, 2.4566F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(96, 89).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.375F, 0.1F, -9.95F, 0.0F, 1.6668F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(74, 97).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-2.3F, 0.2F, -10.2F, 0.0F, 1.1257F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(88, 96).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-2.425F, 0.2F, -10.175F, 0.0F, 1.3003F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(96, 86).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.575F, 0.2F, -10.45F, 0.0F, 0.7679F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(30, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-1.5F, 0.2F, -10.75F, 0.0F, 0.4014F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(24, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, 0.2F, -11.15F, 0.0F, 0.4014F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(36, 71).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.1F, 0.2F, -11.6F, 0.0F, 0.2443F, 0.0F));

		PartDefinition body = anomalocaris.addOrReplaceChild("body", CubeListBuilder.create().texOffs(44, 43).addBox(0.325F, -1.95F, 8.175F, 3.0F, 2.0F, 11.0F, new CubeDeformation(-0.3F)), PartPose.offset(-1.7F, 0.0F, -9.55F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 87).addBox(-0.661F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.1F, 0.1F, 16.0F, 0.0F, 1.6319F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(86, 47).addBox(-0.661F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0F, 0.1F, 16.0F, 0.0F, 2.1555F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 77).addBox(-0.661F, -2.0F, -2.9076F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-1.6F, 0.1F, 14.925F, 0.0F, 2.1773F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(44, 88).addBox(0.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(6.75F, 0.125F, 0.925F, 0.0F, 3.1023F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 82).addBox(1.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.075F, 0.1F, -0.275F, 0.0F, -1.6624F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(8, 88).addBox(1.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(5.2F, 0.125F, 0.2F, 0.0F, -2.7533F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(10, 85).addBox(1.339F, -2.0F, -0.9076F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(7.9F, 0.125F, 1.375F, 0.0F, -2.9147F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(94, 49).addBox(1.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.525F, 0.125F, 3.525F, 0.0F, 2.3649F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(88, 89).addBox(1.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.875F, 0.125F, 2.075F, 0.0F, -3.1329F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(80, 79).addBox(1.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.85F, 0.125F, 3.1F, 0.0F, -2.8187F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(60, 96).addBox(1.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(8.75F, 0.125F, 3.875F, 0.0F, 3.0281F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(86, 55).addBox(1.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(9.975F, 0.125F, 4.95F, 0.0F, 2.7227F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(96, 58).addBox(1.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(10.2F, 0.125F, 2.25F, 0.0F, -2.426F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 30).addBox(1.339F, -2.0F, -6.9076F, 4.0F, 2.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.875F, 0.1F, 3.85F, 0.0F, -3.0805F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(96, 74).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(4.95F, 0.125F, 5.675F, 0.0F, -0.4276F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(48, 91).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.1F, 0.125F, 5.25F, 0.0F, -0.5149F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(60, 71).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.225F, 0.125F, 5.8F, 0.0F, -0.4276F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(12, 70).addBox(3.339F, -2.0F, -2.9076F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(1.675F, 0.1F, 13.3F, 0.0F, 0.3883F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(64, 70).addBox(3.339F, -2.0F, -2.9076F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.175F, 0.125F, 14.0F, 0.0F, 0.3883F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(24, 77).addBox(3.339F, -2.0F, -2.9076F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.15F, 0.05F, 13.775F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 99).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.875F, 0.125F, 5.575F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(40, 98).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.825F, 0.125F, 9.875F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 94).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.025F, 0.125F, 8.0F, 0.0F, 0.9687F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(88, 92).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.925F, 0.125F, 7.95F, 0.0F, 1.405F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(42, 91).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.925F, 0.125F, 11.95F, 0.0F, 1.2305F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(96, 98).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(13.0F, 0.125F, 10.25F, 0.0F, 2.3649F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(44, 98).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(11.55F, 0.125F, 11.55F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 98).addBox(3.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(10.475F, 0.125F, 12.65F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(96, 39).addBox(3.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(10.475F, 0.125F, 13.15F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(96, 9).addBox(3.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(10.225F, 0.125F, 13.575F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(34, 77).addBox(3.339F, -2.0F, -2.9076F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.0F, 0.125F, 14.675F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(94, 52).addBox(3.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.35F, 0.125F, 17.55F, 0.0F, 1.7977F, 0.0F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(96, 15).addBox(3.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.65F, 0.125F, 17.025F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(96, 12).addBox(3.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.65F, 0.1F, 17.625F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(96, 6).addBox(3.339F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(7.35F, 0.125F, 13.55F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 90).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(7.525F, 0.1F, 14.85F, 0.0F, 1.3614F, 0.0F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(94, 27).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(8.0F, 0.1F, 14.6F, 0.0F, 1.4486F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(36, 94).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.875F, 0.125F, 16.375F, 0.0F, 0.7505F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(94, 35).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.6F, 0.125F, 16.625F, 0.0F, 0.7505F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(94, 31).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.65F, 0.1F, 17.375F, 0.0F, 1.3614F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(94, 23).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.725F, 0.1F, 17.0F, 0.0F, 1.3614F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(60, 92).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(8.875F, 0.125F, 13.65F, 0.0F, 1.3614F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(86, 69).addBox(3.339F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(9.6F, 0.1F, 13.1F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 91).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(11.15F, 0.125F, 13.1F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 98).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(9.05F, 0.125F, 7.85F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(36, 98).addBox(4.339F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(11.85F, 0.125F, 11.55F, 0.0F, 1.8413F, 0.0F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(30, 91).addBox(4.339F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(12.125F, 0.125F, 11.05F, 0.0F, 1.9286F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(28, 87).addBox(3.339F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(11.9F, 0.125F, 11.175F, 0.0F, 2.1904F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(86, 65).addBox(3.339F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(12.5F, 0.1F, 9.35F, 0.0F, 2.1904F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(44, 81).addBox(2.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(11.15F, 0.1F, 5.65F, 0.0F, -3.0805F, 0.0F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(70, 81).addBox(2.339F, -2.0F, -1.9076F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(10.55F, 0.1F, 9.125F, 0.0F, 2.7663F, 0.0F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(10, 81).addBox(2.339F, -2.0F, -1.9076F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(10.975F, 0.125F, 7.8F, 0.0F, 2.7663F, 0.0F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(76, 61).addBox(1.339F, -2.0F, -1.9076F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(10.975F, 0.1F, 5.8F, 0.0F, 2.7663F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(52, 88).addBox(1.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(10.975F, 0.125F, 4.05F, 0.0F, 2.7663F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(80, 75).addBox(1.339F, -2.0F, -1.9076F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(8.925F, 0.125F, 2.525F, 0.0F, -3.1241F, 0.0F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(44, 85).addBox(0.339F, -2.0F, -0.9076F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.275F, 0.125F, 2.275F, 0.0F, -2.4827F, 0.0F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(68, 89).addBox(1.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(5.275F, 0.125F, 1.275F, 0.0F, -2.4827F, 0.0F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(54, 85).addBox(0.339F, -2.0F, -0.9076F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(5.275F, 0.125F, 1.675F, 0.0F, -2.4827F, 0.0F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(80, 83).addBox(0.339F, -2.0F, -0.9076F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(6.75F, 0.125F, 1.2F, 0.0F, -2.8754F, 0.0F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 59).addBox(1.339F, -2.0F, -0.9076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(6.0F, 0.125F, 0.475F, 0.0F, -2.8754F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(54, 82).addBox(0.339F, -2.0F, -0.9076F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(6.0F, 0.125F, 0.7F, 0.0F, -2.8754F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(74, 35).addBox(0.339F, -2.0F, -1.9076F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(3.7F, 0.075F, 6.3F, 0.0F, 1.6799F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(72, 51).addBox(-0.661F, -2.0F, -1.9076F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.375F, 0.0F, 12.325F, 0.0F, 1.85F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(72, 47).addBox(-0.661F, -2.0F, -1.9076F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.725F, 0.125F, 16.5F, 0.0F, 1.6319F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(72, 43).addBox(-0.661F, -2.0F, -1.9076F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.275F, 0.1F, 16.5F, 0.0F, 1.8064F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(66, 39).addBox(-0.661F, -2.0F, -1.9076F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.35F, 0.0F, 16.8F, 0.0F, 1.3265F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(48, 71).addBox(-0.661F, -2.0F, -2.9076F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-0.55F, 0.075F, 15.575F, 0.0F, 1.3265F, 0.0F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(96, 61).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.325F, 0.075F, 16.55F, 0.0F, 0.685F, 0.0F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(86, 43).addBox(-0.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.9F, 0.075F, 15.4F, 0.0F, 0.685F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(86, 35).addBox(-0.661F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-4.2F, 0.075F, 15.4F, 0.0F, -0.1004F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(84, 94).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-3.625F, 0.075F, 16.55F, 0.0F, -0.1004F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(96, 3).addBox(-0.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.025F, 0.1F, 13.025F, 0.0F, 0.1178F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(28, 98).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.475F, 0.1F, 13.05F, 0.0F, -0.1876F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(32, 98).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-5.25F, 0.1F, 12.85F, 0.0F, -0.4931F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(24, 98).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-5.5F, 0.1F, 12.775F, 0.0F, -0.4931F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(16, 88).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.9F, 0.075F, 11.4F, 0.0F, -0.4931F, 0.0F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(86, 23).addBox(-0.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-4.9F, 0.1F, 11.65F, 0.0F, -0.4931F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(60, 89).addBox(-2.661F, -2.0F, 0.0924F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.7F, 0.1F, 18.975F, 0.0F, -2.1948F, 0.0F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(88, 86).addBox(-2.661F, -2.0F, 0.0924F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, 0.1F, 18.775F, 0.0F, -2.1948F, 0.0F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(88, 62).addBox(-2.661F, -2.0F, 0.0924F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, 0.1F, 19.075F, 0.0F, -2.0639F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(86, 51).addBox(-1.661F, -2.0F, 0.0924F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, 0.125F, 16.475F, 0.0F, 1.7759F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(44, 77).addBox(-1.661F, -2.0F, 0.0924F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-2.5F, 0.125F, 16.875F, 0.0F, 1.7759F, 0.0F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(94, 95).addBox(-1.661F, -2.0F, 0.0924F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-2.2F, 0.1F, 18.275F, 0.0F, 2.2122F, 0.0F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(86, 31).addBox(-1.661F, -2.0F, 0.0924F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-4.075F, 0.1F, 16.825F, 0.0F, 2.5176F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 46).addBox(-1.661F, -2.0F, 0.0924F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.875F, 0.125F, 16.6F, 0.0F, 1.8195F, 0.0F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(94, 43).addBox(-1.661F, -2.0F, 0.0924F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.175F, 0.125F, 17.1F, 0.0F, 2.2122F, 0.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(54, 95).addBox(-1.661F, -2.0F, 0.0924F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-3.8F, 0.075F, 14.5F, 0.0F, 1.2086F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(12, 76).addBox(-1.661F, -2.0F, -1.9076F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.35F, 0.1F, 13.825F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(64, 85).addBox(-1.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.65F, 0.125F, 13.425F, 0.0F, 0.2923F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(80, 86).addBox(-1.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-2.95F, 0.075F, 13.825F, 0.0F, 0.7287F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(86, 27).addBox(-1.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.025F, 0.125F, 13.325F, 0.0F, 0.7287F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(96, 0).addBox(-1.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-3.45F, 0.075F, 10.85F, 0.0F, 0.0305F, 0.0F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(20, 98).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-5.05F, 0.075F, 11.575F, 0.0F, 0.0305F, 0.0F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(16, 98).addBox(-0.661F, -2.0F, -0.9076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.55F, 0.075F, 11.575F, 0.0F, -0.4931F, 0.0F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(94, 55).addBox(-0.661F, -2.0F, -0.9076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.725F, 0.1F, 11.05F, 0.0F, -0.4931F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(76, 70).addBox(-0.661F, -2.0F, -1.9076F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.9F, 0.075F, 10.1F, 0.0F, -0.877F, 0.0F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(48, 56).addBox(-0.661F, -2.0F, -3.9076F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.6F, 0.125F, 12.7F, 0.0F, -1.2697F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 56).addBox(-0.661F, -2.0F, -3.9076F, 3.0F, 2.0F, 6.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-3.1F, 0.1F, 10.75F, 0.0F, -1.2697F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(74, 30).addBox(-0.661F, -2.0F, -1.9076F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-3.1F, 0.075F, 8.925F, 0.0F, -1.2697F, 0.0F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(36, 82).addBox(-0.661F, -2.0F, -1.9076F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.1F, 0.1F, 7.7F, 0.0F, -1.2697F, 0.0F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 86).addBox(-0.661F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.825F, 0.1F, 7.275F, 0.0F, -1.405F, 0.0F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(12, 65).addBox(-1.661F, -2.0F, -2.9076F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.125F, 0.075F, 8.35F, 0.0F, -1.7715F, 0.0F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(30, 50).addBox(-1.661F, -2.0F, -2.9076F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-3.375F, 0.1F, 8.55F, 0.0F, -1.5097F, 0.0F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(80, 39).addBox(-0.661F, -2.0F, -1.9076F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.65F, 0.0F, 7.025F, 0.0F, -1.2479F, 0.0F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(72, 85).addBox(-0.661F, -2.0F, -1.9076F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.55F, 0.075F, 7.025F, 0.0F, -1.5097F, 0.0F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 72).addBox(-2.661F, -2.0F, -2.9076F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.05F, 0.125F, 6.3F, 0.0F, -1.5446F, 0.0F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(90, 77).addBox(-0.661F, -2.0F, -1.9076F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.15F, 0.125F, 6.95F, 0.0F, -1.1257F, 0.0F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-5.575F, 0.125F, 5.9F, 0.0F, -1.6493F, 0.0F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(82, 97).addBox(0.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-5.775F, 0.125F, 5.4F, 0.0F, -1.7802F, 0.0F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(54, 77).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(3.2F, 0.075F, 10.375F, 0.0F, 0.3142F, 0.0F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(66, 96).addBox(0.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.075F, 10.175F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 92).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 0.075F, 9.175F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(12, 91).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8F, 0.075F, 9.375F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(6, 91).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.0F, 0.075F, 9.775F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(76, 90).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-5.7F, 0.125F, 8.275F, 0.0F, -0.9076F, 0.0F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(56, 98).addBox(0.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.125F, 8.675F, 0.0F, 0.6283F, 0.0F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(96, 71).addBox(0.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.6F, 0.125F, 8.975F, 0.0F, 0.6283F, 0.0F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(24, 91).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-4.5F, 0.125F, 8.575F, 0.0F, -0.7679F, 0.0F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(18, 91).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(-4.9F, 0.125F, 8.575F, 0.0F, -0.7679F, 0.0F));

		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 73).addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.8F, 0.125F, 8.275F, 0.0F, -0.7679F, 0.0F));

		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(70, 76).addBox(0.0F, -2.0F, -6.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-3.625F, 0.125F, 7.725F, 0.0F, -0.6283F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create(), PartPose.offset(0.0F, -0.55F, 0.0F));

		PartDefinition cube_r170 = matrix.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -1.0F, -10.0F, 15.0F, 2.0F, 11.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.85F, 0.0F, -16.475F, 0.0F, -3.0238F, 0.0F));

		PartDefinition cube_r171 = matrix.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 27.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.1F, 0.0F, -11.2F, 0.0F, -1.6275F, 0.0F));

		PartDefinition cube_r172 = matrix.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(52, 23).addBox(2.0F, -1.0F, -1.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.025F, 0.0F, 12.475F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r173 = matrix.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -1.0F, -1.0F, 21.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-7.525F, 0.0F, -2.225F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r174 = matrix.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(52, 39).addBox(4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.9F, 0.0F, -4.8F, 0.0F, -2.5744F, 0.0F));

		PartDefinition cube_r175 = matrix.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 43).addBox(-8.0F, -1.0F, -1.0F, 17.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.35F, 0.0F, 16.825F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r176 = matrix.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -1.0F, -1.0F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.0F, 0.0F, -16.175F, 0.0F, -0.5672F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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