package fossils.fossils.client.blockentity.model.deuterosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DeuterosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart leftFace;
	private final ModelPart rightFace;
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
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddlebase2;
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
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;

	public DeuterosaurusFossilModel(ModelPart root) {
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
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
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
		this.bone = this.Bodyfront.getChild("bone");
		this.bone6 = this.Bodyfront.getChild("bone6");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddlebase2 = this.Tailmiddlebase.getChild("Tailmiddlebase2");
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
		this.bone2 = this.Hips.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.Hips.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.5054F, 18.2633F, -0.4728F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(98, 101).addBox(0.0F, -1.9666F, 2.0589F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 101).addBox(0.0F, -1.9666F, 0.0589F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -0.7127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(60, 101).addBox(0.0F, -1.9005F, -0.0005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -2.7127F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(37, 101).addBox(0.0F, -1.8146F, -0.0095F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6373F, -4.8127F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(54, 36).mirror().addBox(-3.6992F, -0.1F, 1.0826F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 19).mirror().addBox(-3.6992F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(54, 36).addBox(-0.3008F, -0.1F, 1.0826F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-0.3008F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -4.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.2632F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(16, 95).addBox(0.0F, -2.9281F, 0.179F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4811F, -2.0115F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(13, 95).addBox(0.0F, -2.8281F, -0.021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7936F, -3.7841F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(3, 95).addBox(0.0F, -2.9204F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8936F, -5.9841F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1582F, 0.0905F, -0.781F));

		PartDefinition Bodymiddle_r6 = Bodymiddle.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1879F, 0.0316F, -0.3037F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1879F, 0.0316F, -0.3037F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1582F, 0.0905F, -0.781F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(-7.92F, -2.9517F, -0.3458F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1043F, 0.1292F, -1.2624F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(86, 56).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.2075F, 0.0245F, -0.1815F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.1789F, 0.0933F, -0.6575F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(57, 67).mirror().addBox(-6.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.1216F, 0.1412F, -1.1384F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(58, 52).mirror().addBox(-7.9732F, -6.3816F, -0.1665F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.0274F, 0.1552F, -1.7561F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(69, 21).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1582F, -0.0905F, 0.781F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(84, 12).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1879F, -0.0316F, 0.3037F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(82, 70).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1879F, -0.0316F, 0.3037F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(21, 69).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1582F, -0.0905F, 0.781F));

		PartDefinition Bodymiddle_r18 = Bodymiddle.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(58, 21).addBox(3.92F, -2.9517F, -0.3458F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1043F, -0.1292F, 1.2624F));

		PartDefinition Bodymiddle_r19 = Bodymiddle.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(86, 56).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.2075F, -0.0245F, 0.1815F));

		PartDefinition Bodymiddle_r20 = Bodymiddle.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(74, 50).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.1789F, -0.0933F, 0.6575F));

		PartDefinition Bodymiddle_r21 = Bodymiddle.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(57, 67).addBox(3.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.1216F, -0.1412F, 1.1384F));

		PartDefinition Bodymiddle_r22 = Bodymiddle.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(58, 52).addBox(3.9732F, -6.3816F, -0.1665F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.0274F, -0.1552F, 1.7561F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1026F, -5.9083F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition Bodymiddle_r23 = body2.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(91, 80).addBox(0.0F, -3.0957F, -0.0065F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r24 = body2.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(47, 91).addBox(0.0F, -3.295F, -0.1089F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r25 = body2.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.1404F, 0.0033F, -0.2786F));

		PartDefinition Bodymiddle_r26 = body2.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.1289F, 0.0436F, -0.757F));

		PartDefinition Bodymiddle_r27 = body2.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.1001F, 0.0741F, -1.2369F));

		PartDefinition Bodymiddle_r28 = body2.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-7.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.0489F, 0.0882F, -1.8497F));

		PartDefinition Bodymiddle_r29 = body2.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(57, 69).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1401F, 0.0025F, -0.1911F));

		PartDefinition Bodymiddle_r30 = body2.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1291F, 0.0428F, -0.6695F));

		PartDefinition Bodymiddle_r31 = body2.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1006F, 0.0734F, -1.1493F));

		PartDefinition Bodymiddle_r32 = body2.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(54, 25).mirror().addBox(-7.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.0497F, 0.0879F, -1.7621F));

		PartDefinition Bodymiddle_r33 = body2.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(69, 42).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1831F, 0.0093F, -0.1557F));

		PartDefinition Bodymiddle_r34 = body2.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1642F, 0.0686F, -0.6325F));

		PartDefinition Bodymiddle_r35 = body2.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(39, 69).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1199F, 0.1125F, -1.1125F));

		PartDefinition Bodymiddle_r36 = body2.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.0428F, 0.1309F, -1.7277F));

		PartDefinition Bodymiddle_r37 = body2.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.1404F, -0.0033F, 0.2786F));

		PartDefinition Bodymiddle_r38 = body2.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(0, 70).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.1289F, -0.0436F, 0.757F));

		PartDefinition Bodymiddle_r39 = body2.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(66, 69).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.1001F, -0.0741F, 1.2369F));

		PartDefinition Bodymiddle_r40 = body2.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(34, 24).addBox(3.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.0489F, -0.0882F, 1.8497F));

		PartDefinition Bodymiddle_r41 = body2.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(57, 69).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1401F, -0.0025F, 0.1911F));

		PartDefinition Bodymiddle_r42 = body2.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(69, 52).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1291F, -0.0428F, 0.6695F));

		PartDefinition Bodymiddle_r43 = body2.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(69, 44).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1006F, -0.0734F, 1.1493F));

		PartDefinition Bodymiddle_r44 = body2.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(54, 25).addBox(3.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.0497F, -0.0879F, 1.7621F));

		PartDefinition Bodymiddle_r45 = body2.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(69, 42).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1831F, -0.0093F, 0.1557F));

		PartDefinition Bodymiddle_r46 = body2.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(65, 28).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1642F, -0.0686F, 0.6325F));

		PartDefinition Bodymiddle_r47 = body2.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(39, 69).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1199F, -0.1125F, 1.1125F));

		PartDefinition Bodymiddle_r48 = body2.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(19, 8).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.0428F, -0.1309F, 1.7277F));

		PartDefinition Bodymiddle_r49 = body2.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(18, 46).addBox(0.0F, -3.4325F, -0.119F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r50 = body2.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.0911F, -5.9758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -6.0F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition Bodymiddle_r51 = body.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(55, 84).addBox(0.0F, -3.0882F, 0.0368F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r52 = body.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(70, 30).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.1316F, -0.0012F, -0.1556F));

		PartDefinition Bodymiddle_r53 = body.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.1233F, 0.0356F, -0.6343F));

		PartDefinition Bodymiddle_r54 = body.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.0988F, 0.0643F, -1.114F));

		PartDefinition Bodymiddle_r55 = body.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.0534F, 0.0794F, -1.7263F));

		PartDefinition Bodymiddle_r56 = body.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.0408F, 0.1393F, -1.693F));

		PartDefinition Bodymiddle_r57 = body.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.1232F, 0.1205F, -1.077F));

		PartDefinition Bodymiddle_r58 = body.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(65, 36).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.1708F, 0.0742F, -0.597F));

		PartDefinition Bodymiddle_r59 = body.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(70, 8).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.1915F, 0.0113F, -0.1206F));

		PartDefinition Bodymiddle_r60 = body.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.1569F, 0.0071F, -0.1209F));

		PartDefinition Bodymiddle_r61 = body.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.1419F, 0.0545F, -0.5988F));

		PartDefinition Bodymiddle_r62 = body.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(70, 2).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.1066F, 0.0897F, -1.0788F));

		PartDefinition Bodymiddle_r63 = body.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(45, 30).mirror().addBox(-7.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.0451F, 0.1047F, -1.6925F));

		PartDefinition Bodymiddle_r64 = body.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(70, 30).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.1316F, 0.0012F, 0.1556F));

		PartDefinition Bodymiddle_r65 = body.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(70, 12).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.1233F, -0.0356F, 0.6343F));

		PartDefinition Bodymiddle_r66 = body.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(70, 10).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.0988F, -0.0643F, 1.114F));

		PartDefinition Bodymiddle_r67 = body.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(54, 23).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.0534F, -0.0794F, 1.7263F));

		PartDefinition Bodymiddle_r68 = body.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(47, 21).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.0408F, -0.1393F, 1.693F));

		PartDefinition Bodymiddle_r69 = body.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(9, 70).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.1232F, -0.1205F, 1.077F));

		PartDefinition Bodymiddle_r70 = body.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(65, 36).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.1708F, -0.0742F, 0.597F));

		PartDefinition Bodymiddle_r71 = body.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(70, 8).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.1915F, -0.0113F, 0.1206F));

		PartDefinition Bodymiddle_r72 = body.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(70, 6).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.1569F, -0.0071F, 0.1209F));

		PartDefinition Bodymiddle_r73 = body.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(70, 4).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.1419F, -0.0545F, 0.5988F));

		PartDefinition Bodymiddle_r74 = body.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(70, 2).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.1066F, -0.0897F, 1.0788F));

		PartDefinition Bodymiddle_r75 = body.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(45, 30).addBox(3.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.0451F, -0.1047F, 1.6925F));

		PartDefinition Bodymiddle_r76 = body.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(91, 12).addBox(0.0F, -2.855F, 0.0365F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.053F, -6.0088F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r77 = body.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(91, 89).addBox(0.0F, -2.955F, -0.0635F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r78 = body.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.0056F, -6.9631F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(91, 94).addBox(0.0F, -2.7936F, -5.0725F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8221F, -6.8881F, -0.022F, 0.0436F, -0.001F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(94, 94).addBox(0.0F, -2.7734F, -0.0687F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6732F, -0.957F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(88, 90).addBox(0.0F, -2.648F, 0.0242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4982F, -3.107F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(94, 89).addBox(0.0F, -2.4826F, 0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -7.032F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.9018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(43, 33).addBox(-4.7999F, 5.6027F, 1.172F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.2999F, 6.5849F, -6.9685F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(34, 11).addBox(-2.8717F, -0.8989F, -2.0538F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8717F, 12.6043F, -4.789F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(34, 20).addBox(-3.0F, -0.9675F, -1.258F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 12.7272F, -7.4329F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(34, 0).addBox(-3.5F, -0.9799F, -2.9572F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 11.9232F, -9.6541F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(34, 16).addBox(-3.0F, -0.5029F, -1.1612F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 11.4712F, -8.9291F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r79 = Bodyfront.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(84, 84).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -6.4848F, 0.3801F, 0.036F, -0.1925F));

		PartDefinition Bodymiddle_r80 = Bodyfront.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -6.4848F, 0.3291F, 0.1815F, -0.6531F));

		PartDefinition Bodymiddle_r81 = Bodyfront.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(84, 82).mirror().addBox(-5.92F, -2.9517F, -0.3457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -6.4848F, 0.2148F, 0.2882F, -1.1348F));

		PartDefinition Bodymiddle_r82 = Bodyfront.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(57, 71).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.2615F, 0.1269F, -0.5782F));

		PartDefinition Bodymiddle_r83 = Bodyfront.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(84, 80).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.2958F, 0.0171F, -0.1095F));

		PartDefinition Bodymiddle_r84 = Bodyfront.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(71, 40).mirror().addBox(-6.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.1797F, 0.2089F, -1.0581F));

		PartDefinition Bodymiddle_r85 = Bodyfront.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(34, 56).mirror().addBox(-4.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.0346F, 0.2436F, -1.6845F));

		PartDefinition Bodymiddle_r86 = Bodyfront.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(58, 84).mirror().addBox(-5.8427F, -7.3717F, -0.1147F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.0176F, 0.2774F, -1.7584F));

		PartDefinition Bodymiddle_r87 = Bodyfront.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(71, 38).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.1864F, 0.2459F, -1.1261F));

		PartDefinition Bodymiddle_r88 = Bodyfront.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.2847F, 0.1566F, -0.6444F));

		PartDefinition Bodymiddle_r89 = Bodyfront.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(36, 71).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.3298F, 0.0333F, -0.1782F));

		PartDefinition Bodymiddle_r90 = Bodyfront.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(27, 71).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.0305F, 0.1996F, -1.66F));

		PartDefinition Bodymiddle_r91 = Bodyfront.addOrReplaceChild("Bodymiddle_r91", CubeListBuilder.create().texOffs(18, 71).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.1502F, 0.1756F, -1.0383F));

		PartDefinition Bodymiddle_r92 = Bodyfront.addOrReplaceChild("Bodymiddle_r92", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.2201F, 0.1107F, -0.5577F));

		PartDefinition Bodymiddle_r93 = Bodyfront.addOrReplaceChild("Bodymiddle_r93", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.2519F, 0.0213F, -0.0849F));

		PartDefinition Bodymiddle_r94 = Bodyfront.addOrReplaceChild("Bodymiddle_r94", CubeListBuilder.create().texOffs(84, 84).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -6.4848F, 0.3801F, -0.036F, 0.1925F));

		PartDefinition Bodymiddle_r95 = Bodyfront.addOrReplaceChild("Bodymiddle_r95", CubeListBuilder.create().texOffs(66, 71).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -6.4848F, 0.3291F, -0.1815F, 0.6531F));

		PartDefinition Bodymiddle_r96 = Bodyfront.addOrReplaceChild("Bodymiddle_r96", CubeListBuilder.create().texOffs(84, 82).addBox(3.92F, -2.9517F, -0.3457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -6.4848F, 0.2148F, -0.2882F, 1.1348F));

		PartDefinition Bodymiddle_r97 = Bodyfront.addOrReplaceChild("Bodymiddle_r97", CubeListBuilder.create().texOffs(57, 71).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.2615F, -0.1269F, 0.5782F));

		PartDefinition Bodymiddle_r98 = Bodyfront.addOrReplaceChild("Bodymiddle_r98", CubeListBuilder.create().texOffs(84, 80).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.2958F, -0.0171F, 0.1095F));

		PartDefinition Bodymiddle_r99 = Bodyfront.addOrReplaceChild("Bodymiddle_r99", CubeListBuilder.create().texOffs(71, 40).addBox(3.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.1797F, -0.2089F, 1.0581F));

		PartDefinition Bodymiddle_r100 = Bodyfront.addOrReplaceChild("Bodymiddle_r100", CubeListBuilder.create().texOffs(34, 56).addBox(3.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.0346F, -0.2436F, 1.6845F));

		PartDefinition Bodymiddle_r101 = Bodyfront.addOrReplaceChild("Bodymiddle_r101", CubeListBuilder.create().texOffs(58, 84).addBox(3.8427F, -7.3717F, -0.1147F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.0176F, -0.2774F, 1.7584F));

		PartDefinition Bodymiddle_r102 = Bodyfront.addOrReplaceChild("Bodymiddle_r102", CubeListBuilder.create().texOffs(71, 38).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.1864F, -0.2459F, 1.1261F));

		PartDefinition Bodymiddle_r103 = Bodyfront.addOrReplaceChild("Bodymiddle_r103", CubeListBuilder.create().texOffs(74, 36).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.2847F, -0.1566F, 0.6444F));

		PartDefinition Bodymiddle_r104 = Bodyfront.addOrReplaceChild("Bodymiddle_r104", CubeListBuilder.create().texOffs(36, 71).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.3298F, -0.0333F, 0.1782F));

		PartDefinition Bodymiddle_r105 = Bodyfront.addOrReplaceChild("Bodymiddle_r105", CubeListBuilder.create().texOffs(27, 71).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.0305F, -0.1996F, 1.66F));

		PartDefinition Bodymiddle_r106 = Bodyfront.addOrReplaceChild("Bodymiddle_r106", CubeListBuilder.create().texOffs(18, 71).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.1502F, -0.1756F, 1.0383F));

		PartDefinition Bodymiddle_r107 = Bodyfront.addOrReplaceChild("Bodymiddle_r107", CubeListBuilder.create().texOffs(70, 34).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.2201F, -0.1107F, 0.5577F));

		PartDefinition Bodymiddle_r108 = Bodyfront.addOrReplaceChild("Bodymiddle_r108", CubeListBuilder.create().texOffs(70, 32).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.2519F, -0.0213F, 0.0849F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(49, 49).addBox(-0.5F, -0.4905F, -2.9026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3017F, -6.8405F, -0.2685F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -2.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4905F, -1.4026F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r109 = Neck.addOrReplaceChild("Bodymiddle_r109", CubeListBuilder.create().texOffs(85, 19).mirror().addBox(-5.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -1.4443F, 0.3095F, 0.4712F, -1.0203F));

		PartDefinition Bodymiddle_r110 = Neck.addOrReplaceChild("Bodymiddle_r110", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -1.4443F, 0.497F, 0.3026F, -0.5335F));

		PartDefinition Bodymiddle_r111 = Neck.addOrReplaceChild("Bodymiddle_r111", CubeListBuilder.create().texOffs(43, 58).mirror().addBox(-0.9582F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -1.4443F, 0.5796F, 0.0747F, -0.1023F));

		PartDefinition Bodymiddle_r112 = Neck.addOrReplaceChild("Bodymiddle_r112", CubeListBuilder.create().texOffs(85, 19).addBox(3.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -1.4443F, 0.3095F, -0.4712F, 1.0203F));

		PartDefinition Bodymiddle_r113 = Neck.addOrReplaceChild("Bodymiddle_r113", CubeListBuilder.create().texOffs(0, 72).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -1.4443F, 0.497F, -0.3026F, 0.5335F));

		PartDefinition Bodymiddle_r114 = Neck.addOrReplaceChild("Bodymiddle_r114", CubeListBuilder.create().texOffs(43, 58).addBox(-0.0418F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -1.4443F, 0.5796F, -0.0747F, 0.1023F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(40, 49).addBox(-0.5F, -0.5915F, -3.0078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 65).addBox(0.0F, -2.4915F, -1.0078F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, 0.0964F, -0.0317F, 0.0854F));

		PartDefinition Neck_r2 = Neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(88, 95).addBox(0.0F, -1.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5915F, -2.5078F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r115 = Neck2.addOrReplaceChild("Bodymiddle_r115", CubeListBuilder.create().texOffs(72, 14).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -2.6081F, 0.6919F, 0.6244F, -0.7678F));

		PartDefinition Bodymiddle_r116 = Neck2.addOrReplaceChild("Bodymiddle_r116", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -2.6081F, 0.8736F, 0.2994F, -0.3696F));

		PartDefinition Bodymiddle_r117 = Neck2.addOrReplaceChild("Bodymiddle_r117", CubeListBuilder.create().texOffs(9, 72).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -0.6081F, 0.6177F, 0.5625F, -0.8093F));

		PartDefinition Bodymiddle_r118 = Neck2.addOrReplaceChild("Bodymiddle_r118", CubeListBuilder.create().texOffs(98, 24).mirror().addBox(-0.9582F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -0.6081F, 0.7892F, 0.2669F, -0.3932F));

		PartDefinition Bodymiddle_r119 = Neck2.addOrReplaceChild("Bodymiddle_r119", CubeListBuilder.create().texOffs(72, 14).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -2.6081F, 0.6919F, -0.6244F, 0.7678F));

		PartDefinition Bodymiddle_r120 = Neck2.addOrReplaceChild("Bodymiddle_r120", CubeListBuilder.create().texOffs(100, 76).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -2.6081F, 0.8736F, -0.2994F, 0.3696F));

		PartDefinition Bodymiddle_r121 = Neck2.addOrReplaceChild("Bodymiddle_r121", CubeListBuilder.create().texOffs(9, 72).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -0.6081F, 0.6177F, -0.5625F, 0.8093F));

		PartDefinition Bodymiddle_r122 = Neck2.addOrReplaceChild("Bodymiddle_r122", CubeListBuilder.create().texOffs(98, 24).addBox(-0.0418F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -0.6081F, 0.7892F, -0.2669F, 0.3932F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.489F, -5.0025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1893F, -2.9615F, 0.28F, -0.1077F, 0.1078F));

		PartDefinition Neck_r3 = Neck3.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(24, 34).addBox(0.0F, -2.3F, -2.6F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -2.0025F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = Neck3.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(25, 101).addBox(0.0F, -1.7F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -0.0025F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r123 = Neck3.addOrReplaceChild("Bodymiddle_r123", CubeListBuilder.create().texOffs(85, 21).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -3.8682F, 0.5815F, 0.7207F, -1.1571F));

		PartDefinition Bodymiddle_r124 = Neck3.addOrReplaceChild("Bodymiddle_r124", CubeListBuilder.create().texOffs(101, 26).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -3.8682F, 0.8319F, 0.4226F, -0.7049F));

		PartDefinition Bodymiddle_r125 = Neck3.addOrReplaceChild("Bodymiddle_r125", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.6682F, 0.6272F, 0.6528F, -1.0133F));

		PartDefinition Bodymiddle_r126 = Neck3.addOrReplaceChild("Bodymiddle_r126", CubeListBuilder.create().texOffs(100, 87).mirror().addBox(-0.9582F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.6682F, 0.8354F, 0.3462F, -0.5888F));

		PartDefinition Bodymiddle_r127 = Neck3.addOrReplaceChild("Bodymiddle_r127", CubeListBuilder.create().texOffs(85, 21).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -3.8682F, 0.5815F, -0.7207F, 1.1571F));

		PartDefinition Bodymiddle_r128 = Neck3.addOrReplaceChild("Bodymiddle_r128", CubeListBuilder.create().texOffs(101, 26).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -3.8682F, 0.8319F, -0.4226F, 0.7049F));

		PartDefinition Bodymiddle_r129 = Neck3.addOrReplaceChild("Bodymiddle_r129", CubeListBuilder.create().texOffs(72, 23).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.6682F, 0.6272F, -0.6528F, 1.0133F));

		PartDefinition Bodymiddle_r130 = Neck3.addOrReplaceChild("Bodymiddle_r130", CubeListBuilder.create().texOffs(100, 87).addBox(-0.0418F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.6682F, 0.8354F, -0.3462F, 0.5888F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5958F, -4.8353F, 0.131F, 0.0966F, -0.148F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 29).addBox(-0.5F, -0.013F, 0.0216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.3221F, -6.1941F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, 0.0068F, 0.0359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.9001F, -5.3882F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(94, 9).addBox(-0.5F, -0.1244F, -1.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.8309F, -8.0514F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(91, 52).addBox(-0.5F, -0.0164F, -0.9529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.8309F, -8.0514F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 62).addBox(-0.5F, -1.21F, -0.0223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.2559F, -6.9514F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 58).addBox(-1.0F, -2.15F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.5226F, -5.0012F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(85, 41).addBox(-1.0F, -0.0142F, -0.2019F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2789F, -7.5596F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(65, 84).addBox(-0.5F, 0.0F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.6262F, -6.8615F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 88).addBox(-0.5F, -0.75F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.1089F, -1.6911F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(77, 96).addBox(-1.0F, -0.481F, -0.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -3.1499F, -2.2832F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(65, 96).addBox(-1.0F, -0.281F, -0.3619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(59, 62).addBox(-1.0F, -1.156F, -1.8619F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -3.1499F, -2.2832F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 60).addBox(-1.0F, -0.0113F, -1.9495F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1776F, -3.3807F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 32).addBox(-1.0F, -0.0113F, -1.9495F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2038F, -4.3803F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(75, 68).addBox(-0.5F, -1.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5775F, 0.9134F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 46).addBox(-0.5F, -1.2F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1555F, 0.6494F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(45, 72).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3086F, -0.4399F, 1.4312F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -0.3691F, -4.1514F));

		PartDefinition cube_r17 = leftFace.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(13, 34).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.173F, -0.7378F, -0.1205F, 0.7132F, 0.3535F, -0.0779F));

		PartDefinition cube_r18 = leftFace.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(99, 9).addBox(-0.4174F, -1.3396F, -0.802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2596F, 2.0599F, -1.8587F, 0.4068F, 0.3941F, 0.0812F));

		PartDefinition cube_r19 = leftFace.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 9).addBox(-0.55F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.076F, 0.8114F, -1.6396F, 0.8649F, 0.3146F, -0.0384F));

		PartDefinition cube_r20 = leftFace.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 94).addBox(-0.5573F, -1.4608F, -0.9182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2596F, 2.0599F, -1.8587F, 0.9052F, 0.2761F, 0.1022F));

		PartDefinition cube_r21 = leftFace.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(67, 17).addBox(-0.5912F, -2.4729F, -0.3382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, 1.3482F, 0.4189F, -0.1545F));

		PartDefinition cube_r22 = leftFace.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 49).addBox(-0.125F, -0.475F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9F, 2.7167F, -3.6245F, 2.6742F, 0.3542F, -0.1733F));

		PartDefinition cube_r23 = leftFace.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(86, 14).addBox(-1.0014F, -1.6597F, -1.8952F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, -0.1442F, 0.2612F, -0.0814F));

		PartDefinition cube_r24 = leftFace.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 86).addBox(-1.0008F, -1.819F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, -0.0835F, 0.3688F, -0.0162F));

		PartDefinition cube_r25 = leftFace.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(86, 0).addBox(-0.958F, -1.8553F, -0.0958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, 0.1877F, 0.282F, -0.0252F));

		PartDefinition cube_r26 = leftFace.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(50, 67).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3165F, 1.18F, 0.5334F, 0.5641F, 0.3046F, -0.0239F));

		PartDefinition cube_r27 = leftFace.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(90, 58).addBox(-0.9749F, -1.0768F, 1.6266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, 0.6581F, 0.2905F, -0.0008F));

		PartDefinition cube_r28 = leftFace.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(57, 90).addBox(-0.9749F, -1.8507F, 0.8644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, 0.2218F, 0.2905F, -0.0008F));

		PartDefinition cube_r29 = leftFace.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 52).addBox(-0.8994F, 0.1064F, -0.0817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.4596F, 3.0599F, -1.8587F, 0.2882F, 0.3139F, -0.0011F));

		PartDefinition cube_r30 = leftFace.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 101).addBox(-0.8994F, 1.1312F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4596F, 3.0599F, -1.8587F, 0.6984F, 0.3139F, -0.0011F));

		PartDefinition cube_r31 = leftFace.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(101, 0).addBox(-0.8994F, 0.8154F, -0.4608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4596F, 3.0599F, -1.8587F, 0.4366F, 0.3139F, -0.0011F));

		PartDefinition cube_r32 = leftFace.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(65, 99).addBox(-0.8994F, 0.323F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 100).addBox(-0.8994F, -0.277F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4596F, 3.0599F, -1.8587F, 0.1748F, 0.3139F, -0.0011F));

		PartDefinition cube_r33 = leftFace.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(49, 0).addBox(-0.8994F, -0.6365F, 0.11F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4596F, 3.0599F, -1.8587F, 0.0439F, 0.3139F, -0.0011F));

		PartDefinition cube_r34 = leftFace.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 70).addBox(-0.525F, -1.05F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.7095F, 2.8556F, -3.7704F, -1.3696F, 1.1413F, -1.3999F));

		PartDefinition cube_r35 = leftFace.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 70).addBox(-0.325F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.7095F, 2.8556F, -3.7704F, -0.39F, 0.2179F, -0.0874F));

		PartDefinition cube_r36 = leftFace.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(90, 62).addBox(-0.987F, -0.7615F, -2.0858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, -0.3027F, 0.2179F, -0.0874F));

		PartDefinition cube_r37 = leftFace.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(100, 84).addBox(-0.987F, -0.0578F, -1.4016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, -0.1282F, 0.2179F, -0.0874F));

		PartDefinition cube_r38 = leftFace.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(100, 38).addBox(-0.8994F, -0.1385F, 0.8386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, 0.262F, 0.3488F, -0.0884F));

		PartDefinition cube_r39 = leftFace.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(15, 100).addBox(-0.912F, -0.2211F, -0.7647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5346F, 3.0599F, -1.8587F, 0.0463F, 0.2179F, -0.0874F));

		PartDefinition cube_r40 = leftFace.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(77, 83).addBox(-1.0F, -0.425F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(83, 49).addBox(-1.0F, -0.425F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8347F, 1.6306F, -3.2763F, 1.3836F, 0.4636F, 0.0189F));

		PartDefinition cube_r41 = leftFace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(100, 73).addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7235F, 1.1546F, -3.1851F, 1.3185F, 0.1402F, 0.3763F));

		PartDefinition cube_r42 = leftFace.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(99, 6).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1559F, -0.9588F, -2.0997F, 0.9329F, 0.0758F, 0.2461F));

		PartDefinition cube_r43 = leftFace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(63, 0).addBox(-0.4966F, -0.475F, -0.3774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4982F, 0.6952F, -3.0518F, 1.0993F, 0.0203F, 0.1852F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(85, 76).addBox(-0.7F, 0.0068F, 0.1109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, -2.5291F, -0.0882F, 0.3717F, 0.1628F, 0.0631F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 6).addBox(-0.85F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 3).addBox(-0.15F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.9851F, -2.0363F, -0.4686F, 0.4001F, -0.0162F, 0.3098F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(83, 93).addBox(-0.863F, -0.5289F, -0.4726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7798F, -2.1803F, 0.2027F, 0.201F, 0.2259F, 0.1303F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(96, 29).addBox(-0.2258F, -0.4939F, -0.2711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 26).addBox(-0.8258F, -0.4939F, -0.2711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9676F, -1.7663F, -1.0106F, 0.427F, -0.0689F, 0.2974F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(99, 64).addBox(-0.7765F, -0.5206F, -1.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9676F, -1.7663F, -1.0106F, 0.5587F, -0.0737F, 0.275F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 93).addBox(-0.6F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8012F, -1.3847F, -1.5469F, 0.5658F, 0.1667F, 0.426F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(99, 3).addBox(-0.1365F, -0.5189F, -0.4703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7798F, -2.1803F, 0.2027F, 0.2434F, 0.3088F, 0.474F));

		PartDefinition cube_r51 = leftFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(67, 93).addBox(-0.5749F, -0.2703F, -0.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(0.1314F, -0.832F, 1.3541F, 0.1273F, 0.4039F, 0.0039F));

		PartDefinition cube_r52 = leftFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(6, 97).addBox(-0.5981F, -0.8315F, -0.4531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(0.1466F, -0.7552F, 1.3075F, 0.8677F, 0.3984F, 0.008F));

		PartDefinition cube_r53 = leftFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 55).addBox(-0.5981F, -0.3346F, -0.7967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(0.1466F, -0.7552F, 1.3075F, 0.1259F, 0.3984F, 0.008F));

		PartDefinition cube_r54 = leftFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(93, 45).addBox(-0.5749F, -0.5913F, -0.726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)), PartPose.offsetAndRotation(0.1314F, -0.832F, 1.3541F, -0.6014F, 0.4039F, 0.0039F));

		PartDefinition cube_r55 = leftFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(93, 23).addBox(-0.3249F, -0.3265F, -0.5493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(62, 92).addBox(-0.4999F, -0.3265F, -0.5493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1314F, -0.832F, 1.3541F, -0.9941F, 0.4039F, 0.0039F));

		PartDefinition cube_r56 = leftFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(18, 73).addBox(-0.5279F, 0.001F, -0.0846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8509F, -1.1443F, 2.4529F, -1.7018F, 0.919F, 0.1036F));

		PartDefinition cube_r57 = leftFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(35, 92).addBox(-0.5086F, -0.737F, -0.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2018F, -1.1499F, 1.9853F, -0.6829F, 0.9111F, 0.4649F));

		PartDefinition cube_r58 = leftFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(99, 78).addBox(-0.475F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2309F, -1.7851F, 1.6639F, -0.104F, 0.6466F, 0.4732F));

		PartDefinition cube_r59 = leftFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(25, 92).addBox(-0.2077F, -0.6988F, -0.0905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7118F, -2.1031F, 0.5454F, -0.0267F, 0.3656F, 0.5262F));

		PartDefinition cube_r60 = leftFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(5, 84).addBox(-1.0028F, -0.0124F, -0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.442F, -2.754F, 0.6053F, -0.1194F, 0.305F, 0.1053F));

		PartDefinition cube_r61 = leftFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(85, 72).addBox(-0.5501F, -1.2242F, 0.6258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(49, 54).addBox(-0.5501F, -1.5242F, -1.3742F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2064F, -1.147F, 2.8352F, 1.535F, -0.025F, -0.6104F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(72, 54).addBox(-1.0F, -1.0F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3298F, -2.1417F, 3.5974F, 0.54F, -0.3749F, 0.0171F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(82, 96).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2065F, -1.8803F, 4.0727F, 0.5051F, 0.3619F, -1.0433F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 20).addBox(0.05F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3799F, -2.0222F, 4.0245F, 0.6098F, 0.3619F, -1.0433F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(92, 17).addBox(-0.7194F, -1.046F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9598F, -1.7681F, 4.009F, 0.4635F, 0.2383F, -0.6686F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(43, 60).addBox(-2.4F, -0.15F, -1.075F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5813F, -0.1789F, 4.9448F, -0.2956F, 0.0115F, -0.0422F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 54).addBox(-3.0439F, -0.0027F, -0.3281F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1396F, -2.2785F, 4.0323F, 0.0839F, -0.0427F, -0.0537F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(15, 92).addBox(-0.375F, -0.7F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4619F, 3.7787F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(45, 96).addBox(-0.5F, -0.725F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7067F, 0.4627F, 3.7764F, 0.7335F, 0.3068F, 0.0328F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(96, 51).addBox(-0.5F, -0.575F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4352F, 0.7965F, 2.9542F, -0.4446F, 0.3068F, 0.0328F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -0.575F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4352F, 0.7965F, 2.9542F, 0.2971F, 0.3068F, 0.0328F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(70, 85).addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2854F, 0.9731F, 2.4999F, 0.1662F, 0.3068F, 0.0328F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(88, 23).addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9F, 1.6057F, 3.5893F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(3, 92).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9F, 1.7682F, 3.7257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(31, 51).addBox(-1.05F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7692F, -0.0307F, 0.8096F, 0.0581F, 0.3451F, -0.0279F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -0.3691F, -4.1514F));

		PartDefinition cube_r76 = rightFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(13, 34).mirror().addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.173F, -0.7378F, -0.1205F, 0.7132F, -0.3535F, 0.0779F));

		PartDefinition cube_r77 = rightFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(99, 9).mirror().addBox(-0.5826F, -1.3396F, -0.802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2596F, 2.0599F, -1.8587F, 0.4068F, -0.3941F, -0.0812F));

		PartDefinition cube_r78 = rightFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(63, 9).mirror().addBox(-0.45F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.076F, 0.8114F, -1.6396F, 0.8649F, -0.3146F, 0.0384F));

		PartDefinition cube_r79 = rightFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(8, 94).mirror().addBox(-0.4427F, -1.4608F, -0.9182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2596F, 2.0599F, -1.8587F, 0.9052F, -0.2761F, -0.1022F));

		PartDefinition cube_r80 = rightFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(67, 17).mirror().addBox(-0.4088F, -2.4729F, -0.3382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, 1.3482F, -0.4189F, 0.1545F));

		PartDefinition cube_r81 = rightFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-0.875F, -0.475F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9F, 2.7167F, -3.6245F, 2.6742F, -0.3542F, 0.1733F));

		PartDefinition cube_r82 = rightFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(0.0014F, -1.6597F, -1.8952F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, -0.1442F, -0.2612F, 0.0814F));

		PartDefinition cube_r83 = rightFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(0.0008F, -1.819F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, -0.0835F, -0.3688F, 0.0162F));

		PartDefinition cube_r84 = rightFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.042F, -1.8553F, -0.0958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, 0.1877F, -0.282F, 0.0252F));

		PartDefinition cube_r85 = rightFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(50, 67).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3165F, 1.18F, 0.5334F, 0.5641F, -0.3046F, 0.0239F));

		PartDefinition cube_r86 = rightFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(90, 58).mirror().addBox(-0.0251F, -1.0768F, 1.6266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, 0.6581F, -0.2905F, 0.0008F));

		PartDefinition cube_r87 = rightFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(57, 90).mirror().addBox(-0.0251F, -1.8507F, 0.8644F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, 0.2218F, -0.2905F, 0.0008F));

		PartDefinition cube_r88 = rightFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(25, 52).mirror().addBox(-0.1006F, 0.1064F, -0.0817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.4596F, 3.0599F, -1.8587F, 0.2882F, -0.3139F, 0.0011F));

		PartDefinition cube_r89 = rightFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(20, 101).mirror().addBox(-0.1006F, 1.1312F, -0.8487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.4596F, 3.0599F, -1.8587F, 0.6984F, -0.3139F, 0.0011F));

		PartDefinition cube_r90 = rightFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.1006F, 0.8154F, -0.4608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4596F, 3.0599F, -1.8587F, 0.4366F, -0.3139F, 0.0011F));

		PartDefinition cube_r91 = rightFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-0.1006F, 0.323F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 100).mirror().addBox(-0.1006F, -0.277F, -0.0522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4596F, 3.0599F, -1.8587F, 0.1748F, -0.3139F, 0.0011F));

		PartDefinition cube_r92 = rightFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-0.1006F, -0.6365F, 0.11F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4596F, 3.0599F, -1.8587F, 0.0439F, -0.3139F, 0.0011F));

		PartDefinition cube_r93 = rightFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(-0.475F, -1.05F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.7095F, 2.8556F, -3.7704F, -1.3696F, -1.1413F, 1.3999F));

		PartDefinition cube_r94 = rightFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(-0.675F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.7095F, 2.8556F, -3.7704F, -0.39F, -0.2179F, 0.0874F));

		PartDefinition cube_r95 = rightFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(90, 62).mirror().addBox(-0.013F, -0.7615F, -2.0858F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, -0.3027F, -0.2179F, 0.0874F));

		PartDefinition cube_r96 = rightFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-0.013F, -0.0578F, -1.4016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, -0.1282F, -0.2179F, 0.0874F));

		PartDefinition cube_r97 = rightFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(100, 38).mirror().addBox(-0.1006F, -0.1385F, 0.8386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, 0.262F, -0.3488F, 0.0884F));

		PartDefinition cube_r98 = rightFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(15, 100).mirror().addBox(-0.088F, -0.2211F, -0.7647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5346F, 3.0599F, -1.8587F, 0.0463F, -0.2179F, 0.0874F));

		PartDefinition cube_r99 = rightFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(-1.0F, -0.425F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(83, 49).mirror().addBox(-1.0F, -0.425F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8347F, 1.6306F, -3.2763F, 1.3836F, -0.4636F, -0.0189F));

		PartDefinition cube_r100 = rightFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(100, 73).mirror().addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.7235F, 1.1546F, -3.1851F, 1.3185F, -0.1402F, -0.3763F));

		PartDefinition cube_r101 = rightFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(99, 6).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1559F, -0.9588F, -2.0997F, 0.9329F, -0.0758F, -0.2461F));

		PartDefinition cube_r102 = rightFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.5034F, -0.475F, -0.3774F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4982F, 0.6952F, -3.0518F, 1.0993F, -0.0203F, -0.1852F));

		PartDefinition cube_r103 = rightFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 76).mirror().addBox(-0.3F, 0.0068F, 0.1109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4F, -2.5291F, -0.0882F, 0.3717F, -0.1628F, -0.0631F));

		PartDefinition cube_r104 = rightFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-0.15F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 3).mirror().addBox(-0.85F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.9851F, -2.0363F, -0.4686F, 0.4001F, 0.0162F, -0.3098F));

		PartDefinition cube_r105 = rightFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(-0.137F, -0.5289F, -0.4726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7798F, -2.1803F, 0.2027F, 0.201F, -0.2259F, -0.1303F));

		PartDefinition cube_r106 = rightFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(96, 29).mirror().addBox(-0.7742F, -0.4939F, -0.2711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 26).mirror().addBox(-0.1742F, -0.4939F, -0.2711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9676F, -1.7663F, -1.0106F, 0.427F, 0.0689F, -0.2974F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(99, 64).mirror().addBox(-0.2235F, -0.5206F, -1.1407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9676F, -1.7663F, -1.0106F, 0.5587F, 0.0737F, -0.275F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(78, 93).mirror().addBox(-0.4F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8012F, -1.3847F, -1.5469F, 0.5658F, -0.1667F, -0.426F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(99, 3).mirror().addBox(-0.8635F, -0.5189F, -0.4703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7798F, -2.1803F, 0.2027F, 0.2434F, -0.3088F, -0.474F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(67, 93).mirror().addBox(-0.4251F, -0.2703F, -0.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(-0.1314F, -0.832F, 1.3541F, 0.1273F, -0.4039F, -0.0039F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(6, 97).mirror().addBox(-0.4019F, -0.8315F, -0.4531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(-0.1466F, -0.7552F, 1.3075F, 0.8677F, -0.3984F, -0.008F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(93, 55).mirror().addBox(-0.4019F, -0.3346F, -0.7967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(-0.1466F, -0.7552F, 1.3075F, 0.1259F, -0.3984F, -0.008F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(93, 45).mirror().addBox(-0.4251F, -0.5913F, -0.726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)).mirror(false), PartPose.offsetAndRotation(-0.1314F, -0.832F, 1.3541F, -0.6014F, -0.4039F, -0.0039F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(93, 23).mirror().addBox(-0.6751F, -0.3265F, -0.5493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(62, 92).mirror().addBox(-0.5001F, -0.3265F, -0.5493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1314F, -0.832F, 1.3541F, -0.9941F, -0.4039F, -0.0039F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(18, 73).mirror().addBox(-0.4721F, 0.001F, -0.0846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8509F, -1.1443F, 2.4529F, -1.7018F, -0.919F, -0.1036F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(-0.4914F, -0.737F, -0.6455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2018F, -1.1499F, 1.9853F, -0.6829F, -0.9111F, -0.4649F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(99, 78).mirror().addBox(-0.525F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2309F, -1.7851F, 1.6639F, -0.104F, -0.6466F, -0.4732F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-0.7923F, -0.6988F, -0.0905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7118F, -2.1031F, 0.5454F, -0.0267F, -0.3656F, -0.5262F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(0.0028F, -0.0124F, -0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.442F, -2.754F, 0.6053F, -0.1194F, -0.305F, -0.1053F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(85, 72).mirror().addBox(-0.4499F, -1.2242F, 0.6258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(49, 54).mirror().addBox(-0.4499F, -1.5242F, -1.3742F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2064F, -1.147F, 2.8352F, 1.535F, 0.025F, 0.6104F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-1.0F, -1.0F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3298F, -2.1417F, 3.5974F, 0.54F, 0.3749F, -0.0171F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(82, 96).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2065F, -1.8803F, 4.0727F, 0.5051F, -0.3619F, 1.0433F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-1.05F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3799F, -2.0222F, 4.0245F, 0.6098F, -0.3619F, 1.0433F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-0.2806F, -1.046F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9598F, -1.7681F, 4.009F, 0.4635F, -0.2383F, 0.6686F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(43, 60).mirror().addBox(-0.6F, -0.15F, -1.075F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5813F, -0.1789F, 4.9448F, -0.2956F, -0.0115F, 0.0422F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 54).mirror().addBox(0.0439F, -0.0027F, -0.3281F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1396F, -2.2785F, 4.0323F, 0.0839F, 0.0427F, 0.0537F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 92).mirror().addBox(-0.625F, -0.7F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.4619F, 3.7787F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-0.5F, -0.725F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7067F, 0.4627F, 3.7764F, 0.7335F, -0.3068F, -0.0328F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(96, 51).mirror().addBox(-0.5F, -0.575F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4352F, 0.7965F, 2.9542F, -0.4446F, -0.3068F, -0.0328F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.5F, -0.575F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4352F, 0.7965F, 2.9542F, 0.2971F, -0.3068F, -0.0328F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 85).mirror().addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2854F, 0.9731F, 2.4999F, 0.1662F, -0.3068F, -0.0328F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(88, 23).mirror().addBox(-0.5F, -1.85F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.6057F, 3.5893F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(3, 92).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.7682F, 3.7257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(31, 51).mirror().addBox(-0.95F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.7692F, -0.0307F, 0.8096F, 0.0581F, -0.3451F, 0.0279F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8784F, -0.3158F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9718F, 0.4734F, -4.5007F, -1.1491F, -0.1399F, -0.2515F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-0.506F, 0.5318F, -1.3923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7949F, 0.6861F, -6.1268F, -1.0518F, -0.2511F, -0.303F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-0.506F, -1.438F, -0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(78, 72).mirror().addBox(-0.506F, -0.138F, -0.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5699F, 0.6861F, -6.1268F, -1.1391F, -0.2511F, -0.303F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.506F, -0.7878F, -0.9047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.6199F, 0.6861F, -6.1268F, -1.1806F, -0.2844F, -0.3059F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(70, 100).mirror().addBox(-0.506F, -0.5265F, -1.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6199F, 0.6861F, -6.1268F, -1.5733F, -0.2844F, -0.3059F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(100, 67).mirror().addBox(-0.506F, -0.6417F, -0.8442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6199F, 0.6861F, -6.1268F, -1.3551F, -0.2844F, -0.3059F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(78, 76).mirror().addBox(-0.506F, -0.738F, -0.4009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6199F, 0.6861F, -6.1268F, -1.1282F, -0.2844F, -0.3059F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(78, 42).mirror().addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0658F, 0.885F, -7.448F, -0.7957F, 0.0515F, -0.0083F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(83, 90).mirror().addBox(-0.5F, -0.325F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(78, 90).mirror().addBox(-0.5F, -0.325F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(83, 90).addBox(-0.2413F, -0.325F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(78, 90).addBox(-0.2413F, -0.325F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1293F, 1.4261F, -6.4397F, -0.8743F, 0.0F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(100, 60).mirror().addBox(-0.6437F, 1.7633F, -0.1306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -1.3479F, -0.3675F, -0.0058F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(100, 57).mirror().addBox(-0.5F, -0.525F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2649F, 1.4558F, -6.296F, -1.1733F, -0.3675F, -0.0058F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(-0.4921F, 0.469F, -3.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -0.0092F, -0.3236F, -0.0133F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-0.3704F, 0.034F, -0.8544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -1.1577F, -0.227F, 0.0102F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(42, 86).mirror().addBox(-0.3801F, 0.0797F, -0.1779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -1.322F, -0.2336F, 0.0004F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(55, 100).mirror().addBox(-0.6437F, 1.8861F, -0.1919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -1.4788F, -0.3675F, -0.0058F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-0.3945F, -1.3918F, -0.8733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -0.9056F, -0.3403F, -0.0981F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(10, 100).mirror().addBox(-0.4625F, -2.1325F, -0.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(0, 100).mirror().addBox(-0.4625F, -2.9618F, 1.0779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -0.6897F, -0.3362F, -0.0433F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(63, 77).mirror().addBox(-0.4625F, -1.7224F, -2.1246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -1.6933F, -0.3362F, -0.0433F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-0.4625F, -2.5041F, 1.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -0.3843F, -0.3362F, -0.0433F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(90, 99).mirror().addBox(-0.4625F, -3.6083F, -0.3595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, -1.3879F, -0.3362F, -0.0433F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(73, 90).mirror().addBox(-0.4264F, -0.2515F, -0.8003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, 2.0022F, -0.3384F, -0.0679F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-0.4625F, 0.6976F, -0.6074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, 1.7537F, -0.3362F, -0.0433F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(85, 99).mirror().addBox(-0.4264F, -0.9218F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, 0.5885F, -0.3384F, -0.0679F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(99, 81).mirror().addBox(-0.4253F, -0.8877F, 1.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(80, 99).mirror().addBox(-0.4253F, -0.3877F, 1.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2892F, 0.7798F, -3.2449F, 0.1907F, -0.339F, -0.0895F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(100, 60).addBox(-0.3563F, 1.7633F, -0.1306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -1.3479F, 0.3675F, 0.0058F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(78, 58).addBox(-0.494F, 0.5318F, -1.3923F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7949F, 0.6861F, -6.1268F, -1.0518F, 0.2511F, 0.303F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(78, 42).addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0658F, 0.885F, -7.448F, -0.7957F, -0.0515F, 0.0083F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 0).addBox(-0.494F, -0.7878F, -0.9047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.6199F, 0.6861F, -6.1268F, -1.1806F, 0.2844F, 0.3059F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(70, 100).addBox(-0.494F, -0.5265F, -1.2078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6199F, 0.6861F, -6.1268F, -1.5733F, 0.2844F, 0.3059F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(100, 67).addBox(-0.494F, -0.6417F, -0.8442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6199F, 0.6861F, -6.1268F, -1.3551F, 0.2844F, 0.3059F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(78, 76).addBox(-0.494F, -0.738F, -0.4009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6199F, 0.6861F, -6.1268F, -1.1282F, 0.2844F, 0.3059F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(100, 70).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9718F, 0.4734F, -4.5007F, -1.1491F, 0.1399F, 0.2515F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(100, 70).addBox(-0.494F, -1.438F, -0.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(78, 72).addBox(-0.494F, -0.138F, -0.8009F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5699F, 0.6861F, -6.1268F, -1.1391F, 0.2511F, 0.303F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(100, 57).addBox(-0.5F, -0.525F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2649F, 1.4558F, -6.296F, -1.1733F, 0.3675F, 0.0058F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(20, 94).addBox(-0.5079F, 0.469F, -3.3943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -0.0092F, 0.3236F, 0.0133F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(84, 8).addBox(-0.6296F, 0.034F, -0.8544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -1.1577F, 0.227F, -0.0102F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(42, 86).addBox(-0.6199F, 0.0797F, -0.1779F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -1.322F, 0.2336F, -0.0004F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(55, 100).addBox(-0.3563F, 1.8861F, -0.1919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -1.4788F, 0.3675F, 0.0058F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(99, 12).addBox(-0.6055F, -1.3918F, -0.8733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -0.9056F, 0.3403F, 0.0981F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(10, 100).addBox(-0.5375F, -2.1325F, -0.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(0, 100).addBox(-0.5375F, -2.9618F, 1.0779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -0.6897F, 0.3362F, 0.0433F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(63, 77).addBox(-0.5375F, -1.7224F, -2.1246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -1.6933F, 0.3362F, 0.0433F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(5, 100).addBox(-0.5375F, -2.5041F, 1.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -0.3843F, 0.3362F, 0.0433F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(90, 99).addBox(-0.5375F, -3.6083F, -0.3595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, -1.3879F, 0.3362F, 0.0433F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(73, 90).addBox(-0.5735F, -0.2515F, -0.8003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, 2.0022F, 0.3384F, 0.0679F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(94, 12).addBox(-0.5375F, 0.6976F, -0.6074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, 1.7537F, 0.3362F, 0.0433F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(85, 99).addBox(-0.5736F, -0.9218F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, 0.5885F, 0.3384F, 0.0679F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(99, 81).addBox(-0.5747F, -0.8877F, 1.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(80, 99).addBox(-0.5747F, -0.3877F, 1.6728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2892F, 0.7798F, -3.2449F, 0.1907F, 0.339F, 0.0895F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6531F, 9.9173F, -3.5745F, 0.3794F, 0.2102F, -0.5509F));

		PartDefinition cube_r182 = leftarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(52, 73).addBox(0.0F, 1.3895F, -1.614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.0672F, 0.5031F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.7154F, 2.2335F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(32, 73).addBox(0.0F, 1.1933F, 0.7129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.0672F, 0.5031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(55, 94).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0096F, -1.1508F, 1.512F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r186 = leftarm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(43, 64).addBox(-0.5F, -0.825F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0126F, 0.139F, -1.4061F, -2.3039F, 0.0014F, -0.001F));

		PartDefinition cube_r187 = leftarm.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(50, 94).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0087F, -0.9903F, 2.028F, -1.9112F, 0.0014F, -0.001F));

		PartDefinition cube_r188 = leftarm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(80, 86).addBox(-0.5F, -0.1F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0032F, 5.1766F, -1.3838F, -0.0874F, 0.0011F, -0.0013F));

		PartDefinition cube_r189 = leftarm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(56, 11).addBox(-0.5F, -2.0F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0005F, 5.9072F, 1.0812F, 0.2181F, 0.0011F, -0.0013F));

		PartDefinition cube_r190 = leftarm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(75, 86).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.0043F, 3.5312F, -0.4337F, -0.0001F, 0.0011F, -0.0013F));

		PartDefinition cube_r191 = leftarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(58, 86).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0043F, 4.1312F, -0.3337F, 0.349F, 0.0011F, -0.0013F));

		PartDefinition cube_r192 = leftarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(79, 9).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0057F, 2.1652F, -0.0676F, 0.5235F, 0.0011F, -0.0013F));

		PartDefinition cube_r193 = leftarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(79, 4).addBox(-0.5168F, -2.2493F, -0.6624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.9622F, 0.3074F, 0.109F, 0.0011F, -0.0013F));

		PartDefinition cube_r194 = leftarm.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(86, 52).addBox(-0.3F, -0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.0085F, 2.059F, -0.6576F, 0.5531F, 0.3245F, -0.4758F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(25, 64).addBox(-0.5016F, 0.6953F, -1.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.915F, 0.6326F, 0.0014F, -0.001F));

		PartDefinition cube_r196 = leftarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(25, 73).addBox(-1.5F, -1.8F, -0.925F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0095F, 1.622F, -1.0943F, 0.7199F, 0.0014F, -0.001F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(78, 20).addBox(-1.5016F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.915F, -0.0655F, 0.0014F, -0.001F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(63, 31).addBox(-0.5F, -1.45F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0111F, -0.4352F, -0.7661F, -1.4836F, 0.0014F, -0.001F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(40, 94).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(30, 94).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0111F, 0.4176F, -1.4206F, -0.6546F, 0.0014F, -0.001F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5099F, -0.9135F, -0.0922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.9622F, 0.3074F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(45, 4).addBox(-0.5F, -2.0F, -2.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2379F, 8.716F, 1.472F, -0.5118F, -0.1187F, 0.652F));

		PartDefinition cube_r202 = leftarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(94, 80).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.899F, 0.331F, 1.5708F, 0.7069F, -1.5708F));

		PartDefinition cube_r203 = leftarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(72, 94).addBox(0.005F, -1.8866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(94, 66).addBox(0.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, 1.1298F, -0.0451F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(85, 86).addBox(-0.9598F, 0.3375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.8702F, 1.3549F, -1.5708F, -1.3788F, 1.5708F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(73, 58).addBox(-0.559F, -0.121F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.4486F, -1.5795F));

		PartDefinition cube_r206 = leftarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(42, 90).addBox(-0.6095F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.1694F, -1.5795F));

		PartDefinition cube_r207 = leftarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(100, 35).addBox(-1.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(100, 32).addBox(-1.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, -1.5708F, -1.1868F, 1.5621F));

		PartDefinition cube_r208 = leftarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(39, 73).addBox(-0.0572F, -0.7033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.6454F, 0.0086F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4087F, 5.0385F, 0.2275F, 0.0264F, -0.0191F, -0.0459F));

		PartDefinition cube_r209 = leftArm3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(79, 29).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, -0.0524F, -0.0002F, 0.0001F));

		PartDefinition cube_r210 = leftArm4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(25, 56).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offset(-0.0127F, 0.7642F, -1.4173F));

		PartDefinition cube_r211 = leftArm5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(40, 45).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6531F, 9.9173F, -3.5745F, -0.3624F, -0.2102F, 0.5509F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(21, 77).addBox(-1.0F, 1.3895F, -1.614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.0672F, 0.5031F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(67, 47).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.7154F, 2.2335F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(14, 77).addBox(-1.0F, 1.1933F, 0.7129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.0672F, 0.5031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(30, 97).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0096F, -1.1508F, 1.512F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r216 = rightarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(66, 64).addBox(-0.5F, -0.825F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0126F, 0.139F, -1.4061F, -2.3039F, -0.0014F, 0.001F));

		PartDefinition cube_r217 = rightarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(19, 97).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0087F, -0.9903F, 2.028F, -1.9112F, -0.0014F, 0.001F));

		PartDefinition cube_r218 = rightarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(89, 4).addBox(-0.5F, -0.1F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0032F, 5.1766F, -1.3838F, -0.0874F, -0.0011F, 0.0013F));

		PartDefinition cube_r219 = rightarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -2.0F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0005F, 5.9072F, 1.0812F, 0.2181F, -0.0011F, 0.0013F));

		PartDefinition cube_r220 = rightarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(63, 88).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0043F, 3.5312F, -0.4337F, -0.0001F, -0.0011F, 0.0013F));

		PartDefinition cube_r221 = rightarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(88, 45).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0043F, 4.1312F, -0.3337F, 0.349F, -0.0011F, 0.0013F));

		PartDefinition cube_r222 = rightarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(81, 14).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0057F, 2.1652F, -0.0676F, 0.5235F, -0.0011F, 0.0013F));

		PartDefinition cube_r223 = rightarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(10, 81).addBox(-0.4832F, -2.2493F, -0.6624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.9622F, 0.3074F, 0.109F, -0.0011F, 0.0013F));

		PartDefinition cube_r224 = rightarm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(37, 88).addBox(-0.7F, -0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.0085F, 2.059F, -0.6576F, 0.5531F, -0.3245F, 0.4758F));

		PartDefinition cube_r225 = rightarm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(66, 59).addBox(-0.4984F, 0.6953F, -1.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.915F, 0.6326F, -0.0014F, 0.001F));

		PartDefinition cube_r226 = rightarm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(44, 76).addBox(-0.5F, -1.8F, -0.925F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0095F, 1.622F, -1.0943F, 0.7199F, -0.0014F, 0.001F));

		PartDefinition cube_r227 = rightarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(77, 80).addBox(-0.4984F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.915F, -0.0655F, -0.0014F, 0.001F));

		PartDefinition cube_r228 = rightarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(32, 66).addBox(-0.5F, -1.45F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0111F, -0.4352F, -0.7661F, -1.4836F, -0.0014F, 0.001F));

		PartDefinition cube_r229 = rightarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(97, 18).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(97, 15).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0111F, 0.4176F, -1.4206F, -0.6546F, -0.0014F, 0.001F));

		PartDefinition cube_r230 = rightarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(84, 4).addBox(-0.4901F, -0.9135F, -0.0922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.9622F, 0.3074F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(22, 45).addBox(-0.5F, -2.0F, -2.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2379F, 8.716F, 1.472F, -0.2064F, 0.1187F, -0.652F));

		PartDefinition cube_r232 = rightarm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(55, 97).addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.899F, 0.331F, 1.5708F, -0.7069F, 1.5708F));

		PartDefinition cube_r233 = rightarm2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(50, 97).addBox(-1.005F, -1.8866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(40, 97).addBox(-1.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, 1.1298F, -0.0451F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r234 = rightarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(89, 8).addBox(-0.0402F, 0.3375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.8702F, 1.3549F, -1.5708F, 1.3788F, -1.5708F));

		PartDefinition cube_r235 = rightarm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(33, 77).addBox(-0.441F, -0.121F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.4486F, 1.5795F));

		PartDefinition cube_r236 = rightarm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(52, 90).addBox(-0.3905F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.1694F, 1.5795F));

		PartDefinition cube_r237 = rightarm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(100, 41).addBox(0.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(40, 100).addBox(0.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, -1.5708F, 1.1868F, -1.5621F));

		PartDefinition cube_r238 = rightarm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(28, 77).addBox(-0.9428F, -0.7033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.6454F, 0.0086F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4087F, 5.0385F, 0.2275F, 0.0264F, 0.0191F, 0.0459F));

		PartDefinition cube_r239 = rightArm3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(15, 81).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, -0.0524F, 0.0002F, -0.0001F));

		PartDefinition cube_r240 = rightArm4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(61, 5).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offset(0.0127F, 0.7642F, -1.4173F));

		PartDefinition cube_r241 = rightArm5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(47, 17).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5998F, 6.5849F, -6.9685F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition Bodyfront_r10 = bone.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(30, 33).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.38F, -5.5229F, -0.4702F, 1.6396F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r11 = bone.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(66, 73).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6338F, -8.0713F, -1.1301F, 2.3377F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r12 = bone.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(53, 38).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8126F, -7.9774F, 0.8171F, 1.3677F, 0.0872F, -0.2625F));

		PartDefinition Bodyfront_r13 = bone.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(16, 52).addBox(2.9842F, -0.1757F, 3.0395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(7, 52).addBox(2.9842F, -0.5757F, 1.5395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.4912F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r14 = bone.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(94, 83).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6132F, -8.7021F, 0.7917F, 1.3254F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r15 = bone.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(0, 40).addBox(2.9842F, 0.0397F, 4.4729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.6308F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r16 = bone.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(19, 19).addBox(2.9842F, 0.2479F, 1.8265F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.7617F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r17 = bone.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(45, 24).addBox(2.9842F, 0.1617F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.8395F, -3.8413F, -1.1817F, 1.5785F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r18 = bone.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(31, 45).addBox(2.9842F, -0.6383F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8012F, -3.9303F, -0.3876F, 1.753F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r19 = bone.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(38, 79).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4322F, 0.4437F, 1.8803F, 1.1772F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r20 = bone.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(7, 65).addBox(2.8189F, -0.1096F, -1.0343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 2.002F, 0.0758F, -0.1247F));

		PartDefinition Bodyfront_r21 = bone.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(73, 64).addBox(2.8189F, -1.0664F, -0.7748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.3126F, 0.0758F, -0.1247F));

		PartDefinition Bodyfront_r22 = bone.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(0, 52).addBox(2.6582F, -0.9157F, -0.8003F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.1336F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r23 = bone.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(59, 73).addBox(2.6582F, -1.4432F, -0.6374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.7008F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r24 = bone.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(16, 57).addBox(-3.2795F, 2.7904F, 0.5003F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0248F, 0.112F, -1.0022F));

		PartDefinition Bodyfront_r25 = bone.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(30, 27).addBox(-3.0581F, 2.7638F, -1.1132F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0265F, -0.3678F, -1.0144F));

		PartDefinition Bodyfront_r26 = bone.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(15, 27).addBox(-3.9395F, 3.2819F, -1.934F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0131F, -0.0596F, -0.7854F));

		PartDefinition Bodyfront_r27 = bone.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(79, 32).addBox(-3.9746F, 3.4958F, -0.3851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, -0.1789F, -0.4468F, -0.7171F));

		PartDefinition Bodyfront_r28 = bone.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(63, 14).addBox(-0.65F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1214F, 0.2305F, -1.6707F, -0.153F, -0.0045F, -1.4688F));

		PartDefinition Bodyfront_r29 = bone.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(7, 57).addBox(-1.15F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1214F, 0.2305F, -1.6707F, -0.1866F, -0.6072F, -1.3622F));

		PartDefinition Bodyfront_r30 = bone.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(56, 54).addBox(-1.4F, -1.1F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.5506F, 2.0265F, -1.6607F, -0.1629F, -0.3493F, -1.4133F));

		PartDefinition Bodyfront_r31 = bone.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(56, 27).addBox(-1.0F, -0.9F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5955F, 3.833F, -2.3495F, -0.5723F, -0.5293F, -0.7268F));

		PartDefinition bone6 = Bodyfront.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5998F, 6.5849F, -6.9685F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition Bodyfront_r32 = bone6.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(30, 33).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.38F, -5.5229F, -0.4702F, 1.6396F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r33 = bone6.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(66, 73).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.6338F, -8.0713F, -1.1301F, 2.3377F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r34 = bone6.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(53, 38).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8126F, -7.9774F, 0.8171F, 1.3677F, -0.0872F, 0.2625F));

		PartDefinition Bodyfront_r35 = bone6.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(16, 52).mirror().addBox(-3.9842F, -0.1757F, 3.0395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(7, 52).mirror().addBox(-3.9842F, -0.5757F, 1.5395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.4912F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r36 = bone6.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(94, 83).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6132F, -8.7021F, 0.7917F, 1.3254F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r37 = bone6.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-3.9842F, 0.0397F, 4.4729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.6308F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r38 = bone6.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(19, 19).mirror().addBox(-3.9842F, 0.2479F, 1.8265F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.7617F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r39 = bone6.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(45, 24).mirror().addBox(-3.9842F, 0.1617F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.8395F, -3.8413F, -1.1817F, 1.5785F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r40 = bone6.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(31, 45).mirror().addBox(-3.9842F, -0.6383F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8012F, -3.9303F, -0.3876F, 1.753F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r41 = bone6.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(38, 79).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4322F, 0.4437F, 1.8803F, 1.1772F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r42 = bone6.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-3.8189F, -0.1096F, -1.0343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 2.002F, -0.0758F, 0.1247F));

		PartDefinition Bodyfront_r43 = bone6.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-3.8189F, -1.0664F, -0.7748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.3126F, -0.0758F, 0.1247F));

		PartDefinition Bodyfront_r44 = bone6.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-3.6582F, -0.9157F, -0.8003F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.1336F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r45 = bone6.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(-3.6582F, -1.4432F, -0.6374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.7008F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r46 = bone6.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(16, 57).mirror().addBox(1.2795F, 2.7904F, 0.5003F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 0.0248F, -0.112F, 1.0022F));

		PartDefinition Bodyfront_r47 = bone6.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(30, 27).mirror().addBox(0.0581F, 2.7638F, -1.1132F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 0.0265F, 0.3678F, 1.0144F));

		PartDefinition Bodyfront_r48 = bone6.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(15, 27).mirror().addBox(1.9395F, 3.2819F, -1.934F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 0.0131F, 0.0596F, 0.7854F));

		PartDefinition Bodyfront_r49 = bone6.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(1.9746F, 3.4958F, -0.3851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, -0.1789F, 0.4468F, 0.7171F));

		PartDefinition Bodyfront_r50 = bone6.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(63, 14).mirror().addBox(-2.35F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1214F, 0.2305F, -1.6707F, -0.153F, 0.0045F, 1.4688F));

		PartDefinition Bodyfront_r51 = bone6.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-0.85F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1214F, 0.2305F, -1.6707F, -0.1866F, 0.6072F, 1.3622F));

		PartDefinition Bodyfront_r52 = bone6.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(56, 54).mirror().addBox(-0.6F, -1.1F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.5506F, 2.0265F, -1.6607F, -0.1629F, 0.3493F, 1.4133F));

		PartDefinition Bodyfront_r53 = bone6.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(56, 27).mirror().addBox(-1.0F, -0.9F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5955F, 3.833F, -2.3495F, -0.5723F, 0.5293F, 0.7268F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(53, 43).addBox(-0.5F, -0.442F, -0.0094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F))
				.texOffs(101, 28).addBox(0.4F, -0.042F, -0.0094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(101, 30).addBox(0.1F, -0.042F, 1.9906F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(101, 28).mirror().addBox(-1.4F, -0.042F, -0.0094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(101, 30).mirror().addBox(-1.1F, -0.042F, 1.9906F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2549F, 3.1099F, -0.2185F, -0.0852F, 0.0189F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(39, 66).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4548F, 1.9868F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(34, 101).addBox(0.0F, -1.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.542F, -1.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(11, 40).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(14, 74).addBox(0.0F, -0.9932F, 0.9622F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1554F, 2.8196F, -0.243F, -0.2544F, 0.0623F));

		PartDefinition Tailmiddlebase2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase2", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0192F, 3.9458F, 0.118F, 0.2601F, 0.0305F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1009F, 3.189F, 0.242F, 0.3625F, 0.0154F, -0.0804F));

		PartDefinition cube_r242 = leftLeg.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(70, 82).addBox(-1.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r243 = leftLeg.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r244 = leftLeg.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(58, 17).addBox(-1.5F, -0.0114F, -0.3769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftLeg.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(82, 67).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftLeg.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(22, 81).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftLeg.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(45, 99).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftLeg.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(90, 33).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftLeg.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(20, 90).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftLeg.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(22, 40).addBox(-1.0037F, 1.4859F, -2.7261F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftLeg.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftLeg.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(32, 83).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftLeg.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1851F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0132F, 7.3211F, -3.9844F, 0.6277F, 0.0356F, 0.0797F));

		PartDefinition cube_r254 = leftLeg2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(95, 69).addBox(-0.5378F, -0.4683F, 0.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2687F, 2.0524F, -1.0329F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftLeg2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(43, 80).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3065F, 0.5724F, -0.2185F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftLeg2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(80, 38).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3065F, 0.1082F, 0.0775F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftLeg2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(70, 79).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3065F, 0.9051F, 0.1472F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftLeg2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(95, 61).addBox(-0.5884F, -0.2661F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(60, 95).addBox(-0.5884F, -0.2661F, -0.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7935F, 4.7581F, -1.4386F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftLeg2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(79, 55).addBox(-1.0F, -0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3065F, 3.4574F, -2.1128F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftLeg2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(79, 52).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3065F, 3.4574F, -2.1128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r261 = leftLeg2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(95, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3065F, 2.939F, -1.7695F, -0.2161F, 0.0092F, 0.0096F));

		PartDefinition cube_r262 = leftLeg2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(95, 48).addBox(-0.5378F, -1.3361F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2687F, 2.0524F, -1.0329F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftLeg2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(95, 42).addBox(-0.5542F, 0.1656F, -0.8185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftLeg2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(95, 39).addBox(-0.5542F, 0.8467F, -0.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftLeg2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(95, 36).addBox(-0.5542F, 1.0615F, 0.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftLeg2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(35, 95).addBox(-0.5542F, 1.0927F, 0.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftLeg2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(90, 74).addBox(-0.5542F, 0.2368F, 1.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftLeg2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(95, 33).addBox(-0.5542F, 0.0993F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(100, 48).addBox(-0.5542F, 0.0993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftLeg2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(25, 95).addBox(-0.5542F, -0.8175F, 0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftLeg2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5542F, -0.4313F, -0.5233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftLeg2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(47, 87).addBox(-0.5542F, -1.6846F, -0.4843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftLeg2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(32, 87).addBox(-0.5378F, -0.4127F, -0.5745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2687F, 2.0524F, -1.0329F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1045F, 4.6995F, -2.2195F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftLeg3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(34, 58).addBox(-1.5884F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 2.087F, 0.2608F, 0.8397F, -0.008F, 0.0104F));

		PartDefinition cube_r274 = leftArm7.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(58, 48).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftArm6.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(56, 58).addBox(-1.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1009F, 3.189F, 0.242F, 1.0607F, -0.0154F, 0.0804F));

		PartDefinition cube_r276 = rightLeg.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(43, 83).addBox(-0.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightLeg.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 77).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightLeg.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(7, 61).addBox(-0.5F, -0.0114F, -0.3769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightLeg.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(83, 35).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightLeg.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(27, 83).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightLeg.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(75, 99).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightLeg.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(90, 41).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightLeg.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(90, 37).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightLeg.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(33, 40).addBox(-0.9963F, 1.4859F, -2.7261F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightLeg.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(51, 77).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightLeg.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(50, 83).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightLeg.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1851F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0132F, 7.3211F, -3.9844F, 0.8895F, -0.0356F, -0.0797F));

		PartDefinition cube_r288 = rightLeg2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(97, 98).addBox(-0.4622F, -0.4683F, 0.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2687F, 2.0524F, -1.0329F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightLeg2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(63, 81).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3065F, 0.5724F, -0.2185F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r290 = rightLeg2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(56, 81).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3065F, 0.1082F, 0.0775F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r291 = rightLeg2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(81, 46).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3065F, 0.9051F, 0.1472F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r292 = rightLeg2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(60, 98).addBox(-0.4116F, -0.2661F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(98, 54).addBox(-0.4116F, -0.2661F, -0.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7935F, 4.7581F, -1.4386F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r293 = rightLeg2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(81, 26).addBox(-1.0F, -0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3065F, 3.4574F, -2.1128F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r294 = rightLeg2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(81, 23).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3065F, 3.4574F, -2.1128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightLeg2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(98, 45).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3065F, 2.939F, -1.7695F, -0.2161F, -0.0092F, -0.0096F));

		PartDefinition cube_r296 = rightLeg2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(35, 98).addBox(-0.4622F, -1.3361F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2687F, 2.0524F, -1.0329F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightLeg2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(24, 98).addBox(-0.4458F, 0.1656F, -0.8185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightLeg2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(98, 21).addBox(-0.4458F, 0.8467F, -0.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightLeg2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(97, 95).addBox(-0.4458F, 1.0615F, 0.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightLeg2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(97, 92).addBox(-0.4458F, 1.0927F, 0.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightLeg2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(90, 86).addBox(-0.4458F, 0.2368F, 1.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightLeg2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(97, 89).addBox(-0.4458F, 0.0993F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 100).addBox(-0.4458F, 0.0993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightLeg2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(70, 97).addBox(-0.4458F, -0.8175F, 0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightLeg2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(10, 90).addBox(-0.4458F, -0.4313F, -0.5233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightLeg2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(68, 89).addBox(-0.4458F, -1.6846F, -0.4843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightLeg2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(89, 66).addBox(-0.4622F, -0.4127F, -0.5745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2687F, 2.0524F, -1.0329F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1045F, 4.6995F, -2.2195F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightLeg3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(16, 61).addBox(-1.4116F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 2.087F, 0.2608F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition cube_r308 = rightArm7.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(34, 62).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightArm6.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(62, 38).addBox(-2.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3151F, -0.5251F, -0.8095F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(37, 84).addBox(0.0849F, -2.59F, -1.07F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0734F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(74, 25).addBox(-0.5F, -0.0407F, -2.0012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5849F, -2.5858F, 1.7961F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(91, 30).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5849F, -1.9858F, 1.8961F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(30, 91).addBox(1.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.4151F, -1.6963F, 0.0778F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(80, 62).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5849F, -1.7403F, -2.0759F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(74, 16).addBox(-0.5F, 1.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5849F, -0.8291F, -1.8648F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(91, 27).addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(91, 0).addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, -1.375F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5849F, -2.9225F, -0.6361F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(47, 11).addBox(-0.2645F, -1.6863F, -6.2744F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.5754F, -0.0719F, 0.5407F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(65, 54).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.637F, 5.5197F, 0.3431F, 2.1426F, -0.0719F, 0.5407F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(95, 86).addBox(-0.2645F, -6.3506F, -2.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 2.5353F, -0.0719F, 0.5407F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(7, 74).addBox(-0.2645F, -4.8284F, -5.3361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 2.2735F, -0.0719F, 0.5407F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(95, 75).addBox(-0.2645F, -2.4508F, -7.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.7499F, -0.0719F, 0.5407F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(95, 72).addBox(-0.2645F, -7.3761F, 0.7932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 3.1025F, -0.0719F, 0.5407F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(52, 62).addBox(-0.2645F, -0.2555F, -6.4115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.7935F, -0.0719F, 0.5407F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(15, 88).addBox(-0.2645F, -0.5383F, -6.6303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 2.1426F, -0.0719F, 0.5407F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(5, 88).addBox(-0.2645F, 3.7319F, -3.6319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.3572F, -0.0719F, 0.5407F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(62, 42).addBox(-0.2645F, 3.221F, -3.3881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.0518F, -0.0719F, 0.5407F));

		PartDefinition Hips_r26 = bone2.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(65, 23).addBox(-0.2645F, 2.497F, -1.6504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 0.6591F, -0.0719F, 0.5407F));

		PartDefinition Hips_r27 = bone2.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(90, 77).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.0599F, 2.6345F, -1.8993F, -0.2411F, -0.0101F, 0.4258F));

		PartDefinition Hips_r28 = bone2.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(34, 4).addBox(-0.6F, -1.0F, -1.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.4049F, 3.6067F, -0.6519F, 0.5007F, -0.0101F, 0.4258F));

		PartDefinition Hips_r29 = bone2.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(44, 38).addBox(-0.2645F, 2.7059F, 0.1095F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, -0.2572F, -0.0719F, 0.5407F));

		PartDefinition Hips_r30 = bone2.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(9, 46).addBox(-0.5F, -1.15F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2001F, 1.3717F, 0.0274F, -1.0297F, 0.0F, 0.2618F));

		PartDefinition Hips_r31 = bone2.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(54, 5).addBox(-0.5F, -1.8F, -0.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1336F, 1.62F, -1.0451F, 0.0175F, 0.0F, 0.2618F));

		PartDefinition Hips_r32 = bone2.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(14, 65).addBox(0.2001F, -0.7637F, -4.1237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1152F, -0.9176F, 2.0888F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Hips_r33 = bone2.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(0, 46).addBox(0.0849F, -2.5917F, -1.86F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3151F, -0.5251F, -0.8095F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition Hips_r34 = bone4.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(37, 84).mirror().addBox(-1.0849F, -2.59F, -1.07F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0734F, 0.0F, 0.0F));

		PartDefinition Hips_r35 = bone4.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(-0.5F, -0.0407F, -2.0012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.5858F, 1.7961F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r36 = bone4.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.9858F, 1.8961F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Hips_r37 = bone4.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-2.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.4151F, -1.6963F, 0.0778F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Hips_r38 = bone4.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(80, 62).mirror().addBox(-0.5F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.7403F, -2.0759F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Hips_r39 = bone4.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(74, 16).mirror().addBox(-0.5F, 1.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -0.8291F, -1.8648F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r40 = bone4.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(91, 27).mirror().addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r41 = bone4.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r42 = bone4.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.5F, -1.375F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.9225F, -0.6361F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r43 = bone4.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(47, 11).mirror().addBox(-0.7355F, -1.6863F, -6.2744F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.5754F, 0.0719F, -0.5407F));

		PartDefinition Hips_r44 = bone4.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(65, 54).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.637F, 5.5197F, 0.3431F, 2.1426F, 0.0719F, -0.5407F));

		PartDefinition Hips_r45 = bone4.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(95, 86).mirror().addBox(-0.7355F, -6.3506F, -2.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 2.5353F, 0.0719F, -0.5407F));

		PartDefinition Hips_r46 = bone4.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.7355F, -4.8284F, -5.3361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 2.2735F, 0.0719F, -0.5407F));

		PartDefinition Hips_r47 = bone4.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(95, 75).mirror().addBox(-0.7355F, -2.4508F, -7.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.7499F, 0.0719F, -0.5407F));

		PartDefinition Hips_r48 = bone4.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(95, 72).mirror().addBox(-0.7355F, -7.3761F, 0.7932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 3.1025F, 0.0719F, -0.5407F));

		PartDefinition Hips_r49 = bone4.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(52, 62).mirror().addBox(-0.7355F, -0.2555F, -6.4115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.7935F, 0.0719F, -0.5407F));

		PartDefinition Hips_r50 = bone4.addOrReplaceChild("Hips_r50", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.7355F, -0.5383F, -6.6303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 2.1426F, 0.0719F, -0.5407F));

		PartDefinition Hips_r51 = bone4.addOrReplaceChild("Hips_r51", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.7355F, 3.7319F, -3.6319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.3572F, 0.0719F, -0.5407F));

		PartDefinition Hips_r52 = bone4.addOrReplaceChild("Hips_r52", CubeListBuilder.create().texOffs(62, 42).mirror().addBox(-0.7355F, 3.221F, -3.3881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.0518F, 0.0719F, -0.5407F));

		PartDefinition Hips_r53 = bone4.addOrReplaceChild("Hips_r53", CubeListBuilder.create().texOffs(65, 23).mirror().addBox(-0.7355F, 2.497F, -1.6504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 0.6591F, 0.0719F, -0.5407F));

		PartDefinition Hips_r54 = bone4.addOrReplaceChild("Hips_r54", CubeListBuilder.create().texOffs(90, 77).mirror().addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0599F, 2.6345F, -1.8993F, -0.2411F, 0.0101F, -0.4258F));

		PartDefinition Hips_r55 = bone4.addOrReplaceChild("Hips_r55", CubeListBuilder.create().texOffs(34, 4).mirror().addBox(-0.4F, -1.0F, -1.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.4049F, 3.6067F, -0.6519F, 0.5007F, 0.0101F, -0.4258F));

		PartDefinition Hips_r56 = bone4.addOrReplaceChild("Hips_r56", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-0.7355F, 2.7059F, 0.1095F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, -0.2572F, 0.0719F, -0.5407F));

		PartDefinition Hips_r57 = bone4.addOrReplaceChild("Hips_r57", CubeListBuilder.create().texOffs(9, 46).mirror().addBox(-0.5F, -1.15F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 1.3717F, 0.0274F, -1.0297F, 0.0F, -0.2618F));

		PartDefinition Hips_r58 = bone4.addOrReplaceChild("Hips_r58", CubeListBuilder.create().texOffs(54, 5).mirror().addBox(-0.5F, -1.8F, -0.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 1.62F, -1.0451F, 0.0175F, 0.0F, -0.2618F));

		PartDefinition Hips_r59 = bone4.addOrReplaceChild("Hips_r59", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(-1.2001F, -0.7637F, -4.1237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1152F, -0.9176F, 2.0888F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Hips_r60 = bone4.addOrReplaceChild("Hips_r60", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-1.0849F, -2.5917F, -1.86F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 106, 106);
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