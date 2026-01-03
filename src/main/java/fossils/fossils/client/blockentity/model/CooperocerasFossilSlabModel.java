package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CooperocerasFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart whole;
	private final ModelPart rightspikecurved;
	private final ModelPart bone;
	private final ModelPart bone8;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone7;
	private final ModelPart bone6;
	private final ModelPart leftspikecurved;
	private final ModelPart bone2;

	public CooperocerasFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.whole = this.fossil.getChild("whole");
		this.rightspikecurved = this.whole.getChild("rightspikecurved");
		this.bone = this.rightspikecurved.getChild("bone");
		this.bone8 = this.bone.getChild("bone8");
		this.bone3 = this.bone.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone7 = this.bone5.getChild("bone7");
		this.bone6 = this.bone5.getChild("bone6");
		this.leftspikecurved = this.whole.getChild("leftspikecurved");
		this.bone2 = this.leftspikecurved.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(87, 58).addBox(-8.0F, -18.0F, -5.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 84).addBox(6.0F, -18.0F, -5.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 77).addBox(5.0F, -26.0F, -19.0F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-9.0F, -2.0F, -20.0F, 18.0F, 2.0F, 32.0F, new CubeDeformation(0.0F))
				.texOffs(34, 84).addBox(-7.0F, -26.0F, -19.0F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(43, 84).addBox(3.0F, -25.0F, 9.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 84).addBox(-5.0F, -25.0F, 9.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 4.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(66, 58).addBox(-18.0F, -10.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 91).addBox(-19.0F, -12.0F, -29.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -6.0F, 10.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 58).addBox(-7.0F, -13.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -8.0F, -4.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition whole = fossil.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0088F, -29.3555F, -1.5673F, -2.7314F, 0.0F, 0.0F));

		PartDefinition shell_r1 = whole.addOrReplaceChild("shell_r1", CubeListBuilder.create().texOffs(47, 35).addBox(-10.0F, -10.25F, -0.25F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(34, 35).addBox(1.0F, -10.25F, -0.25F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-10.0F, -10.25F, 3.75F, 13.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5088F, 12.3892F, 12.2191F, 0.1745F, 0.0F, 0.0F));

		PartDefinition shell_r2 = whole.addOrReplaceChild("shell_r2", CubeListBuilder.create().texOffs(0, 62).addBox(-2.25F, 3.5322F, -17.2149F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7412F, -6.6108F, 1.2191F, 0.6109F, 0.0F, 0.0F));

		PartDefinition shell_r3 = whole.addOrReplaceChild("shell_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.75F, 0.2822F, -14.2149F, 7.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7412F, -6.6108F, 1.2191F, 0.1309F, 0.0F, 0.0F));

		PartDefinition shell_r4 = whole.addOrReplaceChild("shell_r4", CubeListBuilder.create().texOffs(69, 0).addBox(-3.25F, -1.9678F, -8.2149F, 8.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7412F, -6.6108F, 1.2191F, -0.829F, 0.0F, 0.0F));

		PartDefinition shell_r5 = whole.addOrReplaceChild("shell_r5", CubeListBuilder.create().texOffs(35, 58).addBox(-3.75F, -7.2178F, -5.4649F, 9.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7412F, -6.6108F, 1.2191F, -0.0436F, 0.0F, 0.0F));

		PartDefinition shell_r6 = whole.addOrReplaceChild("shell_r6", CubeListBuilder.create().texOffs(0, 35).addBox(-4.25F, -10.427F, -8.6562F, 10.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7412F, -2.6108F, 10.2191F, 0.5672F, 0.0F, 0.0F));

		PartDefinition shell_r7 = whole.addOrReplaceChild("shell_r7", CubeListBuilder.create().texOffs(70, 76).addBox(-1.75F, 1.2349F, 0.1785F, 4.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2412F, 5.3892F, -4.7809F, 0.6109F, 0.0F, 0.0F));

		PartDefinition spike_r1 = whole.addOrReplaceChild("spike_r1", CubeListBuilder.create().texOffs(92, 35).addBox(-2.2F, 0.1548F, 0.4056F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2088F, 10.9892F, -2.7809F, -0.2638F, -0.1635F, 1.0071F));

		PartDefinition spike_r2 = whole.addOrReplaceChild("spike_r2", CubeListBuilder.create().texOffs(96, 38).addBox(-3.3F, -0.7452F, 0.0056F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1912F, 10.9892F, -2.7809F, -0.2638F, 0.1635F, -1.0071F));

		PartDefinition spike_r3 = whole.addOrReplaceChild("spike_r3", CubeListBuilder.create().texOffs(69, 0).addBox(-1.2F, 0.1548F, 0.4056F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2088F, 9.7892F, 0.6191F, -0.0591F, -0.4536F, 0.944F));

		PartDefinition spike_r4 = whole.addOrReplaceChild("spike_r4", CubeListBuilder.create().texOffs(0, 3).addBox(-0.3F, -0.7452F, 0.0056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1912F, 9.7892F, 0.6191F, -0.0591F, 0.4536F, -0.944F));

		PartDefinition shell_r8 = whole.addOrReplaceChild("shell_r8", CubeListBuilder.create().texOffs(0, 77).addBox(-2.25F, -1.5151F, -1.8215F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2412F, 5.3892F, -4.7809F, -0.0873F, 0.0F, 0.0F));

		PartDefinition shell_r9 = whole.addOrReplaceChild("shell_r9", CubeListBuilder.create().texOffs(85, 35).addBox(-3.9393F, -5.7495F, 4.6307F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5088F, 4.3892F, -1.7809F, 0.8727F, -0.0436F, 0.0F));

		PartDefinition shell_r10 = whole.addOrReplaceChild("shell_r10", CubeListBuilder.create().texOffs(0, 35).addBox(-5.05F, -12.5F, -12.25F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5088F, 12.3892F, 12.2191F, -0.0873F, -0.0436F, 0.0F));

		PartDefinition shell_r11 = whole.addOrReplaceChild("shell_r11", CubeListBuilder.create().texOffs(47, 35).addBox(-9.5F, -15.75F, -9.25F, 12.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5088F, 12.3892F, 12.2191F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightspikecurved = whole.addOrReplaceChild("rightspikecurved", CubeListBuilder.create(), PartPose.offset(3.2088F, 10.9892F, -6.6809F));

		PartDefinition spike_r5 = rightspikecurved.addOrReplaceChild("spike_r5", CubeListBuilder.create().texOffs(0, 92).addBox(-3.2F, 0.1548F, 0.4056F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2605F, 0.0473F, 0.9506F));

		PartDefinition spike_r6 = rightspikecurved.addOrReplaceChild("spike_r6", CubeListBuilder.create().texOffs(23, 3).addBox(-0.3F, -0.3858F, -0.1788F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 1.7F, 0.4F, -0.2924F, 0.4676F, 0.8283F));

		PartDefinition bone = rightspikecurved.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition spike_r7 = bone.addOrReplaceChild("spike_r7", CubeListBuilder.create().texOffs(66, 67).addBox(3.3145F, -1.0914F, 3.8735F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.3F, -8.1141F, -6.0124F, -0.4842F, 0.431F, 0.8501F));

		PartDefinition spike_r8 = bone.addOrReplaceChild("spike_r8", CubeListBuilder.create().texOffs(69, 28).addBox(1.8114F, -1.6098F, -0.4733F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-1.8F, -24.4444F, 4.0849F, 2.7721F, -0.1159F, -0.7708F));

		PartDefinition spike_r9 = bone.addOrReplaceChild("spike_r9", CubeListBuilder.create().texOffs(21, 65).addBox(-0.8889F, -0.6371F, -0.6481F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(4.2F, -29.4444F, 3.9849F, 2.709F, 0.4363F, -0.9539F));

		PartDefinition spike_r10 = bone.addOrReplaceChild("spike_r10", CubeListBuilder.create().texOffs(43, 35).addBox(-4.1473F, -2.1894F, -1.0177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-3.8F, -24.4444F, 4.0849F, 2.8314F, -0.0078F, 0.7592F));

		PartDefinition spike_r11 = bone.addOrReplaceChild("spike_r11", CubeListBuilder.create().texOffs(79, 91).addBox(0.3864F, -0.2504F, -0.1248F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.8F, -16.7444F, -5.1151F, -1.6871F, 0.7732F, 0.0943F));

		PartDefinition spike_r12 = bone.addOrReplaceChild("spike_r12", CubeListBuilder.create().texOffs(87, 77).addBox(0.2714F, -0.3689F, -0.2735F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2F, -16.7444F, -8.1151F, -1.3439F, 0.7854F, 0.6498F));

		PartDefinition spike_r13 = bone.addOrReplaceChild("spike_r13", CubeListBuilder.create().texOffs(96, 0).addBox(-4.6366F, -0.3712F, -0.7375F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-9.4F, -15.6444F, -8.6151F, -1.3439F, -0.7854F, -0.4438F));

		PartDefinition spike_r14 = bone.addOrReplaceChild("spike_r14", CubeListBuilder.create().texOffs(95, 25).addBox(-5.1859F, -0.1984F, -0.3206F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-6.4F, -16.6444F, -5.6151F, -1.5207F, -0.7246F, -0.2506F));

		PartDefinition spike_r15 = bone.addOrReplaceChild("spike_r15", CubeListBuilder.create().texOffs(69, 25).addBox(0.3864F, -0.2504F, -0.1248F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.3F, -9.1444F, -5.9151F, -1.0821F, 0.6283F, 0.4887F));

		PartDefinition spike_r16 = bone.addOrReplaceChild("spike_r16", CubeListBuilder.create().texOffs(82, 28).addBox(-9.3694F, -0.4556F, 0.3272F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-6.1F, -8.8444F, -5.9151F, -1.0948F, -0.7346F, -0.3517F));

		PartDefinition spike_r17 = bone.addOrReplaceChild("spike_r17", CubeListBuilder.create().texOffs(12, 94).addBox(-5.1859F, -0.1984F, -0.3206F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-6.1F, -8.8444F, -5.9151F, -1.0821F, -0.6283F, -0.4887F));

		PartDefinition spike_r18 = bone.addOrReplaceChild("spike_r18", CubeListBuilder.create().texOffs(23, 0).addBox(5.5928F, -1.1147F, 5.9322F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.3F, -8.1141F, -6.0124F, -0.5516F, 0.7183F, 0.7153F));

		PartDefinition bone8 = bone.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-2.4F, -20.8444F, -1.1151F));

		PartDefinition spike_r19 = bone8.addOrReplaceChild("spike_r19", CubeListBuilder.create().texOffs(92, 94).addBox(6.4578F, -1.7253F, -3.0651F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1F, -0.1F, -0.1F, -2.7894F, 0.8378F, -0.5139F));

		PartDefinition spike_r20 = bone8.addOrReplaceChild("spike_r20", CubeListBuilder.create().texOffs(82, 25).addBox(1.8114F, -1.6098F, -0.4733F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.1F, -0.1F, 0.0F, -2.8059F, 0.4991F, -0.6241F));

		PartDefinition spike_r21 = bone8.addOrReplaceChild("spike_r21", CubeListBuilder.create().texOffs(87, 80).addBox(-12.9102F, -2.806F, -2.0643F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.4F, 0.1F, 0.0F, -2.656F, -0.736F, 0.5323F));

		PartDefinition spike_r22 = bone8.addOrReplaceChild("spike_r22", CubeListBuilder.create().texOffs(92, 91).addBox(-8.1473F, -2.1894F, -1.0177F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-0.4F, 0.1F, 0.1F, -2.6909F, -0.5834F, 0.5173F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, -21.9444F, 13.7849F, -0.3054F, 0.0F, 0.0F));

		PartDefinition spike_r23 = bone3.addOrReplaceChild("spike_r23", CubeListBuilder.create().texOffs(95, 83).addBox(1.8114F, -1.6098F, -0.4733F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7721F, -0.1159F, -0.7708F));

		PartDefinition spike_r24 = bone3.addOrReplaceChild("spike_r24", CubeListBuilder.create().texOffs(34, 65).addBox(-0.8889F, -0.6371F, -0.3981F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(6.0F, -5.0F, -0.1F, 2.6897F, 0.5152F, -0.9959F));

		PartDefinition spike_r25 = bone3.addOrReplaceChild("spike_r25", CubeListBuilder.create().texOffs(95, 86).addBox(-3.9934F, -0.263F, 0.1745F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-10.0F, -5.0F, -0.1F, 2.8265F, -0.5195F, 1.0051F));

		PartDefinition spike_r26 = bone3.addOrReplaceChild("spike_r26", CubeListBuilder.create().texOffs(0, 96).addBox(-8.1473F, -2.1894F, -1.0177F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 2.8314F, -0.0078F, 0.7592F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 1.3F, -0.5149F, 0.0F, 0.0F));

		PartDefinition spike_r27 = bone4.addOrReplaceChild("spike_r27", CubeListBuilder.create().texOffs(96, 41).addBox(1.8114F, -1.6098F, -0.4733F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 2.0F, 7.0F, 2.8472F, -0.0427F, -0.7768F));

		PartDefinition spike_r28 = bone4.addOrReplaceChild("spike_r28", CubeListBuilder.create().texOffs(95, 28).addBox(-3.9934F, -0.263F, 0.1745F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-10.0F, -3.0F, 6.2F, 2.9582F, -0.6779F, 0.9306F));

		PartDefinition spike_r29 = bone4.addOrReplaceChild("spike_r29", CubeListBuilder.create().texOffs(96, 3).addBox(-8.1473F, -2.1894F, -1.0177F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-2.0F, 2.0F, 7.0F, 2.9075F, -0.0798F, 0.7558F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5149F, 0.0F, 0.0F));

		PartDefinition bone7 = bone5.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -4.05F, 14.2F, 0.0F, 0.0F, -0.2182F));

		PartDefinition spike_r30 = bone7.addOrReplaceChild("spike_r30", CubeListBuilder.create().texOffs(21, 62).addBox(-4.7934F, -0.263F, -0.3255F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-4.0F, -3.0F, 0.0F, 2.9582F, -0.6779F, 0.9306F));

		PartDefinition spike_r31 = bone7.addOrReplaceChild("spike_r31", CubeListBuilder.create().texOffs(96, 6).addBox(-9.1473F, -2.1894F, -1.0177F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(4.0F, 2.0F, 0.8F, 2.9075F, -0.0798F, 0.7558F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -4.8F, 14.2F, 0.0F, 0.0F, 0.2182F));

		PartDefinition spike_r32 = bone6.addOrReplaceChild("spike_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3889F, -0.6371F, -0.8981F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.0F, -3.0F, 0.0F, 2.8228F, 0.6726F, -0.9211F));

		PartDefinition spike_r33 = bone6.addOrReplaceChild("spike_r33", CubeListBuilder.create().texOffs(79, 94).addBox(2.8114F, -1.6098F, -0.4733F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-3.0F, 2.0F, 0.8F, 2.8472F, -0.0427F, -0.7768F));

		PartDefinition leftspikecurved = whole.addOrReplaceChild("leftspikecurved", CubeListBuilder.create(), PartPose.offset(-2.4912F, 12.6892F, -6.2809F));

		PartDefinition spike_r34 = leftspikecurved.addOrReplaceChild("spike_r34", CubeListBuilder.create().texOffs(78, 73).addBox(-3.4793F, -1.4271F, -0.2947F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2924F, -0.4676F, -0.8283F));

		PartDefinition spike_r35 = leftspikecurved.addOrReplaceChild("spike_r35", CubeListBuilder.create().texOffs(69, 6).addBox(-2.3F, -0.7452F, 0.0056F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.7F, -0.4F, -0.2605F, -0.0473F, -0.9506F));

		PartDefinition bone2 = leftspikecurved.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition spike_r36 = bone2.addOrReplaceChild("spike_r36", CubeListBuilder.create().texOffs(69, 3).addBox(-8.4304F, -1.2874F, 5.7209F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4F, -9.8141F, -6.4124F, -0.518F, -0.7406F, -0.7656F));

		PartDefinition spike_r37 = bone2.addOrReplaceChild("spike_r37", CubeListBuilder.create().texOffs(36, 62).addBox(-7.114F, -1.0394F, 3.6777F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.4F, -9.8141F, -6.4124F, -0.4842F, -0.431F, -0.8501F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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