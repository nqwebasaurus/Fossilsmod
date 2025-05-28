package fossils.fossils.client.blockentity.model.tapinocaninus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TapinocaninusFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
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
	private final ModelPart bone5;
	private final ModelPart bone6;

	public TapinocaninusFossilModel(ModelPart root) {
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
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
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
		this.bone5 = this.Hips.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.5054F, 18.2633F, -0.6037F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(11, 99).addBox(0.0F, -1.9666F, 2.0589F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 99).addBox(0.0F, -1.9666F, 0.0589F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -0.7127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(24, 38).addBox(0.0F, -1.9005F, -0.0005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -2.7127F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(8, 99).addBox(0.0F, -1.8146F, -0.0095F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6373F, -4.8127F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(17, 9).mirror().addBox(-3.6992F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 100).mirror().addBox(-3.6992F, -0.1F, 1.0826F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(49, 100).addBox(-0.3008F, -0.1F, 1.0826F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 9).addBox(-0.3008F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.2642F, -0.0843F, -0.0228F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(17, 15).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(94, 29).addBox(0.0F, -2.9281F, 0.179F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4811F, -2.0115F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(22, 94).addBox(0.0F, -2.8281F, -0.021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7936F, -3.7841F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(90, 87).addBox(0.0F, -2.9204F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8936F, -5.9841F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(86, 4).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1879F, 0.0316F, -0.3037F));

		PartDefinition Bodymiddle_r6 = Bodymiddle.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(72, 19).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1582F, 0.0905F, -0.781F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1879F, 0.0316F, -0.3037F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1582F, 0.0905F, -0.781F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(56, 17).mirror().addBox(-7.92F, -2.9517F, -0.3458F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1043F, 0.1292F, -1.2624F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.2075F, 0.0245F, -0.1815F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.1789F, 0.0933F, -0.6575F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(61, 37).mirror().addBox(-6.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.1216F, 0.1412F, -1.1384F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(54, 53).mirror().addBox(-7.9732F, -6.3816F, -0.1665F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.0274F, 0.1552F, -1.7561F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(72, 19).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1582F, -0.0905F, 0.781F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(86, 4).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1879F, -0.0316F, 0.3037F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(84, 77).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1879F, -0.0316F, 0.3037F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(69, 43).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1582F, -0.0905F, 0.781F));

		PartDefinition Bodymiddle_r18 = Bodymiddle.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(56, 17).addBox(3.92F, -2.9517F, -0.3458F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1043F, -0.1292F, 1.2624F));

		PartDefinition Bodymiddle_r19 = Bodymiddle.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(84, 39).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.2075F, -0.0245F, 0.1815F));

		PartDefinition Bodymiddle_r20 = Bodymiddle.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(67, 0).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.1789F, -0.0933F, 0.6575F));

		PartDefinition Bodymiddle_r21 = Bodymiddle.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(61, 37).addBox(3.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.1216F, -0.1412F, 1.1384F));

		PartDefinition Bodymiddle_r22 = Bodymiddle.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(54, 53).addBox(3.9732F, -6.3816F, -0.1665F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.0274F, -0.1552F, 1.7561F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1026F, -5.9083F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition Bodymiddle_r23 = body2.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(35, 89).addBox(0.0F, -2.8957F, -0.0065F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r24 = body2.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(92, 92).addBox(0.0F, -2.995F, -0.1089F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r25 = body2.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.1404F, 0.0033F, -0.2786F));

		PartDefinition Bodymiddle_r26 = body2.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(76, 2).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.1289F, 0.0436F, -0.757F));

		PartDefinition Bodymiddle_r27 = body2.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(70, 13).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.1001F, 0.0741F, -1.2369F));

		PartDefinition Bodymiddle_r28 = body2.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(56, 19).mirror().addBox(-7.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.0489F, 0.0882F, -1.8497F));

		PartDefinition Bodymiddle_r29 = body2.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(70, 11).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1401F, 0.0025F, -0.1911F));

		PartDefinition Bodymiddle_r30 = body2.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1291F, 0.0428F, -0.6695F));

		PartDefinition Bodymiddle_r31 = body2.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(69, 45).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1006F, 0.0734F, -1.1493F));

		PartDefinition Bodymiddle_r32 = body2.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(16, 55).mirror().addBox(-7.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.0497F, 0.0879F, -1.7621F));

		PartDefinition Bodymiddle_r33 = body2.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1831F, 0.0093F, -0.1557F));

		PartDefinition Bodymiddle_r34 = body2.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1642F, 0.0686F, -0.6325F));

		PartDefinition Bodymiddle_r35 = body2.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(72, 75).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1199F, 0.1125F, -1.1125F));

		PartDefinition Bodymiddle_r36 = body2.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.0428F, 0.1309F, -1.7277F));

		PartDefinition Bodymiddle_r37 = body2.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(14, 70).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.1404F, -0.0033F, 0.2786F));

		PartDefinition Bodymiddle_r38 = body2.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(76, 2).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.1289F, -0.0436F, 0.757F));

		PartDefinition Bodymiddle_r39 = body2.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(70, 13).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.1001F, -0.0741F, 1.2369F));

		PartDefinition Bodymiddle_r40 = body2.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(56, 19).addBox(3.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.0489F, -0.0882F, 1.8497F));

		PartDefinition Bodymiddle_r41 = body2.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(70, 11).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1401F, -0.0025F, 0.1911F));

		PartDefinition Bodymiddle_r42 = body2.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(70, 9).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1291F, -0.0428F, 0.6695F));

		PartDefinition Bodymiddle_r43 = body2.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(69, 45).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1006F, -0.0734F, 1.1493F));

		PartDefinition Bodymiddle_r44 = body2.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(16, 55).addBox(3.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.0497F, -0.0879F, 1.7621F));

		PartDefinition Bodymiddle_r45 = body2.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1831F, -0.0093F, 0.1557F));

		PartDefinition Bodymiddle_r46 = body2.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(63, 75).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1642F, -0.0686F, 0.6325F));

		PartDefinition Bodymiddle_r47 = body2.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(72, 75).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1199F, -0.1125F, 1.1125F));

		PartDefinition Bodymiddle_r48 = body2.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(54, 55).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.0428F, -0.1309F, 1.7277F));

		PartDefinition Bodymiddle_r49 = body2.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(89, 92).addBox(0.0F, -3.0325F, -0.119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r50 = body2.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(15, 23).addBox(-0.5F, -0.0911F, -5.9758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -6.0F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition Bodymiddle_r51 = body.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(68, 91).addBox(0.0F, -2.6882F, 0.0368F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r52 = body.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.1915F, 0.0113F, -0.1206F));

		PartDefinition Bodymiddle_r53 = body.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.1953F, 0.0381F, -0.5956F));

		PartDefinition Bodymiddle_r54 = body.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(67, 30).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.1618F, 0.0997F, -1.0728F));

		PartDefinition Bodymiddle_r55 = body.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -5.4986F, 0.0846F, 0.1445F, -1.6868F));

		PartDefinition Bodymiddle_r56 = body.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(70, 36).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.1316F, -0.0012F, -0.1556F));

		PartDefinition Bodymiddle_r57 = body.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.1233F, 0.0356F, -0.6343F));

		PartDefinition Bodymiddle_r58 = body.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.0988F, 0.0643F, -1.114F));

		PartDefinition Bodymiddle_r59 = body.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(56, 29).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.4986F, 0.0534F, 0.0794F, -1.7263F));

		PartDefinition Bodymiddle_r60 = body.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.1569F, 0.0071F, -0.1209F));

		PartDefinition Bodymiddle_r61 = body.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(68, 41).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.1419F, 0.0545F, -0.5988F));

		PartDefinition Bodymiddle_r62 = body.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.1066F, 0.0897F, -1.0788F));

		PartDefinition Bodymiddle_r63 = body.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(56, 27).mirror().addBox(-7.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.0451F, 0.1047F, -1.6925F));

		PartDefinition Bodymiddle_r64 = body.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(70, 36).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.1316F, 0.0012F, 0.1556F));

		PartDefinition Bodymiddle_r65 = body.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(70, 34).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.1233F, -0.0356F, 0.6343F));

		PartDefinition Bodymiddle_r66 = body.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(70, 32).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.0988F, -0.0643F, 1.114F));

		PartDefinition Bodymiddle_r67 = body.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(56, 29).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.4986F, 0.0534F, -0.0794F, 1.7263F));

		PartDefinition Bodymiddle_r68 = body.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(56, 31).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.0408F, -0.1393F, 1.693F));

		PartDefinition Bodymiddle_r69 = body.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(67, 30).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.1232F, -0.1205F, 1.077F));

		PartDefinition Bodymiddle_r70 = body.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(68, 39).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.1708F, -0.0742F, 0.597F));

		PartDefinition Bodymiddle_r71 = body.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(71, 65).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -5.4986F, 0.1915F, -0.0113F, 0.1206F));

		PartDefinition Bodymiddle_r72 = body.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(70, 23).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.1569F, -0.0071F, 0.1209F));

		PartDefinition Bodymiddle_r73 = body.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(68, 41).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.1419F, -0.0545F, 0.5988F));

		PartDefinition Bodymiddle_r74 = body.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(70, 21).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.1066F, -0.0897F, 1.0788F));

		PartDefinition Bodymiddle_r75 = body.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(56, 27).addBox(3.8427F, -7.3717F, -0.1148F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.0451F, -0.1047F, 1.6925F));

		PartDefinition Bodymiddle_r76 = body.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(60, 92).addBox(0.0F, -2.455F, 0.0365F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.053F, -6.0088F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r77 = body.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(86, 91).addBox(0.0F, -2.755F, -0.0635F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r78 = body.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.0056F, -6.9631F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(93, 86).addBox(0.0F, -2.9936F, -5.0725F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8221F, -6.8881F, -0.0221F, -0.0872F, 0.0019F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(65, 91).addBox(0.0F, -2.4734F, -0.0687F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6732F, -0.957F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(19, 94).addBox(0.0F, -2.448F, 0.0242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4982F, -3.107F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(93, 74).addBox(0.0F, -2.8826F, 0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -7.032F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.9018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(31, 44).addBox(-4.7999F, 5.6027F, 1.172F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.2999F, 6.5849F, -6.9685F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(34, 3).addBox(-2.8717F, -0.8989F, -2.0538F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8717F, 12.6043F, -4.789F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(39, 35).addBox(-3.0F, -0.9675F, -1.258F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 12.7272F, -7.4329F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(0, 33).addBox(-3.5F, -0.9799F, -2.9572F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 11.9232F, -9.6541F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(11, 38).addBox(-3.0F, -0.5029F, -1.1612F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 11.4712F, -8.9291F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r79 = Bodyfront.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -6.4848F, 0.3801F, 0.036F, -0.1925F));

		PartDefinition Bodymiddle_r80 = Bodyfront.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -6.4848F, 0.3291F, 0.1815F, -0.6531F));

		PartDefinition Bodymiddle_r81 = Bodyfront.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(87, 57).mirror().addBox(-5.92F, -2.9517F, -0.3457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -6.4848F, 0.2148F, 0.2882F, -1.1348F));

		PartDefinition Bodymiddle_r82 = Bodyfront.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.2615F, 0.1269F, -0.5782F));

		PartDefinition Bodymiddle_r83 = Bodyfront.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.2958F, 0.0171F, -0.1095F));

		PartDefinition Bodymiddle_r84 = Bodyfront.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(-6.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.1797F, 0.2089F, -1.0581F));

		PartDefinition Bodymiddle_r85 = Bodyfront.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(95, 66).mirror().addBox(-4.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0792F, -4.5348F, 0.0346F, 0.2436F, -1.6845F));

		PartDefinition Bodymiddle_r86 = Bodyfront.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-5.8427F, -7.3717F, -0.1147F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.0176F, 0.2774F, -1.7584F));

		PartDefinition Bodymiddle_r87 = Bodyfront.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.1864F, 0.2459F, -1.1261F));

		PartDefinition Bodymiddle_r88 = Bodyfront.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.2847F, 0.1566F, -0.6444F));

		PartDefinition Bodymiddle_r89 = Bodyfront.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1792F, -2.5598F, 0.3298F, 0.0333F, -0.1782F));

		PartDefinition Bodymiddle_r90 = Bodyfront.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(70, 47).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.0305F, 0.1996F, -1.66F));

		PartDefinition Bodymiddle_r91 = Bodyfront.addOrReplaceChild("Bodymiddle_r91", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.1502F, 0.1756F, -1.0383F));

		PartDefinition Bodymiddle_r92 = Bodyfront.addOrReplaceChild("Bodymiddle_r92", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.2201F, 0.1107F, -0.5577F));

		PartDefinition Bodymiddle_r93 = Bodyfront.addOrReplaceChild("Bodymiddle_r93", CubeListBuilder.create().texOffs(67, 2).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3542F, -0.5098F, 0.2519F, 0.0213F, -0.0849F));

		PartDefinition Bodymiddle_r94 = Bodyfront.addOrReplaceChild("Bodymiddle_r94", CubeListBuilder.create().texOffs(85, 0).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -6.4848F, 0.3801F, -0.036F, 0.1925F));

		PartDefinition Bodymiddle_r95 = Bodyfront.addOrReplaceChild("Bodymiddle_r95", CubeListBuilder.create().texOffs(70, 69).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -6.4848F, 0.3291F, -0.1815F, 0.6531F));

		PartDefinition Bodymiddle_r96 = Bodyfront.addOrReplaceChild("Bodymiddle_r96", CubeListBuilder.create().texOffs(87, 57).addBox(3.92F, -2.9517F, -0.3457F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -6.4848F, 0.2148F, -0.2882F, 1.1348F));

		PartDefinition Bodymiddle_r97 = Bodyfront.addOrReplaceChild("Bodymiddle_r97", CubeListBuilder.create().texOffs(76, 29).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.2615F, -0.1269F, 0.5782F));

		PartDefinition Bodymiddle_r98 = Bodyfront.addOrReplaceChild("Bodymiddle_r98", CubeListBuilder.create().texOffs(86, 21).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.2958F, -0.0171F, 0.1095F));

		PartDefinition Bodymiddle_r99 = Bodyfront.addOrReplaceChild("Bodymiddle_r99", CubeListBuilder.create().texOffs(76, 27).addBox(3.92F, -2.9517F, -0.3458F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.1797F, -0.2089F, 1.0581F));

		PartDefinition Bodymiddle_r100 = Bodyfront.addOrReplaceChild("Bodymiddle_r100", CubeListBuilder.create().texOffs(95, 66).addBox(3.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0792F, -4.5348F, 0.0346F, -0.2436F, 1.6845F));

		PartDefinition Bodymiddle_r101 = Bodyfront.addOrReplaceChild("Bodymiddle_r101", CubeListBuilder.create().texOffs(86, 15).addBox(3.8427F, -7.3717F, -0.1147F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.0176F, -0.2774F, 1.7584F));

		PartDefinition Bodymiddle_r102 = Bodyfront.addOrReplaceChild("Bodymiddle_r102", CubeListBuilder.create().texOffs(76, 25).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.1864F, -0.2459F, 1.1261F));

		PartDefinition Bodymiddle_r103 = Bodyfront.addOrReplaceChild("Bodymiddle_r103", CubeListBuilder.create().texOffs(70, 67).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.2847F, -0.1566F, 0.6444F));

		PartDefinition Bodymiddle_r104 = Bodyfront.addOrReplaceChild("Bodymiddle_r104", CubeListBuilder.create().texOffs(70, 49).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1792F, -2.5598F, 0.3298F, -0.0333F, 0.1782F));

		PartDefinition Bodymiddle_r105 = Bodyfront.addOrReplaceChild("Bodymiddle_r105", CubeListBuilder.create().texOffs(70, 47).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.0305F, -0.1996F, 1.66F));

		PartDefinition Bodymiddle_r106 = Bodyfront.addOrReplaceChild("Bodymiddle_r106", CubeListBuilder.create().texOffs(67, 28).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.1502F, -0.1756F, 1.0383F));

		PartDefinition Bodymiddle_r107 = Bodyfront.addOrReplaceChild("Bodymiddle_r107", CubeListBuilder.create().texOffs(67, 26).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.2201F, -0.1107F, 0.5577F));

		PartDefinition Bodymiddle_r108 = Bodyfront.addOrReplaceChild("Bodymiddle_r108", CubeListBuilder.create().texOffs(67, 2).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3542F, -0.5098F, 0.2519F, -0.0213F, 0.0849F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.4905F, -2.9026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3017F, -6.8405F, -0.2685F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, -2.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4905F, -1.4026F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r109 = Neck.addOrReplaceChild("Bodymiddle_r109", CubeListBuilder.create().texOffs(85, 2).mirror().addBox(-5.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -1.4443F, 0.3095F, 0.4712F, -1.0203F));

		PartDefinition Bodymiddle_r110 = Neck.addOrReplaceChild("Bodymiddle_r110", CubeListBuilder.create().texOffs(44, 71).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -1.4443F, 0.497F, 0.3026F, -0.5335F));

		PartDefinition Bodymiddle_r111 = Neck.addOrReplaceChild("Bodymiddle_r111", CubeListBuilder.create().texOffs(56, 33).mirror().addBox(-0.9582F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -1.4443F, 0.5796F, 0.0747F, -0.1023F));

		PartDefinition Bodymiddle_r112 = Neck.addOrReplaceChild("Bodymiddle_r112", CubeListBuilder.create().texOffs(85, 2).addBox(3.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -1.4443F, 0.3095F, -0.4712F, 1.0203F));

		PartDefinition Bodymiddle_r113 = Neck.addOrReplaceChild("Bodymiddle_r113", CubeListBuilder.create().texOffs(44, 71).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -1.4443F, 0.497F, -0.3026F, 0.5335F));

		PartDefinition Bodymiddle_r114 = Neck.addOrReplaceChild("Bodymiddle_r114", CubeListBuilder.create().texOffs(56, 33).addBox(-0.0418F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -1.4443F, 0.5796F, -0.0747F, 0.1023F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(50, 39).addBox(-0.5F, -0.5915F, -3.0078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(3, 93).addBox(0.0F, -3.0915F, -1.0078F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, 0.1172F, -0.1734F, -0.0203F));

		PartDefinition Neck_r2 = Neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(40, 95).addBox(0.0F, -2.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5915F, -2.5078F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r115 = Neck2.addOrReplaceChild("Bodymiddle_r115", CubeListBuilder.create().texOffs(79, 69).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -2.6081F, 0.8736F, 0.2994F, -0.3696F));

		PartDefinition Bodymiddle_r116 = Neck2.addOrReplaceChild("Bodymiddle_r116", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -2.6081F, 0.6919F, 0.6244F, -0.7678F));

		PartDefinition Bodymiddle_r117 = Neck2.addOrReplaceChild("Bodymiddle_r117", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -0.6081F, 0.6177F, 0.5625F, -0.8093F));

		PartDefinition Bodymiddle_r118 = Neck2.addOrReplaceChild("Bodymiddle_r118", CubeListBuilder.create().texOffs(58, 10).mirror().addBox(-0.9582F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -0.6081F, 0.7892F, 0.2669F, -0.3932F));

		PartDefinition Bodymiddle_r119 = Neck2.addOrReplaceChild("Bodymiddle_r119", CubeListBuilder.create().texOffs(72, 55).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -2.6081F, 0.6919F, -0.6244F, 0.7678F));

		PartDefinition Bodymiddle_r120 = Neck2.addOrReplaceChild("Bodymiddle_r120", CubeListBuilder.create().texOffs(79, 69).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -2.6081F, 0.8736F, -0.2994F, 0.3696F));

		PartDefinition Bodymiddle_r121 = Neck2.addOrReplaceChild("Bodymiddle_r121", CubeListBuilder.create().texOffs(71, 57).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -0.6081F, 0.6177F, -0.5625F, 0.8093F));

		PartDefinition Bodymiddle_r122 = Neck2.addOrReplaceChild("Bodymiddle_r122", CubeListBuilder.create().texOffs(58, 10).addBox(-0.0418F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -0.6081F, 0.7892F, -0.2669F, 0.3932F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -0.489F, -5.0025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1893F, -2.9615F, 0.0175F, -0.2627F, 0.0376F));

		PartDefinition Neck_r3 = Neck3.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(53, 66).addBox(0.0F, -2.7F, -2.6F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -2.0025F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = Neck3.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(6, 93).addBox(0.0F, -1.9F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -0.0025F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r123 = Neck3.addOrReplaceChild("Bodymiddle_r123", CubeListBuilder.create().texOffs(31, 42).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -3.8682F, 0.5815F, 0.7207F, -1.1571F));

		PartDefinition Bodymiddle_r124 = Neck3.addOrReplaceChild("Bodymiddle_r124", CubeListBuilder.create().texOffs(36, 49).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -3.8682F, 0.8319F, 0.4226F, -0.7049F));

		PartDefinition Bodymiddle_r125 = Neck3.addOrReplaceChild("Bodymiddle_r125", CubeListBuilder.create().texOffs(71, 59).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.6682F, 0.6272F, 0.6528F, -1.0133F));

		PartDefinition Bodymiddle_r126 = Neck3.addOrReplaceChild("Bodymiddle_r126", CubeListBuilder.create().texOffs(79, 36).mirror().addBox(-0.9582F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.6682F, 0.8354F, 0.3462F, -0.5888F));

		PartDefinition Bodymiddle_r127 = Neck3.addOrReplaceChild("Bodymiddle_r127", CubeListBuilder.create().texOffs(31, 42).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -3.8682F, 0.5815F, -0.7207F, 1.1571F));

		PartDefinition Bodymiddle_r128 = Neck3.addOrReplaceChild("Bodymiddle_r128", CubeListBuilder.create().texOffs(36, 49).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -3.8682F, 0.8319F, -0.4226F, 0.7049F));

		PartDefinition Bodymiddle_r129 = Neck3.addOrReplaceChild("Bodymiddle_r129", CubeListBuilder.create().texOffs(71, 59).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.6682F, 0.6272F, -0.6528F, 1.0133F));

		PartDefinition Bodymiddle_r130 = Neck3.addOrReplaceChild("Bodymiddle_r130", CubeListBuilder.create().texOffs(79, 36).addBox(-0.0418F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.6682F, 0.8354F, -0.3462F, 0.5888F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5958F, -4.8353F, 0.6389F, -0.1395F, 0.2223F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 85).addBox(-0.5F, 0.012F, 0.0217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.0651F, -5.0313F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5F, 0.0068F, 0.0109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.6983F, -4.2396F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(79, 48).addBox(-1.0F, -0.675F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.6839F, -6.7697F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 63).addBox(-0.5F, -0.1244F, -1.5506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.2809F, -6.9514F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 93).addBox(-0.5F, -0.0164F, -0.9529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2809F, -6.9514F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, -0.01F, -0.0223F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.2559F, -6.9514F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 79).addBox(0.0F, -1.3357F, -0.327F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.1716F, -2.6553F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 71).addBox(-1.0F, -0.85F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.5226F, -5.0012F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(71, 61).addBox(-1.0F, -0.0141F, -0.0019F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.379F, -6.5561F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 64).addBox(-0.5F, -0.875F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.3217F, -4.487F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 0).addBox(-4.5F, -0.9462F, -1.0345F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 0.0997F, 0.5824F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 71).addBox(-1.0F, -0.056F, -1.8619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -3.1499F, -2.2832F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 56).addBox(-1.0F, 0.0137F, -1.9995F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0483F, -3.3146F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(63, 21).addBox(-1.0F, 0.7083F, -2.0897F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.1499F, -2.2832F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 8).addBox(-2.5F, -0.875F, -0.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.2155F, 0.0008F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(45, 32).addBox(-2.0F, 0.0121F, -1.0136F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.733F, 1.1674F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(93, 13).addBox(0.1F, -1.1381F, 3.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, -0.1691F, -4.1514F));

		PartDefinition cube_r17 = leftFace.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(45, 51).addBox(-2.0F, -0.968F, -0.5025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9545F, 0.103F, 0.0772F));

		PartDefinition cube_r18 = leftFace.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(79, 45).addBox(-1.7591F, -2.5304F, -1.2877F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4F, 2.3F, -0.1F, 0.8669F, 0.3219F, 0.245F));

		PartDefinition cube_r19 = leftFace.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 44).addBox(-0.925F, -0.4F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1549F, -0.5691F, -0.726F, 1.0337F, 0.1463F, 0.1127F));

		PartDefinition cube_r20 = leftFace.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(95, 57).addBox(-0.5F, -0.55F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3665F, 2.0342F, -2.2812F, 1.4169F, 0.2368F, 0.0179F));

		PartDefinition cube_r21 = leftFace.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(94, 68).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2667F, 2.017F, -2.2747F, 1.3493F, 0.207F, 0.2102F));

		PartDefinition cube_r22 = leftFace.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 60).addBox(-0.6F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2373F, 3.0244F, -2.6045F, 1.825F, 0.3813F, 0.0964F));

		PartDefinition cube_r23 = leftFace.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 16).addBox(-1.1127F, 1.0345F, -1.7425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.4F, 1.2F, -1.5F, 0.3054F, 0.2094F, 0.0873F));

		PartDefinition cube_r24 = leftFace.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 17).addBox(-0.8154F, -1.6318F, -1.8627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4F, 2.3F, -0.1F, 0.3716F, 0.2791F, 0.1932F));

		PartDefinition cube_r25 = leftFace.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 83).addBox(-0.8963F, -1.9031F, -0.9782F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4F, 2.3F, -0.1F, 0.6344F, 0.2048F, 0.1463F));

		PartDefinition cube_r26 = leftFace.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(45, 12).addBox(-0.05F, -0.925F, -0.775F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.2755F, 1.1345F, -0.2501F, 0.8929F, 0.125F, 0.0066F));

		PartDefinition cube_r27 = leftFace.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(17, 99).addBox(-0.5229F, -0.7724F, -0.1683F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 3.1F, -1.2F, 0.3182F, 0.173F, 0.0628F));

		PartDefinition cube_r28 = leftFace.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(99, 6).addBox(-0.05F, -0.7F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9346F, 3.4302F, -1.6316F, 0.2763F, 0.247F, -0.0415F));

		PartDefinition cube_r29 = leftFace.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 99).addBox(-0.1F, -1.4F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1339F, 3.5887F, -2.5006F, -0.3405F, 0.7026F, -0.187F));

		PartDefinition cube_r30 = leftFace.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(81, 54).addBox(-1.3842F, -2.2256F, -1.6382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(78, 61).addBox(-1.3842F, -2.2256F, -1.9383F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, 2.3F, -0.1F, 0.7698F, 0.3499F, 0.2677F));

		PartDefinition cube_r31 = leftFace.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(71, 94).addBox(-0.1294F, -0.0297F, -2.7452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0812F, -0.721F, -1.5844F, 1.1444F, 0.2003F, 0.6349F));

		PartDefinition cube_r32 = leftFace.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(97, 37).addBox(-1.1343F, -0.0297F, 1.1214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2656F, 1.0296F, -2.4872F, 1.1032F, -0.0304F, 0.162F));

		PartDefinition cube_r33 = leftFace.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 77).addBox(-1.0343F, -0.0297F, 0.0214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2656F, 1.0296F, -2.4872F, 1.1032F, 0.0287F, 0.2788F));

		PartDefinition cube_r34 = leftFace.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(86, 11).addBox(-0.7F, 0.0068F, 0.1109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, -2.5291F, -0.0882F, 0.3717F, 0.1628F, 0.0631F));

		PartDefinition cube_r35 = leftFace.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(95, 22).addBox(-0.8F, -0.275F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 94).addBox(0.0F, -0.275F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8638F, -1.7584F, -0.2437F, 0.8282F, 0.0669F, 0.3105F));

		PartDefinition cube_r36 = leftFace.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(76, 94).addBox(-0.95F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1317F, -2.4099F, 0.4578F, 0.3918F, 0.0669F, 0.3105F));

		PartDefinition cube_r37 = leftFace.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 55).addBox(-1.8009F, -0.0306F, -0.0068F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0481F, -0.725F, -1.5653F, 0.7384F, 0.039F, 0.2305F));

		PartDefinition cube_r38 = leftFace.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0864F, -1.7375F, 0.4762F, 0.3774F, 0.1628F, 0.4917F));

		PartDefinition cube_r39 = leftFace.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(94, 6).addBox(-0.5847F, -0.279F, -0.4313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(-0.0557F, -0.5348F, 0.6558F, 0.3053F, 0.2652F, 0.0686F));

		PartDefinition cube_r40 = leftFace.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(93, 3).addBox(-0.7759F, -0.3414F, -0.2093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)), PartPose.offsetAndRotation(-0.1342F, -0.2692F, 0.017F, 0.3106F, 0.3392F, 0.0703F));

		PartDefinition cube_r41 = leftFace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(92, 42).addBox(-0.5847F, -0.5833F, -0.7479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)), PartPose.offsetAndRotation(-0.0557F, -0.5348F, 0.6558F, -0.4234F, 0.2652F, 0.0686F));

		PartDefinition cube_r42 = leftFace.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(92, 83).addBox(-0.3347F, -0.4107F, -0.4915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(92, 26).addBox(-0.5097F, -0.4107F, -0.4915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0557F, -0.5348F, 0.6558F, -0.8161F, 0.2652F, 0.0686F));

		PartDefinition cube_r43 = leftFace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(43, 94).addBox(-1.017F, -0.314F, 0.8158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1632F, -1.4946F, 1.2433F, -1.331F, 0.9251F, 0.4803F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 85).addBox(-0.525F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3957F, -0.5756F, 1.336F, -1.8937F, 0.9699F, -0.7553F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(84, 69).addBox(-0.45F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4005F, -0.7268F, 1.2125F, -1.7758F, 1.0538F, -0.555F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 45).addBox(-0.375F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3008F, -1.0017F, 1.1118F, -1.2044F, 1.1141F, -0.2258F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 60).addBox(-0.917F, -0.0412F, -0.0815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1632F, -1.4946F, 1.2433F, -0.901F, 0.9111F, 0.6394F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(94, 34).addBox(0.1F, -1.075F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4118F, -1.6197F, 1.3368F, -0.0378F, 0.6528F, 0.7571F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(55, 87).addBox(-0.125F, -0.55F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4538F, -2.1818F, 1.7049F, 0.0841F, 0.286F, 0.4166F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 87).addBox(-0.7607F, 0.0047F, -0.7751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5538F, -2.7818F, 1.7049F, 0.0423F, 0.2288F, 0.2412F));

		PartDefinition cube_r51 = leftFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(62, 80).addBox(-0.9F, -1.35F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(80, 64).addBox(-0.9F, -2.15F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9F, -1.3864F, 3.246F, 1.5374F, -0.028F, -0.6977F));

		PartDefinition cube_r52 = leftFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(79, 51).addBox(-0.9F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -2.6701F, 4.6038F, 0.1626F, 0.0814F, -0.1868F));

		PartDefinition cube_r53 = leftFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(92, 39).addBox(-1.0F, -1.0F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2557F, -2.8871F, 4.7501F, 0.3591F, 0.0235F, -1.0763F));

		PartDefinition cube_r54 = leftFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 92).addBox(-0.35F, -0.525F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.1182F, 4.7467F, 0.1316F, -0.0863F, -0.7817F));

		PartDefinition cube_r55 = leftFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(15, 86).addBox(-1.1F, -0.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8836F, -2.3194F, 4.5377F, -0.3666F, 0.053F, -0.214F));

		PartDefinition cube_r56 = leftFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(32, 64).addBox(-1.4832F, -1.4711F, -0.5506F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3869F, 1.7537F, 0.0353F, 0.3068F, 0.0328F));

		PartDefinition cube_r57 = leftFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(9, 93).addBox(0.5F, -0.3307F, -0.8552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5688F, 4.4339F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(36, 51).addBox(-1.8418F, -0.9326F, -0.4629F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1592F, -0.0692F, 0.017F, 0.0643F, 0.344F, -0.0094F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-1.1F, -1.1381F, 3.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.9F, -0.1691F, -4.1514F));

		PartDefinition cube_r59 = rightFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(0.0F, -0.968F, -0.5025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9545F, -0.103F, -0.0772F));

		PartDefinition cube_r60 = rightFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(79, 45).mirror().addBox(-0.2409F, -2.5304F, -1.2877F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.3F, -0.1F, 0.8669F, -0.3219F, -0.245F));

		PartDefinition cube_r61 = rightFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(51, 44).mirror().addBox(-1.075F, -0.4F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1549F, -0.5691F, -0.726F, 1.0337F, -0.1463F, -0.1127F));

		PartDefinition cube_r62 = rightFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-0.5F, -0.55F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3665F, 2.0342F, -2.2812F, 1.4169F, -0.2368F, -0.0179F));

		PartDefinition cube_r63 = rightFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 68).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2667F, 2.017F, -2.2747F, 1.3493F, -0.207F, -0.2102F));

		PartDefinition cube_r64 = rightFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(95, 60).mirror().addBox(-0.4F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2373F, 3.0244F, -2.6045F, 1.825F, -0.3813F, -0.0964F));

		PartDefinition cube_r65 = rightFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(0.1127F, 1.0345F, -1.7425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.2F, -1.5F, 0.3054F, -0.2094F, -0.0873F));

		PartDefinition cube_r66 = rightFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(88, 17).mirror().addBox(-0.1846F, -1.6318F, -1.8627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.3F, -0.1F, 0.3716F, -0.2791F, -0.1932F));

		PartDefinition cube_r67 = rightFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(24, 83).mirror().addBox(-0.1037F, -1.9031F, -0.9782F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.3F, -0.1F, 0.6344F, -0.2048F, -0.1463F));

		PartDefinition cube_r68 = rightFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(45, 12).mirror().addBox(-0.95F, -0.925F, -0.775F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.2755F, 1.1345F, -0.2501F, 0.8929F, -0.125F, -0.0066F));

		PartDefinition cube_r69 = rightFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(17, 99).mirror().addBox(0.5229F, -0.7724F, -0.1683F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 3.1F, -1.2F, 0.3182F, -0.173F, -0.0628F));

		PartDefinition cube_r70 = rightFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(99, 6).mirror().addBox(0.05F, -0.7F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9346F, 3.4302F, -1.6316F, 0.2763F, -0.247F, 0.0415F));

		PartDefinition cube_r71 = rightFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(14, 99).mirror().addBox(0.1F, -1.4F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1339F, 3.5887F, -2.5006F, -0.3405F, -0.7026F, 0.187F));

		PartDefinition cube_r72 = rightFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 54).mirror().addBox(-0.6158F, -2.2256F, -1.6382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(78, 61).mirror().addBox(-0.6158F, -2.2256F, -1.9383F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.3F, -0.1F, 0.7698F, -0.3499F, -0.2677F));

		PartDefinition cube_r73 = rightFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(71, 94).mirror().addBox(-0.8706F, -0.0297F, -2.7452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0812F, -0.721F, -1.5844F, 1.1444F, -0.2003F, -0.6349F));

		PartDefinition cube_r74 = rightFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(97, 37).mirror().addBox(0.1343F, -0.0297F, 1.1214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2656F, 1.0296F, -2.4872F, 1.1032F, 0.0304F, -0.162F));

		PartDefinition cube_r75 = rightFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(0.0343F, -0.0297F, 0.0214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2656F, 1.0296F, -2.4872F, 1.1032F, -0.0287F, -0.2788F));

		PartDefinition cube_r76 = rightFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(86, 11).mirror().addBox(-0.3F, 0.0068F, 0.1109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4F, -2.5291F, -0.0882F, 0.3717F, -0.1628F, -0.0631F));

		PartDefinition cube_r77 = rightFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 22).mirror().addBox(-0.2F, -0.275F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 94).mirror().addBox(-1.0F, -0.275F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8638F, -1.7584F, -0.2437F, 0.8282F, -0.0669F, -0.3105F));

		PartDefinition cube_r78 = rightFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(76, 94).mirror().addBox(-0.05F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1317F, -2.4099F, 0.4578F, 0.3918F, -0.0669F, -0.3105F));

		PartDefinition cube_r79 = rightFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.1991F, -0.0306F, -0.0068F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0481F, -0.725F, -1.5653F, 0.7384F, -0.039F, -0.2305F));

		PartDefinition cube_r80 = rightFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0864F, -1.7375F, 0.4762F, 0.3774F, -0.1628F, -0.4917F));

		PartDefinition cube_r81 = rightFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-0.4153F, -0.279F, -0.4313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(0.0557F, -0.5348F, 0.6558F, 0.3053F, -0.2652F, -0.0686F));

		PartDefinition cube_r82 = rightFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(93, 3).mirror().addBox(-0.2241F, -0.3414F, -0.2093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.055F)).mirror(false), PartPose.offsetAndRotation(0.1342F, -0.2692F, 0.017F, 0.3106F, -0.3392F, -0.0703F));

		PartDefinition cube_r83 = rightFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(-0.4153F, -0.5833F, -0.7479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.049F)).mirror(false), PartPose.offsetAndRotation(0.0557F, -0.5348F, 0.6558F, -0.4234F, -0.2652F, -0.0686F));

		PartDefinition cube_r84 = rightFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(92, 83).mirror().addBox(-0.6653F, -0.4107F, -0.4915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(92, 26).mirror().addBox(-0.4903F, -0.4107F, -0.4915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0557F, -0.5348F, 0.6558F, -0.8161F, -0.2652F, -0.0686F));

		PartDefinition cube_r85 = rightFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(43, 94).mirror().addBox(0.017F, -0.314F, 0.8158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1632F, -1.4946F, 1.2433F, -1.331F, -0.9251F, -0.4803F));

		PartDefinition cube_r86 = rightFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.475F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3957F, -0.5756F, 1.336F, -1.8937F, -0.9699F, 0.7553F));

		PartDefinition cube_r87 = rightFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(-0.55F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4005F, -0.7268F, 1.2125F, -1.7758F, -1.0538F, 0.555F));

		PartDefinition cube_r88 = rightFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-0.625F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3008F, -1.0017F, 1.1118F, -1.2044F, -1.1141F, 0.2258F));

		PartDefinition cube_r89 = rightFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(85, 60).mirror().addBox(-0.083F, -0.0412F, -0.0815F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1632F, -1.4946F, 1.2433F, -0.901F, -0.9111F, -0.6394F));

		PartDefinition cube_r90 = rightFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(94, 34).mirror().addBox(-1.1F, -1.075F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4118F, -1.6197F, 1.3368F, -0.0378F, -0.6528F, -0.7571F));

		PartDefinition cube_r91 = rightFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(-0.875F, -0.55F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4538F, -2.1818F, 1.7049F, 0.0841F, -0.286F, -0.4166F));

		PartDefinition cube_r92 = rightFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.2393F, 0.0047F, -0.7751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5538F, -2.7818F, 1.7049F, 0.0423F, -0.2288F, -0.2412F));

		PartDefinition cube_r93 = rightFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 80).mirror().addBox(-0.1F, -1.35F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(80, 64).mirror().addBox(-0.1F, -2.15F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9F, -1.3864F, 3.246F, 1.5374F, 0.028F, 0.6977F));

		PartDefinition cube_r94 = rightFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(79, 51).mirror().addBox(-1.1F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, -2.6701F, 4.6038F, 0.1626F, -0.0814F, 0.1868F));

		PartDefinition cube_r95 = rightFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(0.0F, -1.0F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2557F, -2.8871F, 4.7501F, 0.3591F, -0.0235F, 1.0763F));

		PartDefinition cube_r96 = rightFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(38, 92).mirror().addBox(-0.65F, -0.525F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -2.1182F, 4.7467F, 0.1316F, 0.0863F, 0.7817F));

		PartDefinition cube_r97 = rightFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(0.1F, -0.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8836F, -2.3194F, 4.5377F, -0.3666F, -0.053F, 0.214F));

		PartDefinition cube_r98 = rightFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(32, 64).mirror().addBox(0.4832F, -1.4711F, -0.5506F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3869F, 1.7537F, 0.0353F, -0.3068F, -0.0328F));

		PartDefinition cube_r99 = rightFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(9, 93).mirror().addBox(-1.5F, -0.3307F, -0.8552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5688F, 4.4339F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(36, 51).mirror().addBox(-0.1582F, -0.9326F, -0.4629F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1592F, -0.0692F, 0.017F, 0.0643F, -0.344F, 0.0094F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2122F, -0.2723F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(93, 71).mirror().addBox(-0.693F, -0.3267F, 0.2137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 0.8454F, -5.3406F, -1.4088F, -0.4511F, 0.1037F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(0.059F, 0.6355F, -0.3067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(89, 68).addBox(0.3177F, 0.6355F, -0.3067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6884F, 0.8454F, -5.3406F, -1.3455F, 0.0F, 0.0F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.693F, 0.5571F, -0.2037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 0.8454F, -5.3406F, -1.3651F, -0.4511F, 0.1037F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(93, 54).mirror().addBox(-0.693F, 0.3838F, -1.147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 0.8454F, -5.3406F, -0.2307F, -0.4511F, 0.1037F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(0.0F, -0.3F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 99).addBox(0.807F, -0.3F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4035F, 0.8317F, -6.8719F, -0.4174F, 0.0F, 0.0F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(23, 99).mirror().addBox(0.1F, -0.7F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 99).addBox(1.8501F, -0.7F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.975F, 0.6686F, -6.0746F, -1.0697F, 0.0F, 0.0F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(88, 53).mirror().addBox(-0.7528F, -1.9458F, -0.1114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 0.8454F, -5.3406F, -1.2067F, -0.2232F, 0.1084F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(39, 88).mirror().addBox(-0.747F, -1.9468F, 0.2425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 0.8454F, -5.3406F, -1.3363F, -0.2303F, 0.0989F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(93, 51).mirror().addBox(-0.693F, -0.231F, -0.1234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6884F, 0.8454F, -5.3406F, -1.5397F, -0.4511F, 0.1037F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(50, 90).mirror().addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.7205F, -0.0032F, -2.4161F, -0.8713F, -0.3411F, 0.0186F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(97, 25).mirror().addBox(-0.5F, -0.275F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.853F, -0.599F, -1.9809F, -0.7036F, -0.3368F, 0.0485F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-0.5F, -0.45F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.8991F, -0.4296F, -1.8728F, -1.7072F, -0.3368F, 0.0485F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(49, 93).mirror().addBox(-0.0265F, -0.5859F, -2.1583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1119F, 0.1161F, 0.0787F, -0.3982F, -0.3368F, 0.0485F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(30, 93).mirror().addBox(-0.0265F, 0.1911F, -1.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1168F, -0.302F, 0.1504F, -0.7036F, -0.3368F, 0.0485F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-0.0265F, 0.1036F, -0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1119F, 0.1161F, 0.0787F, -1.4017F, -0.3368F, 0.0485F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(-0.5F, -0.575F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5833F, 0.8407F, -2.9496F, 1.9144F, -0.3368F, 0.0485F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 30).mirror().addBox(-0.5F, -0.625F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8733F, 0.2502F, -2.0406F, 1.7399F, -0.3368F, 0.0485F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(90, 62).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3774F, 0.4227F, -3.4792F, 0.5007F, -0.3368F, 0.0485F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(90, 59).mirror().addBox(-0.0265F, -0.9326F, -2.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(93, 19).mirror().addBox(-0.0265F, -0.4326F, -2.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1119F, 0.1161F, 0.0787F, 0.1769F, -0.3401F, 0.0024F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(93, 71).addBox(-0.307F, -0.3267F, 0.2137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6884F, 0.8454F, -5.3406F, -1.4088F, 0.4511F, -0.1037F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(60, 89).addBox(-0.307F, 0.5571F, -0.2037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6884F, 0.8454F, -5.3406F, -1.3651F, 0.4511F, -0.1037F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(93, 54).addBox(-0.307F, 0.3838F, -1.147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6884F, 0.8454F, -5.3406F, -0.2307F, 0.4511F, -0.1037F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(88, 53).addBox(-0.2472F, -1.9458F, -0.1114F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6884F, 0.8454F, -5.3406F, -1.2067F, 0.2232F, -0.1084F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(39, 88).addBox(-0.253F, -1.9468F, 0.2425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6884F, 0.8454F, -5.3406F, -1.3363F, 0.2303F, -0.0989F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(93, 51).addBox(-0.307F, -0.231F, -0.1234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6884F, 0.8454F, -5.3406F, -1.5397F, 0.4511F, -0.1037F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(50, 90).addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.7205F, -0.0032F, -2.4161F, -0.8713F, 0.3411F, -0.0186F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(97, 25).addBox(-0.5F, -0.275F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.853F, -0.599F, -1.9809F, -0.7036F, 0.3368F, -0.0485F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(70, 71).addBox(-0.5F, -0.45F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.8991F, -0.4296F, -1.8728F, -1.7072F, 0.3368F, -0.0485F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(49, 93).addBox(-0.9735F, -0.5859F, -2.1583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1119F, 0.1161F, 0.0787F, -0.3982F, 0.3368F, -0.0485F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(30, 93).addBox(-0.9735F, 0.1911F, -1.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1168F, -0.302F, 0.1504F, -0.7036F, 0.3368F, -0.0485F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(25, 93).addBox(-0.9735F, 0.1036F, -0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.1119F, 0.1161F, 0.0787F, -1.4017F, 0.3368F, -0.0485F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(85, 24).addBox(-0.5F, -0.575F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5833F, 0.8407F, -2.9496F, 1.9144F, 0.3368F, -0.0485F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 30).addBox(-0.5F, -0.625F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8733F, 0.2502F, -2.0406F, 1.7399F, 0.3368F, -0.0485F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(90, 62).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3774F, 0.4227F, -3.4792F, 0.5007F, 0.3368F, -0.0485F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(90, 59).addBox(-0.9735F, -0.9326F, -2.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(93, 19).addBox(-0.9735F, -0.4326F, -2.0441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1119F, 0.1161F, 0.0787F, 0.1769F, 0.3401F, -0.0024F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6531F, 9.9173F, -3.5745F, 0.1714F, -0.0262F, -0.3351F));

		PartDefinition cube_r136 = leftarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, 1.3894F, -1.614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.0672F, 0.5031F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.7154F, 2.2335F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(30, 69).addBox(0.0F, 1.1933F, 0.7129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.0672F, 0.5031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(71, 91).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0096F, -1.1508F, 1.512F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r140 = leftarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(16, 65).addBox(-0.5F, -0.825F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0126F, 0.139F, -1.4061F, -2.3039F, 0.0014F, -0.001F));

		PartDefinition cube_r141 = leftarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(76, 91).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0087F, -0.9903F, 2.028F, -1.9112F, 0.0014F, -0.001F));

		PartDefinition cube_r142 = leftarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 83).addBox(-0.5F, -0.1F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0032F, 5.1766F, -1.3838F, -0.0874F, 0.0011F, -0.0013F));

		PartDefinition cube_r143 = leftarm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(58, 4).addBox(-0.5F, -2.0F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0005F, 5.9072F, 1.0812F, 0.2181F, 0.0011F, -0.0013F));

		PartDefinition cube_r144 = leftarm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(88, 73).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.0043F, 3.5312F, -0.4337F, -0.0001F, 0.0011F, -0.0013F));

		PartDefinition cube_r145 = leftarm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(29, 85).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0043F, 4.1312F, -0.3337F, 0.349F, 0.0011F, -0.0013F));

		PartDefinition cube_r146 = leftarm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(19, 81).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0057F, 2.1652F, -0.0676F, 0.5235F, 0.0011F, -0.0013F));

		PartDefinition cube_r147 = leftarm.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 78).addBox(-0.5168F, -2.2493F, -0.6624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.9622F, 0.3074F, 0.109F, 0.0011F, -0.0013F));

		PartDefinition cube_r148 = leftarm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(84, 31).addBox(-0.3F, -0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0085F, 2.059F, -0.6576F, 0.5531F, 0.3245F, -0.4758F));

		PartDefinition cube_r149 = leftarm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5016F, 0.6953F, -1.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.915F, 0.6326F, 0.0014F, -0.001F));

		PartDefinition cube_r150 = leftarm.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(63, 67).addBox(-1.5F, -1.8F, -0.925F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0095F, 1.622F, -1.0943F, 0.7199F, 0.0014F, -0.001F));

		PartDefinition cube_r151 = leftarm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(79, 4).addBox(-1.5016F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.915F, -0.0655F, 0.0014F, -0.001F));

		PartDefinition cube_r152 = leftarm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(64, 57).addBox(-0.5F, -1.45F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0111F, -0.4352F, -0.7661F, -1.4836F, 0.0014F, -0.001F));

		PartDefinition cube_r153 = leftarm.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(95, 91).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(97, 28).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0111F, 0.4176F, -1.4206F, -0.6546F, 0.0014F, -0.001F));

		PartDefinition cube_r154 = leftarm.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(84, 7).addBox(-0.5099F, -0.9135F, -0.0922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0099F, 2.9622F, 0.3074F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(22, 42).addBox(-0.5F, -2.0F, -2.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2379F, 8.716F, 1.472F, -0.7559F, -0.1729F, 0.2176F));

		PartDefinition cube_r156 = leftarm2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(95, 94).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.899F, 0.331F, 1.5708F, 0.7069F, -1.5708F));

		PartDefinition cube_r157 = leftarm2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(20, 91).addBox(0.005F, -1.8866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(90, 65).addBox(0.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, 1.1298F, -0.0451F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r158 = leftarm2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(45, 87).addBox(-0.9598F, 0.3375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.8702F, 1.3549F, -1.5708F, -1.3788F, 1.5708F));

		PartDefinition cube_r159 = leftarm2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(28, 77).addBox(-0.559F, -0.121F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.4486F, -1.5795F));

		PartDefinition cube_r160 = leftarm2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(88, 79).addBox(-0.6095F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, 1.5708F, -1.1694F, -1.5795F));

		PartDefinition cube_r161 = leftarm2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(97, 31).addBox(-1.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(48, 96).addBox(-1.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.0024F, 1.4198F, -0.6259F, -1.5708F, -1.1868F, 1.5621F));

		PartDefinition cube_r162 = leftarm2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(58, 66).addBox(-0.0572F, -0.7033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.6454F, 0.0086F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4087F, 5.0385F, 0.2275F, 0.0264F, -0.0191F, -0.0459F));

		PartDefinition cube_r163 = leftArm3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(79, 15).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, 0.8203F, -0.0002F, 0.0001F));

		PartDefinition cube_r164 = leftArm4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(45, 56).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftArm5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(45, 18).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6531F, 9.9173F, -3.5745F, -0.7298F, -0.2044F, 0.6399F));

		PartDefinition cube_r166 = rightarm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(28, 73).addBox(-1.0F, 1.3894F, -1.614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.0672F, 0.5031F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r167 = rightarm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(63, 10).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.7154F, 2.2335F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r168 = rightarm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(37, 69).addBox(-1.0F, 1.1933F, 0.7129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.0672F, 0.5031F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0096F, -1.1508F, 1.512F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r170 = rightarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 52).addBox(-0.5F, -0.825F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0126F, 0.139F, -1.4061F, -2.3039F, -0.0014F, 0.001F));

		PartDefinition cube_r171 = rightarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 91).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0087F, -0.9903F, 2.028F, -1.9112F, -0.0014F, 0.001F));

		PartDefinition cube_r172 = rightarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(85, 87).addBox(-0.5F, -0.1F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0032F, 5.1766F, -1.3838F, -0.0874F, -0.0011F, 0.0013F));

		PartDefinition cube_r173 = rightarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(25, 58).addBox(-0.5F, -2.0F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.0005F, 5.9072F, 1.0812F, 0.2181F, -0.0011F, 0.0013F));

		PartDefinition cube_r174 = rightarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0043F, 3.5312F, -0.4337F, -0.0001F, -0.0011F, 0.0013F));

		PartDefinition cube_r175 = rightarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(86, 49).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0043F, 4.1312F, -0.3337F, 0.349F, -0.0011F, 0.0013F));

		PartDefinition cube_r176 = rightarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0057F, 2.1652F, -0.0676F, 0.5235F, -0.0011F, 0.0013F));

		PartDefinition cube_r177 = rightarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(79, 31).addBox(-0.4832F, -2.2493F, -0.6624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.9622F, 0.3074F, 0.109F, -0.0011F, 0.0013F));

		PartDefinition cube_r178 = rightarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(40, 84).addBox(-0.7F, -0.6F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0085F, 2.059F, -0.6576F, 0.5531F, -0.3245F, 0.4758F));

		PartDefinition cube_r179 = rightarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(39, 64).addBox(-0.4984F, 0.6953F, -1.9255F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.915F, 0.6326F, -0.0014F, 0.001F));

		PartDefinition cube_r180 = rightarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(23, 69).addBox(-0.5F, -1.8F, -0.925F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0095F, 1.622F, -1.0943F, 0.7199F, -0.0014F, 0.001F));

		PartDefinition cube_r181 = rightarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(79, 12).addBox(-0.4984F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.915F, -0.0655F, -0.0014F, 0.001F));

		PartDefinition cube_r182 = rightarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(64, 62).addBox(-0.5F, -1.45F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0111F, -0.4352F, -0.7661F, -1.4836F, -0.0014F, 0.001F));

		PartDefinition cube_r183 = rightarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(14, 96).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(97, 40).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0111F, 0.4176F, -1.4206F, -0.6546F, -0.0014F, 0.001F));

		PartDefinition cube_r184 = rightarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(84, 35).addBox(-0.4901F, -0.9135F, -0.0922F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0099F, 2.9622F, 0.3074F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -2.0F, -2.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2379F, 8.716F, 1.472F, -1.2387F, 0.3879F, -0.4216F));

		PartDefinition cube_r186 = rightarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(25, 96).addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.899F, 0.331F, 1.5708F, -0.7069F, 1.5708F));

		PartDefinition cube_r187 = rightarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(44, 91).addBox(-1.005F, -1.8866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(91, 10).addBox(-1.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, 1.1298F, -0.0451F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r188 = rightarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(70, 87).addBox(-0.0402F, 0.3375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.8702F, 1.3549F, -1.5708F, 1.3788F, -1.5708F));

		PartDefinition cube_r189 = rightarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 77).addBox(-0.441F, -0.121F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.4486F, 1.5795F));

		PartDefinition cube_r190 = rightarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(5, 89).addBox(-0.3905F, -1.7492F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, 1.5708F, 1.1694F, 1.5795F));

		PartDefinition cube_r191 = rightarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(43, 97).addBox(0.117F, -1.7347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(63, 96).addBox(0.117F, -1.2347F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.0024F, 1.4198F, -0.6259F, -1.5708F, 1.1868F, -1.5621F));

		PartDefinition cube_r192 = rightarm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(67, 15).addBox(-0.9428F, -0.7033F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.6454F, 0.0086F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4087F, 5.0385F, 0.2275F, 0.0264F, 0.0191F, 0.0459F));

		PartDefinition cube_r193 = rightArm3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(79, 21).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, 0.5891F, 0.2818F, -0.3941F));

		PartDefinition cube_r194 = rightArm4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(54, 57).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r195 = rightArm5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(45, 28).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5998F, 6.5849F, -6.9685F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition Bodyfront_r10 = bone.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.38F, -5.5229F, -0.4702F, 1.6396F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r11 = bone.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(7, 75).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.6338F, -8.0713F, -1.1301F, 2.3377F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r12 = bone.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(27, 49).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8126F, -7.9774F, 0.8171F, 1.3677F, 0.0872F, -0.2625F));

		PartDefinition Bodyfront_r13 = bone.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(54, 12).addBox(2.9842F, -0.1757F, 3.0395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(54, 22).addBox(2.9842F, -0.5757F, 1.5395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.4912F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r14 = bone.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(90, 23).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6132F, -8.7021F, 0.7917F, 1.3254F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r15 = bone.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(0, 37).addBox(2.9842F, 0.0397F, 4.4729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.6308F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r16 = bone.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(0, 18).addBox(2.9842F, 0.2479F, 1.8265F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.7617F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r17 = bone.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(49, 0).addBox(2.9842F, 0.1617F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.8395F, -3.8413F, -1.1817F, 1.5785F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r18 = bone.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(49, 6).addBox(2.9842F, -0.6383F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.8012F, -3.9303F, -0.3876F, 1.753F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r19 = bone.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(40, 79).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4322F, 0.4437F, 1.8803F, 1.1772F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r20 = bone.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(25, 64).addBox(2.8189F, -0.1096F, -1.0343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 2.002F, 0.0758F, -0.1247F));

		PartDefinition Bodyfront_r21 = bone.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(72, 4).addBox(2.8189F, -1.0664F, -0.7748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.3126F, 0.0758F, -0.1247F));

		PartDefinition Bodyfront_r22 = bone.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(9, 53).addBox(2.6582F, -0.9157F, -0.8003F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.1336F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r23 = bone.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(14, 72).addBox(2.6582F, -1.4432F, -0.6374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 1.7008F, -0.0221F, 0.3116F));

		PartDefinition Bodyfront_r24 = bone.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(30, 29).addBox(-1.3336F, -1.3999F, -3.3191F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-2.4282F, 6.0194F, 2.1795F, 0.0468F, -0.2163F, -0.0289F));

		PartDefinition Bodyfront_r25 = bone.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(0, 59).addBox(-3.2795F, 2.7904F, 0.5003F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0248F, 0.112F, -1.0022F));

		PartDefinition Bodyfront_r26 = bone.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(30, 23).addBox(-3.0581F, 2.7638F, -1.1132F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0265F, -0.3678F, -1.0144F));

		PartDefinition Bodyfront_r27 = bone.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(0, 26).addBox(-3.9395F, 3.2819F, -1.934F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0131F, -0.0596F, -0.7854F));

		PartDefinition Bodyfront_r28 = bone.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(7, 79).addBox(-3.9746F, 3.4958F, -0.3851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, -0.1789F, -0.4468F, -0.7171F));

		PartDefinition Bodyfront_r29 = bone.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(36, 12).addBox(-0.65F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1214F, 0.2305F, -1.6707F, -0.153F, -0.0045F, -1.4688F));

		PartDefinition Bodyfront_r30 = bone.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(54, 49).addBox(-1.15F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1214F, 0.2305F, -1.6707F, -0.1866F, -0.6072F, -1.3622F));

		PartDefinition Bodyfront_r31 = bone.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(27, 54).addBox(-1.4F, -1.1F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.5506F, 2.0265F, -1.6607F, -0.1629F, -0.3493F, -1.4133F));

		PartDefinition Bodyfront_r32 = bone.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(52, 35).addBox(-1.0F, -0.9F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5955F, 3.833F, -2.3495F, -0.5723F, -0.5293F, -0.7268F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5998F, 6.5849F, -6.9685F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition Bodyfront_r33 = bone4.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(15, 31).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.38F, -5.5229F, -0.4702F, 1.6396F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r34 = bone4.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.6338F, -8.0713F, -1.1301F, 2.3377F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r35 = bone4.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(27, 49).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8126F, -7.9774F, 0.8171F, 1.3677F, -0.0872F, 0.2625F));

		PartDefinition Bodyfront_r36 = bone4.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-3.9842F, -0.1757F, 3.0395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(54, 22).mirror().addBox(-3.9842F, -0.5757F, 1.5395F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.4912F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r37 = bone4.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(90, 23).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6132F, -8.7021F, 0.7917F, 1.3254F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r38 = bone4.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-3.9842F, 0.0397F, 4.4729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.6308F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r39 = bone4.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-3.9842F, 0.2479F, 1.8265F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.7617F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r40 = bone4.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-3.9842F, 0.1617F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.8395F, -3.8413F, -1.1817F, 1.5785F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r41 = bone4.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(-3.9842F, -0.6383F, -4.1402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.8012F, -3.9303F, -0.3876F, 1.753F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r42 = bone4.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4322F, 0.4437F, 1.8803F, 1.1772F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r43 = bone4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(-3.8189F, -0.1096F, -1.0343F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 2.002F, -0.0758F, 0.1247F));

		PartDefinition Bodyfront_r44 = bone4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-3.8189F, -1.0664F, -0.7748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.3126F, -0.0758F, 0.1247F));

		PartDefinition Bodyfront_r45 = bone4.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(-3.6582F, -0.9157F, -0.8003F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.1336F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r46 = bone4.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-3.6582F, -1.4432F, -0.6374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 1.7008F, 0.0221F, -0.3116F));

		PartDefinition Bodyfront_r47 = bone4.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(30, 29).mirror().addBox(-1.6664F, -1.3999F, -3.3191F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(2.4282F, 6.0194F, 2.1795F, 0.0468F, 0.2163F, 0.0289F));

		PartDefinition Bodyfront_r48 = bone4.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(1.2795F, 2.7904F, 0.5003F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 0.0248F, -0.112F, 1.0022F));

		PartDefinition Bodyfront_r49 = bone4.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(30, 23).mirror().addBox(0.0581F, 2.7638F, -1.1132F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 0.0265F, 0.3678F, 1.0144F));

		PartDefinition Bodyfront_r50 = bone4.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(1.9395F, 3.2819F, -1.934F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, 0.0131F, 0.0596F, 0.7854F));

		PartDefinition Bodyfront_r51 = bone4.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(1.9746F, 3.4958F, -0.3851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.0F, -0.1789F, 0.4468F, 0.7171F));

		PartDefinition Bodyfront_r52 = bone4.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(36, 12).mirror().addBox(-2.35F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1214F, 0.2305F, -1.6707F, -0.153F, 0.0045F, 1.4688F));

		PartDefinition Bodyfront_r53 = bone4.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(54, 49).mirror().addBox(-0.85F, -0.5F, -0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1214F, 0.2305F, -1.6707F, -0.1866F, 0.6072F, 1.3622F));

		PartDefinition Bodyfront_r54 = bone4.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(27, 54).mirror().addBox(-0.6F, -1.1F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.5506F, 2.0265F, -1.6607F, -0.1629F, 0.3493F, 1.4133F));

		PartDefinition Bodyfront_r55 = bone4.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-1.0F, -0.9F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5955F, 3.833F, -2.3495F, -0.5723F, 0.5293F, 0.7268F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(72, 51).addBox(-0.5F, -0.442F, -0.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(86, 41).addBox(0.4F, 0.058F, 0.9906F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(86, 41).mirror().addBox(-1.4F, 0.058F, 0.9906F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2756F, 2.0903F, -0.2177F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(5, 98).addBox(0.0F, -1.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.442F, -0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(72, 15).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0937F, 1.7033F, -0.235F, 0.0F, 0.0F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1009F, 3.189F, 0.242F, 1.1479F, 0.0154F, -0.0804F));

		PartDefinition cube_r196 = leftLeg.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 80).addBox(-1.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftLeg.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(21, 73).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftLeg.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(16, 57).addBox(-1.5F, -0.0114F, -0.3769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftLeg.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(80, 57).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftLeg.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftLeg.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(93, 79).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftLeg.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(60, 85).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftLeg.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(34, 85).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftLeg.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(39, 39).addBox(-1.0037F, 1.4859F, -2.7261F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftLeg.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftLeg.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(65, 87).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftLeg.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(53, 72).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1851F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0132F, 7.3211F, -3.9844F, 1.0204F, 0.0356F, 0.0797F));

		PartDefinition cube_r208 = leftLeg2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(93, 97).addBox(-0.5378F, -0.4683F, 0.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2687F, 2.0524F, -1.0329F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftLeg2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(77, 77).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3065F, 0.5724F, -0.2185F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftLeg2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(63, 77).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3065F, 0.1082F, 0.0775F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftLeg2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(77, 71).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3065F, 0.9051F, 0.1472F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftLeg2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(96, 9).addBox(-0.5884F, -0.2661F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(9, 96).addBox(-0.5884F, -0.2661F, -0.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7935F, 4.7581F, -1.4386F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftLeg2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 82).addBox(-1.0F, -0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3065F, 3.4574F, -2.1128F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftLeg2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(81, 74).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3065F, 3.4574F, -2.1128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftLeg2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(83, 97).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3065F, 2.939F, -1.7695F, -0.2161F, 0.0092F, 0.0096F));

		PartDefinition cube_r216 = leftLeg2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(89, 33).addBox(-0.5378F, -1.3361F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2687F, 2.0524F, -1.0329F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftLeg2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(96, 48).addBox(-0.5542F, 0.1656F, -0.8185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftLeg2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(35, 98).addBox(-0.5542F, 0.8467F, -0.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftLeg2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(98, 71).addBox(-0.5542F, 1.0615F, 0.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftLeg2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 97).addBox(-0.5542F, 1.0927F, 0.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftLeg2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(98, 12).addBox(-0.5542F, 0.2368F, 1.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftLeg2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(73, 97).addBox(-0.5542F, 0.0993F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 97).addBox(-0.5542F, 0.0993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftLeg2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(98, 3).addBox(-0.5542F, -0.8175F, 0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftLeg2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(72, 83).addBox(-0.5542F, -0.4313F, -0.5233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftLeg2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(55, 83).addBox(-0.5542F, -1.6846F, -0.4843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7593F, 3.8027F, -0.4922F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftLeg2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5378F, -0.4127F, -0.5745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2687F, 2.0524F, -1.0329F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1045F, 4.6995F, -2.2195F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftLeg3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(41, 60).addBox(-1.5884F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 2.087F, 0.2608F, -0.2947F, -0.008F, 0.0104F));

		PartDefinition cube_r228 = leftArm7.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(60, 43).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftArm6.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(59, 39).addBox(-1.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1009F, 3.189F, 0.242F, 0.188F, -0.0154F, 0.0804F));

		PartDefinition cube_r230 = rightLeg.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(81, 18).addBox(-0.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightLeg.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(45, 73).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r232 = rightLeg.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.0114F, -0.3769F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r233 = rightLeg.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(74, 80).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r234 = rightLeg.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(14, 80).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9326F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightLeg.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(35, 95).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightLeg.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightLeg.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(50, 86).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightLeg.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(11, 42).addBox(-0.9963F, 1.4859F, -2.7261F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightLeg.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(40, 73).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightLeg.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(75, 87).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightLeg.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(35, 73).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1851F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0132F, 7.3211F, -3.9844F, 1.1077F, -0.0356F, -0.0797F));

		PartDefinition cube_r242 = rightLeg2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 98).addBox(-0.4622F, -0.4683F, 0.4282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2687F, 2.0524F, -1.0329F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightLeg2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(50, 78).addBox(-1.0F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3065F, 0.5724F, -0.2185F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightLeg2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(70, 77).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3065F, 0.1082F, 0.0775F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightLeg2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(78, 42).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3065F, 0.9051F, 0.1472F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightLeg2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(96, 45).addBox(-0.4116F, -0.2661F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 96).addBox(-0.4116F, -0.2661F, -0.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7935F, 4.7581F, -1.4386F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r247 = rightLeg2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(33, 82).addBox(-1.0F, -0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3065F, 3.4574F, -2.1128F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightLeg2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(81, 80).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3065F, 3.4574F, -2.1128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightLeg2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(88, 97).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3065F, 2.939F, -1.7695F, -0.2161F, -0.0092F, -0.0096F));

		PartDefinition cube_r250 = rightLeg2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(89, 36).addBox(-0.4622F, -1.3361F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2687F, 2.0524F, -1.0329F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightLeg2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(96, 74).addBox(-0.4458F, 0.1656F, -0.8185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightLeg2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(98, 51).addBox(-0.4458F, 0.8467F, -0.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightLeg2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(98, 77).addBox(-0.4458F, 1.0615F, 0.212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r254 = rightLeg2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(58, 97).addBox(-0.4458F, 1.0927F, 0.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightLeg2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(98, 18).addBox(-0.4458F, 0.2368F, 1.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r256 = rightLeg2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(97, 82).addBox(-0.4458F, 0.0993F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(78, 97).addBox(-0.4458F, 0.0993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightLeg2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(98, 15).addBox(-0.4458F, -0.8175F, 0.8181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r258 = rightLeg2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(82, 83).addBox(-0.4458F, -0.4313F, -0.5233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r259 = rightLeg2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(67, 83).addBox(-0.4458F, -1.6846F, -0.4843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7593F, 3.8027F, -0.4922F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightLeg2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(25, 89).addBox(-0.4622F, -0.4127F, -0.5745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2687F, 2.0524F, -1.0329F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1045F, 4.6995F, -2.2195F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightLeg3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(16, 61).addBox(-1.4116F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 2.087F, 0.2608F, 0.8834F, 0.008F, -0.0104F));

		PartDefinition cube_r262 = rightArm7.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(61, 33).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightArm6.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(32, 60).addBox(-2.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3151F, -0.5251F, -0.8095F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(77, 83).addBox(0.0849F, -2.59F, -1.07F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0734F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.0407F, -2.0012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5849F, -2.5858F, 1.7961F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(15, 90).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5849F, -1.9858F, 1.8961F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(55, 91).addBox(1.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.4151F, -1.6963F, 0.0778F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(79, 7).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5849F, -1.7403F, -2.0759F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(77, 38).addBox(-0.5F, 1.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5849F, -0.8291F, -1.8648F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(91, 48).addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(91, 45).addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(45, 83).addBox(-0.5F, -1.375F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5849F, -2.9225F, -0.6361F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(9, 47).addBox(-0.2645F, -1.6863F, -6.2744F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.5754F, -0.0719F, 0.5407F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(7, 66).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.637F, 5.5197F, 0.3431F, 2.1426F, -0.0719F, 0.5407F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(98, 54).addBox(-0.2645F, -6.3506F, -2.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 2.5353F, -0.0719F, 0.5407F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(14, 76).addBox(-0.2645F, -4.8284F, -5.3361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 2.2735F, -0.0719F, 0.5407F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(97, 0).addBox(-0.2645F, -2.4508F, -7.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.7499F, -0.0719F, 0.5407F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(96, 86).addBox(-0.2645F, -7.3761F, 0.7932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 3.1025F, -0.0719F, 0.5407F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(65, 4).addBox(-0.2645F, -0.2555F, -6.4115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.7935F, -0.0719F, 0.5407F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(89, 6).addBox(-0.2645F, -0.5383F, -6.6303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 2.1426F, -0.0719F, 0.5407F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(30, 89).addBox(-0.2645F, 3.7319F, -3.6319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.3572F, -0.0719F, 0.5407F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(46, 66).addBox(-0.2645F, 3.221F, -3.3881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 1.0518F, -0.0719F, 0.5407F));

		PartDefinition Hips_r26 = bone2.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(50, 61).addBox(-0.2645F, 2.497F, -1.6504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, 0.6591F, -0.0719F, 0.5407F));

		PartDefinition Hips_r27 = bone2.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(98, 97).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.0599F, 2.6345F, -1.8993F, -0.2411F, -0.0101F, 0.4258F));

		PartDefinition Hips_r28 = bone2.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(28, 35).addBox(-0.6F, -1.0F, -1.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.4049F, 3.6067F, -0.6519F, 0.5007F, -0.0101F, 0.4258F));

		PartDefinition Hips_r29 = bone2.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(42, 44).addBox(-0.2645F, 2.7059F, 0.1095F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8848F, 0.8824F, 0.1888F, -0.2572F, -0.0719F, 0.5407F));

		PartDefinition Hips_r30 = bone2.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(45, 22).addBox(-0.5F, -1.15F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2001F, 1.3717F, 0.0274F, -1.0297F, 0.0F, 0.2618F));

		PartDefinition Hips_r31 = bone2.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(9, 60).addBox(-0.5F, -1.8F, -0.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1336F, 1.62F, -1.0451F, 0.0175F, 0.0F, 0.2618F));

		PartDefinition Hips_r32 = bone2.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(57, 61).addBox(0.2001F, -0.7637F, -4.1237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1152F, -0.9176F, 2.0888F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Hips_r33 = bone2.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(18, 49).addBox(0.0849F, -2.5917F, -1.86F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3151F, -0.5251F, -0.8095F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition Hips_r34 = bone5.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(-1.0849F, -2.59F, -1.07F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0734F, 0.0F, 0.0F));

		PartDefinition Hips_r35 = bone5.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -0.0407F, -2.0012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.5858F, 1.7961F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r36 = bone5.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.9858F, 1.8961F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Hips_r37 = bone5.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(55, 91).mirror().addBox(-2.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.4151F, -1.6963F, 0.0778F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Hips_r38 = bone5.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(79, 7).mirror().addBox(-0.5F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.7403F, -2.0759F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Hips_r39 = bone5.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(77, 38).mirror().addBox(-0.5F, 1.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -0.8291F, -1.8648F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r40 = bone5.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(91, 48).mirror().addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r41 = bone5.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r42 = bone5.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-0.5F, -1.375F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.9225F, -0.6361F, 1.501F, 0.0F, 0.0F));

		PartDefinition Hips_r43 = bone5.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(9, 47).mirror().addBox(-0.7355F, -1.6863F, -6.2744F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.5754F, 0.0719F, -0.5407F));

		PartDefinition Hips_r44 = bone5.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.637F, 5.5197F, 0.3431F, 2.1426F, 0.0719F, -0.5407F));

		PartDefinition Hips_r45 = bone5.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(98, 54).mirror().addBox(-0.7355F, -6.3506F, -2.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 2.5353F, 0.0719F, -0.5407F));

		PartDefinition Hips_r46 = bone5.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-0.7355F, -4.8284F, -5.3361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 2.2735F, 0.0719F, -0.5407F));

		PartDefinition Hips_r47 = bone5.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.7355F, -2.4508F, -7.0332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.7499F, 0.0719F, -0.5407F));

		PartDefinition Hips_r48 = bone5.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-0.7355F, -7.3761F, 0.7932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 3.1025F, 0.0719F, -0.5407F));

		PartDefinition Hips_r49 = bone5.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(65, 4).mirror().addBox(-0.7355F, -0.2555F, -6.4115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.7935F, 0.0719F, -0.5407F));

		PartDefinition Hips_r50 = bone5.addOrReplaceChild("Hips_r50", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(-0.7355F, -0.5383F, -6.6303F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 2.1426F, 0.0719F, -0.5407F));

		PartDefinition Hips_r51 = bone5.addOrReplaceChild("Hips_r51", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.7355F, 3.7319F, -3.6319F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.3572F, 0.0719F, -0.5407F));

		PartDefinition Hips_r52 = bone5.addOrReplaceChild("Hips_r52", CubeListBuilder.create().texOffs(46, 66).mirror().addBox(-0.7355F, 3.221F, -3.3881F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 1.0518F, 0.0719F, -0.5407F));

		PartDefinition Hips_r53 = bone5.addOrReplaceChild("Hips_r53", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.7355F, 2.497F, -1.6504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, 0.6591F, 0.0719F, -0.5407F));

		PartDefinition Hips_r54 = bone5.addOrReplaceChild("Hips_r54", CubeListBuilder.create().texOffs(98, 97).mirror().addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0599F, 2.6345F, -1.8993F, -0.2411F, 0.0101F, -0.4258F));

		PartDefinition Hips_r55 = bone5.addOrReplaceChild("Hips_r55", CubeListBuilder.create().texOffs(28, 35).mirror().addBox(-0.4F, -1.0F, -1.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.4049F, 3.6067F, -0.6519F, 0.5007F, 0.0101F, -0.4258F));

		PartDefinition Hips_r56 = bone5.addOrReplaceChild("Hips_r56", CubeListBuilder.create().texOffs(42, 44).mirror().addBox(-0.7355F, 2.7059F, 0.1095F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8848F, 0.8824F, 0.1888F, -0.2572F, 0.0719F, -0.5407F));

		PartDefinition Hips_r57 = bone5.addOrReplaceChild("Hips_r57", CubeListBuilder.create().texOffs(45, 22).mirror().addBox(-0.5F, -1.15F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 1.3717F, 0.0274F, -1.0297F, 0.0F, -0.2618F));

		PartDefinition Hips_r58 = bone5.addOrReplaceChild("Hips_r58", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-0.5F, -1.8F, -0.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 1.62F, -1.0451F, 0.0175F, 0.0F, -0.2618F));

		PartDefinition Hips_r59 = bone5.addOrReplaceChild("Hips_r59", CubeListBuilder.create().texOffs(57, 61).mirror().addBox(-1.2001F, -0.7637F, -4.1237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.1152F, -0.9176F, 2.0888F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Hips_r60 = bone5.addOrReplaceChild("Hips_r60", CubeListBuilder.create().texOffs(18, 49).mirror().addBox(-1.0849F, -2.5917F, -1.86F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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