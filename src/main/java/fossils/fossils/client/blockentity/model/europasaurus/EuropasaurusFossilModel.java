package fossils.fossils.client.blockentity.model.europasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuropasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart UpperlegL;
	private final ModelPart LowerlegL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart UpperlegL2;
	private final ModelPart LowerlegL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body2;
	private final ModelPart Shoulder;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public EuropasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.UpperlegL = this.Hips.getChild("UpperlegL");
		this.LowerlegL = this.UpperlegL.getChild("LowerlegL");
		this.FootL = this.LowerlegL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.UpperlegL2 = this.Hips.getChild("UpperlegL2");
		this.LowerlegL2 = this.UpperlegL2.getChild("LowerlegL2");
		this.FootL3 = this.LowerlegL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.bone = this.Hips.getChild("bone");
		this.bone4 = this.Hips.getChild("bone4");
		this.Body = this.Hips.getChild("Body");
		this.body2 = this.Body.getChild("body2");
		this.Shoulder = this.body2.getChild("Shoulder");
		this.bone2 = this.Shoulder.getChild("bone2");
		this.bone3 = this.Shoulder.getChild("bone3");
		this.UpperArmL = this.Shoulder.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.UpperArmL2 = this.Shoulder.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL2 = this.LowerArmL2.getChild("HandL2");
		this.Neck1 = this.Shoulder.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offset(0.0F, -26.4F, 11.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 71).addBox(0.0F, -2.0461F, -0.755F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.95F, 5.8F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 122).addBox(0.0F, -2.2693F, 0.0725F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, 3.4F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 0).addBox(0.0F, 0.15F, -6.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(25, 0).mirror().addBox(-4.4F, 3.65F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 0).addBox(0.4F, 3.65F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-1.0F, 2.65F, -6.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 5.0F, -0.6021F, 0.0F, 0.0F));

		PartDefinition neck21_r1 = Hips.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(60, 97).mirror().addBox(-5.6724F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.105F, -1.4885F, 0.0072F, -0.3917F, -1.5825F));

		PartDefinition neck20_r1 = Hips.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(97, 75).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.105F, -1.4885F, -0.1665F, -0.3563F, -1.1147F));

		PartDefinition neck19_r1 = Hips.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(38, 114).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.105F, -1.4885F, -0.3318F, -0.2123F, -0.5418F));

		PartDefinition neck18_r1 = Hips.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(38, 114).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.105F, -1.4885F, -0.3318F, 0.2123F, 0.5418F));

		PartDefinition neck19_r2 = Hips.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(97, 75).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.105F, -1.4885F, -0.1665F, 0.3563F, 1.1147F));

		PartDefinition neck20_r2 = Hips.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(60, 97).addBox(4.6724F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.105F, -1.4885F, 0.0072F, 0.3917F, 1.5825F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(21, 25).addBox(-0.5F, -1.1114F, -0.1216F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.002F))
				.texOffs(113, 122).addBox(0.0F, -3.1114F, 2.8784F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(116, 122).addBox(0.0F, -3.1114F, 4.8784F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.9493F, 5.129F, -0.331F, -0.1239F, 0.0424F));

		PartDefinition cube_r4 = Tail1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(122, 118).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0114F, 6.8784F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Tail1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, 119).addBox(0.0F, 2.2F, 3.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(82, 119).addBox(0.0F, 1.0F, 1.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(79, 119).addBox(0.0F, -0.3F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.8886F, 2.2783F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Tail1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(110, 122).addBox(0.0F, -2.1F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0114F, 0.9783F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Tail1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 25).mirror().addBox(-2.3F, 0.0F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1114F, 0.8784F, 0.0349F, 0.0524F, 0.0F));

		PartDefinition cube_r8 = Tail1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 25).addBox(-0.7F, 0.0F, 0.0F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1114F, 0.8784F, 0.0349F, -0.0524F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1591F, 7.7178F, 0.056F, -0.125F, 0.0584F));

		PartDefinition cube_r9 = Tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(3, 123).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 7.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 123).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Tail2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(122, 122).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(15, 123).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.8371F, 7.5685F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(73, 121).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.8204F, 4.9437F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 90).addBox(0.0F, 3.6F, 5.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.0477F, -5.4394F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(119, 122).addBox(0.0F, -1.9F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 8).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3F, 1.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r17 = Tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(46, 8).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, 1.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(49, 62).addBox(-0.5F, -0.75F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2973F, 7.977F, 0.2178F, -0.2559F, -0.0559F));

		PartDefinition cube_r18 = Tail3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(123, 45).addBox(0.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, 5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Tail3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(41, 123).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, 3.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Tail3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 123).addBox(0.0F, 0.6F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(23, 123).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.9223F, 2.2077F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Tail3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(6, 123).addBox(0.0F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5F, -0.6562F, -0.0732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1114F, 6.0005F, 0.2136F, -0.2134F, -0.0459F));

		PartDefinition cube_r22 = Tail4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(123, 85).addBox(0.0F, -0.75F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6562F, 2.9768F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Tail4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 123).addBox(0.0F, 1.1214F, 1.9982F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(29, 123).addBox(0.0F, 0.1214F, -0.0018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.2336F, 0.0072F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Tail4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(123, 76).addBox(0.0F, -0.9F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6562F, 0.9768F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(19, 53).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3263F, 4.851F, -0.0765F, -0.1305F, 0.01F));

		PartDefinition cube_r25 = Tail5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 124).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Tail5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(124, 12).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Tail5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(90, 123).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Tail5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(123, 88).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Tail5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(38, 123).addBox(0.0F, 4.3214F, 7.9982F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(35, 123).addBox(0.0F, 3.3214F, 5.9982F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(123, 34).addBox(0.0F, 2.1214F, 3.9982F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.0927F, -4.8438F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(36, 53).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0242F, 6.9181F, -0.089F, -0.028F, -0.3042F));

		PartDefinition cube_r30 = Tail6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(124, 18).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Tail6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(124, 53).addBox(0.0F, 8.2214F, 13.9982F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(124, 24).addBox(0.0F, 7.2214F, 11.9982F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(124, 21).addBox(0.0F, 6.3214F, 9.9982F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.1169F, -11.7618F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(47, 28).addBox(-0.5F, -0.5022F, 0.0466F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.4927F, 6.8566F, -0.21F, 0.1375F, -0.2049F));

		PartDefinition cube_r32 = Tail7.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(124, 56).addBox(0.0F, 9.3214F, 15.9982F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3757F, -18.6184F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.5022F, 0.0466F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.0085F, 6.9139F, -0.4109F, 0.2158F, -0.0322F));

		PartDefinition UpperlegL = Hips.addOrReplaceChild("UpperlegL", CubeListBuilder.create().texOffs(86, 57).addBox(-1.25F, 1.1F, -0.375F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.0F, 2.162F, -0.3147F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r33 = UpperlegL.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 75).addBox(-1.5F, 0.0F, 0.175F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 4.1F, -0.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r34 = UpperlegL.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(59, 75).addBox(-1.5F, 0.0F, -0.075F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.25F, 4.1F, -0.55F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r35 = UpperlegL.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(88, 47).addBox(-1.5F, 0.0F, 0.1F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.25F, 10.0487F, 0.2332F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r36 = UpperlegL.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 28).addBox(-1.5F, -0.2F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 10.0487F, 0.2332F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r37 = UpperlegL.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 78).addBox(-1.5F, 2.0F, -0.7F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -1.9F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r38 = UpperlegL.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(78, 23).addBox(-1.5F, -1.35F, -0.625F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.25F, 0.1F, -0.375F, -0.5672F, 0.0F, 0.0F));

		PartDefinition LowerlegL = UpperlegL.addOrReplaceChild("LowerlegL", CubeListBuilder.create().texOffs(77, 52).addBox(-2.0F, 0.0F, -1.35F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, 13.9802F, 1.9829F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r39 = LowerlegL.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(116, 79).addBox(-1.5F, -2.575F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.7736F, -0.5605F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r40 = LowerlegL.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(39, 116).addBox(-1.5F, -1.975F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.7736F, -0.5605F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r41 = LowerlegL.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(117, 8).addBox(-1.5F, -1.475F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.9819F, 0.1537F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r42 = LowerlegL.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(111, 79).addBox(-1.5F, -3.0F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.9819F, 0.1537F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r43 = LowerlegL.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(7, 101).addBox(-1.5F, -5.0F, -1.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 7.9F, 1.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r44 = LowerlegL.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 99).addBox(-1.5F, -1.0F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 1.7117F, 0.5415F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r45 = LowerlegL.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 31).addBox(-2.0F, -5.0F, -0.85F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.1931F, 1.0439F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r46 = LowerlegL.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(98, 21).addBox(-2.0F, 0.0F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.1931F, 1.0439F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r47 = LowerlegL.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(102, 64).addBox(-2.0F, 0.0F, -1.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2235F, 0.6966F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r48 = LowerlegL.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(102, 97).addBox(-2.0F, 0.0F, 0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9915F, -1.1695F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r49 = LowerlegL.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(102, 60).addBox(-2.0F, 0.0F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 1.9915F, -1.1695F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r50 = LowerlegL.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(77, 64).addBox(-2.0F, 0.0F, -0.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition FootL = LowerlegL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 7.7764F, 0.4154F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r51 = FootL.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(65, 9).addBox(-3.0F, -2.0F, 0.45F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.6F, -0.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(46, 16).addBox(-3.0F, -0.7F, -3.85F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.3F, -0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition UpperlegL2 = Hips.addOrReplaceChild("UpperlegL2", CubeListBuilder.create().texOffs(88, 75).addBox(-1.75F, 1.1F, -0.375F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.0F, 2.162F, -0.3147F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r52 = UpperlegL2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(11, 76).addBox(-1.5F, 0.0F, 0.175F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 4.1F, -0.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r53 = UpperlegL2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(76, 0).addBox(-1.5F, 0.0F, -0.075F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.25F, 4.1F, -0.55F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r54 = UpperlegL2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(40, 89).addBox(-1.5F, 0.0F, 0.1F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.25F, 10.0487F, 0.2332F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r55 = UpperlegL2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 22).addBox(-1.5F, -0.2F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 10.0487F, 0.2332F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r56 = UpperlegL2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 28).addBox(-1.5F, 2.0F, -0.7F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -1.9F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r57 = UpperlegL2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(77, 78).addBox(-1.5F, -1.35F, -0.625F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.25F, 0.1F, -0.375F, -0.5672F, 0.0F, 0.0F));

		PartDefinition LowerlegL2 = UpperlegL2.addOrReplaceChild("LowerlegL2", CubeListBuilder.create().texOffs(79, 35).addBox(0.0F, 0.0F, -1.35F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.65F, 13.9802F, 1.9829F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r58 = LowerlegL2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(116, 95).addBox(0.5F, -2.575F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.7736F, -0.5605F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r59 = LowerlegL2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(116, 83).addBox(0.5F, -1.975F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.7736F, -0.5605F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r60 = LowerlegL2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(117, 15).addBox(0.5F, -1.475F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.9819F, 0.1537F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r61 = LowerlegL2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(111, 84).addBox(0.5F, -3.0F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.9819F, 0.1537F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r62 = LowerlegL2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(101, 34).addBox(0.5F, -5.0F, -1.05F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 7.9F, 1.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r63 = LowerlegL2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(99, 89).addBox(-0.5F, -1.0F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.7117F, 0.5415F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r64 = LowerlegL2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(26, 75).addBox(0.0F, -5.0F, -0.85F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.1931F, 1.0439F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = LowerlegL2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(28, 98).addBox(0.0F, 0.0F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.1931F, 1.0439F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = LowerlegL2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(77, 103).addBox(0.0F, 0.0F, -1.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2235F, 0.6966F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r67 = LowerlegL2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(70, 103).addBox(0.0F, 0.0F, 0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9915F, -1.1695F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r68 = LowerlegL2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(28, 103).addBox(0.0F, 0.0F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 1.9915F, -1.1695F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r69 = LowerlegL2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(94, 11).addBox(0.0F, 0.0F, -0.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition FootL3 = LowerlegL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 7.7764F, 0.4154F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r70 = FootL3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 14).addBox(-2.0F, -2.0F, 0.45F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.6F, -0.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create().texOffs(38, 46).addBox(-2.0F, -0.7F, -3.85F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.3F, -0.9F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.5F, 1.45F, 3.9F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(101, 0).addBox(-0.4711F, -2.751F, -2.1824F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -0.5101F, -0.3369F, 0.1326F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(100, 15).addBox(-0.4711F, -3.4927F, -2.3625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, 0.0572F, -0.3369F, 0.1326F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(34, 116).addBox(-0.4711F, -4.0956F, 0.3278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, 1.3662F, -0.3369F, 0.1326F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(56, 104).addBox(-0.4711F, -4.1712F, -1.3822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, 0.7989F, -0.3369F, 0.1326F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(72, 98).addBox(-0.4711F, -2.731F, 0.9441F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -1.1733F, -0.3369F, 0.1326F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(63, 104).addBox(-0.4711F, -0.4023F, 1.5443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -0.7282F, -0.3369F, 0.1326F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(68, 121).addBox(-0.4711F, 1.0383F, 2.9762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 105).addBox(-0.4711F, 0.5383F, 1.9762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -0.2919F, -0.3369F, 0.1326F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(86, 101).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3887F, 5.8234F, -1.5557F, 0.8611F, 0.1441F, 0.5981F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(68, 118).addBox(-0.8443F, 0.0102F, -0.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.4691F, 4.646F, -3.2844F, 0.4684F, 0.1441F, 0.5981F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(63, 118).addBox(-0.8443F, 0.4352F, -1.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.4F, -2.6F, 0.2066F, 0.1441F, 0.5981F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(85, 107).addBox(-0.8443F, 0.1352F, -0.7634F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.4F, -2.6F, 0.5557F, 0.1441F, 0.5981F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 107).addBox(-1.8228F, 0.3181F, 0.4032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 107).addBox(-1.8228F, 0.6181F, -0.0968F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6F, 1.4F, -3.6F, -0.0054F, 0.2031F, 0.5328F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(72, 92).addBox(-1.0129F, -2.9718F, -1.8908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.6569F, 8.1802F, -7.0211F, -1.5045F, -0.7822F, 0.8315F));

		PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(16, 84).addBox(-1.0129F, -2.5718F, -0.9908F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 6.5F, -5.2F, -0.9547F, -0.7822F, 0.8315F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 92).addBox(-0.225F, -1.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8447F, 4.0765F, -5.1784F, -0.0302F, -0.7065F, 0.5685F));

		PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(59, 70).addBox(-0.2222F, -2.5087F, 0.4315F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 107).addBox(-0.2222F, -5.5087F, 0.4315F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6149F, 4.7876F, -5.1973F, -0.0236F, -0.2267F, 0.5542F));

		PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(12, 102).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6432F, 0.9071F, -5.2121F, -0.0302F, -0.7065F, 0.5685F));

		PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(56, 99).addBox(-0.225F, -0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2799F, 1.5178F, -5.1095F, -0.0302F, -0.7065F, 0.5685F));

		PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, -0.2F, 0.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4072F, -1.6251F, -4.5583F, -0.9158F, -0.5863F, 0.4086F));

		PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(15, 68).addBox(-0.4625F, 0.2346F, -0.9271F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -0.6137F, -0.3141F, 0.1716F));

		PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(40, 82).addBox(-0.4711F, -2.4075F, -1.4067F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -0.9289F, -0.3369F, 0.1326F));

		PartDefinition cube_r92 = bone.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(102, 56).addBox(-0.5211F, 0.7114F, -1.3049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -1.3827F, -0.3369F, 0.1326F));

		PartDefinition cube_r93 = bone.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(86, 63).addBox(-0.4711F, -1.0789F, -3.7898F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9327F, -2.2259F, -3.3889F, -0.6846F, -0.3369F, 0.1326F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.5F, 1.45F, 3.9F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.5289F, -2.751F, -2.1824F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -0.5101F, 0.3369F, -0.1326F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(100, 15).mirror().addBox(-0.5289F, -3.4927F, -2.3625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, 0.0572F, 0.3369F, -0.1326F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(34, 116).mirror().addBox(-0.5289F, -4.0956F, 0.3278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, 1.3662F, 0.3369F, -0.1326F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(56, 104).mirror().addBox(-0.5289F, -4.1712F, -1.3822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, 0.7989F, 0.3369F, -0.1326F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 98).mirror().addBox(-0.5289F, -2.731F, 0.9441F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -1.1733F, 0.3369F, -0.1326F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(63, 104).mirror().addBox(-0.5289F, -0.4023F, 1.5443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -0.7282F, 0.3369F, -0.1326F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 121).mirror().addBox(-0.5289F, 1.0383F, 2.9762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 105).mirror().addBox(-0.5289F, 0.5383F, 1.9762F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -0.2919F, 0.3369F, -0.1326F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(86, 101).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3887F, 5.8234F, -1.5557F, 0.8611F, -0.1441F, -0.5981F));

		PartDefinition cube_r102 = bone4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(68, 118).mirror().addBox(-0.1557F, 0.0102F, -0.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.4691F, 4.646F, -3.2844F, 0.4684F, -0.1441F, -0.5981F));

		PartDefinition cube_r103 = bone4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(63, 118).mirror().addBox(-0.1557F, 0.4352F, -1.0634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.4F, -2.6F, 0.2066F, -0.1441F, -0.5981F));

		PartDefinition cube_r104 = bone4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 107).mirror().addBox(-0.1557F, 0.1352F, -0.7634F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.4F, -2.6F, 0.5557F, -0.1441F, -0.5981F));

		PartDefinition cube_r105 = bone4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(80, 107).mirror().addBox(0.8228F, 0.3181F, 0.4032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 107).mirror().addBox(0.8228F, 0.6181F, -0.0968F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.4F, -3.6F, -0.0054F, -0.2031F, -0.5328F));

		PartDefinition cube_r106 = bone4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(72, 92).mirror().addBox(0.0129F, -2.9718F, -1.8908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.6569F, 8.1802F, -7.0211F, -1.5045F, 0.7822F, -0.8315F));

		PartDefinition cube_r107 = bone4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(16, 84).mirror().addBox(0.0129F, -2.5718F, -0.9908F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 6.5F, -5.2F, -0.9547F, 0.7822F, -0.8315F));

		PartDefinition cube_r108 = bone4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(79, 92).mirror().addBox(-0.775F, -1.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8447F, 4.0765F, -5.1784F, -0.0302F, 0.7065F, -0.5685F));

		PartDefinition cube_r109 = bone4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(59, 70).mirror().addBox(-0.7778F, -2.5087F, 0.4315F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 107).mirror().addBox(-0.7778F, -5.5087F, 0.4315F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6149F, 4.7876F, -5.1973F, -0.0236F, 0.2267F, -0.5542F));

		PartDefinition cube_r110 = bone4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(12, 102).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6432F, 0.9071F, -5.2121F, -0.0302F, 0.7065F, -0.5685F));

		PartDefinition cube_r111 = bone4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(56, 99).mirror().addBox(-0.775F, -0.5F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2799F, 1.5178F, -5.1095F, -0.0302F, 0.7065F, -0.5685F));

		PartDefinition cube_r112 = bone4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.5F, -0.2F, 0.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4072F, -1.6251F, -4.5583F, -0.9158F, 0.5863F, -0.4086F));

		PartDefinition cube_r113 = bone4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(-0.5375F, 0.2346F, -0.9271F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -0.6137F, 0.3141F, -0.1716F));

		PartDefinition cube_r114 = bone4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-0.5289F, -2.4075F, -1.4067F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -0.9289F, 0.3369F, -0.1326F));

		PartDefinition cube_r115 = bone4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(102, 56).mirror().addBox(-0.4789F, 0.7114F, -1.3049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -1.3827F, 0.3369F, -0.1326F));

		PartDefinition cube_r116 = bone4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(86, 63).mirror().addBox(-0.5289F, -1.0789F, -3.7898F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9327F, -2.2259F, -3.3889F, -0.6846F, 0.3369F, -0.1326F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.225F, -1.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(76, 119).addBox(0.0F, -2.511F, 10.6148F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(91, 118).addBox(0.0F, -2.511F, 8.6148F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(64, 61).addBox(-1.0F, -0.111F, 8.6148F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -6.95F, -10.6F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck21_r2 = Body.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(115, 32).mirror().addBox(-6.6724F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.88F, -1.2885F, 0.0244F, -0.2619F, -1.5706F));

		PartDefinition neck20_r3 = Body.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.88F, -1.2885F, -0.0909F, -0.2471F, -1.1197F));

		PartDefinition neck19_r3 = Body.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(31, 114).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.88F, -1.2885F, -0.2099F, -0.1597F, -0.5469F));

		PartDefinition neck20_r4 = Body.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(67, 23).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.88F, -2.9885F, 0.0373F, -0.1579F, -1.5209F));

		PartDefinition neck19_r4 = Body.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(97, 49).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.88F, -2.9885F, -0.0335F, -0.1588F, -1.0789F));

		PartDefinition neck18_r2 = Body.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.88F, -2.9885F, -0.1138F, -0.1158F, -0.5078F));

		PartDefinition neck18_r3 = Body.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(31, 114).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.88F, -1.2885F, -0.2099F, 0.1597F, 0.5469F));

		PartDefinition neck19_r5 = Body.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(97, 51).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.88F, -1.2885F, -0.0909F, 0.2471F, 1.1197F));

		PartDefinition neck20_r5 = Body.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(115, 32).addBox(4.6724F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.88F, -1.2885F, 0.0244F, 0.2619F, 1.5706F));

		PartDefinition neck17_r1 = Body.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(0, 114).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.88F, -2.9885F, -0.1138F, 0.1158F, 0.5078F));

		PartDefinition neck18_r4 = Body.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(97, 49).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.88F, -2.9885F, -0.0335F, 0.1588F, 1.0789F));

		PartDefinition neck19_r6 = Body.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(67, 23).addBox(4.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.88F, -2.9885F, 0.0373F, 0.1579F, 1.5209F));

		PartDefinition cube_r118 = Body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(61, 25).addBox(-3.0F, -3.2929F, -0.1641F, 6.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 12.2734F, -3.7722F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body2 = Body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8123F, -3.502F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(15, 118).addBox(0.0F, -2.4957F, 0.0418F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.9446F, -1.2146F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(55, 77).addBox(0.0F, -2.8163F, 0.0507F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -2.8446F, -3.0146F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(30, 85).addBox(0.0F, -2.8637F, 0.0729F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -3.9446F, -4.7146F, -0.5585F, 0.0F, 0.0F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(86, 69).mirror().addBox(-9.6724F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.0677F, -1.1865F, 0.0373F, -0.1579F, -1.5209F));

		PartDefinition neck20_r6 = body2.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(49, 97).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.0677F, -1.1865F, -0.0335F, -0.1588F, -1.0789F));

		PartDefinition neck19_r7 = body2.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(109, 113).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.0677F, -1.1865F, -0.1138F, -0.1158F, -0.5078F));

		PartDefinition neck19_r8 = body2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(113, 70).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -3.1677F, -4.5865F, -0.0188F, -0.071F, -0.4817F));

		PartDefinition neck20_r7 = body2.addOrReplaceChild("neck20_r7", CubeListBuilder.create().texOffs(97, 47).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -3.1677F, -4.5865F, 0.0224F, -0.0699F, -1.0504F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(57, 51).mirror().addBox(-12.6724F, -3.2692F, -0.5067F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -3.1677F, -4.5865F, 0.0498F, -0.0539F, -1.4873F));

		PartDefinition neck20_r8 = body2.addOrReplaceChild("neck20_r8", CubeListBuilder.create().texOffs(40, 33).mirror().addBox(-10.6724F, -3.2692F, -0.5067F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.9677F, -2.8865F, 0.0436F, -0.1059F, -1.5043F));

		PartDefinition neck19_r9 = body2.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(97, 32).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.9677F, -2.8865F, -0.0054F, -0.1144F, -1.0653F));

		PartDefinition neck18_r5 = body2.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(113, 68).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.9677F, -2.8865F, -0.0662F, -0.0935F, -0.4953F));

		PartDefinition neck20_r9 = body2.addOrReplaceChild("neck20_r9", CubeListBuilder.create().texOffs(57, 51).addBox(4.6724F, -3.2692F, -0.5067F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.1677F, -4.5865F, 0.0498F, 0.0539F, 1.4873F));

		PartDefinition neck19_r10 = body2.addOrReplaceChild("neck19_r10", CubeListBuilder.create().texOffs(97, 47).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.1677F, -4.5865F, 0.0224F, 0.0699F, 1.0504F));

		PartDefinition neck18_r6 = body2.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(113, 70).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.1677F, -4.5865F, -0.0188F, 0.071F, 0.4817F));

		PartDefinition neck18_r7 = body2.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(109, 113).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.0677F, -1.1865F, -0.1138F, 0.1158F, 0.5078F));

		PartDefinition neck19_r11 = body2.addOrReplaceChild("neck19_r11", CubeListBuilder.create().texOffs(49, 97).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.0677F, -1.1865F, -0.0335F, 0.1588F, 1.0789F));

		PartDefinition neck20_r10 = body2.addOrReplaceChild("neck20_r10", CubeListBuilder.create().texOffs(86, 69).addBox(4.6724F, -3.2692F, -0.5067F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.0677F, -1.1865F, 0.0373F, 0.1579F, 1.5209F));

		PartDefinition neck17_r2 = body2.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(113, 68).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.9677F, -2.8865F, -0.0662F, 0.0935F, 0.4953F));

		PartDefinition neck18_r8 = body2.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(97, 32).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.9677F, -2.8865F, -0.0054F, 0.1144F, 1.0653F));

		PartDefinition neck19_r12 = body2.addOrReplaceChild("neck19_r12", CubeListBuilder.create().texOffs(40, 33).addBox(4.6724F, -3.2692F, -0.5067F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.9677F, -2.8865F, 0.0436F, 0.1059F, 1.5043F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(48, 0).addBox(-2.5F, -2.9921F, -2.9754F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 13.2259F, -5.644F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(32, 62).addBox(-3.0F, -2.9921F, -1.9754F, 6.0F, 3.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 13.5904F, -3.6775F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(15, 62).addBox(-3.0F, -3.0921F, -1.9754F, 6.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 13.7775F, -1.6838F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(38, 36).addBox(-1.0F, -0.111F, 1.6147F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -5.0447F, -7.0146F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Shoulder = body2.addOrReplaceChild("Shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.5447F, -5.9146F, 0.0175F, 0.0436F, 0.0008F));

		PartDefinition cube_r126 = Shoulder.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(15, 55).addBox(0.0F, -3.2069F, -0.1804F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.45F, -5.9F, -0.4803F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Shoulder.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(73, 115).addBox(0.0F, -3.2119F, -0.0498F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.15F, -0.5F, -0.4716F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Shoulder.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(45, 114).addBox(0.0F, -3.6324F, -0.2114F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, -2.2F, -0.4367F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Shoulder.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(12, 93).addBox(0.0F, -3.2942F, 0.0204F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.85F, -4.2F, -0.4716F, 0.0F, 0.0F));

		PartDefinition neck20_r11 = Shoulder.addOrReplaceChild("neck20_r11", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-13.6724F, -3.2692F, -0.5067F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.523F, -0.2719F, 0.0519F, -0.0366F, -1.4525F));

		PartDefinition neck19_r13 = Shoulder.addOrReplaceChild("neck19_r13", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.523F, -0.2719F, 0.0316F, -0.0551F, -1.0161F));

		PartDefinition neck18_r9 = Shoulder.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(113, 51).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.523F, -0.2719F, -0.003F, -0.0634F, -0.4479F));

		PartDefinition neck19_r14 = Shoulder.addOrReplaceChild("neck19_r14", CubeListBuilder.create().texOffs(25, 10).mirror().addBox(-13.6724F, -3.2692F, -0.5067F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.2231F, -2.1719F, 0.056F, -0.0019F, -1.4526F));

		PartDefinition neck18_r10 = Shoulder.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(97, 28).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.2231F, -2.1719F, 0.05F, -0.0254F, -1.0168F));

		PartDefinition neck17_r3 = Shoulder.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(112, 26).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.2231F, -2.1719F, 0.0285F, -0.0483F, -0.4496F));

		PartDefinition neck18_r11 = Shoulder.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(25, 8).mirror().addBox(-13.6724F, -3.2692F, -0.5067F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.023F, -4.0719F, 0.0581F, 0.0154F, -1.4875F));

		PartDefinition neck17_r4 = Shoulder.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.023F, -4.0719F, 0.0591F, -0.0106F, -1.0519F));

		PartDefinition neck16_r1 = Shoulder.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(98, 26).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.023F, -4.0719F, 0.0442F, -0.0407F, -0.4852F));

		PartDefinition neck17_r5 = Shoulder.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-12.6724F, -3.2692F, -0.5067F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.923F, -6.0219F, 0.0622F, 0.0501F, -1.4873F));

		PartDefinition neck16_r2 = Shoulder.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(61, 31).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.923F, -6.0219F, 0.0775F, 0.0191F, -1.0518F));

		PartDefinition neck15_r1 = Shoulder.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(114, 65).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.923F, -6.0219F, 0.0757F, -0.0255F, -0.4863F));

		PartDefinition neck17_r6 = Shoulder.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(113, 51).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.523F, -0.2719F, -0.003F, 0.0634F, 0.4479F));

		PartDefinition neck18_r12 = Shoulder.addOrReplaceChild("neck18_r12", CubeListBuilder.create().texOffs(97, 30).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.523F, -0.2719F, 0.0316F, 0.0551F, 1.0161F));

		PartDefinition neck19_r15 = Shoulder.addOrReplaceChild("neck19_r15", CubeListBuilder.create().texOffs(46, 23).addBox(4.6724F, -3.2692F, -0.5067F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.523F, -0.2719F, 0.0519F, 0.0366F, 1.4525F));

		PartDefinition neck16_r3 = Shoulder.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(112, 26).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.2231F, -2.1719F, 0.0285F, 0.0483F, 0.4496F));

		PartDefinition neck17_r7 = Shoulder.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(97, 28).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.2231F, -2.1719F, 0.05F, 0.0254F, 1.0168F));

		PartDefinition neck18_r13 = Shoulder.addOrReplaceChild("neck18_r13", CubeListBuilder.create().texOffs(25, 10).addBox(4.6724F, -3.2692F, -0.5067F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.2231F, -2.1719F, 0.056F, 0.0019F, 1.4526F));

		PartDefinition neck15_r2 = Shoulder.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(98, 26).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.023F, -4.0719F, 0.0442F, 0.0407F, 0.4852F));

		PartDefinition neck16_r4 = Shoulder.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(93, 95).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.023F, -4.0719F, 0.0591F, 0.0106F, 1.0519F));

		PartDefinition neck17_r8 = Shoulder.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(25, 8).addBox(4.6724F, -3.2692F, -0.5067F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.023F, -4.0719F, 0.0581F, -0.0154F, 1.4875F));

		PartDefinition neck14_r1 = Shoulder.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(114, 65).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.923F, -6.0219F, 0.0757F, 0.0255F, 0.4863F));

		PartDefinition neck15_r3 = Shoulder.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(61, 31).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.923F, -6.0219F, 0.0775F, -0.0191F, 1.0518F));

		PartDefinition neck16_r5 = Shoulder.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(57, 49).addBox(4.6725F, -3.2692F, -0.5067F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.923F, -6.0219F, 0.0622F, -0.0501F, 1.4873F));

		PartDefinition cube_r130 = Shoulder.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(19, 46).addBox(-2.5F, -2.0186F, -3.9941F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.8068F, -2.8301F, -0.5763F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Shoulder.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -0.3294F, -7.8366F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 0.1F, -0.4018F, 0.0F, 0.0F));

		PartDefinition bone2 = Shoulder.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.5F, 1.85F, -6.5F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(98, 101).addBox(-1.0F, -0.0163F, -1.0141F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4756F, 4.8755F, -1.0287F, 0.0F, 0.0F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 99).addBox(-1.0F, -0.0163F, -0.0141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -4.472F, 4.9954F, -1.6308F, 0.0F, 0.0F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(79, 98).addBox(-1.0F, -2.0163F, -0.0141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -4.3948F, 2.1681F, -0.7581F, 0.0F, 0.0F));

		PartDefinition cube_r135 = bone2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(44, 77).addBox(-2.0337F, -0.1279F, -3.9993F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3857F, 8.5949F, -3.6796F, -0.7659F, -0.0676F, -0.0647F));

		PartDefinition cube_r136 = bone2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(76, 47).addBox(-2.0208F, -0.267F, -1.231F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(75, 68).addBox(-0.0208F, -0.267F, -1.231F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3857F, 8.5949F, -3.6796F, -0.5914F, -0.0553F, -0.0754F));

		PartDefinition cube_r137 = bone2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(72, 83).addBox(0.4039F, -0.1061F, -3.2021F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3857F, 8.5949F, -3.6796F, -0.8282F, 0.3769F, -0.5571F));

		PartDefinition cube_r138 = bone2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 46).addBox(-0.6586F, 0.0356F, -1.3438F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0702F, 10.0483F, -0.2016F, -0.3074F, 0.1717F, -0.7773F));

		PartDefinition cube_r139 = bone2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 64).addBox(-0.6586F, 0.0356F, -1.0438F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0702F, 10.0483F, -0.2016F, -0.3578F, 0.3357F, -0.839F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(77, 73).addBox(-0.8076F, -0.1295F, -0.5999F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3825F, 9.9201F, -0.38F, -0.2564F, 0.408F, -0.8406F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(80, 17).addBox(-0.3888F, -0.5019F, -0.9499F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9185F, 10.1415F, -0.5404F, 0.471F, 0.592F, -0.6711F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(65, 19).addBox(-2.0743F, 0.1989F, 1.4584F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3857F, 8.5949F, -3.6796F, -0.3215F, -0.0332F, -0.0874F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(37, 95).addBox(-1.0F, -2.5163F, -0.1141F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.8F, -0.6185F, 0.0F, 0.0F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(97, 119).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -1.554F, -4.5257F, -1.3166F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(90, 89).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.1507F, -5.9506F, -0.793F, 0.0F, 0.0F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(76, 115).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 2.9166F, -1.5897F, -0.5312F, 0.0F, 0.0F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(95, 63).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.4248F, -1.4992F, -0.1473F, 0.0F, 0.0F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(49, 99).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 5.3752F, -2.0426F, -0.4003F, 0.0F, 0.0F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(87, 8).addBox(-0.5F, -4.9F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.71F, -5.0534F, -0.3567F, 0.0F, 0.0F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(77, 57).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.732F, -5.2624F, 0.2105F, 0.0F, 0.0F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.8676F, -1.9998F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9F, 4.8011F, -6.9296F, -0.8803F, 0.5672F, 0.48F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(86, 95).addBox(-0.5F, -0.8021F, -1.3948F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9F, 4.8011F, -6.9296F, 0.865F, 0.5672F, 0.48F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(101, 41).addBox(-0.5F, -1.3818F, -1.4854F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 4.8011F, -6.9296F, -0.0513F, 0.5672F, 0.48F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(95, 57).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.5724F, -6.8919F, 0.9523F, 0.0F, 0.0F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(64, 53).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 1.5737F, -6.9638F, 0.036F, 0.0F, 0.0F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(48, 70).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7622F, -6.371F, -0.5312F, 0.0F, 0.0F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(37, 68).addBox(-0.5F, -0.325F, -1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -0.5486F, -2.9918F, -0.9239F, 0.0F, 0.0F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(115, 72).addBox(-1.0F, -0.098F, -0.0277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.3653F, -1.5989F, -1.5784F, 0.0F, 0.0F));

		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(23, 85).addBox(-1.0F, -2.098F, -1.3277F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8803F, 0.0F, 0.0F));

		PartDefinition bone3 = Shoulder.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-5.5F, 1.85F, -6.5F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(98, 101).mirror().addBox(0.0F, -0.0163F, -1.0141F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4756F, 4.8755F, -1.0287F, 0.0F, 0.0F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(0.0F, -0.0163F, -0.0141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.472F, 4.9954F, -1.6308F, 0.0F, 0.0F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(0.0F, -2.0163F, -0.0141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.3948F, 2.1681F, -0.7581F, 0.0F, 0.0F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 77).mirror().addBox(0.0337F, -0.1279F, -3.9993F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3857F, 8.5949F, -3.6796F, -0.7659F, 0.0676F, 0.0647F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(0.0208F, -0.267F, -1.231F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 68).mirror().addBox(-1.9792F, -0.267F, -1.231F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3857F, 8.5949F, -3.6796F, -0.5914F, 0.0553F, 0.0754F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-2.4039F, -0.1061F, -3.2021F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3857F, 8.5949F, -3.6796F, -0.8282F, -0.3769F, 0.5571F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.3414F, 0.0356F, -1.3438F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0702F, 10.0483F, -0.2016F, -0.3074F, -0.1717F, 0.7773F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.3414F, 0.0356F, -1.0438F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0702F, 10.0483F, -0.2016F, -0.3578F, -0.3357F, 0.839F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-0.1924F, -0.1295F, -0.5999F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3825F, 9.9201F, -0.38F, -0.2564F, -0.408F, 0.8406F));

		PartDefinition cube_r169 = bone3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-0.6112F, -0.5019F, -0.9499F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9185F, 10.1415F, -0.5404F, 0.471F, -0.592F, 0.6711F));

		PartDefinition cube_r170 = bone3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 19).mirror().addBox(-2.9257F, 0.1989F, 1.4584F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3857F, 8.5949F, -3.6796F, -0.3215F, 0.0332F, 0.0874F));

		PartDefinition cube_r171 = bone3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(37, 95).mirror().addBox(0.0F, -2.5163F, -0.1141F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3F, 0.8F, -0.6185F, 0.0F, 0.0F));

		PartDefinition cube_r172 = bone3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(97, 119).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.554F, -4.5257F, -1.3166F, 0.0F, 0.0F));

		PartDefinition cube_r173 = bone3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(90, 89).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1507F, -5.9506F, -0.793F, 0.0F, 0.0F));

		PartDefinition cube_r174 = bone3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(76, 115).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.9166F, -1.5897F, -0.5312F, 0.0F, 0.0F));

		PartDefinition cube_r175 = bone3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4248F, -1.4992F, -0.1473F, 0.0F, 0.0F));

		PartDefinition cube_r176 = bone3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(49, 99).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.3752F, -2.0426F, -0.4003F, 0.0F, 0.0F));

		PartDefinition cube_r177 = bone3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(87, 8).mirror().addBox(-0.5F, -4.9F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.71F, -5.0534F, -0.3567F, 0.0F, 0.0F));

		PartDefinition cube_r178 = bone3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(-0.5F, -1.9F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.732F, -5.2624F, 0.2105F, 0.0F, 0.0F));

		PartDefinition cube_r179 = bone3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -1.8676F, -1.9998F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9F, 4.8011F, -6.9296F, -0.8803F, -0.5672F, -0.48F));

		PartDefinition cube_r180 = bone3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(86, 95).mirror().addBox(-0.5F, -0.8021F, -1.3948F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.9F, 4.8011F, -6.9296F, 0.865F, -0.5672F, -0.48F));

		PartDefinition cube_r181 = bone3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(101, 41).mirror().addBox(-0.5F, -1.3818F, -1.4854F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 4.8011F, -6.9296F, -0.0513F, -0.5672F, -0.48F));

		PartDefinition cube_r182 = bone3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.5724F, -6.8919F, 0.9523F, 0.0F, 0.0F));

		PartDefinition cube_r183 = bone3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5737F, -6.9638F, 0.036F, 0.0F, 0.0F));

		PartDefinition cube_r184 = bone3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(48, 70).mirror().addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7622F, -6.371F, -0.5312F, 0.0F, 0.0F));

		PartDefinition cube_r185 = bone3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(37, 68).mirror().addBox(-0.5F, -0.325F, -1.325F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.5486F, -2.9918F, -0.9239F, 0.0F, 0.0F));

		PartDefinition cube_r186 = bone3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(115, 72).mirror().addBox(0.0F, -0.098F, -0.0277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3653F, -1.5989F, -1.5784F, 0.0F, 0.0F));

		PartDefinition cube_r187 = bone3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(23, 85).mirror().addBox(0.0F, -2.098F, -1.3277F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8803F, 0.0F, 0.0F));

		PartDefinition UpperArmL = Shoulder.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(16, 92).addBox(-0.25F, -0.6F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 8.65F, -10.8F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r188 = UpperArmL.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(81, 115).addBox(-0.5F, 0.6308F, -1.2668F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.55F, 4.0167F, 0.05F, 0.4451F, -0.5236F, 0.0436F));

		PartDefinition cube_r189 = UpperArmL.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5F, -4.7874F, -0.7295F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.55F, 4.0167F, 0.05F, -0.1222F, -0.5236F, 0.0436F));

		PartDefinition cube_r190 = UpperArmL.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 77).addBox(-0.25F, 6.9F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 8).addBox(-0.25F, -0.1F, -0.8F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4453F, 0.6251F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r191 = UpperArmL.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(105, 20).addBox(-0.25F, -1.5F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.2101F, 0.1861F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r192 = LowerArmL.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(103, 105).addBox(-0.9F, -2.0197F, -1.229F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.85F, 2.0393F, 0.6529F, -0.2182F, 0.7854F, 0.0F));

		PartDefinition cube_r193 = LowerArmL.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(83, 83).addBox(-0.9F, -2.1258F, -1.1663F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 83).addBox(-1.1F, -2.3258F, -0.0663F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.85F, 2.0393F, 0.6529F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r194 = LowerArmL.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(101, 5).addBox(-1.1F, -2.5934F, 0.0724F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.85F, 2.0393F, 0.6529F, -0.2618F, 0.7854F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(49, 82).addBox(-2.25F, -0.35F, -1.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6F, 7.0103F, 0.6324F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r195 = HandL.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(111, 34).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 4.0F, -0.25F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r196 = HandL.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(49, 89).addBox(13.2042F, -5.05F, -4.0461F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0F, 4.7F, -0.4F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r197 = HandL.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 85).addBox(-0.1982F, -5.05F, -0.2932F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, -0.4F, 0.0F, 0.2618F, 0.0F));

		PartDefinition UpperArmL2 = Shoulder.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(65, 92).addBox(-1.75F, -0.6F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9F, 8.65F, -10.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r198 = UpperArmL2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5F, 0.6308F, -1.2668F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.55F, 4.0167F, 0.05F, 0.4451F, 0.5236F, -0.0436F));

		PartDefinition cube_r199 = UpperArmL2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(44, 95).addBox(-0.5F, -4.7874F, -0.7295F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.55F, 4.0167F, 0.05F, -0.1222F, 0.5236F, -0.0436F));

		PartDefinition cube_r200 = UpperArmL2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(93, 97).addBox(-1.75F, 6.9F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(33, 81).addBox(-1.75F, -0.1F, -0.8F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4453F, 0.6251F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r201 = UpperArmL2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(105, 24).addBox(-1.75F, -1.5F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.2101F, 0.1861F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r202 = LowerArmL2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(12, 106).addBox(-1.1F, -2.0197F, -1.229F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.85F, 2.0393F, 0.6529F, -0.2182F, -0.7854F, 0.0F));

		PartDefinition cube_r203 = LowerArmL2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(9, 84).addBox(-1.1F, -2.1258F, -1.1663F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 83).addBox(-0.9F, -2.3258F, -0.0663F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.85F, 2.0393F, 0.6529F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r204 = LowerArmL2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(21, 101).addBox(-0.9F, -2.5934F, 0.0724F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.85F, 2.0393F, 0.6529F, -0.2618F, -0.7854F, 0.0F));

		PartDefinition HandL2 = LowerArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(83, 40).addBox(-0.75F, -0.35F, -1.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6F, 7.0103F, 0.6324F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r205 = HandL2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(111, 37).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 4.0F, -0.25F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r206 = HandL2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 90).addBox(-14.2042F, -5.05F, -4.0461F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 4.7F, -0.4F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r207 = HandL2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 0).addBox(-0.8018F, -5.05F, -0.2932F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, -0.4F, 0.0F, -0.2618F, 0.0F));

		PartDefinition Neck1 = Shoulder.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.685F, -6.6688F, -0.7765F, 0.2155F, 0.0314F));

		PartDefinition cube_r208 = Neck1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(23, 93).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0134F, -2.4719F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Neck1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(113, 43).mirror().addBox(-0.9598F, -3.0986F, -1.3135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 1.0224F, -0.7576F, 1.6404F, 0.0055F, -0.0783F));

		PartDefinition cube_r210 = Neck1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(24, 107).mirror().addBox(-1.3661F, -0.1617F, -0.2643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 3.7224F, -0.1576F, 1.3517F, -0.1158F, -0.084F));

		PartDefinition cube_r211 = Neck1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(19, 112).mirror().addBox(-1.2004F, -0.1987F, -0.4141F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 2.5224F, -2.4576F, 1.151F, -0.1158F, -0.084F));

		PartDefinition cube_r212 = Neck1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(58, 118).mirror().addBox(-1.0853F, -0.1096F, -0.504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 1.8224F, -3.9576F, 1.2033F, -0.1158F, -0.084F));

		PartDefinition cube_r213 = Neck1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(99, 72).mirror().addBox(-1.975F, -0.6F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3734F, 0.9424F, -2.5703F, 1.4817F, 0.3812F, -1.2785F));

		PartDefinition cube_r214 = Neck1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(94, 5).mirror().addBox(-0.5951F, -2.4061F, 0.1741F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.8224F, -1.0576F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r215 = Neck1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(94, 5).addBox(-0.4049F, -2.4061F, 0.1741F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1785F, 0.8224F, -1.0576F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r216 = Neck1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(99, 72).addBox(-1.025F, -0.6F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3734F, 0.9424F, -2.5703F, 1.4817F, -0.3812F, 1.2785F));

		PartDefinition cube_r217 = Neck1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(58, 118).addBox(0.0854F, -0.1096F, -0.504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 1.8224F, -3.9576F, 1.2033F, 0.1158F, 0.084F));

		PartDefinition cube_r218 = Neck1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(19, 112).addBox(0.2004F, -0.1987F, -0.4141F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 2.5224F, -2.4576F, 1.151F, 0.1158F, 0.084F));

		PartDefinition cube_r219 = Neck1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(24, 107).addBox(0.3661F, -0.1617F, -0.2643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 3.7224F, -0.1576F, 1.3517F, 0.1158F, 0.084F));

		PartDefinition cube_r220 = Neck1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(113, 43).addBox(-1.0402F, -3.0986F, -1.3135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 1.0224F, -0.7576F, 1.6404F, -0.0055F, 0.0783F));

		PartDefinition cube_r221 = Neck1.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(64, 68).addBox(-0.5F, 0.4819F, 0.6048F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4828F, -4.6377F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(72, 41).addBox(-0.5F, -0.0665F, -3.885F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8676F, -3.8695F, 0.0011F, 0.0436F, 0.0F));

		PartDefinition cube_r222 = Neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(90, 109).mirror().addBox(-0.5951F, -2.4061F, 0.7741F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.3548F, -0.7881F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r223 = Neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(63, 113).mirror().addBox(-1.3661F, -0.1617F, -0.2643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 2.5548F, 0.3119F, 1.2644F, -0.1158F, -0.084F));

		PartDefinition cube_r224 = Neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(119, 62).mirror().addBox(0.3425F, -3.1398F, 0.7741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.3548F, -0.7881F, 1.5984F, 0.3717F, 0.6224F));

		PartDefinition cube_r225 = Neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(68, 113).mirror().addBox(-1.5601F, -0.1444F, -0.0361F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 3.5548F, 2.7119F, 1.3517F, -0.1158F, -0.084F));

		PartDefinition cube_r226 = Neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(58, 113).mirror().addBox(-1.2004F, -0.1987F, -0.4141F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 1.3548F, -1.9881F, 1.151F, -0.1158F, -0.084F));

		PartDefinition cube_r227 = Neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(53, 118).mirror().addBox(-1.0853F, -0.1096F, -0.504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.6548F, -3.4881F, 1.2033F, -0.1158F, -0.084F));

		PartDefinition cube_r228 = Neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(35, 101).mirror().addBox(-1.3F, -0.2F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3734F, 0.5748F, -2.9007F, 1.5515F, 0.5215F, -1.0931F));

		PartDefinition cube_r229 = Neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(24, 113).mirror().addBox(-0.9598F, -2.2986F, -0.7135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.6548F, -1.0881F, 1.6404F, 0.0055F, -0.0783F));

		PartDefinition cube_r230 = Neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(24, 113).addBox(-1.0402F, -2.2986F, -0.7135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 0.6548F, -1.0881F, 1.6404F, -0.0055F, 0.0783F));

		PartDefinition cube_r231 = Neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(35, 101).addBox(-1.7F, -0.2F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.3734F, 0.5748F, -2.9007F, 1.5515F, -0.5215F, 1.0931F));

		PartDefinition cube_r232 = Neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(53, 118).addBox(0.0854F, -0.1096F, -0.504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 0.6548F, -3.4881F, 1.2033F, 0.1158F, 0.084F));

		PartDefinition cube_r233 = Neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(58, 113).addBox(0.2004F, -0.1987F, -0.4141F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 1.3548F, -1.9881F, 1.151F, 0.1158F, 0.084F));

		PartDefinition cube_r234 = Neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(63, 113).addBox(0.3661F, -0.1617F, -0.2643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 2.5548F, 0.3119F, 1.2644F, 0.1158F, 0.084F));

		PartDefinition cube_r235 = Neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(68, 113).addBox(0.5601F, -0.1444F, -0.0361F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 3.5548F, 2.7119F, 1.3517F, 0.1158F, 0.084F));

		PartDefinition cube_r236 = Neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(90, 109).addBox(-0.4049F, -2.4061F, 0.7741F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1785F, 0.3548F, -0.7881F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r237 = Neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 93).addBox(0.0F, -2.0F, -0.5F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.481F, -2.2024F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r238 = Neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(119, 62).addBox(-1.3425F, -3.1398F, 0.7741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1785F, 0.3548F, -0.7881F, 1.5984F, -0.3717F, -0.6224F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, -0.5757F, -10.128F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5258F, -3.6581F, -0.0891F, 0.0435F, -0.0039F));

		PartDefinition cube_r239 = Neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(109, 63).mirror().addBox(-0.5951F, -2.4061F, 0.7741F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, -0.0711F, -1.83F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r240 = Neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(108, 68).mirror().addBox(-0.61F, -1.6176F, 0.2731F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -0.4148F, -7.095F, 1.5251F, 0.0293F, 0.6115F));

		PartDefinition cube_r241 = Neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(101, 81).mirror().addBox(-1.5881F, -0.042F, -0.4455F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 1.1289F, 0.47F, 1.4739F, -0.1158F, -0.084F));

		PartDefinition cube_r242 = Neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(107, 14).mirror().addBox(-1.2004F, -0.1237F, -0.2391F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.9289F, -3.03F, 1.4564F, -0.1158F, -0.084F));

		PartDefinition cube_r243 = Neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(48, 118).mirror().addBox(-1.0853F, -0.1096F, -0.704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.2289F, -4.53F, 1.4215F, -0.1158F, -0.084F));

		PartDefinition cube_r244 = Neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(111, 76).mirror().addBox(-0.9846F, -2.2946F, -0.1694F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.2289F, -2.13F, 1.6409F, 0.0375F, -0.9293F));

		PartDefinition cube_r245 = Neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(119, 59).mirror().addBox(0.3425F, -3.1398F, 0.7741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, -0.0711F, -1.83F, 1.5984F, 0.3717F, 0.6224F));

		PartDefinition cube_r246 = Neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(122, 102).mirror().addBox(0.1069F, 0.6817F, 0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, -0.0711F, -1.83F, 2.3385F, -0.4396F, 0.0924F));

		PartDefinition cube_r247 = Neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(7, 113).mirror().addBox(-0.9598F, -2.2986F, -0.7135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1785F, 0.2289F, -2.13F, 1.6404F, 0.0055F, -0.0783F));

		PartDefinition cube_r248 = Neck3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(106, 89).mirror().addBox(-1.4623F, -0.0808F, -0.3153F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1766F, 0.7602F, -5.095F, 1.4386F, -0.1227F, -0.0736F));

		PartDefinition cube_r249 = Neck3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(53, 113).mirror().addBox(-1.171F, -0.1846F, -0.2157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1766F, 0.5602F, -7.595F, 1.4561F, -0.1227F, -0.0736F));

		PartDefinition cube_r250 = Neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(118, 46).mirror().addBox(-1.3272F, -2.3958F, -1.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1766F, -0.2398F, -6.795F, 1.4386F, -0.1227F, -0.0736F));

		PartDefinition cube_r251 = Neck3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(102, 112).mirror().addBox(-1.2939F, -1.126F, -1.1118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -0.4148F, -7.495F, 1.5534F, -0.0014F, -0.0785F));

		PartDefinition cube_r252 = Neck3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(108, 31).mirror().addBox(-1.4826F, -1.1135F, -0.2142F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -0.4148F, -7.495F, 1.5887F, -0.0325F, -0.9295F));

		PartDefinition cube_r253 = Neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(119, 56).mirror().addBox(-0.0416F, -0.7661F, -0.9831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6164F, -1.8516F, -8.5701F, 1.5207F, 0.4216F, 0.5924F));

		PartDefinition cube_r254 = Neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(63, 121).mirror().addBox(-0.2922F, -0.4525F, -0.2129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -1.1148F, -5.695F, 2.2428F, -0.4298F, 0.1327F));

		PartDefinition cube_r255 = Neck3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(7, 113).addBox(-1.0402F, -2.2986F, -0.7135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 0.2289F, -2.13F, 1.6404F, -0.0055F, 0.0783F));

		PartDefinition cube_r256 = Neck3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(122, 102).addBox(-1.1069F, 0.6817F, 0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1785F, -0.0711F, -1.83F, 2.3385F, 0.4396F, -0.0924F));

		PartDefinition cube_r257 = Neck3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(119, 59).addBox(-1.3425F, -3.1398F, 0.7741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1785F, -0.0711F, -1.83F, 1.5984F, -0.3717F, -0.6224F));

		PartDefinition cube_r258 = Neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(109, 58).addBox(-1.1785F, -2.7055F, -2.0689F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1785F, -0.0711F, -1.83F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r259 = Neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(109, 63).addBox(-0.4049F, -2.4061F, 0.7741F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1785F, -0.0711F, -1.83F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r260 = Neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(111, 76).addBox(-1.0154F, -2.2946F, -0.1694F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1785F, 0.2289F, -2.13F, 1.6409F, -0.0375F, 0.9293F));

		PartDefinition cube_r261 = Neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(48, 118).addBox(0.0854F, -0.1096F, -0.704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 0.2289F, -4.53F, 1.4215F, 0.1158F, 0.084F));

		PartDefinition cube_r262 = Neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(107, 14).addBox(0.2004F, -0.1237F, -0.2391F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 0.9289F, -3.03F, 1.4564F, 0.1158F, 0.084F));

		PartDefinition cube_r263 = Neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(101, 81).addBox(0.5881F, -0.042F, -0.4455F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1785F, 1.1289F, 0.47F, 1.4739F, 0.1158F, 0.084F));

		PartDefinition cube_r264 = Neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(63, 121).addBox(-0.7078F, -0.4525F, -0.2129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8766F, -1.1148F, -5.695F, 2.2428F, 0.4298F, -0.1327F));

		PartDefinition cube_r265 = Neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(108, 68).addBox(-0.39F, -1.6176F, 0.2731F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8766F, -0.4148F, -7.095F, 1.5251F, -0.0293F, -0.6115F));

		PartDefinition cube_r266 = Neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(109, 53).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5292F, -7.6484F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r267 = Neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(119, 56).addBox(-0.9584F, -0.7661F, -0.9831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6164F, -1.8516F, -8.5701F, 1.5207F, -0.4216F, -0.5924F));

		PartDefinition cube_r268 = Neck3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(108, 31).addBox(-0.5174F, -1.1135F, -0.2142F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8766F, -0.4148F, -7.495F, 1.5887F, 0.0325F, 0.9295F));

		PartDefinition cube_r269 = Neck3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(102, 112).addBox(-0.7061F, -1.126F, -1.1118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8766F, -0.4148F, -7.495F, 1.5534F, 0.0014F, 0.0785F));

		PartDefinition cube_r270 = Neck3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(118, 46).addBox(0.3272F, -2.3958F, -1.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1766F, -0.2398F, -6.795F, 1.4386F, 0.1227F, 0.0736F));

		PartDefinition cube_r271 = Neck3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(53, 113).addBox(0.1709F, -0.1846F, -0.2157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1766F, 0.5602F, -7.595F, 1.4561F, 0.1227F, 0.0736F));

		PartDefinition cube_r272 = Neck3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(106, 89).addBox(0.4623F, -0.0808F, -0.3153F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1766F, 0.7602F, -5.095F, 1.4386F, 0.1227F, 0.0736F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5958F, -10.9869F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0288F, -10.0435F, -0.2844F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Neck4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 108).addBox(-0.6164F, -1.6178F, 7.7396F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Neck4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(18, 121).mirror().addBox(2.7509F, 4.6307F, -8.5865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 2.5523F, -0.4351F, 0.1127F));

		PartDefinition cube_r275 = Neck4.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(63, 108).mirror().addBox(-0.9776F, 7.2531F, -1.7664F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 108).mirror().addBox(-1.0384F, 3.4424F, -1.695F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 48).mirror().addBox(-1.0447F, -0.2629F, -1.7007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r276 = Neck4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(118, 38).mirror().addBox(-2.1381F, 7.0145F, -1.7544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(118, 34).mirror().addBox(-2.5469F, 3.6555F, -2.1004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 118).mirror().addBox(-2.9752F, 0.2121F, -2.5583F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.4824F, -0.1194F, -0.0788F));

		PartDefinition cube_r277 = Neck4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(48, 113).mirror().addBox(-2.1381F, 8.3426F, -2.6549F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(112, 15).mirror().addBox(-2.5469F, 7.5572F, -2.7786F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5872F, -0.1194F, -0.0788F));

		PartDefinition cube_r278 = Neck4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(95, 112).mirror().addBox(-2.915F, 7.2799F, -2.6798F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5969F, 0.0021F, -0.0785F));

		PartDefinition cube_r279 = Neck4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(108, 28).mirror().addBox(-3.5744F, 7.3345F, -0.268F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(108, 6).mirror().addBox(-3.4576F, 3.5325F, -0.0204F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(108, 3).mirror().addBox(-3.331F, 0.0303F, 0.2219F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.6148F, 0.0025F, -0.9299F));

		PartDefinition cube_r280 = Neck4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(106, 83).mirror().addBox(-2.1381F, 10.7279F, -3.4227F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.657F, -0.1194F, -0.0788F));

		PartDefinition cube_r281 = Neck4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(119, 53).mirror().addBox(-3.7073F, 5.6378F, -1.7664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(119, 25).mirror().addBox(-2.3051F, 2.0939F, -1.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(119, 22).mirror().addBox(-0.893F, -1.3318F, -1.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5599F, 0.3969F, 0.608F));

		PartDefinition cube_r282 = Neck4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(82, 112).mirror().addBox(-3.0069F, 3.4752F, -2.4021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 112).mirror().addBox(-2.9675F, -0.0295F, -2.1665F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5966F, 0.0043F, -0.1658F));

		PartDefinition cube_r283 = Neck4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(113, 46).mirror().addBox(-2.5469F, 5.0861F, -2.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5348F, -0.1194F, -0.0788F));

		PartDefinition cube_r284 = Neck4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(70, 107).mirror().addBox(-2.9752F, 1.7074F, -2.5874F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.4999F, -0.1194F, -0.0788F));

		PartDefinition cube_r285 = Neck4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(119, 53).addBox(1.774F, 6.0213F, -1.058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(119, 25).addBox(0.3719F, 2.4774F, -0.9865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(119, 22).addBox(-1.0403F, -0.9483F, -0.9922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5599F, -0.3969F, -0.608F));

		PartDefinition cube_r286 = Neck4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(63, 108).addBox(-1.0314F, 7.2503F, -1.058F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 108).addBox(-0.9706F, 3.4396F, -0.9865F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 48).addBox(-0.9643F, -0.2658F, -0.9922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r287 = Neck4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(18, 121).addBox(-4.8618F, 4.4589F, -8.0801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 2.5523F, 0.4351F, -0.1127F));

		PartDefinition cube_r288 = Neck4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(106, 83).addBox(-0.0822F, 10.5737F, -3.5068F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.657F, 0.1194F, 0.0788F));

		PartDefinition cube_r289 = Neck4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(108, 28).addBox(0.8373F, 7.2928F, -1.2553F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(108, 6).addBox(0.7204F, 3.4908F, -1.0077F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(108, 3).addBox(0.5938F, -0.0113F, -0.7654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.6148F, -0.0025F, 0.9299F));

		PartDefinition cube_r290 = Neck4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(95, 112).addBox(-0.3141F, 7.2799F, -2.7766F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5969F, -0.0021F, 0.0785F));

		PartDefinition cube_r291 = Neck4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(48, 113).addBox(-0.0822F, 8.1947F, -2.7496F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(112, 15).addBox(0.3266F, 7.4092F, -2.8733F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5872F, 0.1194F, 0.0788F));

		PartDefinition cube_r292 = Neck4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(118, 38).addBox(-0.0822F, 6.8773F, -1.864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(118, 34).addBox(0.3266F, 3.5183F, -2.2101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 118).addBox(0.755F, 0.0749F, -2.6679F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.4824F, 0.1194F, 0.0788F));

		PartDefinition cube_r293 = Neck4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(113, 46).addBox(0.3266F, 4.9433F, -2.4773F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5348F, 0.1194F, 0.0788F));

		PartDefinition cube_r294 = Neck4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(82, 112).addBox(-0.209F, 3.4752F, -2.6056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 112).addBox(-0.2485F, -0.0295F, -2.37F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.5966F, -0.0043F, 0.1658F));

		PartDefinition cube_r295 = Neck4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(122, 109).addBox(-0.6164F, -2.2095F, 4.285F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 122).addBox(-0.6164F, -0.9783F, 0.5901F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Neck4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(70, 107).addBox(0.7549F, 1.5683F, -2.6947F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7444F, -1.9046F, -10.1758F, 1.4999F, 0.1194F, 0.0788F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.928F, 0.4128F, -0.0914F, 0.0403F, 0.0872F, 0.0035F));

		PartDefinition cube_r297 = Neck5.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(48, 108).mirror().addBox(-0.61F, -1.6176F, 0.273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -1.3806F, -12.8092F, 1.5251F, 0.0293F, 0.6115F));

		PartDefinition cube_r298 = Neck5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(108, 43).mirror().addBox(-0.61F, -1.5175F, 0.273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -1.7806F, -16.7092F, 1.5251F, 0.0293F, 0.6115F));

		PartDefinition cube_r299 = Neck5.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(119, 19).mirror().addBox(-0.0416F, -0.7661F, -0.9831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6164F, -2.8174F, -14.2844F, 1.5207F, 0.4216F, 0.5924F));

		PartDefinition cube_r300 = Neck5.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-1.4826F, -1.1135F, -0.2141F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -1.5806F, -13.0093F, 1.5887F, -0.0325F, -0.9295F));

		PartDefinition cube_r301 = Neck5.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(112, 23).mirror().addBox(-1.2939F, -1.126F, -1.2118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -1.5806F, -13.0093F, 1.5536F, -0.0029F, -0.1658F));

		PartDefinition cube_r302 = Neck5.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(29, 107).mirror().addBox(-1.171F, -0.1846F, -0.2157F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1766F, -0.1056F, -12.7092F, 1.4561F, -0.1227F, -0.0736F));

		PartDefinition cube_r303 = Neck5.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(117, 111).mirror().addBox(-1.3272F, -2.3958F, -1.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1766F, -0.9056F, -11.9093F, 1.4386F, -0.1227F, -0.0736F));

		PartDefinition cube_r304 = Neck5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(117, 107).mirror().addBox(-1.3272F, -2.3958F, -1.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1766F, -1.5056F, -15.4093F, 1.4386F, -0.1227F, -0.0736F));

		PartDefinition cube_r305 = Neck5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(106, 77).mirror().addBox(-1.3272F, -0.7622F, -1.176F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1766F, -1.5056F, -15.4093F, 1.3339F, -0.1227F, -0.0736F));

		PartDefinition cube_r306 = Neck5.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(112, 20).mirror().addBox(-1.2939F, -1.126F, -1.2118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -1.9806F, -16.5093F, 1.5536F, -0.0029F, -0.1658F));

		PartDefinition cube_r307 = Neck5.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-1.4826F, -1.1135F, -0.2141F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8766F, -1.9806F, -16.5093F, 1.5887F, -0.0325F, -0.9295F));

		PartDefinition cube_r308 = Neck5.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(117, 111).addBox(0.3272F, -2.3958F, -1.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1766F, -0.9056F, -11.9093F, 1.4386F, 0.1227F, 0.0736F));

		PartDefinition cube_r309 = Neck5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(29, 107).addBox(0.1709F, -0.1846F, -0.2157F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1766F, -0.1056F, -12.7092F, 1.4561F, 0.1227F, 0.0736F));

		PartDefinition cube_r310 = Neck5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(112, 23).addBox(-0.7061F, -1.126F, -1.2118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8766F, -1.5806F, -13.0093F, 1.5536F, 0.0029F, 0.1658F));

		PartDefinition cube_r311 = Neck5.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5174F, -1.1135F, -0.2141F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8766F, -1.5806F, -13.0093F, 1.5887F, 0.0325F, 0.9295F));

		PartDefinition cube_r312 = Neck5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(119, 19).addBox(-0.9584F, -0.7661F, -0.9831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6164F, -2.8174F, -14.2844F, 1.5207F, -0.4216F, -0.5924F));

		PartDefinition cube_r313 = Neck5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(48, 108).addBox(-0.39F, -1.6176F, 0.273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8766F, -1.3806F, -12.8092F, 1.5251F, -0.0293F, -0.6115F));

		PartDefinition cube_r314 = Neck5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(123, 38).addBox(-0.8766F, -1.633F, -0.8613F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8766F, -1.5806F, -12.8092F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r315 = Neck5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(86, 115).addBox(-0.8766F, -1.933F, -0.5613F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8766F, -1.7806F, -16.7092F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r316 = Neck5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(108, 43).addBox(-0.39F, -1.5175F, 0.273F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8766F, -1.7806F, -16.7092F, 1.5251F, -0.0293F, -0.6115F));

		PartDefinition cube_r317 = Neck5.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5174F, -1.1135F, -0.2141F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8766F, -1.9806F, -16.5093F, 1.5887F, 0.0325F, 0.9295F));

		PartDefinition cube_r318 = Neck5.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(112, 20).addBox(-0.7061F, -1.126F, -1.2118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8766F, -1.9806F, -16.5093F, 1.5536F, 0.0029F, 0.1658F));

		PartDefinition cube_r319 = Neck5.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(106, 77).addBox(0.3272F, -0.7622F, -1.176F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1766F, -1.5056F, -15.4093F, 1.3339F, 0.1227F, 0.0736F));

		PartDefinition cube_r320 = Neck5.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(117, 107).addBox(0.3272F, -2.3958F, -1.1146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1766F, -1.5056F, -15.4093F, 1.4386F, 0.1227F, 0.0736F));

		PartDefinition cube_r321 = Neck5.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(19, 36).addBox(-0.5F, -0.6F, -7.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.8701F, -10.9047F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9751F, -18.4895F, 0.0978F, 0.1804F, 0.2519F));

		PartDefinition cube_r322 = Neck6.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(57, 33).addBox(-0.5F, -0.6F, -5.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0289F, -0.1923F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r323 = Neck6.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(115, 28).mirror().addBox(-0.6668F, -1.7981F, 0.6035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0217F, -0.291F, -3.2573F, 1.5608F, 0.0043F, 0.6121F));

		PartDefinition cube_r324 = Neck6.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(7, 108).mirror().addBox(-0.5951F, -2.05F, 0.4161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9711F, 0.1065F, -0.9031F, 1.4534F, 0.0793F, 0.6077F));

		PartDefinition cube_r325 = Neck6.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(41, 108).mirror().addBox(-1.0138F, -1.1446F, -0.2234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9711F, -0.0935F, -0.9031F, 1.5363F, -0.1023F, -0.9259F));

		PartDefinition cube_r326 = Neck6.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(111, 92).mirror().addBox(-1.1826F, -1.1543F, -0.8192F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9711F, -0.0935F, -0.9031F, 1.4675F, -0.0173F, -0.1649F));

		PartDefinition cube_r327 = Neck6.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(117, 103).mirror().addBox(-1.4741F, -1.8852F, -1.0772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6711F, -0.2935F, -1.4031F, 1.3508F, -0.1286F, -0.0626F));

		PartDefinition cube_r328 = Neck6.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(106, 34).mirror().addBox(-1.4046F, -0.1394F, -0.5189F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6711F, 0.2065F, -1.7031F, 1.2461F, -0.1286F, -0.0626F));

		PartDefinition cube_r329 = Neck6.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(14, 113).mirror().addBox(-1.3544F, -0.1133F, -0.5488F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8217F, -0.191F, -4.0573F, 1.273F, -0.1194F, -0.0788F));

		PartDefinition cube_r330 = Neck6.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(117, 99).mirror().addBox(-1.1758F, -0.2049F, -0.4295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8217F, -0.191F, -5.5573F, 1.4824F, -0.1194F, -0.0788F));

		PartDefinition cube_r331 = Neck6.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(111, 89).mirror().addBox(-1.096F, -1.8446F, -0.5087F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0217F, -0.291F, -3.0573F, 1.5966F, 0.0043F, -0.1658F));

		PartDefinition cube_r332 = Neck6.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(108, 40).mirror().addBox(-0.5967F, -1.8857F, -0.0643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0217F, -0.291F, -3.0573F, 1.6148F, 0.0025F, -0.9299F));

		PartDefinition cube_r333 = Neck6.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(106, 34).addBox(0.4046F, -0.1394F, -0.5189F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6711F, 0.2065F, -1.7031F, 1.2461F, 0.1286F, 0.0626F));

		PartDefinition cube_r334 = Neck6.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(117, 103).addBox(0.4741F, -1.8852F, -1.0772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6711F, -0.2935F, -1.4031F, 1.3508F, 0.1286F, 0.0626F));

		PartDefinition cube_r335 = Neck6.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(111, 92).addBox(-0.8174F, -1.1543F, -0.8192F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9711F, -0.0935F, -0.9031F, 1.4675F, 0.0173F, 0.1649F));

		PartDefinition cube_r336 = Neck6.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(41, 108).addBox(-0.9862F, -1.1446F, -0.2234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9711F, -0.0935F, -0.9031F, 1.5363F, 0.1023F, 0.9259F));

		PartDefinition cube_r337 = Neck6.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(7, 108).addBox(-0.4049F, -2.05F, 0.4161F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9711F, 0.1065F, -0.9031F, 1.4534F, -0.0793F, -0.6077F));

		PartDefinition cube_r338 = Neck6.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(122, 105).addBox(0.0F, -0.5F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9962F, -0.5858F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r339 = Neck6.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(115, 40).addBox(-1.0217F, -1.7599F, -1.5979F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0217F, -0.291F, -3.2573F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r340 = Neck6.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(115, 28).addBox(-0.3332F, -1.7981F, 0.6035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0217F, -0.291F, -3.2573F, 1.5608F, -0.0043F, -0.6121F));

		PartDefinition cube_r341 = Neck6.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(108, 40).addBox(-1.4033F, -1.8857F, -0.0643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0217F, -0.291F, -3.0573F, 1.6148F, -0.0025F, 0.9299F));

		PartDefinition cube_r342 = Neck6.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(111, 89).addBox(-0.904F, -1.8446F, -0.5087F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0217F, -0.291F, -3.0573F, 1.5966F, -0.0043F, 0.1658F));

		PartDefinition cube_r343 = Neck6.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(117, 99).addBox(0.1758F, -0.2049F, -0.4295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8217F, -0.191F, -5.5573F, 1.4824F, 0.1194F, 0.0788F));

		PartDefinition cube_r344 = Neck6.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(14, 113).addBox(0.3544F, -0.1133F, -0.5488F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8217F, -0.191F, -4.0573F, 1.273F, 0.1194F, 0.0788F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7703F, -5.726F, 0.188F, -0.0036F, 0.2618F));

		PartDefinition cube_r345 = Neck7.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(115, 0).mirror().addBox(-0.3464F, -1.0982F, -0.0505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.741F, -3.4459F, 1.5107F, 0.0393F, 0.6111F));

		PartDefinition cube_r346 = Neck7.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(115, 4).mirror().addBox(-0.4125F, -0.7763F, 0.043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.3391F, -1.1765F, 1.4749F, 0.0643F, 0.6092F));

		PartDefinition cube_r347 = Neck7.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(19, 106).mirror().addBox(-1.4789F, -0.0187F, -0.7005F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5054F, 0.5609F, -0.5765F, 1.0091F, -0.1379F, -0.038F));

		PartDefinition cube_r348 = Neck7.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(34, 108).mirror().addBox(-1.1256F, -0.8851F, -0.5264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.2391F, -1.0765F, 1.5556F, -0.0821F, -0.9712F));

		PartDefinition cube_r349 = Neck7.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(19, 117).mirror().addBox(-1.294F, -0.2643F, -0.3629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5054F, 0.3609F, -1.9765F, 1.1662F, -0.1379F, -0.038F));

		PartDefinition cube_r350 = Neck7.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(112, 12).mirror().addBox(-0.7167F, -0.846F, -1.1227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9054F, -0.2391F, -1.0765F, 1.4933F, -0.0129F, -0.1653F));

		PartDefinition cube_r351 = Neck7.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(112, 12).addBox(-1.2833F, -0.846F, -1.1227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9054F, -0.2391F, -1.0765F, 1.4933F, 0.0129F, 0.1653F));

		PartDefinition cube_r352 = Neck7.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(19, 106).addBox(0.4789F, -0.0187F, -0.7005F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5054F, 0.5609F, -0.5765F, 1.0091F, 0.1379F, 0.038F));

		PartDefinition cube_r353 = Neck7.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(19, 117).addBox(0.294F, -0.2643F, -0.3629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5054F, 0.3609F, -1.9765F, 1.1662F, 0.1379F, 0.038F));

		PartDefinition cube_r354 = Neck7.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(34, 108).addBox(-0.8744F, -0.8851F, -0.5264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9054F, -0.2391F, -1.0765F, 1.5556F, 0.0821F, 0.9712F));

		PartDefinition cube_r355 = Neck7.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(95, 109).addBox(-0.9054F, -1.5285F, -0.3334F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.3391F, -1.1765F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r356 = Neck7.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(115, 4).addBox(-0.5875F, -0.7763F, 0.043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.3391F, -1.1765F, 1.4749F, -0.0643F, -0.6092F));

		PartDefinition cube_r357 = Neck7.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(115, 0).addBox(-0.6536F, -1.0982F, -0.0505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.741F, -3.4459F, 1.5107F, -0.0393F, -0.6111F));

		PartDefinition cube_r358 = Neck7.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(86, 92).addBox(-0.9054F, -1.3797F, -0.4275F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9054F, -0.741F, -3.4459F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Neck7.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(57, 41).addBox(-0.5F, -0.6F, -5.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0289F, -0.1923F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(12, 99).addBox(-1.5F, 0.4F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(99, 69).addBox(-1.5F, 0.4F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(103, 109).addBox(-1.0F, -0.1F, -4.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1323F, -6.8965F, 0.4098F, 0.0F, 0.0F));

		PartDefinition cube_r360 = Head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 111).addBox(-1.5F, -0.525F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -3.35F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(34, 111).addBox(-1.0F, -0.125F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.35F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(110, 110).addBox(-1.5F, -0.125F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.1608F, -4.7777F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r363 = Head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(110, 104).addBox(-1.5F, -0.525F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5F, 0.4023F, -4.7235F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(110, 107).addBox(-0.5F, -0.4F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(110, 101).addBox(-0.5F, -0.9F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.2909F, -5.1481F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(12, 110).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0F, 1.0557F, -6.2547F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(72, 88).addBox(-1.0F, -0.925F, -1.15F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(110, 9).addBox(-0.5F, -0.925F, -1.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5F, 1.7841F, -4.389F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(90, 81).addBox(-1.0F, -1.025F, -0.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 1.575F, -2.4F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(41, 111).addBox(-1.0F, -0.5F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -6.0054F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(90, 85).addBox(-1.0F, -0.65F, -2.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.575F, -2.4F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r370 = Head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(90, 34).addBox(-1.0F, -1.025F, -2.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 1.575F, -2.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(99, 53).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4F, -0.4F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(88, 53).addBox(-2.0F, -0.8F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5638F, 1.0827F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(92, 43).addBox(-2.0F, -1.2F, 0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(92, 0).addBox(-2.0F, -2.2F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(91, 16).addBox(-2.0F, -2.2F, -1.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(88, 71).addBox(-2.0F, 2.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.02F))
				.texOffs(33, 75).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -2.4594F, 0.0401F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(92, 38).addBox(-2.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0F, -0.9499F, -1.7704F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.35F, -2.7436F, -2.7262F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(104, 115).addBox(-0.625F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.75F, 1.8423F, -2.0267F, 0.2182F, 0.0F, -0.2182F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(109, 115).addBox(-0.625F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.75F, 1.8423F, -2.0267F, -0.0873F, 0.0F, -0.2182F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(99, 115).addBox(0.0F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.0F, 1.8423F, -2.0267F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(94, 115).addBox(0.0F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 1.8423F, -2.0267F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(117, 119).addBox(0.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.0F, 0.394F, -1.3563F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(119, 115).addBox(0.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.1746F, -1.1517F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(112, 119).addBox(0.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.0F, 0.0156F, -0.8973F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(120, 3).addBox(-0.6723F, -0.5F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.7F, 0.1462F, -0.7302F, 0.124F, 0.1732F, 0.0215F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(107, 119).addBox(0.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -0.5996F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(120, 0).addBox(-0.8208F, -0.5F, -0.7129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.95F, 0.1347F, -0.2772F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(102, 119).addBox(0.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.0F, -0.0157F, -0.2996F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(114, 115).addBox(-0.6F, -0.275F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.6F, 0.6525F, -1.3715F, -0.3908F, -0.04F, -0.0968F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(89, 114).addBox(0.0F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 1.934F, -1.74F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(5, 120).addBox(-0.7959F, -0.5F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 120).addBox(-0.6959F, -0.5F, -0.5379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.85F, 0.1419F, -0.1577F, -0.0536F, 0.2179F, -0.0116F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(91, 101).addBox(0.15F, -0.95F, 1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.15F, 0.2436F, -2.0738F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(103, 101).addBox(0.0356F, -0.5F, -0.8599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.35F, 0.2606F, 0.6141F, -0.1855F, 0.3435F, -0.0631F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.6703F, 0.043F, -0.0439F, -0.1755F, 0.1031F, -0.0182F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(103, 10).addBox(-0.55F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 3.24F, -1.0128F, 0.2111F, 0.1254F, -0.2765F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(118, 87).addBox(-0.1F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.25F, 3.2801F, -2.7704F, 0.4001F, -0.5068F, 0.9332F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(118, 90).addBox(0.2F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(86, 118).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.25F, 3.0203F, -2.4662F, 0.4963F, -0.5939F, 0.9117F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(114, 61).addBox(-0.7536F, -0.2754F, -0.3358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.4F, 1.5643F, 0.0496F, -0.8075F, 0.1248F, -0.2555F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(114, 57).addBox(-0.7536F, -0.1496F, -0.3473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.4F, 1.5643F, 0.0496F, -0.5021F, 0.1248F, -0.2555F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(118, 76).addBox(-0.5F, -1.4784F, -0.0572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1F, 1.4643F, 0.0496F, 0.0652F, 0.1248F, -0.3079F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(114, 53).addBox(-0.5F, -1.3756F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.1F, 1.4643F, 0.0496F, -0.2403F, 0.1248F, -0.3079F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(119, 12).addBox(0.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(102, 122).addBox(-0.65F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.25F, 4.624F, -2.8826F, 0.1509F, 0.5187F, 0.0752F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(122, 99).addBox(0.9F, -0.85F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.15F, 4.8046F, -1.5728F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(120, 50).addBox(0.5F, -0.525F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.375F, 2.7255F, 1.6772F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(120, 42).addBox(0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4F, 2.2996F, 2.7836F, 2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(29, 116).addBox(0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.625F, 2.1464F, 3.3274F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(24, 116).addBox(0.5F, -1.1F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.625F, 2.1464F, 3.3274F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(121, 82).addBox(0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.525F, 2.6164F, 3.1297F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(121, 79).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.525F, 2.6164F, 3.1297F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(120, 70).addBox(0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.475F, 3.7388F, 2.7976F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(120, 67).addBox(0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.475F, 3.1576F, 2.7444F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(39, 120).addBox(0.5F, -0.975F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.375F, 1.3691F, 3.1501F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(85, 121).addBox(-0.25F, -0.65F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(120, 73).addBox(-0.45F, -0.65F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.375F, 1.4244F, 1.9532F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(34, 120).addBox(0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4F, 0.4703F, 2.7118F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(120, 28).addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(24, 120).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.75F, 4.1582F, -2.7337F, 0.0611F, 0.5402F, 0.0314F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(29, 120).addBox(0.5F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.375F, 0.4878F, 1.7119F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(0, 116).addBox(0.5F, -1.075F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.375F, 1.6445F, 1.2302F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.35F, -2.7436F, -2.7262F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(104, 115).mirror().addBox(-0.375F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 1.8423F, -2.0267F, 0.2182F, 0.0F, 0.2182F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(109, 115).mirror().addBox(-0.375F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 1.8423F, -2.0267F, -0.0873F, 0.0F, 0.2182F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(99, 115).mirror().addBox(-1.0F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8423F, -2.0267F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(94, 115).mirror().addBox(-1.0F, -0.35F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8423F, -2.0267F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(117, 119).mirror().addBox(-1.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.394F, -1.3563F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(119, 115).mirror().addBox(-1.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1746F, -1.1517F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(112, 119).mirror().addBox(-1.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0156F, -0.8973F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(120, 3).mirror().addBox(-0.3277F, -0.5F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1462F, -0.7302F, 0.124F, -0.1732F, -0.0215F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(107, 119).mirror().addBox(-1.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -0.5996F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-0.1791F, -0.5F, -0.7129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 0.1347F, -0.2772F, -0.0179F, -0.2181F, 0.0039F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(102, 119).mirror().addBox(-1.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0157F, -0.2996F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(114, 115).mirror().addBox(-0.4F, -0.275F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.6525F, -1.3715F, -0.3908F, 0.04F, 0.0968F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(89, 114).mirror().addBox(-1.0F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.934F, -1.74F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(5, 120).mirror().addBox(-0.2041F, -0.5F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 120).mirror().addBox(-0.3042F, -0.5F, -0.5379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 0.1419F, -0.1577F, -0.0536F, -0.2179F, 0.0116F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(91, 101).mirror().addBox(-1.15F, -0.95F, 1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.2436F, -2.0738F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(103, 101).mirror().addBox(-1.0355F, -0.5F, -0.8599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.2606F, 0.6141F, -0.1855F, -0.3435F, 0.0631F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.6703F, 0.043F, -0.0439F, -0.1755F, -0.1031F, 0.0182F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(103, 10).mirror().addBox(-0.45F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 3.24F, -1.0128F, 0.2111F, -0.1254F, 0.2765F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(118, 87).mirror().addBox(-0.9F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 3.2801F, -2.7704F, 0.4001F, 0.5068F, -0.9332F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(118, 90).mirror().addBox(-1.2F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(86, 118).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 3.0203F, -2.4662F, 0.4963F, 0.5939F, -0.9117F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(114, 61).mirror().addBox(-0.2464F, -0.2754F, -0.3358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5643F, 0.0496F, -0.8075F, -0.1248F, 0.2555F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(114, 57).mirror().addBox(-0.2464F, -0.1496F, -0.3473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5643F, 0.0496F, -0.5021F, -0.1248F, 0.2555F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(118, 76).mirror().addBox(-0.5F, -1.4784F, -0.0572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.4643F, 0.0496F, 0.0652F, -0.1248F, 0.3079F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(114, 53).mirror().addBox(-0.5F, -1.3756F, -0.3118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.4643F, 0.0496F, -0.2403F, -0.1248F, 0.3079F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(119, 12).mirror().addBox(-1.0F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(102, 122).mirror().addBox(-0.35F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 4.624F, -2.8826F, 0.1509F, -0.5187F, -0.0752F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(122, 99).mirror().addBox(-1.9F, -0.85F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.15F, 4.8046F, -1.5728F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(120, 50).mirror().addBox(-1.5F, -0.525F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 2.7255F, 1.6772F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(120, 42).mirror().addBox(-1.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.2996F, 2.7836F, 2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(29, 116).mirror().addBox(-1.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 2.1464F, 3.3274F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(24, 116).mirror().addBox(-1.5F, -1.1F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 2.1464F, 3.3274F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(121, 82).mirror().addBox(-1.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 2.6164F, 3.1297F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(121, 79).mirror().addBox(-1.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 2.6164F, 3.1297F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(120, 70).mirror().addBox(-1.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 3.7388F, 2.7976F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(120, 67).mirror().addBox(-1.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 3.1576F, 2.7444F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(39, 120).mirror().addBox(-1.5F, -0.975F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 1.3691F, 3.1501F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(85, 121).mirror().addBox(-0.75F, -0.65F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(120, 73).mirror().addBox(-0.55F, -0.65F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 1.4244F, 1.9532F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(34, 120).mirror().addBox(-1.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, 2.7118F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(120, 28).mirror().addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(24, 120).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 4.1582F, -2.7337F, 0.0611F, -0.5402F, -0.0314F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(29, 120).mirror().addBox(-1.5F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.4878F, 1.7119F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(-1.5F, -1.075F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 1.6445F, 1.2302F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2172F, 0.5427F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(121, 96).mirror().addBox(-2.5F, -0.1F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(121, 93).mirror().addBox(-2.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(121, 96).addBox(-0.35F, -0.1F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(121, 93).addBox(-0.35F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.425F, -0.8212F, -1.7804F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(35, 104).mirror().addBox(-2.5F, -0.1F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(35, 104).addBox(-0.35F, -0.1F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.425F, -0.0212F, -0.3947F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(122, 9).mirror().addBox(-0.1F, 0.075F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(122, 6).mirror().addBox(-0.1F, -0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(122, 9).addBox(2.05F, 0.075F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(122, 6).addBox(2.05F, -0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.975F, -0.4829F, -3.9517F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r461 = Jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(122, 31).mirror().addBox(-0.1F, 0.0136F, -0.9151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(122, 15).mirror().addBox(-0.1F, 0.0136F, -1.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.975F, -0.4829F, -4.7517F, 0.3198F, -0.227F, -0.0865F));

		PartDefinition cube_r462 = Jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(97, 122).mirror().addBox(-0.1F, -0.1554F, -0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8609F, -0.8794F, -5.3918F, 0.0057F, -0.3143F, -0.087F));

		PartDefinition cube_r463 = Jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(49, 122).mirror().addBox(-0.1F, -0.4554F, -0.8953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.975F, -0.4829F, -4.7517F, -0.1253F, -0.227F, -0.0865F));

		PartDefinition cube_r464 = Jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(44, 122).mirror().addBox(-0.1F, -0.4079F, -0.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(44, 122).addBox(2.05F, -0.4079F, -0.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.975F, -0.4829F, -3.9517F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r465 = Jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(54, 122).mirror().addBox(-0.1F, -0.1209F, -0.9234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(10, 122).mirror().addBox(-0.1F, -0.1209F, -1.7234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.975F, -0.4829F, -4.7517F, 0.058F, -0.227F, -0.0865F));

		PartDefinition cube_r466 = Jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(49, 104).mirror().addBox(-2.5F, -0.1F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.087F)).mirror(false)
				.texOffs(49, 104).addBox(-0.35F, -0.1F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.087F)), PartPose.offsetAndRotation(1.425F, -0.4142F, -2.8288F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(42, 104).mirror().addBox(-2.5F, -0.9F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(42, 104).addBox(-0.35F, -0.9F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.425F, 0.6189F, -2.2576F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(56, 92).mirror().addBox(-2.5F, -0.2F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.094F)).mirror(false)
				.texOffs(56, 92).addBox(-0.35F, -0.2F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(1.425F, 0.0F, -1.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r469 = Jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(122, 31).addBox(-0.9F, 0.0136F, -0.9151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(122, 15).addBox(-0.9F, 0.0136F, -1.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.975F, -0.4829F, -4.7517F, 0.3198F, 0.227F, 0.0865F));

		PartDefinition cube_r470 = Jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(109, 95).addBox(-1.975F, -1.9113F, -1.8098F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.475F, -0.4829F, -3.9517F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r471 = Jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(97, 122).addBox(-0.9F, -0.1554F, -0.9953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8609F, -0.8794F, -5.3918F, 0.0057F, 0.3143F, 0.087F));

		PartDefinition cube_r472 = Jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(49, 122).addBox(-0.9F, -0.4554F, -0.8953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.975F, -0.4829F, -4.7517F, -0.1253F, 0.227F, 0.0865F));

		PartDefinition cube_r473 = Jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(109, 98).addBox(-1.975F, -0.6914F, -2.5229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.475F, -0.4829F, -3.9517F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r474 = Jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(108, 73).addBox(-1.975F, -0.2827F, -2.5131F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.475F, -0.4829F, -3.9517F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r475 = Jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(54, 122).addBox(-0.9F, -0.1209F, -0.9234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F))
				.texOffs(10, 122).addBox(-0.9F, -0.1209F, -1.7234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.975F, -0.4829F, -4.7517F, 0.058F, 0.227F, 0.0865F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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