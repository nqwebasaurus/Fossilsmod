package fossils.fossils.client.blockentity.model.estemmenosuchusmirabilis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EstemmenosuchusmirabilisFossilModel extends SkullModelBase {
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

	public EstemmenosuchusmirabilisFossilModel(ModelPart root) {
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

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(70, 83).addBox(0.0F, -1.5666F, 0.0589F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -0.7127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(102, 67).addBox(0.0F, -2.0005F, -0.0005F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5373F, -2.7127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(76, 96).addBox(0.0F, -2.1146F, -0.0095F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6373F, -4.8127F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-2.2992F, -0.1F, 1.0826F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 18).mirror().addBox(-3.6992F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(29, 55).addBox(0.2992F, -0.1F, 1.0826F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-0.3008F, -0.1F, -4.9174F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(30, 26).addBox(-0.5F, -0.5F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.1373F, 0.1873F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0655F, -4.6932F, 0.1941F, -0.0856F, -0.0168F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-2.5F, -1.9503F, -0.0785F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.2503F, -5.1641F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0686F, -5.5091F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(73, 96).addBox(0.0F, -2.6281F, 0.179F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4811F, -2.0115F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(70, 96).addBox(0.0F, -2.4281F, -0.021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7936F, -3.7841F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(10, 94).addBox(0.0F, -2.4204F, -0.0659F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8936F, -5.9841F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r6 = Bodymiddle.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-3.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1582F, 0.0905F, -0.8683F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(7, 88).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4936F, -1.2841F, 0.1879F, 0.0316F, -0.391F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(87, 46).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1879F, 0.0316F, -0.4346F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-3.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6936F, -3.2841F, 0.1582F, 0.0905F, -0.9119F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(87, 10).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.4311F, 0.0645F, -0.3461F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(76, 33).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9936F, -5.4841F, 0.3628F, 0.2296F, -0.8023F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(91, 0).addBox(1.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1582F, -0.0905F, 0.8683F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(7, 88).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4936F, -1.2841F, 0.1879F, -0.0316F, 0.391F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(87, 46).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1879F, -0.0316F, 0.4346F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(90, 90).addBox(1.8419F, -0.8106F, -0.4576F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6936F, -3.2841F, 0.1582F, -0.0905F, 0.9119F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(87, 10).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.4311F, -0.0645F, 0.3461F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(76, 33).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9936F, -5.4841F, 0.3628F, -0.2296F, 0.8023F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1026F, -5.9083F, 0.1577F, -0.0862F, -0.0137F));

		PartDefinition Bodymiddle_r18 = body2.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(95, 92).addBox(0.0F, -2.4957F, -0.0065F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r19 = body2.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(16, 94).addBox(0.0F, -2.795F, -0.1089F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r20 = body2.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(78, 56).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1339F, -1.5986F, 0.3287F, 0.0387F, -0.2221F));

		PartDefinition Bodymiddle_r21 = body2.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1339F, -1.5986F, 0.2812F, 0.161F, -0.6889F));

		PartDefinition Bodymiddle_r22 = body2.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(102, 65).mirror().addBox(-5.3818F, -3.8375F, -0.2995F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1339F, -1.5986F, 0.1813F, 0.2482F, -1.1713F));

		PartDefinition Bodymiddle_r23 = body2.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(57, 77).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.3631F, 0.0452F, -0.1857F));

		PartDefinition Bodymiddle_r24 = body2.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(77, 42).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.3094F, 0.1822F, -0.6492F));

		PartDefinition Bodymiddle_r25 = body2.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-6.3818F, -3.8375F, -0.2995F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0339F, -3.5986F, 0.1965F, 0.2798F, -1.1324F));

		PartDefinition Bodymiddle_r26 = body2.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.3556F, 0.0361F, -0.1518F));

		PartDefinition Bodymiddle_r27 = body2.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.3068F, 0.1707F, -0.6154F));

		PartDefinition Bodymiddle_r28 = body2.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -5.5986F, 0.1997F, 0.2685F, -1.0973F));

		PartDefinition Bodymiddle_r29 = body2.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(102, 65).addBox(4.3818F, -3.8375F, -0.2995F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1339F, -1.5986F, 0.1813F, -0.2482F, 1.1713F));

		PartDefinition Bodymiddle_r30 = body2.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(0, 76).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1339F, -1.5986F, 0.2812F, -0.161F, 0.6889F));

		PartDefinition Bodymiddle_r31 = body2.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(78, 56).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1339F, -1.5986F, 0.3287F, -0.0387F, 0.2221F));

		PartDefinition Bodymiddle_r32 = body2.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(57, 77).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.3631F, -0.0452F, 0.1857F));

		PartDefinition Bodymiddle_r33 = body2.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(77, 42).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.3094F, -0.1822F, 0.6492F));

		PartDefinition Bodymiddle_r34 = body2.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(14, 88).addBox(4.3818F, -3.8375F, -0.2995F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0339F, -3.5986F, 0.1965F, -0.2798F, 1.1324F));

		PartDefinition Bodymiddle_r35 = body2.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(77, 40).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.3556F, -0.0361F, 0.1518F));

		PartDefinition Bodymiddle_r36 = body2.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(76, 61).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.3068F, -0.1707F, 0.6154F));

		PartDefinition Bodymiddle_r37 = body2.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(76, 59).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -5.5986F, 0.1997F, -0.2685F, 1.0973F));

		PartDefinition Bodymiddle_r38 = body2.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(13, 94).addBox(0.0F, -2.7325F, -0.119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r39 = body2.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0643F, 0.0836F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 12.768F, -6.6774F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r40 = body2.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(23, 8).addBox(-0.5F, -0.0911F, -5.9758F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0015F, -5.9651F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition Bodymiddle_r41 = body.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(23, 16).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -3.4986F, 0.0299F, 0.2259F, -1.695F));

		PartDefinition Bodymiddle_r42 = body.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -3.4986F, 0.1653F, 0.1972F, -1.0704F));

		PartDefinition Bodymiddle_r43 = body.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(76, 13).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -3.4986F, 0.2435F, 0.123F, -0.5898F));

		PartDefinition Bodymiddle_r44 = body.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0661F, -3.4986F, 0.2782F, 0.0217F, -0.1192F));

		PartDefinition Bodymiddle_r45 = body.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(78, 8).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -1.4986F, 0.2782F, 0.0217F, -0.1192F));

		PartDefinition Bodymiddle_r46 = body.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -1.4986F, 0.2435F, 0.123F, -0.5898F));

		PartDefinition Bodymiddle_r47 = body.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -1.4986F, 0.1653F, 0.1972F, -1.0704F));

		PartDefinition Bodymiddle_r48 = body.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1661F, -1.4986F, 0.0299F, 0.2259F, -1.695F));

		PartDefinition Bodymiddle_r49 = body.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(23, 16).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -3.4986F, 0.0299F, -0.2259F, 1.695F));

		PartDefinition Bodymiddle_r50 = body.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(76, 15).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -3.4986F, 0.1653F, -0.1972F, 1.0704F));

		PartDefinition Bodymiddle_r51 = body.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(76, 13).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -3.4986F, 0.2435F, -0.123F, 0.5898F));

		PartDefinition Bodymiddle_r52 = body.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(78, 10).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0661F, -3.4986F, 0.2782F, -0.0217F, 0.1192F));

		PartDefinition Bodymiddle_r53 = body.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(78, 8).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -1.4986F, 0.2782F, -0.0217F, 0.1192F));

		PartDefinition Bodymiddle_r54 = body.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(78, 6).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -1.4986F, 0.2435F, -0.123F, 0.5898F));

		PartDefinition Bodymiddle_r55 = body.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(78, 4).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -1.4986F, 0.1653F, -0.1972F, 1.0704F));

		PartDefinition Bodymiddle_r56 = body.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(0, 78).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1661F, -1.4986F, 0.0299F, -0.2259F, 1.695F));

		PartDefinition Bodymiddle_r57 = body.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(41, 92).addBox(0.0F, -2.355F, 0.0365F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.347F, -4.0088F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r58 = body.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(93, 33).addBox(0.0F, -2.555F, -0.0635F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r59 = body.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(15, 26).addBox(-2.0F, 9.8953F, -7.0068F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 32).addBox(-0.5F, -0.0056F, -6.9631F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(24, 39).addBox(0.0F, -2.5936F, -5.0725F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2225F, -4.9012F, 0.0828F, -0.0435F, -0.0036F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(93, 60).addBox(0.0F, -2.5734F, -0.0687F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3732F, -0.957F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(72, 91).addBox(0.0F, -2.648F, 0.0242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1982F, -3.107F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(19, 18).addBox(-0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.2018F, -7.932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(28, 33).addBox(-2.0F, -1.0841F, 0.018F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 9.8061F, -8.1683F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(38, 0).addBox(-2.5F, 1.7161F, -3.8661F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 9.4623F, -6.2184F, -1.309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(24, 45).addBox(-2.0F, 0.7096F, -2.8856F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 9.4623F, -6.2184F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r60 = Bodyfront.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-4.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.3207F, 0.1648F, -0.7092F));

		PartDefinition Bodymiddle_r61 = Bodyfront.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-2.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.3653F, 0.0247F, -0.2477F));

		PartDefinition Bodymiddle_r62 = Bodyfront.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(43, 36).mirror().addBox(-6.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.2152F, 0.2696F, -1.1893F));

		PartDefinition Bodymiddle_r63 = Bodyfront.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(21, 74).mirror().addBox(-4.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2208F, -4.5348F, 0.0263F, 0.313F, -1.8264F));

		PartDefinition Bodymiddle_r64 = Bodyfront.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-6.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.021F, 0.2602F, -1.8274F));

		PartDefinition Bodymiddle_r65 = Bodyfront.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(21, 78).mirror().addBox(-7.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.1787F, 0.2301F, -1.1978F));

		PartDefinition Bodymiddle_r66 = Bodyfront.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.2705F, 0.1461F, -0.7164F));

		PartDefinition Bodymiddle_r67 = Bodyfront.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1208F, -2.5598F, 0.3126F, 0.0302F, -0.2485F));

		PartDefinition Bodymiddle_r68 = Bodyfront.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-7.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.0336F, 0.1649F, -1.7293F));

		PartDefinition Bodymiddle_r69 = Bodyfront.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-7.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.1323F, 0.1455F, -1.111F));

		PartDefinition Bodymiddle_r70 = Bodyfront.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(64, 81).mirror().addBox(-5.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.1904F, 0.0922F, -0.6305F));

		PartDefinition Bodymiddle_r71 = Bodyfront.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(80, 79).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0542F, -0.5098F, 0.2171F, 0.0183F, -0.1554F));

		PartDefinition Bodymiddle_r72 = Bodyfront.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(73, 0).addBox(1.8419F, -0.8106F, -0.4576F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.3207F, -0.1648F, 0.7092F));

		PartDefinition Bodymiddle_r73 = Bodyfront.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(47, 21).addBox(0.0086F, 0.1303F, -0.5068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.3653F, -0.0247F, 0.2477F));

		PartDefinition Bodymiddle_r74 = Bodyfront.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(43, 36).addBox(3.92F, -2.9517F, -0.3457F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.2152F, -0.2696F, 1.1893F));

		PartDefinition Bodymiddle_r75 = Bodyfront.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(21, 74).addBox(3.9732F, -6.3816F, -0.1665F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2208F, -4.5348F, 0.0263F, -0.313F, 1.8264F));

		PartDefinition Bodymiddle_r76 = Bodyfront.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(78, 44).addBox(3.8427F, -7.3717F, -0.1147F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.021F, -0.2602F, 1.8274F));

		PartDefinition Bodymiddle_r77 = Bodyfront.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(21, 78).addBox(4.3818F, -3.8375F, -0.2995F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.1787F, -0.2301F, 1.1978F));

		PartDefinition Bodymiddle_r78 = Bodyfront.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(21, 76).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.2705F, -0.1461F, 0.7164F));

		PartDefinition Bodymiddle_r79 = Bodyfront.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(82, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1208F, -2.5598F, 0.3126F, -0.0302F, 0.2485F));

		PartDefinition Bodymiddle_r80 = Bodyfront.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(65, 33).addBox(3.8427F, -7.3717F, -0.1147F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.0336F, -0.1649F, 1.7293F));

		PartDefinition Bodymiddle_r81 = Bodyfront.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(80, 81).addBox(4.3818F, -3.8375F, -0.2994F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.1323F, -0.1455F, 1.111F));

		PartDefinition Bodymiddle_r82 = Bodyfront.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(64, 81).addBox(2.661F, -1.3834F, -0.4277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.1904F, -0.0922F, 0.6305F));

		PartDefinition Bodymiddle_r83 = Bodyfront.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(80, 79).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0542F, -0.5098F, 0.2171F, -0.0183F, 0.1554F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(60, 46).addBox(-0.5F, -0.4905F, -2.9026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5512F, -5.8931F, -0.127F, -0.1412F, -0.0692F));

		PartDefinition Bodymiddle_r84 = Neck.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(102, 6).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0191F, -2.4443F, 0.9658F, 0.2277F, -0.4525F));

		PartDefinition Bodymiddle_r85 = Neck.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(48, 78).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0191F, -2.4443F, 0.8246F, 0.59F, -0.7989F));

		PartDefinition Bodymiddle_r86 = Neck.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(55, 88).mirror().addBox(-5.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -0.4443F, 0.2002F, 0.5122F, -1.1942F));

		PartDefinition Bodymiddle_r87 = Neck.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -0.4443F, 0.4282F, 0.3848F, -0.6789F));

		PartDefinition Bodymiddle_r88 = Neck.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(82, 2).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0809F, -0.4443F, 0.556F, 0.1768F, -0.2275F));

		PartDefinition Bodymiddle_r89 = Neck.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(102, 6).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0191F, -2.4443F, 0.9658F, -0.2277F, 0.4525F));

		PartDefinition Bodymiddle_r90 = Neck.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(48, 78).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0191F, -2.4443F, 0.8246F, -0.59F, 0.7989F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(93, 28).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4253F, -2.8983F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(93, 23).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4253F, -0.8983F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r91 = Neck.addOrReplaceChild("Bodymiddle_r91", CubeListBuilder.create().texOffs(55, 88).addBox(3.1894F, -2.1787F, -0.3213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -0.4443F, 0.2002F, -0.5122F, 1.1942F));

		PartDefinition Bodymiddle_r92 = Neck.addOrReplaceChild("Bodymiddle_r92", CubeListBuilder.create().texOffs(78, 46).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -0.4443F, 0.4282F, -0.3848F, 0.6789F));

		PartDefinition Bodymiddle_r93 = Neck.addOrReplaceChild("Bodymiddle_r93", CubeListBuilder.create().texOffs(82, 2).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0809F, -0.4443F, 0.556F, -0.1768F, 0.2275F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(63, 23).addBox(-0.5F, -0.5915F, -3.0078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(80, 93).addBox(0.0F, -3.0915F, -2.0078F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1045F, -2.8362F, -0.1978F, -0.3657F, -0.0687F));

		PartDefinition Bodymiddle_r94 = Neck2.addOrReplaceChild("Bodymiddle_r94", CubeListBuilder.create().texOffs(73, 2).mirror().addBox(-3.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -1.6081F, 0.3117F, 0.8872F, -1.0766F));

		PartDefinition Bodymiddle_r95 = Neck2.addOrReplaceChild("Bodymiddle_r95", CubeListBuilder.create().texOffs(102, 56).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0146F, -1.6081F, 0.7402F, 0.6597F, -0.4764F));

		PartDefinition Bodymiddle_r96 = Neck2.addOrReplaceChild("Bodymiddle_r96", CubeListBuilder.create().texOffs(73, 2).addBox(0.838F, -0.4614F, -0.411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -1.6081F, 0.3117F, -0.8872F, 1.0766F));

		PartDefinition Bodymiddle_r97 = Neck2.addOrReplaceChild("Bodymiddle_r97", CubeListBuilder.create().texOffs(102, 56).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0146F, -1.6081F, 0.7402F, -0.6597F, 0.4764F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.489F, -3.0025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0899F, -2.9509F, -0.098F, -0.477F, -0.0554F));

		PartDefinition Neck_r3 = Neck3.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(56, 100).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4735F, -1.054F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = Neck3.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(21, 84).addBox(0.0F, -1.5F, -1.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.489F, -2.0025F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r98 = Neck3.addOrReplaceChild("Bodymiddle_r98", CubeListBuilder.create().texOffs(102, 71).mirror().addBox(-0.9582F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.5682F, 0.9155F, 0.6524F, -0.5634F));

		PartDefinition Bodymiddle_r99 = Neck3.addOrReplaceChild("Bodymiddle_r99", CubeListBuilder.create().texOffs(92, 12).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.5682F, 0.5114F, 0.9568F, -1.1113F));

		PartDefinition Bodymiddle_r100 = Neck3.addOrReplaceChild("Bodymiddle_r100", CubeListBuilder.create().texOffs(31, 89).mirror().addBox(-2.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -2.0682F, 0.2572F, 0.9213F, -1.2561F));

		PartDefinition Bodymiddle_r101 = Neck3.addOrReplaceChild("Bodymiddle_r101", CubeListBuilder.create().texOffs(59, 102).mirror().addBox(-0.9582F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -2.0682F, 0.7303F, 0.707F, -0.6194F));

		PartDefinition Bodymiddle_r102 = Neck3.addOrReplaceChild("Bodymiddle_r102", CubeListBuilder.create().texOffs(102, 71).addBox(-0.0418F, -0.0225F, -0.434F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.5682F, 0.9155F, -0.6524F, 0.5634F));

		PartDefinition Bodymiddle_r103 = Neck3.addOrReplaceChild("Bodymiddle_r103", CubeListBuilder.create().texOffs(92, 12).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.5682F, 0.5114F, -0.9568F, 1.1113F));

		PartDefinition Bodymiddle_r104 = Neck3.addOrReplaceChild("Bodymiddle_r104", CubeListBuilder.create().texOffs(31, 89).addBox(0.838F, -0.4614F, -0.411F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -2.0682F, 0.2572F, -0.9213F, 1.2561F));

		PartDefinition Bodymiddle_r105 = Neck3.addOrReplaceChild("Bodymiddle_r105", CubeListBuilder.create().texOffs(59, 102).addBox(-0.0418F, -0.0225F, -0.4339F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -2.0682F, 0.7303F, -0.707F, 0.6194F));

		PartDefinition head = Neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3439F, -3.2321F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 27).addBox(0.5F, -0.0098F, -0.9997F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.7106F, -8.954F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 24).addBox(-0.5F, -0.0098F, 0.0003F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.7107F, -8.954F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 21).addBox(-0.5F, -0.0348F, 0.0003F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0272F, -8.2497F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 38).addBox(-1.5F, -2.3F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 1.1028F, -3.5879F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.7518F, -5.4318F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.9F, -0.1F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 0.655F, -5.5627F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 66).addBox(-0.5F, -0.025F, 0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, -1.1571F, -5.6148F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 61).addBox(-0.5F, -0.15F, 0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -4.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 80).addBox(-0.9517F, -0.1581F, -0.1262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -0.4739F, -7.366F, 0.3093F, 0.1453F, 0.0404F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(97, 69).addBox(-1.0F, -0.0903F, -0.023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.0612F, -7.4406F, -0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(97, 72).addBox(-1.0F, -0.0903F, -0.873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.2423F, -6.5978F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(97, 66).addBox(-1.0F, -0.9403F, -1.823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.5F, -0.7528F, -5.4519F, 0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 66).addBox(-1.0F, -0.5653F, -1.948F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.6528F, -5.4519F, 0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 30).addBox(-1.5F, -0.2504F, -2.902F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5F, -2.3098F, -0.0713F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(56, 14).addBox(-1.5F, -0.2504F, -0.902F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(-0.5F, -2.3098F, -0.0713F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(70, 87).addBox(-0.5F, -0.85F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -1.9226F, -0.5385F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(9, 58).addBox(-1.5F, 0.0496F, 0.473F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(54, 33).addBox(-1.5F, 0.0496F, 0.073F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5F, -2.7315F, -2.1883F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(39, 43).addBox(-0.5F, -0.1504F, 0.123F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -2.7315F, -2.1883F, -0.9425F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.8632F, -0.2522F, -1.4712F));

		PartDefinition cube_r19 = leftFace.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(96, 26).addBox(-0.4856F, 0.2679F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(95, 86).addBox(-0.4856F, -0.0071F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7371F, 3.1742F, -6.0107F, 0.3414F, 0.0294F, -0.0419F));

		PartDefinition cube_r20 = leftFace.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(101, 59).addBox(-0.4181F, -0.5F, -0.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5758F, -1.8806F, 1.1804F, -0.5168F, 0.975F, -0.5037F));

		PartDefinition cube_r21 = leftFace.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(94, 79).addBox(-0.4167F, -0.5F, -0.2879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.5758F, -1.8806F, 1.1804F, -0.2931F, 0.2844F, -0.1485F));

		PartDefinition cube_r22 = leftFace.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(24, 96).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5911F, 1.5695F, -6.9883F, -0.2297F, 0.6402F, -0.295F));

		PartDefinition cube_r23 = leftFace.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(102, 44).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8632F, -1.5873F, 1.9071F, -0.5889F, 0.2564F, -0.1678F));

		PartDefinition cube_r24 = leftFace.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(85, 48).addBox(1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8632F, -1.7097F, 2.4594F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftFace.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(20, 102).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6632F, -1.2418F, 2.2832F, -1.0135F, 0.1119F, -0.1774F));

		PartDefinition cube_r26 = leftFace.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(85, 12).addBox(1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8632F, -1.1193F, 2.8355F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftFace.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(12, 85).addBox(1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8632F, -0.3224F, 2.7657F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftFace.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(18, 70).addBox(1.0F, -0.9F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8632F, -0.8366F, 2.1529F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftFace.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(101, 62).addBox(-1.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.3632F, -1.7826F, 1.4421F, -0.4779F, -0.8582F, 0.3735F));

		PartDefinition cube_r30 = leftFace.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(86, 64).addBox(1.0F, -0.2504F, -0.377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-3.3632F, -2.0577F, 1.3999F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftFace.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(38, 4).addBox(-0.3976F, -0.4364F, -3.8444F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6534F, 1.3812F, -0.6815F, 2.7058F, 0.739F, 3.0907F));

		PartDefinition cube_r32 = leftFace.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(93, 97).addBox(-0.5F, -0.8831F, -0.0958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7239F, -0.7338F, 1.2245F, -0.8934F, 0.1998F, -0.3105F));

		PartDefinition cube_r33 = leftFace.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(34, 75).addBox(-0.5F, -1.0875F, -1.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.7239F, -0.7338F, 1.2245F, 0.0229F, 0.1998F, -0.3105F));

		PartDefinition cube_r34 = leftFace.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 83).addBox(-0.5F, -1.5F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5406F, -2.5578F, -0.7979F, -0.3859F, -0.296F, 0.455F));

		PartDefinition cube_r35 = leftFace.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(102, 53).addBox(-0.0535F, -0.6081F, -0.421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2324F, -2.6237F, 0.1932F, -0.6977F, -0.4563F, 0.6579F));

		PartDefinition cube_r36 = leftFace.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(87, 2).addBox(-1.4661F, -0.528F, -0.4561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2324F, -2.6237F, 0.1932F, -0.538F, -0.8352F, 0.4608F));

		PartDefinition cube_r37 = leftFace.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 87).addBox(-1.4273F, -0.391F, -0.4561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2324F, -2.6237F, 0.1932F, -0.2952F, -0.9244F, 0.1471F));

		PartDefinition cube_r38 = leftFace.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(97, 89).addBox(-0.3525F, -0.835F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9297F, -2.9705F, -1.3257F, 0.0866F, -0.7134F, -0.6178F));

		PartDefinition cube_r39 = leftFace.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(45, 87).addBox(-0.3674F, -0.6588F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.9297F, -2.9705F, -1.3257F, -0.5051F, -0.534F, 0.3408F));

		PartDefinition cube_r40 = leftFace.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(44, 101).addBox(-0.6106F, -1.0343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(39, 101).addBox(-0.6106F, -1.2343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(5, 100).addBox(-0.1106F, -1.0343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(0, 100).addBox(-0.1106F, -1.2343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.2395F, -3.3026F, -1.2301F, -0.7029F, -0.363F, 0.4683F));

		PartDefinition cube_r41 = leftFace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(85, 86).addBox(-1.1697F, -0.4102F, -0.5295F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(87, 67).addBox(-0.6697F, -0.4102F, -0.5295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0245F, -2.7687F, -0.7872F, -0.5851F, -0.3652F, 0.4588F));

		PartDefinition cube_r42 = leftFace.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(97, 82).addBox(0.3998F, -1.1978F, -0.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.054F)), PartPose.offsetAndRotation(-1.2395F, -3.3026F, -1.2301F, -0.2423F, -0.7455F, -0.3563F));

		PartDefinition cube_r43 = leftFace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(65, 83).addBox(-0.69F, -0.5807F, -0.4424F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8647F, -2.2011F, -0.7605F, -0.8472F, -0.4961F, 0.9165F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(60, 83).addBox(-0.45F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0632F, -1.5099F, -1.6561F, -0.7369F, 0.2399F, 0.2561F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(55, 83).addBox(0.05F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0632F, -1.5099F, -1.6561F, -0.7637F, 0.0908F, 0.0944F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(55, 94).addBox(-0.975F, -0.9F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6899F, 2.0953F, -6.3063F, -0.3717F, 0.3175F, -0.2321F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 86).addBox(-0.9735F, -2.028F, -0.8152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7673F, 1.5419F, -5.2622F, -0.3099F, -0.168F, -0.4896F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(96, 23).addBox(-0.9735F, -0.428F, -0.8152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7045F, 1.9128F, -5.3983F, -0.3476F, -0.0514F, -0.1491F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 53).addBox(-0.7671F, -1.6058F, -1.2936F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0973F, 0.4415F, -1.4224F, -0.1779F, 0.334F, -0.7533F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(97, 56).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0427F, 2.1987F, -4.2068F, 0.611F, 0.0458F, 0.019F));

		PartDefinition cube_r51 = leftFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(101, 26).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0814F, 2.3716F, -4.9869F, 0.2179F, 0.0496F, 0.0F));

		PartDefinition cube_r52 = leftFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(99, 8).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7322F, 1.4339F, -5.2304F, 0.3148F, 0.2968F, -0.5382F));

		PartDefinition cube_r53 = leftFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(19, 96).addBox(-0.425F, 0.075F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3099F, 1.4218F, -5.0962F, 0.2179F, 0.0496F, -0.1535F));

		PartDefinition cube_r54 = leftFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(30, 102).addBox(-0.3976F, -1.611F, -0.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(60, 92).addBox(-0.3976F, -1.611F, -0.3843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6534F, 1.5562F, -0.6815F, -2.1357F, 0.7742F, -1.1948F));

		PartDefinition cube_r55 = leftFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(28, 80).addBox(-0.3976F, -1.0063F, -0.6846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6534F, 1.5562F, -0.6815F, -0.9838F, 0.7742F, -1.1948F));

		PartDefinition cube_r56 = leftFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(63, 18).addBox(-0.3976F, 0.1869F, -2.1784F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6534F, 1.5562F, -0.6815F, -1.8565F, 0.7742F, -1.1948F));

		PartDefinition cube_r57 = leftFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(102, 41).addBox(-0.3976F, -0.9614F, 0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(92, 56).addBox(-0.3976F, -0.6614F, 0.4556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.6534F, 1.5562F, -0.6815F, -1.5947F, 0.7742F, -1.1948F));

		PartDefinition cube_r58 = leftFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 9).addBox(-0.3976F, -0.8364F, -2.5444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6534F, 1.5562F, -0.6815F, -1.6552F, 0.6975F, -1.0609F));

		PartDefinition cube_r59 = leftFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 59).addBox(-0.3976F, -1.0345F, -2.6226F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6534F, 1.5562F, -0.6815F, -1.1068F, 0.5038F, -1.0576F));

		PartDefinition cube_r60 = leftFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(78, 52).addBox(-0.8293F, -0.5769F, -0.2965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0973F, 0.4415F, -1.4224F, -0.2764F, 0.2793F, -0.9088F));

		PartDefinition cube_r61 = leftFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 62).addBox(-0.8363F, 0.4456F, -2.6387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0973F, 0.4415F, -1.4224F, -0.7184F, 0.269F, -0.8679F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(78, 48).addBox(-0.8363F, -0.935F, -2.3293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0973F, 0.4415F, -1.4224F, -0.2821F, 0.269F, -0.8679F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(49, 95).addBox(-0.5F, -0.25F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1909F, 0.7727F, -3.2238F, 0.3136F, 0.1263F, -0.1156F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(97, 75).addBox(1.8F, -0.0098F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.3632F, 0.9628F, -7.4828F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(5, 90).addBox(-1.0F, -0.0348F, -0.9997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8632F, 0.2794F, -6.7785F, 0.741F, 0.309F, -0.4461F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 90).addBox(-1.0F, -0.0348F, 0.0003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8632F, 0.2794F, -6.7785F, 0.5664F, 0.309F, -0.4461F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(72, 63).addBox(-1.025F, -0.025F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.3632F, -1.4661F, -2.12F, 0.2011F, 0.2807F, -0.601F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(99, 101).addBox(-0.4953F, -0.2733F, -0.4413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F))
				.texOffs(102, 3).addBox(-0.4953F, -0.5733F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(94, 101).addBox(-0.4953F, -0.5733F, -0.4413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.328F)), PartPose.offsetAndRotation(-1.7601F, 0.8319F, -6.8477F, -0.802F, 0.4335F, -0.5287F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(10, 102).addBox(-0.4953F, -0.3661F, -0.6107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.337F)), PartPose.offsetAndRotation(-1.7601F, 0.8319F, -6.8477F, -0.3221F, 0.4335F, -0.5287F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(79, 101).addBox(-0.4953F, -0.6872F, -0.3359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F)), PartPose.offsetAndRotation(-1.7601F, 0.8319F, -6.8477F, -0.0166F, 0.4335F, -0.5287F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(74, 101).addBox(0.0551F, -0.3947F, -0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(69, 101).addBox(-0.0949F, -0.3947F, -0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, -0.0668F, 0.5568F, -0.3562F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(64, 101).addBox(-0.4199F, -0.3591F, -0.6331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, 0.4568F, 0.5568F, -0.3562F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(14, 74).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3058F, -2.1298F, -0.2904F, 0.2965F, 0.2389F, -0.624F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(49, 55).addBox(-0.9063F, -0.1299F, -0.0052F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8632F, -0.2217F, -5.8948F, 0.212F, 0.2732F, -0.4239F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(85, 51).addBox(-1.2175F, -1.1341F, -0.5252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 84).addBox(-1.2175F, -1.1341F, -1.1252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, 0.4953F, 0.4628F, -0.1443F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 86).addBox(-1.2417F, -1.3535F, -0.3725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, -2.4686F, 0.6966F, -0.4624F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(86, 15).addBox(-1.2364F, -1.2985F, -0.4174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, -1.8875F, 0.748F, -0.364F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(85, 83).addBox(-1.2905F, -1.2642F, -0.3688F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, -1.2278F, 0.8097F, -0.2194F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(85, 58).addBox(-1.2451F, -1.2093F, -0.4344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, -0.7062F, 0.7221F, -0.1468F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(78, 83).addBox(-1.231F, -1.1642F, -0.4435F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4048F, -0.7229F, -2.0385F, -0.1222F, 0.6319F, -0.1077F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 35).addBox(-0.75F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.569F, -0.164F, -2.955F, 0.2821F, 0.1776F, -0.0276F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(92, 42).addBox(-0.375F, -1.2F, -1.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8991F, 2.2578F, -7.3165F, -1.3438F, 1.3671F, -1.36F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(36, 92).addBox(-0.375F, -1.2F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8991F, 2.2578F, -7.3165F, -1.1816F, 1.4505F, -1.1958F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(80, 89).addBox(-0.525F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4887F, 2.0117F, -7.2528F, -0.2146F, 0.8636F, -0.3026F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(62, 88).addBox(-0.5F, -0.8F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3056F, 2.0407F, -6.8712F, 0.1181F, 0.4139F, -0.2115F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(48, 80).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7797F, 0.8507F, -4.3975F, 0.6256F, 0.2816F, -0.4746F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 77).addBox(-0.475F, -0.275F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2631F, 1.1098F, -4.1675F, 0.6775F, 0.036F, -0.1521F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 91).addBox(-0.4978F, -1.788F, -0.613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.7121F, 3.1992F, -6.0107F, -0.0679F, 0.021F, -0.1944F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 100).addBox(-0.4978F, -0.3564F, -0.59F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.7371F, 3.1742F, -6.0107F, 0.1502F, 0.021F, -0.0635F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(40, 88).addBox(-0.4978F, -1.1674F, -0.3723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7371F, 3.1742F, -6.0107F, -0.2431F, 0.0105F, -0.1059F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.8632F, -0.2522F, -1.4712F));

		PartDefinition cube_r91 = rightFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(96, 26).mirror().addBox(-0.5144F, 0.2679F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(95, 86).mirror().addBox(-0.5144F, -0.0071F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7371F, 3.1742F, -6.0107F, 0.3414F, -0.0294F, 0.0419F));

		PartDefinition cube_r92 = rightFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-0.5819F, -0.5F, -0.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5758F, -1.8806F, 1.1804F, -0.5168F, -0.975F, 0.5037F));

		PartDefinition cube_r93 = rightFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(94, 79).mirror().addBox(-0.5833F, -0.5F, -0.2879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.5758F, -1.8806F, 1.1804F, -0.2931F, -0.2844F, 0.1485F));

		PartDefinition cube_r94 = rightFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(24, 96).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.5911F, 1.5695F, -6.9883F, -0.2297F, -0.6402F, 0.295F));

		PartDefinition cube_r95 = rightFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(102, 44).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8632F, -1.5873F, 1.9071F, -0.5889F, -0.2564F, 0.1678F));

		PartDefinition cube_r96 = rightFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(85, 48).mirror().addBox(-3.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.8632F, -1.7097F, 2.4594F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(20, 102).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6632F, -1.2418F, 2.2832F, -1.0135F, -0.1119F, 0.1774F));

		PartDefinition cube_r98 = rightFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(85, 12).mirror().addBox(-3.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.8632F, -1.1193F, 2.8355F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(12, 85).mirror().addBox(-3.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.8632F, -0.3224F, 2.7657F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(18, 70).mirror().addBox(-3.0F, -0.9F, -0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.8632F, -0.8366F, 2.1529F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(101, 62).mirror().addBox(0.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.3632F, -1.7826F, 1.4421F, -0.4779F, 0.8582F, -0.3735F));

		PartDefinition cube_r102 = rightFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(86, 64).mirror().addBox(-3.0F, -0.2504F, -0.377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(3.3632F, -2.0577F, 1.3999F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(38, 4).mirror().addBox(-1.6024F, -0.4364F, -3.8444F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6534F, 1.3812F, -0.6815F, 2.7058F, -0.739F, -3.0907F));

		PartDefinition cube_r104 = rightFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(-0.5F, -0.8831F, -0.0958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.7239F, -0.7338F, 1.2245F, -0.8934F, -0.1998F, 0.3105F));

		PartDefinition cube_r105 = rightFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(34, 75).mirror().addBox(-0.5F, -1.0875F, -1.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.7239F, -0.7338F, 1.2245F, 0.0229F, -0.1998F, 0.3105F));

		PartDefinition cube_r106 = rightFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.5F, -1.5F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.5406F, -2.5578F, -0.7979F, -0.3859F, 0.296F, -0.455F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(102, 53).mirror().addBox(-0.9465F, -0.6081F, -0.421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2324F, -2.6237F, 0.1932F, -0.6977F, 0.4563F, -0.6579F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(87, 2).mirror().addBox(-0.5339F, -0.528F, -0.4561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2324F, -2.6237F, 0.1932F, -0.538F, 0.8352F, -0.4608F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.5727F, -0.391F, -0.4561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2324F, -2.6237F, 0.1932F, -0.2952F, 0.9244F, -0.1471F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(97, 89).mirror().addBox(-0.6475F, -0.835F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.9297F, -2.9705F, -1.3257F, 0.0866F, 0.7134F, 0.6178F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(45, 87).mirror().addBox(-0.6326F, -0.6588F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.9297F, -2.9705F, -1.3257F, -0.5051F, 0.534F, -0.3408F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(44, 101).mirror().addBox(-0.3894F, -1.0343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(39, 101).mirror().addBox(-0.3894F, -1.2343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(5, 100).mirror().addBox(-0.8894F, -1.0343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(0, 100).mirror().addBox(-0.8894F, -1.2343F, -0.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.2395F, -3.3026F, -1.2301F, -0.7029F, 0.363F, -0.4683F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(0.1697F, -0.4102F, -0.5295F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(87, 67).mirror().addBox(-0.3303F, -0.4102F, -0.5295F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.0245F, -2.7687F, -0.7872F, -0.5851F, 0.3652F, -0.4588F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(97, 82).mirror().addBox(-1.3998F, -1.1978F, -0.0507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.054F)).mirror(false), PartPose.offsetAndRotation(1.2395F, -3.3026F, -1.2301F, -0.2423F, 0.7455F, 0.3563F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-0.31F, -0.5807F, -0.4424F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8647F, -2.2011F, -0.7605F, -0.8472F, 0.4961F, -0.9165F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 83).mirror().addBox(-0.55F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0632F, -1.5099F, -1.6561F, -0.7369F, -0.2399F, -0.2561F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(-1.05F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0632F, -1.5099F, -1.6561F, -0.7637F, -0.0908F, -0.0944F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(-0.025F, -0.9F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6899F, 2.0953F, -6.3063F, -0.3717F, -0.3175F, 0.2321F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(90, 86).mirror().addBox(-0.0265F, -2.028F, -0.8152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7673F, 1.5419F, -5.2622F, -0.3099F, 0.168F, 0.4896F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(96, 23).mirror().addBox(-0.0265F, -0.428F, -0.8152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7045F, 1.9128F, -5.3983F, -0.3476F, 0.0514F, 0.1491F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.2329F, -1.6058F, -1.2936F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0973F, 0.4415F, -1.4224F, -0.1779F, -0.334F, 0.7533F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(97, 56).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0427F, 2.1987F, -4.2068F, 0.611F, -0.0458F, -0.019F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(101, 26).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0814F, 2.3716F, -4.9869F, 0.2179F, -0.0496F, 0.0F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(99, 8).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7322F, 1.4339F, -5.2304F, 0.3148F, -0.2968F, 0.5382F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 96).mirror().addBox(-0.575F, 0.075F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3099F, 1.4218F, -5.0962F, 0.2179F, -0.0496F, 0.1535F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(30, 102).mirror().addBox(-0.6024F, -1.611F, -0.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(60, 92).mirror().addBox(-0.6024F, -1.611F, -0.3843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6534F, 1.5562F, -0.6815F, -2.1357F, -0.7742F, 1.1948F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(28, 80).mirror().addBox(-0.6024F, -1.0063F, -0.6846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6534F, 1.5562F, -0.6815F, -0.9838F, -0.7742F, 1.1948F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-0.6024F, 0.1869F, -2.1784F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6534F, 1.5562F, -0.6815F, -1.8565F, -0.7742F, 1.1948F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(102, 41).mirror().addBox(-0.6024F, -0.9614F, 0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(92, 56).mirror().addBox(-0.6024F, -0.6614F, 0.4556F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.6534F, 1.5562F, -0.6815F, -1.5947F, -0.7742F, 1.1948F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(62, 9).mirror().addBox(-0.6024F, -0.8364F, -2.5444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6534F, 1.5562F, -0.6815F, -1.6552F, -0.6975F, 1.0609F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.6024F, -1.0345F, -2.6226F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6534F, 1.5562F, -0.6815F, -1.1068F, -0.5038F, 1.0576F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(78, 52).mirror().addBox(-0.1707F, -0.5769F, -0.2965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0973F, 0.4415F, -1.4224F, -0.2764F, -0.2793F, 0.9088F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-0.1637F, 0.4456F, -2.6387F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0973F, 0.4415F, -1.4224F, -0.7184F, -0.269F, 0.8679F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(78, 48).mirror().addBox(-0.1637F, -0.935F, -2.3293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0973F, 0.4415F, -1.4224F, -0.2821F, -0.269F, 0.8679F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(49, 95).mirror().addBox(-0.5F, -0.25F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1909F, 0.7727F, -3.2238F, 0.3136F, -0.1263F, 0.1156F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(97, 75).mirror().addBox(-2.8F, -0.0098F, -0.9997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(4.3632F, 0.9628F, -7.4828F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(0.0F, -0.0348F, -0.9997F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8632F, 0.2794F, -6.7785F, 0.741F, -0.309F, 0.4461F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(0.0F, -0.0348F, 0.0003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8632F, 0.2794F, -6.7785F, 0.5664F, -0.309F, 0.4461F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 63).mirror().addBox(0.025F, -0.025F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.3632F, -1.4661F, -2.12F, 0.2011F, -0.2807F, 0.601F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(99, 101).mirror().addBox(-0.5047F, -0.2733F, -0.4413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F)).mirror(false)
				.texOffs(102, 3).mirror().addBox(-0.5047F, -0.5733F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(94, 101).mirror().addBox(-0.5047F, -0.5733F, -0.4413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.328F)).mirror(false), PartPose.offsetAndRotation(1.7601F, 0.8319F, -6.8477F, -0.802F, -0.4335F, 0.5287F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(10, 102).mirror().addBox(-0.5047F, -0.3661F, -0.6107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.337F)).mirror(false), PartPose.offsetAndRotation(1.7601F, 0.8319F, -6.8477F, -0.3221F, -0.4335F, 0.5287F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(79, 101).mirror().addBox(-0.5047F, -0.6872F, -0.3359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.335F)).mirror(false), PartPose.offsetAndRotation(1.7601F, 0.8319F, -6.8477F, -0.0166F, -0.4335F, 0.5287F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(74, 101).mirror().addBox(-1.0551F, -0.3947F, -0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(69, 101).mirror().addBox(-0.9051F, -0.3947F, -0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, -0.0668F, -0.5568F, 0.3562F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(64, 101).mirror().addBox(-0.5801F, -0.3591F, -0.6331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, 0.4568F, -0.5568F, 0.3562F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3058F, -2.1298F, -0.2904F, 0.2965F, -0.2389F, 0.624F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 55).mirror().addBox(-0.0937F, -0.1299F, -0.0052F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.8632F, -0.2217F, -5.8948F, 0.212F, -0.2732F, 0.4239F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-0.7826F, -1.1341F, -0.5252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 84).mirror().addBox(-0.7826F, -1.1341F, -1.1252F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, 0.4953F, -0.4628F, 0.1443F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(78, 86).mirror().addBox(-0.7584F, -1.3535F, -0.3725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, -2.4686F, -0.6966F, 0.4624F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-0.7636F, -1.2985F, -0.4174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, -1.8875F, -0.748F, 0.364F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-0.7095F, -1.2642F, -0.3688F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, -1.2278F, -0.8097F, 0.2194F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-0.7549F, -1.2093F, -0.4344F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, -0.7062F, -0.7221F, 0.1468F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-0.769F, -1.1642F, -0.4435F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4048F, -0.7229F, -2.0385F, -0.1222F, -0.6319F, 0.1077F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-0.25F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.569F, -0.164F, -2.955F, 0.2821F, -0.1776F, 0.0276F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(-0.625F, -1.2F, -1.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8991F, 2.2578F, -7.3165F, -1.3438F, -1.3671F, 1.36F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-0.625F, -1.2F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8991F, 2.2578F, -7.3165F, -1.1816F, -1.4505F, 1.1958F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(-0.475F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4887F, 2.0117F, -7.2528F, -0.2146F, -0.8636F, 0.3026F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(62, 88).mirror().addBox(-0.5F, -0.8F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3056F, 2.0407F, -6.8712F, 0.1181F, -0.4139F, 0.2115F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(48, 80).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7797F, 0.8507F, -4.3975F, 0.6256F, -0.2816F, 0.4746F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(-0.525F, -0.275F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2631F, 1.1098F, -4.1675F, 0.6775F, -0.036F, 0.1521F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(50, 91).mirror().addBox(-0.5022F, -1.788F, -0.613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.7121F, 3.1992F, -6.0107F, -0.0679F, -0.021F, 0.1944F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(51, 100).mirror().addBox(-0.5022F, -0.3564F, -0.59F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.7371F, 3.1742F, -6.0107F, 0.1502F, -0.021F, 0.0635F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.5022F, -1.1674F, -0.3723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7371F, 3.1742F, -6.0107F, -0.2431F, -0.0105F, 0.1059F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4633F, -1.859F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(98, 38).mirror().addBox(-0.1287F, -0.5168F, -0.7768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6059F, -0.9297F, -5.7664F, -0.3996F, -0.8476F, 0.0057F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(98, 20).mirror().addBox(-0.0526F, -0.5412F, -0.4196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6059F, -0.9297F, -5.7664F, -0.377F, -0.499F, -0.0086F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(98, 17).mirror().addBox(0.0859F, -0.6433F, -1.5189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2059F, 0.0703F, -4.1664F, -0.5406F, -0.2548F, 0.0397F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 92).mirror().addBox(-0.5009F, -1.0252F, -0.3255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.08F, -1.4475F, -6.9731F, -1.3749F, 1.0348F, 1.5609F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.4113F, -0.9677F, -0.4145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5089F, -1.5784F, -6.6266F, -0.5855F, 0.6099F, 2.2923F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(67, 91).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0018F, -1.6499F, -6.2256F, -0.5819F, 0.6612F, 2.2417F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(92, 67).mirror().addBox(-1.0269F, -0.5505F, -0.7752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.6059F, -0.9297F, -5.7664F, 0.2459F, 0.4038F, 2.7532F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(102, 50).mirror().addBox(-0.5489F, -0.66F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 102).mirror().addBox(-0.5489F, -0.385F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.7532F, -2.4721F, -5.4786F, 0.4689F, 0.2876F, 2.9824F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(92, 52).mirror().addBox(-1.0269F, -0.2975F, -0.3934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6059F, -0.9297F, -5.7664F, -0.0159F, 0.4038F, 2.7532F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(60, 96).mirror().addBox(0.0859F, -0.8528F, -0.6425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2059F, 0.0703F, -4.1664F, -0.2352F, -0.2548F, 0.0397F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2679F, -6.8418F, 0.213F, -0.9052F, -0.1685F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.256F, -7.2011F, 0.4879F, -0.681F, -0.3875F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(-0.129F, -0.9038F, -1.1538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6059F, -0.9297F, -5.7664F, 0.3694F, -0.8421F, 0.0164F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(29, 98).mirror().addBox(-0.129F, 0.1161F, -1.0514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6059F, -0.9297F, -5.7664F, -0.0233F, -0.8421F, 0.0164F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(0.0865F, -0.2929F, -1.9218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2059F, 0.0703F, -4.1664F, -0.3327F, -0.2496F, 0.0472F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(65, 95).mirror().addBox(0.1457F, 0.3856F, -2.8007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4059F, 0.5703F, -1.3664F, -0.4273F, -0.0233F, 0.0509F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(36, 96).mirror().addBox(0.1004F, -0.1344F, -2.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4059F, 0.5703F, -1.3664F, -0.1658F, -0.0404F, 0.0458F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(65, 98).mirror().addBox(0.03F, -1.4445F, -1.9296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2059F, 0.0703F, -4.1664F, -0.3945F, -0.2347F, 0.052F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(0.03F, -1.2318F, -1.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2059F, 0.0703F, -4.1664F, -0.6127F, -0.2347F, 0.052F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(46, 98).mirror().addBox(0.03F, -1.5125F, -0.6396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2059F, 0.0703F, -4.1664F, -0.2636F, -0.2347F, 0.052F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(0.1004F, -1.889F, -1.9109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(41, 98).mirror().addBox(0.1004F, -1.889F, -2.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(96, 35).mirror().addBox(0.1004F, -1.3641F, -2.6359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4059F, 0.5703F, -1.3664F, 0.0524F, -0.0404F, 0.0458F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(0.0321F, -0.5096F, -1.195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(79, 17).mirror().addBox(0.0321F, -0.0596F, -1.195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4059F, 0.5703F, -1.3664F, -0.2119F, -0.0927F, 0.046F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(98, 14).mirror().addBox(0.0321F, -1.5506F, -1.9466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4059F, 0.5703F, -1.3664F, 0.1721F, -0.0927F, 0.046F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(0.0321F, -1.4235F, -1.1316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4059F, 0.5703F, -1.3664F, 0.0499F, -0.0927F, 0.046F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(9, 79).mirror().addBox(-0.5F, -0.15F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.0214F, 0.3237F, -0.384F, -2.2143F, -0.1799F, 0.0465F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(73, 78).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0864F, 0.2039F, -0.0027F, -1.2207F, -0.175F, 0.0652F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(96, 32).mirror().addBox(-0.0792F, -1.5849F, 0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5059F, 1.1703F, -0.6664F, -1.3924F, -0.145F, 0.0463F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(96, 29).mirror().addBox(-0.5F, -0.85F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2362F, 2.3379F, 0.0312F, -0.0834F, -0.145F, 0.0463F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-0.012F, -0.9671F, -1.3289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5059F, 1.1703F, -0.6664F, -0.6959F, -0.1799F, 0.0465F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(98, 38).addBox(-0.8713F, -0.5168F, -0.7768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6059F, -0.9297F, -5.7664F, -0.3996F, 0.8476F, -0.0057F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(98, 20).addBox(-0.9474F, -0.5412F, -0.4196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6059F, -0.9297F, -5.7664F, -0.377F, 0.499F, 0.0086F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(98, 17).addBox(-1.0859F, -0.6433F, -1.5189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2059F, 0.0703F, -4.1664F, -0.5406F, 0.2548F, -0.0397F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(90, 92).addBox(-0.4991F, -1.0252F, -0.3255F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.08F, -1.4475F, -6.9731F, -1.3749F, -1.0348F, -1.5609F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(10, 90).addBox(-0.5887F, -0.9677F, -0.4145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5089F, -1.5784F, -6.6266F, -0.5855F, -0.6099F, -2.2923F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 91).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0018F, -1.6499F, -6.2256F, -0.5819F, -0.6612F, -2.2417F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(92, 67).addBox(0.0269F, -0.5505F, -0.7752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.6059F, -0.9297F, -5.7664F, 0.2459F, -0.4038F, -2.7532F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(102, 50).addBox(-0.4511F, -0.66F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 102).addBox(-0.4511F, -0.385F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.7532F, -2.4721F, -5.4786F, 0.4689F, -0.2876F, -2.9824F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(92, 52).addBox(0.0269F, -0.2975F, -0.3934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6059F, -0.9297F, -5.7664F, -0.0159F, -0.4038F, -2.7532F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(60, 96).addBox(-1.0859F, -0.8528F, -0.6425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2059F, 0.0703F, -4.1664F, -0.2352F, 0.2548F, -0.0397F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(98, 98).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4F, -0.2679F, -6.8418F, 0.213F, 0.9052F, 0.1685F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(98, 95).addBox(-0.6036F, 0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0036F, -1.0141F, -6.5366F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(99, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.4F, -1.256F, -7.2011F, 0.4879F, 0.681F, 0.3875F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(98, 92).addBox(-1.4036F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8036F, -1.0141F, -6.5366F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(102, 47).addBox(-0.871F, -0.9038F, -1.1538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6059F, -0.9297F, -5.7664F, 0.3694F, 0.8421F, -0.0164F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(29, 98).addBox(-0.871F, 0.1161F, -1.0514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6059F, -0.9297F, -5.7664F, -0.0233F, 0.8421F, -0.0164F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(79, 29).addBox(-1.0865F, -0.2929F, -1.9218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.2059F, 0.0703F, -4.1664F, -0.3327F, 0.2496F, -0.0472F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(65, 95).addBox(-1.1457F, 0.3856F, -2.8007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4059F, 0.5703F, -1.3664F, -0.4273F, 0.0233F, -0.0509F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(36, 96).addBox(-1.1003F, -0.1344F, -2.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4059F, 0.5703F, -1.3664F, -0.1658F, 0.0404F, -0.0458F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(65, 98).addBox(-1.03F, -1.4445F, -1.9296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2059F, 0.0703F, -4.1664F, -0.3945F, 0.2347F, -0.052F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(83, 95).addBox(-1.03F, -1.2318F, -1.5605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2059F, 0.0703F, -4.1664F, -0.6127F, 0.2347F, -0.052F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(46, 98).addBox(-1.03F, -1.5125F, -0.6396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2059F, 0.0703F, -4.1664F, -0.2636F, 0.2347F, -0.052F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(79, 98).addBox(-1.1003F, -1.889F, -1.9109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(41, 98).addBox(-1.1003F, -1.889F, -2.5109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(96, 35).addBox(-1.1003F, -1.3641F, -2.6359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4059F, 0.5703F, -1.3664F, 0.0524F, 0.0404F, -0.0458F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(79, 25).addBox(-1.0321F, -0.5096F, -1.195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F))
				.texOffs(79, 17).addBox(-1.0321F, -0.0596F, -1.195F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4059F, 0.5703F, -1.3664F, -0.2119F, 0.0927F, -0.046F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(98, 14).addBox(-1.0321F, -1.5506F, -1.9466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4059F, 0.5703F, -1.3664F, 0.1721F, 0.0927F, -0.046F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(79, 21).addBox(-1.0321F, -1.4235F, -1.1316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.4059F, 0.5703F, -1.3664F, 0.0499F, 0.0927F, -0.046F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(9, 79).addBox(-0.5F, -0.15F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.0214F, 0.3237F, -0.384F, -2.2143F, 0.1799F, -0.0465F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(73, 78).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0864F, 0.2039F, -0.0027F, -1.2207F, 0.175F, -0.0652F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(96, 32).addBox(-0.9208F, -1.5849F, 0.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5059F, 1.1703F, -0.6664F, -1.3924F, 0.145F, -0.0463F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(96, 29).addBox(-0.5F, -0.85F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2362F, 2.3379F, 0.0312F, -0.0834F, 0.145F, -0.0463F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(7, 71).addBox(-0.988F, -0.9671F, -1.3289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.5059F, 1.1703F, -0.6664F, -0.6959F, 0.1799F, -0.0465F));

		PartDefinition leftarm = Bodyfront.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.2274F, 8.4252F, -4.9903F, 0.6957F, 0.1478F, -0.4752F));

		PartDefinition cube_r223 = leftarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(36, 70).addBox(-0.5F, -0.125F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0154F, 0.9335F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftarm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(47, 15).addBox(0.0F, 1.1933F, -0.2871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.3672F, -0.7969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftarm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(72, 18).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0126F, 0.139F, -1.4061F, -2.3039F, 0.0014F, -0.001F));

		PartDefinition cube_r226 = leftarm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(27, 71).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0011F, 4.2995F, -0.9886F, -0.8728F, 0.0011F, -0.0013F));

		PartDefinition cube_r227 = leftarm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(29, 65).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0063F, 2.4823F, -0.1888F, 0.0435F, 0.0011F, -0.0013F));

		PartDefinition cube_r228 = leftarm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(20, 93).addBox(-0.3F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.0085F, 2.059F, -0.2576F, 0.5531F, 0.3245F, -0.4758F));

		PartDefinition cube_r229 = leftarm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(41, 79).addBox(-1.5F, -1.9F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0095F, 1.622F, -0.6944F, 1.0689F, 0.0014F, -0.001F));

		PartDefinition cube_r230 = leftarm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(26, 84).addBox(-1.5016F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0091F, 0.1435F, -0.515F, -0.0655F, 0.0014F, -0.001F));

		PartDefinition cube_r231 = leftarm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(29, 59).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-0.008F, -0.8145F, 1.626F, -2.7926F, 0.0014F, -0.001F));

		PartDefinition cube_r232 = leftarm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(33, 49).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0095F, -0.6934F, 0.4661F, -2.0072F, 0.0014F, -0.001F));

		PartDefinition cube_r233 = leftarm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(79, 35).addBox(-0.5F, -0.75F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0111F, -0.4352F, -0.7661F, -1.4836F, 0.0014F, -0.001F));

		PartDefinition cube_r234 = leftarm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(96, 63).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(96, 60).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0111F, 0.4176F, -1.4206F, -0.6546F, 0.0014F, -0.001F));

		PartDefinition cube_r235 = leftarm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(71, 8).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.4974F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1474F, 6.9516F, 0.8482F, -0.7933F, 0.1552F, 0.4931F));

		PartDefinition cube_r236 = leftarm2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 94).addBox(0.8599F, 0.8203F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1472F, 1.0259F, 0.0332F, 1.5708F, 0.925F, -1.5708F));

		PartDefinition cube_r237 = leftarm2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(5, 94).addBox(-0.6484F, -2.0963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(31, 95).addBox(-0.6484F, -1.2963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1472F, 1.0259F, 0.0332F, 1.5708F, -0.8901F, -1.5708F));

		PartDefinition cube_r238 = leftarm2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(16, 79).addBox(-1.0132F, 0.1386F, -0.4708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1472F, -0.784F, 0.386F, 1.5708F, -1.4137F, -1.5708F));

		PartDefinition cube_r239 = leftarm2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(73, 82).addBox(-0.5576F, 0.129F, -0.4877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.9923F, 1.1718F, -0.6577F, 1.5926F, -1.5359F, -1.6013F));

		PartDefinition cube_r240 = leftarm2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(57, 73).addBox(-0.6771F, -1.5085F, -0.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9923F, 1.1718F, -0.6577F, 1.5733F, -1.2566F, -1.5818F));

		PartDefinition cube_r241 = leftarm2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(92, 83).addBox(-0.9946F, -1.5167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(9, 76).addBox(-0.9946F, -1.0167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.9923F, 1.1718F, -0.6577F, -1.5725F, -1.0996F, 1.5636F));

		PartDefinition cube_r242 = leftarm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(21, 89).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1732F, 2.5052F, 0.4023F, 1.5683F, -1.4314F, -1.5729F));

		PartDefinition cube_r243 = leftarm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(63, 70).addBox(-0.6F, -2.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1764F, 1.8371F, 0.0367F, 1.5672F, -1.475F, -1.5718F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4192F, 4.5545F, -0.3853F, -0.0608F, -0.0191F, -0.0459F));

		PartDefinition cube_r244 = leftArm3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(52, 40).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0808F, 0.6698F, -0.0237F, -0.1396F, -0.0002F, 0.0001F));

		PartDefinition cube_r245 = leftArm4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(60, 51).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r246 = leftArm5.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(51, 10).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = Bodyfront.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.2274F, 8.4252F, -4.9903F, -0.3515F, -0.1478F, 0.4752F));

		PartDefinition cube_r247 = rightarm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(43, 70).addBox(-0.5F, -0.125F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0154F, 0.9335F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightarm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(24, 49).addBox(-1.0F, 1.1933F, -0.2871F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.3672F, -0.7969F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightarm.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, -1.05F, -1.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0126F, 0.139F, -1.4061F, -2.3039F, -0.0014F, 0.001F));

		PartDefinition cube_r250 = rightarm.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(73, 68).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0011F, 4.2995F, -0.9886F, -0.8728F, -0.0011F, 0.0013F));

		PartDefinition cube_r251 = rightarm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(65, 64).addBox(-0.5F, -2.0F, -0.8F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0063F, 2.4823F, -0.1888F, 0.0435F, -0.0011F, 0.0013F));

		PartDefinition cube_r252 = rightarm.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(93, 20).addBox(-0.7F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.0085F, 2.059F, -0.2576F, 0.5531F, -0.3245F, 0.4758F));

		PartDefinition cube_r253 = rightarm.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(80, 71).addBox(-0.5F, -1.9F, -0.275F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0095F, 1.622F, -0.6944F, 1.0689F, -0.0014F, 0.001F));

		PartDefinition cube_r254 = rightarm.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(86, 18).addBox(-0.4984F, -0.0851F, -1.9849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0091F, 0.1435F, -0.515F, -0.0655F, -0.0014F, 0.001F));

		PartDefinition cube_r255 = rightarm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(59, 40).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.008F, -0.8145F, 1.626F, -2.7926F, -0.0014F, 0.001F));

		PartDefinition cube_r256 = rightarm.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(42, 49).addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0095F, -0.6934F, 0.4661F, -2.0072F, -0.0014F, 0.001F));

		PartDefinition cube_r257 = rightarm.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(80, 67).addBox(-0.5F, -0.75F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0111F, -0.4352F, -0.7661F, -1.4836F, -0.0014F, 0.001F));

		PartDefinition cube_r258 = rightarm.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(99, 11).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(10, 99).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0111F, 0.4176F, -1.4206F, -0.6546F, -0.0014F, 0.001F));

		PartDefinition cube_r259 = rightarm.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(50, 73).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3565F, 1.0946F, -0.4974F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1474F, 6.9516F, 0.8482F, -0.5483F, 0.1265F, -0.4822F));

		PartDefinition cube_r260 = rightarm2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(94, 2).addBox(-1.8599F, 0.8203F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1472F, 1.0259F, 0.0332F, 1.5708F, -0.925F, 1.5708F));

		PartDefinition cube_r261 = rightarm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(94, 9).addBox(-0.3516F, -2.0963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(44, 95).addBox(-0.3516F, -1.2963F, -0.4708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1472F, 1.0259F, 0.0332F, 1.5708F, 0.8901F, 1.5708F));

		PartDefinition cube_r262 = rightarm2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(35, 80).addBox(0.0132F, 0.1386F, -0.4708F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1472F, -0.784F, 0.386F, 1.5708F, 1.4137F, 1.5708F));

		PartDefinition cube_r263 = rightarm2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(7, 83).addBox(-0.4424F, 0.129F, -0.4877F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.9923F, 1.1718F, -0.6577F, 1.5926F, 1.5359F, 1.6013F));

		PartDefinition cube_r264 = rightarm2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(87, 42).addBox(-0.3229F, -1.5085F, -0.4877F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9923F, 1.1718F, -0.6577F, 1.5733F, 1.2566F, 1.5818F));

		PartDefinition cube_r265 = rightarm2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(93, 17).addBox(-0.0054F, -1.5167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(93, 14).addBox(-0.0054F, -1.0167F, -0.4877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.9923F, 1.1718F, -0.6577F, -1.5725F, 1.0996F, -1.5636F));

		PartDefinition cube_r266 = rightarm2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(15, 90).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1732F, 2.5052F, 0.4023F, 1.5683F, 1.4314F, 1.5729F));

		PartDefinition cube_r267 = rightarm2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(68, 70).addBox(-0.4F, -2.8F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1764F, 1.8371F, 0.0367F, 1.5672F, 1.475F, 1.5718F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4192F, 4.5545F, -0.3853F, -0.0608F, 0.0191F, 0.0459F));

		PartDefinition cube_r268 = rightArm3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(56, 18).addBox(-1.0F, 2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0808F, -2.2844F, -0.1621F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0808F, 0.6698F, -0.0237F, 0.3403F, 0.0002F, -0.0001F));

		PartDefinition cube_r269 = rightArm4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(63, 36).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offset(0.0127F, 0.7642F, -1.4173F));

		PartDefinition cube_r270 = rightArm5.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(52, 36).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6893F, 4.1657F, -5.7045F, -0.4367F, 0.0869F, -0.0076F));

		PartDefinition Bodyfront_r7 = bone.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(60, 4).addBox(-0.489F, -1.5068F, -1.608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.8607F, 0.0526F, -0.2714F));

		PartDefinition Bodyfront_r8 = bone.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(11, 52).addBox(-0.489F, -1.9666F, 0.5634F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.3807F, 0.0526F, -0.2714F));

		PartDefinition Bodyfront_r9 = bone.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(38, 61).addBox(-0.5107F, -0.7987F, 0.6361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.2832F, 0.0642F, -0.2689F));

		PartDefinition Bodyfront_r10 = bone.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(20, 55).addBox(2.9842F, -1.9757F, 0.0395F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7F, 3.25F, 1.1F, 1.4912F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r11 = bone.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(28, 38).addBox(-0.489F, -1.2781F, -2.6336F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.6687F, 0.0526F, -0.2714F));

		PartDefinition Bodyfront_r12 = bone.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(43, 30).addBox(-0.489F, -0.7873F, -0.2632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.5465F, 0.0526F, -0.2714F));

		PartDefinition Bodyfront_r13 = bone.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(54, 27).addBox(-0.489F, -1.3168F, -3.8455F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.391F, -2.2335F, 0.7796F, 1.756F, 0.0526F, -0.2714F));

		PartDefinition Bodyfront_r14 = bone.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(50, 43).addBox(2.9842F, -4.2383F, -2.5402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.8012F, -0.6803F, 0.7124F, 2.8439F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r15 = bone.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(54, 21).addBox(2.9842F, -1.7383F, -4.7402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8012F, -0.6803F, 0.7124F, 2.1021F, 0.0758F, -0.266F));

		PartDefinition Bodyfront_r16 = bone.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(58, 55).addBox(-2.923F, -1.0486F, -0.0182F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.8677F, 2.1F, -1.2231F, -0.3912F, -0.3507F, -0.6157F));

		PartDefinition Bodyfront_r17 = bone.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(45, 84).addBox(-1.5686F, -0.4868F, 0.041F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0833F, 4.8169F, 1.6833F, -0.1805F, -0.0067F, -0.4726F));

		PartDefinition Bodyfront_r18 = bone.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(100, 85).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.3511F, 5.548F, 1.952F, -0.2732F, -0.6925F, -0.1464F));

		PartDefinition Bodyfront_r19 = bone.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(38, 10).addBox(-2.6351F, -0.585F, -2.2564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3277F, 4.6122F, 1.1429F, -0.2409F, 0.0283F, -0.4867F));

		PartDefinition Bodyfront_r20 = bone.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(0, 24).addBox(0.4796F, -0.4546F, -2.5064F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3277F, 4.6122F, 1.1429F, -0.1925F, -0.0667F, -0.7308F));

		PartDefinition Bodyfront_r21 = bone.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(58, 59).addBox(0.1712F, -0.4855F, -1.9067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0833F, 4.8169F, 1.6833F, -0.1987F, 0.1984F, -0.5492F));

		PartDefinition Bodyfront_r22 = bone.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(9, 67).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.4621F, 3.8392F, -1.5706F, -0.4717F, -0.0876F, -0.4272F));

		PartDefinition Bodyfront_r23 = bone.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(69, 56).addBox(-0.05F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9082F, 2.6796F, -2.3212F, -0.1717F, -0.4698F, -1.3912F));

		PartDefinition Bodyfront_r24 = bone.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(34, 23).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.3916F, 2.76F, -2.43F, -0.3021F, -0.0505F, -0.5686F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6893F, 4.1657F, -5.7045F, -0.4367F, -0.0869F, 0.0076F));

		PartDefinition Bodyfront_r25 = bone4.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.511F, -1.5068F, -1.608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.8607F, -0.0526F, 0.2714F));

		PartDefinition Bodyfront_r26 = bone4.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(11, 52).mirror().addBox(-0.511F, -1.9666F, 0.5634F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.3807F, -0.0526F, 0.2714F));

		PartDefinition Bodyfront_r27 = bone4.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(38, 61).mirror().addBox(-0.4893F, -0.7987F, 0.6361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.2832F, -0.0642F, 0.2689F));

		PartDefinition Bodyfront_r28 = bone4.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(20, 55).mirror().addBox(-3.9842F, -1.9757F, 0.0395F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.7F, 3.25F, 1.1F, 1.4912F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r29 = bone4.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(28, 38).mirror().addBox(-0.511F, -1.2781F, -2.6336F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.6687F, -0.0526F, 0.2714F));

		PartDefinition Bodyfront_r30 = bone4.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(43, 30).mirror().addBox(-0.511F, -0.7873F, -0.2632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.5465F, -0.0526F, 0.2714F));

		PartDefinition Bodyfront_r31 = bone4.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.511F, -1.3168F, -3.8455F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -2.2335F, 0.7796F, 1.756F, -0.0526F, 0.2714F));

		PartDefinition Bodyfront_r32 = bone4.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(50, 43).mirror().addBox(-3.9842F, -4.2383F, -2.5402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.8012F, -0.6803F, 0.7124F, 2.8439F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r33 = bone4.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(54, 21).mirror().addBox(-3.9842F, -1.7383F, -4.7402F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8012F, -0.6803F, 0.7124F, 2.1021F, -0.0758F, 0.266F));

		PartDefinition Bodyfront_r34 = bone4.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(58, 55).mirror().addBox(-0.077F, -1.0486F, -0.0182F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.8677F, 2.1F, -1.2231F, -0.3912F, 0.3507F, 0.6157F));

		PartDefinition Bodyfront_r35 = bone4.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-0.4314F, -0.4868F, 0.041F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0833F, 4.8169F, 1.6833F, -0.1805F, 0.0067F, 0.4726F));

		PartDefinition Bodyfront_r36 = bone4.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(100, 85).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.3511F, 5.548F, 1.952F, -0.2732F, 0.6925F, 0.1464F));

		PartDefinition Bodyfront_r37 = bone4.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(38, 10).mirror().addBox(-0.3649F, -0.585F, -2.2564F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3277F, 4.6122F, 1.1429F, -0.2409F, -0.0283F, 0.4867F));

		PartDefinition Bodyfront_r38 = bone4.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-3.4796F, -0.4546F, -2.5064F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3277F, 4.6122F, 1.1429F, -0.1925F, 0.0667F, 0.7308F));

		PartDefinition Bodyfront_r39 = bone4.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(58, 59).mirror().addBox(-1.1712F, -0.4855F, -1.9067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0833F, 4.8169F, 1.6833F, -0.1987F, -0.1984F, 0.5492F));

		PartDefinition Bodyfront_r40 = bone4.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(9, 67).mirror().addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.4621F, 3.8392F, -1.5706F, -0.4717F, 0.0876F, 0.4272F));

		PartDefinition Bodyfront_r41 = bone4.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-2.95F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9082F, 2.6796F, -2.3212F, -0.1717F, 0.4698F, 1.3912F));

		PartDefinition Bodyfront_r42 = bone4.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(34, 23).mirror().addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.3916F, 2.76F, -2.43F, -0.3021F, 0.0505F, 0.5686F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.442F, -0.0094F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.2009F, 0.2281F, -0.0527F, -0.1743F, 0.0091F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(35, 102).addBox(0.0F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 76).addBox(0.0F, -1.3F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.442F, -0.0094F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(13, 46).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1525F, 3.9001F, -0.1253F, -0.2069F, 0.1117F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(50, 70).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5932F, 2.9622F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(20, 52).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5932F, 0.9622F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-1.3F, 0.0F, 1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0932F, -0.0378F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(53, 0).addBox(-0.7F, 0.0F, 1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0932F, -0.0378F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tailmiddlebase2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase2", CubeListBuilder.create().texOffs(34, 16).addBox(-0.5F, -0.5932F, -0.0378F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0378F, 3.8633F, 0.1736F, -0.4306F, -0.0731F));

		PartDefinition leftLeg = Hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9528F, 1.5221F, -0.6579F, 0.9298F, 0.0154F, -0.0804F));

		PartDefinition cube_r271 = leftLeg.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(86, 33).addBox(-1.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftLeg.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(57, 79).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftLeg.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(33, 86).addBox(-1.5F, -0.0113F, -0.3769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftLeg.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(86, 30).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftLeg.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(87, 5).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftLeg.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(89, 100).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftLeg.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(50, 87).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftLeg.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(26, 92).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftLeg.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0037F, -0.4141F, -2.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftLeg.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(45, 91).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftLeg.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(92, 71).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftLeg.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(31, 91).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1962F, 5.6055F, -2.697F, 1.1077F, 0.0356F, 0.0797F));

		PartDefinition cube_r283 = leftLeg2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(25, 101).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.308F, 1.6585F, -0.5046F, 1.0909F, -0.0049F, -0.0015F));

		PartDefinition cube_r284 = leftLeg2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(101, 23).addBox(-0.5385F, -0.2148F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, 1.2218F, -0.0049F, -0.0015F));

		PartDefinition cube_r285 = leftLeg2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(67, 14).addBox(-1.0378F, -1.4234F, -1.2423F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftLeg2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(97, 44).addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.7051F, 3.2689F, -1.0183F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftLeg2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(97, 41).addBox(-0.5884F, -0.5661F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(97, 5).addBox(-0.5884F, -0.5661F, -0.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.7935F, 3.7581F, -0.8386F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftLeg2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5F, -0.65F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7051F, 3.9438F, -0.7516F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftLeg2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(63, 28).addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7051F, 1.5564F, 1.7851F, 0.7853F, 0.0048F, 0.0017F));

		PartDefinition cube_r290 = leftLeg2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(93, 38).addBox(-0.5542F, -0.2007F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 97).addBox(-0.5542F, 0.5993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(88, 96).addBox(-0.5542F, -0.2007F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7593F, 2.8027F, 0.1078F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftLeg2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5542F, -0.8846F, -0.5844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.7593F, 2.8027F, 0.1078F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftLeg2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(87, 71).addBox(-0.5378F, 0.0296F, -0.1692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2687F, 1.4524F, -0.7329F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftLeg3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(67, 59).addBox(-1.5884F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm7 = leftLeg3.addOrReplaceChild("leftArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 2.087F, 0.2608F, -0.2511F, -0.008F, 0.0104F));

		PartDefinition cube_r294 = leftArm7.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(68, 40).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm7.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftArm6.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(69, 4).addBox(-1.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = Hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9528F, 1.5221F, -0.6579F, 0.3189F, -0.0154F, 0.0804F));

		PartDefinition cube_r296 = rightLeg.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(86, 61).addBox(-0.5F, -0.9731F, -0.8636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.2645F, -0.0372F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightLeg.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(80, 75).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2253F, -0.7041F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightLeg.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(86, 39).addBox(-0.5F, -0.0113F, -0.3769F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -0.4992F, 0.8316F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightLeg.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(86, 36).addBox(-1.0F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.569F, -0.435F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightLeg.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(26, 87).addBox(-0.5F, -1.9486F, -1.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.9327F, -0.444F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightLeg.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(101, 29).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2462F, 0.1365F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightLeg.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(87, 54).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2165F, -0.5887F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightLeg.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(92, 48).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7048F, -0.6573F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightLeg.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(18, 66).addBox(-0.9963F, -0.4141F, -2.0761F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0037F, 4.8103F, -1.1325F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightLeg.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(92, 5).addBox(-0.5F, -1.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.6496F, -1.8914F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightLeg.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(92, 75).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0656F, -2.1187F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightLeg.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 91).addBox(-0.5F, -1.0883F, -2.2199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 4.1852F, 0.2973F, -0.4887F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1962F, 5.6055F, -2.697F, 1.1077F, -0.0356F, -0.0797F));

		PartDefinition cube_r308 = rightLeg2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(101, 35).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.308F, 1.6585F, -0.5046F, 1.0909F, 0.0049F, 0.0015F));

		PartDefinition cube_r309 = rightLeg2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(101, 32).addBox(-0.4615F, -0.2148F, 0.2844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, 1.2218F, 0.0049F, 0.0015F));

		PartDefinition cube_r310 = rightLeg2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(69, 44).addBox(-0.9622F, -1.4234F, -1.2423F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightLeg2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(84, 99).addBox(-0.5F, -0.55F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.7051F, 3.2689F, -1.0183F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightLeg2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(99, 78).addBox(-0.4116F, -0.5661F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(59, 99).addBox(-0.4116F, -0.5661F, -0.4657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.7935F, 3.7581F, -0.8386F, 2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightLeg2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(34, 99).addBox(-0.5F, -0.65F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7051F, 3.9438F, -0.7516F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightLeg2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(56, 64).addBox(-0.5F, -0.9F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7051F, 1.5564F, 1.7851F, 0.7853F, -0.0048F, -0.0017F));

		PartDefinition cube_r315 = rightLeg2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(75, 93).addBox(-0.4458F, -0.2007F, 0.7178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 99).addBox(-0.4458F, 0.5993F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(15, 99).addBox(-0.4458F, -0.2007F, 1.3178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7593F, 2.8027F, 0.1078F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightLeg2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(55, 90).addBox(-0.4458F, -0.8846F, -0.5844F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.7593F, 2.8027F, 0.1078F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightLeg2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(87, 75).addBox(-0.4622F, 0.0296F, -0.1692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2687F, 1.4524F, -0.7329F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1045F, 3.8568F, -1.2553F, -1.5273F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightLeg3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(69, 48).addBox(-1.4116F, -0.4225F, -0.576F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm7 = rightLeg3.addOrReplaceChild("rightArm7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 2.087F, 0.2608F, 0.1416F, 0.008F, -0.0104F));

		PartDefinition cube_r319 = rightArm7.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(69, 52).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm7.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.97F, -1.5472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightArm6.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(54, 69).addBox(-2.0F, 1.6F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9162F, 1.3735F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5937F, 1.1499F, -1.4605F, -0.0118F, -0.2613F, 0.0896F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(54, 97).addBox(-0.5F, -0.0407F, -0.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5849F, -3.657F, -1.0079F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(89, 79).addBox(-0.5F, 0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5849F, -3.8072F, 1.2579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(72, 28).addBox(-0.5F, -0.825F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5849F, -2.7867F, 0.1586F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(41, 75).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5849F, -1.1161F, -2.2413F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5849F, -1.9335F, -2.9774F, 0.733F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(97, 53).addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(97, 50).addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(79, 63).addBox(-0.5F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5849F, -3.4192F, -2.0048F, 1.8151F, 0.0F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(40, 55).addBox(-0.6286F, 1.9672F, -0.2496F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.5464F, -0.0784F, 0.4378F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(72, 23).addBox(-0.6286F, 2.2744F, 2.2115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.6773F, -0.0784F, 0.4378F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(13, 39).addBox(-0.6286F, 1.0566F, -3.4966F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 1.2009F, -0.0784F, 0.4378F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(43, 23).addBox(-0.6249F, 0.5247F, -1.2419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.7209F, -0.0784F, 0.4378F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(51, 49).addBox(-0.6286F, -1.0292F, -0.9323F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 0.2846F, -0.0784F, 0.4378F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(0, 70).addBox(-0.6286F, 1.6595F, -1.0384F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2349F, -0.0179F, -0.2526F, 1.5499F, -0.0784F, 0.4378F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(97, 47).addBox(-1.1F, 0.7601F, -0.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1849F, -1.7179F, -0.2526F, -0.4189F, 0.0F, 0.1222F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(51, 4).addBox(-1.1F, -0.0628F, -1.1447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.1849F, -1.7179F, -0.2526F, 0.4974F, 0.0F, 0.1222F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(47, 61).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5849F, -1.7442F, -0.5453F, 0.4974F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5937F, 1.1499F, -1.4605F, -0.0118F, 0.2613F, -0.0896F));

		PartDefinition Hips_r24 = bone5.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(54, 97).mirror().addBox(-0.5F, -0.0407F, -0.0012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.657F, -1.0079F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r25 = bone5.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(89, 79).mirror().addBox(-0.5F, 0.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.8072F, 1.2579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Hips_r26 = bone5.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-0.5F, -0.825F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.7867F, 0.1586F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r27 = bone5.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(41, 75).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.1161F, -2.2413F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r28 = bone5.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.9335F, -2.9774F, 0.733F, 0.0F, 0.0F));

		PartDefinition Hips_r29 = bone5.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(97, 53).mirror().addBox(-0.5F, -0.075F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -2.8654F, -2.7757F, 1.4573F, 0.0F, 0.0F));

		PartDefinition Hips_r30 = bone5.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(-0.5F, -0.975F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4406F, -2.0382F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r31 = bone5.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(79, 63).mirror().addBox(-0.5F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -3.4192F, -2.0048F, 1.8151F, 0.0F, 0.0F));

		PartDefinition Hips_r32 = bone5.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-0.3714F, 1.9672F, -0.2496F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.5464F, 0.0784F, -0.4378F));

		PartDefinition Hips_r33 = bone5.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(-0.3714F, 2.2744F, 2.2115F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.6773F, 0.0784F, -0.4378F));

		PartDefinition Hips_r34 = bone5.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(13, 39).mirror().addBox(-0.3714F, 1.0566F, -3.4966F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 1.2009F, 0.0784F, -0.4378F));

		PartDefinition Hips_r35 = bone5.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(-0.3751F, 0.5247F, -1.2419F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.7209F, 0.0784F, -0.4378F));

		PartDefinition Hips_r36 = bone5.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(-0.3714F, -1.0292F, -0.9323F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 0.2846F, 0.0784F, -0.4378F));

		PartDefinition Hips_r37 = bone5.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.3714F, 1.6595F, -1.0384F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2349F, -0.0179F, -0.2526F, 1.5499F, 0.0784F, -0.4378F));

		PartDefinition Hips_r38 = bone5.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(97, 47).mirror().addBox(0.1F, 0.7601F, -0.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1849F, -1.7179F, -0.2526F, -0.4189F, 0.0F, -0.1222F));

		PartDefinition Hips_r39 = bone5.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.1F, -0.0628F, -1.1447F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1849F, -1.7179F, -0.2526F, 0.4974F, 0.0F, -0.1222F));

		PartDefinition Hips_r40 = bone5.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(47, 61).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5849F, -1.7442F, -0.5453F, 0.4974F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 107, 107);
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