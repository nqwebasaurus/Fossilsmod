package fossils.fossils.client.blockentity.model.anteosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnteosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart bone4;
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
	private final ModelPart Tailend3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm7;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart rightArm8;
	private final ModelPart rightArm9;

	public AnteosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.head = this.Neck3.getChild("head");
		this.bone = this.head.getChild("bone");
		this.bone3 = this.head.getChild("bone3");
		this.bone2 = this.head.getChild("bone2");
		this.bone4 = this.head.getChild("bone4");
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
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.leftLeg = this.Hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm7 = this.leftLeg3.getChild("leftArm7");
		this.leftArm6 = this.leftArm7.getChild("leftArm6");
		this.rightLeg4 = this.Hips.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.rightArm8 = this.rightLeg6.getChild("rightArm8");
		this.rightArm9 = this.rightArm8.getChild("rightArm9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.1766F, 13.6358F, -0.211F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(51, 99).addBox(0.0F, -2.0505F, 3.9995F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 98).addBox(0.0F, -2.0505F, 1.9995F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 64).addBox(0.0F, -2.0005F, -0.0005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -2.7127F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(91, 69).addBox(0.0F, -2.1146F, -0.0095F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6373F, -4.8127F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-3.5F, -0.1F, -2.9F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 36).addBox(0.5F, -0.1F, -2.9F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.5F, -0.5F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(61, 62).mirror().addBox(-1.8722F, -1.2617F, -2.0833F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, 1.3838F, 0.082F, -0.3503F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(86, 79).mirror().addBox(-1.8722F, -3.7129F, -0.883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, 2.2565F, 0.082F, -0.3503F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-1.8722F, 0.3274F, -2.6568F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, 1.6892F, 0.082F, -0.3503F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(87, 27).mirror().addBox(-1.8722F, 1.2943F, -3.2905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, 2.0383F, 0.082F, -0.3503F));

		PartDefinition Hips_r8 = Hips.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(31, 87).mirror().addBox(-1.8722F, 2.4528F, -1.396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, 1.5583F, 0.082F, -0.3503F));

		PartDefinition Hips_r9 = Hips.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-1.8722F, 1.0845F, -0.7243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, 1.3402F, 0.082F, -0.3503F));

		PartDefinition Hips_r10 = Hips.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(23, 63).mirror().addBox(-1.8722F, -0.8697F, -0.2423F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, 0.4239F, 0.082F, -0.3503F));

		PartDefinition Hips_r11 = Hips.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(16, 63).mirror().addBox(-1.8722F, -0.8161F, -1.2781F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.5601F, -1.2134F, -0.4924F, 0.082F, -0.3503F));

		PartDefinition Hips_r12 = Hips.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(-2.5F, -0.0423F, -1.3134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(0, 82).mirror().addBox(-2.5F, -0.0423F, -1.0384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(82, 21).addBox(3.3F, -0.0423F, -1.3134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(0, 82).addBox(3.3F, -0.0423F, -1.0384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9F, -2.2714F, -2.4567F, 1.0647F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = Hips.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(90, 66).mirror().addBox(-2.5F, -0.0114F, -0.9882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(90, 66).addBox(3.3F, -0.0114F, -0.9882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9F, -2.8214F, -1.6817F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = Hips.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(83, 84).mirror().addBox(-2.5F, -0.048F, -0.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(83, 84).addBox(3.3F, -0.048F, -0.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9F, -2.3464F, 1.2183F, -1.0734F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = Hips.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-2.5F, -0.0473F, 0.0109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(62, 38).addBox(3.3F, -0.0473F, 0.0109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9F, -2.7214F, 0.2683F, -0.3752F, 0.0F, 0.0F));

		PartDefinition Hips_r16 = Hips.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-2.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(87, 0).addBox(3.3F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9F, -2.2214F, -0.7317F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Hips_r17 = Hips.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(9, 63).mirror().addBox(-2.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(9, 63).addBox(3.3F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.9F, -2.2214F, -0.7317F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Hips.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(-5.4583F, -2.0659F, -0.392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5155F, -4.4682F, 0.0831F, 0.138F, -1.2619F));

		PartDefinition Bodymiddle_r2 = Hips.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(87, 31).mirror().addBox(-1.0171F, 0.2607F, -0.5136F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5155F, -4.4682F, 0.183F, 0.0539F, -0.3006F));

		PartDefinition Bodymiddle_r3 = Hips.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-4.0227F, -0.2378F, -0.4876F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5155F, -4.4682F, 0.1435F, 0.1081F, -0.7791F));

		PartDefinition Hips_r18 = Hips.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(61, 62).addBox(0.8722F, -1.2617F, -2.0833F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, 1.3838F, -0.082F, 0.3503F));

		PartDefinition Hips_r19 = Hips.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(86, 79).addBox(0.8722F, -3.7129F, -0.883F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, 2.2565F, -0.082F, 0.3503F));

		PartDefinition Hips_r20 = Hips.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(45, 64).addBox(0.8722F, 0.3274F, -2.6568F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, 1.6892F, -0.082F, 0.3503F));

		PartDefinition Hips_r21 = Hips.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(87, 27).addBox(0.8722F, 1.2943F, -3.2905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, 2.0383F, -0.082F, 0.3503F));

		PartDefinition Hips_r22 = Hips.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(31, 87).addBox(0.8722F, 2.4528F, -1.396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, 1.5583F, -0.082F, 0.3503F));

		PartDefinition Hips_r23 = Hips.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(85, 3).addBox(0.8722F, 1.0845F, -0.7243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, 1.3402F, -0.082F, 0.3503F));

		PartDefinition Hips_r24 = Hips.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(23, 63).addBox(0.8722F, -0.8697F, -0.2423F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, 0.4239F, -0.082F, 0.3503F));

		PartDefinition Hips_r25 = Hips.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(16, 63).addBox(0.8722F, -0.8161F, -1.2781F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.2F, -0.5601F, -1.2134F, -0.4924F, -0.082F, 0.3503F));

		PartDefinition Bodymiddle_r4 = Hips.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(41, 83).addBox(3.4583F, -2.0659F, -0.392F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5155F, -4.4682F, -0.0011F, -0.164F, 1.2746F));

		PartDefinition Bodymiddle_r5 = Hips.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(69, 36).addBox(1.0227F, -0.2378F, -0.4876F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5155F, -4.4682F, 0.0814F, -0.1699F, 0.7878F));

		PartDefinition Bodymiddle_r6 = Hips.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(87, 31).addBox(0.0171F, 0.2607F, -0.5136F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5155F, -4.4682F, 0.157F, -0.1372F, 0.3031F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.425F, -11.375F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6905F, -5.2932F, 0.2654F, -0.1264F, -0.0342F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(81, 88).addBox(0.0F, -3.8204F, 1.9341F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.225F, -4.375F, -0.48F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(25, 87).addBox(0.0F, -3.2204F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.125F, -4.475F, -0.48F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(28, 83).addBox(0.0F, -5.0F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.425F, -10.675F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(25, 81).addBox(0.0F, -4.3F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.425F, -10.575F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(22, 81).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.425F, -10.375F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.125F, -1.675F, -0.0185F, 0.0306F, -1.2665F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.125F, -1.675F, 0.0036F, 0.0598F, -0.7869F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.125F, -1.675F, 0.0367F, 0.0755F, -0.3061F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(81, 40).mirror().addBox(-5.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.325F, -3.975F, 0.0515F, 0.0265F, -1.754F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(69, 14).mirror().addBox(-6.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.325F, -3.975F, 0.0668F, 0.0222F, -1.1429F));

		PartDefinition Bodymiddle_r18 = Bodymiddle.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.325F, -3.975F, 0.0754F, 0.0129F, -0.663F));

		PartDefinition Bodymiddle_r19 = Bodymiddle.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.325F, -3.975F, 0.0787F, 0.0007F, -0.1831F));

		PartDefinition Bodymiddle_r20 = Bodymiddle.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(69, 10).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -5.875F, 0.0526F, 0.0179F, -1.754F));

		PartDefinition Bodymiddle_r21 = Bodymiddle.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -5.875F, 0.0628F, 0.0144F, -1.143F));

		PartDefinition Bodymiddle_r22 = Bodymiddle.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -5.875F, 0.0683F, 0.0079F, -0.6631F));

		PartDefinition Bodymiddle_r23 = Bodymiddle.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(68, 62).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -5.875F, 0.0701F, -0.0004F, -0.1832F));

		PartDefinition Bodymiddle_r24 = Bodymiddle.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(53, 32).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -7.975F, 0.0504F, -0.0001F, -1.6668F));

		PartDefinition Bodymiddle_r25 = Bodymiddle.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -7.975F, 0.0507F, 0.001F, -1.056F));

		PartDefinition Bodymiddle_r26 = Bodymiddle.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -7.975F, 0.0513F, 0.0016F, -0.576F));

		PartDefinition Bodymiddle_r27 = Bodymiddle.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(61, 67).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -7.975F, 0.0522F, 0.0018F, -0.096F));

		PartDefinition Bodymiddle_r28 = Bodymiddle.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-8.8427F, -7.3717F, -0.1147F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -9.875F, 0.044F, 0.0344F, -1.6322F));

		PartDefinition Bodymiddle_r29 = Bodymiddle.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -9.875F, 0.0652F, 0.0329F, -1.021F));

		PartDefinition Bodymiddle_r30 = Bodymiddle.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -9.875F, 0.0789F, 0.0232F, -0.5409F));

		PartDefinition Bodymiddle_r31 = Bodymiddle.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.425F, -9.875F, 0.0866F, 0.0082F, -0.0611F));

		PartDefinition Bodymiddle_r32 = Bodymiddle.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(81, 75).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.125F, -1.675F, 0.063F, 0.0077F, 0.3052F));

		PartDefinition Bodymiddle_r33 = Bodymiddle.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(69, 16).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.125F, -1.675F, 0.0653F, 0.0019F, 0.7851F));

		PartDefinition Bodymiddle_r34 = Bodymiddle.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(69, 34).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.125F, -1.675F, 0.0647F, -0.0044F, 1.2651F));

		PartDefinition Bodymiddle_r35 = Bodymiddle.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(80, 31).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.325F, -3.975F, 0.0787F, -0.0007F, 0.1831F));

		PartDefinition Bodymiddle_r36 = Bodymiddle.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(69, 12).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.325F, -3.975F, 0.0754F, -0.0129F, 0.663F));

		PartDefinition Bodymiddle_r37 = Bodymiddle.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(69, 14).addBox(3.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.325F, -3.975F, 0.0668F, -0.0222F, 1.1429F));

		PartDefinition Bodymiddle_r38 = Bodymiddle.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(81, 40).addBox(3.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.325F, -3.975F, 0.0515F, -0.0265F, 1.754F));

		PartDefinition Bodymiddle_r39 = Bodymiddle.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(68, 62).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -5.875F, 0.0701F, 0.0004F, 0.1832F));

		PartDefinition Bodymiddle_r40 = Bodymiddle.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(68, 64).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -5.875F, 0.0683F, -0.0079F, 0.6631F));

		PartDefinition Bodymiddle_r41 = Bodymiddle.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(69, 8).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -5.875F, 0.0628F, -0.0144F, 1.143F));

		PartDefinition Bodymiddle_r42 = Bodymiddle.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(69, 10).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -5.875F, 0.0526F, -0.0179F, 1.754F));

		PartDefinition Bodymiddle_r43 = Bodymiddle.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(61, 67).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -7.975F, 0.048F, -0.0453F, 0.0961F));

		PartDefinition Bodymiddle_r44 = Bodymiddle.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(5, 68).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -7.975F, 0.0275F, -0.0382F, 0.5765F));

		PartDefinition Bodymiddle_r45 = Bodymiddle.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(14, 68).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -7.975F, 0.0127F, -0.0225F, 1.0564F));

		PartDefinition Bodymiddle_r46 = Bodymiddle.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(53, 32).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -7.975F, 0.007F, 0.0042F, 1.6667F));

		PartDefinition Bodymiddle_r47 = Bodymiddle.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(49, 39).addBox(3.8427F, -7.3717F, -0.1147F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -9.875F, 0.044F, -0.0344F, 1.6322F));

		PartDefinition Bodymiddle_r48 = Bodymiddle.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(52, 67).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -9.875F, 0.0652F, -0.0329F, 1.021F));

		PartDefinition Bodymiddle_r49 = Bodymiddle.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(67, 42).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -9.875F, 0.0789F, -0.0232F, 0.5409F));

		PartDefinition Bodymiddle_r50 = Bodymiddle.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(66, 23).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.425F, -9.875F, 0.0866F, -0.0082F, 0.0611F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(41, 53).addBox(-1.5F, 7.0748F, -7.8758F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(91, 56).addBox(-0.5F, 7.0748F, -5.8758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3542F, -11.2902F, 0.0216F, -0.0436F, -0.0009F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(55, 80).addBox(0.0F, -4.348F, 2.0242F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4732F, -3.257F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(73, 80).addBox(0.0F, -3.448F, 0.0242F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4982F, -3.107F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(5, 89).addBox(0.0F, -3.0954F, 0.0095F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -5.082F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(33, 91).addBox(0.0F, -2.5826F, 0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -7.032F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(74, 73).mirror().addBox(-0.35F, -0.5F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.5748F, -5.7758F, 0.0F, 0.5672F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(41, 49).mirror().addBox(-1.5F, -0.675F, -1.075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.3582F, 6.7946F, -8.0742F, -0.2896F, -0.163F, 0.6055F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(9, 50).mirror().addBox(-2.9695F, -0.9414F, -0.0144F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 6.5078F, -10.4597F, -0.5188F, 0.4636F, 0.2913F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(0.0F, -0.933F, -2.016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 8.0078F, -5.8597F, -0.0436F, 0.5236F, 0.0F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(76, 96).mirror().addBox(-0.3178F, -0.2863F, -1.8587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.1F, 1.9182F, -7.4271F, 0.9795F, -0.3218F, 0.2833F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(51, 96).mirror().addBox(-0.2833F, 0.3511F, 3.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(96, 50).mirror().addBox(-0.2833F, 0.6511F, 3.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 2.8182F, -7.4271F, 1.7247F, -0.2581F, 0.4145F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(91, 51).mirror().addBox(-0.454F, -0.8369F, -0.0521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(31, 83).mirror().addBox(-0.454F, -0.4369F, -0.7521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-5.0095F, 4.4652F, -8.5289F, 0.7701F, -0.3218F, 0.0215F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-0.454F, -0.8136F, -0.854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0095F, 4.4652F, -8.5289F, 1.3373F, -0.3218F, 0.0215F));

		PartDefinition Bodyfront_r13 = Bodyfront.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-0.5F, -0.4666F, -2.0305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9F, 1.9182F, -7.4271F, 0.8573F, -0.3218F, 0.2833F));

		PartDefinition Bodyfront_r14 = Bodyfront.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(97, 59).mirror().addBox(-0.2833F, -1.2243F, 1.922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(43, 42).mirror().addBox(-0.2833F, -0.8243F, -0.078F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 2.8182F, -7.4271F, 1.0091F, -0.2581F, 0.4145F));

		PartDefinition Bodyfront_r15 = Bodyfront.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-0.2833F, 0.1586F, 2.8419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 20).mirror().addBox(-0.2833F, -0.8414F, -0.1581F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-5.4F, 2.8182F, -7.4271F, 1.4105F, -0.2581F, 0.4145F));

		PartDefinition Bodymiddle_r51 = Bodyfront.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(63, 84).mirror().addBox(-5.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, 0.0413F, 0.1994F, -1.7685F));

		PartDefinition Bodymiddle_r52 = Bodyfront.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(70, 51).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, 0.1588F, 0.1692F, -1.1475F));

		PartDefinition Bodymiddle_r53 = Bodyfront.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, 0.2247F, 0.1011F, -0.6678F));

		PartDefinition Bodymiddle_r54 = Bodyfront.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -6.5848F, 0.2516F, 0.0107F, -0.1955F));

		PartDefinition Bodymiddle_r55 = Bodyfront.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(56, 41).mirror().addBox(-7.9732F, -6.3816F, -0.1665F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.0343F, 0.0861F, -1.6157F));

		PartDefinition Bodymiddle_r56 = Bodyfront.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(23, 70).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.0871F, 0.0807F, -1.0027F));

		PartDefinition Bodymiddle_r57 = Bodyfront.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(23, 68).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.1383F, 0.0178F, -0.0434F));

		PartDefinition Bodymiddle_r58 = Bodyfront.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3792F, -4.5348F, 0.1204F, 0.0555F, -0.5222F));

		PartDefinition Bodymiddle_r59 = Bodyfront.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.1216F, 0.0091F, -0.1306F));

		PartDefinition Bodymiddle_r60 = Bodyfront.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(67, 69).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.1096F, 0.0401F, -0.6097F));

		PartDefinition Bodymiddle_r61 = Bodyfront.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.0846F, 0.062F, -1.0898F));

		PartDefinition Bodymiddle_r62 = Bodyfront.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(55, 23).mirror().addBox(-7.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5792F, -2.5598F, 0.0431F, 0.0694F, -1.702F));

		PartDefinition Bodymiddle_r63 = Bodyfront.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(17, 72).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, 0.0693F, 0.0055F, -0.0874F));

		PartDefinition Bodymiddle_r64 = Bodyfront.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(49, 69).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, 0.0648F, 0.0128F, -0.5673F));

		PartDefinition Bodymiddle_r65 = Bodyfront.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, 0.0575F, 0.0172F, -1.0473F));

		PartDefinition Bodymiddle_r66 = Bodyfront.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(53, 30).mirror().addBox(-8.8427F, -7.3717F, -0.1148F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7542F, -0.5098F, 0.0467F, 0.0171F, -1.6583F));

		PartDefinition Bodyfront_r16 = Bodyfront.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(51, 96).addBox(-0.7167F, 0.3511F, 3.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(96, 50).addBox(-0.7167F, 0.6511F, 3.5521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.4F, 2.8182F, -7.4271F, 1.7247F, 0.2581F, -0.4145F));

		PartDefinition Bodyfront_r17 = Bodyfront.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(73, 29).addBox(-0.7167F, 0.1586F, 2.8419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 20).addBox(-0.7167F, -0.8414F, -0.1581F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.4F, 2.8182F, -7.4271F, 1.4105F, 0.2581F, -0.4145F));

		PartDefinition Bodyfront_r18 = Bodyfront.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(97, 59).addBox(-0.7167F, -1.2243F, 1.922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(43, 42).addBox(-0.7167F, -0.8243F, -0.078F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.4F, 2.8182F, -7.4271F, 1.0091F, 0.2581F, -0.4145F));

		PartDefinition Bodyfront_r19 = Bodyfront.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(76, 96).addBox(-0.6822F, -0.2863F, -1.8587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.1F, 1.9182F, -7.4271F, 0.9795F, 0.3218F, -0.2833F));

		PartDefinition Bodyfront_r20 = Bodyfront.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(91, 51).addBox(-0.546F, -0.8369F, -0.0521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(31, 83).addBox(-0.546F, -0.4369F, -0.7521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.0095F, 4.4652F, -8.5289F, 0.7701F, 0.3218F, -0.0215F));

		PartDefinition Bodyfront_r21 = Bodyfront.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(66, 30).addBox(-0.546F, -0.8136F, -0.854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.0095F, 4.4652F, -8.5289F, 1.3373F, 0.3218F, -0.0215F));

		PartDefinition Bodyfront_r22 = Bodyfront.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(71, 4).addBox(-0.5F, -0.4666F, -2.0305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 1.9182F, -7.4271F, 0.8573F, 0.3218F, -0.2833F));

		PartDefinition Bodyfront_r23 = Bodyfront.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(71, 18).addBox(-1.0F, -0.933F, -2.016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.5F, 8.0078F, -5.8597F, -0.0436F, -0.5236F, 0.0F));

		PartDefinition Bodyfront_r24 = Bodyfront.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(74, 73).addBox(-0.65F, -0.5F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0F, 7.5748F, -5.7758F, 0.0F, -0.5672F, 0.0F));

		PartDefinition Bodyfront_r25 = Bodyfront.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(41, 49).addBox(-1.5F, -0.675F, -1.075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.3582F, 6.7946F, -8.0742F, -0.2896F, 0.163F, -0.6055F));

		PartDefinition Bodyfront_r26 = Bodyfront.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(9, 50).addBox(-0.0305F, -0.9414F, -0.0144F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.5F, 6.5078F, -10.4597F, -0.5188F, -0.4636F, -0.2913F));

		PartDefinition Bodyfront_r27 = Bodyfront.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(27, 9).addBox(-2.5F, -1.0F, -1.9F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.5078F, -8.8597F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r28 = Bodyfront.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.9018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r67 = Bodyfront.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(83, 68).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, 0.2516F, -0.0107F, 0.1955F));

		PartDefinition Bodymiddle_r68 = Bodyfront.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(70, 49).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, 0.2247F, -0.1011F, 0.6678F));

		PartDefinition Bodymiddle_r69 = Bodyfront.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(70, 51).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, 0.1588F, -0.1692F, 1.1475F));

		PartDefinition Bodymiddle_r70 = Bodyfront.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(63, 84).addBox(3.9732F, -6.3816F, -0.1665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -6.5848F, 0.0413F, -0.1994F, 1.7685F));

		PartDefinition Bodymiddle_r71 = Bodyfront.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(14, 70).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.1204F, -0.0555F, 0.5222F));

		PartDefinition Bodymiddle_r72 = Bodyfront.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(23, 68).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.1383F, -0.0178F, 0.0434F));

		PartDefinition Bodymiddle_r73 = Bodyfront.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(23, 70).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.0871F, -0.0807F, 1.0027F));

		PartDefinition Bodymiddle_r74 = Bodyfront.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(56, 41).addBox(3.9732F, -6.3816F, -0.1665F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3792F, -4.5348F, 0.0343F, -0.0861F, 1.6157F));

		PartDefinition Bodymiddle_r75 = Bodyfront.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(55, 23).addBox(3.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.0431F, -0.0694F, 1.702F));

		PartDefinition Bodymiddle_r76 = Bodyfront.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(58, 69).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.0846F, -0.062F, 1.0898F));

		PartDefinition Bodymiddle_r77 = Bodyfront.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(67, 69).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.1096F, -0.0401F, 0.6097F));

		PartDefinition Bodymiddle_r78 = Bodyfront.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(5, 70).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5792F, -2.5598F, 0.1216F, -0.0091F, 0.1306F));

		PartDefinition Bodymiddle_r79 = Bodyfront.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(53, 30).addBox(3.8427F, -7.3717F, -0.1148F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.0467F, -0.0171F, 1.6583F));

		PartDefinition Bodymiddle_r80 = Bodyfront.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(40, 69).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.0575F, -0.0172F, 1.0473F));

		PartDefinition Bodymiddle_r81 = Bodyfront.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(49, 69).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.0648F, -0.0128F, 0.5673F));

		PartDefinition Bodymiddle_r82 = Bodyfront.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(17, 72).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7542F, -0.5098F, 0.0693F, -0.0055F, 0.0874F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -0.4905F, -1.9026F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(98, 72).addBox(0.0F, -2.4905F, -1.6526F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3017F, -6.8405F, -0.1945F, -0.2142F, 0.0418F));

		PartDefinition Bodymiddle_r83 = Neck.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(76, 84).mirror().addBox(-5.8168F, -5.3293F, -0.1566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, 0.0071F, 0.3022F, -1.7789F));

		PartDefinition Bodymiddle_r84 = Neck.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-6.1894F, -2.1787F, -0.3213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, 0.1933F, 0.2718F, -1.1418F));

		PartDefinition Bodymiddle_r85 = Neck.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, 0.3028F, 0.1765F, -0.6589F));

		PartDefinition Bodymiddle_r86 = Neck.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(98, 83).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2809F, -1.4443F, 0.3547F, 0.0431F, -0.1946F));

		PartDefinition Bodymiddle_r87 = Neck.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(76, 84).addBox(3.8168F, -5.3293F, -0.1566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, 0.0071F, -0.3022F, 1.7789F));

		PartDefinition Bodymiddle_r88 = Neck.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(70, 55).addBox(3.1894F, -2.1787F, -0.3213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, 0.1933F, -0.2718F, 1.1418F));

		PartDefinition Bodymiddle_r89 = Neck.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(70, 53).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, 0.3028F, -0.1765F, 0.6589F));

		PartDefinition Bodymiddle_r90 = Neck.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(98, 83).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2809F, -1.4443F, 0.3547F, -0.0431F, 0.1946F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(52, 53).addBox(-0.5F, -0.489F, -3.0025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 99).addBox(0.0F, -2.089F, -2.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.005F, -1.826F, -0.5391F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r91 = Neck2.addOrReplaceChild("Bodymiddle_r91", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-3.9973F, 0.0647F, -0.5861F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1859F, -1.6183F, 0.688F, 0.5401F, -0.6866F));

		PartDefinition Bodymiddle_r92 = Neck2.addOrReplaceChild("Bodymiddle_r92", CubeListBuilder.create().texOffs(56, 43).addBox(-0.0027F, 0.0647F, -0.5861F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1859F, -1.6183F, 0.688F, -0.5401F, 0.6866F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(30, 42).addBox(-0.5F, -0.489F, -5.0026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0222F, -2.9346F, 0.2708F, -0.2921F, -0.0789F));

		PartDefinition Neck_r1 = Neck3.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(77, 61).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -2.0026F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck3.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(98, 98).addBox(0.0F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -0.0026F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r93 = Neck3.addOrReplaceChild("Bodymiddle_r93", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(-1.9973F, 0.0647F, -0.6361F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2082F, -2.6837F, 0.4079F, 0.9226F, -0.8993F));

		PartDefinition Bodymiddle_r94 = Neck3.addOrReplaceChild("Bodymiddle_r94", CubeListBuilder.create().texOffs(70, 57).mirror().addBox(-2.9973F, 0.0647F, -0.4861F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2082F, -0.6837F, 0.3495F, 0.6078F, -0.9472F));

		PartDefinition Bodymiddle_r95 = Neck3.addOrReplaceChild("Bodymiddle_r95", CubeListBuilder.create().texOffs(84, 77).addBox(-0.0027F, 0.0647F, -0.6361F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2082F, -2.6837F, 0.4079F, -0.9226F, 0.8993F));

		PartDefinition Bodymiddle_r96 = Neck3.addOrReplaceChild("Bodymiddle_r96", CubeListBuilder.create().texOffs(70, 57).addBox(-0.0027F, 0.0647F, -0.4861F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2082F, -0.6837F, 0.3495F, -0.6078F, 0.9472F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.2648F, -0.2323F, -0.3634F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.4142F, 0.1891F, -0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.6826F, -11.3079F, -0.1389F, -0.0984F, 0.0707F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(95, 3).mirror().addBox(-0.4142F, 0.4193F, -0.6579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.6826F, -11.3079F, -0.008F, -0.0984F, 0.0707F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(94, 92).mirror().addBox(-0.3908F, -0.3089F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(5, 95).mirror().addBox(-0.3908F, -0.0089F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.6826F, -11.3079F, -0.2699F, -0.0768F, 0.0938F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 95).mirror().addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0497F)).mirror(false)
				.texOffs(86, 95).mirror().addBox(-0.5F, -0.8F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-2.8099F, -0.1394F, -4.7086F, 1.0328F, -0.6787F, 0.0597F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-0.4439F, -0.0516F, -0.4905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, 1.6101F, -0.7376F, -0.1079F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(-0.4439F, 0.1462F, -0.477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, 2.0377F, -0.7376F, -0.1079F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(92, 59).mirror().addBox(-0.5F, -0.5433F, 0.1085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 92).mirror().addBox(-0.5F, -0.5433F, -0.2915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.5138F, -5.3704F, -0.3765F, -0.3013F, 0.3125F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(41, 92).mirror().addBox(-0.5F, -0.6055F, -1.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.5138F, -5.3704F, -0.0711F, -0.3013F, 0.3125F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-0.6227F, -2.6495F, -0.442F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.9021F, -5.1049F, 2.2229F, -0.1921F, -0.0302F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 100).mirror().addBox(-0.6227F, -3.7713F, -1.3686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 34).mirror().addBox(-0.8227F, -4.1713F, -1.0686F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.9021F, -5.1049F, 1.8738F, -0.1921F, -0.0302F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 94).mirror().addBox(-0.626F, 0.0102F, 0.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(18, 94).mirror().addBox(-0.626F, 0.3102F, 0.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, -0.218F, -0.5957F, 0.0445F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.6474F, 0.9079F, -0.0368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, 0.0587F, -0.6159F, 0.0151F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 53).mirror().addBox(-0.6474F, 0.5925F, 0.1574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, -0.0722F, -0.6159F, 0.0151F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(13, 94).mirror().addBox(-0.626F, -0.0416F, 0.3773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, -0.3489F, -0.5957F, 0.0445F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-1.0704F, -0.319F, 0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, -0.3059F, -0.2073F, 0.0741F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-1.0788F, 0.4208F, 0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, -0.0405F, -0.2266F, 0.0485F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(92, 28).mirror().addBox(-1.0704F, 0.0899F, 0.7005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, -0.175F, -0.2073F, 0.0741F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-1.0788F, 0.801F, 0.4661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, 0.0904F, -0.2266F, 0.0485F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(23, 92).mirror().addBox(-1.4316F, 1.4761F, -0.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(92, 22).mirror().addBox(-1.4316F, 0.9761F, -0.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(92, 0).mirror().addBox(-1.4316F, 0.4761F, -0.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.8104F, 4.0746F, -9.8815F, 0.3602F, -0.1172F, 0.0307F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 19).mirror().addBox(-1.4316F, 1.163F, 0.1771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(8, 92).mirror().addBox(-1.4316F, 0.663F, 0.1771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8104F, 4.0746F, -9.8815F, 0.2293F, -0.1172F, 0.0307F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(90, 13).mirror().addBox(-1.3499F, -0.1151F, 0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8104F, 4.0746F, -9.8815F, 0.0809F, -0.1014F, 0.1096F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(84, 91).mirror().addBox(-1.3499F, -0.0831F, 0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.8104F, 4.0746F, -9.8815F, -0.0936F, -0.1014F, 0.1096F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(1.2215F, -1.7104F, -1.4462F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 1.9108F, -0.6547F, -0.1824F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-0.1179F, -2.0607F, -0.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 0.4264F, -0.1748F, 0.05F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(-1.2184F, 0.2315F, 0.0813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8104F, 4.0746F, -9.8815F, 1.2732F, -0.1784F, 0.1371F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 91).mirror().addBox(-0.475F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.7515F, 2.2576F, -9.2936F, 2.0552F, -0.3015F, -0.0588F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(88, 39).mirror().addBox(-0.772F, -3.3693F, 1.6136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.9521F, -5.3049F, 2.2285F, -0.1049F, 0.0386F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(-2.7118F, 0.0949F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(18, 91).mirror().addBox(-2.5868F, 0.0949F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(13, 91).mirror().addBox(-2.4618F, -0.1051F, -1.2908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)).mirror(false), PartPose.offsetAndRotation(-1.6132F, -0.0522F, -3.0712F, -0.7343F, -0.6787F, 0.0597F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(53, 71).mirror().addBox(-1.151F, -1.2036F, -2.8578F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9632F, -0.2522F, -2.6712F, 0.1745F, -0.5014F, -0.0338F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(17, 27).mirror().addBox(-0.1063F, -0.6989F, 0.5532F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.9F, -6.5F, 0.3849F, -0.6717F, -0.1926F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 62).mirror().addBox(-2.3655F, -0.7823F, -1.0021F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9632F, -0.2522F, -2.6712F, -0.2048F, -0.683F, 0.05F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-2.4618F, 0.073F, -1.5524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.052F)).mirror(false), PartPose.offsetAndRotation(-1.6132F, -0.0522F, -3.0712F, -0.2151F, -0.6787F, 0.0597F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(91, 95).mirror().addBox(-1.3789F, -0.8843F, -1.0896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(-2.4089F, 0.4146F, -3.8459F, 0.3871F, -0.6787F, 0.0597F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 95).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-2.8099F, -0.1394F, -4.7086F, 1.1637F, -0.6787F, 0.0597F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(55, 13).mirror().addBox(-0.497F, -3.1693F, 1.6136F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(29, 54).mirror().addBox(-0.497F, -1.4693F, -0.0864F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.9021F, -5.1049F, 2.2285F, -0.1049F, 0.0386F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(46, 71).mirror().addBox(-0.7861F, 0.8921F, -0.4072F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, 2.0024F, -0.3482F, -0.0482F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-0.1429F, -0.2111F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 74).mirror().addBox(-0.1429F, 1.2716F, 0.663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 1.5347F, -0.1748F, 0.05F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(43, 98).mirror().addBox(-0.1429F, 0.0114F, 0.299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 1.971F, -0.1748F, 0.05F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(88, 7).mirror().addBox(-0.1429F, -0.0494F, -0.1688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(87, 21).mirror().addBox(-0.1429F, -1.0494F, 0.0812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, -0.2368F, -0.1748F, 0.05F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-0.1429F, -1.8405F, 0.8524F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, -0.0186F, -0.1748F, 0.05F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(87, 63).mirror().addBox(-0.1429F, 1.1819F, -0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 1.0286F, -0.1748F, 0.05F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 86).mirror().addBox(-0.1429F, 0.8057F, 0.1889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 2.1019F, -0.1748F, 0.05F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(87, 60).mirror().addBox(-0.1429F, 1.3354F, -0.4726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 1.6394F, -0.1748F, 0.05F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 50).mirror().addBox(-0.1179F, 1.9251F, -1.7322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 1.9449F, -0.1748F, 0.05F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(38, 98).mirror().addBox(-0.1179F, 2.386F, -1.4713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 1.5522F, -0.1748F, 0.05F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 57).mirror().addBox(-0.1179F, 0.5364F, 0.2603F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 0.1559F, -0.1748F, 0.05F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(76, 80).mirror().addBox(-0.1179F, 1.2649F, 0.8308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 0.6359F, -0.1748F, 0.05F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(39, 71).mirror().addBox(-0.1179F, -3.0079F, -1.911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, -1.4411F, -0.1748F, 0.05F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(-0.1179F, -3.4364F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, -0.5771F, -0.1748F, 0.05F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(58, 82).mirror().addBox(-0.1179F, -2.491F, 1.3364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 0.1646F, -0.1748F, 0.05F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(-2.2085F, -1.8573F, -0.5592F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9632F, -0.2522F, -2.6712F, 0.4393F, -0.5652F, -0.0489F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-0.1179F, -1.0749F, -0.4065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, 0.0774F, -0.1748F, 0.05F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-2.3655F, -1.0107F, -2.62F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9632F, -0.2522F, -2.6712F, 0.1443F, -0.683F, 0.05F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 7).mirror().addBox(-0.1179F, -0.6931F, -0.9283F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.8632F, -0.1902F, -3.268F, -0.1757F, -0.1748F, 0.05F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(-1.6128F, 1.3642F, -1.5066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9632F, -0.2522F, -2.6712F, -0.1399F, -0.2186F, 0.0142F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.497F, -2.4643F, -0.1503F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.9021F, -5.1049F, 2.1849F, -0.1049F, 0.0386F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 61).mirror().addBox(-0.497F, -3.4007F, -0.5824F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.9021F, -5.1049F, 2.0103F, -0.1049F, 0.0386F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(32, 71).mirror().addBox(-0.7861F, 0.6675F, -0.4869F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3396F, 3.3641F, -11.2618F, 1.5748F, -0.3482F, -0.0482F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(91, 42).addBox(-0.5561F, 0.1462F, -0.477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, 2.0377F, 0.7376F, 0.1079F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(46, 71).addBox(-1.2139F, 0.8921F, -0.4072F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, 2.0024F, 0.3482F, 0.0482F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(78, 4).addBox(-1.5561F, -0.0516F, -0.4905F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, 1.6101F, 0.7376F, 0.1079F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(32, 71).addBox(-1.2139F, 0.6675F, -0.4869F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, 1.5748F, 0.3482F, 0.0482F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(28, 91).addBox(-0.525F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.7515F, 2.2576F, -9.2936F, 2.0552F, 0.3015F, 0.0588F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(88, 39).addBox(-0.228F, -3.3693F, 1.6136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9F, 1.9521F, -5.3049F, 2.2285F, 0.1049F, -0.0386F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(55, 13).addBox(-1.503F, -3.1693F, 1.6136F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(29, 54).addBox(-1.503F, -1.4693F, -0.0864F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9F, 1.9021F, -5.1049F, 2.2285F, 0.1049F, -0.0386F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 56).addBox(-1.503F, -2.4643F, -0.1503F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.9021F, -5.1049F, 2.1849F, 0.1049F, -0.0386F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(36, 61).addBox(-1.503F, -3.4007F, -0.5824F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9F, 1.9021F, -5.1049F, 2.0103F, 0.1049F, -0.0386F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(38, 54).addBox(0.6227F, -2.6495F, -0.442F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.9021F, -5.1049F, 2.2229F, 0.1921F, 0.0302F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(10, 100).addBox(0.6227F, -3.7713F, -1.3686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 34).addBox(-1.1773F, -4.1713F, -1.0686F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.9021F, -5.1049F, 1.8738F, 0.1921F, 0.0302F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(84, 91).addBox(0.3499F, -0.0831F, 0.3515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.8104F, 4.0746F, -9.8815F, -0.0936F, 0.1014F, -0.1096F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(90, 13).addBox(0.3499F, -0.1151F, 0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8104F, 4.0746F, -9.8815F, 0.0809F, 0.1014F, -0.1096F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(94, 92).addBox(-0.6092F, -0.3089F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(5, 95).addBox(-0.6092F, -0.0089F, -0.474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.2F, 3.6826F, -11.3079F, -0.2699F, 0.0768F, -0.0938F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(95, 3).addBox(-0.5858F, 0.4193F, -0.6579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.2F, 3.6826F, -11.3079F, -0.008F, 0.0984F, -0.0707F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(95, 9).addBox(-0.5858F, 0.1891F, -0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2F, 3.6826F, -11.3079F, -0.1389F, 0.0984F, -0.0707F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(95, 12).addBox(-0.6091F, -0.2637F, -0.3806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 3.6826F, -11.3079F, -0.4008F, 0.0768F, -0.0938F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(13, 94).addBox(-0.374F, -0.0416F, 0.3773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, -0.3489F, 0.5957F, -0.0445F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(96, 53).addBox(-0.3526F, 0.5925F, 0.1574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, -0.0722F, 0.6159F, -0.0151F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(28, 94).addBox(-0.374F, 0.0102F, 0.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(18, 94).addBox(-0.374F, 0.3102F, 0.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, -0.218F, 0.5957F, -0.0445F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 96).addBox(-0.3526F, 0.9079F, -0.0368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, 0.0587F, 0.6159F, -0.0151F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(92, 25).addBox(0.0788F, 0.801F, 0.4661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, 0.0904F, 0.2266F, -0.0485F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(92, 28).addBox(0.0704F, 0.0899F, 0.7005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, -0.175F, 0.2073F, -0.0741F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(92, 31).addBox(0.0788F, 0.4208F, 0.642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, -0.0405F, 0.2266F, -0.0485F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(36, 92).addBox(0.0704F, -0.319F, 0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3396F, 3.3641F, -11.2618F, -0.3059F, 0.2073F, -0.0741F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(23, 92).addBox(0.4316F, 1.4761F, -0.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(92, 22).addBox(0.4316F, 0.9761F, -0.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(92, 0).addBox(0.4316F, 0.4761F, -0.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.8104F, 4.0746F, -9.8815F, 0.3602F, 0.1172F, -0.0307F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 19).addBox(0.4316F, 1.163F, 0.1771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(8, 92).addBox(0.4316F, 0.663F, 0.1771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8104F, 4.0746F, -9.8815F, 0.2293F, 0.1172F, -0.0307F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(67, 38).addBox(0.2184F, 0.2315F, 0.0813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8104F, 4.0746F, -9.8815F, 1.2732F, 0.1784F, -0.1371F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(78, 12).addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.33F, -11.1229F, 1.4006F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(91, 80).mirror().addBox(0.0F, -0.006F, 0.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.875F, -11.5F, 0.7309F, -0.192F, -0.1943F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(0.0F, -0.1348F, 1.0003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.875F, -11.5F, 0.6F, -0.192F, -0.1943F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(91, 80).addBox(-1.0F, -0.006F, 0.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.875F, -11.5F, 0.7309F, 0.192F, 0.1943F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(10, 85).addBox(-1.0F, -0.1348F, 1.0003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.875F, -11.5F, 0.6F, 0.192F, 0.1943F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(91, 77).addBox(-0.5F, -0.006F, 0.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.875F, -11.575F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5F, -0.1348F, 1.0003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.875F, -11.575F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(17, 27).addBox(-0.8937F, -0.6989F, 0.5532F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.9F, -6.5F, 0.3849F, 0.6717F, 0.1926F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(44, 7).addBox(-1.5F, -1.15F, -1.3F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.9F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 14).addBox(-1.0F, -0.0403F, -1.973F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.625F, -8.3F, 0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 77).addBox(-1.0F, -0.6703F, -0.815F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 77).addBox(-1.0F, -0.9953F, -0.965F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4657F, -6.3288F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(76, 68).addBox(-1.0F, -1.0123F, -0.9944F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 2.9657F, -5.4288F, 0.5236F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(41, 92).addBox(-0.5F, -0.6055F, -1.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.5138F, -5.3704F, -0.0711F, 0.3013F, -0.3125F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(46, 92).addBox(-0.5F, -0.5433F, -0.2915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(92, 59).addBox(-0.5F, -0.5433F, 0.1085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.5138F, -5.3704F, -0.3765F, 0.3013F, -0.3125F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(57, 0).addBox(-1.0F, 0.4F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4157F, -5.7288F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(9, 54).addBox(-1.0F, 0.0153F, -1.9958F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -7.3F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(71, 25).addBox(-1.0F, 0.0153F, -0.9857F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.6F, -6.6F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(63, 57).addBox(-0.8821F, 0.5364F, 0.2603F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 0.1559F, 0.1748F, -0.05F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(98, 37).addBox(-0.8571F, -0.2111F, -0.2848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 74).addBox(-0.8571F, 1.2716F, 0.663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 1.5347F, 0.1748F, -0.05F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(43, 98).addBox(-0.8571F, 0.0114F, 0.299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 1.971F, 0.1748F, -0.05F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(71, 86).addBox(-0.8571F, 0.8057F, 0.1889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 2.1019F, 0.1748F, -0.05F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(88, 7).addBox(-0.8571F, -0.0494F, -0.1688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(87, 21).addBox(-0.8571F, -1.0494F, 0.0812F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, -0.2368F, 0.1748F, -0.05F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(31, 75).addBox(-0.8571F, -1.8405F, 0.8524F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, -0.0186F, 0.1748F, -0.05F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(87, 63).addBox(-0.8571F, 1.1819F, -0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 1.0286F, 0.1748F, -0.05F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(87, 60).addBox(-0.8571F, 1.3354F, -0.4726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 1.6394F, 0.1748F, -0.05F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(44, 26).addBox(-2.2215F, -1.7104F, -1.4462F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 1.9108F, 0.6547F, 0.1824F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(20, 50).addBox(-0.8821F, 1.9251F, -1.7322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 1.9449F, 0.1748F, -0.05F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(38, 98).addBox(-0.8821F, 2.386F, -1.4713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 1.5522F, 0.1748F, -0.05F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(76, 80).addBox(-0.8821F, 1.2649F, 0.8308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 0.6359F, 0.1748F, -0.05F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(55, 7).addBox(-0.8821F, -0.6931F, -0.9283F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, -0.1757F, 0.1748F, -0.05F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(71, 90).addBox(0.6128F, 1.3642F, -1.5066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9632F, -0.2522F, -2.6712F, -0.1399F, 0.2186F, -0.0142F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(50, 80).addBox(-0.8821F, -1.0749F, -0.4065F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 0.0774F, 0.1748F, -0.05F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(39, 71).addBox(-0.8821F, -3.0079F, -1.911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, -1.4411F, 0.1748F, -0.05F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(76, 90).addBox(-0.8821F, -3.4364F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, -0.5771F, 0.1748F, -0.05F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(58, 82).addBox(-0.8821F, -2.491F, 1.3364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 0.1646F, 0.1748F, -0.05F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(56, 45).addBox(-1.8821F, -2.0607F, -0.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(3.8632F, -0.1902F, -3.268F, 0.4264F, 0.1748F, -0.05F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(63, 49).addBox(0.2085F, -1.8573F, -0.5592F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9632F, -0.2522F, -2.6712F, 0.4393F, 0.5652F, 0.0489F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 45).addBox(-1.0F, -1.8F, -1.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.54F, -3.026F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(17, 34).addBox(-2.5F, -0.0004F, 0.023F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, -4.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(86, 95).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0497F))
				.texOffs(86, 95).addBox(-0.5F, -0.8F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(2.8099F, -0.1394F, -4.7086F, 1.0328F, 0.6787F, -0.0597F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(86, 95).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(2.8099F, -0.1394F, -4.7086F, 1.1637F, 0.6787F, -0.0597F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(91, 95).addBox(0.3789F, -0.8843F, -1.0896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(2.4089F, 0.4146F, -3.8459F, 0.3871F, 0.6787F, -0.0597F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(97, 62).addBox(1.4618F, 0.073F, -1.5524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.052F)), PartPose.offsetAndRotation(1.6132F, -0.0522F, -3.0712F, -0.2151F, 0.6787F, -0.0597F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(89, 86).addBox(1.7118F, 0.0949F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(18, 91).addBox(1.5868F, 0.0949F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 91).addBox(1.4618F, -0.1051F, -1.2908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)), PartPose.offsetAndRotation(1.6132F, -0.0522F, -3.0712F, -0.7343F, 0.6787F, -0.0597F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(54, 62).addBox(0.3655F, -0.7823F, -1.0021F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9632F, -0.2522F, -2.6712F, -0.2048F, 0.683F, -0.05F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(53, 71).addBox(-0.849F, -1.2036F, -2.8578F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9632F, -0.2522F, -2.6712F, 0.1745F, 0.5014F, 0.0338F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 50).addBox(0.3655F, -1.0107F, -2.62F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9632F, -0.2522F, -2.6712F, 0.1443F, 0.683F, -0.05F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9462F, -1.7657F, -4.8829F, -0.0538F, 0.174F, -0.0336F));

		PartDefinition cube_r130 = bone.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 65).addBox(-0.3918F, -1.0007F, -1.0568F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 65).addBox(-0.3918F, -1.0007F, -0.7568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2276F, 0.1524F, -0.1528F, -0.3262F, 0.0698F, 0.616F));

		PartDefinition cube_r131 = bone.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(62, 13).addBox(-0.3918F, -0.9608F, -0.3063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2276F, 0.1524F, -0.1528F, -0.9021F, 0.0698F, 0.616F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9462F, -1.7657F, -4.8829F, -0.0538F, -0.174F, 0.0336F));

		PartDefinition cube_r132 = bone3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.6082F, -1.0007F, -1.0568F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 65).mirror().addBox(-0.6082F, -1.0007F, -0.7568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2276F, 0.1524F, -0.1528F, -0.3262F, -0.0698F, -0.616F));

		PartDefinition cube_r133 = bone3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(62, 13).mirror().addBox(-0.6082F, -0.9608F, -0.3063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2276F, 0.1524F, -0.1528F, -0.9021F, -0.0698F, -0.616F));

		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1148F, -1.617F, -4.7784F, 0.0135F, 0.164F, 0.3188F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(26, 72).addBox(-0.9898F, -1.0827F, -1.0453F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 87).addBox(-0.9898F, -1.0827F, -0.7453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5488F, 0.1921F, -0.1528F, -0.3044F, 0.0201F, 0.5787F));

		PartDefinition cube_r135 = bone2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(20, 87).addBox(-0.9898F, -1.0358F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5488F, 0.1921F, -0.1528F, -0.8804F, 0.0201F, 0.5787F));

		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1148F, -1.617F, -4.7784F, 0.0135F, -0.164F, -0.3188F));

		PartDefinition cube_r136 = bone4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(26, 72).mirror().addBox(-0.0102F, -1.0827F, -1.0453F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 87).mirror().addBox(-0.0102F, -1.0827F, -0.7453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5488F, 0.1921F, -0.1528F, -0.3044F, -0.0201F, -0.5787F));

		PartDefinition cube_r137 = bone4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-0.0102F, -1.0358F, -0.3414F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5488F, 0.1921F, -0.1528F, -0.8804F, -0.0201F, -0.5787F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0869F, -1.7997F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(66, 86).mirror().addBox(0.8237F, -0.1717F, -0.7687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(78, 7).mirror().addBox(0.8237F, -1.1717F, -0.0687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.5F, -3.6F, -1.1939F, -0.1219F, 0.0555F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(96, 41).mirror().addBox(-0.4F, -0.575F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(96, 41).addBox(-0.2909F, -0.575F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6546F, 3.5428F, -8.4769F, -1.4591F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(33, 98).mirror().addBox(-0.0917F, 0.25F, -0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -1.4741F, -0.4708F, 0.0418F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(0.0793F, 0.1091F, -1.0089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1414F, 3.736F, -7.035F, -1.4741F, -0.4708F, 0.0418F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(8, 89).mirror().addBox(0.0607F, -0.9814F, -0.9626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1414F, 3.736F, -7.035F, -1.3669F, -0.173F, 0.0489F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(99, 85).mirror().addBox(1.0237F, 0.8063F, -0.3487F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.5F, -3.6F, -1.8921F, -0.1219F, 0.0555F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(78, 99).mirror().addBox(1.0237F, 1.7871F, -1.1915F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 34).mirror().addBox(0.8237F, 1.7871F, -0.8915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(36, 95).mirror().addBox(0.8237F, 1.7871F, 0.0085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.5F, -3.6F, -1.2376F, -0.1219F, 0.0555F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-0.0917F, -0.3115F, 0.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -2.0414F, -0.4708F, 0.0418F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(0.0793F, 0.3595F, 0.116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1414F, 3.736F, -7.035F, -2.0414F, -0.4708F, 0.0418F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(0.0793F, -0.1668F, -0.1713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1414F, 3.736F, -7.035F, -1.5614F, -0.4708F, 0.0418F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(41, 95).mirror().addBox(0.0607F, -1.1489F, -0.1105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1414F, 3.736F, -7.035F, -1.4105F, -0.173F, 0.0489F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(76, 86).mirror().addBox(0.8237F, -0.0688F, -1.21F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 2.5F, -3.6F, -1.063F, -0.1219F, 0.0555F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 78).mirror().addBox(0.2281F, -0.1833F, -1.6849F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.05F, 1.5F, -2.375F, -0.7733F, -0.662F, -0.0883F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(0.2281F, -0.2496F, -1.5077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.05F, 1.5F, -2.375F, -1.358F, -0.662F, -0.0883F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(47, 58).mirror().addBox(0.3409F, -2.5964F, 2.2188F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.1632F, -2.2902F, -1.768F, -1.5702F, -0.2147F, 0.0469F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(94, 86).mirror().addBox(0.3409F, -0.518F, 3.3588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(81, 94).mirror().addBox(0.3409F, -0.518F, 3.6588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1632F, -2.2902F, -1.768F, -0.8721F, -0.2147F, 0.0469F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(23, 95).mirror().addBox(0.3409F, -2.8042F, 3.78F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1632F, -2.2902F, -1.768F, -1.3957F, -0.2147F, 0.0469F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(0.3409F, 1.38F, 4.386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1632F, -2.2902F, -1.768F, -0.6103F, -0.2147F, 0.0469F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(46, 89).mirror().addBox(-0.8292F, 0.2759F, -0.1493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -0.0444F, 0.4943F, 3.1118F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(71, 96).mirror().addBox(-0.8546F, -0.3139F, -0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -0.3682F, 0.4595F, 3.0048F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-0.8292F, -0.0194F, -0.0368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -0.1753F, 0.4943F, 3.1118F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-0.8148F, -0.6293F, -0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -0.4991F, 0.4595F, 3.0048F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-0.8931F, 0.4349F, -1.1532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, 0.0673F, 0.5014F, 3.1294F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(81, 97).mirror().addBox(-0.9618F, 0.1027F, -0.939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -0.2597F, 0.4773F, 3.0181F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(-0.8931F, 0.2692F, -1.0112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -0.0636F, 0.5014F, 3.1294F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(96, 47).mirror().addBox(-0.9618F, -0.0924F, -0.827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.55F, 3.2012F, -7.7749F, -0.3906F, 0.4773F, 3.0181F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(-1.8422F, 1.6983F, -5.3816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.5F, -3.6F, -0.5878F, 0.1049F, 2.9972F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(96, 44).mirror().addBox(-1.6464F, 0.8396F, -5.8932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.5F, -3.6F, -0.3016F, 0.1497F, 3.0887F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(46, 95).mirror().addBox(-1.8422F, 1.2835F, -5.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.5F, -3.6F, -0.4569F, 0.1049F, 2.9972F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-1.6464F, 0.3631F, -6.0678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.5F, -3.6F, -0.1707F, 0.1497F, 3.0887F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(61, 86).mirror().addBox(0.3409F, 0.7048F, -4.7114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1632F, -2.2902F, -1.768F, 1.3096F, -0.2147F, 0.0469F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(0.2281F, -2.0653F, -1.56F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.05F, 1.5F, -2.375F, 1.7836F, -0.662F, -0.0883F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(0.3409F, 3.3083F, -0.177F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.1632F, -2.2902F, -1.768F, -0.0605F, -0.2147F, 0.0469F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(0.3409F, 3.3807F, -1.5025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.1632F, -2.2902F, -1.768F, 0.5242F, -0.2147F, 0.0469F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(66, 86).addBox(-1.8237F, -0.1717F, -0.7687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(78, 7).addBox(-1.8237F, -1.1717F, -0.0687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.5F, -3.6F, -1.1939F, 0.1219F, -0.0555F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(33, 98).addBox(-0.9083F, 0.25F, -0.364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -1.4741F, 0.4708F, -0.0418F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(98, 6).addBox(-1.0793F, 0.1091F, -1.0089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1414F, 3.736F, -7.035F, -1.4741F, 0.4708F, -0.0418F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(8, 89).addBox(-1.0607F, -0.9814F, -0.9626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1414F, 3.736F, -7.035F, -1.3669F, 0.173F, -0.0489F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(99, 85).addBox(-1.0237F, 0.8063F, -0.3487F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.5F, -3.6F, -1.8921F, 0.1219F, -0.0555F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(78, 99).addBox(-1.0237F, 1.7871F, -1.1915F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 34).addBox(-1.8237F, 1.7871F, -0.8915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(36, 95).addBox(-1.8237F, 1.7871F, 0.0085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.5F, -3.6F, -1.2376F, 0.1219F, -0.0555F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(88, 83).addBox(-0.9083F, -0.3115F, 0.1984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -2.0414F, 0.4708F, -0.0418F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(84, 88).addBox(-1.0793F, 0.3595F, 0.116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1414F, 3.736F, -7.035F, -2.0414F, 0.4708F, -0.0418F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 98).addBox(-1.0793F, -0.1668F, -0.1713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1414F, 3.736F, -7.035F, -1.5614F, 0.4708F, -0.0418F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(41, 95).addBox(-1.0607F, -1.1489F, -0.1105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1414F, 3.736F, -7.035F, -1.4105F, 0.173F, -0.0489F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(76, 86).addBox(-1.8237F, -0.0688F, -1.21F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 2.5F, -3.6F, -1.063F, 0.1219F, -0.0555F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(17, 78).addBox(-1.2281F, -0.1833F, -1.6849F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.05F, 1.5F, -2.375F, -0.7733F, 0.662F, 0.0883F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(5, 72).addBox(-1.2281F, -0.2496F, -1.5077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.05F, 1.5F, -2.375F, -1.358F, 0.662F, 0.0883F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(47, 58).addBox(-1.3409F, -2.5964F, 2.2188F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(4.1632F, -2.2902F, -1.768F, -1.5702F, 0.2147F, -0.0469F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(94, 86).addBox(-1.3409F, -0.518F, 3.3588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(81, 94).addBox(-1.3409F, -0.518F, 3.6588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1632F, -2.2902F, -1.768F, -0.8721F, 0.2147F, -0.0469F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(23, 95).addBox(-1.3409F, -2.8042F, 3.78F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1632F, -2.2902F, -1.768F, -1.3957F, 0.2147F, -0.0469F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(20, 98).addBox(-1.3409F, 1.38F, 4.386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1632F, -2.2902F, -1.768F, -0.6103F, 0.2147F, -0.0469F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(46, 89).addBox(-0.1708F, 0.2759F, -0.1493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -0.0444F, -0.4943F, -3.1118F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(71, 96).addBox(-0.1454F, -0.3139F, -0.016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -0.3682F, -0.4595F, -3.0048F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(28, 97).addBox(-0.1708F, -0.0194F, -0.0618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -0.1753F, -0.4943F, -3.1118F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 83).addBox(-0.1852F, -0.6293F, -0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -0.4991F, -0.4595F, -3.0048F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(57, 4).addBox(-0.1069F, 0.4349F, -1.1532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, 0.0673F, -0.5014F, -3.1294F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(81, 97).addBox(-0.0382F, 0.1027F, -0.939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -0.2597F, -0.4773F, -3.0181F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(97, 30).addBox(-0.1069F, 0.2692F, -1.0112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -0.0636F, -0.5014F, -3.1294F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(96, 47).addBox(-0.0382F, -0.0924F, -0.827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.55F, 3.2012F, -7.7749F, -0.3906F, -0.4773F, -3.0181F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(66, 90).addBox(0.8422F, 1.6983F, -5.3816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.4F, 2.5F, -3.6F, -0.5878F, -0.1049F, -2.9972F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(96, 44).addBox(0.6464F, 0.8396F, -5.8932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.4F, 2.5F, -3.6F, -0.3016F, -0.1497F, -3.0887F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(46, 95).addBox(0.8422F, 1.2835F, -5.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(2.4F, 2.5F, -3.6F, -0.4569F, -0.1049F, -2.9972F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(91, 45).addBox(0.6464F, 0.3631F, -6.0678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.4F, 2.5F, -3.6F, -0.1707F, -0.1497F, -3.0887F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(61, 86).addBox(-1.3409F, 0.7048F, -4.7114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1632F, -2.2902F, -1.768F, 1.3096F, 0.2147F, -0.0469F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(62, 8).addBox(-1.2281F, -2.0653F, -1.56F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.05F, 1.5F, -2.375F, 1.7836F, 0.662F, 0.0883F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(64, 25).addBox(-1.3409F, 3.3083F, -0.177F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.1632F, -2.2902F, -1.768F, -0.0605F, 0.2147F, -0.0469F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(64, 18).addBox(-1.3409F, 3.3807F, -1.5025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.1632F, -2.2902F, -1.768F, 0.5242F, 0.2147F, -0.0469F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5213F, 5.2797F, -6.5144F, 0.0455F, 0.218F, -0.6847F));

		PartDefinition cube_r205 = leftarm.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(67, 73).addBox(0.0F, -0.4105F, -1.814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 4.8672F, 0.9031F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftarm.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(91, 35).addBox(0.0F, -0.4067F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.8672F, 0.9031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftarm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(36, 85).addBox(0.5008F, -1.4247F, -0.0156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0118F, -0.2961F, 0.0756F, -1.9985F, 0.0014F, -0.001F));

		PartDefinition cube_r208 = leftarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(85, 15).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0095F, 0.7983F, 0.3962F, -1.5622F, 0.0014F, -0.001F));

		PartDefinition cube_r209 = leftarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(85, 11).addBox(-0.0047F, -2.1689F, 0.0735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 4.9673F, 0.1378F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r210 = leftarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(43, 75).addBox(-0.4992F, -1.6295F, 0.5799F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0098F, 2.8347F, -1.4751F, 0.3708F, 0.0014F, -0.001F));

		PartDefinition cube_r211 = leftarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 73).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.01F, 0.838F, -0.8057F, 0.3272F, 0.0014F, -0.001F));

		PartDefinition cube_r212 = leftarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(96, 80).addBox(-0.5F, -0.55F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0111F, -0.1352F, -0.8661F, -1.2218F, 0.0014F, -0.001F));

		PartDefinition cube_r213 = leftarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(96, 95).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(96, 77).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0111F, 0.7176F, -1.5206F, -0.6546F, 0.0014F, -0.001F));

		PartDefinition cube_r214 = leftarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(92, 62).addBox(-0.5F, -1.2725F, -0.0373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 5.0418F, 0.0908F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(5, 81).addBox(0.0F, -0.3F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.1885F, 0.4014F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(90, 16).addBox(0.0F, 0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5644F, 6.3209F, 1.0886F, -0.5673F, -0.1071F, 0.7454F));

		PartDefinition cube_r217 = leftarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(94, 69).addBox(-1.0378F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.8461F, 1.1201F, 1.5708F, 0.1396F, -1.5708F));

		PartDefinition cube_r218 = leftarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 90).addBox(0.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(89, 89).addBox(0.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, 1.1298F, -0.0451F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r219 = leftarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(63, 80).addBox(-1.3599F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.8702F, 1.3549F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r220 = leftarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(30, 63).addBox(-0.559F, -0.121F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.4486F, -1.5795F));

		PartDefinition cube_r221 = leftarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(51, 86).addBox(-0.6095F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.1694F, -1.5795F));

		PartDefinition cube_r222 = leftarm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(51, 90).addBox(-1.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(95, 15).addBox(-1.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, -1.5708F, -1.1868F, 1.5621F));

		PartDefinition cube_r223 = leftarm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 71).addBox(-0.0572F, -0.0033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.6454F, 0.0086F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3764F, 5.8624F, 0.5698F, -0.0608F, -0.0188F, -0.0456F));

		PartDefinition cube_r224 = leftArm3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(75, 22).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, -0.096F, -0.0002F, 0.0001F));

		PartDefinition cube_r225 = leftArm4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(9, 59).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offset(-0.0127F, 0.7642F, -1.4173F));

		PartDefinition cube_r226 = leftArm5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(52, 49).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5213F, 5.2797F, -6.5144F, -0.7228F, -0.2523F, 0.599F));

		PartDefinition cube_r227 = rightarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(74, 38).addBox(-1.0F, -0.4105F, -1.814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 4.8672F, 0.9031F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r228 = rightarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(91, 48).addBox(-1.0F, -0.4067F, 0.0129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 4.8672F, 0.9031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r229 = rightarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(86, 42).addBox(-1.5008F, -1.4247F, -0.0156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0118F, -0.2961F, 0.0756F, -1.9985F, -0.0014F, 0.001F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(86, 35).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0095F, 0.7983F, 0.3962F, -1.5622F, -0.0014F, 0.001F));

		PartDefinition cube_r231 = rightarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 86).addBox(-0.9953F, -2.1689F, 0.0735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 4.9673F, 0.1378F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r232 = rightarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(48, 75).addBox(-0.5008F, -1.6295F, 0.5799F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0098F, 2.8347F, -1.4751F, 0.3708F, -0.0014F, 0.001F));

		PartDefinition cube_r233 = rightarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(17, 74).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.01F, 0.838F, -0.8057F, 0.3272F, -0.0014F, 0.001F));

		PartDefinition cube_r234 = rightarm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(97, 21).addBox(-0.5F, -0.55F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0111F, -0.1352F, -0.8661F, -1.2218F, -0.0014F, 0.001F));

		PartDefinition cube_r235 = rightarm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(97, 18).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(15, 97).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0111F, 0.7176F, -1.5206F, -0.6546F, -0.0014F, 0.001F));

		PartDefinition cube_r236 = rightarm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(56, 93).addBox(-0.5F, -1.2725F, -0.0373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 5.0418F, 0.0908F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightarm.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(10, 81).addBox(-1.0F, -0.3F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.1885F, 0.4014F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightarm.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(56, 90).addBox(-1.0F, 0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5644F, 6.3209F, 1.0886F, -0.8613F, 0.3793F, -0.5193F));

		PartDefinition cube_r239 = rightarm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(94, 89).addBox(0.0378F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.8461F, 1.1201F, 1.5708F, -0.1396F, 1.5708F));

		PartDefinition cube_r240 = rightarm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(90, 10).addBox(-1.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(90, 3).addBox(-1.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, 1.1298F, -0.0451F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r241 = rightarm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(68, 80).addBox(0.3599F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.8702F, 1.3549F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r242 = rightarm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 64).addBox(-0.441F, -0.121F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.4486F, 1.5795F));

		PartDefinition cube_r243 = rightarm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(56, 86).addBox(-0.3905F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.1694F, 1.5795F));

		PartDefinition cube_r244 = rightarm2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(61, 90).addBox(0.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(95, 65).addBox(0.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, -1.5708F, 1.1868F, -1.5621F));

		PartDefinition cube_r245 = rightarm2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(12, 72).addBox(-0.9428F, -0.0033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.6454F, 0.0086F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3764F, 5.8624F, 0.5698F, -0.0608F, 0.0188F, 0.0456F));

		PartDefinition cube_r246 = rightArm3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(36, 75).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, 1.3875F, 0.0002F, -0.0001F));

		PartDefinition cube_r247 = rightArm4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(27, 59).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightArm5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(53, 26).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.442F, -0.0094F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.002F))
				.texOffs(70, 59).addBox(0.5F, 0.058F, 0.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(70, 66).addBox(0.5F, 0.058F, 2.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(60, 71).addBox(0.2F, 0.058F, 4.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(69, 71).addBox(-0.2F, 0.058F, 6.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(85, 19).addBox(0.5F, 0.058F, 8.9906F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(70, 59).mirror().addBox(-3.5F, 0.058F, 0.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(70, 66).mirror().addBox(-3.5F, 0.058F, 2.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(60, 71).mirror().addBox(-3.2F, 0.058F, 4.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(69, 71).mirror().addBox(-2.8F, 0.058F, 6.9906F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(85, 19).mirror().addBox(-2.5F, 0.058F, 8.9906F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(99, 91).addBox(0.0F, -1.242F, 0.9906F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 3).addBox(0.0F, -1.242F, 2.9906F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 9).addBox(0.0F, -1.242F, 4.9906F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 12).addBox(0.0F, -1.142F, 6.9906F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 15).addBox(0.0F, -1.042F, 8.9906F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2756F, 2.0903F, -0.2835F, -0.163F, -0.0869F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(92, 98).addBox(0.0F, 4.0F, 5.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 98).addBox(0.0F, 2.1F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 98).addBox(0.0F, 0.8F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 100).addBox(0.0F, -0.7F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.258F, 1.4906F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(85, 25).addBox(0.4F, -0.0932F, -0.0378F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 54).addBox(0.1F, -0.0932F, 1.9622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 33).addBox(-0.3F, -0.0932F, 3.9622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 25).mirror().addBox(-2.4F, -0.0932F, -0.0378F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 54).mirror().addBox(-2.1F, -0.0932F, 1.9622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 33).mirror().addBox(-1.7F, -0.0932F, 3.9622F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 99).addBox(0.0F, -1.0932F, -0.0378F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 99).addBox(0.0F, -1.0932F, 1.9622F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 99).addBox(0.0F, -1.0932F, 3.9622F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.162F, 10.9918F, 0.0272F, -0.1745F, -0.0047F));

		PartDefinition Tailbase_r2 = Tailmiddlebase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(48, 98).addBox(0.0F, 7.1F, 9.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 98).addBox(0.0F, 5.5F, 7.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.096F, -9.5012F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(15, 42).addBox(-0.5F, -0.3875F, -0.2931F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(16, 100).addBox(0.0F, -0.7875F, 0.7069F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 100).addBox(0.0F, -0.6875F, 2.7069F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 65).addBox(0.0F, -0.6875F, 4.7069F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.272F, 5.0551F, 0.1629F, -0.2585F, -0.042F));

		PartDefinition Tailbase_r3 = Tailmiddleend.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(66, 99).addBox(0.0F, 10.8F, 13.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 99).addBox(0.0F, 9.2F, 11.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.368F, -14.5562F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(25, 14).addBox(-0.5F, -0.32F, -0.0358F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F))
				.texOffs(81, 100).addBox(0.0F, -0.52F, 0.9642F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 101).addBox(0.0F, -0.42F, 2.9642F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0527F, 5.4637F, 0.235F, -0.0424F, -0.0102F));

		PartDefinition Tailbase_r4 = Tailend.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(99, 88).addBox(0.0F, 15.6F, 19.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 99).addBox(0.0F, 14.1F, 17.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 68).addBox(0.0F, 12.4F, 15.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4207F, -20.0199F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(25, 24).addBox(-0.5F, -0.32F, -0.0358F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.007F, 7.816F, 0.337F, 0.4313F, 0.0684F));

		PartDefinition Tailbase_r5 = Tailend2.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(75, 99).addBox(0.0F, 18.5F, 23.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 99).addBox(0.0F, 17.1F, 21.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4137F, -27.836F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.32F, -0.0358F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0182F, 7.8906F, 0.2694F, 0.4787F, -0.0367F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1896F, 1.3128F, -0.5826F, 0.8128F, -0.2984F, -0.0659F));

		PartDefinition cube_r249 = leftLeg.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(79, 42).addBox(-1.5F, -0.9981F, -0.9886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftLeg.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(22, 78).addBox(-1.5F, -1.0433F, 0.0001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -1.2992F, -0.0685F, 3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftLeg.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(30, 49).addBox(-1.5F, -0.0114F, -0.1769F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftLeg.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(77, 77).addBox(-1.0F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.4609F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftLeg.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(81, 36).addBox(-0.5F, 0.0514F, -0.0595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftLeg.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(53, 75).addBox(-0.5F, -1.0494F, -0.0909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.3326F, -0.569F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftLeg.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5F, -0.0388F, -0.9481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3326F, 0.956F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftLeg.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(72, 44).addBox(-1.0F, -4.5F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 9.0428F, 0.1933F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftLeg.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(78, 15).addBox(-1.0F, -1.05F, -1.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(38, 57).addBox(-1.0F, -0.25F, -1.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.7289F, -0.9338F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftLeg.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(46, 85).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.2806F, -1.0837F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftLeg.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(86, 56).addBox(-0.5F, 0.0116F, -1.0449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.7505F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.2589F, -2.2204F, 0.9317F, 0.0F, -0.0131F));

		PartDefinition cube_r260 = leftLeg2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(79, 48).addBox(-1.3F, 0.169F, -0.9332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1048F, -0.7611F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r261 = leftLeg2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(79, 45).addBox(-1.3F, -0.5928F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftLeg2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(78, 33).addBox(-1.3F, -0.7F, -1.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftLeg2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(82, 64).addBox(-0.6F, -0.3848F, -0.2826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9F, 3.3513F, -0.7202F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftLeg2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(80, 28).addBox(-1.0F, -1.025F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 0).addBox(-1.0F, -1.525F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, 4.6644F, -2.1514F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftLeg2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(51, 93).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 1.3886F, -0.7967F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftLeg2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(93, 6).addBox(-0.5F, -0.725F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 0.9185F, -0.1625F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftLeg2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(36, 89).addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 4.017F, -0.9669F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftLeg2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(93, 38).addBox(-0.3F, 1.5282F, -3.6042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(0, 93).addBox(-0.3F, 1.5282F, -4.2042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 3.4409F, 2.4011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftLeg2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(96, 56).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.2419F, 1.2948F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftLeg2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(89, 92).addBox(-0.5F, -0.725F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8F, 1.1205F, 1.4896F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftLeg2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(10, 97).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(97, 0).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8F, 0.5997F, 1.0669F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftLeg2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(56, 96).addBox(-0.5F, -2.7475F, -3.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.8F, 0.7983F, 4.512F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftLeg2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(82, 60).addBox(-0.5F, -0.1929F, -0.7644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.8F, 2.3622F, 0.6535F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftLeg2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(41, 85).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 1.5749F, 0.8286F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftLeg2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(5, 76).addBox(-1.4F, -0.0065F, -0.0123F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 0.7909F, -1.0739F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8582F, -2.0525F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftLeg3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(61, 53).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 1.8182F, 0.0204F, 0.3598F, -0.008F, 0.0104F));

		PartDefinition cube_r277 = leftArm7.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(18, 55).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftArm6.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(18, 59).addBox(-1.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = Hips.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1896F, 1.3128F, -0.5826F, 0.2455F, 0.2984F, 0.0659F));

		PartDefinition cube_r279 = rightLeg4.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(79, 51).addBox(-0.5F, -0.9981F, -0.9886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightLeg4.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(78, 25).addBox(-0.5F, -1.0433F, 0.0001F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.2992F, -0.0685F, 3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightLeg4.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(49, 34).addBox(-0.5F, -0.0114F, -0.1769F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightLeg4.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(10, 78).addBox(-1.0F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.4609F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightLeg4.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(81, 80).addBox(-0.5F, 0.0514F, -0.0595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightLeg4.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -1.0494F, -0.0909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.3326F, -0.569F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightLeg4.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(81, 71).addBox(-0.5F, -0.0388F, -0.9481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3326F, 0.956F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightLeg4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0F, -4.5F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 9.0428F, 0.1933F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightLeg4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(78, 18).addBox(-1.0F, -1.05F, -1.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(54, 58).addBox(-1.0F, -0.25F, -1.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.7289F, -0.9338F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightLeg4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(86, 46).addBox(-0.5F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.2806F, -1.0837F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightLeg4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(86, 70).addBox(-0.5F, 0.0116F, -1.0449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.7505F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.2589F, -2.2204F, 0.539F, 0.0F, 0.0131F));

		PartDefinition cube_r290 = rightLeg5.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(79, 57).addBox(-0.7F, 0.169F, -0.9332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1048F, -0.7611F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightLeg5.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(79, 54).addBox(-0.7F, -0.5928F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightLeg5.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(36, 78).addBox(-0.7F, -0.7F, -1.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightLeg5.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(15, 83).addBox(-0.4F, -0.3848F, -0.2826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.9F, 3.3513F, -0.7202F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightLeg5.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(43, 80).addBox(-1.0F, -1.025F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 80).addBox(-1.0F, -1.525F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 4.6644F, -2.1514F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightLeg5.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(76, 93).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 1.3886F, -0.7967F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightLeg5.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(93, 74).addBox(-0.5F, -0.725F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 0.9185F, -0.1625F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightLeg5.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(41, 89).addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 4.017F, -0.9669F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightLeg5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(71, 93).addBox(-0.7F, 1.5282F, -3.6042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(66, 93).addBox(-0.7F, 1.5282F, -4.2042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 3.4409F, 2.4011F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightLeg5.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(66, 96).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 0.2419F, 1.2948F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightLeg5.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(61, 93).addBox(-0.5F, -0.725F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.8F, 1.1205F, 1.4896F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightLeg5.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(97, 27).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(97, 24).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.8F, 0.5997F, 1.0669F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightLeg5.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(61, 96).addBox(-0.5F, -2.7475F, -3.0185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.8F, 0.7983F, 4.512F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightLeg5.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(83, 7).addBox(-0.5F, -0.1929F, -0.7644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.8F, 2.3622F, 0.6535F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightLeg5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 50).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 1.5749F, 0.8286F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightLeg5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(58, 77).addBox(0.4F, -0.0065F, -0.0123F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 0.7909F, -1.0739F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.8582F, -2.0525F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightLeg6.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(62, 4).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm8 = rightLeg6.addOrReplaceChild("rightArm8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 1.8182F, 0.0204F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition cube_r307 = rightArm8.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(55, 19).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm9 = rightArm8.addOrReplaceChild("rightArm9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightArm9.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 60).addBox(-2.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 103, 103);
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