package fossils.fossils.client.blockentity.model.moschops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MoschopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm7;
	private final ModelPart rightArm6;

	public MoschopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body2 = this.Bodymiddle.getChild("body2");
		this.body = this.body2.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.head = this.Neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftarm = this.Bodyfront.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.Bodyfront.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.leftLeg = this.Hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.rightLeg = this.Hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm7 = this.rightLeg3.getChild("rightArm7");
		this.rightArm6 = this.rightArm7.getChild("rightArm6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0766F, 13.3358F, -0.3419F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(51, 98).addBox(0.0F, -1.9666F, 0.0589F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, 0.2873F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(98, 52).addBox(0.0F, -1.9005F, -0.0005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -1.7127F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(63, 98).addBox(0.0F, -1.8146F, -0.0095F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6373F, -3.8127F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(93, 53).mirror().addBox(-0.7355F, -7.3761F, 0.7932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 3.1025F, 0.0719F, -0.5407F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(63, 21).mirror().addBox(0.0657F, -1.4114F, 1.1818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, -1.3788F, 0.0F, -0.2618F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(0.0657F, -0.765F, 0.6874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, -0.9425F, 0.0F, -0.2618F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(82, 15).mirror().addBox(0.0657F, -0.2372F, -0.0191F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, -0.3316F, 0.0F, -0.2618F));

		PartDefinition Hips_r8 = Hips.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(0.0657F, 0.6908F, -2.0988F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, -0.1134F, 0.0F, -0.2618F));

		PartDefinition Hips_r9 = Hips.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(47, 11).mirror().addBox(-1.2001F, -0.7637F, -3.6237F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(47, 11).addBox(4.5999F, -0.7637F, -3.6237F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.1999F, -1.4427F, 1.2793F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = Hips.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(26, 64).mirror().addBox(-0.7355F, 1.9537F, -3.658F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 0.4845F, 0.0719F, -0.5407F));

		PartDefinition Hips_r11 = Hips.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(-0.7355F, -1.6863F, -6.2744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(43, 62).mirror().addBox(-0.7355F, -0.8863F, -6.2744F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 1.5754F, 0.0719F, -0.5407F));

		PartDefinition Hips_r12 = Hips.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(94, 37).mirror().addBox(-0.7355F, -4.5034F, -5.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 2.2735F, 0.0719F, -0.5407F));

		PartDefinition Hips_r13 = Hips.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(33, 98).mirror().addBox(-0.7355F, -2.3508F, -6.6332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 1.7499F, 0.0719F, -0.5407F));

		PartDefinition Hips_r14 = Hips.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(-0.7355F, -6.3506F, -2.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 2.5353F, 0.0719F, -0.5407F));

		PartDefinition Hips_r15 = Hips.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(13, 97).mirror().addBox(-0.5F, -0.996F, 0.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(13, 97).addBox(5.3F, -0.996F, 0.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.9F, -1.9041F, -4.6744F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Hips_r16 = Hips.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-0.5F, -1.0213F, -0.0197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(63, 75).addBox(5.3F, -1.0213F, -0.0197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.9F, -1.1541F, -3.9744F, 0.7156F, 0.0F, 0.0F));

		PartDefinition Hips_r17 = Hips.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(-0.5F, -0.9849F, -0.9876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(89, 43).addBox(5.3F, -0.9849F, -0.9876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9F, -3.2199F, -3.0639F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r18 = Hips.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-0.5F, -1.0498F, 0.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(69, 28).addBox(5.3F, -1.0498F, 0.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.9F, -0.6541F, -3.0744F, 1.1083F, 0.0F, 0.0F));

		PartDefinition Hips_r19 = Hips.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.5F, -0.0407F, -1.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(30, 89).addBox(5.3F, -0.0407F, -1.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.9F, -3.1108F, 0.9866F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r20 = Hips.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-1.0849F, -2.59F, -1.195F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(84, 71).addBox(4.7151F, -2.59F, -1.195F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.3151F, -0.5251F, -0.8095F, -1.0734F, 0.0F, 0.0F));

		PartDefinition Hips_r21 = Hips.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(35, 89).addBox(5.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.9F, -2.5108F, 1.0866F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Hips_r22 = Hips.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(61, 90).mirror().addBox(-2.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(61, 90).addBox(3.3F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9F, -2.2214F, -0.7317F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Hips_r23 = Hips.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(73, 38).addBox(5.3F, -0.4F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.9F, -1.3542F, -2.6744F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r24 = Hips.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(86, 93).mirror().addBox(-0.5F, -0.825F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(86, 93).addBox(5.3F, -0.825F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.9F, -2.6298F, -3.548F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Hips_r25 = Hips.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(89, 40).addBox(5.3F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.9F, -2.6949F, -2.6639F, 1.3265F, 0.0F, 0.0F));

		PartDefinition Hips_r26 = Hips.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.7355F, -0.2555F, -6.4115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 1.7935F, 0.0719F, -0.5407F));

		PartDefinition Hips_r27 = Hips.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.7355F, -0.5383F, -6.6303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 2.1426F, 0.0719F, -0.5407F));

		PartDefinition Hips_r28 = Hips.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(88, 53).mirror().addBox(-0.7355F, 3.7319F, -3.6319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 1.3572F, 0.0719F, -0.5407F));

		PartDefinition Hips_r29 = Hips.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-0.7355F, 3.221F, -3.3881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 1.0518F, 0.0719F, -0.5407F));

		PartDefinition Hips_r30 = Hips.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(62, 47).mirror().addBox(-0.7355F, 2.497F, -1.9504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, 0.6591F, 0.0719F, -0.5407F));

		PartDefinition Hips_r31 = Hips.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-0.7355F, 2.7059F, 0.1095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.6427F, 0.3793F, -0.2572F, 0.0719F, -0.5407F));

		PartDefinition Hips_r32 = Hips.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(45, 23).mirror().addBox(-1.0849F, -2.5917F, -1.86F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(45, 23).addBox(4.7151F, -2.5917F, -1.86F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-2.3151F, -0.5251F, -0.8095F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r33 = Hips.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-2.5F, -0.1F, -3.9F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 25).addBox(0.5F, -0.1F, -3.9F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-0.5F, -0.5F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r34 = Hips.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(33, 66).addBox(-0.2645F, -1.6863F, -6.2744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(43, 62).addBox(-0.2645F, -0.8863F, -6.2744F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 1.5754F, -0.0719F, 0.5407F));

		PartDefinition Hips_r35 = Hips.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(25, 94).addBox(-0.2645F, -6.3506F, -2.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 2.5353F, -0.0719F, 0.5407F));

		PartDefinition Hips_r36 = Hips.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(94, 37).addBox(-0.2645F, -4.5034F, -5.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 2.2735F, -0.0719F, 0.5407F));

		PartDefinition Hips_r37 = Hips.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(33, 98).addBox(-0.2645F, -2.3508F, -6.6332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 1.7499F, -0.0719F, 0.5407F));

		PartDefinition Hips_r38 = Hips.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(93, 53).addBox(-0.2645F, -7.3761F, 0.7932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 3.1025F, -0.0719F, 0.5407F));

		PartDefinition Hips_r39 = Hips.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(14, 63).addBox(-0.2645F, -0.2555F, -6.4115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 1.7935F, -0.0719F, 0.5407F));

		PartDefinition Hips_r40 = Hips.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(85, 0).addBox(-0.2645F, -0.5383F, -6.6303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 2.1426F, -0.0719F, 0.5407F));

		PartDefinition Hips_r41 = Hips.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(88, 53).addBox(-0.2645F, 3.7319F, -3.6319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 1.3572F, -0.0719F, 0.5407F));

		PartDefinition Hips_r42 = Hips.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(63, 60).addBox(-0.2645F, 3.221F, -3.3881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 1.0518F, -0.0719F, 0.5407F));

		PartDefinition Hips_r43 = Hips.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(62, 47).addBox(-0.2645F, 2.497F, -1.9504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 0.6591F, -0.0719F, 0.5407F));

		PartDefinition Hips_r44 = Hips.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(26, 64).addBox(-0.2645F, 1.9537F, -3.658F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, 0.4845F, -0.0719F, 0.5407F));

		PartDefinition Hips_r45 = Hips.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(50, 64).addBox(-0.2645F, 2.7059F, 0.1095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, -0.2572F, -0.0719F, 0.5407F));

		PartDefinition Hips_r46 = Hips.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(63, 21).addBox(-1.0657F, -1.4114F, 1.1818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, -1.3788F, 0.0F, 0.2618F));

		PartDefinition Hips_r47 = Hips.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(84, 75).addBox(-1.0657F, -0.765F, 0.6874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, -0.9425F, 0.0F, 0.2618F));

		PartDefinition Hips_r48 = Hips.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(82, 15).addBox(-1.0657F, -0.2372F, -0.0191F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, -0.3316F, 0.0F, 0.2618F));

		PartDefinition Hips_r49 = Hips.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0657F, 0.6908F, -2.0988F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.5F, -0.6427F, 0.3793F, -0.1134F, 0.0F, 0.2618F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.1241F, -0.0866F, -0.0108F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(17, 23).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(66, 98).addBox(0.0F, -2.1281F, 1.979F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 98).addBox(0.0F, -2.0281F, -0.021F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7936F, -2.7841F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(72, 98).addBox(0.0F, -2.1204F, -0.0659F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8936F, -4.9841F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(85, 4).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8936F, -2.2841F, -0.0203F, -0.0339F, -0.3035F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8936F, -2.2841F, 0.0035F, -0.0635F, -0.7831F));

		PartDefinition Bodymiddle_r6 = Bodymiddle.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(84, 79).mirror().addBox(-5.92F, -2.9517F, -0.3457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8936F, -2.2841F, 0.0384F, -0.0788F, -1.2641F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1936F, -4.4841F, 0.1216F, 0.0087F, -0.1829F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(76, 2).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1936F, -4.4841F, 0.1098F, 0.0397F, -0.6621F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(76, 4).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1936F, -4.4841F, 0.085F, 0.0618F, -1.1422F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(-5.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1936F, -4.4841F, 0.0435F, 0.0694F, -1.7543F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(85, 4).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8936F, -2.2841F, -0.0203F, 0.0339F, 0.3035F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(70, 24).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8936F, -2.2841F, 0.0035F, 0.0635F, 0.7831F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(84, 79).addBox(3.92F, -2.9517F, -0.3457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8936F, -2.2841F, 0.0384F, 0.0788F, 1.2641F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(88, 68).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1936F, -4.4841F, 0.1216F, -0.0087F, 0.1829F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(76, 2).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1936F, -4.4841F, 0.1098F, -0.0397F, 0.6621F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(76, 4).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1936F, -4.4841F, 0.085F, -0.0618F, 1.1422F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(88, 81).addBox(3.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1936F, -4.4841F, 0.0435F, -0.0694F, 1.7543F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1026F, -5.9083F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Bodymiddle_r18 = body2.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(58, 89).addBox(0.0F, -2.2957F, -0.0065F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r19 = body2.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(67, 93).addBox(0.0F, -2.695F, -0.1089F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r20 = body2.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(54, 26).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -0.5986F, -0.0055F, 0.1179F, -1.8562F));

		PartDefinition Bodymiddle_r21 = body2.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -0.5986F, 0.073F, 0.1296F, -1.2406F));

		PartDefinition Bodymiddle_r22 = body2.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -0.5986F, 0.1307F, 0.1053F, -0.7578F));

		PartDefinition Bodymiddle_r23 = body2.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(65, 58).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -0.5986F, 0.1703F, 0.0573F, -0.2786F));

		PartDefinition Bodymiddle_r24 = body2.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(22, 47).mirror().addBox(-8.8427F, -7.3717F, -0.1148F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -2.5986F, 0.0328F, 0.1736F, -1.7643F));

		PartDefinition Bodymiddle_r25 = body2.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -2.5986F, 0.1367F, 0.153F, -1.1453F));

		PartDefinition Bodymiddle_r26 = body2.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(65, 12).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -2.5986F, 0.1978F, 0.0968F, -0.6647F));

		PartDefinition Bodymiddle_r27 = body2.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(57, 65).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -2.5986F, 0.2258F, 0.0191F, -0.1902F));

		PartDefinition Bodymiddle_r28 = body2.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(36, 9).mirror().addBox(-9.8427F, -7.3717F, -0.1147F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -4.5986F, 0.0289F, 0.217F, -1.7302F));

		PartDefinition Bodymiddle_r29 = body2.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -4.5986F, 0.1592F, 0.1906F, -1.1065F));

		PartDefinition Bodymiddle_r30 = body2.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -4.5986F, 0.235F, 0.1199F, -0.6258F));

		PartDefinition Bodymiddle_r31 = body2.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2661F, -4.5986F, 0.2693F, 0.0228F, -0.1543F));

		PartDefinition Bodymiddle_r32 = body2.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(65, 58).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -0.5986F, 0.1823F, -0.0153F, 0.2782F));

		PartDefinition Bodymiddle_r33 = body2.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(65, 14).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -0.5986F, 0.1607F, -0.0736F, 0.7551F));

		PartDefinition Bodymiddle_r34 = body2.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(57, 67).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -0.5986F, 0.1145F, -0.1153F, 1.2355F));

		PartDefinition Bodymiddle_r35 = body2.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(54, 26).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -0.5986F, 0.0367F, -0.1301F, 1.851F));

		PartDefinition Bodymiddle_r36 = body2.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(57, 65).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -2.5986F, 0.2258F, -0.0191F, 0.1902F));

		PartDefinition Bodymiddle_r37 = body2.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(65, 12).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -2.5986F, 0.1978F, -0.0968F, 0.6647F));

		PartDefinition Bodymiddle_r38 = body2.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(40, 67).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -2.5986F, 0.1367F, -0.153F, 1.1453F));

		PartDefinition Bodymiddle_r39 = body2.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(22, 47).addBox(3.8427F, -7.3717F, -0.1148F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -2.5986F, 0.0328F, -0.1736F, 1.7643F));

		PartDefinition Bodymiddle_r40 = body2.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(65, 56).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -4.5986F, 0.2693F, -0.0228F, 0.1543F));

		PartDefinition Bodymiddle_r41 = body2.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(65, 10).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -4.5986F, 0.235F, -0.1199F, 0.6258F));

		PartDefinition Bodymiddle_r42 = body2.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(67, 18).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -4.5986F, 0.1592F, -0.1906F, 1.1065F));

		PartDefinition Bodymiddle_r43 = body2.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(36, 9).addBox(3.8427F, -7.3717F, -0.1147F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2661F, -4.5986F, 0.0289F, -0.217F, 1.7302F));

		PartDefinition Bodymiddle_r44 = body2.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(90, 29).addBox(0.0F, -3.0325F, -0.119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r45 = body2.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(17, 11).addBox(-0.5F, -0.0911F, -5.9758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4F, -6.0F));

		PartDefinition Bodymiddle_r46 = body.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(0, 94).addBox(0.0F, -2.6882F, 0.0368F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r47 = body.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(17, 35).mirror().addBox(-10.8427F, -7.3717F, -0.1147F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -0.4986F, 0.0257F, 0.2518F, -1.7309F));

		PartDefinition Bodymiddle_r48 = body.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(67, 16).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -0.4986F, 0.1774F, 0.2206F, -1.1028F));

		PartDefinition Bodymiddle_r49 = body.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -0.4986F, 0.265F, 0.1383F, -0.6219F));

		PartDefinition Bodymiddle_r50 = body.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(65, 54).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -0.4986F, 0.3041F, 0.0257F, -0.1535F));

		PartDefinition Bodymiddle_r51 = body.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(65, 52).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -2.4986F, 0.3302F, 0.0279F, -0.1179F));

		PartDefinition Bodymiddle_r52 = body.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -2.4986F, 0.2875F, 0.152F, -0.5838F));

		PartDefinition Bodymiddle_r53 = body.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -2.4986F, 0.1912F, 0.2431F, -1.0647F));

		PartDefinition Bodymiddle_r54 = body.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-10.8427F, -7.3717F, -0.1147F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -2.4986F, 0.0232F, 0.2779F, -1.6966F));

		PartDefinition Bodymiddle_r55 = body.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(65, 54).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -0.4986F, 0.3041F, -0.0257F, 0.1535F));

		PartDefinition Bodymiddle_r56 = body.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(65, 8).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -0.4986F, 0.265F, -0.1383F, 0.6219F));

		PartDefinition Bodymiddle_r57 = body.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(67, 16).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -0.4986F, 0.1774F, -0.2206F, 1.1028F));

		PartDefinition Bodymiddle_r58 = body.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(17, 35).addBox(3.8427F, -7.3717F, -0.1147F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -0.4986F, 0.0257F, -0.2518F, 1.7309F));

		PartDefinition Bodymiddle_r59 = body.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(65, 52).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -2.4986F, 0.325F, -0.0712F, 0.1181F));

		PartDefinition Bodymiddle_r60 = body.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(64, 41).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -2.4986F, 0.263F, -0.1883F, 0.5879F));

		PartDefinition Bodymiddle_r61 = body.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(67, 6).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -2.4986F, 0.1517F, -0.264F, 1.0746F));

		PartDefinition Bodymiddle_r62 = body.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(0, 35).addBox(3.8427F, -7.3717F, -0.1147F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -2.4986F, -0.0217F, -0.2721F, 1.7089F));

		PartDefinition Bodymiddle_r63 = body.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(91, 93).addBox(0.0F, -2.755F, -0.0635F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r64 = body.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.0056F, -3.9631F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(61, 93).addBox(0.0F, -2.8936F, -5.0725F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8881F, -3.8889F, -0.0221F, -0.0872F, 0.0019F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(47, 87).addBox(0.0F, -2.7734F, -0.0687F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6732F, -0.957F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(64, 93).addBox(0.0F, -2.648F, 0.0242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4982F, -3.107F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(55, 89).addBox(0.0F, -2.5826F, 0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -7.032F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(25, 60).mirror().addBox(-2.0528F, 0.4425F, 0.9596F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.48F, 9.6656F, -6.1938F, 0.0248F, -0.112F, 1.0022F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.8277F, 0.2553F, -2.0336F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.48F, 9.6656F, -6.1938F, 0.0131F, 0.0596F, 0.7854F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(32, 11).mirror().addBox(-3.1099F, 0.4159F, -2.2445F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.48F, 9.6656F, -6.1938F, 0.0265F, 0.3678F, 1.0144F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(22, 43).mirror().addBox(-1.0F, -0.5F, -1.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 10.1494F, -8.525F, -0.7132F, 0.3751F, -0.3069F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(12, 82).mirror().addBox(-2.8436F, 1.5246F, -0.477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 0.7409F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-1.7824F, -0.7521F, -1.8976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.6658F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(-1.7824F, -1.2748F, 3.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.9799F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(95, 49).mirror().addBox(-1.7824F, -1.9433F, 2.1924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(44, 37).mirror().addBox(-1.7824F, -0.5434F, 0.2886F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.7617F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-1.7824F, -0.6017F, 0.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 2.2853F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r13 = Bodyfront.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-1.7824F, -0.7924F, 2.3158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.2381F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r14 = Bodyfront.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.7824F, -0.1803F, 0.4365F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 2.2068F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r15 = Bodyfront.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-1.7824F, -1.4754F, 2.2324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.6832F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r16 = Bodyfront.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-1.7824F, -0.1092F, 2.3127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.6308F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r17 = Bodyfront.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(38, 53).mirror().addBox(-1.7824F, -0.3652F, -0.3094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(29, 53).mirror().addBox(-1.7824F, 0.0348F, 1.1906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.4912F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r18 = Bodyfront.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-1.9F, -1.1316F, -3.0225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 2.002F, -0.0758F, 0.1247F));

		PartDefinition Bodyfront_r19 = Bodyfront.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-2.8436F, 0.4746F, -3.1908F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.1336F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r20 = Bodyfront.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-2.8436F, -1.3551F, -3.4005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.7008F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r21 = Bodyfront.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-1.9F, -0.336F, -2.8318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.3126F, -0.0758F, 0.1247F));

		PartDefinition Bodyfront_r22 = Bodyfront.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(54, 71).mirror().addBox(-1.7824F, -0.9363F, -1.167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.9247F, 3.1973F, -6.397F, 1.8926F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r23 = Bodyfront.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(36, 4).mirror().addBox(-2.35F, -0.5F, -1.35F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.9459F, 11.3546F, -4.7332F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition Bodyfront_r24 = Bodyfront.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-0.3432F, 0.5324F, -2.0203F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.48F, 9.6656F, -6.1938F, -0.1789F, 0.4468F, 0.7171F));

		PartDefinition Bodyfront_r25 = Bodyfront.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(76, 28).mirror().addBox(-0.3453F, 0.6457F, -2.2298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.48F, 9.6656F, -6.1938F, -0.3147F, 0.6919F, 0.5891F));

		PartDefinition Bodymiddle_r65 = Bodyfront.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, 0.5088F, 0.0606F, -0.1863F));

		PartDefinition Bodymiddle_r66 = Bodyfront.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(49, 69).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, 0.4366F, 0.2599F, -0.6295F));

		PartDefinition Bodymiddle_r67 = Bodyfront.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-6.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, 0.2748F, 0.4064F, -1.1143F));

		PartDefinition Bodymiddle_r68 = Bodyfront.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-6.9732F, -6.3816F, -0.1665F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, -0.0153F, 0.4557F, -1.7869F));

		PartDefinition Bodymiddle_r69 = Bodyfront.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.3506F, 0.1835F, -0.5644F));

		PartDefinition Bodymiddle_r70 = Bodyfront.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(88, 51).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.4F, 0.0284F, -0.1071F));

		PartDefinition Bodymiddle_r71 = Bodyfront.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(74, 26).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.2334F, 0.2998F, -1.0446F));

		PartDefinition Bodymiddle_r72 = Bodyfront.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-8.9732F, -6.3816F, -0.1665F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.022F, 0.3476F, -1.6882F));

		PartDefinition Bodymiddle_r73 = Bodyfront.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(47, 29).mirror().addBox(-8.8427F, -7.3717F, -0.1148F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.0038F, 0.3459F, -1.7627F));

		PartDefinition Bodymiddle_r74 = Bodyfront.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.2179F, 0.3088F, -1.1175F));

		PartDefinition Bodymiddle_r75 = Bodyfront.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.3416F, 0.1983F, -0.6344F));

		PartDefinition Bodymiddle_r76 = Bodyfront.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.3985F, 0.0456F, -0.1754F));

		PartDefinition Bodymiddle_r77 = Bodyfront.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(32, 17).mirror().addBox(-10.8427F, -7.3717F, -0.1147F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, -0.0248F, 0.2997F, -1.676F));

		PartDefinition Bodymiddle_r78 = Bodyfront.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(67, 4).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, 0.1663F, 0.2879F, -1.0369F));

		PartDefinition Bodymiddle_r79 = Bodyfront.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, 0.287F, 0.2029F, -0.5495F));

		PartDefinition Bodymiddle_r80 = Bodyfront.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, 0.3527F, 0.0735F, -0.0824F));

		PartDefinition Bodyfront_r26 = Bodyfront.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(0, 43).addBox(0.7824F, -0.1803F, 0.4365F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 2.2068F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r27 = Bodyfront.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(21, 73).addBox(0.7824F, -1.4754F, 2.2324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.6832F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r28 = Bodyfront.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(44, 37).addBox(0.7824F, -0.5434F, 0.2886F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F))
				.texOffs(95, 49).addBox(0.7824F, -1.9433F, 2.1924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.7617F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r29 = Bodyfront.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(69, 0).addBox(0.7824F, -0.7924F, 2.3158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.2381F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r30 = Bodyfront.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(14, 72).addBox(0.7824F, -0.1092F, 2.3127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.6308F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r31 = Bodyfront.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(38, 53).addBox(0.7824F, -0.3652F, -0.3094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F))
				.texOffs(29, 53).addBox(0.7824F, 0.0348F, 1.1906F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.4912F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r32 = Bodyfront.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(7, 63).addBox(0.9F, -1.1316F, -3.0225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 2.002F, 0.0758F, -0.1247F));

		PartDefinition Bodyfront_r33 = Bodyfront.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(44, 47).addBox(0.7824F, -0.7521F, -1.8976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.6658F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r34 = Bodyfront.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(12, 82).addBox(1.8436F, 1.5246F, -0.477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 0.7409F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r35 = Bodyfront.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(0, 53).addBox(1.8436F, 0.4746F, -3.1908F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.1336F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r36 = Bodyfront.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(7, 68).addBox(1.8436F, -1.3551F, -3.4005F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.7008F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r37 = Bodyfront.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(7, 72).addBox(0.9F, -0.336F, -2.8318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.3126F, 0.0758F, -0.1247F));

		PartDefinition Bodyfront_r38 = Bodyfront.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(98, 6).addBox(0.7824F, -1.2748F, 3.2994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.9799F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r39 = Bodyfront.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(0, 74).addBox(0.7824F, -0.6017F, 0.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 2.2853F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r40 = Bodyfront.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(54, 71).addBox(0.7824F, -0.9363F, -1.167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.9247F, 3.1973F, -6.397F, 1.8926F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r41 = Bodyfront.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(36, 4).addBox(-0.65F, -0.5F, -1.35F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.9459F, 11.3546F, -4.7332F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition Bodyfront_r42 = Bodyfront.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(90, 0).addBox(-2.1645F, 0.0751F, 1.3454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(14, 68).addBox(-2.1645F, 0.0751F, 1.3454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 7).addBox(-5.1645F, 0.0751F, -0.6546F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6645F, 10.4996F, -6.8211F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r43 = Bodyfront.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(68, 43).addBox(-2.1645F, -0.9943F, -0.023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6645F, 11.9996F, -3.6211F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r44 = Bodyfront.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(25, 60).addBox(0.0528F, 0.4425F, 0.9596F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.48F, 9.6656F, -6.1938F, 0.0248F, 0.112F, -1.0022F));

		PartDefinition Bodyfront_r45 = Bodyfront.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(32, 11).addBox(0.1099F, 0.4159F, -2.2445F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.48F, 9.6656F, -6.1938F, 0.0265F, -0.3678F, -1.0144F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(21, 0).addBox(-1.1723F, 0.2553F, -2.0336F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.48F, 9.6656F, -6.1938F, 0.0131F, -0.0596F, -0.7854F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(77, 78).addBox(-1.6568F, 0.5324F, -2.0203F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.48F, 9.6656F, -6.1938F, -0.1789F, -0.4468F, -0.7171F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(76, 28).addBox(-1.6547F, 0.6457F, -2.2298F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.48F, 9.6656F, -6.1938F, -0.3147F, -0.6919F, -0.5891F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(22, 43).addBox(-3.0F, -0.5F, -1.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.0F, 10.1494F, -8.525F, -0.7132F, -0.3751F, 0.3069F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(17, 19).addBox(-5.1645F, 0.2594F, -2.065F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(51, 0).addBox(-2.6645F, 0.2594F, -3.865F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6645F, 10.4996F, -6.8211F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.9018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r81 = Bodyfront.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(83, 49).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, 0.5088F, -0.0606F, 0.1863F));

		PartDefinition Bodymiddle_r82 = Bodyfront.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(49, 69).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, 0.4366F, -0.2599F, 0.6295F));

		PartDefinition Bodymiddle_r83 = Bodyfront.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(69, 47).addBox(3.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, 0.2748F, -0.4064F, 1.1143F));

		PartDefinition Bodymiddle_r84 = Bodyfront.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(40, 69).addBox(3.9732F, -6.3816F, -0.1665F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, -0.0153F, -0.4557F, 1.7869F));

		PartDefinition Bodymiddle_r85 = Bodyfront.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(76, 0).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.3506F, -0.1835F, 0.5644F));

		PartDefinition Bodymiddle_r86 = Bodyfront.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(88, 51).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.4F, -0.0284F, 0.1071F));

		PartDefinition Bodymiddle_r87 = Bodyfront.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(74, 26).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.2334F, -0.2998F, 1.0446F));

		PartDefinition Bodymiddle_r88 = Bodyfront.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(47, 31).addBox(3.9732F, -6.3816F, -0.1665F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.022F, -0.3476F, 1.6882F));

		PartDefinition Bodymiddle_r89 = Bodyfront.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(47, 29).addBox(3.8427F, -7.3717F, -0.1148F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.0038F, -0.3459F, 1.7627F));

		PartDefinition Bodymiddle_r90 = Bodyfront.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(69, 36).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.2179F, -0.3088F, 1.1175F));

		PartDefinition Bodymiddle_r91 = Bodyfront.addOrReplaceChild("Bodymiddle_r91", CubeListBuilder.create().texOffs(69, 34).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.3416F, -0.1983F, 0.6344F));

		PartDefinition Bodymiddle_r92 = Bodyfront.addOrReplaceChild("Bodymiddle_r92", CubeListBuilder.create().texOffs(69, 32).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.3985F, -0.0456F, 0.1754F));

		PartDefinition Bodymiddle_r93 = Bodyfront.addOrReplaceChild("Bodymiddle_r93", CubeListBuilder.create().texOffs(32, 17).addBox(3.8427F, -7.3717F, -0.1147F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.0207F, -0.3039F, 1.6625F));

		PartDefinition Bodymiddle_r94 = Bodyfront.addOrReplaceChild("Bodymiddle_r94", CubeListBuilder.create().texOffs(67, 4).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.2052F, -0.2655F, 1.0263F));

		PartDefinition Bodymiddle_r95 = Bodyfront.addOrReplaceChild("Bodymiddle_r95", CubeListBuilder.create().texOffs(64, 39).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.3101F, -0.1656F, 0.5453F));

		PartDefinition Bodymiddle_r96 = Bodyfront.addOrReplaceChild("Bodymiddle_r96", CubeListBuilder.create().texOffs(65, 26).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.3563F, -0.0301F, 0.0822F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(16, 54).addBox(-0.5F, -0.4905F, -2.9026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(45, 98).addBox(0.0F, -2.4905F, -1.9026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3017F, -6.8405F, 0.1242F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r97 = Neck.addOrReplaceChild("Bodymiddle_r97", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(-5.8168F, -5.3293F, -0.1566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, -0.0124F, 0.3875F, -1.7069F));

		PartDefinition Bodymiddle_r98 = Neck.addOrReplaceChild("Bodymiddle_r98", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(-6.1894F, -2.1787F, -0.3213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, 0.2319F, 0.351F, -1.0514F));

		PartDefinition Bodymiddle_r99 = Neck.addOrReplaceChild("Bodymiddle_r99", CubeListBuilder.create().texOffs(69, 49).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, 0.3736F, 0.2295F, -0.566F));

		PartDefinition Bodymiddle_r100 = Neck.addOrReplaceChild("Bodymiddle_r100", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, 0.4405F, 0.0598F, -0.1117F));

		PartDefinition Bodymiddle_r101 = Neck.addOrReplaceChild("Bodymiddle_r101", CubeListBuilder.create().texOffs(84, 60).addBox(3.8168F, -5.3293F, -0.1566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, -0.0124F, -0.3875F, 1.7069F));

		PartDefinition Bodymiddle_r102 = Neck.addOrReplaceChild("Bodymiddle_r102", CubeListBuilder.create().texOffs(58, 69).addBox(3.1894F, -2.1787F, -0.3213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, 0.2319F, -0.351F, 1.0514F));

		PartDefinition Bodymiddle_r103 = Neck.addOrReplaceChild("Bodymiddle_r103", CubeListBuilder.create().texOffs(69, 49).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, 0.3736F, -0.2295F, 0.566F));

		PartDefinition Bodymiddle_r104 = Neck.addOrReplaceChild("Bodymiddle_r104", CubeListBuilder.create().texOffs(51, 9).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, 0.4405F, -0.0598F, 0.1117F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(67, 69).addBox(-0.5F, -0.5915F, -2.0078F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 98).addBox(0.0F, -2.1915F, -1.0078F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, -0.1043F, -0.1736F, 0.0181F));

		PartDefinition Bodymiddle_r105 = Neck2.addOrReplaceChild("Bodymiddle_r105", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3854F, -0.6081F, 0.7394F, 0.2466F, -0.4059F));

		PartDefinition Bodymiddle_r106 = Neck2.addOrReplaceChild("Bodymiddle_r106", CubeListBuilder.create().texOffs(47, 33).mirror().addBox(-5.838F, -0.4614F, -0.411F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3854F, -0.6081F, 0.5759F, 0.5242F, -0.8309F));

		PartDefinition Bodymiddle_r107 = Neck2.addOrReplaceChild("Bodymiddle_r107", CubeListBuilder.create().texOffs(47, 33).addBox(0.838F, -0.4614F, -0.411F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3854F, -0.6081F, 0.5759F, -0.5242F, 0.8309F));

		PartDefinition Bodymiddle_r108 = Neck2.addOrReplaceChild("Bodymiddle_r108", CubeListBuilder.create().texOffs(21, 71).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3854F, -0.6081F, 0.7394F, -0.2466F, 0.4059F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(34, 30).addBox(-0.5F, -0.489F, -5.0026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0803F, -1.9399F, -0.0059F, -0.299F, -0.0634F));

		PartDefinition Neck_r1 = Neck3.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(77, 16).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -2.0026F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck3.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(75, 98).addBox(0.0F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -0.0026F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r109 = Neck3.addOrReplaceChild("Bodymiddle_r109", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3051F, -2.6682F, 0.7608F, 0.3651F, -0.7322F));

		PartDefinition Bodymiddle_r110 = Neck3.addOrReplaceChild("Bodymiddle_r110", CubeListBuilder.create().texOffs(61, 73).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3051F, -2.6682F, 0.5378F, 0.6403F, -1.1847F));

		PartDefinition Bodymiddle_r111 = Neck3.addOrReplaceChild("Bodymiddle_r111", CubeListBuilder.create().texOffs(61, 71).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3051F, -0.6682F, 0.7224F, 0.2715F, -0.6231F));

		PartDefinition Bodymiddle_r112 = Neck3.addOrReplaceChild("Bodymiddle_r112", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-4.838F, -0.4614F, -0.411F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3051F, -0.6682F, 0.5466F, 0.5401F, -1.0587F));

		PartDefinition Bodymiddle_r113 = Neck3.addOrReplaceChild("Bodymiddle_r113", CubeListBuilder.create().texOffs(61, 73).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3051F, -2.6682F, 0.5378F, -0.6403F, 1.1847F));

		PartDefinition Bodymiddle_r114 = Neck3.addOrReplaceChild("Bodymiddle_r114", CubeListBuilder.create().texOffs(76, 6).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3051F, -2.6682F, 0.7608F, -0.3651F, 0.7322F));

		PartDefinition Bodymiddle_r115 = Neck3.addOrReplaceChild("Bodymiddle_r115", CubeListBuilder.create().texOffs(25, 58).addBox(0.838F, -0.4614F, -0.411F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3051F, -0.6682F, 0.5466F, -0.5401F, 1.0587F));

		PartDefinition Bodymiddle_r116 = Neck3.addOrReplaceChild("Bodymiddle_r116", CubeListBuilder.create().texOffs(61, 71).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3051F, -0.6682F, 0.7224F, -0.2715F, 0.6231F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8914F, -4.0979F, 0.8425F, -0.3658F, -0.2566F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 59).addBox(-1.5F, -2.059F, -4.1078F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 4).addBox(-1.5F, -1.3363F, -3.4608F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(94, 40).mirror().addBox(-0.5F, -0.3F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(94, 40).addBox(4.55F, -0.3F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.525F, -1.6358F, -0.8633F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.5F, -0.9755F, 0.0013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 51).addBox(4.55F, -0.9755F, 0.0013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.525F, -0.1345F, -0.3878F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-0.5F, -0.9911F, 0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(50, 95).addBox(4.55F, -0.9911F, 0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.525F, 0.2655F, -1.3128F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 74).mirror().addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(28, 74).addBox(4.55F, -0.6F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.525F, -0.5345F, -1.4378F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-3.025F, -0.0957F, -2.6754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(74, 12).addBox(2.025F, -0.0957F, -2.6754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 0).addBox(-3.0F, -0.9957F, -3.6754F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.225F, -1.725F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 94).mirror().addBox(-0.5F, -0.6F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(-2.3792F, -1.0623F, -2.9479F, 0.5171F, -0.4963F, 0.0182F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(0.0F, -0.0014F, -2.0021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 81).mirror().addBox(0.0F, 0.0736F, -2.0021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 81).addBox(4.0F, 0.0736F, -2.0021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 82).addBox(4.0F, -0.0014F, -2.0021F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -3.2203F, 0.079F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(74, 81).mirror().addBox(0.0F, 0.9141F, -1.4458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 81).addBox(4.0F, 0.9141F, -1.4458F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -3.2203F, 0.079F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(0.0F, 1.6269F, -0.8201F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(60, 0).addBox(4.0F, 1.6269F, -0.8201F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.0F, -3.2203F, 0.079F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 47).mirror().addBox(0.0F, 2.0743F, 0.0171F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(53, 47).addBox(4.0F, 2.0743F, 0.0171F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-3.0F, -3.2203F, 0.079F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(0.0F, -0.1406F, 0.0262F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 79).mirror().addBox(0.0F, -0.2156F, 0.0262F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3953F, -0.571F, 0.689F, 0.0525F, 0.0861F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 54).mirror().addBox(0.0F, 0.181F, 0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -2.3953F, -0.571F, 0.1218F, 0.0525F, 0.0861F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 43).mirror().addBox(-0.975F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(82, 40).mirror().addBox(-0.975F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8634F, 1.6925F, -6.9028F, 0.949F, -0.1691F, -0.0293F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-0.975F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6425F, 1.5238F, -6.4441F, 0.8372F, -0.1658F, -0.0376F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(11, 43).mirror().addBox(-0.95F, -0.9F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7451F, 0.0809F, -5.451F, 1.0244F, -0.1013F, -0.0374F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(0.0127F, 0.5595F, -1.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(67, 80).mirror().addBox(-0.0873F, 0.0595F, -1.7425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.85F, -6.225F, 0.3054F, -0.2094F, -0.0873F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(99, 35).mirror().addBox(0.1979F, -0.6723F, -0.0683F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.85F, -6.225F, 0.58F, -0.173F, -0.0628F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(94, 83).mirror().addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7661F, 3.3388F, -7.5256F, 0.2378F, -0.7655F, -0.217F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-0.0567F, -0.7031F, -0.2389F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, -0.9192F, -5.308F, 0.9308F, -0.2484F, -0.0167F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(35, 47).mirror().addBox(-0.3229F, -1.0405F, 0.1484F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, -2.5192F, -4.308F, 0.019F, -0.5011F, 0.0101F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-1.0F, -0.275F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(81, 9).mirror().addBox(-1.0F, -0.275F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5335F, 2.0842F, -7.2062F, 1.0908F, -0.2094F, -0.0873F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(92, 60).mirror().addBox(-0.475F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 92).mirror().addBox(-0.475F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8627F, 3.002F, -7.5273F, 1.8981F, -0.7581F, -0.2293F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(20, 49).mirror().addBox(0.0F, -0.968F, -0.5025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.65F, -4.725F, 0.9425F, -0.2094F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(0.0F, -0.8574F, -1.1457F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.65F, -4.725F, 0.6283F, -0.2094F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-0.0501F, -1.0756F, -0.9066F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.45F, -5.425F, 0.4538F, -0.0785F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(0.0127F, -0.0858F, -0.9084F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.85F, -6.225F, 0.3665F, -0.2094F, -0.0873F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 79).mirror().addBox(-2.5F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(53, 79).addBox(1.5F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.8888F, -0.5339F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-2.5F, 0.1693F, -1.9552F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(36, 58).mirror().addBox(-2.5F, -0.0307F, -1.9552F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 58).addBox(1.5F, 0.1693F, -1.9552F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(36, 58).addBox(1.5F, -0.0307F, -1.9552F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2188F, -0.2911F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 79).mirror().addBox(-2.5F, 0.0129F, -0.9862F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 79).addBox(1.5F, 0.0129F, -0.9862F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2188F, 0.0089F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(39, 79).mirror().addBox(-2.5F, -1.0193F, -0.0011F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0056F)).mirror(false)
				.texOffs(39, 79).addBox(1.5F, -1.0193F, -0.0011F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0056F)), PartPose.offsetAndRotation(-0.5F, 0.9F, -3.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 98).mirror().addBox(-0.5049F, -0.2981F, -0.5696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0497F)).mirror(false), PartPose.offsetAndRotation(-2.0823F, -0.7248F, -3.4971F, 1.0407F, -0.4963F, 0.0182F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-0.5049F, -0.6981F, -0.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-2.0823F, -0.7248F, -3.4971F, 1.6515F, -0.4963F, 0.0182F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(94, 96).mirror().addBox(-0.6826F, -0.2465F, -0.248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-1.6614F, -0.7877F, -3.7335F, 1.1789F, -0.3737F, -0.0358F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-0.6523F, -0.3573F, -0.6714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(-1.9158F, -0.3442F, -3.508F, 0.3076F, -0.4963F, 0.0182F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-0.6523F, -0.2571F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.052F)).mirror(false), PartPose.offsetAndRotation(-1.9158F, -0.3442F, -3.508F, -0.2945F, -0.4963F, 0.0182F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(86, 90).mirror().addBox(-0.9023F, -0.6655F, -0.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 91).mirror().addBox(-0.7273F, -0.6655F, -0.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9158F, -0.3442F, -3.508F, -0.8138F, -0.4963F, 0.0182F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)).mirror(false), PartPose.offsetAndRotation(-1.9896F, -0.7755F, -3.677F, -0.2029F, -0.4963F, 0.0182F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(11, 37).mirror().addBox(-0.5781F, -0.2853F, -1.3451F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7408F, -0.8192F, -3.808F, 0.0627F, -0.5011F, 0.0101F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(92, 60).addBox(-0.525F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 92).addBox(-0.525F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8627F, 3.002F, -7.5273F, 1.8981F, 0.7581F, 0.2293F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(80, 65).addBox(-1.0F, -0.675F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.903F, -7.5433F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(82, 43).addBox(-1.025F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(82, 40).addBox(-1.025F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8634F, 1.6925F, -6.9028F, 0.949F, 0.1691F, 0.0293F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(81, 12).addBox(-1.0F, -0.275F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 9).addBox(-1.0F, -0.275F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5335F, 2.0842F, -7.2062F, 1.0908F, 0.2094F, 0.0873F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(10, 94).addBox(-1.0127F, 0.5595F, -1.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(67, 80).addBox(-1.9127F, 0.0595F, -1.7425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.7F, 1.85F, -6.225F, 0.3054F, 0.2094F, 0.0873F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(94, 83).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7661F, 3.3388F, -7.5256F, 0.2378F, 0.7655F, 0.217F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 62).addBox(-1.0F, -0.1244F, -1.5506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.5F, -7.725F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(20, 49).addBox(-2.0F, -0.968F, -0.5025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9F, 0.65F, -4.725F, 0.9425F, 0.2094F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(70, 73).addBox(-2.0F, -0.8574F, -1.1457F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.9F, 0.65F, -4.725F, 0.6283F, 0.2094F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(11, 43).addBox(-1.05F, -0.9F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7451F, 0.0809F, -5.451F, 1.0244F, 0.1013F, 0.0374F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(73, 64).addBox(-1.9499F, -1.0756F, -0.9066F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7F, 1.45F, -5.425F, 0.4538F, 0.0785F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(81, 51).addBox(-1.025F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6425F, 1.5238F, -6.4441F, 0.8372F, 0.1658F, 0.0376F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(99, 35).addBox(-0.1979F, -0.6723F, -0.0683F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.85F, -6.225F, 0.58F, 0.173F, 0.0628F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(81, 6).addBox(-2.0127F, -0.0858F, -0.9084F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7F, 1.85F, -6.225F, 0.3665F, 0.2094F, 0.0873F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(80, 37).addBox(-1.0F, -0.0164F, -0.9529F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.5F, -7.725F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -0.3812F, -0.9141F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.775F, -7.025F, 1.165F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 56).addBox(-1.0F, -1.0108F, -1.0165F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9907F, -4.2288F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(84, 57).addBox(-1.0F, -1.2357F, -0.027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9907F, -3.2288F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(77, 75).addBox(-1.0F, -0.625F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0369F, -2.1713F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -4.3559F, -5.111F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(66, 65).addBox(-1.0F, -2.4435F, -6.9715F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(49, 4).addBox(-1.0F, -3.5985F, -4.8706F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(35, 43).addBox(-2.0F, -1.8263F, -1.5875F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(36, 19).addBox(-2.0F, -2.6886F, -1.2017F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(36, 0).addBox(-2.5F, -0.9058F, -1.9158F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0291F, -1.5882F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(17, 31).addBox(-3.0F, -0.0421F, -1.9651F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -4.025F, -1.45F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, -0.3F, -0.975F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6625F, -1.0165F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(7, 54).addBox(1.0F, -1.0F, -0.575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, -0.0093F, -1.1735F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(94, 43).addBox(1.5F, -0.225F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 53).addBox(1.0F, -1.025F, -0.875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.1203F, -0.821F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(16, 59).addBox(1.0F, -1.0038F, -1.9473F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, -1.0843F, 0.7265F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(59, 43).addBox(1.0F, -1.0233F, -1.9685F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.0843F, 0.5265F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 68).addBox(-2.0F, -0.1406F, 0.0262F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 79).addBox(-2.0F, -0.2156F, 0.0262F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(3.0F, -2.3953F, -0.571F, 0.689F, -0.0525F, -0.0861F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 54).addBox(-2.0F, 0.181F, 0.3063F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.0F, -2.3953F, -0.571F, 0.1218F, -0.0525F, -0.0861F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(28, 98).addBox(-0.4951F, -0.2981F, -0.5696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0497F)), PartPose.offsetAndRotation(2.0823F, -0.7248F, -3.4971F, 1.0407F, 0.4963F, -0.0182F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 94).addBox(-0.5F, -0.6F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(2.3792F, -1.0623F, -2.9479F, 0.5171F, 0.4963F, -0.0182F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 14).addBox(-0.4951F, -0.6981F, -0.2447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(2.0823F, -0.7248F, -3.4971F, 1.6515F, 0.4963F, -0.0182F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(94, 96).addBox(-0.3174F, -0.2465F, -0.248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(1.6614F, -0.7877F, -3.7335F, 1.1789F, 0.3737F, 0.0358F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(98, 9).addBox(-0.3477F, -0.3573F, -0.6714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(1.9158F, -0.3442F, -3.508F, 0.3076F, 0.4963F, -0.0182F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(91, 19).addBox(-0.3477F, -0.2571F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.052F)), PartPose.offsetAndRotation(1.9158F, -0.3442F, -3.508F, -0.2945F, 0.4963F, -0.0182F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(86, 90).addBox(-0.0977F, -0.6655F, -0.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 91).addBox(-0.2727F, -0.6655F, -0.7379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9158F, -0.3442F, -3.508F, -0.8138F, 0.4963F, -0.0182F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(71, 92).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)), PartPose.offsetAndRotation(1.9896F, -0.7755F, -3.677F, -0.2029F, 0.4963F, -0.0182F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(22, 37).addBox(-1.9433F, -0.7031F, -0.2389F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, -0.9192F, -5.308F, 0.9308F, 0.2484F, 0.0167F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(35, 47).addBox(-1.6771F, -1.0405F, 0.1484F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7408F, -2.5192F, -4.308F, 0.019F, 0.5011F, -0.0101F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(11, 37).addBox(-1.4219F, -0.2853F, -1.3451F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.7408F, -0.8192F, -3.808F, 0.0627F, 0.5011F, -0.0101F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1681F, -1.2217F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r85 = jaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(30, 92).mirror().addBox(0.0826F, -0.2716F, 0.4266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2119F, 0.4161F, -5.6213F, -0.9965F, -0.4617F, 0.0179F));

		PartDefinition cube_r86 = jaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(95, 46).mirror().addBox(0.5826F, 0.0978F, 0.0695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(95, 46).addBox(0.8413F, 0.0978F, 0.0695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2119F, 0.4161F, -5.6213F, -1.171F, 0.0F, 0.0F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(45, 95).mirror().addBox(0.0826F, 0.2978F, -0.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2119F, 0.4161F, -5.6213F, -1.171F, -0.4617F, 0.0179F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(0.0826F, 0.5203F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2119F, 0.4161F, -5.6213F, -0.2111F, -0.4617F, 0.0179F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(81, 98).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.6968F, -6.0464F, -1.0911F, -0.6491F, -0.2647F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(60, 32).mirror().addBox(0.4726F, 4.8304F, -1.5112F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -1.3318F, -0.2439F, 0.0568F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 98).mirror().addBox(0.4726F, 3.4812F, -1.6428F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -1.2882F, -0.2439F, 0.0568F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(0.3F, 3.3124F, -1.6846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -1.2463F, -0.2385F, 0.0674F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(29, 49).mirror().addBox(0.2726F, 3.2075F, -1.7722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -1.1573F, -0.2439F, 0.0568F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(89, 76).mirror().addBox(0.0826F, -0.5468F, -0.0255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2119F, 0.4161F, -5.6213F, -1.3455F, -0.4617F, 0.0179F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(94, 93).mirror().addBox(-0.0258F, -0.3152F, -3.2582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -0.2605F, -0.3411F, 0.0186F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-0.0265F, 1.4495F, -2.121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(70, 20).mirror().addBox(-0.0265F, 0.9995F, -2.121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -1.2272F, -0.3368F, 0.0485F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-0.0265F, -0.8859F, -2.1583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -0.3982F, -0.3368F, 0.0485F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-0.0265F, -0.1089F, -1.4651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -0.9654F, -0.3368F, 0.0485F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-0.0265F, 0.1036F, -0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, -1.4017F, -0.3368F, 0.0485F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 28).mirror().addBox(-0.0265F, -3.6354F, 0.0774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, 1.7835F, -0.3368F, 0.0485F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(97, 3).mirror().addBox(-0.0265F, -2.894F, -0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, 1.4781F, -0.3368F, 0.0485F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-0.0265F, -2.498F, -2.9979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, 0.5879F, -0.3368F, 0.0485F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(92, 86).mirror().addBox(-0.0265F, -0.4326F, -2.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9619F, 0.1161F, 0.0787F, 0.0382F, -0.3368F, 0.0485F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(30, 92).addBox(-1.0826F, -0.2716F, 0.4266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2119F, 0.4161F, -5.6213F, -0.9965F, 0.4617F, -0.0179F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(45, 95).addBox(-1.0826F, 0.2978F, -0.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2119F, 0.4161F, -5.6213F, -1.171F, 0.4617F, -0.0179F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(93, 9).addBox(-1.0826F, 0.5203F, -0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2119F, 0.4161F, -5.6213F, -0.2111F, 0.4617F, -0.0179F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(81, 98).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.575F, 0.6968F, -6.0464F, -1.0911F, 0.6491F, 0.2647F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(60, 32).addBox(-0.4726F, 4.8304F, -1.5112F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -1.3318F, 0.2439F, -0.0568F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(78, 98).addBox(-0.4726F, 3.4812F, -1.6428F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -1.2882F, 0.2439F, -0.0568F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 83).addBox(-1.3F, 3.3124F, -1.6846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -1.2463F, 0.2385F, -0.0674F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(29, 49).addBox(-1.2726F, 3.2075F, -1.7722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -1.1573F, 0.2439F, -0.0568F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 76).addBox(-1.0826F, -0.5468F, -0.0255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2119F, 0.4161F, -5.6213F, -1.3455F, 0.4617F, -0.0179F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(94, 93).addBox(-0.9742F, -0.3152F, -3.2582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -0.2605F, 0.3411F, -0.0186F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(95, 0).addBox(-0.9735F, 1.4495F, -2.121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(70, 20).addBox(-0.9735F, 0.9995F, -2.121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -1.2272F, 0.3368F, -0.0485F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 94).addBox(-0.9735F, -0.8859F, -2.1583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -0.3982F, 0.3368F, -0.0485F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(93, 6).addBox(-0.9735F, -0.1089F, -1.4651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -0.9654F, 0.3368F, -0.0485F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(5, 93).addBox(-0.9735F, 0.1036F, -0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, -1.4017F, 0.3368F, -0.0485F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(98, 28).addBox(-0.9735F, -3.6354F, 0.0774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, 1.7835F, 0.3368F, -0.0485F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(97, 3).addBox(-0.9735F, -2.894F, -0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, 1.4781F, 0.3368F, -0.0485F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(50, 89).addBox(-0.9735F, -2.498F, -2.9979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, 0.5879F, 0.3368F, -0.0485F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(92, 86).addBox(-0.9735F, -0.4326F, -2.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9619F, 0.1161F, 0.0787F, 0.0382F, 0.3368F, -0.0485F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7213F, 8.0621F, -2.7437F, 0.5975F, 0.2102F, -0.5509F));

		PartDefinition cube_r122 = leftarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(47, 71).addBox(0.0F, -0.4105F, -1.814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.6672F, 0.6031F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(40, 71).addBox(0.0F, -0.4067F, 0.0129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.6672F, 0.6031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 34).addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0092F, -0.1631F, 1.1254F, -2.0858F, 0.0014F, -0.001F));

		PartDefinition cube_r125 = leftarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(70, 60).addBox(-0.5F, -0.65F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0109F, -0.2036F, -0.025F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r126 = leftarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 92).addBox(-0.5F, -1.1F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0095F, 0.4983F, 0.4962F, -2.0858F, 0.0014F, -0.001F));

		PartDefinition cube_r127 = leftarm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -1.1F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0032F, 5.7766F, -1.2838F, 0.0435F, 0.0011F, -0.0013F));

		PartDefinition cube_r128 = leftarm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(20, 94).addBox(-0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(10, 87).addBox(-0.5F, -0.5F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(51, 85).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0043F, 4.1312F, -0.3337F, -0.5237F, 0.0011F, -0.0013F));

		PartDefinition cube_r129 = leftarm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(78, 46).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0057F, 2.7652F, 0.0324F, 0.5235F, 0.0011F, -0.0013F));

		PartDefinition cube_r130 = leftarm.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5168F, -2.2493F, -0.6624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.9622F, 0.3074F, 0.109F, 0.0011F, -0.0013F));

		PartDefinition cube_r131 = leftarm.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5016F, 0.6953F, -2.2255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.915F, 0.9817F, 0.0014F, -0.001F));

		PartDefinition cube_r132 = leftarm.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(74, 8).addBox(-0.5016F, 0.7811F, -1.4595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.915F, 0.4144F, 0.0014F, -0.001F));

		PartDefinition cube_r133 = leftarm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(49, 75).addBox(-0.5016F, 0.1899F, -1.1849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.915F, 0.109F, 0.0014F, -0.001F));

		PartDefinition cube_r134 = leftarm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(33, 70).addBox(-0.5F, -0.55F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0111F, -0.4352F, -0.7661F, -1.3527F, 0.0014F, -0.001F));

		PartDefinition cube_r135 = leftarm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(35, 95).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(30, 95).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0111F, 0.4176F, -1.4206F, -0.6546F, 0.0014F, -0.001F));

		PartDefinition cube_r136 = leftarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(77, 84).addBox(-0.5099F, -0.9135F, -0.2922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.9622F, 0.3074F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(61, 86).addBox(-0.5099F, -2.7605F, -0.4859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0099F, 2.9622F, 0.3074F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2637F, 7.3728F, 1.4249F, -0.3309F, 0.0985F, 0.5353F));

		PartDefinition cube_r138 = leftarm2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(96, 17).addBox(-1.0378F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.8461F, 1.1201F, 1.5708F, 0.1396F, -1.5708F));

		PartDefinition cube_r139 = leftarm2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(75, 95).addBox(0.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(94, 73).addBox(0.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, 1.1298F, -0.0451F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r140 = leftarm2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(27, 83).addBox(-1.3598F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.8702F, 1.3549F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r141 = leftarm2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(21, 64).addBox(-0.559F, -0.121F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.4486F, -1.5795F));

		PartDefinition cube_r142 = leftarm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 62).addBox(-0.6095F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.1694F, -1.5795F));

		PartDefinition cube_r143 = leftarm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 95).addBox(-1.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(93, 29).addBox(-1.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, -1.5708F, -1.1868F, 1.5621F));

		PartDefinition cube_r144 = leftarm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(7, 76).addBox(-0.0572F, -0.0033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.6454F, 0.0086F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3626F, 6.0373F, 0.2104F, -0.0172F, -0.0191F, -0.0459F));

		PartDefinition cube_r145 = leftArm3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(83, 27).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, -0.2705F, -0.0002F, 0.0001F));

		PartDefinition cube_r146 = leftArm4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(54, 60).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftArm5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 43).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7213F, 8.0621F, -2.7437F, 0.0739F, -0.2102F, 0.5509F));

		PartDefinition cube_r148 = rightarm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(75, 42).addBox(-1.0F, -0.4105F, -1.814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.6672F, 0.6031F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightarm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(42, 75).addBox(-1.0F, -0.4067F, 0.0129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.6672F, 0.6031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r150 = rightarm.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(35, 92).addBox(-0.5F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0092F, -0.1631F, 1.1254F, -2.0858F, -0.0014F, 0.001F));

		PartDefinition cube_r151 = rightarm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(35, 75).addBox(-0.5F, -0.65F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0109F, -0.2036F, -0.025F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r152 = rightarm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(81, 92).addBox(-0.5F, -1.1F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0095F, 0.4983F, 0.4962F, -2.0858F, -0.0014F, 0.001F));

		PartDefinition cube_r153 = rightarm.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(87, 34).addBox(-0.5F, -1.1F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0032F, 5.7766F, -1.2838F, 0.0435F, -0.0011F, 0.0013F));

		PartDefinition cube_r154 = rightarm.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(55, 94).addBox(-0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(25, 87).addBox(-0.5F, -0.5F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(56, 85).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0043F, 4.1312F, -0.3337F, -0.5237F, -0.0011F, 0.0013F));

		PartDefinition cube_r155 = rightarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(17, 82).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0057F, 2.7652F, 0.0324F, 0.5235F, -0.0011F, 0.0013F));

		PartDefinition cube_r156 = rightarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(27, 78).addBox(-0.4832F, -2.2493F, -0.6624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.9622F, 0.3074F, 0.109F, -0.0011F, 0.0013F));

		PartDefinition cube_r157 = rightarm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(20, 87).addBox(-0.4984F, 0.6953F, -2.2255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.915F, 0.9817F, -0.0014F, 0.001F));

		PartDefinition cube_r158 = rightarm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(74, 68).addBox(-0.4984F, 0.7811F, -1.4595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.915F, 0.4144F, -0.0014F, 0.001F));

		PartDefinition cube_r159 = rightarm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(56, 75).addBox(-0.4984F, 0.1899F, -1.1849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.915F, 0.109F, -0.0014F, 0.001F));

		PartDefinition cube_r160 = rightarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(74, 55).addBox(-0.5F, -0.55F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0111F, -0.4352F, -0.7661F, -1.3527F, -0.0014F, 0.001F));

		PartDefinition cube_r161 = rightarm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(70, 95).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(95, 66).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0111F, 0.4176F, -1.4206F, -0.6546F, -0.0014F, 0.001F));

		PartDefinition cube_r162 = rightarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(82, 84).addBox(-0.4901F, -0.9135F, -0.2922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.9622F, 0.3074F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r163 = rightarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(87, 15).addBox(-0.4901F, -2.7605F, -0.4859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.9622F, 0.3074F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2637F, 7.3728F, 1.4249F, -0.333F, 0.1491F, -0.6205F));

		PartDefinition cube_r164 = rightarm2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(96, 56).addBox(0.0378F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.8461F, 1.1201F, 1.5708F, -0.1396F, 1.5708F));

		PartDefinition cube_r165 = rightarm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(95, 79).addBox(-1.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(95, 22).addBox(-1.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, 1.1298F, -0.0451F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r166 = rightarm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(72, 84).addBox(0.3598F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.8702F, 1.3549F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r167 = rightarm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(64, 32).addBox(-0.441F, -0.121F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.4486F, 1.5795F));

		PartDefinition cube_r168 = rightarm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(88, 6).addBox(-0.3905F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.1694F, 1.5795F));

		PartDefinition cube_r169 = rightarm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(3, 96).addBox(0.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(94, 70).addBox(0.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, -1.5708F, 1.1868F, -1.5621F));

		PartDefinition cube_r170 = rightarm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(12, 76).addBox(-0.9428F, -0.0033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.6454F, 0.0086F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3626F, 6.0373F, 0.2104F, -0.0172F, 0.0191F, 0.0459F));

		PartDefinition cube_r171 = rightArm3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(83, 46).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, -0.0524F, 0.0002F, -0.0001F));

		PartDefinition cube_r172 = rightArm4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(34, 62).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offset(0.0127F, 0.7642F, -1.4173F));

		PartDefinition cube_r173 = rightArm5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(32, 23).addBox(-0.5F, -0.442F, -0.0094F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F))
				.texOffs(47, 35).addBox(0.4F, 0.058F, -0.0094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(87, 66).addBox(0.1F, 0.058F, 1.9906F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(87, 84).addBox(-0.1F, 0.058F, 3.9906F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(47, 35).mirror().addBox(-2.4F, 0.058F, -0.0094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(87, 66).mirror().addBox(-2.1F, 0.058F, 1.9906F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(87, 84).mirror().addBox(-1.9F, 0.058F, 3.9906F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2756F, 2.0903F, -0.1309F, 0.0865F, -0.0114F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(3, 99).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6957F, 4.5916F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(60, 98).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.342F, 1.9906F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(25, 54).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.442F, -0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(49, 17).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(87, 38).addBox(-0.4F, -0.0932F, 0.9622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 38).mirror().addBox(-1.6F, -0.0932F, 0.9622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 98).addBox(0.0F, -1.0932F, 0.9622F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.062F, 4.7918F, -0.5005F, 0.115F, -0.0627F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(26, 69).addBox(-0.5F, -0.3875F, -0.2931F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(0, 99).addBox(0.0F, -0.6875F, -0.2931F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1738F, 3.136F, -0.1962F, 0.2141F, -0.0422F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, -0.32F, -0.0358F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0527F, 1.5637F, 0.0632F, 0.3049F, 0.019F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(11, 49).addBox(-0.5F, -0.32F, -0.0358F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0468F, 3.7243F, 0.4125F, 0.12F, 0.0523F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1009F, 1.305F, 0.8508F, 0.3764F, -0.2984F, -0.0659F));

		PartDefinition cube_r174 = leftLeg.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(39, 82).addBox(-1.5F, -0.9981F, -0.9886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftLeg.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(77, 21).addBox(-1.5F, -1.0433F, 0.0001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.2991F, -0.0685F, 3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r176 = leftLeg.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(78, 31).addBox(-1.5F, -0.0114F, -0.2769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftLeg.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(70, 77).addBox(-1.0F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.4609F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftLeg.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(17, 77).addBox(-0.5F, -1.9486F, -1.0595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftLeg.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(87, 86).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftLeg.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(94, 76).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftLeg.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 85).addBox(-0.5F, -0.0388F, -2.2481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3326F, 0.956F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftLeg.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(56, 13).addBox(-1.0037F, -0.0141F, -1.7261F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0037F, 4.8103F, -1.1325F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftLeg.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(22, 82).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftLeg.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(71, 88).addBox(-0.5F, -1.0884F, -2.1449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0068F, 6.2457F, -1.8621F, 0.7572F, 0.0F, -0.0131F));

		PartDefinition cube_r185 = leftLeg2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(97, 59).addBox(-0.8F, 0.169F, -0.9332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0065F, 0.5662F, -0.9841F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftLeg2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(65, 83).addBox(-1.3F, -0.5928F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0065F, 0.1965F, 0.0772F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftLeg2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 79).addBox(-1.3F, -0.7F, -1.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0065F, 1.3965F, 0.9772F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftLeg2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(97, 12).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7935F, 3.4388F, -1.0708F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftLeg2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(58, 82).addBox(-1.0F, -2.325F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3065F, 5.3354F, -2.3744F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftLeg2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(97, 32).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3065F, 2.0595F, -1.0197F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftLeg2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(55, 97).addBox(-0.5F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3065F, 1.5895F, -0.3855F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r192 = leftLeg2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(8, 97).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7935F, 3.8142F, -0.7796F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r193 = leftLeg2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(85, 96).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7935F, 4.2496F, -0.928F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftLeg2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(40, 91).addBox(-0.5F, -0.8374F, -1.0851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 91).addBox(-0.5F, -0.8374F, -0.8851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7935F, 4.2752F, -1.5501F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftLeg2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(20, 91).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7935F, 4.2752F, -1.1501F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftLeg2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(90, 46).addBox(-0.5052F, 1.8096F, 0.7846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7987F, 2.9418F, -0.628F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftLeg2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(89, 70).addBox(-0.5052F, 0.8455F, 1.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.7987F, 2.9418F, -0.628F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftLeg2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(45, 92).addBox(-0.5052F, 0.7523F, 1.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(0, 91).addBox(-0.5052F, 0.7523F, 1.6139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7987F, 2.9418F, -0.628F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftLeg2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(90, 23).addBox(-0.5052F, -0.5947F, 1.4995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.7987F, 2.9418F, -0.628F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftLeg2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5052F, -0.7909F, -0.1389F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.7987F, 2.9418F, -0.628F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftLeg2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(66, 86).addBox(-0.5052F, -2.2488F, -0.0419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7987F, 2.9418F, -0.628F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftLeg2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(81, 88).addBox(-1.4F, -0.0065F, -0.0123F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5935F, 1.4619F, -1.2968F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3045F, 3.9362F, -1.7054F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftLeg3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(58, 17).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.1416F, -0.008F, 0.0104F));

		PartDefinition cube_r204 = leftArm7.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(54, 22).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftArm6.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(55, 35).addBox(-1.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1009F, 1.305F, 0.8508F, 0.9216F, 0.1986F, 0.1533F));

		PartDefinition cube_r206 = rightLeg.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(51, 82).addBox(-0.5F, -0.9981F, -0.9886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightLeg.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(77, 59).addBox(-0.5F, -1.0433F, 0.0001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.2991F, -0.0685F, 3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightLeg.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(78, 34).addBox(-0.5F, -0.0114F, -0.2769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightLeg.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(77, 72).addBox(-1.0F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.4609F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightLeg.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(22, 77).addBox(-0.5F, -1.9486F, -1.0595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightLeg.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(88, 10).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightLeg.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(95, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightLeg.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(37, 85).addBox(-0.5F, -0.0388F, -2.2481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3326F, 0.956F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightLeg.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(56, 52).addBox(-0.9963F, -0.0141F, -1.7261F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0037F, 4.8103F, -1.1325F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightLeg.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(46, 82).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightLeg.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(76, 88).addBox(-0.5F, -1.0884F, -2.1449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0068F, 6.2457F, -1.8621F, 0.7572F, 0.0F, 0.0131F));

		PartDefinition cube_r217 = rightLeg2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(97, 86).addBox(-0.2F, 0.169F, -0.9332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0065F, 0.5662F, -0.9841F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightLeg2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(84, 20).addBox(-0.7F, -0.5928F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0065F, 0.1965F, 0.0772F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightLeg2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(32, 82).addBox(-0.7F, -0.7F, -1.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0065F, 1.3965F, 0.9772F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r220 = rightLeg2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(23, 97).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7935F, 3.4388F, -1.0708F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightLeg2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(83, 24).addBox(-1.0F, -2.325F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3065F, 5.3354F, -2.3744F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightLeg2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 97).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3065F, 2.0595F, -1.0197F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightLeg2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(97, 62).addBox(-0.5F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3065F, 1.5895F, -0.3855F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightLeg2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(18, 97).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7935F, 3.8142F, -0.7796F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightLeg2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(96, 89).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7935F, 4.2496F, -0.928F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightLeg2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(92, 3).addBox(-0.5F, -0.8374F, -1.0851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 90).addBox(-0.5F, -0.8374F, -0.8851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7935F, 4.2752F, -1.5501F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r227 = rightLeg2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(91, 57).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7935F, 4.2752F, -1.1501F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r228 = rightLeg2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(66, 90).addBox(-0.4948F, 1.8096F, 0.7846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7987F, 2.9418F, -0.628F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r229 = rightLeg2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 73).addBox(-0.4948F, 0.8455F, 1.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.7987F, 2.9418F, -0.628F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightLeg2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(92, 63).addBox(-0.4948F, 0.7523F, 1.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(10, 91).addBox(-0.4948F, 0.7523F, 1.6139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7987F, 2.9418F, -0.628F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightLeg2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(90, 26).addBox(-0.4948F, -0.5947F, 1.4995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.7987F, 2.9418F, -0.628F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightLeg2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(85, 30).addBox(-0.4948F, -0.7909F, -0.1389F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.7987F, 2.9418F, -0.628F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightLeg2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(42, 87).addBox(-0.4948F, -2.2488F, -0.0419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7987F, 2.9418F, -0.628F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightLeg2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(5, 89).addBox(0.4F, -0.0065F, -0.0123F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5935F, 1.4619F, -1.2968F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3045F, 3.9362F, -1.7054F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightLeg3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(60, 28).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition cube_r236 = rightArm7.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(55, 39).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightArm6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(56, 9).addBox(-2.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 104, 104);
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