package fossils.fossils.client.blockentity.model.jonkeria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JonkeriaFossilModel extends SkullModelBase {
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
	private final ModelPart bone5;
	private final ModelPart bone6;

	public JonkeriaFossilModel(ModelPart root) {
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
		this.bone5 = this.Hips.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.1161F, 18.1281F, -0.499F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(95, 75).addBox(0.0F, -1.5666F, 0.0589F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -0.7127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(93, 95).addBox(0.0F, -2.0005F, -0.0005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -2.7127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(30, 86).addBox(0.0F, -2.1146F, -0.0095F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6373F, -4.8127F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-2.2992F, -0.1F, 1.0826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 0).mirror().addBox(-3.6992F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(82, 0).addBox(0.2992F, -0.1F, 1.0826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(-0.3008F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(28, 35).addBox(-0.5F, -0.5F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.1934F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.9503F, -0.0785F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.2503F, -5.1641F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(30, 27).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(87, 92).addBox(0.0F, -2.6281F, 0.179F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4811F, -2.0115F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(84, 92).addBox(0.0F, -2.4281F, -0.021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7936F, -3.7841F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(23, 93).addBox(0.0F, -2.4204F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8936F, -5.9841F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r6 = Bodymiddle.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(82, 60).mirror().addBox(-3.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1582F, 0.0905F, -0.8683F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1879F, 0.0316F, -0.391F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(52, 40).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1879F, 0.0316F, -0.4346F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-3.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1582F, 0.0905F, -0.9119F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(7, 83).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.4311F, 0.0645F, -0.3984F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.3628F, 0.2296F, -0.8547F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(82, 60).addBox(1.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1582F, -0.0905F, 0.8683F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(81, 28).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1879F, -0.0316F, 0.391F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(52, 40).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1879F, -0.0316F, 0.4346F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(82, 53).addBox(1.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1582F, -0.0905F, 0.9119F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(7, 83).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.4311F, -0.0645F, 0.3984F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(78, 16).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.3628F, -0.2296F, 0.8547F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1026F, -5.9083F, 0.1584F, -0.1293F, -0.0206F));

		PartDefinition Bodymiddle_r18 = body2.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(64, 92).addBox(0.0F, -2.4957F, -0.0065F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r19 = body2.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(93, 8).addBox(0.0F, -2.795F, -0.1089F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r20 = body2.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(72, 26).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.2915F, 0.0463F, -0.3795F));

		PartDefinition Bodymiddle_r21 = body2.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(72, 24).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -1.5986F, 0.2442F, 0.151F, -0.8505F));

		PartDefinition Bodymiddle_r22 = body2.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(17, 72).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.3631F, 0.0452F, -0.1857F));

		PartDefinition Bodymiddle_r23 = body2.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.3094F, 0.1822F, -0.6492F));

		PartDefinition Bodymiddle_r24 = body2.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-6.3818F, -3.8375F, -0.2995F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1965F, 0.2798F, -1.1324F));

		PartDefinition Bodymiddle_r25 = body2.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.3556F, 0.0361F, -0.1518F));

		PartDefinition Bodymiddle_r26 = body2.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(53, 70).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.3068F, 0.1707F, -0.6154F));

		PartDefinition Bodymiddle_r27 = body2.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1997F, 0.2685F, -1.0973F));

		PartDefinition Bodymiddle_r28 = body2.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(72, 26).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.2915F, -0.0463F, 0.3795F));

		PartDefinition Bodymiddle_r29 = body2.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(72, 24).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -1.5986F, 0.2442F, -0.151F, 0.8505F));

		PartDefinition Bodymiddle_r30 = body2.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(17, 72).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.3631F, -0.0452F, 0.1857F));

		PartDefinition Bodymiddle_r31 = body2.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(71, 70).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.3094F, -0.1822F, 0.6492F));

		PartDefinition Bodymiddle_r32 = body2.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(82, 62).addBox(4.3818F, -3.8375F, -0.2995F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1965F, -0.2798F, 1.1324F));

		PartDefinition Bodymiddle_r33 = body2.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(71, 48).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.3556F, -0.0361F, 0.1518F));

		PartDefinition Bodymiddle_r34 = body2.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(53, 70).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.3068F, -0.1707F, 0.6154F));

		PartDefinition Bodymiddle_r35 = body2.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(69, 16).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1997F, -0.2685F, 1.0973F));

		PartDefinition Bodymiddle_r36 = body2.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(61, 92).addBox(0.0F, -2.7325F, -0.119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r37 = body2.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(0, 9).addBox(-2.5F, -3.0643F, 0.0836F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 12.768F, -6.6774F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r38 = body2.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.0911F, -5.9758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -6.0F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition Bodymiddle_r39 = body.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(92, 73).addBox(0.0F, -2.4882F, 0.0368F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r40 = body.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -1.4986F, 0.2868F, 0.023F, -0.1539F));

		PartDefinition Bodymiddle_r41 = body.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -1.4986F, 0.2506F, 0.1281F, -0.6238F));

		PartDefinition Bodymiddle_r42 = body.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(72, 58).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -1.4986F, 0.1694F, 0.205F, -1.1045F));

		PartDefinition Bodymiddle_r43 = body.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(92, 16).mirror().addBox(-4.8427F, -7.3717F, -0.1147F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -1.4986F, 0.0285F, 0.2346F, -1.7302F));

		PartDefinition Bodymiddle_r44 = body.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -5.4986F, 0.0299F, 0.2259F, -1.695F));

		PartDefinition Bodymiddle_r45 = body.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -5.4986F, 0.1653F, 0.1972F, -1.0704F));

		PartDefinition Bodymiddle_r46 = body.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -5.4986F, 0.2435F, 0.123F, -0.5898F));

		PartDefinition Bodymiddle_r47 = body.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(53, 72).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3339F, -5.4986F, 0.2782F, 0.0217F, -0.1192F));

		PartDefinition Bodymiddle_r48 = body.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(14, 78).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.2782F, 0.0217F, -0.1192F));

		PartDefinition Bodymiddle_r49 = body.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.2435F, 0.123F, -0.5898F));

		PartDefinition Bodymiddle_r50 = body.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.1653F, 0.1972F, -1.0704F));

		PartDefinition Bodymiddle_r51 = body.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-6.8427F, -7.3717F, -0.1148F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2339F, -3.4986F, 0.0299F, 0.2259F, -1.695F));

		PartDefinition Bodymiddle_r52 = body.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(71, 72).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -1.4986F, 0.2868F, -0.023F, 0.1539F));

		PartDefinition Bodymiddle_r53 = body.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(62, 72).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -1.4986F, 0.2506F, -0.1281F, 0.6238F));

		PartDefinition Bodymiddle_r54 = body.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(72, 58).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -1.4986F, 0.1694F, -0.205F, 1.1045F));

		PartDefinition Bodymiddle_r55 = body.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(92, 16).addBox(3.8427F, -7.3717F, -0.1147F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -1.4986F, 0.0285F, -0.2346F, 1.7302F));

		PartDefinition Bodymiddle_r56 = body.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(60, 18).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -5.4986F, 0.0299F, -0.2259F, 1.695F));

		PartDefinition Bodymiddle_r57 = body.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(72, 56).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -5.4986F, 0.1653F, -0.1972F, 1.0704F));

		PartDefinition Bodymiddle_r58 = body.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(62, 70).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -5.4986F, 0.2435F, -0.123F, 0.5898F));

		PartDefinition Bodymiddle_r59 = body.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(53, 72).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3339F, -5.4986F, 0.2782F, -0.0217F, 0.1192F));

		PartDefinition Bodymiddle_r60 = body.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(14, 78).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.2782F, -0.0217F, 0.1192F));

		PartDefinition Bodymiddle_r61 = body.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(75, 34).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.2435F, -0.123F, 0.5898F));

		PartDefinition Bodymiddle_r62 = body.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(74, 44).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.1653F, -0.1972F, 1.0704F));

		PartDefinition Bodymiddle_r63 = body.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(72, 28).addBox(3.8427F, -7.3717F, -0.1148F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2339F, -3.4986F, 0.0299F, -0.2259F, 1.695F));

		PartDefinition Bodymiddle_r64 = body.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(53, 92).addBox(0.0F, -2.355F, 0.0365F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.053F, -6.0088F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r65 = body.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(15, 93).addBox(0.0F, -2.555F, -0.0635F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r66 = body.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, 9.9953F, -7.0068F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(19, 18).addBox(-0.5F, -0.0056F, -6.9631F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(92, 78).addBox(0.0F, -2.5936F, -5.0725F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6225F, -6.9012F, 0.083F, -0.087F, -0.0072F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(81, 92).addBox(0.0F, -2.5734F, -0.0687F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3732F, -0.957F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(35, 91).addBox(0.0F, -2.648F, 0.0242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -3.107F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.2018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(36, 15).addBox(-2.0F, -1.0841F, 0.018F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 9.8061F, -8.1683F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(36, 20).addBox(-2.5F, 1.7161F, -3.8661F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 9.4623F, -6.2184F, -1.309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(33, 42).addBox(-2.0F, 0.7096F, -2.8856F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 9.4623F, -6.2184F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r67 = Bodyfront.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(74, 6).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.3207F, 0.1648F, -0.7092F));

		PartDefinition Bodymiddle_r68 = Bodyfront.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.3653F, 0.0247F, -0.2477F));

		PartDefinition Bodymiddle_r69 = Bodyfront.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.2152F, 0.2696F, -1.1893F));

		PartDefinition Bodymiddle_r70 = Bodyfront.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(93, 27).mirror().addBox(-4.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.0263F, 0.313F, -1.8264F));

		PartDefinition Bodymiddle_r71 = Bodyfront.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(73, 54).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.021F, 0.2602F, -1.8274F));

		PartDefinition Bodymiddle_r72 = Bodyfront.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(71, 46).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.1787F, 0.2301F, -1.1978F));

		PartDefinition Bodymiddle_r73 = Bodyfront.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.2705F, 0.1461F, -0.7164F));

		PartDefinition Bodymiddle_r74 = Bodyfront.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.3126F, 0.0302F, -0.2485F));

		PartDefinition Bodymiddle_r75 = Bodyfront.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(38, 13).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.0336F, 0.1649F, -1.7293F));

		PartDefinition Bodymiddle_r76 = Bodyfront.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(73, 50).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.1323F, 0.1455F, -1.111F));

		PartDefinition Bodymiddle_r77 = Bodyfront.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(73, 2).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.1904F, 0.0922F, -0.6305F));

		PartDefinition Bodymiddle_r78 = Bodyfront.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.2171F, 0.0183F, -0.1554F));

		PartDefinition Bodymiddle_r79 = Bodyfront.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(74, 6).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.3207F, -0.1648F, 0.7092F));

		PartDefinition Bodymiddle_r80 = Bodyfront.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(81, 64).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.3653F, -0.0247F, 0.2477F));

		PartDefinition Bodymiddle_r81 = Bodyfront.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(74, 4).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.2152F, -0.2696F, 1.1893F));

		PartDefinition Bodymiddle_r82 = Bodyfront.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(93, 27).addBox(3.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.0263F, -0.313F, 1.8264F));

		PartDefinition Bodymiddle_r83 = Bodyfront.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(73, 54).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.021F, -0.2602F, 1.8274F));

		PartDefinition Bodymiddle_r84 = Bodyfront.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(71, 46).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.1787F, -0.2301F, 1.1978F));

		PartDefinition Bodymiddle_r85 = Bodyfront.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(73, 52).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.2705F, -0.1461F, 0.7164F));

		PartDefinition Bodymiddle_r86 = Bodyfront.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(71, 18).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.3126F, -0.0302F, 0.2485F));

		PartDefinition Bodymiddle_r87 = Bodyfront.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(38, 13).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.0336F, -0.1649F, 1.7293F));

		PartDefinition Bodymiddle_r88 = Bodyfront.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(73, 50).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.1323F, -0.1455F, 1.111F));

		PartDefinition Bodymiddle_r89 = Bodyfront.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(73, 2).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.1904F, -0.0922F, 0.6305F));

		PartDefinition Bodymiddle_r90 = Bodyfront.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(73, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.2171F, -0.0183F, 0.1554F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(36, 56).addBox(-0.5F, -0.4905F, -2.9026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5512F, -5.8931F, -0.1442F, -0.3025F, 0.0432F));

		PartDefinition Bodymiddle_r91 = Neck.addOrReplaceChild("Bodymiddle_r91", CubeListBuilder.create().texOffs(74, 10).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0191F, -2.4443F, 0.8246F, 0.59F, -0.7989F));

		PartDefinition Bodymiddle_r92 = Neck.addOrReplaceChild("Bodymiddle_r92", CubeListBuilder.create().texOffs(95, 79).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0191F, -2.4443F, 0.9658F, 0.2277F, -0.4525F));

		PartDefinition Bodymiddle_r93 = Neck.addOrReplaceChild("Bodymiddle_r93", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-5.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -0.4443F, 0.2002F, 0.5122F, -1.1942F));

		PartDefinition Bodymiddle_r94 = Neck.addOrReplaceChild("Bodymiddle_r94", CubeListBuilder.create().texOffs(74, 8).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -0.4443F, 0.4282F, 0.3848F, -0.6789F));

		PartDefinition Bodymiddle_r95 = Neck.addOrReplaceChild("Bodymiddle_r95", CubeListBuilder.create().texOffs(93, 42).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -0.4443F, 0.556F, 0.1768F, -0.2275F));

		PartDefinition Bodymiddle_r96 = Neck.addOrReplaceChild("Bodymiddle_r96", CubeListBuilder.create().texOffs(95, 79).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0191F, -2.4443F, 0.9658F, -0.2277F, 0.4525F));

		PartDefinition Bodymiddle_r97 = Neck.addOrReplaceChild("Bodymiddle_r97", CubeListBuilder.create().texOffs(74, 10).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0191F, -2.4443F, 0.8246F, -0.59F, 0.7989F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(90, 92).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4253F, -2.8983F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(78, 92).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4253F, -0.8983F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r98 = Neck.addOrReplaceChild("Bodymiddle_r98", CubeListBuilder.create().texOffs(81, 66).addBox(3.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -0.4443F, 0.2002F, -0.5122F, 1.1942F));

		PartDefinition Bodymiddle_r99 = Neck.addOrReplaceChild("Bodymiddle_r99", CubeListBuilder.create().texOffs(74, 8).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -0.4443F, 0.4282F, -0.3848F, 0.6789F));

		PartDefinition Bodymiddle_r100 = Neck.addOrReplaceChild("Bodymiddle_r100", CubeListBuilder.create().texOffs(93, 42).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -0.4443F, 0.556F, -0.1768F, 0.2275F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.5915F, -3.0078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 49).addBox(0.0F, -3.0915F, -2.0078F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, -0.1512F, -0.4085F, -0.0616F));

		PartDefinition Bodymiddle_r101 = Neck2.addOrReplaceChild("Bodymiddle_r101", CubeListBuilder.create().texOffs(64, 54).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -1.6081F, 0.3117F, 0.8872F, -1.0766F));

		PartDefinition Bodymiddle_r102 = Neck2.addOrReplaceChild("Bodymiddle_r102", CubeListBuilder.create().texOffs(26, 72).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -1.6081F, 0.7402F, 0.6597F, -0.4764F));

		PartDefinition Bodymiddle_r103 = Neck2.addOrReplaceChild("Bodymiddle_r103", CubeListBuilder.create().texOffs(64, 54).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -1.6081F, 0.3117F, -0.8872F, 1.0766F));

		PartDefinition Bodymiddle_r104 = Neck2.addOrReplaceChild("Bodymiddle_r104", CubeListBuilder.create().texOffs(26, 72).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -1.6081F, 0.7402F, -0.6597F, 0.4764F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(15, 35).addBox(-0.5F, -0.489F, -5.0026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0899F, -2.9508F, 0.1545F, -0.2372F, -0.207F));

		PartDefinition Neck_r3 = Neck3.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(96, 3).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7511F, -4.4968F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = Neck3.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(93, 3).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4735F, -1.054F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r5 = Neck3.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(37, 78).addBox(0.0F, -2.5F, -1.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -2.0026F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r105 = Neck3.addOrReplaceChild("Bodymiddle_r105", CubeListBuilder.create().texOffs(82, 2).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.5682F, 0.5114F, 0.9568F, -1.1113F));

		PartDefinition Bodymiddle_r106 = Neck3.addOrReplaceChild("Bodymiddle_r106", CubeListBuilder.create().texOffs(95, 81).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.5682F, 0.9155F, 0.6524F, -0.5634F));

		PartDefinition Bodymiddle_r107 = Neck3.addOrReplaceChild("Bodymiddle_r107", CubeListBuilder.create().texOffs(56, 95).mirror().addBox(-1.838F, -0.4614F, -0.411F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -3.8682F, 0.2269F, 1.0198F, -1.3988F));

		PartDefinition Bodymiddle_r108 = Neck3.addOrReplaceChild("Bodymiddle_r108", CubeListBuilder.create().texOffs(48, 95).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -3.8682F, 0.7957F, 0.7948F, -0.6922F));

		PartDefinition Bodymiddle_r109 = Neck3.addOrReplaceChild("Bodymiddle_r109", CubeListBuilder.create().texOffs(69, 81).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -2.0682F, 0.2572F, 0.9213F, -1.2561F));

		PartDefinition Bodymiddle_r110 = Neck3.addOrReplaceChild("Bodymiddle_r110", CubeListBuilder.create().texOffs(94, 62).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -2.0682F, 0.7303F, 0.707F, -0.6194F));

		PartDefinition Bodymiddle_r111 = Neck3.addOrReplaceChild("Bodymiddle_r111", CubeListBuilder.create().texOffs(56, 95).addBox(0.838F, -0.4614F, -0.411F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -3.8682F, 0.2269F, -1.0198F, 1.3988F));

		PartDefinition Bodymiddle_r112 = Neck3.addOrReplaceChild("Bodymiddle_r112", CubeListBuilder.create().texOffs(48, 95).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -3.8682F, 0.7957F, -0.7948F, 0.6922F));

		PartDefinition Bodymiddle_r113 = Neck3.addOrReplaceChild("Bodymiddle_r113", CubeListBuilder.create().texOffs(95, 81).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.5682F, 0.9155F, -0.6524F, 0.5634F));

		PartDefinition Bodymiddle_r114 = Neck3.addOrReplaceChild("Bodymiddle_r114", CubeListBuilder.create().texOffs(82, 2).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.5682F, 0.5114F, -0.9568F, 1.1113F));

		PartDefinition Bodymiddle_r115 = Neck3.addOrReplaceChild("Bodymiddle_r115", CubeListBuilder.create().texOffs(69, 81).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -2.0682F, 0.2572F, -0.9213F, 1.2561F));

		PartDefinition Bodymiddle_r116 = Neck3.addOrReplaceChild("Bodymiddle_r116", CubeListBuilder.create().texOffs(94, 62).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -2.0682F, 0.7303F, -0.707F, 0.6194F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1384F, -4.9664F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 95).addBox(0.0F, -0.0098F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0856F, -9.054F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 56).addBox(-0.5F, -0.0098F, -0.7997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.7039F, -8.3509F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 94).addBox(-0.5F, -0.0098F, -0.7997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3455F, -7.4173F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 40).addBox(-0.5F, -2.3F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.1028F, -3.5879F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 65).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.655F, -5.5627F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 74).addBox(-0.5F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.7709F, -3.6398F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 60).addBox(-1.0F, -0.15F, 0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 12).addBox(-1.0F, 0.0097F, -1.998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.2778F, -5.5519F, 0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(31, 52).addBox(-2.0F, -0.5754F, 0.073F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.2668F, -0.0462F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(81, 12).addBox(-2.0F, -0.1004F, -0.377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(24, 82).addBox(-1.5F, -0.1004F, -0.902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(1.0F, -1.3099F, -0.0713F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(82, 30).addBox(-1.5F, -0.1004F, -0.902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(1.0F, -1.3099F, -0.0713F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 82).addBox(-1.5F, 0.0496F, 0.473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(81, 18).addBox(-1.5F, 0.0496F, 0.073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.0F, -1.7315F, -2.1883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(81, 23).addBox(-1.0F, -0.1504F, 0.123F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.7315F, -2.1883F, -0.9425F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9632F, 0.1478F, -1.6712F));

		PartDefinition cube_r14 = leftFace.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(49, 86).addBox(-0.4931F, -0.0861F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(44, 86).addBox(-0.4931F, -0.3611F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8976F, 2.3537F, -6.1075F, 0.3414F, 0.0294F, -0.0856F));

		PartDefinition cube_r15 = leftFace.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 64).addBox(-0.9F, -0.1004F, -0.102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5632F, -1.8516F, 0.9036F, -1.0823F, 0.9792F, -1.0013F));

		PartDefinition cube_r16 = leftFace.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 0).addBox(-0.9F, -0.1004F, -0.102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.8002F, -1.7331F, 1.113F, -0.5787F, 0.4502F, -0.277F));

		PartDefinition cube_r17 = leftFace.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(91, 36).addBox(-0.85F, -0.95F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(91, 33).addBox(-0.85F, -0.95F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6899F, 2.0953F, -6.3063F, -0.2252F, 0.5269F, -0.1664F));

		PartDefinition cube_r18 = leftFace.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(42, 82).addBox(0.4F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9632F, 1.2211F, 1.0348F, -1.3056F, 0.5218F, 0.0453F));

		PartDefinition cube_r19 = leftFace.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 88).addBox(-0.9735F, -0.953F, -0.9902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7045F, 1.9128F, -5.3983F, 0.1323F, -0.0514F, -0.1491F));

		PartDefinition cube_r20 = leftFace.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(5, 95).addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.4412F, 1.1442F, -7.0172F, 1.0472F, 0.3446F, -0.7935F));

		PartDefinition cube_r21 = leftFace.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(94, 89).addBox(-0.8F, -0.2098F, -0.1247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.9882F, 1.2044F, -6.8433F, 1.8762F, 0.3446F, -0.7935F));

		PartDefinition cube_r22 = leftFace.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(94, 86).addBox(-0.8F, -0.2098F, -0.1247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9882F, 1.2044F, -6.8433F, 1.1781F, 0.3446F, -0.7935F));

		PartDefinition cube_r23 = leftFace.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(38, 89).addBox(-0.525F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(10, 89).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.371F, 0.7595F, -6.0956F, 0.3209F, 0.1518F, -0.6022F));

		PartDefinition cube_r24 = leftFace.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(94, 59).addBox(-1.0F, -0.0098F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4632F, 0.1326F, -5.557F, 0.3071F, 0.1787F, -0.6863F));

		PartDefinition cube_r25 = leftFace.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(92, 47).addBox(-0.35F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 92).addBox(-0.475F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0725F, -0.3458F, -1.4554F, -1.4616F, 0.129F, -0.2155F));

		PartDefinition cube_r26 = leftFace.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(74, 87).addBox(-0.4382F, -0.3787F, -0.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3727F, -0.476F, -1.4661F, -0.6762F, 0.129F, -0.2155F));

		PartDefinition cube_r27 = leftFace.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 50).addBox(-0.4382F, -0.4623F, -0.1167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3727F, -0.476F, -1.4661F, -0.1526F, 0.129F, -0.2155F));

		PartDefinition cube_r28 = leftFace.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 81).addBox(-0.553F, -0.6186F, 0.6716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3477F, -0.476F, -1.4661F, 0.0796F, 0.1789F, -0.1511F));

		PartDefinition cube_r29 = leftFace.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(59, 74).addBox(-0.5228F, 0.0566F, -1.9845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.2739F, -1.388F, 0.1368F, 0.0788F, 0.0857F, -0.0704F));

		PartDefinition cube_r30 = leftFace.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 89).addBox(-0.156F, -0.568F, -1.6363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3477F, -0.476F, -1.4661F, 0.3275F, 0.4302F, 0.0259F));

		PartDefinition cube_r31 = leftFace.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(87, 71).addBox(-0.557F, -0.7582F, -0.9778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3477F, -0.476F, -1.4661F, 0.4602F, -0.0351F, -0.0915F));

		PartDefinition cube_r32 = leftFace.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(52, 74).addBox(-1.0F, 0.0F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4632F, -0.3842F, -3.8958F, 0.1395F, 0.2294F, -0.6796F));

		PartDefinition cube_r33 = leftFace.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(45, 74).addBox(-1.0F, 0.0097F, -1.998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4632F, -0.4256F, -3.8807F, 0.2405F, 0.1972F, -0.6742F));

		PartDefinition cube_r34 = leftFace.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 91).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3099F, 1.4218F, -5.0962F, 0.2179F, 0.0496F, -0.1535F));

		PartDefinition cube_r35 = leftFace.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(38, 74).addBox(-0.9709F, -0.9882F, -1.8586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0793F, 1.6522F, 0.1998F, -1.067F, 0.1564F, -0.2587F));

		PartDefinition cube_r36 = leftFace.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(81, 36).addBox(-0.9715F, -1.6972F, -1.8877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0793F, 1.6522F, 0.1998F, -1.5146F, 0.1161F, -0.2576F));

		PartDefinition cube_r37 = leftFace.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(29, 82).addBox(-0.9151F, -2.2866F, -0.8525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0793F, 1.6522F, 0.1998F, -1.0608F, 0.0812F, -0.2572F));

		PartDefinition cube_r38 = leftFace.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(74, 36).addBox(-0.9709F, -0.9814F, -1.9831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.0793F, 1.6522F, 0.1998F, -0.4998F, 0.1564F, -0.2587F));

		PartDefinition cube_r39 = leftFace.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(31, 74).addBox(-0.9709F, -1.1068F, -2.5625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0793F, 1.6522F, 0.1998F, -0.2816F, 0.1564F, -0.2587F));

		PartDefinition cube_r40 = leftFace.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(74, 40).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0762F, 0.4638F, -1.3485F, 0.1339F, 0.1057F, -0.1628F));

		PartDefinition cube_r41 = leftFace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(74, 65).addBox(-1.0F, -1.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5906F, 1.0576F, -2.7563F, 0.1201F, 0.0806F, -0.1305F));

		PartDefinition cube_r42 = leftFace.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(88, 41).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1909F, 0.7727F, -3.2238F, 0.3136F, 0.1263F, -0.1156F));

		PartDefinition cube_r43 = leftFace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(89, 58).addBox(-1.1F, -0.725F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2059F, 2.4319F, -7.1251F, -0.1516F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(58, 89).addBox(-0.725F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2059F, 2.1604F, -7.4124F, -0.1792F, 0.5599F, -0.0959F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(53, 89).addBox(-0.55F, -0.725F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2059F, 2.4319F, -7.1251F, -0.1639F, 0.388F, -0.0625F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(48, 89).addBox(-0.5F, -0.825F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2059F, 2.0556F, -4.6825F, 0.2848F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(89, 61).addBox(-0.5F, -0.375F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 89).addBox(-0.5F, -0.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2059F, 1.2421F, -3.8655F, 0.372F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(88, 26).addBox(-0.475F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2631F, 1.1098F, -4.1674F, 0.372F, 0.036F, -0.1521F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(39, 86).addBox(-0.498F, -0.7171F, -0.5892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.8976F, 2.3537F, -6.1075F, 0.1502F, 0.021F, -0.1072F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(34, 84).addBox(-0.498F, -1.451F, -0.5096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8976F, 2.3537F, -6.1075F, -0.2425F, 0.021F, -0.1072F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9632F, 0.1478F, -1.6712F));

		PartDefinition cube_r51 = rightFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(49, 86).mirror().addBox(-0.5069F, -0.0861F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(44, 86).mirror().addBox(-0.5069F, -0.3611F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8976F, 2.3537F, -6.1075F, 0.3414F, -0.0294F, 0.0856F));

		PartDefinition cube_r52 = rightFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(88, 64).mirror().addBox(-0.1F, -0.1004F, -0.102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.5632F, -1.8516F, 0.9036F, -1.0823F, -0.9792F, 1.0013F));

		PartDefinition cube_r53 = rightFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.1F, -0.1004F, -0.102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.8002F, -1.7331F, 1.113F, -0.5787F, -0.4502F, 0.277F));

		PartDefinition cube_r54 = rightFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(-0.15F, -0.95F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(91, 33).mirror().addBox(-0.15F, -0.95F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6899F, 2.0953F, -6.3063F, -0.2252F, -0.5269F, 0.1664F));

		PartDefinition cube_r55 = rightFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(42, 82).mirror().addBox(-1.4F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9632F, 1.2211F, 1.0348F, -1.3056F, -0.5218F, -0.0453F));

		PartDefinition cube_r56 = rightFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(33, 88).mirror().addBox(-0.0265F, -0.953F, -0.9902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7045F, 1.9128F, -5.3983F, 0.1323F, 0.0514F, 0.1491F));

		PartDefinition cube_r57 = rightFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.4412F, 1.1442F, -7.0172F, 1.0472F, -0.3446F, 0.7935F));

		PartDefinition cube_r58 = rightFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-0.2F, -0.2098F, -0.1247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.9882F, 1.2044F, -6.8433F, 1.8762F, -0.3446F, 0.7935F));

		PartDefinition cube_r59 = rightFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(94, 86).mirror().addBox(-0.2F, -0.2098F, -0.1247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9882F, 1.2044F, -6.8433F, 1.1781F, -0.3446F, 0.7935F));

		PartDefinition cube_r60 = rightFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(-0.475F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(10, 89).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.371F, 0.7595F, -6.0956F, 0.3209F, -0.1518F, 0.6022F));

		PartDefinition cube_r61 = rightFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(94, 59).mirror().addBox(0.0F, -0.0098F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4632F, 0.1326F, -5.557F, 0.3071F, -0.1787F, 0.6863F));

		PartDefinition cube_r62 = rightFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-0.65F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 92).mirror().addBox(-0.525F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0725F, -0.3458F, -1.4554F, -1.4616F, -0.129F, 0.2155F));

		PartDefinition cube_r63 = rightFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(-0.5618F, -0.3787F, -0.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3727F, -0.476F, -1.4661F, -0.6762F, -0.129F, 0.2155F));

		PartDefinition cube_r64 = rightFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(87, 50).mirror().addBox(-0.5618F, -0.4623F, -0.1167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3727F, -0.476F, -1.4661F, -0.1526F, -0.129F, 0.2155F));

		PartDefinition cube_r65 = rightFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 81).mirror().addBox(-0.447F, -0.6186F, 0.6716F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3477F, -0.476F, -1.4661F, 0.0796F, -0.1789F, 0.1511F));

		PartDefinition cube_r66 = rightFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 74).mirror().addBox(-0.4772F, 0.0566F, -1.9845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.2739F, -1.388F, 0.1368F, 0.0788F, -0.0857F, 0.0704F));

		PartDefinition cube_r67 = rightFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.844F, -0.568F, -1.6363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3477F, -0.476F, -1.4661F, 0.3275F, -0.4302F, -0.0259F));

		PartDefinition cube_r68 = rightFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(87, 71).mirror().addBox(-0.443F, -0.7582F, -0.9778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3477F, -0.476F, -1.4661F, 0.4602F, 0.0351F, 0.0915F));

		PartDefinition cube_r69 = rightFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(0.0F, 0.0F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.4632F, -0.3842F, -3.8958F, 0.1395F, -0.2294F, 0.6796F));

		PartDefinition cube_r70 = rightFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(0.0F, 0.0097F, -1.998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4632F, -0.4256F, -3.8807F, 0.2405F, -0.1972F, 0.6742F));

		PartDefinition cube_r71 = rightFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3099F, 1.4218F, -5.0962F, 0.2179F, -0.0496F, 0.1535F));

		PartDefinition cube_r72 = rightFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(38, 74).mirror().addBox(-0.0291F, -0.9882F, -1.8586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0793F, 1.6522F, 0.1998F, -1.067F, -0.1564F, 0.2587F));

		PartDefinition cube_r73 = rightFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 36).mirror().addBox(-0.0285F, -1.6972F, -1.8877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0793F, 1.6522F, 0.1998F, -1.5146F, -0.1161F, 0.2576F));

		PartDefinition cube_r74 = rightFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-0.0849F, -2.2866F, -0.8525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0793F, 1.6522F, 0.1998F, -1.0608F, -0.0812F, 0.2572F));

		PartDefinition cube_r75 = rightFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(74, 36).mirror().addBox(-0.0291F, -0.9814F, -1.9831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0793F, 1.6522F, 0.1998F, -0.4998F, -0.1564F, 0.2587F));

		PartDefinition cube_r76 = rightFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(31, 74).mirror().addBox(-0.0291F, -1.1068F, -2.5625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0793F, 1.6522F, 0.1998F, -0.2816F, -0.1564F, 0.2587F));

		PartDefinition cube_r77 = rightFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0762F, 0.4638F, -1.3485F, 0.1339F, -0.1057F, 0.1628F));

		PartDefinition cube_r78 = rightFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(0.0F, -1.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5906F, 1.0576F, -2.7563F, 0.1201F, -0.0806F, 0.1305F));

		PartDefinition cube_r79 = rightFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(88, 41).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1909F, 0.7727F, -3.2238F, 0.3136F, -0.1263F, 0.1156F));

		PartDefinition cube_r80 = rightFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(89, 58).mirror().addBox(0.1F, -0.725F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2059F, 2.4319F, -7.1251F, -0.1516F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-0.275F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2059F, 2.1604F, -7.4124F, -0.1792F, -0.5599F, 0.0959F));

		PartDefinition cube_r82 = rightFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 89).mirror().addBox(-0.45F, -0.725F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2059F, 2.4319F, -7.1251F, -0.1639F, -0.388F, 0.0625F));

		PartDefinition cube_r83 = rightFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 89).mirror().addBox(-0.5F, -0.825F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2059F, 2.0556F, -4.6825F, 0.2848F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(89, 61).mirror().addBox(-0.5F, -0.375F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(43, 89).mirror().addBox(-0.5F, -0.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2059F, 1.2421F, -3.8655F, 0.372F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(-0.525F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2631F, 1.1098F, -4.1674F, 0.372F, -0.036F, 0.1521F));

		PartDefinition cube_r86 = rightFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(39, 86).mirror().addBox(-0.502F, -0.7171F, -0.5892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.8976F, 2.3537F, -6.1075F, 0.1502F, -0.021F, 0.1072F));

		PartDefinition cube_r87 = rightFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(34, 84).mirror().addBox(-0.502F, -1.451F, -0.5096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8976F, 2.3537F, -6.1075F, -0.2425F, -0.021F, 0.1072F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0698F, -1.6219F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(84, 89).mirror().addBox(0.0516F, -2.2314F, -2.6623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, 0.0508F, -0.0753F, 0.0459F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(79, 89).mirror().addBox(0.0516F, -2.0276F, -3.9046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.0365F, -0.0753F, 0.0459F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(43, 92).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(38, 92).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2351F, -1.2312F, -7.322F, 0.2957F, -0.5811F, -0.2491F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5193F, -0.9644F, -6.8763F, 0.2872F, -0.5985F, -0.0852F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(0.0568F, -3.8573F, -5.2399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.9203F, -1.3664F, 0.1579F, -0.023F, 0.0458F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(87, 15).mirror().addBox(-2.8149F, 1.7357F, -5.2725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.6577F, -0.5982F, 0.0554F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(0.9999F, -1.4162F, -6.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(89, 89).mirror().addBox(0.9999F, -1.5161F, -6.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.1055F, 0.0F, 0.0F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(54, 86).mirror().addBox(-2.6514F, 2.1799F, -5.526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.7373F, -0.5702F, 0.0501F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-2.8149F, -1.4546F, -6.219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(91, 53).mirror().addBox(-2.8149F, -1.4546F, -5.719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 89).mirror().addBox(-2.7152F, -1.3836F, -5.3253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.1341F, -0.5982F, 0.0554F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(0.1961F, -0.7466F, -5.1844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.2262F, -0.0281F, 0.0384F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(-1.7339F, -0.3333F, -5.5275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.2586F, -0.4287F, 0.0503F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(0.2066F, 0.0639F, -4.8497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.3221F, -0.023F, 0.0458F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(0.1567F, -0.565F, -3.9603F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.165F, -0.023F, 0.0458F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(75, 60).mirror().addBox(0.1567F, -1.5325F, -4.1031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.0341F, -0.023F, 0.0458F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(75, 30).mirror().addBox(0.0516F, -0.9528F, -2.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(66, 74).mirror().addBox(0.0516F, -0.4528F, -2.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.211F, -0.0753F, 0.0459F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(0.0516F, -1.9017F, -1.9708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, 0.138F, -0.0753F, 0.0459F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(74, 20).mirror().addBox(-0.012F, -0.6698F, -1.8742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -1.6035F, -0.1799F, 0.0465F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(17, 74).mirror().addBox(-0.0342F, -1.6838F, -1.0619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.9589F, -0.175F, 0.0652F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 87).mirror().addBox(-0.0792F, -1.8849F, 0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -1.3924F, -0.145F, 0.0463F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(87, 68).mirror().addBox(-0.0792F, -0.5193F, 0.6868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.607F, -0.145F, 0.0463F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-0.012F, -1.4171F, -1.1039F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.5214F, -0.1799F, 0.0465F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(0.1961F, -2.0605F, -4.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5059F, 0.7703F, -1.3664F, -0.043F, -0.0281F, 0.0384F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(89, 86).addBox(-1.1961F, -2.0605F, -4.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.043F, 0.0281F, -0.0384F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(84, 89).addBox(-1.0516F, -2.2314F, -2.6623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, 0.0508F, 0.0753F, -0.0459F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(79, 89).addBox(-1.0516F, -2.0276F, -3.9046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.0365F, 0.0753F, -0.0459F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(43, 92).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 92).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2351F, -1.2312F, -7.322F, 0.2957F, 0.5811F, 0.2491F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(82, 78).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5193F, -0.9644F, -6.8763F, 0.2872F, 0.5985F, 0.0852F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(82, 49).addBox(-1.0568F, -3.8573F, -5.2399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5059F, 0.9203F, -1.3664F, 0.1579F, 0.023F, -0.0458F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(87, 15).addBox(1.8149F, 1.7357F, -5.2725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.6577F, 0.5982F, -0.0554F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 86).addBox(1.6514F, 2.1799F, -5.526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.7373F, 0.5702F, -0.0501F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(5, 92).addBox(1.8149F, -1.4546F, -6.219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(91, 53).addBox(1.8149F, -1.4546F, -5.719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 89).addBox(1.7152F, -1.3836F, -5.3253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.1341F, 0.5982F, -0.0554F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(92, 50).addBox(-1.1961F, -0.7466F, -5.1844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.2262F, 0.0281F, -0.0384F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(92, 29).addBox(0.7339F, -0.3333F, -5.5275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.2586F, 0.4287F, -0.0503F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(87, 74).addBox(-1.2066F, 0.0639F, -4.8497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.3221F, 0.023F, -0.0458F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(7, 76).addBox(-1.1567F, -0.565F, -3.9603F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.165F, 0.023F, -0.0458F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(75, 60).addBox(-1.1567F, -1.5325F, -4.1031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.0341F, 0.023F, -0.0458F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(75, 30).addBox(-1.0516F, -0.9528F, -2.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F))
				.texOffs(66, 74).addBox(-1.0516F, -0.4528F, -2.0094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.211F, 0.0753F, -0.0459F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(73, 74).addBox(-1.0516F, -1.9017F, -1.9708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, 0.138F, 0.0753F, -0.0459F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(74, 20).addBox(-0.988F, -0.6698F, -1.8742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -1.6035F, 0.1799F, -0.0465F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(17, 74).addBox(-0.9658F, -1.6838F, -1.0619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.9589F, 0.175F, -0.0652F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(69, 87).addBox(-0.9208F, -1.8849F, 0.1748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -1.3924F, 0.145F, -0.0463F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(87, 68).addBox(-0.9208F, -0.5193F, 0.6868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.607F, 0.145F, -0.0463F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(67, 37).addBox(-0.988F, -1.4171F, -1.1039F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5059F, 0.7703F, -1.3664F, -0.5214F, 0.1799F, -0.0465F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2274F, 8.4252F, -4.9903F, 1.0884F, 0.1478F, -0.4752F));

		PartDefinition cube_r131 = leftarm.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.125F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0154F, 0.9335F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftarm.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(51, 17).addBox(0.0F, 1.1933F, -0.2871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.3672F, -0.7969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftarm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(67, 4).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0126F, 0.139F, -1.4061F, -2.3039F, 0.0014F, -0.001F));

		PartDefinition cube_r134 = leftarm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(39, 65).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0011F, 4.2995F, -0.9886F, -0.8728F, 0.0011F, -0.0013F));

		PartDefinition cube_r135 = leftarm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(18, 60).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0063F, 2.4823F, -0.1888F, 0.0435F, 0.0011F, -0.0013F));

		PartDefinition cube_r136 = leftarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(65, 30).addBox(-0.3F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.0085F, 2.059F, -0.2576F, 0.5531F, 0.3245F, -0.4758F));

		PartDefinition cube_r137 = leftarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(67, 42).addBox(-1.5F, -1.9F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0095F, 1.622F, -0.6944F, 1.0689F, 0.0014F, -0.001F));

		PartDefinition cube_r138 = leftarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(49, 78).addBox(-1.5016F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.515F, -0.0655F, 0.0014F, -0.001F));

		PartDefinition cube_r139 = leftarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(22, 48).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-0.008F, -0.8145F, 1.626F, -2.7926F, 0.0014F, -0.001F));

		PartDefinition cube_r140 = leftarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0095F, -0.6934F, 0.4661F, -2.0072F, 0.0014F, -0.001F));

		PartDefinition cube_r141 = leftarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -0.75F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0111F, -0.4352F, -0.7661F, -1.4836F, 0.0014F, -0.001F));

		PartDefinition cube_r142 = leftarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 80).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(87, 77).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0111F, 0.4176F, -1.4206F, -0.6546F, 0.0014F, -0.001F));

		PartDefinition cube_r143 = leftarm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(60, 65).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.4974F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1474F, 6.9516F, 0.8482F, -1.4914F, 0.1552F, 0.4931F));

		PartDefinition cube_r144 = leftarm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(92, 83).addBox(0.8599F, 0.8203F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1472F, 1.0259F, 0.0332F, 1.5708F, 0.925F, -1.5708F));

		PartDefinition cube_r145 = leftarm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(79, 86).addBox(-0.6484F, -2.0963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(86, 55).addBox(-0.6484F, -1.2963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1472F, 1.0259F, 0.0332F, 1.5708F, -0.8901F, -1.5708F));

		PartDefinition cube_r146 = leftarm2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(12, 69).addBox(-1.0132F, 0.1386F, -0.4708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1472F, -0.784F, 0.386F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r147 = leftarm2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(77, 78).addBox(-0.5576F, 0.129F, -0.4877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.9923F, 1.1718F, -0.6577F, 1.5926F, -1.5359F, -1.6013F));

		PartDefinition cube_r148 = leftarm2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 8).addBox(-0.6771F, -1.5085F, -0.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9923F, 1.1718F, -0.6577F, 1.5733F, -1.2566F, -1.5818F));

		PartDefinition cube_r149 = leftarm2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(92, 67).addBox(-0.9946F, -1.5167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(87, 83).addBox(-0.9946F, -1.0167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.9923F, 1.1718F, -0.6577F, -1.5725F, -1.0996F, 1.5636F));

		PartDefinition cube_r150 = leftarm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 84).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1732F, 2.5052F, 0.4023F, 1.5683F, -1.4314F, -1.5729F));

		PartDefinition cube_r151 = leftarm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(7, 69).addBox(-0.6F, -2.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1764F, 1.8371F, 0.0367F, 1.5672F, -1.475F, -1.5718F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4192F, 4.5545F, -0.3853F, -0.0608F, -0.0191F, -0.0459F));

		PartDefinition cube_r152 = leftArm3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(63, 78).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, 0.9512F, -0.0002F, 0.0001F));

		PartDefinition cube_r153 = leftArm4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(32, 61).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftArm5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(42, 52).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2274F, 8.4252F, -4.9903F, 0.3903F, -0.1478F, 0.4752F));

		PartDefinition cube_r155 = rightarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(68, 60).addBox(-0.5F, -0.125F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0154F, 0.9335F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r156 = rightarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(52, 34).addBox(-1.0F, 1.1933F, -0.2871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.3672F, -0.7969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r157 = rightarm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(67, 65).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0126F, 0.139F, -1.4061F, -2.3039F, -0.0014F, 0.001F));

		PartDefinition cube_r158 = rightarm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(53, 65).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0011F, 4.2995F, -0.9886F, -0.8728F, -0.0011F, 0.0013F));

		PartDefinition cube_r159 = rightarm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(25, 61).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0063F, 2.4823F, -0.1888F, 0.0435F, -0.0011F, 0.0013F));

		PartDefinition cube_r160 = rightarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 38).addBox(-0.7F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.0085F, 2.059F, -0.2576F, 0.5531F, -0.3245F, 0.4758F));

		PartDefinition cube_r161 = rightarm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(32, 70).addBox(-0.5F, -1.9F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0095F, 1.622F, -0.6944F, 1.0689F, -0.0014F, 0.001F));

		PartDefinition cube_r162 = rightarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(56, 78).addBox(-0.4984F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.515F, -0.0655F, -0.0014F, 0.001F));

		PartDefinition cube_r163 = rightarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(9, 49).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.008F, -0.8145F, 1.626F, -2.7926F, -0.0014F, 0.001F));

		PartDefinition cube_r164 = rightarm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(49, 5).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0095F, -0.6934F, 0.4661F, -2.0072F, -0.0014F, 0.001F));

		PartDefinition cube_r165 = rightarm.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -0.75F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0111F, -0.4352F, -0.7661F, -1.4836F, -0.0014F, 0.001F));

		PartDefinition cube_r166 = rightarm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(25, 90).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(20, 90).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0111F, 0.4176F, -1.4206F, -0.6546F, -0.0014F, 0.001F));

		PartDefinition cube_r167 = rightarm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(18, 66).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.4974F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1474F, 6.9516F, 0.8482F, -0.7933F, -0.1552F, -0.4931F));

		PartDefinition cube_r168 = rightarm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(18, 93).addBox(-1.8599F, 0.8203F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1472F, 1.0259F, 0.0332F, 1.5708F, -0.925F, 1.5708F));

		PartDefinition cube_r169 = rightarm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(87, 44).addBox(-0.3516F, -2.0963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(87, 30).addBox(-0.3516F, -1.2963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1472F, 1.0259F, 0.0332F, 1.5708F, 0.8901F, 1.5708F));

		PartDefinition cube_r170 = rightarm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(70, 30).addBox(0.0132F, 0.1386F, -0.4708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1472F, -0.784F, 0.386F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r171 = rightarm2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(14, 80).addBox(-0.4424F, 0.129F, -0.4877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.9923F, 1.1718F, -0.6577F, 1.5926F, 1.5359F, 1.6013F));

		PartDefinition cube_r172 = rightarm2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(69, 83).addBox(-0.3229F, -1.5085F, -0.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9923F, 1.1718F, -0.6577F, 1.5733F, 1.2566F, 1.5818F));

		PartDefinition cube_r173 = rightarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(92, 70).addBox(-0.0054F, -1.5167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(68, 90).addBox(-0.0054F, -1.0167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.9923F, 1.1718F, -0.6577F, -1.5725F, 1.0996F, -1.5636F));

		PartDefinition cube_r174 = rightarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(5, 85).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1732F, 2.5052F, 0.4023F, 1.5683F, 1.4314F, 1.5729F));

		PartDefinition cube_r175 = rightarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(69, 9).addBox(-0.4F, -2.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1764F, 1.8371F, 0.0367F, 1.5672F, 1.475F, 1.5718F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4192F, 4.5545F, -0.3853F, -0.0608F, 0.0191F, 0.0459F));

		PartDefinition cube_r176 = rightArm3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(70, 78).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, -0.0524F, 0.0002F, -0.0001F));

		PartDefinition cube_r177 = rightArm4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(61, 33).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offset(0.0127F, 0.7642F, -1.4173F));

		PartDefinition cube_r178 = rightArm5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(53, 52).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6893F, 4.1656F, -5.7045F, -0.4367F, 0.0869F, -0.0076F));

		PartDefinition Bodyfront_r7 = bone.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(45, 24).addBox(-0.5F, -0.825F, -1.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0634F, -3.1565F, -0.3341F, 1.945F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r8 = bone.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(51, 42).addBox(-0.5F, -1.0F, -2.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7077F, -4.5484F, -0.0354F, 2.0759F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r9 = bone.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(45, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8126F, -4.7274F, 1.9171F, 1.3677F, 0.0872F, -0.2625F));

		PartDefinition Bodyfront_r10 = bone.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(23, 6).addBox(2.9842F, -1.9757F, 0.0395F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F))
				.texOffs(41, 35).addBox(2.9842F, -1.1757F, 2.0395F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7F, 3.25F, 1.1F, 1.4912F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r11 = bone.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(48, 92).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6132F, -5.452F, 1.8917F, 1.3254F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r12 = bone.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(22, 42).addBox(2.9842F, 0.0397F, 4.4729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 3.25F, 1.1F, 1.6308F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r13 = bone.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(51, 11).addBox(-0.5F, -0.925F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.0413F, 0.0406F, 1.0249F, 1.7094F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r14 = bone.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(0, 40).addBox(2.9842F, -4.2383F, -3.5402F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.8012F, -0.6803F, 0.7124F, 2.8439F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r15 = bone.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(42, 46).addBox(2.9842F, -1.7383F, -4.3402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8012F, -0.6803F, 0.7124F, 2.1457F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r16 = bone.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(45, 30).addBox(-2.923F, -1.0486F, -0.0182F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.8677F, 2.1F, -1.2231F, -0.3912F, -0.3507F, -0.6157F));

		PartDefinition Bodyfront_r17 = bone.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(81, 41).addBox(-1.5686F, -0.4868F, 0.041F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0833F, 4.817F, 1.6833F, -0.1805F, -0.0067F, -0.4726F));

		PartDefinition Bodyfront_r18 = bone.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(87, 47).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.3511F, 5.548F, 1.952F, -0.2732F, -0.6925F, -0.1464F));

		PartDefinition Bodyfront_r19 = bone.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(42, 0).addBox(-2.6351F, -0.585F, -2.2564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3277F, 4.6122F, 1.1429F, -0.2409F, 0.0283F, -0.4867F));

		PartDefinition Bodyfront_r20 = bone.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(0, 34).addBox(0.4796F, -0.4546F, -2.5064F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3277F, 4.6122F, 1.1429F, -0.1925F, -0.0667F, -0.7308F));

		PartDefinition Bodyfront_r21 = bone.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(60, 14).addBox(0.0F, -0.5F, 0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.4035F, 3.9834F, -2.1604F, -0.6279F, -0.6912F, -0.0384F));

		PartDefinition Bodyfront_r22 = bone.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(56, 28).addBox(0.1712F, -0.4855F, -1.9067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0833F, 4.817F, 1.6833F, -0.1987F, 0.1984F, -0.5492F));

		PartDefinition Bodyfront_r23 = bone.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(60, 10).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4621F, 3.8392F, -1.5706F, -0.4717F, -0.0876F, -0.4272F));

		PartDefinition Bodyfront_r24 = bone.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(23, 15).addBox(-0.05F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9082F, 2.6796F, -2.3212F, -0.1717F, -0.4698F, -1.3912F));

		PartDefinition Bodyfront_r25 = bone.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(36, 24).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.3916F, 2.76F, -2.43F, -0.3021F, -0.0505F, -0.5686F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6893F, 4.1656F, -5.7045F, -0.4367F, -0.0869F, 0.0076F));

		PartDefinition Bodyfront_r26 = bone4.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(45, 24).mirror().addBox(-0.5F, -0.825F, -1.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0634F, -3.1565F, -0.3341F, 1.945F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r27 = bone4.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(51, 42).mirror().addBox(-0.5F, -1.0F, -2.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7077F, -4.5484F, -0.0354F, 2.0759F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r28 = bone4.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(45, 56).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8126F, -4.7274F, 1.9171F, 1.3677F, -0.0872F, 0.2625F));

		PartDefinition Bodyfront_r29 = bone4.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(23, 6).mirror().addBox(-3.9842F, -1.9757F, 0.0395F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(41, 35).mirror().addBox(-3.9842F, -1.1757F, 2.0395F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.7F, 3.25F, 1.1F, 1.4912F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r30 = bone4.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6132F, -5.452F, 1.8917F, 1.3254F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r31 = bone4.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(22, 42).mirror().addBox(-3.9842F, 0.0397F, 4.4729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 3.25F, 1.1F, 1.6308F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r32 = bone4.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(-0.5F, -0.925F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-2.0413F, 0.0406F, 1.0249F, 1.7094F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r33 = bone4.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-3.9842F, -4.2383F, -3.5402F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.8012F, -0.6803F, 0.7124F, 2.8439F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r34 = bone4.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(42, 46).mirror().addBox(-3.9842F, -1.7383F, -4.3402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8012F, -0.6803F, 0.7124F, 2.1457F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r35 = bone4.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(45, 30).mirror().addBox(-0.077F, -1.0486F, -0.0182F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.8677F, 2.1F, -1.2231F, -0.3912F, 0.3507F, 0.6157F));

		PartDefinition Bodyfront_r36 = bone4.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(81, 41).mirror().addBox(-0.4314F, -0.4868F, 0.041F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0833F, 4.817F, 1.6833F, -0.1805F, 0.0067F, 0.4726F));

		PartDefinition Bodyfront_r37 = bone4.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 5.548F, 1.952F, -0.2732F, 0.6925F, 0.1464F));

		PartDefinition Bodyfront_r38 = bone4.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-0.3649F, -0.585F, -2.2564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3277F, 4.6122F, 1.1429F, -0.2409F, -0.0283F, 0.4867F));

		PartDefinition Bodyfront_r39 = bone4.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-3.4796F, -0.4546F, -2.5064F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3277F, 4.6122F, 1.1429F, -0.1925F, 0.0667F, 0.7308F));

		PartDefinition Bodyfront_r40 = bone4.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(60, 14).mirror().addBox(-2.0F, -0.5F, 0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.4035F, 3.9834F, -2.1604F, -0.6279F, 0.6912F, 0.0384F));

		PartDefinition Bodyfront_r41 = bone4.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-1.1712F, -0.4855F, -1.9067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0833F, 4.817F, 1.6833F, -0.1987F, -0.1984F, 0.5492F));

		PartDefinition Bodyfront_r42 = bone4.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.4621F, 3.8392F, -1.5706F, -0.4717F, 0.0876F, 0.4272F));

		PartDefinition Bodyfront_r43 = bone4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(23, 15).mirror().addBox(-3.95F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9082F, 2.6796F, -2.3212F, -0.1717F, 0.4698F, 1.3912F));

		PartDefinition Bodyfront_r44 = bone4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(36, 24).mirror().addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.3916F, 2.76F, -2.43F, -0.3021F, 0.0505F, 0.5686F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(58, 5).addBox(-0.5F, -0.442F, -0.0094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.2009F, 0.2281F, -0.0519F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(31, 94).addBox(0.0F, -1.3F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.442F, -0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(54, 56).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1729F, 2.8925F, -0.1041F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(79, 83).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5932F, 1.9622F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(14, 75).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5932F, -0.0378F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(51, 48).mirror().addBox(-1.3F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0932F, -0.0378F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(51, 48).addBox(-0.7F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0932F, -0.0378F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tailmiddlebase2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase2", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0244F, 2.8193F, -0.2787F, 0.0F, 0.0F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9528F, 1.5221F, -0.6579F, 0.3189F, 0.0154F, -0.0804F));

		PartDefinition cube_r179 = leftLeg.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(80, 72).addBox(-1.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftLeg.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(23, 78).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftLeg.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(7, 80).addBox(-1.5F, -0.0113F, -0.3769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftLeg.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(80, 69).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftLeg.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(49, 81).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftLeg.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(92, 13).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r185 = leftLeg.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(74, 83).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftLeg.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(82, 82).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftLeg.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(9, 65).addBox(-1.0037F, -0.4141F, -2.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftLeg.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(64, 85).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftLeg.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftLeg.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(59, 85).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1962F, 5.6055F, -2.697F, 1.1077F, 0.0356F, 0.0797F));

		PartDefinition cube_r191 = leftLeg2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(67, 93).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.308F, 1.6585F, -0.5046F, 1.0909F, -0.0049F, -0.0015F));

		PartDefinition cube_r192 = leftLeg2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(93, 64).addBox(-0.5385F, -0.2148F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, 1.2218F, -0.0049F, -0.0015F));

		PartDefinition cube_r193 = leftLeg2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(59, 61).addBox(-1.0378F, -1.4234F, -1.2423F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftLeg2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(88, 7).addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.7051F, 3.2689F, -1.0183F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftLeg2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(88, 10).addBox(-0.5884F, -0.5661F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(88, 4).addBox(-0.5884F, -0.5661F, -0.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.7935F, 3.7581F, -0.8386F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftLeg2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -0.65F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7051F, 3.9438F, -0.7516F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftLeg2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 23).addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7051F, 1.5564F, 1.7851F, 0.7853F, 0.0048F, 0.0017F));

		PartDefinition cube_r198 = leftLeg2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(93, 24).addBox(-0.5542F, -0.2007F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(94, 0).addBox(-0.5542F, 0.5993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 94).addBox(-0.5542F, -0.2007F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7593F, 2.8027F, 0.1078F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftLeg2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(46, 42).addBox(-0.5542F, -0.8846F, -0.5844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.7593F, 2.8027F, 0.1078F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftLeg2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5378F, 0.0296F, -0.1692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftLeg3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(63, 56).addBox(-1.5884F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 2.087F, 0.2608F, 0.1416F, -0.008F, 0.0104F));

		PartDefinition cube_r202 = leftArm7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(41, 61).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftArm6.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9528F, 1.5221F, -0.6579F, 1.017F, -0.0154F, 0.0804F));

		PartDefinition cube_r204 = rightLeg.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r205 = rightLeg.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(30, 78).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightLeg.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 46).addBox(-0.5F, -0.0113F, -0.3769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightLeg.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(80, 75).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightLeg.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(54, 81).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightLeg.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(92, 44).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightLeg.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(10, 85).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightLeg.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(83, 4).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightLeg.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(65, 20).addBox(-0.9963F, -0.4141F, -2.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightLeg.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(86, 18).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightLeg.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(86, 22).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightLeg.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(15, 86).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1962F, 5.6055F, -2.697F, 1.195F, -0.0356F, -0.0797F));

		PartDefinition cube_r216 = rightLeg2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(93, 92).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.308F, 1.6585F, -0.5046F, 1.0909F, 0.0049F, 0.0015F));

		PartDefinition cube_r217 = rightLeg2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(72, 93).addBox(-0.4615F, -0.2148F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, 1.2218F, 0.0049F, 0.0015F));

		PartDefinition cube_r218 = rightLeg2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(62, 46).addBox(-0.9622F, -1.4234F, -1.2423F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightLeg2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(91, 21).addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.7051F, 3.2689F, -1.0183F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r220 = rightLeg2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(91, 18).addBox(-0.4116F, -0.5661F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(0, 91).addBox(-0.4116F, -0.5661F, -0.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.7935F, 3.7581F, -0.8386F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightLeg2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(73, 90).addBox(-0.5F, -0.65F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7051F, 3.9438F, -0.7516F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightLeg2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(27, 56).addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7051F, 1.5564F, 1.7851F, 0.7853F, -0.0048F, -0.0017F));

		PartDefinition cube_r223 = rightLeg2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(93, 39).addBox(-0.4458F, -0.2007F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 95).addBox(-0.4458F, 0.5993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 95).addBox(-0.4458F, -0.2007F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7593F, 2.8027F, 0.1078F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightLeg2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(81, 56).addBox(-0.4458F, -0.8846F, -0.5844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.7593F, 2.8027F, 0.1078F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightLeg2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(86, 34).addBox(-0.4622F, 0.0296F, -0.1692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightLeg3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 64).addBox(-1.4116F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 2.087F, 0.2608F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition cube_r227 = rightArm7.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(50, 61).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r228 = rightArm6.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(64, 50).addBox(-2.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5937F, 1.1499F, -1.4605F, -0.0118F, -0.2613F, 0.0896F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(61, 37).addBox(-0.5F, -0.0407F, -0.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5849F, -3.657F, -1.0079F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(59, 81).addBox(-0.5F, 0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5849F, -3.8072F, 1.2579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(25, 67).addBox(-0.5F, -0.825F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5849F, -2.7867F, 0.1586F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(46, 70).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5849F, -1.1161F, -2.2413F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(42, 78).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5849F, -1.9335F, -2.9774F, 0.733F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(56, 92).addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(84, 86).addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(39, 70).addBox(-0.5F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5849F, -3.4192F, -2.0048F, 1.8151F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(33, 46).addBox(-0.6286F, 1.9672F, -0.2496F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.5464F, -0.0784F, 0.4378F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(32, 65).addBox(-0.6286F, 2.2744F, 2.2115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.6773F, -0.0784F, 0.4378F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(11, 42).addBox(-0.6286F, 1.0566F, -3.4966F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 1.2009F, -0.0784F, 0.4378F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(38, 6).addBox(-0.6249F, 0.5247F, -1.2419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.7209F, -0.0784F, 0.4378F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(18, 54).addBox(-0.6286F, -1.0292F, -0.9323F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.2846F, -0.0784F, 0.4378F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(65, 24).addBox(-0.6286F, 1.6595F, -1.0384F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 1.5499F, -0.0784F, 0.4378F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(60, 20).addBox(-1.1F, 0.7601F, -0.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1849F, -1.7179F, -0.2526F, -0.4189F, 0.0F, 0.1222F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(0, 53).addBox(-1.1F, -0.0628F, -1.1447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1849F, -1.7179F, -0.2526F, 0.4974F, 0.0F, 0.1222F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(9, 55).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5849F, -1.7442F, -0.5453F, 0.4974F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5937F, 1.1499F, -1.4605F, -0.0118F, 0.2613F, -0.0896F));

		PartDefinition Hips_r24 = bone5.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(61, 37).mirror().addBox(-0.5F, -0.0407F, -0.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.657F, -1.0079F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r25 = bone5.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(59, 81).mirror().addBox(-0.5F, 0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.8072F, 1.2579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r26 = bone5.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(-0.5F, -0.825F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.7867F, 0.1586F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r27 = bone5.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(46, 70).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.1161F, -2.2413F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r28 = bone5.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.9335F, -2.9774F, 0.733F, 0.0F, 0.0F));

		PartDefinition Hips_r29 = bone5.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(56, 92).mirror().addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r30 = bone5.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r31 = bone5.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(39, 70).mirror().addBox(-0.5F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4192F, -2.0048F, 1.8151F, 0.0F, 0.0F));

		PartDefinition Hips_r32 = bone5.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(33, 46).mirror().addBox(-0.3714F, 1.9672F, -0.2496F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.5464F, 0.0784F, -0.4378F));

		PartDefinition Hips_r33 = bone5.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(32, 65).mirror().addBox(-0.3714F, 2.2744F, 2.2115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.6773F, 0.0784F, -0.4378F));

		PartDefinition Hips_r34 = bone5.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(11, 42).mirror().addBox(-0.3714F, 1.0566F, -3.4966F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 1.2009F, 0.0784F, -0.4378F));

		PartDefinition Hips_r35 = bone5.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-0.3751F, 0.5247F, -1.2419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.7209F, 0.0784F, -0.4378F));

		PartDefinition Hips_r36 = bone5.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(18, 54).mirror().addBox(-0.3714F, -1.0292F, -0.9323F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.2846F, 0.0784F, -0.4378F));

		PartDefinition Hips_r37 = bone5.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-0.3714F, 1.6595F, -1.0384F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 1.5499F, 0.0784F, -0.4378F));

		PartDefinition Hips_r38 = bone5.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(0.1F, 0.7601F, -0.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1849F, -1.7179F, -0.2526F, -0.4189F, 0.0F, -0.1222F));

		PartDefinition Hips_r39 = bone5.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(0.1F, -0.0628F, -1.1447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1849F, -1.7179F, -0.2526F, 0.4974F, 0.0F, -0.1222F));

		PartDefinition Hips_r40 = bone5.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.7442F, -0.5453F, 0.4974F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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