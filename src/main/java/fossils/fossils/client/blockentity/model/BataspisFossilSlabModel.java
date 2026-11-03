package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BataspisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart headright;
	private final ModelPart headleft;
	private final ModelPart Spikes;
	private final ModelPart Features;
	private final ModelPart Spikes2;
	private final ModelPart matrix;

	public BataspisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.headright = this.fossil.getChild("headright");
		this.headleft = this.fossil.getChild("headleft");
		this.Spikes = this.fossil.getChild("Spikes");
		this.Features = this.Spikes.getChild("Features");
		this.Spikes2 = this.fossil.getChild("Spikes2");
		this.matrix = this.fossil.getChild("matrix");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2129F, 25.5F, 4.0413F, 0.0F, -0.1745F, 0.0F));

		PartDefinition headright = fossil.addOrReplaceChild("headright", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4879F, -0.1F, -0.2453F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r1 = headright.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-7.0272F, -0.8F, 14.0446F, 0.0F, -3.111F, 0.0F));

		PartDefinition cube_r2 = headright.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 75).addBox(0.1F, -1.0F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 74).addBox(-0.075F, -0.875F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 74).addBox(-0.2F, -0.875F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 74).addBox(-0.5F, -0.9F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.0878F, -0.825F, 13.8641F, 0.0F, -2.4129F, 0.0F));

		PartDefinition cube_r3 = headright.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 75).addBox(-0.8155F, -1.0F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.6547F, -0.725F, 14.4934F, 0.0F, -2.8056F, 0.0F));

		PartDefinition cube_r4 = headright.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(75, 34).addBox(-0.525F, -1.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 75).addBox(-0.55F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-6.9918F, -0.825F, 15.4923F, 0.0F, -3.0238F, 0.0F));

		PartDefinition cube_r5 = headright.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 75).addBox(-0.45F, -1.0F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(35, 75).addBox(-0.4F, -0.975F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 75).addBox(-0.5F, -0.9F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-7.1729F, -0.925F, 15.1046F, 0.0F, -2.5875F, 0.0F));

		PartDefinition cube_r6 = headright.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(75, 37).addBox(-0.6024F, -1.0F, -0.6005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-7.1479F, -0.9F, 15.5296F, 0.0F, -2.2384F, 0.0F));

		PartDefinition cube_r7 = headright.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 75).addBox(-0.525F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-7.0752F, -0.825F, 15.1959F, 0.0F, -2.4129F, 0.0F));

		PartDefinition cube_r8 = headright.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(73, 68).addBox(-0.0924F, -1.0F, -0.8943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-7.7726F, -0.625F, 13.6902F, 0.0F, -1.4137F, 0.0F));

		PartDefinition cube_r9 = headright.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 56).addBox(-0.0066F, -0.925F, -1.0112F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6682F, -0.55F, 11.7071F, 0.0F, -1.6319F, 0.0F));

		PartDefinition cube_r10 = headright.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(50, 67).addBox(-0.0066F, -0.9F, -1.0112F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.7163F, -0.55F, 8.8621F, 0.0F, -1.8937F, 0.0F));

		PartDefinition cube_r11 = headright.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(21, 53).addBox(-0.0082F, -0.85F, -0.9894F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5135F, -0.575F, 4.3493F, 0.0F, -0.4538F, 0.0F));

		PartDefinition cube_r12 = headright.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 61).addBox(-1.0F, -1.875F, 1.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.875F, 0.425F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r13 = headright.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 60).addBox(-1.0114F, -0.5F, -0.4519F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9135F, -1.1F, -1.375F, 3.1147F, 0.7981F, 3.1041F));

		PartDefinition cube_r14 = headright.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 69).addBox(-2.0001F, -0.85F, 0.0083F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.1562F, -0.6F, -4.7599F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r15 = headright.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(56, 70).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6999F, -1.0F, -0.7106F, -3.098F, 0.4581F, 3.1416F));

		PartDefinition cube_r16 = headright.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 75).addBox(-0.875F, -1.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3322F, -0.55F, -1.7729F, 0.0F, 2.2035F, 0.0F));

		PartDefinition cube_r17 = headright.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(64, 61).addBox(-0.5F, -0.4254F, -1.5076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8227F, -1.075F, -1.7512F, 0.0436F, 1.3308F, 0.0F));

		PartDefinition cube_r18 = headright.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(14, 68).addBox(-0.7F, -1.0F, -0.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1433F, -0.575F, -0.3951F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r19 = headright.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(39, 63).addBox(-1.2624F, -1.0F, -1.2601F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4218F, -0.6F, -1.409F, 0.0436F, 0.8508F, 0.0F));

		PartDefinition cube_r20 = headright.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 68).addBox(-1.425F, -0.925F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4218F, -0.575F, -1.409F, 0.0F, 0.8072F, 0.0F));

		PartDefinition cube_r21 = headright.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 54).addBox(-0.0073F, -0.875F, 0.0013F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8312F, -0.575F, -2.8849F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r22 = headright.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 68).addBox(-0.45F, -0.925F, -0.0005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8173F, -0.575F, 1.043F, 0.0218F, 0.6109F, 0.0F));

		PartDefinition cube_r23 = headright.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 66).addBox(-0.4967F, -0.4251F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0101F, -1.05F, 3.4175F, 3.1111F, 0.6102F, 3.0883F));

		PartDefinition cube_r24 = headright.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 62).addBox(0.0F, -0.875F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3646F, -0.575F, 6.2371F, -3.1154F, 0.5236F, 3.1416F));

		PartDefinition cube_r25 = headright.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(21, 68).addBox(-2.8219F, -0.475F, -2.6497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.4712F, -1.0F, 6.9654F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r26 = headright.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 56).addBox(-2.8136F, -0.95F, -1.6789F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4712F, -0.55F, 6.9654F, 0.0F, 3.098F, 0.0F));

		PartDefinition cube_r27 = headright.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(39, 68).addBox(0.6663F, -0.925F, -0.0199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 63).addBox(-0.3337F, -0.9F, -1.42F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 61).addBox(-1.2957F, -0.875F, -2.4353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1914F, -0.6F, 9.0654F, 0.0F, 2.138F, 0.0F));

		PartDefinition cube_r28 = headright.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(21, 45).addBox(-2.0F, -0.5F, 2.6F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6229F, -1.1F, 6.7823F, -3.1233F, 0.6979F, -3.1131F));

		PartDefinition cube_r29 = headright.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 54).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2373F, -1.1F, 6.3227F, -3.1233F, 0.6979F, -3.1131F));

		PartDefinition cube_r30 = headright.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(42, 45).addBox(-0.696F, -0.947F, -6.2758F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1166F, -0.625F, 5.8648F, -3.1241F, 0.3927F, 3.1416F));

		PartDefinition cube_r31 = headright.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 45).addBox(-0.25F, -1.0F, -5.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0602F, -0.575F, 1.276F, 0.0F, 2.4435F, 0.0F));

		PartDefinition cube_r32 = headright.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(51, 70).addBox(-0.5F, -0.975F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9598F, -0.525F, 1.807F, 0.0F, 2.0508F, 0.0F));

		PartDefinition cube_r33 = headright.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(46, 70).addBox(-0.3696F, -0.925F, -0.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2028F, -0.575F, 1.8334F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r34 = headright.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(68, 52).addBox(-1.325F, -0.9F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(59, 45).addBox(-1.5F, -0.85F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4312F, -0.575F, -4.0099F, 0.0F, 0.0873F, 0.0F));

		PartDefinition headleft = fossil.addOrReplaceChild("headleft", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3138F, -0.1F, 0.1547F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r35 = headleft.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(7.0272F, -0.8F, 14.0446F, 0.0F, 3.111F, 0.0F));

		PartDefinition cube_r36 = headleft.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-1.1F, -1.0F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 74).mirror().addBox(-0.925F, -0.875F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 74).mirror().addBox(-0.8F, -0.875F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 74).mirror().addBox(-0.5F, -0.9F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(7.0878F, -0.825F, 13.8641F, 0.0F, 2.4129F, 0.0F));

		PartDefinition cube_r37 = headleft.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.1845F, -1.0F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(7.6547F, -0.725F, 14.4934F, 0.0F, 2.8056F, 0.0F));

		PartDefinition cube_r38 = headleft.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-0.475F, -1.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 75).mirror().addBox(-0.45F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(6.9918F, -0.825F, 15.4923F, 0.0F, 3.0238F, 0.0F));

		PartDefinition cube_r39 = headleft.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-0.55F, -1.0F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(35, 75).mirror().addBox(-0.6F, -0.975F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 75).mirror().addBox(-0.5F, -0.9F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(7.1729F, -0.925F, 15.1046F, 0.0F, 2.5875F, 0.0F));

		PartDefinition cube_r40 = headleft.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(-0.3976F, -1.0F, -0.6004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(7.1479F, -0.9F, 15.5296F, 0.0F, 2.2384F, 0.0F));

		PartDefinition cube_r41 = headleft.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.475F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(7.0752F, -0.825F, 15.1959F, 0.0F, 2.4129F, 0.0F));

		PartDefinition cube_r42 = headleft.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 68).mirror().addBox(-0.9076F, -1.0F, -0.8943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(7.7726F, -0.625F, 13.6902F, 0.0F, 1.4137F, 0.0F));

		PartDefinition cube_r43 = headleft.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(68, 56).mirror().addBox(-1.9934F, -0.925F, -1.0112F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.6682F, -0.55F, 11.7071F, 0.0F, 1.6319F, 0.0F));

		PartDefinition cube_r44 = headleft.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(-2.9934F, -0.9F, -1.0112F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.7163F, -0.55F, 8.8621F, 0.0F, 1.8937F, 0.0F));

		PartDefinition cube_r45 = headleft.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(21, 53).mirror().addBox(-0.9918F, -0.85F, -0.9894F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5135F, -0.575F, 4.3492F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r46 = headleft.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(53, 61).mirror().addBox(0.0F, -1.875F, 1.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.875F, 0.425F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r47 = headleft.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(36, 60).mirror().addBox(-5.9886F, -0.5F, -0.4519F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9135F, -1.1F, -1.375F, 3.1147F, -0.7981F, -3.1041F));

		PartDefinition cube_r48 = headleft.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(0.0001F, -0.85F, 0.0083F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(3.1562F, -0.6F, -4.7599F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r49 = headleft.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6999F, -1.0F, -0.7106F, -3.098F, -0.4581F, -3.1416F));

		PartDefinition cube_r50 = headleft.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(40, 75).mirror().addBox(-0.125F, -1.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3322F, -0.55F, -1.7729F, 0.0F, -2.2035F, 0.0F));

		PartDefinition cube_r51 = headleft.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(64, 61).mirror().addBox(-0.5F, -0.4254F, -1.5076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8227F, -1.075F, -1.7512F, 0.0436F, -1.3308F, 0.0F));

		PartDefinition cube_r52 = headleft.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.3F, -1.0F, -0.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1433F, -0.575F, -0.3951F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r53 = headleft.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(39, 63).mirror().addBox(-0.7376F, -1.0F, -1.2601F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4218F, -0.6F, -1.409F, 0.0436F, -0.8508F, 0.0F));

		PartDefinition cube_r54 = headleft.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(0.425F, -0.925F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4218F, -0.575F, -1.409F, 0.0F, -0.8072F, 0.0F));

		PartDefinition cube_r55 = headleft.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(53, 54).mirror().addBox(-1.9927F, -0.875F, 0.0013F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8312F, -0.575F, -2.8849F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r56 = headleft.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.55F, -0.925F, -0.0006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8173F, -0.575F, 1.043F, 0.0218F, -0.6109F, 0.0F));

		PartDefinition cube_r57 = headleft.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 66).mirror().addBox(-0.5033F, -0.4251F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0101F, -1.05F, 3.4175F, 3.1111F, -0.6102F, -3.0883F));

		PartDefinition cube_r58 = headleft.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-1.0F, -0.875F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3646F, -0.575F, 6.2371F, -3.1154F, -0.5236F, -3.1416F));

		PartDefinition cube_r59 = headleft.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(1.8219F, -0.475F, -2.6497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.4712F, -1.0F, 6.9654F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r60 = headleft.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.1864F, -0.95F, -1.6789F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4712F, -0.55F, 6.9654F, 0.0F, -3.098F, 0.0F));

		PartDefinition cube_r61 = headleft.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(39, 68).mirror().addBox(-1.6663F, -0.925F, -0.0199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 63).mirror().addBox(-0.6663F, -0.9F, -1.42F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 61).mirror().addBox(0.2957F, -0.875F, -2.4353F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.1914F, -0.6F, 9.0654F, 0.0F, -2.138F, 0.0F));

		PartDefinition cube_r62 = headleft.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(21, 45).mirror().addBox(-2.0F, -0.5F, 2.6F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.623F, -1.1F, 6.7823F, -3.1233F, -0.6979F, 3.1131F));

		PartDefinition cube_r63 = headleft.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(36, 54).mirror().addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2373F, -1.1F, 6.3227F, -3.1233F, -0.6979F, 3.1131F));

		PartDefinition cube_r64 = headleft.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(42, 45).mirror().addBox(-0.304F, -0.947F, -6.2758F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.1166F, -0.625F, 5.8648F, -3.1241F, -0.3927F, -3.1416F));

		PartDefinition cube_r65 = headleft.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.75F, -1.0F, -5.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0602F, -0.575F, 1.276F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r66 = headleft.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(-0.5F, -0.975F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9598F, -0.525F, 1.807F, 0.0F, -2.0508F, 0.0F));

		PartDefinition cube_r67 = headleft.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(46, 70).mirror().addBox(-0.6304F, -0.925F, -0.1249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2028F, -0.575F, 1.8334F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cube_r68 = headleft.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(0.325F, -0.9F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 45).mirror().addBox(0.5F, -0.85F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4312F, -0.575F, -4.0099F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Spikes = fossil.addOrReplaceChild("Spikes", CubeListBuilder.create(), PartPose.offset(-4.368F, -1.0F, 6.8434F));

		PartDefinition cube_r69 = Spikes.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(30, 72).addBox(-0.1F, -0.55F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(25, 72).addBox(-0.45F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.4272F, 0.0F, -3.9893F, 0.0F, -2.8362F, 0.0F));

		PartDefinition cube_r70 = Spikes.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 73).addBox(-0.475F, -0.55F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-12.6166F, 0.0F, -3.9331F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r71 = Spikes.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(72, 48).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.1917F, 0.0F, -4.0831F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r72 = Spikes.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(72, 45).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-11.8167F, 0.0F, -4.1831F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r73 = Spikes.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(40, 72).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.2166F, 0.0F, -4.2331F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r74 = Spikes.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(35, 72).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-10.7916F, 0.0F, -4.2331F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r75 = Spikes.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(15, 56).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.3166F, 0.0F, -4.2331F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r76 = Spikes.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(20, 72).addBox(2.275F, -0.55F, 1.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(15, 72).addBox(1.8F, -0.55F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 72).addBox(1.2F, -0.55F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 72).addBox(0.675F, -0.55F, 0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(0.1F, -0.55F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(71, 71).addBox(-0.375F, -0.55F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8735F, 0.0F, -2.4074F, 0.0F, -2.9671F, 0.0F));

		PartDefinition cube_r77 = Spikes.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(66, 71).addBox(0.3F, -0.55F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(61, 71).addBox(-0.35F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4764F, 0.0F, -1.7191F, 0.0F, 3.0107F, 0.0F));

		PartDefinition cube_r78 = Spikes.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(75, 40).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8751F, 0.0F, 0.0113F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r79 = Spikes.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(73, 65).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.9251F, 0.0F, -0.0637F, 0.0F, -2.9671F, 0.0F));

		PartDefinition cube_r80 = Spikes.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(73, 62).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2001F, 0.0F, -0.3387F, 0.0F, -3.0543F, 0.0F));

		PartDefinition cube_r81 = Spikes.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 59).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.6751F, 0.0F, -0.6887F, 0.0F, -3.0543F, 0.0F));

		PartDefinition cube_r82 = Spikes.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(55, 73).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0001F, 0.0F, -1.0137F, 0.0F, -3.0543F, 0.0F));

		PartDefinition cube_r83 = Spikes.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 73).addBox(-0.35F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-4.1764F, 0.0F, -1.2941F, 0.0F, 3.0107F, 0.0F));

		PartDefinition Features = Spikes.addOrReplaceChild("Features", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Features.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(59, 67).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.225F, -0.55F, -5.85F, 0.0F, -0.0829F, 0.0F));

		PartDefinition Spikes2 = fossil.addOrReplaceChild("Spikes2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0438F, -1.0F, 7.4782F, 0.0F, -0.178F, 0.0F));

		PartDefinition cube_r85 = Spikes2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(30, 72).mirror().addBox(-0.9F, -0.55F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(25, 72).mirror().addBox(-0.55F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.4272F, 0.0F, -3.9893F, 0.0F, 2.8362F, 0.0F));

		PartDefinition cube_r86 = Spikes2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-0.525F, -0.55F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(12.6166F, 0.0F, -3.9331F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r87 = Spikes2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.1917F, 0.0F, -4.0831F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r88 = Spikes2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(11.8167F, 0.0F, -4.1831F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r89 = Spikes2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(40, 72).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.2166F, 0.0F, -4.2331F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r90 = Spikes2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(10.7917F, 0.0F, -4.2331F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r91 = Spikes2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.3167F, 0.0F, -4.2331F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r92 = Spikes2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-3.275F, -0.55F, 1.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(15, 72).mirror().addBox(-2.8F, -0.55F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 72).mirror().addBox(-2.2F, -0.55F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(5, 72).mirror().addBox(-1.675F, -0.55F, 0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 72).mirror().addBox(-1.1F, -0.55F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(71, 71).mirror().addBox(-0.625F, -0.55F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.8735F, 0.0F, -2.4074F, 0.0F, 2.9671F, 0.0F));

		PartDefinition cube_r93 = Spikes2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(-1.3F, -0.55F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(61, 71).mirror().addBox(-0.65F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.4764F, 0.0F, -1.7191F, 0.0F, -3.0107F, 0.0F));

		PartDefinition cube_r94 = Spikes2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(75, 40).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8751F, 0.0F, 0.0113F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r95 = Spikes2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(73, 65).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.9251F, 0.0F, -0.0637F, 0.0F, 2.9671F, 0.0F));

		PartDefinition cube_r96 = Spikes2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(73, 62).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2001F, 0.0F, -0.3387F, 0.0F, 3.0543F, 0.0F));

		PartDefinition cube_r97 = Spikes2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(3.6751F, 0.0F, -0.6887F, 0.0F, 3.0543F, 0.0F));

		PartDefinition cube_r98 = Spikes2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0001F, 0.0F, -1.0137F, 0.0F, 3.0543F, 0.0F));

		PartDefinition cube_r99 = Spikes2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(-0.65F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(4.1764F, 0.0F, -1.2941F, 0.0F, -3.0107F, 0.0F));

		PartDefinition matrix = fossil.addOrReplaceChild("matrix", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5879F, -1.5F, -4.1913F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r100 = matrix.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 34).addBox(-28.0032F, 0.0F, -9.01F, 28.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(15.3355F, 0.0F, -7.5336F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r101 = matrix.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 17).addBox(-33.0089F, 0.0F, -0.1063F, 33.0F, 1.0F, 15.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(17.925F, 0.0F, 7.225F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r102 = matrix.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 0).addBox(-23.0F, 0.0F, 3.0F, 38.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 80);
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